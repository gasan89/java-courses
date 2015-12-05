public class canculate
{
private double first;
private double second;
private double result;
private String operation;
 private boolean save=false;
 
 public double cancul()
{
  switch(operation)
 { 
  case "+":result=first+second; break;
  case "-":result=first-second; break;
  case "*":result=first*second; break;
  case "/":result=first/second; break;
  default:
  result=0;break;
  }
return result;
}  
 

 public void setFirst(double f)
  {
    first=f;
  }
 public double getFirst()
  {
    return first;
  }  

  public void setSecond(double s)
  {
   second=s;
  }
  public double getSecond()
  {
    return second;
  }  
 public void setOperation(String o)
{
  operation = o;
} 
public String getOperation()
{
return operation;
}
public void setSave(boolean s)
{
save=s;
}
public boolean getSave()
{
return save;
}

}