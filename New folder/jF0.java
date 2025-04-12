/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.g;
import androidx.media3.common.g$b;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.e$d;
import androidx.media3.exoplayer.g$d;
import androidx.media3.exoplayer.source.j$b;
import java.util.ArrayList;
import java.util.Arrays;

public final class jF0
implements Runnable {
    public final /* synthetic */ e a;
    public final /* synthetic */ g$d b;

    public /* synthetic */ jF0(e e2, g$d g$d) {
        this.a = e2;
        this.b = g$d;
    }

    public final void run() {
        e e2 = this.a;
        Object object = this.b;
        int n3 = e2.H;
        int n4 = ((g$d)object).c;
        e2.H = n3 -= n4;
        n4 = (int)(((g$d)object).d ? 1 : 0);
        int n7 = 1;
        if (n4 != 0) {
            e2.I = n4 = ((g$d)object).e;
            e2.J = n7;
        }
        if (n3 == 0) {
            Object object2;
            Object object3;
            int n8;
            long l2;
            Object object4 = ((g$d)object).b.a;
            Object object5 = e2.u0.a;
            n4 = (int)(((g)object5).q() ? 1 : 0);
            if (n4 == 0 && (n4 = (int)(((g)object4).q() ? 1 : 0)) != 0) {
                e2.v0 = n4 = -1;
                e2.w0 = l2 = 0L;
            }
            if ((n4 = (int)(((g)object4).q() ? 1 : 0)) == 0) {
                Object object6;
                object5 = object4;
                object5 = Arrays.asList(((au2_0)object4).j);
                int n10 = object5.size();
                if (n10 == (n8 = ((ArrayList)(object6 = e2.o)).size())) {
                    n10 = 1;
                } else {
                    n10 = 0;
                    object3 = null;
                }
                ct3.f(n10 != 0);
                object3 = null;
                for (n10 = 0; n10 < (n8 = object5.size()); ++n10) {
                    object6 = (e$d)e2.o.get(n10);
                    ((e$d)object6).c = object2 = (g)object5.get(n10);
                }
            }
            n4 = (int)(e2.J ? 1 : 0);
            long l3 = -9223372036854775807L;
            if (n4 != 0) {
                object5 = ((g$d)object).b.b;
                object2 = e2.u0.b;
                n4 = (int)(((j$b)object5).equals(object2) ? 1 : 0);
                if (n4 != 0) {
                    long l4 = ((g$d)object).b.d;
                    object5 = e2.u0;
                    long l7 = ((Mt2)object5).s;
                    long l8 = l4 - l7;
                    n4 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                    if (n4 == 0) {
                        n7 = 0;
                    }
                }
                if (n7 != 0) {
                    long l12;
                    n4 = (int)(((g)object4).q() ? 1 : 0);
                    if (n4 == 0 && (n4 = (int)(((j$b)(object5 = ((g$d)object).b.b)).b() ? 1 : 0)) == 0) {
                        object5 = ((g$d)object).b;
                        object3 = ((Mt2)object5).b;
                        l12 = ((Mt2)object5).d;
                        object5 = ((j$b)object3).a;
                        object3 = e2.n;
                        ((g)object4).h(object5, (g$b)object3);
                        long l14 = ((g$b)object3).e;
                        l12 += l14;
                    } else {
                        object4 = ((g$d)object).b;
                        l12 = ((Mt2)object4).d;
                    }
                    n4 = n7;
                    l3 = l12;
                } else {
                    n4 = n7;
                }
            } else {
                n4 = 0;
                object5 = null;
            }
            e2.J = false;
            object = ((g$d)object).b;
            n7 = e2.I;
            object2 = null;
            n3 = 1;
            int n14 = -1;
            l2 = l3;
            n8 = n14;
            e2.B((Mt2)object, n3, n4 != 0, n7, l3, n14, false);
        }
    }
}

