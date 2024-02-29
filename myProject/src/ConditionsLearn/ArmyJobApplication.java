package ConditionsLearn;

import java.util.Scanner;

public class ArmyJobApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter Qualification - Inter or Below");
		String qual=sc.next();
		System.out.println("Enter gender - Male/Female");
		String gen=sc.next();
		System.out.println("Enter height");
		int height = sc.nextInt();
		System.out.println("Enter Weight");
		int weight=sc.nextInt();
		System.out.println("Mental fitness is good: true / false");
		boolean mfitness = sc.nextBoolean();
		System.out.println("physical fitness is good: true / false");
		boolean pfitness = sc.nextBoolean();
		
		
		if (age >= 18 && age <=25) 
		{
			if (qual.equals("Inter")) 
			{
				if (mfitness == true) 
				{
					if (pfitness==true) 
					{
						if (gen.equals("Male"))
						{
							if (height >= 180) 
							{
								if (weight >=80) 
								{
									System.out.println(name+" you are eligible to apply for the job");
								}
								else 
								{
									System.out.println(name+" You are not eligible as you are less weight");
								}
							}
							else 
							{
								System.out.println(name+" You are not eligible based on height requirements");
							}
							
						}
						else if (gen.equals("Female")) 
						{
							if (height >= 150) 
							{
								if (weight >=50) 
								{
									System.out.println(name+" you are eligible to apply for the job");
								}
								else 
								{
									System.out.println(name+" You are not eligible as you are less weight");
								}
							}
							else 
							{
								System.out.println(name+" You are not eligible based on height requirements");
							}
						}
						else 
						{
							System.out.println(name+" You are not eligible based upon gender requirements");
						}
					}
					else 
					{
						System.out.println(name+" You are unfit physically");
					}
				}
				else 
				{
					System.out.println(name+" You are not eligible as you are not mentally fit");
				}
			}
			else 
			{
				System.out.println(name + " You are not eligible based upon your qualification");
			}
		}
		else 
		{
			System.out.println(name + " you are not eligible out of age group");
		}

	}

}
