package model.forms.tc;

import model.forms.Question;

public class FormTcAnnouncement {

    private Question question1a;
    private Question question2a;
    private Question question1b;
    private Question question2b;
    private Question question3b;
    private Question question4b;
    private Question question5b;

   

	public FormTcAnnouncement(String q1, String q2,
			String q3, String q4, String q5,
			String q6, String q7) {
		
		// TODO: how to fill the data into the model
		
		
	}

	public Question getQuestion1a() {
        return this.question1a;
    }

    public Question getQuestion2a() {
        return this.question2a;
    }

    public Question getQuestion1b() {
        return this.question1b;
    }

    public Question getQuestion2b() {
        return this.question2b;
    }

    public Question getQuestion3b() {
        return this.question3b;
    }

    public Question getQuestion4b() {
        return this.question4b;
    }

    public Question getQuestion5b() {
        return this.question5b;
    }

	public void setQuestion1a(Question question1a) {
		this.question1a = question1a;
	}

	public void setQuestion2a(Question question2a) {
		this.question2a = question2a;
	}

	public void setQuestion1b(Question question1b) {
		this.question1b = question1b;
	}

	public void setQuestion2b(Question question2b) {
		this.question2b = question2b;
	}

	public void setQuestion3b(Question question3b) {
		this.question3b = question3b;
	}

	public void setQuestion4b(Question question4b) {
		this.question4b = question4b;
	}

	public void setQuestion5b(Question question5b) {
		this.question5b = question5b;
	}
    
    
    
}
