public class Account {
	private String name; //variavel de instancia - ou atributo
	
    // contrutor
    public Account (String name){
        this.name = name;
    }


	// método para definir o nome
	public void setName (String newName) {
		name = newName;
	}
	//método para obter o valor do nome
	public String getName() {
		return name;
	}
}