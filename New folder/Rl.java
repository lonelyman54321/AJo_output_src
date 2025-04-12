/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.animation.Keyframe
 *  android.animation.ObjectAnimator
 *  android.animation.PropertyValuesHolder
 *  android.animation.TimeInterpolator
 *  android.animation.TypeEvaluator
 *  android.animation.ValueAnimator
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.util.Xml
 *  android.view.InflateException
 *  android.view.animation.AnimationUtils
 *  org.xmlpull.v1.XmlPullParser
 */
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public final class Rl {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Animator a(Context var0, Resources var1_1, Resources.Theme var2_2, XmlResourceParser var3_3, AttributeSet var4_4, AnimatorSet var5_5, int var6_6) {
        block59: {
            var7_7 /* !! */  = var1_1;
            var8_8 /* !! */  = var2_2;
            var9_9 /* !! */  = var3_3;
            var10_10 = var5_5;
            var11_11 = var3_3.getDepth();
            var12_12 = 0;
            var13_13 /* !! */  = null;
            var14_14 = null;
            while (true) {
                block61: {
                    block63: {
                        block62: {
                            block60: {
                                var15_15 = var3_3.next();
                                var16_16 = 0;
                                var17_17 = null;
                                var18_18 = 3;
                                if (var15_15 == var18_18 && (var19_19 = var3_3.getDepth()) <= var11_11) {
                                    while (true) {
                                        break block59;
                                        break;
                                    }
                                }
                                var19_19 = 1;
                                var21_21 = 1.4E-45f;
                                if (var15_15 == var19_19) ** continue;
                                var22_22 = 2;
                                var23_23 = 2.8E-45f;
                                if (var15_15 != var22_22) continue;
                                var24_24 /* !! */  = var3_3.getName();
                                var26_26 = var24_24 /* !! */ .equals(var25_25 = "objectAnimator");
                                if (var26_26 == 0) break block60;
                                var27_27 /* !! */  = new ObjectAnimator();
                                var13_13 /* !! */  = var0;
                                var24_24 /* !! */  = var1_1;
                                var20_20 /* !! */  = var2_2;
                                var28_28 /* !! */  = var4_4;
                                var29_29 /* !! */  = var27_27 /* !! */ ;
                                var25_25 = var3_3;
                                Rl.d(var0, var1_1, var2_2, (AttributeSet)var4_4, var27_27 /* !! */ , var3_3);
                                var13_13 /* !! */  = var27_27 /* !! */ ;
                                break block61;
                            }
                            var25_25 = "animator";
                            var26_26 = var24_24 /* !! */ .equals(var25_25);
                            if (var26_26 == 0) break block62;
                            var22_22 = 0;
                            var23_23 = 0.0f;
                            var29_29 /* !! */  = null;
                            var13_13 /* !! */  = var0;
                            var24_24 /* !! */  = var1_1;
                            var20_20 /* !! */  = var2_2;
                            var28_28 /* !! */  = var4_4;
                            var25_25 = var3_3;
                            var13_13 /* !! */  = Rl.d(var0, var1_1, var2_2, (AttributeSet)var4_4, null, var3_3);
                            break block61;
                        }
                        var25_25 = "set";
                        var26_26 = var24_24 /* !! */ .equals(var25_25);
                        if (var26_26 == 0) break block63;
                        var30_30 /* !! */  = new AnimatorSet();
                        var13_13 /* !! */  = (Context)Pi.h;
                        var27_27 /* !! */  = var4_4;
                        var25_25 = dt3.g(var7_7 /* !! */ , var8_8 /* !! */ , (AttributeSet)var4_4, (int[])var13_13 /* !! */ );
                        var13_13 /* !! */  = "ordering";
                        var12_12 = dt3.f((XmlPullParser)var9_9 /* !! */ , (String)var13_13 /* !! */ );
                        var31_31 = var12_12 == 0 ? 0 : (var12_12 = var25_25.getInt(0, 0));
                        var13_13 /* !! */  = var0;
                        var24_24 /* !! */  = var1_1;
                        var20_20 /* !! */  = var2_2;
                        var28_28 /* !! */  = var3_3;
                        var29_29 /* !! */  = var4_4;
                        var32_32 = var25_25;
                        var25_25 = var30_30 /* !! */ ;
                        Rl.a(var0, var1_1, var2_2, var3_3, (AttributeSet)var4_4, var30_30 /* !! */ , var31_31);
                        var32_32.recycle();
                        var13_13 /* !! */  = var30_30 /* !! */ ;
                        break block61;
                    }
                    var25_25 = "propertyValuesHolder";
                    var15_15 = (int)var24_24 /* !! */ .equals(var25_25);
                    if (var15_15 == 0) break;
                    var24_24 /* !! */  = Xml.asAttributeSet((XmlPullParser)var3_3);
                    var27_27 /* !! */  = null;
                    while ((var33_33 = var3_3.getEventType()) != var18_18 && var33_33 != var19_19) {
                        block75: {
                            block64: {
                                block74: {
                                    block70: {
                                        block71: {
                                            block73: {
                                                block72: {
                                                    if (var33_33 != var22_22) {
                                                        var3_3.next();
                                                        continue;
                                                    }
                                                    var30_30 /* !! */  = var3_3.getName();
                                                    var33_33 = (int)var30_30 /* !! */ .equals(var25_25);
                                                    if (var33_33 == 0) break block64;
                                                    var30_30 /* !! */  = (AnimatorSet)Pi.i;
                                                    var30_30 /* !! */  = dt3.g(var7_7 /* !! */ , var8_8 /* !! */ , (AttributeSet)var24_24 /* !! */ , (int[])var30_30 /* !! */ );
                                                    var34_34 = dt3.e((TypedArray)var30_30 /* !! */ , (XmlPullParser)var9_9 /* !! */ , "propertyName", var18_18);
                                                    var17_17 = "valueType";
                                                    var16_16 = (int)dt3.f((XmlPullParser)var9_9 /* !! */ , var17_17);
                                                    var19_19 = 4;
                                                    var21_21 = 5.6E-45f;
                                                    var16_16 = var16_16 == 0 ? 4 : var30_30 /* !! */ .getInt(var22_22, var19_19);
                                                    var35_35 = var16_16;
                                                    var22_22 = 0;
                                                    var23_23 = 0.0f;
                                                    var29_29 /* !! */  = null;
                                                    while (true) {
                                                        block69: {
                                                            block65: {
                                                                block68: {
                                                                    block66: {
                                                                        block67: {
                                                                            var19_19 = var3_3.next();
                                                                            var36_36 = var24_24 /* !! */ ;
                                                                            if (var19_19 == var18_18) break;
                                                                            var15_15 = 1;
                                                                            var37_37 = 1.4E-45f;
                                                                            if (var19_19 == var15_15) break;
                                                                            var24_24 /* !! */  = var3_3.getName();
                                                                            var15_15 = (int)var24_24 /* !! */ .equals(var28_28 /* !! */  = "keyframe");
                                                                            if (var15_15 == 0) break block65;
                                                                            var24_24 /* !! */  = (Resources)Pi.j;
                                                                            var28_28 /* !! */  = "value";
                                                                            var18_18 = var35_35;
                                                                            var38_38 = var25_25;
                                                                            var26_26 = 4;
                                                                            var39_39 = 5.6E-45f;
                                                                            if (var35_35 == var26_26) {
                                                                                var20_20 /* !! */  = Xml.asAttributeSet((XmlPullParser)var3_3);
                                                                                var20_20 /* !! */  = dt3.g(var7_7 /* !! */ , var8_8 /* !! */ , (AttributeSet)var20_20 /* !! */ , (int[])var24_24 /* !! */ );
                                                                                var26_26 = (int)dt3.f((XmlPullParser)var9_9 /* !! */ , (String)var28_28 /* !! */ );
                                                                                if (var26_26 == 0) {
                                                                                    var26_26 = 0;
                                                                                    var39_39 = 0.0f;
                                                                                    var25_25 = null;
                                                                                } else {
                                                                                    var26_26 = 0;
                                                                                    var39_39 = 0.0f;
                                                                                    var40_40 = var20_20 /* !! */ .peekValue(0);
                                                                                    var25_25 = var40_40;
                                                                                }
                                                                                if (var25_25 != null && (var26_26 = (int)Rl.c(var25_25.type)) != 0) {
                                                                                    var26_26 = 3;
                                                                                    var39_39 = 4.2E-45f;
                                                                                } else {
                                                                                    var26_26 = 0;
                                                                                    var39_39 = 0.0f;
                                                                                    var25_25 = null;
                                                                                }
                                                                                var20_20 /* !! */ .recycle();
                                                                                var18_18 = var26_26;
                                                                            }
                                                                            var25_25 = Xml.asAttributeSet((XmlPullParser)var3_3);
                                                                            var24_24 /* !! */  = dt3.g(var7_7 /* !! */ , var8_8 /* !! */ , (AttributeSet)var25_25, (int[])var24_24 /* !! */ );
                                                                            var25_25 = "fraction";
                                                                            var26_26 = (int)dt3.f((XmlPullParser)var9_9 /* !! */ , (String)var25_25);
                                                                            var41_41 = -1082130432;
                                                                            var42_42 = -1.0f;
                                                                            if (var26_26 != 0) {
                                                                                var26_26 = 3;
                                                                                var39_39 = 4.2E-45f;
                                                                                var42_42 = var24_24 /* !! */ .getFloat(var26_26, var42_42);
                                                                            }
                                                                            var26_26 = (int)dt3.f((XmlPullParser)var9_9 /* !! */ , (String)var28_28 /* !! */ );
                                                                            if (var26_26 == 0) {
                                                                                var26_26 = 0;
                                                                                var39_39 = 0.0f;
                                                                                var25_25 = null;
                                                                            } else {
                                                                                var26_26 = 0;
                                                                                var39_39 = 0.0f;
                                                                                var40_40 = var24_24 /* !! */ .peekValue(0);
                                                                                var25_25 = var40_40;
                                                                            }
                                                                            var43_43 = 4;
                                                                            var44_44 = 5.6E-45f;
                                                                            if (var25_25 != null) {
                                                                                var45_45 = (float)true;
                                                                                var46_46 = 1.4E-45f;
                                                                            } else {
                                                                                var45_45 = (float)false;
                                                                                var46_46 = 0.0f;
                                                                                var47_47 = null;
                                                                            }
                                                                            if (var18_18 == var43_43) {
                                                                                if (var45_45 != false && (var26_26 = (int)Rl.c(var25_25.type)) != 0) {
                                                                                    var26_26 = 3;
                                                                                    var39_39 = 4.2E-45f;
                                                                                } else {
                                                                                    var26_26 = 0;
                                                                                    var39_39 = 0.0f;
                                                                                    var25_25 = null;
                                                                                }
                                                                            } else {
                                                                                var26_26 = var18_18;
                                                                            }
                                                                            if (var45_45 == false) break block66;
                                                                            if (var26_26 == 0) break block67;
                                                                            var43_43 = (float)true;
                                                                            var44_44 = 1.4E-45f;
                                                                            if (var26_26 == var43_43) ** GOTO lbl-1000
                                                                            var43_43 = 3;
                                                                            var44_44 = 4.2E-45f;
                                                                            if (var26_26 != var43_43) {
                                                                                var19_19 = 0;
                                                                                var21_21 = 0.0f;
                                                                                var28_28 /* !! */  = null;
                                                                            } else lbl-1000:
                                                                            // 2 sources

                                                                            {
                                                                                if ((var19_19 = (int)dt3.f((XmlPullParser)var9_9 /* !! */ , (String)var28_28 /* !! */ )) == 0) {
                                                                                    var19_19 = 0;
                                                                                    var21_21 = 0.0f;
                                                                                    var28_28 /* !! */  = null;
                                                                                    var26_26 = 0;
                                                                                    var39_39 = 0.0f;
                                                                                    var25_25 = null;
                                                                                } else {
                                                                                    var26_26 = 0;
                                                                                    var39_39 = 0.0f;
                                                                                    var25_25 = null;
                                                                                    var19_19 = var48_48 = var24_24 /* !! */ .getInt(0, 0);
                                                                                }
                                                                                var28_28 /* !! */  = Keyframe.ofInt((float)var42_42, (int)var19_19);
                                                                            }
                                                                            break block68;
                                                                        }
                                                                        var26_26 = 0;
                                                                        var39_39 = 0.0f;
                                                                        var25_25 = null;
                                                                        var19_19 = (int)dt3.f((XmlPullParser)var9_9 /* !! */ , (String)var28_28 /* !! */ );
                                                                        if (var19_19 == 0) {
                                                                            var19_19 = 0;
                                                                            var21_21 = 0.0f;
                                                                            var28_28 /* !! */  = null;
                                                                        } else {
                                                                            var19_19 = 0;
                                                                            var28_28 /* !! */  = null;
                                                                            var21_21 = var24_24 /* !! */ .getFloat(0, 0.0f);
                                                                        }
                                                                        var28_28 /* !! */  = Keyframe.ofFloat((float)var42_42, (float)var21_21);
                                                                        break block68;
                                                                    }
                                                                    var28_28 /* !! */  = var26_26 == 0 ? Keyframe.ofFloat((float)var42_42) : Keyframe.ofInt((float)var42_42);
                                                                }
                                                                var25_25 = "interpolator";
                                                                var26_26 = (int)dt3.f((XmlPullParser)var9_9 /* !! */ , (String)var25_25);
                                                                if (var26_26 == 0) {
                                                                    var43_43 = (float)false;
                                                                    var44_44 = 0.0f;
                                                                    var8_8 /* !! */  = null;
                                                                } else {
                                                                    var26_26 = 0;
                                                                    var39_39 = 0.0f;
                                                                    var25_25 = null;
                                                                    var41_41 = 1;
                                                                    var42_42 = 1.4E-45f;
                                                                    var43_43 = var24_24 /* !! */ .getResourceId(var41_41, 0);
                                                                }
                                                                var25_25 = var0;
                                                                if (var43_43 > 0) {
                                                                    var7_7 /* !! */  = AnimationUtils.loadInterpolator((Context)var0, (int)var43_43);
                                                                    var28_28 /* !! */ .setInterpolator((TimeInterpolator)var7_7 /* !! */ );
                                                                }
                                                                var24_24 /* !! */ .recycle();
                                                                if (var28_28 /* !! */  != null) {
                                                                    if (var29_29 /* !! */  == null) {
                                                                        var29_29 /* !! */  = new ArrayList();
                                                                    }
                                                                    var29_29 /* !! */ .add(var28_28 /* !! */ );
                                                                }
                                                                var3_3.next();
                                                                break block69;
                                                            }
                                                            var18_18 = var35_35;
                                                            var38_38 = var25_25;
                                                            var25_25 = var0;
                                                        }
                                                        var7_7 /* !! */  = var1_1;
                                                        var8_8 /* !! */  = var2_2;
                                                        var25_25 = var38_38;
                                                        var24_24 /* !! */  = var36_36;
                                                        var35_35 = var18_18;
                                                        var18_18 = 3;
                                                    }
                                                    var18_18 = var35_35;
                                                    var38_38 = var25_25;
                                                    var25_25 = var0;
                                                    if (var29_29 /* !! */  == null || (var15_15 = var29_29 /* !! */ .size()) <= 0) break block70;
                                                    var21_21 = 0.0f;
                                                    var7_7 /* !! */  = (Keyframe)var29_29 /* !! */ .get(0);
                                                    var19_19 = var15_15 + -1;
                                                    var28_28 /* !! */  = (Keyframe[])var29_29 /* !! */ .get(var19_19);
                                                    var44_44 = var28_28 /* !! */ .getFraction();
                                                    var26_26 = 1065353216;
                                                    var39_39 = 1.0f;
                                                    cfr_temp_0 = var44_44 - var39_39;
                                                    var45_45 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                    if (var45_45 < 0) {
                                                        var45_45 = (float)false;
                                                        var46_46 = 0.0f;
                                                        var47_47 = null;
                                                        cfr_temp_1 = var44_44 - 0.0f;
                                                        var43_43 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                                        if (var43_43 < 0) {
                                                            var28_28 /* !! */ .setFraction(var39_39);
                                                        } else {
                                                            var43_43 = var29_29 /* !! */ .size();
                                                            var25_25 = var28_28 /* !! */ .getType();
                                                            if (var25_25 == (var9_9 /* !! */  = Float.TYPE)) {
                                                                var26_26 = 1065353216;
                                                                var39_39 = 1.0f;
                                                                var28_28 /* !! */  = Keyframe.ofFloat((float)var39_39);
                                                            } else {
                                                                var26_26 = 1065353216;
                                                                var39_39 = 1.0f;
                                                                var28_28 /* !! */  = (var28_28 /* !! */  = var28_28 /* !! */ .getType()) == (var9_9 /* !! */  = Integer.TYPE) ? Keyframe.ofInt((float)var39_39) : Keyframe.ofObject((float)var39_39);
                                                            }
                                                            var29_29 /* !! */ .add((int)var43_43, var28_28 /* !! */ );
                                                            ++var15_15;
                                                        }
                                                    }
                                                    var21_21 = var7_7 /* !! */ .getFraction();
                                                    var26_26 = 0;
                                                    var39_39 = 0.0f;
                                                    var25_25 = null;
                                                    cfr_temp_2 = var21_21 - 0.0f;
                                                    var43_43 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                    if (var43_43 == false) break block71;
                                                    cfr_temp_3 = var21_21 - 0.0f;
                                                    var19_19 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                                                    if (var19_19 >= 0) break block72;
                                                    var7_7 /* !! */ .setFraction(0.0f);
                                                    break block71;
                                                }
                                                var28_28 /* !! */  = var7_7 /* !! */ .getType();
                                                if (var28_28 /* !! */  == (var8_8 /* !! */  = Float.TYPE)) {
                                                    var28_28 /* !! */  = Keyframe.ofFloat((float)0.0f);
lbl309:
                                                    // 3 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                var28_28 /* !! */  = var7_7 /* !! */ .getType();
                                                if (var28_28 /* !! */  != (var7_7 /* !! */  = Integer.TYPE)) break block73;
                                                var28_28 /* !! */  = Keyframe.ofInt((float)0.0f);
                                                ** GOTO lbl309
                                            }
                                            var28_28 /* !! */  = Keyframe.ofObject((float)0.0f);
                                            ** continue;
                                            var26_26 = 0;
                                            var39_39 = 0.0f;
                                            var25_25 = null;
                                            var29_29 /* !! */ .add(0, var28_28 /* !! */ );
                                            ++var15_15;
                                        }
                                        var28_28 /* !! */  = new Keyframe[var15_15];
                                        var29_29 /* !! */ .toArray((T[])var28_28 /* !! */ );
                                        var39_39 = 0.0f;
                                        var25_25 = null;
                                        for (var26_26 = 0; var26_26 < var15_15; ++var26_26) {
                                            var29_29 /* !! */  = var28_28 /* !! */ [var26_26];
                                            var42_42 = var29_29 /* !! */ .getFraction();
                                            var43_43 = (float)false;
                                            var44_44 = 0.0f;
                                            var8_8 /* !! */  = null;
                                            cfr_temp_4 = var42_42 - 0.0f;
                                            var41_41 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1);
                                            if (var41_41 >= 0) ** GOTO lbl340
                                            if (var26_26 == 0) {
                                                var29_29 /* !! */ .setFraction(0.0f);
lbl340:
                                                // 3 sources

                                                while (true) {
                                                    var49_49 = var15_15;
                                                    break;
                                                }
                                            } else {
                                                var41_41 = var15_15 + -1;
                                                if (var26_26 == var41_41) {
                                                    var43_43 = 1065353216;
                                                    var44_44 = 1.0f;
                                                    var29_29 /* !! */ .setFraction(var44_44);
                                                    ** continue;
                                                }
                                                var43_43 = 1065353216;
                                                var44_44 = 1.0f;
                                                var22_22 = var26_26 + 1;
                                                var50_50 = var26_26;
                                                while (var22_22 < var41_41 && (var45_45 = (cfr_temp_5 = (var46_46 = (var47_47 = var28_28 /* !! */ [var22_22]).getFraction()) - 0.0f) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1)) < 0) {
                                                    var51_51 = var22_22 + 1;
                                                    var50_50 = var22_22;
                                                    var22_22 = var51_51;
                                                }
                                                var22_22 = var50_50 + 1;
                                                var29_29 /* !! */  = var28_28 /* !! */ [var22_22];
                                                var23_23 = var29_29 /* !! */ .getFraction();
                                                var41_41 = var26_26 + -1;
                                                var7_7 /* !! */  = var28_28 /* !! */ [var41_41];
                                                var42_42 = var7_7 /* !! */ .getFraction();
                                                var23_23 -= var42_42;
                                                var42_42 = var50_50 - var26_26 + 2;
                                                var23_23 /= var42_42;
                                                for (var41_41 = var26_26; var41_41 <= var50_50; ++var41_41) {
                                                    var8_8 /* !! */  = var28_28 /* !! */ [var41_41];
                                                    var52_52 = var41_41 + -1;
                                                    var40_40 = var28_28 /* !! */ [var52_52];
                                                    var53_53 = var40_40.getFraction();
                                                    var49_49 = var15_15;
                                                    var37_37 = var53_53 + var23_23;
                                                    var8_8 /* !! */ .setFraction(var37_37);
                                                    var43_43 = 1065353216;
                                                    var44_44 = 1.0f;
                                                }
                                                var49_49 = var15_15;
                                            }
                                            var15_15 = var49_49;
                                        }
                                        var24_24 /* !! */  = PropertyValuesHolder.ofKeyframe((String)var34_34, (Keyframe[])var28_28 /* !! */ );
                                        var19_19 = 3;
                                        var21_21 = 4.2E-45f;
                                        if (var18_18 == var19_19) {
                                            var20_20 /* !! */  = yp.a;
                                            var24_24 /* !! */ .setEvaluator((TypeEvaluator)var20_20 /* !! */ );
                                        }
                                        break block74;
                                    }
                                    var19_19 = 3;
                                    var21_21 = 4.2E-45f;
                                    var15_15 = 0;
                                    var37_37 = 0.0f;
                                    var24_24 /* !! */  = null;
                                }
                                var18_18 = 0;
                                var20_20 /* !! */  = null;
                                var22_22 = 1;
                                var23_23 = 1.4E-45f;
                                if (var24_24 /* !! */  == null) {
                                    var24_24 /* !! */  = Rl.b((TypedArray)var30_30 /* !! */ , var16_16, 0, var22_22, var34_34);
                                }
                                if (var24_24 /* !! */  != null) {
                                    if (var27_27 /* !! */  == null) {
                                        var27_27 /* !! */  = new ArrayList();
                                    }
                                    var27_27 /* !! */ .add(var24_24 /* !! */ );
                                }
                                var30_30 /* !! */ .recycle();
                                break block75;
                            }
                            var36_36 = var24_24 /* !! */ ;
                            var38_38 = var25_25;
                            var18_18 = 0;
                            var20_20 /* !! */  = null;
                            var19_19 = 3;
                            var21_21 = 4.2E-45f;
                            var22_22 = 1;
                            var23_23 = 1.4E-45f;
                        }
                        var3_3.next();
                        var7_7 /* !! */  = var1_1;
                        var8_8 /* !! */  = var2_2;
                        var9_9 /* !! */  = var3_3;
                        var25_25 = var38_38;
                        var24_24 /* !! */  = var36_36;
                        var18_18 = 3;
                        var19_19 = 1;
                        var21_21 = 1.4E-45f;
                        var22_22 = 2;
                        var23_23 = 2.8E-45f;
                        var16_16 = 0;
                        var17_17 = null;
                    }
                    var18_18 = 0;
                    var20_20 /* !! */  = null;
                    var22_22 = 1;
                    var23_23 = 1.4E-45f;
                    if (var27_27 /* !! */  != null) {
                        var15_15 = var27_27 /* !! */ .size();
                        var28_28 /* !! */  = new PropertyValuesHolder[var15_15];
                        var17_17 = null;
                        for (var16_16 = 0; var16_16 < var15_15; ++var16_16) {
                            var20_20 /* !! */  = (PropertyValuesHolder)var27_27 /* !! */ .get(var16_16);
                            var28_28 /* !! */ [var16_16] = var20_20 /* !! */ ;
                        }
                    } else {
                        var19_19 = 0;
                        var21_21 = 0.0f;
                        var28_28 /* !! */  = null;
                    }
                    if (var28_28 /* !! */  != null && (var15_15 = var13_13 /* !! */  instanceof ValueAnimator) != 0) {
                        var24_24 /* !! */  = var13_13 /* !! */ ;
                        var24_24 /* !! */  = (ValueAnimator)var13_13 /* !! */ ;
                        var24_24 /* !! */ .setValues((PropertyValuesHolder[])var28_28 /* !! */ );
                    }
                    var16_16 = 1;
                }
                if (var10_10 != null && var16_16 == 0) {
                    if (var14_14 == null) {
                        var14_14 = new ArrayList<Context>();
                    }
                    var14_14.add(var13_13 /* !! */ );
                }
                var7_7 /* !! */  = var1_1;
                var8_8 /* !! */  = var2_2;
                var9_9 /* !! */  = var3_3;
            }
            var24_24 /* !! */  = new StringBuilder("Unknown animator name: ");
            var20_20 /* !! */  = var3_3.getName();
            var24_24 /* !! */ .append((String)var20_20 /* !! */ );
            var24_24 /* !! */  = var24_24 /* !! */ .toString();
            var13_13 /* !! */  = new RuntimeException((String)var24_24 /* !! */ );
            throw var13_13 /* !! */ ;
        }
        var18_18 = 0;
        var20_20 /* !! */  = null;
        if (var10_10 != null && var14_14 != null) {
            var15_15 = var14_14.size();
            var24_24 /* !! */  = new Animator[var15_15];
            var28_28 /* !! */  = var14_14.iterator();
            var16_16 = 0;
            var17_17 = null;
            while ((var18_18 = (int)var28_28 /* !! */ .hasNext()) != 0) {
                var20_20 /* !! */  = (Animator)var28_28 /* !! */ .next();
                var22_22 = var16_16 + 1;
                var24_24 /* !! */ [var16_16] = var20_20 /* !! */ ;
                var16_16 = var22_22;
            }
            if (var6_6 == 0) {
                var10_10.playTogether((Animator[])var24_24 /* !! */ );
            } else {
                var10_10.playSequentially((Animator[])var24_24 /* !! */ );
            }
        }
        return (Animator)var13_13 /* !! */ ;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static PropertyValuesHolder b(TypedArray object, int n3, int n4, int n7, String string2) {
        void var4_20;
        Object[] objectArray;
        int n8;
        int n10;
        void var3_19;
        int n14;
        int n15;
        int n16 = 2;
        TypedValue typedValue = object.peekValue(n15);
        int n17 = 1;
        boolean bl2 = typedValue != null;
        if (bl2) {
            n14 = typedValue.type;
        } else {
            n14 = 0;
            Object var6_23 = null;
        }
        TypedValue typedValue2 = object.peekValue((int)var3_19);
        boolean bl3 = typedValue2 != null;
        if (bl3) {
            n10 = typedValue2.type;
        } else {
            n10 = 0;
            typedValue2 = null;
        }
        int n18 = 4;
        int n19 = 3;
        if (n8 == n18) {
            if (bl2 && (n8 = Rl.c(n14)) != 0 || bl3 && (n8 = Rl.c(n10)) != 0) {
                n8 = 3;
            } else {
                n8 = 0;
                objectArray = null;
            }
        }
        n18 = n8 == 0 ? 1 : 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (n8 == n16) {
            void var0_4;
            objectArray = object.getString(n15);
            String string3 = object.getString((int)var3_19);
            InflateException inflateException = rn2.c((String)objectArray);
            rn2$a[] rn2$aArray = rn2.c(string3);
            if (inflateException == null) {
                if (rn2$aArray == null) return propertyValuesHolder;
            }
            if (inflateException == null) {
                if (rn2$aArray == null) return propertyValuesHolder;
                Rl$a rl$a = new Object();
                objectArray = new Object[n17];
                objectArray[0] = rn2$aArray;
                return PropertyValuesHolder.ofObject((String)var4_20, (TypeEvaluator)rl$a, (Object[])objectArray);
            }
            Rl$a rl$a = new Object();
            if (rn2$aArray != null) {
                bl2 = rn2.a((rn2$a[])inflateException, rn2$aArray);
                if (!bl2) {
                    String string4 = UX.c(" Can't morph from ", (String)objectArray, " to ", string3);
                    inflateException = new InflateException(string4);
                    throw inflateException;
                }
                Object[] objectArray2 = new Object[n16];
                objectArray2[0] = inflateException;
                objectArray2[n17] = rn2$aArray;
                PropertyValuesHolder propertyValuesHolder2 = PropertyValuesHolder.ofObject((String)var4_20, (TypeEvaluator)rl$a, (Object[])objectArray2);
                return var0_4;
            } else {
                Object[] objectArray3 = new Object[n17];
                objectArray3[0] = inflateException;
                PropertyValuesHolder propertyValuesHolder3 = PropertyValuesHolder.ofObject((String)var4_20, (TypeEvaluator)rl$a, (Object[])objectArray3);
            }
            return var0_4;
        }
        if (n8 == n19) {
            objectArray = yp.a;
        } else {
            n8 = 0;
            objectArray = null;
        }
        n19 = 5;
        if (n18 != 0) {
            void var0_10;
            if (bl2) {
                float f5 = n14 == n19 ? object.getDimension(n15, 0.0f) : object.getFloat(n15, 0.0f);
                if (bl3) {
                    float f6 = n10 == n19 ? object.getDimension((int)var3_19, 0.0f) : object.getFloat((int)var3_19, 0.0f);
                    float[] fArray = new float[n16];
                    fArray[0] = f5;
                    fArray[n17] = f6;
                    PropertyValuesHolder propertyValuesHolder4 = PropertyValuesHolder.ofFloat((String)var4_20, (float[])fArray);
                } else {
                    float[] fArray = new float[n17];
                    fArray[0] = f5;
                    PropertyValuesHolder propertyValuesHolder5 = PropertyValuesHolder.ofFloat((String)var4_20, (float[])fArray);
                }
            } else {
                float f7 = n10 == n19 ? object.getDimension((int)var3_19, 0.0f) : object.getFloat((int)var3_19, 0.0f);
                float[] fArray = new float[n17];
                fArray[0] = f7;
                PropertyValuesHolder propertyValuesHolder6 = PropertyValuesHolder.ofFloat((String)var4_20, (float[])fArray);
            }
            propertyValuesHolder = var0_10;
        } else if (bl2) {
            if (n14 == n19) {
                float f8 = object.getDimension(n15, 0.0f);
                n15 = (int)f8;
            } else {
                n16 = Rl.c(n14) ? 1 : 0;
                n15 = n16 != 0 ? object.getColor(n15, 0) : object.getInt(n15, 0);
            }
            if (bl3) {
                int n20;
                if (n10 == n19) {
                    float f11 = object.getDimension((int)var3_19, 0.0f);
                    n20 = (int)f11;
                } else {
                    n16 = Rl.c(n10) ? 1 : 0;
                    n20 = n16 != 0 ? object.getColor((int)var3_19, 0) : object.getInt((int)var3_19, 0);
                }
                int[] nArray = new int[]{n15, n20};
                propertyValuesHolder = PropertyValuesHolder.ofInt((String)var4_20, (int[])nArray);
            } else {
                int[] nArray = new int[]{n15};
                propertyValuesHolder = PropertyValuesHolder.ofInt((String)var4_20, (int[])nArray);
            }
        } else if (bl3) {
            int n21;
            if (n10 == n19) {
                float f12 = object.getDimension((int)var3_19, 0.0f);
                n21 = (int)f12;
            } else {
                n15 = Rl.c(n10);
                n21 = n15 != 0 ? object.getColor((int)var3_19, 0) : object.getInt((int)var3_19, 0);
            }
            int[] nArray = new int[]{n21};
            propertyValuesHolder = PropertyValuesHolder.ofInt((String)var4_20, (int[])nArray);
        }
        if (propertyValuesHolder == null) return propertyValuesHolder;
        if (objectArray == null) return propertyValuesHolder;
        propertyValuesHolder.setEvaluator((TypeEvaluator)objectArray);
        return propertyValuesHolder;
    }

    public static boolean c(int n3) {
        int n4 = 28;
        n3 = n3 >= n4 && n3 <= (n4 = 31) ? 1 : 0;
        return n3 != 0;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        Object object;
        int n4;
        XmlResourceParser xmlResourceParser2;
        Object object2;
        Object object3;
        Object object4;
        block35: {
            String string2;
            float f5;
            object4 = resources;
            object3 = theme;
            object2 = attributeSet;
            xmlResourceParser2 = xmlResourceParser;
            int n7 = 2;
            n4 = 0;
            float[] fArray = null;
            int n8 = 1;
            Object object5 = Pi.g;
            object5 = dt3.g(resources, theme, attributeSet, object5);
            Object object6 = Pi.k;
            object4 = dt3.g(resources, theme, attributeSet, object6);
            object3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
            float f6 = 4.2E-43f;
            object6 = "duration";
            long l2 = dt3.d((TypedArray)object5, (XmlPullParser)xmlResourceParser2, (String)object6, n8, 300);
            object2 = "startOffset";
            int n10 = dt3.f((XmlPullParser)xmlResourceParser2, (String)object2);
            if (n10 == 0) {
                n10 = 0;
                f6 = 0.0f;
                object2 = null;
            } else {
                n10 = object5.getInt(n7, 0);
            }
            long l3 = n10;
            object2 = "valueType";
            n10 = dt3.f((XmlPullParser)xmlResourceParser2, (String)object2) ? 1 : 0;
            int n14 = 4;
            float f7 = 5.6E-45f;
            if (n10 == 0) {
                n10 = 4;
                f6 = 5.6E-45f;
            } else {
                f6 = 9.8E-45f;
                n10 = object5.getInt(7, n14);
            }
            Object object7 = "valueFrom";
            int n15 = dt3.f((XmlPullParser)xmlResourceParser2, (String)object7);
            int n16 = 3;
            float f8 = 4.2E-45f;
            if (n15 != 0 && (n15 = dt3.f((XmlPullParser)xmlResourceParser2, (String)(object7 = "valueTo"))) != 0) {
                n15 = 6;
                f5 = 8.4E-45f;
                int n17 = 5;
                if (n10 == n14) {
                    object2 = object5.peekValue(n17);
                    boolean bl2 = object2 != null;
                    if (bl2) {
                        n10 = ((TypedValue)object2).type;
                    } else {
                        n10 = 0;
                        f6 = 0.0f;
                        object2 = null;
                    }
                    string2 = object5.peekValue(n15);
                    boolean bl3 = string2 != null;
                    if (bl3) {
                        n7 = ((TypedValue)string2).type;
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    if (bl2 && (n10 = (int)(Rl.c(n10) ? 1 : 0)) != 0 || bl3 && (n10 = (int)(Rl.c(n7) ? 1 : 0)) != 0) {
                        n10 = 3;
                        f6 = 4.2E-45f;
                    } else {
                        n10 = 0;
                        f6 = 0.0f;
                        object2 = null;
                    }
                }
                if ((string2 = Rl.b((TypedArray)object5, n10, n17, n15, "")) != null) {
                    object7 = new PropertyValuesHolder[n8];
                    object7[0] = string2;
                    object3.setValues(object7);
                }
            }
            object3.setDuration(l2);
            object3.setStartDelay(l3);
            string2 = "repeatCount";
            n7 = dt3.f((XmlPullParser)xmlResourceParser2, string2) ? 1 : 0;
            if (n7 == 0) {
                n7 = 0;
                string2 = null;
            } else {
                n7 = object5.getInt(n16, 0);
            }
            object3.setRepeatCount(n7);
            string2 = "repeatMode";
            n7 = dt3.f((XmlPullParser)xmlResourceParser2, string2) ? 1 : 0;
            n7 = n7 == 0 ? 1 : object5.getInt(n14, n8);
            object3.setRepeatMode(n7);
            if (object4 != null) {
                string2 = object3;
                string2 = (ObjectAnimator)object3;
                object6 = dt3.e((TypedArray)object4, (XmlPullParser)xmlResourceParser2, "pathData", n8);
                if (object6 != null) {
                    int n18 = 2;
                    String string3 = dt3.e((TypedArray)object4, (XmlPullParser)xmlResourceParser2, "propertyXName", n18);
                    String string4 = dt3.e((TypedArray)object4, (XmlPullParser)xmlResourceParser2, "propertyYName", n16);
                    if (string3 == null && string4 == null) {
                        object2 = new StringBuilder();
                        object4 = object4.getPositionDescription();
                        ((StringBuilder)object2).append((String)object4);
                        ((StringBuilder)object2).append(" propertyXName or propertyYName is needed for PathData");
                        object4 = ((StringBuilder)object2).toString();
                        object3 = new InflateException((String)object4);
                        throw object3;
                    }
                    object2 = rn2.d((String)object6);
                    object6 = new PathMeasure;
                    object6((Path)object2, false);
                    ArrayList<Object> arrayList = new ArrayList<Object>();
                    n14 = 0;
                    f7 = 0.0f;
                    object7 = Float.valueOf(0.0f);
                    arrayList.add(object7);
                    n15 = 0;
                    f5 = 0.0f;
                    object7 = null;
                    while (true) {
                        f8 = object6.getLength();
                        Object object8 = Float.valueOf(f5 += f8);
                        arrayList.add(object8);
                        n16 = object6.nextContour() ? 1 : 0;
                        if (n16 == 0) {
                            object6 = new PathMeasure;
                            object6((Path)object2, false);
                            f6 = f5 / 0.5f;
                            n10 = (int)f6 + n8;
                            n16 = 100;
                            f8 = 1.4E-43f;
                            n10 = Math.min(n16, n10);
                            object8 = new float[n10];
                            float[] fArray2 = new float[n10];
                            fArray = new float[2];
                            f7 = n10 + -1;
                            f5 /= f7;
                            theme = object3;
                            object = object5;
                            boolean bl2 = false;
                            object3 = null;
                            n8 = 0;
                            PropertyValuesHolder[] propertyValuesHolderArray = null;
                            n14 = 0;
                            f7 = 0.0f;
                            while (true) {
                                float f11;
                                int n3;
                                int n17 = 0;
                                float f12 = 0.0f;
                                object5 = null;
                                if (n8 >= n10) break;
                                Float f14 = (Float)arrayList.get(n3);
                                float f15 = f14.floatValue();
                                int n19 = n10;
                                f6 = f7 - f15;
                                object6.getPosTan(f6, fArray, null);
                                object2 = null;
                                f12 = fArray[0];
                                object8[n8] = f12;
                                f6 = Float.MIN_VALUE;
                                fArray2[n8] = f12 = fArray[1];
                                n17 = n3 + true;
                                n10 = arrayList.size();
                                if (n17 < n10 && (n10 = (int)((f11 = (f7 += f5) - (f6 = ((Float)(object2 = (Float)arrayList.get(n17))).floatValue())) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1))) > 0) {
                                    object6.nextContour();
                                    n3 = n17;
                                }
                                f6 = Float.MIN_VALUE;
                                ++n8;
                                n10 = n19;
                            }
                            n10 = 1;
                            f6 = Float.MIN_VALUE;
                            if (string3 != null) {
                                object3 = PropertyValuesHolder.ofFloat((String)string3, (float[])object8);
                            } else {
                                boolean bl3 = false;
                                object3 = null;
                            }
                            if (string4 != null) {
                                object5 = PropertyValuesHolder.ofFloat((String)string4, (float[])fArray2);
                            }
                            if (object3 == null) {
                                object3 = new PropertyValuesHolder[n10];
                                n4 = 0;
                                fArray = null;
                                object3[0] = (PropertyValuesHolder)object5;
                                string2.setValues(object3);
                            } else {
                                n4 = 0;
                                fArray = null;
                                if (object5 == null) {
                                    object2 = new PropertyValuesHolder[n10];
                                    object2[0] = object3;
                                    string2.setValues((PropertyValuesHolder[])object2);
                                } else {
                                    n8 = 2;
                                    propertyValuesHolderArray = new PropertyValuesHolder[n8];
                                    propertyValuesHolderArray[0] = object3;
                                    propertyValuesHolderArray[n10] = (PropertyValuesHolder)object5;
                                    string2.setValues(propertyValuesHolderArray);
                                }
                            }
                            break block35;
                        }
                        theme = object3;
                        boolean n3 = true;
                        n8 = 1;
                    }
                }
                theme = object3;
                object = object5;
                object3 = dt3.e((TypedArray)object4, (XmlPullParser)xmlResourceParser2, "propertyName", 0);
                string2.setPropertyName((String)object3);
            } else {
                theme = object3;
                object = object5;
            }
        }
        object3 = "interpolator";
        boolean bl4 = dt3.f((XmlPullParser)xmlResourceParser2, (String)object3);
        if (!bl4) {
            object3 = object;
        } else {
            object3 = object;
            n4 = object.getResourceId(0, 0);
        }
        if (n4 > 0) {
            object2 = context;
            object2 = AnimationUtils.loadInterpolator((Context)context, (int)n4);
            xmlResourceParser2 = theme;
            theme.setInterpolator((TimeInterpolator)object2);
        } else {
            xmlResourceParser2 = theme;
        }
        object3.recycle();
        if (object4 != null) {
            object4.recycle();
        }
        return xmlResourceParser2;
    }
}

