/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.selection;

import androidx.compose.foundation.f;
import androidx.compose.foundation.selection.ToggleableElement;
import androidx.compose.foundation.selection.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c
extends Lambda
implements gx0_2 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ CP2 e;
    public final /* synthetic */ Function1 f;

    public c(boolean bl2, boolean bl3, CP2 cP2, Function1 function1) {
        this.c = bl2;
        this.d = bl3;
        this.e = cP2;
        this.f = function1;
        super(3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4;
        object = (LP1)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        ((Number)object3).intValue();
        object2.K(290332169);
        object = androidx.compose.foundation.f.a;
        Object object5 = object = object2.j((H30)object);
        object5 = (Lg1)object;
        boolean bl2 = object5 instanceof Qg1;
        if (bl2) {
            object2.K(-2130154122);
            object2.E();
            boolean bl3 = false;
            object3 = null;
        } else {
            int n3 = -2130046149;
            object2.K(n3);
            object3 = object2.v();
            object4 = b30$a.a;
            if (object3 == object4) {
                object3 = new xr1_1();
                object2.o(object3);
            }
            object3 = (wr1_1)object3;
            object2.E();
        }
        Object object6 = object3;
        boolean bl4 = this.c;
        boolean bl5 = this.d;
        CP2 cP2 = this.e;
        Function1 function1 = this.f;
        if (bl2) {
            Object object7 = object5;
            object7 = (Qg1)object5;
            object = new ToggleableElement(bl4, (wr1_1)object3, (Qg1)object7, bl5, cP2, function1);
        } else if (object5 == null) {
            Object var13_15 = null;
            object = new ToggleableElement(bl4, (wr1_1)object3, null, bl5, cP2, function1);
        } else if (object3 != null) {
            object = androidx.compose.foundation.f.a((Lg1)object5, (wr1_1)object3);
            Object var13_16 = null;
            object3 = new ToggleableElement(bl4, (wr1_1)object6, null, bl5, cP2, function1);
            object = object.then((LP1)object3);
        } else {
            object4 = object;
            boolean bl6 = bl4;
            bl4 = bl5;
            object6 = cP2;
            Function1 function12 = function1;
            object = new d((Lg1)object5, bl6, bl5, cP2, function1);
            object3 = ji1.a;
            object = object4 = new Z20((Function1)object3, (gx0_2)object);
        }
        object2.E();
        return object;
    }
}

