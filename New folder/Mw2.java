/*
 * Decompiled with CFR 0.152.
 */
public final class Mw2 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public Mw2(boolean bl2, int n3) {
        boolean bl3;
        if ((n3 &= 1) != 0) {
            bl2 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        ZW2 zW2 = ZW2.Inherit;
        this(bl3, true, true, zW2, true, true);
    }

    /*
     * WARNING - void declaration
     */
    public Mw2(boolean bl2, boolean bl3, boolean bl4, ZW2 zW2, boolean bl5, boolean bl6) {
        void var5_10;
        void var3_8;
        void var2_7;
        boolean bl7;
        int n3;
        void var6_11;
        int n4;
        Object var4_9;
        Object object = xi.a;
        if (!bl2) {
            int n7 = 262152;
        } else {
            int n8 = 262144;
        }
        object = ZW2.SecureOn;
        if (var4_9 == object) {
            void var1_4;
            n4 = var1_4 | 0x2000;
        }
        if (var6_11 == false) {
            n3 = n4 | 0x200;
        }
        ZW2 zW22 = ZW2.Inherit;
        object = null;
        if (var4_9 == zW22) {
            bl7 = true;
        } else {
            bl7 = false;
            var4_9 = null;
        }
        this.a = n3;
        this.b = bl7;
        this.c = var2_7;
        this.d = var3_8;
        this.e = var5_10;
        this.f = false;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Mw2;
        if (n3 == 0) {
            return false;
        }
        object = (Mw2)object;
        int n4 = this.a;
        n3 = ((Mw2)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b ? 1 : 0;
        n4 = ((Mw2)object).b ? 1 : 0;
        if (n3 != n4) {
            return false;
        }
        n3 = this.c ? 1 : 0;
        n4 = ((Mw2)object).c ? 1 : 0;
        if (n3 != n4) {
            return false;
        }
        n3 = this.d ? 1 : 0;
        n4 = ((Mw2)object).d ? 1 : 0;
        if (n3 != n4) {
            return false;
        }
        n3 = this.e ? 1 : 0;
        n4 = ((Mw2)object).e ? 1 : 0;
        if (n3 != n4) {
            return false;
        }
        n3 = this.f ? 1 : 0;
        int n7 = ((Mw2)object).f;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = 1237;
        int n7 = this.b;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        n7 = this.c ? 1 : 0;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        n7 = this.d ? 1 : 0;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        n7 = this.e ? 1 : 0;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        n7 = this.f ? 1 : 0;
        if (n7 != 0) {
            n4 = 1231;
        }
        return n3 + n4;
    }
}

