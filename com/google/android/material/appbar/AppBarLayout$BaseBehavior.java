/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.animation.Interpolator
 *  android.widget.AbsListView
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.ScrollView
 */
package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$1;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$2;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$BaseDragCallback;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState;
import com.google.android.material.appbar.AppBarLayout$ChildScrollEffect;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.google.android.material.appbar.HeaderBehavior;
import com.google.android.material.appbar.HeaderScrollingViewBehavior;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class AppBarLayout$BaseBehavior
extends HeaderBehavior {
    private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
    private WeakReference lastNestedScrollingChildRef;
    private int lastStartedType;
    private ValueAnimator offsetAnimator;
    private int offsetDelta;
    private AppBarLayout$BaseBehavior$BaseDragCallback onDragCallback;
    private AppBarLayout$BaseBehavior$SavedState savedState;

    public AppBarLayout$BaseBehavior() {
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ View access$000(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, CoordinatorLayout coordinatorLayout) {
        return appBarLayout$BaseBehavior.getChildWithScrollingBehavior(coordinatorLayout);
    }

    public static /* synthetic */ boolean access$100(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, AppBarLayout appBarLayout) {
        return appBarLayout$BaseBehavior.childrenHaveScrollFlags(appBarLayout);
    }

    public static /* synthetic */ int access$200(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior) {
        return appBarLayout$BaseBehavior.offsetDelta;
    }

    private void addAccessibilityDelegateIfNeeded(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        Object object = ViewCompat.d((View)coordinatorLayout);
        if (object == null) {
            object = new AppBarLayout$BaseBehavior$2(this, appBarLayout, coordinatorLayout);
            ViewCompat.s((View)coordinatorLayout, (a)object);
        }
    }

    private void animateOffsetTo(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int n3, float f5) {
        int n4;
        int n7 = Math.abs(this.getTopBottomOffsetForScrollingSibling() - n3);
        float f6 = (f5 = Math.abs(f5)) - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object > 0) {
            float f7 = (float)n7 / f5;
            f5 = 1000.0f;
            n4 = Math.round(f7 *= f5) * 3;
        } else {
            f5 = n7;
            float f8 = appBarLayout.getHeight();
            f5 = f5 / f8 + 1.0f;
            n7 = 1125515264;
            f8 = 150.0f;
            n4 = (int)(f5 *= f8);
        }
        this.animateOffsetWithDuration(coordinatorLayout, appBarLayout, n3, n4);
    }

    private void animateOffsetWithDuration(CoordinatorLayout coordinatorLayout, AppBarLayout object, int n3, int n4) {
        int n7 = this.getTopBottomOffsetForScrollingSibling();
        if (n7 == n3) {
            boolean bl2;
            coordinatorLayout = this.offsetAnimator;
            if (coordinatorLayout != null && (bl2 = coordinatorLayout.isRunning())) {
                coordinatorLayout = this.offsetAnimator;
                coordinatorLayout.cancel();
            }
            return;
        }
        ValueAnimator valueAnimator = this.offsetAnimator;
        if (valueAnimator == null) {
            this.offsetAnimator = valueAnimator = new ValueAnimator();
            Object object2 = AnimationUtils.DECELERATE_INTERPOLATOR;
            valueAnimator.setInterpolator(object2);
            valueAnimator = this.offsetAnimator;
            object2 = new AppBarLayout$BaseBehavior$1(this, coordinatorLayout, (AppBarLayout)object);
            valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        } else {
            valueAnimator.cancel();
        }
        coordinatorLayout = this.offsetAnimator;
        long l2 = Math.min(n4, 600);
        coordinatorLayout.setDuration(l2);
        coordinatorLayout = this.offsetAnimator;
        object = new int[]{n7, n3};
        coordinatorLayout.setIntValues((int[])object);
        this.offsetAnimator.start();
    }

    private int calculateSnapOffset(int n3, int n4, int n7) {
        int n8 = (n4 + n7) / 2;
        if (n3 >= n8) {
            n4 = n7;
        }
        return n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean canScrollChildren(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
        int n3;
        boolean bl2 = appBarLayout.hasScrollableChildren();
        if (!bl2) return 0 != 0;
        int n4 = coordinatorLayout.getHeight();
        int n7 = view.getHeight();
        if ((n4 -= n7) > (n3 = appBarLayout.getHeight())) return 0 != 0;
        return 1 != 0;
    }

    private static boolean checkFlag(int n3, int n4) {
        n3 = (n3 &= n4) == n4 ? 1 : 0;
        return n3 != 0;
    }

    private boolean childrenHaveScrollFlags(AppBarLayout appBarLayout) {
        int n3 = appBarLayout.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            AppBarLayout$LayoutParams appBarLayout$LayoutParams = (AppBarLayout$LayoutParams)appBarLayout.getChildAt(i3).getLayoutParams();
            int n4 = appBarLayout$LayoutParams.scrollFlags;
            if (n4 == 0) continue;
            return true;
        }
        return false;
    }

    private View findFirstScrollingChild(CoordinatorLayout coordinatorLayout) {
        int n3 = coordinatorLayout.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = coordinatorLayout.getChildAt(i3);
            boolean bl2 = view instanceof uU1;
            if (!(bl2 || (bl2 = view instanceof AbsListView) || (bl2 = view instanceof ScrollView))) {
                continue;
            }
            return view;
        }
        return null;
    }

    private static View getAppBarChildOnOffset(AppBarLayout appBarLayout, int n3) {
        n3 = Math.abs(n3);
        int n4 = appBarLayout.getChildCount();
        for (int i3 = 0; i3 < n4; ++i3) {
            View view = appBarLayout.getChildAt(i3);
            int n7 = view.getTop();
            if (n3 < n7 || n3 > (n7 = view.getBottom())) continue;
            return view;
        }
        return null;
    }

    private int getChildIndexOnOffset(AppBarLayout appBarLayout, int n3) {
        int n4 = appBarLayout.getChildCount();
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7;
            Object object = appBarLayout.getChildAt(i3);
            int n8 = object.getTop();
            int n10 = object.getBottom();
            object = (AppBarLayout$LayoutParams)object.getLayoutParams();
            int n14 = ((AppBarLayout$LayoutParams)((Object)object)).getScrollFlags();
            int n15 = 32;
            if ((n14 = (int)(AppBarLayout$BaseBehavior.checkFlag(n14, n15) ? 1 : 0)) != 0) {
                n14 = ((LinearLayout.LayoutParams)object).topMargin;
                n8 -= n14;
                n7 = ((LinearLayout.LayoutParams)object).bottomMargin;
                n10 += n7;
            }
            if (n8 > (n7 = -n3) || n10 < n7) continue;
            return i3;
        }
        return -1;
    }

    private View getChildWithScrollingBehavior(CoordinatorLayout coordinatorLayout) {
        int n3 = coordinatorLayout.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = coordinatorLayout.getChildAt(i3);
            CoordinatorLayout$Behavior coordinatorLayout$Behavior = ((CoordinatorLayout$e)view.getLayoutParams()).a;
            boolean bl2 = coordinatorLayout$Behavior instanceof AppBarLayout$ScrollingViewBehavior;
            if (!bl2) continue;
            return view;
        }
        return null;
    }

    private int interpolateOffset(AppBarLayout appBarLayout, int n3) {
        int n4 = Math.abs(n3);
        int n7 = appBarLayout.getChildCount();
        int n8 = 0;
        for (int i3 = 0; i3 < n7; ++i3) {
            int n10;
            View view = appBarLayout.getChildAt(i3);
            AppBarLayout$LayoutParams appBarLayout$LayoutParams = (AppBarLayout$LayoutParams)view.getLayoutParams();
            Interpolator interpolator2 = appBarLayout$LayoutParams.getScrollInterpolator();
            int n14 = view.getTop();
            if (n4 < n14 || n4 > (n14 = view.getBottom())) continue;
            if (interpolator2 == null) break;
            n7 = appBarLayout$LayoutParams.getScrollFlags();
            i3 = n7 & 1;
            if (i3 != 0) {
                n8 = view.getHeight();
                i3 = appBarLayout$LayoutParams.topMargin;
                n8 += i3;
                i3 = appBarLayout$LayoutParams.bottomMargin;
                n8 += i3;
                if ((n7 &= 2) != 0) {
                    n7 = view.getMinimumHeight();
                    n8 -= n7;
                }
            }
            if ((n7 = (int)(view.getFitsSystemWindows() ? 1 : 0)) != 0) {
                n10 = appBarLayout.getTopInset();
                n8 -= n10;
            }
            if (n8 <= 0) break;
            n10 = view.getTop();
            float f5 = n8;
            float f6 = (float)(n4 -= n10) / f5;
            n10 = Math.round(interpolator2.getInterpolation(f6) * f5);
            n3 = Integer.signum(n3);
            return (view.getTop() + n10) * n3;
        }
        return n3;
    }

    private boolean shouldJumpElevationState(CoordinatorLayout object, AppBarLayout appBarLayout) {
        object = ((CoordinatorLayout)object).getDependents((View)appBarLayout);
        int n3 = object.size();
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            CoordinatorLayout$Behavior coordinatorLayout$Behavior = ((CoordinatorLayout$e)((View)object.get((int)i3)).getLayoutParams()).a;
            boolean bl3 = coordinatorLayout$Behavior instanceof AppBarLayout$ScrollingViewBehavior;
            if (!bl3) continue;
            int n4 = ((HeaderScrollingViewBehavior)(coordinatorLayout$Behavior = (AppBarLayout$ScrollingViewBehavior)coordinatorLayout$Behavior)).getOverlayTop();
            if (n4 != 0) {
                bl2 = true;
            }
            return bl2;
        }
        return false;
    }

    private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        View view;
        AppBarLayout$LayoutParams appBarLayout$LayoutParams;
        int n3;
        int n4;
        int n7 = 17;
        int n8 = appBarLayout.getTopInset();
        int n10 = appBarLayout.getPaddingTop() + n8;
        n8 = this.getTopBottomOffsetForScrollingSibling() - n10;
        int n14 = this.getChildIndexOnOffset(appBarLayout, n8);
        if (n14 >= 0 && (n4 = (n3 = (appBarLayout$LayoutParams = (AppBarLayout$LayoutParams)(view = appBarLayout.getChildAt(n14)).getLayoutParams()).getScrollFlags()) & 0x11) == n7) {
            n7 = -view.getTop();
            n4 = -view.getBottom();
            if (n14 == 0) {
                n14 = (int)(appBarLayout.getFitsSystemWindows() ? 1 : 0);
                if (n14 != 0 && (n14 = (int)(view.getFitsSystemWindows() ? 1 : 0)) != 0) {
                    n14 = appBarLayout.getTopInset();
                    n7 -= n14;
                }
            }
            if ((n14 = (int)(AppBarLayout$BaseBehavior.checkFlag(n3, 2) ? 1 : 0)) != 0) {
                n14 = view.getMinimumHeight();
                n4 += n14;
            } else {
                n14 = (int)(AppBarLayout$BaseBehavior.checkFlag(n3, 5) ? 1 : 0);
                if (n14 != 0) {
                    n14 = view.getMinimumHeight() + n4;
                    if (n8 < n14) {
                        n7 = n14;
                    } else {
                        n4 = n14;
                    }
                }
            }
            n14 = (int)(AppBarLayout$BaseBehavior.checkFlag(n3, 32) ? 1 : 0);
            if (n14 != 0) {
                n14 = appBarLayout$LayoutParams.topMargin;
                n7 += n14;
                n14 = appBarLayout$LayoutParams.bottomMargin;
                n4 -= n14;
            }
            n7 = this.calculateSnapOffset(n8, n4, n7) + n10;
            n8 = -appBarLayout.getTotalScrollRange();
            n10 = 0;
            n7 = PK1.b(n7, n8, 0);
            n8 = 0;
            this.animateOffsetTo(coordinatorLayout, appBarLayout, n7, 0.0f);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int n3, int n4, boolean bl2) {
        int n7;
        boolean bl3;
        block8: {
            boolean bl4;
            block11: {
                block10: {
                    int n8;
                    int n10;
                    View view;
                    block9: {
                        AppBarLayout$LayoutParams appBarLayout$LayoutParams;
                        bl4 = true;
                        view = AppBarLayout$BaseBehavior.getAppBarChildOnOffset(appBarLayout, n3);
                        bl3 = false;
                        if (view == null || (n10 = (n8 = (appBarLayout$LayoutParams = (AppBarLayout$LayoutParams)view.getLayoutParams()).getScrollFlags()) & 1) == 0) break block8;
                        n10 = view.getMinimumHeight();
                        if (n4 <= 0 || (n4 = n8 & 0xC) == 0) break block9;
                        n3 = -n3;
                        n4 = view.getBottom() - n10;
                        int n14 = appBarLayout.getTopInset();
                        if (n3 < (n4 -= n14)) break block10;
                        break block11;
                    }
                    n4 = n8 & 2;
                    if (n4 == 0) break block8;
                    n3 = -n3;
                    n4 = view.getBottom() - n10;
                    int n15 = appBarLayout.getTopInset();
                    if (n3 >= (n4 -= n15)) break block11;
                }
                bl4 = false;
            }
            bl3 = bl4;
        }
        if ((n3 = (int)(appBarLayout.isLiftOnScroll() ? 1 : 0)) != 0) {
            View view = this.findFirstScrollingChild(coordinatorLayout);
            bl3 = appBarLayout.shouldLift(view);
        }
        n3 = (int)(appBarLayout.setLiftedState(bl3) ? 1 : 0);
        if (bl2 || n3 != 0 && (n7 = this.shouldJumpElevationState(coordinatorLayout, appBarLayout)) != 0) {
            coordinatorLayout = appBarLayout.getBackground();
            if (coordinatorLayout != null) {
                coordinatorLayout = appBarLayout.getBackground();
                coordinatorLayout.jumpToCurrentState();
            }
            if ((n7 = Build.VERSION.SDK_INT) >= (n3 = 23) && (coordinatorLayout = om_0.a(appBarLayout)) != null) {
                coordinatorLayout = om_0.a(appBarLayout);
                coordinatorLayout.jumpToCurrentState();
            }
            if ((coordinatorLayout = appBarLayout.getStateListAnimator()) != null) {
                coordinatorLayout = appBarLayout.getStateListAnimator();
                coordinatorLayout.jumpToCurrentState();
            }
        }
    }

    public boolean canDragView(AppBarLayout object) {
        boolean bl2;
        int n3;
        AppBarLayout$BaseBehavior$BaseDragCallback appBarLayout$BaseBehavior$BaseDragCallback = this.onDragCallback;
        if (appBarLayout$BaseBehavior$BaseDragCallback != null) {
            return appBarLayout$BaseBehavior$BaseDragCallback.canDrag((AppBarLayout)object);
        }
        object = this.lastNestedScrollingChildRef;
        boolean bl3 = true;
        if (object != null && ((object = (View)((Reference)object).get()) == null || (n3 = object.isShown()) == 0 || (bl2 = object.canScrollVertically(n3 = -1)))) {
            bl3 = false;
            appBarLayout$BaseBehavior$BaseDragCallback = null;
        }
        return bl3;
    }

    public int getMaxDragOffset(AppBarLayout appBarLayout) {
        int n3 = -appBarLayout.getDownNestedScrollRange();
        return appBarLayout.getTopInset() + n3;
    }

    public int getScrollRangeForDragFling(AppBarLayout appBarLayout) {
        return appBarLayout.getTotalScrollRange();
    }

    public int getTopBottomOffsetForScrollingSibling() {
        int n3 = this.getTopAndBottomOffset();
        int n4 = this.offsetDelta;
        return n3 + n4;
    }

    public boolean isOffsetAnimatorRunning() {
        boolean bl2;
        ValueAnimator valueAnimator = this.offsetAnimator;
        if (valueAnimator != null && (bl2 = valueAnimator.isRunning())) {
            bl2 = true;
        } else {
            bl2 = false;
            valueAnimator = null;
        }
        return bl2;
    }

    public void onFlingFinished(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.snapToChildIfNeeded(coordinatorLayout, appBarLayout);
        boolean bl2 = appBarLayout.isLiftOnScroll();
        if (bl2) {
            coordinatorLayout = this.findFirstScrollingChild(coordinatorLayout);
            boolean bl3 = appBarLayout.shouldLift((View)coordinatorLayout);
            appBarLayout.setLiftedState(bl3);
        }
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int n3) {
        int n4;
        Object object;
        int n7;
        int n8;
        n3 = (int)(super.onLayoutChild(coordinatorLayout, (View)appBarLayout, n3) ? 1 : 0);
        int n10 = appBarLayout.getPendingAction();
        Object object2 = this.savedState;
        if (object2 != null && (n8 = n10 & 8) == 0) {
            n10 = (int)(((AppBarLayout$BaseBehavior$SavedState)object2).fullyScrolled ? 1 : 0);
            if (n10 != 0) {
                n10 = -appBarLayout.getTotalScrollRange();
                this.setHeaderTopBottomOffset(coordinatorLayout, (View)appBarLayout, n10);
            } else {
                n10 = (int)(((AppBarLayout$BaseBehavior$SavedState)object2).fullyExpanded ? 1 : 0);
                if (n10 != 0) {
                    this.setHeaderTopBottomOffset(coordinatorLayout, (View)appBarLayout, 0);
                } else {
                    n10 = ((AppBarLayout$BaseBehavior$SavedState)object2).firstVisibleChildIndex;
                    View view = appBarLayout.getChildAt(n10);
                    n7 = -view.getBottom();
                    object = this.savedState;
                    n8 = (int)(((AppBarLayout$BaseBehavior$SavedState)object).firstVisibleChildAtMinimumHeight ? 1 : 0);
                    if (n8 != 0) {
                        object = ViewCompat.a;
                        n10 = view.getMinimumHeight();
                        n8 = appBarLayout.getTopInset() + n10 + n7;
                    } else {
                        float f5 = view.getHeight();
                        object = this.savedState;
                        float f6 = ((AppBarLayout$BaseBehavior$SavedState)object).firstVisibleChildPercentageShown;
                        n10 = Math.round(f5 *= f6);
                        n8 = n10 + n7;
                    }
                    this.setHeaderTopBottomOffset(coordinatorLayout, (View)appBarLayout, n8);
                }
            }
        } else if (n10 != 0) {
            n7 = n10 & 4;
            n8 = 1;
            float f7 = Float.MIN_VALUE;
            if (n7 != 0) {
                n7 = 1;
            } else {
                n7 = 0;
                object2 = null;
            }
            n4 = n10 & 2;
            if (n4 != 0) {
                n10 = -appBarLayout.getUpNestedPreScrollRange();
                if (n7 != 0) {
                    this.animateOffsetTo(coordinatorLayout, appBarLayout, n10, 0.0f);
                } else {
                    this.setHeaderTopBottomOffset(coordinatorLayout, (View)appBarLayout, n10);
                }
            } else if ((n10 &= n8) != 0) {
                if (n7 != 0) {
                    this.animateOffsetTo(coordinatorLayout, appBarLayout, 0, 0.0f);
                } else {
                    this.setHeaderTopBottomOffset(coordinatorLayout, (View)appBarLayout, 0);
                }
            }
        }
        appBarLayout.resetPendingAction();
        this.savedState = null;
        n10 = this.getTopAndBottomOffset();
        n7 = -appBarLayout.getTotalScrollRange();
        n10 = PK1.b(n10, n7, 0);
        this.setTopAndBottomOffset(n10);
        n4 = this.getTopAndBottomOffset();
        object2 = this;
        object = appBarLayout;
        this.updateAppBarLayoutDrawableState(coordinatorLayout, appBarLayout, n4, 0, true);
        n10 = this.getTopAndBottomOffset();
        appBarLayout.onOffsetChanged(n10);
        this.addAccessibilityDelegateIfNeeded(coordinatorLayout, appBarLayout);
        return n3 != 0;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int n3, int n4, int n7, int n8) {
        Object object = (CoordinatorLayout$e)appBarLayout.getLayoutParams();
        int n10 = object.height;
        int n14 = -2;
        if (n10 == n14) {
            int n15 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
            object = coordinatorLayout;
            coordinatorLayout.onMeasureChild((View)appBarLayout, n3, n4, n15, n8);
            return true;
        }
        return super.onMeasureChild(coordinatorLayout, (View)appBarLayout, n3, n4, n7, n8);
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int n3, int n4, int[] nArray, int n7) {
        int n8;
        if (n4 != 0) {
            int n10;
            int n14;
            if (n4 < 0) {
                n3 = -appBarLayout.getTotalScrollRange();
                n7 = appBarLayout.getDownNestedPreScrollRange() + n3;
                n14 = n3;
                n10 = n7;
            } else {
                n3 = -appBarLayout.getUpNestedPreScrollRange();
                n7 = 0;
                n14 = n3;
                n10 = 0;
            }
            if (n14 != n10) {
                n3 = 1;
                nArray[n3] = n8 = this.scroll(coordinatorLayout, (View)appBarLayout, n4, n14, n10);
            }
        }
        if ((n8 = appBarLayout.isLiftOnScroll()) != 0) {
            n8 = appBarLayout.shouldLift(view);
            appBarLayout.setLiftedState(n8 != 0);
        }
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int n3, int n4, int n7, int n8, int n10, int[] nArray) {
        if (n8 < 0) {
            int n14 = -appBarLayout.getDownNestedScrollRange();
            int n15 = this.scroll(coordinatorLayout, (View)appBarLayout, n8, n14, 0);
            n3 = 1;
            nArray[n3] = n15;
        }
        if (n8 == 0) {
            this.addAccessibilityDelegateIfNeeded(coordinatorLayout, appBarLayout);
        }
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
        boolean bl2 = parcelable instanceof AppBarLayout$BaseBehavior$SavedState;
        if (bl2) {
            parcelable = (AppBarLayout$BaseBehavior$SavedState)parcelable;
            bl2 = true;
            this.restoreScrollState((AppBarLayout$BaseBehavior$SavedState)parcelable, bl2);
            parcelable = this.savedState.getSuperState();
            super.onRestoreInstanceState(coordinatorLayout, (View)appBarLayout, parcelable);
        } else {
            super.onRestoreInstanceState(coordinatorLayout, (View)appBarLayout, parcelable);
            coordinatorLayout = null;
            this.savedState = null;
        }
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout object, AppBarLayout object2) {
        if ((object2 = this.saveScrollState((Parcelable)(object = super.onSaveInstanceState((CoordinatorLayout)object, (View)object2)), (AppBarLayout)object2)) != null) {
            object = object2;
        }
        return object;
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int n3, int n4) {
        boolean bl2;
        int n7 = n3 & 2;
        if (n7 != 0 && ((n7 = (int)(appBarLayout.isLiftOnScroll() ? 1 : 0)) != 0 || (bl2 = this.canScrollChildren(coordinatorLayout, appBarLayout, view)))) {
            bl2 = true;
        } else {
            bl2 = false;
            coordinatorLayout = null;
        }
        if (bl2 && (appBarLayout = this.offsetAnimator) != null) {
            appBarLayout.cancel();
        }
        this.lastNestedScrollingChildRef = null;
        this.lastStartedType = n4;
        return bl2;
    }

    public void onStopNestedScroll(CoordinatorLayout weakReference, AppBarLayout appBarLayout, View view, int n3) {
        int n4 = this.lastStartedType;
        if (n4 == 0 || n3 == (n4 = 1)) {
            this.snapToChildIfNeeded((CoordinatorLayout)((Object)weakReference), appBarLayout);
            boolean bl2 = appBarLayout.isLiftOnScroll();
            if (bl2) {
                bl2 = appBarLayout.shouldLift(view);
                appBarLayout.setLiftedState(bl2);
            }
        }
        this.lastNestedScrollingChildRef = weakReference = new WeakReference<View>(view);
    }

    public void restoreScrollState(AppBarLayout$BaseBehavior$SavedState appBarLayout$BaseBehavior$SavedState, boolean bl2) {
        AppBarLayout$BaseBehavior$SavedState appBarLayout$BaseBehavior$SavedState2 = this.savedState;
        if (appBarLayout$BaseBehavior$SavedState2 == null || bl2) {
            this.savedState = appBarLayout$BaseBehavior$SavedState;
        }
    }

    public AppBarLayout$BaseBehavior$SavedState saveScrollState(Parcelable object, AppBarLayout appBarLayout) {
        int n3 = 1;
        int n4 = this.getTopAndBottomOffset();
        int n7 = appBarLayout.getChildCount();
        for (int i3 = 0; i3 < n7; i3 += n3) {
            float f5;
            int n8;
            View view = appBarLayout.getChildAt(i3);
            int n10 = view.getBottom() + n4;
            int n14 = view.getTop() + n4;
            if (n14 > 0 || n10 < 0) continue;
            if (object == null) {
                object = AbsSavedState.EMPTY_STATE;
            }
            AppBarLayout$BaseBehavior$SavedState appBarLayout$BaseBehavior$SavedState = new AppBarLayout$BaseBehavior$SavedState((Parcelable)object);
            if (n4 == 0) {
                n8 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n8 = 0;
                f5 = 0.0f;
                object = null;
            }
            appBarLayout$BaseBehavior$SavedState.fullyExpanded = n8;
            if (n8 == 0 && (n8 = -n4) >= (n4 = appBarLayout.getTotalScrollRange())) {
                n8 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n8 = 0;
                f5 = 0.0f;
                object = null;
            }
            appBarLayout$BaseBehavior$SavedState.fullyScrolled = n8;
            appBarLayout$BaseBehavior$SavedState.firstVisibleChildIndex = i3;
            object = ViewCompat.a;
            n8 = view.getMinimumHeight();
            int n15 = appBarLayout.getTopInset() + n8;
            if (n10 != n15) {
                n3 = 0;
            }
            appBarLayout$BaseBehavior$SavedState.firstVisibleChildAtMinimumHeight = n3;
            f5 = n10;
            float f6 = view.getHeight();
            appBarLayout$BaseBehavior$SavedState.firstVisibleChildPercentageShown = f5 /= f6;
            return appBarLayout$BaseBehavior$SavedState;
        }
        return null;
    }

    public void setDragCallback(AppBarLayout$BaseBehavior$BaseDragCallback appBarLayout$BaseBehavior$BaseDragCallback) {
        this.onDragCallback = appBarLayout$BaseBehavior$BaseDragCallback;
    }

    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int n3, int n4, int n7) {
        int n8;
        int n10 = this.getTopBottomOffsetForScrollingSibling();
        if (n4 != 0 && n10 >= n4 && n10 <= n7) {
            int n14 = PK1.b(n3, n4, n7);
            if (n10 != n14) {
                int n15;
                Object object;
                Object object2;
                n3 = (int)(appBarLayout.hasChildWithInterpolator() ? 1 : 0);
                n3 = n3 != 0 ? this.interpolateOffset(appBarLayout, n14) : n14;
                n4 = (int)(this.setTopAndBottomOffset(n3) ? 1 : 0);
                n7 = n10 - n14;
                this.offsetDelta = n3 = n14 - n3;
                n3 = 1;
                if (n4 != 0) {
                    int n16;
                    for (n8 = 0; n8 < (n16 = appBarLayout.getChildCount()); ++n8) {
                        object2 = (AppBarLayout$LayoutParams)appBarLayout.getChildAt(n8).getLayoutParams();
                        object = object2.getScrollEffect();
                        if (object == null || (n16 = object2.getScrollFlags() & n3) == 0) continue;
                        object2 = appBarLayout.getChildAt(n8);
                        int n17 = this.getTopAndBottomOffset();
                        float f5 = n17;
                        ((AppBarLayout$ChildScrollEffect)object).onOffsetChanged(appBarLayout, (View)object2, f5);
                    }
                }
                if (n4 == 0 && (n4 = (int)(appBarLayout.hasChildWithInterpolator() ? 1 : 0)) != 0) {
                    coordinatorLayout.dispatchDependentViewsChanged((View)appBarLayout);
                }
                n4 = this.getTopAndBottomOffset();
                appBarLayout.onOffsetChanged(n4);
                if (n14 < n10) {
                    n3 = -1;
                    n15 = -1;
                } else {
                    n15 = 1;
                }
                object2 = this;
                object = coordinatorLayout;
                this.updateAppBarLayoutDrawableState(coordinatorLayout, appBarLayout, n14, n15, false);
                n8 = n7;
            }
        } else {
            this.offsetDelta = 0;
        }
        this.addAccessibilityDelegateIfNeeded(coordinatorLayout, appBarLayout);
        return n8;
    }
}

