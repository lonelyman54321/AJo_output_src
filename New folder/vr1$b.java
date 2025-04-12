/*
 * Decompiled with CFR 0.152.
 */
public final class vr1$b
implements ur1 {
    public final String a;

    public vr1$b(String string2) {
        this.a = string2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof vr1$b;
        if (bl2) {
            object = (vr1$b)object;
            String string2 = this.a;
            object = ((vr1$b)object).a;
            return string2.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StringHeaderFactory{value='");
        String string2 = this.a;
        return h30_0.a(stringBuilder, string2, "'}");
    }
}

