/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState$State;

final class CurrentParsingState {
    private CurrentParsingState$State encoding;
    private int position = 0;

    public CurrentParsingState() {
        CurrentParsingState$State currentParsingState$State;
        this.encoding = currentParsingState$State = CurrentParsingState$State.NUMERIC;
    }

    public int getPosition() {
        return this.position;
    }

    public void incrementPosition(int n3) {
        int n4;
        this.position = n4 = this.position + n3;
    }

    public boolean isAlpha() {
        CurrentParsingState$State currentParsingState$State = this.encoding;
        CurrentParsingState$State currentParsingState$State2 = CurrentParsingState$State.ALPHA;
        return currentParsingState$State == currentParsingState$State2;
    }

    public boolean isIsoIec646() {
        CurrentParsingState$State currentParsingState$State = this.encoding;
        CurrentParsingState$State currentParsingState$State2 = CurrentParsingState$State.ISO_IEC_646;
        return currentParsingState$State == currentParsingState$State2;
    }

    public boolean isNumeric() {
        CurrentParsingState$State currentParsingState$State = this.encoding;
        CurrentParsingState$State currentParsingState$State2 = CurrentParsingState$State.NUMERIC;
        return currentParsingState$State == currentParsingState$State2;
    }

    public void setAlpha() {
        CurrentParsingState$State currentParsingState$State;
        this.encoding = currentParsingState$State = CurrentParsingState$State.ALPHA;
    }

    public void setIsoIec646() {
        CurrentParsingState$State currentParsingState$State;
        this.encoding = currentParsingState$State = CurrentParsingState$State.ISO_IEC_646;
    }

    public void setNumeric() {
        CurrentParsingState$State currentParsingState$State;
        this.encoding = currentParsingState$State = CurrentParsingState$State.NUMERIC;
    }

    public void setPosition(int n3) {
        this.position = n3;
    }
}

