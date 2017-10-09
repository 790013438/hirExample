package snippets.jee.jpa;

import java.util.Date;

public class IdCard {

    private int id;
    private String no;
    private String policeStation;
    private Date expireDate;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public String getPoliceStation() {
        return policeStation;
    }
    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }
    public Date getExpireDate() {
        return expireDate;
    }
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

}
