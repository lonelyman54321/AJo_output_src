/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

public final class Cz3$b
implements ParameterizedType {
    public final Type a;
    public final Type b;
    public final Type[] c;

    public Cz3$b(Type object, Type type2, Type ... typeArray) {
        Class<?> clazz;
        Type type3;
        int n3 = type2 instanceof Class;
        int n4 = 0;
        if (n3 != 0) {
            int n7;
            n3 = 1;
            if (object == null) {
                n7 = 1;
            } else {
                n7 = 0;
                type3 = null;
            }
            clazz = type2;
            clazz = ((Class)type2).getEnclosingClass();
            if (clazz != null) {
                n3 = 0;
            }
            if (n7 != n3) {
                throw object;
            }
        }
        n3 = typeArray.length;
        while (n4 < n3) {
            type3 = typeArray[n4];
            clazz = "typeArgument == null";
            Objects.requireNonNull(type3, clazz);
            cz3_0.a(type3);
            ++n4;
        }
        this.a = object;
        this.b = type2;
        object = (Type[])typeArray.clone();
        this.c = object;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof ParameterizedType;
        if (bl3 && (bl2 = cz3_0.b(this, (Type)(object = (ParameterizedType)object)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final Type[] getActualTypeArguments() {
        return (Type[])this.c.clone();
    }

    public final Type getOwnerType() {
        return this.a;
    }

    public final Type getRawType() {
        return this.b;
    }

    public final int hashCode() {
        Object[] objectArray = this.c;
        int n3 = Arrays.hashCode(objectArray);
        int n4 = this.b.hashCode();
        n3 ^= n4;
        Type type2 = this.a;
        if (type2 != null) {
            n4 = type2.hashCode();
        } else {
            n4 = 0;
            type2 = null;
        }
        return n3 ^ n4;
    }

    public final String toString() {
        int n3;
        Type[] typeArray = this.c;
        int n4 = typeArray.length;
        Object object = this.b;
        if (n4 == 0) {
            return cz3_0.o((Type)object);
        }
        int n7 = typeArray.length;
        n7 = (n7 + n3) * 30;
        StringBuilder stringBuilder = new StringBuilder(n7);
        object = cz3_0.o((Type)object);
        stringBuilder.append((String)object);
        stringBuilder.append("<");
        int n8 = 0;
        object = cz3_0.o(typeArray[0]);
        stringBuilder.append((String)object);
        for (n3 = 1; n3 < (n8 = typeArray.length); ++n3) {
            stringBuilder.append(", ");
            object = cz3_0.o(typeArray[n3]);
            stringBuilder.append((String)object);
        }
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}

