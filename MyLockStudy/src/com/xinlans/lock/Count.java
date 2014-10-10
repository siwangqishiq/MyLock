package com.xinlans.lock;

public class Count
{
    private int count = 0;
    private Lock mLock;
    
    public int incNormal()
    {
        synchronized (this)
        {
            return ++count;
        }// end synchronized
    }

    public int intMyLokc()
    {
        mLock = new Lock();
        mLock.lock();
        int newCount = (++count);
        mLock.unLock();
        return newCount;
    }
}//end class
