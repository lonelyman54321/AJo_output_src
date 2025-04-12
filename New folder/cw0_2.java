/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Xfermode
 *  android.util.SparseArray
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Xfermode;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from Cw0
 */
public final class cw0_2
implements vf3_0 {
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final Cw0$b d;
    public final Cw0$a e;
    public final Cw0$h f;
    public Bitmap g;

    static {
        byte[] byArray;
        byte[] byArray2;
        int n3 = 4;
        byte[] byArray3 = byArray2 = new byte[n3];
        byte[] byArray4 = byArray2;
        byArray3[0] = 0;
        byArray4[1] = 7;
        byArray3[2] = 8;
        byArray4[3] = 15;
        h = byArray2;
        byte[] byArray5 = byArray = new byte[n3];
        byte[] byArray6 = byArray;
        byArray5[0] = 0;
        byArray6[1] = 119;
        byArray5[2] = -120;
        byArray6[3] = -1;
        i = byArray;
        byte[] byArray7 = byArray = new byte[16];
        byte[] byArray8 = byArray;
        byArray7[0] = 0;
        byArray8[1] = 17;
        byArray7[2] = 34;
        byArray8[3] = 51;
        byArray7[4] = 68;
        byArray8[5] = 85;
        byArray7[6] = 102;
        byArray8[7] = 119;
        byArray7[8] = -120;
        byArray8[9] = -103;
        byArray7[10] = -86;
        byArray8[11] = -69;
        byArray7[12] = -52;
        byArray8[13] = -35;
        byArray7[14] = -18;
        byArray8[15] = -1;
        j = byArray;
    }

    public cw0_2(List object) {
        Cw0$h cw0$h;
        Object object2;
        object = (byte[])object.get(0);
        Xm2 xm2 = new Xm2((byte[])object);
        int n3 = xm2.C();
        int n4 = xm2.C();
        this.a = object2 = new Paint();
        Object object3 = Paint.Style.FILL_AND_STROKE;
        object2.setStyle(object3);
        Object object4 = PorterDuff.Mode.SRC;
        super(object4);
        object2.setXfermode((Xfermode)object3);
        object2.setPathEffect(null);
        this.b = object2 = new Paint();
        object4 = Paint.Style.FILL;
        object2.setStyle((Paint.Style)object4);
        Object object5 = PorterDuff.Mode.DST_OVER;
        super(object5);
        object2.setXfermode((Xfermode)object4);
        object2.setPathEffect(null);
        super();
        this.c = object2;
        object3 = object2;
        super(719, 575, 0, 719, 0, 575);
        this.d = object2;
        object3 = new int[]{0, -1, -16777216, -8421505};
        object4 = cw0_2.e();
        object5 = cw0_2.f();
        super(0, (int[])object3, (int[])object4, (int[])object5);
        this.e = object2;
        this.f = cw0$h = new Cw0$h(n3, n4);
    }

    public static byte[] d(int n3, int n4, Vm2 vm2) {
        byte[] byArray = new byte[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            byte by2;
            byArray[i3] = by2 = (byte)vm2.g(n4);
        }
        return byArray;
    }

    public static int[] e() {
        int n3 = 16;
        int[] nArray = new int[n3];
        nArray[0] = 0;
        for (int i3 = 1; i3 < n3; ++i3) {
            int n4;
            int n7;
            int n8 = 8;
            int n10 = 255;
            if (i3 < n8) {
                n8 = i3 & 1;
                n8 = n8 != 0 ? 255 : 0;
                n7 = i3 & 2;
                n7 = n7 != 0 ? 255 : 0;
                n4 = i3 & 4;
                n4 = n4 != 0 ? 255 : 0;
                nArray[i3] = n8 = cw0_2.g(n10, n8, n7, n4);
                continue;
            }
            n8 = i3 & 1;
            n7 = 127;
            n8 = n8 != 0 ? 127 : 0;
            n4 = i3 & 2;
            n4 = n4 != 0 ? 127 : 0;
            int n14 = i3 & 4;
            if (n14 == 0) {
                n7 = 0;
            }
            nArray[i3] = n8 = cw0_2.g(n10, n8, n4, n7);
        }
        return nArray;
    }

    public static int[] f() {
        int n3 = 256;
        int[] nArray = new int[n3];
        nArray[0] = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            int n7;
            int n8;
            int n10 = 8;
            int n14 = 255;
            if (i3 < n10) {
                n10 = i3 & 1;
                n10 = n10 != 0 ? 255 : 0;
                n8 = i3 & 2;
                n8 = n8 != 0 ? 255 : 0;
                n7 = i3 & 4;
                if (n7 == 0) {
                    n14 = 0;
                }
                n7 = 63;
                nArray[i3] = n10 = cw0_2.g(n7, n10, n8, n14);
                continue;
            }
            n8 = i3 & 0x88;
            n7 = 170;
            int n15 = 85;
            if (n8 != 0) {
                n4 = 127;
                if (n8 != n10) {
                    n10 = 128;
                    n7 = 43;
                    if (n8 != n10) {
                        n10 = 136;
                        if (n8 != n10) continue;
                        n10 = i3 & 1;
                        n10 = n10 != 0 ? 43 : 0;
                        n8 = i3 & 0x10;
                        n8 = n8 != 0 ? 85 : 0;
                        n10 += n8;
                        n8 = i3 & 2;
                        n8 = n8 != 0 ? 43 : 0;
                        n4 = i3 & 0x20;
                        n4 = n4 != 0 ? 85 : 0;
                        n8 += n4;
                        n4 = i3 & 4;
                        if (n4 == 0) {
                            n7 = 0;
                        }
                        n4 = i3 & 0x40;
                        if (n4 == 0) {
                            n15 = 0;
                        }
                        nArray[i3] = n10 = cw0_2.g(n14, n10, n8, n7 += n15);
                        continue;
                    }
                    n10 = i3 & 1;
                    n10 = n10 != 0 ? 43 : 0;
                    n10 += n4;
                    n8 = i3 & 0x10;
                    n8 = n8 != 0 ? 85 : 0;
                    n10 += n8;
                    n8 = i3 & 2;
                    n8 = n8 != 0 ? 43 : 0;
                    n8 += n4;
                    int n16 = i3 & 0x20;
                    n16 = n16 != 0 ? 85 : 0;
                    n8 += n16;
                    n16 = i3 & 4;
                    if (n16 == 0) {
                        n7 = 0;
                    }
                    n7 += n4;
                    n4 = i3 & 0x40;
                    if (n4 == 0) {
                        n15 = 0;
                    }
                    nArray[i3] = n10 = cw0_2.g(n14, n10, n8, n7 += n15);
                    continue;
                }
                n10 = i3 & 1;
                n10 = n10 != 0 ? 85 : 0;
                n14 = i3 & 0x10;
                n14 = n14 != 0 ? 170 : 0;
                n10 += n14;
                n14 = i3 & 2;
                n14 = n14 != 0 ? 85 : 0;
                n8 = i3 & 0x20;
                n8 = n8 != 0 ? 170 : 0;
                n14 += n8;
                n8 = i3 & 4;
                if (n8 == 0) {
                    n15 = 0;
                }
                n8 = i3 & 0x40;
                if (n8 == 0) {
                    n7 = 0;
                }
                nArray[i3] = n10 = cw0_2.g(n4, n10, n14, n15 += n7);
                continue;
            }
            n10 = i3 & 1;
            n10 = n10 != 0 ? 85 : 0;
            n8 = i3 & 0x10;
            n8 = n8 != 0 ? 170 : 0;
            n10 += n8;
            n8 = i3 & 2;
            n8 = n8 != 0 ? 85 : 0;
            n4 = i3 & 0x20;
            n4 = n4 != 0 ? 170 : 0;
            n8 += n4;
            n4 = i3 & 4;
            if (n4 == 0) {
                n15 = 0;
            }
            n4 = i3 & 0x40;
            if (n4 == 0) {
                n7 = 0;
            }
            nArray[i3] = n10 = cw0_2.g(n14, n10, n8, n15 += n7);
        }
        return nArray;
    }

    public static int g(int n3, int n4, int n7, int n8) {
        n3 <<= 24;
        n4 = n7 << 8;
        return (n3 |= (n4 <<= 16)) | n4 | n8;
    }

    /*
     * Unable to fully structure code
     */
    public static void h(byte[] var0, int[] var1_1, int var2_2, int var3_3, int var4_4, Paint var5_5, Canvas var6_6) {
        var7_7 = var2_2;
        var8_8 = var5_5;
        var10_10 = var0.length;
        var9_9 = new Vm2(var0, var10_10);
        var10_10 = var3_3;
        var11_11 = var4_4;
        var12_12 = null;
        var13_13 = null;
        var14_14 = null;
        block10: while ((var15_15 = var9_9.b()) != 0) {
            block56: {
                block55: {
                    block57: {
                        block58: {
                            var16_16 = 8;
                            var15_15 = var9_9.g(var16_16);
                            var17_17 = 240;
                            var18_18 = 3.36E-43f;
                            if (var15_15 == var17_17) break block56;
                            var19_19 = 2;
                            var20_20 = 1;
                            var21_21 = 3;
                            var22_22 = 4.2E-45f;
                            var23_23 = 4;
                            var24_24 = 5.6E-45f;
                            switch (var15_15) {
                                default: {
                                    switch (var15_15) {
                                        default: {
                                            continue block10;
                                        }
                                        case 34: {
                                            var15_15 = 16;
                                            var25_25 = 2.2E-44f;
                                            var13_13 = cw0_2.d(var15_15, var16_16, var9_9);
                                            continue block10;
                                        }
                                        case 33: {
                                            var12_12 = cw0_2.d(var23_23, var16_16, var9_9);
                                            continue block10;
                                        }
                                        case 32: 
                                    }
                                    var14_14 = cw0_2.d(var23_23, var23_23, var9_9);
                                    continue block10;
                                }
                                case 18: {
                                    var19_19 = var10_10;
                                    var10_10 = 0;
                                    var26_26 = 0.0f;
                                    while (true) {
                                        if ((var15_15 = var9_9.g(var16_16)) != 0) {
                                            var27_27 = var10_10;
                                            var28_28 = var26_26;
                                            var29_29 = 1;
                                            var30_30 = 1.4E-45f;
                                        } else {
                                            var15_15 = (int)var9_9.f();
                                            var17_17 = 7;
                                            var18_18 = 9.8E-45f;
                                            if (var15_15 == 0) {
                                                var15_15 = var9_9.g(var17_17);
                                                if (var15_15 != 0) {
                                                    var27_27 = var10_10;
                                                    var28_28 = var26_26;
                                                    var29_29 = var15_15;
                                                    var15_15 = 0;
                                                    var25_25 = 0.0f;
                                                    var31_31 = null;
                                                } else {
                                                    var15_15 = 0;
                                                    var25_25 = 0.0f;
                                                    var31_31 = null;
                                                    var27_27 = 1;
                                                    var28_28 = 1.4E-45f;
                                                    var29_29 = 0;
                                                    var30_30 = 0.0f;
                                                }
                                            } else {
                                                var15_15 = var9_9.g(var17_17);
                                                var17_17 = var9_9.g(var16_16);
                                                var27_27 = var10_10;
                                                var28_28 = var26_26;
                                                var29_29 = var15_15;
                                                var15_15 = var17_17;
                                            }
                                        }
                                        if (var29_29 != 0 && var8_8 != null) {
                                            var10_10 = var1_1[var15_15];
                                            var8_8.setColor(var10_10);
                                            var25_25 = var19_19;
                                            var18_18 = var11_11;
                                            var24_24 = var19_19 + var29_29;
                                            var10_10 = var11_11 + 1;
                                            var22_22 = var10_10;
                                            var32_32 = 1;
                                            var33_33 = 1.4E-45f;
                                            var6_6.drawRect(var25_25, var18_18, var24_24, var22_22, var5_5);
                                        } else {
                                            var32_32 = 1;
                                            var33_33 = 1.4E-45f;
                                        }
                                        var19_19 += var29_29;
                                        if (var27_27 != 0) {
                                            var10_10 = var19_19;
                                            continue block10;
                                        }
                                        var10_10 = var27_27;
                                        var26_26 = var28_28;
                                        var20_20 = 1;
                                    }
                                }
                                case 17: {
                                    var32_32 = 1;
                                    var33_33 = 1.4E-45f;
                                    if (var7_7 == var21_21) {
                                        var31_31 = var13_13 == null ? cw0_2.j : var13_13;
                                        var34_34 = var31_31;
                                    } else {
                                        var27_27 = 0;
                                        var28_28 = 0.0f;
                                        var34_34 = null;
                                    }
                                    var20_20 = var10_10;
                                    var10_10 = 0;
                                    var26_26 = 0.0f;
                                    while (true) {
                                        if ((var15_15 = var9_9.g(var23_23)) == 0) ** GOTO lbl118
                                        var29_29 = var10_10;
                                        var30_30 = var26_26;
lbl115:
                                        // 2 sources

                                        while (true) {
                                            var35_35 = 1;
                                            ** GOTO lbl177
                                            break;
                                        }
lbl118:
                                        // 1 sources

                                        var15_15 = (int)var9_9.f();
                                        if (var15_15 != 0) ** GOTO lbl137
                                        var15_15 = var9_9.g(var21_21);
                                        if (var15_15 == 0) ** GOTO lbl129
                                        var29_29 = var10_10;
                                        var30_30 = var26_26;
                                        var35_35 = var15_15 += 2;
                                        var15_15 = 0;
                                        var25_25 = 0.0f;
                                        var31_31 = null;
                                        ** GOTO lbl177
lbl129:
                                        // 1 sources

                                        var15_15 = 0;
                                        var25_25 = 0.0f;
                                        var31_31 = null;
                                        var29_29 = 1;
                                        var30_30 = 1.4E-45f;
lbl134:
                                        // 2 sources

                                        while (true) {
                                            var35_35 = 0;
                                            ** GOTO lbl177
                                            break;
                                        }
lbl137:
                                        // 1 sources

                                        var15_15 = (int)var9_9.f();
                                        if (var15_15 != 0) ** GOTO lbl147
                                        var15_15 = var9_9.g(var19_19) + var23_23;
                                        var17_17 = var9_9.g(var23_23);
lbl141:
                                        // 3 sources

                                        while (true) {
                                            var29_29 = var10_10;
                                            var30_30 = var26_26;
                                            var35_35 = var15_15;
                                            var15_15 = var17_17;
                                            ** GOTO lbl177
                                            break;
                                        }
lbl147:
                                        // 1 sources

                                        var15_15 = var9_9.g(var19_19);
                                        if (var15_15 == 0) ** GOTO lbl171
                                        if (var15_15 == var32_32) ** GOTO lbl164
                                        if (var15_15 == var19_19) ** GOTO lbl161
                                        if (var15_15 != var21_21) {
                                            var29_29 = var10_10;
                                            var30_30 = var26_26;
                                            var15_15 = 0;
                                            var25_25 = 0.0f;
                                            var31_31 = null;
                                            ** continue;
                                        }
                                        var15_15 = var9_9.g(var16_16) + 25;
                                        var17_17 = var9_9.g(var23_23);
                                        ** GOTO lbl141
lbl161:
                                        // 1 sources

                                        var15_15 = var9_9.g(var23_23) + 9;
                                        var17_17 = var9_9.g(var23_23);
                                        ** continue;
lbl164:
                                        // 1 sources

                                        var29_29 = var10_10;
                                        var30_30 = var26_26;
                                        var15_15 = 0;
                                        var25_25 = 0.0f;
                                        var31_31 = null;
                                        var35_35 = 2;
                                        ** GOTO lbl177
lbl171:
                                        // 1 sources

                                        var29_29 = var10_10;
                                        var30_30 = var26_26;
                                        var15_15 = 0;
                                        var25_25 = 0.0f;
                                        var31_31 = null;
                                        ** continue;
lbl177:
                                        // 5 sources

                                        if (var35_35 != 0 && var8_8 != null) {
                                            if (var34_34 != null) {
                                                var15_15 = var34_34[var15_15];
                                            }
                                            var10_10 = var1_1[var15_15];
                                            var8_8.setColor(var10_10);
                                            var25_25 = var20_20;
                                            var18_18 = var11_11;
                                            var10_10 = var20_20 + var35_35;
                                            var26_26 = var10_10;
                                            var23_23 = var11_11 + 1;
                                            var36_36 = var23_23;
                                            var24_24 = var26_26;
                                            var16_16 = 3;
                                            var22_22 = var36_36;
                                            var37_37 = var20_20;
                                            var6_6.drawRect(var25_25, var18_18, var26_26, var36_36, var5_5);
                                        } else {
                                            var37_37 = var20_20;
                                            var16_16 = 3;
                                        }
                                        var20_20 = var37_37 + var35_35;
                                        if (var29_29 != 0) {
                                            var9_9.c();
lbl199:
                                            // 2 sources

                                            while (true) {
                                                var10_10 = var20_20;
                                                continue block10;
                                                break;
                                            }
                                        }
                                        var10_10 = var29_29;
                                        var26_26 = var30_30;
                                        var23_23 = 4;
                                        var24_24 = 5.6E-45f;
                                        var21_21 = 3;
                                        var22_22 = 4.2E-45f;
                                        var16_16 = 8;
                                    }
                                }
                                case 16: 
                            }
                            var32_32 = 1;
                            var33_33 = 1.4E-45f;
                            var16_16 = 3;
                            if (var7_7 == var16_16) {
                                var31_31 = var12_12 == null ? cw0_2.i : var12_12;
lbl216:
                                // 3 sources

                                while (true) {
                                    var34_34 = var31_31;
                                    break block55;
                                    break;
                                }
                            }
                            if (var7_7 != var19_19) break block57;
                            if (var14_14 != null) break block58;
                            var31_31 = cw0_2.h;
                            ** GOTO lbl216
                        }
                        var31_31 = var14_14;
                        ** continue;
                    }
                    var27_27 = 0;
                    var28_28 = 0.0f;
                    var34_34 = null;
                }
                var20_20 = var10_10;
                var10_10 = 0;
                var26_26 = 0.0f;
                while (true) {
                    if ((var15_15 = var9_9.g(var19_19)) != 0) {
                        var29_29 = var10_10;
                        var30_30 = var26_26;
lbl238:
                        // 2 sources

                        while (true) {
                            var23_23 = 4;
                            var24_24 = 5.6E-45f;
                            var21_21 = 8;
                            var22_22 = 1.1E-44f;
                            var35_35 = 1;
                            break;
                        }
                    } else {
                        var15_15 = (int)var9_9.f();
                        if (var15_15 != 0) {
                            var15_15 = var9_9.g(var16_16) + var16_16;
                            var17_17 = var9_9.g(var19_19);
                            var29_29 = var10_10;
                            var30_30 = var26_26;
                            var35_35 = var15_15;
                            var15_15 = var17_17;
                            var23_23 = 4;
                            var24_24 = 5.6E-45f;
                            var21_21 = 8;
                            var22_22 = 1.1E-44f;
                        } else {
                            var15_15 = (int)var9_9.f();
                            if (var15_15 != 0) {
                                var29_29 = var10_10;
                                var30_30 = var26_26;
                                var15_15 = 0;
                                var25_25 = 0.0f;
                                var31_31 = null;
                                ** continue;
                            }
                            var15_15 = var9_9.g(var19_19);
                            if (var15_15 != 0) {
                                if (var15_15 != var32_32) {
                                    if (var15_15 != var19_19) {
                                        if (var15_15 != var16_16) {
                                            var29_29 = var10_10;
                                            var30_30 = var26_26;
                                            var15_15 = 0;
                                            var25_25 = 0.0f;
                                            var31_31 = null;
                                            var23_23 = 4;
                                            var24_24 = 5.6E-45f;
                                            var21_21 = 8;
                                            var22_22 = 1.1E-44f;
lbl280:
                                            // 2 sources

                                            while (true) {
                                                var35_35 = 0;
                                                break;
                                            }
                                        } else {
                                            var21_21 = 8;
                                            var22_22 = 1.1E-44f;
                                            var15_15 = var9_9.g(var21_21) + 29;
                                            var17_17 = var9_9.g(var19_19);
                                            var29_29 = var10_10;
                                            var30_30 = var26_26;
                                            var35_35 = var15_15;
                                            var15_15 = var17_17;
                                            var23_23 = 4;
                                            var24_24 = 5.6E-45f;
                                        }
                                    } else {
                                        var23_23 = 4;
                                        var24_24 = 5.6E-45f;
                                        var21_21 = 8;
                                        var22_22 = 1.1E-44f;
                                        var15_15 = var9_9.g(var23_23) + 12;
                                        var17_17 = var9_9.g(var19_19);
                                        var29_29 = var10_10;
                                        var30_30 = var26_26;
                                        var35_35 = var15_15;
                                        var15_15 = var17_17;
                                    }
                                } else {
                                    var23_23 = 4;
                                    var24_24 = 5.6E-45f;
                                    var21_21 = 8;
                                    var22_22 = 1.1E-44f;
                                    var29_29 = var10_10;
                                    var30_30 = var26_26;
                                    var15_15 = 0;
                                    var25_25 = 0.0f;
                                    var31_31 = null;
                                    var35_35 = 2;
                                }
                            } else {
                                var23_23 = 4;
                                var24_24 = 5.6E-45f;
                                var21_21 = 8;
                                var22_22 = 1.1E-44f;
                                var15_15 = 0;
                                var25_25 = 0.0f;
                                var31_31 = null;
                                var29_29 = 1;
                                var30_30 = 1.4E-45f;
                                ** continue;
                            }
                        }
                    }
                    if (var35_35 != 0 && var8_8 != null) {
                        if (var34_34 != null) {
                            var15_15 = var34_34[var15_15];
                        }
                        var10_10 = var1_1[var15_15];
                        var8_8.setColor(var10_10);
                        var25_25 = var20_20;
                        var18_18 = var11_11;
                        var10_10 = var20_20 + var35_35;
                        var26_26 = var10_10;
                        var33_33 = var11_11 + 1;
                        var36_36 = 5.6E-45f;
                        var24_24 = var26_26;
                        var22_22 = var33_33;
                        var32_32 = var20_20;
                        var6_6.drawRect(var25_25, var18_18, var26_26, var33_33, var5_5);
                    } else {
                        var32_32 = var20_20;
                        var36_36 = 5.6E-45f;
                    }
                    var20_20 = var32_32 + var35_35;
                    if (var29_29 != 0) {
                        var9_9.c();
                        ** continue;
                    }
                    var10_10 = var29_29;
                    var26_26 = var30_30;
                    var32_32 = 1;
                    var33_33 = 1.4E-45f;
                }
            }
            var11_11 += 2;
            var10_10 = var3_3;
        }
    }

    public static Cw0$a i(Vm2 vm2, int n3) {
        int n4;
        Object object = vm2;
        int n7 = 8;
        int n8 = vm2.g(n7);
        vm2.o(n7);
        int n10 = 2;
        int n14 = n3 + -2;
        int n15 = -8421505;
        int n16 = -1;
        int n17 = -16777216;
        int[] nArray = new int[]{0, n16, n17, n15};
        int[] nArray2 = cw0_2.e();
        int[] nArray3 = cw0_2.f();
        while (n14 > 0) {
            int n18;
            int n19;
            int n20;
            int n21;
            int n22 = ((Vm2)object).g(n7);
            int n24 = ((Vm2)object).g(n7);
            int n25 = n24 & 0x80;
            int[] nArray4 = n25 != 0 ? nArray : ((n25 = n24 & 0x40) != 0 ? nArray2 : nArray3);
            if ((n24 &= 1) != 0) {
                n24 = ((Vm2)object).g(n7);
                n21 = ((Vm2)object).g(n7);
                n20 = ((Vm2)object).g(n7);
                n19 = ((Vm2)object).g(n7);
                n14 += -6;
            } else {
                n21 = ((Vm2)object).g(6) << n10;
                n20 = 4;
                n19 = ((Vm2)object).g(n20) << n20;
                n20 = ((Vm2)object).g(n20) << 4;
                n18 = ((Vm2)object).g(n10);
                n24 = n18 << 6;
                n14 += -4;
                int n26 = n19;
                n19 = n24;
                n24 = n21;
                n21 = n26;
            }
            n18 = 255;
            if (n24 == 0) {
                n21 = 0;
                n20 = 0;
                n19 = 255;
            }
            n19 &= n18;
            n19 = (byte)(255 - n19);
            n3 = n14;
            double d2 = n24;
            n4 = n8;
            double d5 = n21 += -128;
            double d7 = 1.402 * d5;
            double d9 = d7 + d2;
            n24 = (int)d9;
            double d12 = n20 += -128;
            double d13 = 0.34414 * d12;
            d13 = d2 - d13;
            double d14 = 0.71414;
            d5 *= d14;
            d5 = d13 - d5;
            n7 = (int)d5;
            d13 = 1.772;
            d12 = d12 * d13 + d2;
            n8 = (int)d12;
            n14 = gz3.h(n24, 0, n18);
            n7 = gz3.h(n7, 0, n18);
            n8 = gz3.h(n8, 0, n18);
            nArray4[n22] = n7 = cw0_2.g(n19, n14, n7, n8);
            n14 = n3;
            n8 = n4;
            n7 = 8;
            n10 = 2;
        }
        n4 = n8;
        n7 = n8;
        object = new Cw0$a(n8, nArray, nArray2, nArray3);
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public static Cw0$c j(Vm2 var0) {
        block3: {
            var1_1 = 16;
            var2_2 = var0.g(var1_1);
            var0.o(4);
            var3_3 = var0.g(2);
            var4_4 = var0.f();
            var5_5 = 1;
            var0.o(var5_5);
            var6_6 = gz3.f;
            if (var3_3 != var5_5) break block3;
            var3_3 = var0.g(8) * 16;
            var0.o(var3_3);
            ** GOTO lbl-1000
        }
        if (var3_3 != 0) ** GOTO lbl-1000
        var3_3 = var0.g(var1_1);
        var1_1 = var0.g(var1_1);
        if (var3_3 > 0) {
            var6_6 = new byte[var3_3];
            var0.j(var3_3, var6_6);
        }
        if (var1_1 > 0) {
            var7_7 = new byte[var1_1];
            var0.j(var1_1, var7_7);
        } else lbl-1000:
        // 3 sources

        {
            var7_7 = var6_6;
        }
        var0 = new Cw0$c(var2_2, var4_4, var6_6, var7_7);
        return var0;
    }

    public final /* synthetic */ lf3_0 a(int n3, byte[] byArray, int n4) {
        return uf3_0.a(this, byArray, n4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(byte[] var1_1, int var2_2, int var3_3, Vf3$b var4_4, n60_0 var5_5) {
        var6_6 = this;
        var7_7 /* !! */  = var2_2;
        var9_9 = var2_2 + var3_3;
        var10_10 = var1_1;
        var8_8 = new Vm2(var1_1, var9_9);
        var8_8.m(var2_2);
        while (true) {
            var7_7 /* !! */  = var8_8.b();
            var9_9 = 2;
            var11_11 = 1;
            var12_12 = 48;
            var13_13 = 3;
            var14_14 = var6_6.f;
            if (var7_7 /* !! */  < var12_12) break;
            var7_7 /* !! */  = 8;
            var15_15 = 1.1E-44f;
            var12_12 = var8_8.g(var7_7 /* !! */ );
            if (var12_12 != (var16_16 = 15)) break;
            var12_12 = var8_8.g(var7_7 /* !! */ );
            var16_16 = 16;
            var17_17 = var8_8.g(var16_16);
            var18_18 = var8_8.g(var16_16);
            var19_19 = var8_8.d() + var18_18;
            var20_20 = var18_18 * 8;
            var21_21 = var8_8.b();
            if (var20_20 > var21_21) {
                var22_22 = "Data field length exceeds limit";
                Cx.f((String)var22_22);
                var7_7 /* !! */  = var8_8.b();
                var8_8.o(var7_7 /* !! */ );
                continue;
            }
            var20_20 = 4;
            var23_23 = 5.6E-45f;
            switch (var12_12) {
                default: {
                    break;
                }
                case 20: {
                    var7_7 /* !! */  = var14_14.a;
                    if (var17_17 != var7_7 /* !! */ ) break;
                    var8_8.o(var20_20);
                    var7_7 /* !! */  = (int)var8_8.f();
                    var8_8.o(var13_13);
                    var21_21 = var8_8.g(var16_16);
                    var24_24 = var8_8.g(var16_16);
                    if (var7_7 /* !! */  != 0) {
                        var25_25 = var8_8.g(var16_16);
                        var7_7 /* !! */  = var8_8.g(var16_16);
                        var9_9 = var8_8.g(var16_16);
                        var11_11 = var8_8.g(var16_16);
                        var26_26 = var7_7 /* !! */ ;
                        var27_27 = var9_9;
                        var28_28 = var11_11;
                        var29_29 = var25_25;
                    } else {
                        var26_26 = var21_21;
                        var28_28 = var24_24;
                        var29_29 = 0;
                        var30_30 = null;
                        var27_27 = 0;
                        var31_31 = null;
                    }
                    var14_14.h = var22_22 = new Cw0$b(var21_21, var24_24, var29_29, var26_26, var27_27, var28_28);
                    break;
                }
                case 19: {
                    var7_7 /* !! */  = var14_14.a;
                    if (var17_17 == var7_7 /* !! */ ) {
                        var22_22 = cw0_2.j((Vm2)var8_8);
                        var32_32 /* !! */  = var14_14.e;
                        var11_11 = var22_22.a;
                        var32_32 /* !! */ .put(var11_11, var22_22);
                        break;
                    }
                    var7_7 /* !! */  = var14_14.b;
                    if (var17_17 != var7_7 /* !! */ ) break;
                    var22_22 = cw0_2.j((Vm2)var8_8);
                    var32_32 /* !! */  = var14_14.g;
                    var11_11 = var22_22.a;
                    var32_32 /* !! */ .put(var11_11, var22_22);
                    break;
                }
                case 18: {
                    var7_7 /* !! */  = var14_14.a;
                    if (var17_17 == var7_7 /* !! */ ) {
                        var22_22 = cw0_2.i((Vm2)var8_8, var18_18);
                        var32_32 /* !! */  = var14_14.d;
                        var11_11 = var22_22.a;
                        var32_32 /* !! */ .put(var11_11, var22_22);
                        break;
                    }
                    var7_7 /* !! */  = var14_14.b;
                    if (var17_17 != var7_7 /* !! */ ) break;
                    var22_22 = cw0_2.i((Vm2)var8_8, var18_18);
                    var32_32 /* !! */  = var14_14.f;
                    var11_11 = var22_22.a;
                    var32_32 /* !! */ .put(var11_11, var22_22);
                    break;
                }
                case 17: {
                    var33_33 /* !! */  = var14_14.i;
                    var21_21 = var14_14.a;
                    if (var17_17 != var21_21 || var33_33 /* !! */  == null) break;
                    var17_17 = var8_8.g(var7_7 /* !! */ );
                    var8_8.o(var20_20);
                    var26_26 = var8_8.f();
                    var8_8.o(var13_13);
                    var27_27 = var8_8.g(var16_16);
                    var28_28 = var8_8.g(var16_16);
                    var8_8.g(var13_13);
                    var34_34 = var8_8.g(var13_13);
                    var8_8.o(var9_9);
                    var35_35 = var8_8.g(var7_7 /* !! */ );
                    var36_36 = var8_8.g(var7_7 /* !! */ );
                    var37_37 = var8_8.g(var20_20);
                    var38_38 = var8_8.g(var9_9);
                    var8_8.o(var9_9);
                    var18_18 += -10;
                    var39_39 = new SparseArray();
                    while (var18_18 > 0) {
                        var21_21 = var8_8.g(var16_16);
                        var24_24 = var8_8.g(var9_9);
                        var8_8.g(var9_9);
                        var25_25 = 12;
                        var16_16 = var8_8.g(var25_25);
                        var8_8.o(var20_20);
                        var25_25 = var8_8.g(var25_25);
                        var29_29 = var18_18 + -6;
                        if (var24_24 != var11_11 && var24_24 != var9_9) {
                            var18_18 = var29_29;
                        } else {
                            var8_8.g(var7_7 /* !! */ );
                            var8_8.g(var7_7 /* !! */ );
                            var18_18 += -8;
                        }
                        var40_40 = new Cw0$g(var16_16, var25_25);
                        var39_39.put(var21_21, var40_40);
                        var16_16 = 16;
                    }
                    var40_40 = var22_22;
                    var29_29 = var17_17;
                    var22_22 = new Cw0$f(var17_17, (boolean)var26_26, var27_27, var28_28, var34_34, var35_35, var36_36, var37_37, var38_38, var39_39);
                    var32_32 /* !! */  = var14_14.c;
                    var11_11 = var33_33 /* !! */ .b;
                    if (var11_11 == 0 && (var10_10 = (Object)((Cw0$f)var32_32 /* !! */ .get(var17_17))) != null) {
                        var41_41 = null;
                        for (var25_25 = 0; var25_25 < (var13_13 = (var33_33 /* !! */  = var10_10.j).size()); ++var25_25) {
                            var13_13 = var33_33 /* !! */ .keyAt(var25_25);
                            var33_33 /* !! */  = (Cw0$g)var33_33 /* !! */ .valueAt(var25_25);
                            var14_14 = var22_22.j;
                            var14_14.put(var13_13, (Object)var33_33 /* !! */ );
                        }
                    }
                    var11_11 = var22_22.a;
                    var32_32 /* !! */ .put(var11_11, var22_22);
                    break;
                }
                case 16: {
                    var11_11 = var14_14.a;
                    if (var17_17 != var11_11) break;
                    var10_10 = var14_14.i;
                    var8_8.g(var7_7 /* !! */ );
                    var12_12 = var8_8.g(var20_20);
                    var13_13 = var8_8.g(var9_9);
                    var8_8.o(var9_9);
                    var18_18 += -2;
                    var32_32 /* !! */  = new SparseArray();
                    while (var18_18 > 0) {
                        var25_25 = var8_8.g(var7_7 /* !! */ );
                        var8_8.o(var7_7 /* !! */ );
                        var16_16 = 16;
                        var17_17 = var8_8.g(var16_16);
                        var20_20 = var8_8.g(var16_16);
                        var18_18 += -6;
                        var42_42 /* !! */  = new Cw0$e(var17_17, var20_20);
                        var32_32 /* !! */ .put(var25_25, (Object)var42_42 /* !! */ );
                    }
                    var22_22 = new Cw0$d(var12_12, var13_13, var32_32 /* !! */ );
                    if (var13_13 != 0) {
                        var14_14.i = var22_22;
                        var14_14.c.clear();
                        var14_14.d.clear();
                        var22_22 = var14_14.e;
                        var22_22.clear();
                        break;
                    }
                    if (var10_10 == null || (var9_9 = var10_10.a) == var12_12) break;
                    var14_14.i = var22_22;
                }
            }
            var7_7 /* !! */  = var8_8.d();
            var8_8.p(var19_19 -= var7_7 /* !! */ );
        }
        if ((var22_22 = var14_14.i) == null) {
            var43_43 = ImmutableList.of();
            var44_45 = -9223372036854775807L;
            var46_47 = -9223372036854775807L;
            var48_49 = var22_22;
            var22_22 = new We0(var43_43, var44_45, var46_47);
lbl192:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var8_8 = var14_14.h;
        if (var8_8 == null) {
            var8_8 = var6_6.d;
        }
        var33_33 /* !! */  = var6_6.g;
        var41_41 = var6_6.c;
        if (var33_33 /* !! */  == null || (var16_16 = var8_8.a + var11_11) != (var12_12 = var33_33 /* !! */ .getWidth()) || (var12_12 = var8_8.b + var11_11) != (var16_16 = (var48_50 /* !! */  = var6_6.g).getHeight())) {
            var12_12 = var8_8.a + var11_11;
            var16_16 = var8_8.b + var11_11;
            var43_44 /* !! */  = Bitmap.Config.ARGB_8888;
            var6_6.g = var33_33 /* !! */  = Bitmap.createBitmap((int)var12_12, (int)var16_16, (Bitmap.Config)var43_44 /* !! */ );
            var41_41.setBitmap(var33_33 /* !! */ );
        }
        var33_33 /* !! */  = new ArrayList();
        var24_24 = 0;
        var40_40 = null;
        while (var24_24 < (var17_17 = (var48_50 /* !! */  = var22_22.c).size())) {
            var41_41.save();
            var43_44 /* !! */  = (Cw0$e)var48_50 /* !! */ .valueAt(var24_24);
            var16_16 = var48_50 /* !! */ .keyAt(var24_24);
            var49_51 = var14_14.c;
            var42_42 /* !! */  = var48_50 /* !! */  = var49_51.get(var16_16);
            var42_42 /* !! */  = (Cw0$f)var48_50 /* !! */ ;
            var16_16 = var43_44 /* !! */ .a;
            var18_18 = var8_8.c;
            var20_20 = var16_16 + var18_18;
            var16_16 = var43_44 /* !! */ .b;
            var17_17 = var8_8.e;
            var19_19 = var16_16 + var17_17;
            var16_16 = var42_42 /* !! */ .c + var20_20;
            var17_17 = var8_8.d;
            var16_16 = Math.min(var16_16, var17_17);
            var18_18 = var42_42 /* !! */ .d;
            var17_17 = var19_19 + var18_18;
            var11_11 = var8_8.f;
            var11_11 = Math.min(var17_17, var11_11);
            var41_41.clipRect(var20_20, var19_19, var16_16, var11_11);
            var10_10 = var14_14.d;
            var16_16 = var42_42 /* !! */ .f;
            var10_10 = (Cw0$a)var10_10.get(var16_16);
            if (var10_10 == null && (var10_10 = (Object)((Cw0$a)var14_14.f.get(var16_16))) == null) {
                var10_10 = var6_6.e;
            }
            var16_16 = 0;
            var48_50 /* !! */  = null;
            while (var16_16 < (var13_13 = (var32_32 /* !! */  = var42_42 /* !! */ .j).size())) {
                block40: {
                    block38: {
                        block39: {
                            var13_13 = var32_32 /* !! */ .keyAt(var16_16);
                            var32_32 /* !! */  = (Cw0$g)var32_32 /* !! */ .valueAt(var16_16);
                            var30_30 = var22_22;
                            var22_22 = (Cw0$c)var14_14.e.get(var13_13);
                            if (var22_22 == null) {
                                var22_22 = (Cw0$c)var14_14.g.get(var13_13);
                            }
                            if (var22_22 == null) break block38;
                            var13_13 = (int)var22_22.b;
                            if (var13_13 != 0) {
                                var13_13 = 0;
                                var39_39 = null;
lbl250:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var39_39 = var6_6.a;
                            ** continue;
                            var50_52 = var14_14;
                            var51_53 = var32_32 /* !! */ .a + var20_20;
                            var9_9 = var32_32 /* !! */ .b + var19_19;
                            var31_31 = var33_33 /* !! */ ;
                            var12_12 = var42_42 /* !! */ .e;
                            var28_28 = var16_16;
                            var16_16 = 3;
                            if (var12_12 == var16_16) {
                                var48_50 /* !! */  = (Bitmap)var10_10.d;
lbl263:
                                // 3 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var16_16 = 2;
                            if (var12_12 != var16_16) break block39;
                            var48_50 /* !! */  = (Bitmap)var10_10.c;
                            ** GOTO lbl263
                        }
                        var48_50 /* !! */  = (Bitmap)var10_10.b;
                        ** continue;
                        var52_54 /* !! */  = var48_50 /* !! */ ;
                        var48_50 /* !! */  = (Bitmap)var22_22.c;
                        var53_55 = var8_8;
                        var54_56 = var17_17;
                        var43_44 /* !! */  = var52_54 /* !! */ ;
                        var55_57 = var18_18;
                        var18_18 = var12_12;
                        var36_36 = var17_17;
                        var54_56 = var19_19;
                        var19_19 = var51_53;
                        var37_37 = var54_56;
                        var54_56 = var20_20;
                        var20_20 = var9_9;
                        var38_38 = var54_56;
                        var8_8 = var42_42 /* !! */ ;
                        var42_42 /* !! */  = var39_39;
                        var56_58 = var24_24;
                        var40_40 = var41_41;
                        cw0_2.h((byte[])var48_50 /* !! */ , (int[])var52_54 /* !! */ , var12_12, var51_53, var9_9, (Paint)var39_39, var41_41);
                        var20_20 = var9_9 + 1;
                        var48_50 /* !! */  = (Bitmap)var22_22.d;
                        cw0_2.h((byte[])var48_50 /* !! */ , (int[])var52_54 /* !! */ , var12_12, var51_53, var20_20, (Paint)var39_39, var41_41);
                        break block40;
                    }
                    var53_55 = var8_8;
                    var31_31 = var33_33 /* !! */ ;
                    var50_52 = var14_14;
                    var28_28 = var16_16;
                    var36_36 = var17_17;
                    var55_57 = var18_18;
                    var37_37 = var19_19;
                    var38_38 = var20_20;
                    var8_8 = var42_42 /* !! */ ;
                    var56_58 = var24_24;
                }
                var16_16 = var28_28 + 1;
                var42_42 /* !! */  = var8_8;
                var22_22 = var30_30;
                var14_14 = var50_52;
                var33_33 /* !! */  = var31_31;
                var8_8 = var53_55;
                var17_17 = var36_36;
                var19_19 = var37_37;
                var20_20 = var38_38;
                var24_24 = var56_58;
                var18_18 = var55_57;
                var13_13 = 3;
            }
            var30_30 = var22_22;
            var53_55 = var8_8;
            var31_31 = var33_33 /* !! */ ;
            var50_52 = var14_14;
            var36_36 = var17_17;
            var55_57 = var18_18;
            var37_37 = var19_19;
            var38_38 = var20_20;
            var8_8 = var42_42 /* !! */ ;
            var56_58 = var24_24;
            var7_7 /* !! */  = (int)var42_42 /* !! */ .b;
            var9_9 = var42_42 /* !! */ .c;
            if (var7_7 /* !! */  != 0) {
                var7_7 /* !! */  = var42_42 /* !! */ .e;
                var12_12 = 3;
                if (var7_7 /* !! */  == var12_12) {
                    var22_22 = var10_10.d;
                    var54_56 = var42_42 /* !! */ .g;
                    var7_7 /* !! */  = (int)var22_22[var54_56];
                    var13_13 = 2;
                } else {
                    var13_13 = 2;
                    if (var7_7 /* !! */  == var13_13) {
                        var22_22 = var10_10.c;
                        var54_56 = var42_42 /* !! */ .h;
                        var7_7 /* !! */  = (int)var22_22[var54_56];
                    } else {
                        var22_22 = var10_10.b;
                        var54_56 = var42_42 /* !! */ .i;
                        var7_7 /* !! */  = (int)var22_22[var54_56];
                    }
                }
                var42_42 /* !! */  = var6_6.b;
                var42_42 /* !! */ .setColor(var7_7 /* !! */ );
                var7_7 /* !! */  = var38_38;
                var57_59 = var38_38;
                var54_56 = var37_37;
                var58_60 = var37_37;
                var20_20 = var38_38 + var9_9;
                var59_61 = var20_20;
                var11_11 = var36_36;
                var23_23 = var36_36;
                var48_50 /* !! */  = var41_41;
                var41_41.drawRect(var57_59, var58_60, var59_61, var23_23, (Paint)var42_42 /* !! */ );
            } else {
                var54_56 = var19_19;
                var7_7 /* !! */  = var20_20;
                var12_12 = 3;
                var13_13 = 2;
            }
            var10_10 = new Pe0$a;
            var10_10();
            var14_14 = var6_6.g;
            var16_16 = var55_57;
            var14_14 = Bitmap.createBitmap((Bitmap)var14_14, (int)var7_7 /* !! */ , (int)var54_56, (int)var9_9, (int)var55_57);
            var10_10.b = var14_14;
            var15_15 = var7_7 /* !! */ ;
            var14_14 = var53_55;
            var17_17 = var53_55.a;
            var57_59 = var17_17;
            var10_10.h = var15_15 /= var57_59;
            var7_7 /* !! */  = 0;
            var10_10.i = 0;
            var60_62 = var54_56;
            var18_18 = var53_55.b;
            var58_60 = var18_18;
            var10_10.e = var60_62 /= var58_60;
            var10_10.f = 0;
            var10_10.g = 0;
            var10_10.l = var15_15 = (float)var9_9 / var57_59;
            var10_10.m = var15_15 = (float)var55_57 / var58_60;
            var22_22 = var10_10.a();
            var8_8 = var31_31;
            var31_31.add(var22_22);
            var22_22 = PorterDuff.Mode.CLEAR;
            var32_32 /* !! */  = null;
            var41_41.drawColor(0, (PorterDuff.Mode)var22_22);
            var41_41.restore();
            var24_24 = var56_58 + 1;
            var33_33 /* !! */  = var31_31;
            var8_8 = var53_55;
            var22_22 = var30_30;
            var14_14 = var50_52;
            var9_9 = 2;
            var11_11 = 1;
            var13_13 = 3;
        }
        var8_8 = var33_33 /* !! */ ;
        var44_46 = -9223372036854775807L;
        var46_48 = -9223372036854775807L;
        var48_50 /* !! */  = var22_22;
        var43_44 /* !! */  = var33_33 /* !! */ ;
        var22_22 = new We0((List)var33_33 /* !! */ , var44_46, var46_48);
        ** while (true)
        var8_8 = var5_5;
        var5_5.accept(var22_22);
    }

    public final int c() {
        return 2;
    }

    public final void reset() {
        Cw0$h cw0$h = this.f;
        cw0$h.c.clear();
        cw0$h.d.clear();
        cw0$h.e.clear();
        cw0$h.f.clear();
        cw0$h.g.clear();
        cw0$h.h = null;
        cw0$h.i = null;
    }
}

