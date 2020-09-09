public class random
{
    public static void main(String[] args)
    {
 
        int[] array = new int[10];
        for (int i : array)
        {
            i = (int) (Math.random() * 10);
        }
 
 
        int[] sort = new int[10];
        for (int i = sort.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (sort[j] > sort[j + 1])
                {
                    int tmp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = tmp;
                }
 
            }
        }
        for (int i:sort);
        System.out.println(sort);
    }
___________________________________________
 
import java.util.Scanner;
public class Pract
{
    public static void main(String[] args)
    {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
        {
        Scanner in = new Scanner(System.in);
        array[i] = in.nextInt();
    }
        int sum = 0;
        for (int i:array)
        {
            sum+=i;
        }
System.out.println(sum);
    }
}
_______________________________________________
 
import java.util.Scanner;
 
public class fact
{
    public static void main(String[] args)
    {
 
        Scanner in = new Scanner(System.in);
        int fact = 1;
        int n = in.nextInt();
        {
            for (int i = 1; i < n; i++)
                fact *= i;
        }
 
        System.out.println(fact);
    }
 
 
}
_______________________________________________________
Ряд 1, 1/2, 1/3......
public class aaa
{
    public static void main(String[] args)
    {
      double[] array =  new double[10];
              for(int i=1; i<10; i++)
              {
                  array[i] = 1/(double)i;
                  System.out.println((double)1/i);
              }
              double sum=0;
                      for(double i:array){
                          sum+=i;
                      }
                      System.out.println(sum);
    }
}
__________________________________________________________
Создание и описание класса 
public class Ball
{
    private String type;
    private int diam;
    private String colour;
 
    public String getType()
    {
        return type;
    }
 
    public void setType(String type)
    {
        this.type = type;
    }
 
 
    public int getDiam()
    {
return diam;
    }
 
    public void setDiam(int diam)
    {
        this.diam = diam;
    }
 
    public String getColour()
    {
        return colour;
    }
 
public void setColour(String colour)
{
    this.colour = colour;
}
 
}
______________________________________________________

public class Doggy {
    private int age;
    private String poroda;
    private String colour;
    public Sobaka(String poroda, String colour,int age)
    {
        this.age = age;
        this.colour = colour;
        this.poroda = poroda;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setColour(String colour) {
        this.cvet = colour;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString()
    {
        return "helpme";
    }
    public int perLet(int age)
    {
        return age*7;
    }
    public static void main(String [] arr)
    {
        Doggy ob = new Doggy("Abibas","arbuz",7);
        ob.perLet(7);
        Doggy [] arraaa = new Doggy[3];
        arraaa[0] = new Doggy("almaz","da",1);
        arraaa[1] = new Doggy("alphabank","yes",7);
        arraaa[2] = new Doggy("abc","mashina",3);
    }
}
