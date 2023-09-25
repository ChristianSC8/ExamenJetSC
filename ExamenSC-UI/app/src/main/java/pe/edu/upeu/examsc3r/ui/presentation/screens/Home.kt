package pe.edu.upeu.examsc3r.ui.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home() {
    var textOne by remember { mutableStateOf(TextFieldValue("")) }
    var textTwo by remember { mutableStateOf(TextFieldValue("")) }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(vertical = 15.dp)
        .padding(horizontal = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Row (modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .background(Color.White),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Tic Tac Toe",
                modifier = Modifier,
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.1.sp,
                    lineHeight = 32.sp,
                    color = Color(0xFF000000)
                )
            )
        }
        Column (modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
        ){
            OutlinedTextField(
                value = textOne,
                label = { Text(text = "Player One") },
                onValueChange = {
                    textOne = it
                }, modifier = Modifier
                    .fillMaxWidth()
            )
            OutlinedTextField(
                value = textTwo,
                label = { Text(text = "Player Two") },
                onValueChange = {
                    textTwo = it
                }, modifier = Modifier
                    .fillMaxWidth()
            )
        }
        Row (modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ){
            Button(onClick = {}, shape = CutCornerShape(2.dp), modifier = Modifier
                .width(120.dp)
                .height(45.dp)
            ) {
                Text(text = "Start")
            }
            Button(onClick = {}, shape = CutCornerShape(2.dp), modifier = Modifier
                .width(120.dp)
                .height(45.dp)
            ) {
                Text(text = "Cancel")
            }
        }
        Column (modifier = Modifier
            .fillMaxWidth()
            .height(330.dp)
            .background(Color.Green)

        ){
            //This buttons for games X end O
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color.Red),
            verticalAlignment = Alignment.CenterVertically
            , horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Sample Points",
                modifier = Modifier,
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.1.sp,
                    lineHeight = 32.sp,
                    color = Color(0xFF000000)
                )
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color.Blue),
            verticalAlignment = Alignment.CenterVertically
            , horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Table",
                modifier = Modifier,
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.1.sp,
                    lineHeight = 32.sp,
                    color = Color(0xFF000000)
                )
            )
        }
    }
}

