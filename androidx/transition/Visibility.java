/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.Animator$AnimatorPauseListener
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Picture
 *  android.graphics.RectF
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  org.xmlpull.v1.XmlPullParser
 */
package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.R$id;
import androidx.transition.Transition;
import androidx.transition.Transition$i;
import androidx.transition.Visibility$a;
import androidx.transition.Visibility$b;
import androidx.transition.Visibility$c;
import androidx.transition.h;
import androidx.transition.h$a;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public abstract class Visibility
extends Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String[] sTransitionProperties = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    private int mMode;

    public Visibility() {
        this.mMode = 3;
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        this.mMode = n3 = 3;
        Object object = af3.c;
        context = context.obtainStyledAttributes(attributeSet, object);
        attributeSet = (XmlResourceParser)attributeSet;
        object = "transitionVisibilityMode";
        int n4 = dt3.d((TypedArray)context, (XmlPullParser)attributeSet, (String)object, 0, 0);
        context.recycle();
        if (n4 != 0) {
            this.setMode(n4);
        }
    }

    private void captureValues(Or3 or3) {
        Object object = or3.b.getVisibility();
        HashMap hashMap = or3.a;
        hashMap.put(PROPNAME_VISIBILITY, object);
        object = or3.b.getParent();
        hashMap.put(PROPNAME_PARENT, object);
        object = new int[2];
        or3.b.getLocationOnScreen((int[])object);
        hashMap.put(PROPNAME_SCREEN_LOCATION, object);
    }

    private Visibility$c getVisibilityChangeInfo(Or3 or3, Or3 or32) {
        int n3;
        HashMap hashMap;
        int n4;
        Visibility$c visibility$c = new Object();
        visibility$c.a = false;
        visibility$c.b = false;
        int n7 = 0;
        ViewGroup viewGroup = null;
        int n8 = -1;
        String string2 = PROPNAME_PARENT;
        String string3 = PROPNAME_VISIBILITY;
        if (or3 != null && (n4 = (hashMap = or3.a).containsKey(string3)) != 0) {
            Integer n10 = (Integer)hashMap.get(string3);
            visibility$c.c = n4 = n10.intValue();
            hashMap = (ViewGroup)hashMap.get(string2);
            visibility$c.e = hashMap;
        } else {
            visibility$c.c = n8;
            visibility$c.e = null;
        }
        if (or32 != null && (n4 = (hashMap = or32.a).containsKey(string3)) != 0) {
            visibility$c.d = n7 = ((Integer)hashMap.get(string3)).intValue();
            visibility$c.f = viewGroup = (ViewGroup)hashMap.get(string2);
        } else {
            visibility$c.d = n8;
            visibility$c.f = null;
        }
        n7 = 1;
        if (or3 != null && or32 != null) {
            ViewGroup viewGroup2;
            int n14 = visibility$c.c;
            int n15 = visibility$c.d;
            if (n14 == n15 && (viewGroup2 = visibility$c.e) == (string2 = visibility$c.f)) {
                return visibility$c;
            }
            if (n14 != n15) {
                if (n14 == 0) {
                    visibility$c.b = false;
                    visibility$c.a = n7;
                } else if (n15 == 0) {
                    visibility$c.b = n7;
                    visibility$c.a = n7;
                }
            } else {
                or3 = visibility$c.f;
                if (or3 == null) {
                    visibility$c.b = false;
                    visibility$c.a = n7;
                } else {
                    or3 = visibility$c.e;
                    if (or3 == null) {
                        visibility$c.b = n7;
                        visibility$c.a = n7;
                    }
                }
            }
        } else if (or3 == null && (n3 = visibility$c.d) == 0) {
            visibility$c.b = n7;
            visibility$c.a = n7;
        } else if (or32 == null && (n3 = visibility$c.c) == 0) {
            visibility$c.b = false;
            visibility$c.a = n7;
        }
        return visibility$c;
    }

    public void captureEndValues(Or3 or3) {
        this.captureValues(or3);
    }

    public void captureStartValues(Or3 or3) {
        this.captureValues(or3);
    }

    public Animator createAnimator(ViewGroup viewGroup, Or3 or3, Or3 or32) {
        ViewGroup viewGroup2;
        Object object = this.getVisibilityChangeInfo(or3, or32);
        boolean bl2 = ((Visibility$c)object).a;
        if (bl2 && ((viewGroup2 = ((Visibility$c)object).e) != null || (viewGroup2 = ((Visibility$c)object).f) != null)) {
            bl2 = ((Visibility$c)object).b;
            if (bl2) {
                int n3 = ((Visibility$c)object).c;
                int n4 = ((Visibility$c)object).d;
                return this.onAppear(viewGroup, or3, n3, or32, n4);
            }
            int n7 = ((Visibility$c)object).c;
            int n8 = ((Visibility$c)object).d;
            object = this;
            viewGroup2 = viewGroup;
            return this.onDisappear(viewGroup, or3, n7, or32, n8);
        }
        return null;
    }

    public int getMode() {
        return this.mMode;
    }

    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    public boolean isTransitionRequired(Or3 object, Or3 or3) {
        int n3;
        HashMap hashMap;
        boolean bl2;
        String string2;
        HashMap hashMap2;
        boolean bl3;
        boolean bl4 = false;
        if (object == null && or3 == null) {
            return false;
        }
        if (object != null && or3 != null && (bl3 = (hashMap2 = or3.a).containsKey(string2 = PROPNAME_VISIBILITY)) != (bl2 = (hashMap = ((Or3)object).a).containsKey(string2))) {
            return false;
        }
        object = this.getVisibilityChangeInfo((Or3)object, or3);
        int n4 = ((Visibility$c)object).a;
        if (n4 != 0 && ((n4 = ((Visibility$c)object).c) == 0 || (n3 = ((Visibility$c)object).d) == 0)) {
            bl4 = true;
        }
        return bl4;
    }

    public boolean isVisible(Or3 object) {
        boolean bl2 = false;
        if (object == null) {
            return false;
        }
        object = ((Or3)object).a;
        Integer n3 = (Integer)((HashMap)object).get(PROPNAME_VISIBILITY);
        int n4 = n3;
        String string2 = PROPNAME_PARENT;
        object = (View)((HashMap)object).get(string2);
        if (n4 == 0 && object != null) {
            bl2 = true;
        }
        return bl2;
    }

    public Animator onAppear(ViewGroup viewGroup, Or3 or3, int n3, Or3 or32, int n4) {
        n3 = this.mMode;
        n4 = 1;
        if ((n3 &= n4) == n4 && or32 != null) {
            Object object;
            if (or3 == null) {
                object = (View)or32.b.getParent();
                n4 = 0;
                Or3 or33 = this.getMatchedTransitionValues((View)object, false);
                object = this.getTransitionValues((View)object, false);
                object = this.getVisibilityChangeInfo(or33, (Or3)object);
                n3 = (int)(object.a ? 1 : 0);
                if (n3 != 0) {
                    return null;
                }
            }
            object = or32.b;
            return this.onAppear(viewGroup, (View)object, or3, or32);
        }
        return null;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, Or3 or3, Or3 or32) {
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Animator onDisappear(ViewGroup var1_1, Or3 var2_2, int var3_3, Or3 var4_4, int var5_5) {
        block25: {
            block35: {
                block26: {
                    block34: {
                        block28: {
                            block29: {
                                block32: {
                                    block33: {
                                        block30: {
                                            block31: {
                                                block27: {
                                                    block24: {
                                                        var6_6 = this;
                                                        var7_7 = var1_1;
                                                        var8_8 = var2_2;
                                                        var9_9 = var4_4;
                                                        var10_10 /* !! */  = var5_5;
                                                        var11_11 = this.mMode;
                                                        var12_12 /* !! */  = 2;
                                                        var13_13 = 0;
                                                        var14_14 = 0.0f;
                                                        var15_15 = null;
                                                        if ((var11_11 &= var12_12 /* !! */ ) != var12_12 /* !! */ ) {
                                                            return null;
                                                        }
                                                        if (var2_2 == null) {
                                                            return null;
                                                        }
                                                        var16_16 = var2_2.b;
                                                        if (var4_4 != null) {
                                                            var17_17 /* !! */  = var4_4.b;
                                                        } else {
                                                            var18_18 = 0;
                                                            var17_17 /* !! */  = null;
                                                        }
                                                        var19_19 = R$id.save_overlay_view;
                                                        var20_20 = (View)var16_16.getTag(var19_19);
                                                        var21_21 = true;
                                                        if (var20_20 != null) break block25;
                                                        if (var17_17 /* !! */  == null || (var20_20 = var17_17 /* !! */ .getParent()) == null) ** GOTO lbl43
                                                        var19_19 = 4;
                                                        if (var10_10 /* !! */  == var19_19 || var16_16 == var17_17 /* !! */ ) {
                                                            var20_20 = var17_17 /* !! */ ;
                                                            var22_22 = 0;
                                                            var23_23 = 0.0f;
                                                            var24_24 = null;
                                                            var18_18 = 0;
                                                            var17_17 /* !! */  = null;
                                                        } else {
                                                            while (true) {
                                                                var18_18 = 0;
                                                                var17_17 /* !! */  = null;
                                                                var19_19 = 0;
                                                                var20_20 = null;
                                                                var22_22 = 1;
                                                                var23_23 = 1.4E-45f;
                                                                break block24;
                                                                break;
                                                            }
lbl43:
                                                            // 1 sources

                                                            if (var17_17 /* !! */  == null) ** continue;
                                                            var19_19 = 0;
                                                            var20_20 = null;
                                                            var22_22 = 0;
                                                            var23_23 = 0.0f;
                                                            var24_24 = null;
                                                        }
                                                    }
                                                    if (var22_22 == 0) break block26;
                                                    var24_24 = var16_16.getParent();
                                                    if (var24_24 != null) break block27;
                                                    var25_25 = var20_20;
                                                    break block28;
                                                }
                                                var24_24 = var16_16.getParent();
                                                var22_22 = var24_24 instanceof View;
                                                if (var22_22 == 0) break block26;
                                                var24_24 = (View)var16_16.getParent();
                                                var26_26 = var6_6.getTransitionValues((View)var24_24, var21_21);
                                                var27_27 = var6_6.getMatchedTransitionValues((View)var24_24, var21_21);
                                                var26_26 = var6_6.getVisibilityChangeInfo((Or3)var26_26, var27_27);
                                                var28_28 = var26_26.a;
                                                if (var28_28 != 0) break block29;
                                                var18_18 = (int)h.a;
                                                var17_17 /* !! */  = new Matrix();
                                                var29_29 = -var24_24.getScrollX();
                                                var22_22 = -var24_24.getScrollY();
                                                var23_23 = var22_22;
                                                var17_17 /* !! */ .setTranslate(var29_29, var23_23);
                                                var24_24 = ee3_0.a;
                                                var24_24.f(var16_16, (Matrix)var17_17 /* !! */ );
                                                var24_24.g((View)var7_7, (Matrix)var17_17 /* !! */ );
                                                var29_29 = var16_16.getWidth();
                                                var30_30 = var16_16.getHeight();
                                                var24_24 = new RectF(0.0f, 0.0f, var29_29, var30_30);
                                                var17_17 /* !! */ .mapRect((RectF)var24_24);
                                                var29_29 = var24_24.left;
                                                var28_28 = Math.round(var29_29);
                                                var30_30 = var24_24.top;
                                                var31_31 = Math.round(var30_30);
                                                var32_32 = var24_24.right;
                                                var33_33 = Math.round(var32_32);
                                                var14_14 = var24_24.bottom;
                                                var13_13 = Math.round(var14_14);
                                                var35_35 = var16_16.getContext();
                                                var34_34 = new ImageView(var35_35);
                                                var35_35 = ImageView.ScaleType.CENTER_CROP;
                                                var34_34.setScaleType((ImageView.ScaleType)var35_35);
                                                var36_36 = var16_16.isAttachedToWindow() ^ var21_21;
                                                if (var7_7 != null && (var37_37 = var1_1.isAttachedToWindow()) != 0) {
                                                    var37_37 = 1;
                                                    var38_38 = 1.4E-45f;
                                                } else {
                                                    var37_37 = 0;
                                                    var38_38 = 0.0f;
                                                    var39_39 = null;
                                                }
                                                if (!var36_36) break block30;
                                                if (var37_37 != 0) break block31;
                                                var25_25 = var20_20;
                                                var40_40 = 0;
                                                var41_42 = 0.0f;
                                                var6_6 = null;
                                                break block32;
                                            }
                                            var42_45 = var39_39 = var16_16.getParent();
                                            var42_45 = (ViewGroup)var39_39;
                                            var37_37 = var42_45.indexOfChild(var16_16);
                                            var25_25 = var20_20;
                                            var20_20 = var1_1.getOverlay();
                                            var20_20.add(var16_16);
                                            var19_19 = var37_37;
                                            break block33;
                                        }
                                        var25_25 = var20_20;
                                        var19_19 = 0;
                                        var20_20 = null;
                                        var21_21 = false;
                                        var42_45 = null;
                                    }
                                    var10_10 /* !! */  = Math.round(var24_24.width());
                                    var38_38 = var24_24.height();
                                    var43_46 /* !! */  = Math.round(var38_38);
                                    if (var10_10 /* !! */  > 0 && var43_46 /* !! */  > 0) {
                                        var44_47 = var10_10 /* !! */  * var43_46 /* !! */ ;
                                        var37_37 = 1233125376;
                                        var38_38 = 8;
                                        var44_47 = var38_38 / var44_47;
                                        var41_43 = Math.min(1.0f, var44_47);
                                        var44_47 = (float)var10_10 /* !! */  * var41_43;
                                        var45_49 = Math.round(var44_47);
                                        var46_51 = (float)var43_46 /* !! */  * var41_43;
                                        var43_46 /* !! */  = Math.round(var46_51);
                                        var47_52 = -var24_24.left;
                                        var23_23 = -var24_24.top;
                                        var17_17 /* !! */ .postTranslate(var47_52, var23_23);
                                        var17_17 /* !! */ .postScale(var41_43, var41_43);
                                        var40_40 = (int)h.a;
                                        if (var40_40 != 0) {
                                            var6_6 = new Picture();
                                            var8_8 = var6_6.beginRecording(var45_49, var43_46 /* !! */ );
                                            var8_8.concat((Matrix)var17_17 /* !! */ );
                                            var16_16.draw((Canvas)var8_8);
                                            var6_6.endRecording();
                                            var6_6 = h$a.a((Picture)var6_6);
                                        } else {
                                            var6_6 = Bitmap.Config.ARGB_8888;
                                            var6_6 = Bitmap.createBitmap((int)var45_49, (int)var43_46 /* !! */ , (Bitmap.Config)var6_6);
                                            var8_8 = new Canvas((Bitmap)var6_6);
                                            var8_8.concat((Matrix)var17_17 /* !! */ );
                                            var16_16.draw((Canvas)var8_8);
                                        }
                                    } else {
                                        var40_40 = 0;
                                        var41_44 = 0.0f;
                                        var6_6 = null;
                                    }
                                    if (var36_36) {
                                        var8_8 = var1_1.getOverlay();
                                        var8_8.remove(var16_16);
                                        var42_45.addView(var16_16, var19_19);
                                    }
                                }
                                if (var6_6 != null) {
                                    var34_34.setImageBitmap((Bitmap)var6_6);
                                }
                                var40_40 = var33_33 - var28_28;
                                var45_49 = 0x40000000;
                                var44_47 = 2.0f;
                                var40_40 = View.MeasureSpec.makeMeasureSpec((int)var40_40, (int)var45_49);
                                var43_46 /* !! */  = var13_13 - var31_31;
                                var45_49 = View.MeasureSpec.makeMeasureSpec((int)var43_46 /* !! */ , (int)var45_49);
                                var34_34.measure(var40_40, var45_49);
                                var34_34.layout(var28_28, var31_31, var33_33, var13_13);
                                var6_6 = this;
                                var20_20 = var34_34;
lbl176:
                                // 3 sources

                                while (true) {
                                    var15_15 = var25_25;
                                    var21_21 = false;
                                    var42_45 = null;
                                    break block25;
                                    break;
                                }
                            }
                            var25_25 = var20_20;
                            var40_41 = var24_24.getId();
                            var8_8 = var24_24.getParent();
                            if (var8_8 != null) break block34;
                            var45_50 = -1;
                            var44_48 = 0.0f / 0.0f;
                            if (var40_41 == var45_50 || (var6_6 = var7_7.findViewById(var40_41)) == null) break block34;
                            var6_6 = this;
                            var45_50 = (int)this.mCanRemoveViews;
                            if (var45_50 == 0) break block35;
                        }
                        var20_20 = var16_16;
                        ** GOTO lbl176
                    }
                    var6_6 = this;
                    break block35;
                }
                var25_25 = var20_20;
            }
            var20_20 = var17_17 /* !! */ ;
            ** while (true)
        }
        if (var20_20 != null) {
            var8_8 = var2_2;
            if (!var21_21) {
                var9_9 = (int[])var2_2.a.get("android:visibility:screenLocation");
                var47_52 = 0.0f;
                var12_12 /* !! */  = (int)var9_9[0];
                var13_13 = 1;
                var14_14 = 1.4E-45f;
                var43_46 /* !! */  = (int)var9_9[var13_13];
                var18_18 = 2;
                var17_17 /* !! */  = (View)new int[var18_18];
                var7_7.getLocationOnScreen((int[])var17_17 /* !! */ );
                var10_10 /* !! */  = (int)var17_17 /* !! */ [0];
                var12_12 /* !! */  -= var10_10 /* !! */ ;
                var10_10 /* !! */  = var20_20.getLeft();
                var20_20.offsetLeftAndRight(var12_12 /* !! */  -= var10_10 /* !! */ );
                var10_10 /* !! */  = (int)var17_17 /* !! */ [var13_13];
                var43_46 /* !! */  -= var10_10 /* !! */ ;
                var10_10 /* !! */  = var20_20.getTop();
                var20_20.offsetTopAndBottom(var43_46 /* !! */  -= var10_10 /* !! */ );
                var9_9 = var1_1.getOverlay();
                var9_9.add(var20_20);
            }
            var9_9 = var4_4;
            var8_8 = var6_6.onDisappear((ViewGroup)var7_7, var20_20, (Or3)var8_8, var4_4);
            if (!var21_21) {
                if (var8_8 == null) {
                    var7_7 = var1_1.getOverlay();
                    var7_7.remove(var20_20);
                } else {
                    var43_46 /* !! */  = R$id.save_overlay_view;
                    var16_16.setTag(var43_46 /* !! */ , (Object)var20_20);
                    var9_9 = new Visibility$b(var6_6, (ViewGroup)var7_7, var20_20, var16_16);
                    var8_8.addListener((Animator.AnimatorListener)var9_9);
                    var8_8.addPauseListener((Animator.AnimatorPauseListener)var9_9);
                    var7_7 = this.getRootTransition();
                    var7_7.addListener((Transition$i)var9_9);
                }
            }
            return var8_8;
        }
        var8_8 = var2_2;
        var9_9 = var4_4;
        if (var15_15 != null) {
            var10_10 /* !! */  = var15_15.getVisibility();
            var11_11 = 0;
            var16_16 = null;
            ee3_0.c(var15_15, 0);
            var7_7 = var6_6.onDisappear((ViewGroup)var7_7, var15_15, var2_2, var4_4);
            if (var7_7 != null) {
                var43_46 /* !! */  = var5_5;
                var8_8 = new Visibility$a(var15_15, var5_5);
                var7_7.addListener((Animator.AnimatorListener)var8_8);
                var9_9 = this.getRootTransition();
                var9_9.addListener((Transition$i)var8_8);
            } else {
                ee3_0.c(var15_15, var10_10 /* !! */ );
            }
            return var7_7;
        }
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, Or3 or3, Or3 or32) {
        return null;
    }

    public void setMode(int n3) {
        int n4 = n3 & 0xFFFFFFFC;
        if (n4 == 0) {
            this.mMode = n3;
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        throw illegalArgumentException;
    }
}

