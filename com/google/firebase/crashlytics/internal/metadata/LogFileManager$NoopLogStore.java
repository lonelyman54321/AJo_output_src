/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.FileLogStore;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager$1;

final class LogFileManager$NoopLogStore
implements FileLogStore {
    private LogFileManager$NoopLogStore() {
    }

    public /* synthetic */ LogFileManager$NoopLogStore(LogFileManager$1 logFileManager$1) {
        this();
    }

    public void closeLogFile() {
    }

    public void deleteLogFile() {
    }

    public byte[] getLogAsBytes() {
        return null;
    }

    public String getLogAsString() {
        return null;
    }

    public void writeToLog(long l2, String string2) {
    }
}

