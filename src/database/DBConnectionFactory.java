package database;

import utility.JDBConnectionWrapper;

public class DBConnectionFactory {
    public JDBConnectionWrapper getConnectionWrapper(boolean test)
    {
        if(test){
            return new JDBConnectionWrapper("test_library");
        }else{
            return new JDBConnectionWrapper("library");
        }
    }
}
