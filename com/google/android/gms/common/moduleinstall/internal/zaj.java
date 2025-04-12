/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.moduleinstall.internal.zaab;
import com.google.android.gms.common.moduleinstall.internal.zaf;
import com.google.android.gms.common.moduleinstall.internal.zah;
import com.google.android.gms.common.moduleinstall.internal.zav;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.common.moduleinstall.internal.zaz;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zaj
implements RemoteCall {
    public final /* synthetic */ zay zaa;
    public final /* synthetic */ zaab zab;

    public /* synthetic */ zaj(zay zay2, zaab zaab2) {
        this.zaa = zay2;
        this.zab = zaab2;
    }

    public final void accept(Object object, Object object2) {
        object = (zaz)object;
        object2 = (TaskCompletionSource)object2;
        zay zay2 = this.zaa;
        zav zav2 = new zav(zay2, (TaskCompletionSource)object2);
        object = (zaf)((BaseGmsClient)object).getService();
        object2 = this.zab;
        ((zaf)object).zai(zav2, (zah)object2);
    }
}

