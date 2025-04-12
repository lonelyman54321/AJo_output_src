/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss;

public class DataCharacter {
    private final int checksumPortion;
    private final int value;

    public DataCharacter(int n3, int n4) {
        this.value = n3;
        this.checksumPortion = n4;
    }

    public final boolean equals(Object object) {
        int n3;
        int n4 = object instanceof DataCharacter;
        if (n4 == 0) {
            return false;
        }
        object = (DataCharacter)object;
        n4 = this.value;
        int n7 = ((DataCharacter)object).value;
        return n4 == n7 && (n4 = this.checksumPortion) == (n3 = ((DataCharacter)object).checksumPortion);
    }

    public final int getChecksumPortion() {
        return this.checksumPortion;
    }

    public final int getValue() {
        return this.value;
    }

    public final int hashCode() {
        int n3 = this.value;
        int n4 = this.checksumPortion;
        return n3 ^ n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.value;
        stringBuilder.append(n3);
        stringBuilder.append("(");
        n3 = this.checksumPortion;
        return tu.a(stringBuilder, n3, ')');
    }
}

