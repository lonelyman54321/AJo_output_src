/*
 * Decompiled with CFR 0.152.
 */
public final class Dr {
    public static final Dr d;
    public final boolean a;
    public final boolean b;
    public final boolean c;

    static {
        Dr$a dr$a = new Object();
        d = dr$a.a();
    }

    public Dr(Dr$a dr$a) {
        boolean bl2;
        boolean bl3;
        this.a = bl3 = dr$a.a;
        this.b = bl3 = dr$a.b;
        this.c = bl2 = dr$a.c;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<Dr> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = Dr.class) == (clazz = object.getClass())) {
            boolean bl3;
            object = (Dr)object;
            boolean bl4 = this.a;
            boolean bl5 = ((Dr)object).a;
            if (bl4 != bl5 || (bl4 = this.b) != (bl5 = ((Dr)object).b) || (bl4 = this.c) != (bl3 = ((Dr)object).c)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a << 2;
        int n4 = this.b << 1;
        n3 += n4;
        n4 = this.c ? 1 : 0;
        return n3 + n4;
    }
}

