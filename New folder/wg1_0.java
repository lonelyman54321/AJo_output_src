/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wg1
 */
public final class wg1_0
implements t20 {
    public final Xg1 a;
    public final Function0 b;

    public wg1_0(Xg1 xg1, Py2$a py2$a) {
        this.a = xg1;
        this.b = py2$a;
    }

    public static long b(Vg1$a object) {
        Gl gl = ((Vg1$a)object).e;
        Intrinsics.checkNotNull(gl, "null cannot be cast to non-null type androidx.compose.animation.core.InfiniteRepeatableSpec<T of androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock.getIterationDuration>");
        gl = (Ug1)gl;
        xJ2 xJ22 = ((Ug1)gl).b;
        xJ2 xJ23 = xJ2.Reverse;
        int n3 = xJ22 == xJ23 ? 2 : 1;
        gl = ((Ug1)gl).a;
        object = ((Vg1$a)object).c;
        object = gl.b((Vs3)object);
        long l2 = object.c();
        long l3 = object.a() * n3;
        object = Sz3.a;
        return (l2 += l3) * 1000000L;
    }

    public final long a() {
        long l2 = this.c();
        long l3 = ((Number)this.b.invoke()).longValue();
        return Math.max(l2, l3);
    }

    public final long c() {
        Object object;
        long l2;
        Iterator iterator = this.a.a.a.f().iterator();
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            iterator = null;
        } else {
            boolean bl3;
            long l3 = wg1_0.b((Vg1$a)iterator.next());
            Object object2 = l3;
            while (bl3 = iterator.hasNext()) {
                l2 = wg1_0.b((Vg1$a)iterator.next());
                object = l2;
                int n3 = ((Long)object2).compareTo(object);
                if (n3 >= 0) continue;
                object2 = object;
            }
            iterator = object2;
        }
        long l4 = iterator != null ? (Long)((Object)iterator) : 0L;
        object = Sz3.a;
        l2 = 999999;
        l4 += l2;
        l2 = 1000000;
        return l4 / l2;
    }
}

