CREATE TABLE User(
		user_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		user_fname VARCHAR(50) NOT NULL,
		user_lname VARCHAR(50),
		user_uname INT NOT NULL UNIQUE,
		user_password VARCHAR(50) NOT NULL,
		user_gender VARCHAR(50),
		user_dob VARCHAR(10),
		user_citizenship VARCHAR(50),
		user_passport VARCHAR(50),
		user_phone_number VARCHAR(50),
		user_cell_number VARCHAR(50),
		user_email VARCHAR(50),
		user_address VARCHAR(200),
		user_manager_id_fk INT,
		FOREIGN KEY (user_manager_id_fk) REFERENCES User(user_id) ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE FormMgrCommitment(
		formmgrcommitment_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		formmgrcommitment_question1choice INT,
		formmgrcommitment_question1comment VARCHAR(200),
		formmgrcommitment_question2choice INT,
		formmgrcommitment_question2comment VARCHAR(200),
		formmgrcommitment_question3choice INT,
		formmgrcommitment_question3comment VARCHAR(200),
		formmgrcommitment_question4choice INT,
		formmgrcommitment_question4comment VARCHAR(200),
		formmgrcommitment_question5choice INT,
		formmgrcommitment_question5comment VARCHAR(200)
);

CREATE TABLE FormMgrEmpAssess(
		formmgrempassess_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		formmgrempassess_seri INT,
		formmgrempassess_question_num INT,
		formmgrempassess_question_choice INT,
		formmgrempassess_question_comment VARCHAR(200)
);

CREATE TABLE FormMgrPersAssess(
		formmgrpersassess_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		formmgrpersassess_seri INT,
		formmgrpersassess_question_num INT,
		formmgrpersassess_question_choice INT,
		formmgrpersassess_question_comment VARCHAR(200)
);

CREATE TABLE FormMgrMonitoring(
		formmgrmonitoring_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		formmgrmonitoring_question1choice INT,
		formmgrmonitoring_question1comment VARCHAR(200),
		formmgrmonitoring_question2choice INT,
		formmgrmonitoring_question2comment VARCHAR(200),
		formmgrmonitoring_question3choice INT,
		formmgrmonitoring_question3comment VARCHAR(200),
		formmgrmonitoring_question4choice INT,
		formmgrmonitoring_question4comment VARCHAR(200),
		formmgrmonitoring_question5choice INT,
		formmgrmonitoring_question5comment VARCHAR(200),
		formmgrmonitoring_question6choice INT,
		formmgrmonitoring_question6comment VARCHAR(200),
		formmgrmonitoring_question7choice INT,
		formmgrmonitoring_question7comment VARCHAR(200),
		formmgrmonitoring_question8choice INT,
		formmgrmonitoring_question8comment VARCHAR(200),
		formmgrmonitoring_question9choice INT,
		formmgrmonitoring_question9comment VARCHAR(200),
		formmgrmonitoring_question10choice INT,
		formmgrmonitoring_question10comment VARCHAR(200)
);

CREATE TABLE FormMgrWorkAssess(
		formmgrworkassess_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		formmgrworkassess_question1choice INT,
		formmgrworkassess_question1comment VARCHAR(200),
		formmgrworkassess_question2choice INT,
		formmgrworkassess_question2comment VARCHAR(200),
		formmgrworkassess_question3choice INT,
		formmgrworkassess_question3comment VARCHAR(200),
		formmgrworkassess_question4choice INT,
		formmgrworkassess_question4comment VARCHAR(200),
		formmgrworkassess_question5choice INT,
		formmgrworkassess_question5comment VARCHAR(200),
		formmgrworkassess_question6choice INT,
		formmgrworkassess_question6comment VARCHAR(200),
		formmgrworkassess_question7choice INT,
		formmgrworkassess_question7comment VARCHAR(200),
		formmgrworkassess_question8choice INT,
		formmgrworkassess_question8comment VARCHAR(200),
		formmgrworkassess_question9choice INT,
		formmgrworkassess_question9comment VARCHAR(200),
		formmgrworkassess_question10choice INT,
		formmgrworkassess_question10comment VARCHAR(200)
);

CREATE TABLE FormMgrCommAssess(
		formmgrcommassess_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		formmgrcommassess_question1choice INT,
		formmgrcommassess_question1comment VARCHAR(200),
		formmgrcommassess_question2choice INT,
		formmgrcommassess_question2comment VARCHAR(200),
		formmgrcommassess_question3choice INT,
		formmgrcommassess_question3comment VARCHAR(200),
		formmgrcommassess_question4choice INT,
		formmgrcommassess_question4comment VARCHAR(200),
		formmgrcommassess_question5choice INT,
		formmgrcommassess_question5comment VARCHAR(200),
		formmgrcommassess_question6choice INT,
		formmgrcommassess_question6comment VARCHAR(200)
);

CREATE TABLE FormTcWorkHours(
		formtcworkhours_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		formtcworkhours_seri INT,
		formtcworkhours_week INT,
		formtcworkhours_day INT,
		formtcworkhours_hours INT
);

CREATE TABLE FormTcContact(
		formtccontact_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		formtccontact_seri INT,
		formtccontact_week INT,
		formtccontact_emailreceive INT,
		formtccontact_emailreply INT,
		formtccontact_phonereceive INT,
		formtccontact_phonereply INT,
		formtccontact_smsreceive INT,
		formtccontact_smsreply INT
);

CREATE TABLE FormTcTask(
		formtctask_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		formtctask_tasktitle VARCHAR(50),
		formtctask_assigndate DATE,
		formtctask_duedate DATE,
		formtctask_enddate DATE
);

CREATE TABLE FormTcEquipment(
		formtcequipment_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		formtcequipment_phoneline BOOL,
		formtcequipment_answermachine BOOL,
		formtcequipment_bookcase BOOL,
		formtcequipment_callingcard BOOL,
		formtcequipment_computer BOOL,
		formtcequipment_desk BOOL,
		formtcequipment_facsimile BOOL,
		formtcequipment_filecabinet BOOL,
		formtcequipment_modem BOOL,
		formtcequipment_pager BOOL,
		formtcequipment_printer BOOL,
		formtcequipment_software BOOL,
		formtcequipment_typewriter BOOL,
		formtcequipment_voicemail BOOL,
		formtcequipment_internetaccess BOOL
);

CREATE TABLE FormTcMeeting(
		formtcmeeting_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		formtcmeeting_seri INT,
		formtcmeeting_week INT,
		formtcmeeting_audiototal BOOL,
		formtcmeeting_audioattend BOOL,
		formtcmeeting_video_total BOOL,
		formtcmeeting_video_attend BOOL,
		formtcmeeting_face_to_face_conduct BOOL,
		formtcmeeting_face_to_face_attend BOOL
);	

CREATE TABLE FormTcWorkLife(
		formtcworklife_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		formtcworklife_question1choice INT,
		formtcworklife_question2choice INT,
		formtcworklife_question3choice INT,
		formtcworklife_question4choice INT,
		formtcworklife_question5choice INT
);

CREATE TABLE FormTcCommitment(
		formtccommitment_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		formtccommitment_question1choice INT,
		formtccommitment_question1comment VARCHAR(200),
		formtccommitment_question2choice INT,
		formtccommitment_question2comment VARCHAR(200),
		formtccommitment_question3choice INT,
		formtccommitment_question3comment VARCHAR(200),
		formtccommitment_question4choice INT,
		formtccommitment_question4comment VARCHAR(200),
		formtccommitment_question5choice INT,
		formtccommitment_question5comment VARCHAR(200)
);

CREATE TABLE FormTcAnnouncement(
		formtcannouncement_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		formtcannouncement_question1choice INT,
		formtcannouncement_question1comment VARCHAR(200),
		formtcannouncement_question2choice INT,
		formtcannouncement_question2comment VARCHAR(200),
		formtcannouncement_question3choice INT,
		formtcannouncement_question3comment VARCHAR(200),
		formtcannouncement_question4choice INT,
		formtcannouncement_question4comment VARCHAR(200),
		formtcannouncement_question5choice INT,
		formtcannouncement_question5comment VARCHAR(200),
		formtcannouncement_question6choice INT,
		formtcannouncement_question6comment VARCHAR(200),
		formtcannouncement_question7choice INT,
		formtcannouncement_question7comment VARCHAR(200)
);

CREATE TABLE TotalForm(
		totalform_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
		totalform_submission_date DATE,
		totalform_mgr_work_assess_id_fk INT NOT NULL,
		totalform_mgr_comm_assess_id_fk INT NOT NULL,
		totalform_mgr_emp_assess_id_fk INT NOT NULL,
		totalform_mgr_commitment_id_fk INT NOT NULL,
		totalform_mgr_pers_assess_id_fk INT NOT NULL,
		totalform_mgr_monitoring_id_fk INT NOT NULL,
		totalform_tc_equipment_id_fk INT NOT NULL,
		totalform_tc_task_id_fk INT NOT NULL,
		totalform_tc_work_hours_id_fk INT NOT NULL,
		totalform_tc_meeting_id_fk INT NOT NULL,
		totalform_tc_contact_id_fk INT NOT NULL,
		totalform_tc_commitment_id_fk INT NOT NULL,
		totalform_tc_work_life_id_fk INT NOT NULL,
		totalform_tc_announcement_id_fk INT NOT NULL,
		totalform_user_id_fk INT NOT NULL,
		FOREIGN KEY (totalform_mgr_work_assess_id_fk) REFERENCES FormMgrWorkAssess(formmgrworkassess_id) ON UPDATE CASCADE ON DELETE RESTRICT,
		FOREIGN KEY (totalform_mgr_comm_assess_id_fk) REFERENCES FormMgrCommAssess(formmgrcommassess_id) ON UPDATE CASCADE ON DELETE RESTRICT,
		FOREIGN KEY (totalform_mgr_emp_assess_id_fk) REFERENCES FormMgrEmpAssess(formmgrempassess_id) ON UPDATE CASCADE ON DELETE RESTRICT,
		FOREIGN KEY (totalform_mgr_commitment_id_fk) REFERENCES FormMgrCommitment(formmgrcommitment_id) ON UPDATE CASCADE ON DELETE RESTRICT,
		FOREIGN KEY (totalform_mgr_pers_assess_id_fk) REFERENCES FormMgrPersAssess(formmgrpersassess_id) ON UPDATE CASCADE ON DELETE RESTRICT,
		FOREIGN KEY (totalform_mgr_monitoring_id_fk) REFERENCES FormMgrMonitoring(formmgrmonitoring_id) ON UPDATE CASCADE ON DELETE RESTRICT,
		FOREIGN KEY (totalform_tc_equipment_id_fk) REFERENCES FormMgrWorkAssess(formmgrworkassess_id) ON UPDATE CASCADE ON DELETE RESTRICT,
		FOREIGN KEY (totalform_tc_task_id_fk) REFERENCES FormTcTask(formtctask_id) ON UPDATE CASCADE ON DELETE RESTRICT,
		FOREIGN KEY (totalform_tc_work_hours_id_fk) REFERENCES FormTcWorkHours(formtcworkhours_id) ON UPDATE CASCADE ON DELETE RESTRICT,
		FOREIGN KEY (totalform_tc_meeting_id_fk) REFERENCES FormTcMeeting(formtcmeeting_id) ON UPDATE CASCADE ON DELETE RESTRICT,
		FOREIGN KEY (totalform_tc_contact_id_fk) REFERENCES FormTcContact(formtccontact_id) ON UPDATE CASCADE ON DELETE RESTRICT,
		FOREIGN KEY (totalform_tc_commitment_id_fk) REFERENCES FormTcCommitment(formtccommitment_id) ON UPDATE CASCADE ON DELETE RESTRICT,
		FOREIGN KEY (totalform_tc_work_life_id_fk) REFERENCES FormTcWorkLife(formtcworklife_id) ON UPDATE CASCADE ON DELETE RESTRICT,
		FOREIGN KEY (totalform_tc_announcement_id_fk) REFERENCES FormTcAnnouncement(formtcannouncement_id) ON UPDATE CASCADE ON DELETE RESTRICT,
		FOREIGN KEY (totalform_user_id_fk) REFERENCES User(user_id) ON UPDATE CASCADE ON DELETE RESTRICT
);