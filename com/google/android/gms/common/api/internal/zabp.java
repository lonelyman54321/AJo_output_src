/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabo;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks;

final class zabp
implements BaseGmsClient$SignOutCallbacks {
    final /* synthetic */ zabq zaa;

    public zabp(zabq zabq2) {
        this.zaa = zabq2;
    }

    public final void onSignOutComplete() {
        Handler handler = GoogleApiManager.zad(this.zaa.zaa);
        zabo zabo2 = new zabo(this);
        handler.post((Runnable)zabo2);
    }
}

