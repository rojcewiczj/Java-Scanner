package com.scanner;

import java.util.*;

public class Mathy {
    
    public int result;
    public boolean functioning = true;

    public Mathy(int _firstNum, int _secondNum, String operation){
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
            try { 
                  if(_secondNum > 0){
                  result = (_firstNum / _secondNum);
                  }
                  else{
                    functioning = false;
                  }
            } catch (Exception e) {
                
            }
            break;
        }
    }


}


