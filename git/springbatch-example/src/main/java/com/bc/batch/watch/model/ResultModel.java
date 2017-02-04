package com.bc.batch.watch.model;



public class ResultModel  {
	

	private String sourcetable;
	
	private String fieldchanges;

	private String hitdate;

	private String accountnumber;

	private String fid;

	private String first;

	private String paternal;

	private String maternal;

	private String rfc;

	private String parent_id;

	private String companyname;

	private String type;

	public String getSourcetable() {
		return sourcetable;
	}

	public void setSourcetable(String sourcetable) {
		this.sourcetable = sourcetable;
	}

	public String getHitdate() {
		return hitdate;
	}

	public void setHitdate(String hitdate) {
		this.hitdate = hitdate;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getPaternal() {
		return paternal;
	}

	public void setPaternal(String paternal) {
		this.paternal = paternal;
	}

	public String getMaternal() {
		return maternal;
	}

	public void setMaternal(String maternal) {
		this.maternal = maternal;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

	public String getFieldchanges() {
		return fieldchanges;
	}

	public void setFieldchanges(String fieldchanges) {
		this.fieldchanges = fieldchanges;
	}

	public ResultModel(String sourcetable,String fieldchanges ,String hitdate, String accountnumber, String fid, String first, String paternal, String maternal, String rfc,
			String parent_id, String companyname, String type) {
		super();
		this.sourcetable = sourcetable;
		this.fieldchanges=fieldchanges;
		this.hitdate = hitdate;
		this.accountnumber = accountnumber;
		this.fid = fid;
		this.first = first;
		this.paternal = paternal;
		this.maternal = maternal;
		this.rfc = rfc;
		this.parent_id = parent_id;
		this.companyname = companyname;
		this.type = type;
	}

	@Override
	public String toString() {
		return fid + "," +fieldchanges+" , "+ sourcetable + "," + hitdate + "," + accountnumber + "," +  first + "," + paternal + "," + maternal + "," + rfc + "," + parent_id + ","
				+ companyname + "," + type + "\r\n";
	}

}
