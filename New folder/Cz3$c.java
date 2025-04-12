/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public final class Cz3$c
implements WildcardType {
    public final Type a;
    public final Type b;

    /*
     * Enabled aggressive block sorting
     */
    public Cz3$c(Type[] object, Type[] typeArray) {
        Object var2_8;
        int n3 = ((void)var2_8).length;
        int n4 = 1;
        if (n3 > n4) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            throw illegalArgumentException;
        }
        n3 = ((Type[])object).length;
        if (n3 != n4) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            throw illegalArgumentException;
        }
        n3 = ((void)var2_8).length;
        if (n3 != n4) {
            Type type2;
            object[0].getClass();
            cz3_0.a(object[0]);
            var2_8 = null;
            this.b = null;
            this.a = type2 = object[0];
            return;
        }
        var2_8[0].getClass();
        cz3_0.a((Type)var2_8[0]);
        Type type3 = object[0];
        Class<Object> clazz = Object.class;
        if (type3 == clazz) {
            void var1_3 = var2_8[0];
            this.b = var1_3;
            this.a = clazz;
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof WildcardType;
        if (bl3 && (bl2 = cz3_0.b(this, (Type)(object = (WildcardType)object)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final Type[] getLowerBounds() {
        Type[] typeArray;
        Type type2 = this.b;
        if (type2 != null) {
            int n3 = 1;
            typeArray = new Type[n3];
            typeArray[0] = type2;
        } else {
            typeArray = cz3_0.a;
        }
        return typeArray;
    }

    public final Type[] getUpperBounds() {
        Type type2 = this.a;
        Type[] typeArray = new Type[]{type2};
        return typeArray;
    }

    public final int hashCode() {
        Type type2 = this.b;
        int n3 = type2 != null ? type2.hashCode() + 31 : 1;
        int n4 = this.a.hashCode() + 31;
        return n3 ^ n4;
    }

    public final String toString() {
        Class<Object> clazz = this.b;
        if (clazz != null) {
            StringBuilder stringBuilder = new StringBuilder("? super ");
            clazz = cz3_0.o((Type)((Object)clazz));
            stringBuilder.append((String)((Object)clazz));
            return stringBuilder.toString();
        }
        Object object = this.a;
        clazz = Object.class;
        if (object == clazz) {
            return "?";
        }
        clazz = new StringBuilder("? extends ");
        object = cz3_0.o((Type)object);
        ((StringBuilder)((Object)clazz)).append((String)object);
        return ((StringBuilder)((Object)clazz)).toString();
    }
}

