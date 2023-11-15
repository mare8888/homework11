package Domawka10;

import java.lang.invoke.WrongMethodTypeException;

public class WrongCountSteklaException extends Exception{
    public WrongCountSteklaException(WrongMethodTypeException message){
        super(message);
    }
}
