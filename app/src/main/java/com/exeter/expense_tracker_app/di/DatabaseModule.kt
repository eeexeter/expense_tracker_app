package com.exeter.expense_tracker_app.di

import android.content.Context
import androidx.room.Room
import com.exeter.expense_tracker_app.data.ExpenseDao
import com.exeter.expense_tracker_app.data.ExpenseDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): ExpenseDatabase {
        return Room.databaseBuilder(context, ExpenseDatabase::class.java, "expense_db").build()
    }

    @Provides
    @Singleton
    fun provideDao(db: ExpenseDatabase): ExpenseDao {
        return db.expenseDao()
    }

}