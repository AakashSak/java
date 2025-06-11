import java.util.Scanner;
public class Restaurents
{
	static Scanner ref = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		// Welcome page
		
		System.out.println("\t Welcome to Chain Of Restaurents");
		
		System.out.println("\t -----------------");
		
		// Display hotel
		
        System.out.println("\t Select the Hotel");
		System.out.println("\t -----------------");
		
		
		//Hotel names
		
		System.out.println("1.Buhari\n2.A2B \n3.Amma Unavagam:");
		int hname = ref.nextInt();
		
		// Select Hotel
		
		switch (hname)
		{
			// Buhari
		case 1 :
			
		{ 
			System.out.println(" Welcome to Buhari Restaurant :");
			System.out.println(" -----------------------------:");
			
			//Menu Style
			
			System.out.println(" We Offer Our Authentic Style Dishes :");
			System.out.println(" ----------------------------------- :");
			
			// Menu List
			System.out.println(" 1.Mutton Chettinad Biriyani (Authentic Karaikudi Chettinad Style)\n 2.Chicken Biriyani (Recipe from ambur) \n 3.Prawn Biriyani (Recipe from Kanyakumari) :");
			int Buhari_menu = ref.nextInt();
			
			System.out.println("Processing.....");
			Thread.sleep(1000);

			//Menu Select
			
			switch (Buhari_menu)
			{
				
			// Mutton Biriyani
				
			case 1 :
				{
				//price setting

				
				int Price = 360;
				System.out.println("Youre Selected Mutton Chettinad Biriyani:");
			    System.out.println(" Price =" +Price);
				

					
				//Quantity want	
					
				System.out.println("Enter The Quantity You Want ");
				System.out.println("-----------------------------");
				int Quantityenterd = ref.nextInt();
				System.out.println("Quantity enterd " + Quantityenterd);
				
				System.out.println("Processing.....");
				Thread.sleep(1000);
				
				//Total bill

				double bill = Price * Quantityenterd;
				System.out.println(bill + "is your total amount");
				
				//conformation page
			    System.out.println("Processing.....");
			    Thread.sleep(1000);
				
				System.out.println("If You Want to Continue Press \"S\" ");

				System.out.println("\n S , N");
				
				char confirmation = ref.next().charAt(0);
				
				// char confirmation = ref.next().charAt(0);

				
				if (confirmation == 's') 
					
				{
					System.out.println("continue to the payment page");
					
				}
				
				else if (confirmation == 'n' )
					
					{
						
						System.out.println("Order Was Failed");
					break;
					}
					
					// payment method
					System.out.println("Choose The Payment Method :\n 1.Card Payment\n 2.UPI - Payment\n 3.COD(Cash On Delivery)");
					int payment =ref.nextInt();
					
					switch (payment)
						
					
					{
						//card payment
						
					case 1: 

					
					{
						//card type
		
			
						System.out.println("Choose your card:\n 1.Debit Card \n 2.Credit Card");
						int card =ref.nextInt();
						
						switch (card)
							
						
						{
							
						case 1: 
							
						
					   System.out.println("\n Enter your Debit Card Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // Validate debit card number length & digits
                       if (number1.length() == 16 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Debit Card Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Debit card Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;
						
						
						case 2: 
							
						
					  System.out.println("\n Enter your Credit Card Number :");
					   
					   String number2 = ref.next();
					   
					   
					   // Validate Credit card number length & digits
                       if (number2.length() == 16 && number2.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Credit Card Number entered: " + number2);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Credit card Number! Order was cancelled.");
					 
					 break;
					 
					 
					 
					 
                        }


						
						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;
						
						
						}
						
						break;
						
						}
					
					
					//upi
					case 2: //
					
					
										{
						//UPI Method type
		
			
						System.out.println("Choose your UPI Method:\n 1.Google Pay : Secure UPI payment \n 2.Phone Pe UPI");
						int UPI =ref.nextInt();
						
						switch (UPI)
							
						
						{
							
						case 1:  
							
						System.out.print("Google Pay : Secure UPI payment");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number = ref.next();
					   
					   
					   // Validate mobile number length & digits
                       if (number.length() == 10 && number.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break ;
					 
                        }

					   //otp generation
					   
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;
						
						
						case 2: 
						
						
						System.out.print("Phone - pe");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // Validate mobile number length & digits
                       if (number1.length() == 10 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;
						
						
						}
						
						break;
						}

					
					
					
					
					
					//cod
					case 3: 
						
					
					{
						
						
						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Address verifed Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;

						
						
					}

					
					
					
					}
					
					
					
				break;
				
				}
			
			
			
			// Chicken Biriyani
			
			case 2 :
				
			{
				
								//price setting

				
				int Price = 240;
				System.out.println("Youre Selected Chicken Biriyani:");
			    System.out.println(" Price =" +Price);
				

					
				//Quantity want	
					
				System.out.println("Enter The Quantity You Want ");
				System.out.println("-----------------------------");
				int Quantityenterd = ref.nextInt();
				System.out.println("Quantity enterd " + Quantityenterd);
				
				System.out.println("Processing.....");
				Thread.sleep(1000);
				
				//Total bill

				double bill = Price * Quantityenterd;
				System.out.println(bill + "is your total amount");
				
				//conformation page
			    System.out.println("Processing.....");
			    Thread.sleep(1000);
				
				System.out.println("If You Want to Continue Press \"S\" ");

				System.out.println("\n S , N");
				
				char confirmation = ref.next().charAt(0);
				
				// char confirmation = ref.next().charAt(0);

				
				if (confirmation == 's') 
					
				{
					System.out.println("continue to the payment page");
					
				}
				
				else if (confirmation == 'n' )
					
					{
						
						System.out.println("Order Was Failed");
					break;
					}
					
					// payment method
					System.out.println("Choose The Payment Method :\n 1.Card Payment\n 2.UPI - Payment\n 3.COD(Cash On Delivery)");
					int payment =ref.nextInt();
					
					switch (payment)
						
					
					{
						//card payment
						
					case 1: 

					
					{
						//card type
		
			
						System.out.println("Choose your card:\n 1.Debit Card \n 2.Credit Card");
						int card =ref.nextInt();
						
						switch (card)
							
						
						{
							
						case 1: 
							
			     	   System.out.println("\n Enter your Debit Card Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // Validate debit card number length & digits
                       if (number1.length() == 16 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Debit Card Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Debit card Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;
						
						
						case 2: 
							//Credit Card
							
						
					  System.out.println("\n Enter your Credit Card Number :");
					   
					   String number2 = ref.next();
					   
					   
					   // Validate Credit card number length & digits
                       if (number2.length() == 16 && number2.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Credit Card Number entered: " + number2);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Credit card Number! Order was cancelled.");
					 
					 break;
					 
					 
					 
					 
                        }

						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;
						
						
						}
						
						break;
						
						}
					
					
					//upi
					case 2: //
					
					
										{
						//UPI Method type
		
			
						System.out.println("Choose your UPI Method:\n 1.Google Pay : Secure UPI payment \n 2.Phone Pe UPI");
						int UPI =ref.nextInt();
						
						switch (UPI)
							
						
						{
							
						case 1:  
							
						System.out.print("Google Pay : Secure UPI payment");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number = ref.next();
					   
					   
					   // Validate mobile number length & digits
                       if (number.length() == 10 && number.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break ;
					 
                        }

					   //otp generation
					   
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;
						
						
						case 2: 
						
						
						System.out.print("Phone - pe");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // Validate mobile number length & digits
					   
							
					   
                       if (number1.length() == 10 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break;
					 
                        }
						
					
					   

						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;
						
						
						}
						
						break;
						}

					
					
					
					
					
					//cod
					case 3: 
						
					
					{
						
						
						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Address verifed Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;

						
						
					}

					
					
					
					}
					
					
					
				break;
				

				
			//Closing Chicken Biriyani
				
				
				}
			
			
			//Prawn Biriyani
			case 3 :
				
			{
				
				int Price = 480;
				System.out.println("Youre Selected Prawn Biriyani:");
			    System.out.println(" Price =" +Price);
				

					
				//Quantity want	
					
				System.out.println("Enter The Quantity You Want ");
				System.out.println("-----------------------------");
				int Quantityenterd = ref.nextInt();
				System.out.println("Quantity enterd " + Quantityenterd);
				
				System.out.println("Processing.....");
				Thread.sleep(1000);
				
				//prawn Total bill

				double bill = Price * Quantityenterd;
				System.out.println(bill + "is your total amount");
				
				// prawn conformation page
			    System.out.println("Processing.....");
			    Thread.sleep(1000);
				
				System.out.println("If You Want to Continue Press \"S\" ");

				System.out.println("\n S , N");
				
				char confirmation = ref.next().charAt(0);
				
				// char confirmation = ref.next().charAt(0);

				
				if (confirmation == 's') 
					
				{
					System.out.println("continue to the payment page");
					
				}
				
				else if (confirmation == 'n' )
					
					{
						
						System.out.println("Order Was Failed");
					break;
					}
					
					// prawn payment method
					System.out.println("Choose The Payment Method :\n 1.Card Payment\n 2.UPI - Payment\n 3.COD(Cash On Delivery)");
					int payment =ref.nextInt();
					
					switch (payment)
						
					
					{
						//card payment
						
					case 1: 

					
					{
						//card type
		
			
						System.out.println("Choose your card:\n 1.Debit Card \n 2.Credit Card");
						int card =ref.nextInt();
						
						switch (card)
							
						
						{
							
						case 1: 
							
						
					   System.out.println("\n Enter your Debit Card Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // prawn Validate debit card number length & digits
                       if (number1.length() == 16 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Debit Card Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Debit card Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   // prawn Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;
						
						
						case 2: 
							
						
					  System.out.println("\n Enter your Credit Card Number :");
					   
					   String number2 = ref.next();
					   
					   
					   // prawn Validate Credit card number length & digits
                       if (number2.length() == 16 && number2.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Credit Card Number entered: " + number2);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Credit card Number! Order was cancelled.");
					 
					 break;
					 
					 
					 
					 
                        }


						
						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   // prawn Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;
						
						
						}
						
						break;
						
						}
					
					
					//upi
					case 2: //
					
					
										{
						//UPI Method type
		
			
						System.out.println("Choose your UPI Method:\n 1.Google Pay : Secure UPI payment \n 2.Phone Pe UPI");
						int UPI =ref.nextInt();
						
						switch (UPI)
							
						
						{
							
						case 1:  
							
						System.out.print("Google Pay : Secure UPI payment");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number = ref.next();
					   
					   
					   // prawn Validate mobile number length & digits
                       if (number.length() == 10 && number.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break ;
					 
                        }

					   //otp generation
					   
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;
						
						
						case 2: 
						
						
						System.out.print("Phone - pe");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // Validate mobile number length & digits
                       if (number1.length() == 10 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;
						
						
						}
						
						break;
						}

					
					
					
					
					
					//cod
					case 3: 
						
					
					{
						
						
						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Address verifed Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   
						}

						break;

						
						
					}

					
					
					
					}
					
					
					
				break;
	
			
				
				}
			// Closing prawn Biriyani
			}
			
			break;
			
			
			}
		
		
		//A2b
		
		
		case 2 :{ 
			
			// a2b opening
			System.out.println("Welcom to A2B Chain of Restaurents");
			System.out.println("----------------------------------");
			//a2b menu select
			System.out.println("1.Idly\n2.Dosai\n3.Vada");
			int a2bmenu = ref.nextInt();
			
			System.out.println("Processing.....");
			Thread.sleep(1000);

			switch (a2bmenu)
			{
			case 1 :{
				
				int Price = 40;
				System.out.println("Youre Selected Idly:");
			    System.out.println(" Price =" +Price);
				

					
				//Quantity want	
					
				System.out.println("Enter The Quantity You Want ");
				System.out.println("-----------------------------");
				int Quantityenterd = ref.nextInt();
				System.out.println("Quantity enterd " + Quantityenterd);
				
				System.out.println("Processing.....");
				Thread.sleep(1000);
				
				//idly Total bill

				double bill = Price * Quantityenterd;
				System.out.println(bill + "is your total amount");
				
				// idly conformation page
			    System.out.println("Processing.....");
			    Thread.sleep(1000);
				
				System.out.println("If You Want to Continue Press \"S\" ");

				System.out.println("\n S , N");
				
				char confirmation = ref.next().charAt(0);
				
				// char confirmation = ref.next().charAt(0);

				
				if (confirmation == 's') 
					
				{
					System.out.println("continue to the payment page");
					
				}
				
				else if (confirmation == 'n' )
					
					{
						
						System.out.println("Order Was Failed");
					break;
					}
					
					// idly payment method
					System.out.println("Choose The Payment Method :\n 1.Card Payment\n 2.UPI - Payment\n 3.COD(Cash On Delivery)");
					int payment =ref.nextInt();
					
					switch (payment)
						
					
					{
						//card payment
						
					case 1: 

					
					{
						//card type
		
			
						System.out.println("Choose your card:\n 1.Debit Card \n 2.Credit Card");
						int card =ref.nextInt();
						
						switch (card)
							
						
						{
							
						case 1: 
							
						
					   System.out.println("\n Enter your Debit Card Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // idly Validate debit card number length & digits
                       if (number1.length() == 16 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Debit Card Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Debit card Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   // idly Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						case 2: 
							
						
					  System.out.println("\n Enter your Credit Card Number :");
					   
					   String number2 = ref.next();
					   
					   
					   // idly Validate Credit card number length & digits
                       if (number2.length() == 16 && number2.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Credit Card Number entered: " + number2);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Credit card Number! Order was cancelled.");
					 
					 break;
					 
					 
					 
					 
                        }


						
						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   // idly Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						}
						
						break;
						
						}
					
					
					//upi
					case 2: //
					
					
										{
						//UPI Method type
		
			
						System.out.println("Choose your UPI Method:\n 1.Google Pay : Secure UPI payment \n 2.Phone Pe UPI");
						int UPI =ref.nextInt();
						
						switch (UPI)
							
						
						{
							
						case 1:  
							
						System.out.print("Google Pay : Secure UPI payment");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number = ref.next();
					   
					   
					   // idly Validate mobile number length & digits
                       if (number.length() == 10 && number.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break ;
					 
                        }

					   //otp generation
					   
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						case 2: 
						
						
						System.out.print("Phone - pe");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // Validate mobile number length & digits
                       if (number1.length() == 10 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						 break;  
						}

						break;
						
						
						}
						
						break;
						}

					
					
					
					
					
					//cod
					case 3: 
						
					
					{
						
						
						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Address verifed Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   break;
						}

						break;

						
						
					}

					
					
					
					}
					
					
					

				
				
				
				
				
				
				
				
				break;
				
				
				
				}
			
			
			//Dosai
			
			case 2 :
				
			{
				int Price = 120;
				System.out.println("Youre Selected Dosai:");
			    System.out.println(" Price =" +Price);
				

					
				//Quantity want	
					
				System.out.println("Enter The Quantity You Want ");
				System.out.println("-----------------------------");
				int Quantityenterd = ref.nextInt();
				System.out.println("Quantity enterd " + Quantityenterd);
				
				System.out.println("Processing.....");
				Thread.sleep(1000);
				
				//Dosai Total bill

				double bill = Price * Quantityenterd;
				System.out.println(bill + "is your total amount");
				
				// Dosai conformation page
			    System.out.println("Processing.....");
			    Thread.sleep(1000);
				
				System.out.println("If You Want to Continue Press \"S\" ");

				System.out.println("\n S , N");
				
				char confirmation = ref.next().charAt(0);
				
				// char confirmation = ref.next().charAt(0);

				
				if (confirmation == 's') 
					
				{
					System.out.println("continue to the payment page");
					
				}
				
				else if (confirmation == 'n' )
					
					{
						
						System.out.println("Order Was Failed");
					break;
					}
					
					// Dosai payment method
					System.out.println("Choose The Payment Method :\n 1.Card Payment\n 2.UPI - Payment\n 3.COD(Cash On Delivery)");
					int payment =ref.nextInt();
					
					switch (payment)
						
					
					{
						//card payment
						
					case 1: 

					
					{
						//card type
		
			
						System.out.println("Choose your card:\n 1.Debit Card \n 2.Credit Card");
						int card =ref.nextInt();
						
						switch (card)
							
						
						{
							
						case 1: 
							
						
					   System.out.println("\n Enter your Debit Card Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // Dosai Validate debit card number length & digits
                       if (number1.length() == 16 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Debit Card Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Debit card Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   // idly Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						case 2: 
							
						
					  System.out.println("\n Enter your Credit Card Number :");
					   
					   String number2 = ref.next();
					   
					   
					   // Dosai Validate Credit card number length & digits
                       if (number2.length() == 16 && number2.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Credit Card Number entered: " + number2);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Credit card Number! Order was cancelled.");
					 
					 break;
					 
					 
					 
					 
                        }


						
						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   // Dosai Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						}
						
						break;
						
						}
					
					
					//upi
					case 2: //
					
					
										{
						//UPI Method type
		
			
						System.out.println("Choose your UPI Method:\n 1.Google Pay : Secure UPI payment \n 2.Phone Pe UPI");
						int UPI =ref.nextInt();
						
						switch (UPI)
							
						
						{
							
						case 1:  
							
						System.out.print("Google Pay : Secure UPI payment");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number = ref.next();
					   
					   
					   // Dosai Validate mobile number length & digits
                       if (number.length() == 10 && number.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break ;
					 
                        }

					   //otp generation
					   
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						case 2: 
						
						
						System.out.print("Phone - pe");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // Validate mobile number length & digits
                       if (number1.length() == 10 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						 break;  
						}

						break;
						
						
						}
						
						break;
						}

					
					
					
					
					
					//cod
					case 3: 
						
					
					{
						
						
						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Address verifed Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   break;
						}

						break;

						
						
					}

					
					
					
					}
					
					

				
				break;
				
				
				}
			
			
			
			//vada
			
			case 3 :
				
			{
				
				int Price = 40;
				System.out.println("Youre Selected Idly:");
			    System.out.println(" Price =" +Price);
				

					
				//Quantity want	
					
				System.out.println("Enter The Quantity You Want ");
				System.out.println("-----------------------------");
				int Quantityenterd = ref.nextInt();
				System.out.println("Quantity enterd " + Quantityenterd);
				
				System.out.println("Processing.....");
				Thread.sleep(1000);
				
				//idly Total bill

				double bill = Price * Quantityenterd;
				System.out.println(bill + "is your total amount");
				
				// idly conformation page
			    System.out.println("Processing.....");
			    Thread.sleep(1000);
				
				System.out.println("If You Want to Continue Press \"S\" ");

				System.out.println("\n S , N");
				
				char confirmation = ref.next().charAt(0);
				
				// char confirmation = ref.next().charAt(0);

				
				if (confirmation == 's') 
					
				{
					System.out.println("continue to the payment page");
					
				}
				
				else if (confirmation == 'n' )
					
					{
						
						System.out.println("Order Was Failed");
					break;
					}
					
					// vada payment method
					System.out.println("Choose The Payment Method :\n 1.Card Payment\n 2.UPI - Payment\n 3.COD(Cash On Delivery)");
					int payment =ref.nextInt();
					
					switch (payment)
						
					
					{
						//card payment
						
					case 1: 

					
					{
						//card type
		
			
						System.out.println("Choose your card:\n 1.Debit Card \n 2.Credit Card");
						int card =ref.nextInt();
						
						switch (card)
							
						
						{
							
						case 1: 
							
						
					   System.out.println("\n Enter your Debit Card Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // vada Validate debit card number length & digits
                       if (number1.length() == 16 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Debit Card Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Debit card Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   // Vada Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						case 2: 
							
						
					  System.out.println("\n Enter your Credit Card Number :");
					   
					   String number2 = ref.next();
					   
					   
					   // Vada Validate Credit card number length & digits
                       if (number2.length() == 16 && number2.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Credit Card Number entered: " + number2);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Credit card Number! Order was cancelled.");
					 
					 break;
					 
					 
					 
					 
                        }


						
						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   // idly Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						}
						
						break;
						
						}
					
					
					//upi
					case 2: //
					
					
										{
						//UPI Method type
		
			
						System.out.println("Choose your UPI Method:\n 1.Google Pay : Secure UPI payment \n 2.Phone Pe UPI");
						int UPI =ref.nextInt();
						
						switch (UPI)
							
						
						{
							
						case 1:  
							
						System.out.print("Google Pay : Secure UPI payment");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number = ref.next();
					   
					   
					   // Vada Validate mobile number length & digits
                       if (number.length() == 10 && number.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break ;
					 
                        }

					   //otp generation
					   
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						case 2: 
						
						
						System.out.print("Phone - pe");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // Validate mobile number length & digits
                       if (number1.length() == 10 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						 break;  
						}

						break;
						
						
						}
						
						break;
						}

					
					
					
					
					
					//cod
					case 3: 
						
					
					{
						
						
						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Address verifed Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   break;
						}

						break;

						
						
					}

					
					
					
					}
					
					
					

				
				break;
				
				
				
				}
			
			
			
			}

			
			
			
			break; }
		
		
		//Amma Unavagam
		
		
		case 3 :{ 
			
			System.out.println("Welcome to Amma Unavagam");
			System.out.println("------------------------");
			
			//amma unavagam menu
			
			System.out.println("1.Cured Rice\n2.Bismilla Bath\n3.Chapathi");
			int ammamenu = ref.nextInt();
			
			//select menu
			
			switch (ammamenu)
			{
			case 1 : 
				
			{
				int Price = 5;
				System.out.println("Youre Selected Curd Rice:");
			    System.out.println(" Price =" +Price);
				

					
				//Quantity want	
					
				System.out.println("Enter The Quantity You Want ");
				System.out.println("-----------------------------");
				int Quantityenterd = ref.nextInt();
				System.out.println("Quantity enterd " + Quantityenterd);
				
				System.out.println("Processing.....");
				Thread.sleep(1000);
				
				//crice Total bill

				double bill = Price * Quantityenterd;
				System.out.println(bill + "is your total amount");
				
				// crice conformation page
			    System.out.println("Processing.....");
			    Thread.sleep(1000);
				
				System.out.println("If You Want to Continue Press \"S\" ");

				System.out.println("\n S , N");
				
				char confirmation = ref.next().charAt(0);
				
				// char confirmation = ref.next().charAt(0);

				
				if (confirmation == 's') 
					
				{
					System.out.println("continue to the payment page");
					
				}
				
				else if (confirmation == 'n' )
					
					{
						
						System.out.println("Order Was Failed");
					break;
					}
					
					// crice payment method
					System.out.println("Choose The Payment Method :\n 1.Card Payment\n 2.UPI - Payment\n 3.COD(Cash On Delivery)");
					int payment =ref.nextInt();
					
					switch (payment)
						
					
					{
						//card payment
						
					case 1: 

					
					{
						//card type
		
			
						System.out.println("Choose your card:\n 1.Debit Card \n 2.Credit Card");
						int card =ref.nextInt();
						
						switch (card)
							
						
						{
							
						case 1: 
							
						
					   System.out.println("\n Enter your Debit Card Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // crice Validate debit card number length & digits
                       if (number1.length() == 16 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Debit Card Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Debit card Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   // idly Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						case 2: 
							
						
					  System.out.println("\n Enter your Credit Card Number :");
					   
					   String number2 = ref.next();
					   
					   
					   // crice Validate Credit card number length & digits
                       if (number2.length() == 16 && number2.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Credit Card Number entered: " + number2);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Credit card Number! Order was cancelled.");
					 
					 break;
					 
					 
					 
					 
                        }


						
						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   // crice Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						}
						
						break;
						
						}
					
					
					//upi
					case 2: //
					
					
										{
						//UPI Method type
		
			
						System.out.println("Choose your UPI Method:\n 1.Google Pay : Secure UPI payment \n 2.Phone Pe UPI");
						int UPI =ref.nextInt();
						
						switch (UPI)
							
						
						{
							
						case 1:  
							
						System.out.print("Google Pay : Secure UPI payment");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number = ref.next();
					   
					   
					   // crice Validate mobile number length & digits
                       if (number.length() == 10 && number.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break ;
					 
                        }

					   //otp generation
					   
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						case 2: 
						
						
						System.out.print("Phone - pe");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // Validate mobile number length & digits
                       if (number1.length() == 10 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						 break;  
						}

						break;
						
						
						}
						
						break;
						}

					
					
					
					
					
					//cod
					case 3: 
						
					
					{
						
						
						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Address verifed Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   break;
						}

						break;

						
						
					}

					
					
					
					}
					
				
				break;
				
			}
			
			case 2 :
				
			{
				int Price = 5;
				System.out.println("Youre Selected Bismillah Bath:");
			    System.out.println(" Price =" +Price);
				

					
				//Quantity want	
					
				System.out.println("Enter The Quantity You Want ");
				System.out.println("-----------------------------");
				int Quantityenterd = ref.nextInt();
				System.out.println("Quantity enterd " + Quantityenterd);
				
				System.out.println("Processing.....");
				Thread.sleep(1000);
				
				//BBath Total bill

				double bill = Price * Quantityenterd;
				System.out.println(bill + "is your total amount");
				
				// BBath conformation page
			    System.out.println("Processing.....");
			    Thread.sleep(1000);
				
				System.out.println("If You Want to Continue Press \"S\" ");

				System.out.println("\n S , N");
				
				char confirmation = ref.next().charAt(0);
				
				// char confirmation = ref.next().charAt(0);

				
				if (confirmation == 's') 
					
				{
					System.out.println("continue to the payment page");
					
				}
				
				else if (confirmation == 'n' )
					
					{
						
						System.out.println("Order Was Failed");
					break;
					}
					
					// BBath payment method
					System.out.println("Choose The Payment Method :\n 1.Card Payment\n 2.UPI - Payment\n 3.COD(Cash On Delivery)");
					int payment =ref.nextInt();
					
					switch (payment)
						
					
					{
						//card payment
						
					case 1: 

					
					{
						//card type
		
			
						System.out.println("Choose your card:\n 1.Debit Card \n 2.Credit Card");
						int card =ref.nextInt();
						
						switch (card)
							
						
						{
							
						case 1: 
							
						
					   System.out.println("\n Enter your Debit Card Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // BBath Validate debit card number length & digits
                       if (number1.length() == 16 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Debit Card Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Debit card Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   // idly Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						case 2: 
							
						
					  System.out.println("\n Enter your Credit Card Number :");
					   
					   String number2 = ref.next();
					   
					   
					   // BBath Validate Credit card number length & digits
                       if (number2.length() == 16 && number2.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Credit Card Number entered: " + number2);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Credit card Number! Order was cancelled.");
					 
					 break;
					 
					 
					 
					 
                        }


						
						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   // BBath Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						}
						
						break;
						
						}
					
					
					//upi
					case 2: //
					
					
										{
						//UPI Method type
		
			
						System.out.println("Choose your UPI Method:\n 1.Google Pay : Secure UPI payment \n 2.Phone Pe UPI");
						int UPI =ref.nextInt();
						
						switch (UPI)
							
						
						{
							
						case 1:  
							
						System.out.print("Google Pay : Secure UPI payment");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number = ref.next();
					   
					   
					   // BBath Validate mobile number length & digits
                       if (number.length() == 10 && number.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break ;
					 
                        }

					   //otp generation
					   
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						case 2: 
						
						
						System.out.print("Phone - pe");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // Validate mobile number length & digits
                       if (number1.length() == 10 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						 break;  
						}

						break;
						
						
						}
						
						break;
						}

					
					
					
					
					
					//cod
					case 3: 
						
					
					{
						
						
						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Address verifed Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   break;
						}

						break;

						
						
					}

					
					
					
					}
					
				break;
				
				
				}
			
			case 3 : 
				
			
			{
				int Price = 3;
				System.out.println("Youre Selected Chapthi:");
			    System.out.println(" Price =" +Price);
				

					
				//Quantity want	
					
				System.out.println("Enter The Quantity You Want ");
				System.out.println("-----------------------------");
				int Quantityenterd = ref.nextInt();
				System.out.println("Quantity enterd " + Quantityenterd);
				
				System.out.println("Processing.....");
				Thread.sleep(1000);
				
				//Chapathi Total bill

				double bill = Price * Quantityenterd;
				System.out.println(bill + "is your total amount");
				
				// Chapathi conformation page
			    System.out.println("Processing.....");
			    Thread.sleep(1000);
				
				System.out.println("If You Want to Continue Press \"S\" ");

				System.out.println("\n S , N");
				
				char confirmation = ref.next().charAt(0);
				
				// char confirmation = ref.next().charAt(0);

				
				if (confirmation == 's') 
					
				{
					System.out.println("continue to the payment page");
					
				}
				
				else if (confirmation == 'n' )
					
					{
						
						System.out.println("Order Was Failed");
					break;
					}
					
					// Chapathi payment method
					System.out.println("Choose The Payment Method :\n 1.Card Payment\n 2.UPI - Payment\n 3.COD(Cash On Delivery)");
					int payment =ref.nextInt();
					
					switch (payment)
						
					
					{
						//card payment
						
					case 1: 

					
					{
						//card type
		
			
						System.out.println("Choose your card:\n 1.Debit Card \n 2.Credit Card");
						int card =ref.nextInt();
						
						switch (card)
							
						
						{
							
						case 1: 
							
						
					   System.out.println("\n Enter your Debit Card Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // Chapathi Validate debit card number length & digits
                       if (number1.length() == 16 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Debit Card Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Debit card Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   // Chapathi Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						case 2: 
							
						
					  System.out.println("\n Enter your Credit Card Number :");
					   
					   String number2 = ref.next();
					   
					   
					   // Chaoathi Validate Credit card number length & digits
                       if (number2.length() == 16 && number2.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Credit Card Number entered: " + number2);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Credit card Number! Order was cancelled.");
					 
					 break;
					 
					 
					 
					 
                        }


						
						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   // Chapathi Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						}
						
						break;
						
						}
					
					
					//upi
					case 2: //
					
					
										{
						//UPI Method type
		
			
						System.out.println("Choose your UPI Method:\n 1.Google Pay : Secure UPI payment \n 2.Phone Pe UPI");
						int UPI =ref.nextInt();
						
						switch (UPI)
							
						
						{
							
						case 1:  
							
						System.out.print("Google Pay : Secure UPI payment");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number = ref.next();
					   
					   
					   // Chapathi Validate mobile number length & digits
                       if (number.length() == 10 && number.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break ;
					 
                        }

					   //otp generation
					   
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						  break; 
						}

						break;
						
						
						case 2: 
						
						
						System.out.print("Phone - pe");
						
						
					   // Mobile Verification
					   
					   System.out.println("\n Enter your Mobile Number :");
					   
					   String number1 = ref.next();
					   
					   
					   // Validate mobile number length & digits
                       if (number1.length() == 10 && number1.matches("\\d+")) 
						   
					   
					   {
                      System.out.println("Valid Mobile Number entered: " + number1);
                       } 
					   
					   else
						   
					   {
                     System.out.println("Invalid Mobile Number! Order was cancelled.");
					 
					 break;
					 
                        }


						
					   // otp generation
					   
					   int syss_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + syss_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterrOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( syss_otp == enterrOTP )
						   
					   
					   {
						   System.out.println("Payment Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						 break;  
						}

						break;
						
						
						}
						
						break;
						}

					
					
					
					
					
					//cod
					case 3: 
						
					
					{
						
						
						
						
					   // otp generation
					   
					   int sys_otp = (int) (Math.random()*9999+9999); // Generate 4 Digits.
					   System.out.println("Enter the Given Otp for Verification " + sys_otp);
					   
					   // Enter otp
					   
					   System.out.println("Enter the Recieved Otp : ");
					   int enterOTP = ref.nextInt();
					   
					   //Otp verification
					   
					   if ( sys_otp == enterOTP )
						   
					   
					   {
						   System.out.println("Address verifed Successful! Thank you for your order.");
					   }
					   
					   else
						{
						   System.out.println(" Incorrect OTP. Payment failed!.");
						   break;
						}

						break;

						
						
					}

					
					
					
					}
					
					

				
				
				break;}
			
			}
			
			
			break; 
			}


		
		}
		
	}
}
