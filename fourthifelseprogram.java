class fourthifelseprogram
{
    public static void main(String[] args){

       //lf else program
      int age=87;
       if (age>=18 && age<60)
       {
         System.out.println("You're now an adult");
       }
       else if (age>=60)
       {
        System.out.println("you're old now");
       }
       else 
       {
        System.out.println("you're a kid");
       }
    

    //If else ladder program
   int std=7;
   {
    if (std>=0 && std<=2) 
    {
        System.out.println("You're a new born baby");
    }
    else if (std>=3 && std<=17)
    {
        if (std>=3 && std<=5)
        {
            System.out.println("You're eligible to get admission in kid school from nur-ukg");
        }
        else if (std>=6 && std<=13)
        {
            System.out.println("You're eligible to get admission from 1st std to 8th std");
        }
        else if (std>=14 && std<=15)
        {
            System.out.println("You're eligible to get admission in 9th or 10th class");
        }
        else 
            System.out.println("you're eligible to get admission in 11th or 12 class");
        
    }
    else if (std>=18 && std<=25)
    {
        if (std>=18 || std<=22)
        {
            if (std>18 && std<=20)
            {
                System.out.println("Yor're eligible to do bachelour degree");
            }
            else
            {
                System.out.println("You're still eligible for bachelour or also do master degree");
            }
        }
        else if (std>=21 || std<=24)
        {
            System.out.println("you're eligible to do master degree");
        }
        else
        {
            System.out.println("you're still eligible to do master degree");
        }
    }
    else if (std>=26 && std<=30)
    {
        System.out.println("Whenever you want you can do PHD");
    }
    else if (std>=31 && std<=45)
    {
        System.out.println("You're still eligible to crack 'SARKARI NAUKRI'");
    }
    else if (std>=46 && std<=60)
    {
        System.out.println("You can teach student");
    }
    else
    {
        System.out.println("You are old now");
    }
   }

   //find the greater number amoung three by the help of IF-ELSE
    int a=70;
    int b=30;
    int c=40;
    {
        if (a>b)
        {
            if (a>c)
             {
                System.out.println("a is a greater no.");
            }
            else
            {
                System.out.println("c is a greater no.");
            }
                    }

        else
        {
            if (b>c)
                {
                    System.out.println("b is a greater no.");
                }   

            else
            {
                System.out.println("c is a greater no.");
            }
                 }
    }
}
    
}