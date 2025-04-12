/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

public final class LD {
    public final WR1 a;

    public LD() {
        WR1 wR1;
        Object[] objectArray = new G60$a[16];
        this.a = wR1 = new WR1(objectArray);
    }

    public final void a(CancellationException illegalStateException) {
        Object object = this.a;
        int n3 = ((WR1)object).c;
        bl_2[] bl_2Array = new bl_2[n3];
        int n4 = 0;
        bl_2 bl_22 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            bl_2 bl_23;
            bl_2Array[i3] = bl_23 = ((G60$a)((WR1)object).a[i3]).b;
        }
        while (n4 < n3) {
            bl_22 = bl_2Array[n4];
            bl_22.e(illegalStateException);
            ++n4;
        }
        boolean bl2 = ((WR1)object).k();
        if (bl2) {
            return;
        }
        object = "uncancelled requests present".toString();
        illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public final void b() {
        int n3 = 1;
        WR1 wR1 = this.a;
        int n4 = wR1.c - n3;
        int n7 = 0;
        IntRange intRange = new c(0, n4, n3);
        int n8 = intRange.b;
        if (n8 >= 0) {
            while (true) {
                bl_2 bl_22 = ((G60$a)wR1.a[n7]).b;
                Unit unit = Unit.a;
                bl_22.resumeWith(unit);
                if (n7 == n8) break;
                n7 += n3;
            }
        }
        wR1.g();
    }
}

