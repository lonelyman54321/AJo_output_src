/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.Container;
import com.google.android.gms.tagmanager.Container$FunctionCallTagCallback;
import com.google.android.gms.tagmanager.zzal;
import com.google.android.gms.tagmanager.zzfp;
import com.google.android.gms.tagmanager.zzu;
import java.util.Map;

final class zzt
implements zzal {
    final /* synthetic */ Container zza;

    public /* synthetic */ zzt(Container container, zzu zzu2) {
        this.zza = container;
    }

    public final Object zza(String string2, Map map2) {
        Container$FunctionCallTagCallback container$FunctionCallTagCallback = this.zza.zzb(string2);
        if (container$FunctionCallTagCallback != null) {
            container$FunctionCallTagCallback.execute(string2, map2);
        }
        return zzfp.zzl();
    }
}

