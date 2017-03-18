import java.util.Scanner;

public class Kalkulator {
	
	private String znak="";
        private String wynikDzialanie="";
        private double wynik=0;
	Scanner daneWejsciowe = new Scanner(System.in);
	Scanner znakWejsciowy = new Scanner(System.in);
	private String ciagLiczb="";
	
	public String getCiagLiczb(){
		return ciagLiczb;
	}
	
	public void setCiagLiczba(String ciagLiczb){
		this.ciagLiczb=ciagLiczb;
	}
	
	public String getZnak(){
		return znak;
	}
	
	public void setZnak(String znak){
		this.znak=znak;
	}
	
	public void pobierzLiczby(){
		znak="";
		boolean end = false;
                String pom="",pom1="";
		int i=0;
		ciagLiczb="";
		do{
                                
				System.out.println("Podaj liczbê zmiennoprzecinkowa:");
				pom1= daneWejsciowe.nextLine();
                                if(!pom1.equals("koniec"))
                                {
                                	ciagLiczb=ciagLiczb+pom1+" ";
                                }
				end = pom1.endsWith("koniec");
				System.out.println("Podaj znak dzialania:");
                                pom=znakWejsciowy.nextLine();
                                if (!pom.equals("koniec") )
                                {
                                    znak =znak+pom;
                                }
                                else{
                                    end = pom.endsWith("koniec");}
                                
		i++;	
		}while(!end);
                String[] parts = ciagLiczb.split(" ");
                for(int x=0;x<znak.length();x++)
                {
                    double a,b;
                    if (x==0)
                    {
                    a=Double.parseDouble(parts[x]);
                     b=Double.parseDouble(parts[x+1]);
                    }
                    else{
                     a=wynik;
                     b=Double.parseDouble(parts[x+1]);
                        
                    }
                    if (znak.charAt(x)=='-'){
                        
                        wynik=a-b;
                    }
                    if (znak.charAt(x)=='+'){
                        
                        wynik=a+b;
                    }                
                    if (znak.charAt(x)=='*'){
                        
                        wynik=a*b;
                    }
                    if (znak.charAt(x)=='/'){
                        
                        wynik=a/b;
                    }
                    
                    
                                    
                }
                
	}
	public void dzialanie_koniec()
        {
		wynikDzialanie="";
            int i=0;
                String[] parts = ciagLiczb.split(" ");
                for(int x=0;x<znak.length();x++)
                {
                    
                	wynikDzialanie=wynikDzialanie+parts[x]+znak.charAt(x);
                     i++;
                }
                wynikDzialanie=wynikDzialanie+parts[i]+"="+Double.toString(wynik);
                 System.out.println("Dzialanie to:"+wynikDzialanie);
                
            
        }
	public void wyswietlAutorow(){
		System.out.println("Autor: Monika Nockiewicz-Slowik");
	}
	
	public void wypiszDzialanie(){
			System.out.println(ciagLiczb);
			System.out.println(znak);
		
	}
}
