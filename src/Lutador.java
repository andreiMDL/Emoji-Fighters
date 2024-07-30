public class Lutador {


    //<editor-fold desc="Atributos">
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //</editor-fold>

    //<editor-fold desc="Método Construtor">
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    //</editor-fold>

    //<editor-fold desc="Setters and Getters">
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

   public float getPeso(){
        return this.peso;
   }

   public void setPeso(float peso){
        this.peso = peso;
        setCategoria();
   }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setCategoria(){
        if(this.getPeso() < 52.2){
            this.categoria = "Inválido";
        }
        else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }
        else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }
        else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
   }

   public void setIdade(int idade){
        this.idade = idade;
   }

   public int getIdade(){
        return idade;
   }

   public void setAltura(float altura){
        this.altura = altura;
   }

   public float getAltura(){
        return altura;
   }

   public String getCategoria(){
        return categoria;
   }

   public void setCategoria(String categoria){
        this.categoria = categoria;
   }
    //</editor-fold>

    //<editor-fold desc="Funções">
    public void apresentar(){
        System.out.println("Lutador: "+ getNome());
        System.out.println("Nacionalidade: "+ getNacionalidade());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Altura: "+ getAltura());
        System.out.println("Peso: "+ getPeso());
        System.out.println("Vitórias: "+ getVitorias());
        System.out.println("Derrotas: "+ getDerrotas());
        System.out.println("Empates: "+ getEmpates());
    }

    public void status(){
        System.out.println(getNome());
        System.out.println("Classificado como: "+ getCategoria());
        System.out.println(getVitorias() + "Vitórias");
        System.out.println(getDerrotas() + "Derrotas");
        System.out.println(getEmpates() + "Empates");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLutar(){
        this.setEmpates(this.getEmpates() + 1);
    }






    //</editor-fold>
}
