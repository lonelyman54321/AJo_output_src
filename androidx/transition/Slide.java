/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.DecelerateInterpolator
 *  org.xmlpull.v1.XmlPullParser
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.Slide$a;
import androidx.transition.Slide$b;
import androidx.transition.Slide$c;
import androidx.transition.Slide$d;
import androidx.transition.Slide$e;
import androidx.transition.Slide$f;
import androidx.transition.Slide$g;
import androidx.transition.Visibility;
import androidx.transition.i;
import org.xmlpull.v1.XmlPullParser;

public class Slide
extends Visibility {
    public static final DecelerateInterpolator b;
    public static final AccelerateInterpolator c;
    public static final Slide$a d;
    public static final Slide$b e;
    public static final Slide$c f;
    public static final Slide$d g;
    public static final Slide$e h;
    public static final Slide$f i;
    public Slide$g a;

    static {
        Object object;
        b = object = new DecelerateInterpolator();
        object = new AccelerateInterpolator();
        c = object;
        object = new Object();
        d = object;
        object = new Object();
        e = object;
        object = new Object();
        f = object;
        object = new Object();
        g = object;
        object = new Object();
        h = object;
        object = new Object();
        i = object;
    }

    public Slide() {
        Slide$f slide$f = i;
        this.a = slide$f;
        this.b(80);
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object object = i;
        this.a = object;
        object = af3.f;
        context = context.obtainStyledAttributes(attributeSet, (int[])object);
        attributeSet = (XmlPullParser)attributeSet;
        int n3 = dt3.d((TypedArray)context, (XmlPullParser)attributeSet, "slideEdge", 0, 80);
        context.recycle();
        this.b(n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(int n3) {
        Object object;
        block5: {
            block6: {
                block7: {
                    block8: {
                        int n4 = 3;
                        if (n3 == n4) break block6;
                        n4 = 5;
                        if (n3 == n4) break block7;
                        n4 = 48;
                        if (n3 == n4) break block8;
                        n4 = 80;
                        if (n3 != n4) {
                            n4 = 0x800003;
                            if (n3 != n4) {
                                n4 = 0x800005;
                                if (n3 != n4) {
                                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid slide direction");
                                    throw illegalArgumentException;
                                }
                                this.a = object = h;
                                break block5;
                            } else {
                                this.a = object = e;
                            }
                            break block5;
                        } else {
                            this.a = object = i;
                        }
                        break block5;
                    }
                    this.a = object = f;
                    break block5;
                }
                this.a = object = g;
                break block5;
            }
            object = d;
            this.a = object;
        }
        object = new Object();
        ((r43)object).b = n3;
        this.setPropagation((Kr3)object);
    }

    public final void captureEndValues(Or3 or3) {
        super.captureEndValues(or3);
        View view = or3.b;
        int[] nArray = new int[2];
        view.getLocationOnScreen(nArray);
        or3.a.put("android:slide:screenPosition", nArray);
    }

    public final void captureStartValues(Or3 or3) {
        super.captureStartValues(or3);
        View view = or3.b;
        int[] nArray = new int[2];
        view.getLocationOnScreen(nArray);
        or3.a.put("android:slide:screenPosition", nArray);
    }

    public final boolean isSeekingSupported() {
        return true;
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, Or3 object, Or3 or3) {
        if (or3 == null) {
            return null;
        }
        object = (int[])or3.a.get("android:slide:screenPosition");
        float f5 = view.getTranslationX();
        float f6 = view.getTranslationY();
        float f7 = this.a.b(viewGroup, view);
        float f8 = this.a.a(viewGroup, view);
        Object object2 = object[0];
        Object object3 = object[1];
        DecelerateInterpolator decelerateInterpolator = b;
        return androidx.transition.i.a(view, or3, (int)object2, (int)object3, f7, f8, f5, f6, (TimeInterpolator)decelerateInterpolator, this);
    }

    public final Animator onDisappear(ViewGroup viewGroup, View view, Or3 or3, Or3 object) {
        if (or3 == null) {
            return null;
        }
        object = (int[])or3.a.get("android:slide:screenPosition");
        float f5 = view.getTranslationX();
        float f6 = view.getTranslationY();
        float f7 = this.a.b(viewGroup, view);
        float f8 = this.a.a(viewGroup, view);
        Object object2 = object[0];
        Object object3 = object[1];
        AccelerateInterpolator accelerateInterpolator = c;
        return androidx.transition.i.a(view, or3, (int)object2, (int)object3, f5, f6, f7, f8, (TimeInterpolator)accelerateInterpolator, this);
    }
}

