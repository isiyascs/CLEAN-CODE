class Person {
	/*
[12] Use standard nomenclature if available
	*/
//Bad
	int identity;
	String text1;

//Good
	int id;
	String name;
/*
[13] Unambiguous names 
*/
//Bad
	void Details1(){
		print(studentmark);
	}
	void Details2(){
		print(studentName);
	}

//Good
	void markDetails(){
		print(studentmark);
	}
	void personalDetails(){
		print(studentName);
	}
/*
[14]Avoid Encodings
*/
//Bad
	void std_isPassed(){
		printf("YES");
	}

//Good
	namespace  std;
	void isPassed() {
		printf("YES");
	}
}

class Student extends Person {
	String branch;
	float mark;
/*
[15] Obvious behaviour is unimplemented
*/
//Bad
	void printMark(){
 		print(name);  //printing incorrect datas
	}
//Good
	void printMark(){
 		print(mark);  
	}
	copyMark = mark; //[16] Duplication
/*
[17]Base Classes Depending on Their Derivatives
*/
	void displayInternalMarks(){
  	int internalMarks;
  	void displayInternals(){
   		int internals;
  	}
	}

/*
[18] Too much information
*/

//Bad
	void newMarks(){
		int id,socialMarks,EnglishMarks,computerMArks,internalMarks;
		String firtsName,lastName,middleName;
	}
//Good
	void newMarks() {
		int id,totalMarks;
		String name;
	}
}



