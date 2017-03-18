import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int wyborMenu;
		
		Kalkulator kalkulator = new Kalkulator();
		
		Scanner menu = new Scanner(System.in);

System.out.println("Witaj w kalkulatorze! Wybierz:");
            int pom=1;
            while(pom==1)
            {
                System.out.println("1. Wpisz dzialanie.");
                System.out.println("2. Wyswietl autorow.");
                wyborMenu = menu.nextInt();
	    	switch(wyborMenu){
	    	case 1:
	    		kalkulator.pobierzLiczby();
	    		kalkulator.wypiszDzialanie();
                        kalkulator.dzialanie_koniec();
                      
                        
	    		break;
	    	case 2:
	    		kalkulator.wyswietlAutorow();
	    		break;
                default:
                    pom=0;
	    	}
            }
	}
}
