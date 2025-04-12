/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.LinearGradient
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.os.Build$VERSION
 */
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cu1
 */
public final class cu1_0
extends Z03 {
    public final List c;
    public final List d;
    public final long e;
    public final long f;
    public final int g;

    public cu1_0() {
        throw null;
    }

    public cu1_0(List list, long l2, long l3, int n3) {
        this.c = list;
        this.d = null;
        this.e = l2;
        this.f = l3;
        this.g = n3;
    }

    public final Shader b(long l2) {
        cu1_0 cu1_02 = this;
        long l3 = this.e;
        float f5 = e72.d(l3);
        int n3 = 2139095040;
        float f6 = 1.0f / 0.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        f5 = object == false ? C63.d(l2) : e72.d(l3);
        float f8 = e72.e(l3);
        float f11 = f8 == f6 ? 0 : (f8 < f6 ? -1 : 1);
        float f12 = f11 == false ? C63.b(l2) : e72.e(l3);
        long l4 = cu1_02.f;
        float f14 = e72.d(l4);
        float f15 = f14 == f6 ? 0 : (f14 < f6 ? -1 : 1);
        f14 = f15 == false ? C63.d(l2) : e72.d(l4);
        float f16 = e72.e(l4);
        n3 = (int)(f16 == f6 ? 0 : (f16 < f6 ? -1 : 1));
        f6 = n3 == 0 ? C63.b(l2) : e72.e(l4);
        l4 = h72.a(f5, f12);
        l3 = h72.a(f14, f6);
        List list = cu1_02.c;
        List list2 = cu1_02.d;
        fj_2.d(list, list2);
        int n4 = fj_2.a(list);
        float f17 = e72.d(l4);
        float f18 = e72.e(l4);
        float f19 = e72.d(l3);
        float f20 = e72.e(l3);
        int[] nArray = fj_2.b(n4, list);
        float[] fArray = fj_2.c(list2, list, n4);
        f12 = 0.0f;
        Shader.TileMode tileMode = null;
        f15 = cu1_02.g;
        int n7 = vn3_0.a((int)f15, 0);
        if (n7 != 0) {
            tileMode = Shader.TileMode.CLAMP;
        } else {
            f12 = Float.MIN_VALUE;
            n7 = vn3_0.a((int)f15, 1);
            if (n7 != 0) {
                tileMode = Shader.TileMode.REPEAT;
            } else {
                f12 = 2.8E-45f;
                n7 = vn3_0.a((int)f15, 2);
                if (n7 != 0) {
                    tileMode = Shader.TileMode.MIRROR;
                } else {
                    f12 = 4.2E-45f;
                    n7 = vn3_0.a((int)f15, 3);
                    if (n7 != 0) {
                        n7 = Build.VERSION.SDK_INT;
                        f15 = 31;
                        f14 = 4.3E-44f;
                        tileMode = n7 >= f15 ? xn3_0.a.b() : Shader.TileMode.CLAMP;
                    } else {
                        tileMode = Shader.TileMode.CLAMP;
                    }
                }
            }
        }
        LinearGradient linearGradient = new LinearGradient(f17, f18, f19, f20, nArray, fArray, tileMode);
        return linearGradient;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof cu1_0;
        if (n3 == 0) {
            return false;
        }
        object = (cu1_0)object;
        List list = this.c;
        List list2 = ((cu1_0)object).c;
        n3 = Intrinsics.areEqual(list, list2);
        if (n3 == 0) {
            return false;
        }
        list2 = this.d;
        list = ((cu1_0)object).d;
        n3 = Intrinsics.areEqual(list2, list);
        if (n3 == 0) {
            return false;
        }
        long l2 = this.e;
        long l3 = ((cu1_0)object).e;
        n3 = e72.b(l2, l3);
        if (n3 == 0) {
            return false;
        }
        l2 = this.f;
        l3 = ((cu1_0)object).f;
        n3 = e72.b(l2, l3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.g;
        int n4 = ((cu1_0)object).g;
        if ((n4 = (int)(vn3_0.a(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        List list = this.c;
        int n4 = ((Object)list).hashCode() * 31;
        List list2 = this.d;
        if (list2 != null) {
            n3 = ((Object)list2).hashCode();
        } else {
            n3 = 0;
            list2 = null;
        }
        n4 = (n4 + n3) * 31;
        n3 = (e72.f(this.e) + n4) * 31;
        n4 = (e72.f(this.f) + n3) * 31;
        n3 = this.g;
        return n4 + n3;
    }

    public final String toString() {
        CharSequence charSequence;
        String string2;
        Object object;
        String string3;
        long l2 = this.e;
        int n3 = h72.b(l2);
        CharSequence charSequence2 = "";
        String string4 = ", ";
        if (n3 != 0) {
            string3 = "start=";
            object = new StringBuilder(string3);
            string2 = e72.k(l2);
            ((StringBuilder)object).append((Object)string2);
            ((StringBuilder)object).append(string4);
            string2 = ((StringBuilder)object).toString();
        } else {
            string2 = charSequence2;
        }
        long l3 = this.f;
        boolean bl2 = h72.b(l3);
        if (bl2) {
            string3 = "end=";
            charSequence2 = new StringBuilder(string3);
            charSequence = e72.k(l3);
            ((StringBuilder)charSequence2).append((Object)charSequence);
            ((StringBuilder)charSequence2).append(string4);
            charSequence2 = ((StringBuilder)charSequence2).toString();
        }
        charSequence = new StringBuilder("LinearGradient(colors=");
        object = this.c;
        ((StringBuilder)charSequence).append(object);
        ((StringBuilder)charSequence).append(", stops=");
        object = this.d;
        ((StringBuilder)charSequence).append(object);
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append((String)charSequence2);
        ((StringBuilder)charSequence).append("tileMode=");
        string2 = null;
        n3 = this.g;
        boolean bl3 = vn3_0.a(n3, 0);
        string2 = bl3 ? "Clamp" : ((bl3 = vn3_0.a(n3, 1)) ? "Repeated" : ((bl3 = vn3_0.a(n3, 2)) ? "Mirror" : ((bl3 = vn3_0.a(n3, 3)) ? "Decal" : "Unknown")));
        ((StringBuilder)charSequence).append((Object)string2);
        ((StringBuilder)charSequence).append(')');
        return ((StringBuilder)charSequence).toString();
    }
}

