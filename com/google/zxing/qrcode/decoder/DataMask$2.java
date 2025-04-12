/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.DataMask;

final class DataMask$2
extends DataMask {
    public boolean isMasked(int n3, int n4) {
        n4 = 1;
        if ((n3 &= n4) == 0) {
            return n4 != 0;
        }
        return false;
    }
}

