/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.carousel;

final class Arrangement {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    final float cost;
    final int largeCount;
    float largeSize;
    int mediumCount;
    float mediumSize;
    final int priority;
    int smallCount;
    float smallSize;

    public Arrangement(int n3, float f5, float f6, float f7, int n4, float f8, int n7, float f11, int n8, float f12) {
        float f14;
        this.priority = n3;
        this.smallSize = f14 = PK1.a(f5, f6, f7);
        this.smallCount = n4;
        this.mediumSize = f8;
        this.mediumCount = n7;
        this.largeSize = f11;
        this.largeCount = n8;
        this.fit(f12, f6, f7, f11);
        this.cost = f14 = this.cost(f11);
    }

    private float calculateLargeSize(float f5, int n3, float f6, int n4, int n7) {
        if (n3 <= 0) {
            f6 = 0.0f;
        }
        float f7 = n3;
        float f8 = (float)n4 / 2.0f;
        f7 = (f7 + f8) * f6;
        f5 -= f7;
        f7 = (float)n7 + f8;
        return f5 / f7;
    }

    private float cost(float f5) {
        boolean bl2 = this.isValid();
        if (!bl2) {
            return Float.MAX_VALUE;
        }
        float f6 = this.largeSize;
        f5 = Math.abs(f5 - f6);
        f6 = this.priority;
        return f5 * f6;
    }

    public static Arrangement findLowestCostArrangement(float f5, float f6, float f7, float f8, int[] nArray, float f11, int[] nArray2, float f12, int[] nArray3) {
        int[] nArray4 = nArray;
        int[] nArray5 = nArray2;
        int[] nArray6 = nArray3;
        int n3 = nArray3.length;
        Object object = false;
        float f14 = 0.0f;
        Arrangement arrangement = null;
        int n4 = 1;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7 = nArray6[i3];
            int n8 = nArray5.length;
            int n10 = 0;
            while (n10 < n8) {
                int n14;
                int n15;
                int n16 = nArray5[n10];
                int n17 = nArray4.length;
                int n18 = 0;
                while (n18 < n17) {
                    float f15;
                    float f16;
                    float f17;
                    int n19;
                    Arrangement arrangement2;
                    int n20 = nArray4[n18];
                    Arrangement arrangement3 = arrangement2;
                    int n21 = n18;
                    int n22 = n17;
                    n17 = n20;
                    n15 = n10;
                    n14 = n8;
                    n8 = n16;
                    arrangement2 = new Arrangement(n4, f6, f7, f8, n20, f11, n16, f12, n7, f5);
                    if (arrangement == null || (n19 = (f17 = (f16 = arrangement2.cost) - (f15 = arrangement.cost)) == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1)) < 0) {
                        f14 = arrangement3.cost;
                        n19 = 0;
                        f16 = 0.0f;
                        float f18 = f14 - 0.0f;
                        object = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                        if (!object) {
                            return arrangement3;
                        }
                        arrangement = arrangement3;
                    }
                    ++n4;
                    n18 = n21 + 1;
                    n17 = n22;
                    n10 = n15;
                    n8 = n14;
                }
                n15 = n10++;
                n14 = n8;
            }
        }
        return arrangement;
    }

    private void fit(float f5, float f6, float f7, float f8) {
        float f11;
        float f12;
        float f14;
        float f15;
        float f16;
        float f17 = this.getSpace();
        f17 = f5 - f17;
        int n3 = this.smallCount;
        if (n3 > 0 && (f16 = (f15 = f17 - 0.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1)) > 0) {
            f6 = this.smallSize;
            float f18 = n3;
            f7 -= f6;
            this.smallSize = f7 = Math.min(f17 /= f18, f7) + f6;
        } else if (n3 > 0 && (f14 = (f12 = f17 - 0.0f) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) < 0) {
            f7 = this.smallSize;
            float f19 = n3;
            f6 -= f7;
            this.smallSize = f6 = Math.max(f17 /= f19, f6) + f7;
        }
        int n4 = this.smallCount;
        float f20 = n4 > 0 ? (f6 = this.smallSize) : 0.0f;
        this.smallSize = f20;
        int n7 = this.mediumCount;
        int n8 = this.largeCount;
        this.largeSize = f5 = this.calculateLargeSize(f5, n4, f20, n7, n8);
        f6 = this.smallSize + f5;
        f7 = 2.0f;
        this.mediumSize = f6 /= f7;
        f14 = this.mediumCount;
        if (f14 > 0 && (f11 = f5 == f8 ? 0 : (f5 > f8 ? 1 : -1)) != false) {
            f8 -= f5;
            f5 = this.largeCount;
            f8 *= f5;
            f6 *= 0.1f;
            f5 = f14;
            f6 *= f5;
            f5 = Math.min(Math.abs(f8), f6);
            float f22 = f8 - 0.0f;
            Object object = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
            if (object > 0) {
                f6 = this.mediumSize;
                f7 = this.mediumCount;
                f7 = f5 / f7;
                this.mediumSize = f6 -= f7;
                f6 = this.largeSize;
                f14 = this.largeCount;
                f7 = f14;
                this.largeSize = f5 = f5 / f7 + f6;
            } else {
                f6 = this.mediumSize;
                f7 = this.mediumCount;
                this.mediumSize = f7 = f5 / f7 + f6;
                f6 = this.largeSize;
                f14 = this.largeCount;
                f7 = f14;
                this.largeSize = f6 -= (f5 /= f7);
            }
        }
    }

    private float getSpace() {
        float f5 = this.largeSize;
        float f6 = this.largeCount;
        f5 *= f6;
        f6 = this.mediumSize;
        float f7 = this.mediumCount;
        f6 = f6 * f7 + f5;
        f5 = this.smallSize;
        f7 = this.smallCount;
        return f5 * f7 + f6;
    }

    private boolean isValid() {
        int n3;
        int n4 = this.largeCount;
        boolean bl2 = false;
        boolean bl3 = true;
        if (n4 > 0 && (n3 = this.smallCount) > 0 && (n3 = this.mediumCount) > 0) {
            float f5;
            float f6 = this.largeSize;
            float f7 = this.mediumSize;
            float f8 = f6 - f7;
            n4 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
            if (n4 > 0 && (n4 = (int)((f5 = f7 - (f6 = this.smallSize)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) > 0) {
                bl2 = true;
            }
            return bl2;
        }
        if (n4 > 0 && (n4 = this.smallCount) > 0) {
            float f11 = this.largeSize;
            float f12 = this.smallSize;
            float f14 = f11 - f12;
            n4 = (int)(f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1));
            if (n4 > 0) {
                bl2 = true;
            }
            return bl2;
        }
        return bl3;
    }

    public int getItemCount() {
        int n3 = this.smallCount;
        int n4 = this.mediumCount;
        n3 += n4;
        n4 = this.largeCount;
        return n3 + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Arrangement [priority=");
        int n3 = this.priority;
        stringBuilder.append(n3);
        stringBuilder.append(", smallCount=");
        n3 = this.smallCount;
        stringBuilder.append(n3);
        stringBuilder.append(", smallSize=");
        float f5 = this.smallSize;
        stringBuilder.append(f5);
        stringBuilder.append(", mediumCount=");
        n3 = this.mediumCount;
        stringBuilder.append(n3);
        stringBuilder.append(", mediumSize=");
        f5 = this.mediumSize;
        stringBuilder.append(f5);
        stringBuilder.append(", largeCount=");
        n3 = this.largeCount;
        stringBuilder.append(n3);
        stringBuilder.append(", largeSize=");
        f5 = this.largeSize;
        stringBuilder.append(f5);
        stringBuilder.append(", cost=");
        f5 = this.cost;
        stringBuilder.append(f5);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

