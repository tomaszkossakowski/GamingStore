package pl.gameStore.KurastBazaar.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

//import lombok.Data;
import org.springframework.context.annotation.Primary;

import sun.util.calendar.LocalGregorianCalendar.Date;


//@Data
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

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(final Integer userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(final String userName)
    {
        this.userName = userName;
    }

    public String getUserLogin()
    {
        return userLogin;
    }

    public void setUserLogin(final String userLogin)
    {
        this.userLogin = userLogin;
    }

    @Override
    public String toString()
    {
        return "User{" +
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            ", userLogin='" + userLogin + '\'' +
            '}';
    }
}
