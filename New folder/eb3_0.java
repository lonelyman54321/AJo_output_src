/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eB3
 */
public final class eb3_0 {
    public static final void a(bB3 bB32, aw2_0 objectArray) {
        boolean bl2;
        int n3;
        Object object;
        bB3 bB33 = bB32;
        Object[] objectArray2 = objectArray;
        boolean bl3 = si0_2.a((aw2_0)objectArray);
        long l2 = 0L;
        ZA3 zA3 = bB32.b;
        ZA3 zA32 = bB32.a;
        if (bl3) {
            object = zA32.d;
            rp_1.o(null, (Object[])object);
            zA32.e = 0;
            object = zA3.d;
            rp_1.o(null, (Object[])object);
            zA3.e = 0;
            bB32.c = l2;
        }
        bl3 = si0_2.c((aw2_0)objectArray);
        long l3 = objectArray2.b;
        if (!bl3) {
            object = objectArray2.k;
            if (object == null) {
                object = mz0_2.a;
            }
            n3 = object.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                A61 a61 = (A61)object.get(i3);
                long l4 = a61.a;
                l2 = a61.c;
                float f5 = e72.d(l2);
                zA32.a(l4, f5);
                float f6 = e72.e(l2);
                zA3.a(l4, f6);
                l2 = 0L;
            }
            long l7 = objectArray2.l;
            float f7 = e72.d(l7);
            zA32.a(l3, f7);
            float f8 = e72.e(l7);
            zA3.a(l3, f8);
        }
        if (bl2 = si0_2.c((aw2_0)objectArray)) {
            long l8 = bB33.c;
            l2 = 40;
            long l12 = (l8 = l3 - l8) - l2;
            n3 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
            if (n3 > 0) {
                objectArray2 = zA32.d;
                rp_1.o(null, objectArray2);
                zA32.e = 0;
                objectArray2 = zA3.d;
                rp_1.o(null, objectArray2);
                zA3.e = 0;
                bB33.c = l8 = 0L;
            }
        }
        bB33.c = l3;
    }

    public static final float b(float[] fArray, float[] fArray2) {
        int n3 = fArray.length;
        float f5 = 0.0f;
        for (int i3 = 0; i3 < n3; ++i3) {
            float f6 = fArray[i3];
            float f7 = fArray2[i3];
            f5 += (f6 *= f7);
        }
        return f5;
    }

    public static final void c(float[] fArray, float[] fArray2, int n3, float[] fArray3) {
        int n4 = n3;
        if (n3 != 0) {
            float f5;
            float[] fArray4;
            int n7;
            float[] fArray5;
            float f6;
            float f7;
            int n8;
            Object object;
            float f8;
            int n10;
            int n14;
            int n15 = 2;
            if (n15 >= n3) {
                n15 = n3 + -1;
            }
            int n16 = n15 + 1;
            Object object2 = new float[n16][];
            float f11 = 0.0f;
            Object object3 = null;
            float[][] fArrayArray = null;
            for (n14 = 0; n14 < n16; ++n14) {
                float[] fArray6 = new float[n4];
                object2[n14] = fArray6;
            }
            n14 = 0;
            fArrayArray = null;
            while (true) {
                n10 = 1065353216;
                f8 = 1.0f;
                if (n14 >= n4) break;
                object = object2[0];
                object[n14] = f8;
                f8 = Float.MIN_VALUE;
                for (n10 = 1; n10 < n16; ++n10) {
                    n8 = n10 + -1;
                    object = object2[n8];
                    f7 = object[n14];
                    f6 = fArray[n14];
                    fArray5 = object2[n10];
                    fArray5[n14] = f7 *= f6;
                }
                ++n14;
            }
            fArrayArray = new float[n16][];
            f7 = 0.0f;
            object = null;
            for (n8 = 0; n8 < n16; ++n8) {
                fArray5 = new float[n4];
                fArrayArray[n8] = fArray5;
            }
            object = new float[n16][];
            f6 = 0.0f;
            fArray5 = null;
            for (n7 = 0; n7 < n16; ++n7) {
                fArray4 = new float[n16];
                object[n7] = (float)fArray4;
            }
            f6 = 0.0f;
            fArray5 = null;
            for (n7 = 0; n7 < n16; ++n7) {
                float f12;
                int n17;
                fArray4 = fArrayArray[n7];
                Object object4 = object2[n7];
                Intrinsics.checkNotNullParameter(object4, "<this>");
                Object object5 = "destination";
                Intrinsics.checkNotNullParameter(fArray4, (String)object5);
                System.arraycopy(object4, 0, fArray4, 0, n4);
                f5 = 0.0f;
                object4 = null;
                for (n17 = 0; n17 < n7; ++n17) {
                    object5 = fArrayArray[n17];
                    f12 = eb3_0.b(fArray4, (float[])object5);
                    for (int i3 = 0; i3 < n4; ++i3) {
                        float f14 = fArray4[i3];
                        reference var29_29 = object5[i3] * f12;
                        fArray4[i3] = f14 -= var29_29;
                    }
                }
                double d2 = Math.sqrt(eb3_0.b(fArray4, fArray4));
                f5 = (float)d2;
                int n18 = 897988541;
                float f15 = 1.0E-6f;
                float f14 = f5 - f15;
                Object object6 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                if (object6 < 0) {
                    n17 = 897988541;
                    f5 = 1.0E-6f;
                }
                f5 = f8 / f5;
                f15 = 0.0f;
                object5 = null;
                for (n18 = 0; n18 < n4; ++n18) {
                    fArray4[n18] = f12 = fArray4[n18] * f5;
                }
                object4 = object[n7];
                f15 = 0.0f;
                object5 = null;
                for (n18 = 0; n18 < n16; ++n18) {
                    float[] fArray7;
                    if (n18 < n7) {
                        object6 = false;
                        f12 = 0.0f;
                        fArray7 = null;
                    } else {
                        fArray7 = object2[n18];
                        f12 = eb3_0.b(fArray4, fArray7);
                    }
                    object4[n18] = f12;
                }
            }
            n4 = n15;
            while (true) {
                n16 = -1;
                float f17 = 0.0f / 0.0f;
                if (n16 >= n4) break;
                float[] fArray8 = fArrayArray[n4];
                object2 = fArray2;
                f17 = eb3_0.b(fArray8, fArray2);
                object3 = object[n4];
                n10 = n4 + 1;
                if (n10 <= n15) {
                    n7 = n15;
                    while (true) {
                        void var38_37 = object3[n7];
                        f5 = fArray3[n7];
                        f17 -= (var38_37 *= f5);
                        if (n7 == n10) break;
                        n7 += -1;
                    }
                }
                f11 = object3[n4];
                fArray3[n4] = f17 /= f11;
                n4 += -1;
            }
            return;
        }
        bh1_1.b("At least one point must be provided");
        throw null;
    }
}

