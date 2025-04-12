/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.Animator$AnimatorPauseListener
 *  android.animation.ObjectAnimator
 *  android.animation.PropertyValuesHolder
 *  android.animation.TypeEvaluator
 *  android.content.Context
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.PointF
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.FrameLayout
 *  org.xmlpull.v1.XmlPullParser
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat$c;
import androidx.transition.ChangeTransform$a;
import androidx.transition.ChangeTransform$b;
import androidx.transition.ChangeTransform$d;
import androidx.transition.ChangeTransform$e;
import androidx.transition.ChangeTransform$f;
import androidx.transition.R$id;
import androidx.transition.Transition;
import androidx.transition.Transition$i;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform
extends Transition {
    public static final String[] d = new String[]{"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public static final ChangeTransform$a e;
    public static final ChangeTransform$b f;
    public static final boolean g;
    public final boolean a;
    public final boolean b;
    public final Matrix c;

    static {
        Property property = new Property(float[].class, "nonTranslations");
        e = property;
        property = new Property(PointF.class, "translations");
        f = property;
        g = true;
    }

    public ChangeTransform() {
        Matrix matrix;
        boolean bl2;
        this.a = bl2 = true;
        this.b = bl2;
        this.c = matrix = new Matrix();
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object object;
        boolean bl2;
        this.a = bl2 = true;
        this.b = bl2;
        this.c = object = new Matrix();
        object = af3.e;
        context = context.obtainStyledAttributes(attributeSet, (int[])object);
        attributeSet = (XmlPullParser)attributeSet;
        object = "reparentWithOverlay";
        boolean bl3 = dt3.f((XmlPullParser)attributeSet, (String)object);
        bl3 = !bl3 ? true : context.getBoolean((int)(bl2 ? 1 : 0), bl2);
        this.a = bl3;
        object = "reparent";
        boolean bl4 = dt3.f((XmlPullParser)attributeSet, (String)object);
        if (bl4) {
            bl4 = false;
            attributeSet = null;
            bl2 = context.getBoolean(0, bl2);
        }
        this.b = bl2;
        context.recycle();
    }

    public final void b(Or3 object) {
        Object object2 = ((Or3)object).b;
        int n3 = object2.getVisibility();
        int n4 = 8;
        float f5 = 1.1E-44f;
        if (n3 == n4) {
            return;
        }
        object = ((Or3)object).a;
        Object object3 = object2.getParent();
        ((HashMap)object).put("android:changeTransform:parent", object3);
        object3 = new ChangeTransform$f((View)object2);
        String string2 = "android:changeTransform:transforms";
        ((HashMap)object).put(string2, object3);
        object3 = object2.getMatrix();
        if (object3 != null && (n4 = (int)(object3.isIdentity() ? 1 : 0)) == 0) {
            string2 = new Matrix((Matrix)object3);
        } else {
            n4 = 0;
            f5 = 0.0f;
            string2 = null;
        }
        object3 = "android:changeTransform:matrix";
        ((HashMap)object).put(object3, string2);
        n3 = (int)(this.b ? 1 : 0);
        if (n3 != 0) {
            object3 = new Matrix();
            string2 = (ViewGroup)object2.getParent();
            je3_0 je3_02 = ee3_0.a;
            je3_02.f((View)string2, (Matrix)object3);
            int n7 = -string2.getScrollX();
            float f6 = n7;
            n4 = -string2.getScrollY();
            f5 = n4;
            object3.preTranslate(f6, f5);
            ((HashMap)object).put("android:changeTransform:parentMatrix", object3);
            n3 = R$id.transition_transform;
            object3 = object2.getTag(n3);
            string2 = "android:changeTransform:intermediateMatrix";
            ((HashMap)object).put(string2, object3);
            n3 = R$id.parent_matrix;
            object2 = object2.getTag(n3);
            object3 = "android:changeTransform:intermediateParentMatrix";
            ((HashMap)object).put(object3, object2);
        }
    }

    public final void captureEndValues(Or3 or3) {
        this.b(or3);
    }

    public final void captureStartValues(Or3 or3) {
        this.b(or3);
        boolean bl2 = g;
        if (!bl2) {
            ViewGroup viewGroup = (ViewGroup)or3.b.getParent();
            or3 = or3.b;
            viewGroup.startViewTransition((View)or3);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Animator createAnimator(ViewGroup var1_1, Or3 var2_2, Or3 var3_3) {
        block52: {
            block53: {
                block54: {
                    block51: {
                        var4_4 /* !! */  = this;
                        var5_5 = var1_1 /* !! */ ;
                        var6_8 = var2_2;
                        var7_9 /* !! */  = var3_3;
                        var8_10 = 1;
                        if (var2_2 == null) return null;
                        if (var3_3 == null) return null;
                        var9_11 /* !! */  = var2_2.a;
                        var10_12 /* !! */  = "android:changeTransform:parent";
                        var11_13 = var9_11 /* !! */ .containsKey(var10_12 /* !! */ );
                        if (var11_13 == 0) return null;
                        var12_14 /* !! */  = var3_3.a;
                        var13_15 = var12_14 /* !! */ .containsKey(var10_12 /* !! */ );
                        if (var13_15 == 0) {
                            return null;
                        }
                        var16_20 = (ViewGroup)var9_11 /* !! */ .get(var10_12 /* !! */ );
                        var17_21 = (ViewGroup)var12_14 /* !! */ .get(var10_12 /* !! */ );
                        var18_22 = this.b;
                        if (var18_22 != 0 && !((var18_22 = this.isValidTarget((View)var16_20)) != 0 && (var18_22 = this.isValidTarget((View)var17_21)) != 0 ? (var19_23 /* !! */  = this.getMatchedTransitionValues((View)var16_20, (boolean)var8_10)) != null && var17_21 == (var19_23 /* !! */  = var19_23 /* !! */ .b) : var16_20 == var17_21)) {
                            var20_24 = 1;
                        } else {
                            var20_24 = 0;
                            var17_21 = null;
                        }
                        var19_23 /* !! */  = (Matrix)var9_11 /* !! */ .get("android:changeTransform:intermediateMatrix");
                        var21_25 = "android:changeTransform:matrix";
                        if (var19_23 /* !! */  != null) {
                            var9_11 /* !! */ .put(var21_25, var19_23 /* !! */ );
                        }
                        var19_23 /* !! */  = (Matrix)var9_11 /* !! */ .get("android:changeTransform:intermediateParentMatrix");
                        var22_26 /* !! */  = "android:changeTransform:parentMatrix";
                        if (var19_23 /* !! */  != null) {
                            var9_11 /* !! */ .put(var22_26 /* !! */ , var19_23 /* !! */ );
                        }
                        if (var20_24 != 0) {
                            var19_23 /* !! */  = (Matrix)var12_14 /* !! */ .get(var22_26 /* !! */ );
                            var23_27 /* !! */  = var7_9 /* !! */ .b;
                            var8_10 = R$id.parent_matrix;
                            var23_27 /* !! */ .setTag(var8_10, (Object)var19_23 /* !! */ );
                            var23_27 /* !! */  = var4_4 /* !! */ .c;
                            var23_27 /* !! */ .reset();
                            var19_23 /* !! */ .invert(var23_27 /* !! */ );
                            var24_28 = (Matrix)var9_11 /* !! */ .get(var21_25);
                            if (var24_28 == null) {
                                var24_28 = new Matrix();
                                var9_11 /* !! */ .put(var21_25, var24_28);
                            }
                            var19_23 /* !! */  = (Matrix)var9_11 /* !! */ .get(var22_26 /* !! */ );
                            var24_28.postConcat(var19_23 /* !! */ );
                            var24_28.postConcat(var23_27 /* !! */ );
                        }
                        var23_27 /* !! */  = (Matrix)var9_11 /* !! */ .get(var21_25);
                        var24_28 = (Matrix)var12_14 /* !! */ .get(var21_25);
                        if (var23_27 /* !! */  == null) {
                            var23_27 /* !! */  = SK1.a;
                        }
                        if (var24_28 == null) {
                            var24_28 = SK1.a;
                        }
                        var18_22 = var23_27 /* !! */ .equals(var24_28);
                        var25_29 = 1065353216;
                        var26_30 = 1.0f;
                        var27_31 = false;
                        var28_32 /* !! */  = 0.0f;
                        var29_33 = null;
                        if (var18_22 != 0) {
                            var30_34 = var9_11 /* !! */ ;
                            var31_35 = var10_12 /* !! */ ;
                            var32_36 = var16_20;
                            var33_37 = 0;
                            var6_8 = null;
                            var34_38 = 1065353216;
                            var35_39 = 1.0f;
                        } else {
                            var36_40 /* !! */  = var19_23 /* !! */  = var12_14 /* !! */ .get("android:changeTransform:transforms");
                            var36_40 /* !! */  = (ChangeTransform$f)var19_23 /* !! */ ;
                            var19_23 /* !! */  = var7_9 /* !! */ .b;
                            var19_23 /* !! */ .setTranslationX(0.0f);
                            var19_23 /* !! */ .setTranslationY(0.0f);
                            ViewCompat$c.q((View)var19_23 /* !! */ , 0.0f);
                            var19_23 /* !! */ .setScaleX(var26_30);
                            var19_23 /* !! */ .setScaleY(var26_30);
                            var19_23 /* !! */ .setRotationX(0.0f);
                            var19_23 /* !! */ .setRotationY(0.0f);
                            var19_23 /* !! */ .setRotation(0.0f);
                            var25_29 = 9;
                            var29_33 = (ViewParent)new float[var25_29];
                            var23_27 /* !! */ .getValues((float[])var29_33);
                            var23_27 /* !! */  = (Matrix)new float[var25_29];
                            var24_28.getValues((float[])var23_27 /* !! */ );
                            var37_41 /* !! */  = new ChangeTransform$e((View)var19_23 /* !! */ , (float[])var29_33);
                            var32_36 = var16_20;
                            var21_25 = new float[var25_29];
                            var16_20 = new Object();
                            var16_20.a = (float[])var21_25;
                            var6_8 = new float[2][];
                            var6_8[0] = var29_33;
                            var6_8[1] = var23_27 /* !! */ ;
                            var6_8 = PropertyValuesHolder.ofObject((Property)ChangeTransform.e, (TypeEvaluator)var16_20, (Object[])var6_8);
                            var16_20 = this.getPathMotion();
                            var30_34 = var9_11 /* !! */ ;
                            var25_29 = 2;
                            var26_30 = 2.8E-45f;
                            var35_39 = (float)var29_33[var25_29];
                            var38_42 = 5;
                            var39_43 = 7.0E-45f;
                            var28_32 /* !! */  = (float)var29_33[var38_42];
                            var31_35 = var10_12 /* !! */ ;
                            var40_44 = var23_27 /* !! */ [var25_29];
                            var41_45 /* !! */  = var23_27 /* !! */ [var38_42];
                            var23_27 /* !! */  = var16_20.getPath(var35_39, var28_32 /* !! */ , (float)var40_44, (float)var41_45 /* !! */ );
                            var23_27 /* !! */  = DB2.a(ChangeTransform.f, (Path)var23_27 /* !! */ );
                            var29_33 = new PropertyValuesHolder[var25_29];
                            var9_11 /* !! */  = null;
                            var29_33[0] = var6_8;
                            var33_37 = 1;
                            var29_33[var33_37] = var23_27 /* !! */ ;
                            var6_8 = ObjectAnimator.ofPropertyValuesHolder((Object)var37_41 /* !! */ , (PropertyValuesHolder[])var29_33);
                            var27_31 = var4_4 /* !! */ .a;
                            var34_38 = 1065353216;
                            var35_39 = 1.0f;
                            var21_25 = var23_27 /* !! */ ;
                            var42_46 = var24_28;
                            var43_47 = var20_24;
                            var23_27 /* !! */  = new ChangeTransform$d((View)var19_23 /* !! */ , (ChangeTransform$f)var36_40 /* !! */ , (ChangeTransform$e)var37_41 /* !! */ , (Matrix)var24_28, (boolean)var20_24, var27_31);
                            var6_8.addListener((Animator.AnimatorListener)var23_27 /* !! */ );
                            var6_8.addPauseListener((Animator.AnimatorPauseListener)var23_27 /* !! */ );
                        }
                        var44_48 = ChangeTransform.g;
                        if (var20_24 == 0 || var6_8 == null || !(var45_49 = var4_4 /* !! */ .a)) ** GOTO lbl221
                        var37_41 /* !! */  = var7_9 /* !! */ .b;
                        var29_33 = (Matrix)var12_14 /* !! */ .get(var22_26 /* !! */ );
                        var24_28 = new Matrix((Matrix)var29_33);
                        var29_33 = ee3_0.a;
                        var29_33.g((View)var5_5, (Matrix)var24_28);
                        var27_31 = Build.VERSION.SDK_INT;
                        var46_50 = 28 != 0;
                        var10_12 /* !! */  = ViewGroup.class;
                        if (var27_31 != var46_50) ** GOTO lbl153
                        var27_31 = qZ0.e;
                        if (var27_31) ** GOTO lbl150
                        try {
                            block61: {
                                block50: {
                                    var27_31 = qZ0.c;
                                    if (var27_31) break block61;
                                    var29_33 = "android.view.GhostView";
                                    try {
                                        var29_33 = Class.forName((String)var29_33);
                                        qZ0.b = var29_33;
                                        break block50;
                                    }
                                    catch (ClassNotFoundException v0) {}
lbl150:
                                    // 1 sources

                                    var27_31 = true;
                                    var28_32 /* !! */  = 1.4E-45f;
                                    break block51;
lbl153:
                                    // 1 sources

                                    var27_31 = rz0_0.g;
                                    var29_33 = var37_41 /* !! */ .getParent();
                                    var27_31 = var29_33 instanceof ViewGroup;
                                    if (!var27_31) {
                                        var5_5 = new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
                                        throw var5_5;
                                    }
                                    var27_31 = pZ0.c;
                                    var27_31 = R$id.ghost_view_holder;
                                    var29_33 = (pZ0)var5_5.getTag((int)var27_31);
                                    var46_50 = R$id.ghost_view;
                                    var22_26 /* !! */  = (rz0_0)var37_41 /* !! */ .getTag((int)var46_50);
                                    if (var22_26 /* !! */  != null && (var12_14 /* !! */  = (pZ0)var22_26 /* !! */ .getParent()) != var29_33) {
                                        var13_15 = var22_26 /* !! */ .d;
                                        var12_14 /* !! */ .removeView((View)var22_26 /* !! */ );
                                        var46_50 = false;
                                        var22_26 /* !! */  = null;
                                    } else {
                                        var13_15 = 0;
                                        var16_20 = null;
                                    }
                                    if (var22_26 /* !! */  == null) {
                                        var22_26 /* !! */  = new rz0_0(var37_41 /* !! */ );
                                        var22_26 /* !! */ .e = var24_28;
                                        if (var29_33 == null) {
                                            var24_28 = var1_1 /* !! */ .getContext();
                                            var29_33 = new FrameLayout((Context)var24_28);
                                            var29_33.setClipChildren(false);
                                            var29_33.a = var5_5;
                                            var8_10 = R$id.ghost_view_holder;
                                            var5_5.setTag(var8_10, (Object)var29_33);
                                            var24_28 = var1_1 /* !! */ .getOverlay();
                                            var24_28.add((View)var29_33);
                                            var8_10 = 1;
                                            var29_33.b = var8_10;
                                        } else {
                                            var8_10 = (int)var29_33.b;
                                            if (var8_10 == 0) {
                                                var5_5 = new IllegalStateException("This GhostViewHolder is detached!");
                                                throw var5_5;
                                            }
                                            var24_28 = var29_33.a;
                                            var12_14 /* !! */  = var24_28.getOverlay();
                                            var12_14 /* !! */ .remove((View)var29_33);
                                            var24_28 = var24_28.getOverlay();
                                            var24_28.add((View)var29_33);
                                        }
                                        var8_10 = var29_33.getLeft();
                                        var11_13 = var29_33.getTop();
                                        var20_24 = var29_33.getLeft();
                                        var18_22 = var1_1 /* !! */ .getWidth() + var20_24;
                                        var20_24 = var29_33.getTop();
                                        var25_29 = var1_1 /* !! */ .getHeight() + var20_24;
                                        ee3_0.a((View)var29_33, var8_10, var11_13, var18_22, var25_29);
                                        var8_10 = var22_26 /* !! */ .getLeft();
                                        var11_13 = var22_26 /* !! */ .getTop();
                                        var20_24 = var22_26 /* !! */ .getLeft();
                                        var18_22 = var1_1 /* !! */ .getWidth() + var20_24;
                                        var20_24 = var22_26 /* !! */ .getTop();
                                        var14_17 = var1_1 /* !! */ .getHeight() + var20_24;
                                        ee3_0.a(var22_26 /* !! */ , var8_10, var11_13, var18_22, var14_17);
                                        var5_5 = new ArrayList();
                                        pZ0.a(var22_26 /* !! */ .c, (ArrayList)var5_5);
                                        var24_28 = new ArrayList();
                                        var11_13 = var29_33.getChildCount() - 1;
                                        var20_24 = 0;
                                        var17_21 = null;
                                        break block52;
                                    }
                                    var42_46 = var6_8;
                                    var43_47 = var44_48;
                                    var22_26 /* !! */ .e = var24_28;
                                    ** GOTO lbl323
lbl221:
                                    // 1 sources

                                    var4_4 /* !! */  = var2_2;
                                    var42_46 = var6_8;
                                    var43_47 = var44_48;
                                    if (var44_48 != false) return var42_46;
                                    var5_5 = var2_2.b;
                                    var16_20 = var32_36;
                                    var32_36.endViewTransition((View)var5_5);
                                    return var42_46;
                                }
                                var27_31 = true;
                                var28_32 /* !! */  = 1.4E-45f;
                                qZ0.c = var27_31;
                            }
                            var29_33 = qZ0.b;
                            var22_26 /* !! */  = "addGhost";
                            var11_13 = 3;
                            var16_20 = new Class[var11_13];
                            var12_14 /* !! */  = View.class;
                            var20_24 = 0;
                            var17_21 = null;
                            var16_20[0] = var12_14 /* !! */ ;
                            var11_13 = 1;
                            var16_20[var11_13] = var10_12 /* !! */ ;
                            var10_12 /* !! */  = Matrix.class;
                            var20_24 = 2;
                            var16_20[var20_24] = var10_12 /* !! */ ;
                            var29_33 = var29_33.getDeclaredMethod((String)var22_26 /* !! */ , (Class<?>)var16_20);
                            qZ0.d = var29_33;
                            var29_33.setAccessible((boolean)var11_13);
                        }
                        catch (NoSuchMethodException v1) {}
                        var27_31 = true;
                        var28_32 /* !! */  = 1.4E-45f;
                        qZ0.e = var27_31;
                    }
                    var22_26 /* !! */  = qZ0.d;
                    if (var22_26 /* !! */  != null) {
                        try {
                            var11_13 = 3;
                            var12_14 /* !! */  = new Object[var11_13];
                            var13_15 = 0;
                            var16_20 = null;
                            var12_14 /* !! */ [0] = var37_41 /* !! */ ;
                            var12_14 /* !! */ [var27_31] = var5_5;
                            var14_17 = 2;
                            var15_19 = 2.8E-45f;
                            var12_14 /* !! */ [var14_17] = var24_28;
                            var14_17 = 0;
                            var15_19 = 0.0f;
                            var5_5 = null;
                            var29_33 = var22_26 /* !! */ .invoke(null, var12_14 /* !! */ );
                            var29_33 = (View)var29_33;
                            var22_26 /* !! */  = var10_12 /* !! */  = new qZ0((View)var29_33);
                            break block53;
                        }
                        catch (InvocationTargetException var5_6) {
                        }
                        catch (IllegalAccessException v2) {
                            break block54;
                        }
                        var5_7 = var5_6.getCause();
                        var6_8 = new RuntimeException(var5_7);
                        throw var6_8;
                    }
                }
                var46_50 = false;
                var22_26 /* !! */  = null;
            }
            var42_46 = var6_8;
            var43_47 = var44_48;
            ** GOTO lbl327
        }
        while (true) {
            block72: {
                block56: {
                    block57: {
                        block55: {
                            block65: {
                                block62: {
                                    block64: {
                                        block63: {
                                            if (var20_24 > var11_13) break block62;
                                            var18_22 = var20_24 + var11_13;
                                            var26_30 = 2.8E-45f;
                                            var21_25 = ((rz0_0)var29_33.getChildAt((int)(var18_22 /= 2))).c;
                                            pZ0.a((View)var21_25, (ArrayList)var24_28);
                                            var25_29 = (int)var5_5.isEmpty();
                                            if (var25_29 != 0 || (var25_29 = (int)var24_28.isEmpty()) != 0) break block63;
                                            var25_29 = 0;
                                            var26_30 = 0.0f;
                                            var21_25 = null;
                                            var9_11 /* !! */  = var5_5.get(0);
                                            if (var9_11 /* !! */  == (var4_4 /* !! */  = var24_28.get(0))) break block64;
                                        }
                                        var1_1 /* !! */  = var5_5;
                                        var42_46 = var6_8;
                                        var43_47 = var44_48;
                                        var47_51 = var10_12 /* !! */ ;
                                        ** GOTO lbl378
                                    }
                                    var48_52 = var5_5.size();
                                    var34_38 = var24_28.size();
                                    var48_52 = Math.min(var48_52, var34_38);
                                    var35_39 = 1.4E-45f;
                                    break block65;
                                }
                                var42_46 = var6_8;
                                var43_47 = var44_48;
                                if (var20_24 >= 0 && var20_24 < (var14_17 = var29_33.getChildCount())) {
                                    var29_33.addView(var22_26 /* !! */ , var20_24);
                                } else {
                                    var29_33.addView(var22_26 /* !! */ );
                                }
                                var22_26 /* !! */ .d = var13_15;
lbl323:
                                // 2 sources

                                var14_17 = var22_26 /* !! */ .d;
                                var48_52 = 1;
                                var51_55 = 1.4E-45f;
                                var22_26 /* !! */ .d = var14_17 += var48_52;
lbl327:
                                // 2 sources

                                if (var22_26 /* !! */  == null) {
                                    return var42_46;
                                }
                                var5_5 = var30_34;
                                var4_4 /* !! */  = var31_35;
                                var5_5 = (ViewGroup)var30_34.get(var31_35);
                                var4_4 /* !! */  = var2_2;
                                var6_8 = var2_2.b;
                                var22_26 /* !! */ .a((ViewGroup)var5_5, (View)var6_8);
                                var5_5 = this;
                                while ((var6_8 = var5_5.mParent) != null) {
                                    var5_5 = var6_8;
                                }
                                var6_8 = new Object();
                                var6_8.a = var37_41 /* !! */ ;
                                var6_8.b = var22_26 /* !! */ ;
                                var5_5.addListener((Transition$i)var6_8);
                                if (var43_47 == false) return var42_46;
                                var5_5 = var4_4 /* !! */ .b;
                                var4_4 /* !! */  = var3_3;
                                var4_4 /* !! */  = var3_3.b;
                                if (var5_5 != var4_4 /* !! */ ) {
                                    var48_52 = 0;
                                    var51_55 = 0.0f;
                                    var4_4 /* !! */  = null;
                                    ee3_0.b((View)var5_5, 0.0f);
                                }
                                var14_17 = 1065353216;
                                var15_19 = 1.0f;
                                ee3_0.b(var37_41 /* !! */ , var15_19);
                                return var42_46;
                            }
                            for (var34_38 = 1; var34_38 < var48_52; var34_38 += var33_37) {
                                block66: {
                                    block67: {
                                        var21_25 = (View)var5_5.get(var34_38);
                                        var36_40 /* !! */  = var24_28.get(var34_38);
                                        var1_1 /* !! */  = var5_5;
                                        var5_5 = var36_40 /* !! */ ;
                                        var5_5 = (View)var36_40 /* !! */ ;
                                        if (var21_25 == var5_5) break block66;
                                        var4_4 /* !! */  = (ViewGroup)var21_25.getParent();
                                        var34_38 = var4_4 /* !! */ .getChildCount();
                                        var49_53 = pZ0$a.a((View)var21_25);
                                        cfr_temp_0 = var49_53 - (var39_43 = pZ0$a.a((View)var5_5));
                                        var50_54 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                        if (var50_54 == 0) break block55;
                                        var51_55 = pZ0$a.a((View)var21_25);
                                        var15_19 = pZ0$a.a((View)var5_5);
                                        var14_17 = (int)(var51_55 == var15_19 ? 0 : (var51_55 > var15_19 ? 1 : -1));
                                        var42_46 = var6_8;
                                        var43_47 = var44_48;
                                        var47_51 = var10_12 /* !! */ ;
                                        if (var14_17 <= 0) break block67;
lbl378:
                                        // 2 sources

                                        var50_54 = var11_13;
                                        var14_17 = 2;
                                        var15_19 = 2.8E-45f;
                                        var33_37 = 1;
                                        break block56;
                                    }
                                    var14_17 = 2;
                                    var15_19 = 2.8E-45f;
                                    var33_37 = 1;
                                    break block57;
                                }
                                var42_46 = var6_8;
                                var43_47 = var44_48;
                                var47_51 = var10_12 /* !! */ ;
                                var50_54 = var11_13;
                                var14_17 = 2;
                                var15_19 = 2.8E-45f;
                                var33_37 = 1;
                                var5_5 = var1_1 /* !! */ ;
                                var7_9 /* !! */  = var3_3;
                            }
                            var1_1 /* !! */  = var5_5;
                            var42_46 = var6_8;
                            var43_47 = var44_48;
                            var47_51 = var10_12 /* !! */ ;
                            var50_54 = var11_13;
                            var14_17 = 2;
                            var15_19 = 2.8E-45f;
                            var33_37 = 1;
                            var52_56 = var24_28.size();
                            if (var52_56 != var48_52) break block57;
                            break block56;
                        }
                        var50_54 = var11_13;
                        var11_13 = 0;
                        var12_14 /* !! */  = null;
                        while (true) {
                            block59: {
                                block60: {
                                    block71: {
                                        block58: {
                                            block68: {
                                                block70: {
                                                    block69: {
                                                        if (var11_13 >= var34_38) break block68;
                                                        var38_42 = var34_38;
                                                        var34_38 = Build.VERSION.SDK_INT;
                                                        var42_46 = var6_8;
                                                        var33_37 = 29;
                                                        if (var34_38 < var33_37) break block69;
                                                        var33_37 = VC3$a.a((ViewGroup)var4_4 /* !! */ , var11_13);
                                                        var43_47 = var44_48;
                                                        var47_51 = var10_12 /* !! */ ;
                                                        var34_38 = 2;
                                                        var35_39 = 2.8E-45f;
                                                        break block59;
                                                    }
                                                    var33_37 = (int)VC3.c;
                                                    if (var33_37 != 0) break block70;
                                                    var6_8 = "getChildDrawingOrder";
                                                    var34_38 = 2;
                                                    var35_39 = 2.8E-45f;
                                                    var7_9 /* !! */  = new Class[var34_38];
                                                    var9_11 /* !! */  = Integer.TYPE;
                                                    var43_47 = 0;
                                                    var7_9 /* !! */ [0] = var9_11 /* !! */ ;
                                                    var43_47 = var44_48;
                                                    var44_48 = true;
                                                    var41_45 /* !! */  = (Matrix)1.4E-45f;
                                                    try {
                                                        var7_9 /* !! */ [var44_48] = var9_11 /* !! */ ;
                                                        VC3.b = var6_8 = var10_12 /* !! */ .getDeclaredMethod((String)var6_8, var7_9 /* !! */ );
                                                        var6_8.setAccessible(var44_48);
                                                        break block58;
                                                    }
                                                    catch (NoSuchMethodException v3) {}
                                                    catch (NoSuchMethodException v4) {
                                                        var43_47 = var44_48;
                                                    }
                                                    break block58;
                                                }
                                                var43_47 = var44_48;
                                                break block71;
                                            }
                                            var42_46 = var6_8;
                                            var43_47 = var44_48;
                                            var47_51 = var10_12 /* !! */ ;
                                            var33_37 = 1;
                                            var14_17 = 2;
                                            var15_19 = 2.8E-45f;
                                            break block56;
                                        }
                                        var33_37 = 1;
                                        VC3.c = var33_37;
                                    }
                                    var6_8 = VC3.b;
                                    if (var6_8 != null) {
                                        var52_56 = var4_4 /* !! */ .getChildCount();
                                        var7_9 /* !! */  = var52_56;
                                        var23_27 /* !! */  = Integer.valueOf(var11_13);
                                        var47_51 = var10_12 /* !! */ ;
                                        var34_38 = 2;
                                        var35_39 = 2.8E-45f;
                                        var10_12 /* !! */  = new Object[var34_38];
                                        try {
                                            var10_12 /* !! */ [0] = var7_9 /* !! */ ;
                                            var52_56 = 1;
                                            var10_12 /* !! */ [var52_56] = var23_27 /* !! */ ;
                                            var6_8 = var6_8.invoke((Object)var4_4 /* !! */ , var10_12 /* !! */ );
                                            var6_8 = (Integer)var6_8;
                                            var33_37 = var6_8.intValue();
                                            break block59;
                                        }
                                        catch (IllegalAccessException | InvocationTargetException v5) {
                                            break block60;
                                        }
                                        catch (IllegalAccessException | InvocationTargetException v6) {
                                            break block60;
                                        }
                                        catch (IllegalAccessException | InvocationTargetException v7) {
                                            var47_51 = var10_12 /* !! */ ;
                                            var34_38 = 2;
                                            var35_39 = 2.8E-45f;
                                        }
                                    } else {
                                        var47_51 = var10_12 /* !! */ ;
                                        var34_38 = 2;
                                        var35_39 = 2.8E-45f;
                                    }
                                }
                                var33_37 = var11_13;
                            }
                            var6_8 = var4_4 /* !! */ .getChildAt(var33_37);
                            if (var6_8 == var21_25) {
                                var14_17 = 2;
                                var15_19 = 2.8E-45f;
                                var33_37 = 1;
                                break;
                            }
                            if (var6_8 == var5_5) {
                                var14_17 = 2;
                                var15_19 = 2.8E-45f;
                                var33_37 = 1;
                                break block56;
                            }
                            var33_37 = 1;
                            var11_13 += var33_37;
                            var7_9 /* !! */  = var3_3;
                            var34_38 = var38_42;
                            var6_8 = var42_46;
                            var44_48 = var43_47;
                            var10_12 /* !! */  = var47_51;
                        }
                    }
                    var11_13 = var18_22 -= var33_37;
                    break block72;
                }
                var20_24 = var18_22 += var33_37;
                var11_13 = var50_54;
            }
            var24_28.clear();
            var4_4 /* !! */  = this;
            var5_5 = var1_1 /* !! */ ;
            var7_9 /* !! */  = var3_3;
            var6_8 = var42_46;
            var44_48 = var43_47;
            var10_12 /* !! */  = var47_51;
            var34_38 = 1065353216;
            var35_39 = 1.0f;
        }
    }

    public final String[] getTransitionProperties() {
        return d;
    }
}

