/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
import android.util.SparseArray;

/*
 * Renamed from Wf3
 */
public final class wf3_1
implements gi0_0 {
    public final gi0_0 a;
    public final vf3$a_0 b;
    public final SparseArray c;

    public wf3_1(gi0_0 gi0_02, vf3$a_0 vf3$a_0) {
        this.a = gi0_02;
        this.b = vf3$a_0;
        this.c = gi0_02;
    }

    public final void h(dx2_1 dx2_12) {
        this.a.h(dx2_12);
    }

    public final void j() {
        this.a.j();
    }

    public final wp3 n(int n3, int n4) {
        int n7 = 3;
        Object object = this.a;
        if (n4 != n7) {
            return object.n(n3, n4);
        }
        SparseArray sparseArray = this.c;
        yf3_2 yf3_22 = (yf3_2)sparseArray.get(n3);
        if (yf3_22 != null) {
            return yf3_22;
        }
        wp3 wp32 = object.n(n3, n4);
        object = this.b;
        yf3_22 = new yf3_2(wp32, (vf3$a_0)object);
        sparseArray.put(n3, (Object)yf3_22);
        return yf3_22;
    }
}

