/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from wC3
 */
public final class wc3_0 {
    public static final wc3_0 d;
    public final int a;
    public final int b;
    public final float c;

    static {
        wc3_0 wc3_02;
        d = wc3_02 = new wc3_0(0, 0);
        gz3.D(0);
        gz3.D(1);
        gz3.D(3);
    }

    public wc3_0(int n3, int n4) {
        this(n3, n4, 1.0f);
    }

    public wc3_0(int n3, int n4, float f5) {
        this.a = n3;
        this.b = n4;
        this.c = f5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof wc3_0;
        if (n3 != 0) {
            float f5;
            float f6;
            float f7;
            float f8;
            object = (wc3_0)object;
            int n4 = this.a;
            n3 = ((wc3_0)object).a;
            if (n4 != n3 || (n3 = this.b) != (n4 = ((wc3_0)object).b) || (f8 = (f7 = (f6 = this.c) - (f5 = ((wc3_0)object).c)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a;
        int n4 = (217 + n3) * 31;
        n3 = this.b;
        n4 = (n4 + n3) * 31;
        return Float.floatToRawIntBits(this.c) + n4;
    }
}

