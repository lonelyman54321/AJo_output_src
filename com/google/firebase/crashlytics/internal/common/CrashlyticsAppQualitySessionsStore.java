/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

class CrashlyticsAppQualitySessionsStore {
    private static final String AQS_SESSION_ID_FILENAME_PREFIX = "aqs.";
    private static final FilenameFilter AQS_SESSION_ID_FILE_FILTER;
    private static final Comparator FILE_RECENCY_COMPARATOR;
    private String appQualitySessionId = null;
    private final FileStore fileStore;
    private String sessionId = null;

    static {
        Object object = new Object();
        AQS_SESSION_ID_FILE_FILTER = object;
        FILE_RECENCY_COMPARATOR = object = new Object();
    }

    public CrashlyticsAppQualitySessionsStore(FileStore fileStore) {
        this.fileStore = fileStore;
    }

    public static /* synthetic */ boolean a(File file, String string2) {
        return string2.startsWith(AQS_SESSION_ID_FILENAME_PREFIX);
    }

    public static /* synthetic */ int b(File file, File file2) {
        return CrashlyticsAppQualitySessionsStore.lambda$static$1(file, file2);
    }

    private static /* synthetic */ int lambda$static$1(File file, File file2) {
        long l2 = file2.lastModified();
        long l3 = file.lastModified();
        return Long.compare(l2, l3);
    }

    private static void persist(FileStore object, String object2, String string2) {
        String string3 = AQS_SESSION_ID_FILENAME_PREFIX;
        if (object2 != null && string2 != null) {
            string2 = string3.concat(string2);
            object = ((FileStore)object).getSessionFile((String)object2, string2);
            try {
                ((File)object).createNewFile();
            }
            catch (IOException iOException) {
                object2 = Logger.getLogger();
                string2 = "Failed to persist App Quality Sessions session id.";
                ((Logger)object2).w(string2, iOException);
            }
        }
    }

    public static String readAqsSessionIdFile(FileStore object, String object2) {
        FilenameFilter filenameFilter = AQS_SESSION_ID_FILE_FILTER;
        boolean bl2 = (object = ((FileStore)object).getSessionFiles((String)object2, filenameFilter)).isEmpty();
        if (bl2) {
            Logger.getLogger().w("Unable to read App Quality Sessions session id.");
            return null;
        }
        object2 = FILE_RECENCY_COMPARATOR;
        return ((File)Collections.min(object, object2)).getName().substring(4);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getAppQualitySessionId(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object;
                try {
                    object = this.sessionId;
                    boolean bl2 = Objects.equals(object, string2);
                    if (bl2) {
                        return this.appQualitySessionId;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    object = this.fileStore;
                    return CrashlyticsAppQualitySessionsStore.readAqsSessionIdFile((FileStore)object, string2);
                }
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void rotateAppQualitySessionId(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object = this.appQualitySessionId;
                        boolean bl2 = Objects.equals(object, string2);
                        if (bl2) break block4;
                        object = this.fileStore;
                        String string3 = this.sessionId;
                        CrashlyticsAppQualitySessionsStore.persist((FileStore)object, string3, string2);
                        this.appQualitySessionId = string2;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void rotateSessionId(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object = this.sessionId;
                        boolean bl2 = Objects.equals(object, string2);
                        if (bl2) break block4;
                        object = this.fileStore;
                        String string3 = this.appQualitySessionId;
                        CrashlyticsAppQualitySessionsStore.persist((FileStore)object, string2, string3);
                        this.sessionId = string2;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

