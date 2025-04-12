/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.ktx;

import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class zzh
extends Lambda
implements Function0 {
    private final /* synthetic */ AssetPackManager zza;
    private final /* synthetic */ AssetPackStateUpdateListener zzb;

    public zzh(AssetPackManager assetPackManager, AssetPackStateUpdateListener assetPackStateUpdateListener) {
        this.zza = assetPackManager;
        this.zzb = assetPackStateUpdateListener;
        super(0);
    }

    public final /* synthetic */ Object invoke() {
        AssetPackManager assetPackManager = this.zza;
        AssetPackStateUpdateListener assetPackStateUpdateListener = this.zzb;
        assetPackManager.unregisterListener(assetPackStateUpdateListener);
        return Unit.a;
    }
}

