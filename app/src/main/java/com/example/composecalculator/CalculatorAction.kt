package com.example.composecalculator

// For each ting user does, we send such a calculator action to view model
sealed class CalculatorAction{
    data class Number(val number : Int) : CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
}
