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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.trian.component.ui.theme.TesMultiModuleTheme

@Composable
fun Login(navController: NavController) {
    var email by remember { mutableStateOf("admin@gmail.com") }
    var password by rememberSaveable { mutableStateOf("admin") }

    fun checklogin() {
       if (email == "admin@gmail.com" && password == "admin" ){
           navController.navigate("Explore")
       }else{

       }
    }




    Scaffold(
        topBar = {}
    ) {
        Column(
            Modifier.padding(start = 20.dp, end = 20.dp, top = 50.dp, bottom = 16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.group),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
            }
            Column() {
                Spacer(modifier = Modifier.height(100.dp))
                Text(text = "Login", fontSize = 29.sp, fontWeight = FontWeight.Bold)
                Text(text = "Enter your email and password", fontSize = 15.sp)
            }
            Column() {
                Spacer(modifier = Modifier.height(40.dp))
                TextField(
                    value = email,
                    colors =TextFieldDefaults.textFieldColors(backgroundColor = Color.Transparent),
                    placeholder = { Text(text = "user@email.com") },
                    onValueChange = { email = it },
                    label = { Text("Gmail") },
                    maxLines = 2,
                    textStyle = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10.dp))

                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            Row() {
                TextField(
                    value = password,
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.vector__1_),
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )

                    },
                    colors=TextFieldDefaults.textFieldColors(
                            backgroundColor = Color.Transparent
                    ),
                    onValueChange = { password = it },
                    label = { Text("Enter password") },
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10.dp))
                )

            }
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = "Forgot password?",
                    fontSize = 14.sp,
                )
            }
            Spacer(modifier = Modifier.height(80.dp))
            Column( horizontalAlignment = Alignment.CenterHorizontally) {
                Button(onClick = {
                   checklogin()
                }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green), modifier = Modifier.fillMaxWidth()) {
                    Text(text = "login", color = Color.White)
                    
                }

                Row( verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "Don't have account?")
                    TextButton(onClick = {navController.navigate("Explore") }) {
                        Text(text = "SignUp", color= Color.Green)
                }
                }
            }


        }
    }

}


@Preview(showBackground = true)
@Composable
fun PreviewLogin() {
    TesMultiModuleTheme() {
        Login(navController = rememberNavController())
    }
}