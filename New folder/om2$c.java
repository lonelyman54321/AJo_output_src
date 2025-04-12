/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 */
import android.graphics.Color;
import java.util.Arrays;

public final class om2$c {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public om2$c(int n3, int n4) {
        int n7;
        this.a = n7 = Color.red((int)n3);
        this.b = n7 = Color.green((int)n3);
        this.c = n7 = Color.blue((int)n3);
        this.d = n3;
        this.e = n4;
    }

    public final void a() {
        int n3 = this.f;
        if (n3 == 0) {
            n3 = -1;
            int n4 = this.d;
            int n7 = 0x40900000;
            float f5 = 4.5f;
            int n8 = hZ.f(f5, n3, n4);
            float f6 = 3.0f;
            int n10 = hZ.f(f6, n3, n4);
            boolean bl2 = true;
            if (n8 != n3 && n10 != n3) {
                this.h = n4 = hZ.i(n3, n8);
                this.g = n3 = hZ.i(n3, n10);
                this.f = bl2;
                return;
            }
            int n14 = -16777216;
            n7 = hZ.f(f5, n14, n4);
            n4 = hZ.f(f6, n14, n4);
            if (n7 != n3 && n4 != n3) {
                this.h = n3 = hZ.i(n14, n7);
                this.g = n3 = hZ.i(n14, n4);
                this.f = bl2;
                return;
            }
            n7 = n8 != n3 ? hZ.i(n3, n8) : hZ.i(n14, n7);
            this.h = n7;
            n3 = n10 != n3 ? hZ.i(n3, n10) : hZ.i(n14, n4);
            this.g = n3;
            this.f = bl2;
        }
    }

    public final float[] b() {
        int n3;
        float[] fArray = this.i;
        if (fArray == null) {
            n3 = 3;
            this.i = fArray = new float[n3];
        }
        n3 = this.c;
        float[] fArray2 = this.i;
        int n4 = this.a;
        int n7 = this.b;
        hZ.a(fArray2, n4, n7, n3);
        return this.i;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<om2$c> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = om2$c.class) == (clazz = object.getClass())) {
            int n3;
            object = (om2$c)object;
            int n4 = this.e;
            int n7 = ((om2$c)object).e;
            if (n4 != n7 || (n4 = this.d) != (n3 = ((om2$c)object).d)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.d * 31;
        int n4 = this.e;
        return n3 + n4;
    }

    public final String toString() {
        String string2 = om2$c.class.getSimpleName();
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(" [RGB: #");
        string2 = Integer.toHexString(this.d);
        stringBuilder.append(string2);
        stringBuilder.append("] [HSL: ");
        string2 = Arrays.toString(this.b());
        stringBuilder.append(string2);
        stringBuilder.append("] [Population: ");
        int n3 = this.e;
        stringBuilder.append(n3);
        stringBuilder.append("] [Title Text: #");
        this.a();
        string2 = Integer.toHexString(this.g);
        stringBuilder.append(string2);
        stringBuilder.append("] [Body Text: #");
        this.a();
        string2 = Integer.toHexString(this.h);
        stringBuilder.append(string2);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

