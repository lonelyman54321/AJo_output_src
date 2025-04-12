/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.util.SparseArray
 */
package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zaj;
import com.google.android.gms.common.api.internal.zam;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class zak
extends zap {
    private final SparseArray zad;

    private zak(LifecycleFragment lifecycleFragment) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        super(lifecycleFragment, googleApiAvailability);
        super();
        this.zad = lifecycleFragment;
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static zak zaa(LifecycleActivity object) {
        Class<zak> clazz;
        zak zak2 = (zak)(object = LifecycleCallback.getFragment((LifecycleActivity)object)).getCallbackOrNull("AutoManageHelper", clazz = zak.class);
        if (zak2 != null) {
            return zak2;
        }
        zak2 = new zak((LifecycleFragment)object);
        return zak2;
    }

    private final zaj zai(int n3) {
        SparseArray sparseArray = this.zad;
        int n4 = sparseArray.size();
        if (n4 <= n3) {
            return null;
        }
        sparseArray = this.zad;
        n3 = sparseArray.keyAt(n3);
        return (zaj)sparseArray.get(n3);
    }

    public final void dump(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = (object = this.zad).size()); ++i3) {
            object = this.zai(i3);
            if (object == null) continue;
            Object object2 = printWriter.append(string2).append("GoogleApiClient #");
            int n4 = ((zaj)object).zaa;
            ((PrintWriter)object2).print(n4);
            printWriter.println(":");
            object2 = String.valueOf(string2);
            object = ((zaj)object).zab;
            String string3 = "  ";
            object2 = ((String)object2).concat(string3);
            ((GoogleApiClient)object).dump((String)object2, fileDescriptor, printWriter, stringArray);
        }
    }

    public final void onStart() {
        super.onStart();
        String.valueOf(this.zad);
        Object v4 = this.zab.get();
        if (v4 == null) {
            Object object;
            int n3;
            v4 = null;
            for (int i3 = 0; i3 < (n3 = (object = this.zad).size()); ++i3) {
                object = this.zai(i3);
                if (object == null) continue;
                object = ((zaj)object).zab;
                ((GoogleApiClient)object).connect();
            }
        }
    }

    public final void onStop() {
        Object object;
        int n3;
        super.onStop();
        for (int i3 = 0; i3 < (n3 = (object = this.zad).size()); ++i3) {
            object = this.zai(i3);
            if (object == null) continue;
            object = ((zaj)object).zab;
            ((GoogleApiClient)object).disconnect();
        }
    }

    public final void zab(ConnectionResult object, int n3) {
        if (n3 < 0) {
            object = new Exception();
            Log.wtf((String)"AutoManageHelper", (String)"AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", (Throwable)object);
            return;
        }
        zaj zaj2 = (zaj)this.zad.get(n3);
        if (zaj2 != null) {
            this.zae(n3);
            GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener = zaj2.zac;
            if (googleApiClient$OnConnectionFailedListener != null) {
                googleApiClient$OnConnectionFailedListener.onConnectionFailed((ConnectionResult)object);
            }
        }
    }

    public final void zac() {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = (object = this.zad).size()); ++i3) {
            object = this.zai(i3);
            if (object == null) continue;
            object = ((zaj)object).zab;
            ((GoogleApiClient)object).connect();
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void zad(int n3, GoogleApiClient googleApiClient, GoogleApiClient$OnConnectionFailedListener object) {
        void var5_8;
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        Object object2 = this.zad;
        int bl2 = object2.indexOfKey(n3);
        Object object3 = hj0_0.a(n3, "Already managing a GoogleApiClient with id ");
        if (bl2 < 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object2 = null;
        }
        Preconditions.checkState((boolean)var5_8, object3);
        object2 = (zam)this.zab.get();
        String.valueOf(object2);
        object3 = new zaj(this, n3, googleApiClient, (GoogleApiClient$OnConnectionFailedListener)object);
        googleApiClient.registerConnectionFailedListener((GoogleApiClient$OnConnectionFailedListener)object3);
        object = this.zad;
        object.put(n3, object3);
        n3 = (int)(this.zaa ? 1 : 0);
        if (n3 != 0 && object2 == null) {
            String string2 = googleApiClient.toString();
            object = "connecting ";
            ((String)object).concat(string2);
            googleApiClient.connect();
        }
    }

    public final void zae(int n3) {
        zaj zaj2 = (zaj)this.zad.get(n3);
        SparseArray sparseArray = this.zad;
        sparseArray.remove(n3);
        if (zaj2 != null) {
            zaj2.zab.unregisterConnectionFailedListener(zaj2);
            GoogleApiClient googleApiClient = zaj2.zab;
            googleApiClient.disconnect();
        }
    }
}

