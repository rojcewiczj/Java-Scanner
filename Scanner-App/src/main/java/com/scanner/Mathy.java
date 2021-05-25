package com.scanner;

import java.util.*;

public class Mathy {
    public int firstNum;
    public int secondNum;
    public int result;

    public Mathy(int _firstNum, int _secondNum, String operation){
        firstNum = _firstNum;
        secondNum = _secondNum;
        switch(operation){
            case "Add":
            result = (_firstNum + _secondNum);
            break;
            case "Subtract":
            result = (_firstNum - _secondNum);
            break;
            case "Multiply":
            result = (_firstNum * _secondNum);
            break;
            case "Divide":
            result = (_firstNum / _secondNum);
            break;
        }
        System.out.println(result);
    }


}


