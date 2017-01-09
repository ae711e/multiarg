package ae999.narod.ru;
/*
 Несколько опциональных аргументов
 http://pro-java.ru/java-dlya-nachinayushhix/peremennoe-chislo-argumentov-metodov-yazyka-java/
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
  
      System.out.println("Hello - start app!");
      vaTest();
      vaTest(1,10);
      vaTest(1, 5, 7, 9, 11, 15);
    }
    
    static private void vaTest(int ... v)
    {
      int i,l;
      l=v.length;
      System.out.println("-----------------------------");
      System.out.println("Число аргументов: " + l);
      for(i=0; i<l;i++) {
        System.out.println(i+": " + v[i]);
      }
      
    }
}
