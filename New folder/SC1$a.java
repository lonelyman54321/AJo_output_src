/*
 * Decompiled with CFR 0.152.
 */
public final class SC1$a
implements uw2_0 {
    public final SC1$b a;
    public int b;
    public Class c;

    public SC1$a(SC1$b b2) {
        this.a = b2;
    }

    public final void a() {
        this.a.a(this);
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof SC1$a;
        boolean bl2 = false;
        if (n3 != 0) {
            Class clazz;
            object = (SC1$a)object;
            n3 = this.b;
            int n4 = ((SC1$a)object).b;
            if (n3 == n4 && (clazz = this.c) == (object = ((SC1$a)object).c)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.b * 31;
        Class clazz = this.c;
        if (clazz != null) {
            n3 = clazz.hashCode();
        } else {
            n3 = 0;
            clazz = null;
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Key{size=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append("array=");
        Class clazz = this.c;
        stringBuilder.append(clazz);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

