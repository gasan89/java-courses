package ru.lesson.lessons;
import java.util.Scanner;

public class inter
{
public static void main(String[] args)
{
canculate cancl=new canculate();
Scanner reader=new Scanner(System.in);

while (true)
{
if(!cancl.getSave())
{
System.out.println("Enter first value");
cancl.setFirst(Double.parseDouble(reader.next()));
System.out.println("Enter symbol operation(+,-,*,/)");
cancl.setOperation(reader.next());

System.out.println("Enter second value");
cancl.setSecond(Double.parseDouble(reader.next()));

System.out.println("Result="+ cancl.cancul());

System.out.println("Enter 'y' for exit");
if(reader.next().equals("y"))
{
System.out.println("bay,bay");
break;
}
else
  {System.out.println("Enter symbol 'y' not for delete result" + "'result'/ enter any symbol 'result' use next?"); 
if(reader.next().equals("y"))
{
cancl.setSave(true);
cancl.setFirst(cancl.getResult());


}

}

}


}

}
}