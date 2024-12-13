package entities;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private int nivelHabilidad; 

    public Agente(int id, String nombre, String habilidadEspecial, int nivelHabilidad) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
        this.nivelHabilidad = nivelHabilidad; 
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }

    public int getNivelHabilidad() {
        return nivelHabilidad;
    }

    public void setNivelHabilidad(int nivelHabilidad) {
        this.nivelHabilidad = nivelHabilidad;
    }

    
    public boolean simularMision(int dificultad) {
        boolean exito = nivelHabilidad > dificultad;
        if (exito) {
            System.out.println("Éxito en la misión.");
        } else {
            System.out.println("Fracaso en la misión.");
        }
        return exito;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "") +
                ", Nivel de Habilidad: " + nivelHabilidad;
    }
}

