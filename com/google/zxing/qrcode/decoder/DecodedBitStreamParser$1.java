/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.Mode;

class DecodedBitStreamParser$1 {
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
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$qrcode$decoder$Mode;
            mode = Mode.TERMINATOR;
            n4 = mode.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$qrcode$decoder$Mode;
            mode = Mode.FNC1_FIRST_POSITION;
            n4 = mode.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$qrcode$decoder$Mode;
            mode = Mode.FNC1_SECOND_POSITION;
            n4 = mode.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$qrcode$decoder$Mode;
            mode = Mode.STRUCTURED_APPEND;
            n4 = mode.ordinal();
            nArray[n4] = n3 = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$qrcode$decoder$Mode;
            mode = Mode.ECI;
            n4 = mode.ordinal();
            nArray[n4] = n3 = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$qrcode$decoder$Mode;
            mode = Mode.HANZI;
            n4 = mode.ordinal();
            nArray[n4] = n3 = 10;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

