package singModulWebService;

import SingleModul.SinglModul;

public class Main {
        public  static void  main(String str[]){
            //SinglModul singlModul =new SinglModul();
            //调用饿汉单例
            SinglModul singlModul=SinglModul.getEhSingle();
            singlModul.showVaule();
            //调用懒汉单例
            SinglModul singLhlModul=SinglModul.getLhModul();
            singLhlModul.showVaule();
        }


}
