/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Wh3
 */
public final class wh3_2 {
    public final float a;
    public final float b;

    public wh3_2(float f5, float f6) {
        this.a = f5;
        this.b = f6;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof wh3_2;
        if (!bl3) {
            return false;
        }
        object = (wh3_2)object;
        float f5 = this.a;
        float f6 = ((wh3_2)object).a;
        bl3 = xs0_0.a(f5, f6);
        if (!bl3) {
            return false;
        }
        f6 = this.b;
        float f7 = ((wh3_2)object).b;
        boolean bl4 = xs0_0.a(f6, f7);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a) * 31;
        return Float.floatToIntBits(this.b) + n3;
    }

    public final String toString() {
        float f5 = this.a;
        String string2 = xs0_0.b(f5);
        float f6 = this.b;
        String string3 = xs0_0.b(f5 + f6);
        String string4 = xs0_0.b(f6);
        return h30_0.a(og_1.a("TabPosition(left=", string2, ", right=", string3, ", width="), string4, ")");
    }
}

