package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Pets app.
 */

public final class PetContract {

    // prevent instantiation
    private PetContract(){};

    // Inner class that defines constant values for the pets database table.
    // Each entry in the table represents a single pet.
    public static class PetEntry implements BaseColumns{

        /** Name of database table for pets */
        public static final String TABLE_NAME = "pets";

        // Table fields
        // Unique ID number for the pet (only for use it the database table).
        public static final String _ID = BaseColumns._ID;

        /**
         * Name of the pet.
         * Type: TEXT
         */
        public static final String COLUMN_PET_NAME = "name";

        // Breed of the pet - Type: TEXT
        public static final String COLUMN_PET_BREED = "breed";

        /** Gender of the pet. Type: INTEGER
         * The only possible values are {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE},
         * or {@link #GENDER_FEMALE}
         */
        public static final String COLUMN_PET_GENDER = "gender";

        // Weight of the pet. Type: INTEGER
        public static final String COLUMN_PET_WEIGHT = "weight";

        // Values for gender
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }
}
