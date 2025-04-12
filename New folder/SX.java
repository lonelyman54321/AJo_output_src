/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 */
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public final class SX {
    public static final SX$a f;
    public final int[] a;
    public final int[] b;
    public final ArrayList c;
    public final om2$b[] d;
    public final float[] e;

    static {
        SX$a sX$a;
        f = sX$a = new Object();
    }

    public SX(int[] nArray, om2$b[] om2$bArray) {
        int n3;
        om2$b om2$b;
        int[] nArray2;
        float[] fArray;
        int n4;
        om2$b[] om2$bArray2;
        int n7;
        int n8;
        int n10;
        int n14;
        SX sX = this;
        Object object = nArray;
        int n15 = 5;
        int n16 = 1;
        Object object2 = new float[3];
        this.e = object2;
        object2 = om2$bArray;
        this.d = om2$bArray;
        int n17 = 32768;
        Object object3 = new int[n17];
        this.b = object3;
        int n18 = 0;
        float f5 = 0.0f;
        om2$b[] om2$bArray3 = null;
        int n19 = 0;
        float f6 = 0.0f;
        Object object4 = null;
        while (true) {
            n14 = ((int[])object).length;
            n10 = 8;
            if (n19 >= n14) break;
            n14 = object[n19];
            n8 = SX.b(Color.red((int)n14), n10, n15);
            n7 = SX.b(Color.green((int)n14), n10, n15);
            n14 = SX.b(Color.blue((int)n14), n10, n15);
            n10 = n8 << 10;
            n8 = n7 << 5;
            object[n19] = n14 |= (n10 |= n8);
            object3[n14] = n10 = object3[n14] + n16;
            n19 += n16;
        }
        object = null;
        n19 = 0;
        f6 = 0.0f;
        object4 = null;
        for (int i3 = 0; i3 < n17; i3 += n16) {
            n14 = object3[i3];
            if (n14 > 0) {
                n14 = i3 >> 10 & 0x1F;
                n8 = i3 >> 5 & 0x1F;
                n7 = i3 & 0x1F;
                n14 = SX.b(n14, n15, n10);
                n8 = SX.b(n8, n15, n10);
                n7 = SX.b(n7, n15, n10);
                n14 = Color.rgb((int)n14, (int)n8, (int)n7);
                om2$bArray2 = hZ.a;
                n8 = Color.red((int)n14);
                n7 = Color.green((int)n14);
                n4 = Color.blue((int)n14);
                fArray = sX.e;
                hZ.a(fArray, n8, n7, n4);
                om2$bArray2 = sX.d;
                if (om2$bArray2 != null && (n7 = om2$bArray2.length) > 0) {
                    n7 = om2$bArray2.length;
                    nArray2 = null;
                    for (n4 = 0; n4 < n7; n4 += n16) {
                        om2$b = om2$bArray2[n4];
                        n3 = om2$b.a(n14, fArray) ? 1 : 0;
                        if (n3 != 0) continue;
                        object3[i3] = 0;
                        break;
                    }
                }
            }
            if ((n14 = object3[i3]) <= 0) continue;
            n19 += n16;
        }
        object = new int[n19];
        sX.a = object;
        float f7 = 0.0f;
        Object object5 = null;
        n8 = 0;
        om2$bArray2 = null;
        for (n14 = 0; n14 < n17; n14 += n16) {
            n7 = object3[n14];
            if (n7 <= 0) continue;
            n7 = n8 + 1;
            object[n8] = n14;
            n8 = n7;
        }
        n17 = 16;
        if (n19 <= n17) {
            object2 = new ArrayList;
            sX.c = object2;
            while (n18 < n19) {
                n17 = object[n18];
                object5 = sX.c;
                n7 = n17 >> 10 & 0x1F;
                n4 = n17 >> 5 & 0x1F;
                int n20 = n17 & 0x1F;
                n7 = SX.b(n7, n15, n10);
                n4 = SX.b(n4, n15, n10);
                n20 = SX.b(n20, n15, n10);
                n7 = Color.rgb((int)n7, (int)n4, (int)n20);
                n17 = object3[n17];
                super(n7, n17);
                ((ArrayList)object5).add(om2$bArray2);
                n18 += n16;
            }
        } else {
            Object object6;
            Object object7;
            int n21;
            int n22;
            object = new PriorityQueue;
            object3 = f;
            super(n17, object3);
            object3 = new SX$b;
            object4 = sX.a;
            n19 = ((int[])object4).length - n16;
            super(sX, 0, n19);
            ((PriorityQueue)object).offer(object3);
            while ((n22 = ((PriorityQueue)object).size()) < n17 && (object3 = (Object)((SX$b)((PriorityQueue)object).poll())) != null) {
                n19 = ((SX$b)object3).b;
                n14 = n19 + 1;
                n8 = ((SX$b)object3).a;
                if ((n14 -= n8) <= n16) break;
                n14 = n19 + 1 - n8;
                if (n14 > n16) {
                    n14 = ((SX$b)object3).e;
                    n7 = ((SX$b)object3).d;
                    n14 -= n7;
                    n7 = ((SX$b)object3).g;
                    n4 = ((SX$b)object3).f;
                    n7 -= n4;
                    n4 = ((SX$b)object3).i;
                    n21 = ((SX$b)object3).h;
                    if (n14 >= n7 && n14 >= (n4 -= n21)) {
                        n14 = -3;
                        f7 = 0.0f / 0.0f;
                    } else if (n7 >= n14 && n7 >= n4) {
                        n14 = -2;
                        f7 = 0.0f / 0.0f;
                    } else {
                        n14 = -1;
                        f7 = 0.0f / 0.0f;
                    }
                    object7 = ((SX$b)object3).j;
                    nArray2 = ((SX)object7).a;
                    SX.a(n14, n8, n19, nArray2);
                    n19 = ((SX$b)object3).b + n16;
                    Arrays.sort(nArray2, n8, n19);
                    n19 = ((SX$b)object3).b;
                    SX.a(n14, n8, n19, nArray2);
                    n19 = ((SX$b)object3).c / 2;
                    n21 = 0;
                    fArray = null;
                    for (n14 = n8; n14 <= (n3 = ((SX$b)object3).b); n14 += n16) {
                        object2 = ((SX)object7).b;
                        object6 = nArray2[n14];
                        n17 = (int)object2[object6];
                        if ((n21 += n17) >= n19) {
                            n8 = Math.min(n3 -= n16, n14);
                            break;
                        }
                        n17 = 16;
                    }
                    n19 = n8 + 1;
                    n14 = ((SX$b)object3).b;
                    super((SX)object7, n19, n14);
                    ((SX$b)object3).b = n8;
                    ((SX$b)object3).a();
                    ((PriorityQueue)object).offer(object2);
                    ((PriorityQueue)object).offer(object3);
                    n17 = 16;
                    continue;
                }
                object = new IllegalStateException("Can not split a box with only 1 color");
                throw object;
            }
            object2 = new ArrayList;
            n22 = ((PriorityQueue)object).size();
            super(n22);
            object = ((PriorityQueue)object).iterator();
            while ((n22 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object3 = (SX$b)object.next();
                object4 = ((SX$b)object3).j;
                object5 = object4.a;
                n7 = 0;
                object7 = null;
                n4 = 0;
                nArray2 = null;
                n21 = 0;
                fArray = null;
                n3 = 0;
                om2$b = null;
                for (n8 = ((SX$b)object3).a; n8 <= (object6 = ((SX$b)object3).b); n8 += n16) {
                    object6 = object5[n8];
                    n18 = object4.b[object6];
                    n4 += n18;
                    n7 = (object6 >> 10 & 0x1F) * n18 + n7;
                    int n24 = (object6 >> 5 & 0x1F) * n18;
                    n21 = n24 + n21;
                    n3 += (n18 *= (object6 &= 0x1F));
                    n18 = 0;
                    f5 = 0.0f;
                    om2$bArray3 = null;
                }
                float f8 = n7;
                f5 = n4;
                n22 = Math.round(f8 /= f5);
                f6 = (float)n21 / f5;
                n19 = Math.round(f6);
                f7 = (float)n3 / f5;
                n18 = Math.round(f7);
                n22 = SX.b(n22, n15, n10);
                n19 = SX.b(n19, n15, n10);
                n18 = SX.b(n18, n15, n10);
                n22 = Color.rgb((int)n22, (int)n19, (int)n18);
                object5 = new om2$c(n22, n4);
                object3 = ((om2$c)object5).b();
                om2$bArray3 = sX.d;
                if (om2$bArray3 != null && (n19 = om2$bArray3.length) > 0) {
                    n19 = om2$bArray3.length;
                    om2$bArray2 = null;
                    for (n8 = 0; n8 < n19; n8 += n16) {
                        object7 = om2$bArray3[n8];
                        n4 = ((om2$c)object5).d;
                        n7 = object7.a(n4, (float[])object3) ? 1 : 0;
                        if (n7 != 0) {
                            continue;
                        }
                        break;
                    }
                } else {
                    object2.add(object5);
                }
                n18 = 0;
                f5 = 0.0f;
                om2$bArray3 = null;
            }
            sX.c = object2;
        }
    }

    public static void a(int n3, int n4, int n7, int[] nArray) {
        block3: {
            int n8;
            block2: {
                n8 = -2;
                if (n3 == n8) break block2;
                n8 = -1;
                if (n3 != n8) break block3;
                while (n4 <= n7) {
                    n3 = nArray[n4];
                    n8 = (n3 & 0x1F) << 10;
                    int n10 = (n3 >> 5 & 0x1F) << 5;
                    nArray[n4] = n3 = n3 >> 10 & 0x1F | (n8 |= n10);
                    ++n4;
                }
                break block3;
            }
            while (n4 <= n7) {
                n3 = nArray[n4];
                n8 = (n3 >> 5 & 0x1F) << 10;
                int n14 = (n3 >> 10 & 0x1F) << 5;
                nArray[n4] = n3 = n3 & 0x1F | (n8 |= n14);
                ++n4;
            }
        }
    }

    public static int b(int n3, int n4, int n7) {
        if (n7 > n4) {
            n4 = n7 - n4;
            n3 <<= n4;
        } else {
            n3 >>= (n4 -= n7);
        }
        n4 = 1;
        n7 = (n4 << n7) - n4;
        return n3 & n7;
    }
}

