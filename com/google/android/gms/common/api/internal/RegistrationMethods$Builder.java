/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zacj;
import com.google.android.gms.common.api.internal.zack;
import com.google.android.gms.common.api.internal.zacl;
import com.google.android.gms.common.api.internal.zacm;
import com.google.android.gms.common.internal.Preconditions;

public class RegistrationMethods$Builder {
    private RemoteCall zaa;
    private RemoteCall zab;
    private Runnable zac;
    private ListenerHolder zad;
    private Feature[] zae;
    private boolean zaf;
    private int zag;

    private RegistrationMethods$Builder() {
        zacj zacj2 = zacj.zaa;
        this.zac = zacj2;
        this.zaf = true;
    }

    public /* synthetic */ RegistrationMethods$Builder(zacm object) {
        this.zac = object = zacj.zaa;
        this.zaf = true;
    }

    public static /* bridge */ /* synthetic */ RemoteCall zaa(RegistrationMethods$Builder registrationMethods$Builder) {
        return registrationMethods$Builder.zaa;
    }

    public static /* bridge */ /* synthetic */ RemoteCall zab(RegistrationMethods$Builder registrationMethods$Builder) {
        return registrationMethods$Builder.zab;
    }

    public RegistrationMethods build() {
        zack zack2;
        boolean bl2;
        Object object = this.zaa;
        boolean bl3 = false;
        RegistrationMethods registrationMethods = null;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Object object2 = "Must set register function";
        Preconditions.checkArgument(bl2, object2);
        object = this.zab;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        object2 = "Must set unregister function";
        Preconditions.checkArgument(bl2, object2);
        object = this.zad;
        if (object != null) {
            bl3 = true;
        }
        Preconditions.checkArgument(bl3, "Must set holder");
        object = (ListenerHolder$ListenerKey)Preconditions.checkNotNull(this.zad.getListenerKey(), "Key must not be null");
        ListenerHolder listenerHolder = this.zad;
        Feature[] featureArray = this.zae;
        boolean bl4 = this.zaf;
        int n3 = this.zag;
        Object object3 = zack2;
        object2 = this;
        zack2 = new zack(this, listenerHolder, featureArray, bl4, n3);
        object3 = new zacl(this, (ListenerHolder$ListenerKey)object);
        object = this.zac;
        registrationMethods = new RegistrationMethods(zack2, (UnregisterListenerMethod)object3, (Runnable)object, null);
        return registrationMethods;
    }

    public RegistrationMethods$Builder onConnectionSuspended(Runnable runnable2) {
        this.zac = runnable2;
        return this;
    }

    public RegistrationMethods$Builder register(RemoteCall remoteCall) {
        this.zaa = remoteCall;
        return this;
    }

    public RegistrationMethods$Builder setAutoResolveMissingFeatures(boolean bl2) {
        this.zaf = bl2;
        return this;
    }

    public RegistrationMethods$Builder setFeatures(Feature ... featureArray) {
        this.zae = featureArray;
        return this;
    }

    public RegistrationMethods$Builder setMethodKey(int n3) {
        this.zag = n3;
        return this;
    }

    public RegistrationMethods$Builder unregister(RemoteCall remoteCall) {
        this.zab = remoteCall;
        return this;
    }

    public RegistrationMethods$Builder withHolder(ListenerHolder listenerHolder) {
        this.zad = listenerHolder;
        return this;
    }
}

