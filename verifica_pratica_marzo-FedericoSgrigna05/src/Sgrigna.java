import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class Sgrigna
{

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			//aggiungere, togliere casi a seconda delle proprie scelte
			case 1:
				es1();	
				break;
			case 2:
				es2 ();
				break;
			case 3:
				es3();
				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{

		System.out.println("1 - Es creare un array di 10 numeri interi casuali tra -5 e 5  e stampa il valore e la posizione (indice) dell’elemento minimo dell’array. Se il valore minimo è presente più di una volta, stampa la posizione della prima occorrenza di tale valore nell’array. ");
		System.out.println("2 - Es creare e inizializzare un array di stringhe contenete 5 parole a piacere (usando il comando di inizializzazione che prevede la lista dei valori tra parentesi graffe) e chiedere all’utente di indovinare una tra le 5 parole entro 3 tentativi");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}

	static void es1()
	{
		int [] Array1 = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
		int n = 0;
		for (int i = 0 ; i < Array1.length ; i++ )
		{
			n=(int) Math.random();
		}
		System.out.print(n);
		
	}

	static void es2 () {
		
		String [] Array2 = {"Informatica", "Assembly", "Scuola" , "Gatto", "Html"};  
		System.out.print("Indovina una delle 5 parole :");
		System.out.print ("I.......a , A......y, S....a,G...o,H..l");
		String scelta = in.next();
		for (int i=0; i>=2 ; i++) {
			if (scelta == "Informatica" )
			{
				System.out.print("Bravo hai trovato la parola !!");
			}	 
			else {
				System.out.print ("Hai sbagliato");
				System.out.print ("Indizio = La parola corrisponde alla materia che stiamo svolgendo :)");
			}
		}
		for ( int i= 0; i>=2 ; i++) {
			if (scelta == "Assembly" )
			{
				System.out.print("Bravo hai trovato la parola !!");
			}	 
			else {
				System.out.print ("Hai sbagliato");
				System.out.print ("Indizio = è un linguaggio che si avvicina MOLTO a quello macchina e inizia per A ");
			}
		}
		for ( int i= 0; i>=2 ; i++) {

			if (scelta == "Scuola" )
			{
				System.out.print("Bravo hai trovato la parola !!");
			}	 
			else {
				System.out.print ("Hai sbagliato");
				System.out.print ("Indizio = Struttura per l'apprendimento  ");
			}
		}
		if (scelta == "Gatto" )
		{
			System.out.print("Bravo hai trovato la parola !!");
		}	 
		else {
			System.out.print ("Hai sbagliato");
			System.out.print ("Indizio = Animale bellissimo che non consiglio ");
		}
		if (scelta == "Html" )
		{
			System.out.print("Bravo hai trovato la parola !!");
		}	 
		else {
			System.out.print ("Hai sbagliato");
			System.out.print ("Indizio = Serve per creare pagine web :)");
		}
		return;
	}
	static void es3()
	{
		int  [] Array3 = new int [20];
		
	}	
}






