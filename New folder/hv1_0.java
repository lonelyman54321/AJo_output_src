/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from hV1
 */
public final class hv1_0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public hv1_0(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.a = bl2;
        this.b = bl3;
        this.c = bl4;
        this.d = bl5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof hv1_0;
        if (!bl3) {
            return false;
        }
        object = (hv1_0)object;
        boolean bl4 = this.a;
        bl3 = ((hv1_0)object).a;
        if (bl4 != bl3) {
            return false;
        }
        bl3 = this.b;
        bl4 = ((hv1_0)object).b;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.c;
        bl4 = ((hv1_0)object).c;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.d;
        boolean bl5 = ((hv1_0)object).d;
        if (bl3 != bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = 1237;
        int n4 = this.a;
        n4 = n4 != 0 ? 1231 : 1237;
        n4 *= 31;
        int n7 = this.b;
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.c ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.d ? 1 : 0);
        if (n7 != 0) {
            n3 = 1231;
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkState(isConnected=");
        boolean bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", isValidated=");
        bl2 = this.b;
        stringBuilder.append(bl2);
        stringBuilder.append(", isMetered=");
        bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", isNotRoaming=");
        bl2 = this.d;
        return AR.a(stringBuilder, bl2, ')');
    }
}

