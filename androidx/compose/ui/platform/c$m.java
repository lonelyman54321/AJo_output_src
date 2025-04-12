/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c$m
extends Lambda
implements Function1 {
    public final /* synthetic */ c c;

    public c$m(c c2) {
        this.c = c2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (pt2_1)object;
        Object object2 = this.c;
        object2.getClass();
        Object object3 = ((pt2_1)object).b;
        boolean bl2 = object3.contains(object);
        if (bl2) {
            object3 = ((c)object2).a.getSnapshotObserver();
            dg_0 dg_02 = new dg_0((pt2_1)object, (c)object2);
            object2 = ((c)object2).J;
            ((ch2)object3).a((Tg2)object, (Function1)object2, dg_02);
        }
        return Unit.a;
    }
}

