package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * API Contract for the Pets app.
 */

public final class PetContract {

    /**
     * The "Content authority" is a name for the entire content provider, similar to the
     * relationship between a domain name and its website.  A convenient string to use for the
     * content authority is the package name for the app, which is guaranteed to be unique on the
     * device.
     */
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";

    /**
     * Use CONTENT_AUTHORITY to create the base of all URI's which apps will use to contact
     * the content provider.
     */
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    /**
     * Possible path (appended to base content URI for possible URI's)
     * For instance, content://com.example.android.pets/pets/ is a valid path for
     * looking at pet data. content://com.example.android.pets/staff/ will fail,
     * as the ContentProvider hasn't been given any information on what to do with "staff".
     */
    public static final String PATH_PETS = "pets";

    public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

    // prevent instantiation
    private PetContract() {
    }

    ;

    // Inner class that defines constant values for the pets database table.
    // Each entry in the table represents a single pet.
    public static class PetEntry implements BaseColumns {

        /**
         * Name of database table for pets
         */
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

        /**
         * Gender of the pet. Type: INTEGER
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
