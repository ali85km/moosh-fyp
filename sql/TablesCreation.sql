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
			formmgrcommitment_question1 INT,
			formmgrcommitment_question2 INT,
			formmgrcommitment_question3 INT,
			formmgrcommitment_question4 INT,
			formmgrcommitment_question5 INT
	);

	CREATE TABLE FormMgrEmpAssess(
			formmgrempassess_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
			formmgrempassess_question1 INT,
			formmgrempassess_question2 INT,
			formmgrempassess_question3 INT,
			formmgrempassess_question4 INT,
			formmgrempassess_question5 INT,
			formmgrempassess_question6 INT,
			formmgrempassess_question7 INT,
			formmgrempassess_question8 INT,
			formmgrempassess_question9 INT,
			formmgrempassess_question10 INT,
			formmgrempassess_question11 INT,
			formmgrempassess_question12 INT,
			formmgrempassess_question13 INT,
			formmgrempassess_question14 INT,
			formmgrempassess_question15 INT,
			formmgrempassess_question16 INT,
			formmgrempassess_question17 INT,
			formmgrempassess_question18 INT,
			formmgrempassess_question19 INT,
			formmgrempassess_question20 INT,
			formmgrempassess_question21 INT,
			formmgrempassess_question22 INT,
			formmgrempassess_question23 INT,
			formmgrempassess_question24 INT,
			formmgrempassess_question25 INT
	);

	CREATE TABLE FormMgrPersAssess(
			formmgrpersassess_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
			formmgrpersassess_question1 INT,
			formmgrpersassess_question2 INT,
			formmgrpersassess_question3 INT,
			formmgrpersassess_question4 INT,
			formmgrpersassess_question5 INT,
			formmgrpersassess_question6 INT,
			formmgrpersassess_question7 INT,
			formmgrpersassess_question8 INT,
			formmgrpersassess_question9 INT,
			formmgrpersassess_question10 INT,
			formmgrpersassess_question11 INT
	);

	CREATE TABLE FormMgrMonitoring(
			formmgrmonitoring_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
			formmgrmonitoring_question1 INT,
			formmgrmonitoring_question2 INT,
			formmgrmonitoring_question3 INT,
			formmgrmonitoring_question4 INT,
			formmgrmonitoring_question5 INT,
			formmgrmonitoring_question6 INT,
			formmgrmonitoring_question7 INT,
			formmgrmonitoring_question8 INT,
			formmgrmonitoring_question9 INT,
			formmgrmonitoring_question10 INT
	);

	CREATE TABLE FormMgrWorkAssess(
			formmgrworkassess_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
			formmgrworkassess_question1 INT,
			formmgrworkassess_question2 INT,
			formmgrworkassess_question3 INT,
			formmgrworkassess_question4 INT,
			formmgrworkassess_question5 INT,
			formmgrworkassess_question6 INT,
			formmgrworkassess_question7 INT,
			formmgrworkassess_question8 INT,
			formmgrworkassess_question9 INT,
			formmgrworkassess_question10 INT
	);

	CREATE TABLE FormMgrCommAssess(
			formmgrcommassess_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
			formmgrcommassess_question1 INT,
			formmgrcommassess_question2 INT,
			formmgrcommassess_question3 INT,
			formmgrcommassess_question4 INT,
			formmgrcommassess_question5 INT,
			formmgrcommassess_question6 INT
	);

	CREATE TABLE FormTcWorkHours(
			formtcworkhours_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
			formtcworkhours_serie INT,
			formtcweekworkhours_week INT,
			formtcweekworkhours_mondayhours INT,
			formtcweekworkhours_tuesdayhours INT,
			formtcweekworkhours_wednesdayhours INT,
			formtcweekworkhours_thursdayhours INT,
			formtcweekworkhours_fridayhours INT,
			formtcweekworkhours_saturdayhours INT
	);

	CREATE TABLE FormTcContact(
			formtccontact_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
			formtccontact_serie INT,
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
			formtctask_enddate DATE,
			formtctask_telecommuter_id_fk INT,
			formtctask_manager_id_fk INT,
			FOREIGN KEY (formtctask_telecommuter_id_fk) REFERENCES User(user_id) ON UPDATE CASCADE ON DELETE RESTRICT,
			FOREIGN KEY (formtctask_manager_id_fk) REFERENCES User(user_id) ON UPDATE CASCADE ON DELETE RESTRICT
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
			formtcmeeting_serie INT,
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
			formtcworklife_question1 INT,
			formtcworklife_question2 INT,
			formtcworklife_question3 INT,
			formtcworklife_question4 INT
	);

	CREATE TABLE FormTcCommitment(
			formtccommitment_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
			formtccommitment_question1 INT,
			formtccommitment_question2 INT,
			formtccommitment_question3 INT,
			formtccommitment_question4 INT,
			formtccommitment_question5 INT,
			formtccommitment_question6 INT,
			formtccommitment_question7 INT
	);

	CREATE TABLE FormTcAnnouncement(
			formtcannouncement_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
			formtcannouncement_question1a INT,
			formtcannouncement_question2a INT,
			formtcannouncement_question1b INT,
			formtcannouncement_question2b INT,
			formtcannouncement_question3b INT,
			formtcannouncement_question4b INT,
			formtcannouncement_question5b INT
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