import java.util.Scanner;
public class main 
{
public static void main(String[] args) 
{
	// das ist ein Kommentar	
	Scanner eingabe = new Scanner(System.in);
		System.out.println("Geben Sie die gewünschte Zahl ein");
		int tries = eingabe.nextInt();
		
		double pairCounter=0;
		double trippleCounter=0;
		double quadrupletCounter=0;
		double highCardCounter=0;
		double doublePairCounter=0;
		double fullHouseCounter=0;
		double flushCounter=0;
		double straightCounter=0;
		double straightFlushCounter=0;
		double royalFlushCounter=0;
		
		for(int i=0;i<tries;i++)
		{
			DishOut dout =new DishOut(); 
			boolean cancel= true;
			dout.gettoHand();
			
			if(dout.royalFlush() && cancel)
			{
				royalFlushCounter++;
				cancel=false;
			}
			if(dout.straightFlush() && cancel)
			{
				straightFlushCounter++;
				cancel=false;
			}
			if(dout.flush() && cancel)
			{
				flushCounter++;
				cancel=false;
			}
			if(dout.straight() && cancel)
			{
				straightCounter++;
				cancel=false;
			}
			if(dout.quadruplet()&& cancel)
			{
				quadrupletCounter++;
				cancel=false;
			}
			if(dout.fullHouse()&& cancel)
			{
				fullHouseCounter++;
				cancel=false;
			}
			if(dout.doublePair()&& cancel)
			{
				doublePairCounter++;
				cancel=false;
			}
			if(dout.tripple()&& cancel)
			{
				trippleCounter++;
				cancel=false;
			}
			if(dout.onePair()&& cancel)
			{
				pairCounter++;
				cancel=false;
			}
			if(cancel)
			{
				highCardCounter++;
				cancel= false;
			}
		}

		
		System.out.print("Anzahl an Versuche:");
		System.out.println(tries);
		System.out.print("Gesamtanzahl:");
		System.out.println(pairCounter+doublePairCounter+trippleCounter+quadrupletCounter+flushCounter+straightCounter+straightFlushCounter+royalFlushCounter+fullHouseCounter+highCardCounter);
		System.out.printf("Pairs:%f",(pairCounter*100)/tries);
		System.out.println("%");
		System.out.printf("DoublePair: %f",doublePairCounter*100/tries);
		System.out.println("%");
		System.out.printf("Tripple: %f",trippleCounter*100/tries);
		System.out.println("%");
		System.out.printf("Quadruplet: %f",quadrupletCounter*100/tries);
		System.out.println("%");
		System.out.printf("Flush:%f",(flushCounter*100)/tries);
		System.out.println("%");
		System.out.printf("Straight:%f",(straightCounter*100)/tries);
		System.out.println("%");
		System.out.printf("StraightFlush: %f", straightFlushCounter*100/tries);
		System.out.println("%");
		System.out.printf("RoyalFlush: %f",royalFlushCounter*100/tries);
		System.out.println("%");
		System.out.printf("FullHouse: %f",fullHouseCounter*100/tries);
		System.out.println("%");
		System.out.printf("HighCard: %f",highCardCounter*100/tries);
		System.out.println("%");
		eingabe.close();


	}


}
