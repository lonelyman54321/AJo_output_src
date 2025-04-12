/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IA0
 */
public final class ia0_2
extends x0_0
implements ga0_2,
Serializable {
    public final Enum[] b;

    public ia0_2(Enum[] enumArray) {
        Intrinsics.checkNotNullParameter(enumArray, "entries");
        this.b = enumArray;
    }

    private final Object writeReplace() {
        Enum[] enumArray = this.b;
        ja0_2 ja0_22 = new ja0_2(enumArray);
        return ja0_22;
    }

    public final int a() {
        return this.b.length;
    }

    public final boolean contains(Object object) {
        int n3 = object instanceof Enum;
        boolean bl2 = false;
        if (n3 == 0) {
            return false;
        }
        object = (Enum)object;
        Intrinsics.checkNotNullParameter(object, "element");
        n3 = ((Enum)object).ordinal();
        Object[] objectArray = this.b;
        Enum enum_ = (Enum)tp_2.E(n3, objectArray);
        if (enum_ == object) {
            bl2 = true;
        }
        return bl2;
    }

    public final Object get(int n3) {
        X0$a x0$a = x0_0.a;
        Enum[] enumArray = this.b;
        int n4 = enumArray.length;
        x0$a.getClass();
        X0$a.b(n3, n4);
        return enumArray[n3];
    }

    public final int indexOf(Object object) {
        int n3 = object instanceof Enum;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (Enum)object;
        String string2 = "element";
        Intrinsics.checkNotNullParameter(object, string2);
        n3 = ((Enum)object).ordinal();
        Object object2 = this.b;
        object2 = (Enum)tp_2.E(n3, object2);
        if (object2 == object) {
            n4 = n3;
        }
        return n4;
    }

    public final int lastIndexOf(Object object) {
        boolean bl2 = object instanceof Enum;
        if (!bl2) {
            return -1;
        }
        object = (Enum)object;
        Intrinsics.checkNotNullParameter(object, "element");
        return this.indexOf(object);
    }
}

