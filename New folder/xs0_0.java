/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from xs0
 */
public final class xs0_0
implements Comparable {
    public final float a;

    public /* synthetic */ xs0_0(float f5) {
        this.a = f5;
    }

    public static final boolean a(float f5, float f6) {
        int n3 = Float.compare(f5, f6);
        if (!n3) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        return n3 != 0;
    }

    public static String b(float f5) {
        String string2;
        boolean bl2 = Float.isNaN(f5);
        if (bl2) {
            string2 = "Dp.Unspecified";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f5);
            stringBuilder.append(".dp");
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    public final int compareTo(Object object) {
        float f5 = ((xs0_0)object).a;
        return Float.compare(this.a, f5);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof xs0_0;
        boolean bl3 = false;
        if (bl2) {
            object = (xs0_0)object;
            float f5 = this.a;
            float f6 = ((xs0_0)object).a;
            int n3 = Float.compare(f5, f6);
            if (n3 == 0) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return xs0_0.b(this.a);
    }
}

