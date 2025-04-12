/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.util.AttributeSet
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewGroup
 *  org.xmlpull.v1.XmlPullParser
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Fade$a;
import androidx.transition.R$id;
import androidx.transition.Visibility;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class Fade
extends Visibility {
    public Fade() {
    }

    public Fade(int n3) {
        this.setMode(n3);
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] nArray = af3.d;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        attributeSet = (XmlResourceParser)attributeSet;
        int n3 = this.getMode();
        int n4 = dt3.d((TypedArray)context, (XmlPullParser)attributeSet, "fadingMode", 0, n3);
        this.setMode(n4);
        context.recycle();
    }

    public static float d(Or3 object, float f5) {
        if (object != null) {
            object = ((Or3)object).a;
            String string2 = "android:fade:transitionAlpha";
            if ((object = (Float)((HashMap)object).get(string2)) != null) {
                f5 = ((Float)object).floatValue();
            }
        }
        return f5;
    }

    public final ObjectAnimator b(float f5, float f6, View view) {
        Object object = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
        if (object == false) {
            return null;
        }
        ee3_0.b(view, f5);
        ee3$a_0 ee3$a_0 = ee3_0.b;
        float[] fArray = new float[]{f6};
        ee3$a_0 = ObjectAnimator.ofFloat((Object)view, (Property)ee3$a_0, (float[])fArray);
        Fade$a fade$a = new Fade$a(view);
        ee3$a_0.addListener((Animator.AnimatorListener)fade$a);
        this.getRootTransition().addListener(fade$a);
        return ee3$a_0;
    }

    public final void captureStartValues(Or3 or3) {
        super.captureStartValues(or3);
        Object object = or3.b;
        int n3 = R$id.transition_pause_alpha;
        object = (Float)object.getTag(n3);
        if (object == null) {
            object = or3.b;
            int n4 = object.getVisibility();
            if (n4 == 0) {
                object = or3.b;
                je3_0 je3_02 = ee3_0.a;
                float f5 = je3_02.a((View)object);
                object = Float.valueOf(f5);
            } else {
                n4 = 0;
                float f6 = 0.0f;
                object = Float.valueOf(0.0f);
            }
        }
        or3.a.put("android:fade:transitionAlpha", object);
    }

    public final boolean isSeekingSupported() {
        return true;
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, Or3 or3, Or3 or32) {
        ee3_0.a.getClass();
        float f5 = Fade.d(or3, 0.0f);
        return this.b(f5, 1.0f, view);
    }

    public final Animator onDisappear(ViewGroup object, View view, Or3 or3, Or3 or32) {
        object = ee3_0.a;
        object.getClass();
        float f5 = 1.0f;
        float f6 = Fade.d(or3, f5);
        or3 = this.b(f6, 0.0f, view);
        if (or3 == null) {
            f5 = Fade.d(or32, f5);
            ee3_0.b(view, f5);
        }
        return or3;
    }
}

