/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.Animator$AnimatorPauseListener
 *  android.animation.ObjectAnimator
 *  android.animation.TypeEvaluator
 *  android.content.Context
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.ChangeImageTransform$a;
import androidx.transition.ChangeImageTransform$b;
import androidx.transition.ChangeImageTransform$c;
import androidx.transition.ChangeImageTransform$d;
import androidx.transition.R$id;
import androidx.transition.Transition;
import androidx.transition.h$b;
import java.util.HashMap;

public class ChangeImageTransform
extends Transition {
    public static final String[] a;
    public static final ChangeImageTransform$a b;
    public static final ChangeImageTransform$b c;

    static {
        Object object;
        a = new String[]{"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
        b = object = new Object();
        object = new Property(Matrix.class, "animatedTransform");
        c = object;
    }

    public ChangeImageTransform() {
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void b(Or3 object, boolean n3) {
        void var11_22;
        Object object2;
        block4: {
            View view;
            block5: {
                block8: {
                    float f5;
                    int n4;
                    int n7;
                    int n8;
                    block6: {
                        float f6;
                        int n10;
                        block7: {
                            void var11_13;
                            object2 = ((Or3)object).b;
                            n8 = object2 instanceof ImageView;
                            if (n8 == 0) return;
                            n8 = object2.getVisibility();
                            if (n8 != 0) {
                                return;
                            }
                            view = object2;
                            view = (ImageView)object2;
                            Drawable drawable2 = view.getDrawable();
                            if (drawable2 == null) {
                                return;
                            }
                            object = ((Or3)object).a;
                            n7 = object2.getLeft();
                            n4 = object2.getTop();
                            int n14 = object2.getRight();
                            n10 = object2.getBottom();
                            Rect rect = new Rect(n7, n4, n14, n10);
                            object2 = "android:changeImageTransform:bounds";
                            ((HashMap)object).put(object2, rect);
                            if (n3 != 0) {
                                n3 = R$id.transition_image_transform;
                                Matrix matrix = (Matrix)view.getTag(n3);
                            } else {
                                n3 = 0;
                                f5 = 0.0f;
                                Object var11_12 = null;
                            }
                            if (var11_13 != null) break block4;
                            Drawable drawable3 = view.getDrawable();
                            n10 = drawable3.getIntrinsicWidth();
                            if (n10 <= 0 || (n3 = drawable3.getIntrinsicHeight()) <= 0) break block5;
                            int[] nArray = ChangeImageTransform$c.a;
                            object2 = view.getScaleType();
                            n10 = ((Enum)object2).ordinal();
                            n3 = nArray[n10];
                            n10 = 1;
                            f6 = Float.MIN_VALUE;
                            if (n3 == n10) break block6;
                            n10 = 2;
                            f6 = 2.8E-45f;
                            if (n3 == n10) break block7;
                            object2 = view.getImageMatrix();
                            Matrix matrix = new Matrix((Matrix)object2);
                            break block4;
                        }
                        Drawable drawable4 = view.getDrawable();
                        n10 = drawable4.getIntrinsicWidth();
                        float f7 = view.getWidth();
                        f6 = n10;
                        float f8 = f7 / f6;
                        n3 = drawable4.getIntrinsicHeight();
                        n8 = view.getHeight();
                        float f11 = n8;
                        f5 = n3;
                        float f12 = f11 / f5;
                        f8 = Math.max(f8, f12);
                        f7 -= (f6 *= f8);
                        n10 = 0x40000000;
                        f6 = 2.0f;
                        n7 = Math.round(f7 /= f6);
                        n3 = Math.round((f11 - (f5 *= f8)) / f6);
                        object2 = new Matrix();
                        object2.postScale(f8, f8);
                        f11 = n7;
                        f5 = n3;
                        object2.postTranslate(f11, f5);
                        break block8;
                    }
                    Drawable drawable5 = view.getDrawable();
                    object2 = new Matrix();
                    n7 = view.getWidth();
                    float f14 = n7;
                    n4 = drawable5.getIntrinsicWidth();
                    float f15 = n4;
                    n8 = view.getHeight();
                    float f16 = n8;
                    n3 = drawable5.getIntrinsicHeight();
                    f5 = n3;
                    object2.postScale(f14 /= f15, f16 /= f5);
                }
                Object object3 = object2;
                break block4;
            }
            object2 = view.getImageMatrix();
            Matrix matrix = new Matrix((Matrix)object2);
        }
        object2 = "android:changeImageTransform:matrix";
        ((HashMap)object).put(object2, var11_22);
    }

    public final void captureEndValues(Or3 or3) {
        ChangeImageTransform.b(or3, false);
    }

    public final void captureStartValues(Or3 or3) {
        ChangeImageTransform.b(or3, true);
    }

    public final Animator createAnimator(ViewGroup objectAnimator, Or3 object, Or3 or3) {
        int n3 = 2;
        ChangeImageTransform$d changeImageTransform$d = null;
        int n4 = 1;
        int n7 = 0;
        Object object2 = null;
        if (object != null && or3 != null) {
            object = ((Or3)object).a;
            String string2 = "android:changeImageTransform:bounds";
            Object object3 = (Rect)((HashMap)object).get(string2);
            Object object4 = or3.a;
            string2 = (Rect)object4.get(string2);
            if (object3 != null && string2 != null) {
                boolean bl2;
                String string3 = "android:changeImageTransform:matrix";
                object = (Matrix)((HashMap)object).get(string3);
                object4 = (Matrix)object4.get(string3);
                if (object == null && object4 == null || object != null && (bl2 = object.equals(object4))) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    string3 = null;
                }
                int n8 = object3.equals((Object)string2);
                if (n8 != 0 && bl2) {
                    return null;
                }
                or3 = (ImageView)or3.b;
                object2 = or3.getDrawable();
                n8 = object2.getIntrinsicWidth();
                n7 = object2.getIntrinsicHeight();
                object3 = c;
                if (n8 > 0 && n7 > 0) {
                    if (object == null) {
                        object = SK1.a;
                    }
                    if (object4 == null) {
                        object4 = SK1.a;
                    }
                    object3.getClass();
                    Pe1.a((ImageView)or3, (Matrix)object);
                    object2 = new h$b();
                    objectAnimator = new Matrix[n3];
                    objectAnimator[0] = object;
                    objectAnimator[n4] = object4;
                    objectAnimator = ObjectAnimator.ofObject((Object)or3, (Property)object3, (TypeEvaluator)object2, (Object[])objectAnimator);
                    changeImageTransform$d = new ChangeImageTransform$d((ImageView)or3, (Matrix)object, (Matrix)object4);
                    objectAnimator.addListener((Animator.AnimatorListener)changeImageTransform$d);
                    objectAnimator.addPauseListener((Animator.AnimatorPauseListener)changeImageTransform$d);
                    this.addListener(changeImageTransform$d);
                } else {
                    object = b;
                    objectAnimator = new Matrix[n3];
                    object2 = SK1.a;
                    objectAnimator[0] = object2;
                    objectAnimator[n4] = object2;
                    objectAnimator = ObjectAnimator.ofObject((Object)or3, (Property)object3, (TypeEvaluator)object, (Object[])objectAnimator);
                }
                return objectAnimator;
            }
        }
        return null;
    }

    public final String[] getTransitionProperties() {
        return a;
    }

    public final boolean isSeekingSupported() {
        return true;
    }
}

