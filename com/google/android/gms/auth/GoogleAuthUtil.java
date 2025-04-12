/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.UserRecoverableNotifiedException;
import com.google.android.gms.auth.zzl;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

public final class GoogleAuthUtil
extends zzl {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";

    private GoogleAuthUtil() {
    }

    public static void clearToken(Context context, String string2) {
        zzl.clearToken(context, string2);
    }

    public static List getAccountChangeEvents(Context context, int n3, String string2) {
        return zzl.getAccountChangeEvents(context, n3, string2);
    }

    public static String getAccountId(Context context, String string2) {
        return zzl.getAccountId(context, string2);
    }

    public static String getToken(Context context, Account account, String string2) {
        return zzl.getToken(context, account, string2);
    }

    public static String getToken(Context context, Account account, String string2, Bundle bundle) {
        return zzl.getToken(context, account, string2, bundle);
    }

    public static String getToken(Context context, String string2, String string3) {
        return zzl.getToken(context, string2, string3);
    }

    public static String getToken(Context context, String string2, String string3, Bundle bundle) {
        return zzl.getToken(context, string2, string3, bundle);
    }

    public static String getTokenWithNotification(Context context, Account account, String string2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        return GoogleAuthUtil.zzg(context, account, string2, bundle).zza();
    }

    public static String getTokenWithNotification(Context context, Account account, String string2, Bundle bundle, Intent intent) {
        zzl.zzf(intent);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("callback_intent", (Parcelable)intent);
        bundle.putBoolean("handle_notification", true);
        return GoogleAuthUtil.zzg(context, account, string2, bundle).zza();
    }

    public static String getTokenWithNotification(Context context, Account account, String string2, Bundle bundle, String string3, Bundle bundle2) {
        String string4 = "Authority cannot be empty or null.";
        Preconditions.checkNotEmpty(string3, string4);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        ContentResolver.validateSyncExtrasBundle((Bundle)bundle2);
        bundle.putString("authority", string3);
        bundle.putBundle("sync_extras", bundle2);
        bundle.putBoolean("handle_notification", true);
        return GoogleAuthUtil.zzg(context, account, string2, bundle).zza();
    }

    public static String getTokenWithNotification(Context context, String string2, String string3, Bundle bundle) {
        Account account = new Account(string2, GOOGLE_ACCOUNT_TYPE);
        return GoogleAuthUtil.getTokenWithNotification(context, account, string3, bundle);
    }

    public static String getTokenWithNotification(Context context, String string2, String string3, Bundle bundle, Intent intent) {
        Account account = new Account(string2, GOOGLE_ACCOUNT_TYPE);
        return GoogleAuthUtil.getTokenWithNotification(context, account, string3, bundle, intent);
    }

    public static String getTokenWithNotification(Context context, String string2, String string3, Bundle bundle, String string4, Bundle bundle2) {
        Account account = new Account(string2, GOOGLE_ACCOUNT_TYPE);
        return GoogleAuthUtil.getTokenWithNotification(context, account, string3, bundle, string4, bundle2);
    }

    public static void invalidateToken(Context context, String string2) {
        zzl.invalidateToken(context, string2);
    }

    public static Bundle removeAccount(Context context, Account account) {
        return zzl.removeAccount(context, account);
    }

    public static Boolean requestGoogleAccountsAccess(Context context) {
        return zzl.requestGoogleAccountsAccess(context);
    }

    private static TokenData zzg(Context object, Account object2, String string2, Bundle bundle) {
        GooglePlayServicesAvailabilityException googlePlayServicesAvailabilityException2;
        String string3;
        block5: {
            string3 = "User intervention required. Notification has been pushed.";
            object2 = zzl.zza(object, object2, string2, bundle);
            try {
                GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(object);
                return object2;
            }
            catch (UserRecoverableAuthException userRecoverableAuthException) {
            }
            catch (GooglePlayServicesAvailabilityException googlePlayServicesAvailabilityException2) {
                break block5;
            }
            GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(object);
            object = new UserRecoverableNotifiedException(string3, userRecoverableAuthException);
            throw object;
        }
        GooglePlayServicesUtil.showErrorNotification(googlePlayServicesAvailabilityException2.getConnectionStatusCode(), object);
        object = new UserRecoverableNotifiedException(string3, googlePlayServicesAvailabilityException2);
        throw object;
    }
}

