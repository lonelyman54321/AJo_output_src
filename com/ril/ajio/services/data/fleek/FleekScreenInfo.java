/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek;

public final class FleekScreenInfo {
    private final double height;
    private final double width;

    public FleekScreenInfo(double d2, double d5) {
        this.width = d2;
        this.height = d5;
    }

    public static /* synthetic */ FleekScreenInfo copy$default(FleekScreenInfo fleekScreenInfo, double d2, double d5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            d2 = fleekScreenInfo.width;
        }
        if ((n3 &= 2) != 0) {
            d5 = fleekScreenInfo.height;
        }
        return fleekScreenInfo.copy(d2, d5);
    }

    public final double component1() {
        return this.width;
    }

    public final double component2() {
        return this.height;
    }

    public final FleekScreenInfo copy(double d2, double d5) {
        FleekScreenInfo fleekScreenInfo = new FleekScreenInfo(d2, d5);
        return fleekScreenInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof FleekScreenInfo;
        if (n3 == 0) {
            return false;
        }
        object = (FleekScreenInfo)object;
        double d2 = this.width;
        double d5 = ((FleekScreenInfo)object).width;
        n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        d2 = this.height;
        d5 = ((FleekScreenInfo)object).height;
        int n4 = Double.compare(d2, d5);
        if (n4 != 0) {
            return false;
        }
        return bl2;
    }

    public final double getHeight() {
        return this.height;
    }

    public final double getWidth() {
        return this.width;
    }

    public int hashCode() {
        long l2 = Double.doubleToLongBits(this.width);
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^ l3) * 31;
        l3 = Double.doubleToLongBits(this.height);
        long l4 = l3 >>> n3;
        int n7 = (int)(l3 ^ l4);
        return n4 + n7;
    }

    public String toString() {
        double d2 = this.width;
        double d5 = this.height;
        StringBuilder stringBuilder = new StringBuilder("FleekScreenInfo(width=");
        stringBuilder.append(d2);
        stringBuilder.append(", height=");
        stringBuilder.append(d5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

