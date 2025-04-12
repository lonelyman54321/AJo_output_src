/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhs;
import com.google.android.gms.internal.vision.zzhz;
import java.util.Arrays;

final class zzhx
implements zzhz {
    private zzhx() {
    }

    public /* synthetic */ zzhx(zzhs zzhs2) {
        this();
    }

    public final byte[] zza(byte[] byArray, int n3, int n4) {
        return Arrays.copyOfRange(byArray, n3, n4 += n3);
    }
}

