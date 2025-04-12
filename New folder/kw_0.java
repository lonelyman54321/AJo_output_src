/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import java.util.Arrays;

/*
 * Renamed from Kw
 */
public abstract class kw_0
implements DF0 {
    public final qp3 a;
    public final int b;
    public final int[] c;
    public final d[] d;
    public int e;

    public kw_0(qp3 objectArray, int[] object) {
        int n3;
        int n4;
        d[] dArray;
        Object object2;
        int n7;
        Object object3;
        int n8 = ((int[])object).length;
        if (n8 > 0) {
            n8 = 1;
        } else {
            n8 = 0;
            object3 = null;
        }
        ct3.f(n8 != 0);
        objectArray.getClass();
        this.a = objectArray;
        this.b = n8 = ((int[])object).length;
        object3 = new d[n8];
        this.d = object3;
        n8 = 0;
        object3 = null;
        while (true) {
            n7 = ((int[])object).length;
            object2 = objectArray.d;
            if (n8 >= n7) break;
            dArray = this.d;
            n4 = object[n8];
            dArray[n8] = object2 = object2[n4];
            ++n8;
        }
        objectArray = this.d;
        object = new Jw;
        Arrays.sort(objectArray, object);
        objectArray = new int[this.b];
        this.c = (int[])objectArray;
        objectArray = null;
        for (int i3 = 0; i3 < (n3 = this.b); ++i3) {
            block6: {
                object = this.c;
                object3 = this.d[i3];
                dArray = null;
                for (n7 = 0; n7 < (n4 = ((d[])object2).length); ++n7) {
                    d d2 = object2[n7];
                    if (object3 != d2) {
                        continue;
                    }
                    break block6;
                }
                n7 = -1;
            }
            object[i3] = n7;
        }
        objectArray = new long[n3];
    }

    public final d a(int n3) {
        return this.d[n3];
    }

    public final int b(int n3) {
        return this.c[n3];
    }

    public final int c(int n3) {
        int n4;
        for (int i3 = 0; i3 < (n4 = this.b); ++i3) {
            int[] nArray = this.c;
            n4 = nArray[i3];
            if (n4 != n3) continue;
            return i3;
        }
        return -1;
    }

    public final qp3 d() {
        return this.a;
    }

    public void e() {
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = this.getClass()) == (object2 = object.getClass())) {
            boolean bl3;
            object = (kw_0)object;
            object3 = this.a;
            object2 = ((kw_0)object).a;
            boolean bl4 = ((qp3)object3).equals(object2);
            if (!bl4 || !(bl3 = Arrays.equals((int[])(object3 = (Object)this.c), (int[])(object = (Object)((kw_0)object).c)))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public void f(float f5) {
    }

    public final /* synthetic */ void g() {
    }

    public final void h(boolean bl2) {
    }

    public final int hashCode() {
        int n3 = this.e;
        if (n3 == 0) {
            int n4;
            qp3 qp32 = this.a;
            n3 = System.identityHashCode(qp32) * 31;
            int[] nArray = this.c;
            this.e = n4 = Arrays.hashCode(nArray) + n3;
        }
        return this.e;
    }

    public void i() {
    }

    public final int j() {
        return this.c[0];
    }

    public final d k() {
        return this.d[0];
    }

    public final /* synthetic */ void l() {
    }

    public final int length() {
        return this.c.length;
    }
}

