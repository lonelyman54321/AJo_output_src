/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.zaaq;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

final class zaar
extends zac {
    private final WeakReference zaa;

    public zaar(zaaw zaaw2) {
        WeakReference<zaaw> weakReference;
        this.zaa = weakReference = new WeakReference<zaaw>(zaaw2);
    }

    public final void zab(zak zak2) {
        zaaw zaaw2 = (zaaw)this.zaa.get();
        if (zaaw2 == null) {
            return;
        }
        zabi zabi2 = zaaw.zak(zaaw2);
        zaaq zaaq2 = new zaaq(this, zaaw2, zaaw2, zak2);
        zabi2.zal(zaaq2);
    }
}

