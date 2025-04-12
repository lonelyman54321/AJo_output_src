/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class zaag
extends GoogleApiClient {
    private final String zaa;

    public zaag(String string2) {
        this.zaa = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";
    }

    public final ConnectionResult blockingConnect() {
        String string2 = this.zaa;
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(string2);
        throw unsupportedOperationException;
    }

    public final ConnectionResult blockingConnect(long l2, TimeUnit timeUnit) {
        String string2 = this.zaa;
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(string2);
        throw unsupportedOperationException;
    }

    public final PendingResult clearDefaultAccountAndReconnect() {
        String string2 = this.zaa;
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(string2);
        throw unsupportedOperationException;
    }

    public final void connect() {
        String string2 = this.zaa;
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(string2);
        throw unsupportedOperationException;
    }

    public final void disconnect() {
        String string2 = this.zaa;
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(string2);
        throw unsupportedOperationException;
    }

    public final void dump(String object, FileDescriptor object2, PrintWriter printWriter, String[] stringArray) {
        object2 = this.zaa;
        object = new UnsupportedOperationException((String)object2);
        throw object;
    }

    public final ConnectionResult getConnectionResult(Api object) {
        String string2 = this.zaa;
        object = new UnsupportedOperationException(string2);
        throw object;
    }

    public final boolean hasConnectedApi(Api object) {
        String string2 = this.zaa;
        object = new UnsupportedOperationException(string2);
        throw object;
    }

    public final boolean isConnected() {
        String string2 = this.zaa;
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(string2);
        throw unsupportedOperationException;
    }

    public final boolean isConnecting() {
        String string2 = this.zaa;
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(string2);
        throw unsupportedOperationException;
    }

    public final boolean isConnectionCallbacksRegistered(GoogleApiClient$ConnectionCallbacks object) {
        String string2 = this.zaa;
        object = new UnsupportedOperationException(string2);
        throw object;
    }

    public final boolean isConnectionFailedListenerRegistered(GoogleApiClient$OnConnectionFailedListener object) {
        String string2 = this.zaa;
        object = new UnsupportedOperationException(string2);
        throw object;
    }

    public final void reconnect() {
        String string2 = this.zaa;
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(string2);
        throw unsupportedOperationException;
    }

    public final void registerConnectionCallbacks(GoogleApiClient$ConnectionCallbacks object) {
        String string2 = this.zaa;
        object = new UnsupportedOperationException(string2);
        throw object;
    }

    public final void registerConnectionFailedListener(GoogleApiClient$OnConnectionFailedListener object) {
        String string2 = this.zaa;
        object = new UnsupportedOperationException(string2);
        throw object;
    }

    public final void stopAutoManage(FragmentActivity object) {
        String string2 = this.zaa;
        object = new UnsupportedOperationException(string2);
        throw object;
    }

    public final void unregisterConnectionCallbacks(GoogleApiClient$ConnectionCallbacks object) {
        String string2 = this.zaa;
        object = new UnsupportedOperationException(string2);
        throw object;
    }

    public final void unregisterConnectionFailedListener(GoogleApiClient$OnConnectionFailedListener object) {
        String string2 = this.zaa;
        object = new UnsupportedOperationException(string2);
        throw object;
    }
}

