class Casting
{
    public static  void main(String args[])
    {
        float sum;
        int i;
        sum =0.0;
        for(i=0;i<=10;i++)
        {
            sum=sum+1/(float)i;
            System.out.println("i=   "+i);
            System.out.println("sum=  "+sum);
        }
    
    }
}