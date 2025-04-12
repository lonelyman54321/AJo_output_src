/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a$b;
import androidx.compose.foundation.gestures.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Ws0 c;
    public final /* synthetic */ h d;

    public g$a(Ws0 ws0, h h3) {
        this.c = ws0;
        this.d = h3;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        float f5;
        long l2 = ((a$b)object).a;
        h h3 = this.d;
        int n3 = h3.C;
        if (n3 != 0) {
            n3 = -1082130432;
            f5 = -1.0f;
        } else {
            n3 = 1065353216;
            f5 = 1.0f;
        }
        l2 = e72.j(l2, f5);
        pg2_0 pg2_02 = h3.y;
        Zs0$a zs0$a = Zs0.a;
        pg2_0 pg2_03 = pg2_0.Vertical;
        float f6 = pg2_02 == pg2_03 ? e72.e(l2) : e72.d(l2);
        this.c.a(f6);
        return Unit.a;
    }
}

