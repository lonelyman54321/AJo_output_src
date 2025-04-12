/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback;
import com.google.android.material.internal.DescendantOffsetUtils;
import java.util.List;

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
extends CoordinatorLayout$Behavior {
    private static final boolean AUTO_HIDE_DEFAULT = false;
    private static final boolean AUTO_SHRINK_DEFAULT = true;
    private boolean autoHideEnabled;
    private boolean autoShrinkEnabled;
    private ExtendedFloatingActionButton$OnChangedCallback internalAutoHideCallback;
    private ExtendedFloatingActionButton$OnChangedCallback internalAutoShrinkCallback;
    private Rect tmpRect;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.autoHideEnabled = false;
        this.autoShrinkEnabled = true;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] nArray = R$styleable.ExtendedFloatingActionButton_Behavior_Layout;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        int n3 = R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide;
        n3 = (int)(context.getBoolean(n3, false) ? 1 : 0);
        this.autoHideEnabled = n3;
        n3 = R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink;
        n3 = (int)(context.getBoolean(n3, true) ? 1 : 0);
        this.autoShrinkEnabled = n3;
        context.recycle();
    }

    private static boolean isBottomSheet(View view) {
        boolean bl2 = (view = view.getLayoutParams()) instanceof CoordinatorLayout$e;
        if (bl2) {
            return ((CoordinatorLayout$e)view).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private boolean shouldUpdateVisibility(View view, ExtendedFloatingActionButton object) {
        object = (CoordinatorLayout$e)object.getLayoutParams();
        boolean bl2 = this.autoHideEnabled;
        if (!bl2 && !(bl2 = this.autoShrinkEnabled)) {
            return false;
        }
        int n3 = ((CoordinatorLayout$e)((Object)object)).f;
        int n4 = view.getId();
        return n3 == n4;
    }

    private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
        boolean bl2 = this.shouldUpdateVisibility((View)appBarLayout, extendedFloatingActionButton);
        if (!bl2) {
            return false;
        }
        Rect rect = this.tmpRect;
        if (rect == null) {
            this.tmpRect = rect = new Rect();
        }
        rect = this.tmpRect;
        DescendantOffsetUtils.getDescendantRect(coordinatorLayout, (View)appBarLayout, rect);
        int n3 = rect.bottom;
        int n4 = appBarLayout.getMinimumHeightForVisibleOverlappingContent();
        if (n3 <= n4) {
            this.shrinkOrHide(extendedFloatingActionButton);
        } else {
            this.extendOrShow(extendedFloatingActionButton);
        }
        return true;
    }

    private boolean updateFabVisibilityForBottomSheet(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
        int n3 = this.shouldUpdateVisibility(view, extendedFloatingActionButton);
        if (n3 == 0) {
            return false;
        }
        CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)extendedFloatingActionButton.getLayoutParams();
        int n4 = view.getTop();
        int n7 = extendedFloatingActionButton.getHeight() / 2;
        n3 = coordinatorLayout$e.topMargin;
        if (n4 < (n7 += n3)) {
            this.shrinkOrHide(extendedFloatingActionButton);
        } else {
            this.extendOrShow(extendedFloatingActionButton);
        }
        return true;
    }

    public void extendOrShow(ExtendedFloatingActionButton extendedFloatingActionButton) {
        int n3 = this.autoShrinkEnabled;
        ExtendedFloatingActionButton$OnChangedCallback extendedFloatingActionButton$OnChangedCallback = n3 != 0 ? this.internalAutoShrinkCallback : this.internalAutoHideCallback;
        n3 = n3 != 0 ? 3 : 0;
        ExtendedFloatingActionButton.access$400(extendedFloatingActionButton, n3, extendedFloatingActionButton$OnChangedCallback);
    }

    public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
        return super.getInsetDodgeRect(coordinatorLayout, (View)extendedFloatingActionButton, rect);
    }

    public boolean isAutoHideEnabled() {
        return this.autoHideEnabled;
    }

    public boolean isAutoShrinkEnabled() {
        return this.autoShrinkEnabled;
    }

    public void onAttachedToLayoutParams(CoordinatorLayout$e coordinatorLayout$e) {
        int n3 = coordinatorLayout$e.h;
        if (n3 == 0) {
            coordinatorLayout$e.h = n3 = 80;
        }
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View object) {
        boolean bl2 = object instanceof AppBarLayout;
        if (bl2) {
            object = (AppBarLayout)object;
            this.updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout)object, extendedFloatingActionButton);
        } else {
            boolean bl3 = ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.isBottomSheet(object);
            if (bl3) {
                this.updateFabVisibilityForBottomSheet((View)object, extendedFloatingActionButton);
            }
        }
        return false;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int n3) {
        boolean bl2;
        Object object;
        boolean bl3;
        List list = coordinatorLayout.getDependencies((View)extendedFloatingActionButton);
        int n4 = list.size();
        for (int i3 = 0; i3 < n4 && !((bl3 = (object = (View)list.get(i3)) instanceof AppBarLayout) ? (bl2 = this.updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout)(object = (AppBarLayout)object), extendedFloatingActionButton)) : (bl3 = ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.isBottomSheet(object)) && (bl2 = this.updateFabVisibilityForBottomSheet((View)object, extendedFloatingActionButton))); ++i3) {
        }
        coordinatorLayout.onLayoutChild((View)extendedFloatingActionButton, n3);
        return true;
    }

    public void setAutoHideEnabled(boolean bl2) {
        this.autoHideEnabled = bl2;
    }

    public void setAutoShrinkEnabled(boolean bl2) {
        this.autoShrinkEnabled = bl2;
    }

    public void setInternalAutoHideCallback(ExtendedFloatingActionButton$OnChangedCallback extendedFloatingActionButton$OnChangedCallback) {
        this.internalAutoHideCallback = extendedFloatingActionButton$OnChangedCallback;
    }

    public void setInternalAutoShrinkCallback(ExtendedFloatingActionButton$OnChangedCallback extendedFloatingActionButton$OnChangedCallback) {
        this.internalAutoShrinkCallback = extendedFloatingActionButton$OnChangedCallback;
    }

    public void shrinkOrHide(ExtendedFloatingActionButton extendedFloatingActionButton) {
        int n3 = this.autoShrinkEnabled;
        ExtendedFloatingActionButton$OnChangedCallback extendedFloatingActionButton$OnChangedCallback = n3 != 0 ? this.internalAutoShrinkCallback : this.internalAutoHideCallback;
        n3 = n3 != 0 ? 2 : 1;
        ExtendedFloatingActionButton.access$400(extendedFloatingActionButton, n3, extendedFloatingActionButton$OnChangedCallback);
    }
}

