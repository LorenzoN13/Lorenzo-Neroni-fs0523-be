package it_epicode.week1.day3;
public class Automobile {

   private int cilindrata;
   private String marca;
   private String nome;

   private String targa;

   private int porte;

   private TipoAutomobile categoria;

   public Automobile(String marca, String nome, String targa, int cilindrata, int porte){//COSTRUTTORE
        this.marca = marca;
        this.nome = nome;
        this.targa = targa;
        this.cilindrata = cilindrata;
        this.porte = porte;
   }

   public Automobile(int porte, String marca, String nome, String targa, int cilindrata){//COSTRUTTORE
       this.marca = marca;
       this.nome = nome;
       this.targa = targa;
       this.cilindrata = cilindrata;
   }

   public Automobile(){//COSTRUTTORE NON TIPIZZATO

   }

    public Automobile(int porte){//COSTRUTTORE

    }

   public void accelera(){
       System.out.println("Sto accellerando");
   }
    public void decelera(){
        System.out.println("Sto rallentando");
    }

    public void stampaCaratteristiche (){
        System.out.println("Cilindrata " + cilindrata + ", marca: " + marca + ", nome: " + nome + ", porte: " + porte + ", targa: " + targa + ", categoria: " + categoria);
    }

    public String getMarca(){
       return marca;
    }

    public String getTarga(){
       return targa;
    }

    public String getNome(){
       return nome;
    }

    public int getCilindrata(){
       return cilindrata;
    }

   public int getPorte(){
       return porte;
   }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }


}
