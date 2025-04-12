/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from d73
 */
public final class d73_0 {
    public final Function1 a;
    public final un0_0 b;

    public d73_0(Function1 function1, un0_0 un0_02) {
        this.a = function1;
        this.b = un0_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof d73_0;
        if (!bl3) {
            return false;
        }
        object = (d73_0)object;
        Function1 function1 = this.a;
        Object object2 = ((d73_0)object).a;
        bl3 = Intrinsics.areEqual(function1, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((d73_0)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Slide(slideOffset=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", animationSpec=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

