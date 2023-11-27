class thirdoperatorprogram
{
    public static void main(String[] args)
    {
        //arithmetic operator program
        float val1=56.88f;
        float val2=28.66f;
        val1=val2;
        float val3=97.87f;

        System.out.println("Arithmetic operator");
        System.out.println(val1+val3);
        System.out.println(val1-val3);
        System.out.println(val1*val3);
        System.out.println(val1/val3);
        System.out.println(val1%val3);

        //Increment and Decrement operator
        int a=5;
        a=++a;

        System.out.println("Inc/Dec operator");
        System.out.println(a);

        int b=7;
        int c;
        c=++b + b++ + b++ + ++b + --b + --b + b-- + --b;
        System.out.println(b);
        System.out.println(c);

        //Assignment operator
        int d,e,f,g;

        d=e=f=g=55;

        System.out.println("Assignment operator");
        System.out.println(d + " " + e + " " + f + " " + g);

        d+=5;
        e-=5;
        f*=2;
        g/=5;

        System.out.println(d + " " + e + " " + f + " " + g);

        //Relational operator
        int h=20;
        int i=20;
        int j=45;

        boolean result= h==i;
        boolean result2= h>=j;

        System.out.println("Relational operator");
        System.out.println(result);
        System.out.println(result2);
        System.out.println(i!=h);
        System.out.println(j>h);

        //Logical operator
        int k=10;
        int l=20;
        int m=30;

        boolean result3= k<l && l<m && m>k;
        boolean result4= m<=l || k>=l || l>=k;

        System.out.println("Logical operator");
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(k>m && l<m);
        System.out.println(!true);

        //Ternary opereator
        int n=55;
        int o=60;
        int p=80;

        String result5= (n>o)? "n is greater than o" : "o is greater than n";

        System.out.println("Tenary Operator");
        System.out.println(result5);
        
        String result6 = (n>o)? (n>p? "n is a greater no." : "p is a greater no.") : (o>p? "o is a greater no." : "p is a greater no.");

        System.out.println(result6);
    }
}