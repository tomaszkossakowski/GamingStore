package pl.gameStore.KurastBazaar.app.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;


@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String userName;

    private String userLogin;

    private String password;

    private String userInfo;

    private String email;

    private ZonedDateTime creationDate;

    private ZonedDateTime deleted;

    private Boolean passwordChanged;
}
