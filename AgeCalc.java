public class AgeCalc
{
  public static void main(String [] args)
  {
    // TextIO is included in the file folder

    // TextIO.putf is for printing. Similar to System.out.print()

    TextIO.putf("What is your name?\n");
    //this gets the user input. Similar to scanner
    String name = TextIO.getln();
    TextIO.putf("Welcome to the years to days converter!\n");
    TextIO.putf("Give me an age");
    double age = TextIO.getlnDouble();
    if(age < 0 && age < 120)
    {
      TextIO.putf("Please enter another number");
    }
    TextIO.putf("On your %.0f birthday,you were %.0f days old.%n", age, getDaysOld(age));
    TextIO.putf("Do you want to enter another");
    String response  =TextIO.getln();
    while (!response.equals("no"))
    {
      TextIO.putf("Give me an age");
      age = TextIO.getlnDouble();
      if(age < 0 && age < 120)
      {
        TextIO.putf("Please enter another number");
      }
      TextIO.putf("On your %.0f birthday, you were %.0f days old.%n", age, getDaysOld(age));
    }

  }

  public static double getDaysOld(double age)
  {
   double daysOld = age * 365.25;
   return daysOld;
  }
}
