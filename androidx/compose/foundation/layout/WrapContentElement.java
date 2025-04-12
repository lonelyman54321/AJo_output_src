/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

final class WrapContentElement
extends up1_0 {
    public final Hq0 b;
    public final boolean c;
    public final Function2 d;
    public final Object e;

    public WrapContentElement(Hq0 hq0, boolean bl2, Function2 function2, Object object) {
        this.b = hq0;
        this.c = bl2;
        this.d = function2;
        this.e = object;
    }

    public final LP1$c b() {
        boolean bl2;
        Object object;
        ej3_0 ej3_02 = new LP1$c();
        ej3_02.n = object = this.b;
        ej3_02.o = bl2 = this.c;
        object = this.d;
        ej3_02.p = object;
        return ej3_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) {
            return false;
        }
        Object object2 = WrapContentElement.class;
        Object object3 = object.getClass();
        if (object2 != object3) {
            return false;
        }
        object = (WrapContentElement)object;
        object3 = this.b;
        object2 = ((WrapContentElement)object).b;
        if (object3 != object2) {
            return false;
        }
        boolean bl3 = this.c;
        boolean bl4 = ((WrapContentElement)object).c;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.e;
        object = ((WrapContentElement)object).e;
        boolean bl5 = Intrinsics.areEqual(object3, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        Hq0 hq0 = this.b;
        int n3 = ((Object)((Object)hq0)).hashCode() * 31;
        int n4 = this.c;
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        return this.e.hashCode() + n3;
    }

    public final void j(LP1$c lP1$c) {
        boolean bl2;
        Object object;
        lP1$c = (ej3_0)lP1$c;
        ((ej3_0)lP1$c).n = object = this.b;
        ((ej3_0)lP1$c).o = bl2 = this.c;
        object = this.d;
        ((ej3_0)lP1$c).p = object;
    }
}

