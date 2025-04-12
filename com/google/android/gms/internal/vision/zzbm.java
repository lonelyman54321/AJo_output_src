/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.android.gms.internal.vision;

import android.util.Base64;
import com.google.android.gms.internal.vision.zzbi;
import com.google.android.gms.internal.vision.zzbo;
import com.google.android.gms.internal.vision.zzbp;
import java.io.IOException;

final class zzbm
extends zzbi {
    private final /* synthetic */ zzbp zza;

    public zzbm(zzbo zzbo2, String string2, Object object, boolean bl2, zzbp zzbp2) {
        this.zza = zzbp2;
        super(zzbo2, string2, object, true, null);
    }

    public final Object zza(Object object) {
        Object object2;
        int n3 = object instanceof String;
        if (n3 != 0) {
            object2 = this.zza;
            Object object3 = object;
            object3 = (String)object;
            int n4 = 3;
            object3 = Base64.decode((String)object3, (int)n4);
            try {
                return object2.zza((byte[])object3);
            }
            catch (IOException | IllegalArgumentException exception) {}
        }
        object2 = this.zzb();
        object = String.valueOf(object);
        n3 = lE2.a(27, (String)object2);
        int n7 = ((String)object).length() + n3;
        new StringBuilder(n7);
        return null;
    }
}

