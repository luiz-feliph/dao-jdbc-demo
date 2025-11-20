package db;

import java.io.Serial;

public class DbIntegrityException extends RuntimeException{

    public DbIntegrityException(String msg) {
        super(msg);
    }
}
