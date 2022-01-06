package com.trian.component.card

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemTodo() {
    var checkedStateTask by remember {
        mutableStateOf(false)
    }
    var checkedStateTask2 by remember {
        mutableStateOf(false)
    }
    var checkedStateTask3 by remember {
        mutableStateOf(false)
    }
    var checkedStateTask4 by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier.size(200.dp, 200.dp)
    ) {
        Text(
            text = "Task",
            modifier = Modifier.padding(45.dp, 51.dp),
            fontSize = (25.sp),
            color = if (checkedStateTask) Color.Black else Color.Gray
        )

    }

    Checkbox(
        checked = checkedStateTask,
        onCheckedChange = { checkedStateTask = it },
        modifier = Modifier.padding(15.dp, 56.dp),
        colors = CheckboxDefaults.colors(Color.Black)
    )

    Text(
        text = "Category",
        modifier = Modifier.padding(48.dp, 85.dp),
        fontSize = 18.sp,
        color = if (checkedStateTask) Color.Black else Color.Gray
    )

    Checkbox(
        checked = checkedStateTask2,
        onCheckedChange = { checkedStateTask2 = it },
        modifier = Modifier.padding(15.dp, 150.dp),
        colors = CheckboxDefaults.colors(Color.Black)
    )

    Text(
        text = "Task",
        modifier = Modifier.padding(45.dp, 145.dp),
        fontSize = 25.sp,
        color = if (checkedStateTask2) Color.Gray else Color.Black

    )
    Checkbox(
        checked = checkedStateTask3,
        onCheckedChange = { checkedStateTask3 = it },
        modifier = Modifier.padding(30.dp, 220.dp),
        colors = CheckboxDefaults.colors(Color.Black)
    )

    Checkbox(
        checked = checkedStateTask4,
        onCheckedChange = { checkedStateTask4 = it },
        modifier = Modifier.padding(70.dp, 220.dp),
        colors = CheckboxDefaults.colors(Color.Black)
    )
}