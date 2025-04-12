/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.IntentSender$SendIntentException
 *  android.os.Build
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.Preconditions;

public class GoogleApiActivity
extends Activity
implements DialogInterface.OnCancelListener {
    protected int zaa = 0;

    public static Intent zaa(Context context, PendingIntent pendingIntent, int n3, boolean bl2) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", (Parcelable)pendingIntent);
        intent.putExtra("failing_client_id", n3);
        intent.putExtra("notify_manager", bl2);
        return intent;
    }

    private final void zab() {
        Object object = this.getIntent().getExtras();
        if (object == null) {
            this.finish();
            return;
        }
        Object object2 = (PendingIntent)object.get("pending_intent");
        Object object3 = (Integer)object.get("error_code");
        if (object2 == null && object3 == null) {
            this.finish();
            return;
        }
        int n3 = 1;
        if (object2 != null) {
            IntentSender intentSender = object2.getIntentSender();
            int n4 = 1;
            Object object4 = this;
            this.startIntentSenderForResult(intentSender, n4, null, 0, 0, 0);
            try {
                this.zaa = n3;
                return;
            }
            catch (ActivityNotFoundException activityNotFoundException) {
            }
            catch (IntentSender.SendIntentException sendIntentException) {
                this.finish();
                return;
            }
            object3 = "notify_manager";
            boolean bl2 = object.getBoolean((String)object3, n3 != 0);
            if (bl2) {
                object = GoogleApiManager.zak((Context)this);
                object2 = new ConnectionResult(22, null);
                object3 = this.getIntent();
                object4 = "failing_client_id";
                int n7 = -1;
                int n8 = object3.getIntExtra((String)object4, n7);
                ((GoogleApiManager)object).zax((ConnectionResult)object2, n8);
            } else {
                object = object2.toString();
                object = cP.a("Activity not found while launching ", (String)object, ".");
                object2 = Build.FINGERPRINT;
                object3 = "generic";
                boolean bl3 = ((String)object2).contains((CharSequence)object3);
                if (bl3) {
                    object2 = " This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                    ((String)object).concat((String)object2);
                }
            }
            this.zaa = n3;
            this.finish();
            return;
        }
        int n10 = (Integer)Preconditions.checkNotNull(object3);
        GoogleApiAvailability.getInstance().showErrorDialogFragment((Activity)this, n10, 2, (DialogInterface.OnCancelListener)this);
        this.zaa = n3;
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        super.onActivityResult(n3, n4, intent);
        int n7 = 0;
        Intent intent2 = null;
        int n8 = 1;
        if (n3 == n8) {
            Object object = this.getIntent();
            String string2 = "notify_manager";
            n3 = (int)(object.getBooleanExtra(string2, n8 != 0) ? 1 : 0);
            this.zaa = 0;
            this.setResult(n4, intent);
            if (n3 != 0) {
                object = GoogleApiManager.zak((Context)this);
                int n10 = -1;
                if (n4 != n10) {
                    if (n4 == 0) {
                        n7 = 13;
                        n8 = 0;
                        ConnectionResult connectionResult = new ConnectionResult(n7, null);
                        intent2 = this.getIntent();
                        String string3 = "failing_client_id";
                        n10 = intent2.getIntExtra(string3, n10);
                        ((GoogleApiManager)object).zax(connectionResult, n10);
                    }
                } else {
                    ((GoogleApiManager)object).zay();
                }
            }
        } else {
            n8 = 2;
            if (n3 == n8) {
                this.zaa = 0;
                this.setResult(n4, intent);
            }
        }
        this.finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zaa = 0;
        this.setResult(0);
        this.finish();
    }

    public final void onCreate(Bundle bundle) {
        int n3;
        int n4;
        super.onCreate(bundle);
        if (bundle != null) {
            String string2 = "resolution";
            this.zaa = n4 = bundle.getInt(string2);
        }
        if ((n4 = this.zaa) != (n3 = 1)) {
            this.zab();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        int n3 = this.zaa;
        bundle.putInt("resolution", n3);
        super.onSaveInstanceState(bundle);
    }
}

