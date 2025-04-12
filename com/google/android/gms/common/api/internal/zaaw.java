/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Looper
 *  android.util.Log
 */
package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$AnyClientKey;
import com.google.android.gms.common.api.Api$BaseClientBuilder;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.zaak;
import com.google.android.gms.common.api.internal.zaal;
import com.google.android.gms.common.api.internal.zaao;
import com.google.android.gms.common.api.internal.zaap;
import com.google.android.gms.common.api.internal.zaat;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.api.internal.zabj;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public final class zaaw
implements zabf {
    private final zabi zaa;
    private final Lock zab;
    private final Context zac;
    private final GoogleApiAvailabilityLight zad;
    private ConnectionResult zae;
    private int zaf;
    private int zag = 0;
    private int zah;
    private final Bundle zai;
    private final Set zaj;
    private zae zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private IAccountAccessor zao;
    private boolean zap;
    private boolean zaq;
    private final ClientSettings zar;
    private final Map zas;
    private final Api$AbstractClientBuilder zat;
    private final ArrayList zau;

    public zaaw(zabi zabi2, ClientSettings clientSettings, Map map2, GoogleApiAvailabilityLight googleApiAvailabilityLight, Api$AbstractClientBuilder api$AbstractClientBuilder, Lock lock, Context context) {
        Object object;
        this.zai = object = new Bundle();
        this.zaj = object;
        super();
        this.zau = object;
        this.zaa = zabi2;
        this.zar = clientSettings;
        this.zas = map2;
        this.zad = googleApiAvailabilityLight;
        this.zat = api$AbstractClientBuilder;
        this.zab = lock;
        this.zac = context;
    }

    private final void zaA() {
        boolean bl2;
        this.zam = false;
        Object object = this.zaa.zag;
        Object object2 = Collections.emptySet();
        ((zabe)object).zad = object2;
        object = this.zaj.iterator();
        while (bl2 = object.hasNext()) {
            Object object3 = this.zaa.zab;
            object2 = (Api$AnyClientKey)object.next();
            boolean bl3 = object3.containsKey(object2);
            if (bl3) continue;
            object3 = this.zaa;
            int n3 = 17;
            ConnectionResult connectionResult = new ConnectionResult(n3, null);
            object3 = ((zabi)object3).zab;
            object3.put(object2, connectionResult);
        }
    }

    private final void zaB(boolean bl2) {
        zae zae2 = this.zak;
        if (zae2 != null) {
            boolean bl3 = zae2.isConnected();
            if (bl3 && bl2) {
                zae2.zaa();
            }
            zae2.disconnect();
            ClientSettings cfr_ignored_0 = (ClientSettings)Preconditions.checkNotNull(this.zar);
            bl2 = false;
            this.zao = null;
        }
    }

    private final void zaC() {
        boolean bl2;
        boolean bl3;
        this.zaa.zai();
        Bundle bundle = zabj.zaa();
        Object object = new zaak(this);
        bundle.execute((Runnable)object);
        bundle = this.zak;
        if (bundle != null) {
            bl3 = this.zap;
            if (bl3) {
                object = (IAccountAccessor)Preconditions.checkNotNull(this.zao);
                boolean bl4 = this.zaq;
                bundle.zac((IAccountAccessor)object, bl4);
            }
            bl2 = false;
            bundle = null;
            this.zaB(false);
        }
        bundle = this.zaa.zab.keySet().iterator();
        while (bl3 = bundle.hasNext()) {
            object = (Api$AnyClientKey)bundle.next();
            Map map2 = this.zaa.zaa;
            object = (Api$Client)Preconditions.checkNotNull((Api$Client)map2.get(object));
            object.disconnect();
        }
        bundle = this.zai;
        bl2 = bundle.isEmpty();
        if (bl2) {
            bl2 = false;
            bundle = null;
        } else {
            bundle = this.zai;
        }
        this.zaa.zah.zab(bundle);
    }

    private final void zaD(ConnectionResult connectionResult) {
        this.zaz();
        boolean bl2 = connectionResult.hasResolution() ^ true;
        this.zaB(bl2);
        this.zaa.zak(connectionResult);
        this.zaa.zah.zaa(connectionResult);
    }

    private final void zaE(ConnectionResult connectionResult, Api object, boolean n3) {
        Object object2;
        block5: {
            int n4;
            block4: {
                Api$BaseClientBuilder api$BaseClientBuilder = ((Api)object).zac();
                n4 = api$BaseClientBuilder.getPriority();
                if (n3 == 0 || (n3 = connectionResult.hasResolution()) != 0) break block4;
                object2 = this.zad;
                int n7 = connectionResult.getErrorCode();
                if ((object2 = ((GoogleApiAvailabilityLight)object2).getErrorResolutionIntent(n7)) == null) break block5;
            }
            if ((object2 = this.zae) == null || n4 < (n3 = this.zaf)) {
                this.zae = connectionResult;
                this.zaf = n4;
            }
        }
        object2 = this.zaa;
        object = ((Api)object).zab();
        ((zabi)object2).zab.put(object, connectionResult);
    }

    private final void zaF() {
        int n3 = this.zah;
        if (n3 == 0 && ((n3 = (int)(this.zam ? 1 : 0)) == 0 || (n3 = (int)(this.zan ? 1 : 0)) != 0)) {
            Object object;
            Object object2;
            boolean bl2;
            int n4;
            Object object3 = new ArrayList();
            this.zag = 1;
            this.zah = n4 = this.zaa.zaa.size();
            Object object4 = this.zaa.zaa.keySet().iterator();
            while (bl2 = object4.hasNext()) {
                object2 = this.zaa.zab;
                object = (Api$AnyClientKey)object4.next();
                boolean bl3 = object2.containsKey(object);
                if (bl3) {
                    bl2 = this.zaH();
                    if (!bl2) continue;
                    this.zaC();
                    continue;
                }
                object2 = this.zaa.zaa;
                object = (Api$Client)object2.get(object);
                ((ArrayList)object3).add(object);
            }
            n4 = (int)(((ArrayList)object3).isEmpty() ? 1 : 0);
            if (n4 == 0) {
                object4 = this.zau;
                object = zabj.zaa();
                object2 = new zaap(this, (ArrayList)object3);
                object3 = object.submit((Runnable)object2);
                ((ArrayList)object4).add(object3);
            }
        }
    }

    private final boolean zaG(int n3) {
        int n4 = this.zag;
        if (n4 != n3) {
            this.zaa.zag.zaf();
            String string2 = this.toString();
            "Unexpected callback in ".concat(string2);
            zaaw.zaJ(this.zag);
            zaaw.zaJ(n3);
            new Exception();
            ConnectionResult connectionResult = new ConnectionResult(8, null);
            this.zaD(connectionResult);
            return false;
        }
        return true;
    }

    private final boolean zaH() {
        int n3;
        this.zah = n3 = this.zah + -1;
        if (n3 > 0) {
            return false;
        }
        if (n3 < 0) {
            this.zaa.zag.zaf();
            Object object = new Exception();
            Log.wtf((String)"GACConnecting", (String)"GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", (Throwable)object);
            object = new ConnectionResult(8, null);
            this.zaD((ConnectionResult)object);
            return false;
        }
        ConnectionResult connectionResult = this.zae;
        if (connectionResult != null) {
            int n4;
            zabi zabi2 = this.zaa;
            zabi2.zaf = n4 = this.zaf;
            this.zaD(connectionResult);
            return false;
        }
        return true;
    }

    private final boolean zaI(ConnectionResult connectionResult) {
        boolean bl2;
        boolean bl3 = this.zal;
        return bl3 && !(bl2 = connectionResult.hasResolution());
    }

    private static final String zaJ(int n3) {
        if (n3 != 0) {
            return "STEP_GETTING_REMOTE_SERVICE";
        }
        return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public static /* bridge */ /* synthetic */ Context zac(zaaw zaaw2) {
        return zaaw2.zac;
    }

    public static /* bridge */ /* synthetic */ GoogleApiAvailabilityLight zaf(zaaw zaaw2) {
        return zaaw2.zad;
    }

    public static /* bridge */ /* synthetic */ zabi zak(zaaw zaaw2) {
        return zaaw2.zaa;
    }

    public static /* bridge */ /* synthetic */ ClientSettings zal(zaaw zaaw2) {
        return zaaw2.zar;
    }

    public static /* bridge */ /* synthetic */ IAccountAccessor zam(zaaw zaaw2) {
        return zaaw2.zao;
    }

    public static /* bridge */ /* synthetic */ zae zan(zaaw zaaw2) {
        return zaaw2.zak;
    }

    public static /* bridge */ /* synthetic */ Set zao(zaaw hashSet) {
        Object object = ((zaaw)((Object)hashSet)).zar;
        if (object == null) {
            hashSet = Collections.emptySet();
        } else {
            boolean bl2;
            object = ((ClientSettings)object).getRequiredScopes();
            HashSet hashSet2 = new HashSet(object);
            object = ((zaaw)((Object)hashSet)).zar.zad();
            Iterator iterator = object.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                Object object2 = (Api)iterator.next();
                Object object3 = ((zaaw)((Object)hashSet)).zaa;
                object3 = ((zabi)object3).zab;
                Api$AnyClientKey api$AnyClientKey = ((Api)object2).zab();
                boolean bl3 = object3.containsKey(api$AnyClientKey);
                if (bl3) continue;
                object2 = ((zab)object.get((Object)object2)).zaa;
                hashSet2.addAll(object2);
            }
            hashSet = hashSet2;
        }
        return hashSet;
    }

    public static /* bridge */ /* synthetic */ Lock zap(zaaw zaaw2) {
        return zaaw2.zab;
    }

    public static /* bridge */ /* synthetic */ void zaq(zaaw zaaw2) {
        zaaw2.zaA();
    }

    public static /* bridge */ /* synthetic */ void zar(zaaw zaaw2, zak object) {
        Object object2 = null;
        boolean bl2 = zaaw2.zaG(0);
        if (!bl2) {
            return;
        }
        object2 = ((zak)object).zaa();
        boolean bl3 = ((ConnectionResult)object2).isSuccess();
        if (bl3) {
            boolean bl4;
            object2 = ((zav)(object = (zav)Preconditions.checkNotNull(((zak)object).zab()))).zaa();
            bl3 = ((ConnectionResult)object2).isSuccess();
            if (!bl3) {
                object = String.valueOf(object2);
                Exception exception = new Exception();
                object = "Sign-in succeeded with resolve account failure: ".concat((String)object);
                Log.wtf((String)"GACConnecting", (String)object, (Throwable)exception);
                zaaw2.zaD((ConnectionResult)object2);
                return;
            }
            zaaw2.zan = true;
            zaaw2.zao = object2 = (IAccountAccessor)Preconditions.checkNotNull(((zav)object).zab());
            zaaw2.zap = bl2 = ((zav)object).zac();
            zaaw2.zaq = bl4 = ((zav)object).zad();
            zaaw2.zaF();
            return;
        }
        boolean bl5 = zaaw2.zaI((ConnectionResult)object2);
        if (bl5) {
            zaaw2.zaA();
            zaaw2.zaF();
            return;
        }
        zaaw2.zaD((ConnectionResult)object2);
    }

    public static /* bridge */ /* synthetic */ void zas(zaaw zaaw2, ConnectionResult connectionResult) {
        zaaw2.zaD(connectionResult);
    }

    public static /* bridge */ /* synthetic */ void zat(zaaw zaaw2, ConnectionResult connectionResult, Api api, boolean bl2) {
        zaaw2.zaE(connectionResult, api, bl2);
    }

    public static /* bridge */ /* synthetic */ void zau(zaaw zaaw2) {
        zaaw2.zaF();
    }

    public static /* bridge */ /* synthetic */ boolean zav(zaaw zaaw2) {
        return zaaw2.zam;
    }

    public static /* bridge */ /* synthetic */ boolean zaw(zaaw zaaw2, int n3) {
        return zaaw2.zaG(0);
    }

    public static /* bridge */ /* synthetic */ boolean zax(zaaw zaaw2) {
        return zaaw2.zaH();
    }

    public static /* bridge */ /* synthetic */ boolean zay(zaaw zaaw2, ConnectionResult connectionResult) {
        return zaaw2.zaI(connectionResult);
    }

    private final void zaz() {
        ArrayList arrayList = this.zau;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Future future = (Future)arrayList.get(i3);
            boolean bl2 = true;
            future.cancel(bl2);
        }
        this.zau.clear();
    }

    public final BaseImplementation$ApiMethodImpl zaa(BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        this.zaa.zag.zaa.add(baseImplementation$ApiMethodImpl);
        return baseImplementation$ApiMethodImpl;
    }

    public final BaseImplementation$ApiMethodImpl zab(BaseImplementation$ApiMethodImpl object) {
        object = new IllegalStateException("GoogleApiClient is not connected yet.");
        throw object;
    }

    public final void zad() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Api api;
        boolean bl2;
        int n3;
        this.zaa.zab.clear();
        int n4 = 0;
        Object object6 = null;
        this.zam = false;
        Object object7 = null;
        this.zae = null;
        this.zag = 0;
        this.zal = n3 = 1;
        this.zan = false;
        this.zap = false;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object object8 = this.zas.keySet().iterator();
        int n7 = 0;
        Context context = null;
        while (bl2 = object8.hasNext()) {
            api = (Api)object8.next();
            object5 = this.zaa;
            object4 = api.zab();
            object5 = (Api$Client)Preconditions.checkNotNull((Api$Client)((zabi)object5).zaa.get(object4));
            object4 = api.zac();
            int n8 = ((Api$BaseClientBuilder)object4).getPriority();
            if (n8 == n3) {
                n8 = 1;
            } else {
                n8 = 0;
                object4 = null;
            }
            n7 |= n8;
            object4 = (Boolean)this.zas.get(api);
            n8 = (int)(((Boolean)object4).booleanValue() ? 1 : 0);
            boolean bl3 = object5.requiresSignIn();
            if (bl3) {
                this.zam = n3;
                if (n8 != 0) {
                    object3 = this.zaj;
                    object2 = api.zab();
                    object3.add(object2);
                } else {
                    this.zal = false;
                }
            }
            object3 = new zaal(this, api, n8 != 0);
            hashMap.put(object5, object3);
        }
        if (n7 != 0) {
            this.zam = false;
        }
        if ((n4 = this.zam) != 0) {
            Preconditions.checkNotNull(this.zar);
            Preconditions.checkNotNull(this.zat);
            object6 = this.zar;
            n3 = System.identityHashCode(this.zaa.zag);
            object = n3;
            ((ClientSettings)object6).zae((Integer)object);
            object2 = new zaat(this, null);
            object8 = this.zat;
            context = this.zac;
            object6 = this.zaa;
            object5 = this.zar;
            api = ((zabi)object6).zag.getLooper();
            object4 = ((ClientSettings)object5).zaa();
            object3 = object2;
            this.zak = object6 = ((Api$AbstractClientBuilder)object8).buildClient(context, (Looper)api, (ClientSettings)object5, object4, (GoogleApiClient$ConnectionCallbacks)object2, (GoogleApiClient$OnConnectionFailedListener)object2);
        }
        this.zah = n4 = this.zaa.zaa.size();
        object6 = this.zau;
        object7 = zabj.zaa();
        object = new zaao(this, hashMap);
        object7 = object7.submit((Runnable)object);
        ((ArrayList)object6).add(object7);
    }

    public final void zae() {
    }

    public final void zag(Bundle bundle) {
        boolean bl2 = this.zaG(1);
        if (bl2) {
            boolean bl3;
            if (bundle != null) {
                Bundle bundle2 = this.zai;
                bundle2.putAll(bundle);
            }
            if (bl3 = this.zaH()) {
                this.zaC();
            }
        }
    }

    public final void zah(ConnectionResult connectionResult, Api api, boolean bl2) {
        boolean bl3 = this.zaG(1);
        if (bl3) {
            this.zaE(connectionResult, api, bl2);
            boolean bl4 = this.zaH();
            if (bl4) {
                this.zaC();
            }
        }
    }

    public final void zai(int n3) {
        ConnectionResult connectionResult = new ConnectionResult(8, null);
        this.zaD(connectionResult);
    }

    public final boolean zaj() {
        this.zaz();
        boolean bl2 = true;
        this.zaB(bl2);
        this.zaa.zak(null);
        return bl2;
    }
}

