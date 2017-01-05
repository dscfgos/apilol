package com.dscfgos.lol.model.classes.api;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class LogHandler extends Handler {

	private static final String FILE_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss.SSS"; // ISO 8601

	private final boolean writeToFile;
	private final PrintWriter fileWriter;

	public LogHandler() {
		this(false);
	}

	public LogHandler(boolean toFile) {
		PrintWriter out = null;
		if (toFile) {
			try {
				File log = new File("riot-api.log");
				if (!log.exists()) {
					log.createNewFile();
				}
				out = new PrintWriter(new BufferedWriter(new FileWriter(log, true)), true);
			} catch (IOException io) {
				System.err.println("Could not set log handler! Using System.out instead");
				io.printStackTrace();
				toFile = false;
			}
		}

		writeToFile = toFile;
		fileWriter = out;
	}

	@Override
	public void close() {
		if (writeToFile) {
			fileWriter.flush();
			fileWriter.close();
		}
	}

	@Override
	public void flush() {
		if (writeToFile) {
			fileWriter.flush();
		}
	}

	@Override
	public void publish(LogRecord record) {
		StringBuilder logMessage = new StringBuilder();
		DateFormat format = new SimpleDateFormat(FILE_DATE_PATTERN);

		// Timestamp
		logMessage.append("[").append(format.format(new Date())).append("] ");
		// Severity
		logMessage.append("[").append(record.getLevel()).append("] ");
		// Message
		logMessage.append(record.getMessage());
		// Stack Trace
		Throwable t = record.getThrown();
		if (t != null) {
			logMessage.append("\n");
			StringWriter stackTrace = new StringWriter();
			t.printStackTrace(new PrintWriter(stackTrace));
			logMessage.append(stackTrace.getBuffer());
		}

		System.out.println(logMessage);
		if (writeToFile) {
			fileWriter.println(logMessage);
		}
	}

}
