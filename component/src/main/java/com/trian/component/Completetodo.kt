package com.trian.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun completecheckbox() {
    var checkedStateTask by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
    ) {
        Text(
            text = "Complete",
            modifier = Modifier
                .height(36.dp)
                .width(228.dp),
            fontSize = 18.sp,
        )
        Row {
            Checkbox(
                checked = checkedStateTask,
                onCheckedChange = { checkedStateTask = it },
                modifier = Modifier.padding(start = 15.dp),
                colors = CheckboxDefaults.colors(Color.Black)
            )
            Text(
                text = "Check on FedEx Order",
                modifier = Modifier.padding(start = 15.dp),
                fontSize = 18.sp,
                textAlign = TextAlign.Start,
                color = if (checkedStateTask) Color.Black else Color.Gray
            )
        }
        Row {
            Checkbox(
                checked = checkedStateTask,
                onCheckedChange = { checkedStateTask = it },
                modifier = Modifier.padding(start = 15.dp),
                colors = CheckboxDefaults.colors(Color.Black)
            )
            Text(
                text = "Look at new plugins",
                modifier = Modifier.padding(start = 15.dp),
                fontSize = 18.sp,
                textAlign = TextAlign.Start,
                color = if (checkedStateTask) Color.Black else Color.Gray
            )
        }


    }
    Row {
        Checkbox(
            checked = checkedStateTask,
            onCheckedChange = { checkedStateTask = it },
            modifier = Modifier.padding(start = 15.dp),
            colors = CheckboxDefaults.colors(Color.Black)
        )
        Text(
            text = "Respond to catering company",
            modifier = Modifier.padding(start = 15.dp),
            fontSize = 18.sp,
            textAlign = TextAlign.Start,
            color = if (checkedStateTask) Color.Black else Color.Gray
        )
    }
    Row {
        Checkbox(
            checked = checkedStateTask,
            onCheckedChange = { checkedStateTask = it },
            modifier = Modifier.padding(start = 15.dp),
            colors = CheckboxDefaults.colors(Color.Black)
        )
        Text(
            text = "Reschedule morning coffee",
            modifier = Modifier.padding(start = 15.dp),
            fontSize = 18.sp,
            textAlign = TextAlign.Start,
            color = if (checkedStateTask) Color.Black else Color.Gray
        )
    }
    Row {
        Checkbox(
            checked = checkedStateTask,
            onCheckedChange = { checkedStateTask = it },
            modifier = Modifier.padding(start = 15.dp),
            colors = CheckboxDefaults.colors(Color.Black)
        )
        Text(
            text = "Check the lastest on Community",
            modifier = Modifier.padding(start = 15.dp),
            fontSize = 18.sp,
            textAlign = TextAlign.Start,
            color = if (checkedStateTask) Color.Black else Color.Gray
        )
    }

}

@Composable
fun Completecheckbox() {
    var checkedStateTask by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
    ) {
        Text(
            text = "Complete",
            modifier = Modifier
                .height(36.dp)
                .width(228.dp),
            fontSize = 18.sp,
        )
        Row {
            Checkbox(
                checked = checkedStateTask,
                onCheckedChange = { checkedStateTask = it },
                modifier = Modifier.padding(start = 15.dp),
                colors = CheckboxDefaults.colors(Color.Black)
            )
            Text(
                text = "Check on FedEx Order",
                modifier = Modifier.padding(start = 15.dp),
                fontSize = 18.sp,
                textAlign = TextAlign.Start,
                color = if (checkedStateTask) Color.Black else Color.Gray
            )
        }
        Row {
            Checkbox(
                checked = checkedStateTask,
                onCheckedChange = { checkedStateTask = it },
                modifier = Modifier.padding(start = 15.dp),
                colors = CheckboxDefaults.colors(Color.Black)
            )
            Text(
                text = "Look at new plugins",
                modifier = Modifier.padding(start = 15.dp),
                fontSize = 18.sp,
                textAlign = TextAlign.Start,
                color = if (checkedStateTask) Color.Black else Color.Gray
            )
        }
        Row {
            Checkbox(
                checked = checkedStateTask,
                onCheckedChange = { checkedStateTask = it },
                modifier = Modifier.padding(start = 15.dp),
                colors = CheckboxDefaults.colors(Color.Black)
            )
            Text(
                text = "Respond to catering company",
                modifier = Modifier.padding(start = 15.dp),
                fontSize = 18.sp,
                textAlign = TextAlign.Start,
                color = if (checkedStateTask) Color.Black else Color.Gray
            )
        }
        Row {
            Checkbox(
                checked = checkedStateTask,
                onCheckedChange = { checkedStateTask = it },
                modifier = Modifier.padding(start = 15.dp),
                colors = CheckboxDefaults.colors(Color.Black)
            )
            Text(
                text = "Reschedule morning coffee",
                modifier = Modifier.padding(start = 15.dp),
                fontSize = 18.sp,
                textAlign = TextAlign.Start,
                color = if (checkedStateTask) Color.Black else Color.Gray
            )
        }
        Row {
            Checkbox(
                checked = checkedStateTask,
                onCheckedChange = { checkedStateTask = it },
                modifier = Modifier.padding(start = 15.dp),
                colors = CheckboxDefaults.colors(Color.Black)
            )
            Text(
                text = "Check the lastest on Community",
                modifier = Modifier.padding(start = 15.dp),
                fontSize = 18.sp,
                textAlign = TextAlign.Start,
                color = if (checkedStateTask) Color.Black else Color.Gray
            )
        }

    }
}


@Preview
@Composable
fun Previewcompletecheckbox() {
    Completecheckbox()
}

