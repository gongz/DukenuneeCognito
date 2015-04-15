package com.dukenunee.cognito.Model;

/**
 * Created by Archer Zhang on 4/7/15.
 */
public class DCError extends Exception{
    public DCError(){

    }

    public DCError(String exceptionMessage){
        super(exceptionMessage);
    }

    public DCError(String exceptionMessage, Throwable reason){
        super(exceptionMessage,reason);
    }

    public DCError(Throwable cause){
        super(cause);
    }
}
