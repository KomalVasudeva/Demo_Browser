import java.io.*;
class exper3
{
String cu,cu1,cu2,co;
void kbc()throws IOException
{
String n;
exper3 ob3=new exper3();
do
{
String ch,ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10,ch11,ch12,ch13,ch14;
BufferedReader quiz=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Welcome to www.kbcindia.in");
System.out.println("");
String back;
System.out.println("You can press b to go back to the main page,any other key to proceed");
back=quiz.readLine();
if(back.equalsIgnoreCase("b"))
{
break;
}
System.out.println("Press 1,2,3 or 4 to make a choice.Press any other number to quit.");
System.out.println("");
System.out.println("You can't quit without answering 1st 4 questions");
System.out.println("");
System.out.println("There are 2 safe havens.One is at 4th Question and other at 8th question.");
System.out.println("");
System.out.println("Get Ready to face the first question.Here it comes.");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("Which country has the largest area?");
System.out.println("");
System.out.println("1:Canada");
System.out.println("2:US");
System.out.println("3:Russia");
System.out.println("4:India");
System.out.println("Enter b to go back to main page of KBC");
System.out.println();
ch=quiz.readLine();
if(ch.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch.equals("1"))
System.out.println("Sorry.Wrong answer.");
else if(ch.equals("2"))
System.out.println("Sorry.Wrong answer.");
else if(ch.equals("3"))
{
System.out.println("Congo!.You are right.You have won Rs.5000.");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("Here comes the next question.");
System.out.println("");
System.out.println("Which country has the highest population?");
System.out.println("");
System.out.println("1:India");
System.out.println("2:China");
System.out.println("3:US");
System.out.println("4:Russia");
System.out.println("Enter b to go back to main page of KBC");
System.out.println();
ch1=quiz.readLine();
if(ch1.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch1.equals("1")) 
System.out.println("Sorry.Wrong answer.");
else if(ch1.equals("2"))
{
System.out.println("Yeah!You are correct.You have won Rs.10000.");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("Here comes the 3rd question.");
System.out.println("");
System.out.println("Who is the richest person in the world?");
System.out.println("");
System.out.println("1:Warren Buffet");  
System.out.println("2:Mukesh Ambani");
System.out.println("3:Bill GAtes");
System.out.println("4:Carlos Helu");
System.out.println("Enter b to go back to main page of KBC");
System.out.println();
ch2=quiz.readLine();
if(ch2.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch2.equals("1"))
System.out.println("Sorry.Wrong answer!");
else if(ch2.equals("2"))
System.out.println("Sorry.Wrong answer.");
else if(ch2.equals("3"))
{
System.out.println("Yeah!Correct!You win Rs. 20000");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("Here comes the next one.");
System.out.println("");
System.out.println("Who is known as the King of Swing?");
System.out.println("");
System.out.println("1: Bhuvaneshwar Kumar");  
System.out.println("2:Zaheer Khan");
System.out.println("3:Wasim Akram");
System.out.println("4:Waqar Younis");
System.out.println("Enter b to go back to main page of KBC");
System.out.println();
ch3=quiz.readLine();
if(ch3.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch3.equals("1"))
System.out.println("Sorry.Wrong answer.");
else if(ch3.equals("2"))
System.out.println("Wrong answer.");
else if(ch3.equals("3"))
{
System.out.println("You have won Rs.40000.You are right.You have crossed the first safe haven.");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("The next one goes here!");
System.out.println("");
System.out.println("Which nickname has been devised for Kautilya Pandit?");
System.out.println("");
System.out.println("1: Wikipedia of India");
System.out.println("2:Google Boy of India");
System.out.println("3:Facebook boy of India");
System.out.println("4:Search Engine of India");
System.out.println("Enter b to go back to main page of KBC.");
System.out.println();
ch4=quiz.readLine();
if(ch4.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch4.equals("1"))
System.out.println("Sorry.You are wrong.You get Rs.40000.Thanks for joining us here on KBC");
else if(ch4.equals("2"))
{
System.out.println("Yes!Correct!You have won Rs.80000.");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("Here is that question for Rs.1,60,000");
System.out.println("");
System.out.println("Who was the first field marshal of Indian Army?");
System.out.println("");
System.out.println("1.Gen K.M. Cariappa");
System.out.println("2:Gen Sam Manekshaw");
System.out.println("3:Gen VK Singh");
System.out.println("4:Gen Bikram Singh");
System.out.println("Enter b to go back to main page of KBC.");
ch5=quiz.readLine();
if(ch5.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch5.equals("1"))
System.out.println("Sorry.You loose and get Rs.40000");
else if(ch5.equals("2"))
{
System.out.println("Yeah!Correct!You get Rs.1,60,000");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("7th Question for Rs.3,20,000 is:");
System.out.println("");
System.out.println("Who was the last governor-general of India?");
System.out.println("");
System.out.println("1: Lord Curzon");
System.out.println("2:C.Rajagopalacharji");
System.out.println("3: Lord Mountbatten");
System.out.println("4:Lord Minto");
System.out.println("Enter b to go back to main page of KBC.");
System.out.println();
ch6=quiz.readLine();
if(ch6.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch6.equals("1"))
System.out.println("Sorry!You Loose.You get Rs.40000.");
else if(ch6.equals("2"))
{
System.out.println("Yeah!Right!You get Rs. 3,20,000");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("Question for Rs. 6,40,000 is:");
System.out.println("");
System.out.println("What was the name of the operation carried out to kill Osama bin Laden?");
System.out.println("");
System.out.println("1: Operation Jupiter Spear");
System.out.println("2:Operation Blue Star");
System.out.println("3:Operation Neptune Spear");
System.out.println("4: Operation Cyclone");
System.out.println("Enter b to go back to main page of KBC.");
System.out.println();
ch7=quiz.readLine();
if(ch7.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch7.equals("1"))
System.out.println("Sorry!Wrong answer.You get RS.40,000.");
else if(ch7.equals("2"))
System.out.println("Sorry!Wrong answer.You get RS.40,000.");
else if(ch7.equals("3"))
{
System.out.println("Good going!You win Rs.6,40,000.You have crossed the 2nd safe haven!");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("Be careful!Here comes the 9th Question for Rs.12,50,000:");
System.out.println("");
System.out.println("Who secured 2nd position in 400m race for men in Indo-PAk meet in 1960?");
System.out.println("");
System.out.println("1.Milkha Singh");
System.out.println("2:Abdul Khaliq");
System.out.println("3:Makhan Singh");  
System.out.println("4:Paan Singh Tomar");
System.out.println("Enter b to go back to main page of KBC.");
System.out.println();
ch8=quiz.readLine();
if(ch8.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch8.equals("1"))
System.out.println("Sorry.Wrong answer.You win Rs.6,40,000");
else if(ch8.equals("2"))
System.out.println("Sorry.Wrong answer.You win Rs.6,40,000");
else if(ch8.equals("3"))
{
System.out.println("You win Rs.12,50,000.It is the right answer");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("It's going to get tough.Here is the 10th for Rs.25,00,000.");
System.out.println("");
System.out.println("Which cricketer holds the record for longest spanning Test career?");
System.out.println("");
System.out.println("1:Sachin Tendulkar");
System.out.println("2:Brian Close");  
System.out.println("3:Jack Hobbs"); 
System.out.println("4:Wilfred Rhodes");
System.out.println("Enter b to go back to main page of KBC.");
System.out.println();
ch9=quiz.readLine();
if(ch9.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch9.equals("1"))
System.out.println("Sorry.Wrong answer.You win Rs.6,40,000");
else if(ch9.equals("2"))
System.out.println("Sorry.Wrong answer.You win Rs.6,40,000");
else if(ch9.equals("3"))
System.out.println("Sorry.Wrong answer.You win Rs.6,40,000");
else if(ch9.equals("4"))
{
System.out.println("Yes.Correct!His career spanned 31 years.You have won Rs.25,00,000.");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("The question for Rs.50,00,000 is:");
System.out.println("");
System.out.println("Who is the author of the play Andher Nagri?");
System.out.println("");
System.out.println("1: Mohan Rakesh");  
System.out.println("2:Amritlal Nagar");  
System.out.println("3:Bharatendu Harishchandra");  
System.out.println("4:Dharamvir Bharti");
System.out.println("Enter b to go back to main page of KBC.");
System.out.println();
ch10=quiz.readLine();
if(ch10.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch10.equals("1"))
System.out.println("Sorry.Wrong answer.You win Rs.6,40,000");
else if(ch10.equals("2"))
System.out.println("Sorry.Wrong answer.You win Rs.6,40,000");
else if(ch10.equals("3"))
{
System.out.println("Yeah!Right!You win Rs.50,00,000");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("Here comes the question for Rs.1 Crore.Be very cautious.Best of Luck!");
System.out.println("");
System.out.println("According to the 2011-2012 Union Budget, people of which age are considered as very senior citizen?");
System.out.println("");
System.out.println("1:65 years");
System.out.println("2:80 years");  
System.out.println("3:90 years");  
System.out.println("4:85 years");
System.out.println("Enter b to go back to main page of KBC.");
System.out.println();
ch11=quiz.readLine();
if(ch11.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch11.equals("1"))
System.out.println("You loose.You get Rs.6,40,000.Thanks for playing.");
else if(ch11.equals("2"))
{
System.out.println("Well played.You have won Rs.1 Crore.");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("Here comes the question for 3 Crore:");
System.out.println("");
System.out.println(" Which investigation agency was founded in 2009 and given special powers to probe terror crimes in India?");
System.out.println("");
System.out.println("1: National Security Guard");
System.out.println("2:Special Task Force");  
System.out.println("3:National Investigation Agency");  
System.out.println("4:Anti-Terrorism Squad");
System.out.println("Enter b to go back to main page of KBC.");
System.out.println();
ch12=quiz.readLine();
if(ch12.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch12.equals("1"))
System.out.println("Sorry!You loose and get Rs.6,40,000.Thanks for playing");
else if(ch12.equals("2"))
System.out.println("Sorry!You loose and get Rs.6,40,000.Thanks for playing");
else if(ch12.equals("3"))
{
System.out.println("Nice going!You have won Rs.3 Crore!2 more questions to go!");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("Here comes the question No. 14:");
System.out.println("");
System.out.println("According to Hindu mythology, Who among these was the daughter of an 'apsara' and 'rishi'?");
System.out.println("");
System.out.println("1:Devaki");  
System.out.println("2:Rukmani");  
System.out.println("3:Shakuntala");  
System.out.println("4:Ganga");
System.out.println("Enter b to go back to main page of KBC.");
System.out.println();
ch13=quiz.readLine();
if(ch13.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch13.equals("1"))
System.out.println("Sorry!Wrong!You had played very well throughout but commited a mistake at the critikv moment.You will get RS 6,40,000.Thanks for playing.");
else if(ch13.equals("2"))
System.out.println("Sorry!Wrong!You had played very well throughout but commited a mistake at the critikv moment.You will get RS 6,40,000.Thanks for playing.");
else if(ch13.equals("3"))
{
System.out.println("Magnificiently played.You have won Rs. 5 Crores and are on verge of winning 7 Crores.Congos!Best of Luck!");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("Here is the last one for Rs.7 Crores.Have a go at it only if you are fully confident.");
System.out.println("");
System.out.println("What was the only dowry, apart from a few yards of khadi, that Lal Bahadur Shastri accepted in his marriage?");
System.out.println("");
System.out.println("1:Bhagwad Gita");  
System.out.println("2:Ramayan");  
System.out.println("3:Gandhi Cap");  
System.out.println("4:Charkha");
System.out.println("Enter b to go back to main page of KBC.");
System.out.println();
ch14=quiz.readLine();
if(ch14.equalsIgnoreCase("b"))
{
ob3.kbc();
break;
}
else if(ch14.equals("1"))
System.out.println("Sorry!Wrong!You had played very well throughout but commited a mistake at the critikv moment.You will get RS 6,40,000.Thanks for playing.");
else if(ch14.equals("2"))
System.out.println("Sorry!Wrong!You had played very well throughout but commited a mistake at the critical moment.You will get RS 6,40,000.Thanks for playing.");
else if(ch14.equals("3"))
System.out.println("Sorry!Wrong!You had played very well throughout but commited a mistake at the critical moment.You will get RS 6,40,000.Thanks for playing.");
else if(ch.equals("3"))
{
System.out.println("Mesmerising!Wonderful!unbelievable!You have won Rs 7 Crores!Heartiest Congratulations!Thanks for joining us on KBC");
System.out.println("-------------------------------------------------------------------------------");
}
else
System.out.println("Very good decision!You didn't know the answer,so you quitted.You get Rs.5 Crores.Thanks for joining us on KBC");
}
else if(ch13.equals("4"))
System.out.println("Sorry!Wrong!You had played very well throughout but commited a mistake at the critical moment.You will get RS 6,40,000.Thanks for playing.");
else
System.out.println("Good Decision!You quit and get Rs.3 Crores.");
}
else if(ch12.equals("4"))
System.out.println("Sorry!You loose and get Rs.6,40,000.Thanks for playing");
else
System.out.println("Nice decision!You get Rs.1 Crore.Thanks for playing!");
break;
}
else if(ch11.equals("3"))
System.out.println("You loose.You get Rs.6,40,000.Thanks for playing.");
else if(ch11.equals("4"))
System.out.println("You loose.You get Rs.6,40,000.Thanks for playing.");
else
System.out.println("You quit.You win RS 50 Lakh.Well played.");
}
else if(ch10.equals("4"))
System.out.println("Sorry.Wrong answer.You win Rs.6,40,000");
else
System.out.println("You quit.You win Rs.25,00,000.Thanks for playing KBC.");
}
else
System.out.println("You have decided to quit.You win Rs.12,50,000.Thanks for playing KBC.");
}
else if(ch8.equals("4"))
System.out.println("Sorry.Wrong answer.You win Rs.6,40,000");
else
System.out.println("You have decided to quit.You win Rs.6,40,000.Thanks for playing KBC.");
}
else if(ch7.equals("4"))
System.out.println("Sorry!Wrong answer.You get RS.40,000.");
else
System.out.println("You have chosen to quit.You get Rs.3,20,000.Thanks for joining us on KBC");
}
else if(ch6.equals("3"))
System.out.println("Sorry!You Loose.You get Rs.40000.");
else if(ch6.equals("4"))
System.out.println("Sorry!You Loose.You get Rs.40000.");
else
System.out.println("You have decided to quit.You get Rs.1,60,000.Thanks for joining us on KBC");
}
else if(ch5.equals("3"))
System.out.println("Sorry!You Loose and get Rs.40,000");
else if(ch5.equals("4"))
System.out.println("Sorry!You Loose and get Rs.40,000");
else
System.out.println("Well played.You have decided to quit!You get Rs.80,000");
}
else if(ch4.equals("3"))
System.out.println("Sorry.You are wrong.You get Rs.40000.Thanks for joining us here on KBC");
else if(ch4.equals("4"))
System.out.println("Sorry.You are wrong.You get Rs.40000.Thanks for joining us here on KBC");
else
System.out.println("So,You decide to quit.You get Rs.40000.Thanks a lot");
}
else if(ch3.equals("4"))
System.out.println("Sorry.It isn't correct.");
else
System.out.println("Invalid Choice!");
}
else if(ch2.equals("4"))
System.out.println("Sorry.You are wrong");
else
System.out.println("Invalid choice");
}
else if(ch1.equals("3"))
System.out.println("Sorry.Wrong answer.");
else if(ch1.equals("4"))
System.out.println("Sorry.Wrong answer.");
else
System.out.println("Invalid Choice!");
}
else if(ch.equals("4"))
System.out.println("Sorry.Wrong answer.");
else
System.out.println("Invalid Choice!");
System.out.println("--------------------------------------------------------------------");
System.out.println("Maker:KOMAL VASUDEVA");
System.out.println("If you want to play again, press y else any other key");
n=quiz.readLine();
}while(n.equalsIgnoreCase("y"));
}
void bill()throws IOException
{
String k;
exper3 ob4=new exper3();
do
{
double u,r,r1,r2,b,l;
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\t"+ "Punjab State Power Corporation Limited");
System.out.println("---------------------------------------------------------------");
System.out.println("Press b to go back to main page , enter to proceed");
String back16=kv.readLine();
if(back16.equalsIgnoreCase("b"))
break;
System.out.println("Enter name");
System.out.println();
System.out.println("Enter b to go back to main page of billing.");
System.out.println();
String N=kv.readLine();
System.out.println();
if(N.equalsIgnoreCase("b"))
{
ob4.bill();
break;
}
else
{
System.out.println("Enter account number");
System.out.println();
System.out.println("Enter b to go back to main page of billing.");
System.out.println();
String No=kv.readLine();
System.out.println();
if(No.equalsIgnoreCase("b"))
{
ob4.bill();
break;
}
else
{
System.out.println("Enter Bill Issue Date");
System.out.println();
System.out.println("Enter b to go back to main page of billing.");
System.out.println();
String Dt=kv.readLine();
System.out.println();
if(Dt.equalsIgnoreCase("b"))
{
ob4.bill();
break;
}
else
{
System.out.println("Enter name of Village/City/Town");
System.out.println();
System.out.println("Enter b to go back to main page of billing.");
System.out.println();
String v=kv.readLine();
System.out.println();
if(v.equalsIgnoreCase("b"))
{
ob4.bill();
break;
}
else
{
System.out.println("Enter Sub-division Name");
System.out.println();
System.out.println("Enter b to go back to main page of billing.");
System.out.println();
String s=kv.readLine();
System.out.println();
if(s.equalsIgnoreCase("b"))
{
ob4.bill();
break;
}
else
{
System.out.println("Enter bill number");
System.out.println();
int bn=Integer.parseInt(kv.readLine());
System.out.println();
System.out.println("Enter b to go back to main page of billing.Press enter to proceed");
System.out.println();
String back22=kv.readLine();
System.out.println();
if(back22.equalsIgnoreCase("b"))
{
ob4.bill();
break;
}
System.out.println("Enter due date");
System.out.println();
System.out.println("Enter b to go back to main page of billing.");
System.out.println();
String d=kv.readLine();
System.out.println();
if(d.equalsIgnoreCase("b"))
{
ob4.bill();
break;
}
else
{
System.out.println("Enter type of usage");
System.out.println();
System.out.println("Enter Commercial or Domestic ");
System.out.println();
System.out.println("Enter b to go back to main page of billing.");
System.out.println();
String ch=kv.readLine();
System.out.println();
if(ch.equalsIgnoreCase("b"))
{
ob4.bill();
break;
}
else
{
System.out.println("Enter units consumed");
System.out.println();
u=Double.parseDouble(kv.readLine());
System.out.println();
System.out.println("Enter b to go back to main page of billing.Press Enter to proceed");
System.out.println();
String bb=kv.readLine();
System.out.println();
if(bb.equalsIgnoreCase("b"))
{
ob4.bill();
break;
}
l=50;
if(ch.equalsIgnoreCase("Domestic"))
{
r=4.56;
r1=6.02;
r2=6.44;
if(u<=100)
{
b=u*r;
}
else if((u>100)&&(u<=300))
{
b=(100*r)+((u-100)*r1);
}
else
{
b=(100*r)+(200*r1)+((u-300)*r2);
}
System.out.println("Welcome to Punjab State Power Corporation Limited");
System.out.println("-----------------------------------------------------------------");
System.out.print("Name"+ "\t"+ "\t"+ "Account Number"+ "\t"+ "Bill Issue Date"+ "\n" );
System.out.print(N+ "\t"+ No+ "\t"+ "\t"+ Dt+ "\n");
System.out.println();
System.out.print("Village/Town/City"+ "\t"+ "Sub-Division"+ "\t"+ "Bill Number"+ "\n");
System.out.print(v+ "\t"+ "\t"+ s+ "\t"+ bn+ "\n");
System.out.println();
System.out.print("Due Date"+ "\t"+ "Type of Usage"+ "\t"+ "Units consumed"+ "\n");
System.out.print(d+ "\t"+ ch+ "\t"+ "\t"+ u+ "\n");
System.out.println();
System.out.print("Rate:"+ "\n");
System.out.println();
System.out.print("For 1st 100 units:"+ "\t"+ r+ "\n");
System.out.println();
System.out.print("For next 200 units:"+ "\t"+ r1+ "\n");
System.out.println();
System.out.print("For next all units:"+ "\t"+ r2+ "\n");
System.out.println();
System.out.print("Amount payable by Due Date"+ "\t"+ "Surcharge"+ "\t"+ "Amount payable after due date"+ "\n");
System.out.print("Rs."+ b+ "\t"+ "\t"+ "\t"+ "Rs."+ l+ "\t"+ "\t"+ "Rs."+ (b+l)+ "\n");
System.out.println();
System.out.println("Thank you for using this service");
}
else if(ch.equalsIgnoreCase("Commercial"))
{
r=6.45;
r1=6.58;
if(u<=100)
{
b=u*r;
}
else
{
b=(100*r)+((u-100)*r1);
}
System.out.println("Welcome to Punjab State Power Corporation Limited");
System.out.println("-----------------------------------------------------------------");
System.out.print("Name"+ "\t"+ "\t"+ "Account Number"+ "\t"+ "Bill Issue Date"+ "\n" );
System.out.print(N+ "\t"+ No+ "\t"+ Dt+ "\n");
System.out.println();
System.out.print("Village/Town/City"+ "\t"+ "Sub-Division"+ "\t"+ "Bill Number"+ "\n");
System.out.print(v+ "\t"+ "\t"+ s+ "\t"+ bn+ "\n");
System.out.println();
System.out.print("Due Date"+ "\t"+ "Type of Usage"+ "\t"+ "Units consumed"+ "\n");
System.out.print(d+ "\t"+ ch+ "\t"+ "\t"+ u+ "\n");
System.out.println();
System.out.print("Rate:"+ "\n");
System.out.println();
System.out.print("For 1st 100 units:"+ "\t"+ r+ "\n");
System.out.println();
System.out.print("For next all units:"+ "\t"+ r1+ "\n");
System.out.println();
System.out.print("Amount payable by Due Date"+ "\t"+ "Surcharge"+ "\t"+ "Amount payable after due date"+ "\n");
System.out.print("Rs."+ b+ "\t"+ "\t"+ "Rs."+ l+ "\t"+ "Rs."+ (b+l)+ "\n");
System.out.println();
System.out.println("Thank you for using this service");
}
else
{
System.out.println("Wrong choice!");
}
}}}}}}}
System.out.println("If you want to check another bill, enter y , else enter any other word");
k=kv.readLine();
}
while(k.equalsIgnoreCase("y"));
}
void calc()throws IOException
{
String f;
exper3 ob1=new exper3();
do
{
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Welcome to calculators section");
System.out.println("------------------------------------------------------------------------");
System.out.println("Enter b to  go back to main page .Press Enter to proceed");
System.out.println();
String back26=kv.readLine();
if(back26.equalsIgnoreCase("b"))
break;
System.out.println("Enter the type of calculator");
System.out.println();
System.out.println("sim for  Simple");
System.out.println();
System.out.println("sci for Scientific");
System.out.println();
System.out.println("Enter b to  go back to main page of calculators .");
System.out.println();
String l=kv.readLine();
if(l.equalsIgnoreCase("b"))
{
ob1.calc();
break;
}
else if(l.equalsIgnoreCase("sim"))
{
System.out.println("Enter bin for binary calculations");
System.out.println();
System.out.println("Enter un for unary calculations");
System.out.println();
System.out.println("Enter b to  go back to main page of calculators .");
System.out.println();
String c=kv.readLine();
if(c.equalsIgnoreCase("b"))
{
ob1.calc();
break;
}
else if(c.equalsIgnoreCase("bin"))
{
System.out.println("+ for addition");
System.out.println();
System.out.println(" - for subtraction");
System.out.println();
System.out.println(" * for multiplication");
System.out.println();
System.out.println(" / for division");
System.out.println();
System.out.println(" p for power ");
System.out.println();
double S=0, b;
System.out.println("Enter 1st number");
System.out.println();
double a=Double.parseDouble(kv.readLine());
S=S+a;
do{
	System.out.println("Enter choice");
	System.out.println();
	System.out.println("Enter b to  go back to main page of calculators ");
	System.out.println();
	String ch=kv.readLine();
	System.out.println();
	if(ch.equals("b"))
		break;
	else
	{
	System.out.println("Enter  Number");
	System.out.println();
	System.out.println("Enter 0 to quit");
	b=Double.parseDouble(kv.readLine());
	System.out.println();
 	if(ch.equals("+"))
	{
		System.out.print(S+ " + ");
		S=S+b;
		System.out.println(b+ " = "+ S); 
		System.out.println();
	}
	else if(ch.equals("-"))
	{
		System.out.print(S+ " - ");
		S=S-b;
		System.out.println(b+ " = "+ S); 
		System.out.println();
	}
	else if(ch.equals("*"))
	{
		System.out.print(S+ " * ");
		S=S*b;
		System.out.println(b+ " = "+ S); 
		System.out.println();
	}
	else if(ch.equals("/"))
	{
		System.out.print(S+ " / ");
		S=S+a/b;
		System.out.println(b+ " = "+ S); 
		System.out.println();
	}
	else if(ch.equals("p"))
	{
		System.out.print(S+ " ^ ");
		S=Math.pow(S,b);
		System.out.println(b+ " = "+ S); 
		System.out.println();
	}
	else 
		System.out.println("Invalid choice");
	}
  }while(b!=0);
}
else if(c.equalsIgnoreCase("un"))
   {
	System.out.println(" s for square root");
	System.out.println();
	System.out.println(" f for factorial");
	System.out.println();
	System.out.println("Enter number");
	System.out.println();
	int d=Integer.parseInt(kv.readLine());
	System.out.println();
	System.out.println("Enter choice");
	System.out.println();
	System.out.println("Enter b to  go back to main page of calculators ");
	System.out.println();
	String ch1=kv.readLine();
	System.out.println();
	if(ch1.equalsIgnoreCase("b"))
	{
		ob1.calc();
		break;
	}
	else if(ch1.equalsIgnoreCase("s"))
	{
		System.out.println("Square root");
		System.out.println();
		System.out.println("Square root of "+ d+ " is "+ Math.sqrt(d));
	}
	else if(ch1.equalsIgnoreCase("f"))
	{
		System.out.println("Factorial");
		System.out.println();
		long f2=1;
		for(int i=1;i<=d;i++)
			f2=f2*i;
		System.out.println("Factorial of "+ d+ " is "+ f2);
	}
	else
		System.out.println("Invalid Choice");
    }
}

else if(l.equalsIgnoreCase("sci"))
	{
	double v,x;float f1;
	System.out.println("sin for sine");
	System.out.println();
	System.out.println("cos for cosine");
	System.out.println();
	System.out.println("tan for tangent");
	System.out.println();
	System.out.println("Enter angle");
	System.out.println();
	float a=Float.parseFloat(kv.readLine());
	System.out.println();
	System.out.println("Enter your choice");
	System.out.println();
	System.out.println("Enter b to  go back to main page of calculators .");
	System.out.println();
	String ci=kv.readLine();
	if(ci.equalsIgnoreCase("b"))
	{
	ob1.calc();
	break;
	}
	else if(ci.equalsIgnoreCase("sin"))
	{
	x=22*a/(7*180);
	v=Math.sin(x);
	f1=(float)v;
	System.out.println();
	System.out.println("Sine of "+ a+ " degrees = "+ f1 );
	}
	else if(ci.equalsIgnoreCase("cos"))
	{
	x=22*a/(7*180);
	v=Math.cos(x);
	f1=(float)v;
	System.out.println();
	System.out.println("Cosine of "+ a+ " degrees = "+ f1);
	}
	else if(ci.equalsIgnoreCase("tan"))
	{
	x=22*a/(7*180);
	v=Math.tan(x);
	f1=(float)v;
	System.out.println();
	System.out.println("Tangent of "+ a+ " degrees = "+ f1);
	}
	else
	System.out.println("Invalid choice!!!!");
	}
	else
	{
	System.out.println("Invalid choice");
	}
System.out.println("To continue in this section, press y otherwise any other key");
f=kv.readLine();
}while(f.equalsIgnoreCase("y"));
}
void cric()throws IOException
{
exper3 ob2=new exper3();
String cri;
do
{
{
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Welcome to Cricket St@ts. www.cricstats.com ");
System.out.println("-------------------------------------------------------------------------------");
System.out.println("Enter b to  go back to main page .Press Enter to proceed");
System.out.println();
String back32=kv.readLine();
if(back32.equalsIgnoreCase("b"))
break;
System.out.println();
System.out.println("Enter bat for batting records");
System.out.println();
System.out.println("Enter bowl for bowling records");
System.out.println();
System.out.println("Enter oth for other records");
System.out.println();
System.out.println("Enter b to  go back to main page of cricstats .");
System.out.println();
String cr1=kv.readLine();
System.out.println();
if(cr1.equalsIgnoreCase("b"))
{
ob2.cric();
break;
}
else if(cr1.equalsIgnoreCase("bat"))
{
System.out.println();
System.out.println("Welcome to  Batting records");
System.out.println("-------------------------------------------------------");
System.out.println("Enter test for test records");
System.out.println();
System.out.println("Enter ODI for ODI records ");
System.out.println();
System.out.println("Enter b to  go back to main page of cricstats .");
System.out.println();
String cr2=kv.readLine();
System.out.println();
if(cr2.equalsIgnoreCase("b"))
{
ob2.cric();
break;
}
else if(cr2.equalsIgnoreCase("test"))
{
System.out.println("Welcome to Test Batting records");
System.out.println("-------------------------------------------------------");
System.out.println("Enter mrc for most runs in career");
System.out.println();
System.out.println("Enter mri for most runs in an innings");
System.out.println();
System.out.println("Enter mrm for most runs in a match");
System.out.println();
System.out.println("Enter ave for highest average");
System.out.println();
System.out.println("Enter mry for most runs in a calendar year");
System.out.println();
System.out.println("Enter hun for most hundreds");
System.out.println();
System.out.println("Enter b to  go back to main page of cricstats .");
System.out.println();
String cr3=kv.readLine();
System.out.println();
if(cr3.equalsIgnoreCase("b"))
{
ob2.cric();
break;
}
else if(cr3.equalsIgnoreCase("mrc"))
{
System.out.println();
System.out.println("Name "+ "\t"+ "\t"+ "Matches"+ "\t"+ "Innings"+ "\t"+ "NO"+ "\t"+ "Runs"+ "\t"+ "HS"+ "\t"+ "Ave"+ "\t"+ "100s"+ "\t"+ "50s");
System.out.println();
System.out.println("SR Tendulkar   "+ "\t"+ "200"+ "\t"+ "329"+ "\t"+ "33"+ "\t"+ "15921"+ "\t"+ "248"+ "\t"+ "53.78"+ "\t"+ "51"+ "\t"+ "68");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr3.equalsIgnoreCase("mri"))
{
System.out.println();
System.out.println("Player"+ "\t"+ "Runs"+ "\t"+ "Mins"+ "\t"+  "Balls"+ "\t"+  "4s"+ "\t" + "6s"+ "\t"+ "Team"+ "\t"+ "\t"+ "Opp");
System.out.println();
System.out.println("BC Lara"+ "\t"+ "400*"+ "\t"+ "778"+ "\t"+ "582"+ "\t"+ "43"+ "\t"+ "4"+ "\t"+ "W .Indies"+ "\t"+ "England");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr3.equalsIgnoreCase("mrm"))
{
System.out.println();
System.out.println("Player"+ "\t"+ "\t"+ "1st inn."+  " 2nd"+ "\t"+ "Runs"+ "\t"+ "Team"+ "	Opp"+ "\t"+ "Ground"+ "\t"+ " Date");
System.out.println();
System.out.println("GA Gooch"+ "\t"+ "333"+ "\t"+  "  123"+ "\t" + "456"+ "\t"+ "England"+ "\t"+ " India"+ "\t"+ "Lord's"+ "\t"+ "26 Jul 1990");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr3.equalsIgnoreCase("ave"))
{
System.out.println();
System.out.println("Player"+ "\t"+ "\t"+  "Mat"+ "\t"+ "Inns"+ "\t"+ "NO"+ "\t"+ "Runs"+ "\t"+ "HS"+ "\t"+ "Ave"+ "\t"+ "100"+ "\t"+ "50");
System.out.println();
System.out.println("DG Bradman (Aus)"+"52"+ "\t"+  " 80"+ "\t"+ "10"+ "\t"+ "6996"+ "\t"+ "334"+ "\t"+ "99.94"+ "\t"+ "29"+ "\t"+ "13");		
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr3.equalsIgnoreCase("mry"))
{
System.out.println();
System.out.println("Player"+ "\t"+ "\t"+  "Year"+ "\t"+ "Mat"+ "\t"+ "Inns"+ "\t"+ " NO"+ "\t"+ "Runs"+   "\t"+ "Ave"+ "\t"+ "100"+ "\t"+ "50");
System.out.println();
System.out.println("M Yousuf (Pak)"+ "   2006"+ "\t"+ "11"+ "\t"+ "19"+ "\t"+ "1"+ "\t"+ "1788"+ "\t"+ "99.33"+ "\t"+ " 9"+ "\t"+  "3");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr3.equalsIgnoreCase("hun"))
{
System.out.println();
System.out.println("Player"+ "\t"+  "      Mat"+ "\t"+ "Inns"+ "\t"+ "NO"+ "\t"+ "Runs"+ "\t"+ "HS"+ "\t"+ "Ave"+ "\t"+ "100"+ "\t"+ "50");
System.out.println();
System.out.println("SR Tendulkar"+  "  200"+ "\t"+ "329"+ "\t"+ "33"+ "\t"+ "15921"+ "\t"+ "248*"+ "\t"+ "53.78"+ "\t"+ "51"+ "\t"+ "68");	
System.out.println();
System.out.println("Thanks for using this service");
}
else
System.out.println("Invalid Choice!");
}
else if(cr2.equalsIgnoreCase("odi"))
{
System.out.println("Welcome to ODI Batting records");
System.out.println("-------------------------------------------------------------------");
System.out.println("Enter mrc for most runs in career");
System.out.println();
System.out.println("Enter mri for most runs in an innings");
System.out.println();
System.out.println("Enter mrs for most runs in a bilateral series");
System.out.println();
System.out.println("Enter mry for most runs in a calendar year");
System.out.println();
System.out.println("Enter ave for Highest average");
System.out.println();
System.out.println("Enter hun for most hundreds");
System.out.println();
System.out.println("Enter b to  go back to main page of cricstats .");
System.out.println();
String cr4=kv.readLine();
System.out.println();
if(cr4.equalsIgnoreCase("b"))
{
ob2.cric();
break;
}
else if(cr4.equalsIgnoreCase("mrc"))
{
System.out.println();
System.out.println("Player"+ "\t"+ "\t"+  " Mat"+ "\t"+ "Inns"+ "\t"+ "NO"+ "\t"+ "Runs"+ "\t"+	"HS"+ "\t"+ "Ave"+ "\t"+ "100"+ "\t"+  "50");
System.out.println();
System.out.println("SR Tendulkar"+ "     463"+ "\t"+ "452"+ "\t"+ "41"+ "\t"+ "18426"+ "\t"+ "200*"+ "	44.83"+  "\t"+ "49"+ "\t"+ "96");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr4.equalsIgnoreCase("mri"))
{
System.out.println();
System.out.println("Player"+ "\t"+ "   Runs"+ "\t"+ "Balls"+ "\t"+ "4s"+ "\t"+ "6s"+ "\t"+ "SR"+ "\t"+ "Team"+ "\t"+ "Opp."+ "\t"+ "   Ground");
System.out.println();
System.out.println("V Sehwag"+ "   219"+ "\t"+ "149"+ "\t"+ "25"+ "\t"+ "7"+ "\t"+ "146.97"+ "\t"+ "India"+ "\t"+ "W. Indies"+ "  Indore");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr4.equalsIgnoreCase("mrs"))
{
System.out.println();
System.out.println("Player"+ "\t"+ "Mat"+ "\t"+ "Inns"+ "\t"+ "NO"+ "\t"+  "Runs"+ "\t"+ 	"HS"+ "\t"+ "Ave"+ "\t"+ "100"+ "\t"+ "50");
System.out.println();
System.out.println("RG Sharma"+ " 6"+ "\t"+ "6"+ "\t"+ "2"+ "\t"+ "491"+ "\t"+ "209"+ "\t"+ "122.75"+ "\t"+  "2"+ "\t"+ "1");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr4.equalsIgnoreCase("mry"))
{
System.out.println();
System.out.println("Player"+ "\t"+ "\t"+ "Year"+ "\t"+ "Mat"+ "\t"+ "Inns"+ "\t"+ "NO"+ "   Runs"+ "   HS"+ "\t"+ "Ave"+ "\t"+  "100"+ "\t"+ "50");
System.out.println();
System.out.println("SR Tendulkar"+ "    1998"+ "\t"+ "34"+ "\t"+ "33"+ "\t"+ "4"+ "    1894"+ "   143"+ "\t"+ "65.31"+ "\t"+ "9"+ "\t"+ "7");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr4.equalsIgnoreCase("ave"))
{
System.out.println();
System.out.println("Player"+ "\t"+ "\t"+ "Mat"+ "\t"+ "Inns"+ "\t"+ "NO"+ "\t"+ "Runs"+ "\t"+ "HS"+ "\t"+ "Ave"+ "\t"+ "100"+ "\t"+ "50");
System.out.println();
System.out.println("RN ten Doeschate"+ "33"+ "\t"+ "32"+ "\t"+ "9"+ "\t"+ 	"1541"+ "\t"+ "119"+ "\t"+ "67.00"+ "\t"+ "5"+ "\t"+ "9");	
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr4.equalsIgnoreCase("hun"))
{
System.out.println();
System.out.println("Player"+ "\t"+ "\t"+ "Mat"+ "\t"+ "Inns"+ "\t"+ "NO"+ "\t"+ "Runs"+ "\t"+ "HS"+ "\t"+ "Ave"+ "\t"+ "100"+ "\t"+ "50");
System.out.println();
System.out.println("SR Tendulkar"+ "    463"+ "\t"+ "452"+ "\t"+ "41"+ "\t"+ "18426"+ "\t"+ "200*"+ "\t"+ "44.83"+ "\t"+ "49"+ "\t"+ "96");
System.out.println();
System.out.println("Thanks for using this service");
}
else
System.out.println("Invalid Choice!!!!");
}
else
System.out.println("Invalid Choice!!");
}
else if(cr1.equalsIgnoreCase("bowl"))
{
System.out.println("Welcome to bowling records");
System.out.println("---------------------------------------------------------------------------");
System.out.println("Enter test for test bowling records");
System.out.println();
System.out.println("Enter odi for odi bowling records ");
System.out.println();
System.out.println("Enter b to  go back to main page of cricstats .");
String cr5=kv.readLine();
System.out.println();
if(cr5.equalsIgnoreCase("b"))
{
ob2.cric();
break;
}
else if(cr5.equalsIgnoreCase("test"))
{
System.out.println("Welcome to Test Bowling records ");
System.out.println("-------------------------------------------------------------------------------");
System.out.println("mwc for Most wickets in career");
System.out.println();
System.out.println("bbi for Best figures in an innings");
System.out.println();
System.out.println("bbm for Best figures in a match");
System.out.println();
System.out.println("mws for Most wickets in a series");
System.out.println();
System.out.println("mwy for Most wickets in a calendar year");
System.out.println();
System.out.println("Enter b to  go back to main page of cricstats .");
System.out.println();
String cr6=kv.readLine();
System.out.println();
if(cr6.equalsIgnoreCase("b"))
{
ob2.cric();
break;
}
else if(cr6.equalsIgnoreCase("mwc"))
{
System.out.println();
System.out.println("Player:          M Muralitharan");
System.out.println("Wickets:       800");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr6.equalsIgnoreCase("bbi"))
{
System.out.println();
System.out.println("Player:        Jim Laker");
System.out.println("Figures:       10-53");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr6.equalsIgnoreCase("bbm"))
{
System.out.println();
System.out.println("Player:      Jim Laker");
System.out.println("Figures:    19/90");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr6.equalsIgnoreCase("mws"))
{
System.out.println();
System.out.println("Player :     Sydney Barnes");
System.out.println("Mathches:      4");
System.out.println("Wickets :    49");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr6.equalsIgnoreCase("mwy"))
{
System.out.println();
System.out.println("Player:      Shane Warne");
System.out.println("Year :        2005");
System.out.println("Matches:  15");  
System.out.println("Wickets :   96");
System.out.println();
System.out.println("Thanks for using this service");
}
else
{
System.out.println();
System.out.println("No results found !!!! Invalid choice");
break;
}
}
else if(cr5.equalsIgnoreCase("odi"))
{
System.out.println("Welcome to ODI Bowling records");
System.out.println("--------------------------------------------------------------");
System.out.println("mwc for Most wickets in career");
System.out.println();
System.out.println("bbi for Best figures in an innings");
System.out.println();
System.out.println("mws for Most wickets in a bilateral series");
System.out.println();
System.out.println("mwy for Most wickets in a calendar year");
System.out.println();
System.out.println("ave for Best career average");
System.out.println();
System.out.println("Enter b to  go back to main page of cricstats .");
System.out.println();
String cr7=kv.readLine();
System.out.println();
if(cr7.equalsIgnoreCase("b"))
{
ob2.cric();
break;
}
else if(cr7.equalsIgnoreCase("mwc"))
{
System.out.println();
System.out.println("Player : M Muralitharan");
System.out.println("Wickets :    534");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr7.equalsIgnoreCase("bbi"))
{
System.out.println();
System.out.println("Player :     Chaminda Vaas");
System.out.println("Figures:    8/19");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr7.equalsIgnoreCase("mws"))
{
System.out.println();
System.out.println("Player :     Amit Mishra");
System.out.println("Matches:     5");
System.out.println("Wickets :    18");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr7.equalsIgnoreCase("mwy"))
{
System.out.println();
System.out.println("Player :    Saqqlain Mushtaq");
System.out.println("Year:         1997");
System.out.println("Matches:       36");
System.out.println("Wickets :       69");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr7.equalsIgnoreCase("ave"))
{
System.out.println();
System.out.println("Player :    Joel Garner");
System.out.println("Average:      18.84");
System.out.println();
System.out.println("Thanks for using this service");
}
else
{
System.out.println();
System.out.println("Record Not found !!!!!!  Invalid Choice  !!! ");
break;
}
}
else
{
System.out.println();
System.out.println("Invalid choice!!!");
}
}
else if(cr1.equalsIgnoreCase("oth"))//Miscellaneous records
{
System.out.println("Welcome to miscellaneous records Section");
System.out.println("------------------------------------------------------------------------------");
System.out.println("Enter htt for Highest Total in Tests");
System.out.println();
System.out.println("Enter hto for Highest Total in ODIs");
System.out.println();
System.out.println("Enter ltt for Lowest Total in Tests");
System.out.println();
System.out.println("Enter lto for Lowest total in ODIs");
System.out.println();
System.out.println("Enter b to  go back to main page of cricstats .");
System.out.println();
String cr8=kv.readLine();
System.out.println();
if(cr8.equalsIgnoreCase("b"))
{
ob2.cric();
break;
}
else if(cr8.equalsIgnoreCase("htt"))
{
System.out.println();
System.out.println("Team :    Sri Lanka");
System.out.println("Total :      952/6(declared)");
System.out.println("Opp.  :      India");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr8.equalsIgnoreCase("hto"))
{
System.out.println();
System.out.println("Team :      Sri Lanka");
System.out.println("Total :       443/9");
System.out.println("Against :    Netherlands");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr8.equalsIgnoreCase("ltt"))
{
System.out.println();
System.out.println("Team :     New Zealand");
System.out.println("Total:       26");
System.out.println("Opp. :       England");
System.out.println();
System.out.println("Thanks for using this service");
}
else if(cr8.equalsIgnoreCase("lto"))
{
System.out.println();
System.out.println("Team : Zimbabwe");
System.out.println("Total :    35");
System.out.println("Opp. :    Sri Lanka");
System.out.println();
System.out.println("Thanks for using this service");
}
else
{
System.out.println();
System.out.println("Sorry!!! Record Not found");
break;
}
}
else
{
System.out.println();
System.out.println("Invalid Choice!!!");
}
System.out.println("To remain in this section, press y");
cri=kv.readLine();
} //while(cri.equalsIgnoreCase("y"));
} 
while(cri.equalsIgnoreCase("y"));
} 
void get()throws IOException
{
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("You requested for the password");
System.out.println();
System.out.println("This browser has been copyrighted and cannot be reproduced without buying the rights. If you do so, you are liable for legal action.");
System.out.println();
System.out.println("If you agree with the terms and conditions, press y , else any other key");
System.out.println();
String gp=kv.readLine();
if(gp.equalsIgnoreCase("y"))
{
System.out.println();
System.out.println(" You have agreed to the Terms and conditions. The password is : kvasudeva ");
System.out.println();
}
else
{
System.out.println();
System.out.println("Sorry, you haven't agreed to the terms&conditions. So, the password can't be provided");
System.out.println();
}
}
public  void cc()throws IOException
{
exper3 obj=new exper3();
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1 for LandLine services");
System.out.println();
System.out.println("Enter 2 for Mobile Services");
System.out.println();
System.out.println("Enter 3 for Broadband services");
System.out.println();
System.out.println("Enter e  to exit");
System.out.println();
cu=kv.readLine();
if(cu.equalsIgnoreCase("e"))
{
System.out.println("Thank You for using this service");
}
else if(cu.equals("1"))
obj.econ();
else if(cu.equals("2"))
obj.econ1();
else if(cu.equals("3"))
obj.econ2();
else 
{
System.out.println("Sorry !!! This input is invalid !! ");
System.out.println();
obj.cc();
}}
void econ()throws IOException
{
exper3 obj1=new exper3();
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your area STD Code");
System.out.println();
co=kv.readLine();
System.out.println();
System.out.println("Your entered STD code is : "+ co);
System.out.println();
System.out.println("Press 1 to confirm");
System.out.println();
System.out.println("Press 2 to re-enter");
System.out.println();
System.out.println("Press 3 to go back to main menu");
System.out.println();
String cu3=kv.readLine();
if(cu3.equals("1"))
{
obj1.num();
System.out.println();
}
else if(cu3.equals("2"))
{
obj1.econ();
System.out.println();
}
else if(cu3.equals("3"))
{
obj1.cc();
System.out.println();
}
else
{
System.out.println("Sorry !! This input is invalid");
System.out.println();
obj1.econ();
}
}
void econ1()throws IOException
{
String nc="";
exper3 obj2=new exper3();
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your mobile number");
System.out.println("Press 2 to go back to the main menu");
System.out.println();
co=kv.readLine();
System.out.println();
if(co.equals("2"))
{
System.out.println();
obj2.cc();
}
else
{
int x=co.length();
nc=co.substring(0,2);
int nc1=Integer.valueOf(nc);
if((nc1!=94)&&(nc1!=76)||(x!=10))
{
System.out.println("Sorry!! This number is invalid ");
System.out.println();
obj2.econ1();
}
else
{
System.out.println(" Your entered mobile number is :       "+ co);
System.out.println();
System.out.println("Press 1 to confirm ");
System.out.println("Press 2 to re-enter");
System.out.println("Press 3 to go back to the main menu");
System.out.println();
String cu3=kv.readLine();
if(cu3.equals("1"))
obj2.cell();
else if(cu3.equals("2"))
obj2.econ1();
else if(cu3.equals("3"))
obj2.cc();
else
{
System.out.println("This input is invalid . ");
obj2.econ1(); 
}
}}}
void econ2()throws IOException
{
exper3 obj3=new exper3();
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your area STD Code");
System.out.println();
co=kv.readLine();
System.out.println();
System.out.println("Your entered STD code is :     "+ co);
System.out.println();
System.out.println("Press 1 to confirm");
System.out.println("Press 2 to re-enter");
System.out.println("Press 3 to go back to main menu");
System.out.println();
String cu3=kv.readLine();
if(cu3.equals("1"))
obj3.num1();
else if(cu3.equals("2"))
obj3.econ2();
else if(cu3.equals("3"))
obj3.cc();
else
{
System.out.println("Sorry !! This input is invalid");
obj3.econ2();
}
}
void num()throws IOException
{
exper3 obj4=new exper3();
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter number");
System.out.println();
String phn=kv.readLine();
int x=phn.length();
if(x!=6)
{
System.out.println();
System.out.println("Invalid Number ( A landline number consists of 6 digits) ");
obj4.num();
}
else
{
System.out.println();
System.out.println("Your entered phone number is :      "+ phn);
System.out.println();
System.out.println("Press 1 to confirm");
System.out.println("Press 2 to re-enter");
System.out.println("Press 3 to go back to the main menu");
System.out.println();
String cu4=kv.readLine();
System.out.println();
if(cu4.equals("1"))
obj4.land();
else if(cu4.equals("2"))
obj4.num();
else if(cu4.equals("3"))
obj4.cc();
else
{
System.out.println("Sorry!! this input is invalid ");
obj4.num();
}
}}
void num1()throws IOException
{
exper3 obj12=new exper3();
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter number");
System.out.println();
String phn=kv.readLine();
int x=phn.length();
if(x!=6)
{
System.out.println();
System.out.println("Invalid Number ( A landline number consists of 6 digits) ");
obj12.num1();
}
else
{
System.out.println();
System.out.println("Your entered phone number is :            "+ phn);
System.out.println();
System.out.println("Press 1 to confirm");
System.out.println("Press 2 to re-enter");
System.out.println("Press 3 to go back to the main menu");
System.out.println();
String cu4=kv.readLine();
System.out.println();
if(cu4.equals("1"))
obj12.bband();
else if(cu4.equals("2"))
obj12.num1();
else if(cu4.equals("3"))
obj12.cc();
else
{
System.out.println();
System.out.println("Sorry!! this input is invalid ");
obj12.num1();
}
}}
void land()throws IOException
{
exper3 obj5=new exper3();
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
System.out.println("Press 1 for complaint booking");
System.out.println("Press 2 to know about our special plans and offers");
System.out.println("Press 3 to go back to the main menu");
System.out.println();
String cu5=kv.readLine();
if(cu5.equals("1"))
{
int ran=(int)((Math.random()*(99999999-10000000))+10000000);
System.out.println("Your complaint has been registered . Your complaint ID is :         "+ ran);
System.out.println();
System.out.println("Press 1 to go back to the main menu.");
System.out.println("Press any other key to exit");
System.out.println();
String ex=kv.readLine();
if(ex.equals("1"))
obj5.cc();
else 
{
System.out.println();
System.out.println("Thanks for using this service");
}
}
else if(cu5.equals("2"))
{
System.out.println();
obj5.special();
}
else if(cu5.equals("3"))
obj5.cc();
else
{
System.out.println();
System.out.println("Sorry!!! Invalid input");
System.out.println();
obj5.land();
}}
void special()throws IOException
{
exper3 obj6=new exper3();
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Welcome to BSNL Landline Special offers ");
System.out.println();
System.out.println("Press 1 for Unlimited talktime within State ( landLine to LandLine)  :            Rs. 100 per month ");
System.out.println();
System.out.println("Press 2 for 400 Free calls ( Call rates for next calls : Rs 1.10) :                   Rs. 425");
System.out.println();
System.out.println("Press 3 for 1500 Free calls ( Call rates for next calls : Rs. 0.90) :                Rs. 1450");
System.out.println();
System.out.println("Press 4 to go back to the main menu");
System.out.println();
String cu6=kv.readLine();
System.out.println();
if(cu6.equals("1"))
{
System.out.println("You have selected the first offer");
System.out.println();
obj6.conf();
}
else if(cu6.equals("2"))
{
System.out.println("You have selected the second offer");
System.out.println();
obj6.conf();
}
else if(cu6.equals("3"))
{
System.out.println("You have selected the third offer");
System.out.println();
obj6.conf();
}
else 
{
System.out.println("Sorry !! Wrong choice");
System.out.println();
obj6.special();
}
}
void cell()throws IOException
{
exper3 obj7=new exper3();
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Press 1 for complaint booking");
System.out.println();
System.out.println("Press 2 to know about our special plans and offers");
System.out.println();
System.out.println("Press 3 to go back to the main menu");
System.out.println();
String cu5=kv.readLine();
System.out.println();
if(cu5.equals("1"))
{
int ran=(int)((Math.random()*(99999999-10000000))+10000000);
System.out.println("Your complaint has been registered . Your complaint ID is :         "+ ran);
System.out.println();
System.out.println("Press 1 to go back to the main menu.");
System.out.println();
System.out.println("Press any other key to exit");
System.out.println();
String ex=kv.readLine();
System.out.println();
if(ex.equals("1"))
obj7.cc();
else 
{
System.out.println("Thanks for using this service");
}
}
else if(cu5.equals("2"))
obj7.coff();
else if(cu5.equals("3"))
obj7.cc();
else
{
System.out.println("This input is invalid !!");
System.out.println();
obj7.cell();
}
}
void coff()throws IOException
{
exper3 obj8=new exper3();
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Press 1 for Talktime offers");
System.out.println();
System.out.println("Press 2 for Net packs");
System.out.println();
System.out.println("Press 3 to go back to the main menu");
System.out.println();
String cu5=kv.readLine();
System.out.println();
if(cu5.equals("1"))
obj8.tt();
else if(cu5.equals("2"))
obj8.netpack();
else if(cu5.equals("3"))
obj8.cc();
else
{
System.out.println("This input is invalid !!");
System.out.println();
obj8.coff();
}
}
void tt()throws IOException
{
exper3 obj9=new exper3();
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Welcome to BSNL Talktime and Messaging offers ");
System.out.println("---------------------------------------------------------------------------");
System.out.println(" Press 1 for getting unlimited talktime (BSNL Mobile to BSNL Mobile ) :  Rs. 100 per month ");
System.out.println();
System.out.println("Press 2 for getting unlimited messaging :  Rs. 50 per month ");
System.out.println();
System.out.println("Press 3 for getting 200 mins. free (mobile to mobile) : Rs.110 per month ");
System.out.println();
System.out.println("Press 4 for availing free messages (from 12 midnight to 6 am ) : Free ");
System.out.println();
System.out.println("Press 5 to go back to the main menu ");
System.out.println();
String cu6=kv.readLine();
System.out.println();
if(cu6.equals("5"))
obj9.cc();
else
{
if(cu6.equals("1"))
{
System.out.println("You have selected the first offer");
System.out.println();
obj9.conf(); 
}
else if(cu6.equals("2"))
{
System.out.println("You have selected the second offer");
System.out.println();
obj9.conf();
}
else if(cu6.equals("3"))
{
System.out.println("You have selected the third offer ");
System.out.println();
obj9.conf();
}
else if(cu6.equals("4"))
{
System.out.println("You have selected the fourth offer");
System.out.println();
obj9.conf();
}
else
{ 
System.out.println("Sorry!!! This input is invalid ");
System.out.println();
obj9.tt();
}}
}
void conf()throws IOException
{
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
exper3 obj10=new exper3();
System.out.println("Press 1 to confirm.");
System.out.println();
System.out.println("Press 2 to re-select.");
System.out.println();
System.out.println("Press 3 to go back to the main page");
System.out.println();
String cch=kv.readLine();
System.out.println();
if(cch.equals("1"))
{
System.out.println("Thanks for choosing this offer");
System.out.println();
System.out.println("This offer will start from 8 p.m. tonight");
System.out.println();
System.out.println("Thanks for using this service");
System.out.println();
System.out.println("To use this service again ,press y else any other key");
String fc=kv.readLine();
if(fc.equalsIgnoreCase("y"))
obj10.cc();
else
{
System.out.println("Thanks for using this service. Hope you liked it");
System.out.println("Please send your feedback about our service at : komalvasudeva55@gmail.com ");
}}
else if(cch.equals("2"))
obj10.tt();
else if(cch.equals("3"))
obj10.cc();
else
{
System.out.println("Sorry !!! This input is invalid");
System.out.println();
obj10.conf();
}
}
void netpack()throws IOException
{
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
exper3 obj11=new exper3();
System.out.println("Welcome to BSNL Net packages ");
System.out.println("-----------------------------------------------------------------");
System.out.println("Press 1 for 1 GB Data for 30 days :   Rs. 50 ");
System.out.println();
System.out.println("Press 2 for 500 MB Data for 21 days :    Rs. 35");
System.out.println();
System.out.println("Press 3 for 100 MB data for 6 days   : Rs. 15");
System.out.println();
System.out.println("Press 4 to go back to the main menu ");
System.out.println();
String cu6=kv.readLine();
System.out.println();
if(cu6.equals("4"))
obj11.cc();
else
{
 if(cu6.equals("1"))
{
System.out.println("You have selected the first offer");
System.out.println();
obj11.conf();
}
else if(cu6.equals("2"))
{
System.out.println("You have selected the second offer");
System.out.println();
obj11.conf();
}
else if(cu6.equals("3"))
{
System.out.println("You have selected the third offer");
System.out.println();
obj11.conf();
}
else
{
System.out.println("This input is invalid");
System.out.println();
obj11.netpack();
}
}
}
void bband()throws IOException
{
exper3 obj13=new exper3();
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Press 1 for complaint booking");
System.out.println();
System.out.println("Press 2 to know about our special plans and offers");
System.out.println();
System.out.println("Press 3 to go back to the main menu");
System.out.println();
String cu5=kv.readLine();
System.out.println();
if(cu5.equals("1"))
{
int ran=(int)((Math.random()*(99999999-10000000))+10000000);
System.out.println("Your complaint has been registered . Your complaint ID is :         "+ ran);
System.out.println();
System.out.println("Press 1 to go back to the main menu.");
System.out.println("Press any other key to exit");
System.out.println();
String ex=kv.readLine();
System.out.println();
if(ex.equals("1"))
obj13.cc();
else 
{
System.out.println("Thanks for using this service");
}
}
else if(cu5.equals("2"))
obj13.especial();
else if(cu5.equals("3"))
obj13.cc();
else
{
System.out.println("Sorry!!! This input is invalid");
System.out.println();
obj13.bband();
}
}
void especial()throws IOException
{
exper3 obj14=new exper3();
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Welcome to BSNL Broadband Special offers");
System.out.println("-------------------------------------------------------------------------------");
System.out.println("Press 1 for Unlimited Net pack :    Rs. 500 per month ");
System.out.println();
System.out.println("Press 2 for Free 4 GB data :          Rs. 400 per month");
System.out.println();
System.out.println("Press 3 for Free 2 GB data :          Rs. 250 per month");
System.out.println();
System.out.println("Press 4 for Free 1 GB data :          Rs. 150 per month");
System.out.println();
System.out.println("Press 5 to go back to the main menu");
System.out.println();
String cu6=kv.readLine();
System.out.println();
if(cu6.equals("5"))
obj14.cc();
else
{
if(cu6.equals("1"))
{
System.out.println("You have chosen the first offer");
System.out.println();
obj14.conf();
}
else if(cu6.equals("2"))
{
System.out.println("You have chosen the second offer");
System.out.println();
obj14.conf();
}
else if(cu6.equals("3"))
{
System.out.println("You have chosen the third offer");
System.out.println();
obj14.conf();
}
else if(cu6.equals("4"))
{
System.out.println("You have chosen the fourth offer");
System.out.println();
obj14.conf();
}
else
{
System.out.println("Sorry!!! This input is invalid ");
System.out.println();
obj14.especial();
}
}
}
public  void care()throws IOException
{
exper3 obnew=new exper3();
System.out.println("Welcome to BSNL Customer case");
System.out.println("--------------------------------------------------------------------------------------------");
obnew.cc();
}
public static void main(String args[])throws IOException
{
exper3 ob=new exper3();
String m;
BufferedReader kv=new BufferedReader(new InputStreamReader(System.in));
System.out.println("If you don't know the password and want to get it, press p");
System.out.println();
String gp=kv.readLine();
System.out.println();
if(gp.equalsIgnoreCase("p"))
ob.get();
System.out.println("Enter password");
System.out.println();
String pa=kv.readLine();
System.out.println();
do
{
int pas=pa.compareTo("kvasudeva");
if(pas==0)
{
System.out.println("Welcome to the browser : KV Browser");
System.out.println("----------------------------------------------------------");
System.out.println("Enter your choice");
System.out.println("Enter kbc for playing KBC(www.kbcindia.in)");
System.out.println();
System.out.println("Enter ebill to check your electricity bill(www.pspcl.in)");
System.out.println();
System.out.println("Enter calc for using calculator(www.onl9calcs.com)");
System.out.println();
System.out.println("Enter cric for cricket stats(www.cricstats.com)");
System.out.println();
System.out.println("Enter care for BSNL Customer care   (www.bsnl.co.in/customer care) ");
System.out.println();
String c=kv.readLine();
if(c.equalsIgnoreCase("kbc"))
ob.kbc();
else if(c.equalsIgnoreCase("ebill"))
ob.bill();
else if(c.equalsIgnoreCase("calc"))
ob.calc();
else if(c.equalsIgnoreCase("cric"))
ob.cric();
else if(c.equalsIgnoreCase("care"))
ob.care();
else
System.out.println("Wrong choice!");
System.out.println();
System.out.println("Press n to use this browser  again . Press any other key to quit");
m=kv.readLine();
}
else
{
System.out.println("Sorry!Wrong password!");
System.out.println();
System.out.println("To get the password again , press p");
System.out.println();
String gp1=kv.readLine();
if(gp1.equalsIgnoreCase("p"))
ob.get();
System.out.println("Re-enter password");
System.out.println();
pa=kv.readLine();
System.out.println();
System.out.println("Press n to confirm using this browser,any other key to quit");
System.out.println();
m=kv.readLine();
}
}
while(m.equalsIgnoreCase("n"));
System.out.println("Thanks for using this service");
System.out.println("About the site-owner and designer:");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The site-owner , KOMAL VASUDEVA, is a student of Std.10th Blue in St. Paul's Convent School ,Dasuya.");
System.out.println("He is the Sr. Head Boy of his school."); 
System.out.println();
System.out.println("He loves programming and it is his passion.");
System.out.println();
System.out.println("He loves writing, too.");  
System.out.println("");
System.out.println("He can be contacted at : ");
System.out.println("--------------------------------------------------------------------------");
System.out.println("E-mail:    komalvasudeva55@gmail.com");
System.out.println("");
System.out.println("Facebook:       komal.vasudeva07@facebook.com");
System.out.println("");
System.out.println("Twitter :         @KomalVasudeva  ");
System.out.println();
System.out.println("Mobile:   9855074844");
}
}
