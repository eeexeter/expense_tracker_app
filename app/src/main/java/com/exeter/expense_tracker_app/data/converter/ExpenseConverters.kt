package com.exeter.expense_tracker_app.data.converter

import androidx.room.TypeConverter
import com.exeter.expense_tracker_app.data.ExpenseCategory


class ExpenseConverters {

    @TypeConverter
    fun fromExpenseCategory(category: ExpenseCategory): String {
        return category.name
    }

    @TypeConverter
    fun toExpenseCategory(value: String): ExpenseCategory {
        return ExpenseCategory.valueOf(value)
    }
}