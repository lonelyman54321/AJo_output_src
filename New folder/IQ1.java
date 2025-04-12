/*
 * Decompiled with CFR 0.152.
 */
public final class IQ1 {
    public Class a;
    public Class b;
    public Class c;

    public IQ1() {
    }

    public IQ1(Class clazz, Class clazz2, Class clazz3) {
        this.a = clazz;
        this.b = clazz2;
        this.c = clazz3;
    }

    public final boolean equals(Object object) {
        Class clazz;
        Class clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = IQ1.class) == (clazz = object.getClass())) {
            object = (IQ1)object;
            clazz = this.a;
            clazz2 = ((IQ1)object).a;
            boolean bl3 = clazz.equals(clazz2);
            if (!bl3) {
                return false;
            }
            clazz = this.b;
            clazz2 = ((IQ1)object).b;
            bl3 = clazz.equals(clazz2);
            if (!bl3) {
                return false;
            }
            clazz = this.c;
            object = ((IQ1)object).c;
            boolean bl4 = dz3.b(clazz, object);
            if (!bl4) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        Class clazz = this.b;
        int n4 = (clazz.hashCode() + n3) * 31;
        Class clazz2 = this.c;
        if (clazz2 != null) {
            n3 = clazz2.hashCode();
        } else {
            n3 = 0;
            clazz2 = null;
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MultiClassKey{first=");
        Class clazz = this.a;
        stringBuilder.append(clazz);
        stringBuilder.append(", second=");
        clazz = this.b;
        stringBuilder.append(clazz);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

