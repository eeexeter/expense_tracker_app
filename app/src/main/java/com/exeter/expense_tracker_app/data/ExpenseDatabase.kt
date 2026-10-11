package com.exeter.expense_tracker_app.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.exeter.expense_tracker_app.data.converter.ExpenseConverters

@Database(version = 1, entities = [ExpenseEntity::class])
@TypeConverters(ExpenseConverters::class)
abstract class ExpenseDatabase : RoomDatabase() {
    abstract fun dao(): ExpenseDao
}