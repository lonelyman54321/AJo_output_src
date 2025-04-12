/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzevk;
import java.util.concurrent.Callable;

public final class zzevi
implements Callable {
    public final Object call() {
        Bundle bundle = new Bundle();
        Object object = Runtime.getRuntime();
        long l2 = ((Runtime)object).freeMemory();
        bundle.putLong("runtime_free", l2);
        l2 = ((Runtime)object).maxMemory();
        bundle.putLong("runtime_max", l2);
        long l3 = ((Runtime)object).totalMemory();
        bundle.putLong("runtime_total", l3);
        int n3 = zzu.zzo().zzb();
        bundle.putInt("web_view_count", n3);
        object = new zzevk(bundle);
        return object;
    }
}

