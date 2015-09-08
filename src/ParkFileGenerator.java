/**
 * Class to convert AmesParking PDF to a more useful .txt format for later parsing. 
 * ParkFileGenerator will format information as such.
 * 
 *Lot Name: Name
 *	[Parking Space Number Array](Type of Space)
 *	[Parking Space Number Array](Type of Space)
 *	[Parking Space Number Array](Type of Space)
 * 
 * @author Ray Kinsella
 * 
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class ParkFileGenerator {

	/**
	 * Main method that handles user input and outputs formatted data to AmesParking.txt.
	 * 
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws IOException {
		
		int exit = 0;
		PrintWriter output;
		try{
			output = new PrintWriter(new BufferedWriter(new FileWriter("AmesParking.txt", true)));
		}catch(FileNotFoundException e){
			File outFile = new File("AmesParking.txt");
			output = new PrintWriter(outFile);
		}
		
		Scanner input = new Scanner(System.in);
		String lot = "";
		
		while(exit == 0){
			
			System.out.println("Add Lot(0) or Undo Lot(1) or Exit(2)");
			int cont = input.nextInt();
			output = new PrintWriter(new BufferedWriter(new FileWriter("AmesParking.txt", true)));
			
			if(cont == 0){
				System.out.println("Name of Lot: ");
				lot = "Lot Name: " + input.next();
				
				while(true){
					String undo = lot;
					
					System.out.println("Enter Lower Bound: ");
					int low = input.nextInt();
					
					System.out.println("Enter Upper Bound: ");
					int high = input.nextInt();
					
					System.out.println("Enter Parking Type: ");
					String type = input.next();
					
					lot = addSpaces(low, high, type, lot);
					
					System.out.println("Preview Lot\n" + lot + 
							"\nAdd More Spaces(0) or Undo Last Entry(1) or Print Lot(2)");
					int end = input.nextInt();
					
					if(end == 1){
						lot = undo;	
					}else if(end == 2){
						output.print(lot + System.getProperty("line.separator")); 
						output.close();
						break;
					}
				}
			}
			input.close();
		}
	}
	
	/**
	 * generateLot builds a preview of the lot designed from user input parameters to be 
	 * either accepted or declined by the user before writing to file.
	 * 
	 * @param low 
	 * 			Lower Bound specified by user.
	 * @param high
	 * 			Upper Bound specified by user.
	 * @param type
	 * 			Type of parking space.
	 * @param lot
	 * 			Current Lot that user has formed.
	 * @return
	 * 			Lot with added spaces.
	 */
	private static String addSpaces(int low, int high, String type, String lot){
		
		while(low != high + 1){
			lot += System.getProperty("line.separator") + 
					"[" + Integer.toString(low) + "]" + "(" + type + ")";
			low++;
		}
		
		return lot;
	}
}
