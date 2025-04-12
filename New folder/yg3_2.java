/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Shader
 *  android.graphics.SweepGradient
 */
import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yg3
 */
public final class yg3_2
extends Z03 {
    public final long c;
    public final List d;
    public final List e;

    public yg3_2() {
        throw null;
    }

    public yg3_2(long l2, List list) {
        this.c = l2;
        this.d = list;
        this.e = null;
    }

    public final Shader b(long l2) {
        float f5;
        float f6;
        long l3 = this.c;
        Object object = h72.d(l3);
        if (object != 0) {
            l2 = bo1_1.b(l2);
        } else {
            float f7 = e72.d(l3);
            int n3 = 2139095040;
            float f8 = 1.0f / 0.0f;
            float f11 = f7 - f8;
            object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
            f7 = object == 0 ? C63.d(l2) : e72.d(l3);
            f6 = e72.e(l3);
            n3 = (int)(f6 == f8 ? 0 : (f6 < f8 ? -1 : 1));
            f5 = n3 == 0 ? C63.b(l2) : e72.e(l3);
            l2 = h72.a(f7, f5);
        }
        Object object2 = this.d;
        List list = this.e;
        fj_2.d((List)object2, list);
        object = fj_2.a((List)object2);
        f6 = e72.d(l2);
        f5 = e72.e(l2);
        int[] nArray = fj_2.b(object, (List)object2);
        object2 = fj_2.c(list, (List)object2, object);
        SweepGradient sweepGradient = new SweepGradient(f6, f5, nArray, (float[])object2);
        return sweepGradient;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof yg3_2;
        if (!bl3) {
            return false;
        }
        object = (yg3_2)object;
        long l2 = this.c;
        long l3 = ((yg3_2)object).c;
        bl3 = e72.b(l2, l3);
        if (!bl3) {
            return false;
        }
        List list = this.d;
        List list2 = ((yg3_2)object).d;
        bl3 = Intrinsics.areEqual(list, list2);
        if (!bl3) {
            return false;
        }
        list = this.e;
        object = ((yg3_2)object).e;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        long l2 = this.c;
        int n3 = e72.f(l2);
        int n4 = 31;
        n3 *= 31;
        List list = this.d;
        n3 = ne_0.a(n3, n4, list);
        List list2 = this.e;
        if (list2 != null) {
            n4 = ((Object)list2).hashCode();
        } else {
            n4 = 0;
            list2 = null;
        }
        return n3 + n4;
    }

    public final String toString() {
        CharSequence charSequence;
        long l2 = this.c;
        boolean bl2 = h72.c(l2);
        if (bl2) {
            String string2 = "center=";
            StringBuilder stringBuilder = new StringBuilder(string2);
            charSequence = e72.k(l2);
            stringBuilder.append((Object)charSequence);
            stringBuilder.append(", ");
            charSequence = stringBuilder.toString();
        } else {
            charSequence = "";
        }
        charSequence = Gn.a("SweepGradient(", (String)charSequence, "colors=");
        List list = this.d;
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(", stops=");
        list = this.e;
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(')');
        return ((StringBuilder)charSequence).toString();
    }
}

