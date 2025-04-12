/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import kotlin.jvm.internal.DefaultConstructorMarker;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class SwipeRefreshIndicatorSizes {
    private final float arcRadius;
    private final float arrowHeight;
    private final float arrowWidth;
    private final float size;
    private final float strokeWidth;

    private SwipeRefreshIndicatorSizes(float f5, float f6, float f7, float f8, float f11) {
        this.size = f5;
        this.arcRadius = f6;
        this.strokeWidth = f7;
        this.arrowWidth = f8;
        this.arrowHeight = f11;
    }

    public /* synthetic */ SwipeRefreshIndicatorSizes(float f5, float f6, float f7, float f8, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f5, f6, f7, f8, f11);
    }

    public static /* synthetic */ SwipeRefreshIndicatorSizes copy-RyVG9vg$default(SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes, float f5, float f6, float f7, float f8, float f11, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = swipeRefreshIndicatorSizes.size;
        }
        if ((n4 = n3 & 2) != 0) {
            f6 = swipeRefreshIndicatorSizes.arcRadius;
        }
        float f12 = f6;
        int n7 = n3 & 4;
        if (n7 != 0) {
            f7 = swipeRefreshIndicatorSizes.strokeWidth;
        }
        float f14 = f7;
        n7 = n3 & 8;
        if (n7 != 0) {
            f8 = swipeRefreshIndicatorSizes.arrowWidth;
        }
        float f15 = f8;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            f11 = swipeRefreshIndicatorSizes.arrowHeight;
        }
        float f16 = f11;
        f7 = f5;
        f8 = f12;
        f11 = f14;
        f12 = f16;
        return swipeRefreshIndicatorSizes.copy-RyVG9vg(f5, f8, f14, f15, f16);
    }

    public final float component1-D9Ej5fM() {
        return this.size;
    }

    public final float component2-D9Ej5fM() {
        return this.arcRadius;
    }

    public final float component3-D9Ej5fM() {
        return this.strokeWidth;
    }

    public final float component4-D9Ej5fM() {
        return this.arrowWidth;
    }

    public final float component5-D9Ej5fM() {
        return this.arrowHeight;
    }

    public final SwipeRefreshIndicatorSizes copy-RyVG9vg(float f5, float f6, float f7, float f8, float f11) {
        SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes = new SwipeRefreshIndicatorSizes(f5, f6, f7, f8, f11, null);
        return swipeRefreshIndicatorSizes;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SwipeRefreshIndicatorSizes;
        if (!bl3) {
            return false;
        }
        object = (SwipeRefreshIndicatorSizes)object;
        float f5 = this.size;
        float f6 = ((SwipeRefreshIndicatorSizes)object).size;
        bl3 = xs0_0.a(f5, f6);
        if (!bl3) {
            return false;
        }
        f5 = this.arcRadius;
        f6 = ((SwipeRefreshIndicatorSizes)object).arcRadius;
        bl3 = xs0_0.a(f5, f6);
        if (!bl3) {
            return false;
        }
        f5 = this.strokeWidth;
        f6 = ((SwipeRefreshIndicatorSizes)object).strokeWidth;
        bl3 = xs0_0.a(f5, f6);
        if (!bl3) {
            return false;
        }
        f5 = this.arrowWidth;
        f6 = ((SwipeRefreshIndicatorSizes)object).arrowWidth;
        bl3 = xs0_0.a(f5, f6);
        if (!bl3) {
            return false;
        }
        f5 = this.arrowHeight;
        float f7 = ((SwipeRefreshIndicatorSizes)object).arrowHeight;
        boolean bl4 = xs0_0.a(f5, f7);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final float getArcRadius-D9Ej5fM() {
        return this.arcRadius;
    }

    public final float getArrowHeight-D9Ej5fM() {
        return this.arrowHeight;
    }

    public final float getArrowWidth-D9Ej5fM() {
        return this.arrowWidth;
    }

    public final float getSize-D9Ej5fM() {
        return this.size;
    }

    public final float getStrokeWidth-D9Ej5fM() {
        return this.strokeWidth;
    }

    public int hashCode() {
        int n3 = Float.floatToIntBits(this.size);
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.arcRadius, n3, n4);
        n3 = UR0.a(this.strokeWidth, n3, n4);
        n3 = UR0.a(this.arrowWidth, n3, n4);
        return Float.floatToIntBits(this.arrowHeight) + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SwipeRefreshIndicatorSizes(size=");
        String string2 = xs0_0.b(this.size);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", arcRadius=");
        string2 = xs0_0.b(this.arcRadius);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", strokeWidth=");
        string2 = xs0_0.b(this.strokeWidth);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", arrowWidth=");
        string2 = xs0_0.b(this.arrowWidth);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", arrowHeight=");
        string2 = xs0_0.b(this.arrowHeight);
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

