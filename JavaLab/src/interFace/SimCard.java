package interFace;

import java.util.Date;

public class SimCard extends Product implements Expirable,Warrantable{
	//SimCard具備四種型態:SimCard,Product,Expirable,Warrantable
	@Override
	public Date 最後期限() {
		return expireDate;
	}
	
	@Override
	public int 保固天數() {
		return 7;
	}
	
    private Date expireDate;
	
    public SimCard(String name, int price, Date expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }
    
    @Override
    public String desc() {
        String description = super.desc();
        description = description +",到期日："+expireDate+",開卡後可用7天";
        return description;
    }


	

}