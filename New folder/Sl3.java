/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Sl3 {
    public final Sl a;
    public final xm3 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final Vo0 g;
    public final bp1_0 h;
    public final RU0$a i;
    public final long j;

    public Sl3() {
        throw null;
    }

    public Sl3(Sl sl, xm3 xm32, List list, int n3, boolean bl2, int n4, Vo0 vo0, bp1_0 bp1_02, RU0$a rU0$a, long l2) {
        this.a = sl;
        this.b = xm32;
        this.c = list;
        this.d = n3;
        this.e = bl2;
        this.f = n4;
        this.g = vo0;
        this.h = bp1_02;
        this.i = rU0$a;
        this.j = l2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Sl3;
        if (n3 == 0) {
            return false;
        }
        object = (Sl3)object;
        Object object2 = this.a;
        Object object3 = ((Sl3)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.b;
        object2 = ((Sl3)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.c;
        object2 = ((Sl3)object).c;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.d;
        int n4 = ((Sl3)object).d;
        if (n3 != n4) {
            return false;
        }
        n3 = this.e ? 1 : 0;
        n4 = ((Sl3)object).e ? 1 : 0;
        if (n3 != n4) {
            return false;
        }
        n3 = this.f;
        n4 = ((Sl3)object).f;
        if ((n3 = (int)(km3.b(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        object3 = this.g;
        object2 = ((Sl3)object).g;
        n3 = Intrinsics.areEqual(object3, object2) ? 1 : 0;
        if (n3 == 0) {
            return false;
        }
        object3 = this.h;
        object2 = ((Sl3)object).h;
        if (object3 != object2) {
            return false;
        }
        object3 = this.i;
        object2 = ((Sl3)object).i;
        n3 = Intrinsics.areEqual(object3, object2) ? 1 : 0;
        if (n3 == 0) {
            return false;
        }
        long l2 = this.j;
        long l3 = ((Sl3)object).j;
        boolean bl3 = c60.c(l2, l3);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        int n4 = 31;
        xm3 xm32 = this.b;
        int n7 = (xm32.hashCode() + (n3 *= 31)) * 31;
        List list = this.c;
        n3 = ne_0.a(n7, n4, list);
        n7 = this.d;
        n3 = (n3 + n7) * 31;
        n7 = this.e ? 1 : 0;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        n7 = this.f;
        n3 = (n3 + n7) * 31;
        n7 = (this.g.hashCode() + n3) * 31;
        n3 = (((Object)((Object)this.h)).hashCode() + n7) * 31;
        n7 = (this.i.hashCode() + n3) * 31;
        long l2 = this.j;
        return (int)(l2 >>> 32 ^ l2) + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TextLayoutInput(text=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", style=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", placeholders=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", maxLines=");
        int bl2 = this.d;
        stringBuilder.append(bl2);
        stringBuilder.append(", softWrap=");
        boolean bl3 = this.e;
        stringBuilder.append(bl3);
        stringBuilder.append(", overflow=");
        object = km3.c(this.f);
        stringBuilder.append(object);
        stringBuilder.append(", density=");
        object = this.g;
        stringBuilder.append(object);
        stringBuilder.append(", layoutDirection=");
        object = this.h;
        stringBuilder.append(object);
        stringBuilder.append(", fontFamilyResolver=");
        object = this.i;
        stringBuilder.append(object);
        stringBuilder.append(", constraints=");
        object = c60.m(this.j);
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

