/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 */
package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zaj;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class zak
implements Handler.Callback {
    final ArrayList zaa;
    private final zaj zab;
    private final ArrayList zac;
    private final ArrayList zad;
    private volatile boolean zae;
    private final AtomicInteger zaf;
    private boolean zag;
    private final Handler zah;
    private final Object zai;

    public zak(Looper looper, zaj object) {
        AtomicInteger atomicInteger;
        Object object2 = new ArrayList();
        this.zac = object2;
        object2 = new ArrayList();
        this.zaa = object2;
        object2 = new ArrayList();
        this.zad = object2;
        this.zae = false;
        this.zaf = atomicInteger = new AtomicInteger(0);
        this.zag = false;
        this.zai = object2 = new Object();
        this.zab = object;
        super(looper, this);
        this.zah = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean handleMessage(Message object) {
        int n3 = ((Message)object).what;
        int n4 = 1;
        if (n3 != n4) {
            object = hj0_0.a(n3, "Don't know how to handle message: ");
            Exception exception = new Exception();
            Log.wtf((String)"GmsClientEvents", (String)object, (Throwable)exception);
            return false;
        }
        object = (GoogleApiClient$ConnectionCallbacks)((Message)object).obj;
        Object object2 = this.zai;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object3;
                        n3 = (int)(this.zae ? 1 : 0);
                        if (!n3 || !(n3 = (object3 = this.zab).isConnected()) || !(n3 = ((ArrayList)(object3 = this.zac)).contains(object))) break block4;
                        n3 = 0;
                        object3 = null;
                        object.onConnected(null);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return n4 != 0;
            }
            throw throwable2;
        }
    }

    public final void zaa() {
        this.zae = false;
        this.zaf.incrementAndGet();
    }

    public final void zab() {
        this.zae = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zac(ConnectionResult connectionResult) {
        Object object = this.zah;
        Object object2 = "onConnectionFailure must only be called on the Handler thread";
        Preconditions.checkHandlerThread(object, (String)object2);
        object = this.zah;
        int n3 = 1;
        object.removeMessages(n3);
        object = this.zai;
        synchronized (object) {
            int n4;
            try {
                Serializable serializable = this.zad;
                object2 = new ArrayList(serializable);
                serializable = this.zaf;
                n4 = ((AtomicInteger)serializable).get();
                object2 = ((ArrayList)object2).iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                Serializable serializable;
                boolean bl2;
                if (!(bl2 = object2.hasNext())) {
                    return;
                }
                Object object3 = object2.next();
                object3 = (GoogleApiClient$OnConnectionFailedListener)object3;
                int n7 = this.zae;
                if (n7 == 0 || (n7 = ((AtomicInteger)(serializable = this.zaf)).get()) != n4) break;
                serializable = this.zad;
                n7 = (int)(((ArrayList)serializable).contains(object3) ? 1 : 0);
                if (n7 == 0) continue;
                object3.onConnectionFailed(connectionResult);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zad(Bundle object) {
        Object object2 = this.zah;
        Object object3 = "onConnectionSuccess must only be called on the Handler thread";
        Preconditions.checkHandlerThread(object2, (String)object3);
        object2 = this.zai;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                int n3;
                boolean bl3;
                try {
                    bl3 = this.zag;
                    n3 = 1;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                Preconditions.checkState(bl3 ^= n3);
                object3 = this.zah;
                object3.removeMessages(n3);
                this.zag = n3;
                object3 = this.zaa;
                bl3 = ((ArrayList)object3).isEmpty();
                Preconditions.checkState(bl3);
                Serializable serializable = this.zac;
                object3 = new ArrayList(serializable);
                serializable = this.zaf;
                n3 = ((AtomicInteger)serializable).get();
                object3 = ((ArrayList)object3).iterator();
                while (bl2 = object3.hasNext()) {
                    Object object4;
                    Object object5 = object3.next();
                    object5 = (GoogleApiClient$ConnectionCallbacks)object5;
                    int n4 = this.zae;
                    if (n4 == 0 || (n4 = (object4 = this.zab).isConnected()) == 0 || (n4 = ((AtomicInteger)(object4 = this.zaf)).get()) != n3) break;
                    object4 = this.zaa;
                    n4 = (int)(((ArrayList)object4).contains(object5) ? 1 : 0);
                    if (n4 != 0) continue;
                    object5.onConnected((Bundle)object);
                }
                object = this.zaa;
                ((ArrayList)object).clear();
                object = null;
                this.zag = false;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zae(int n3) {
        Object object = this.zah;
        Object object2 = "onUnintentionalDisconnection must only be called on the Handler thread";
        Preconditions.checkHandlerThread(object, (String)object2);
        object = this.zah;
        int n4 = 1;
        object.removeMessages(n4);
        object = this.zai;
        synchronized (object) {
            boolean bl2;
            int n7;
            try {
                this.zag = n4;
                Serializable serializable = this.zac;
                object2 = new ArrayList(serializable);
                serializable = this.zaf;
                n7 = ((AtomicInteger)serializable).get();
                object2 = ((ArrayList)object2).iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (bl2 = object2.hasNext()) {
                Serializable serializable;
                Object object3 = object2.next();
                object3 = (GoogleApiClient$ConnectionCallbacks)object3;
                int n8 = this.zae;
                if (n8 == 0 || (n8 = ((AtomicInteger)(serializable = this.zaf)).get()) != n7) break;
                serializable = this.zac;
                n8 = (int)(((ArrayList)serializable).contains(object3) ? 1 : 0);
                if (n8 == 0) continue;
                object3.onConnectionSuspended(n3);
            }
            ArrayList arrayList = this.zaa;
            arrayList.clear();
            n3 = 0;
            arrayList = null;
            this.zag = false;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zaf(GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks) {
        int n3;
        Object object;
        block5: {
            ArrayList arrayList;
            block4: {
                Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks);
                object = this.zai;
                // MONITORENTER : object
                arrayList = this.zac;
                n3 = arrayList.contains(googleApiClient$ConnectionCallbacks);
                if (n3 == 0) break block4;
                String.valueOf(googleApiClient$ConnectionCallbacks);
                break block5;
            }
            arrayList = this.zac;
            arrayList.add(googleApiClient$ConnectionCallbacks);
        }
        // MONITOREXIT : object
        object = this.zab;
        boolean bl2 = object.isConnected();
        if (!bl2) return;
        object = this.zah;
        n3 = 1;
        googleApiClient$ConnectionCallbacks = object.obtainMessage(n3, (Object)googleApiClient$ConnectionCallbacks);
        object.sendMessage((Message)googleApiClient$ConnectionCallbacks);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zag(GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener);
        Object object = this.zai;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    ArrayList arrayList;
                    block3: {
                        try {
                            arrayList = this.zad;
                            boolean bl2 = arrayList.contains(googleApiClient$OnConnectionFailedListener);
                            if (!bl2) break block3;
                            String.valueOf(googleApiClient$OnConnectionFailedListener);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    arrayList = this.zad;
                    arrayList.add(googleApiClient$OnConnectionFailedListener);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zah(GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks) {
        Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks);
        Object object = this.zai;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                block5: {
                    boolean bl2;
                    ArrayList arrayList;
                    block4: {
                        try {
                            arrayList = this.zac;
                            bl2 = arrayList.remove(googleApiClient$ConnectionCallbacks);
                            if (bl2) break block4;
                            String.valueOf(googleApiClient$ConnectionCallbacks);
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    bl2 = this.zag;
                    if (bl2) {
                        arrayList = this.zaa;
                        arrayList.add(googleApiClient$ConnectionCallbacks);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zai(GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener);
        Object object = this.zai;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        ArrayList arrayList = this.zad;
                        boolean bl2 = arrayList.remove(googleApiClient$OnConnectionFailedListener);
                        if (bl2) break block3;
                        String.valueOf(googleApiClient$OnConnectionFailedListener);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zaj(GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks) {
        Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks);
        Object object = this.zai;
        synchronized (object) {
            ArrayList arrayList = this.zac;
            return arrayList.contains(googleApiClient$ConnectionCallbacks);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zak(GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener);
        Object object = this.zai;
        synchronized (object) {
            ArrayList arrayList = this.zad;
            return arrayList.contains(googleApiClient$OnConnectionFailedListener);
        }
    }
}

