class thirdoperatorprogram
{
    public static void main(String[] args)
    {
        //arithmetic operator program
        float val1=56.88f;
        float val2=28.66f;
        val1=val2;
        float val3=97.87f;
        System.out.println(val1+val3);
        System.out.println(val1-val3);
        System.out.println(val1*val3);
        System.out.println(val1/val3);

        System.out.println(val1%val3);

        //Increment and Decrement operator
        int a=5;
        a=++a;
        System.out.println(a);

        int b=7;
        int c;
        c=++b + b++ + b++ + ++b + --b + --b + b-- + --b;
        System.out.println(b);
        System.out.println(c);
    }
}