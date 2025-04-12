/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 */
import android.graphics.Bitmap;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.a$a;
import com.clevertap.android.sdk.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from xZ0
 */
public final class xz0_0 {
    public int[] a;
    public final xZ0$a b;
    public byte[] c;
    public int d;
    public int e;
    public int f;
    public fz0_0 g;
    public boolean h;
    public int i;
    public byte[] j;
    public int[] k;
    public hz0_1 l;
    public final int[] m;
    public byte[] n;
    public short[] o;
    public Bitmap p;
    public ByteBuffer q;
    public int r;
    public boolean s;
    public int t;
    public byte[] u;
    public byte[] v;
    public int w;
    public int x;

    public xz0_0() {
        Object object;
        int[] nArray = new int[256];
        this.m = nArray;
        this.w = 0;
        this.x = 0;
        this.b = object;
        this.g = object = new fz0_0();
    }

    public final void a(int[] nArray, bz0_2 bz0_22, int n3) {
        int n4 = bz0_22.h;
        int n7 = this.r;
        n4 /= n7;
        int n8 = bz0_22.f / n7;
        int n10 = bz0_22.g / n7;
        int n14 = bz0_22.e / n7;
        n7 = this.e;
        n4 = n4 * n7 + n8;
        for (n8 = n8 * n7 + n14; n8 < n4; n8 += n14) {
            n14 = n8 + n10;
            for (n7 = n8; n7 < n14; ++n7) {
                nArray[n7] = n3;
            }
            n14 = this.e;
        }
    }

    public final Bitmap b() {
        boolean bl2 = this.h;
        Bitmap.Config config = bl2 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        int n3 = this.e;
        int n4 = this.d;
        ((b53)this.b).getClass();
        config = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
        config.setHasAlpha(true);
        return config;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bitmap c() {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                try {
                    bz0_2 bz0_22;
                    Object object;
                    int n3;
                    fz0_0 fz0_02 = this.g;
                    int n4 = fz0_02.d;
                    int n7 = 1;
                    if (n4 <= 0 || (n4 = this.f) < 0) {
                        com.clevertap.android.sdk.b.d();
                        this.t = n7;
                    }
                    n4 = this.t;
                    int n8 = 0;
                    if (n4 == n7 || n4 == (n3 = 2)) break block10;
                    n4 = 0;
                    fz0_02 = null;
                    this.t = 0;
                    Object object2 = this.g;
                    object2 = ((fz0_0)object2).e;
                    int n10 = this.f;
                    object2 = ((ArrayList)object2).get(n10);
                    object2 = (bz0_2)object2;
                    n10 = this.f - n7;
                    if (n10 >= 0) {
                        object = this.g;
                        object = ((fz0_0)object).e;
                        bz0_22 = (bz0_2)((ArrayList)object).get(n10);
                        bz0_22 = bz0_22;
                    } else {
                        n10 = 0;
                        bz0_22 = null;
                    }
                    object = ((bz0_2)object2).i;
                    if (object == null) {
                        object = this.g;
                        object = ((fz0_0)object).f;
                    }
                    this.a = (int[])object;
                    if (object == null) {
                        com.clevertap.android.sdk.b.d();
                        this.t = n7;
                        return null;
                    }
                    n7 = (int)(((bz0_2)object2).k ? 1 : 0);
                    if (n7 == 0) return this.i((bz0_2)object2, bz0_22);
                    int[] nArray = this.m;
                    n8 = ((Object)object).length;
                    System.arraycopy(object, 0, nArray, 0, n8);
                    nArray = this.m;
                    this.a = nArray;
                    n8 = ((bz0_2)object2).j;
                    nArray[n8] = 0;
                    return this.i((bz0_2)object2, bz0_22);
                }
                catch (Throwable throwable2) {}
            }
            com.clevertap.android.sdk.b.d();
            return null;
            throw throwable2;
        }
    }

    public final int d() {
        byte[] byArray;
        try {
            this.e();
            byArray = this.v;
        }
        catch (Exception exception) {
            this.t = 1;
            return 0;
        }
        int n3 = this.w;
        int n4 = n3 + 1;
        this.w = n4;
        return byArray[n3] & 0xFF;
    }

    public final void e() {
        int n3 = this.x;
        int n4 = this.w;
        if (n3 > n4) {
            return;
        }
        byte[] byArray = this.v;
        n4 = 16384;
        if (byArray == null) {
            ((b53)this.b).getClass();
            this.v = byArray = new byte[n4];
        }
        this.w = 0;
        this.x = n4 = Math.min(this.q.remaining(), n4);
        ByteBuffer byteBuffer = this.q;
        byte[] byArray2 = this.v;
        byteBuffer.get(byArray2, 0, n4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(fz0_0 fz0_02, ByteBuffer byteBuffer) {
        synchronized (this) {
            this.h(fz0_02, byteBuffer);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(fz0_0 fz0_02, byte[] object) {
        synchronized (this) {
            object = ByteBuffer.wrap(object);
            this.f(fz0_02, (ByteBuffer)object);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(fz0_0 object, ByteBuffer iterator) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                int n3;
                int n4 = 1;
                try {
                    int n7;
                    n3 = Integer.highestOneBit(n4);
                    int n8 = 0;
                    bz0_2 bz0_22 = null;
                    this.t = 0;
                    this.g = object;
                    this.h = false;
                    this.f = n7 = -1;
                    this.i = 0;
                    iterator = ((ByteBuffer)((Object)iterator)).asReadOnlyBuffer();
                    this.q = iterator;
                    ((ByteBuffer)((Object)iterator)).position(0);
                    iterator = this.q;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    ((ByteBuffer)((Object)iterator)).order(byteOrder);
                    this.s = false;
                    iterator = ((fz0_0)object).e;
                    iterator = ((ArrayList)((Object)iterator)).iterator();
                    while ((n8 = iterator.hasNext()) != 0) {
                        bz0_22 = (bz0_2)iterator.next();
                        bz0_22 = bz0_22;
                        n8 = bz0_22.c;
                        n7 = 3;
                        if (n8 != n7) continue;
                        this.s = n4;
                        break;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                this.r = n3;
                int n10 = ((fz0_0)object).l;
                this.e = n4 = n10 / n3;
                int n14 = ((fz0_0)object).i;
                this.d = n4 = n14 / n3;
                xZ0$a xZ0$a = this.b;
                xZ0$a = (b53)xZ0$a;
                xZ0$a.getClass();
                object = new byte[n10 *= n14];
                this.j = (byte[])object;
                object = this.b;
                n10 = this.e;
                n4 = this.d;
                {
                    object = (b53)object;
                    object.getClass();
                    object = new int[n10 *= n4];
                    this.k = (int[])object;
                    return;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Bitmap i(bz0_2 var1_1, bz0_2 var2_2) {
        block80: {
            block79: {
                block84: {
                    block83: {
                        block86: {
                            block85: {
                                var3_3 = this;
                                var4_4 = var1_1;
                                var5_5 /* !! */  = var2_2;
                                var6_6 = 2;
                                var7_7 = 255;
                                var8_8 = 1;
                                var9_9 = this.k;
                                var10_10 = 0;
                                if (var2_2 == null) {
                                    Arrays.fill(var9_9, 0);
                                }
                                var11_11 = 3;
                                if (var5_5 /* !! */  == null || (var12_12 = var5_5 /* !! */ .c) <= 0) break block83;
                                if (var12_12 != var6_6) break block84;
                                var12_12 = (int)var4_4.k;
                                if (var12_12 != 0) break block85;
                                var13_13 = var3_3.g;
                                var14_14 = var13_13.a;
                                var15_15 /* !! */  = var4_4.i;
                                if (var15_15 /* !! */  != null && (var12_12 = var13_13.b) == (var16_16 = var4_4.j)) lbl-1000:
                                // 3 sources

                                {
                                    while (true) {
                                        var14_14 = 0;
                                        var17_17 = 0.0f;
                                        var18_18 /* !! */  = null;
                                        ** GOTO lbl31
                                        break;
                                    }
                                }
                                break block86;
                            }
                            var12_12 = var3_3.f;
                            if (var12_12 != 0) ** GOTO lbl-1000
                            var3_3.h = var8_8;
                            ** while (true)
                        }
                        var3_3.a(var9_9, (bz0_2)var5_5 /* !! */ , var14_14);
                    }
lbl34:
                    // 3 sources

                    while (true) {
                        var19_19 = var9_9;
                        var20_20 /* !! */  = 3;
                        var21_21 = 0;
                        var22_22 = null;
                        break block79;
                        break;
                    }
                }
                if (var12_12 != var11_11) ** GOTO lbl34
                var13_13 = var3_3.p;
                if (var13_13 == null) {
                    var3_3.a(var9_9, (bz0_2)var5_5 /* !! */ , 0);
                    ** continue;
                }
                var14_14 = var5_5 /* !! */ .h;
                var16_16 = var3_3.r;
                var23_23 = var14_14 / var16_16;
                var24_24 = var5_5 /* !! */ .f / var16_16;
                var14_14 = var5_5 /* !! */ .g;
                var25_25 = var14_14 / var16_16;
                var26_26 = var5_5 /* !! */ .e / var16_16;
                var27_27 = var3_3.e;
                var16_16 = var24_24 * var27_27 + var26_26;
                var18_18 /* !! */  = (byte[])var9_9;
                var20_20 /* !! */  = 3;
                var11_11 = var24_24;
                var21_21 = 0;
                var22_22 = null;
                var10_10 = var25_25;
                var19_19 = var9_9;
                var28_28 = var23_23;
                var13_13.getPixels(var9_9, var16_16, var27_27, var26_26, var24_24, var25_25, var23_23);
            }
            var3_3.x = 0;
            var3_3.w = 0;
            var13_13 = var3_3.q;
            var14_14 = var4_4.a;
            var13_13.position(var14_14);
            var12_12 = var4_4.g;
            var14_14 = var4_4.h;
            var12_12 *= var14_14;
            var18_18 /* !! */  = var3_3.j;
            var15_15 /* !! */  = (int[])var3_3.b;
            if (var18_18 /* !! */  == null || (var14_14 = var18_18 /* !! */ .length) < var12_12) {
                var18_18 /* !! */  = (byte[])var15_15 /* !! */ ;
                ((b53)var15_15 /* !! */ ).getClass();
                var3_3.j = var18_18 /* !! */  = new byte[var12_12];
            }
            var18_18 /* !! */  = (byte[])var3_3.o;
            var27_27 = 4096;
            if (var18_18 /* !! */  == null) {
                var18_18 /* !! */  = (byte[])new short[var27_27];
                var3_3.o = var18_18 /* !! */ ;
            }
            if ((var18_18 /* !! */  = var3_3.u) == null) {
                var18_18 /* !! */  = new byte[var27_27];
                var3_3.u = var18_18 /* !! */ ;
            }
            if ((var18_18 /* !! */  = var3_3.n) == null) {
                var14_14 = 4097;
                var17_17 = 5.741E-42f;
                var18_18 /* !! */  = new byte[var14_14];
                var3_3.n = var18_18 /* !! */ ;
            }
            var14_14 = this.d();
            var26_26 = var8_8 << var14_14;
            var11_11 = var26_26 + 1;
            var10_10 = var26_26 + 2;
            var28_28 = (var8_8 << (var14_14 += var8_8)) - var8_8;
            for (var6_6 = 0; var6_6 < var26_26; var6_6 += var8_8) {
                var3_3.o[var6_6] = 0;
                var29_29 /* !! */  = var3_3.u;
                var29_29 /* !! */ [var6_6] = var30_30 = (int)var6_6;
                var27_27 = 4096;
            }
            var31_31 = var14_14;
            var32_32 = var10_10;
            var33_33 = var28_28;
            var6_6 = 0;
            var30_30 = 0;
            var34_34 /* !! */  = null;
            var27_27 = 0;
            var29_29 /* !! */  = null;
            var35_35 = 0;
            var36_36 = 0;
            var37_37 = 0;
            var38_38 = 0;
            var39_39 = 0;
            var40_40 = -1;
            block24: while (true) {
                block87: {
                    block81: {
                        block82: {
                            if (var6_6 >= var12_12) break block80;
                            if (var30_30 != 0) break block87;
                            var30_30 = this.d();
                            if (var30_30 <= 0) break block81;
                            var29_29 /* !! */  = var3_3.c;
                            if (var29_29 /* !! */  != null) ** GOTO lbl136
                            var29_29 /* !! */  = (byte[])var15_15 /* !! */ ;
                            var29_29 /* !! */  = (byte[])((b53)var15_15 /* !! */ );
                            var29_29 /* !! */ .getClass();
                            var29_29 /* !! */  = new byte[var7_7];
                            var3_3.c = var29_29 /* !! */ ;
lbl136:
                            // 2 sources

                            var27_27 = var3_3.x;
                            var7_7 = var3_3.w;
                            if ((var27_27 -= var7_7) < var30_30) ** GOTO lbl150
                            var29_29 /* !! */  = var3_3.v;
                            var5_5 /* !! */  = var3_3.c;
                            System.arraycopy(var29_29 /* !! */ , var7_7, var5_5 /* !! */ , 0, var30_30);
                            var20_20 /* !! */  = var3_3.w + var30_30;
                            var3_3.w = var20_20 /* !! */ ;
                            break block81;
lbl150:
                            // 1 sources

                            var5_5 /* !! */  = var3_3.q;
                            var20_20 /* !! */  = var5_5 /* !! */ .remaining() + var27_27;
                            if (var20_20 /* !! */  < var30_30) break block82;
                            var5_5 /* !! */  = var3_3.v;
                            var7_7 = var3_3.w;
                            var41_41 /* !! */  = var3_3.c;
                            System.arraycopy(var5_5 /* !! */ , var7_7, var41_41 /* !! */ , 0, var27_27);
                            var20_20 /* !! */  = var3_3.x;
                            var3_3.w = var20_20 /* !! */ ;
                            this.e();
                            var20_20 /* !! */  = var30_30 - var27_27;
                            var42_42 /* !! */  = var3_3.v;
                            var41_41 /* !! */  = var3_3.c;
                            System.arraycopy(var42_42 /* !! */ , 0, var41_41 /* !! */ , var27_27, var20_20 /* !! */ );
                            var7_7 = var3_3.w + var20_20 /* !! */ ;
                            var3_3.w = var7_7;
                        }
                        var20_20 /* !! */  = 1;
                        try {
                            var3_3.t = var20_20 /* !! */ ;
                        }
                        catch (Exception v0) {
                            var20_20 /* !! */  = com.clevertap.android.sdk.a.c;
                            var5_5 /* !! */  = a$a.INFO;
                            var5_5 /* !! */ .intValue();
                            var3_3.t = var20_20 /* !! */  = 1;
                        }
                    }
                    if (var30_30 <= 0) {
                        var3_3.t = var20_20 /* !! */  = 3;
                        break block80;
                    }
                    var27_27 = 0;
                    var29_29 /* !! */  = null;
                }
                var5_5 /* !! */  = var3_3.c;
                var20_20 /* !! */  = (var5_5 /* !! */ [var27_27] & 255) << var35_35;
                var36_36 += var20_20 /* !! */ ;
                ++var27_27;
                var30_30 = var30_30 + -1;
                var20_20 /* !! */  = var35_35 += 8;
                var7_7 = var38_38;
                var8_8 = var40_40;
                var21_21 = var32_32;
                var38_38 = var6_6;
                var6_6 = var31_31;
                while (true) {
                    block90: {
                        block89: {
                            block88: {
                                var40_40 = var30_30;
                                if (var20_20 /* !! */  < var6_6) break block24;
                                var30_30 = var36_36 & var33_33;
                                var36_36 >>= var6_6;
                                var20_20 /* !! */  -= var6_6;
                                if (var30_30 == var26_26) {
                                    var6_6 = var14_14;
                                    var21_21 = var10_10;
                                    var33_33 = var28_28;
                                    var30_30 = var40_40;
                                    var8_8 = -1;
                                    continue;
                                }
                                if (var30_30 <= var21_21) break block88;
                                var32_32 = var20_20 /* !! */ ;
                                var3_3.t = var20_20 /* !! */  = 3;
                                break block89;
                            }
                            var32_32 = var20_20 /* !! */ ;
                            if (var30_30 != var11_11) break block90;
                        }
                        var31_31 = var6_6;
                        var6_6 = var38_38;
                        var30_30 = var40_40;
                        var35_35 = var32_32;
                        var20_20 /* !! */  = 3;
                        var32_32 = var21_21;
                        var38_38 = var7_7;
                        var40_40 = var8_8;
                        var21_21 = 0;
                        var22_22 = null;
lbl237:
                        // 2 sources

                        while (true) {
                            var7_7 = 255;
                            var8_8 = 1;
                            continue block24;
                            break;
                        }
                    }
                    var20_20 /* !! */  = -1;
                    if (var8_8 == var20_20 /* !! */ ) {
                        var5_5 /* !! */  = var3_3.n;
                        var31_31 = 1;
                        var43_43 = 1.4E-45f;
                        var8_8 = var39_39 + 1;
                        var42_42 /* !! */  = var3_3.u;
                        var7_7 = var42_42 /* !! */ [var30_30];
                        var5_5 /* !! */ [var39_39] = var7_7;
                        var7_7 = var30_30;
                        var39_39 = var8_8;
                        var20_20 /* !! */  = var32_32;
                        var8_8 = var30_30;
                        var30_30 = var40_40;
                        continue;
                    }
                    var31_31 = 1;
                    var43_43 = 1.4E-45f;
                    if (var30_30 >= var21_21) {
                        var5_5 /* !! */  = var3_3.n;
                        var44_44 = var39_39 + 1;
                        var7_7 = (byte)var7_7;
                        var5_5 /* !! */ [var39_39] = var7_7;
                        var20_20 /* !! */  = var8_8;
                        var39_39 = var44_44;
                    } else {
                        var20_20 /* !! */  = var30_30;
                    }
                    while (var20_20 /* !! */  >= var26_26) {
                        var42_42 /* !! */  = var3_3.n;
                        var44_44 = var39_39 + 1;
                        var45_45 = var30_30;
                        var42_42 /* !! */ [var39_39] = var30_30 = var3_3.u[var20_20 /* !! */ ];
                        var34_34 /* !! */  = (byte[])var3_3.o;
                        var20_20 /* !! */  = var34_34 /* !! */ [var20_20 /* !! */ ];
                        var39_39 = var44_44;
                        var30_30 = var45_45;
                    }
                    var45_45 = var30_30;
                    var34_34 /* !! */  = var3_3.u;
                    var20_20 /* !! */  = var34_34 /* !! */ [var20_20 /* !! */ ] & 255;
                    var42_42 /* !! */  = var3_3.n;
                    var44_44 = var39_39 + 1;
                    var46_46 = var14_14;
                    var42_42 /* !! */ [var39_39] = var14_14 = (int)((byte)var20_20 /* !! */ );
                    var7_7 = 4096;
                    if (var21_21 >= var7_7) ** GOTO lbl-1000
                    var42_42 /* !! */  = (byte[])var3_3.o;
                    var42_42 /* !! */ [var21_21] = var8_8 = (int)((short)var8_8);
                    var34_34 /* !! */ [var21_21] = var14_14;
                    if ((var30_30 = (int)(++var21_21 & var33_33)) == 0) {
                        var30_30 = 4096;
                        if (var21_21 < var30_30) {
                            ++var6_6;
                            var33_33 += var21_21;
                        }
                    } else lbl-1000:
                    // 2 sources

                    {
                        var30_30 = 4096;
                    }
                    var39_39 = var44_44;
                    while (var39_39 > 0) {
                        var42_42 /* !! */  = var3_3.j;
                        var8_8 = var37_37 + 1;
                        var18_18 /* !! */  = var3_3.n;
                        var24_24 = -1;
                        var42_42 /* !! */ [var37_37] = var14_14 = var18_18 /* !! */ [var39_39 += -1];
                        ++var38_38;
                        var37_37 = var8_8;
                    }
                    var24_24 = -1;
                    var7_7 = var20_20 /* !! */ ;
                    var30_30 = var40_40;
                    var20_20 /* !! */  = var32_32;
                    var8_8 = var45_45;
                    var14_14 = var46_46;
                }
                break;
            }
            var24_24 = -1;
            var35_35 = var20_20 /* !! */ ;
            var32_32 = var21_21;
            var31_31 = var6_6;
            var6_6 = var38_38;
            var20_20 /* !! */  = 3;
            var21_21 = 0;
            var22_22 = null;
            var38_38 = var7_7;
            var40_40 = var8_8;
            ** while (true)
        }
        var31_31 = 1;
        var43_43 = 1.4E-45f;
        for (var20_20 /* !! */  = var37_37; var20_20 /* !! */  < var12_12; ++var20_20 /* !! */ ) {
            var22_22 = var3_3.j;
            var6_6 = 0;
            var22_22[var20_20 /* !! */ ] = 0;
        }
        var6_6 = 0;
        var20_20 /* !! */  = var4_4.h;
        var21_21 = var3_3.r;
        var20_20 /* !! */  /= var21_21;
        var30_30 = var4_4.f / var21_21;
        var7_7 = var4_4.g / var21_21;
        var8_8 = var4_4.e / var21_21;
        var21_21 = var3_3.f;
        var10_10 = var21_21 == 0 ? 1 : 0;
        var22_22 = null;
        var12_12 = 0;
        var13_13 = null;
        var14_14 = 8;
        var17_17 = 1.1E-44f;
        var16_16 = 1;
        for (var21_21 = 0; var21_21 < var20_20 /* !! */ ; ++var21_21) {
            var27_27 = (int)var4_4.d;
            if (var27_27 != 0) {
                if (var12_12 >= var20_20 /* !! */ ) {
                    var27_27 = 4;
                    var26_26 = 2;
                    if (++var16_16 != var26_26) {
                        var11_11 = 3;
                        if (var16_16 != var11_11) {
                            if (var16_16 == var27_27) {
                                var12_12 = 1;
                                var14_14 = 2;
                                var17_17 = 2.8E-45f;
                            }
                        } else {
                            var12_12 = 2;
                            var14_14 = 4;
                            var17_17 = 5.6E-45f;
                        }
                    } else {
                        var11_11 = 3;
                        var12_12 = 4;
                    }
                } else {
                    var26_26 = 2;
                    var11_11 = 3;
                }
                var27_27 = var12_12 + var14_14;
            } else {
                var26_26 = 2;
                var11_11 = 3;
                var27_27 = var12_12;
                var12_12 = var21_21;
            }
            var28_28 = var3_3.d;
            if ((var12_12 += var30_30) < var28_28) {
                var28_28 = var3_3.e;
                var12_12 *= var28_28;
                if ((var12_12 += var28_28) < (var6_6 = (var23_23 = var12_12 + var8_8) + var7_7)) {
                    var6_6 = var12_12;
                }
                var12_12 = var3_3.r;
                var28_28 = var21_21 * var12_12;
                var26_26 = var4_4.g;
                var28_28 *= var26_26;
                var26_26 = (var6_6 - var23_23) * var12_12 + var28_28;
                for (var12_12 = var23_23; var12_12 < var6_6; var12_12 += var20_20 /* !! */ ) {
                    var11_11 = var3_3.r;
                    var47_47 = var20_20 /* !! */ ;
                    var20_20 /* !! */  = 1;
                    if (var11_11 == var20_20 /* !! */ ) {
                        var5_5 /* !! */  = var3_3.j;
                        var20_20 /* !! */  = (int)var5_5 /* !! */ [var28_28];
                        var11_11 = 255;
                        var20_20 /* !! */  &= var11_11;
                        var48_48 = var3_3.a;
                        var20_20 /* !! */  = var48_48[var20_20 /* !! */ ];
                        var39_39 = var6_6;
                        var40_40 = var30_30;
                        var32_32 = var7_7;
                        var33_33 = var8_8;
                        var31_31 = var14_14;
                        var43_43 = var17_17;
                        var6_6 = 8;
                        var7_7 = 255;
                    } else {
                        var20_20 /* !! */  = var4_4.g;
                        var39_39 = var6_6;
                        var40_40 = var30_30;
                        var11_11 = 0;
                        var48_48 = null;
                        var23_23 = 0;
                        var36_36 = 0;
                        var37_37 = 0;
                        var38_38 = 0;
                        for (var6_6 = var28_28; var6_6 < (var30_30 = var3_3.r + var28_28); var6_6 += var30_30) {
                            var34_34 /* !! */  = var3_3.j;
                            var32_32 = var7_7;
                            var7_7 = var34_34 /* !! */ .length;
                            if (var6_6 < var7_7 && var6_6 < var26_26) {
                                var30_30 = var34_34 /* !! */ [var6_6];
                                var7_7 = 255;
                                var30_30 &= var7_7;
                                var42_42 /* !! */  = (byte[])var3_3.a;
                                if ((var30_30 = var42_42 /* !! */ [var30_30]) != 0) {
                                    var7_7 = var30_30 >> 24;
                                    var33_33 = var8_8;
                                    var8_8 = 255;
                                    var11_11 += (var7_7 &= var8_8);
                                    var7_7 = var30_30 >> 16 & var8_8;
                                    var23_23 += var7_7;
                                    var31_31 = var14_14;
                                    var43_43 = var17_17;
                                    var14_14 = var30_30 >> 8;
                                    var7_7 = var14_14 & 255;
                                    var36_36 += var7_7;
                                    var37_37 += (var30_30 &= var8_8);
                                    var30_30 = 1;
                                    ++var38_38;
                                } else {
                                    var33_33 = var8_8;
                                    var31_31 = var14_14;
                                    var43_43 = var17_17;
                                    var30_30 = 1;
                                }
                                var7_7 = var32_32;
                                var8_8 = var33_33;
                                var14_14 = var31_31;
                                var17_17 = var43_43;
                                continue;
                            }
lbl451:
                            // 3 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var32_32 = var7_7;
                        ** continue;
                        var33_33 = var8_8;
                        var31_31 = var14_14;
                        var43_43 = var17_17;
                        for (var6_6 = var20_20 /* !! */  += var28_28; var6_6 < (var30_30 = var3_3.r + var20_20 /* !! */ ) && var6_6 < (var7_7 = (var34_34 /* !! */  = var3_3.j).length) && var6_6 < var26_26; var6_6 += var30_30) {
                            var30_30 = var34_34 /* !! */ [var6_6];
                            var7_7 = 255;
                            var30_30 &= var7_7;
                            var41_41 /* !! */  = (byte[])var3_3.a;
                            if ((var30_30 = var41_41 /* !! */ [var30_30]) != 0) {
                                var8_8 = var30_30 >> 24 & var7_7;
                                var11_11 += var8_8;
                                var8_8 = var30_30 >> 16 & var7_7;
                                var23_23 += var8_8;
                                var14_14 = var30_30 >> 8;
                                var8_8 = var14_14 & 255;
                                var36_36 += var8_8;
                                var37_37 += (var30_30 &= var7_7);
                                var30_30 = 1;
                                ++var38_38;
                                continue;
                            }
                            var30_30 = 1;
                        }
                        var7_7 = 255;
                        if (var38_38 == 0) {
                            var20_20 /* !! */  = 0;
                            var5_5 /* !! */  = null;
                            var6_6 = 8;
                        } else {
                            var20_20 /* !! */  = (var11_11 /= var38_38) << 24;
                            var6_6 = (var23_23 /= var38_38) << 16;
                            var20_20 /* !! */  |= var6_6;
                            var6_6 = 8;
                            var30_30 = (var36_36 /= var38_38) << 8;
                            var20_20 /* !! */  |= var30_30;
                            var20_20 /* !! */  |= (var37_37 /= var38_38);
                        }
                    }
                    if (var20_20 /* !! */  != 0) {
                        var19_19[var12_12] = var20_20 /* !! */ ;
                        while (true) {
                            var20_20 /* !! */  = 1;
                            break;
                        }
                    } else {
                        if ((var20_20 /* !! */  = (int)var3_3.h) != 0 || var10_10 == 0) ** continue;
                        var20_20 /* !! */  = 1;
                        var3_3.h = var20_20 /* !! */ ;
                    }
                    var30_30 = var3_3.r;
                    var28_28 += var30_30;
                    var20_20 /* !! */  = var47_47;
                    var6_6 = var39_39;
                    var30_30 = var40_40;
                    var7_7 = var32_32;
                    var8_8 = var33_33;
                    var14_14 = var31_31;
                    var17_17 = var43_43;
                    var11_11 = 3;
                }
            }
            var47_47 = var20_20 /* !! */ ;
            var40_40 = var30_30;
            var32_32 = var7_7;
            var33_33 = var8_8;
            var31_31 = var14_14;
            var43_43 = var17_17;
            var12_12 = var27_27;
            var6_6 = 0;
        }
        var20_20 /* !! */  = 1;
        var21_21 = (int)var3_3.s;
        if (var21_21 != 0 && ((var49_49 = var4_4.c) == 0 || var49_49 == var20_20 /* !! */ )) {
            var4_4 = var3_3.p;
            if (var4_4 == null) {
                var4_4 = this.b();
                var3_3.p = var4_4;
            }
            var13_13 = var3_3.p;
            var10_10 = var3_3.e;
            var28_28 = var3_3.d;
            var16_16 = 0;
            var15_15 /* !! */  = null;
            var26_26 = 0;
            var11_11 = 0;
            var48_48 = null;
            var18_18 /* !! */  = (byte[])var19_19;
            var27_27 = var10_10;
            var13_13.setPixels(var19_19, 0, var10_10, 0, 0, var10_10, var28_28);
        }
        var4_4 = this.b();
        var10_10 = var3_3.e;
        var28_28 = var3_3.d;
        var13_13 = var4_4;
        var18_18 /* !! */  = (byte[])var19_19;
        var27_27 = var10_10;
        var4_4.setPixels(var19_19, 0, var10_10, 0, 0, var10_10, var28_28);
        return var4_4;
    }
}

