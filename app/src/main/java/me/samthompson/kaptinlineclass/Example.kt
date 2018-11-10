package me.samthompson.kaptinlineclass

import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomDatabase

inline class LinkId(val name: String)

@Entity
data class Link(
    @PrimaryKey val id: LinkId
)

@Database(
    version = 1,
    entities = [
        Link::class
    ]
)
abstract class ExampleDatabase : RoomDatabase()