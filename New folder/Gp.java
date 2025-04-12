/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class Gp
implements Mp$a {
    public int a = 0;
    public final mp_0 b;
    public final SI c;
    public int d;
    public int[] e;
    public int[] f;
    public float[] g;
    public int h;
    public int i;
    public boolean j;

    public Gp(mp_0 mp_02, SI sI) {
        int n3;
        this.d = n3 = 8;
        int[] nArray = new int[n3];
        this.e = nArray;
        nArray = new int[n3];
        this.f = nArray;
        float[] fArray = new float[n3];
        this.g = fArray;
        this.h = n3 = -1;
        this.i = n3;
        this.j = false;
        this.b = mp_02;
        this.c = sI;
    }

    public final boolean a(k93_0 k93_02) {
        int n3;
        int n4 = this.h;
        int n7 = -1;
        if (n4 == n7) {
            return false;
        }
        for (int i3 = 0; n4 != n7 && i3 < (n3 = this.a); ++i3) {
            int[] nArray = this.e;
            n3 = nArray[n4];
            int n8 = k93_02.b;
            if (n3 == n8) {
                return true;
            }
            nArray = this.f;
            n4 = nArray[n4];
        }
        return false;
    }

    public final k93_0 b(int n3) {
        int n4;
        int n7 = this.h;
        for (int i3 = 0; n7 != (n4 = -1) && i3 < (n4 = this.a); ++i3) {
            if (i3 == n3) {
                k93_0[] k93_0Array = this.c.c;
                n7 = this.e[n7];
                return k93_0Array[n7];
            }
            int[] nArray = this.f;
            n7 = nArray[n7];
        }
        return null;
    }

    public final void c() {
        int n3;
        int n4 = this.h;
        for (int i3 = 0; n4 != (n3 = -1) && i3 < (n3 = this.a); ++i3) {
            Object[] objectArray = this.g;
            float f5 = objectArray[n4];
            float f6 = -1.0f;
            objectArray[n4] = f5 *= f6;
            objectArray = this.f;
            n4 = (int)objectArray[n4];
        }
    }

    public final void clear() {
        int n3;
        int n4;
        Object object = this.h;
        for (int i3 = 0; object != (n4 = -1) && i3 < (n3 = this.a); ++i3) {
            Object object2 = this.c.c;
            Object object3 = this.e;
            n3 = object3[object];
            if ((object2 = object2[n3]) != null) {
                object3 = this.b;
                ((k93_0)object2).b((mp_0)object3);
            }
            object2 = this.f;
            object = object2[object];
        }
        this.h = n4;
        this.i = n4;
        this.j = false;
        this.a = 0;
    }

    public final float d(mp_0 object, boolean bl2) {
        k93_0 k93_02 = ((mp_0)object).a;
        float f5 = this.e(k93_02);
        k93_0 k93_03 = ((mp_0)object).a;
        this.i(k93_03, bl2);
        object = ((mp_0)object).d;
        int n3 = object.f();
        for (int i3 = 0; i3 < n3; ++i3) {
            k93_0 k93_04 = object.b(i3);
            float f6 = object.e(k93_04) * f5;
            this.g(k93_04, f6, bl2);
        }
        return f5;
    }

    public final float e(k93_0 k93_02) {
        int n3;
        int n4 = this.h;
        for (int i3 = 0; n4 != (n3 = -1) && i3 < (n3 = this.a); ++i3) {
            int[] nArray = this.e;
            n3 = nArray[n4];
            int n7 = k93_02.b;
            if (n3 == n7) {
                return this.g[n4];
            }
            nArray = this.f;
            n4 = nArray[n4];
        }
        return 0.0f;
    }

    public final int f() {
        return this.a;
    }

    public final void g(k93_0 k93_02, float f5, boolean n3) {
        int n4;
        int n7;
        int[] nArray;
        Object[] objectArray;
        Object[] objectArray2;
        int n8;
        int n10 = 981668463;
        float f6 = 0.001f;
        int n14 = -1165815185;
        float f7 = -0.001f;
        float f8 = f5 - f7;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object > 0 && (object = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1)) < 0) {
            return;
        }
        object = this.h;
        int n15 = 1;
        mp_0 mp_02 = this.b;
        float[] fArray = null;
        int n16 = -1;
        float f11 = 0.0f / 0.0f;
        if (object == n16) {
            int n17;
            int n18;
            this.h = 0;
            float[] fArray2 = this.g;
            fArray2[0] = f5;
            int[] nArray2 = this.e;
            n3 = k93_02.b;
            nArray2[0] = n3;
            nArray2 = this.f;
            nArray2[0] = n16;
            k93_02.l = n18 = k93_02.l + n15;
            k93_02.a(mp_02);
            this.a = n17 = this.a + n15;
            n17 = (int)(this.j ? 1 : 0);
            if (n17 == 0) {
                this.i = n17 = this.i + n15;
                nArray2 = this.e;
                n3 = nArray2.length;
                if (n17 >= n3) {
                    this.j = n15;
                    this.i = n17 = nArray2.length - n15;
                }
            }
            return;
        }
        int n19 = -1;
        for (int i3 = 0; object != n16 && i3 < (n8 = this.a); ++i3) {
            int[] nArray3 = this.e;
            n8 = nArray3[object];
            int n20 = k93_02.b;
            if (n8 == n20) {
                fArray = this.g;
                f11 = fArray[object] + f5;
                Object object2 = 0;
                f5 = 0.0f;
                int[] nArray4 = null;
                n14 = (int)(f11 == f7 ? 0 : (f11 > f7 ? 1 : -1));
                if (n14 > 0 && (n10 = (int)(f11 == f6 ? 0 : (f11 < f6 ? -1 : 1))) < 0) {
                    n16 = 0;
                    f11 = 0.0f;
                }
                fArray[object] = f11;
                float f12 = f11 - 0.0f;
                object2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                if (object2 == 0) {
                    int n21;
                    object2 = this.h;
                    if (object == object2) {
                        nArray4 = this.f;
                        this.h = object2 = nArray4[object];
                    } else {
                        nArray4 = this.f;
                        nArray4[n19] = n10 = nArray4[object];
                    }
                    if (n3 != 0) {
                        k93_02.b(mp_02);
                    }
                    if ((object2 = (Object)this.j) != 0) {
                        this.i = (int)object;
                    }
                    k93_02.l = object2 = k93_02.l - n15;
                    this.a = n21 = this.a - n15;
                }
                return;
            }
            if (n8 < n20) {
                n19 = (int)object;
            }
            nArray3 = this.f;
            object = nArray3[object];
        }
        n3 = this.i;
        n10 = n3 + 1;
        n14 = (int)(this.j ? 1 : 0);
        if (n14 != 0) {
            objectArray2 = this.e;
            n14 = objectArray2[n3];
            if (n14 != n16) {
                n3 = objectArray2.length;
            }
        } else {
            n3 = n10;
        }
        objectArray2 = this.e;
        n14 = objectArray2.length;
        if (n3 >= n14 && (n14 = this.a) < (n10 = objectArray2.length)) {
            f6 = 0.0f;
            objectArray2 = null;
            for (n10 = 0; n10 < (object = (Object)(objectArray = this.e).length); ++n10) {
                n14 = objectArray[n10];
                if (n14 != n16) continue;
                n3 = n10;
                break;
            }
        }
        if (n3 >= (n14 = (objectArray2 = this.e).length)) {
            n3 = objectArray2.length;
            this.d = n10 = this.d * 2;
            this.j = false;
            this.i = n14 = n3 + -1;
            objectArray = this.g;
            objectArray2 = Arrays.copyOf((float[])objectArray, n10);
            this.g = objectArray2;
            objectArray2 = this.e;
            n14 = this.d;
            this.e = objectArray2 = Arrays.copyOf(objectArray2, n14);
            objectArray2 = this.f;
            n14 = this.d;
            objectArray2 = Arrays.copyOf(objectArray2, n14);
            this.f = objectArray2;
        }
        objectArray2 = this.e;
        objectArray2[n3] = n14 = k93_02.b;
        objectArray2 = this.g;
        objectArray2[n3] = (int)f5;
        if (n19 != n16) {
            nArray = this.f;
            nArray[n3] = n10 = nArray[n19];
            nArray[n19] = n3;
        } else {
            nArray = this.f;
            nArray[n3] = n10 = this.h;
            this.h = n3;
        }
        k93_02.l = n7 = k93_02.l + n15;
        k93_02.a(mp_02);
        this.a = n4 = this.a + n15;
        n4 = (int)(this.j ? 1 : 0);
        if (n4 == 0) {
            this.i = n4 = this.i + n15;
        }
        if ((n4 = this.i) >= (n3 = (nArray = this.e).length)) {
            this.j = n15;
            this.i = n4 = nArray.length - n15;
        }
    }

    public final float h(int n3) {
        int n4;
        int n7 = this.h;
        for (int i3 = 0; n7 != (n4 = -1) && i3 < (n4 = this.a); ++i3) {
            if (i3 == n3) {
                return this.g[n7];
            }
            int[] nArray = this.f;
            n7 = nArray[n7];
        }
        return 0.0f;
    }

    public final float i(k93_0 object, boolean bl2) {
        int n3;
        int n4 = this.h;
        int n7 = 0;
        int[] nArray = null;
        int n8 = -1;
        if (n4 == n8) {
            return 0.0f;
        }
        int n10 = -1;
        for (int i3 = 0; n4 != n8 && i3 < (n3 = this.a); ++i3) {
            int[] nArray2 = this.e;
            n3 = nArray2[n4];
            int n14 = ((k93_0)object).b;
            if (n3 == n14) {
                int n15;
                int n16;
                n7 = this.h;
                if (n4 == n7) {
                    nArray = this.f;
                    this.h = n7 = nArray[n4];
                } else {
                    nArray = this.f;
                    nArray[n10] = i3 = nArray[n4];
                }
                if (bl2) {
                    mp_0 mp_02 = this.b;
                    ((k93_0)object).b(mp_02);
                }
                ((k93_0)object).l = n16 = ((k93_0)object).l + -1;
                this.a = n15 = this.a + -1;
                object = this.e;
                object[n4] = n8;
                n15 = (int)(this.j ? 1 : 0);
                if (n15 != 0) {
                    this.i = n4;
                }
                return this.g[n4];
            }
            int[] nArray3 = this.f;
            n10 = nArray3[n4];
            int n17 = n10;
            n10 = n4;
            n4 = n17;
        }
        return 0.0f;
    }

    public final void j(float f5) {
        int n3;
        int n4 = this.h;
        for (int i3 = 0; n4 != (n3 = -1) && i3 < (n3 = this.a); ++i3) {
            float f6;
            Object[] objectArray = this.g;
            objectArray[n4] = f6 = objectArray[n4] / f5;
            objectArray = this.f;
            n4 = (int)objectArray[n4];
        }
    }

    public final void k(k93_0 k93_02, float f5) {
        int n3;
        int n4;
        int[] nArray;
        int n7;
        int[] nArray2;
        int n8;
        int n10;
        float[] fArray = null;
        int n14 = 1;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object == false) {
            this.i(k93_02, n14 != 0);
            return;
        }
        object = this.h;
        mp_0 mp_02 = this.b;
        int n15 = 0;
        Object[] objectArray = null;
        int n16 = -1;
        if (object == n16) {
            int n17;
            int n18;
            this.h = 0;
            fArray = this.g;
            fArray[0] = f5;
            int[] nArray3 = this.e;
            object = k93_02.b;
            nArray3[0] = (int)object;
            nArray3 = this.f;
            nArray3[0] = n16;
            k93_02.l = n18 = k93_02.l + n14;
            k93_02.a(mp_02);
            this.a = n17 = this.a + n14;
            n17 = (int)(this.j ? 1 : 0);
            if (n17 == 0) {
                this.i = n17 = this.i + n14;
                nArray3 = this.e;
                object = nArray3.length;
                if (n17 >= object) {
                    this.j = n14;
                    this.i = n17 = nArray3.length - n14;
                }
            }
            return;
        }
        int[] nArray4 = null;
        int n19 = -1;
        for (n10 = 0; object != n16 && n10 < (n8 = this.a); ++n10) {
            nArray2 = this.e;
            n8 = nArray2[object];
            n7 = k93_02.b;
            if (n8 == n7) {
                this.g[object] = f5;
                return;
            }
            if (n8 < n7) {
                n19 = (int)object;
            }
            nArray2 = this.f;
            object = nArray2[object];
        }
        object = this.i;
        n10 = (int)(object + true);
        n8 = (int)(this.j ? 1 : 0);
        if (n8 != 0) {
            nArray4 = this.e;
            n8 = nArray4[object];
            if (n8 != n16) {
                object = nArray4.length;
            }
        } else {
            object = n10;
        }
        nArray4 = this.e;
        n8 = nArray4.length;
        if (object >= n8 && (n8 = this.a) < (n10 = nArray4.length)) {
            nArray4 = null;
            for (n10 = 0; n10 < (n7 = (nArray2 = this.e).length); ++n10) {
                n8 = nArray2[n10];
                if (n8 != n16) continue;
                object = n10;
                break;
            }
        }
        if (object >= (n8 = (nArray4 = this.e).length)) {
            object = nArray4.length;
            this.d = n10 = this.d * 2;
            this.j = false;
            this.i = n15 = object + -1;
            objectArray = Arrays.copyOf(this.g, n10);
            this.g = objectArray;
            objectArray = this.e;
            n10 = this.d;
            this.e = objectArray = Arrays.copyOf(objectArray, n10);
            objectArray = this.f;
            n10 = this.d;
            objectArray = Arrays.copyOf(objectArray, n10);
            this.f = objectArray;
        }
        objectArray = this.e;
        objectArray[object] = n10 = k93_02.b;
        objectArray = this.g;
        objectArray[object] = (int)f5;
        if (n19 != n16) {
            nArray = this.f;
            nArray[object] = n15 = nArray[n19];
            nArray[n19] = (int)object;
        } else {
            nArray = this.f;
            nArray[object] = n15 = this.h;
            this.h = (int)object;
        }
        k93_02.l = n4 = k93_02.l + n14;
        k93_02.a(mp_02);
        this.a = n3 = this.a + n14;
        n4 = (int)(this.j ? 1 : 0);
        if (n4 == 0) {
            this.i = n4 = this.i + n14;
        }
        if (n3 >= (object = (Object)(nArray = this.e).length)) {
            this.j = n14;
        }
        if ((n3 = this.i) >= (object = (Object)nArray.length)) {
            this.j = n14;
            this.i = n3 = nArray.length - n14;
        }
    }

    public final String toString() {
        Object object = this.h;
        CharSequence charSequence = "";
        int n3 = 0;
        while (true) {
            int n4 = -1;
            float f5 = 0.0f / 0.0f;
            if (object == n4 || n3 >= (n4 = this.a)) break;
            charSequence = Ex0.a(Ft2.a((String)charSequence, " -> "));
            f5 = this.g[object];
            ((StringBuilder)charSequence).append(f5);
            ((StringBuilder)charSequence).append(" : ");
            charSequence = Ex0.a(((StringBuilder)charSequence).toString());
            Object object2 = this.c.c;
            int[] nArray = this.e;
            int n7 = nArray[object];
            object2 = object2[n7];
            ((StringBuilder)charSequence).append(object2);
            charSequence = ((StringBuilder)charSequence).toString();
            object2 = this.f;
            object = object2[object];
            ++n3;
        }
        return charSequence;
    }
}

