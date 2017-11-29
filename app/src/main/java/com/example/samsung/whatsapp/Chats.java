package com.example.samsung.whatsapp;

public class Chats {
    private int imageID;
    private String titulo;
    private String description;
    private String hora;
    private Class<?> cls;

    public int getImageConversa() {
        return imageConversa;
    }

    public void setImageConversa(int imageConversa) {
        this.imageConversa = imageConversa;
    }

    private int imageConversa;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Class<?> getCls() {
        return cls;
    }

    public void setCls(Class<?> cls) {
        this.cls = cls;
    }

    public Chats(int imageID, String titulo, String description, String hora, Class<?> cls, int imageConversa) {
        this.imageID = imageID;
        this.titulo = titulo;
        this.description = description;
        this.hora = hora;
        this.cls = cls;
        this.imageConversa = imageConversa;
    }

    public Chats(int imageID, String titulo, String description, String hora, Class<?> cls) {
        this.imageID = imageID;
        this.titulo = titulo;
        this.description = description;
        this.hora = hora;
        this.cls = cls;
    }
}
