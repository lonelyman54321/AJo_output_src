/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public final class zzft
extends IOException {
    public zzft(int n3, int n4) {
        StringBuilder stringBuilder = new StringBuilder(108);
        stringBuilder.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        stringBuilder.append(n3);
        stringBuilder.append(" limit ");
        stringBuilder.append(n4);
        stringBuilder.append(").");
        String string2 = stringBuilder.toString();
        super(string2);
    }
}

