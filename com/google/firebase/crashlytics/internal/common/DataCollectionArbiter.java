/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;

public class DataCollectionArbiter {
    private static final String FIREBASE_CRASHLYTICS_COLLECTION_ENABLED = "firebase_crashlytics_collection_enabled";
    private Boolean crashlyticsDataCollectionEnabled;
    TaskCompletionSource dataCollectionEnabledTask;
    private final TaskCompletionSource dataCollectionExplicitlyApproved;
    private final FirebaseApp firebaseApp;
    private boolean setInManifest;
    private final SharedPreferences sharedPreferences;
    private final Object taskLock;
    boolean taskResolved;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DataCollectionArbiter(FirebaseApp object) {
        TaskCompletionSource taskCompletionSource;
        Object object2;
        this.taskLock = object2 = new Object();
        this.dataCollectionEnabledTask = taskCompletionSource = new TaskCompletionSource();
        this.taskResolved = false;
        this.setInManifest = false;
        this.dataCollectionExplicitlyApproved = taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource = ((FirebaseApp)object).getApplicationContext();
        this.firebaseApp = object;
        object = CommonUtils.getSharedPrefs((Context)taskCompletionSource);
        this.sharedPreferences = object;
        object = this.getDataCollectionValueFromSharedPreferences();
        if (object == null) {
            object = this.getDataCollectionValueFromManifest((Context)taskCompletionSource);
        }
        this.crashlyticsDataCollectionEnabled = object;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        boolean bl2 = this.isAutomaticDataCollectionEnabled();
                        if (!bl2) break block4;
                        object = this.dataCollectionEnabledTask;
                        taskCompletionSource = null;
                        ((TaskCompletionSource)object).trySetResult(null);
                        this.taskResolved = bl2 = true;
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

    private Boolean getDataCollectionValueFromManifest(Context object) {
        if ((object = DataCollectionArbiter.readCrashlyticsDataCollectionEnabledFromManifest(object)) == null) {
            this.setInManifest = false;
            return null;
        }
        this.setInManifest = true;
        return Boolean.TRUE.equals(object);
    }

    private Boolean getDataCollectionValueFromSharedPreferences() {
        SharedPreferences sharedPreferences2 = this.sharedPreferences;
        String string2 = FIREBASE_CRASHLYTICS_COLLECTION_ENABLED;
        boolean bl2 = sharedPreferences2.contains(string2);
        if (bl2) {
            this.setInManifest = false;
            return this.sharedPreferences.getBoolean(string2, true);
        }
        return null;
    }

    private boolean isFirebaseDataCollectionDefaultEnabled() {
        FirebaseApp firebaseApp;
        try {
            firebaseApp = this.firebaseApp;
        }
        catch (IllegalStateException illegalStateException) {
            return false;
        }
        return firebaseApp.isDataCollectionDefaultEnabled();
    }

    private void logDataCollectionState(boolean bl2) {
        boolean bl3;
        String string2 = bl2 ? "ENABLED" : "DISABLED";
        Object object = this.crashlyticsDataCollectionEnabled;
        object = object == null ? "global Firebase setting" : ((bl3 = this.setInManifest) ? "firebase_crashlytics_collection_enabled manifest flag" : "API");
        Logger logger = Logger.getLogger();
        string2 = uc0_0.a("Crashlytics automatic data collection ", string2, " by ", (String)object, ".");
        logger.d(string2);
    }

    private static Boolean readCrashlyticsDataCollectionEnabledFromManifest(Context object) {
        block9: {
            Object object2 = FIREBASE_CRASHLYTICS_COLLECTION_ENABLED;
            Object object3 = object.getPackageManager();
            if (object3 == null) break block9;
            object = object.getPackageName();
            int n3 = 128;
            object = object3.getApplicationInfo((String)object, n3);
            if (object == null) break block9;
            object3 = object.metaData;
            if (object3 == null) break block9;
            boolean bl2 = object3.containsKey((String)object2);
            if (!bl2) break block9;
            object = object.metaData;
            boolean bl3 = object.getBoolean((String)object2);
            try {
                return bl3;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                object2 = Logger.getLogger();
                object3 = "Could not read data collection permission from manifest";
                ((Logger)object2).e((String)object3, nameNotFoundException);
            }
        }
        return null;
    }

    private static void storeDataCollectionValueInSharedPreferences(SharedPreferences sharedPreferences2, Boolean bl2) {
        sharedPreferences2 = sharedPreferences2.edit();
        String string2 = FIREBASE_CRASHLYTICS_COLLECTION_ENABLED;
        if (bl2 != null) {
            boolean bl3 = bl2;
            sharedPreferences2.putBoolean(string2, bl3);
        } else {
            sharedPreferences2.remove(string2);
        }
        sharedPreferences2.apply();
    }

    public void grantDataCollectionPermission(boolean bl2) {
        if (bl2) {
            this.dataCollectionExplicitlyApproved.trySetResult(null);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("An invalid data collection token was used.");
        throw illegalStateException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isAutomaticDataCollectionEnabled() {
        synchronized (this) {
            Throwable throwable2;
            block3: {
                boolean bl2;
                try {
                    Boolean bl3 = this.crashlyticsDataCollectionEnabled;
                    bl2 = bl3 != null ? bl3.booleanValue() : this.isFirebaseDataCollectionDefaultEnabled();
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                this.logDataCollectionState(bl2);
                return bl2;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setCrashlyticsDataCollectionEnabled(Boolean var1_1) {
        synchronized (this) {
            block15: {
                block14: {
                    var2_3 = false;
                    var3_4 = null;
                    if (var1_1 == null) break block14;
                    try {
                        this.setInManifest = false;
                    }
                    catch (Throwable var1_2) {
                        break block15;
                    }
                }
                if (var1_1 != null) {
                    var4_6 = var1_1;
                } else {
                    var4_6 = this.firebaseApp;
                    var4_6 = var4_6.getApplicationContext();
                    var4_6 = this.getDataCollectionValueFromManifest((Context)var4_6);
                }
                this.crashlyticsDataCollectionEnabled = var4_6;
                var4_6 = this.sharedPreferences;
                DataCollectionArbiter.storeDataCollectionValueInSharedPreferences((SharedPreferences)var4_6, (Boolean)var1_1);
                var1_1 = this.taskLock;
                synchronized (var1_1) {
                    block12: {
                        block11: {
                            try {
                                var5_7 = this.isAutomaticDataCollectionEnabled();
                                if (!var5_7) break block11;
                                var2_3 = this.taskResolved;
                                if (!var2_3) {
                                    var3_4 = this.dataCollectionEnabledTask;
                                    var5_7 = false;
                                    var4_6 = null;
                                    var3_4.trySetResult(null);
                                    this.taskResolved = var2_3 = true;
                                }
                                break block12;
                            }
                            catch (Throwable var3_5) {
                                ** break block13
                            }
                        }
                        var5_7 = this.taskResolved;
                        if (var5_7) {
                            this.dataCollectionEnabledTask = var4_6 = new TaskCompletionSource();
                            this.taskResolved = false;
                        }
                    }
                    return;
lbl-1000:
                    // 1 sources

                    {
                        throw var3_5;
                    }
                }
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Task waitForAutomaticDataCollectionEnabled() {
        Object object = this.taskLock;
        synchronized (object) {
            TaskCompletionSource taskCompletionSource = this.dataCollectionEnabledTask;
            return taskCompletionSource.getTask();
        }
    }

    public Task waitForDataCollectionPermission() {
        Task task2 = this.dataCollectionExplicitlyApproved.getTask();
        Task task3 = this.waitForAutomaticDataCollectionEnabled();
        return CrashlyticsTasks.race(task2, task3);
    }
}

