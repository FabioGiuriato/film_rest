package org.example;

public class Film {
    private Long id;
    private String titolo;
    private String regista;
    private int anno;

    public Film() {}

    public Film(Long id, String titolo, String regista, int anno) {
        this.id = id;
        this.titolo = titolo;
        this.regista = regista;
        this.anno = anno;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }

    public String getRegista() { return regista; }
    public void setRegista(String regista) { this.regista = regista; }

    public int getAnno() { return anno; }
    public void setAnno(int anno) { this.anno = anno; }
}