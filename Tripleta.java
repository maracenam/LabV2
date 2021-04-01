

public class Tripleta implements Comparable<Tripleta> {

    private String categoria;
    private String nombreProducto;
    private int numeroVeces;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getNumeroVeces() {
        return numeroVeces;
    }

    public void setNumeroVeces(int numeroVeces) {
        this.numeroVeces = numeroVeces;
    }

    public String toString(){
        return this.categoria+" - "+this.nombreProducto+" comprado "+numeroVeces +" veces";
    }

    @Override
    public int compareTo(Tripleta tripleta) {
        return this.numeroVeces-tripleta.numeroVeces;
    }
}
