/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class F41
extends Y50
implements C41 {
    public Y50[] x0;
    public int y0;

    public F41() {
        Y50[] y50Array = new Y50[4];
        this.x0 = y50Array;
        this.y0 = 0;
    }

    public final void Z(int n3, VF3 vF3, ArrayList arrayList) {
        int n4;
        int n7;
        int n8 = 0;
        Y50 y50 = null;
        for (n7 = 0; n7 < (n4 = this.y0); ++n7) {
            ArrayList arrayList2 = vF3.a;
            Y50 y502 = this.x0[n7];
            boolean bl2 = arrayList2.contains(y502);
            if (bl2) continue;
            arrayList2.add(y502);
        }
        while (n8 < (n7 = this.y0)) {
            y50 = this.x0[n8];
            S11.a(y50, n3, arrayList, vF3);
            ++n8;
        }
    }

    public final void a(Y50 y50) {
        if (y50 != this && y50 != null) {
            Y50[] y50Array;
            int n3 = this.y0 + 1;
            Y50[] y50Array2 = this.x0;
            int n4 = y50Array2.length;
            if (n3 > n4) {
                n3 = y50Array2.length * 2;
                this.x0 = y50Array = Arrays.copyOf(y50Array2, n3);
            }
            y50Array = this.x0;
            int n7 = this.y0;
            y50Array[n7] = y50;
            this.y0 = ++n7;
        }
    }

    public final void b() {
        this.y0 = 0;
        Arrays.fill(this.x0, null);
    }

    public void c() {
    }

    public void k(Y50 y50, HashMap hashMap) {
        super.k(y50, hashMap);
        y50 = (F41)y50;
        this.y0 = 0;
        int n3 = ((F41)y50).y0;
        for (int i3 = 0; i3 < n3; ++i3) {
            Y50 y502 = ((F41)y50).x0[i3];
            y502 = (Y50)hashMap.get(y502);
            this.a(y502);
        }
    }
}

