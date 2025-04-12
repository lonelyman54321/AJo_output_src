/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.Mode;

class Encoder$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$zxing$qrcode$decoder$Mode;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Mode mode;
        int n7 = Mode.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$zxing$qrcode$decoder$Mode = nArray;
        try {
            mode = Mode.NUMERIC;
            n4 = mode.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$qrcode$decoder$Mode;
            mode = Mode.ALPHANUMERIC;
            n4 = mode.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$qrcode$decoder$Mode;
            mode = Mode.BYTE;
            n4 = mode.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$qrcode$decoder$Mode;
            mode = Mode.KANJI;
            n4 = mode.ordinal();
            nArray[n4] = n3 = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

