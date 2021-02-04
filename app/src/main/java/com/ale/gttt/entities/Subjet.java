package com.ale.gttt.entities;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subjet {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("active")
    @Expose
    private Integer active;
    @SerializedName("idUser")
    @Expose
    private Integer idUser;
    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("queryClasses")
    @Expose
    private String queryClasses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public String getQueryClasses() {
        return queryClasses;
    }

    public void setQueryClasses(String queryClasses) {
        this.queryClasses = queryClasses;
    }

}