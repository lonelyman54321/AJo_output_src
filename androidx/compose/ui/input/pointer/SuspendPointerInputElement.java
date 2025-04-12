/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.input.pointer;

import java.util.Arrays;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class SuspendPointerInputElement
extends up1_0 {
    public final Object b;
    public final Object c;
    public final Object[] d;
    public final Function2 e;

    public SuspendPointerInputElement() {
        throw null;
    }

    public SuspendPointerInputElement(Object object, Sj3 sj3, Function2 function2, int n3) {
        if ((n3 &= 2) != 0) {
            sj3 = null;
        }
        this.b = object;
        this.c = sj3;
        this.d = null;
        this.e = function2;
    }

    public final LP1$c b() {
        Object object = this.b;
        Object object2 = this.c;
        Object[] objectArray = this.d;
        Function2 function2 = this.e;
        wg3_2 wg3_22 = new wg3_2(object, object2, objectArray, function2);
        return wg3_22;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SuspendPointerInputElement;
        if (!bl3) {
            return false;
        }
        object = (SuspendPointerInputElement)object;
        Object object2 = this.b;
        Object object3 = ((SuspendPointerInputElement)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((SuspendPointerInputElement)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        if (object3 != null) {
            object2 = ((SuspendPointerInputElement)object).d;
            if (object2 == null) {
                return false;
            }
            bl3 = Arrays.equals(object3, object2);
            if (!bl3) {
                return false;
            }
        } else {
            object3 = ((SuspendPointerInputElement)object).d;
            if (object3 != null) {
                return false;
            }
        }
        if ((object3 = this.e) != (object = ((SuspendPointerInputElement)object).e)) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        Object object = this.b;
        if (object != null) {
            n4 = object.hashCode();
        } else {
            n4 = 0;
            object = null;
        }
        n4 *= 31;
        Object[] objectArray = this.c;
        if (objectArray != null) {
            n3 = objectArray.hashCode();
        } else {
            n3 = 0;
            objectArray = null;
        }
        n4 = (n4 + n3) * 31;
        objectArray = this.d;
        if (objectArray != null) {
            n7 = Arrays.hashCode(objectArray);
        }
        n4 = (n4 + n7) * 31;
        return this.e.hashCode() + n4;
    }

    public final void j(LP1$c lP1$c) {
        lP1$c = (wg3_2)lP1$c;
        Object object = ((wg3_2)lP1$c).n;
        Object object2 = this.b;
        boolean bl2 = Intrinsics.areEqual(object, object2);
        boolean bl3 = true;
        bl2 ^= bl3;
        ((wg3_2)lP1$c).n = object2;
        object2 = ((wg3_2)lP1$c).o;
        Object[] objectArray = this.c;
        boolean bl4 = Intrinsics.areEqual(object2, objectArray);
        if (!bl4) {
            bl2 = true;
        }
        ((wg3_2)lP1$c).o = objectArray;
        object2 = ((wg3_2)lP1$c).p;
        objectArray = this.d;
        if (object2 != null && objectArray == null) {
            bl2 = true;
        }
        if (object2 == null && objectArray != null) {
            bl2 = true;
        }
        if (object2 == null || objectArray == null || (bl4 = Arrays.equals(objectArray, object2))) {
            bl3 = bl2;
        }
        ((wg3_2)lP1$c).p = objectArray;
        if (bl3) {
            ((wg3_2)lP1$c).m0();
        }
        ((wg3_2)lP1$c).q = object = this.e;
    }
}

