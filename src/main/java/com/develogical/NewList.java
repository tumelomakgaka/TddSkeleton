package com.develogical;
import java.io.InvalidObjectException;
import java.util.ArrayList;

public class NewList {
    public ArrayList<String> elementList = new ArrayList<String>();

    public boolean isEmpty() {
        if (elementList.size() == 0) {
            return true;
        }
        else
            {
                return false;
            }
        }


    public void addElement(String element) throws InvalidObjectException {
        if ((element == null)||(element==""))
            throw new InvalidObjectException("Empty");

        if(!elementList.contains(element))
        {
            elementList.add(0, element);
        }
        else{
            elementList.remove(element);
            elementList.add(0,element);
        }
    }

    public String getItem() {
        String tempElement=elementList.get(0);
        return tempElement;
    }



}
