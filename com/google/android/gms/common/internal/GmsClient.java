/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zah;
import com.google.android.gms.common.internal.zai;
import com.google.android.gms.common.internal.zaj;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class GmsClient
extends BaseGmsClient
implements Api$Client,
zaj {
    private static volatile Executor zaa;
    private final ClientSettings zab;
    private final Set zac;
    private final Account zad;

    public GmsClient(Context object, Handler handler, int n3, ClientSettings clientSettings) {
        GmsClientSupervisor gmsClientSupervisor = GmsClientSupervisor.getInstance(object);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        super((Context)object, handler, gmsClientSupervisor, googleApiAvailability, n3, null, null);
        object = (ClientSettings)Preconditions.checkNotNull(clientSettings);
        this.zab = object;
        object = clientSettings.getAccount();
        this.zad = object;
        object = clientSettings.getAllRequestedScopes();
        object = this.zaa((Set)object);
        this.zac = object;
    }

    public GmsClient(Context context, Looper looper, int n3, ClientSettings clientSettings) {
        GmsClientSupervisor gmsClientSupervisor = GmsClientSupervisor.getInstance(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        this(context, looper, gmsClientSupervisor, googleApiAvailability, n3, clientSettings, null, null);
    }

    public GmsClient(Context context, Looper looper, int n3, ClientSettings clientSettings, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        this(context, looper, n3, clientSettings, (ConnectionCallbacks)googleApiClient$ConnectionCallbacks, (OnConnectionFailedListener)googleApiClient$OnConnectionFailedListener);
    }

    public GmsClient(Context context, Looper looper, int n3, ClientSettings clientSettings, ConnectionCallbacks object, OnConnectionFailedListener onConnectionFailedListener) {
        GmsClientSupervisor gmsClientSupervisor = GmsClientSupervisor.getInstance(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Object object2 = object = Preconditions.checkNotNull(object);
        object2 = (ConnectionCallbacks)object;
        Object object3 = object = Preconditions.checkNotNull(onConnectionFailedListener);
        object3 = (OnConnectionFailedListener)object;
        this(context, looper, gmsClientSupervisor, googleApiAvailability, n3, clientSettings, (ConnectionCallbacks)object2, (OnConnectionFailedListener)object3);
    }

    public GmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailability googleApiAvailability, int n3, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        Object object;
        zah zah2;
        GmsClient gmsClient = this;
        Object object2 = connectionCallbacks;
        OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
        if (connectionCallbacks == null) {
            zah2 = null;
        } else {
            object = new zah(connectionCallbacks);
            zah2 = object;
        }
        Object object3 = onConnectionFailedListener2 == null ? null : (object2 = new zai(onConnectionFailedListener2));
        String string2 = clientSettings.zac();
        object2 = this;
        onConnectionFailedListener2 = context;
        object = gmsClientSupervisor;
        super(context, looper, gmsClientSupervisor, googleApiAvailability, n3, zah2, (BaseGmsClient$BaseOnConnectionFailedListener)object3, string2);
        object2 = clientSettings;
        gmsClient.zab = clientSettings;
        onConnectionFailedListener2 = clientSettings.getAccount();
        gmsClient.zad = onConnectionFailedListener2;
        object2 = clientSettings.getAllRequestedScopes();
        gmsClient.zac = object2 = this.zaa((Set)object2);
    }

    private final Set zaa(Set object) {
        boolean bl2;
        Set set = this.validateScopes((Set)object);
        Iterator iterator = set.iterator();
        while (bl2 = iterator.hasNext()) {
            Scope scope = (Scope)iterator.next();
            bl2 = object.contains(scope);
            if (bl2) continue;
            object = new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            throw object;
        }
        return set;
    }

    public final Account getAccount() {
        return this.zad;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public final ClientSettings getClientSettings() {
        return this.zab;
    }

    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    public final Set getScopes() {
        return this.zac;
    }

    public Set getScopesForConnectionlessNonSignIn() {
        boolean bl2 = this.requiresSignIn();
        Set set = bl2 ? this.zac : Collections.emptySet();
        return set;
    }

    public Set validateScopes(Set set) {
        return set;
    }
}

