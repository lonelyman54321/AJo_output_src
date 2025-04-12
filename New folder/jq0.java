/*
 * Decompiled with CFR 0.152.
 */
public final class jq0 {
    public final boolean a;
    public final boolean b;
    public final ZW2 c;
    public final boolean d;
    public final boolean e;

    public jq0() {
        ZW2 zW2 = ZW2.Inherit;
        this(true, true, zW2, true, true);
    }

    public jq0(boolean bl2, boolean bl3, ZW2 zW2, boolean bl4, boolean bl5) {
        this.a = bl2;
        this.b = bl3;
        this.c = zW2;
        this.d = bl4;
        this.e = bl5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof jq0;
        if (!bl3) {
            return false;
        }
        object = (jq0)object;
        boolean bl4 = this.a;
        bl3 = ((jq0)object).a;
        if (bl4 != bl3) {
            return false;
        }
        bl3 = this.b;
        bl4 = ((jq0)object).b;
        if (bl3 != bl4) {
            return false;
        }
        ZW2 zW2 = this.c;
        ZW2 zW22 = ((jq0)object).c;
        if (zW2 != zW22) {
            return false;
        }
        bl3 = this.d;
        bl4 = ((jq0)object).d;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.e;
        boolean bl5 = ((jq0)object).e;
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
        ZW2 zW2 = this.c;
        n7 = (((Object)((Object)zW2)).hashCode() + n4) * 31;
        n4 = (int)(this.d ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        n7 = (n7 + n4) * 31;
        n4 = (int)(this.e ? 1 : 0);
        if (n4 != 0) {
            n3 = 1231;
        }
        return n7 + n3;
    }
}

