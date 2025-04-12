/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.oned.rss.expanded.decoders.DecodedObject;

final class DecodedInformation
extends DecodedObject {
    private final String newString;
    private final boolean remaining;
    private final int remainingValue;

    public DecodedInformation(int n3, String string2) {
        super(n3);
        this.newString = string2;
        this.remaining = false;
        this.remainingValue = 0;
    }

    public DecodedInformation(int n3, String string2, int n4) {
        super(n3);
        this.remaining = true;
        this.remainingValue = n4;
        this.newString = string2;
    }

    public String getNewString() {
        return this.newString;
    }

    public int getRemainingValue() {
        return this.remainingValue;
    }

    public boolean isRemaining() {
        return this.remaining;
    }
}

