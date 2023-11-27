class sixthloopprogram
{
    public static void main (String[] args)
    {
        //for loop

        for (int i=0; i<=5; i++)
        {
            System.out.println("for loop");
        }

        //while loop

        int j=1;

        while (j<5)
        {
            System.out.println("while loop");
            j++;
        }

        //do while loop

        int k=1;

        do{
            System.out.println("do while loop");
            k++;
        }while (k<5);

        System.out.println();

        /* nested loop program */

        for (int n =0; n<=4; n++)
        {
            for (int m = 0; m <=4; m++)
            {
                  System.out.print("* ");

            }
            System.out.println();
        }
        
    }
}