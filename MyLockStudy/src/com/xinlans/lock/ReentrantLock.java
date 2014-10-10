package com.xinlans.lock;

/**
 * ÖØÈëËø
 * 
 * @author panyi
 * 
 */
public class ReentrantLock
{
    boolean isLocked = false;
    Thread lockedBy = null;
    int lockedCount = 0;

    public synchronized void lock()
    {
        Thread calledThread = Thread.currentThread();

        while (isLocked && lockedBy != calledThread)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }// end while
        isLocked = true;
        lockedCount++;
        lockedBy = Thread.currentThread();
    }

    public synchronized void unLock()
    {
        if (Thread.currentThread() == this.lockedBy)
        {
            lockedCount--;
            if (lockedCount == 0)
            {
                isLocked = false;
                notify();
            }
        }
    }
}// end class
