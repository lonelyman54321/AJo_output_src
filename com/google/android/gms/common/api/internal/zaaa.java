/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Looper
 *  android.util.Log
 */
package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$AnyClientKey;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.api.internal.zabz;
import com.google.android.gms.common.api.internal.zaca;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.api.internal.zav;
import com.google.android.gms.common.api.internal.zax;
import com.google.android.gms.common.api.internal.zaz;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

final class zaaa
implements zaca {
    private final Context zaa;
    private final zabe zab;
    private final Looper zac;
    private final zabi zad;
    private final zabi zae;
    private final Map zaf;
    private final Set zag;
    private final Api$Client zah;
    private Bundle zai;
    private ConnectionResult zaj;
    private ConnectionResult zak;
    private boolean zal;
    private final Lock zam;
    private int zan;

    private zaaa(Context context, zabe zabe2, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map2, Map map3, ClientSettings clientSettings, Api$AbstractClientBuilder api$AbstractClientBuilder, Api$Client api$Client, ArrayList arrayList, ArrayList arrayList2, Map map4, Map map5) {
        Object object;
        zaaa zaaa2 = this;
        Map map6 = new Map();
        map6 = Collections.newSetFromMap(map6);
        this.zag = map6;
        this.zaj = null;
        this.zak = null;
        this.zal = false;
        this.zan = 0;
        Object object2 = context;
        this.zaa = context;
        this.zab = zabe2;
        Object object3 = lock;
        this.zam = lock;
        this.zac = looper;
        Object object4 = api$Client;
        this.zah = api$Client;
        Object object5 = new zax(this, null);
        object4 = object;
        Object object6 = context;
        zax zax2 = object5;
        object5 = map5;
        map6 = object;
        object3 = zax2;
        object = new zabi(context, zabe2, lock, looper, googleApiAvailabilityLight, map3, null, map5, null, arrayList2, zax2);
        this.zad = object;
        boolean bl2 = false;
        object3 = new zaz(this, null);
        object4 = map6;
        object5 = map4;
        object = api$AbstractClientBuilder;
        map6 = new Map(context, zabe2, lock, looper, googleApiAvailabilityLight, map2, clientSettings, map4, api$AbstractClientBuilder, arrayList, (zabz)object3);
        this.zae = map6;
        map6 = new Map();
        object2 = map3.keySet().iterator();
        while (bl2 = object2.hasNext()) {
            object4 = (Api$AnyClientKey)object2.next();
            object6 = zaaa2.zad;
            ((a53)((Object)map6)).put(object4, object6);
        }
        object2 = map2.keySet().iterator();
        while (bl2 = object2.hasNext()) {
            object4 = (Api$AnyClientKey)object2.next();
            object6 = zaaa2.zae;
            ((a53)((Object)map6)).put(object4, object6);
        }
        zaaa2.zaf = map6 = Collections.unmodifiableMap(map6);
    }

    /*
     * Unable to fully structure code
     */
    private final void zaA(ConnectionResult var1_1) {
        var2_2 = this.zan;
        var3_3 = 1;
        if (var2_2 == var3_3) ** GOTO lbl14
        var3_3 = 2;
        if (var2_2 != var3_3) {
            var1_1 = new Exception();
            var4_4 = "CompositeGAC";
            var5_6 = "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor";
            Log.wtf((String)var4_4, (String)var5_6, (Throwable)var1_1);
        } else {
            var4_5 = this.zab;
            var4_5.zaa((ConnectionResult)var1_1);
lbl14:
            // 2 sources

            this.zaB();
        }
        this.zan = 0;
    }

    private final void zaB() {
        boolean bl2;
        Iterator iterator = this.zag.iterator();
        while (bl2 = iterator.hasNext()) {
            SignInConnectionListener signInConnectionListener = (SignInConnectionListener)iterator.next();
            signInConnectionListener.onComplete();
        }
        this.zag.clear();
    }

    private final boolean zaC() {
        int n3;
        int n4;
        ConnectionResult connectionResult = this.zak;
        return connectionResult != null && (n4 = connectionResult.getErrorCode()) == (n3 = 4);
    }

    private final boolean zaD(BaseImplementation$ApiMethodImpl object) {
        Object object2 = this.zaf;
        object = ((BaseImplementation$ApiMethodImpl)object).getClientKey();
        object = (zabi)object2.get(object);
        Preconditions.checkNotNull(object, "GoogleApiClient is not configured to use the API required for this call.");
        object2 = this.zae;
        return object.equals(object2);
    }

    private static boolean zaE(ConnectionResult connectionResult) {
        boolean bl2;
        return connectionResult != null && (bl2 = connectionResult.isSuccess());
    }

    public static /* bridge */ /* synthetic */ ConnectionResult zaa(zaaa zaaa2) {
        return zaaa2.zak;
    }

    public static zaaa zag(Context context, zabe zabe2, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map2, ClientSettings clientSettings, Map map3, Api$AbstractClientBuilder api$AbstractClientBuilder, ArrayList arrayList) {
        zaaa zaaa2;
        boolean bl2;
        Object object;
        Object object2;
        int n3;
        Object object3 = map3;
        Jp jp = new Jp();
        Jp jp2 = new Jp();
        Iterator iterator = map2.entrySet().iterator();
        boolean bl3 = false;
        Object object4 = null;
        Api$Client api$Client = null;
        while (true) {
            bl3 = iterator.hasNext();
            n3 = 1;
            if (!bl3) break;
            object4 = iterator.next();
            object2 = (Api$Client)object4.getValue();
            int n4 = (int)(object2.providesSignIn() ? 1 : 0);
            if (n3 == n4) {
                api$Client = object2;
            }
            if ((n3 = object2.requiresSignIn()) != 0) {
                object4 = (Api$AnyClientKey)object4.getKey();
                jp.put(object4, object2);
                continue;
            }
            object4 = (Api$AnyClientKey)object4.getKey();
            jp2.put(object4, object2);
        }
        int n7 = jp.isEmpty() ^ n3;
        object4 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in.";
        Preconditions.checkState(n7 != 0, object4);
        Jp jp4 = new Jp();
        Jp jp5 = new Jp();
        iterator = map3.keySet().iterator();
        while (bl3 = iterator.hasNext()) {
            object4 = (Api)((Object)iterator.next());
            object = ((Api)object4).zab();
            bl2 = jp.containsKey(object);
            if (bl2) {
                object = (Boolean)object3.get(object4);
                jp4.put(object4, object);
                continue;
            }
            n3 = jp2.containsKey(object);
            if (n3 != 0) {
                object = (Boolean)object3.get(object4);
                jp5.put(object4, object);
                continue;
            }
            object3 = new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            throw object3;
        }
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        ArrayList<Object> arrayList3 = new ArrayList<Object>();
        int n8 = arrayList.size();
        iterator = null;
        for (n7 = 0; n7 < n8; ++n7) {
            object4 = arrayList;
            object = (zat)arrayList.get(n7);
            object2 = ((zat)object).zaa;
            bl2 = jp4.containsKey(object2);
            if (bl2) {
                arrayList2.add(object);
                continue;
            }
            object2 = ((zat)object).zaa;
            bl2 = jp5.containsKey(object2);
            if (bl2) {
                arrayList3.add(object);
                continue;
            }
            object3 = new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            throw object3;
        }
        object3 = zaaa2;
        iterator = context;
        object4 = zabe2;
        object = lock;
        object2 = looper;
        zaaa2 = new zaaa(context, zabe2, lock, looper, googleApiAvailabilityLight, jp, jp2, clientSettings, api$AbstractClientBuilder, api$Client, arrayList2, arrayList3, jp4, jp5);
        return zaaa2;
    }

    public static /* bridge */ /* synthetic */ zabi zah(zaaa zaaa2) {
        return zaaa2.zad;
    }

    public static /* bridge */ /* synthetic */ zabi zai(zaaa zaaa2) {
        return zaaa2.zae;
    }

    public static /* bridge */ /* synthetic */ Lock zaj(zaaa zaaa2) {
        return zaaa2.zam;
    }

    public static /* bridge */ /* synthetic */ void zak(zaaa zaaa2, ConnectionResult connectionResult) {
        zaaa2.zaj = connectionResult;
    }

    public static /* bridge */ /* synthetic */ void zal(zaaa zaaa2, ConnectionResult connectionResult) {
        zaaa2.zak = connectionResult;
    }

    public static /* bridge */ /* synthetic */ void zam(zaaa zaaa2, boolean bl2) {
        zaaa2.zal = bl2;
    }

    public static /* bridge */ /* synthetic */ void zan(zaaa zaaa2, int n3, boolean bl2) {
        zaaa2.zab.zac(n3, bl2);
        zaaa2.zak = null;
        zaaa2.zaj = null;
    }

    public static /* bridge */ /* synthetic */ void zao(zaaa zaaa2, Bundle bundle) {
        Bundle bundle2 = zaaa2.zai;
        if (bundle2 == null) {
            zaaa2.zai = bundle;
            return;
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ /* synthetic */ void zap(zaaa var0) {
        block9: {
            block7: {
                block8: {
                    var1_1 = var0.zaj;
                    var2_2 = zaaa.zaE((ConnectionResult)var1_1);
                    if (var2_2 == 0) break block7;
                    var1_1 = var0.zak;
                    var2_2 = zaaa.zaE((ConnectionResult)var1_1);
                    var3_3 = 1;
                    if (var2_2 != 0 || (var2_2 = var0.zaC()) != 0) break block8;
                    var1_1 = var0.zak;
                    if (var1_1 != null) {
                        var4_4 = var0.zan;
                        if (var4_4 == var3_3) {
                            var0.zaB();
                            return;
                        }
                        var0.zaA((ConnectionResult)var1_1);
                        var0.zad.zar();
                        return;
                    }
                    break block9;
                }
                var2_2 = var0.zan;
                if (var2_2 == var3_3) ** GOTO lbl32
                var3_3 = 2;
                if (var2_2 != var3_3) {
                    var1_1 = new AssertionError();
                    var5_6 = "CompositeGAC";
                    var6_9 = "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor";
                    Log.wtf((String)var5_6, (String)var6_9, (Throwable)var1_1);
                } else {
                    var1_1 = (zabe)Preconditions.checkNotNull(var0.zab);
                    var5_7 = var0.zai;
                    var1_1.zab(var5_7);
lbl32:
                    // 2 sources

                    var0.zaB();
                }
                var0.zan = 0;
                return;
            }
            var1_1 = var0.zaj;
            if (var1_1 != null && (var2_2 = zaaa.zaE((ConnectionResult)(var1_1 = var0.zak))) != 0) {
                var0.zae.zar();
                var1_1 = (ConnectionResult)Preconditions.checkNotNull(var0.zaj);
                var0.zaA((ConnectionResult)var1_1);
                return;
            }
            var1_1 = var0.zaj;
            if (var1_1 != null && (var5_8 = var0.zak) != null) {
                var6_10 = var0.zae;
                var7_11 = var0.zad;
                var4_5 = var6_10.zaf;
                var8_12 = var7_11.zaf;
                if (var4_5 < var8_12) {
                    var1_1 = var5_8;
                }
                var0.zaA((ConnectionResult)var1_1);
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zav(zaaa zaaa2) {
        return zaaa2.zal;
    }

    private final PendingIntent zaz() {
        Api$Client api$Client = this.zah;
        if (api$Client == null) {
            return null;
        }
        Context context = this.zaa;
        int n3 = System.identityHashCode(this.zab);
        api$Client = api$Client.getSignInIntent();
        int n4 = zap.zaa | 0x8000000;
        return PendingIntent.getActivity((Context)context, (int)n3, (Intent)api$Client, (int)n4);
    }

    public final ConnectionResult zab() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final ConnectionResult zac(long l2, TimeUnit timeUnit) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final ConnectionResult zad(Api object) {
        Map map2 = this.zaf;
        Object object2 = ((Api)object).zab();
        boolean bl2 = Objects.equal(map2 = map2.get(object2), object2 = this.zae);
        if (bl2) {
            bl2 = this.zaC();
            if (bl2) {
                object2 = this.zaz();
                object = new ConnectionResult(4, (PendingIntent)object2);
                return object;
            }
            return this.zae.zad((Api)object);
        }
        return this.zad.zad((Api)object);
    }

    public final BaseImplementation$ApiMethodImpl zae(BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        boolean bl2 = this.zaD(baseImplementation$ApiMethodImpl);
        if (bl2) {
            bl2 = this.zaC();
            if (bl2) {
                PendingIntent pendingIntent = this.zaz();
                Status status = new Status(4, null, pendingIntent);
                baseImplementation$ApiMethodImpl.setFailedResult(status);
                return baseImplementation$ApiMethodImpl;
            }
            this.zae.zae(baseImplementation$ApiMethodImpl);
            return baseImplementation$ApiMethodImpl;
        }
        this.zad.zae(baseImplementation$ApiMethodImpl);
        return baseImplementation$ApiMethodImpl;
    }

    public final BaseImplementation$ApiMethodImpl zaf(BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        boolean bl2 = this.zaD(baseImplementation$ApiMethodImpl);
        if (bl2) {
            bl2 = this.zaC();
            if (bl2) {
                PendingIntent pendingIntent = this.zaz();
                Status status = new Status(4, null, pendingIntent);
                baseImplementation$ApiMethodImpl.setFailedResult(status);
                return baseImplementation$ApiMethodImpl;
            }
            return this.zae.zaf(baseImplementation$ApiMethodImpl);
        }
        return this.zad.zaf(baseImplementation$ApiMethodImpl);
    }

    public final void zaq() {
        this.zan = 2;
        this.zal = false;
        this.zak = null;
        this.zaj = null;
        this.zad.zaq();
        this.zae.zaq();
    }

    public final void zar() {
        this.zak = null;
        this.zaj = null;
        this.zan = 0;
        this.zad.zar();
        this.zae.zar();
        this.zaB();
    }

    public final void zas(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        Object object = printWriter.append(string2).append("authClient");
        String string3 = ":";
        ((PrintWriter)object).println(string3);
        object = String.valueOf(string2);
        zabi zabi2 = this.zae;
        String string4 = "  ";
        object = ((String)object).concat(string4);
        zabi2.zas((String)object, fileDescriptor, printWriter, stringArray);
        printWriter.append(string2).append("anonClient").println(string3);
        string2 = String.valueOf(string2);
        object = this.zad;
        string2 = string2.concat(string4);
        ((zabi)object).zas(string2, fileDescriptor, printWriter, stringArray);
    }

    public final void zat() {
        this.zad.zat();
        this.zae.zat();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zau() {
        Throwable throwable2;
        block4: {
            block3: {
                block2: {
                    Object object = this.zam;
                    object.lock();
                    try {
                        boolean bl2 = this.zax();
                        Object object2 = this.zae;
                        ((zabi)object2).zar();
                        int n3 = 4;
                        this.zak = object2 = new ConnectionResult(n3);
                        if (!bl2) break block2;
                        object2 = this.zac;
                        object = new zau((Looper)object2);
                        object2 = new zav(this);
                        object.post((Runnable)object2);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.zaB();
            }
            this.zam.unlock();
            return;
        }
        this.zam.unlock();
        throw throwable2;
    }

    public final boolean zaw() {
        Throwable throwable22;
        block9: {
            boolean bl2;
            block7: {
                block8: {
                    Object object = this.zam;
                    object.lock();
                    try {
                        object = this.zad;
                    }
                    catch (Throwable throwable22) {}
                    boolean n3 = ((zabi)object).zaw();
                    bl2 = false;
                    if (!n3) break block7;
                    object = this.zae;
                    boolean bl3 = ((zabi)object).zaw();
                    int n4 = 1;
                    if (bl3) break block8;
                    boolean bl4 = this.zaC();
                    if (bl4) break block8;
                    int n7 = this.zan;
                    if (n7 != n4) break block7;
                }
                bl2 = true;
                break block7;
                break block9;
            }
            this.zam.unlock();
            return bl2;
        }
        this.zam.unlock();
        throw throwable22;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean zax() {
        Lock lock = this.zam;
        lock.lock();
        try {
            void var2_6;
            int bl2 = this.zan;
            int n3 = 2;
            if (bl2 == n3) {
                boolean bl3 = true;
            } else {
                boolean bl4 = false;
                lock = null;
            }
            this.zam.unlock();
            return (boolean)var2_6;
        }
        catch (Throwable throwable) {
            this.zam.unlock();
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zay(SignInConnectionListener object) {
        Throwable throwable2;
        block5: {
            int n3;
            block4: {
                boolean bl2;
                Object object2 = this.zam;
                object2.lock();
                try {
                    bl2 = this.zax();
                    n3 = 0;
                    if (!bl2 && !(bl2 = this.zaw())) break block4;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object2 = this.zae;
                bl2 = ((zabi)object2).zaw();
                if (!bl2) {
                    object2 = this.zag;
                    object2.add(object);
                    int n4 = this.zan;
                    n3 = 1;
                    if (n4 == 0) {
                        this.zan = n3;
                    }
                    n4 = 0;
                    object = null;
                    this.zak = null;
                    object = this.zae;
                    ((zabi)object).zaq();
                }
            }
            this.zam.unlock();
            return n3 != 0;
        }
        this.zam.unlock();
        throw throwable2;
    }
}

