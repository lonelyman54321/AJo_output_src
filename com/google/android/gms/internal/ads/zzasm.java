/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzasn;
import java.nio.ByteBuffer;

final class zzasm
extends ThreadLocal {
    public zzasm(zzasn zzasn2) {
    }

    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}

