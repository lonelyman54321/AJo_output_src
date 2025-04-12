/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b$b
extends Lambda
implements Function1 {
    public final /* synthetic */ b c;

    public b$b(b b2) {
        this.c = b2;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        Object object2;
        Object object3 = object;
        object3 = (List)object;
        Object object4 = this.c;
        Tl3 tl3 = ((b)object4).t1().n;
        if (tl3 != null) {
            Sl3 sl3;
            object2 = tl3.a;
            Object object5 = ((Sl3)object2).a;
            Object object6 = ((b)object4).o;
            object4 = ((b)object4).y;
            long l2 = object4 != null ? object4.a() : OX.l;
            long l3 = 0L;
            int n3 = 0xFFFFFE;
            long l4 = 0L;
            long l7 = 0L;
            xm3 xm32 = xm3.e(object6, l2, l4, null, null, null, l7, null, 0, l3, n3);
            RU0$a rU0$a = ((Sl3)object2).i;
            long l8 = ((Sl3)object2).j;
            List list = ((Sl3)object2).c;
            int n4 = ((Sl3)object2).d;
            boolean bl3 = ((Sl3)object2).e;
            int n7 = ((Sl3)object2).f;
            object4 = ((Sl3)object2).g;
            object6 = ((Sl3)object2).h;
            object2 = sl3;
            Object object7 = object4;
            object4 = sl3;
            sl3 = new Sl3((Sl)object5, xm32, list, n4, bl3, n7, (Vo0)object7, (bp1_0)((Object)object6), rU0$a, l8);
            object5 = tl3.b;
            l2 = tl3.c;
            object2 = new Tl3(sl3, (RQ1)object5, l2);
            object3.add(object2);
        } else {
            object2 = null;
        }
        if (object2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object3 = null;
        }
        return bl2;
    }
}

