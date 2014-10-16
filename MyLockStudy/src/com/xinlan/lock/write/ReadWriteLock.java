package com.xinlan.lock.write;

/**
 * ��д��
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
     * ���� ����
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
     * ���� ����
     */
    public synchronized void readUnLock(){
        readers--;
        if(readers==0){}
    }
    
    
    /**
     * д�� ����
     */
    public synchronized void writeLock(){
        
    }
    
    
    /**
     * д������
     */
    public synchronized void writeUnLock(){
        
    }

    public static void main(String[] args)
    {

    }

}// end class
