/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mn1
 */
public final class mn1_2
implements kn1_1 {
    public final kn1_1 a;

    public mn1_2(kn1_1 kn1_12) {
        Intrinsics.checkNotNullParameter(kn1_12, "origin");
        this.a = kn1_12;
    }

    public final boolean equals(Object object) {
        Object object2;
        Class clazz = null;
        if (object == null) {
            return false;
        }
        boolean bl2 = object instanceof mn1_2;
        zn1_2 zn1_22 = null;
        if (bl2) {
            object2 = object;
            object2 = (mn1_2)object;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null) {
            object2 = ((mn1_2)object2).a;
        } else {
            bl2 = false;
            object2 = null;
        }
        kn1_1 kn1_12 = this.a;
        bl2 = Intrinsics.areEqual(kn1_12, object2);
        if (!bl2) {
            return false;
        }
        object2 = kn1_12.getClassifier();
        boolean bl3 = object2 instanceof yn1_2;
        if (bl3) {
            boolean bl4;
            bl3 = object instanceof kn1_1;
            if (bl3) {
                object = (kn1_1)object;
            } else {
                bl4 = false;
                object = null;
            }
            if (object != null) {
                zn1_22 = object.getClassifier();
            }
            if (zn1_22 != null && (bl4 = zn1_22 instanceof yn1_2)) {
                object = rn1_2.a((yn1_2)object2);
                clazz = rn1_2.a((yn1_2)zn1_22);
                return Intrinsics.areEqual(object, clazz);
            }
        }
        return false;
    }

    public final List getArguments() {
        return this.a.getArguments();
    }

    public final zn1_2 getClassifier() {
        return this.a.getClassifier();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean isMarkedNullable() {
        return this.a.isMarkedNullable();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("KTypeWrapper: ");
        kn1_1 kn1_12 = this.a;
        stringBuilder.append(kn1_12);
        return stringBuilder.toString();
    }
}

