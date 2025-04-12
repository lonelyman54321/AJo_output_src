/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class CR2$c
implements Map.Entry {
    public final Object a;
    public final Object b;
    public CR2$c c;
    public CR2$c d;

    public CR2$c(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        boolean bl4 = object instanceof CR2$c;
        if (!bl4) {
            return false;
        }
        object = (CR2$c)object;
        Object object2 = this.a;
        Object object3 = ((CR2$c)object).a;
        bl4 = object2.equals(object3);
        if (!bl4 || !(bl2 = (object3 = this.b).equals(object = ((CR2$c)object).b))) {
            bl3 = false;
        }
        return bl3;
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        int n4 = this.b.hashCode();
        return n3 ^ n4;
    }

    public final Object setValue(Object object) {
        object = new UnsupportedOperationException("An entry modification is not supported");
        throw object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append("=");
        object = this.b;
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

