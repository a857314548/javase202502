package com.zz.train;

public class MyException extends Exception {

    private static final long serialVersionUID = 6475629691099014807L;

    private int numberId;

    public MyException(String message, int numberId) {
        super(message);
        this.numberId = numberId;
    }

    public int getNumberId() {
        return numberId;
    }


}
