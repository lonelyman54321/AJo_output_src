/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Shader
 */
import android.graphics.Shader;

/*
 * Renamed from i93
 */
public final class i93_0
extends ZD {
    public final long a;

    public i93_0(long l2) {
        this.a = l2;
    }

    public final void a(float f5, long l2, fm2 fm22) {
        float f6 = 1.0f;
        fm22.b(f6);
        long l3 = this.a;
        float f7 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (f7 != false) {
            f6 = OX.d(l3) * f5;
            l3 = OX.b(l3, f6);
        }
        fm22.f(l3);
        Shader shader = fm22.j();
        if (shader != null) {
            f5 = 0.0f;
            shader = null;
            fm22.i(null);
        }
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof i93_0;
        if (!bl3) {
            return false;
        }
        object = (i93_0)object;
        long l2 = this.a;
        long l3 = ((i93_0)object).a;
        boolean bl4 = OX.c(l2, l3);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return mt3_0.a(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SolidColor(value=");
        String string2 = OX.i(this.a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

