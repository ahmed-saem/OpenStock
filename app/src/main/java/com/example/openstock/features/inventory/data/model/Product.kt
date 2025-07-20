package com.example.openstock.features.inventory.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val barcode: String,
    val price: Double,
    val quantity: Int,
    val reorderLevel: Int = 10
)
