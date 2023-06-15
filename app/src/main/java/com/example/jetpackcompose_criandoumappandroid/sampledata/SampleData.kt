package com.example.jetpackcompose_criandoumappandroid.sampledata

import com.example.jetpackcompose_criandoumappandroid.R
import com.example.jetpackcompose_criandoumappandroid.model.Product
import java.math.BigDecimal

val sampleProducts = listOf(
    Product(
        name = "Hamburguer",
        price = BigDecimal("39.99"),
        image = R.drawable.burguer
    ), Product(
        name = "Pizza",
        price = BigDecimal("59.99"),
        image = R.drawable.pizza
    ),
    Product(
        name = "Fritas",
        price = BigDecimal("29.99"),
        image = R.drawable.fries
    )
)