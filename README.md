XML based configuration:
We can map the inheritance hierarchy classes with the table of the database. 
There are three inheritance mapping strategies defined in the hibernate:
	1- Table Per class Hierarchy
	2- Table Per Concrete class
	3- Table Per Subclass

|*************************************************************************************|
|*************************************************************************************|
|*  To understand these concept we will take these tables :						 	 *|
|* 	EMPLOYEE : (ID, NAME)															 *|
|*	REGULAR_EMP : (SALARY, BONUS)													 *|
|*	CONTRACT_EMP : (PAY_PER_HOUR, CONTRACT_PERIOD)									 *|
|*																					 *|
|*************************************************************************************|
|*************************************************************************************|

1- Table Per class Hierarchy :
In table per hierarchy mapping, single table is required to map the whole hierarchy, 
an extra column (known as discriminator column) is added to identify the class. 
But nullable values are stored in the table .
NOTE- for understanding this look the below file employee.hbm01.xml.
	
2- Table Per Concrete class :
In case of Table Per Concrete class, there will be three tables in the database having no relations to each other. 
There are two ways to map the table with table per concrete class strategy.
	1- By union-subclass element
	2- By self creating the table for each class
NOTE- for understanding this look the below file employee.hbm02.xml
	
3- Table Per Subclass :
In case of Table Per Subclass, subclass mapped tables are related to parent class 
mapped table by primary key and foreign key relationship.
The <joined-subclass> element of class is used to map the child class with parent 
using the primary key and foreign key relation.

NOTE- In this example, we are going to use hb2ddl.auto property to generate the table automatically. 
So we don't need to be worried about creating tables in the database.	

NOTE- for understanding this look the file employee.hbm03.xml



These questions : 
1- try to develop and application of entry for employee , regular employee, contract employee and there department
	in anothor table department ? 
