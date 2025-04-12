/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.moduleinstall.internal.zaab;
import com.google.android.gms.common.moduleinstall.internal.zaf;
import com.google.android.gms.common.moduleinstall.internal.zah;
import com.google.android.gms.common.moduleinstall.internal.zau;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.common.moduleinstall.internal.zaz;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;

public final class zai
implements RemoteCall {
    public final /* synthetic */ zay zaa;
    public final /* synthetic */ AtomicReference zab;
    public final /* synthetic */ InstallStatusListener zac;
    public final /* synthetic */ ApiFeatureRequest zad;
    public final /* synthetic */ zaab zae;

    public /* synthetic */ zai(zay zay2, AtomicReference atomicReference, InstallStatusListener installStatusListener, ApiFeatureRequest apiFeatureRequest, zaab zaab2) {
        this.zaa = zay2;
        this.zab = atomicReference;
        this.zac = installStatusListener;
        this.zad = apiFeatureRequest;
        this.zae = zaab2;
    }

    public final void accept(Object object, Object object2) {
        object = (zaz)object;
        object2 = (TaskCompletionSource)object2;
        Object object3 = this.zaa;
        AtomicReference atomicReference = this.zab;
        InstallStatusListener installStatusListener = this.zac;
        zau zau2 = new zau((zay)object3, atomicReference, (TaskCompletionSource)object2, installStatusListener);
        object = (zaf)((BaseGmsClient)object).getService();
        object2 = this.zad;
        object3 = this.zae;
        ((zaf)object).zag(zau2, (ApiFeatureRequest)object2, (zah)object3);
    }
}

