package com.mehmetbaloglu.shoppinglistapp.ui.theme

data class ShoppingItem(
    val id: Int, var name: String, var quantity: String, val isEditing: Boolean = false
)