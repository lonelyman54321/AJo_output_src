/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 */
package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$HasOptions;
import com.google.android.gms.common.api.Api$BaseClientBuilder;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public final class GoogleApiClient$Builder {
    private Account zaa;
    private final Set zab;
    private final Set zac;
    private int zad;
    private View zae;
    private String zaf;
    private String zag;
    private final Map zah;
    private final Context zai;
    private final Map zaj;
    private LifecycleActivity zak;
    private int zal;
    private GoogleApiClient$OnConnectionFailedListener zam;
    private Looper zan;
    private GoogleApiAvailability zao;
    private Api$AbstractClientBuilder zap;
    private final ArrayList zaq;
    private final ArrayList zar;

    public GoogleApiClient$Builder(Context object) {
        Object object2 = new HashSet();
        this.zab = object2;
        object2 = new HashSet();
        this.zac = object2;
        object2 = new Jp();
        this.zah = object2;
        object2 = new Jp();
        this.zaj = object2;
        this.zal = -1;
        object2 = GoogleApiAvailability.getInstance();
        this.zao = object2;
        object2 = com.google.android.gms.signin.zad.zac;
        this.zap = object2;
        this.zaq = object2 = new ArrayList();
        this.zar = object2 = new ArrayList();
        this.zai = object;
        this.zan = object2 = object.getMainLooper();
        object2 = object.getPackageName();
        this.zaf = object2;
        object = object.getClass().getName();
        this.zag = object;
    }

    public GoogleApiClient$Builder(Context context, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        this(context);
        Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks, "Must provide a connected listener");
        this.zaq.add(googleApiClient$ConnectionCallbacks);
        Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener, "Must provide a connection failed listener");
        this.zar.add(googleApiClient$OnConnectionFailedListener);
    }

    private final void zab(Api api, Api$ApiOptions object, Scope ... object2) {
        Api$BaseClientBuilder api$BaseClientBuilder = (Api$BaseClientBuilder)Preconditions.checkNotNull(api.zac(), "Base client builder must not be null");
        object = api$BaseClientBuilder.getImpliedScopes(object);
        HashSet<Scope> hashSet = new HashSet<Scope>((Collection<Scope>)object);
        int n3 = ((Scope[])object2).length;
        api$BaseClientBuilder = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Scope scope = object2[i3];
            hashSet.add(scope);
        }
        object = this.zah;
        object2 = new zab(hashSet);
        object.put(api, object2);
    }

    public GoogleApiClient$Builder addApi(Api object) {
        Preconditions.checkNotNull(object, "Api must not be null");
        this.zaj.put(object, null);
        object = ((Api$BaseClientBuilder)Preconditions.checkNotNull(((Api)object).zac(), "Base client builder must not be null")).getImpliedScopes(null);
        this.zac.addAll(object);
        this.zab.addAll(object);
        return this;
    }

    public GoogleApiClient$Builder addApi(Api object, Api$ApiOptions$HasOptions api$ApiOptions$HasOptions) {
        Preconditions.checkNotNull(object, "Api must not be null");
        Preconditions.checkNotNull(api$ApiOptions$HasOptions, "Null options are not permitted for this Api");
        this.zaj.put(object, api$ApiOptions$HasOptions);
        object = ((Api$BaseClientBuilder)Preconditions.checkNotNull(((Api)object).zac(), "Base client builder must not be null")).getImpliedScopes(api$ApiOptions$HasOptions);
        this.zac.addAll(object);
        this.zab.addAll(object);
        return this;
    }

    public GoogleApiClient$Builder addApiIfAvailable(Api api, Api$ApiOptions$HasOptions api$ApiOptions$HasOptions, Scope ... scopeArray) {
        Preconditions.checkNotNull(api, "Api must not be null");
        Preconditions.checkNotNull(api$ApiOptions$HasOptions, "Null options are not permitted for this Api");
        this.zaj.put(api, api$ApiOptions$HasOptions);
        this.zab(api, api$ApiOptions$HasOptions, scopeArray);
        return this;
    }

    public GoogleApiClient$Builder addApiIfAvailable(Api api, Scope ... scopeArray) {
        Preconditions.checkNotNull(api, "Api must not be null");
        this.zaj.put(api, null);
        this.zab(api, null, scopeArray);
        return this;
    }

    public GoogleApiClient$Builder addConnectionCallbacks(GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks) {
        Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks, "Listener must not be null");
        this.zaq.add(googleApiClient$ConnectionCallbacks);
        return this;
    }

    public GoogleApiClient$Builder addOnConnectionFailedListener(GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener, "Listener must not be null");
        this.zar.add(googleApiClient$OnConnectionFailedListener);
        return this;
    }

    public GoogleApiClient$Builder addScope(Scope scope) {
        Preconditions.checkNotNull(scope, "Scope must not be null");
        this.zab.add(scope);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public GoogleApiClient build() {
        zabe zabe2;
        int n3;
        ArrayList<Object> arrayList;
        Object object;
        ReentrantLock reentrantLock;
        Object object2;
        Object object3;
        Object object4;
        GoogleApiClient$Builder googleApiClient$Builder = this;
        int n4 = this.zaj.isEmpty();
        int n7 = 1;
        Preconditions.checkArgument((n4 ^= n7) != 0, "must call addApi() to add at least one API");
        Object object5 = this.zaa();
        Object object6 = ((ClientSettings)object5).zad();
        Jp jp = new Jp();
        Jp jp2 = new Jp();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        Object object7 = this.zaj.keySet().iterator();
        ArrayList arrayList3 = null;
        boolean bl2 = false;
        Object object8 = null;
        int n8 = 0;
        Object object9 = null;
        boolean bl3 = false;
        while (bl2 = object7.hasNext()) {
            object4 = object8 = (Object)object7.next();
            object4 = (Api)object8;
            Object v4 = googleApiClient$Builder.zaj.get(object4);
            object8 = object6.get(object4);
            if (object8 != null) {
                bl2 = true;
            } else {
                bl2 = false;
                object8 = null;
            }
            object3 = bl2;
            jp.put(object4, object3);
            object2 = new zat((Api)object4, bl2);
            arrayList2.add(object2);
            Object object10 = object8 = Preconditions.checkNotNull(((Api)object4).zaa());
            object10 = (Api$AbstractClientBuilder)object8;
            object3 = googleApiClient$Builder.zai;
            reentrantLock = googleApiClient$Builder.zan;
            object8 = object10;
            object = object5;
            arrayList = v4;
            Object object11 = object4;
            object4 = object2;
            object8 = ((Api$AbstractClientBuilder)object10).buildClient((Context)object3, (Looper)reentrantLock, (ClientSettings)object5, v4, (GoogleApiClient$ConnectionCallbacks)object2, (GoogleApiClient$OnConnectionFailedListener)object2);
            object3 = ((Api)object11).zab();
            jp2.put(object3, object8);
            int n10 = ((Api$BaseClientBuilder)object10).getPriority();
            if (n10 == n7) {
                bl3 = v4 != null;
            }
            if (!(bl2 = object8.providesSignIn())) continue;
            if (object9 != null) {
                String string2 = ((Api)object11).zad();
                object6 = ((Api)object9).zad();
                string2 = n1.a(string2, " cannot be used with ", (String)object6);
                object5 = new IllegalStateException(string2);
                throw object5;
            }
            object9 = object11;
        }
        if (object9 != null) {
            if (bl3) {
                String string3 = ((Api)object9).zad();
                string3 = cP.a("With using ", string3, ", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                object5 = new IllegalStateException(string3);
                throw object5;
            }
            object6 = googleApiClient$Builder.zaa;
            if (object6 == null) {
                n3 = 1;
            } else {
                n3 = 0;
                object6 = null;
            }
            object8 = ((Api)object9).zad();
            object3 = new Object[n7];
            object3[0] = object8;
            Preconditions.checkState(n3 != 0, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", object3);
            object6 = googleApiClient$Builder.zab;
            object8 = googleApiClient$Builder.zac;
            n3 = (int)(object6.equals(object8) ? 1 : 0);
            object8 = ((Api)object9).zad();
            object3 = new Object[n7];
            object3[0] = object8;
            object8 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.";
            Preconditions.checkState(n3 != 0, (String)object8, object3);
        }
        n8 = zabe.zad(jp2.values(), n7 != 0);
        object3 = googleApiClient$Builder.zai;
        reentrantLock = new ReentrantLock();
        object = googleApiClient$Builder.zan;
        object2 = googleApiClient$Builder.zao;
        object4 = googleApiClient$Builder.zap;
        object7 = googleApiClient$Builder.zaq;
        arrayList3 = googleApiClient$Builder.zar;
        n3 = googleApiClient$Builder.zal;
        object8 = zabe2;
        arrayList = object5;
        object5 = arrayList2;
        zabe2 = new zabe((Context)object3, reentrantLock, (Looper)object, (ClientSettings)((Object)arrayList), (GoogleApiAvailability)object2, (Api$AbstractClientBuilder)object4, jp, (List)object7, arrayList3, jp2, n3, n8, arrayList2);
        object6 = GoogleApiClient.zaq();
        synchronized (object6) {
            object5 = GoogleApiClient.zaq();
            object5.add((zabe)zabe2);
        }
        n4 = googleApiClient$Builder.zal;
        if (n4 >= 0) {
            object5 = com.google.android.gms.common.api.internal.zak.zaa(googleApiClient$Builder.zak);
            n3 = googleApiClient$Builder.zal;
            object8 = googleApiClient$Builder.zam;
            ((zak)object5).zad(n3, zabe2, (GoogleApiClient$OnConnectionFailedListener)object8);
        }
        return zabe2;
    }

    public GoogleApiClient$Builder enableAutoManage(FragmentActivity fragmentActivity, int n3, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        boolean bl2;
        LifecycleActivity lifecycleActivity = new LifecycleActivity(fragmentActivity);
        if (n3 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            fragmentActivity = null;
        }
        Preconditions.checkArgument(bl2, "clientId must be non-negative");
        this.zal = n3;
        this.zam = googleApiClient$OnConnectionFailedListener;
        this.zak = lifecycleActivity;
        return this;
    }

    public GoogleApiClient$Builder enableAutoManage(FragmentActivity fragmentActivity, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        this.enableAutoManage(fragmentActivity, 0, googleApiClient$OnConnectionFailedListener);
        return this;
    }

    public GoogleApiClient$Builder setAccountName(String string2) {
        if (string2 == null) {
            string2 = null;
        } else {
            String string3 = "com.google";
            Account account = new Account(string2, string3);
            string2 = account;
        }
        this.zaa = string2;
        return this;
    }

    public GoogleApiClient$Builder setGravityForPopups(int n3) {
        this.zad = n3;
        return this;
    }

    public GoogleApiClient$Builder setHandler(Handler handler) {
        Preconditions.checkNotNull(handler, "Handler must not be null");
        handler = handler.getLooper();
        this.zan = handler;
        return this;
    }

    public GoogleApiClient$Builder setViewForPopups(View view) {
        Preconditions.checkNotNull(view, "View must not be null");
        this.zae = view;
        return this;
    }

    public GoogleApiClient$Builder useDefaultAccount() {
        this.setAccountName("<<default account>>");
        return this;
    }

    public final ClientSettings zaa() {
        Object object = SignInOptions.zaa;
        Object object2 = this.zaj;
        Api api = com.google.android.gms.signin.zad.zag;
        boolean bl2 = object2.containsKey(api);
        if (bl2) {
            object = (SignInOptions)this.zaj.get(api);
        }
        SignInOptions signInOptions = object;
        api = this.zaa;
        Set set = this.zab;
        Map map2 = this.zah;
        int n3 = this.zad;
        View view = this.zae;
        String string2 = this.zaf;
        String string3 = this.zag;
        object2 = object;
        object = new ClientSettings((Account)api, set, map2, n3, view, string2, string3, signInOptions, false);
        return object;
    }
}

