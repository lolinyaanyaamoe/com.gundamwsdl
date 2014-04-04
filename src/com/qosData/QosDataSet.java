package com.qosData;

public class QosDataSet {

	private long QosResonseTime;
	public QosDataSet(){
		
	}
	
	public void setQosResponseTime( long startMili, long endMili) {
		this.QosResonseTime = endMili - startMili;
		
	}
	
	public void setQosResponseTime( long midMili) {
		this.QosResonseTime = midMili;
		
	}
	public long getQosResponseTime() {
		return this.QosResonseTime;
		
	}
	
	
	
}
