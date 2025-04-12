/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zaaj;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zaax;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.api.internal.zabg;
import com.google.android.gms.common.api.internal.zabh;
import com.google.android.gms.common.api.internal.zabz;
import com.google.android.gms.common.api.internal.zaca;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.api.internal.zau;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class zabi
implements zaca,
zau {
    final Map zaa;
    final Map zab;
    final ClientSettings zac;
    final Map zad;
    final Api$AbstractClientBuilder zae;
    int zaf;
    final zabe zag;
    final zabz zah;
    private final Lock zai;
    private final Condition zaj;
    private final Context zak;
    private final GoogleApiAvailabilityLight zal;
    private final zabh zam;
    private volatile zabf zan;
    private ConnectionResult zao;

    public zabi(Context object, zabe zabe2, Lock lock, Looper looper, GoogleApiAvailabilityLight object2, Map map2, ClientSettings clientSettings, Map map3, Api$AbstractClientBuilder api$AbstractClientBuilder, ArrayList arrayList, zabz zabz2) {
        HashMap hashMap;
        this.zab = hashMap = new HashMap();
        hashMap = null;
        this.zao = null;
        this.zak = object;
        this.zai = lock;
        this.zal = object2;
        this.zaa = map2;
        this.zac = clientSettings;
        this.zad = map3;
        this.zae = api$AbstractClientBuilder;
        this.zag = zabe2;
        this.zah = zabz2;
        int n3 = arrayList.size();
        zabe2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            object2 = (zat)arrayList.get(i3);
            ((zat)object2).zaa(this);
        }
        super(this, looper);
        this.zam = object;
        object = lock.newCondition();
        this.zaj = object;
        super(this);
        this.zan = object;
    }

    public static /* bridge */ /* synthetic */ zabf zag(zabi zabi2) {
        return zabi2.zan;
    }

    public static /* bridge */ /* synthetic */ Lock zah(zabi zabi2) {
        return zabi2.zai;
    }

    public final void onConnected(Bundle bundle) {
        Object object = this.zai;
        object.lock();
        try {
            object = this.zan;
            object.zag(bundle);
            return;
        }
        finally {
            this.zai.unlock();
        }
    }

    public final void onConnectionSuspended(int n3) {
        Object object = this.zai;
        object.lock();
        try {
            object = this.zan;
            object.zai(n3);
            return;
        }
        finally {
            this.zai.unlock();
        }
    }

    public final void zaa(ConnectionResult connectionResult, Api api, boolean bl2) {
        Object object = this.zai;
        object.lock();
        try {
            object = this.zan;
            object.zah(connectionResult, api, bl2);
            return;
        }
        finally {
            this.zai.unlock();
        }
    }

    public final ConnectionResult zab() {
        Object object;
        boolean bl2;
        this.zaq();
        while (bl2 = (object = this.zan) instanceof zaaw) {
            try {
                object = this.zaj;
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                object = new ConnectionResult(15, null);
                return object;
            }
            object.await();
        }
        object = this.zan;
        bl2 = object instanceof zaaj;
        if (bl2) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        object = this.zao;
        if (object != null) {
            return object;
        }
        object = new ConnectionResult(13, null);
        return object;
    }

    public final ConnectionResult zac(long l2, TimeUnit object) {
        Object object2;
        this.zaq();
        l2 = ((TimeUnit)((Object)object)).toNanos(l2);
        while ((object2 = (object = this.zan) instanceof zaaw) != 0) {
            ConnectionResult connectionResult;
            long l3 = 0L;
            long l4 = l2 - l3;
            object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 <= 0) {
                this.zar();
                int n3 = 14;
                connectionResult = new ConnectionResult(n3, null);
                return connectionResult;
            }
            try {
                object = this.zaj;
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                connectionResult = new ConnectionResult(15, null);
                return connectionResult;
            }
            l2 = object.awaitNanos(l2);
        }
        Object object3 = this.zan;
        boolean bl2 = object3 instanceof zaaj;
        if (bl2) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        object3 = this.zao;
        if (object3 != null) {
            return object3;
        }
        object3 = new ConnectionResult(13, null);
        return object3;
    }

    public final ConnectionResult zad(Api object) {
        Object object2 = this.zaa;
        boolean bl2 = object2.containsKey(object = ((Api)object).zab());
        if (bl2) {
            object2 = (Api$Client)this.zaa.get(object);
            bl2 = object2.isConnected();
            if (bl2) {
                return ConnectionResult.RESULT_SUCCESS;
            }
            object2 = this.zab;
            bl2 = object2.containsKey(object);
            if (bl2) {
                return (ConnectionResult)this.zab.get(object);
            }
        }
        return null;
    }

    public final BaseImplementation$ApiMethodImpl zae(BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        baseImplementation$ApiMethodImpl.zak();
        this.zan.zaa(baseImplementation$ApiMethodImpl);
        return baseImplementation$ApiMethodImpl;
    }

    public final BaseImplementation$ApiMethodImpl zaf(BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        baseImplementation$ApiMethodImpl.zak();
        return this.zan.zab(baseImplementation$ApiMethodImpl);
    }

    public final void zai() {
        Object object = this.zai;
        object.lock();
        try {
            object = this.zag;
            ((zabe)object).zak();
            object = this.zan = (object = new zaaj(this));
            object.zad();
            object = this.zaj;
            object.signalAll();
            return;
        }
        finally {
            this.zai.unlock();
        }
    }

    public final void zaj() {
        Object object = this.zai;
        object.lock();
        try {
            ClientSettings clientSettings = this.zac;
            Map map2 = this.zad;
            GoogleApiAvailabilityLight googleApiAvailabilityLight = this.zal;
            Api$AbstractClientBuilder api$AbstractClientBuilder = this.zae;
            Lock lock = this.zai;
            Context context = this.zak;
            object = this.zan = (object = new zaaw(this, clientSettings, map2, googleApiAvailabilityLight, api$AbstractClientBuilder, lock, context));
            object.zad();
            object = this.zaj;
            object.signalAll();
            return;
        }
        finally {
            this.zai.unlock();
        }
    }

    public final void zak(ConnectionResult object) {
        Lock lock = this.zai;
        lock.lock();
        try {
            this.zao = object;
            object = this.zan = (object = new zaax(this));
            object.zad();
            object = this.zaj;
            object.signalAll();
            return;
        }
        finally {
            this.zai.unlock();
        }
    }

    public final void zal(zabg zabg2) {
        zabh zabh2 = this.zam;
        zabg2 = zabh2.obtainMessage(1, zabg2);
        zabh2.sendMessage((Message)zabg2);
    }

    public final void zam(RuntimeException runtimeException) {
        zabh zabh2 = this.zam;
        runtimeException = zabh2.obtainMessage(2, runtimeException);
        zabh2.sendMessage((Message)runtimeException);
    }

    public final void zaq() {
        this.zan.zae();
    }

    public final void zar() {
        Object object = this.zan;
        boolean bl2 = object.zaj();
        if (bl2) {
            object = this.zab;
            object.clear();
        }
    }

    public final void zas(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        boolean bl2;
        Object object = printWriter.append(string2).append("mState=");
        Object object2 = this.zan;
        ((PrintWriter)object).println(object2);
        object = this.zad.keySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = String.valueOf(string2);
            Object object3 = (Api)object.next();
            Object object4 = printWriter.append(string2);
            String string3 = ((Api)object3).zad();
            object4 = ((PrintWriter)object4).append(string3);
            string3 = ":";
            ((PrintWriter)object4).println(string3);
            object4 = this.zaa;
            object3 = ((Api)object3).zab();
            object3 = (Api$Client)Preconditions.checkNotNull((Api$Client)object4.get(object3));
            object4 = "  ";
            object2 = ((String)object2).concat((String)object4);
            object3.dump((String)object2, fileDescriptor, printWriter, stringArray);
        }
    }

    public final void zat() {
        zabf zabf2 = this.zan;
        boolean bl2 = zabf2 instanceof zaaj;
        if (bl2) {
            zabf2 = (zaaj)this.zan;
            ((zaaj)zabf2).zaf();
        }
    }

    public final void zau() {
    }

    public final boolean zaw() {
        return this.zan instanceof zaaj;
    }

    public final boolean zax() {
        return this.zan instanceof zaaw;
    }

    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        return false;
    }
}

