public class Shadowing{
      static int a = 40; //this will be shadowed by line 6
    public static void main(String []args){
System.out.println(a); //40

int a; 
System.out.println(a);// scope will be begin when value is intializeing 
int a = 100;//100
System.out.println(a);
fun(); //100
funtoo();//100
funtoo();//100

    }
    static void fun (){
        System.out.println(a);
        }
        static void funtoo(){
            System.out.println(a);
        }
    }
