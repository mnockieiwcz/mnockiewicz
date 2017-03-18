import java.util.Scanner;

public class Kalkulator {
	
	private String znak="";
        private String w_dzialanie="";
        private double wynik=0;
	Scanner daneWejsciowe = new Scanner(System.in);
	Scanner znakWejsciowy = new Scanner(System.in);
	private String tablicaLiczb="";
	
	public String getTablicaLiczb(){
		return tablicaLiczb;
	}
	
	public void setLiczba(String tablicaLiczb){
		this.tablicaLiczb=tablicaLiczb;
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
                tablicaLiczb="";
		do{
                                
				System.out.println("Podaj liczbê zmiennoprzecinkowa:");
				pom1= daneWejsciowe.nextLine();
                                if(!pom1.equals("koniec"))
                                {
                                    tablicaLiczb=tablicaLiczb+pom1+" ";
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
                String[] parts = tablicaLiczb.split(" ");
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
            w_dzialanie="";
            int i=0;
                String[] parts = tablicaLiczb.split(" ");
                for(int x=0;x<znak.length();x++)
                {
                    
                     w_dzialanie=w_dzialanie+parts[x]+znak.charAt(x);
                     i++;
                }
                 w_dzialanie=w_dzialanie+parts[i]+"="+Double.toString(wynik);
                 System.out.println("Dzialanie to:"+w_dzialanie);
                
            
        }
	public void wyswietlAutorow(){
		System.out.println("Autor: Monika Nockiewicz-Slowik");
	}
	
	public void wypiszDzialanie(){
			System.out.println(tablicaLiczb);
			System.out.println(znak);
		
	}
}
