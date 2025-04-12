/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 */
package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.auth.api.signin.internal.zbs;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.auth-api.zbbj;

public final class zbe
extends GmsClient {
    private final GoogleSignInOptions zba;

    public zbe(Context object, Looper object2, ClientSettings object3, GoogleSignInOptions scopeArray, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        int n3 = 91;
        super((Context)object, (Looper)object2, n3, (ClientSettings)object3, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
        if (scopeArray != null) {
            super((GoogleSignInOptions)scopeArray);
        } else {
            super();
        }
        object2 = zbbj.zba();
        ((GoogleSignInOptions$Builder)object).setLogSessionId((String)object2);
        object2 = ((ClientSettings)object3).getAllRequestedScopes();
        boolean bl2 = object2.isEmpty();
        if (!bl2) {
            boolean bl3;
            object2 = ((ClientSettings)object3).getAllRequestedScopes().iterator();
            while (bl3 = object2.hasNext()) {
                object3 = (Scope)object2.next();
                scopeArray = new Scope[]{};
                ((GoogleSignInOptions$Builder)object).requestScopes((Scope)object3, scopeArray);
            }
        }
        this.zba = object = ((GoogleSignInOptions$Builder)object).build();
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
            boolean bl2 = iInterface instanceof zbs;
            if (bl2) {
                object = iInterface;
                object = (zbs)iInterface;
            } else {
                iInterface = new zbs((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final Intent getSignInIntent() {
        Context context = this.getContext();
        GoogleSignInOptions googleSignInOptions = this.zba;
        return zbm.zbc(context, googleSignInOptions);
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final boolean providesSignIn() {
        return true;
    }

    public final GoogleSignInOptions zba() {
        return this.zba;
    }
}

