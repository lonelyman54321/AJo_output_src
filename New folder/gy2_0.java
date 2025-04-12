/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from gY2
 */
public final class gy2_0 {
    public final v21_0 a;
    public final long b;
    public final fY2 c;
    public final boolean d;

    public gy2_0(v21_0 v21_02, long l2, fY2 fY22, boolean bl2) {
        this.a = v21_02;
        this.b = l2;
        this.c = fY22;
        this.d = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof gy2_0;
        if (!bl3) {
            return false;
        }
        object = (gy2_0)object;
        Enum enum_ = this.a;
        Enum enum_2 = ((gy2_0)object).a;
        if (enum_ != enum_2) {
            return false;
        }
        long l2 = this.b;
        long l3 = ((gy2_0)object).b;
        bl3 = e72.b(l2, l3);
        if (!bl3) {
            return false;
        }
        enum_2 = this.c;
        enum_ = ((gy2_0)object).c;
        if (enum_2 != enum_) {
            return false;
        }
        bl3 = this.d;
        boolean bl4 = ((gy2_0)object).d;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = ((Object)((Object)this.a)).hashCode() * 31;
        long l2 = this.b;
        int n4 = (e72.f(l2) + n3) * 31;
        fY2 fY22 = this.c;
        n3 = (((Object)((Object)fY22)).hashCode() + n4) * 31;
        n4 = (int)(this.d ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectionHandleInfo(handle=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", position=");
        object = e72.k(this.b);
        stringBuilder.append(object);
        stringBuilder.append(", anchor=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", visible=");
        boolean bl2 = this.d;
        return AR.a(stringBuilder, bl2, ')');
    }
}

