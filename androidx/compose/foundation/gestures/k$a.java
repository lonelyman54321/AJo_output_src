/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a$b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k$a
extends Lambda
implements Function1 {
    public final /* synthetic */ tU1 c;
    public final /* synthetic */ ku2_0 d;

    public k$a(tU1 tU12, ku2_0 ku2_02) {
        this.c = tU12;
        this.d = ku2_02;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((a$b)object).a;
        object = this.d.d;
        pg2_0 pg2_02 = pg2_0.Horizontal;
        int n3 = 1;
        if (object == pg2_02) {
            l2 = e72.a(n3, l2, 0.0f);
        } else {
            int n4 = 2;
            l2 = e72.a(n4, l2, 0.0f);
        }
        this.c.b(n3, l2);
        return Unit.a;
    }
}

