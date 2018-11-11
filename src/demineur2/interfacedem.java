package demineur2;

import java.util.Scanner;

public class interfacedem 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		Demineuralgo demineur = new Demineuralgo();
		
		int x;
		int y;
		int mine;
		
		int val;
		boolean NoRe = true;
		
		boolean cont = true;
		
		while(cont)
		{
			if(NoRe)
			{
				System.out.print("Nombre de lignes : ");
				y = Integer.parseInt(sc.nextLine());
				System.out.print("Nombre de colonnes : ");
				x = Integer.parseInt(sc.nextLine());
				System.out.print("Nombre de mines : ");
				mine = Integer.parseInt(sc.nextLine());
				
				if(mine < x*y);
				else System.out.println("[Trop de mine]");
				
				demineur.Init(x, y, mine);
				
				System.out.print("x: ");
				x = Integer.parseInt(sc.nextLine());
				System.out.print("y: ");
				y = Integer.parseInt(sc.nextLine());
				
				demineur.prohibitedValue(x, y);
				demineur.genMap();
				
				demineur.click(x, y);
				demineur.aff();
				
			}
			else demineur.setVisible(false);
			
			while(!demineur.getCompleted())
			{
				
				System.out.print("x: ");
				x = Integer.parseInt(sc.nextLine());
				System.out.print("y: ");
				y = Integer.parseInt(sc.nextLine());
				
				demineur.click(x, y);
				
				if(!demineur.isDeath())
					demineur.aff();
				else break;
				
			}
			
			demineur.setVisible(true);
			demineur.aff();
			
			if(!demineur.isDeath())System.out.println("YOU WON !");
			else System.out.println("YOU DEATH !");
			
			System.out.println("1. Rejouer la même map");
			System.out.println("2. Rejouer une autre map");
			System.out.println("3. Quitter");
			val = Integer.parseInt(sc.nextLine());
			
			if(val == 1)NoRe=false;
			if(val == 2)NoRe=true;
			if(val == 3)cont=false;
			
		}
		sc.close();
	}
}
