package com.enzhongwen.hanyu2.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SavedDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun save(saved: Saved)

    @Query("SELECT * FROM saved_table_2")
    fun readAllData(): LiveData<MutableList<Saved>>

    @Query("DELETE FROM saved_table_2")
    suspend fun deleteAll()

    @Delete
    suspend fun deleteItem(delete: Saved)

}