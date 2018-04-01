package com.bignerdranch.android.criminalintent.database;

/**
 * Created by Ian Bilek on 3/27/2018.
 */

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String LOCATION = "location";
            public static final String PRICE = "price";
            public static final String CONDITION = "condition";

        }
    }
}
