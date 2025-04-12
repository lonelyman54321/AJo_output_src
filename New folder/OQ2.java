/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class OQ2 {
    public wf3_0 a;
    public ArrayList b;

    public static long a(dp0 dp02, long l2) {
        wf3_0 wf3_02 = dp02.d;
        boolean bl2 = wf3_02 instanceof E41;
        if (bl2) {
            return l2;
        }
        Object object = dp02.k;
        int n3 = ((ArrayList)object).size();
        long l3 = l2;
        for (int i3 = 0; i3 < n3; ++i3) {
            Zo0 zo0 = (Zo0)((ArrayList)object).get(i3);
            int n4 = zo0 instanceof dp0;
            if (n4 == 0) continue;
            zo0 = (dp0)zo0;
            wf3_0 wf3_03 = ((dp0)zo0).d;
            if (wf3_03 == wf3_02) continue;
            n4 = ((dp0)zo0).f;
            long l4 = (long)n4 + l2;
            long l7 = OQ2.a((dp0)zo0, l4);
            l3 = Math.min(l3, l7);
        }
        object = wf3_02.i;
        if (dp02 == object) {
            long l8 = wf3_02.j();
            dp02 = wf3_02.h;
            long l12 = OQ2.a(dp02, l2 -= l8);
            l12 = Math.min(l3, l12);
            int n7 = dp02.f;
            long l14 = n7;
            l3 = Math.min(l12, l2 -= l14);
        }
        return l3;
    }

    public static long b(dp0 dp02, long l2) {
        wf3_0 wf3_02 = dp02.d;
        boolean bl2 = wf3_02 instanceof E41;
        if (bl2) {
            return l2;
        }
        Object object = dp02.k;
        int n3 = ((ArrayList)object).size();
        long l3 = l2;
        for (int i3 = 0; i3 < n3; ++i3) {
            Zo0 zo0 = (Zo0)((ArrayList)object).get(i3);
            int n4 = zo0 instanceof dp0;
            if (n4 == 0) continue;
            zo0 = (dp0)zo0;
            wf3_0 wf3_03 = ((dp0)zo0).d;
            if (wf3_03 == wf3_02) continue;
            n4 = ((dp0)zo0).f;
            long l4 = (long)n4 + l2;
            long l7 = OQ2.b((dp0)zo0, l4);
            l3 = Math.max(l3, l7);
        }
        object = wf3_02.h;
        if (dp02 == object) {
            long l8 = wf3_02.j();
            dp02 = wf3_02.i;
            long l12 = OQ2.b(dp02, l2 += l8);
            l12 = Math.max(l3, l12);
            int n7 = dp02.f;
            long l14 = n7;
            l3 = Math.max(l12, l2 -= l14);
        }
        return l3;
    }
}

