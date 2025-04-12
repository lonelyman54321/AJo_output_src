/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 */
package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

public class GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final String TRACKING_SOURCE_DIALOG = "d";
    static final String TRACKING_SOURCE_NOTIFICATION = "n";
    private static final GoogleApiAvailabilityLight zza;

    static {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        zza = googleApiAvailabilityLight = new GoogleApiAvailabilityLight();
    }

    public static GoogleApiAvailabilityLight getInstance() {
        return zza;
    }

    public void cancelAvailabilityErrorNotifications(Context context) {
        GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
    }

    public int getApkVersion(Context context) {
        return GooglePlayServicesUtilLight.getApkVersion(context);
    }

    public int getClientVersion(Context context) {
        return GooglePlayServicesUtilLight.getClientVersion(context);
    }

    public Intent getErrorResolutionIntent(int n3) {
        return this.getErrorResolutionIntent(null, n3, null);
    }

    public Intent getErrorResolutionIntent(Context object, int n3, String object2) {
        int n4 = 1;
        String string2 = GOOGLE_PLAY_SERVICES_PACKAGE;
        if (n3 != n4 && n3 != (n4 = 2)) {
            int n7 = 3;
            object2 = null;
            if (n3 != n7) {
                return null;
            }
            n7 = zzu.zza;
            object = Uri.fromParts((String)"package", (String)string2, null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData((Uri)object);
            return intent;
        }
        if (object != null && (n3 = (int)(DeviceProperties.isWearableWithoutPlayStore(object) ? 1 : 0)) != 0) {
            int n8 = zzu.zza;
            object = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            object.setPackage("com.google.android.wearable.app");
            return object;
        }
        StringBuilder stringBuilder = new StringBuilder("gcore_");
        n4 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        stringBuilder.append(n4);
        String string3 = "-";
        stringBuilder.append(string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2) {
            stringBuilder.append((String)object2);
        }
        stringBuilder.append(string3);
        if (object != null) {
            object2 = object.getPackageName();
            stringBuilder.append((String)object2);
        }
        stringBuilder.append(string3);
        if (object != null) {
            try {
                object2 = Wrappers.packageManager(object);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            object = object.getPackageName();
            n4 = 0;
            string3 = null;
            object = ((PackageManagerWrapper)object2).getPackageInfo((String)object, 0);
            int n10 = object.versionCode;
            stringBuilder.append(n10);
        }
        object = stringBuilder.toString();
        n3 = zzu.zza;
        stringBuilder = new Intent("android.intent.action.VIEW");
        object2 = Uri.parse((String)"market://details").buildUpon();
        string3 = "id";
        object2 = object2.appendQueryParameter(string3, string2);
        n4 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
        if (n4 == 0) {
            string3 = "pcampaignid";
            object2.appendQueryParameter(string3, (String)object);
        }
        object = object2.build();
        stringBuilder.setData((Uri)object);
        stringBuilder.setPackage(GOOGLE_PLAY_STORE_PACKAGE);
        stringBuilder.addFlags(524288);
        return stringBuilder;
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int n3, int n4) {
        return this.getErrorResolutionPendingIntent(context, n3, n4, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int n3, int n4, String string2) {
        Intent intent = this.getErrorResolutionIntent(context, n3, string2);
        if (intent == null) {
            return null;
        }
        int n7 = Build.VERSION.SDK_INT;
        int n8 = 23;
        n7 = n7 >= n8 ? 0xC000000 : 0x8000000;
        return PendingIntent.getActivity((Context)context, (int)n4, (Intent)intent, (int)n7);
    }

    public String getErrorString(int n3) {
        return GooglePlayServicesUtilLight.getErrorString(n3);
    }

    public int isGooglePlayServicesAvailable(Context context) {
        int n3 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return this.isGooglePlayServicesAvailable(context, n3);
    }

    public int isGooglePlayServicesAvailable(Context context, int n3) {
        boolean bl2 = GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, n3 = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, n3));
        if (bl2) {
            return 18;
        }
        return n3;
    }

    public boolean isPlayServicesPossiblyUpdating(Context context, int n3) {
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, n3);
    }

    public boolean isPlayStorePossiblyUpdating(Context context, int n3) {
        return GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, n3);
    }

    public boolean isUninstalledAppPossiblyUpdating(Context context, String string2) {
        return GooglePlayServicesUtilLight.zza(context, string2);
    }

    public boolean isUserResolvableError(int n3) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(n3);
    }

    public void verifyGooglePlayServicesIsAvailable(Context context, int n3) {
        GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context, n3);
    }
}

