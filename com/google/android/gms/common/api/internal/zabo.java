/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.internal.zabp;
import com.google.android.gms.common.api.internal.zabq;

final class zabo
implements Runnable {
    final /* synthetic */ zabp zaa;

    public zabo(zabp zabp2) {
        this.zaa = zabp2;
    }

    public final void run() {
        Object object = this.zaa.zaa;
        Api$Client api$Client = zabq.zae((zabq)object);
        object = zabq.zae((zabq)object).getClass().getName().concat(" disconnecting because it was signed out.");
        api$Client.disconnect((String)object);
    }
}

