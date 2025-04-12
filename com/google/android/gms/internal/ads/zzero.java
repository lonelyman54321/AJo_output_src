/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzexv;
import java.util.ArrayList;

public final class zzero
implements zzexv {
    public final /* synthetic */ ArrayList zza;

    public /* synthetic */ zzero(ArrayList arrayList) {
        this.zza = arrayList;
    }

    public final void zzj(Object object) {
        object = (Bundle)object;
        ArrayList arrayList = this.zza;
        object.putStringArrayList("android_permissions", arrayList);
    }
}

