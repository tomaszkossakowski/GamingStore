package pl.gameStore.KurastBazaar.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.Data;
import sun.util.calendar.LocalGregorianCalendar.Date;


//@Data
@Entity
@Table(name = "user")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_login")
    private String userLogin;

    @Column(name = "password")
    private String password;

    @Column(name = "user_info")
    private String userInfo;

    @Column(name = "email")
    private String email;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "deleted")
    private Date deleted;

    @Column(name = "password_changed")
    private Boolean passwordChanged;

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

    public String getPassword()
    {
        return password;
    }

    public void setPassword(final String password)
    {
        this.password = password;
    }

    public String getUserInfo()
    {
        return userInfo;
    }

    public void setUserInfo(final String userInfo)
    {
        this.userInfo = userInfo;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(final String email)
    {
        this.email = email;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate(final Date creationDate)
    {
        this.creationDate = creationDate;
    }

    public Date getDeleted()
    {
        return deleted;
    }

    public void setDeleted(final Date deleted)
    {
        this.deleted = deleted;
    }

    public Boolean getPasswordChanged()
    {
        return passwordChanged;
    }

    public void setPasswordChanged(final Boolean passwordChanged)
    {
        this.passwordChanged = passwordChanged;
    }

    @Override
    public String toString()
    {
        return "User{" +
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            ", userLogin='" + userLogin + '\'' +
            ", password='" + password + '\'' +
            ", userInfo='" + userInfo + '\'' +
            ", email='" + email + '\'' +
            ", creationDate=" + creationDate +
            ", deleted=" + deleted +
            ", passwordChanged=" + passwordChanged +
            '}';
    }
}
