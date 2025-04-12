/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzbl;
import java.lang.reflect.Field;

public class zzbj {
    private final Object zza;
    private final Field zzb;
    private final Class zzc;

    public zzbj(Object object, Field field, Class clazz) {
        this.zza = object;
        this.zzb = field;
        this.zzc = clazz;
    }

    public final Object zzc() {
        Object object;
        Object object2;
        Class clazz;
        try {
            clazz = this.zzc;
        }
        catch (Exception exception) {
            object2 = this.zzb.getName();
            String string2 = this.zza.getClass().getName();
            String string3 = this.zzc.getName();
            object2 = og_1.a("Failed to get value of field ", (String)object2, " of type ", string2, " on object of type ");
            ((StringBuilder)object2).append(string3);
            object2 = ((StringBuilder)object2).toString();
            object = new zzbl((String)object2, exception);
            throw object;
        }
        object = this.zzb;
        object2 = this.zza;
        object = ((Field)object).get(object2);
        return clazz.cast(object);
    }

    public final Field zzd() {
        return this.zzb;
    }

    public final void zze(Object object) {
        Object object2;
        Object object3;
        try {
            object3 = this.zzb;
        }
        catch (Exception exception) {
            object2 = this.zzb.getName();
            String string2 = this.zza.getClass().getName();
            String string3 = this.zzc.getName();
            object2 = og_1.a("Failed to set value of field ", (String)object2, " of type ", string2, " on object of type ");
            ((StringBuilder)object2).append(string3);
            object2 = ((StringBuilder)object2).toString();
            object3 = new zzbl((String)object2, exception);
            throw object3;
        }
        object2 = this.zza;
        ((Field)object3).set(object2, object);
    }
}

