package Examples;

public class Dowhile {

public static void main(String[] args) {
int f1=0,f2=1;
/*System.out.println(f1);
System.out.println(f2);*/
do {
f2=f1+f2;
System.out.println(f2);
f2++;
}while (f2<10);

}
}