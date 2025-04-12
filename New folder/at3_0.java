/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from at3
 */
public final class at3_0 {
    public final yn1_2 a;
    public final kn1_1 b;

    public at3_0(yn1_2 yn1_22, kn1_1 kn1_12) {
        Intrinsics.checkNotNullParameter(yn1_22, "type");
        this.a = yn1_22;
        this.b = kn1_12;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof at3_0;
        if (!bl2) {
            return false;
        }
        kn1_1 kn1_12 = this.b;
        if (kn1_12 == null) {
            Object object2 = object;
            object2 = (at3_0)object;
            kn1_1 kn1_13 = ((at3_0)object2).b;
            if (kn1_13 == null) {
                object = this.a;
                yn1_2 yn1_22 = ((at3_0)object2).a;
                return Intrinsics.areEqual(object, yn1_22);
            }
        }
        object = ((at3_0)object).b;
        return Intrinsics.areEqual(kn1_12, object);
    }

    public final int hashCode() {
        int n3;
        wn1_2 wn1_22 = this.b;
        if (wn1_22 != null) {
            n3 = wn1_22.hashCode();
        } else {
            wn1_22 = this.a;
            n3 = wn1_22.hashCode();
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TypeInfo(");
        wn1_2 wn1_22 = this.b;
        if (wn1_22 == null) {
            wn1_22 = this.a;
        }
        stringBuilder.append(wn1_22);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

