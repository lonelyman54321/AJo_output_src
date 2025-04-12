/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from yu1
 */
public final class yu1_1 {
    public static final yu1_1 c;
    public final float a;
    public final int b;

    static {
        yu1_1 yu1_12;
        float f5 = yu1$a.b;
        c = yu1_12 = new yu1_1(f5, 17);
    }

    public yu1_1(float f5, int n3) {
        this.a = f5;
        this.b = n3;
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof yu1_1;
        if (n4 == 0) {
            return false;
        }
        object = (yu1_1)object;
        float f5 = ((yu1_1)object).a;
        float f6 = yu1$a.a;
        f6 = this.a;
        n4 = Float.compare(f6, f5);
        if (n4 == 0 && (n4 = this.b) == (n3 = ((yu1_1)object).b)) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a) * 31;
        int n4 = this.b;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LineHeightStyle(alignment=");
        float f5 = 0.0f;
        CharSequence charSequence = null;
        char c2 = ')';
        float f6 = this.a;
        float f7 = f6 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object == false) {
            f5 = yu1$a.a;
            charSequence = "LineHeightStyle.Alignment.Top";
        } else {
            f5 = yu1$a.a;
            float f8 = f6 - f5;
            object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object == false) {
                charSequence = "LineHeightStyle.Alignment.Center";
            } else {
                f5 = yu1$a.b;
                float f11 = f6 - f5;
                object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                if (object == false) {
                    charSequence = "LineHeightStyle.Alignment.Proportional";
                } else {
                    f5 = yu1$a.c;
                    float f12 = f6 - f5;
                    object = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                    if (object == false) {
                        charSequence = "LineHeightStyle.Alignment.Bottom";
                    } else {
                        String string2 = "LineHeightStyle.Alignment(topPercentage = ";
                        charSequence = new StringBuilder(string2);
                        ((StringBuilder)charSequence).append(f6);
                        ((StringBuilder)charSequence).append(c2);
                        charSequence = ((StringBuilder)charSequence).toString();
                    }
                }
            }
        }
        stringBuilder.append((Object)charSequence);
        charSequence = ", trim=";
        stringBuilder.append((String)charSequence);
        object = true;
        f5 = Float.MIN_VALUE;
        int n3 = this.b;
        if (n3 == object) {
            charSequence = "LineHeightStyle.Trim.FirstLineTop";
        } else {
            object = 16;
            f5 = 2.2E-44f;
            if (n3 == object) {
                charSequence = "LineHeightStyle.Trim.LastLineBottom";
            } else {
                object = 17;
                f5 = 2.4E-44f;
                charSequence = n3 == object ? "LineHeightStyle.Trim.Both" : (n3 == 0 ? "LineHeightStyle.Trim.None" : "Invalid");
            }
        }
        stringBuilder.append((Object)charSequence);
        stringBuilder.append(c2);
        return stringBuilder.toString();
    }
}

