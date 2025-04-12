/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.InputDevice
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.ViewConfiguration
 */
import android.content.Context;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.util.Objects;

public final class rq0 {
    public final Context a;
    public final sq0_0 b;
    public final rq0$b c;
    public final rq0$a d;
    public VelocityTracker e;
    public float f;
    public int g;
    public int h;
    public int i;
    public final int[] j;

    public rq0(Context context, sq0_0 sq0_02) {
        int n3;
        av_0 av_02;
        qq0 qq02;
        super();
        this.g = n3 = -1;
        this.h = n3;
        this.i = n3;
        int[] nArray = new int[]{-1 >>> 1, 0};
        this.j = nArray;
        this.a = context;
        this.b = sq0_02;
        this.c = qq02;
        this.d = av_02;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(MotionEvent var1_1, int var2_2) {
        block52: {
            block53: {
                block51: {
                    block48: {
                        block50: {
                            block49: {
                                block47: {
                                    block46: {
                                        block39: {
                                            block41: {
                                                block45: {
                                                    block44: {
                                                        block42: {
                                                            block43: {
                                                                block40: {
                                                                    var3_3 = this;
                                                                    var4_4 = var1_1;
                                                                    var5_5 = var2_2;
                                                                    var6_6 = var1_1.getSource();
                                                                    var7_7 = var1_1.getDeviceId();
                                                                    var8_8 /* !! */  = this.h;
                                                                    var9_9 = 34;
                                                                    var10_10 = 0x400000;
                                                                    var11_11 = 5.877472E-39f;
                                                                    var12_12 = this.j;
                                                                    if (var8_8 /* !! */  != var6_6 || (var8_8 /* !! */  = this.i) != var7_7 || (var8_8 /* !! */  = this.g) != var2_2) break block40;
                                                                    var13_13 = 0;
                                                                    var14_14 = null;
                                                                    var15_15 = 0;
                                                                    var16_16 = null;
                                                                    break block41;
                                                                }
                                                                ((qq0)var3_3.c).getClass();
                                                                var17_17 /* !! */  = var3_3.a;
                                                                var18_18 = ViewConfiguration.get((Context)var17_17 /* !! */ );
                                                                var15_15 = var1_1.getDeviceId();
                                                                var13_13 = var1_1.getSource();
                                                                var19_19 = Build.VERSION.SDK_INT;
                                                                var20_20 = "android";
                                                                var21_21 = "dimen";
                                                                var22_22 = -1;
                                                                if (var19_19 >= var9_9) {
                                                                    var13_13 = OC3$c.b(var18_18, var15_15, var5_5, var13_13);
lbl31:
                                                                    // 4 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var16_16 = InputDevice.getDevice((int)var15_15);
                                                                if (var16_16 == null || (var16_16 = var16_16.getMotionRange(var5_5, var13_13)) == null) break block42;
                                                                var16_16 = var17_17 /* !! */ .getResources();
                                                                if (var13_13 == var10_10 && var5_5 == (var13_13 = 26)) {
                                                                    var14_14 = "config_viewMinRotaryEncoderFlingVelocity";
                                                                    var13_13 = var16_16.getIdentifier((String)var14_14, var21_21, (String)var20_20);
                                                                } else {
                                                                    var13_13 = -1;
                                                                }
                                                                Objects.requireNonNull(var18_18);
                                                                if (var13_13 == var22_22) break block43;
                                                                if (var13_13 != 0 && (var13_13 = var16_16.getDimensionPixelSize(var13_13)) >= 0) ** GOTO lbl31
                                                                break block42;
                                                            }
                                                            var13_13 = var18_18.getScaledMinimumFlingVelocity();
                                                            ** GOTO lbl31
                                                        }
                                                        var13_13 = -1 >>> 1;
                                                        ** while (true)
                                                        var15_15 = 0;
                                                        var16_16 = null;
                                                        var12_12[0] = var13_13;
                                                        var13_13 = var1_1.getDeviceId();
                                                        var15_15 = var1_1.getSource();
                                                        if (var19_19 >= var9_9) {
                                                            var13_13 = OC3$c.a(var18_18, var13_13, var5_5, var15_15);
lbl59:
                                                            // 4 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var14_14 = InputDevice.getDevice((int)var13_13);
                                                        if (var14_14 != null && (var14_14 = var14_14.getMotionRange(var5_5, var15_15)) != null) {
                                                            var13_13 = 1;
                                                        } else {
                                                            var13_13 = 0;
                                                            var14_14 = null;
                                                        }
                                                        var19_19 = -1 << -1;
                                                        if (var13_13 != 0) break block44;
lbl69:
                                                        // 2 sources

                                                        while (true) {
                                                            var13_13 = -1 << -1;
                                                            ** GOTO lbl59
                                                            break;
                                                        }
                                                    }
                                                    var14_14 = var17_17 /* !! */ .getResources();
                                                    if (var15_15 != var10_10) ** GOTO lbl-1000
                                                    var8_8 /* !! */  = 26;
                                                    var25_25 = 3.6E-44f;
                                                    if (var5_5 == var8_8 /* !! */ ) {
                                                        var17_17 /* !! */  = "config_viewMaxRotaryEncoderFlingVelocity";
                                                        var23_23 = var14_14.getIdentifier((String)var17_17 /* !! */ , var21_21, (String)var20_20);
                                                    } else lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var23_23 = -1;
                                                        var24_24 = 0.0f / 0.0f;
                                                    }
                                                    Objects.requireNonNull(var18_18);
                                                    if (var23_23 == var22_22) break block45;
                                                    ** while (var23_23 == 0)
lbl87:
                                                    // 1 sources

                                                    var13_13 = var14_14.getDimensionPixelSize(var23_23);
                                                    if (var13_13 >= 0) {
                                                        var19_19 = var13_13;
                                                    }
                                                    var13_13 = var19_19;
                                                    ** GOTO lbl59
                                                }
                                                var13_13 = var18_18.getScaledMaximumFlingVelocity();
                                                ** while (true)
                                                var23_23 = 1;
                                                var24_24 = 1.4E-45f;
                                                var12_12[var23_23] = var13_13;
                                                var3_3.h = var6_6;
                                                var3_3.i = var7_7;
                                                var3_3.g = var5_5;
                                                var13_13 = 0;
                                                var14_14 = null;
                                                var15_15 = 1;
                                            }
                                            var23_23 = var12_12[0];
                                            var13_13 = -1 >>> 1;
                                            if (var23_23 == var13_13) {
                                                var4_4 = var3_3.e;
                                                if (var4_4 != null) {
                                                    var4_4.recycle();
                                                    var26_26 = false;
                                                    var27_28 = 0.0f;
                                                    var4_4 = null;
                                                    var3_3.e = null;
                                                }
                                                return;
                                            }
                                            var14_14 = var3_3.e;
                                            if (var14_14 == null) {
                                                var14_14 = VelocityTracker.obtain();
                                                var3_3.e = var14_14;
                                            }
                                            var14_14 = var3_3.e;
                                            ((av_0)var3_3.d).getClass();
                                            var20_20 = cB3.a;
                                            var14_14.addMovement(var4_4);
                                            var23_23 = Build.VERSION.SDK_INT;
                                            var6_6 = 0;
                                            var28_30 = 0.0f;
                                            if (var23_23 < var9_9 && (var23_23 = var1_1.getSource()) == var10_10) {
                                                var20_20 = cB3.a;
                                                var7_7 = (int)var20_20.containsKey(var14_14);
                                                if (var7_7 == 0) {
                                                    var29_31 = new db3_0();
                                                    var20_20.put(var14_14, var29_31);
                                                }
                                                var20_20 = (db3_0)var20_20.get(var14_14);
                                                var20_20.getClass();
                                                var30_32 = var1_1.getEventTime();
                                                var32_33 = var20_20.d;
                                                var33_34 = var20_20.b;
                                                if (var32_33 != 0) {
                                                    var32_33 = var20_20.e;
                                                    var34_35 = var33_34[var32_33];
                                                    var36_36 = 40;
                                                    cfr_temp_0 = (var34_35 = var30_32 - var34_35) - var36_36;
                                                    var32_33 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                    if (var32_33 > 0) {
                                                        var32_33 = 0;
                                                        var38_37 = 0.0f;
                                                        var21_21 = null;
                                                        var20_20.d = 0;
                                                        var20_20.c = 0.0f;
                                                    }
                                                }
                                                var32_33 = var20_20.e;
                                                var10_10 = 1;
                                                var11_11 = 1.4E-45f;
                                                var32_33 += var10_10;
                                                var22_22 = 20;
                                                var20_20.e = var32_33 %= var22_22;
                                                var39_38 = var20_20.d;
                                                if (var39_38 != var22_22) {
                                                    var20_20.d = var39_38 += var10_10;
                                                }
                                                var10_10 = 26;
                                                var11_11 = 3.6E-44f;
                                                var27_29 = var4_4.getAxisValue(var10_10);
                                                var40_39 = var20_20.a;
                                                var40_39[var32_33] = var27_29;
                                                var26_27 = var20_20.e;
                                                var33_34[var26_27] = var30_32;
                                            }
                                            var26_27 = 1000;
                                            var27_29 = 1.401E-42f;
                                            var23_23 = 0x7F7FFFFF;
                                            var24_24 = 3.4028235E38f;
                                            var14_14.computeCurrentVelocity(var26_27, var24_24);
                                            var29_31 = (db3_0)cB3.a.get(var14_14);
                                            if (var29_31 == null) break block46;
                                            var8_8 /* !! */  = var29_31.d;
                                            var32_33 = 2;
                                            var38_37 = 2.8E-45f;
                                            if (var8_8 /* !! */  < var32_33) lbl-1000:
                                            // 3 sources

                                            {
                                                while (true) {
                                                    var20_20 = var29_31;
                                                    var8_8 /* !! */  = 0;
                                                    var25_25 = 0.0f;
                                                    var17_17 /* !! */  = null;
                                                    break block39;
                                                    break;
                                                }
                                            }
                                            var19_19 = var29_31.e;
                                            var10_10 = 20;
                                            var11_11 = 2.8E-44f;
                                            var22_22 = var19_19 + 20;
                                            var39_38 = 1;
                                            var22_22 = (var22_22 - (var8_8 /* !! */  -= var39_38)) % var10_10;
                                            var17_17 /* !! */  = (Context)var29_31.b;
                                            var36_36 = (long)var17_17 /* !! */ [var19_19];
                                            while ((var19_19 = (int)((cfr_temp_1 = (var43_41 = var36_36 - (var41_40 = var17_17 /* !! */ [var22_22])) - (var45_42 /* !! */  = (long)100)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) > 0) {
                                                var19_19 = var29_31.d;
                                                var10_10 = 1;
                                                var11_11 = 1.4E-45f;
                                                var29_31.d = var19_19 -= var10_10;
                                                var22_22 += var10_10;
                                                var19_19 = 20;
                                                var22_22 %= var19_19;
                                            }
                                            var19_19 = 20;
                                            var10_10 = 1;
                                            var11_11 = 1.4E-45f;
                                            var39_38 = var29_31.d;
                                            if (var39_38 < var32_33) ** GOTO lbl-1000
                                            var47_43 = var29_31.a;
                                            if (var39_38 == var32_33) {
                                                var48_44 = var17_17 /* !! */ [var22_22 = (var22_22 + var10_10) % var19_19];
                                                cfr_temp_2 = var41_40 - var48_44;
                                                var8_8 /* !! */  = (int)(cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1));
                                                if (var8_8 /* !! */  != 0) ** break;
                                                ** continue;
                                                var25_25 = var47_43[var22_22];
                                                var38_37 = (float)(var48_44 -= var41_40);
                                                var25_25 /= var38_37;
                                                var20_20 = var29_31;
                                            } else {
                                                var32_33 = 0;
                                                var38_37 = 0.0f;
                                                var21_21 = null;
                                                var19_19 = 0;
                                                var33_34 = null;
                                                var10_10 = 0;
                                                var11_11 = 0.0f;
                                                var40_39 = null;
                                                while (true) {
                                                    var39_38 = var29_31.d + -1;
                                                    var50_45 = 2.0f;
                                                    var51_46 = 1.0f;
                                                    var52_47 = -1.0f;
                                                    if (var32_33 >= var39_38) break;
                                                    var39_38 = var32_33 + var22_22;
                                                    var56_50 = var17_17 /* !! */ [var39_38 = (var39_38 + 1) % 20];
                                                    var53_48 = var39_38 % 20;
                                                    var54_49 = var17_17 /* !! */ [var53_48];
                                                    cfr_temp_3 = var56_50 - var54_49;
                                                    var58_51 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 < 0 ? -1 : 1);
                                                    if (var58_51 == false) {
                                                        var20_20 = var29_31;
                                                        var26_27 = 1;
                                                        var27_29 = 1.4E-45f;
                                                    } else {
                                                        ++var19_19;
                                                        cfr_temp_4 = var11_11 - 0.0f;
                                                        var59_52 /* !! */  = (float)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1));
                                                        if (var59_52 /* !! */  < 0) {
                                                            var51_46 = -1.0f;
                                                        }
                                                        var52_47 = Math.abs(var11_11);
                                                        var24_24 = var52_47 * var50_45;
                                                        var60_53 = Math.sqrt(var24_24);
                                                        var27_29 = (float)var60_53;
                                                        var51_46 *= var27_29;
                                                        var27_29 = var47_43[var39_38];
                                                        var45_42 /* !! */  = (long)var17_17 /* !! */ [var39_38];
                                                        var20_20 = var29_31;
                                                        var62_54 = var45_42 /* !! */  - var54_49;
                                                        var28_30 = var62_54;
                                                        var27_29 /= var28_30;
                                                        var28_30 = var27_29 - var51_46;
                                                        var27_29 = Math.abs(var27_29) * var28_30;
                                                        var11_11 += var27_29;
                                                        var26_27 = 1;
                                                        var27_29 = 1.4E-45f;
                                                        if (var19_19 == var26_27) {
                                                            var6_6 = 0x3F000000;
                                                            var28_30 = 0.5f;
                                                            var11_11 *= var28_30;
                                                        }
                                                    }
                                                    var32_33 += var26_27;
                                                    var5_5 = var2_2;
                                                    var29_31 = var20_20;
                                                    var26_27 = 1000;
                                                    var27_29 = 1.401E-42f;
                                                    var23_23 = 0x7F7FFFFF;
                                                    var24_24 = 3.4028235E38f;
                                                    var6_6 = 0;
                                                    var28_30 = 0.0f;
                                                }
                                                var20_20 = var29_31;
                                                var26_27 = 0;
                                                var27_29 = 0.0f;
                                                var4_4 = null;
                                                cfr_temp_5 = var11_11 - 0.0f;
                                                var6_6 = (int)(cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1));
                                                if (var6_6 < 0) {
                                                    var51_46 = -1.0f;
                                                }
                                                var64_55 = Math.sqrt(Math.abs(var11_11) * var50_45);
                                                var27_29 = (float)var64_55;
                                                var25_25 = var51_46 * var27_29;
                                                var26_27 = 1000;
                                                var27_29 = 1.401E-42f;
                                            }
                                        }
                                        var27_29 = var26_27;
                                        var20_20.c = var25_25 *= var27_29;
                                        var26_27 = 0x7F7FFFFF;
                                        var27_29 = 3.4028235E38f;
                                        var28_30 = -Math.abs(var27_29);
                                        var6_6 = (int)(var25_25 == var28_30 ? 0 : (var25_25 < var28_30 ? -1 : 1));
                                        if (var6_6 < 0) {
                                            var20_20.c = var27_29 = -Math.abs(var27_29);
                                        } else {
                                            var28_30 = var20_20.c;
                                            var66_56 = Math.abs(var27_29);
                                            cfr_temp_6 = var28_30 - var66_56;
                                            var6_6 = (int)(cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1));
                                            if (var6_6 > 0) {
                                                var20_20.c = var27_29 = Math.abs(var27_29);
                                            }
                                        }
                                    }
                                    var26_27 = Build.VERSION.SDK_INT;
                                    var23_23 = 34;
                                    var24_24 = 4.8E-44f;
                                    if (var26_27 < var23_23) break block47;
                                    var26_27 = var2_2;
                                    var27_29 = cB3$a.a((VelocityTracker)var14_14, var2_2);
                                    break block48;
                                }
                                var26_27 = var2_2;
                                if (var2_2 != 0) break block49;
                                var27_29 = var14_14.getXVelocity();
                                break block48;
                            }
                            var23_23 = 1;
                            var24_24 = 1.4E-45f;
                            if (var2_2 != var23_23) break block50;
                            var27_29 = var14_14.getYVelocity();
                            break block48;
                        }
                        var20_20 = cB3.a;
                        if ((var14_14 = (db3_0)var20_20.get(var14_14)) == null) ** GOTO lbl-1000
                        var23_23 = 26;
                        var24_24 = 3.6E-44f;
                        if (var2_2 == var23_23) {
                            var27_29 = var14_14.c;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var26_27 = 0;
                            var27_29 = 0.0f;
                            var4_4 = null;
                        }
                    }
                    var14_14 = var3_3.b;
                    var24_24 = var14_14.b() * var27_29;
                    var27_29 = Math.signum(var24_24);
                    if (var15_15 != 0) break block51;
                    var28_30 = Math.signum(var3_3.f);
                    var6_6 = (int)(var27_29 == var28_30 ? 0 : (var27_29 > var28_30 ? 1 : -1));
                    var5_5 = 0;
                    if (var6_6 == 0 || (var26_27 = (int)((cfr_temp_7 = var27_29 - 0.0f) == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1))) == 0) break block52;
                    break block53;
                }
                var5_5 = 0;
            }
            var14_14.c();
        }
        if ((var26_27 = (int)((cfr_temp_8 = (var27_29 = Math.abs(var24_24)) - (var28_30 = (float)(var6_6 = var12_12[0]))) == 0.0f ? 0 : (cfr_temp_8 < 0.0f ? -1 : 1))) < 0) {
            return;
        }
        var26_27 = var12_12[1];
        var6_6 = -var26_27;
        var28_30 = var6_6;
        var27_29 = var26_27;
        var27_29 = Math.min(var24_24, var27_29);
        var13_13 = (int)var14_14.a(var27_29 = Math.max(var28_30, var27_29));
        if (var13_13 != 0) {
            var28_30 = var27_29;
        } else {
            var6_6 = 0;
            var28_30 = 0.0f;
        }
        var3_3.f = var28_30;
    }
}

