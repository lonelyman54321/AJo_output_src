/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class BR {
    public final Nc a;
    public final Function1 b;
    public final un0_0 c;
    public final boolean d;

    public BR(Nc nc, un0_0 un0_02, Function1 function1, boolean bl2) {
        this.a = nc;
        this.b = function1;
        this.c = un0_02;
        this.d = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BR;
        if (!bl3) {
            return false;
        }
        object = (BR)object;
        Object object2 = this.a;
        Object object3 = ((BR)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((BR)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((BR)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.d;
        boolean bl4 = ((BR)object).d;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        Function1 function1 = this.b;
        int n4 = (function1.hashCode() + n3) * 31;
        un0_0 un0_02 = this.c;
        n3 = (un0_02.hashCode() + n4) * 31;
        n4 = this.d ? 1 : 0;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ChangeSize(alignment=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", size=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", animationSpec=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", clip=");
        boolean bl2 = this.d;
        return AR.a(stringBuilder, bl2, ')');
    }
}

