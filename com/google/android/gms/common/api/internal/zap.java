/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 */
package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zam;
import com.google.android.gms.common.api.internal.zao;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zap
extends LifecycleCallback
implements DialogInterface.OnCancelListener {
    protected volatile boolean zaa;
    protected final AtomicReference zab;
    protected final GoogleApiAvailability zac;
    private final Handler zad;

    public zap(LifecycleFragment object, GoogleApiAvailability googleApiAvailability) {
        super((LifecycleFragment)object);
        this.zab = object = new Object(null);
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.zad = object;
        this.zac = googleApiAvailability;
    }

    private final void zaa(ConnectionResult connectionResult, int n3) {
        this.zab.set(null);
        this.zab(connectionResult, n3);
    }

    private final void zad() {
        this.zab.set(null);
        this.zac();
    }

    private static final int zae(zam zam2) {
        if (zam2 == null) {
            return -1;
        }
        return zam2.zaa();
    }

    public static /* bridge */ /* synthetic */ void zaf(zap zap2, ConnectionResult connectionResult, int n3) {
        zap2.zaa(connectionResult, n3);
    }

    public static /* bridge */ /* synthetic */ void zag(zap zap2) {
        zap2.zad();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onActivityResult(int n3, int n4, Intent object) {
        Object object2;
        zam zam2 = (zam)this.zab.get();
        int n7 = 1;
        if (n3 != n7) {
            n4 = 2;
            if (n3 == n4) {
                int n8;
                object2 = this.zac;
                Object object3 = this.getActivity();
                n3 = ((GoogleApiAvailability)object2).isGooglePlayServicesAvailable((Context)object3);
                if (n3 == 0) {
                    this.zad();
                    return;
                }
                if (zam2 == null || (n4 = ((ConnectionResult)(object3 = zam2.zab())).getErrorCode()) == (n8 = 18) && n3 == n8) {
                    return;
                }
            }
        } else {
            n3 = -1;
            if (n4 == n3) {
                this.zad();
                return;
            }
            if (n4 == 0) {
                Object object4;
                if (zam2 == null) return;
                n3 = 13;
                if (object != null) {
                    object4 = "<<ResolutionFailureErrorDetail>>";
                    n3 = object.getIntExtra((String)object4, n3);
                }
                String string2 = zam2.zab().toString();
                object4 = new ConnectionResult(n3, null, string2);
                n3 = zap.zae(zam2);
                this.zaa((ConnectionResult)object4, n3);
                return;
            }
        }
        if (zam2 == null) return;
        object2 = zam2.zab();
        n4 = zam2.zaa();
        this.zaa((ConnectionResult)object2, n4);
    }

    public final void onCancel(DialogInterface object) {
        object = new ConnectionResult(13, null);
        int n3 = zap.zae((zam)this.zab.get());
        this.zaa((ConnectionResult)object, n3);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.zab;
            Object object = "resolving_error";
            int n3 = 0;
            zam zam2 = null;
            boolean bl2 = bundle.getBoolean((String)object, false);
            if (bl2) {
                n3 = bundle.getInt("failed_status");
                PendingIntent pendingIntent = (PendingIntent)bundle.getParcelable("failed_resolution");
                object = new ConnectionResult(n3, pendingIntent);
                int n4 = -1;
                int n7 = bundle.getInt("failed_client_id", n4);
                zam2 = new zam((ConnectionResult)object, n7);
            } else {
                n3 = 0;
                zam2 = null;
            }
            atomicReference.set(zam2);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zam zam2 = (zam)this.zab.get();
        if (zam2 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        int n3 = zam2.zaa();
        bundle.putInt("failed_client_id", n3);
        int n4 = zam2.zab().getErrorCode();
        bundle.putInt("failed_status", n4);
        zam2 = zam2.zab().getResolution();
        bundle.putParcelable("failed_resolution", (Parcelable)zam2);
    }

    public void onStart() {
        super.onStart();
        this.zaa = true;
    }

    public void onStop() {
        super.onStop();
        this.zaa = false;
    }

    public abstract void zab(ConnectionResult var1, int var2);

    public abstract void zac();

    public final void zah(ConnectionResult object, int n3) {
        zam zam2 = new zam((ConnectionResult)object, n3);
        do {
            zao zao2;
            object = this.zab;
            do {
                zao2 = null;
                n3 = (int)(((AtomicReference)object).compareAndSet(null, zam2) ? 1 : 0);
                if (n3 == 0) continue;
                object = this.zad;
                zao2 = new zao(this, zam2);
                object.post((Runnable)zao2);
                return;
            } while ((zao2 = (zao)((AtomicReference)object).get()) == null);
        } while ((object = ((AtomicReference)object).get()) == null);
    }
}

