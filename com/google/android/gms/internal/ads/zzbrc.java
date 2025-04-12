/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbwj;

public final class zzbrc {
    public static void zza(IObjectWrapper object, Throwable throwable, String string2) {
        object = zzbwj.zza((Context)ObjectWrapper.unwrap((IObjectWrapper)object));
        float f5 = ((Double)zzbgt.zzg.zze()).floatValue();
        object.zzi(throwable, string2, f5);
    }
}

