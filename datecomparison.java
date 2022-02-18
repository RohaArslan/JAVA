public class datecomparison {
    public static void main( String []args)
    {
        dates date1 = new dates();
        date1.setDaynumber1(13);
        dates date2 = new dates();
        date2.setDaynumber2(12);
        dates  month1 = new dates();
        month1.setMonth1(12);
        dates month2 = new dates();
        month2.setMonth2(8);
        dates year1 = new dates();
        year1.setYear1(1989);
        dates year2 = new dates();
        year2.setYear2(2002);
        if((year1.getYear1()<(year2.getYear2())))
        {
            System.out.println(" THE EARLIER DATE IS : " +(date1.getDaynumber1())+(-month1.getMonth1())+(-year1.getYear1()));}
        else if((year2.getYear2()<(year1.getYear1())))
        {
            System.out.println(" THE EARLIER DATE IS : " +(date2.getDaynumber2())+(-month2.getMonth2())+(-year2.getYear2()));}
        else if((month1.getMonth1()<(month2.getMonth2())))
        {
            System.out.println(" THE EARLIER DATE IS : " +(date1.getDaynumber1())+(-month1.getMonth1())+(-year1.getYear1()));}
        else if((month2.getMonth2()<(month1.getMonth1())))
        {
            System.out.println(" THE EARLIER DATE IS : " +(date2.getDaynumber2())+(-month2.getMonth2())+(-year2.getYear2()));}
        else if((date1.getDaynumber1()<(date2.getDaynumber2()))){
            System.out.println(" THE EARLIER DATE IS : " +(date1.getDaynumber1())+(-month1.getMonth1())+(-year1.getYear1()));}
        else if((date2.getDaynumber2()<(date1.getDaynumber1()))){
            System.out.println(" THE EARLIER DATE IS : " +(date2.getDaynumber2())+(-month2.getMonth2())+(-year2.getYear2()));}
        else {
             System.out.println("BOTH ARE SAME!");}
    }}











