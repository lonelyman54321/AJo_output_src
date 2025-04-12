/*
 * Decompiled with CFR 0.152.
 */
public final class uJ2 {
    public static final uJ2 c;
    public final int a;
    public final boolean b;

    static {
        uJ2 uJ22;
        c = uJ22 = new uJ2(0, false);
    }

    public uJ2(int n3, boolean bl2) {
        this.a = n3;
        this.b = bl2;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<uJ2> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = uJ2.class) == (clazz = object.getClass())) {
            int n3;
            object = (uJ2)object;
            int n4 = this.a;
            int n7 = ((uJ2)object).a;
            if (n4 != n7 || (n4 = (int)(this.b ? 1 : 0)) != (n3 = ((uJ2)object).b)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a << 1;
        int n4 = this.b;
        return n3 + n4;
    }
}

