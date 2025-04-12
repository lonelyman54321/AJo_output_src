/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.app.Dialog
 *  android.app.FragmentManager
 *  android.app.Notification
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.pm.ApplicationInfo
 *  android.util.TypedValue
 *  android.view.View
 *  android.widget.ProgressBar
 */
package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.base.R$drawable;
import com.google.android.gms.base.R$string;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.ErrorDialogFragment;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.zaa;
import com.google.android.gms.common.zab;
import com.google.android.gms.common.zac;
import com.google.android.gms.common.zad;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

public class GoogleApiAvailability
extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final Object zaa;
    private static final GoogleApiAvailability zab;
    private String zac;

    static {
        Object object;
        zaa = object = new Object();
        zab = object = new GoogleApiAvailability();
        GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    public static final Task zai(HasApiKey object, HasApiKey ... hasApiKeyArray) {
        ArrayList<HasApiKey> arrayList = "Requested API must not be null.";
        Preconditions.checkNotNull(object, arrayList);
        for (HasApiKey hasApiKey : hasApiKeyArray) {
            Preconditions.checkNotNull(hasApiKey, arrayList);
        }
        int n3 = hasApiKeyArray.length + 1;
        arrayList = new ArrayList<HasApiKey>(n3);
        arrayList.add((HasApiKey)object);
        object = Arrays.asList(hasApiKeyArray);
        arrayList.addAll((Collection<HasApiKey>)object);
        return GoogleApiManager.zaj().zam(arrayList);
    }

    public Task checkApiAvailability(GoogleApi object, GoogleApi ... object2) {
        object = GoogleApiAvailability.zai((HasApiKey)object, object2);
        object2 = com.google.android.gms.common.zab.zaa;
        return ((Task)object).onSuccessTask((SuccessContinuation)object2);
    }

    public Task checkApiAvailability(HasApiKey object, HasApiKey ... object2) {
        object = GoogleApiAvailability.zai((HasApiKey)object, object2);
        object2 = com.google.android.gms.common.zaa.zaa;
        return ((Task)object).onSuccessTask((SuccessContinuation)object2);
    }

    public int getClientVersion(Context context) {
        return super.getClientVersion(context);
    }

    public Dialog getErrorDialog(Activity activity, int n3, int n4) {
        return this.getErrorDialog(activity, n3, n4, null);
    }

    public Dialog getErrorDialog(Activity activity, int n3, int n4, DialogInterface.OnCancelListener onCancelListener) {
        Intent intent = this.getErrorResolutionIntent((Context)activity, n3, "d");
        zag zag2 = zag.zab(activity, intent, n4);
        return this.zaa((Context)activity, n3, zag2, onCancelListener, null);
    }

    public Dialog getErrorDialog(Fragment fragment, int n3, int n4) {
        return this.getErrorDialog(fragment, n3, n4, null);
    }

    public Dialog getErrorDialog(Fragment fragment, int n3, int n4, DialogInterface.OnCancelListener onCancelListener) {
        Context context = fragment.requireContext();
        context = this.getErrorResolutionIntent(context, n3, "d");
        Context context2 = fragment.requireContext();
        zag zag2 = zag.zac(fragment, (Intent)context, n4);
        return this.zaa(context2, n3, zag2, onCancelListener, null);
    }

    public Intent getErrorResolutionIntent(Context context, int n3, String string2) {
        return super.getErrorResolutionIntent(context, n3, string2);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int n3, int n4) {
        return super.getErrorResolutionPendingIntent(context, n3, n4);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        boolean bl2 = connectionResult.hasResolution();
        if (bl2) {
            return connectionResult.getResolution();
        }
        int n3 = connectionResult.getErrorCode();
        return this.getErrorResolutionPendingIntent(context, n3, 0);
    }

    public final String getErrorString(int n3) {
        return super.getErrorString(n3);
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    public int isGooglePlayServicesAvailable(Context context, int n3) {
        return super.isGooglePlayServicesAvailable(context, n3);
    }

    public final boolean isUserResolvableError(int n3) {
        return super.isUserResolvableError(n3);
    }

    public Task makeGooglePlayServicesAvailable(Activity object) {
        int n3 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        n3 = this.isGooglePlayServicesAvailable((Context)object, n3);
        if (n3 == 0) {
            object = Tasks.forResult(null);
        } else {
            object = zacc.zaa((Activity)object);
            ConnectionResult connectionResult = new ConnectionResult(n3, null);
            n3 = 0;
            ((zap)object).zah(connectionResult, 0);
            object = ((zacc)object).zad();
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setDefaultNotificationChannelId(Context object, String string2) {
        boolean bl2 = PlatformVersion.isAtLeastO();
        if (bl2) {
            String string3 = "notification";
            object = v42_0.a((NotificationManager)Preconditions.checkNotNull(object.getSystemService(string3)), string2);
            Preconditions.checkNotNull(object);
        }
        object = zaa;
        synchronized (object) {
            this.zac = string2;
            return;
        }
    }

    public boolean showErrorDialogFragment(Activity activity, int n3, int n4) {
        return this.showErrorDialogFragment(activity, n3, n4, null);
    }

    public boolean showErrorDialogFragment(Activity activity, int n3, int n4, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialog = this.getErrorDialog(activity, n3, n4, onCancelListener);
        if (dialog == null) {
            return false;
        }
        this.zad(activity, dialog, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public boolean showErrorDialogFragment(Activity activity, int n3, I3 i3, DialogInterface.OnCancelListener onCancelListener) {
        zac zac2 = new zac(this, activity, n3, i3);
        Dialog dialog = this.zaa((Context)activity, n3, null, onCancelListener, zac2);
        if (dialog == null) {
            return false;
        }
        this.zad(activity, dialog, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void showErrorNotification(Context context, int n3) {
        PendingIntent pendingIntent = this.getErrorResolutionPendingIntent(context, n3, 0, "n");
        this.zae(context, n3, null, pendingIntent);
    }

    public void showErrorNotification(Context context, ConnectionResult connectionResult) {
        PendingIntent pendingIntent = this.getErrorResolutionPendingIntent(context, connectionResult);
        int n3 = connectionResult.getErrorCode();
        this.zae(context, n3, null, pendingIntent);
    }

    public final Dialog zaa(Context object, int n3, zag zag2, DialogInterface.OnCancelListener object2, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = null;
        if (n3 == 0) {
            return null;
        }
        Object object3 = new TypedValue();
        Object object4 = object.getTheme();
        int n4 = 16843529;
        boolean bl2 = true;
        object4.resolveAttribute(n4, object3, bl2);
        object4 = object.getResources();
        int n7 = object3.resourceId;
        object3 = object4.getResourceEntryName(n7);
        object4 = "Theme.Dialog.Alert";
        n7 = (int)(((String)object4).equals(object3) ? 1 : 0);
        if (n7 != 0) {
            n7 = 5;
            builder = new AlertDialog.Builder((Context)object, n7);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder((Context)object);
        }
        object3 = com.google.android.gms.common.internal.zac.zac((Context)object, n3);
        builder.setMessage((CharSequence)object3);
        if (object2 != null) {
            builder.setOnCancelListener(object2);
        }
        if ((object2 = com.google.android.gms.common.internal.zac.zab((Context)object, n3)) != null) {
            if (zag2 == null) {
                zag2 = onClickListener;
            }
            builder.setPositiveButton((CharSequence)object2, (DialogInterface.OnClickListener)zag2);
        }
        if ((object = com.google.android.gms.common.internal.zac.zaf((Context)object, n3)) != null) {
            builder.setTitle((CharSequence)object);
        }
        object = new StringBuilder("Creating dialog for Google Play services availability issue. ConnectionResult=");
        ((StringBuilder)object).append(n3);
        new IllegalArgumentException();
        return builder.create();
    }

    public final Dialog zab(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        Object object = new ProgressBar((Context)activity, null, 16842874);
        object.setIndeterminate(true);
        object.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)activity);
        builder.setView((View)object);
        object = com.google.android.gms.common.internal.zac.zac((Context)activity, 18);
        builder.setMessage((CharSequence)object);
        builder.setPositiveButton((CharSequence)"", null);
        object = builder.create();
        this.zad(activity, (Dialog)object, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return object;
    }

    public final zabx zac(Context context, zabw zabw2) {
        Object object = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        object.addDataScheme("package");
        zabx zabx2 = new zabx(zabw2);
        zao.zaa(context, zabx2, object);
        zabx2.zaa(context);
        object = GOOGLE_PLAY_SERVICES_PACKAGE;
        boolean bl2 = this.isUninstalledAppPossiblyUpdating(context, (String)object);
        if (!bl2) {
            zabw2.zaa();
            zabx2.zab();
            return null;
        }
        return zabx2;
    }

    public final void zad(Activity object, Dialog dialog, String string2, DialogInterface.OnCancelListener onCancelListener) {
        boolean bl2 = object instanceof FragmentActivity;
        if (bl2) {
            object = ((FragmentActivity)object).getSupportFragmentManager();
            SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show((androidx.fragment.app.FragmentManager)object, string2);
            return;
        }
        object = object.getFragmentManager();
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show((FragmentManager)object, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zae(Context object, int n3, String object2, PendingIntent object3) {
        int n4;
        CharSequence charSequence;
        int n7;
        object2 = new IllegalArgumentException();
        int n8 = 18;
        if (n3 == n8) {
            this.zaf((Context)object);
            return;
        }
        if (object3 == null) {
            return;
        }
        object2 = com.google.android.gms.common.internal.zac.zae((Context)object, n3);
        CharSequence charSequence2 = com.google.android.gms.common.internal.zac.zad((Context)object, n3);
        Object object4 = object.getResources();
        NotificationManager notificationManager = (NotificationManager)Preconditions.checkNotNull(object.getSystemService("notification"));
        J42 j42 = new J42((Context)object, null);
        j42.y = n7 = 1;
        j42.d(16, n7 != 0);
        j42.e = object2 = J42.b((CharSequence)object2);
        object2 = new U42();
        ((g42_0)object2).e = charSequence = J42.b(charSequence2);
        j42.g((U42)object2);
        n8 = (int)(DeviceProperties.isWearable((Context)object) ? 1 : 0);
        int n10 = 2;
        if (n8 != 0) {
            Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
            object2 = object.getApplicationInfo();
            n8 = ((ApplicationInfo)object2).icon;
            charSequence2 = j42.P;
            ((Notification)charSequence2).icon = n8;
            j42.l = n10;
            n8 = (int)(DeviceProperties.isWearableWithoutPlayStore((Context)object) ? 1 : 0);
            if (n8 != 0) {
                n8 = R$drawable.common_full_open_on_phone;
                n4 = R$string.common_open_on_phone;
                charSequence2 = object4.getString(n4);
                object4 = j42.b;
                A42 a42 = new A42(n8, (String)charSequence2, (PendingIntent)object3);
                ((ArrayList)object4).add(a42);
            } else {
                j42.g = object3;
            }
        } else {
            long l2;
            int n14;
            object2 = j42.P;
            ((Notification)object2).icon = n14 = 17301642;
            n8 = R$string.common_google_play_services_notification_ticker;
            object2 = object4.getString(n8);
            object4 = j42.P;
            ((Notification)object4).tickerText = object2 = J42.b((CharSequence)object2);
            j42.P.when = l2 = System.currentTimeMillis();
            j42.g = object3;
            j42.f = object2 = J42.b(charSequence2);
        }
        n8 = (int)(PlatformVersion.isAtLeastO() ? 1 : 0);
        if (n8 != 0) {
            n8 = (int)(PlatformVersion.isAtLeastO() ? 1 : 0);
            Preconditions.checkState(n8 != 0);
            object2 = zaa;
            // MONITORENTER : object2
            object3 = this.zac;
            // MONITOREXIT : object2
            if (object3 == null) {
                object3 = "com.google.android.gms.availability";
                object2 = p01_0.a(notificationManager);
                object = object.getResources();
                n4 = R$string.common_google_play_services_notification_channel_name;
                object = object.getString(n4);
                if (object2 == null) {
                    object = Ih0.a((String)object);
                    x31.a(notificationManager, (NotificationChannel)object);
                } else {
                    charSequence2 = q01_0.a((NotificationChannel)object2);
                    n4 = (int)(((String)object).contentEquals(charSequence2) ? 1 : 0);
                    if (n4 == 0) {
                        r01_0.b((NotificationChannel)object2, (String)object);
                        x31.a(notificationManager, (NotificationChannel)object2);
                    }
                }
            }
            j42.I = object3;
        }
        object = j42.a();
        if (n3 != n7 && n3 != n10 && n3 != (n8 = 3)) {
            n3 = 39789;
        } else {
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.sCanceledAvailabilityNotification;
            n8 = 0;
            object2 = null;
            atomicBoolean.set(false);
            n3 = 10436;
        }
        notificationManager.notify(n3, (Notification)object);
    }

    public final void zaf(Context context) {
        zad zad2 = new zad(this, context);
        zad2.sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean zag(Activity activity, LifecycleFragment lifecycleFragment, int n3, int n4, DialogInterface.OnCancelListener onCancelListener) {
        int n7;
        Intent intent = this.getErrorResolutionIntent((Context)activity, n3, "d");
        zag zag2 = zag.zad(lifecycleFragment, intent, n7 = 2);
        if ((lifecycleFragment = this.zaa((Context)activity, n3, zag2, onCancelListener, null)) == null) {
            return false;
        }
        this.zad(activity, (Dialog)lifecycleFragment, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean zah(Context context, ConnectionResult connectionResult, int n3) {
        PendingIntent pendingIntent;
        int n4 = InstantApps.isInstantApp(context);
        if (n4 == 0 && (pendingIntent = this.getErrorResolutionPendingIntent(context, connectionResult)) != null) {
            int n7 = connectionResult.getErrorCode();
            boolean bl2 = true;
            Intent intent = GoogleApiActivity.zaa(context, pendingIntent, n3, bl2);
            n4 = com.google.android.gms.internal.base.zap.zaa | 0x8000000;
            intent = PendingIntent.getActivity((Context)context, (int)0, (Intent)intent, (int)n4);
            this.zae(context, n7, null, (PendingIntent)intent);
            return bl2;
        }
        return false;
    }
}

