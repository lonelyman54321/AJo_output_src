/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

public final class Dimension {
    private final int height;
    private final int width;

    public Dimension(int n3, int n4) {
        if (n3 >= 0 && n4 >= 0) {
            this.width = n3;
            this.height = n4;
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public boolean equals(Object object) {
        int n3 = object instanceof Dimension;
        if (n3 != 0) {
            int n4;
            object = (Dimension)object;
            n3 = this.width;
            int n7 = ((Dimension)object).width;
            if (n3 == n7 && (n3 = this.height) == (n4 = ((Dimension)object).height)) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int n3 = this.width * 32713;
        int n4 = this.height;
        return n3 + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.width;
        stringBuilder.append(n3);
        stringBuilder.append("x");
        n3 = this.height;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

