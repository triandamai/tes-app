package com.trian.component.incompletetheme

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Incompletetodo() {
    var checkedStateBox by remember {
        mutableStateOf(false)
    }
    var checkedStateBox2 by remember {
        mutableStateOf(false)
    }
    var checkedStateBox3 by remember {
        mutableStateOf(false)
    }
    var checkedStateBox4 by remember {
        mutableStateOf(false)
    }
    var checkedStateBox5 by remember {
        mutableStateOf(false)
    }
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Incomplete", fontSize = 18.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Checkbox(
                checked = checkedStateBox, onCheckedChange = { checkedStateBox = it },
                modifier = Modifier.width(50.dp),
                colors = CheckboxDefaults.colors(Color.Black)
            )
            Column {
                Text(
                    text = "Upload 1099-R to TurboMax",
                    fontSize = 18.sp,
                    style = if (checkedStateBox) TextStyle(textDecoration = TextDecoration.LineThrough) else TextStyle(
                        textDecoration = TextDecoration.None
                    )
                )
                Text(text = "💰 Finance", fontSize = 14.sp, color = Color.Gray)
            }

        }

        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Checkbox(
                checked = checkedStateBox2, onCheckedChange = { checkedStateBox2 = it },
                modifier = Modifier.width(50.dp),
                colors = CheckboxDefaults.colors(Color.Black)
            )

            Column {
                Text(
                    text = "Submit 2019 tax return",
                    fontSize = 18.sp,
                    style = if (checkedStateBox2) TextStyle(textDecoration = TextDecoration.LineThrough) else TextStyle(
                        textDecoration = TextDecoration.None
                    )
                )
                Text(text = "💰 Finance", fontSize = 14.sp, color = Color.Gray)
            }
        }
        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Checkbox(
                checked = checkedStateBox3, onCheckedChange = { checkedStateBox3 = it },
                modifier = Modifier.width(50.dp),
                colors = CheckboxDefaults.colors(Color.Black)
            )
            Column {
                Text(
                    text = "Print parking passes",
                    fontSize = 18.sp,
                    style = if (checkedStateBox3) TextStyle(textDecoration = TextDecoration.LineThrough) else TextStyle(
                        textDecoration = TextDecoration.None
                    )
                )
                Text(text = "💖 Wedding", fontSize = 14.sp, color = Color.Gray)
            }
        }
        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Checkbox(
                checked = checkedStateBox4, onCheckedChange = { checkedStateBox4 = it },
                modifier = Modifier.width(50.dp),
                colors = CheckboxDefaults.colors(Color.Black)
            )

            Column {
                Text(
                    text = "Sign contract, send back",
                    fontSize = 18.sp,
                    style = if (checkedStateBox4) TextStyle(textDecoration = TextDecoration.LineThrough) else TextStyle(
                        textDecoration = TextDecoration.None
                    )
                )
                Text(text = "🖥️ Freelance", fontSize = 14.sp, color = Color.Gray)
            }
        }
        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Checkbox(
                checked = checkedStateBox5, onCheckedChange = { checkedStateBox5 = it },
                modifier = Modifier.width(50.dp),
                colors = CheckboxDefaults.colors(Color.Black)
            )

            Column {
                Text(
                    text = "Hand sanitizer",
                    fontSize = 18.sp,
                    style = if (checkedStateBox5) TextStyle(textDecoration = TextDecoration.LineThrough) else TextStyle(
                        textDecoration = TextDecoration.None
                    )
                )
                Text(text = "🛒 Shopping List", fontSize = 14.sp, color = Color.Gray)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Incompletetodo()
}