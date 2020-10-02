package org.example.joris.dag16Collections;

public class Werknemer {
    private int id;
    private String naam;

    public Werknemer(int id, String naam) {
        setId(id);
        setNaam(naam);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Werknemer{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                '}';
    }

    public String getNaam() {
        return naam;
    }
}
