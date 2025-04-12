/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.content.res.Resources
 */
package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.zag;

public final class GooglePlayServicesUtil
extends GooglePlayServicesUtilLight {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    static {
        GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    private GooglePlayServicesUtil() {
    }

    public static Dialog getErrorDialog(int n3, Activity activity, int n4) {
        return GooglePlayServicesUtil.getErrorDialog(n3, activity, n4, null);
    }

    public static Dialog getErrorDialog(int n3, Activity activity, int n4, DialogInterface.OnCancelListener onCancelListener) {
        boolean bl2 = true;
        boolean bl3 = GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating((Context)activity, n3);
        if (bl2 == bl3) {
            n3 = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, n3, n4, onCancelListener);
    }

    public static PendingIntent getErrorPendingIntent(int n3, Context context, int n4) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, n3, n4);
    }

    public static String getErrorString(int n3) {
        return GooglePlayServicesUtilLight.getErrorString(n3);
    }

    public static Context getRemoteContext(Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    public static int isGooglePlayServicesAvailable(Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    public static int isGooglePlayServicesAvailable(Context context, int n3) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, n3);
    }

    public static boolean isUserRecoverableError(int n3) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(n3);
    }

    public static boolean showErrorDialogFragment(int n3, Activity activity, int n4) {
        return GooglePlayServicesUtil.showErrorDialogFragment(n3, activity, n4, null);
    }

    public static boolean showErrorDialogFragment(int n3, Activity activity, int n4, DialogInterface.OnCancelListener onCancelListener) {
        return GooglePlayServicesUtil.showErrorDialogFragment(n3, activity, null, n4, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int n3, Activity activity, Fragment fragment, int n4, DialogInterface.OnCancelListener onCancelListener) {
        int n7;
        boolean bl2 = true;
        boolean bl3 = GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating((Context)activity, n3);
        if (bl2 == bl3) {
            n3 = 18;
            n7 = 18;
        } else {
            n7 = n3;
        }
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, n7, n4, onCancelListener);
        }
        Intent intent = GoogleApiAvailability.getInstance().getErrorResolutionIntent((Context)activity, n7, "d");
        zag zag2 = zag.zac(fragment, intent, n4);
        if ((fragment = googleApiAvailability.zaa((Context)activity, n7, zag2, onCancelListener, null)) == null) {
            return false;
        }
        googleApiAvailability.zad(activity, (Dialog)fragment, GMS_ERROR_DIALOG, onCancelListener);
        return bl2;
    }

    public static void showErrorNotification(int n3, Context context) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        boolean bl2 = GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, n3);
        if (!bl2 && !(bl2 = GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, n3))) {
            googleApiAvailability.showErrorNotification(context, n3);
            return;
        }
        googleApiAvailability.zaf(context);
    }
}

