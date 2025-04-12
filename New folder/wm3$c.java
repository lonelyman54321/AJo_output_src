/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class wm3$c
extends Lambda
implements Function1 {
    public final /* synthetic */ wm3 c;

    public wm3$c(wm3 wm32) {
        this.c = wm32;
        super(1);
    }

    public final Object invoke(Object object) {
        String string2 = ((Sl)object).a;
        object = this.c;
        Object object2 = ((wm3)object).y;
        if (object2 != null) {
            Object object3 = ((wm3$a)object2).b;
            boolean bl2 = Intrinsics.areEqual(string2, object3);
            if (!bl2) {
                ((wm3$a)object2).b = string2;
                object2 = ((wm3$a)object2).d;
                bl2 = false;
                object3 = null;
                if (object2 != null) {
                    long l2;
                    int n3;
                    xm3 xm32 = ((wm3)object).o;
                    RU0$a rU0$a = ((wm3)object).p;
                    int n4 = ((wm3)object).q;
                    boolean bl3 = ((wm3)object).r;
                    int n7 = ((wm3)object).s;
                    int n8 = ((wm3)object).t;
                    ((xm2_0)object2).a = string2;
                    ((xm2_0)object2).b = xm32;
                    ((xm2_0)object2).c = rU0$a;
                    ((xm2_0)object2).d = n4;
                    ((xm2_0)object2).e = bl3;
                    ((xm2_0)object2).f = n7;
                    ((xm2_0)object2).g = n8;
                    ((xm2_0)object2).j = null;
                    ((xm2_0)object2).n = null;
                    ((xm2_0)object2).o = null;
                    ((xm2_0)object2).q = n3 = -1;
                    ((xm2_0)object2).r = n3;
                    n3 = 0;
                    string2 = null;
                    ((xm2_0)object2).p = l2 = f60.i(0, 0, 0, 0);
                    ((xm2_0)object2).l = l2 = dj1.a(0, 0);
                    ((xm2_0)object2).k = false;
                    object3 = Unit.a;
                }
            }
        } else {
            xm2_0 xm2_02;
            object2 = ((wm3)object).n;
            wm3$a wm3$a = new wm3$a((String)object2, string2);
            xm3 xm33 = ((wm3)object).o;
            RU0$a rU0$a = ((wm3)object).p;
            int n10 = ((wm3)object).q;
            boolean bl4 = ((wm3)object).r;
            int n14 = ((wm3)object).s;
            int n15 = ((wm3)object).t;
            object2 = xm2_02;
            xm2_02 = new xm2_0(string2, xm33, rU0$a, n10, bl4, n14, n15);
            object2 = ((wm3)object).s1().i;
            xm2_02.c((Vo0)object2);
            wm3$a.d = xm2_02;
            ((wm3)object).y = wm3$a;
        }
        wm3.r1((wm3)object);
        return Boolean.TRUE;
    }
}

