/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from nk2
 */
public final class nk2_0
implements mk2_0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public nk2_0(float f5, float f6, float f7, float f8) {
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = f8;
        float f11 = f5 - 0.0f;
        Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object >= 0) {
            float f12 = f6 - 0.0f;
            object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (object >= 0) {
                float f14 = f7 - 0.0f;
                object = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                if (object >= 0) {
                    float f15 = f8 - 0.0f;
                    object = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                    if (object >= 0) {
                        return;
                    }
                    String string2 = "Bottom padding must be non-negative".toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                    throw illegalArgumentException;
                }
                String string3 = "End padding must be non-negative".toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
                throw illegalArgumentException;
            }
            String string4 = "Top padding must be non-negative".toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string4);
            throw illegalArgumentException;
        }
        String string5 = "Start padding must be non-negative".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string5);
        throw illegalArgumentException;
    }

    public final float calculateBottomPadding-D9Ej5fM() {
        return this.d;
    }

    public final float calculateLeftPadding-u2uoSUM(bp1_0 bp1_02) {
        bp1_0 bp1_03 = bp1_0.Ltr;
        float f5 = bp1_02 == bp1_03 ? this.a : this.c;
        return f5;
    }

    public final float calculateRightPadding-u2uoSUM(bp1_0 bp1_02) {
        bp1_0 bp1_03 = bp1_0.Ltr;
        float f5 = bp1_02 == bp1_03 ? this.c : this.a;
        return f5;
    }

    public final float calculateTopPadding-D9Ej5fM() {
        return this.b;
    }

    public final boolean equals(Object object) {
        float f5;
        boolean bl2;
        boolean bl3 = object instanceof nk2_0;
        boolean bl4 = false;
        if (!bl3) {
            return false;
        }
        object = (nk2_0)object;
        float f6 = this.a;
        float f7 = ((nk2_0)object).a;
        bl3 = xs0_0.a(f6, f7);
        if (bl3 && (bl3 = xs0_0.a(f7 = this.b, f6 = ((nk2_0)object).b)) && (bl3 = xs0_0.a(f7 = this.c, f6 = ((nk2_0)object).c)) && (bl2 = xs0_0.a(f7 = this.d, f5 = ((nk2_0)object).d))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a);
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.b, n3, n4);
        n3 = UR0.a(this.c, n3, n4);
        return Float.floatToIntBits(this.d) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PaddingValues(start=");
        String string2 = xs0_0.b(this.a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", top=");
        string2 = xs0_0.b(this.b);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", end=");
        string2 = xs0_0.b(this.c);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", bottom=");
        string2 = xs0_0.b(this.d);
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

