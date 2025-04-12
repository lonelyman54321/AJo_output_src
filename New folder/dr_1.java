/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dr
 */
public final class dr_1 {
    public static final dr_1 g;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public dr$a_0 f;

    static {
        dr_1 dr_12;
        g = dr_12 = new dr_1();
        f4.b(0, 1, 2, 3, 4);
    }

    public dr_1() {
        int n3;
        this.a = 0;
        this.b = 0;
        this.c = n3 = 1;
        this.d = n3;
        this.e = 0;
    }

    public final dr$a_0 a() {
        dr$a_0 dr$a_0 = this.f;
        if (dr$a_0 == null) {
            this.f = dr$a_0 = new dr$a_0(this);
        }
        return this.f;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<dr_1> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = dr_1.class) == (clazz = object.getClass())) {
            int n3;
            object = (dr_1)object;
            int n4 = this.a;
            int n7 = ((dr_1)object).a;
            if (n4 != n7 || (n4 = this.b) != (n7 = ((dr_1)object).b) || (n4 = this.c) != (n7 = ((dr_1)object).c) || (n4 = this.d) != (n7 = ((dr_1)object).d) || (n4 = this.e) != (n3 = ((dr_1)object).e)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a;
        int n4 = (527 + n3) * 31;
        n3 = this.b;
        n4 = (n4 + n3) * 31;
        n3 = this.c;
        n4 = (n4 + n3) * 31;
        n3 = this.d;
        n4 = (n4 + n3) * 31;
        n3 = this.e;
        return n4 + n3;
    }
}

