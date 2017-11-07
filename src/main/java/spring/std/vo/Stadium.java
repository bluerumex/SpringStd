package spring.std.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Stadium {

    private String stadiumId;
    @JsonIgnore
    private Date regDtm;
    @JsonIgnore
    private Date updateDtm;
    private String statusCd;
    private String stadiumName;
    private String hometeamId;
    private long seatCount;
    private String address;
    private String ddd;
    private String tel;

    public String getStadiumId() {
        return stadiumId;
    }

    public void setStadiumId(String stadiumId) {
        this.stadiumId = stadiumId;
    }

    public Date getRegDtm() {
        return regDtm;
    }

    public void setRegDtm(Date regDtm) {
        this.regDtm = regDtm;
    }

    public Date getUpdateDtm() {
        return updateDtm;
    }

    public void setUpdateDtm(Date updateDtm) {
        this.updateDtm = updateDtm;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public String getHometeamId() {
        return hometeamId;
    }

    public void setHometeamId(String hometeamId) {
        this.hometeamId = hometeamId;
    }

    public long getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(long seatCount) {
        this.seatCount = seatCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
