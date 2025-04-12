/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.oned.rss.expanded.decoders.DecodedObject;

final class DecodedNumeric
extends DecodedObject {
    static final int FNC1 = 10;
    private final int firstDigit;
    private final int secondDigit;

    public DecodedNumeric(int n3, int n4, int n7) {
        super(n3);
        if (n4 >= 0 && n4 <= (n3 = 10) && n7 >= 0 && n7 <= n3) {
            this.firstDigit = n4;
            this.secondDigit = n7;
            return;
        }
        throw FormatException.getFormatInstance();
    }

    public int getFirstDigit() {
        return this.firstDigit;
    }

    public int getSecondDigit() {
        return this.secondDigit;
    }

    public int getValue() {
        int n3 = this.firstDigit * 10;
        int n4 = this.secondDigit;
        return n3 + n4;
    }

    public boolean isAnyFNC1() {
        int n3 = this.firstDigit;
        int n4 = 10;
        return n3 == n4 || (n3 = this.secondDigit) == n4;
        {
        }
    }

    public boolean isFirstDigitFNC1() {
        int n3 = this.firstDigit;
        int n4 = 10;
        return n3 == n4;
    }

    public boolean isSecondDigitFNC1() {
        int n3 = this.secondDigit;
        int n4 = 10;
        return n3 == n4;
    }
}

