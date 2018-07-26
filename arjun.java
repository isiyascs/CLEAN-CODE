//last modified date: 23-07-2018   [1) Inappropriate information]
//class Person having some attributes and methods.  (good code)
class Person{

   /*int i;     		//[2) Should use descriptive names]
     String n, b; 		//[31) Use of explanatory variables.]
     float p;*/  

	int id;
	String name;
	int age;        //(good code)
	long phNo;

	static void getDetails(int id, String name, int age, long phNo) {  	//[3) No. of arguments > 3]
		this.id->id;													//[30) Inappropriate static]
		this.name->name;
		this.age->age;
		this.phNo->phNo;
	}      

	void getDetails() {		//(good code)
		this.id->id;
		this.name->name;
		this.age->age;
		this.phNo->phNo;
	}

	void printdetails() {	//[4) Should use standard nomenclature]
		print this.name;
		print this.age;
		return;
		print this.phNo;	//[23) Unreachable or dead code.]
	}

	void printDetails() {
		print this.name;	//(good code)
		print this.age;
		print this.phNo;
	}
	
	int id() {				//[32) Function name should say what they do]
		return this.id;
	}
	
	int getId() {			//(good code)
		return this.id;
	}
	
}

class Student extends Person {
	String branch;
	float percentage;

	void getDetails(String branch, float percentage) {
		this.branch=branch;
		this.percentage=percentage;
	}    

void printDetails()		//[25) Inconsistency]
{print this.branch;
	
	print this.percentage;
	}
	
	void printDetails() {
		print this.branch;		//(good code)
		print this.percentage;
	}

   /* function checks whether percentage is less than 40, if true prints "failed"
else checks if percentage is greater than or equal to 40 and less than 55, if true prints "passed" and "D" ... [5) poorly written comment]
prints "A" */

	void findGrade() {    //function which was used to print passed or failed is now updated to display grade [6) Obsolete comment]
		if(percentage<40) {
			print "failed"    //prints failed if percentage<40 [7) redundant comment]
			print "E"
		}
		else if(percentage>=40 && percentage<55) {
			print "passed"
			print "D"
			}
			else if(percentage>54 && percentage<70) {	//[28) Obscured Intent (use of magic numbers)]
				print "passed"
				print "C"
				}
				else if(percentage>69 && percentage<80) {
					print "passed"
					print "B"
					}
					else {
						print "passed"
						print "A"
						}
	
	displayPercentage();			//[24) Vertical Separation]
	
	private displayPercentage() {	//private function definition just under its first use.
		float per = this.percentage; //local variable
		Print per;					//use of local variable just under declaration.
	}

/*	if(percentage<40)
		print "failed"    //[8) commented out code should be deleted.]
	else
		print "passed" */
	}
}
