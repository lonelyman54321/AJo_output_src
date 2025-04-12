/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pY
 */
public abstract class py_1 {
    public final String a;
    public final long b;
    public final int c;

    public py_1(String object, long l2, int n3) {
        this.a = object;
        this.b = l2;
        this.c = n3;
        int n4 = ((String)object).length();
        if (n4 != 0) {
            n4 = -1;
            if (n3 >= n4 && n3 <= (n4 = 63)) {
                return;
            }
            object = new IllegalArgumentException("The id must be between -1 and 63");
            throw object;
        }
        object = new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        throw object;
    }

    public abstract float[] a(float[] var1);

    public abstract float b(int var1);

    public abstract float c(int var1);

    public boolean d() {
        return false;
    }

    public long e(float f5, float f6, float f7) {
        int n3 = 1;
        float[] fArray = new float[3];
        fArray[0] = f5;
        fArray[n3] = f6;
        fArray[2] = f7;
        float[] fArray2 = this.f(fArray);
        f6 = fArray2[0];
        f5 = fArray2[n3];
        long l2 = Float.floatToRawIntBits(f6);
        long l3 = Float.floatToRawIntBits(f5);
        long l4 = l2 << 32;
        return l4 | (l3 &= 0xFFFFFFFFL);
    }

    public boolean equals(Object object) {
        Object object2;
        Object object3;
        if (this == object) {
            return true;
        }
        boolean bl2 = false;
        if (object != null && (object3 = this.getClass()) == (object2 = object.getClass())) {
            object = (py_1)object;
            int n3 = this.c;
            int n4 = ((py_1)object).c;
            if (n3 != n4) {
                return false;
            }
            object3 = this.a;
            object2 = ((py_1)object).a;
            n3 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
            if (n3 != 0) {
                long l2 = this.b;
                long l3 = ((py_1)object).b;
                bl2 = ay_0.a(l2, l3);
            }
        }
        return bl2;
    }

    public abstract float[] f(float[] var1);

    public float g(float f5, float f6, float f7) {
        int n3 = 2;
        float[] fArray = new float[3];
        fArray[0] = f5;
        fArray[1] = f6;
        fArray[n3] = f7;
        return this.f(fArray)[n3];
    }

    public long h(float f5, float f6, float f7, float f8, py_1 py_12) {
        float[] fArray = new float[(int)(this.b >> 32)];
        fArray[0] = f5;
        int n3 = 1;
        fArray[n3] = f6;
        int n4 = 2;
        fArray[n4] = f7;
        float[] fArray2 = this.a(fArray);
        float f11 = fArray2[0];
        f5 = fArray2[n3];
        f6 = fArray2[n4];
        return zx_0.b(f11, f5, f6, f8, py_12);
    }

    public int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = ay_0.e;
        long l2 = this.b;
        long l3 = l2 >>> 32;
        int n7 = (int)(l2 ^ l3);
        n3 = (n3 + n7) * 31;
        n4 = this.c;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(" (id=");
        int n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", model=");
        string2 = ay_0.b(this.b);
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

