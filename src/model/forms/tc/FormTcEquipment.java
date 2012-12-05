package model.forms.tc;

public class FormTcEquipment {

    private boolean phoneline;
    private boolean answermachine;
    private boolean bookcase;
    private boolean callingcard;
    private boolean computer;
    private boolean desk;
    private boolean facsimile;
    private boolean filecabinet;
    private boolean modem;
    private boolean pager;
    private boolean printer;
    private boolean software;
    private boolean typewriter;
    private boolean voicemail;
    private boolean internet;

    public FormTcEquipment(String p1, String p2,
            String p3, String p4, String p5,
            String p6, String p7, String p8,
            String p9, String p10, String p11,
            String p12, String p13, String p14,
            String p15) {
        /*
    	this.phoneline = p1;
        this.answermachine = p2;
        this.bookcase = p3;
        this.callingcard = p4;
        this.computer = p5;
        this.desk = p6;
        this.facsimile = p7;
        this.filecabinet = p8;
        this.modem = p9;
        this.pager = p10;
        this.printer = p11;
        this.software = p12;
        this.typewriter = p13;
        this.voicemail = p14;
        this.internet = p15; */
    }

    public boolean isPhoneline() {
        return this.phoneline;
    }

    public boolean isAnswermachine() {
        return this.answermachine;
    }

    public boolean isBookcase() {
        return this.bookcase;
    }

    public boolean isCallingcard() {
        return this.callingcard;
    }

    public boolean isComputer() {
        return this.computer;
    }

    public boolean isDesk() {
        return this.desk;
    }

    public boolean isFacsimile() {
        return this.facsimile;
    }

    public boolean isFilecabinet() {
        return this.filecabinet;
    }

    public boolean isModem() {
        return this.modem;
    }

    public boolean isPager() {
        return this.pager;
    }

    public boolean isPrinter() {
        return this.printer;
    }

    public boolean isSoftware() {
        return this.software;
    }

    public boolean isTypewriter() {
        return this.typewriter;
    }

    public boolean isVoicemail() {
        return this.voicemail;
    }

    public boolean isInternet() {
        return this.internet;
    }
}
