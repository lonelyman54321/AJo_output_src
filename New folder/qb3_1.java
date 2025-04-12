/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.util.Log
 */
import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from qb3
 */
public final class qb3_1
implements wz0_0 {
    public int[] a;
    public final int[] b;
    public final wZ0$a c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public GZ0 l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public Boolean s;
    public Bitmap.Config t;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public qb3_1(wZ0$a object, GZ0 clazz, ByteBuffer object2, int n3) {
        int n4 = 256;
        Object object3 = new int[n4];
        this.b = object3;
        object3 = Bitmap.Config.ARGB_8888;
        this.t = (Bitmap.Config)object3;
        this.c = object;
        this.l = object = new GZ0();
        object = "Sample size must be >=0, not: ";
        synchronized (this) {
            Throwable throwable2;
            block11: {
                if (n3 > 0) {
                    block10: {
                        int n7;
                        block9: {
                            try {
                                int n8;
                                int n10 = Integer.highestOneBit(n3);
                                n3 = 0;
                                CZ0 cZ0 = null;
                                this.o = 0;
                                this.l = clazz;
                                this.k = n4 = -1;
                                this.d = object2 = ((ByteBuffer)object2).asReadOnlyBuffer();
                                ((ByteBuffer)object2).position(0);
                                object2 = this.d;
                                object3 = ByteOrder.LITTLE_ENDIAN;
                                ((ByteBuffer)object2).order((ByteOrder)object3);
                                this.n = false;
                                object2 = ((GZ0)((Object)clazz)).e;
                                object2 = ((ArrayList)object2).iterator();
                                while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                                    cZ0 = (CZ0)object2.next();
                                    cZ0 = cZ0;
                                    n3 = cZ0.g;
                                    n4 = 3;
                                    if (n3 != n4) continue;
                                    n8 = 1;
                                    this.n = n8;
                                    break;
                                }
                                this.p = n10;
                                n8 = ((GZ0)((Object)clazz)).f;
                                this.r = n3 = n8 / n10;
                                n7 = ((GZ0)((Object)clazz)).g;
                                this.q = n10 = n7 / n10;
                                object = this.c;
                                n8 *= n7;
                                object = (sz0_1)object;
                                object = ((sz0_1)object).b;
                                if (object == null) {
                                    object = new byte[n8];
                                } else {
                                    clazz = byte[].class;
                                    object = object.c(clazz, n8);
                                    object = (byte[])object;
                                }
                                this.i = (byte[])object;
                                object = this.c;
                                n7 = this.r;
                                n8 = this.q;
                                n7 *= n8;
                                object = (sz0_1)object;
                                object = ((sz0_1)object).b;
                                if (object != null) break block9;
                                object = new int[n7];
                                break block10;
                            }
                            catch (Throwable throwable2) {
                                break block11;
                            }
                        }
                        object2 = int[].class;
                        object = object.c((Class)object2, n7);
                        object = (int[])object;
                    }
                    this.j = (int[])object;
                    return;
                }
                object2 = new StringBuilder((String)object);
                ((StringBuilder)object2).append(n3);
                object = ((StringBuilder)object2).toString();
                clazz = new Class<byte[]>((String)object);
                throw clazz;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bitmap a() {
        synchronized (this) {
            Throwable throwable2;
            block15: {
                int n3;
                int n4;
                int n7;
                int n8;
                Object object;
                block14: {
                    try {
                        object = this.l;
                        n8 = ((GZ0)object).c;
                        n7 = 3;
                        n4 = 1;
                        if (n8 > 0 && (n8 = this.k) >= 0) break block14;
                    }
                    catch (Throwable throwable2) {
                        break block15;
                    }
                    object = "qb3";
                    n8 = (int)(Log.isLoggable((String)object, (int)n7) ? 1 : 0);
                    if (n8 != 0) {
                        object = this.l;
                        n8 = ((GZ0)object).c;
                    }
                    this.o = n4;
                }
                if ((n8 = this.o) != n4 && n8 != (n3 = 2)) {
                    CZ0 cZ0;
                    Object object2;
                    int n10;
                    n8 = 0;
                    object = null;
                    this.o = 0;
                    Object object3 = this.e;
                    if (object3 == null) {
                        object3 = this.c;
                        object3 = (sz0_1)object3;
                        object3 = object3.b;
                        n10 = 255;
                        if (object3 == null) {
                            object3 = new byte[n10];
                        } else {
                            object2 = byte[].class;
                            object3 = object3.c((Class)object2, n10);
                        }
                        this.e = object3;
                    }
                    object3 = this.l;
                    object3 = object3.e;
                    n10 = this.k;
                    object3 = object3.get(n10);
                    object3 = (CZ0)object3;
                    n10 = this.k - n4;
                    if (n10 >= 0) {
                        object2 = this.l;
                        object2 = ((GZ0)object2).e;
                        cZ0 = (CZ0)((ArrayList)object2).get(n10);
                        cZ0 = cZ0;
                    } else {
                        n10 = 0;
                        cZ0 = null;
                    }
                    object2 = object3.k;
                    if (object2 == null) {
                        object2 = this.l;
                        object2 = ((GZ0)object2).a;
                    }
                    this.a = (int[])object2;
                    if (object2 == null) {
                        object = "qb3";
                        Log.isLoggable((String)object, (int)n7);
                        this.o = n4;
                        return null;
                    }
                    n7 = (int)(object3.f ? 1 : 0);
                    if (n7 == 0) return this.i((CZ0)object3, cZ0);
                    int[] nArray = this.b;
                    n4 = ((Object)object2).length;
                    System.arraycopy(object2, 0, nArray, 0, n4);
                    nArray = this.b;
                    this.a = nArray;
                    n4 = object3.h;
                    nArray[n4] = 0;
                    n8 = object3.g;
                    if (n8 != n3) return this.i((CZ0)object3, cZ0);
                    n8 = this.k;
                    if (n8 != 0) return this.i((CZ0)object3, cZ0);
                    this.s = object = Boolean.TRUE;
                    return this.i((CZ0)object3, cZ0);
                }
                object = "qb3";
                {
                    Log.isLoggable((String)object, (int)n7);
                    return null;
                }
            }
            throw throwable2;
        }
    }

    public final void b() {
        int n3 = this.k + 1;
        int n4 = this.l.c;
        this.k = n3 %= n4;
    }

    public final int c() {
        return this.l.c;
    }

    public final void clear() {
        Object object;
        byte[] byArray = null;
        this.l = null;
        Object object2 = this.i;
        wZ0$a wZ0$a = this.c;
        if (object2 != null) {
            object = wZ0$a;
            object = ((sz0_1)wZ0$a).b;
            if (object != null) {
                object.put(object2);
            }
        }
        if ((object2 = (Object)this.j) != null) {
            object = wZ0$a;
            object = ((sz0_1)wZ0$a).b;
            if (object != null) {
                object.put(object2);
            }
        }
        if ((object2 = (Object)this.m) != null) {
            object = wZ0$a;
            object = ((sz0_1)wZ0$a).a;
            object.d((Bitmap)object2);
        }
        this.m = null;
        this.d = null;
        this.s = null;
        byArray = this.e;
        if (byArray != null) {
            wZ0$a = (sz0_1)wZ0$a;
            object2 = ((sz0_1)wZ0$a).b;
            if (object2 != null) {
                object2.put(byArray);
            }
        }
    }

    public final int d() {
        int n3;
        Object object = this.l;
        int n4 = ((GZ0)object).c;
        if (n4 > 0 && (n3 = this.k) >= 0) {
            int n7;
            if (n3 >= 0 && n3 < n4) {
                object = (CZ0)((GZ0)object).e.get(n3);
                n7 = ((CZ0)object).i;
            } else {
                n7 = -1;
            }
            return n7;
        }
        return 0;
    }

    public final int e() {
        return this.k;
    }

    public final int f() {
        int n3 = this.d.limit();
        int n4 = this.i.length;
        return this.j.length * 4 + (n3 += n4);
    }

    public final Bitmap g() {
        boolean bl2;
        Boolean bl3 = this.s;
        bl3 = bl3 != null && !(bl2 = bl3.booleanValue()) ? this.t : Bitmap.Config.ARGB_8888;
        int n3 = this.r;
        int n4 = this.q;
        bl3 = ((sz0_1)this.c).a.c(n3, n4, (Bitmap.Config)bl3);
        bl3.setHasAlpha(true);
        return bl3;
    }

    public final ByteBuffer getData() {
        return this.d;
    }

    public final void h(Bitmap.Config object) {
        Bitmap.Config config;
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (object != config2 && object != (config = Bitmap.Config.RGB_565)) {
            StringBuilder stringBuilder = new StringBuilder("Unsupported format: ");
            stringBuilder.append(object);
            stringBuilder.append(", must be one of ");
            stringBuilder.append(config2);
            stringBuilder.append(" or ");
            stringBuilder.append(config);
            object = stringBuilder.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        this.t = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Bitmap i(CZ0 var1_1, CZ0 var2_2) {
        block84: {
            block85: {
                block87: {
                    block86: {
                        var3_3 = this;
                        var4_4 = var1_1;
                        var5_5 = var2_2;
                        var6_6 /* !! */  = this.j;
                        var7_7 = this.c;
                        var8_8 = 0;
                        var9_9 /* !! */  = null;
                        if (var2_2 == null) {
                            var10_10 /* !! */  = this.m;
                            if (var10_10 /* !! */  != null) {
                                var11_11 = var7_7;
                                var11_11 = ((sz0_1)var7_7).a;
                                var11_11.d(var10_10 /* !! */ );
                            }
                            var12_12 = 0;
                            var10_10 /* !! */  = null;
                            var3_3.m = null;
                            Arrays.fill(var6_6 /* !! */ , 0);
                        }
                        var13_13 = 3;
                        if (var5_5 != null && (var12_12 = var5_5.g) == var13_13 && (var10_10 /* !! */  = var3_3.m) == null) {
                            Arrays.fill(var6_6 /* !! */ , 0);
                        }
                        var14_14 = 2;
                        if (var5_5 == null || (var12_12 = var5_5.g) <= 0) break block84;
                        if (var12_12 != var14_14) break block85;
                        var12_12 = (int)var4_4.f;
                        if (var12_12 != 0) break block86;
                        var10_10 /* !! */  = var3_3.l;
                        var15_15 = var10_10 /* !! */ .k;
                        var16_16 /* !! */  = var4_4.k;
                        if (var16_16 /* !! */  == null || (var12_12 = var10_10 /* !! */ .j) != (var17_17 = var4_4.h)) break block87;
                    }
                    var15_15 = 0;
                    var11_11 = null;
                }
                var12_12 = var5_5.d;
                var17_17 = var3_3.p;
                var12_12 /= var17_17;
                var18_18 = var5_5.b / var17_17;
                var19_19 = var5_5.c / var17_17;
                var20_20 = var5_5.a / var17_17;
                var17_17 = var3_3.r;
                var12_12 = var12_12 * var17_17 + var18_18;
                for (var18_18 = var18_18 * var17_17 + var20_20; var18_18 < var12_12; var18_18 += var20_20) {
                    var20_20 = var18_18 + var19_19;
                    for (var17_17 = var18_18; var17_17 < var20_20; ++var17_17) {
                        var6_6 /* !! */ [var17_17] = var15_15;
                    }
                    var20_20 = var3_3.r;
                }
                break block84;
            }
            if (var12_12 == var13_13 && (var5_5 = var3_3.m) != null) {
                var21_21 /* !! */  = var3_3.r;
                var22_22 = var3_3.q;
                var15_15 = 0;
                var11_11 = null;
                var18_18 = 0;
                var23_23 /* !! */  = null;
                var19_19 = 0;
                var24_24 = null;
                var10_10 /* !! */  = (Bitmap)var6_6 /* !! */ ;
                var17_17 = var21_21 /* !! */ ;
                var5_5.getPixels(var6_6 /* !! */ , 0, var21_21 /* !! */ , 0, 0, var21_21 /* !! */ , var22_22);
            }
        }
        var5_5 = var3_3.d;
        var12_12 = var4_4.j;
        var5_5.position(var12_12);
        var20_20 = var4_4.c;
        var12_12 = var4_4.d;
        var20_20 *= var12_12;
        var10_10 /* !! */  = (Bitmap)var3_3.i;
        if (var10_10 /* !! */  == null || (var12_12 = ((Bitmap)var10_10 /* !! */ ).length) < var20_20) {
            var7_7 = (sz0_1)var7_7;
            var10_10 /* !! */  = var7_7.b;
            if (var10_10 /* !! */  == null) {
                var10_10 /* !! */  = (Bitmap)new byte[var20_20];
            } else {
                var11_11 = byte[].class;
                var10_10 /* !! */  = (Bitmap)((byte[])var10_10 /* !! */ .c((Class)var11_11, var20_20));
            }
            var3_3.i = (byte[])var10_10 /* !! */ ;
        }
        var10_10 /* !! */  = (Bitmap)var3_3.i;
        var11_11 = var3_3.f;
        var17_17 = 4096;
        if (var11_11 == null) {
            var11_11 = new short[var17_17];
            var3_3.f = (short[])var11_11;
        }
        var11_11 = var3_3.f;
        var23_23 /* !! */  = var3_3.g;
        if (var23_23 /* !! */  == null) {
            var3_3.g = var23_23 /* !! */  = new byte[var17_17];
        }
        var23_23 /* !! */  = var3_3.g;
        var24_24 = var3_3.h;
        if (var24_24 == null) {
            var19_19 = 4097;
            var3_3.h = var24_24 = new byte[var19_19];
        }
        var24_24 = var3_3.h;
        var25_25 = var3_3.d;
        var21_21 /* !! */  = var25_25.get() & 255;
        var22_22 = 1;
        var26_26 = var22_22 << var21_21 /* !! */ ;
        var27_27 = var26_26 + 1;
        var28_28 = var26_26 + 2;
        var29_29 = (var22_22 << (var21_21 /* !! */  += var22_22)) + -1;
        for (var14_14 = 0; var14_14 < var26_26; ++var14_14) {
            var11_11[var14_14] = false;
            var23_23 /* !! */ [var14_14] = var17_17 = (int)((byte)var14_14);
            var17_17 = 4096;
        }
        var16_16 /* !! */  = var3_3.e;
        var30_30 = var21_21 /* !! */ ;
        var31_31 = var28_28;
        var32_32 = var29_29;
        var14_14 = 0;
        var33_33 = -1;
        var34_34 = 0;
        var35_35 = 0;
        var36_36 = 0;
        var37_37 = null;
        var38_38 = 0;
        var39_39 = 0;
        var40_40 = 0;
        var41_41 = 0;
        block3: while (true) {
            if (var14_14 >= var20_20) break;
            if (var34_34 == 0) {
                var42_42 = var3_3.d;
                var22_22 = var42_42.get() & 255;
                if (var22_22 <= 0) {
                    var43_43 = var21_21 /* !! */ ;
                    var44_44 = var14_14;
                } else {
                    var45_45 = var3_3.d;
                    var9_9 /* !! */  = var3_3.e;
                    var43_43 = var21_21 /* !! */ ;
                    var21_21 /* !! */  = var45_45.remaining();
                    var21_21 /* !! */  = Math.min(var22_22, var21_21 /* !! */ );
                    var44_44 = var14_14;
                    var14_14 = 0;
                    var45_45.get(var9_9 /* !! */ , 0, var21_21 /* !! */ );
                }
                if (var22_22 <= 0) {
                    var3_3.o = var21_21 /* !! */  = 3;
                    break;
                }
                var34_34 = var22_22;
                var35_35 = 0;
            } else {
                var43_43 = var21_21 /* !! */ ;
                var44_44 = var14_14;
            }
            var21_21 /* !! */  = (var16_16 /* !! */ [var35_35] & 255) << var36_36;
            var38_38 += var21_21 /* !! */ ;
            ++var35_35;
            var34_34 += -1;
            var22_22 = var33_33;
            var8_8 = var36_36 += 8;
            var13_13 = var31_31;
            var21_21 /* !! */  = var30_30;
            var14_14 = var44_44;
            var46_46 /* !! */  = var16_16 /* !! */ ;
            var17_17 = var40_40;
            while (var8_8 >= var21_21 /* !! */ ) {
                var37_37 = var6_6 /* !! */ ;
                var47_47 = var38_38 & var32_32;
                var38_38 >>= var21_21 /* !! */ ;
                var8_8 -= var21_21 /* !! */ ;
                if (var47_47 == var26_26) {
                    var13_13 = var28_28;
                    var32_32 = var29_29;
                    var21_21 /* !! */  = var43_43;
                    var22_22 = -1;
                    continue;
                }
                if (var47_47 == var27_27) {
                    var40_40 = var17_17;
                    var30_30 = var21_21 /* !! */ ;
                    var31_31 = var13_13;
                    var16_16 /* !! */  = var46_46 /* !! */ ;
                    var21_21 /* !! */  = var43_43;
                    var13_13 = 3;
                    var33_33 = var22_22;
                    var36_36 = var8_8;
                    var22_22 = 1;
                    var8_8 = 0;
                    var9_9 /* !! */  = null;
                    continue block3;
                }
                var31_31 = var8_8;
                var8_8 = -1;
                if (var22_22 == var8_8) {
                    var17_17 = var23_23 /* !! */ [var47_47];
                    var10_10 /* !! */ [var39_39] = (Bitmap)var17_17;
                    ++var39_39;
                    ++var14_14;
                    var17_17 = var47_47;
                    var22_22 = var47_47;
                    var8_8 = var31_31;
                    continue;
                }
                if (var47_47 >= var13_13) {
                    var24_24[var41_41] = var17_17 = (int)((byte)var17_17);
                    ++var41_41;
                    var17_17 = var22_22;
                } else {
                    var17_17 = var47_47;
                }
                while (var17_17 >= var26_26) {
                    var24_24[var41_41] = var8_8 = var23_23 /* !! */ [var17_17];
                    ++var41_41;
                    var17_17 = (int)var11_11[var17_17];
                }
                var17_17 = var23_23 /* !! */ [var17_17] & 255;
                var8_8 = (byte)var17_17;
                var10_10 /* !! */ [var39_39] = (Bitmap)var8_8;
                while (true) {
                    ++var39_39;
                    ++var14_14;
                    if (var41_41 <= 0) break;
                    var30_30 = var24_24[var41_41 += -1];
                    var10_10 /* !! */ [var39_39] = (Bitmap)var30_30;
                }
                var30_30 = var17_17;
                var17_17 = 4096;
                if (var13_13 < var17_17) {
                    var22_22 = (short)var22_22;
                    var11_11[var13_13] = var22_22;
                    var23_23 /* !! */ [var13_13] = var8_8;
                    if ((var22_22 = ++var13_13 & var32_32) == 0 && var13_13 < var17_17) {
                        ++var21_21 /* !! */ ;
                        var32_32 += var13_13;
                    }
                }
                var22_22 = var47_47;
                var6_6 /* !! */  = var37_37;
                var8_8 = var31_31;
                var17_17 = var30_30;
            }
            var40_40 = var17_17;
            var30_30 = var21_21 /* !! */ ;
            var36_36 = var8_8;
            var31_31 = var13_13;
            var16_16 /* !! */  = var46_46 /* !! */ ;
            var21_21 /* !! */  = var43_43;
            var8_8 = 0;
            var9_9 /* !! */  = null;
            var13_13 = 3;
            var33_33 = var22_22;
            var22_22 = 1;
        }
        var37_37 = var6_6 /* !! */ ;
        var8_8 = var39_39;
        var14_14 = 0;
        Arrays.fill((byte[])var10_10 /* !! */ , var39_39, var20_20, (byte)0);
        var20_20 = (int)var4_4.e;
        if (var20_20 == 0 && (var20_20 = var3_3.p) == (var12_12 = 1)) {
            var5_5 = var3_3.j;
            var12_12 = var4_4.d;
            var15_15 = var4_4.b;
            var17_17 = var4_4.c;
            var18_18 = var4_4.a;
            var19_19 = var3_3.k;
            if (var19_19 == 0) {
                var19_19 = 1;
            } else {
                var19_19 = 0;
                var24_24 = null;
            }
            var21_21 /* !! */  = var3_3.r;
            var42_42 = var3_3.i;
            var6_6 /* !! */  = var3_3.a;
            var26_26 = -1;
            var9_9 /* !! */  = null;
            for (var8_8 = 0; var8_8 < var12_12; ++var8_8) {
                var13_13 = (var8_8 + var15_15) * var21_21 /* !! */ ;
                if ((var13_13 += var21_21 /* !! */ ) < (var14_14 = (var27_27 = var13_13 + var18_18) + var17_17)) {
                    var14_14 = var13_13;
                }
                var13_13 = var4_4.c * var8_8;
                while (var27_27 < var14_14) {
                    var28_28 = var12_12;
                    var12_12 = (int)var42_42[var13_13];
                    var29_29 = var15_15;
                    var15_15 = var12_12 & 255;
                    if (var15_15 != var26_26) {
                        if ((var15_15 = var6_6 /* !! */ [var15_15]) != 0) {
                            var5_5[var27_27] = var15_15;
                        } else {
                            var26_26 = var12_12;
                        }
                    }
                    ++var13_13;
                    ++var27_27;
                    var12_12 = var28_28;
                    var15_15 = var29_29;
                }
                var28_28 = var12_12;
                var29_29 = var15_15;
                var14_14 = 0;
            }
            var5_5 = var3_3.s;
            if (var5_5 != null && (var20_20 = (int)var5_5.booleanValue()) != 0 || (var5_5 = var3_3.s) == null && var19_19 != 0 && var26_26 != (var20_20 = -1)) {
                var8_8 = 1;
            } else {
                var8_8 = 0;
                var9_9 /* !! */  = null;
            }
            var3_3.s = var5_5 = Boolean.valueOf((boolean)var8_8);
        } else {
            var5_5 = var3_3.j;
            var12_12 = var4_4.d;
            var15_15 = var3_3.p;
            var12_12 /= var15_15;
            var17_17 = var4_4.b / var15_15;
            var18_18 = var4_4.c / var15_15;
            var19_19 = var4_4.a / var15_15;
            var21_21 /* !! */  = var3_3.k;
            var14_14 = var21_21 /* !! */  == 0 ? 1 : 0;
            var21_21 /* !! */  = var3_3.r;
            var22_22 = var3_3.q;
            var6_6 /* !! */  = var3_3.i;
            var7_7 = var3_3.a;
            var9_9 /* !! */  = (byte[])var3_3.s;
            var45_45 = null;
            var27_27 = 0;
            var28_28 = 1;
            var29_29 = 8;
            for (var13_13 = 0; var13_13 < var12_12; ++var13_13) {
                block82: {
                    var2_2 = var9_9 /* !! */ ;
                    var8_8 = (int)var4_4.e;
                    if (var8_8 != 0) {
                        if (var27_27 >= var12_12) {
                            var8_8 = var28_28 + 1;
                            var48_48 = var12_12;
                            var12_12 = 2;
                            if (var8_8 != var12_12) {
                                var12_12 = 3;
                                if (var8_8 != var12_12) {
                                    var12_12 = 4;
                                    if (var8_8 != var12_12) {
                                        var28_28 = var8_8;
                                    } else {
                                        var28_28 = var8_8;
                                        var27_27 = 1;
                                        var29_29 = 2;
                                    }
                                } else {
                                    var12_12 = 4;
                                    var28_28 = var8_8;
                                    var27_27 = 2;
                                    var29_29 = 4;
                                }
                            } else {
                                var12_12 = 4;
                                var28_28 = var8_8;
                                var27_27 = 4;
                            }
                        } else {
                            var48_48 = var12_12;
                        }
                        var12_12 = var27_27 + var29_29;
                    } else {
                        var48_48 = var12_12;
                        var12_12 = var27_27;
                        var27_27 = var13_13;
                    }
                    var27_27 += var17_17;
                    var8_8 = 1;
                    if (var15_15 == var8_8) {
                        var8_8 = 1;
                    } else {
                        var8_8 = 0;
                        var9_9 /* !! */  = null;
                    }
                    if (var27_27 < var22_22) {
                        var33_33 = (var27_27 *= var21_21 /* !! */ ) + var19_19;
                        var34_34 = var12_12;
                        var12_12 = var33_33 + var18_18;
                        if ((var27_27 += var21_21 /* !! */ ) < var12_12) {
                            var12_12 = var27_27;
                        }
                        var27_27 = var13_13 * var15_15;
                        var35_35 = var17_17;
                        var17_17 = var4_4.c;
                        var27_27 *= var17_17;
                        if (var8_8 != 0) {
                            var9_9 /* !! */  = var2_2;
                            for (var17_17 = var33_33; var17_17 < var12_12; ++var17_17) {
                                var38_38 = var18_18;
                                var18_18 = var6_6 /* !! */ [var27_27] & 255;
                                if ((var18_18 = (int)var7_7[var18_18]) != 0) {
                                    var5_5[var17_17] = var18_18;
                                } else if (var14_14 != 0 && var9_9 /* !! */  == null) {
                                    var23_23 /* !! */  = (byte[])Boolean.TRUE;
                                    var9_9 /* !! */  = var23_23 /* !! */ ;
                                }
                                var27_27 += var15_15;
                                var18_18 = var38_38;
                            }
                            var38_38 = var18_18;
                            while (true) {
                                var41_41 = var19_19;
                                var43_43 = var21_21 /* !! */ ;
                                var44_44 = var22_22;
                                break block82;
                                break;
                            }
                        }
                        var38_38 = var18_18;
                        var17_17 = (var12_12 - var33_33) * var15_15 + var27_27;
                        var9_9 /* !! */  = var2_2;
                        var18_18 = var33_33;
                        while (true) {
                            block83: {
                                if (var18_18 >= var12_12) ** continue;
                                var33_33 = var12_12;
                                var12_12 = var4_4.c;
                                var41_41 = var19_19;
                                var43_43 = var21_21 /* !! */ ;
                                var39_39 = 0;
                                var31_31 = 0;
                                var32_32 = 0;
                                var30_30 = 0;
                                var40_40 = 0;
                                for (var19_19 = var27_27; var19_19 < (var21_21 /* !! */  = var3_3.p + var27_27); ++var19_19) {
                                    var25_25 = var3_3.i;
                                    var44_44 = var22_22;
                                    var22_22 = ((Object)var25_25).length;
                                    if (var19_19 < var22_22 && var19_19 < var17_17) {
                                        var21_21 /* !! */  = var25_25[var19_19] & 255;
                                        var42_42 = var3_3.a;
                                        if ((var21_21 /* !! */  = (int)var42_42[var21_21 /* !! */ ]) != 0) {
                                            var22_22 = var21_21 /* !! */  >> 24 & 255;
                                            var39_39 += var22_22;
                                            var22_22 = var21_21 /* !! */  >> 16 & 255;
                                            var31_31 += var22_22;
                                            var22_22 = var21_21 /* !! */  >> 8 & 255;
                                            var32_32 += var22_22;
                                            var30_30 += (var21_21 /* !! */  &= 255);
                                            ++var40_40;
                                        }
                                        var22_22 = var44_44;
                                        continue;
                                    }
                                    break block83;
                                }
                                var44_44 = var22_22;
                            }
                            for (var19_19 = var12_12 += var27_27; var19_19 < (var21_21 /* !! */  = var3_3.p + var12_12) && var19_19 < (var22_22 = ((Object)(var25_25 = (Object)var3_3.i)).length) && var19_19 < var17_17; ++var19_19) {
                                var21_21 /* !! */  = var25_25[var19_19] & 255;
                                var42_42 = var3_3.a;
                                if ((var21_21 /* !! */  = (int)var42_42[var21_21 /* !! */ ]) == 0) continue;
                                var22_22 = var21_21 /* !! */  >> 24 & 255;
                                var39_39 += var22_22;
                                var22_22 = var21_21 /* !! */  >> 16 & 255;
                                var31_31 += var22_22;
                                var22_22 = var21_21 /* !! */  >> 8 & 255;
                                var32_32 += var22_22;
                                var30_30 += (var21_21 /* !! */  &= 255);
                                ++var40_40;
                            }
                            if (var40_40 == 0) {
                                var12_12 = 0;
                                var10_10 /* !! */  = null;
                            } else {
                                var12_12 = (var39_39 /= var40_40) << 24;
                                var19_19 = (var31_31 /= var40_40) << 16;
                                var12_12 |= var19_19;
                                var19_19 = (var32_32 /= var40_40) << 8;
                                var12_12 |= var19_19;
                                var12_12 |= (var30_30 /= var40_40);
                            }
                            if (var12_12 != 0) {
                                var5_5[var18_18] = var12_12;
                            } else if (var14_14 != 0 && var9_9 /* !! */  == null) {
                                var10_10 /* !! */  = Boolean.TRUE;
                                var9_9 /* !! */  = (byte[])var10_10 /* !! */ ;
                            }
                            var27_27 += var15_15;
                            ++var18_18;
                            var12_12 = var33_33;
                            var19_19 = var41_41;
                            var21_21 /* !! */  = var43_43;
                            var22_22 = var44_44;
                        }
                    }
                    var34_34 = var12_12;
                    var35_35 = var17_17;
                    var38_38 = var18_18;
                    var41_41 = var19_19;
                    var43_43 = var21_21 /* !! */ ;
                    var44_44 = var22_22;
                    var9_9 /* !! */  = var2_2;
                }
                var12_12 = var48_48;
                var27_27 = var34_34;
                var17_17 = var35_35;
                var18_18 = var38_38;
                var19_19 = var41_41;
                var21_21 /* !! */  = var43_43;
                var22_22 = var44_44;
            }
            var2_2 = var9_9 /* !! */ ;
            var5_5 = var3_3.s;
            if (var5_5 == null) {
                if (var9_9 /* !! */  == null) {
                    var8_8 = 0;
                    var9_9 /* !! */  = null;
                } else {
                    var8_8 = (int)var9_9 /* !! */ .booleanValue();
                }
                var3_3.s = var5_5 = Boolean.valueOf((boolean)var8_8);
            }
        }
        var20_20 = (int)var3_3.n;
        if (var20_20 != 0 && ((var49_49 = var4_4.g) == 0 || var49_49 == (var20_20 = 1))) {
            var4_4 = var3_3.m;
            if (var4_4 == null) {
                var4_4 = this.g();
                var3_3.m = var4_4;
            }
            var4_4 = var3_3.m;
            var19_19 = var3_3.r;
            var21_21 /* !! */  = var3_3.q;
            var12_12 = 0;
            var10_10 /* !! */  = null;
            var17_17 = 0;
            var16_16 /* !! */  = null;
            var18_18 = 0;
            var23_23 /* !! */  = null;
            var5_5 = var37_37;
            var15_15 = var19_19;
            var4_4.setPixels(var37_37, 0, var19_19, 0, 0, var19_19, var21_21 /* !! */ );
        }
        var42_42 = this.g();
        var19_19 = var3_3.r;
        var21_21 /* !! */  = var3_3.q;
        var4_4 = var42_42;
        var5_5 = var37_37;
        var15_15 = var19_19;
        var42_42.setPixels(var37_37, 0, var19_19, 0, 0, var19_19, var21_21 /* !! */ );
        return var42_42;
    }
}

