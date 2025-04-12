/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.FileLogStore;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager$NoopLogStore;
import com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;

public class LogFileManager {
    private static final String LOGFILE_NAME = "userlog";
    static final int MAX_LOG_SIZE = 65536;
    private static final LogFileManager$NoopLogStore NOOP_LOG_STORE;
    private FileLogStore currentLog;
    private final FileStore fileStore;

    static {
        LogFileManager$NoopLogStore logFileManager$NoopLogStore;
        NOOP_LOG_STORE = logFileManager$NoopLogStore = new LogFileManager$NoopLogStore(null);
    }

    public LogFileManager(FileStore object) {
        this.fileStore = object;
        this.currentLog = object = NOOP_LOG_STORE;
    }

    public LogFileManager(FileStore fileStore, String string2) {
        this(fileStore);
        this.setCurrentSession(string2);
    }

    private File getWorkingFileForSession(String string2) {
        return this.fileStore.getSessionFile(string2, LOGFILE_NAME);
    }

    public void clearLog() {
        this.currentLog.deleteLogFile();
    }

    public byte[] getBytesForLog() {
        return this.currentLog.getLogAsBytes();
    }

    public String getLogString() {
        return this.currentLog.getLogAsString();
    }

    public final void setCurrentSession(String object) {
        this.currentLog.closeLogFile();
        LogFileManager$NoopLogStore logFileManager$NoopLogStore = NOOP_LOG_STORE;
        this.currentLog = logFileManager$NoopLogStore;
        if (object == null) {
            return;
        }
        object = this.getWorkingFileForSession((String)object);
        this.setLogFile((File)object, 65536);
    }

    public void setLogFile(File file, int n3) {
        QueueFileLogStore queueFileLogStore = new QueueFileLogStore(file, n3);
        this.currentLog = queueFileLogStore;
    }

    public void writeToLog(long l2, String string2) {
        this.currentLog.writeToLog(l2, string2);
    }
}

