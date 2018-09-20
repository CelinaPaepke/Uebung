public class HelloWorld 
{

	
	public static void main(String args[])
	{
	    int zaehler=100; //Anzahl der Zahlenfolgen
        int zahl=1;  //Zahl mit der das Programm startet
  while(zaehler>=1)  //solange der zaehler nicht abgelaufen ist...
  {
	   if(zahl%3==0) //...ueberpruefe ob Zahl durch 3 teilbar..
	   {
		 
		  if(zahl%5==0)  //...falls auch durch 5 teilbar
		  {
			  System.out.print("fisbas");   //... schreibe fisbas
		  }else
		  {
			  System.out.print("fis");   //wenn nicht durch 5 teilbar schreibe "fis"
		  }
	   }else
	   {
	      if(zahl%5==0) //falls durch 5 teilbar
	      {
          System.out.print("bas"); //schreibe "bas"
	      }else                      //wenn weder durch 5 noch durch 3 teilbar...
	      {
	       System.out.print(zahl);  // schreibe "Zahl"
	      
	      }
	   }
	 System.out.print(",");   // Kommas und Zeilenumbruch zur veranschaulichung
	 System.out.println();
	 zahl=zahl+1;            //nächste Zahl abfragem
    zaehler=zaehler-1;       //zaehler eins runter setzen
   
	
  }
 
   }
}

/* 
 * methoden: public static boolean dividingby3
 *           {
 *           if(zahl%3==0)
 *           {
 */