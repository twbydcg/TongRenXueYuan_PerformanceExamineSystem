package cn.trxy.bean;

public class XslwBean {
	
//	CREATE TABLE trxypes_xslw(
//	id int PRIMARY KEY auto_increment COMMENT 'id',
//	cgsbnx VARCHAR(20) COMMENT '�ɹ��걨����',
//	lwlx VARCHAR(50) COMMENT '��������',
//	lwtm VARCHAR(50) COMMENT '������Ŀ',
//	dyzz VARCHAR(50) COMMENT '��һ����',
//	smdwcd VARCHAR(50) COMMENT '������λ�ε�',
//	txzz VARCHAR(50) COMMENT 'ͨѶ����',
//	syzz VARCHAR(50) COMMENT '��������',
//	brsmcd VARCHAR(50) COMMENT '���������ε�',
//	fbsj date COMMENT '����/����ʱ��',
//	fbkw VARCHAR(50) COMMENT '������',
//	kwlx VARCHAR(50) COMMENT '��������',
//	xkml VARCHAR(50) COMMENT 'ѧ������',
//	yjxk VARCHAR(50) COMMENT 'һ��ѧ��',
//	xmly VARCHAR(50) COMMENT '��Ŀ��Դ',
//	qh VARCHAR(50) COMMENT '�ں�',
//	bm VARCHAR(50) COMMENT '����',
//	issnh VARCHAR(50) COMMENT 'ISSN��',
//	cnh VARCHAR(50) COMMENT 'CN��',
//	ysjf INT COMMENT 'ԭʼ����',
//	sdjf INT COMMENT '���û���',
//	shzt INT COMMENT '���״̬',
//	ssxy int COMMENT '������λ��ѧԺ��',
//	userid INT COMMENT '�����û�',
//	fj VARCHAR(200) COMMENT '����', 
//	bz VARCHAR(200) COMMENT '��ע',
//	FOREIGN KEY(userid) REFERENCES trxypes_user(id)
//	)ENGINE=INNODB CHARSET=utf8;
	
	
	private int id;
	private String cgsbnx;
	private String lwlx;
	private String lwtm;
	private String dyzz;
	private String smdwcd;
	private String txzz;
	private String syzz;
	private String brsmcd;
	private String fbsj;
	private String fbkw;
	private String kwlx;
	private String xkml;
	private String yjxk;
	private String xmly;
	private String qh;
	private String bm;
	private String issnh;
	private String cnh;
	private int ysjf;
	private int sdjf;
	private int shzt;
	private int ssxy;
	private int userid;
	private String fj;
	private String bz;
	@Override
	public String toString() {
		return "XslwBean [id=" + id + ", cgsbnx=" + cgsbnx + ", lwlx=" + lwlx + ", lwtm=" + lwtm + ", dyzz=" + dyzz
				+ ", smdwcd=" + smdwcd + ", txzz=" + txzz + ", syzz=" + syzz + ", brsmcd=" + brsmcd + ", fbsj=" + fbsj
				+ ", fbkw=" + fbkw + ", kwlx=" + kwlx + ", xkml=" + xkml + ", yjxk=" + yjxk + ", xmly=" + xmly + ", qh="
				+ qh + ", bm=" + bm + ", issnh=" + issnh + ", cnh=" + cnh + ", ysjf=" + ysjf + ", sdjf=" + sdjf
				+ ", shzt=" + shzt + ", ssxy=" + ssxy + ", userid=" + userid + ", fj=" + fj + ", bz=" + bz + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCgsbnx() {
		return cgsbnx;
	}
	public void setCgsbnx(String cgsbnx) {
		this.cgsbnx = cgsbnx;
	}
	public String getLwlx() {
		return lwlx;
	}
	public void setLwlx(String lwlx) {
		this.lwlx = lwlx;
	}
	public String getLwtm() {
		return lwtm;
	}
	public void setLwtm(String lwtm) {
		this.lwtm = lwtm;
	}
	public String getDyzz() {
		return dyzz;
	}
	public void setDyzz(String dyzz) {
		this.dyzz = dyzz;
	}
	public String getSmdwcd() {
		return smdwcd;
	}
	public void setSmdwcd(String smdwcd) {
		this.smdwcd = smdwcd;
	}
	public String getTxzz() {
		return txzz;
	}
	public void setTxzz(String txzz) {
		this.txzz = txzz;
	}
	public String getSyzz() {
		return syzz;
	}
	public void setSyzz(String syzz) {
		this.syzz = syzz;
	}
	public String getBrsmcd() {
		return brsmcd;
	}
	public void setBrsmcd(String brsmcd) {
		this.brsmcd = brsmcd;
	}
	public String getFbsj() {
		return fbsj;
	}
	public void setFbsj(String fbsj) {
		this.fbsj = fbsj;
	}
	public String getFbkw() {
		return fbkw;
	}
	public void setFbkw(String fbkw) {
		this.fbkw = fbkw;
	}
	public String getKwlx() {
		return kwlx;
	}
	public void setKwlx(String kwlx) {
		this.kwlx = kwlx;
	}
	public String getXkml() {
		return xkml;
	}
	public void setXkml(String xkml) {
		this.xkml = xkml;
	}
	public String getYjxk() {
		return yjxk;
	}
	public void setYjxk(String yjxk) {
		this.yjxk = yjxk;
	}
	public String getXmly() {
		return xmly;
	}
	public void setXmly(String xmly) {
		this.xmly = xmly;
	}
	public String getQh() {
		return qh;
	}
	public void setQh(String qh) {
		this.qh = qh;
	}
	public String getBm() {
		return bm;
	}
	public void setBm(String bm) {
		this.bm = bm;
	}
	public String getIssnh() {
		return issnh;
	}
	public void setIssnh(String issnh) {
		this.issnh = issnh;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public int getYsjf() {
		return ysjf;
	}
	public void setYsjf(int ysjf) {
		this.ysjf = ysjf;
	}
	public int getSdjf() {
		return sdjf;
	}
	public void setSdjf(int sdjf) {
		this.sdjf = sdjf;
	}
	public int getShzt() {
		return shzt;
	}
	public void setShzt(int shzt) {
		this.shzt = shzt;
	}
	public int getSsxy() {
		return ssxy;
	}
	public void setSsxy(int ssxy) {
		this.ssxy = ssxy;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFj() {
		return fj;
	}
	public void setFj(String fj) {
		this.fj = fj;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	
	
	

}
