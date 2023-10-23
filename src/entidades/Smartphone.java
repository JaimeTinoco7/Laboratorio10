/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jaime
 */
public class Smartphone implements Camara,NavegadorDeInternet,ReproductorDeMusica {
    
    private String marca = "Samsung";
    
    private String modelo = "GalaxyS10";
    
  @Override  
  public void tomarFoto(){
     System.out.println("Tomando una foto");
  }
  @Override  
  public void grabarVideo(){
     System.out.println("Grabando un video");
  }
  @Override  
  public void buscar(){
      System.out.println("Buscando en internet");
  }
  @Override  
   public void actualizar(){
      System.out.println("Actulizando su busqueda");
  }
  @Override  
  public void reproducir(){
       System.out.println("Reproduciendo la cancion");
  }
  @Override  
   public void detener(){
       System.out.println("La cancion esta en pausa");
  }
  

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = "Samsung";
    }

    public String getModelo() {
        return modelo= "GalaxyS10";
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
     public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.tomarFoto();
        smartphone.grabarVideo();
        smartphone.buscar();
        smartphone.actualizar();
        smartphone.reproducir();
        smartphone.detener();
    }
}
