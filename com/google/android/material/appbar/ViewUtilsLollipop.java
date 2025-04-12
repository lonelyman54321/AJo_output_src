/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorInflater
 *  android.animation.ObjectAnimator
 *  android.animation.StateListAnimator
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
package com.google.android.material.appbar;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.R$attr;
import com.google.android.material.R$integer;
import com.google.android.material.internal.ThemeEnforcement;

class ViewUtilsLollipop {
    private static final int[] STATE_LIST_ANIM_ATTRS = new int[]{16843848};

    public static void setBoundsViewOutlineProvider(View view) {
        ViewOutlineProvider viewOutlineProvider = ViewOutlineProvider.BOUNDS;
        view.setOutlineProvider(viewOutlineProvider);
    }

    public static void setDefaultAppBarLayoutStateListAnimator(View view, float f5) {
        Object object = view.getResources();
        int n3 = R$integer.app_bar_elevation_anim_duration;
        int n4 = object.getInteger(n3);
        StateListAnimator stateListAnimator = new StateListAnimator();
        int n7 = R$attr.state_liftable;
        int n8 = -R$attr.state_lifted;
        int n10 = 16842910;
        Object[] objectArray = new int[]{n10, n7, n8};
        int n14 = 1;
        Object object2 = new float[n14];
        object2[0] = 0.0f;
        String string2 = "elevation";
        object2 = ObjectAnimator.ofFloat((Object)view, (String)string2, (float[])object2);
        long l2 = n4;
        object = object2.setDuration(l2);
        stateListAnimator.addState(objectArray, (Animator)object);
        object = new int[]{n10};
        objectArray = new float[n14];
        objectArray[0] = (int)f5;
        Object object3 = ObjectAnimator.ofFloat((Object)view, (String)string2, (float[])objectArray).setDuration(l2);
        stateListAnimator.addState((int[])object, (Animator)object3);
        object3 = new int[0];
        object = new float[n14];
        object[0] = (Resources)0.0f;
        object = ObjectAnimator.ofFloat((Object)view, (String)string2, (float[])object).setDuration(0L);
        stateListAnimator.addState((int[])object3, (Animator)object);
        view.setStateListAnimator(stateListAnimator);
    }

    public static void setStateListAnimatorFromAttrs(View view, AttributeSet attributeSet, int n3, int n4) {
        Throwable throwable2;
        block6: {
            block5: {
                Context context = view.getContext();
                int[] nArray = STATE_LIST_ANIM_ATTRS;
                int[] nArray2 = new int[]{};
                attributeSet = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n3, n4, nArray2);
                try {
                    n3 = (int)(attributeSet.hasValue(0) ? 1 : 0);
                    if (n3 == 0) break block5;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                n3 = attributeSet.getResourceId(0, 0);
                StateListAnimator stateListAnimator = AnimatorInflater.loadStateListAnimator((Context)context, (int)n3);
                view.setStateListAnimator(stateListAnimator);
            }
            attributeSet.recycle();
            return;
        }
        attributeSet.recycle();
        throw throwable2;
    }
}

