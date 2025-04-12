/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from i42
 */
public class i42_0 {
    public final WR1 a;

    public i42_0() {
        WR1 wR1;
        Object[] objectArray = new S32[16];
        this.a = wR1 = new WR1(objectArray);
    }

    public boolean a(pb1_0 pb1_02, zp1 zp12, zj1 zj12, boolean bl2) {
        Object[] objectArray = this.a;
        int n3 = objectArray.c;
        boolean bl3 = false;
        if (n3 > 0) {
            objectArray = objectArray.a;
            int n4 = 0;
            boolean bl4 = false;
            do {
                S32 s32;
                boolean bl5;
                if (!(bl5 = (s32 = (S32)objectArray[n4]).a(pb1_02, zp12, zj12, bl2)) && !bl4) {
                    bl4 = false;
                    continue;
                }
                bl4 = true;
            } while (++n4 < n3);
            bl3 = bl4;
        }
        return bl3;
    }

    public void b(zj1 object) {
        int n3;
        object = this.a;
        for (int i3 = ((WR1)object).c + -1; (n3 = -1) < i3; i3 += -1) {
            Zv2 zv2 = ((S32)((WR1)object).a[i3]).c;
            n3 = zv2.a;
            if (n3 != 0) continue;
            ((WR1)object).n(i3);
        }
    }

    public final void c() {
        int n3 = 0;
        while (true) {
            WR1 wR1 = this.a;
            int n4 = wR1.c;
            if (n3 >= n4) break;
            S32 s32 = (S32)wR1.a[n3];
            LP1$c lP1$c = s32.b;
            boolean bl2 = lP1$c.m;
            if (!bl2) {
                s32.d();
                wR1.n(n3);
                continue;
            }
            ++n3;
            s32.c();
        }
    }
}

