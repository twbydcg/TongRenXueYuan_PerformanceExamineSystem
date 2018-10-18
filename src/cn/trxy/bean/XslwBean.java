package cn.trxy.bean;

public class XslwBean {
	
//	CREATE TABLE trxypes_xslw(
//	id int PRIMARY KEY auto_increment COMMENT 'id',
//	cgsbnx VARCHAR(20) COMMENT '成果申报年限',
//	lwlx VARCHAR(50) COMMENT '论文类型',
//	lwtm VARCHAR(50) COMMENT '论文题目',
//	dyzz VARCHAR(50) COMMENT '第一作者',
//	smdwcd VARCHAR(50) COMMENT '署名单位次第',
//	txzz VARCHAR(50) COMMENT '通讯作者',
//	syzz VARCHAR(50) COMMENT '所有作者',
//	brsmcd VARCHAR(50) COMMENT '本人署名次第',
//	fbsj date COMMENT '发表/出版时间',
//	fbkw VARCHAR(50) COMMENT '发表刊物',
//	kwlx VARCHAR(50) COMMENT '刊物类型',
//	xkml VARCHAR(50) COMMENT '学科门类',
//	yjxk VARCHAR(50) COMMENT '一级学科',
//	xmly VARCHAR(50) COMMENT '项目来源',
//	qh VARCHAR(50) COMMENT '期号',
//	bm VARCHAR(50) COMMENT '版面',
//	issnh VARCHAR(50) COMMENT 'ISSN号',
//	cnh VARCHAR(50) COMMENT 'CN号',
//	ysjf INT COMMENT '原始积分',
//	sdjf INT COMMENT '所得积分',
//	shzt INT COMMENT '审核状态',
//	ssxy int COMMENT '所属单位（学院）',
//	userid INT COMMENT '所属用户',
//	fj VARCHAR(200) COMMENT '附件', 
//	bz VARCHAR(200) COMMENT '备注',
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
