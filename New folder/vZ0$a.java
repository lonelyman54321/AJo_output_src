/*
 * Decompiled with CFR 0.152.
 */
public final class vZ0$a
implements dj0$a {
    public final boolean a;

    public vZ0$a() {
        this.a = true;
    }

    public final dj0 a(N93 object, ba2 ba22) {
        boolean bl2;
        ff_2 ff_22;
        long l2;
        Object object2 = ((N93)object).a.d();
        boolean bl3 = object2.l(l2 = 0L, ff_22 = tZ0.b);
        if (!bl3 && !(bl2 = object2.l(l2, ff_22 = tZ0.a))) {
            return null;
        }
        bl3 = this.a;
        object = ((N93)object).a;
        object2 = new vz0_0((Fe1)object, ba22, bl3);
        return object2;
    }

    public final boolean equals(Object object) {
        return object instanceof vZ0$a;
    }

    public final int hashCode() {
        return vZ0$a.class.hashCode();
    }
}

