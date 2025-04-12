/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer
 */
package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class d
extends qg3_2
implements Function2 {
    public d() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (d)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((d)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        return Choreographer.getInstance();
    }
}

