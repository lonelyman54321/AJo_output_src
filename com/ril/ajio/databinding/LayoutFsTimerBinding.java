/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutFsTimerBinding
implements BC3 {
    public final AjioTextView days;
    public final AjioTextView daysPostfix;
    public final AjioTextView hours;
    public final AjioTextView info;
    public final AjioTextView minutes;
    private final ConstraintLayout rootView;
    public final AjioTextView seconds;
    public final ConstraintLayout timerContainer;

    private LayoutFsTimerBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.days = ajioTextView;
        this.daysPostfix = ajioTextView2;
        this.hours = ajioTextView3;
        this.info = ajioTextView4;
        this.minutes = ajioTextView5;
        this.seconds = ajioTextView6;
        this.timerContainer = constraintLayout2;
    }

    public static LayoutFsTimerBinding bind(View object) {
        View view;
        int n3 = R$id.days;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.days_postfix;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.hours;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.info;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.minutes;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.seconds;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                Object object8 = object;
                                object8 = (ConstraintLayout)((Object)object);
                                object = new LayoutFsTimerBinding((ConstraintLayout)((Object)object8), (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (ConstraintLayout)((Object)object8));
                                return object;
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutFsTimerBinding inflate(LayoutInflater layoutInflater) {
        return LayoutFsTimerBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutFsTimerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_fs_timer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutFsTimerBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

