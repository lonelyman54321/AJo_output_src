/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common;

import java.util.List;

public final class DecoderResult {
    private final List byteSegments;
    private final String ecLevel;
    private Integer erasures;
    private Integer errorsCorrected;
    private int numBits;
    private Object other;
    private final byte[] rawBytes;
    private final int structuredAppendParity;
    private final int structuredAppendSequenceNumber;
    private final String text;

    public DecoderResult(byte[] byArray, String string2, List list, String string3) {
        this(byArray, string2, list, string3, -1, -1);
    }

    public DecoderResult(byte[] byArray, String string2, List list, String string3, int n3, int n4) {
        int n7;
        this.rawBytes = byArray;
        if (byArray == null) {
            n7 = 0;
            byArray = null;
        } else {
            n7 = byArray.length * 8;
        }
        this.numBits = n7;
        this.text = string2;
        this.byteSegments = list;
        this.ecLevel = string3;
        this.structuredAppendParity = n4;
        this.structuredAppendSequenceNumber = n3;
    }

    public List getByteSegments() {
        return this.byteSegments;
    }

    public String getECLevel() {
        return this.ecLevel;
    }

    public Integer getErasures() {
        return this.erasures;
    }

    public Integer getErrorsCorrected() {
        return this.errorsCorrected;
    }

    public int getNumBits() {
        return this.numBits;
    }

    public Object getOther() {
        return this.other;
    }

    public byte[] getRawBytes() {
        return this.rawBytes;
    }

    public int getStructuredAppendParity() {
        return this.structuredAppendParity;
    }

    public int getStructuredAppendSequenceNumber() {
        return this.structuredAppendSequenceNumber;
    }

    public String getText() {
        return this.text;
    }

    public boolean hasStructuredAppend() {
        int n3 = this.structuredAppendParity;
        return n3 >= 0 && (n3 = this.structuredAppendSequenceNumber) >= 0;
    }

    public void setErasures(Integer n3) {
        this.erasures = n3;
    }

    public void setErrorsCorrected(Integer n3) {
        this.errorsCorrected = n3;
    }

    public void setNumBits(int n3) {
        this.numBits = n3;
    }

    public void setOther(Object object) {
        this.other = object;
    }
}

