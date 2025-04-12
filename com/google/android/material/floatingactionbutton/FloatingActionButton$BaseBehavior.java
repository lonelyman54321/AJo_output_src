/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton$OnVisibilityChangedListener;
import com.google.android.material.internal.DescendantOffsetUtils;
import java.util.List;

public class FloatingActionButton$BaseBehavior
extends CoordinatorLayout$Behavior {
    private static final boolean AUTO_HIDE_DEFAULT = true;
    private boolean autoHideEnabled;
    private FloatingActionButton$OnVisibilityChangedListener internalAutoHideListener;
    private Rect tmpRect;

    public FloatingActionButton$BaseBehavior() {
        this.autoHideEnabled = true;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] nArray = R$styleable.FloatingActionButton_Behavior_Layout;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        int n3 = R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide;
        n3 = (int)(context.getBoolean(n3, true) ? 1 : 0);
        this.autoHideEnabled = n3;
        context.recycle();
    }

    private static boolean isBottomSheet(View view) {
        boolean bl2 = (view = view.getLayoutParams()) instanceof CoordinatorLayout$e;
        if (bl2) {
            return ((CoordinatorLayout$e)view).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private void offsetIfNeeded(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
        int n3;
        Rect rect = floatingActionButton.shadowPadding;
        if (rect != null && (n3 = rect.centerX()) > 0 && (n3 = rect.centerY()) > 0) {
            CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)floatingActionButton.getLayoutParams();
            int n4 = floatingActionButton.getRight();
            int n7 = coordinatorLayout.getWidth();
            int n8 = coordinatorLayout$e.rightMargin;
            n7 -= n8;
            n8 = 0;
            n4 = n4 >= n7 ? rect.right : ((n4 = floatingActionButton.getLeft()) <= (n7 = coordinatorLayout$e.leftMargin) ? -rect.left : 0);
            n7 = floatingActionButton.getBottom();
            int n10 = coordinatorLayout.getHeight();
            int n14 = coordinatorLayout$e.bottomMargin;
            if (n7 >= (n10 -= n14)) {
                n8 = rect.bottom;
            } else {
                n10 = floatingActionButton.getTop();
                if (n10 <= (n3 = coordinatorLayout$e.topMargin)) {
                    n10 = rect.top;
                    n8 = -n10;
                }
            }
            if (n8 != 0) {
                ViewCompat.m(n8, (View)floatingActionButton);
            }
            if (n4 != 0) {
                ViewCompat.l(n4, (View)floatingActionButton);
            }
        }
    }

    private boolean shouldUpdateVisibility(View view, FloatingActionButton floatingActionButton) {
        CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)floatingActionButton.getLayoutParams();
        boolean bl2 = this.autoHideEnabled;
        if (!bl2) {
            return false;
        }
        int n3 = coordinatorLayout$e.f;
        int n4 = view.getId();
        if (n3 != n4) {
            return false;
        }
        n4 = floatingActionButton.getUserSetVisibility();
        return n4 == 0;
    }

    private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout object, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
        boolean bl2 = this.shouldUpdateVisibility((View)appBarLayout, floatingActionButton);
        if (!bl2) {
            return false;
        }
        Rect rect = this.tmpRect;
        if (rect == null) {
            this.tmpRect = rect = new Rect();
        }
        rect = this.tmpRect;
        DescendantOffsetUtils.getDescendantRect((ViewGroup)object, (View)appBarLayout, rect);
        int n3 = rect.bottom;
        int n4 = appBarLayout.getMinimumHeightForVisibleOverlappingContent();
        if (n3 <= n4) {
            object = this.internalAutoHideListener;
            floatingActionButton.hide((FloatingActionButton$OnVisibilityChangedListener)object, false);
        } else {
            object = this.internalAutoHideListener;
            floatingActionButton.show((FloatingActionButton$OnVisibilityChangedListener)object, false);
        }
        return true;
    }

    private boolean updateFabVisibilityForBottomSheet(View object, FloatingActionButton floatingActionButton) {
        int n3 = this.shouldUpdateVisibility((View)object, floatingActionButton);
        if (n3 == 0) {
            return false;
        }
        CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)floatingActionButton.getLayoutParams();
        int n4 = object.getTop();
        int n7 = floatingActionButton.getHeight() / 2;
        n3 = coordinatorLayout$e.topMargin;
        if (n4 < (n7 += n3)) {
            object = this.internalAutoHideListener;
            floatingActionButton.hide((FloatingActionButton$OnVisibilityChangedListener)object, false);
        } else {
            object = this.internalAutoHideListener;
            floatingActionButton.show((FloatingActionButton$OnVisibilityChangedListener)object, false);
        }
        return true;
    }

    public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
        coordinatorLayout = floatingActionButton.shadowPadding;
        int n3 = floatingActionButton.getLeft();
        int n4 = ((Rect)coordinatorLayout).left;
        n3 += n4;
        n4 = floatingActionButton.getTop();
        int n7 = ((Rect)coordinatorLayout).top;
        n4 += n7;
        n7 = floatingActionButton.getRight();
        int n8 = ((Rect)coordinatorLayout).right;
        int n10 = floatingActionButton.getBottom();
        int n14 = ((Rect)coordinatorLayout).bottom;
        rect.set(n3, n4, n7 -= n8, n10 -= n14);
        return true;
    }

    public boolean isAutoHideEnabled() {
        return this.autoHideEnabled;
    }

    public void onAttachedToLayoutParams(CoordinatorLayout$e coordinatorLayout$e) {
        int n3 = coordinatorLayout$e.h;
        if (n3 == 0) {
            coordinatorLayout$e.h = n3 = 80;
        }
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View object) {
        boolean bl2 = object instanceof AppBarLayout;
        if (bl2) {
            object = (AppBarLayout)object;
            this.updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout)object, floatingActionButton);
        } else {
            boolean bl3 = FloatingActionButton$BaseBehavior.isBottomSheet(object);
            if (bl3) {
                this.updateFabVisibilityForBottomSheet((View)object, floatingActionButton);
            }
        }
        return false;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int n3) {
        boolean bl2;
        Object object;
        boolean bl3;
        List list = coordinatorLayout.getDependencies((View)floatingActionButton);
        int n4 = list.size();
        for (int i3 = 0; i3 < n4 && !((bl3 = (object = (View)list.get(i3)) instanceof AppBarLayout) ? (bl2 = this.updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout)(object = (AppBarLayout)object), floatingActionButton)) : (bl3 = FloatingActionButton$BaseBehavior.isBottomSheet(object)) && (bl2 = this.updateFabVisibilityForBottomSheet((View)object, floatingActionButton))); ++i3) {
        }
        coordinatorLayout.onLayoutChild((View)floatingActionButton, n3);
        this.offsetIfNeeded(coordinatorLayout, floatingActionButton);
        return true;
    }

    public void setAutoHideEnabled(boolean bl2) {
        this.autoHideEnabled = bl2;
    }

    public void setInternalAutoHideListener(FloatingActionButton$OnVisibilityChangedListener floatingActionButton$OnVisibilityChangedListener) {
        this.internalAutoHideListener = floatingActionButton$OnVisibilityChangedListener;
    }
}

