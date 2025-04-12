/*
 * Decompiled with CFR 0.152.
 */
public final class JR1 {
    public Object a;
    public Object b;

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof lm2;
        boolean bl4 = false;
        if (!bl3) {
            return false;
        }
        object = (lm2)object;
        Object object2 = ((lm2)object).a;
        Object object3 = this.a;
        if ((object2 == object3 || object2 != null && (bl3 = object2.equals(object3))) && ((object = ((lm2)object).b) == (object2 = this.b) || object != null && (bl2 = object.equals(object2)))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        int n3;
        Object object = this.a;
        int n4 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        Object object2 = this.b;
        if (object2 != null) {
            n4 = object2.hashCode();
        }
        return n3 ^ n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Pair{");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(" ");
        object = this.b;
        return fK.a(stringBuilder, object, "}");
    }
}

