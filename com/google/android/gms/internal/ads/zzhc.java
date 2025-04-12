/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzhc
extends IOException {
    public final int zza;

    public zzhc(int n3) {
        this.zza = n3;
    }

    public zzhc(String string2, int n3) {
        super(string2);
        this.zza = n3;
    }

    public zzhc(String string2, Throwable throwable, int n3) {
        super(string2, throwable);
        this.zza = n3;
    }

    public zzhc(Throwable throwable, int n3) {
        super(throwable);
        this.zza = n3;
    }
}

