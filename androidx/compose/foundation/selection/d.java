/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.selection;

import androidx.compose.foundation.f;
import androidx.compose.foundation.selection.ToggleableElement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Lg1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ CP2 f;
    public final /* synthetic */ Function1 g;

    public d(Lg1 lg1, boolean bl2, boolean bl3, CP2 cP2, Function1 function1) {
        this.c = lg1;
        this.d = bl2;
        this.e = bl3;
        this.f = cP2;
        this.g = function1;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (LP1)object;
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        int n3 = -1525724089;
        object2.K(n3);
        object = object2.v();
        object3 = b30$a.a;
        if (object == object3) {
            object = new xr1_1();
            object2.o(object);
        }
        Object object4 = object;
        object4 = (wr1_1)object;
        object = androidx.compose.foundation.f.a(this.c, (wr1_1)object4);
        Function1 function1 = this.g;
        boolean bl2 = this.d;
        boolean bl3 = this.e;
        CP2 cP2 = this.f;
        object3 = new ToggleableElement(bl2, (wr1_1)object4, null, bl3, cP2, function1);
        object = object.then((LP1)object3);
        object2.E();
        return object;
    }
}

