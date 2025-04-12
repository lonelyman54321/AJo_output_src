/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.b;
import androidx.compose.foundation.text.modifiers.b$a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b$c
extends Lambda
implements Function1 {
    public final /* synthetic */ b c;

    public b$c(b b2) {
        this.c = b2;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Sl)object;
        object = this.c;
        Object object3 = ((b)object).D;
        if (object3 != null) {
            Object object4 = ((b$a)object3).b;
            boolean bl2 = Intrinsics.areEqual(object2, object4);
            if (!bl2) {
                ((b$a)object3).b = object2;
                object3 = ((b$a)object3).d;
                bl2 = false;
                object4 = null;
                if (object3 != null) {
                    int n3;
                    xm3 xm32 = ((b)object).o;
                    RU0$a rU0$a = ((b)object).p;
                    int n4 = ((b)object).r;
                    boolean bl3 = ((b)object).s;
                    int n7 = ((b)object).t;
                    int n8 = ((b)object).u;
                    List list = ((b)object).v;
                    ((UQ1)object3).a = object2;
                    ((UQ1)object3).b = xm32;
                    ((UQ1)object3).c = rU0$a;
                    ((UQ1)object3).d = n4;
                    ((UQ1)object3).e = bl3;
                    ((UQ1)object3).f = n7;
                    ((UQ1)object3).g = n8;
                    ((UQ1)object3).h = list;
                    ((UQ1)object3).l = null;
                    ((UQ1)object3).n = null;
                    ((UQ1)object3).p = n3 = -1;
                    ((UQ1)object3).o = n3;
                    object4 = Unit.a;
                }
            }
        } else {
            UQ1 uQ1;
            object3 = ((b)object).n;
            b$a b$a = new b$a((Sl)object3, (Sl)object2);
            xm3 xm33 = ((b)object).o;
            RU0$a rU0$a = ((b)object).p;
            int n10 = ((b)object).r;
            boolean bl4 = ((b)object).s;
            int n14 = ((b)object).t;
            int n15 = ((b)object).u;
            List list = ((b)object).v;
            object3 = uQ1;
            uQ1 = new UQ1((Sl)object2, xm33, rU0$a, n10, bl4, n14, n15, list);
            object3 = ((b)object).t1().k;
            uQ1.c((Vo0)object3);
            b$a.d = uQ1;
            ((b)object).D = b$a;
        }
        b.r1((b)object);
        return Boolean.TRUE;
    }
}

