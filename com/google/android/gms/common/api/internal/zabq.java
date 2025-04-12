/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.DeadObjectException
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.RemoteException
 */
package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.zaad;
import com.google.android.gms.common.api.internal.zabm;
import com.google.android.gms.common.api.internal.zabn;
import com.google.android.gms.common.api.internal.zabp;
import com.google.android.gms.common.api.internal.zabs;
import com.google.android.gms.common.api.internal.zabu;
import com.google.android.gms.common.api.internal.zac;
import com.google.android.gms.common.api.internal.zaci;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.api.internal.zah;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.api.internal.zal;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.api.internal.zau;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class zabq
implements GoogleApiClient$ConnectionCallbacks,
GoogleApiClient$OnConnectionFailedListener,
zau {
    final /* synthetic */ GoogleApiManager zaa;
    private final Queue zab;
    private final Api$Client zac;
    private final ApiKey zad;
    private final zaad zae;
    private final Set zaf;
    private final Map zag;
    private final int zah;
    private final zact zai;
    private boolean zaj;
    private final List zak;
    private ConnectionResult zal;
    private int zam;

    public zabq(GoogleApiManager object, GoogleApi googleApi) {
        int n3;
        this.zaa = object;
        Context context = new LinkedList();
        this.zab = context;
        this.zaf = context;
        super();
        this.zag = context;
        super();
        this.zak = context;
        context = null;
        this.zal = null;
        this.zam = 0;
        Object object2 = GoogleApiManager.zad((GoogleApiManager)object).getLooper();
        object2 = googleApi.zab((Looper)object2, this);
        this.zac = object2;
        Object object3 = googleApi.getApiKey();
        this.zad = object3;
        this.zae = object3 = new zaad();
        this.zah = n3 = googleApi.zaa();
        boolean bl2 = object2.requiresSignIn();
        if (bl2) {
            context = GoogleApiManager.zac((GoogleApiManager)object);
            object = GoogleApiManager.zad((GoogleApiManager)object);
            this.zai = object = googleApi.zac(context, (Handler)object);
            return;
        }
        this.zai = null;
    }

    private final Feature zaC(Feature[] featureArray) {
        int n3;
        if (featureArray != null && (n3 = featureArray.length) != 0) {
            long l2;
            Object object;
            int n4;
            Feature[] featureArray2 = this.zac.getAvailableFeatures();
            int n7 = 0;
            if (featureArray2 == null) {
                featureArray2 = new Feature[]{};
            }
            int n8 = featureArray2.length;
            Jp jp = new a53(n8);
            Feature feature = null;
            for (n8 = 0; n8 < (n4 = featureArray2.length); ++n8) {
                object = featureArray2[n8];
                String string2 = ((Feature)object).getName();
                l2 = ((Feature)object).getVersion();
                object = l2;
                jp.put(string2, object);
            }
            n3 = featureArray.length;
            while (n7 < n3) {
                long l3;
                long l4;
                long l7;
                feature = featureArray[n7];
                object = feature.getName();
                if ((object = (Long)jp.get(object)) != null && (l7 = (l4 = (l3 = ((Long)object).longValue()) - (l2 = feature.getVersion())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0) {
                    ++n7;
                    continue;
                }
                return feature;
            }
        }
        return null;
    }

    private final void zaD(ConnectionResult connectionResult) {
        boolean bl2;
        Iterator iterator = this.zaf.iterator();
        while (bl2 = iterator.hasNext()) {
            zal zal2 = (zal)iterator.next();
            Object object = ConnectionResult.RESULT_SUCCESS;
            boolean bl3 = Objects.equal(connectionResult, object);
            if (bl3) {
                object = this.zac.getEndpointPackageName();
            } else {
                bl3 = false;
                object = null;
            }
            ApiKey apiKey = this.zad;
            zal2.zac(apiKey, connectionResult, (String)object);
        }
        this.zaf.clear();
    }

    private final void zaE(Status status) {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        this.zaF(status, null, false);
    }

    private final void zaF(Status object, Exception exception, boolean bl2) {
        Object object2 = GoogleApiManager.zad(this.zaa);
        Preconditions.checkHandlerThread((Handler)object2);
        int n3 = 1;
        boolean bl3 = false;
        zai zai2 = null;
        int n4 = object != null ? 0 : 1;
        if (exception != null) {
            n3 = 0;
            object2 = null;
        }
        if (n4 != n3) {
            object2 = this.zab.iterator();
            while (bl3 = object2.hasNext()) {
                int n7;
                zai2 = (zai)object2.next();
                if (bl2 && (n4 = zai2.zac) != (n7 = 2)) continue;
                if (object != null) {
                    zai2.zad((Status)object);
                } else {
                    zai2.zae(exception);
                }
                object2.remove();
            }
            return;
        }
        object = new IllegalArgumentException("Status XOR exception should be null");
        throw object;
    }

    private final void zaG() {
        Queue queue = this.zab;
        ArrayList arrayList = new ArrayList(queue);
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            zai zai2 = (zai)arrayList.get(i3);
            Object object = this.zac;
            boolean bl2 = object.isConnected();
            if (!bl2) break;
            bl2 = this.zaM(zai2);
            if (!bl2) continue;
            object = this.zab;
            object.remove(zai2);
        }
    }

    private final void zaH() {
        boolean bl2;
        this.zan();
        Object object = ConnectionResult.RESULT_SUCCESS;
        this.zaD((ConnectionResult)object);
        this.zaL();
        object = this.zag.values().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (zaci)object.next();
            Object object3 = ((zaci)object2).zaa.getRequiredFeatures();
            if ((object3 = this.zaC((Feature[])object3)) != null) {
                object.remove();
                continue;
            }
            object2 = ((zaci)object2).zaa;
            object3 = this.zac;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                ((RegisterListenerMethod)object2).registerListener((Api$AnyClient)object3, taskCompletionSource);
            }
            catch (RemoteException remoteException) {
                object.remove();
            }
            catch (DeadObjectException deadObjectException) {
                int n3 = 3;
                this.onConnectionSuspended(n3);
                object = this.zac;
                object2 = "DeadObjectException thrown while calling register listener method.";
                object.disconnect((String)object2);
                break;
            }
        }
        this.zaG();
        this.zaJ();
    }

    private final void zaI(int n3) {
        boolean bl2;
        this.zan();
        this.zaj = bl2 = true;
        Object object = this.zac.getLastDisconnectMessage();
        this.zae.zae(n3, (String)object);
        Object object2 = this.zad;
        object = this.zaa;
        Handler handler = GoogleApiManager.zad((GoogleApiManager)object);
        object2 = Message.obtain((Handler)GoogleApiManager.zad((GoogleApiManager)object), (int)9, (Object)object2);
        handler.sendMessageDelayed((Message)object2, 5000L);
        object2 = this.zad;
        object = this.zaa;
        handler = GoogleApiManager.zad((GoogleApiManager)object);
        object = GoogleApiManager.zad((GoogleApiManager)object);
        int n4 = 11;
        object2 = Message.obtain((Handler)object, (int)n4, (Object)object2);
        long l2 = 120000L;
        handler.sendMessageDelayed((Message)object2, l2);
        GoogleApiManager.zal(this.zaa).zac();
        object2 = this.zag.values().iterator();
        while (bl2 = object2.hasNext()) {
            object = ((zaci)object2.next()).zac;
            object.run();
        }
    }

    private final void zaJ() {
        ApiKey apiKey = this.zad;
        Object object = GoogleApiManager.zad(this.zaa);
        int n3 = 12;
        object.removeMessages(n3, (Object)apiKey);
        apiKey = this.zad;
        object = this.zaa;
        Handler handler = GoogleApiManager.zad((GoogleApiManager)object);
        apiKey = GoogleApiManager.zad((GoogleApiManager)object).obtainMessage(n3, (Object)apiKey);
        long l2 = GoogleApiManager.zab(this.zaa);
        handler.sendMessageDelayed((Message)apiKey, l2);
    }

    private final void zaK(zai zai2) {
        zaad zaad2 = this.zae;
        boolean bl2 = this.zaA();
        zai2.zag(zaad2, bl2);
        try {
            zai2.zaf(this);
            return;
        }
        catch (DeadObjectException deadObjectException) {
            this.onConnectionSuspended(1);
            this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            return;
        }
    }

    private final void zaL() {
        boolean bl2 = this.zaj;
        if (bl2) {
            GoogleApiManager googleApiManager = this.zaa;
            ApiKey apiKey = this.zad;
            GoogleApiManager.zad(googleApiManager).removeMessages(11, (Object)apiKey);
            googleApiManager = this.zaa;
            apiKey = this.zad;
            googleApiManager = GoogleApiManager.zad(googleApiManager);
            int n3 = 9;
            googleApiManager.removeMessages(n3, apiKey);
            bl2 = false;
            googleApiManager = null;
            this.zaj = false;
        }
    }

    private final boolean zaM(zai object) {
        boolean bl2 = object instanceof zac;
        int n3 = 1;
        if (!bl2) {
            this.zaK((zai)object);
            return n3 != 0;
        }
        Object object2 = object;
        object2 = (zac)object;
        Object object3 = ((zac)object2).zab(this);
        if ((object3 = this.zaC((Feature[])object3)) == null) {
            this.zaK((zai)object);
            return n3 != 0;
        }
        this.zac.getClass();
        ((Feature)object3).getName();
        ((Feature)object3).getVersion();
        object = this.zaa;
        int n4 = GoogleApiManager.zaC((GoogleApiManager)object);
        if (n4 != 0 && (n4 = ((zac)object2).zaa(this)) != 0) {
            object = this.zad;
            n3 = 0;
            Handler handler = null;
            object2 = new zabs((ApiKey)object, (Feature)object3, null);
            object = this.zak;
            n4 = object.indexOf(object2);
            long l2 = 5000L;
            int n7 = 15;
            if (n4 >= 0) {
                object = (zabs)this.zak.get(n4);
                GoogleApiManager.zad(this.zaa).removeMessages(n7, object);
                object2 = this.zaa;
                handler = GoogleApiManager.zad((GoogleApiManager)object2);
                object2 = GoogleApiManager.zad((GoogleApiManager)object2);
                object = Message.obtain((Handler)object2, (int)n7, (Object)object);
                handler.sendMessageDelayed((Message)object, l2);
            } else {
                this.zak.add(object2);
                object = this.zaa;
                Handler handler2 = GoogleApiManager.zad((GoogleApiManager)object);
                object = Message.obtain((Handler)GoogleApiManager.zad((GoogleApiManager)object), (int)n7, (Object)object2);
                handler2.sendMessageDelayed((Message)object, l2);
                object = this.zaa;
                object3 = GoogleApiManager.zad((GoogleApiManager)object);
                object = GoogleApiManager.zad((GoogleApiManager)object);
                int n8 = 16;
                object = Message.obtain((Handler)object, (int)n8, (Object)object2);
                long l3 = 120000L;
                object3.sendMessageDelayed((Message)object, l3);
                object = new ConnectionResult(2, null);
                bl2 = this.zaN((ConnectionResult)object);
                if (!bl2) {
                    object2 = this.zaa;
                    n3 = this.zah;
                    ((GoogleApiManager)object2).zaE((ConnectionResult)object, n3);
                }
            }
            return false;
        }
        object = new UnsupportedApiCallException((Feature)object3);
        ((zai)object2).zae((Exception)object);
        return n3 != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zaN(ConnectionResult connectionResult) {
        Object object = GoogleApiManager.zaq();
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2;
                    Object object2 = this.zaa;
                    Object object3 = GoogleApiManager.zah((GoogleApiManager)object2);
                    if (object3 != null && (bl2 = (object2 = GoogleApiManager.zas((GoogleApiManager)object2)).contains(object3 = this.zad))) {
                        object2 = this.zaa;
                        object2 = GoogleApiManager.zah((GoogleApiManager)object2);
                        int n3 = this.zah;
                        ((zap)object2).zah(connectionResult, n3);
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return false;
            }
            throw throwable2;
        }
    }

    private final boolean zaO(boolean bl2) {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        Object object = this.zac;
        boolean bl3 = object.isConnected();
        if (bl3 && (bl3 = (object = this.zag).isEmpty())) {
            object = this.zae;
            bl3 = ((zaad)object).zag();
            if (bl3) {
                if (bl2) {
                    this.zaJ();
                }
            } else {
                this.zac.disconnect("Timing out service connection.");
                return true;
            }
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ Api$Client zae(zabq zabq2) {
        return zabq2.zac;
    }

    public static /* bridge */ /* synthetic */ ApiKey zag(zabq zabq2) {
        return zabq2.zad;
    }

    public static /* bridge */ /* synthetic */ void zai(zabq zabq2, Status status) {
        zabq2.zaE(status);
    }

    public static /* bridge */ /* synthetic */ void zaj(zabq zabq2) {
        zabq2.zaH();
    }

    public static /* bridge */ /* synthetic */ void zak(zabq zabq2, int n3) {
        zabq2.zaI(n3);
    }

    public static /* bridge */ /* synthetic */ void zal(zabq zabq2, zabs object) {
        List list = zabq2.zak;
        boolean bl2 = list.contains(object);
        if (bl2 && !(bl2 = zabq2.zaj)) {
            object = zabq2.zac;
            bl2 = object.isConnected();
            if (!bl2) {
                zabq2.zao();
                return;
            }
            zabq2.zaG();
        }
    }

    public static /* bridge */ /* synthetic */ void zam(zabq zabq2, zabs object) {
        Object object2 = zabq2.zak;
        int n3 = object2.remove(object);
        if (n3 != 0) {
            Object[] objectArray;
            Object[] objectArray2;
            int n4;
            GoogleApiManager.zad(zabq2.zaa).removeMessages(15, object);
            object2 = GoogleApiManager.zad(zabq2.zaa);
            int n7 = 16;
            object2.removeMessages(n7, object);
            object = zabs.zaa((zabs)object);
            object2 = zabq2.zab;
            n3 = object2.size();
            ArrayList<Object[]> arrayList = new ArrayList<Object[]>(n3);
            object2 = zabq2.zab.iterator();
            while ((n4 = object2.hasNext()) != 0) {
                objectArray2 = (Object[])object2.next();
                boolean bl2 = objectArray2 instanceof zac;
                if (!bl2) continue;
                objectArray = objectArray2;
                objectArray = ((zac)objectArray2).zab(zabq2);
                if (objectArray == null || !(bl2 = ArrayUtils.contains(objectArray, object))) continue;
                arrayList.add(objectArray2);
            }
            n3 = arrayList.size();
            objectArray2 = null;
            for (n4 = 0; n4 < n3; ++n4) {
                objectArray = (zai)arrayList.get(n4);
                zabq2.zab.remove(objectArray);
                UnsupportedApiCallException unsupportedApiCallException = new UnsupportedApiCallException((Feature)object);
                objectArray.zae(unsupportedApiCallException);
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zax(zabq zabq2) {
        return zabq2.zaj;
    }

    public static /* bridge */ /* synthetic */ boolean zay(zabq zabq2, boolean bl2) {
        return zabq2.zaO(false);
    }

    public final void onConnected(Bundle object) {
        object = this.zaa;
        Object object2 = Looper.myLooper();
        if (object2 == (object = GoogleApiManager.zad((GoogleApiManager)object).getLooper())) {
            this.zaH();
            return;
        }
        object = GoogleApiManager.zad(this.zaa);
        object2 = new zabm(this);
        object.post((Runnable)object2);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zar(connectionResult, null);
    }

    public final void onConnectionSuspended(int n3) {
        GoogleApiManager googleApiManager = this.zaa;
        Object object = Looper.myLooper();
        if (object == (googleApiManager = GoogleApiManager.zad(googleApiManager).getLooper())) {
            this.zaI(n3);
            return;
        }
        googleApiManager = GoogleApiManager.zad(this.zaa);
        object = new zabn(this, n3);
        googleApiManager.post((Runnable)object);
    }

    public final boolean zaA() {
        return this.zac.requiresSignIn();
    }

    public final boolean zaB() {
        return this.zaO(true);
    }

    public final void zaa(ConnectionResult connectionResult, Api api, boolean bl2) {
        throw null;
    }

    public final int zab() {
        return this.zah;
    }

    public final int zac() {
        return this.zam;
    }

    public final ConnectionResult zad() {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        return this.zal;
    }

    public final Api$Client zaf() {
        return this.zac;
    }

    public final Map zah() {
        return this.zag;
    }

    public final void zan() {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        this.zal = null;
    }

    public final void zao() {
        block15: {
            Object object;
            IllegalStateException illegalStateException2;
            int n3;
            block16: {
                int n4;
                Object object2;
                Object object3;
                block14: {
                    Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
                    Api$Client api$Client = this.zac;
                    n3 = api$Client.isConnected();
                    if (n3 != 0 || (n3 = (api$Client = this.zac).isConnecting()) != 0) break block15;
                    n3 = 10;
                    try {
                        object3 = this.zaa;
                    }
                    catch (IllegalStateException illegalStateException2) {}
                    object = GoogleApiManager.zal((GoogleApiManager)object3);
                    object3 = GoogleApiManager.zac((GoogleApiManager)object3);
                    object2 = this.zac;
                    n4 = ((com.google.android.gms.common.internal.zal)object).zab((Context)object3, (Api$Client)object2);
                    if (n4 == 0) break block14;
                    object2 = null;
                    object = new ConnectionResult(n4, null);
                    object3 = this.zac;
                    object3.getClass();
                    ((ConnectionResult)object).toString();
                    this.zar((ConnectionResult)object, null);
                    return;
                    break block16;
                }
                object3 = this.zaa;
                object = this.zac;
                object2 = this.zad;
                zabu zabu2 = new zabu((GoogleApiManager)object3, (Api$Client)object, (ApiKey)object2);
                n4 = (int)(object.requiresSignIn() ? 1 : 0);
                if (n4 != 0) {
                    object3 = (zact)Preconditions.checkNotNull(this.zai);
                    ((zact)object3).zae(zabu2);
                }
                try {
                    object3 = this.zac;
                }
                catch (SecurityException securityException) {
                    object = new ConnectionResult(n3);
                    this.zar((ConnectionResult)object, securityException);
                    return;
                }
                object3.connect(zabu2);
                return;
            }
            object = new ConnectionResult(n3);
            this.zar((ConnectionResult)object, illegalStateException2);
        }
    }

    public final void zap(zai object) {
        boolean bl2;
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        Object object2 = this.zac;
        boolean bl3 = object2.isConnected();
        if (bl3) {
            bl3 = this.zaM((zai)object);
            if (bl3) {
                this.zaJ();
                return;
            }
            this.zab.add(object);
            return;
        }
        object2 = this.zab;
        object2.add(object);
        object = this.zal;
        if (object != null && (bl2 = ((ConnectionResult)object).hasResolution())) {
            object = this.zal;
            this.zar((ConnectionResult)object, null);
            return;
        }
        this.zao();
    }

    public final void zaq() {
        int n3;
        this.zam = n3 = this.zam + 1;
    }

    public final void zar(ConnectionResult object, Exception object2) {
        int n3;
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        Object object3 = this.zai;
        if (object3 != null) {
            ((zact)object3).zaf();
        }
        this.zan();
        GoogleApiManager.zal(this.zaa).zac();
        this.zaD((ConnectionResult)object);
        object3 = this.zac;
        int n4 = object3 instanceof com.google.android.gms.common.internal.service.zap;
        boolean bl2 = true;
        if (n4 != 0 && (n4 = ((ConnectionResult)object).getErrorCode()) != (n3 = 24)) {
            GoogleApiManager.zat(this.zaa, bl2);
            object3 = this.zaa;
            Handler handler = GoogleApiManager.zad((GoogleApiManager)object3);
            object3 = GoogleApiManager.zad((GoogleApiManager)object3);
            int n7 = 19;
            object3 = object3.obtainMessage(n7);
            long l2 = 300000L;
            handler.sendMessageDelayed((Message)object3, l2);
        }
        if ((n4 = ((ConnectionResult)object).getErrorCode()) == (n3 = 4)) {
            object = GoogleApiManager.zaf();
            this.zaE((Status)object);
            return;
        }
        object3 = this.zab;
        n4 = (int)(object3.isEmpty() ? 1 : 0);
        if (n4 != 0) {
            this.zal = object;
            return;
        }
        n4 = 0;
        object3 = null;
        if (object2 != null) {
            Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
            this.zaF(null, (Exception)object2, false);
            return;
        }
        object2 = this.zaa;
        int n8 = GoogleApiManager.zaC((GoogleApiManager)object2);
        if (n8 != 0) {
            object2 = GoogleApiManager.zag(this.zad, (ConnectionResult)object);
            this.zaF((Status)object2, null, bl2);
            object2 = this.zab;
            n8 = object2.isEmpty();
            if (n8 == 0 && (n8 = this.zaN((ConnectionResult)object)) == 0 && (n8 = ((GoogleApiManager)(object2 = this.zaa)).zaE((ConnectionResult)object, n4 = this.zah)) == 0) {
                n8 = ((ConnectionResult)object).getErrorCode();
                if (n8 == (n4 = 18)) {
                    this.zaj = bl2;
                }
                if ((n8 = (int)(this.zaj ? 1 : 0)) != 0) {
                    object = this.zaa;
                    object2 = this.zad;
                    object3 = GoogleApiManager.zad((GoogleApiManager)object);
                    object = Message.obtain((Handler)GoogleApiManager.zad((GoogleApiManager)object), (int)9, (Object)object2);
                    object3.sendMessageDelayed((Message)object, 5000L);
                    return;
                }
                object2 = this.zad;
                object = GoogleApiManager.zag((ApiKey)object2, (ConnectionResult)object);
                this.zaE((Status)object);
            }
            return;
        }
        object = GoogleApiManager.zag(this.zad, (ConnectionResult)object);
        this.zaE((Status)object);
    }

    public final void zas(ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        Api$Client api$Client = this.zac;
        String string2 = api$Client.getClass().getName();
        String string3 = String.valueOf(connectionResult);
        StringBuilder stringBuilder = new StringBuilder("onSignInFailed for ");
        stringBuilder.append(string2);
        stringBuilder.append(" with ");
        stringBuilder.append(string3);
        string2 = stringBuilder.toString();
        api$Client.disconnect(string2);
        this.zar(connectionResult, null);
    }

    public final void zat(zal zal2) {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        this.zaf.add(zal2);
    }

    public final void zau() {
        Handler handler = GoogleApiManager.zad(this.zaa);
        Preconditions.checkHandlerThread(handler);
        boolean bl2 = this.zaj;
        if (bl2) {
            this.zao();
        }
    }

    public final void zav() {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        Object object = GoogleApiManager.zaa;
        this.zaE((Status)object);
        this.zae.zaf();
        object = this.zag.keySet();
        zabp zabp2 = null;
        ListenerHolder$ListenerKey[] listenerHolder$ListenerKeyArray = new ListenerHolder$ListenerKey[]{};
        for (ListenerHolder$ListenerKey listenerHolder$ListenerKey : object.toArray(listenerHolder$ListenerKeyArray)) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            zah zah2 = new zah(listenerHolder$ListenerKey, taskCompletionSource);
            this.zap(zah2);
        }
        int n3 = 4;
        object = new ConnectionResult(n3);
        this.zaD((ConnectionResult)object);
        object = this.zac;
        boolean bl2 = object.isConnected();
        if (bl2) {
            object = this.zac;
            zabp2 = new zabp(this);
            object.onUserSignOut(zabp2);
        }
    }

    public final void zaw() {
        Object object = GoogleApiManager.zad(this.zaa);
        Preconditions.checkHandlerThread((Handler)object);
        int n3 = this.zaj;
        if (n3 != 0) {
            this.zaL();
            object = this.zaa;
            Object object2 = GoogleApiManager.zae((GoogleApiManager)object);
            object = GoogleApiManager.zac((GoogleApiManager)object);
            n3 = ((GoogleApiAvailability)object2).isGooglePlayServicesAvailable((Context)object);
            int n4 = 18;
            if (n3 == n4) {
                n4 = 21;
                String string2 = "Connection timed out waiting for Google Play services update to complete.";
                object = new Status(n4, string2);
            } else {
                n4 = 22;
                String string3 = "API failed to connect while resuming due to an unknown error.";
                object = new Status(n4, string3);
            }
            this.zaE((Status)object);
            object = this.zac;
            object2 = "Timing out connection while resuming.";
            object.disconnect((String)object2);
        }
    }

    public final boolean zaz() {
        return this.zac.isConnected();
    }
}

