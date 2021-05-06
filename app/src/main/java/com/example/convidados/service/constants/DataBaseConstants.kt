package com.example.convidados.service.constants

class DataBaseConstants {
    /**
     * Available tables in the database with their columns
     */

    object GUEST{
        const val TABLE_NAME= "Guest"

        object  COLUMNS {
            const val ID = "id"
            const val NAME = "name"
            const val PRESENCE= "presence"

        }
    }
}