/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.plus;

import com.google.android.gms.common.api.Api$ApiOptions$Optional;
import com.google.android.gms.plus.Plus$PlusOptions$Builder;
import com.google.android.gms.plus.zzc;
import java.util.HashSet;
import java.util.Set;

public final class Plus$PlusOptions
implements Api$ApiOptions$Optional {
    private final String zzg;
    final Set zzh;

    private Plus$PlusOptions() {
        HashSet hashSet;
        this.zzg = null;
        this.zzh = hashSet = new HashSet();
    }

    private Plus$PlusOptions(Plus$PlusOptions$Builder object) {
        String string2;
        this.zzg = string2 = ((Plus$PlusOptions$Builder)object).zzg;
        this.zzh = object = ((Plus$PlusOptions$Builder)object).zzh;
    }

    public /* synthetic */ Plus$PlusOptions(Plus$PlusOptions$Builder plus$PlusOptions$Builder, zzc zzc2) {
        this(plus$PlusOptions$Builder);
    }

    public /* synthetic */ Plus$PlusOptions(zzc zzc2) {
        this();
    }

    public static Plus$PlusOptions$Builder builder() {
        Plus$PlusOptions$Builder plus$PlusOptions$Builder = new Plus$PlusOptions$Builder();
        return plus$PlusOptions$Builder;
    }
}

