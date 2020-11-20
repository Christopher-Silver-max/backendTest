public class Employee{
	private string name;
	private string id;
	private Manager manager;
	Employee (string name, string id, Manager manager){ // changing file 
			name = name;
			id = id;
			manager = aCompany;
		}	
	public String toString ()
	{
	return String.format(�%s, %s, %s, %s, %s, %s�,
	�Employee name�, name,
	�Employee Id�, id,
	�Manager name�, manager.getName());
	}
}