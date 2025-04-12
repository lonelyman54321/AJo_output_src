/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from k93
 */
public final class k93_0
implements Comparable {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public float e;
    public boolean f;
    public final float[] g;
    public final float[] h;
    public k93$a i;
    public mp_0[] j;
    public int k;
    public int l;

    public k93_0(k93$a k93$a) {
        int n3;
        this.b = n3 = -1;
        this.c = n3;
        this.d = 0;
        this.f = false;
        int n4 = 9;
        float[] fArray = new float[n4];
        this.g = fArray;
        Object[] objectArray = new float[n4];
        this.h = objectArray;
        objectArray = new mp_0[16];
        this.j = (mp_0[])objectArray;
        this.k = 0;
        this.l = 0;
        this.i = k93$a;
    }

    public final void a(mp_0 mp_02) {
        int n3;
        mp_0[] mp_0Array = null;
        for (int i3 = 0; i3 < (n3 = this.k); ++i3) {
            mp_0 mp_03 = this.j[i3];
            if (mp_03 != mp_02) continue;
            return;
        }
        mp_0Array = this.j;
        int n4 = mp_0Array.length;
        if (n3 >= n4) {
            n3 = mp_0Array.length * 2;
            this.j = mp_0Array = Arrays.copyOf(mp_0Array, n3);
        }
        mp_0Array = this.j;
        n3 = this.k;
        mp_0Array[n3] = mp_02;
        this.k = ++n3;
    }

    public final void b(mp_0 mp_0Array) {
        int n3 = this.k;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            mp_0 mp_02 = this.j[i3];
            if (mp_02 != mp_0Array) continue;
            while (i3 < (n4 = n3 + -1)) {
                mp_0 mp_03;
                mp_0Array = this.j;
                int n7 = i3 + 1;
                mp_0Array[i3] = mp_03 = mp_0Array[n7];
                i3 = n7;
            }
            this.k = n4 = this.k + -1;
            return;
        }
    }

    public final void c() {
        int n3;
        k93$a k93$a;
        this.i = k93$a = k93$a.UNKNOWN;
        k93$a = null;
        this.d = 0;
        this.b = n3 = -1;
        this.c = n3;
        n3 = 0;
        this.e = 0.0f;
        this.f = false;
        int n4 = this.k;
        for (int i3 = 0; i3 < n4; ++i3) {
            mp_0[] mp_0Array = this.j;
            mp_0Array[i3] = null;
        }
        this.k = 0;
        this.l = 0;
        this.a = false;
        Arrays.fill(this.h, 0.0f);
    }

    public final int compareTo(Object object) {
        object = (k93_0)object;
        int n3 = this.b;
        int n4 = ((k93_0)object).b;
        return n3 - n4;
    }

    public final void d(Eu1 eu1, float f5) {
        this.e = f5;
        f5 = Float.MIN_VALUE;
        this.f = true;
        int n3 = this.k;
        this.c = -1;
        for (int i3 = 0; i3 < n3; ++i3) {
            mp_0 mp_02 = this.j[i3];
            mp_02.h(eu1, this, false);
        }
        this.k = 0;
    }

    public final void e(Eu1 eu1, mp_0 mp_02) {
        int n3 = this.k;
        for (int i3 = 0; i3 < n3; ++i3) {
            mp_0 mp_03 = this.j[i3];
            mp_03.i(eu1, mp_02, false);
        }
        this.k = 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        int n3 = this.b;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

