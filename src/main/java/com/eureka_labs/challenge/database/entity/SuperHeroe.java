package com.eureka_labs.challenge.database.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "superheroe")
public class SuperHeroe {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "resource_uri")
    private String resourceURI;

    @Column(name = "last_update")
    private String lastUpdate;

    @Column(name = "thumbnail_uri")
    private String thumbnailURI;

}
