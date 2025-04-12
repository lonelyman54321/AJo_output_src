/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.assetpacks.AssetPackStates;
import com.google.android.play.core.assetpacks.ax;

public final class aa
implements OnSuccessListener {
    public final /* synthetic */ ax a;

    public /* synthetic */ aa(ax ax2) {
        this.a = ax2;
    }

    public final void onSuccess(Object object) {
        object = (AssetPackStates)object;
        this.a.f();
    }
}

