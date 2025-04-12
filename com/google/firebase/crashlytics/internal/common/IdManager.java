/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.os.Build
 *  android.os.Build$VERSION
 */
package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.FirebaseInstallationId;
import com.google.firebase.crashlytics.internal.common.InstallIdProvider;
import com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds;
import com.google.firebase.crashlytics.internal.common.InstallerPackageNameProvider;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class IdManager
implements InstallIdProvider {
    public static final String DEFAULT_VERSION_NAME = "0.0";
    private static final String FORWARD_SLASH_REGEX;
    private static final Pattern ID_PATTERN;
    static final String PREFKEY_ADVERTISING_ID = "crashlytics.advertising.id";
    static final String PREFKEY_FIREBASE_IID = "firebase.installation.id";
    static final String PREFKEY_INSTALLATION_UUID = "crashlytics.installation.id";
    static final String PREFKEY_LEGACY_INSTALLATION_UUID = "crashlytics.installation.id";
    private static final String SYNTHETIC_FID_PREFIX = "SYN_";
    private static final int TIMEOUT_MILLIS = 10000;
    private final Context appContext;
    private final String appIdentifier;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final FirebaseInstallationsApi firebaseInstallations;
    private InstallIdProvider$InstallIds installIds;
    private final InstallerPackageNameProvider installerPackageNameProvider;

    static {
        ID_PATTERN = Pattern.compile("[^\\p{Alnum}]");
        FORWARD_SLASH_REGEX = Pattern.quote("/");
    }

    public IdManager(Context object, String string2, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (object != null) {
            if (string2 != null) {
                this.appContext = object;
                this.appIdentifier = string2;
                this.firebaseInstallations = firebaseInstallationsApi;
                this.dataCollectionArbiter = dataCollectionArbiter;
                this.installerPackageNameProvider = object;
                return;
            }
            super("appIdentifier must not be null");
            throw object;
        }
        super("appContext must not be null");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String createAndCacheCrashlyticsInstallId(String string2, SharedPreferences sharedPreferences2) {
        String string3 = "Created new Crashlytics installation ID: ";
        synchronized (this) {
            Object object = UUID.randomUUID();
            object = ((UUID)object).toString();
            object = IdManager.formatId((String)object);
            Logger logger = Logger.getLogger();
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append((String)object);
            string3 = " for FID: ";
            stringBuilder.append(string3);
            stringBuilder.append(string2);
            string3 = stringBuilder.toString();
            logger.v(string3);
            sharedPreferences2 = sharedPreferences2.edit();
            string3 = "crashlytics.installation.id";
            sharedPreferences2 = sharedPreferences2.putString(string3, (String)object);
            string3 = PREFKEY_FIREBASE_IID;
            string2 = sharedPreferences2.putString(string3, string2);
            string2.apply();
            return object;
        }
    }

    public static String createSyntheticFid() {
        StringBuilder stringBuilder = new StringBuilder(SYNTHETIC_FID_PREFIX);
        String string2 = UUID.randomUUID().toString();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private static String formatId(String string2) {
        string2 = ID_PATTERN.matcher(string2).replaceAll("");
        Locale locale = Locale.US;
        return string2.toLowerCase(locale);
    }

    public static boolean isSyntheticFid(String string2) {
        String string3;
        boolean bl2;
        if (string2 != null && (bl2 = string2.startsWith(string3 = SYNTHETIC_FID_PREFIX))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    private String readCachedCrashlyticsInstallId(SharedPreferences sharedPreferences2) {
        return sharedPreferences2.getString("crashlytics.installation.id", null);
    }

    private String removeForwardSlashesIn(String string2) {
        String string3 = FORWARD_SLASH_REGEX;
        return string2.replaceAll(string3, "");
    }

    private boolean shouldRefresh() {
        boolean bl2;
        Object object = this.installIds;
        if (!(object == null || (object = ((InstallIdProvider$InstallIds)object).getFirebaseInstallationId()) == null && (bl2 = ((DataCollectionArbiter)(object = this.dataCollectionArbiter)).isAutomaticDataCollectionEnabled()))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public FirebaseInstallationId fetchTrueFid(boolean bl2) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        long l2;
        block14: {
            CrashlyticsWorkers.checkNotMainThread();
            l2 = 10000L;
            object4 = null;
            if (bl2) {
                object3 = this.firebaseInstallations;
                object2 = null;
                object3 = object3.getToken(false);
                object2 = TimeUnit.MILLISECONDS;
                object3 = Tasks.await((Task)object3, l2, (TimeUnit)((Object)object2));
                object3 = (InstallationTokenResult)object3;
                try {
                    object3 = ((InstallationTokenResult)object3).getToken();
                    break block14;
                }
                catch (Exception exception) {
                    object2 = Logger.getLogger();
                    object = "Error getting Firebase authentication token.";
                    ((Logger)object2).w((String)object, exception);
                }
            }
            bl2 = false;
            object3 = null;
        }
        object2 = this.firebaseInstallations;
        object2 = object2.getId();
        object = TimeUnit.MILLISECONDS;
        Object object5 = Tasks.await((Task)object2, l2, (TimeUnit)((Object)object));
        try {
            object4 = object5 = (String)object5;
        }
        catch (Exception exception) {
            Logger logger = Logger.getLogger();
            object2 = "Error getting Firebase installation id.";
            logger.w((String)object2, exception);
        }
        object5 = new FirebaseInstallationId((String)object4, (String)object3);
        return object5;
    }

    public String getAppIdentifier() {
        return this.appIdentifier;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public InstallIdProvider$InstallIds getInstallIds() {
        Object object = "Install IDs: ";
        Object object2 = "Fetched Firebase Installation ID: ";
        Object object3 = "Cached Firebase Installation ID: ";
        synchronized (this) {
            Throwable throwable2;
            block14: {
                try {
                    boolean bl2 = this.shouldRefresh();
                    if (!bl2) {
                        return this.installIds;
                    }
                }
                catch (Throwable throwable2) {
                    break block14;
                }
                {
                    Logger logger = Logger.getLogger();
                    String string2 = "Determining Crashlytics installation ID...";
                    logger.v(string2);
                    logger = this.appContext;
                    logger = CommonUtils.getSharedPrefs((Context)logger);
                    string2 = PREFKEY_FIREBASE_IID;
                    string2 = logger.getString(string2, null);
                    Logger logger2 = Logger.getLogger();
                    StringBuilder stringBuilder = new StringBuilder((String)object3);
                    stringBuilder.append(string2);
                    object3 = stringBuilder.toString();
                    logger2.v((String)object3);
                    object3 = this.dataCollectionArbiter;
                    boolean bl3 = ((DataCollectionArbiter)object3).isAutomaticDataCollectionEnabled();
                    if (bl3) {
                        boolean bl4;
                        bl3 = false;
                        object3 = null;
                        object3 = this.fetchTrueFid(false);
                        logger2 = Logger.getLogger();
                        stringBuilder = new StringBuilder((String)object2);
                        object2 = ((FirebaseInstallationId)object3).getFid();
                        stringBuilder.append((String)object2);
                        object2 = stringBuilder.toString();
                        logger2.v((String)object2);
                        object2 = ((FirebaseInstallationId)object3).getFid();
                        if (object2 == null) {
                            object2 = string2 == null ? IdManager.createSyntheticFid() : string2;
                            object3 = new FirebaseInstallationId((String)object2, null);
                        }
                        if (bl4 = Objects.equals(object2 = ((FirebaseInstallationId)object3).getFid(), string2)) {
                            object2 = this.readCachedCrashlyticsInstallId((SharedPreferences)logger);
                            this.installIds = object2 = InstallIdProvider$InstallIds.create((String)object2, (FirebaseInstallationId)object3);
                        } else {
                            object2 = ((FirebaseInstallationId)object3).getFid();
                            object2 = this.createAndCacheCrashlyticsInstallId((String)object2, (SharedPreferences)logger);
                            this.installIds = object2 = InstallIdProvider$InstallIds.create((String)object2, (FirebaseInstallationId)object3);
                        }
                    } else {
                        boolean bl5 = IdManager.isSyntheticFid(string2);
                        if (bl5) {
                            object2 = this.readCachedCrashlyticsInstallId((SharedPreferences)logger);
                            this.installIds = object2 = InstallIdProvider$InstallIds.createWithoutFid((String)object2);
                        } else {
                            object2 = IdManager.createSyntheticFid();
                            object2 = this.createAndCacheCrashlyticsInstallId((String)object2, (SharedPreferences)logger);
                            this.installIds = object2 = InstallIdProvider$InstallIds.createWithoutFid((String)object2);
                        }
                    }
                    object2 = Logger.getLogger();
                    object3 = new StringBuilder((String)object);
                    object = this.installIds;
                    ((StringBuilder)object3).append(object);
                    object = ((StringBuilder)object3).toString();
                    ((Logger)object2).v((String)object);
                    return this.installIds;
                }
            }
            throw throwable2;
        }
    }

    public String getInstallerPackageName() {
        InstallerPackageNameProvider installerPackageNameProvider = this.installerPackageNameProvider;
        Context context = this.appContext;
        return installerPackageNameProvider.getInstallerPackageName(context);
    }

    public String getModelName() {
        Object object = Locale.US;
        object = Build.MANUFACTURER;
        object = this.removeForwardSlashesIn((String)object);
        String string2 = Build.MODEL;
        string2 = this.removeForwardSlashesIn(string2);
        return n1.a((String)object, "/", string2);
    }

    public String getOsBuildVersionString() {
        String string2 = Build.VERSION.INCREMENTAL;
        return this.removeForwardSlashesIn(string2);
    }

    public String getOsDisplayVersionString() {
        String string2 = Build.VERSION.RELEASE;
        return this.removeForwardSlashesIn(string2);
    }
}

