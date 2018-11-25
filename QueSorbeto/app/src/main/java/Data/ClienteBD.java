package Data;

import android.provider.BaseColumns;

public class ClienteBD {

    public ClienteBD() {
    }

    //public static abstract class ClienteInfo implements BaseColumns {
        public static final String TABLE_NAME ="cliente";

        public static final String NAME = "name";
        public static final String ID = "id";
        public static final String PHONE_NUMBER = "phoneNumber";
    //}

    private static final String TEXT_TYPE="TEXT";
    private static final String COMMA_SEP=",";
    public static final String SQL_CREATE_ENTRIES=
            "CREATE TABLE " + ClienteBD.TABLE_NAME + " (" +
                    ClienteBD.ID + " INTEGER PRIMARY KEY," +
                    ClienteBD.NAME + TEXT_TYPE + COMMA_SEP +
                    ClienteBD.PHONE_NUMBER + TEXT_TYPE + COMMA_SEP + ")";

    public static final String SQL_DELETE_ENTRIES=
            "DROP TABLE IF EXISTS " + ClienteBD.TABLE_NAME;
}
