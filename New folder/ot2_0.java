/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

/*
 * Renamed from Ot2
 */
public final class ot2_0 {
    public static final ot2_0 d;
    public final float a;
    public final float b;
    public final int c;

    static {
        ot2_0 ot2_02;
        float f5 = 1.0f;
        d = ot2_02 = new ot2_0(f5, f5);
        gz3.D(0);
        gz3.D(1);
    }

    public ot2_0(float f5, float f6) {
        int n3;
        boolean bl2 = false;
        int n4 = 0;
        float f7 = f5 - 0.0f;
        float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        f8 = f8 > 0 ? 1.0f : 0.0f;
        ct3.a((boolean)f8);
        float f11 = f6 - 0.0f;
        n4 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (n4 > 0) {
            bl2 = true;
        }
        ct3.a(bl2);
        this.a = f5;
        this.b = f6;
        this.c = n3 = Math.round(f5 * 1000.0f);
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<ot2_0> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = ot2_0.class) == (clazz = object.getClass())) {
            float f5;
            float f6;
            float f7;
            object = (ot2_0)object;
            float f8 = this.a;
            float f11 = ((ot2_0)object).a;
            float f12 = f8 - f11;
            float f14 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (f14 != false || (f7 = (f6 = (f8 = this.b) - (f5 = ((ot2_0)object).b)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = (Float.floatToRawIntBits(this.a) + 527) * 31;
        return Float.floatToRawIntBits(this.b) + n3;
    }

    public final String toString() {
        Float f5 = Float.valueOf(this.a);
        Float f6 = Float.valueOf(this.b);
        Object[] objectArray = new Object[]{f5, f6};
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objectArray);
    }
}

