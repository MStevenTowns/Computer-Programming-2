/*
M. Steven Towns
Control Break
4/25/2014
*/

import java.util.*;
import java.io.*;

public class Control
{
	public static void main(String[] args)
	{
		Scanner inFile = null;
		PrintWriter outFile = null; 
		try{
			inFile = new Scanner(new File("Employee.txt"));
			outFile = new PrintWriter(new File("Salesrpt.txt"));
		}
		catch(IOException e){
			System.out.println("Error. File not found.");
			System.exit(0);
		}
		
		int empID, depID,amo,num=0, lnInd=0;
		double saleAmo,price,totEmp = 0, totDep = 0;
		String next,empName,out = "          ",head = "          Department |ID Number |                     Name |Sale Amount";;
				
		
		boolean printTest = false;
		//outFile.println(head);
		while(inFile.hasNextLine())
		{
			next = (inFile.nextLine().trim());
			depID = Integer.parseInt(next.substring(27, 30).trim());
			empID = Integer.parseInt(next.substring(0, 3).trim());
			
			price = Integer.parseInt(next.substring(70).trim()) * 1.00;
			amo = Integer.parseInt(next.substring(65, 70).trim());
			saleAmo = price * amo;
			totDep += saleAmo;
			totEmp += saleAmo;
			
			empName = next.substring(3, 27).trim();
			String space = "";
			for(int i = empName.length(); i < 24; i++){
				space += " ";
			}
			empName = space + empName;
			
			out += "       " + depID + " |      " + empID + " | " + empName + " |  " + saleAmo;
			
			while(!printTest){
				if(lnInd == 0){
					outFile.println(head);
					lnInd++;
				}
				else if(lnInd < 56){	
					outFile.println(lnInd + out);
					lnInd++;
					printTest = true;
				}
				else if(Integer.parseInt(inFile.nextLine().substring(0,3)) != empID){
					outFile.println("\n\n");
					lnInd = 0;
				}
				else{
					outFile.println(out);
					lnInd++;
					printTest = true;
				}
			}
			if(inFile.hasNextLine())
			{
				next = inFile.nextLine();
			}
			else{
				break;
			}
			//while in same department. . .
			while(Integer.parseInt(next.substring(27, 30).trim()) == depID){
				empID = Integer.parseInt(next.substring(0, 3).trim());
				
				price = Integer.parseInt(next.substring(70).trim()) * 1.00;
				amo = Integer.parseInt(next.substring(65, 70).trim());
				saleAmo = price * amo;
				totDep += saleAmo;
				totEmp += saleAmo;
				
				empName = next.substring(3, 27).trim();
				space = "";
				for(int i = empName.length(); i < 24; i++){
					space += " "; 
				}
				empName = space + empName;
				
				out += "          " + " |      " + empID + " | " + empName + " |  " + saleAmo;
				
				while(!printTest){
					if(lnInd == 0){
						outFile.println(out);
						lnInd++;
					}
					else if(lnInd < 56){	
						outFile.println(lnInd + out);
						lnInd++;
						printTest = true;
					}
					else if(Integer.parseInt(inFile.nextLine().substring(0,3)) != empID){
						outFile.println("\n\n");
						lnInd = 0;
					}
					else{
						outFile.println(out);
						lnInd++;
						printTest = true;
					}
				}
				if(inFile.hasNextLine()){
					next = inFile.nextLine();
				}
				else{
					break;
				}
			//while same employee. . .
				while(Integer.parseInt(next.substring(0, 3)) == empID){
					price = Integer.parseInt(next.substring(70)) * 1;
					amo = Integer.parseInt(next.substring(65, 70));
					saleAmo = price * amo;
					totDep += saleAmo;
					totEmp += saleAmo;
				
					empName = next.substring(3, 27);
					space = "";
					for(int i = empName.length(); i < 24; i++){
						space += " ";
					}
					empName = space + empName;
					
					out += "          " + " |         " + " |                         " + " |  " + saleAmo;
				
					while(!printTest){
						if(lnInd == 0){
							outFile.println(head);
							lnInd++;
						}
						else if(lnInd < 56){	
							outFile.println(out);
							lnInd++;
							printTest = true;
						}
						else if(Integer.parseInt(inFile.nextLine().substring(0,3)) != empID){
							outFile.print("\n\n");
							lnInd = 0;
						}
						else{
							outFile.println(lnInd + out);
							lnInd++;
							printTest = true;
						}
					}
					if(inFile.hasNextLine()){
						next = inFile.nextLine();
					}
					else{
						break;
					}
				}
				outFile.println("Total:               " + totEmp);
				totEmp = 0;
			}
			outFile.println("Total:   " + totDep);
			totDep = 0;
		}
		outFile.close();
	}
}