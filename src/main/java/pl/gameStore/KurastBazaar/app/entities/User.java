package pl.gameStore.KurastBazaar.app.entities;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "user")
public class User
{
    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_login")
    private String userLogin;

    @Column (name = "password")
    private String password;

    @Column (name = "user_info")
    private String userInfo;

    @Column (name = "email")
    private String email;

    @Column (name = "creation_date")
    private ZonedDateTime creationDate;

    @Column (name = "deleted")
    private ZonedDateTime deleted;

    @Column (name = "password_changed")
    private Boolean passwordChanged;
}
