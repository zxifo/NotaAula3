package AulasP2.NotaAula3.Questao2;


public class Animal {
    protected String nome;
    protected String raca;

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void caminha(){
        System.out.println(nome + " está caminhando.");
    }
}
