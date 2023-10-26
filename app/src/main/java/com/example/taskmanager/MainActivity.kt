package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskManagerImage(text1 = "All tasks completed", text2 = "Nice work!")
                }
            }
        }
    }
}

@Composable
fun TaskManager(text1: String, text2: String, modifier: Modifier = Modifier) {
    // Use modifier in the Text composables to apply padding
     Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
         Image(
             painter = painterResource(R.drawable.ic_task_completed),
             contentDescription = "Task Completed Image",
             modifier = Modifier
                 .fillMaxWidth()
                 .alpha(0.5F)
         )
         Text(
             text = text1,
             textAlign = TextAlign.Center,
             fontSize = 24.sp,
             fontWeight = FontWeight.Bold,
             modifier = modifier
                 .padding(top = 24.dp)
                 .padding(bottom = 8.dp)
         )
         Text(
             text = text2,
             fontSize = 24.sp,
             textAlign = TextAlign.Center
         )
     }

        }



@Composable
fun TaskManagerImage(text1: String, text2: String) {
   TaskManager(text1, text2)
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    TaskManagerTheme {
        TaskManagerImage(text1 = "All tasks completed", text2 = "Nice work!")
    }
}
