package it.polito.tdp.NationalGallery.model;




import java.util.LinkedList;
import java.util.List;


public class Stanza {
	
	private	String site;
	private	String room;
	private	int publicAccess;
	private	String description;
	private	List<Opera> opere;
	private String periodo;
	private int capienzaAttuale;	
	
	public Stanza(String site, String room, int publicAccess, String description) {
		super();
		this.site = site;
		this.room = room;
		this.publicAccess = publicAccess;
		this.description = description;
		this.opere= new LinkedList<>();
		this.periodo="";
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public int getPublicAccess() {
		return publicAccess;
	}
	public void setPublicAccess(int publicAccess) {
		this.publicAccess = publicAccess;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Opera> getOpere() {
		return opere;
	}

	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	public int getCapienzaAttuale() {
		return capienzaAttuale;
	}
	public void setCapienzaAttuale(int capienzaAttuale) {
		this.capienzaAttuale = capienzaAttuale;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((room == null) ? 0 : room.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stanza other = (Stanza) obj;
		if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		return true;
	}
	public void aggiungiOpera(Opera op) {
		// TODO Auto-generated method stub
		this.opere.add( op);
	}
	@Override
	public String toString() {
		return "Stanza [room=" + room + "]";
	}
	
	
}