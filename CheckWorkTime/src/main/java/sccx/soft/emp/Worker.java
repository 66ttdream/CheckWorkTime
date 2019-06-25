package sccx.soft.emp;

import java.io.Serializable;

public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;
	   private Integer id;
       private String name;
       private String time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "worker [id=" + id + ", name=" + name + ", time=" + time + "]";
	}
	public Worker() {
		
	}
	public Worker(Integer id, String name, String time) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
	}
	@Override
	public boolean equals(Object arg0) {
	
		return super.equals(arg0);
	}
	@Override
	public int hashCode() {
	
		return super.hashCode();
	}
       
}
