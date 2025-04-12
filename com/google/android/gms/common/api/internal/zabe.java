/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 */
package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$AnyClientKey;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient$Builder;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zaaa;
import com.google.android.gms.common.api.internal.zaay;
import com.google.android.gms.common.api.internal.zaaz;
import com.google.android.gms.common.api.internal.zaba;
import com.google.android.gms.common.api.internal.zabb;
import com.google.android.gms.common.api.internal.zabc;
import com.google.android.gms.common.api.internal.zabd;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zabz;
import com.google.android.gms.common.api.internal.zaca;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zadc;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.zaj;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

public final class zabe
extends GoogleApiClient
implements zabz {
    final Queue zaa;
    zabx zab;
    final Map zac;
    Set zad;
    final ClientSettings zae;
    final Map zaf;
    final Api$AbstractClientBuilder zag;
    Set zah;
    final zadc zai;
    private final Lock zaj;
    private final com.google.android.gms.common.internal.zak zak;
    private zaca zal;
    private final int zam;
    private final Context zan;
    private final Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final zabc zas;
    private final GoogleApiAvailability zat;
    private final ListenerHolders zau;
    private final ArrayList zav;
    private Integer zaw;
    private final zaj zax;

    public zabe(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api$AbstractClientBuilder api$AbstractClientBuilder, Map map2, List list, List list2, Map map3, int n3, int n4, ArrayList arrayList) {
        Object object;
        zabe zabe2 = this;
        Object object2 = looper;
        int n7 = n3;
        Object object3 = null;
        this.zal = null;
        Object object4 = new LinkedList();
        this.zaa = object4;
        boolean bl2 = true;
        boolean bl3 = ClientLibraryUtils.isPackageSide();
        long l2 = bl2 != bl3 ? 120000L : 10000L;
        zabe2.zaq = l2;
        zabe2.zar = l2 = 5000L;
        zabe2.zad = object4;
        zabe2.zau = object4 = new ListenerHolders();
        zabe2.zaw = null;
        zabe2.zah = null;
        object3 = new zaay(this);
        zabe2.zax = object3;
        object4 = context;
        zabe2.zan = context;
        object4 = lock;
        zabe2.zaj = lock;
        zabe2.zak = object4 = new com.google.android.gms.common.internal.zak(looper, (zaj)object3);
        zabe2.zao = object2;
        super(this, looper);
        zabe2.zas = object3;
        object2 = googleApiAvailability;
        zabe2.zat = googleApiAvailability;
        zabe2.zam = n7;
        if (n7 >= 0) {
            object2 = n4;
            zabe2.zaw = object2;
        }
        object2 = map2;
        zabe2.zaf = map2;
        object2 = map3;
        zabe2.zac = map3;
        object2 = arrayList;
        zabe2.zav = arrayList;
        super();
        zabe2.zai = object2;
        object2 = list.iterator();
        while ((n7 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object = (GoogleApiClient$ConnectionCallbacks)object2.next();
            object3 = zabe2.zak;
            ((com.google.android.gms.common.internal.zak)object3).zaf((GoogleApiClient$ConnectionCallbacks)object);
        }
        object2 = list2.iterator();
        while ((n7 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object = (GoogleApiClient$OnConnectionFailedListener)object2.next();
            object3 = zabe2.zak;
            ((com.google.android.gms.common.internal.zak)object3).zag((GoogleApiClient$OnConnectionFailedListener)object);
        }
        object = clientSettings;
        zabe2.zae = clientSettings;
        object2 = api$AbstractClientBuilder;
        zabe2.zag = api$AbstractClientBuilder;
    }

    public static int zad(Iterable object, boolean bl2) {
        boolean bl3;
        object = object.iterator();
        boolean bl4 = false;
        boolean bl5 = false;
        while (bl3 = object.hasNext()) {
            Api$Client api$Client = (Api$Client)object.next();
            boolean bl6 = api$Client.requiresSignIn();
            bl4 |= bl6;
            bl3 = api$Client.providesSignIn();
            bl5 |= bl3;
        }
        if (bl4) {
            if (bl5 && bl2) {
                return 2;
            }
            return 1;
        }
        return 3;
    }

    public static /* bridge */ /* synthetic */ Context zae(zabe zabe2) {
        return zabe2.zan;
    }

    public static String zag(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    return "UNKNOWN";
                }
                return "SIGN_IN_MODE_NONE";
            }
            return "SIGN_IN_MODE_OPTIONAL";
        }
        return "SIGN_IN_MODE_REQUIRED";
    }

    public static /* bridge */ /* synthetic */ void zah(zabe zabe2, GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean bl2) {
        zabe2.zam(googleApiClient, statusPendingResult, true);
    }

    public static /* bridge */ /* synthetic */ void zai(zabe zabe2) {
        Throwable throwable2;
        block4: {
            block3: {
                Lock lock = zabe2.zaj;
                lock.lock();
                try {
                    boolean bl2 = zabe2.zap;
                    if (!bl2) break block3;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                zabe2.zan();
            }
            zabe2.zaj.unlock();
            return;
        }
        zabe2.zaj.unlock();
        throw throwable2;
    }

    public static /* bridge */ /* synthetic */ void zaj(zabe zabe2) {
        Throwable throwable2;
        block4: {
            block3: {
                Lock lock = zabe2.zaj;
                lock.lock();
                try {
                    boolean bl2 = zabe2.zak();
                    if (!bl2) break block3;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                zabe2.zan();
            }
            zabe2.zaj.unlock();
            return;
        }
        zabe2.zaj.unlock();
        throw throwable2;
    }

    private final void zal(int n3) {
        Object object;
        block9: {
            Object object2;
            block12: {
                block13: {
                    Object object3;
                    Context context;
                    block11: {
                        int n4;
                        int n7;
                        block10: {
                            int n8;
                            block8: {
                                block7: {
                                    object = this.zaw;
                                    if (object != null) break block7;
                                    object2 = n3;
                                    this.zaw = object2;
                                    break block8;
                                }
                                n7 = (Integer)object;
                                if (n7 != n3) break block9;
                            }
                            object2 = this.zal;
                            if (object2 != null) {
                                return;
                            }
                            object2 = this.zac.values().iterator();
                            n7 = 0;
                            object = null;
                            n4 = 0;
                            context = null;
                            while ((n8 = object2.hasNext()) != 0) {
                                object3 = (Api$Client)object2.next();
                                int n10 = object3.requiresSignIn();
                                n7 |= n10;
                                n8 = (int)(object3.providesSignIn() ? 1 : 0);
                                n4 |= n8;
                            }
                            object2 = this.zaw;
                            n3 = (Integer)object2;
                            if (n3 == (n8 = 1)) break block10;
                            n4 = 2;
                            if (n3 == n4 && n7 != 0) {
                                object3 = this.zan;
                                Lock lock = this.zaj;
                                Looper looper = this.zao;
                                GoogleApiAvailability googleApiAvailability = this.zat;
                                Map map2 = this.zac;
                                ClientSettings clientSettings = this.zae;
                                Map map3 = this.zaf;
                                Api$AbstractClientBuilder api$AbstractClientBuilder = this.zag;
                                ArrayList arrayList = this.zav;
                                zabe zabe2 = this;
                                this.zal = object2 = zaaa.zag((Context)object3, this, lock, looper, googleApiAvailability, map2, clientSettings, map3, api$AbstractClientBuilder, arrayList);
                                return;
                            }
                            break block11;
                        }
                        if (n7 == 0) break block12;
                        if (n4 != 0) break block13;
                    }
                    context = this.zan;
                    Lock lock = this.zaj;
                    Looper looper = this.zao;
                    GoogleApiAvailability googleApiAvailability = this.zat;
                    Map map4 = this.zac;
                    ClientSettings clientSettings = this.zae;
                    Map map5 = this.zaf;
                    Api$AbstractClientBuilder api$AbstractClientBuilder = this.zag;
                    ArrayList arrayList = this.zav;
                    object = object2;
                    object3 = this;
                    zabe zabe3 = this;
                    this.zal = object2 = new zabi(context, this, lock, looper, googleApiAvailability, map4, clientSettings, map5, api$AbstractClientBuilder, arrayList, this);
                    return;
                }
                object2 = new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                throw object2;
            }
            object2 = new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            throw object2;
        }
        String string2 = zabe.zag(this.zaw);
        StringBuilder stringBuilder = new StringBuilder("Cannot use sign-in mode: ");
        String string3 = zabe.zag(n3);
        stringBuilder.append(string3);
        stringBuilder.append(". Mode was already set to ");
        stringBuilder.append(string2);
        string3 = stringBuilder.toString();
        object = new IllegalStateException(string3);
        throw object;
    }

    private final void zam(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean bl2) {
        PendingResult pendingResult = Common.zaa.zaa(googleApiClient);
        zabb zabb2 = new zabb(this, statusPendingResult, bl2, googleApiClient);
        pendingResult.setResultCallback(zabb2);
    }

    private final void zan() {
        this.zak.zab();
        ((zaca)Preconditions.checkNotNull(this.zal)).zaq();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ConnectionResult blockingConnect() {
        Throwable throwable2;
        block11: {
            Object object;
            Object object2;
            block13: {
                int n3;
                block10: {
                    int n4;
                    block12: {
                        block9: {
                            object2 = Looper.myLooper();
                            object = Looper.getMainLooper();
                            boolean bl2 = true;
                            if (object2 != object) {
                                n3 = 1;
                            } else {
                                n3 = 0;
                                object2 = null;
                            }
                            object = "blockingConnect must not be called on the UI thread";
                            Preconditions.checkState(n3 != 0, object);
                            object2 = this.zaj;
                            object2.lock();
                            try {
                                n3 = this.zam;
                                if (n3 < 0) break block9;
                                object2 = this.zaw;
                                if (object2 == null) {
                                    bl2 = false;
                                }
                                object2 = "Sign-in mode should have been set explicitly by auto-manage.";
                                Preconditions.checkState(bl2, object2);
                                break block10;
                            }
                            catch (Throwable throwable2) {
                                break block11;
                            }
                        }
                        object2 = this.zaw;
                        if (object2 != null) break block12;
                        object2 = this.zac;
                        object2 = object2.values();
                        n3 = zabe.zad((Iterable)object2, false);
                        this.zaw = object2 = Integer.valueOf(n3);
                        break block10;
                    }
                    n3 = (Integer)object2;
                    if (n3 == (n4 = 2)) break block13;
                }
                object2 = this.zaw;
                object2 = Preconditions.checkNotNull(object2);
                object2 = (Integer)object2;
                n3 = (Integer)object2;
                this.zal(n3);
                object2 = this.zak;
                ((com.google.android.gms.common.internal.zak)object2).zab();
                object2 = this.zal;
                object2 = Preconditions.checkNotNull(object2);
                object2 = (zaca)object2;
                object2 = object2.zab();
                this.zaj.unlock();
                return object2;
            }
            object = "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.";
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        this.zaj.unlock();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ConnectionResult blockingConnect(long l2, TimeUnit timeUnit) {
        Throwable throwable2;
        block10: {
            block11: {
                int n3;
                Object object;
                block9: {
                    int n4;
                    block8: {
                        Object object2;
                        object = Looper.myLooper();
                        if (object != (object2 = Looper.getMainLooper())) {
                            n3 = 1;
                        } else {
                            n3 = 0;
                            object = null;
                        }
                        object2 = "blockingConnect must not be called on the UI thread";
                        Preconditions.checkState(n3 != 0, object2);
                        Preconditions.checkNotNull((Object)timeUnit, "TimeUnit must not be null");
                        object = this.zaj;
                        object.lock();
                        try {
                            object = this.zaw;
                            if (object != null) break block8;
                            object = this.zac;
                            object = object.values();
                            n3 = zabe.zad((Iterable)object, false);
                            this.zaw = object = Integer.valueOf(n3);
                            break block9;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                    }
                    n3 = (Integer)object;
                    if (n3 == (n4 = 2)) break block11;
                }
                object = this.zaw;
                object = Preconditions.checkNotNull(object);
                object = (Integer)object;
                n3 = (Integer)object;
                this.zal(n3);
                object = this.zak;
                ((com.google.android.gms.common.internal.zak)object).zab();
                object = this.zal;
                object = Preconditions.checkNotNull(object);
                object = (zaca)object;
                ConnectionResult connectionResult = object.zac(l2, timeUnit);
                this.zaj.unlock();
                return connectionResult;
            }
            String string2 = "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.";
            IllegalStateException illegalStateException = new IllegalStateException(string2);
            throw illegalStateException;
        }
        this.zaj.unlock();
        throw throwable2;
    }

    public final PendingResult clearDefaultAccountAndReconnect() {
        Object object;
        int n3;
        int n4 = this.isConnected();
        Preconditions.checkState(n4 != 0, "GoogleApiClient is not connected yet.");
        Object object2 = this.zaw;
        AtomicReference<Object> atomicReference = null;
        boolean bl2 = true;
        if (object2 != null && (n4 = ((Integer)object2).intValue()) == (n3 = 2)) {
            bl2 = false;
            object = null;
        }
        Preconditions.checkState(bl2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        object2 = new StatusPendingResult(this);
        object = this.zac;
        Object object3 = Common.CLIENT_KEY;
        bl2 = object.containsKey(object3);
        if (bl2) {
            this.zam(this, (StatusPendingResult)object2, false);
        } else {
            atomicReference = new AtomicReference<Object>();
            object = new zaaz(this, atomicReference, (StatusPendingResult)object2);
            object3 = new zaba(this, (StatusPendingResult)object2);
            Object object4 = this.zan;
            GoogleApiClient$Builder googleApiClient$Builder = new GoogleApiClient$Builder((Context)object4);
            object4 = Common.API;
            googleApiClient$Builder.addApi((Api)object4);
            googleApiClient$Builder.addConnectionCallbacks((GoogleApiClient$ConnectionCallbacks)object);
            googleApiClient$Builder.addOnConnectionFailedListener((GoogleApiClient$OnConnectionFailedListener)object3);
            object = this.zas;
            googleApiClient$Builder.setHandler((Handler)object);
            object = googleApiClient$Builder.build();
            atomicReference.set(object);
            ((GoogleApiClient)object).connect();
        }
        return object2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void connect() {
        Throwable throwable222;
        block16: {
            Object object;
            Object object2;
            block13: {
                boolean bl2;
                int n3;
                block15: {
                    block14: {
                        Object object3;
                        object2 = "Illegal sign-in mode: ";
                        object = this.zaj;
                        object.lock();
                        int n4 = this.zam;
                        n3 = 2;
                        bl2 = false;
                        int n7 = 1;
                        if (n4 >= 0) {
                            object = this.zaw;
                            if (object != null) {
                                n4 = 1;
                            } else {
                                n4 = 0;
                                object = null;
                            }
                            object3 = "Sign-in mode should have been set explicitly by auto-manage.";
                            Preconditions.checkState(n4 != 0, object3);
                        } else {
                            object = this.zaw;
                            if (object == null) {
                                object = this.zac;
                                object = object.values();
                                n4 = zabe.zad(object, false);
                                this.zaw = object = Integer.valueOf(n4);
                            } else {
                                n4 = (Integer)object;
                                if (n4 == n3) break block13;
                            }
                        }
                        object = this.zaw;
                        object = Preconditions.checkNotNull(object);
                        object = (Integer)object;
                        n4 = (Integer)object;
                        object3 = this.zaj;
                        object3.lock();
                        int n8 = 3;
                        if (n4 != n8 && n4 != n7) {
                            if (n4 == n3) break block14;
                            n3 = n4;
                            break block15;
                        }
                        n3 = n4;
                        {
                            catch (Throwable throwable222) {}
                        }
                    }
                    bl2 = true;
                }
                object = new StringBuilder((String)object2);
                ((StringBuilder)object).append(n3);
                object2 = ((StringBuilder)object).toString();
                Preconditions.checkArgument(bl2, object2);
                this.zal(n3);
                this.zan();
                object2 = this.zaj;
                object2.unlock();
                this.zaj.unlock();
                return;
                catch (Throwable throwable3) {
                    object = this.zaj;
                    object.unlock();
                    throw throwable3;
                }
                break block16;
            }
            object = "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.";
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        this.zaj.unlock();
        throw throwable222;
    }

    public final void connect(int n3) {
        String string2 = "Illegal sign-in mode: ";
        Object object = this.zaj;
        object.lock();
        int n4 = 3;
        int n7 = 1;
        if (n3 != n4 && n3 != n7) {
            n4 = 2;
            if (n3 == n4) {
                n3 = 2;
            } else {
                n7 = 0;
            }
        }
        try {
            object = new StringBuilder(string2);
            ((StringBuilder)object).append(n3);
            string2 = ((StringBuilder)object).toString();
            Preconditions.checkArgument(n7 != 0, string2);
            this.zal(n3);
            this.zan();
            return;
        }
        finally {
            this.zaj.unlock();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void disconnect() {
        Throwable throwable2;
        block5: {
            boolean bl2;
            Object object;
            block4: {
                object = this.zaj;
                object.lock();
                try {
                    object = this.zai;
                    ((zadc)object).zab();
                    object = this.zal;
                    if (object == null) break block4;
                    object.zar();
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            object = this.zau;
            ((ListenerHolders)object).zab();
            object = this.zaa;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                Object object2 = object.next();
                object2 = (BaseImplementation$ApiMethodImpl)object2;
                ((BasePendingResult)object2).zan(null);
                ((BasePendingResult)object2).cancel();
            }
            object = this.zaa;
            object.clear();
            object = this.zal;
            if (object != null) {
                this.zak();
                object = this.zak;
                ((com.google.android.gms.common.internal.zak)object).zaa();
            }
            this.zaj.unlock();
            return;
        }
        this.zaj.unlock();
        throw throwable2;
    }

    public final void dump(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        Object object = printWriter.append(string2).append("mContext=");
        Object object2 = this.zan;
        ((PrintWriter)object).println(object2);
        object = printWriter.append(string2).append("mResuming=");
        boolean bl2 = this.zap;
        ((PrintWriter)object).print(bl2);
        object = this.zaa;
        object2 = printWriter.append(" mWorkQueue.size()=");
        int n3 = object.size();
        ((PrintWriter)object2).print(n3);
        object = this.zai.zab;
        object2 = printWriter.append(" mUnconsumedApiCalls.size()=");
        n3 = object.size();
        ((PrintWriter)object2).println(n3);
        object = this.zal;
        if (object != null) {
            object.zas(string2, fileDescriptor, printWriter, stringArray);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final BaseImplementation$ApiMethodImpl enqueue(BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        Throwable throwable2;
        block4: {
            block3: {
                Object object;
                block2: {
                    object = baseImplementation$ApiMethodImpl.getApi();
                    Map map2 = this.zac;
                    Object object2 = baseImplementation$ApiMethodImpl.getClientKey();
                    boolean bl2 = map2.containsKey(object2);
                    object = object != null ? ((Api)object).zad() : "the API";
                    String string2 = "GoogleApiClient is not configured to use ";
                    object2 = new StringBuilder(string2);
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(" required for this call.");
                    object = ((StringBuilder)object2).toString();
                    Preconditions.checkArgument(bl2, object);
                    object = this.zaj;
                    object.lock();
                    try {
                        object = this.zal;
                        if (object != null) break block2;
                        object = this.zaa;
                        object.add(baseImplementation$ApiMethodImpl);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                baseImplementation$ApiMethodImpl = object.zae(baseImplementation$ApiMethodImpl);
            }
            this.zaj.unlock();
            return baseImplementation$ApiMethodImpl;
        }
        this.zaj.unlock();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final BaseImplementation$ApiMethodImpl execute(BaseImplementation$ApiMethodImpl object) {
        Throwable throwable2;
        block7: {
            Object object2;
            block4: {
                block6: {
                    block5: {
                        object2 = this.zac;
                        Object object3 = ((BaseImplementation$ApiMethodImpl)object).getApi();
                        Object object4 = ((BaseImplementation$ApiMethodImpl)object).getClientKey();
                        boolean bl2 = object2.containsKey(object4);
                        object3 = object3 != null ? ((Api)object3).zad() : "the API";
                        String string2 = "GoogleApiClient is not configured to use ";
                        object4 = new StringBuilder(string2);
                        ((StringBuilder)object4).append((String)object3);
                        ((StringBuilder)object4).append(" required for this call.");
                        object3 = ((StringBuilder)object4).toString();
                        Preconditions.checkArgument(bl2, object3);
                        object2 = this.zaj;
                        object2.lock();
                        try {
                            object2 = this.zal;
                            if (object2 == null) break block4;
                            boolean bl3 = this.zap;
                            if (!bl3) break block5;
                            object2 = this.zaa;
                            object2.add(object);
                            while (!(bl2 = (object2 = this.zaa).isEmpty())) {
                                object2 = this.zaa;
                                object2 = object2.remove();
                                object2 = (BaseImplementation$ApiMethodImpl)object2;
                                object3 = this.zai;
                                ((zadc)object3).zaa((BasePendingResult)object2);
                                object3 = Status.RESULT_INTERNAL_ERROR;
                                ((BaseImplementation$ApiMethodImpl)object2).setFailedResult((Status)object3);
                            }
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    object = object2.zaf((BaseImplementation$ApiMethodImpl)object);
                }
                this.zaj.unlock();
                return object;
            }
            object2 = "GoogleApiClient is not connected yet.";
            object = new IllegalStateException((String)object2);
            throw object;
        }
        this.zaj.unlock();
        throw throwable2;
    }

    public final Api$Client getClient(Api$AnyClientKey object) {
        object = (Api$Client)this.zac.get(object);
        Preconditions.checkNotNull(object, "Appropriate Api was not requested.");
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ConnectionResult getConnectionResult(Api object) {
        Throwable throwable2;
        block8: {
            int n3;
            Object object2 = this.zaj;
            object2.lock();
            try {
                n3 = this.isConnected();
                if (n3 == 0 && (n3 = this.zap) == 0) {
                    object2 = "Cannot invoke getConnectionResult unless GoogleApiClient is connected";
                    object = new IllegalStateException((String)object2);
                    throw object;
                }
            }
            catch (Throwable throwable2) {
                break block8;
            }
            object2 = this.zac;
            Object object3 = ((Api)object).zab();
            n3 = object2.containsKey(object3);
            if (n3 != 0) {
                object2 = this.zal;
                object2 = Preconditions.checkNotNull(object2);
                object2 = (zaca)object2;
                if ((object2 = object2.zad((Api)object)) != null) {
                    this.zaj.unlock();
                    return object2;
                }
                n3 = this.zap;
                if (n3 != 0) {
                    object = ConnectionResult.RESULT_SUCCESS;
                } else {
                    this.zaf();
                    object2 = "GoogleApiClientImpl";
                    object = ((Api)object).zad();
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append((String)object);
                    object = " requested in getConnectionResult is not connected but is not present in the failed  connections map";
                    ((StringBuilder)object3).append((String)object);
                    object = ((StringBuilder)object3).toString();
                    object3 = new Exception();
                    Log.wtf((String)object2, (String)object, (Throwable)object3);
                    n3 = 8;
                    object3 = null;
                    object = new ConnectionResult(n3, null);
                }
                this.zaj.unlock();
                return object;
            }
            object = ((Api)object).zad();
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((String)object);
            object = " was never registered with GoogleApiClient";
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        this.zaj.unlock();
        throw throwable2;
    }

    public final Context getContext() {
        return this.zan;
    }

    public final Looper getLooper() {
        return this.zao;
    }

    public final boolean hasApi(Api object) {
        Map map2 = this.zac;
        object = ((Api)object).zab();
        return map2.containsKey(object);
    }

    public final boolean hasConnectedApi(Api object) {
        boolean bl2;
        boolean bl3 = this.isConnected();
        if (!bl3) {
            return false;
        }
        Map map2 = this.zac;
        object = ((Api)object).zab();
        return (object = (Api$Client)map2.get(object)) != null && (bl2 = object.isConnected());
    }

    public final boolean isConnected() {
        boolean bl2;
        zaca zaca2 = this.zal;
        return zaca2 != null && (bl2 = zaca2.zaw());
    }

    public final boolean isConnecting() {
        boolean bl2;
        zaca zaca2 = this.zal;
        return zaca2 != null && (bl2 = zaca2.zax());
    }

    public final boolean isConnectionCallbacksRegistered(GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks) {
        return this.zak.zaj(googleApiClient$ConnectionCallbacks);
    }

    public final boolean isConnectionFailedListenerRegistered(GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        return this.zak.zak(googleApiClient$OnConnectionFailedListener);
    }

    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        boolean bl2;
        zaca zaca2 = this.zal;
        return zaca2 != null && (bl2 = zaca2.zay(signInConnectionListener));
    }

    public final void maybeSignOut() {
        zaca zaca2 = this.zal;
        if (zaca2 != null) {
            zaca2.zau();
        }
    }

    public final void reconnect() {
        this.disconnect();
        this.connect();
    }

    public final void registerConnectionCallbacks(GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks) {
        this.zak.zaf(googleApiClient$ConnectionCallbacks);
    }

    public final void registerConnectionFailedListener(GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        this.zak.zag(googleApiClient$OnConnectionFailedListener);
    }

    public final ListenerHolder registerListener(Object object) {
        Object object2 = this.zaj;
        object2.lock();
        try {
            object2 = this.zau;
            Looper looper = this.zao;
            String string2 = "NO_TYPE";
            object = ((ListenerHolders)object2).zaa(object, looper, string2);
            return object;
        }
        finally {
            this.zaj.unlock();
        }
    }

    public final void stopAutoManage(FragmentActivity object) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity)object);
        int n3 = this.zam;
        if (n3 >= 0) {
            object = com.google.android.gms.common.api.internal.zak.zaa(lifecycleActivity);
            int n4 = this.zam;
            ((zak)object).zae(n4);
            return;
        }
        object = new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        throw object;
    }

    public final void unregisterConnectionCallbacks(GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks) {
        this.zak.zah(googleApiClient$ConnectionCallbacks);
    }

    public final void unregisterConnectionFailedListener(GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        this.zak.zai(googleApiClient$OnConnectionFailedListener);
    }

    public final void zaa(ConnectionResult object) {
        Object object2 = this.zat;
        Context context = this.zan;
        int n3 = ((ConnectionResult)object).getErrorCode();
        boolean bl2 = ((GoogleApiAvailabilityLight)object2).isPlayServicesPossiblyUpdating(context, n3);
        if (!bl2) {
            this.zak();
        }
        if (!(bl2 = this.zap)) {
            object2 = this.zak;
            ((com.google.android.gms.common.internal.zak)object2).zac((ConnectionResult)object);
            object = this.zak;
            ((com.google.android.gms.common.internal.zak)object).zaa();
        }
    }

    public final void zab(Bundle bundle) {
        Object object;
        boolean bl2;
        while (!(bl2 = (object = this.zaa).isEmpty())) {
            object = (BaseImplementation$ApiMethodImpl)this.zaa.remove();
            this.execute((BaseImplementation$ApiMethodImpl)object);
        }
        this.zak.zad(bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zac(int n3, boolean bl2) {
        Object object;
        int n4 = 2;
        int n7 = 1;
        if (n3 == n7) {
            if (!bl2 && (n3 = (int)(this.zap ? 1 : 0)) == 0) {
                this.zap = n7;
                zabx zabx2 = this.zab;
                if (zabx2 == null && (n3 = (int)(ClientLibraryUtils.isPackageSide() ? 1 : 0)) == 0) {
                    try {
                        zabx zabx3;
                        GoogleApiAvailability googleApiAvailability = this.zat;
                        object = this.zan;
                        object = object.getApplicationContext();
                        zabd zabd2 = new zabd(this);
                        this.zab = zabx3 = googleApiAvailability.zac((Context)object, zabd2);
                    }
                    catch (SecurityException securityException) {}
                }
                zabc zabc2 = this.zas;
                object = zabc2.obtainMessage(n7);
                long l2 = this.zaq;
                zabc2.sendMessageDelayed((Message)object, l2);
                zabc zabc3 = this.zas;
                object = zabc3.obtainMessage(n4);
                l2 = this.zar;
                zabc3.sendMessageDelayed((Message)object, l2);
            }
            n3 = 1;
        }
        object = this.zai.zab;
        BasePendingResult[] basePendingResultArray = new BasePendingResult[]{};
        for (Message message : object.toArray(basePendingResultArray)) {
            Status status = zadc.zaa;
            message.forceFailureUnlessReady(status);
        }
        this.zak.zae(n3);
        object = this.zak;
        ((com.google.android.gms.common.internal.zak)object).zaa();
        if (n3 == n4) {
            this.zan();
        }
    }

    public final String zaf() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        this.dump("", null, printWriter, null);
        return stringWriter.toString();
    }

    public final boolean zak() {
        boolean bl2 = this.zap;
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        this.zap = false;
        this.zas.removeMessages(2);
        Object object = this.zas;
        bl3 = true;
        object.removeMessages((int)(bl3 ? 1 : 0));
        object = this.zab;
        if (object != null) {
            ((zabx)((Object)object)).zab();
            bl2 = false;
            object = null;
            this.zab = null;
        }
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zao(zada zada2) {
        Throwable throwable2;
        block3: {
            HashSet<zada> hashSet;
            block2: {
                hashSet = this.zaj;
                hashSet.lock();
                try {
                    hashSet = this.zah;
                    if (hashSet != null) break block2;
                    this.zah = hashSet = new HashSet<zada>();
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            hashSet = this.zah;
            hashSet.add(zada2);
            this.zaj.unlock();
            return;
        }
        this.zaj.unlock();
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zap(zada var1_1) {
        block8: {
            var2_4 = this.zaj;
            var2_4.lock();
            var2_4 = this.zah;
            var3_5 = "GoogleApiClientImpl";
            if (var2_4 != null) ** GOTO lbl14
            var1_1 = "Attempted to remove pending transform when no transforms are registered.";
            var2_4 = new Exception();
            Log.wtf((String)var3_5, (String)var1_1, (Throwable)var2_4);
            ** GOTO lbl38
            {
                block9: {
                    block10: {
                        catch (Throwable var1_2) {
                            break block8;
                        }
lbl14:
                        // 1 sources

                        var4_6 = var2_4.remove(var1_1);
                        if (var4_6) break block10;
                        var1_1 = "Failed to remove pending transform - this may lead to memory leaks!";
                        var2_4 = new Exception();
                        Log.wtf((String)var3_5, (String)var1_1, (Throwable)var2_4);
                        break block9;
                    }
                    var1_1 = this.zaj;
                    var1_1.lock();
                    try {
                        block11: {
                            var1_1 = this.zah;
                            if (var1_1 != null) break block11;
                            {
                                var1_1 = this.zaj;
                                var1_1.unlock();
                                ** GOTO lbl35
                            }
                        }
                        var4_6 = var1_1.isEmpty() ^ true;
                        {
                            var2_4 = this.zaj;
                            var2_4.unlock();
                            if (var4_6) break block9;
lbl35:
                            // 2 sources

                            var1_1 = this.zal;
                            if (var1_1 == null) break block9;
                            var1_1.zat();
                        }
                    }
                    catch (Throwable var1_3) {}
                }
                this.zaj.unlock();
                return;
                {
                    var2_4 = this.zaj;
                    var2_4.unlock();
                    throw var1_3;
                }
            }
        }
        this.zaj.unlock();
        throw var1_2;
    }
}

