package model.database.insert;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import model.database.DBConnection;
import model.forms.mgr.FormMgrCommAssess;
import model.forms.mgr.FormMgrCommitment;
import model.forms.mgr.FormMgrEmpAssess;
import model.forms.mgr.FormMgrMonitoring;
import model.forms.mgr.FormMgrPersAssess;
import model.forms.mgr.FormMgrWorkAssess;

public class MgrInsertQueries {

	public static void insertFormMgrMonitoring(FormMgrMonitoring form)
			throws SQLException {

		Connection conn;

		try {
			conn = DBConnection.connectDB();
			try {

				Statement statement = conn.createStatement();
				statement.executeUpdate("INSERT INTO FormMgrMonitoring ("
						+ "formmgrmonitoring_question1, "
						+ "formmgrmonitoring_question2, "
						+ "formmgrmonitoring_question3, "
						+ "formmgrmonitoring_question4, "
						+ "formmgrmonitoring_question5, "
						+ "formmgrmonitoring_question6, "
						+ "formmgrmonitoring_question7, "
						+ "formmgrmonitoring_question8, "
						+ "formmgrmonitoring_question9, "
						+ "formmgrmonitoring_question10" + ") VALUES ('"
						+ form.getQuestion1().getChoice() + "', '"
						+ form.getQuestion2().getChoice() + "', '"
						+ form.getQuestion3().getChoice() + "', '"
						+ form.getQuestion4().getChoice() + "', '"
						+ form.getQuestion5().getChoice() + "', '"
						+ form.getQuestion6().getChoice() + "', '"
						+ form.getQuestion7().getChoice() + "', '"
						+ form.getQuestion8().getChoice() + "', '"
						+ form.getQuestion9().getChoice() + "', '"
						+ form.getQuestion10().getChoice() + "');");

			} finally {
				if (conn != null) {
					conn.close();
				}
			}
		} catch (Throwable ex) {
			ex.printStackTrace();
		}

	}

	public static void insertFormMgrWorkAssess(FormMgrWorkAssess form)
			throws SQLException {

		Connection conn;

		try {
			conn = DBConnection.connectDB();
			try {

				Statement statement = conn.createStatement();
				statement.executeUpdate("INSERT INTO FormMgrWorkAssess ("
						+ "formmgrworkassess_question1, "
						+ "formmgrworkassess_question2, "
						+ "formmgrworkassess_question3, "
						+ "formmgrworkassess_question4, "
						+ "formmgrworkassess_question5, "
						+ "formmgrworkassess_question6, "
						+ "formmgrworkassess_question7, "
						+ "formmgrworkassess_question8, "
						+ "formmgrworkassess_question9, "
						+ "formmgrworkassess_question10" + ") VALUES ('"
						+ form.getQuestion1().getChoice() + "', '"
						+ form.getQuestion2().getChoice() + "', '"
						+ form.getQuestion3().getChoice() + "', '"
						+ form.getQuestion4().getChoice() + "', '"
						+ form.getQuestion5().getChoice() + "', '"
						+ form.getQuestion6().getChoice() + "', '"
						+ form.getQuestion7().getChoice() + "', '"
						+ form.getQuestion8().getChoice() + "', '"
						+ form.getQuestion9().getChoice() + "', '"
						+ form.getQuestion10().getChoice() + "');");

			} finally {
				if (conn != null) {
					conn.close();
				}
			}
		} catch (Throwable ex) {
			ex.printStackTrace();
		}

	}

	public static void insertFormMgrCommAssess(FormMgrCommAssess form)
			throws SQLException {

		Connection conn;

		try {
			conn = DBConnection.connectDB();
			try {

				Statement statement = conn.createStatement();
				statement.executeUpdate("INSERT INTO FormMgrCommAssess ("
						+ "formmgrcommassess_question1, "
						+ "formmgrcommassess_question2, "
						+ "formmgrcommassess_question3, "
						+ "formmgrcommassess_question4, "
						+ "formmgrcommassess_question5, "
						+ "formmgrcommassess_question6" + ") VALUES ('"
						+ form.getQuestion1().getChoice() + "', '"
						+ form.getQuestion2().getChoice() + "', '"
						+ form.getQuestion3().getChoice() + "', '"
						+ form.getQuestion4().getChoice() + "', '"
						+ form.getQuestion5().getChoice() + "', '"
						+ form.getQuestion6().getChoice() + "');");

			} finally {
				if (conn != null) {
					conn.close();
				}
			}
		} catch (Throwable ex) {
			ex.printStackTrace();
		}

	}

	public static void insertFormMgrCommitment(FormMgrCommitment form)
			throws SQLException {

		Connection conn;

		try {
			conn = DBConnection.connectDB();
			try {

				Statement statement = conn.createStatement();
				statement.executeUpdate("INSERT INTO FormMgrCommitment ("
						+ "formmgrcommitment_question1"
						+ "formmgrcommitment_question2"
						+ "formmgrcommitment_question3"
						+ "formmgrcommitment_question4"
						+ "formmgrcommitment_question5" + ") VALUES ('"
						+ form.getQuestion1().getChoice() + "', '"
						+ form.getQuestion2().getChoice() + "', '"
						+ form.getQuestion3().getChoice() + "', '"
						+ form.getQuestion4().getChoice() + "', '"
						+ form.getQuestion5().getChoice() + "');");

			} finally {
				if (conn != null) {
					conn.close();
				}
			}
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
	}

	public static void insertFormMgrEmpAssess(FormMgrEmpAssess form)
			throws SQLException {

		Connection conn;

		try {
			conn = DBConnection.connectDB();
			try {

				Statement statement = conn.createStatement();
				statement.executeUpdate("INSERT INTO FormMgrEmpAssess ("
						+ "formmgrworkassess_question1, "
						+ "formmgrworkassess_question2, "
						+ "formmgrworkassess_question3, "
						+ "formmgrworkassess_question4, "
						+ "formmgrworkassess_question5, "
						+ "formmgrworkassess_question6, "
						+ "formmgrworkassess_question7, "
						+ "formmgrworkassess_question8, "
						+ "formmgrworkassess_question9, "
						+ "formmgrworkassess_question10, "
						+ "formmgrworkassess_question11, "
						+ "formmgrworkassess_question12, "
						+ "formmgrworkassess_question13, "
						+ "formmgrworkassess_question14, "
						+ "formmgrworkassess_question15, "
						+ "formmgrworkassess_question16, "
						+ "formmgrworkassess_question17, "
						+ "formmgrworkassess_question18, "
						+ "formmgrworkassess_question19, "
						+ "formmgrworkassess_question20, "
						+ "formmgrworkassess_question21, "
						+ "formmgrworkassess_question22, "
						+ "formmgrworkassess_question23, "
						+ "formmgrworkassess_question24, "
						+ "formmgrworkassess_question25" + ") VALUES ('"
						+ form.getQuestion1().getChoice()
						+ "', '"
						+ form.getQuestion2().getChoice()
						+ "', '"
						+ form.getQuestion3().getChoice()
						+ "', '"
						+ form.getQuestion4().getChoice()
						+ "', '"
						+ form.getQuestion5().getChoice()
						+ "', '"
						+ form.getQuestion6().getChoice()
						+ "', '"
						+ form.getQuestion7().getChoice()
						+ "', '"
						+ form.getQuestion8().getChoice()
						+ "', '"
						+ form.getQuestion9().getChoice()
						+ "', '"
						+ form.getQuestion10().getChoice()
						+ "', '"
						+ form.getQuestion11().getChoice()
						+ "', '"
						+ form.getQuestion12().getChoice()
						+ "', '"
						+ form.getQuestion13().getChoice()
						+ "', '"
						+ form.getQuestion14().getChoice()
						+ "', '"
						+ form.getQuestion15().getChoice()
						+ "', '"
						+ form.getQuestion16().getChoice()
						+ "', '"
						+ form.getQuestion17().getChoice()
						+ "', '"
						+ form.getQuestion18().getChoice()
						+ "', '"
						+ form.getQuestion19().getChoice()
						+ "', '"
						+ form.getQuestion20().getChoice()
						+ "', '"
						+ form.getQuestion21().getChoice()
						+ "', '"
						+ form.getQuestion22().getChoice()
						+ "', '"
						+ form.getQuestion23().getChoice()
						+ "', '"
						+ form.getQuestion24().getChoice()
						+ "', '"
						+ form.getQuestion25().getChoice() + "');");

			} finally {
				if (conn != null) {
					conn.close();
				}
			}
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
	}

	public static void insertFormMgrPersAssess(FormMgrPersAssess form)
			throws SQLException {

		Connection conn;

		try {
			conn = DBConnection.connectDB();
			try {

				Statement statement = conn.createStatement();
				statement.executeUpdate("INSERT INTO FormMgrPersAssess ("
						+ "formmgrpersassess_question1, "
						+ "formmgrpersassess_question2, "
						+ "formmgrpersassess_question3, "
						+ "formmgrpersassess_question4, "
						+ "formmgrpersassess_question5, "
						+ "formmgrpersassess_question6, "
						+ "formmgrpersassess_question7, "
						+ "formmgrpersassess_question8, "
						+ "formmgrpersassess_question9, "
						+ "formmgrpersassess_question10, "
						+ "formmgrpersassess_question11" + ") VALUES ('"
						+ form.getQuestion1().getChoice()
						+ "', '"
						+ form.getQuestion2().getChoice()
						+ "', '"
						+ form.getQuestion3().getChoice()
						+ "', '"
						+ form.getQuestion4().getChoice()
						+ "', '"
						+ form.getQuestion5().getChoice()
						+ "', '"
						+ form.getQuestion6().getChoice()
						+ "', '"
						+ form.getQuestion7().getChoice()
						+ "', '"
						+ form.getQuestion8().getChoice()
						+ "', '"
						+ form.getQuestion9().getChoice()
						+ "', '"
						+ form.getQuestion10().getChoice()
						+ "', '"
						+ form.getQuestion11().getChoice() + "');");

			} finally {
				if (conn != null) {
					conn.close();
				}
			}
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
	}
}
