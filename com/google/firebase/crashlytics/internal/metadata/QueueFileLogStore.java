/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.FileLogStore;
import com.google.firebase.crashlytics.internal.metadata.QueueFile;
import com.google.firebase.crashlytics.internal.metadata.QueueFile$ElementReader;
import com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore$1;
import com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore$LogBytes;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

class QueueFileLogStore
implements FileLogStore {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private QueueFile logFile;
    private final int maxLogSize;
    private final File workingFile;

    public QueueFileLogStore(File file, int n3) {
        this.workingFile = file;
        this.maxLogSize = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void doWriteToLog(long l2, String string2) {
        IOException iOException2;
        block7: {
            int n3;
            QueueFile queueFile;
            String string3;
            Object object;
            block6: {
                int n4;
                StringBuilder stringBuilder;
                object = " ";
                string3 = "...";
                queueFile = this.logFile;
                if (queueFile == null) {
                    return;
                }
                if (string2 == null) {
                    string2 = "null";
                }
                try {
                    n3 = this.maxLogSize;
                    int n7 = string2.length();
                    if (n7 <= (n3 /= 4)) break block6;
                    stringBuilder = new StringBuilder(string3);
                    n4 = string2.length() - n3;
                }
                catch (IOException iOException2) {
                    break block7;
                }
                string2 = string2.substring(n4);
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
            }
            string3 = "\r";
            string2 = string2.replaceAll(string3, (String)object);
            string3 = "\n";
            string2 = string2.replaceAll(string3, (String)object);
            object = Locale.US;
            string3 = "%d %s%n";
            Object object2 = l2;
            int n8 = 2;
            Object object3 = new Object[n8];
            n3 = 0;
            queueFile = null;
            object3[0] = object2;
            int n10 = 1;
            object3[n10] = string2;
            object2 = String.format((Locale)object, string3, (Object[])object3);
            object3 = UTF_8;
            object2 = ((String)object2).getBytes((Charset)object3);
            object3 = this.logFile;
            ((QueueFile)object3).add((byte[])object2);
            while ((n10 = (int)(((QueueFile)(object2 = this.logFile)).isEmpty() ? 1 : 0)) == 0 && (n10 = ((QueueFile)(object2 = this.logFile)).usedBytes()) > (n8 = this.maxLogSize)) {
                object2 = this.logFile;
                ((QueueFile)object2).remove();
            }
            return;
        }
        Logger logger = Logger.getLogger();
        string2 = "There was a problem writing to the Crashlytics log.";
        logger.e(string2, iOException2);
    }

    private QueueFileLogStore$LogBytes getLogBytes() {
        Object object = this.workingFile;
        boolean n3 = ((File)object).exists();
        int n4 = 0;
        if (!n3) {
            return null;
        }
        this.openLogFile();
        object = this.logFile;
        if (object == null) {
            return null;
        }
        n4 = 0;
        int[] nArray = new int[]{0};
        int n7 = ((QueueFile)object).usedBytes();
        object = new byte[n7];
        Object iOException = this.logFile;
        Object object2 = new QueueFileLogStore$1(this, (byte[])object, nArray);
        try {
            ((QueueFile)iOException).forEach((QueueFile$ElementReader)object2);
        }
        catch (IOException iOException2) {
            object2 = Logger.getLogger();
            String string2 = "A problem occurred while reading the Crashlytics log file.";
            ((Logger)object2).e(string2, iOException2);
        }
        n4 = nArray[0];
        iOException = new QueueFileLogStore$LogBytes((byte[])object, n4);
        return iOException;
    }

    private void openLogFile() {
        QueueFile queueFile = this.logFile;
        if (queueFile == null) {
            Object object = this.workingFile;
            queueFile = new QueueFile((File)object);
            try {
                this.logFile = queueFile;
            }
            catch (IOException iOException) {
                object = Logger.getLogger();
                CharSequence charSequence = new StringBuilder("Could not open log file: ");
                File file = this.workingFile;
                charSequence.append(file);
                charSequence = charSequence.toString();
                ((Logger)object).e((String)charSequence, iOException);
            }
        }
    }

    public void closeLogFile() {
        CommonUtils.closeOrLog(this.logFile, "There was a problem closing the Crashlytics log file.");
        this.logFile = null;
    }

    public void deleteLogFile() {
        this.closeLogFile();
        this.workingFile.delete();
    }

    public byte[] getLogAsBytes() {
        QueueFileLogStore$LogBytes queueFileLogStore$LogBytes = this.getLogBytes();
        if (queueFileLogStore$LogBytes == null) {
            return null;
        }
        int n3 = queueFileLogStore$LogBytes.offset;
        byte[] byArray = new byte[n3];
        System.arraycopy(queueFileLogStore$LogBytes.bytes, 0, byArray, 0, n3);
        return byArray;
    }

    public String getLogAsString() {
        String string2;
        byte[] byArray = this.getLogAsBytes();
        if (byArray != null) {
            Charset charset = UTF_8;
            string2 = new String(byArray, charset);
        } else {
            string2 = null;
        }
        return string2;
    }

    public void writeToLog(long l2, String string2) {
        this.openLogFile();
        this.doWriteToLog(l2, string2);
    }
}

