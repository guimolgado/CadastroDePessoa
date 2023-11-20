package projetoPessoas.src.model;

public class App {



    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Vila Sesamo", "4623", "Ipiranga", "Sao sebastiao", "Ap35");
        Endereco endereco2 = new Endereco("Éden", "666", "Céu angélical", "Utopia", "O bairro mais alto");
        Endereco endereco3 = new Endereco("Senna", "1", "Ayrton", "Formula1", "Ferrari");

        Pessoa pessoa1 = new Pessoa("Gui", "18434082753", "24993248237", "Macho", endereco1);
        Pessoa pessoa2 = new Pessoa("Carluxo", "513435434", "0245462424", "Macho", endereco2);
        Pessoa pessoa3 = new Pessoa("Petruquio", "013481434", "0244862424", "Macho", endereco3);
        



        pessoa1.seApresentar(null);
        pessoa2.seApresentar(null);
        pessoa3.seApresentar(null);
        
    }
}

