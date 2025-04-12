/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.TypeEvaluator
 *  android.content.Context
 *  android.content.res.XmlResourceParser
 *  android.graphics.Path
 *  android.graphics.PointF
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewGroup
 *  org.xmlpull.v1.XmlPullParser
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.ChangeBounds$a;
import androidx.transition.ChangeBounds$b;
import androidx.transition.ChangeBounds$c;
import androidx.transition.ChangeBounds$d;
import androidx.transition.ChangeBounds$e;
import androidx.transition.ChangeBounds$f;
import androidx.transition.ChangeBounds$g;
import androidx.transition.ChangeBounds$h;
import androidx.transition.ChangeBounds$i;
import androidx.transition.R$id;
import androidx.transition.Transition;
import androidx.transition.Transition$i;
import androidx.transition.h;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class ChangeBounds
extends Transition {
    public static final String[] b = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final ChangeBounds$a c;
    public static final ChangeBounds$b d;
    public static final ChangeBounds$c e;
    public static final ChangeBounds$d f;
    public static final ChangeBounds$e g;
    public static final bg2_0 h;
    public final boolean a;

    static {
        Class<PointF> clazz = PointF.class;
        String string2 = "topLeft";
        Object object = new Property(clazz, string2);
        c = object;
        String string3 = "bottomRight";
        object = new Property(clazz, string3);
        d = object;
        object = new Property(clazz, string3);
        e = object;
        object = new Property(clazz, string2);
        f = object;
        object = new Property(clazz, "position");
        g = object;
        object = new Object();
        h = object;
    }

    public ChangeBounds() {
        this.a = false;
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean bl2 = false;
        this.a = false;
        Object object = af3.b;
        context = context.obtainStyledAttributes(attributeSet, object);
        attributeSet = (XmlResourceParser)attributeSet;
        object = "resizeClip";
        boolean bl3 = dt3.f((XmlPullParser)attributeSet, (String)object);
        if (bl3) {
            bl2 = context.getBoolean(0, false);
        }
        context.recycle();
        this.a = bl2;
    }

    public final void captureEndValues(Or3 or3) {
        this.captureValues(or3);
    }

    public final void captureStartValues(Or3 object) {
        this.captureValues((Or3)object);
        boolean bl2 = this.a;
        if (bl2) {
            View view = ((Or3)object).b;
            int n3 = R$id.transition_clip;
            if ((view = (Rect)view.getTag(n3)) != null) {
                object = ((Or3)object).a;
                String string2 = "android:changeBounds:clip";
                ((HashMap)object).put(string2, view);
            }
        }
    }

    public final void captureValues(Or3 object) {
        View view = ((Or3)object).b;
        int n3 = view.isLaidOut();
        if (n3 != 0 || (n3 = view.getWidth()) != 0 || (n3 = view.getHeight()) != 0) {
            int n4 = view.getLeft();
            int n7 = view.getTop();
            int n8 = view.getRight();
            int n10 = view.getBottom();
            Object object2 = new Rect(n4, n7, n8, n10);
            HashMap hashMap = ((Or3)object).a;
            String string2 = "android:changeBounds:bounds";
            hashMap.put(string2, object2);
            object = ((Or3)object).b.getParent();
            object2 = "android:changeBounds:parent";
            hashMap.put(object2, object);
            boolean bl2 = this.a;
            if (bl2) {
                object = "android:changeBounds:clip";
                view = view.getClipBounds();
                hashMap.put(object, view);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Animator createAnimator(ViewGroup var1_1, Or3 var2_2, Or3 var3_3) {
        block28: {
            block31: {
                block34: {
                    block32: {
                        block35: {
                            block33: {
                                block30: {
                                    block29: {
                                        block27: {
                                            var4_4 = this;
                                            var5_5 /* !! */  = var2_2;
                                            var6_6 = var3_3;
                                            if (var2_2 != null && var3_3 != null) break block27;
                                            var5_5 /* !! */  = var4_4;
                                            var7_7 = false;
                                            var4_4 = null;
                                            break block28;
                                        }
                                        var5_5 /* !! */  = var2_2.a;
                                        var8_11 = var3_3.a;
                                        var9_12 = "android:changeBounds:parent";
                                        var10_13 = (ViewGroup)var5_5 /* !! */ .get(var9_12);
                                        var9_12 = (ViewGroup)var8_11.get(var9_12);
                                        if (var10_13 != null && var9_12 != null) break block29;
                                        var5_5 /* !! */  = var4_4;
                                        var7_8 = false;
                                        var4_4 = null;
                                        break block28;
                                    }
                                    var6_6 = var3_3.b;
                                    var9_12 = "android:changeBounds:bounds";
                                    var10_13 = (Rect)var5_5 /* !! */ .get(var9_12);
                                    var9_12 = (Rect)var8_11.get(var9_12);
                                    var11_14 = var10_13.left;
                                    var12_15 = var9_12.left;
                                    var13_16 = var10_13.top;
                                    var14_17 = var9_12.top;
                                    var15_18 = var10_13.right;
                                    var16_19 = var9_12.right;
                                    var17_20 = var10_13.bottom;
                                    var18_21 = var9_12.bottom;
                                    var19_22 = var15_18 - var11_14;
                                    var20_23 = var17_20 - var13_16;
                                    var21_24 = var16_19 - var12_15;
                                    var22_25 = var18_21 - var14_17;
                                    var2_2 = var6_6;
                                    var6_6 = "android:changeBounds:clip";
                                    var5_5 /* !! */  = (Rect)var5_5 /* !! */ .get(var6_6);
                                    var6_6 = (Rect)var8_11.get(var6_6);
                                    if (var19_22 != 0 && var20_23 != 0 || var21_24 != 0 && var22_25 != 0) {
                                        if (var11_14 == var12_15 && var13_16 == var14_17) {
                                            var23_26 = 0;
                                            var24_27 = 0.0f;
                                            var8_11 = null;
                                        } else {
                                            var23_26 = 1;
                                            var24_27 = 1.4E-45f;
                                        }
                                        if (var15_18 != var16_19 || var17_20 != var18_21) {
                                            var25_28 = 1;
                                            ++var23_26;
                                        }
                                    } else {
                                        var23_26 = 0;
                                        var24_27 = 0.0f;
                                        var8_11 = null;
                                    }
                                    if (var5_5 /* !! */  != null && (var25_28 = var5_5 /* !! */ .equals(var6_6)) == 0) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    if (var5_5 /* !! */  == null && var6_6 != null) {
                                        ** continue;
                                    }
                                    break block30;
                                    var25_28 = 1;
                                    ++var23_26;
                                }
                                if (var23_26 <= 0) break block31;
                                var3_3 = var6_6;
                                var26_29 = var4_4.a;
                                var4_4 = ChangeBounds.g;
                                if (var26_29) break block32;
                                var6_6 = var2_2;
                                ee3_0.a((View)var2_2, var11_14, var13_16, var15_18, var17_20);
                                var27_30 = 2;
                                var28_32 = 2.8E-45f;
                                if (var23_26 != var27_30) break block33;
                                if (var19_22 == var21_24 && var20_23 == var22_25) {
                                    var5_5 /* !! */  = this.getPathMotion();
                                    var29_33 = var11_14;
                                    var30_38 = var13_16;
                                    var31_43 = var12_15;
                                    var32_48 = var14_17;
                                    var5_5 /* !! */  = var5_5 /* !! */ .getPath(var29_33, var30_38, var31_43, var32_48);
                                    var4_4 = f62_0.a(var2_2, (Property)var4_4, (Path)var5_5 /* !! */ );
lbl83:
                                    // 3 sources

                                    while (true) {
                                        var5_5 /* !! */  = this;
lbl85:
                                        // 2 sources

                                        while (true) {
                                            var33_51 = var4_4;
lbl87:
                                            // 2 sources

                                            while (true) {
                                                var7_9 = 1;
                                                ** GOTO lbl242
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                } else {
                                    var4_4 = new ChangeBounds$i((View)var6_6);
                                    var5_5 /* !! */  = this.getPathMotion();
                                    var29_34 = var11_14;
                                    var30_39 = var13_16;
                                    var31_44 = var12_15;
                                    var32_49 = var14_17;
                                    var5_5 /* !! */  = var5_5 /* !! */ .getPath(var29_34, var30_39, var31_44, var32_49);
                                    var33_51 = ChangeBounds.c;
                                    var5_5 /* !! */  = f62_0.a(var4_4, (Property)var33_51, (Path)var5_5 /* !! */ );
                                    var33_51 = this.getPathMotion();
                                    var30_39 = var15_18;
                                    var31_44 = var17_20;
                                    var32_49 = var16_19;
                                    var24_27 = var18_21;
                                    var33_51 = var33_51.getPath(var30_39, var31_44, var32_49, var24_27);
                                    var34_52 = ChangeBounds.d;
                                    var33_51 = f62_0.a(var4_4, (Property)var34_52, (Path)var33_51);
                                    var34_52 = new AnimatorSet();
                                    var22_25 = 2;
                                    var31_44 = 2.8E-45f;
                                    var35_53 = new Animator[var22_25];
                                    var19_22 = 0;
                                    var32_49 = 0.0f;
                                    var36_55 = null;
                                    var35_53[0] = var5_5 /* !! */ ;
                                    var27_30 = 1;
                                    var28_32 = 1.4E-45f;
                                    var35_53[var27_30] = var33_51;
                                    var34_52.playTogether(var35_53);
                                    var5_5 /* !! */  = new ChangeBounds$f((ChangeBounds$i)var4_4);
                                    var34_52.addListener((Animator.AnimatorListener)var5_5 /* !! */ );
                                    var7_9 = 1;
                                    var5_5 /* !! */  = this;
                                    var33_51 = var34_52;
                                }
                                break block34;
                            }
                            if (var11_14 != var12_15 || var13_16 != var14_17) break block35;
                            var4_4 = this.getPathMotion();
                            var28_32 = var15_18;
                            var29_35 = var17_20;
                            var30_40 = var16_19;
                            var31_45 = var18_21;
                            var4_4 = var4_4.getPath(var28_32, var29_35, var30_40, var31_45);
                            var5_5 /* !! */  = ChangeBounds.e;
                            var4_4 = f62_0.a(var2_2, (Property)var5_5 /* !! */ , (Path)var4_4);
                            ** GOTO lbl83
                        }
                        var4_4 = this.getPathMotion();
                        var28_32 = var11_14;
                        var29_36 = var13_16;
                        var30_41 = var12_15;
                        var31_46 = var14_17;
                        var4_4 = var4_4.getPath(var28_32, var29_36, var30_41, var31_46);
                        var5_5 /* !! */  = ChangeBounds.f;
                        var4_4 = f62_0.a(var6_6, (Property)var5_5 /* !! */ , (Path)var4_4);
                        ** while (true)
                    }
                    var6_6 = var2_2;
                    var23_26 = Math.max(var19_22, var21_24);
                    var25_28 = Math.max(var20_23, var22_25);
                    var37_57 = var16_19;
                    var16_19 = var13_16 + var25_28;
                    ee3_0.a((View)var2_2, var11_14, var13_16, var23_26 += var11_14, var16_19);
                    if (var11_14 == var12_15 && var13_16 == var14_17) {
                        var25_28 = var15_18;
                        var38_58 = var13_16;
                        var39_59 = var12_15;
                        var7_9 = 0;
                        var4_4 = null;
                    } else {
                        var8_11 = this.getPathMotion();
                        var40_60 = var11_14;
                        var25_28 = var15_18;
                        var41_61 = var13_16;
                        var38_58 = var13_16;
                        var42_62 = var12_15;
                        var39_59 = var12_15;
                        var43_63 = var14_17;
                        var8_11 = var8_11.getPath(var40_60, var41_61, var42_62, var43_63);
                        var4_4 = f62_0.a(var6_6, (Property)var4_4, (Path)var8_11);
                    }
                    if (var5_5 /* !! */  == null) {
                        var13_16 = 1;
                        var42_62 = 1.4E-45f;
                    } else {
                        var13_16 = 0;
                        var42_62 = 0.0f;
                    }
                    if (var13_16 != 0) {
                        var23_26 = 0;
                        var24_27 = 0.0f;
                        var8_11 = null;
                        var5_5 /* !! */  = new Rect(0, 0, var19_22, var20_23);
                    } else {
                        var23_26 = 0;
                        var24_27 = 0.0f;
                        var8_11 = null;
                    }
                    if (var3_3 == null) {
                        var20_23 = 1;
                        var30_42 = 1.4E-45f;
                    } else {
                        var20_23 = 0;
                        var30_42 = 0.0f;
                        var34_52 = null;
                    }
                    if (var20_23 != 0) {
                        var36_56 /* !! */  = new Rect(0, 0, var21_24, var22_25);
                        var44_64 = var36_56 /* !! */ ;
                    } else {
                        var44_64 = var3_3;
                    }
                    var21_24 = (int)var5_5 /* !! */ .equals(var44_64);
                    if (var21_24 == 0) {
                        var6_6.setClipBounds((Rect)var5_5 /* !! */ );
                        var35_54 = new Object[2];
                        var35_54[0] = var5_5 /* !! */ ;
                        var21_24 = 1;
                        var29_37 = 1.4E-45f;
                        var35_54[var21_24] = var44_64;
                        var36_56 /* !! */  = ChangeBounds.h;
                        var36_56 /* !! */  = ObjectAnimator.ofObject((Object)var6_6, (String)"clipBounds", (TypeEvaluator)var36_56 /* !! */ , (Object[])var35_54);
                        var22_25 = var37_57;
                        var23_26 = var25_28;
                        var27_31 = var38_58;
                        var45_65 = var39_59;
                        var25_28 = var11_14;
                        var11_14 = var20_23;
                        var37_57 = var38_58;
                        var38_58 = var23_26;
                        var39_59 = var17_20;
                        var33_51 = new ChangeBounds$g((View)var6_6, (Rect)var5_5 /* !! */ , (boolean)var13_16, (Rect)var44_64, (boolean)var20_23, var25_28, var27_31, var23_26, var17_20, var45_65, var14_17, var22_25, var18_21);
                        var36_56 /* !! */ .addListener((Animator.AnimatorListener)var33_51);
                        var5_5 /* !! */  = this;
                        this.addListener((Transition$i)var33_51);
                    } else {
                        var5_5 /* !! */  = this;
                        var19_22 = 0;
                        var32_50 = 0.0f;
                        var36_56 /* !! */  = null;
                    }
                    var21_24 = (int)androidx.transition.h.a;
                    if (var4_4 == null) {
                        var33_51 = var36_56 /* !! */ ;
                        ** continue;
                    }
                    ** while (var36_56 /* !! */  == null)
lbl231:
                    // 1 sources

                    var33_51 = new AnimatorSet();
                    var20_23 = 2;
                    var30_42 = 2.8E-45f;
                    var34_52 = new Animator[var20_23];
                    var22_25 = 0;
                    var31_47 = 0.0f;
                    var35_54 = null;
                    var34_52[0] = var4_4;
                    var7_9 = 1;
                    var34_52[var7_9] = var36_56 /* !! */ ;
                    var33_51.playTogether(var34_52);
                }
                var34_52 = var6_6.getParent();
                var20_23 = var34_52 instanceof ViewGroup;
                if (var20_23 != 0) {
                    var6_6 = (ViewGroup)var6_6.getParent();
                    VC3.a((ViewGroup)var6_6, (boolean)var7_9);
                    var4_4 = this.getRootTransition();
                    var34_52 = new ChangeBounds$h((ViewGroup)var6_6);
                    var4_4.addListener((Transition$i)var34_52);
                }
                return var33_51;
            }
            var5_5 /* !! */  = var4_4;
            var7_10 = false;
            var4_4 = null;
        }
        return null;
    }

    public final String[] getTransitionProperties() {
        return b;
    }

    public final boolean isSeekingSupported() {
        return true;
    }
}

