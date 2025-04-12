/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 *  android.view.ViewGroup$MarginLayoutParams
 */
package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import com.google.android.material.R$animator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior$1;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;

public class BottomAppBar$Behavior
extends HideBottomViewOnScrollBehavior {
    private final Rect fabContentRect;
    private final View.OnLayoutChangeListener fabLayoutListener;
    private int originalBottomMargin;
    private WeakReference viewRef;

    public BottomAppBar$Behavior() {
        BottomAppBar$Behavior$1 bottomAppBar$Behavior$1 = new BottomAppBar$Behavior$1(this);
        this.fabLayoutListener = bottomAppBar$Behavior$1;
        this.fabContentRect = bottomAppBar$Behavior$1;
    }

    public BottomAppBar$Behavior(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        super(this);
        this.fabLayoutListener = object;
        super();
        this.fabContentRect = object;
    }

    public static /* synthetic */ WeakReference access$2500(BottomAppBar$Behavior bottomAppBar$Behavior) {
        return bottomAppBar$Behavior.viewRef;
    }

    public static /* synthetic */ Rect access$2600(BottomAppBar$Behavior bottomAppBar$Behavior) {
        return bottomAppBar$Behavior.fabContentRect;
    }

    public static /* synthetic */ int access$2700(BottomAppBar$Behavior bottomAppBar$Behavior) {
        return bottomAppBar$Behavior.originalBottomMargin;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int n3) {
        View view;
        this.viewRef = view = new WeakReference(bottomAppBar);
        view = BottomAppBar.access$3200(bottomAppBar);
        if (view != null) {
            Object object = ViewCompat.a;
            int n4 = view.isLaidOut();
            if (n4 == 0) {
                BottomAppBar.access$3300(bottomAppBar, view);
                object = (CoordinatorLayout$e)view.getLayoutParams();
                this.originalBottomMargin = n4 = ((ViewGroup.MarginLayoutParams)object).bottomMargin;
                n4 = view instanceof FloatingActionButton;
                if (n4 != 0) {
                    MotionSpec motionSpec;
                    object = view;
                    object = (FloatingActionButton)view;
                    int n7 = BottomAppBar.access$400(bottomAppBar);
                    if (n7 == 0 && (n7 = (int)(BottomAppBar.access$3400(bottomAppBar) ? 1 : 0)) != 0) {
                        n7 = 0;
                        motionSpec = null;
                        ViewCompat$c.m((View)object, 0.0f);
                        ((FloatingActionButton)object).setCompatElevation(0.0f);
                    }
                    if ((motionSpec = ((FloatingActionButton)object).getShowMotionSpec()) == null) {
                        n7 = R$animator.mtrl_fab_show_motion_spec;
                        ((FloatingActionButton)object).setShowMotionSpecResource(n7);
                    }
                    if ((motionSpec = ((FloatingActionButton)object).getHideMotionSpec()) == null) {
                        n7 = R$animator.mtrl_fab_hide_motion_spec;
                        ((FloatingActionButton)object).setHideMotionSpecResource(n7);
                    }
                    BottomAppBar.access$3500(bottomAppBar, (FloatingActionButton)object);
                }
                object = this.fabLayoutListener;
                view.addOnLayoutChangeListener((View.OnLayoutChangeListener)object);
                BottomAppBar.access$1400(bottomAppBar);
            }
        }
        coordinatorLayout.onLayoutChild((View)bottomAppBar, n3);
        return super.onLayoutChild(coordinatorLayout, (View)bottomAppBar, n3);
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int n3, int n4) {
        boolean bl2;
        boolean bl3 = bottomAppBar.getHideOnScroll();
        if (bl3 && (bl2 = super.onStartNestedScroll(coordinatorLayout, (View)bottomAppBar, view, view2, n3, n4))) {
            bl2 = true;
        } else {
            bl2 = false;
            coordinatorLayout = null;
        }
        return bl2;
    }
}

