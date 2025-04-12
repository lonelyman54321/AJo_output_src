/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileStore {
    private static final String CRASHLYTICS_PATH_V1 = ".com.google.firebase.crashlytics.files.v1";
    private static final String CRASHLYTICS_PATH_V2 = ".com.google.firebase.crashlytics.files.v2";
    private static final String CRASHLYTICS_PATH_V3 = ".crashlytics.v3";
    private static final String NATIVE_REPORTS_PATH = "native-reports";
    private static final String NATIVE_SESSION_SUBDIR = "native";
    private static final String PRIORITY_REPORTS_PATH = "priority-reports";
    private static final String REPORTS_PATH = "reports";
    private static final String SESSIONS_PATH = "open-sessions";
    private final File crashlyticsDir;
    private final File filesDir;
    private final File nativeReportsDir;
    private final File priorityReportsDir;
    final String processName;
    private final File reportsDir;
    private final File sessionsDir;

    public FileStore(Context object) {
        Comparable<StringBuilder> comparable;
        Object object2 = ProcessDetailsProvider.INSTANCE.getCurrentProcessDetails((Context)object).getProcessName();
        this.processName = object2;
        object = object.getFilesDir();
        this.filesDir = object;
        boolean bl2 = this.useV3FileSystem();
        if (bl2) {
            comparable = new Comparable<StringBuilder>(CRASHLYTICS_PATH_V3);
            String string2 = File.separator;
            ((StringBuilder)comparable).append(string2);
            object2 = FileStore.sanitizeName((String)object2);
            ((StringBuilder)comparable).append((String)object2);
            object2 = ((StringBuilder)comparable).toString();
        } else {
            object2 = CRASHLYTICS_PATH_V1;
        }
        super((File)object, (String)object2);
        object = FileStore.prepareBaseDir(comparable);
        this.crashlyticsDir = object;
        object2 = new File((File)object, SESSIONS_PATH);
        this.sessionsDir = object2 = FileStore.prepareBaseDir((File)object2);
        object2 = new File((File)object, REPORTS_PATH);
        this.reportsDir = object2 = FileStore.prepareBaseDir((File)object2);
        object2 = new File((File)object, PRIORITY_REPORTS_PATH);
        this.priorityReportsDir = object2 = FileStore.prepareBaseDir((File)object2);
        object2 = new File((File)object, NATIVE_REPORTS_PATH);
        object = FileStore.prepareBaseDir((File)object2);
        this.nativeReportsDir = object;
    }

    public static /* synthetic */ boolean a(String string2, File file, String string3) {
        return string3.startsWith(string2);
    }

    private void cleanupFileSystemDir(String object) {
        Comparable<File> comparable = this.filesDir;
        Object object2 = new File((File)comparable, (String)object);
        boolean bl2 = ((File)object2).exists();
        if (bl2 && (bl2 = FileStore.recursiveDelete((File)object2))) {
            object = Logger.getLogger();
            String string2 = "Deleted previous Crashlytics file system: ";
            comparable = new Comparable<File>(string2);
            object2 = ((File)object2).getPath();
            ((StringBuilder)comparable).append((String)object2);
            object2 = ((StringBuilder)comparable).toString();
            ((Logger)object).d((String)object2);
        }
    }

    private void cleanupFileSystemDirs(String stringArray) {
        em0_0 em0_02;
        File file = this.filesDir;
        int n3 = file.exists();
        if (n3 != 0 && (stringArray = (file = this.filesDir).list(em0_02 = new em0_0((String)stringArray))) != null) {
            n3 = stringArray.length;
            em0_02 = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                String string2 = stringArray[i3];
                this.cleanupFileSystemDir(string2);
            }
        }
    }

    private File getSessionDir(String string2) {
        File file = this.sessionsDir;
        File file2 = new File(file, string2);
        return FileStore.prepareDir(file2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static File prepareBaseDir(File file) {
        String string2 = "Could not create Crashlytics-specific directory: ";
        Object object = "Unexpected non-directory file: ";
        Class<FileStore> clazz = FileStore.class;
        synchronized (clazz) {
            Throwable throwable2;
            block7: {
                boolean bl2;
                Object object2;
                block5: {
                    block6: {
                        try {
                            boolean bl3 = file.exists();
                            if (!bl3) break block5;
                            bl3 = file.isDirectory();
                            if (!bl3) break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                        return file;
                    }
                    object2 = Logger.getLogger();
                    StringBuilder stringBuilder = new StringBuilder((String)object);
                    stringBuilder.append(file);
                    object = "; deleting file and creating new directory.";
                    stringBuilder.append((String)object);
                    object = stringBuilder.toString();
                    ((Logger)object2).d((String)object);
                    file.delete();
                }
                if (!(bl2 = file.mkdirs())) {
                    object = Logger.getLogger();
                    object2 = new StringBuilder(string2);
                    ((StringBuilder)object2).append(file);
                    string2 = ((StringBuilder)object2).toString();
                    ((Logger)object).e(string2);
                }
                return file;
            }
            throw throwable2;
        }
    }

    private static File prepareDir(File file) {
        file.mkdirs();
        return file;
    }

    public static boolean recursiveDelete(File file) {
        File[] fileArray = file.listFiles();
        if (fileArray != null) {
            for (File file2 : fileArray) {
                FileStore.recursiveDelete(file2);
            }
        }
        return file.delete();
    }

    private static List safeArrayToList(Object[] object) {
        object = object == null ? Collections.emptyList() : Arrays.asList(object);
        return object;
    }

    public static String sanitizeName(String string2) {
        int n3;
        int n4 = string2.length();
        if (n4 > (n3 = 40)) {
            return CommonUtils.sha1(string2);
        }
        return string2.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean useV3FileSystem() {
        return this.processName.isEmpty() ^ true;
    }

    public void cleanupPreviousFileSystems() {
        this.cleanupFileSystemDir(".com.google.firebase.crashlytics");
        CharSequence charSequence = ".com.google.firebase.crashlytics-ndk";
        this.cleanupFileSystemDir((String)charSequence);
        boolean bl2 = this.useV3FileSystem();
        if (bl2) {
            this.cleanupFileSystemDir(CRASHLYTICS_PATH_V1);
            charSequence = new StringBuilder(CRASHLYTICS_PATH_V2);
            String string2 = File.pathSeparator;
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
            this.cleanupFileSystemDirs((String)charSequence);
        }
    }

    public void deleteAllCrashlyticsFiles() {
        FileStore.recursiveDelete(this.crashlyticsDir);
    }

    public boolean deleteSessionFiles(String string2) {
        File file = this.sessionsDir;
        File file2 = new File(file, string2);
        return FileStore.recursiveDelete(file2);
    }

    public List getAllOpenSessionIds() {
        return FileStore.safeArrayToList(this.sessionsDir.list());
    }

    public File getCommonFile(String string2) {
        File file = this.crashlyticsDir;
        File file2 = new File(file, string2);
        return file2;
    }

    public List getCommonFiles(FilenameFilter filenameFilter) {
        return FileStore.safeArrayToList(this.crashlyticsDir.listFiles(filenameFilter));
    }

    public File getNativeReport(String string2) {
        File file = this.nativeReportsDir;
        File file2 = new File(file, string2);
        return file2;
    }

    public List getNativeReports() {
        return FileStore.safeArrayToList(this.nativeReportsDir.listFiles());
    }

    public File getNativeSessionDir(String object) {
        object = this.getSessionDir((String)object);
        File file = new File((File)object, NATIVE_SESSION_SUBDIR);
        return FileStore.prepareDir(file);
    }

    public File getPriorityReport(String string2) {
        File file = this.priorityReportsDir;
        File file2 = new File(file, string2);
        return file2;
    }

    public List getPriorityReports() {
        return FileStore.safeArrayToList(this.priorityReportsDir.listFiles());
    }

    public File getReport(String string2) {
        File file = this.reportsDir;
        File file2 = new File(file, string2);
        return file2;
    }

    public List getReports() {
        return FileStore.safeArrayToList(this.reportsDir.listFiles());
    }

    public File getSessionFile(String object, String string2) {
        object = this.getSessionDir((String)object);
        File file = new File((File)object, string2);
        return file;
    }

    public List getSessionFiles(String string2, FilenameFilter filenameFilter) {
        return FileStore.safeArrayToList(this.getSessionDir(string2).listFiles(filenameFilter));
    }
}

