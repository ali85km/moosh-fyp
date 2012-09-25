package model;

public class TcEquipment {

	private boolean phoneline;
	private boolean answermachine;
	private boolean bookcase;
	private boolean callingcard;
	private boolean computer;
	private boolean desk;
	private boolean facsimile;
	private boolean modem;
	private boolean pager;
	private boolean printer;
	private boolean software;
	private boolean typewriter;
	private boolean voicemail;
	private boolean internet;
	
	public TcEquipment(boolean phoneline, boolean answermachine,
			boolean bookcase, boolean callingcard, boolean computer,
			boolean desk, boolean facsimile, boolean modem, boolean pager,
			boolean printer, boolean software, boolean typewriter,
			boolean voicemail, boolean internet) {
		super();
		this.phoneline = phoneline;
		this.answermachine = answermachine;
		this.bookcase = bookcase;
		this.callingcard = callingcard;
		this.computer = computer;
		this.desk = desk;
		this.facsimile = facsimile;
		this.modem = modem;
		this.pager = pager;
		this.printer = printer;
		this.software = software;
		this.typewriter = typewriter;
		this.voicemail = voicemail;
		this.internet = internet;
	}

	public boolean isPhoneline() {
		return phoneline;
	}

	public void setPhoneline(boolean phoneline) {
		this.phoneline = phoneline;
	}

	public boolean isAnswermachine() {
		return answermachine;
	}

	public void setAnswermachine(boolean answermachine) {
		this.answermachine = answermachine;
	}

	public boolean isBookcase() {
		return bookcase;
	}

	public void setBookcase(boolean bookcase) {
		this.bookcase = bookcase;
	}

	public boolean isCallingcard() {
		return callingcard;
	}

	public void setCallingcard(boolean callingcard) {
		this.callingcard = callingcard;
	}

	public boolean isComputer() {
		return computer;
	}

	public void setComputer(boolean computer) {
		this.computer = computer;
	}

	public boolean isDesk() {
		return desk;
	}

	public void setDesk(boolean desk) {
		this.desk = desk;
	}

	public boolean isFacsimile() {
		return facsimile;
	}

	public void setFacsimile(boolean facsimile) {
		this.facsimile = facsimile;
	}

	public boolean isModem() {
		return modem;
	}

	public void setModem(boolean modem) {
		this.modem = modem;
	}

	public boolean isPager() {
		return pager;
	}

	public void setPager(boolean pager) {
		this.pager = pager;
	}

	public boolean isPrinter() {
		return printer;
	}

	public void setPrinter(boolean printer) {
		this.printer = printer;
	}

	public boolean isSoftware() {
		return software;
	}

	public void setSoftware(boolean software) {
		this.software = software;
	}

	public boolean isTypewriter() {
		return typewriter;
	}

	public void setTypewriter(boolean typewriter) {
		this.typewriter = typewriter;
	}

	public boolean isVoicemail() {
		return voicemail;
	}

	public void setVoicemail(boolean voicemail) {
		this.voicemail = voicemail;
	}

	public boolean isInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}
	
	
}
