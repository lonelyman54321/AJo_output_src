/*
 * Decompiled with CFR 0.152.
 */
public final class ol0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ol0(long l2, long l3, long l4, long l7) {
        this.a = l2;
        this.b = l3;
        this.c = l4;
        this.d = l7;
    }

    public final tr1_0 a(boolean bl2, b30_0 b30_02) {
        int n3 = -655254499;
        b30_02.K(n3);
        long l2 = bl2 ? this.a : this.c;
        Object object = new OX(l2);
        object = J83.j(object, b30_02);
        b30_02.E();
        return object;
    }

    public final tr1_0 b(boolean bl2, b30_0 b30_02) {
        int n3 = -2133647540;
        b30_02.K(n3);
        long l2 = bl2 ? this.b : this.d;
        Object object = new OX(l2);
        object = J83.j(object, b30_02);
        b30_02.E();
        return object;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<ol0> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = ol0.class) == (clazz = object.getClass())) {
            object = (ol0)object;
            long l2 = this.a;
            long l3 = ((ol0)object).a;
            boolean bl3 = OX.c(l2, l3);
            if (!bl3) {
                return false;
            }
            l2 = this.b;
            l3 = ((ol0)object).b;
            bl3 = OX.c(l2, l3);
            if (!bl3) {
                return false;
            }
            l2 = this.c;
            l3 = ((ol0)object).c;
            bl3 = OX.c(l2, l3);
            if (!bl3) {
                return false;
            }
            l2 = this.d;
            l3 = ((ol0)object).d;
            boolean bl4 = OX.c(l2, l3);
            if (!bl4) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = OX.m;
        n3 = mt3_0.a(this.a);
        int n4 = 31;
        n3 *= 31;
        long l2 = this.b;
        n3 = D70.a(n3, n4, l2);
        l2 = this.c;
        n3 = D70.a(n3, n4, l2);
        return mt3_0.a(this.d) + n3;
    }
}

