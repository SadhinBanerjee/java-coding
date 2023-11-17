public class seconddatatypeprogram 
{
    public static void main (String[] args)

    {
       //Data Type program
        int sum;
        double all;
        byte var1=32;
        short var2=200;
        int var3=34567;
        float var4=35.687f;
        double var5=12345.987;
        char var6='A';

        {
            sum=var3+var2;
            all=var5+var4;

        }


        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(sum);
        System.out.println(all);

        //Type casting program
        int val1=56;
        double val2;
        val2=val1;
        System.out.println(val2);

        double val3=567.80;
        int val4;
        val4=(int)val3;
        System.out.println(val4);

        int val5=12;
        int val6=5;
        float val7=val5/val6;
        System.out.println(val7);
    }

   


}
