/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.DataMask;

final class DataMask$5
extends DataMask {
    public boolean isMasked(int n3, int n4) {
        n4 = n4 / 3 + (n3 /= 2);
        n3 = 1;
        if ((n4 &= n3) == 0) {
            return n3 != 0;
        }
        return false;
    }
}

