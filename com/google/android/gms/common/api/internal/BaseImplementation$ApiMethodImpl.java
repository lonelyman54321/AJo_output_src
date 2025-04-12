/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.DeadObjectException
 *  android.os.RemoteException
 */
package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.Api$AnyClientKey;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler;
import com.google.android.gms.common.internal.Preconditions;

public abstract class BaseImplementation$ApiMethodImpl
extends BasePendingResult
implements BaseImplementation$ResultHolder {
    private final Api api;
    private final Api$AnyClientKey clientKey;

    public BaseImplementation$ApiMethodImpl(Api$AnyClientKey api$AnyClientKey, GoogleApiClient googleApiClient) {
        googleApiClient = (GoogleApiClient)Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null");
        super(googleApiClient);
        this.clientKey = api$AnyClientKey = (Api$AnyClientKey)Preconditions.checkNotNull(api$AnyClientKey);
        this.api = null;
    }

    public BaseImplementation$ApiMethodImpl(Api api, GoogleApiClient object) {
        object = (GoogleApiClient)Preconditions.checkNotNull(object, "GoogleApiClient must not be null");
        super((GoogleApiClient)object);
        Preconditions.checkNotNull(api, "Api must not be null");
        this.clientKey = object = api.zab();
        this.api = api;
    }

    public BaseImplementation$ApiMethodImpl(BasePendingResult$CallbackHandler object) {
        super((BasePendingResult$CallbackHandler)((Object)object));
        super();
        this.clientKey = object;
        this.api = null;
    }

    private void setFailedResult(RemoteException object) {
        object = object.getLocalizedMessage();
        Status status = new Status(8, (String)object, null);
        this.setFailedResult(status);
    }

    public abstract void doExecute(Api$AnyClient var1);

    public final Api getApi() {
        return this.api;
    }

    public final Api$AnyClientKey getClientKey() {
        return this.clientKey;
    }

    public void onSetFailedResult(Result result2) {
    }

    public final void run(Api$AnyClient api$AnyClient) {
        try {
            this.doExecute(api$AnyClient);
            return;
        }
        catch (RemoteException remoteException) {
            this.setFailedResult(remoteException);
            return;
        }
        catch (DeadObjectException deadObjectException) {
            this.setFailedResult((RemoteException)((Object)deadObjectException));
            throw deadObjectException;
        }
    }

    public final void setFailedResult(Status result2) {
        Preconditions.checkArgument(result2.isSuccess() ^ true, "Failed result must not be success");
        result2 = this.createFailedResult((Status)result2);
        this.setResult(result2);
        this.onSetFailedResult(result2);
    }
}

