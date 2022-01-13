package com.trian.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Signup() {
    var username by remember {
        mutableStateOf("Afsar Hossen Shuvo")
    }
    var email by remember {
        mutableStateOf("imshuvo97@gmail.com")
    }
    var password by rememberSaveable {
        mutableStateOf("jangan panggil aku anak kecil paman")
    }


    Column(
        modifier = Modifier
            .padding(30.dp, 50.dp, 30.dp, 10.dp)
            .fillMaxSize()
    ) {
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.carrot),
                contentDescription = null,
                Modifier.size(50.dp)
            )
        }

        Spacer(Modifier.height(70.dp))

        Column {
            Text(text = "Sign Up", fontSize = 26.sp, fontWeight = FontWeight.Bold)
            Text(
                text = "Enter your credentials to continue",
                fontSize = 16.sp,
                color = Color.DarkGray
            )
        }
        Spacer(Modifier.height(30.dp))

        Column {
            TextField(
                value = username,
                onValueChange = { username = it },
                label = { Text("Username") },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
            )
        }

        Spacer(Modifier.height(30.dp))

        Column {
            TextField(
                value = email,
                trailingIcon = {
                    Image(
                        painter = painterResource(R.drawable.check),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.Green),
                        modifier = Modifier.size(30.dp)
                    )
                },
                onValueChange = { email = it },
                label = { Text("Email") },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
            )
        }

        Spacer(Modifier.height(30.dp))

        Column {
            TextField(
                value = password,
                trailingIcon = {
                    Image(
                        painter = painterResource(R.drawable.eyes),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                },
                onValueChange = { password = it },
                label = { Text("Password") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        Column {
            Text(text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.DarkGray)) {
                    append("By continuing you agree to our  ")
                }
                withStyle(style = SpanStyle(color = Color.Green)) {
                    append("Terms of Service ")
                }
                withStyle(style = SpanStyle(color = Color.DarkGray)) {
                    append(" and ")
                }
                withStyle(style = SpanStyle(color = Color.Green)) {
                    append(" Privacy Policy")
                }
            }, fontSize = 14.sp)

        }

        Spacer(modifier = Modifier.height(10.dp))

        Column {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
            ) {
                Text(text = "Sign Up", fontSize = 18.sp, color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Column {
            Text(text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Black)) {
                    append("Already have an account?  ")
                }
                withStyle(style = SpanStyle(color = Color.Green)) {
                    append("Sign up")
                }
            }, fontSize = 14.sp, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
        }
    }


}


@Preview(showBackground = true)
@Composable
fun PreviewSignUp() {
    Signup()
}