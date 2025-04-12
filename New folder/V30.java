/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class V30
implements pa3_0 {
    public final Function1 a;

    public V30(Function1 function1) {
        this.a = function1;
    }

    public final Object a(rq2_1 rq2_12) {
        return this.a.invoke(rq2_12);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof V30;
        if (!bl3) {
            return false;
        }
        object = (V30)object;
        Function1 function1 = this.a;
        object = ((V30)object).a;
        boolean bl4 = Intrinsics.areEqual(function1, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ComputedValueHolder(compute=");
        Function1 function1 = this.a;
        stringBuilder.append(function1);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

