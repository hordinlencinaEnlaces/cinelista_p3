package es.cpifp.losenlaces.cinelista.model;

/**
 * Representa una fila de la tabla de la seccion "Estadisticas"
 * (datos estaticos consumidos via GET /api/estadisticas por DataTables).
 *
 * Campos:
 *  - id        (Long)   identificador de la fila
 *  - titulo    (String) titulo de la pelicula
 *  - genero    (String) genero de la pelicula
 *  - taquilla  (long)   recaudacion en euros (se suma en el pie de la tabla)
 *  - nota      (int)    valoracion de 0 a 10 (se dibuja como barra)
 */
public class Estadistica {

    private Long id;
    private String titulo;
    private String genero;
    private long taquilla;
    private int nota;

    public Estadistica() {
    }

    public Estadistica(Long id, String titulo, String genero, long taquilla, int nota) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.taquilla = taquilla;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public long getTaquilla() {
        return taquilla;
    }

    public void setTaquilla(long taquilla) {
        this.taquilla = taquilla;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}
