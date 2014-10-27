package com.dunkcoder.util;

import java.util.List;

import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;

import com.dunkcoder.hibersap.BapiCompanycodeGetlist;
import com.dunkcoder.hibersap.CompanycodeList;
import com.dunkcoder.hibersap.RfcSystemInfo;
import com.dunkcoder.hibersap.RfcsiExport;
import com.dunkcoder.hibersap.StfcConnection;

public class SapJCoUtil {

	public static String echoTextOfStfcConnection() {

		AnnotationConfiguration config = new AnnotationConfiguration("sapenvtest");
		SessionManager sessionManager = config.buildSessionManager();

		final Session session = sessionManager.openSession();
		StfcConnection conn = new StfcConnection("requtext");
		session.execute(conn);
		session.close();

		return conn.get_echotext();

	}

	public static RfcsiExport getSystemInfo() {

		AnnotationConfiguration config = new AnnotationConfiguration("sapenvtest");
		SessionManager sessionManager = config.buildSessionManager();

		final Session session = sessionManager.openSession();
		RfcSystemInfo info = new RfcSystemInfo();
		session.execute(info);
		session.close();

		return info.get_rfcsiExport();

	}

	public static List<CompanycodeList> getCompanyCodeList() {

		AnnotationConfiguration config = new AnnotationConfiguration("sapenvtest");
		SessionManager sessionManager = config.buildSessionManager();

		final Session session = sessionManager.openSession();
		BapiCompanycodeGetlist list = new BapiCompanycodeGetlist();
		session.execute(list);
		session.close();

		return list.get_companycodeList();

	}

	public static void main(String[] args) {
		echoTextOfStfcConnection();
		getSystemInfo();
		getCompanyCodeList();
	}
	
}