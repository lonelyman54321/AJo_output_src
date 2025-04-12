/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.images;

public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int n3, int n4) {
        this.zaa = n3;
        this.zab = n4;
    }

    public static Size parseSize(String object) {
        if (object != null) {
            int n3 = ((String)object).indexOf(42);
            if (n3 < 0) {
                n3 = ((String)object).indexOf(120);
            }
            if (n3 >= 0) {
                int n4 = 0;
                String string2 = null;
                try {
                    string2 = ((String)object).substring(0, n3);
                }
                catch (NumberFormatException numberFormatException) {
                    throw Size.zaa((String)object);
                }
                n4 = Integer.parseInt(string2);
                ++n3;
                String string3 = ((String)object).substring(n3);
                n3 = Integer.parseInt(string3);
                Size size = new Size(n4, n3);
                return size;
            }
            throw Size.zaa((String)object);
        }
        object = new IllegalArgumentException("string must not be null");
        throw object;
    }

    private static NumberFormatException zaa(String string2) {
        string2 = cP.a("Invalid Size: \"", string2, "\"");
        NumberFormatException numberFormatException = new NumberFormatException(string2);
        throw numberFormatException;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Size;
        if (n3 != 0) {
            int n4;
            object = (Size)object;
            n3 = this.zaa;
            int n7 = ((Size)object).zaa;
            if (n3 == n7 && (n3 = this.zab) == (n4 = ((Size)object).zab)) {
                return bl2;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int n3 = this.zaa;
        int n4 = n3 << 16;
        int n7 = this.zab;
        return ((n3 >>>= 16) | n4) ^ n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.zaa;
        stringBuilder.append(n3);
        stringBuilder.append("x");
        n3 = this.zab;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

