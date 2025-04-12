/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageInstaller$SessionInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.os.UserManager
 *  android.util.Log
 */
package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.R$string;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.zza;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.atomic.AtomicBoolean;

public class GooglePlayServicesUtilLight {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static final String GOOGLE_SERVICES_FRAMEWORK_PACKAGE = "com.google.android.gsf";
    static final AtomicBoolean sCanceledAvailabilityNotification;
    static boolean zza = false;
    private static boolean zzb = false;
    private static final AtomicBoolean zzc;

    static {
        AtomicBoolean atomicBoolean;
        sCanceledAvailabilityNotification = atomicBoolean = new AtomicBoolean();
        zzc = atomicBoolean = new AtomicBoolean();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cancelAvailabilityErrorNotifications(Context object) {
        Object object2 = sCanceledAvailabilityNotification;
        boolean bl2 = true;
        int n3 = ((AtomicBoolean)object2).getAndSet(bl2);
        if (n3 != 0) {
            return;
        }
        object2 = "notification";
        try {
            Object object3 = object.getSystemService((String)object2);
            NotificationManager notificationManager = (NotificationManager)object3;
            if (notificationManager == null) return;
            n3 = 10436;
            notificationManager.cancel(n3);
            return;
        }
        catch (SecurityException securityException) {
            return;
        }
    }

    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    public static void ensurePlayServicesAvailable(Context object, int n3) {
        Object object2 = GoogleApiAvailabilityLight.getInstance();
        n3 = ((GoogleApiAvailabilityLight)object2).isGooglePlayServicesAvailable((Context)object, n3);
        if (n3 != 0) {
            object2 = "e";
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            object = googleApiAvailabilityLight.getErrorResolutionIntent((Context)object, n3, (String)object2);
            if (object == null) {
                object = new GooglePlayServicesNotAvailableException(n3);
                throw object;
            }
            object2 = new GooglePlayServicesRepairableException(n3, "Google Play Services not available", (Intent)object);
            throw object2;
        }
    }

    public static int getApkVersion(Context context) {
        String string2;
        try {
            context = context.getPackageManager();
            string2 = GOOGLE_PLAY_SERVICES_PACKAGE;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return 0;
        }
        return context.getPackageInfo((String)string2, (int)0).versionCode;
    }

    public static int getClientVersion(Context context) {
        Preconditions.checkState(true);
        String string2 = context.getPackageName();
        return ClientLibraryUtils.getClientVersion(context, string2);
    }

    public static PendingIntent getErrorPendingIntent(int n3, Context context, int n4) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, n3, n4);
    }

    public static String getErrorString(int n3) {
        return ConnectionResult.zza(n3);
    }

    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int n3) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, n3, null);
    }

    public static Context getRemoteContext(Context context) {
        String string2 = GOOGLE_PLAY_SERVICES_PACKAGE;
        int n3 = 3;
        try {
            return context.createPackageContext(string2, n3);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        String string2;
        try {
            context = context.getPackageManager();
            string2 = GOOGLE_PLAY_SERVICES_PACKAGE;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
        return context.getResourcesForApplication(string2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean honorsDebugCertificates(Context context) {
        boolean bl2;
        boolean bl3;
        block4: {
            boolean bl4 = zza;
            bl3 = true;
            if (!bl4) {
                try {
                    PackageManagerWrapper packageManagerWrapper = Wrappers.packageManager(context);
                    String string2 = GOOGLE_PLAY_SERVICES_PACKAGE;
                    int n3 = 64;
                    packageManagerWrapper = packageManagerWrapper.getPackageInfo(string2, n3);
                    GoogleSignatureVerifier.getInstance(context);
                    zzb = packageManagerWrapper != null && !(bl2 = GoogleSignatureVerifier.zzb((PackageInfo)packageManagerWrapper, false)) && (bl2 = GoogleSignatureVerifier.zzb((PackageInfo)packageManagerWrapper, bl3)) ? bl3 : false;
                }
                catch (Throwable throwable2222) {
                }
                zza = bl3;
                break block4;
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    zza = bl3;
                    break block4;
                }
                zza = bl3;
                throw throwable2222;
            }
        }
        if (bl2 = zzb) return bl3;
        bl2 = DeviceProperties.isUserBuild();
        if (bl2) return false;
        return bl3;
    }

    public static int isGooglePlayServicesAvailable(Context context) {
        int n3 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int isGooglePlayServicesAvailable(Context object, int n3) {
        PackageInfo packageInfo;
        int n4;
        String string2;
        String string3;
        boolean bl2;
        int n7;
        Object object2;
        try {
            object2 = object.getResources();
            int n8 = R$string.common_google_play_services_unknown_issue;
            object2.getString(n8);
        }
        catch (Throwable throwable) {}
        object2 = object.getPackageName();
        String string4 = GOOGLE_PLAY_SERVICES_PACKAGE;
        int n10 = string4.equals(object2);
        if (n10 == 0 && (n10 = ((AtomicBoolean)(object2 = zzc)).get()) == 0) {
            n10 = zzah.zza((Context)object);
            if (n10 == 0) {
                object = new GooglePlayServicesMissingManifestValueException();
                throw object;
            }
            n7 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
            if (n10 != n7) {
                object = new GooglePlayServicesIncorrectManifestValueException(n10);
                throw object;
            }
        }
        n10 = DeviceProperties.isWearableWithoutPlayStore((Context)object);
        n7 = 1;
        if (n10 == 0 && (n10 = (int)(DeviceProperties.zzb((Context)object) ? 1 : 0)) == 0) {
            n10 = 1;
        } else {
            n10 = 0;
            object2 = null;
        }
        if (n3 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        Preconditions.checkArgument(bl2);
        string3 = object.getPackageName();
        PackageManager packageManager = object.getPackageManager();
        if (n10 != 0) {
            string2 = GOOGLE_PLAY_STORE_PACKAGE;
            n4 = 8256;
            try {
                string2 = packageManager.getPackageInfo(string2, n4);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                object = String.valueOf(string3);
                String string5 = " requires the Google Play Store, but it is missing.";
                ((String)object).concat(string5);
                return 9;
            }
        } else {
            string2 = null;
        }
        n4 = 64;
        try {
            packageInfo = packageManager.getPackageInfo(string4, n4);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object = String.valueOf(string3);
            String string6 = " requires Google Play services, but they are missing.";
            ((String)object).concat(string6);
            return n7;
        }
        GoogleSignatureVerifier.getInstance((Context)object);
        int n14 = GoogleSignatureVerifier.zzb(packageInfo, n7 != 0);
        if (n14 == 0) {
            object = String.valueOf(string3);
            String string7 = " requires Google Play services, but their signature is invalid.";
            ((String)object).concat(string7);
            return 9;
        }
        if (n10 != 0) {
            Preconditions.checkNotNull(string2);
            n14 = (int)(GoogleSignatureVerifier.zzb((PackageInfo)string2, n7 != 0) ? 1 : 0);
            if (n14 == 0) {
                object = String.valueOf(string3);
                String string8 = " requires Google Play Store, but its signature is invalid.";
                ((String)object).concat(string8);
                return 9;
            }
        }
        if (n10 != 0 && string2 != null && (n14 = (int)((object = ((PackageInfo)string2).signatures[0]).equals(object2 = packageInfo.signatures[0]) ? 1 : 0)) == 0) {
            object = String.valueOf(string3);
            String string9 = " requires Google Play Store, but its signature doesn't match that of Google Play services.";
            ((String)object).concat(string9);
            return 9;
        }
        n14 = com.google.android.gms.common.util.zza.zza(packageInfo.versionCode);
        if (n14 < (n3 = com.google.android.gms.common.util.zza.zza(n3))) {
            return 2;
        }
        object = packageInfo.applicationInfo;
        if (object == null) {
            try {
                object = packageManager.getApplicationInfo(string4, 0);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                String string10 = String.valueOf(string3);
                object2 = "GooglePlayServicesUtil";
                string4 = " requires Google Play services, but they're missing when getting application info.";
                string10 = string10.concat(string4);
                Log.wtf((String)object2, (String)string10, (Throwable)nameNotFoundException);
                return n7;
            }
        }
        if ((n14 = (int)(((ApplicationInfo)object).enabled ? 1 : 0)) != 0) return 0;
        return 3;
    }

    public static boolean isGooglePlayServicesUid(Context context, int n3) {
        return UidVerifier.isGooglePlayServicesUid(context, n3);
    }

    public static boolean isPlayServicesPossiblyUpdating(Context context, int n3) {
        int n4 = 18;
        int n7 = 1;
        if (n3 == n4) {
            return n7 != 0;
        }
        if (n3 == n7) {
            return GooglePlayServicesUtilLight.zza(context, GOOGLE_PLAY_SERVICES_PACKAGE);
        }
        return false;
    }

    public static boolean isPlayStorePossiblyUpdating(Context context, int n3) {
        int n4 = 9;
        if (n3 == n4) {
            return GooglePlayServicesUtilLight.zza(context, GOOGLE_PLAY_STORE_PACKAGE);
        }
        return false;
    }

    public static boolean isRestrictedUserProfile(Context object) {
        String string2;
        boolean bl2;
        Object object2 = object.getSystemService("user");
        Preconditions.checkNotNull(object2);
        object2 = (UserManager)object2;
        object = object.getPackageName();
        object = object2.getApplicationRestrictions((String)object);
        return object != null && (bl2 = ((String)(object2 = "true")).equals(object = object.getString(string2 = "restricted_profile")));
    }

    public static boolean isSidewinderDevice(Context context) {
        return DeviceProperties.isSidewinder(context);
    }

    public static boolean isUserRecoverableError(int n3) {
        int n4;
        int n7 = 1;
        if (n3 != n7 && n3 != (n4 = 2) && n3 != (n4 = 3) && n3 != (n4 = 9)) {
            return false;
        }
        return n7;
    }

    public static boolean uidHasPackageName(Context context, int n3, String string2) {
        return UidVerifier.uidHasPackageName(context, n3, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean zza(Context context, String string2) {
        boolean bl2;
        int n3;
        Object object;
        boolean bl3;
        block6: {
            String string3;
            String string4 = GOOGLE_PLAY_SERVICES_PACKAGE;
            bl3 = string2.equals(string4);
            object = context.getPackageManager();
            object = object.getPackageInstaller();
            object = object.getAllSessions().iterator();
            do {
                n3 = object.hasNext();
                bl2 = true;
                if (n3 == 0) break block6;
            } while ((n3 = (int)(string2.equals(string3 = ((PackageInstaller.SessionInfo)object.next()).getAppPackageName()) ? 1 : 0)) == 0);
            return bl2;
        }
        object = context.getPackageManager();
        n3 = 8192;
        try {
            boolean bl4;
            string2 = object.getApplicationInfo(string2, n3);
            if (bl3) {
                return ((ApplicationInfo)string2).enabled;
            }
            boolean bl5 = ((ApplicationInfo)string2).enabled;
            if (!bl5 || (bl4 = GooglePlayServicesUtilLight.isRestrictedUserProfile(context))) return false;
            return bl2;
        }
        catch (PackageManager.NameNotFoundException | Exception throwable) {}
        return false;
    }
}

