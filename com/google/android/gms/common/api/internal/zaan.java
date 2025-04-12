/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaao;
import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.api.internal.zabg;
import com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks;

final class zaan
extends zabg {
    final /* synthetic */ BaseGmsClient$ConnectionProgressReportCallbacks zaa;

    public zaan(zaao zaao2, zabf zabf2, BaseGmsClient$ConnectionProgressReportCallbacks baseGmsClient$ConnectionProgressReportCallbacks) {
        this.zaa = baseGmsClient$ConnectionProgressReportCallbacks;
        super(zabf2);
    }

    public final void zaa() {
        ConnectionResult connectionResult = new ConnectionResult(16, null);
        this.zaa.onReportServiceBinding(connectionResult);
    }
}

