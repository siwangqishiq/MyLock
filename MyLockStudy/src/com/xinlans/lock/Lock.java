package com.xinlans.lock;

public class Lock
{
    private boolean isLocked = false;
    
    public synchronized void  lock() 
    {
        while(isLocked)
        {
            try
            {
                this.wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }//end while
        isLocked = true;
    }
    
    public synchronized void  unLock()
    {
        isLocked = false;
        this.notify();
    }
}//end class
