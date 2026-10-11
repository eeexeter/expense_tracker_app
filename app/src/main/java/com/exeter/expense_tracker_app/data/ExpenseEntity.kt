package com.exeter.expense_tracker_app.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "expenses")
data class ExpenseEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val amount: Long,
    val createdAt: Long,
    val description: String?,
    val category: ExpenseCategory
)

enum class ExpenseCategory {
    FOOD, HEALTH, HOBBIES, STUDYING, REST, ENTERTAINMENT
}
