/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.c;
import androidx.compose.foundation.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b
extends Lambda
implements gx0_2 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ CP2 e;
    public final /* synthetic */ Function0 f;

    public b(boolean bl2, String string2, CP2 cP2, Function0 function0) {
        this.c = bl2;
        this.d = string2;
        this.e = cP2;
        this.f = function0;
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
        object2.K(-756081143);
        object = androidx.compose.foundation.f.a;
        Object object5 = object = object2.j((H30)object);
        object5 = (Lg1)object;
        boolean bl2 = object5 instanceof Qg1;
        if (bl2) {
            object2.K(617140216);
            object2.E();
            boolean bl3 = false;
            object3 = null;
        } else {
            int n3 = 617248189;
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
        String string2 = this.d;
        CP2 cP2 = this.e;
        Function0 function0 = this.f;
        if (bl2) {
            Object object7 = object5;
            object7 = (Qg1)object5;
            object = new ClickableElement((wr1_1)object3, (Qg1)object7, bl4, string2, cP2, function0);
        } else if (object5 == null) {
            Object var13_15 = null;
            object = new ClickableElement((wr1_1)object3, null, bl4, string2, cP2, function0);
        } else if (object3 != null) {
            object = androidx.compose.foundation.f.a((Lg1)object5, (wr1_1)object3);
            Object var13_16 = null;
            object3 = new ClickableElement((wr1_1)object6, null, bl4, string2, cP2, function0);
            object = object.then((LP1)object3);
        } else {
            object4 = object;
            object6 = string2;
            CP2 cP22 = cP2;
            object = new c((Lg1)object5, bl4, string2, cP2, function0);
            object3 = ji1.a;
            object = object4 = new Z20((Function1)object3, (gx0_2)object);
        }
        object2.E();
        return object;
    }
}

