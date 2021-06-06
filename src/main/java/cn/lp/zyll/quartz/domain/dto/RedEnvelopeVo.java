package cn.lp.zyll.quartz.domain.dto;

public class RedEnvelopeVo {

    private String uuid;
    private String redEnvelopeOrderId;
    private String userId;
    private Integer type;


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getRedEnvelopeOrderId() {
        return redEnvelopeOrderId;
    }

    public void setRedEnvelopeOrderId(String redEnvelopeOrderId) {
        this.redEnvelopeOrderId = redEnvelopeOrderId;
    }
}
