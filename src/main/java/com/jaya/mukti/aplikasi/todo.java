package com.jaya.mukti.aplikasi;

public class todo {
	private Integer id;
	private String keterangan;
	private Boolean selesai;
	
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getketerangan(){
		return keterangan;
	}
	public void setketerangan(String keterangan){
		this.keterangan = keterangan;
	}
	
	public Boolean getselesai(){
		return selesai;
	}
	public void setselesai(Boolean selesai){
		this.selesai = selesai;
	}
	
}

 