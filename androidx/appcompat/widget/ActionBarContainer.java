/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.util.AttributeSet
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.ScrollingTabContainerView;

public class ActionBarContainer
extends FrameLayout {
    public boolean a;
    public ScrollingTabContainerView b;
    public View c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public final boolean h;
    public boolean i;
    public final int j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object object = new K2(this);
        this.setBackground((Drawable)object);
        object = R$styleable.ActionBar;
        context = context.obtainStyledAttributes(attributeSet, (int[])object);
        int n3 = R$styleable.ActionBar_background;
        attributeSet = context.getDrawable(n3);
        this.e = attributeSet;
        n3 = R$styleable.ActionBar_backgroundStacked;
        attributeSet = context.getDrawable(n3);
        this.f = attributeSet;
        n3 = R$styleable.ActionBar_height;
        this.j = n3 = context.getDimensionPixelSize(n3, -1);
        n3 = this.getId();
        int n4 = R$id.split_action_bar;
        boolean bl2 = true;
        if (n3 == n4) {
            this.h = bl2;
            n3 = R$styleable.ActionBar_backgroundSplit;
            attributeSet = context.getDrawable(n3);
            this.g = attributeSet;
        }
        context.recycle();
        boolean bl3 = this.h;
        n3 = 0;
        attributeSet = null;
        if (!(bl3 ? (context = this.g) == null : (context = this.e) == null && (context = this.f) == null)) {
            bl2 = false;
        }
        this.setWillNotDraw(bl2);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        int n3 = view.getMeasuredHeight();
        int n4 = layoutParams.topMargin;
        int n7 = layoutParams.bottomMargin;
        return (n3 += n4) + n7;
    }

    public final void drawableStateChanged() {
        int[] nArray;
        boolean bl2;
        super.drawableStateChanged();
        Drawable drawable2 = this.e;
        if (drawable2 != null && (bl2 = drawable2.isStateful())) {
            drawable2 = this.e;
            nArray = this.getDrawableState();
            drawable2.setState(nArray);
        }
        if ((drawable2 = this.f) != null && (bl2 = drawable2.isStateful())) {
            drawable2 = this.f;
            nArray = this.getDrawableState();
            drawable2.setState(nArray);
        }
        if ((drawable2 = this.g) != null && (bl2 = drawable2.isStateful())) {
            drawable2 = this.g;
            nArray = this.getDrawableState();
            drawable2.setState(nArray);
        }
    }

    public View getTabContainer() {
        return this.b;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        if ((drawable2 = this.f) != null) {
            drawable2.jumpToCurrentState();
        }
        if ((drawable2 = this.g) != null) {
            drawable2.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        View view;
        super.onFinishInflate();
        int n3 = R$id.action_bar;
        this.c = view = this.findViewById(n3);
        n3 = R$id.action_context_bar;
        this.d = view = this.findViewById(n3);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean bl2;
        boolean bl3 = this.a;
        if (!bl3 && !(bl2 = super.onInterceptTouchEvent(motionEvent))) {
            bl2 = false;
            motionEvent = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        FrameLayout.LayoutParams layoutParams;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        super.onLayout(bl2, n18, n17, n16, n15);
        ScrollingTabContainerView scrollingTabContainerView = this.b;
        n17 = 8;
        n15 = 1;
        int n19 = 0;
        View view = null;
        n14 = scrollingTabContainerView != null && (n14 = scrollingTabContainerView.getVisibility()) != n17 ? 1 : 0;
        if (scrollingTabContainerView != null && (n10 = scrollingTabContainerView.getVisibility()) != n17) {
            n17 = this.getMeasuredHeight();
            layoutParams = (FrameLayout.LayoutParams)scrollingTabContainerView.getLayoutParams();
            int n20 = scrollingTabContainerView.getMeasuredHeight();
            n20 = n17 - n20;
            n10 = layoutParams.bottomMargin;
            scrollingTabContainerView.layout(n18, n20 -= n10, n16, n17 -= n10);
        }
        if ((n18 = this.h) != 0) {
            scrollingTabContainerView = this.g;
            if (scrollingTabContainerView != null) {
                n18 = this.getMeasuredWidth();
                n17 = this.getMeasuredHeight();
                scrollingTabContainerView.setBounds(0, 0, n18, n17);
            } else {
                n15 = 0;
            }
        } else {
            Drawable drawable2 = this.e;
            if (drawable2 != null) {
                drawable2 = this.c;
                n18 = drawable2.getVisibility();
                if (n18 == 0) {
                    drawable2 = this.e;
                    View view4 = this.c;
                    n17 = view4.getLeft();
                    View view5 = this.c;
                    n16 = view5.getTop();
                    view = this.c;
                    n19 = view.getRight();
                    layoutParams = this.c;
                    n10 = layoutParams.getBottom();
                    drawable2.setBounds(n17, n16, n19, n10);
                } else {
                    drawable2 = this.d;
                    if (drawable2 != null && (n18 = drawable2.getVisibility()) == 0) {
                        drawable2 = this.e;
                        View view2 = this.d;
                        n17 = view2.getLeft();
                        View view3 = this.d;
                        n16 = view3.getTop();
                        view = this.d;
                        n19 = view.getRight();
                        layoutParams = this.d;
                        n10 = layoutParams.getBottom();
                        drawable2.setBounds(n17, n16, n19, n10);
                    } else {
                        drawable2 = this.e;
                        drawable2.setBounds(0, 0, 0, 0);
                    }
                }
                n19 = 1;
            }
            this.i = n14;
            if (n14 != 0 && (drawable2 = this.f) != null) {
                n17 = scrollingTabContainerView.getLeft();
                n16 = scrollingTabContainerView.getTop();
                n19 = scrollingTabContainerView.getRight();
                int n21 = scrollingTabContainerView.getBottom();
                drawable2.setBounds(n17, n16, n19, n21);
            } else {
                n15 = n19;
            }
        }
        if (n15 != 0) {
            this.invalidate();
        }
    }

    public final void onMeasure(int n3, int n4) {
        int n7;
        int n8;
        Object object = this.c;
        int n10 = -1 << -1;
        if (object == null && (n8 = View.MeasureSpec.getMode((int)n4)) == n10 && (n8 = this.j) >= 0) {
            n4 = View.MeasureSpec.getSize((int)n4);
            n4 = View.MeasureSpec.makeMeasureSpec((int)Math.min(n8, n4), (int)n10);
        }
        super.onMeasure(n3, n4);
        View view = this.c;
        if (view == null) {
            return;
        }
        n3 = View.MeasureSpec.getMode((int)n4);
        object = this.b;
        if (object != null && (n8 = object.getVisibility()) != (n7 = 8) && n3 != (n8 = 0x40000000)) {
            int n14;
            object = this.c;
            if (object != null && (n14 = object.getVisibility()) != n7 && (n8 = object.getMeasuredHeight()) != 0) {
                object = this.c;
                n8 = ActionBarContainer.a(object);
            } else {
                object = this.d;
                if (object != null && (n14 = object.getVisibility()) != n7 && (n8 = object.getMeasuredHeight()) != 0) {
                    object = this.d;
                    n8 = ActionBarContainer.a(object);
                } else {
                    n8 = 0;
                    object = null;
                }
            }
            n3 = n3 == n10 ? View.MeasureSpec.getSize((int)n4) : -1 >>> 1;
            n4 = this.getMeasuredWidth();
            ScrollingTabContainerView scrollingTabContainerView = this.b;
            n10 = ActionBarContainer.a((View)scrollingTabContainerView) + n8;
            n3 = Math.min(n10, n3);
            this.setMeasuredDimension(n4, n3);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setPrimaryBackground(Drawable drawable2) {
        int n3;
        View view;
        int n4;
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            n4 = 0;
            view = null;
            drawable3.setCallback(null);
            drawable3 = this.e;
            this.unscheduleDrawable(drawable3);
        }
        this.e = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback)this);
            drawable2 = this.c;
            if (drawable2 != null) {
                drawable3 = this.e;
                n3 = drawable2.getLeft();
                view = this.c;
                n4 = view.getTop();
                View view2 = this.c;
                int n7 = view2.getRight();
                View view3 = this.c;
                int n8 = view3.getBottom();
                drawable3.setBounds(n3, n4, n7, n8);
            }
        }
        n3 = this.h;
        boolean bl2 = false;
        drawable3 = null;
        n4 = 1;
        if (n3 != 0 ? (drawable2 = this.g) == null : (drawable2 = this.e) == null && (drawable2 = this.f) == null) {
            bl2 = true;
        }
        this.setWillNotDraw(bl2);
        this.invalidate();
        this.invalidateOutline();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setSplitBackground(Drawable drawable2) {
        boolean bl2;
        Drawable drawable3 = this.g;
        if (drawable3 != null) {
            bl2 = false;
            drawable3.setCallback(null);
            drawable3 = this.g;
            this.unscheduleDrawable(drawable3);
        }
        this.g = drawable2;
        boolean bl3 = this.h;
        bl2 = false;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback)this);
            if (bl3 && (drawable2 = this.g) != null) {
                int n3 = this.getMeasuredWidth();
                int n4 = this.getMeasuredHeight();
                drawable2.setBounds(0, 0, n3, n4);
            }
        }
        if (bl3 ? (drawable3 = this.g) == null : (drawable3 = this.e) == null && (drawable3 = this.f) == null) {
            bl2 = true;
        }
        this.setWillNotDraw(bl2);
        this.invalidate();
        this.invalidateOutline();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setStackedBackground(Drawable drawable2) {
        int n3;
        boolean bl2;
        ScrollingTabContainerView scrollingTabContainerView;
        int n4;
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            n4 = 0;
            scrollingTabContainerView = null;
            drawable3.setCallback(null);
            Drawable drawable4 = this.f;
            this.unscheduleDrawable(drawable4);
        }
        this.f = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback)this);
            bl2 = this.i;
            if (bl2 && (drawable2 = this.f) != null) {
                ScrollingTabContainerView scrollingTabContainerView2 = this.b;
                n3 = scrollingTabContainerView2.getLeft();
                scrollingTabContainerView = this.b;
                n4 = scrollingTabContainerView.getTop();
                ScrollingTabContainerView scrollingTabContainerView3 = this.b;
                int n7 = scrollingTabContainerView3.getRight();
                ScrollingTabContainerView scrollingTabContainerView4 = this.b;
                int n8 = scrollingTabContainerView4.getBottom();
                drawable2.setBounds(n3, n4, n7, n8);
            }
        }
        bl2 = this.h;
        n3 = 0;
        Object var2_6 = null;
        n4 = 1;
        if (bl2 ? (drawable2 = this.g) == null : (drawable2 = this.e) == null && (drawable2 = this.f) == null) {
            n3 = 1;
        }
        this.setWillNotDraw(n3 != 0);
        this.invalidate();
        this.invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.b;
        if (scrollingTabContainerView2 != null) {
            this.removeView((View)scrollingTabContainerView2);
        }
        this.b = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            int n3;
            this.addView((View)scrollingTabContainerView);
            scrollingTabContainerView2 = scrollingTabContainerView.getLayoutParams();
            ((ViewGroup.LayoutParams)scrollingTabContainerView2).width = -1;
            ((ViewGroup.LayoutParams)scrollingTabContainerView2).height = n3 = -2;
            scrollingTabContainerView2 = null;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void setTransitioning(boolean bl2) {
        void var1_4;
        this.a = bl2;
        if (bl2) {
            int n3 = 393216;
        } else {
            int n4 = 262144;
        }
        this.setDescendantFocusability((int)var1_4);
    }

    public void setVisibility(int n3) {
        super.setVisibility(n3);
        n3 = n3 == 0 ? 1 : 0;
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setVisible(n3 != 0, false);
        }
        if ((drawable2 = this.f) != null) {
            drawable2.setVisible(n3 != 0, false);
        }
        if ((drawable2 = this.g) != null) {
            drawable2.setVisible(n3 != 0, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback2) {
        return null;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback2, int n3) {
        if (n3 != 0) {
            return super.startActionModeForChild(view, callback2, n3);
        }
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable2) {
        boolean bl2;
        boolean bl3;
        Drawable drawable3 = this.e;
        boolean bl4 = this.h;
        if (drawable2 == drawable3 && !bl4 || drawable2 == (drawable3 = this.f) && (bl3 = this.i) || drawable2 == (drawable3 = this.g) && bl4 || (bl2 = super.verifyDrawable(drawable2))) {
            bl2 = true;
        } else {
            bl2 = false;
            drawable2 = null;
        }
        return bl2;
    }
}

