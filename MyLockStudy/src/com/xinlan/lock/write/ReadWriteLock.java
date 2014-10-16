package com.xinlan.lock.write;

/**
 * ¶ÁÐ´Ëø
 * 
 * @author panyi
 * 
 */
public class ReadWriteLock
{
    private int readers = 0;
    private int writers = 0;
    private int writeRequest = 0;
    
    /**
     * ¶ÁËø Ëø¶¨
     */
    public synchronized void readLock(){
        while(writers>0 || writeRequest>0){
            try
            {
                this.wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            readers++;
        }//end while
        
    }
    
    /**
     * ¶ÁËø ½âËø
     */
    public synchronized void readUnLock(){
        readers--;
        if(readers==0){}
    }
    
    
    /**
     * Ð´Ëø Ëø¶¨
     */
    public synchronized void writeLock(){
        
    }
    
    
    /**
     * Ð´Ëø½âËø
     */
    public synchronized void writeUnLock(){
        
    }

    public static void main(String[] args)
    {

    }

}// end class
