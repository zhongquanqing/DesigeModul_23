package caseImplement;

public class SingleData {
    //恶汉模式
    private  static  SingleData singleData=new SingleData();
    public synchronized SingleData getSingleData(){
        return  singleData;
    }
    //  懒汉模式



}
