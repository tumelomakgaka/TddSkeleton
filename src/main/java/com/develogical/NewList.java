package com.develogical;
import java.util.ArrayList;

public class NewList {
    ArrayList<String> newList = new ArrayList<String>();
    public boolean isEmpty() {
        if (newList.size() == 0) {
            return true;
        }
        else
            {
                return false;
            }
        }


    public void addElement(String element)
    {
        newList.add(0, element);
    }

    public String getItem() {
        String tempElement=newList.get(0);
        return tempElement;
    }

}
