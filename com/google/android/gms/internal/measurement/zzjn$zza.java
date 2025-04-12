/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzjn$zza
extends IOException {
    public zzjn$zza() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzjn$zza(int n3, int n4, int n7, Throwable throwable) {
        long l2 = n3;
        long l3 = n4;
        this(l2, l3, n7, throwable);
    }

    private zzjn$zza(long l2, long l3, int n3, Throwable throwable) {
        CharSequence charSequence = D70.c(l2, "Pos: ", ", limit: ");
        charSequence.append(l3);
        charSequence.append(", len: ");
        charSequence.append(n3);
        charSequence = charSequence.toString();
        this((String)charSequence, throwable);
    }

    private zzjn$zza(String string2, Throwable throwable) {
        string2 = kp1_0.c("CodedOutputStream was writing to a flat byte array and ran out of space.: ", string2);
        super(string2, throwable);
    }

    public zzjn$zza(Throwable throwable) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
    }
}

