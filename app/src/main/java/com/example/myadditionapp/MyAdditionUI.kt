package com.example.myadditionapp
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyAdditionUI() {
    var num1 by remember { mutableFloatStateOf(0f) }
    var num2 by remember { mutableFloatStateOf(0f) }
    var result by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        OutlinedTextField(
            value = num1.toString(),
            onValueChange = { num1 = it.toFloatOrNull() ?: 0f },
            label = { Text("Number 1") }
        )
        OutlinedTextField(
            value = num2.toString(),
            onValueChange = { num2 = it.toFloatOrNull() ?: 0f },
            label = { Text("Number 2") }
        )
        Button(
            onClick = {
                val sum = num1 + num2
                result = "Result: $sum"
            }
        ) {
            Text("Add")
        }
        Text(
            text = result
        )
    }
}
