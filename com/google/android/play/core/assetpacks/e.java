/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.assetpacks.bm;
import java.util.List;

public final class e
implements OnSuccessListener {
    public final /* synthetic */ bm a;

    public /* synthetic */ e(bm bm3) {
        this.a = bm3;
    }

    public final void onSuccess(Object object) {
        bm bm3 = this.a;
        object = (List)object;
        bm3.C((List)object);
    }
}

