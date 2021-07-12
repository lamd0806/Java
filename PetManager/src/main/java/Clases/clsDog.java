/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author andreamartinez
 */
public class clsDog extends clsPet{
    
    private String breed;
    private boolean pedigree;

    public clsDog(String breed, boolean pedigree, String code, String name, int born_year, String color, String health_status) {
        super(code, name, born_year, color, health_status);
        this.breed = breed;
        this.pedigree = pedigree;
    }

    //Sobrecarga de metodos
    
    public void WalkAround(){
        System.out.println("El perro " +super.getName()+ " se pasea");
    }

     public void WalkAround(int km){
        System.out.println("El perro " +super.getName()+ " esta caminando " + km + " km");
    }
     
      public void WalkAround(boolean dogLeash){
        String hasLeash=dogLeash? "con correa":"sin correa";
        System.out.println("El perro " +super.getName()+ " esta caminando " + hasLeash);
    }
    
    @Override
    public void Sound(){
        System.out.println("El perro " +super.getName()+ "hace guauuu");
    }
    /**
     * @return the pedigree
     */
    public boolean isPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
}
