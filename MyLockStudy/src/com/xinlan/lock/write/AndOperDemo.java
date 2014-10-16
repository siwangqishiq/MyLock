package com.xinlan.lock.write;

public class AndOperDemo
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        if(isTwo() && isOne()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }//end if
    }
    
    public static boolean isOne(){
        System.out.println("one");
        return false;
    }
    
    public static boolean isTwo(){
        System.out.println("two");
        return true;
    }

}
