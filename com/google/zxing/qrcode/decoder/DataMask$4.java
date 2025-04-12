/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.DataMask;

final class DataMask$4
extends DataMask {
    public boolean isMasked(int n3, int n4) {
        return (n3 = (n3 + n4) % 3) == 0;
    }
}

