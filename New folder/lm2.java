/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

public final class lm2 {
    public final Object a;
    public final Object b;

    public lm2(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

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
        bl3 = Objects.equals(object2, object3);
        if (bl3 && (bl2 = Objects.equals(object = ((lm2)object).b, object2 = this.b))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        Object object = this.a;
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
        return n4 ^ n3;
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

