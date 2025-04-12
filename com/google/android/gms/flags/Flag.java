/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.flags;

import com.google.android.gms.flags.Flag$BooleanFlag;
import com.google.android.gms.flags.Flag$IntegerFlag;
import com.google.android.gms.flags.Flag$LongFlag;
import com.google.android.gms.flags.Flag$StringFlag;
import com.google.android.gms.flags.Singletons;
import com.google.android.gms.flags.zza;
import com.google.android.gms.flags.zzc;

public abstract class Flag {
    private final String mKey;
    private final int zze;
    private final Object zzf;

    private Flag(int n3, String string2, Object object) {
        this.zze = n3;
        this.mKey = string2;
        this.zzf = object;
        Singletons.flagRegistry().zza(this);
    }

    public /* synthetic */ Flag(int n3, String string2, Object object, zza zza2) {
        this(n3, string2, object);
    }

    public static Flag$BooleanFlag define(int n3, String string2, Boolean bl2) {
        Flag$BooleanFlag flag$BooleanFlag = new Flag$BooleanFlag(n3, string2, bl2);
        return flag$BooleanFlag;
    }

    public static Flag$IntegerFlag define(int n3, String string2, int n4) {
        Integer n7 = n4;
        Flag$IntegerFlag flag$IntegerFlag = new Flag$IntegerFlag(n3, string2, n7);
        return flag$IntegerFlag;
    }

    public static Flag$LongFlag define(int n3, String string2, long l2) {
        Long l3 = l2;
        Flag$LongFlag flag$LongFlag = new Flag$LongFlag(n3, string2, l3);
        return flag$LongFlag;
    }

    public static Flag$StringFlag define(int n3, String string2, String string3) {
        Flag$StringFlag flag$StringFlag = new Flag$StringFlag(n3, string2, string3);
        return flag$StringFlag;
    }

    public Object get() {
        return Singletons.zzd().zzb(this);
    }

    public final String getKey() {
        return this.mKey;
    }

    public final int getSource() {
        return this.zze;
    }

    public abstract Object zza(zzc var1);

    public final Object zzb() {
        return this.zzf;
    }
}

