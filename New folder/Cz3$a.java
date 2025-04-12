/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public final class Cz3$a
implements GenericArrayType {
    public final Type a;

    public Cz3$a(Type type2) {
        this.a = type2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof GenericArrayType;
        if (bl3 && (bl2 = cz3_0.b(this, (Type)(object = (GenericArrayType)object)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = cz3_0.o(this.a);
        stringBuilder.append(string2);
        stringBuilder.append("[]");
        return stringBuilder.toString();
    }
}

