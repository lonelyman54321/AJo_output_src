/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

final class zznd
extends IllegalArgumentException {
    public zznd(int n3, int n4) {
        String string2 = D70.b(n3, n4, "Unpaired surrogate at index ", " of ");
        super(string2);
    }
}

