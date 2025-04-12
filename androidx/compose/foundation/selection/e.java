/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.selection;

import androidx.compose.foundation.f;
import androidx.compose.foundation.selection.TriStateToggleableElement;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Lg1 c;
    public final /* synthetic */ ao3 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ CP2 f;
    public final /* synthetic */ Function0 g;

    public e(Lg1 lg1, ao3 ao32, boolean bl2, CP2 cP2, Function0 function0) {
        this.c = lg1;
        this.d = ao32;
        this.e = bl2;
        this.f = cP2;
        this.g = function0;
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
        Function0 function0 = this.g;
        ao3 ao32 = this.d;
        boolean bl2 = this.e;
        CP2 cP2 = this.f;
        object3 = new TriStateToggleableElement(ao32, (wr1_1)object4, null, bl2, cP2, function0);
        object = object.then((LP1)object3);
        object2.E();
        return object;
    }
}

