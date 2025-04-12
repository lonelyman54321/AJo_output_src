/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pb1
 */
public final class pb1_1 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final Map e;

    public pb1_1() {
        this(0, false, false, 0, 31);
    }

    public pb1_1(int n3, int n4, boolean bl2, boolean bl3, Map map2) {
        Intrinsics.checkNotNullParameter(map2, "requestMap");
        this.a = n3;
        this.b = n4;
        this.c = bl2;
        this.d = bl3;
        this.e = map2;
    }

    public /* synthetic */ pb1_1(int n3, boolean bl2, boolean bl3, int n4, int n7) {
        int n8 = n7 & 1;
        int n10 = n8 != 0 ? 0 : n3;
        n3 = n7 & 2;
        int n14 = n3 != 0 ? 0 : n4;
        n3 = n7 & 4;
        boolean bl4 = n3 != 0 ? false : bl2;
        n3 = n7 & 8;
        boolean bl5 = n3 != 0 ? false : bl3;
        nz0_2 nz0_22 = fh1_2.f();
        this(n10, n14, bl4, bl5, nz0_22);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof pb1_1;
        if (n3 == 0) {
            return false;
        }
        object = (pb1_1)object;
        int n4 = this.a;
        n3 = ((pb1_1)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        n4 = ((pb1_1)object).b;
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.c ? 1 : 0);
        n4 = (int)(((pb1_1)object).c ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.d ? 1 : 0);
        n4 = (int)(((pb1_1)object).d ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        Map map2 = this.e;
        object = ((pb1_1)object).e;
        boolean bl3 = Intrinsics.areEqual(map2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = 1;
        int n7 = (int)(this.c ? 1 : 0);
        if (n7 != 0) {
            n7 = 1;
        }
        n3 = (n3 + n7) * 31;
        n7 = (int)(this.d ? 1 : 0);
        if (n7 == 0) {
            n4 = n7;
        }
        n3 = (n3 + n4) * 31;
        return ((Object)this.e).hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpUrlConnectionParams(connectTimeout=");
        int bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", readTimeout=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", useCaches=");
        boolean bl3 = this.c;
        stringBuilder.append(bl3);
        stringBuilder.append(", doInput=");
        boolean bl4 = this.d;
        stringBuilder.append(bl4);
        stringBuilder.append(", requestMap=");
        Map map2 = this.e;
        stringBuilder.append(map2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

