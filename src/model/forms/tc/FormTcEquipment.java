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

    public FormTcEquipment(boolean phonelineIn, boolean answermachineIn,
            boolean bookcaseIn, boolean callingcardIn, boolean computerIn,
            boolean deskIn, boolean facsimileIn, boolean filecabinetIn,
            boolean modemIn, boolean pagerIn, boolean printerIn,
            boolean softwareIn, boolean typewriterin, boolean voicemailIn,
            boolean internetIn) {
        this.phoneline = phonelineIn;
        this.answermachine = answermachineIn;
        this.bookcase = bookcaseIn;
        this.callingcard = callingcardIn;
        this.computer = computerIn;
        this.desk = deskIn;
        this.facsimile = facsimileIn;
        this.filecabinet = filecabinetIn;
        this.modem = modemIn;
        this.pager = pagerIn;
        this.printer = printerIn;
        this.software = softwareIn;
        this.typewriter = typewriterin;
        this.voicemail = voicemailIn;
        this.internet = internetIn;
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
