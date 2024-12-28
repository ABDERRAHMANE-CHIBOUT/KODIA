package com.koDea.fixMasterClient.presentation.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedTextField(
    value: MutableState<String>,
    placeHolder: String,
    label: String,
    leadingIcon: @Composable () -> Unit,
    trailingIcon: @Composable () -> Unit,
    keyboardOptions: KeyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
    visualTransformation: VisualTransformation = VisualTransformation.None,
    isError:  MutableState<Boolean> = mutableStateOf(false),
    supportingText: MutableState<String>,
    readOnly : Boolean = false,
    modifier: Modifier = Modifier,
    enabled : Boolean = true,
    maxLines : Int = 1,
    singleLine : Boolean = true,
    colors :TextFieldColors = OutlinedTextFieldDefaults.colors(disabledLabelColor = MaterialTheme.colorScheme.onBackground,
        disabledBorderColor = MaterialTheme.colorScheme.onBackground,
        disabledLeadingIconColor = MaterialTheme.colorScheme.onBackground,
        unfocusedBorderColor = MaterialTheme.colorScheme.onBackground,
        unfocusedLeadingIconColor = MaterialTheme.colorScheme.onBackground,
        unfocusedLabelColor = MaterialTheme.colorScheme.onBackground,
        unfocusedTextColor = MaterialTheme.colorScheme.onBackground,
        disabledTextColor = MaterialTheme.colorScheme.onBackground)
) {
    OutlinedTextField(
        value = value.value,
        onValueChange = {
            value.value = it
            supportingText.value = ""
            isError.value = false
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        placeholder = {
            Text(
                text = placeHolder
            )
        },
        leadingIcon = leadingIcon,
        keyboardOptions = keyboardOptions,
        trailingIcon = trailingIcon,
        label = { Text(text = label) },
        shape = RoundedCornerShape(8.dp),
        visualTransformation = visualTransformation,
        isError = isError.value,
        singleLine = singleLine,
        maxLines = maxLines,
        supportingText = { Text(text = "${supportingText.value}",color = MaterialTheme.colorScheme.error)},
        readOnly =  readOnly,
        enabled = enabled,
        colors = colors
    )
}