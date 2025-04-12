/*
 * Decompiled with CFR 0.152.
 */
public final class dX2$a {
    public final fx2_0 a;
    public final fx2_0 b;

    public dX2$a(fx2_0 fx2_02, fx2_0 fx2_03) {
        this.a = fx2_02;
        this.b = fx2_03;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = dX2$a.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (dX2$a)object;
            object2 = this.a;
            object3 = ((dX2$a)object).a;
            boolean bl4 = ((fx2_0)object2).equals(object3);
            if (!bl4 || !(bl3 = ((fx2_0)(object2 = this.b)).equals(object = ((dX2$a)object).b))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        Object object = this.a;
        stringBuilder.append(object);
        fx2_0 fx2_02 = this.b;
        boolean bl2 = ((fx2_0)object).equals(fx2_02);
        if (bl2) {
            object = "";
        } else {
            String string2 = ", ";
            object = new StringBuilder(string2);
            ((StringBuilder)object).append(fx2_02);
            object = ((StringBuilder)object).toString();
        }
        return h30_0.a(stringBuilder, (String)object, "]");
    }
}

