/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 *  android.view.accessibility.AccessibilityEvent
 */
package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$u;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.RecyclerView$y;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.Carousel;
import com.google.android.material.carousel.CarouselLayoutManager$1;
import com.google.android.material.carousel.CarouselLayoutManager$ChildCalculations;
import com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration;
import com.google.android.material.carousel.CarouselLayoutManager$KeylineRange;
import com.google.android.material.carousel.CarouselOrientationHelper;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.KeylineState;
import com.google.android.material.carousel.KeylineState$Keyline;
import com.google.android.material.carousel.KeylineStateList;
import com.google.android.material.carousel.Maskable;
import com.google.android.material.carousel.MultiBrowseCarouselStrategy;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CarouselLayoutManager
extends RecyclerView$o
implements Carousel,
RecyclerView$x$b {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    private static final String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;
    private int carouselAlignment;
    private CarouselStrategy carouselStrategy;
    private int currentEstimatedPosition;
    private int currentFillStartPosition;
    private KeylineState currentKeylineState;
    private final CarouselLayoutManager$DebugItemDecoration debugItemDecoration;
    private boolean isDebuggingEnabled;
    private KeylineStateList keylineStateList;
    private Map keylineStatePositionMap;
    private int lastItemCount;
    int maxScroll;
    int minScroll;
    private CarouselOrientationHelper orientationHelper;
    private final View.OnLayoutChangeListener recyclerViewSizeChangeListener;
    int scrollOffset;

    public CarouselLayoutManager() {
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = new MultiBrowseCarouselStrategy();
        this(multiBrowseCarouselStrategy);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int n3, int n4) {
        this.isDebuggingEnabled = false;
        Object object = new CarouselLayoutManager$DebugItemDecoration();
        this.debugItemDecoration = object;
        this.currentFillStartPosition = 0;
        object = new sl_2(this);
        this.recyclerViewSizeChangeListener = object;
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = new MultiBrowseCarouselStrategy();
        this.setCarouselStrategy(multiBrowseCarouselStrategy);
        this.setCarouselAttributes(context, attributeSet);
    }

    public CarouselLayoutManager(CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    public CarouselLayoutManager(CarouselStrategy carouselStrategy, int n3) {
        this.isDebuggingEnabled = false;
        Object object = new CarouselLayoutManager$DebugItemDecoration();
        this.debugItemDecoration = object;
        this.currentFillStartPosition = 0;
        object = new sl_2(this);
        this.recyclerViewSizeChangeListener = object;
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        this.setCarouselStrategy(carouselStrategy);
        this.setOrientation(n3);
    }

    public static /* synthetic */ void a(CarouselLayoutManager carouselLayoutManager) {
        carouselLayoutManager.refreshKeylineState();
    }

    public static /* synthetic */ KeylineStateList access$000(CarouselLayoutManager carouselLayoutManager) {
        return carouselLayoutManager.keylineStateList;
    }

    public static /* synthetic */ int access$100(CarouselLayoutManager carouselLayoutManager) {
        return carouselLayoutManager.getParentTop();
    }

    public static /* synthetic */ int access$200(CarouselLayoutManager carouselLayoutManager) {
        return carouselLayoutManager.getParentBottom();
    }

    public static /* synthetic */ int access$300(CarouselLayoutManager carouselLayoutManager) {
        return carouselLayoutManager.getParentLeft();
    }

    public static /* synthetic */ int access$400(CarouselLayoutManager carouselLayoutManager) {
        return carouselLayoutManager.getParentRight();
    }

    private void addAndLayoutView(View view, int n3, CarouselLayoutManager$ChildCalculations object) {
        float f5 = this.currentKeylineState.getItemSize() / 2.0f;
        this.addView(view, n3);
        float f6 = ((CarouselLayoutManager$ChildCalculations)object).offsetCenter;
        int n4 = (int)(f6 - f5);
        n3 = (int)(f6 + f5);
        this.orientationHelper.layoutDecoratedWithMargins(view, n4, n3);
        f6 = ((CarouselLayoutManager$ChildCalculations)object).center;
        object = ((CarouselLayoutManager$ChildCalculations)object).range;
        this.updateChildMaskForLocation(view, f6, (CarouselLayoutManager$KeylineRange)object);
    }

    private float addEnd(float f5, float f6) {
        boolean bl2 = this.isLayoutRtl();
        f5 = bl2 ? (f5 -= f6) : (f5 += f6);
        return f5;
    }

    private float addStart(float f5, float f6) {
        boolean bl2 = this.isLayoutRtl();
        f5 = bl2 ? (f5 += f6) : (f5 -= f6);
        return f5;
    }

    private void addViewAtPosition(RecyclerView$u object, int n3, int n4) {
        int n7;
        if (n3 >= 0 && n3 < (n7 = this.getItemCount())) {
            float f5 = this.calculateChildStartForFill(n3);
            object = this.makeChildCalculations((RecyclerView$u)object, f5, n3);
            View view = ((CarouselLayoutManager$ChildCalculations)object).child;
            this.addAndLayoutView(view, n4, (CarouselLayoutManager$ChildCalculations)object);
        }
    }

    private void addViewsEnd(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, int n3) {
        int n4;
        float f5 = this.calculateChildStartForFill(n3);
        while (n3 < (n4 = recyclerView$y.b())) {
            CarouselLayoutManager$ChildCalculations carouselLayoutManager$ChildCalculations = this.makeChildCalculations(recyclerView$u, f5, n3);
            float f6 = carouselLayoutManager$ChildCalculations.offsetCenter;
            CarouselLayoutManager$KeylineRange carouselLayoutManager$KeylineRange = carouselLayoutManager$ChildCalculations.range;
            boolean bl2 = this.isLocOffsetOutOfFillBoundsEnd(f6, carouselLayoutManager$KeylineRange);
            if (bl2) break;
            KeylineState keylineState = this.currentKeylineState;
            f6 = keylineState.getItemSize();
            f5 = this.addEnd(f5, f6);
            f6 = carouselLayoutManager$ChildCalculations.offsetCenter;
            carouselLayoutManager$KeylineRange = carouselLayoutManager$ChildCalculations.range;
            bl2 = this.isLocOffsetOutOfFillBoundsStart(f6, carouselLayoutManager$KeylineRange);
            if (!bl2) {
                keylineState = carouselLayoutManager$ChildCalculations.child;
                int n7 = -1;
                this.addAndLayoutView((View)keylineState, n7, carouselLayoutManager$ChildCalculations);
            }
            ++n3;
        }
    }

    private void addViewsStart(RecyclerView$u recyclerView$u, int n3) {
        float f5 = this.calculateChildStartForFill(n3);
        while (n3 >= 0) {
            CarouselLayoutManager$ChildCalculations carouselLayoutManager$ChildCalculations = this.makeChildCalculations(recyclerView$u, f5, n3);
            float f6 = carouselLayoutManager$ChildCalculations.offsetCenter;
            CarouselLayoutManager$KeylineRange carouselLayoutManager$KeylineRange = carouselLayoutManager$ChildCalculations.range;
            boolean bl2 = this.isLocOffsetOutOfFillBoundsStart(f6, carouselLayoutManager$KeylineRange);
            if (bl2) break;
            KeylineState keylineState = this.currentKeylineState;
            f6 = keylineState.getItemSize();
            f5 = this.addStart(f5, f6);
            f6 = carouselLayoutManager$ChildCalculations.offsetCenter;
            carouselLayoutManager$KeylineRange = carouselLayoutManager$ChildCalculations.range;
            bl2 = this.isLocOffsetOutOfFillBoundsEnd(f6, carouselLayoutManager$KeylineRange);
            if (!bl2) {
                keylineState = carouselLayoutManager$ChildCalculations.child;
                carouselLayoutManager$KeylineRange = null;
                this.addAndLayoutView((View)keylineState, 0, carouselLayoutManager$ChildCalculations);
            }
            n3 += -1;
        }
    }

    public static /* synthetic */ void b(CarouselLayoutManager carouselLayoutManager, View view, int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16) {
        carouselLayoutManager.lambda$new$0(view, n3, n4, n7, n8, n10, n14, n15, n16);
    }

    private float calculateChildOffsetCenterForLocation(View object, float f5, CarouselLayoutManager$KeylineRange object2) {
        KeylineState$Keyline keylineState$Keyline = ((CarouselLayoutManager$KeylineRange)object2).leftOrTop;
        float f6 = keylineState$Keyline.locOffset;
        KeylineState$Keyline keylineState$Keyline2 = ((CarouselLayoutManager$KeylineRange)object2).rightOrBottom;
        float f7 = keylineState$Keyline2.locOffset;
        float f8 = keylineState$Keyline.loc;
        float f11 = keylineState$Keyline2.loc;
        f8 = AnimationUtils.lerp(f6, f7, f8, f11, f5);
        Object object3 = ((CarouselLayoutManager$KeylineRange)object2).rightOrBottom;
        keylineState$Keyline2 = this.currentKeylineState.getFirstKeyline();
        if (object3 == keylineState$Keyline2 || (object3 = ((CarouselLayoutManager$KeylineRange)object2).leftOrTop) == (keylineState$Keyline2 = this.currentKeylineState.getLastKeyline())) {
            object = (RecyclerView$LayoutParams)object.getLayoutParams();
            float f12 = this.orientationHelper.getMaskMargins((RecyclerView$LayoutParams)((Object)object));
            object3 = this.currentKeylineState;
            f6 = ((KeylineState)object3).getItemSize();
            f12 /= f6;
            object2 = ((CarouselLayoutManager$KeylineRange)object2).rightOrBottom;
            f6 = ((KeylineState$Keyline)object2).loc;
            f5 -= f6;
            float f14 = ((KeylineState$Keyline)object2).mask;
            f6 = (1.0f - f14 + f12) * f5;
            f8 += f6;
        }
        return f8;
    }

    private float calculateChildStartForFill(int n3) {
        int n4 = this.getParentStart();
        int n7 = this.scrollOffset;
        float f5 = n4 - n7;
        float f6 = this.currentKeylineState.getItemSize();
        float f7 = n3;
        return this.addEnd(f5, f6 *= f7);
    }

    private int calculateEndScroll(RecyclerView$y recyclerView$y, KeylineStateList object) {
        boolean bl2 = this.isLayoutRtl();
        object = bl2 ? ((KeylineStateList)object).getStartState() : ((KeylineStateList)object).getEndState();
        KeylineState$Keyline keylineState$Keyline = bl2 ? ((KeylineState)object).getFirstFocalKeyline() : ((KeylineState)object).getLastFocalKeyline();
        int n3 = recyclerView$y.b() + -1;
        float f5 = n3;
        float f6 = ((KeylineState)object).getItemSize();
        f5 *= f6;
        f6 = bl2 ? -1.0f : 1.0f;
        f5 *= f6;
        f6 = bl2 ? -keylineState$Keyline.leftOrTopPaddingShift : keylineState$Keyline.rightOrBottomPaddingShift;
        float f7 = keylineState$Keyline.loc;
        float f8 = this.getParentStart();
        f7 -= f8;
        int n4 = this.getParentEnd();
        f8 = n4;
        float f11 = keylineState$Keyline.loc;
        f5 = f5 - f7 + (f8 -= f11) + f6;
        n3 = (int)f5;
        f6 = 0.0f;
        object = null;
        n3 = bl2 ? Math.min(0, n3) : Math.max(0, n3);
        return n3;
    }

    private static int calculateShouldScrollBy(int n3, int n4, int n7, int n8) {
        int n10 = n4 + n3;
        if (n10 < n7) {
            return n7 - n4;
        }
        if (n10 > n8) {
            return n8 - n4;
        }
        return n3;
    }

    private int calculateStartScroll(KeylineStateList object) {
        boolean bl2 = this.isLayoutRtl();
        object = bl2 ? ((KeylineStateList)object).getEndState() : ((KeylineStateList)object).getStartState();
        KeylineState$Keyline keylineState$Keyline = bl2 ? ((KeylineState)object).getLastFocalKeyline() : ((KeylineState)object).getFirstFocalKeyline();
        float f5 = keylineState$Keyline.loc;
        float f6 = ((KeylineState)object).getItemSize() / 2.0f;
        f6 = this.addStart(f5, f6);
        return (int)((float)this.getParentStart() - f6);
    }

    private int convertFocusDirectionToLayoutDirection(int n3) {
        int n4 = this.getOrientation();
        int n7 = -1;
        int n8 = 1;
        if (n3 != n8) {
            int n10 = 2;
            if (n3 != n10) {
                n10 = 17;
                int n14 = -1 << -1;
                if (n3 != n10) {
                    n10 = 33;
                    if (n3 != n10) {
                        n10 = 66;
                        if (n3 != n10) {
                            n7 = 130;
                            if (n3 != n7) {
                                return n14;
                            }
                            if (n4 != n8) {
                                n8 = -1 << -1;
                            }
                            return n8;
                        }
                        if (n4 == 0) {
                            n3 = (int)(this.isLayoutRtl() ? 1 : 0);
                            if (n3 == 0) {
                                n7 = 1;
                            }
                            return n7;
                        }
                        return n14;
                    }
                    if (n4 != n8) {
                        n7 = -1 << -1;
                    }
                    return n7;
                }
                if (n4 == 0) {
                    n3 = (int)(this.isLayoutRtl() ? 1 : 0);
                    if (n3 != 0) {
                        n7 = 1;
                    }
                    return n7;
                }
                return n14;
            }
            return n8;
        }
        return n7;
    }

    private void fill(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        this.removeAndRecycleOutOfBoundsViews(recyclerView$u);
        int n3 = this.getChildCount();
        if (n3 == 0) {
            n3 = this.currentFillStartPosition + -1;
            this.addViewsStart(recyclerView$u, n3);
            n3 = this.currentFillStartPosition;
            this.addViewsEnd(recyclerView$u, recyclerView$y, n3);
        } else {
            View view = this.getChildAt(0);
            n3 = this.getPosition(view);
            int n4 = this.getChildCount() + -1;
            View view2 = this.getChildAt(n4);
            n4 = this.getPosition(view2);
            this.addViewsStart(recyclerView$u, n3 += -1);
            this.addViewsEnd(recyclerView$u, recyclerView$y, ++n4);
        }
        this.validateChildOrderIfDebugging();
    }

    private View getChildClosestToEnd() {
        int n3 = this.isLayoutRtl();
        n3 = n3 != 0 ? 0 : this.getChildCount() + -1;
        return this.getChildAt(n3);
    }

    private View getChildClosestToStart() {
        int n3 = this.isLayoutRtl();
        n3 = n3 != 0 ? this.getChildCount() + -1 : 0;
        return this.getChildAt(n3);
    }

    private int getContainerSize() {
        boolean bl2 = this.isHorizontal();
        if (bl2) {
            return this.getContainerWidth();
        }
        return this.getContainerHeight();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float getDecoratedCenterWithMargins(View view) {
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        int n3 = this.isHorizontal();
        if (n3 != 0) {
            n3 = rect.centerX();
            return n3;
        }
        n3 = rect.centerY();
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int getItemMargins() {
        int n3 = this.getChildCount();
        int n4 = 0;
        CarouselOrientationHelper carouselOrientationHelper = null;
        if (n3 <= 0) return 0;
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)this.getChildAt(0).getLayoutParams();
        carouselOrientationHelper = this.orientationHelper;
        n4 = carouselOrientationHelper.orientation;
        if (n4 == 0) {
            n4 = recyclerView$LayoutParams.leftMargin;
            n3 = recyclerView$LayoutParams.rightMargin;
            return n4 + n3;
        }
        n4 = recyclerView$LayoutParams.topMargin;
        n3 = recyclerView$LayoutParams.bottomMargin;
        return n4 + n3;
    }

    private KeylineState getKeylineStateForPosition(int n3) {
        Map map2 = this.keylineStatePositionMap;
        if (map2 != null) {
            int n4 = this.getItemCount() + -1;
            n4 = Math.max(0, n4);
            n3 = PK1.b(n3, 0, n4);
            Object object = n3;
            if ((object = (KeylineState)map2.get(object)) != null) {
                return object;
            }
        }
        return this.keylineStateList.getDefaultState();
    }

    private int getLeftOrTopPaddingForKeylineShift() {
        CarouselStrategy carouselStrategy;
        int n3 = this.getClipToPadding();
        if (n3 == 0 && (n3 = (carouselStrategy = this.carouselStrategy).isContained()) != 0) {
            int n4;
            n3 = this.getOrientation();
            if (n3 == (n4 = 1)) {
                return this.getPaddingTop();
            }
            return this.getPaddingLeft();
        }
        return 0;
    }

    private float getMaskedItemSizeForLocOffset(float f5, CarouselLayoutManager$KeylineRange object) {
        KeylineState$Keyline keylineState$Keyline = ((CarouselLayoutManager$KeylineRange)object).leftOrTop;
        float f6 = keylineState$Keyline.maskedItemSize;
        object = ((CarouselLayoutManager$KeylineRange)object).rightOrBottom;
        float f7 = ((KeylineState$Keyline)object).maskedItemSize;
        float f8 = keylineState$Keyline.locOffset;
        float f11 = ((KeylineState$Keyline)object).locOffset;
        return AnimationUtils.lerp(f6, f7, f8, f11, f5);
    }

    private int getParentBottom() {
        return this.orientationHelper.getParentBottom();
    }

    private int getParentEnd() {
        return this.orientationHelper.getParentEnd();
    }

    private int getParentLeft() {
        return this.orientationHelper.getParentLeft();
    }

    private int getParentRight() {
        return this.orientationHelper.getParentRight();
    }

    private int getParentStart() {
        return this.orientationHelper.getParentStart();
    }

    private int getParentTop() {
        return this.orientationHelper.getParentTop();
    }

    private int getRightOrBottomPaddingForKeylineShift() {
        CarouselStrategy carouselStrategy;
        int n3 = this.getClipToPadding();
        if (n3 == 0 && (n3 = (carouselStrategy = this.carouselStrategy).isContained()) != 0) {
            int n4;
            n3 = this.getOrientation();
            if (n3 == (n4 = 1)) {
                return this.getPaddingBottom();
            }
            return this.getPaddingRight();
        }
        return 0;
    }

    private int getScrollOffsetForPosition(int n3, KeylineState keylineState) {
        boolean bl2 = this.isLayoutRtl();
        float f5 = 2.0f;
        if (bl2) {
            float f6 = this.getContainerSize();
            float f7 = keylineState.getLastFocalKeyline().loc;
            f6 -= f7;
            float f8 = n3;
            f7 = keylineState.getItemSize();
            f8 = keylineState.getItemSize() / f5;
            return (int)((f6 -= (f8 *= f7)) - f8);
        }
        float f11 = n3;
        float f12 = keylineState.getItemSize();
        f11 *= f12;
        f12 = keylineState.getFirstFocalKeyline().loc;
        return (int)(keylineState.getItemSize() / f5 + (f11 -= f12));
    }

    private int getSmallestScrollOffsetToFocalKeyline(int n3, KeylineState keylineState) {
        int n4;
        Iterator iterator = keylineState.getFocalKeylines().iterator();
        int n7 = -1 >>> 1;
        while ((n4 = iterator.hasNext()) != 0) {
            int n8;
            float f5;
            KeylineState$Keyline keylineState$Keyline = (KeylineState$Keyline)iterator.next();
            float f6 = n3;
            float f7 = keylineState.getItemSize();
            f6 *= f7;
            f7 = keylineState.getItemSize();
            float f8 = 2.0f;
            f7 = f7 / f8 + f6;
            int n10 = this.isLayoutRtl();
            if (n10 != 0) {
                n10 = this.getContainerSize();
                f6 = n10;
                f5 = keylineState$Keyline.loc;
                f6 = f6 - f5 - f7;
                n4 = (int)f6;
            } else {
                f5 = keylineState$Keyline.loc;
                n4 = (int)(f7 -= f5);
            }
            n10 = this.scrollOffset;
            n4 -= n10;
            n10 = Math.abs(n7);
            if (n10 <= (n8 = Math.abs(n4))) continue;
            n7 = n4;
        }
        return n7;
    }

    private static CarouselLayoutManager$KeylineRange getSurroundingKeylineRange(List object, float f5, boolean bl2) {
        int n3;
        int n4 = -1;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        float f8 = Float.MAX_VALUE;
        float f11 = -3.4028235E38f;
        int n7 = -1;
        int n8 = -1;
        int n10 = -1;
        int n14 = -1;
        for (int i3 = 0; i3 < (n3 = object.size()); ++i3) {
            float f12;
            KeylineState$Keyline keylineState$Keyline = (KeylineState$Keyline)object.get(i3);
            float f14 = bl2 ? keylineState$Keyline.locOffset : keylineState$Keyline.loc;
            float f15 = Math.abs(f14 - f5);
            float f16 = f14 == f5 ? 0 : (f14 < f5 ? -1 : 1);
            if (f16 <= 0 && (f16 = f15 == f6 ? 0 : (f15 < f6 ? -1 : 1)) <= 0) {
                n7 = i3;
                f6 = f15;
            }
            if ((f16 = f14 == f5 ? 0 : (f14 > f5 ? 1 : -1)) > 0 && (f16 = f15 == f7 ? 0 : (f15 < f7 ? -1 : 1)) <= 0) {
                n10 = i3;
                f7 = f15;
            }
            if ((f12 = f14 == f8 ? 0 : (f14 < f8 ? -1 : 1)) <= 0) {
                n8 = i3;
                f8 = f14;
            }
            if ((f12 = f14 == f11 ? 0 : (f14 > f11 ? 1 : -1)) <= 0) continue;
            n14 = i3;
            f11 = f14;
        }
        if (n7 == n4) {
            n7 = n8;
        }
        if (n10 == n4) {
            n10 = n14;
        }
        KeylineState$Keyline keylineState$Keyline = (KeylineState$Keyline)object.get(n7);
        object = (KeylineState$Keyline)object.get(n10);
        CarouselLayoutManager$KeylineRange carouselLayoutManager$KeylineRange = new CarouselLayoutManager$KeylineRange(keylineState$Keyline, (KeylineState$Keyline)object);
        return carouselLayoutManager$KeylineRange;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean isLocOffsetOutOfFillBoundsEnd(float f5, CarouselLayoutManager$KeylineRange carouselLayoutManager$KeylineRange) {
        float f6 = this.getMaskedItemSizeForLocOffset(f5, carouselLayoutManager$KeylineRange) / 2.0f;
        f5 = this.addStart(f5, f6);
        int n3 = this.isLayoutRtl();
        boolean bl2 = false;
        if (n3 != 0) {
            n3 = 0;
            f6 = 0.0f;
            carouselLayoutManager$KeylineRange = null;
            float f7 = f5 - 0.0f;
            Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (object >= 0) return bl2;
            return true;
        }
        n3 = this.getContainerSize();
        f6 = n3;
        float f8 = f5 - f6;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object <= 0) return bl2;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean isLocOffsetOutOfFillBoundsStart(float f5, CarouselLayoutManager$KeylineRange carouselLayoutManager$KeylineRange) {
        float f6 = this.getMaskedItemSizeForLocOffset(f5, carouselLayoutManager$KeylineRange) / 2.0f;
        f5 = this.addEnd(f5, f6);
        int n3 = this.isLayoutRtl();
        boolean bl2 = false;
        if (n3 != 0) {
            n3 = this.getContainerSize();
            f6 = n3;
            float f7 = f5 - f6;
            Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object <= 0) return bl2;
            return true;
        }
        n3 = 0;
        f6 = 0.0f;
        carouselLayoutManager$KeylineRange = null;
        float f8 = f5 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object >= 0) return bl2;
        return true;
    }

    private /* synthetic */ void lambda$new$0(View view, int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16) {
        if (n3 != n10 || n4 != n14 || n7 != n15 || n8 != n16) {
            rl_2 rl_22 = new rl_2(this);
            view.post((Runnable)rl_22);
        }
    }

    private void logChildrenIfDebugging() {
        int n3 = this.isDebuggingEnabled;
        if (n3 == 0) {
            return;
        }
        String string2 = TAG;
        int n4 = 3;
        n3 = Log.isLoggable((String)string2, (int)n4);
        if (n3 != 0) {
            string2 = null;
            for (n3 = 0; n3 < (n4 = this.getChildCount()); ++n3) {
                View view = this.getChildAt(n3);
                this.getDecoratedCenterWithMargins(view);
                this.getPosition(view);
            }
        }
    }

    private CarouselLayoutManager$ChildCalculations makeChildCalculations(RecyclerView$u recyclerView$u, float f5, int n3) {
        recyclerView$u = recyclerView$u.m((int)n3, (long)Long.MAX_VALUE).itemView;
        this.measureChildWithMargins((View)recyclerView$u, 0, 0);
        float f6 = this.currentKeylineState.getItemSize() / 2.0f;
        f5 = this.addEnd(f5, f6);
        CarouselLayoutManager$KeylineRange carouselLayoutManager$KeylineRange = CarouselLayoutManager.getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), f5, false);
        f6 = this.calculateChildOffsetCenterForLocation((View)recyclerView$u, f5, carouselLayoutManager$KeylineRange);
        CarouselLayoutManager$ChildCalculations carouselLayoutManager$ChildCalculations = new CarouselLayoutManager$ChildCalculations((View)recyclerView$u, f5, f6, carouselLayoutManager$KeylineRange);
        return carouselLayoutManager$ChildCalculations;
    }

    private float offsetChild(View view, float f5, float f6, Rect rect) {
        f5 = this.addEnd(f5, f6);
        CarouselLayoutManager$KeylineRange carouselLayoutManager$KeylineRange = CarouselLayoutManager.getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), f5, false);
        float f7 = this.calculateChildOffsetCenterForLocation(view, f5, carouselLayoutManager$KeylineRange);
        super.getDecoratedBoundsWithMargins(view, rect);
        this.updateChildMaskForLocation(view, f5, carouselLayoutManager$KeylineRange);
        this.orientationHelper.offsetChild(view, rect, f6, f7);
        return f7;
    }

    private void recalculateKeylineStateList(RecyclerView$u object) {
        float f5;
        long l2 = Long.MAX_VALUE;
        float f6 = 0.0f;
        object = ((RecyclerView$u)object).m((int)0, (long)l2).itemView;
        this.measureChildWithMargins((View)object, 0, 0);
        CarouselStrategy carouselStrategy = this.carouselStrategy;
        object = carouselStrategy.onFirstChildMeasuredWithMargins(this, (View)object);
        int n3 = this.isLayoutRtl();
        if (n3 != 0) {
            n3 = this.getContainerSize();
            f5 = n3;
            object = KeylineState.reverse((KeylineState)object, f5);
        }
        f5 = this.getItemMargins();
        float f7 = this.getLeftOrTopPaddingForKeylineShift();
        f6 = this.getRightOrBottomPaddingForKeylineShift();
        this.keylineStateList = object = KeylineStateList.from(this, (KeylineState)object, f5, f7, f6);
    }

    private void refreshKeylineState() {
        this.keylineStateList = null;
        this.requestLayout();
    }

    private void removeAndRecycleOutOfBoundsViews(RecyclerView$u recyclerView$u) {
        boolean bl2;
        CarouselLayoutManager$KeylineRange carouselLayoutManager$KeylineRange;
        float f5;
        View view;
        int n3;
        int n4;
        while (true) {
            n4 = this.getChildCount();
            n3 = 1;
            if (n4 <= 0) break;
            n4 = 0;
            view = this.getChildAt(0);
            f5 = this.getDecoratedCenterWithMargins(view);
            bl2 = this.isLocOffsetOutOfFillBoundsStart(f5, carouselLayoutManager$KeylineRange = CarouselLayoutManager.getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), f5, n3 != 0));
            if (!bl2) break;
            this.removeAndRecycleView(view, recyclerView$u);
        }
        while ((n4 = this.getChildCount() - n3) >= 0 && (bl2 = this.isLocOffsetOutOfFillBoundsEnd(f5 = this.getDecoratedCenterWithMargins(view = this.getChildAt(n4 = this.getChildCount() - n3)), carouselLayoutManager$KeylineRange = CarouselLayoutManager.getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), f5, n3 != 0)))) {
            this.removeAndRecycleView(view, recyclerView$u);
        }
    }

    private int scrollBy(int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        int n4 = this.getChildCount();
        int n7 = 0;
        if (n4 != 0 && n3 != 0) {
            int n8;
            float f5;
            KeylineState$Keyline keylineState$Keyline;
            Object object = this.keylineStateList;
            if (object == null) {
                this.recalculateKeylineStateList(recyclerView$u);
            }
            n4 = this.scrollOffset;
            int n10 = this.minScroll;
            int n14 = this.maxScroll;
            n3 = CarouselLayoutManager.calculateShouldScrollBy(n3, n4, n10, n14);
            this.scrollOffset = n4 = this.scrollOffset + n3;
            object = this.keylineStateList;
            this.updateCurrentKeylineStateForScrollOffset((KeylineStateList)object);
            object = this.currentKeylineState;
            float f6 = ((KeylineState)object).getItemSize() / 2.0f;
            View view = this.getChildAt(0);
            n10 = this.getPosition(view);
            float f7 = this.calculateChildStartForFill(n10);
            Rect rect = new Rect();
            boolean bl2 = this.isLayoutRtl();
            if (bl2) {
                keylineState$Keyline = this.currentKeylineState.getLastFocalKeyline();
                f5 = keylineState$Keyline.locOffset;
            } else {
                keylineState$Keyline = this.currentKeylineState.getFirstFocalKeyline();
                f5 = keylineState$Keyline.locOffset;
            }
            int n15 = 0x7F7FFFFF;
            float f8 = Float.MAX_VALUE;
            while (n7 < (n8 = this.getChildCount())) {
                float f11;
                Object object2 = this.getChildAt(n7);
                float f12 = this.offsetChild((View)object2, f7, f6, rect);
                f12 = Math.abs(f5 - f12);
                if (object2 != null && (f11 = f12 == f8 ? 0 : (f12 < f8 ? -1 : 1)) < 0) {
                    this.currentEstimatedPosition = n15 = this.getPosition((View)object2);
                    f8 = f12;
                }
                object2 = this.currentKeylineState;
                float f14 = ((KeylineState)object2).getItemSize();
                f7 = this.addEnd(f7, f14);
                ++n7;
            }
            this.fill(recyclerView$u, recyclerView$y);
            return n3;
        }
        return 0;
    }

    private void scrollBy(RecyclerView recyclerView, int n3) {
        boolean bl2 = this.isHorizontal();
        if (bl2) {
            recyclerView.scrollBy(n3, 0);
        } else {
            recyclerView.scrollBy(0, n3);
        }
    }

    private void setCarouselAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            int[] nArray = R$styleable.Carousel;
            context = context.obtainStyledAttributes(attributeSet, nArray);
            int n3 = R$styleable.Carousel_carousel_alignment;
            nArray = null;
            n3 = context.getInt(n3, 0);
            this.setCarouselAlignment(n3);
            n3 = R$styleable.RecyclerView_android_orientation;
            n3 = context.getInt(n3, 0);
            this.setOrientation(n3);
            context.recycle();
        }
    }

    private void updateChildMaskForLocation(View view, float f5, CarouselLayoutManager$KeylineRange carouselLayoutManager$KeylineRange) {
        boolean bl2 = view instanceof Maskable;
        if (!bl2) {
            return;
        }
        KeylineState$Keyline keylineState$Keyline = carouselLayoutManager$KeylineRange.leftOrTop;
        float f6 = keylineState$Keyline.mask;
        KeylineState$Keyline keylineState$Keyline2 = carouselLayoutManager$KeylineRange.rightOrBottom;
        float f7 = keylineState$Keyline2.mask;
        float f8 = keylineState$Keyline.loc;
        float f11 = keylineState$Keyline2.loc;
        f8 = AnimationUtils.lerp(f6, f7, f8, f11, f5);
        f6 = view.getHeight();
        f11 = view.getWidth();
        f7 = 2.0f;
        float f12 = f11 / f7;
        float f14 = 1.0f;
        f12 = AnimationUtils.lerp(0.0f, f12, 0.0f, f14, f8);
        float f15 = f6 / f7;
        f8 = AnimationUtils.lerp(0.0f, f15, 0.0f, f14, f8);
        CarouselOrientationHelper carouselOrientationHelper = this.orientationHelper;
        keylineState$Keyline = carouselOrientationHelper.getMaskRect(f6, f11, f8, f12);
        f5 = this.calculateChildOffsetCenterForLocation(view, f5, carouselLayoutManager$KeylineRange);
        float f16 = keylineState$Keyline.height() / f7;
        f16 = f5 - f16;
        f6 = keylineState$Keyline.height() / f7 + f5;
        f11 = keylineState$Keyline.width() / f7;
        f11 = f5 - f11;
        f12 = keylineState$Keyline.width() / f7 + f5;
        RectF rectF = new RectF(f11, f16, f12, f6);
        f6 = this.getParentLeft();
        int n3 = this.getParentTop();
        f11 = n3;
        int n4 = this.getParentRight();
        f7 = n4;
        int n7 = this.getParentBottom();
        f12 = n7;
        carouselLayoutManager$KeylineRange = new RectF(f6, f11, f7, f12);
        Object object = this.carouselStrategy;
        boolean bl3 = ((CarouselStrategy)object).isContained();
        if (bl3) {
            object = this.orientationHelper;
            ((CarouselOrientationHelper)object).containMaskWithinBounds((RectF)keylineState$Keyline, rectF, (RectF)carouselLayoutManager$KeylineRange);
        }
        this.orientationHelper.moveMaskOnEdgeOutsideBounds((RectF)keylineState$Keyline, rectF, (RectF)carouselLayoutManager$KeylineRange);
        ((Maskable)view).setMaskRectF((RectF)keylineState$Keyline);
    }

    private void updateCurrentKeylineStateForScrollOffset(KeylineStateList object) {
        int n3 = this.maxScroll;
        int n4 = this.minScroll;
        if (n3 <= n4) {
            n3 = (int)(this.isLayoutRtl() ? 1 : 0);
            object = n3 != 0 ? ((KeylineStateList)object).getEndState() : ((KeylineStateList)object).getStartState();
            this.currentKeylineState = object;
        } else {
            int n7 = this.scrollOffset;
            float f5 = n7;
            float f6 = n4;
            float f7 = n3;
            this.currentKeylineState = object = ((KeylineStateList)object).getShiftedState(f5, f6, f7);
        }
        object = this.debugItemDecoration;
        List list = this.currentKeylineState.getKeylines();
        ((CarouselLayoutManager$DebugItemDecoration)object).setKeylines(list);
    }

    private void updateItemCount() {
        Object object;
        int n3;
        int n4 = this.getItemCount();
        if (n4 != (n3 = this.lastItemCount) && (object = this.keylineStateList) != null) {
            object = this.carouselStrategy;
            if ((n3 = (int)(((CarouselStrategy)object).shouldRefreshKeylineState(this, n3) ? 1 : 0)) != 0) {
                this.refreshKeylineState();
            }
            this.lastItemCount = n4;
        }
    }

    private void validateChildOrderIfDebugging() {
        int n3;
        int n4 = this.isDebuggingEnabled;
        if (n4 != 0 && (n4 = this.getChildCount()) >= (n3 = 1)) {
            int n7;
            n4 = 0;
            CharSequence charSequence = null;
            while (n4 < (n7 = this.getChildCount() - n3)) {
                int n8;
                View view;
                int n10;
                View view2 = this.getChildAt(n4);
                n7 = this.getPosition(view2);
                if (n7 <= (n10 = this.getPosition(view = this.getChildAt(n8 = n4 + 1)))) {
                    n4 = n8;
                    continue;
                }
                this.logChildrenIfDebugging();
                String string2 = "] had adapter position [";
                charSequence = fQ2.a("Detected invalid child order. Child at index [", string2, "] and child at index [", n4, n7);
                charSequence.append(n8);
                charSequence.append(string2);
                charSequence.append(n10);
                charSequence.append("].");
                charSequence = charSequence.toString();
                IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
                throw illegalStateException;
            }
        }
    }

    public int calculateScrollDeltaToMakePositionVisible(int n3) {
        KeylineState keylineState = this.getKeylineStateForPosition(n3);
        float f5 = this.getScrollOffsetForPosition(n3, keylineState);
        return (int)((float)this.scrollOffset - f5);
    }

    public boolean canScrollHorizontally() {
        return this.isHorizontal();
    }

    public boolean canScrollVertically() {
        return this.isHorizontal() ^ true;
    }

    public int computeHorizontalScrollExtent(RecyclerView$y recyclerView$y) {
        int n3;
        KeylineStateList keylineStateList;
        int n4 = this.getChildCount();
        if (n4 != 0 && (keylineStateList = this.keylineStateList) != null && (n4 = this.getItemCount()) > (n3 = 1)) {
            float f5 = this.keylineStateList.getDefaultState().getItemSize();
            float f6 = this.computeHorizontalScrollRange(recyclerView$y);
            return (int)((float)this.getWidth() * (f5 /= f6));
        }
        return 0;
    }

    public int computeHorizontalScrollOffset(RecyclerView$y recyclerView$y) {
        return this.scrollOffset;
    }

    public int computeHorizontalScrollRange(RecyclerView$y recyclerView$y) {
        int n3 = this.maxScroll;
        int n4 = this.minScroll;
        return n3 - n4;
    }

    public PointF computeScrollVectorForPosition(int n3) {
        Object object = this.keylineStateList;
        if (object == null) {
            return null;
        }
        object = this.getKeylineStateForPosition(n3);
        n3 = this.getOffsetToScrollToPosition(n3, (KeylineState)object);
        boolean bl2 = this.isHorizontal();
        if (bl2) {
            float f5 = n3;
            object = new PointF(f5, 0.0f);
            return object;
        }
        float f6 = n3;
        object = new PointF(0.0f, f6);
        return object;
    }

    public int computeVerticalScrollExtent(RecyclerView$y recyclerView$y) {
        int n3;
        KeylineStateList keylineStateList;
        int n4 = this.getChildCount();
        if (n4 != 0 && (keylineStateList = this.keylineStateList) != null && (n4 = this.getItemCount()) > (n3 = 1)) {
            float f5 = this.keylineStateList.getDefaultState().getItemSize();
            float f6 = this.computeVerticalScrollRange(recyclerView$y);
            return (int)((float)this.getHeight() * (f5 /= f6));
        }
        return 0;
    }

    public int computeVerticalScrollOffset(RecyclerView$y recyclerView$y) {
        return this.scrollOffset;
    }

    public int computeVerticalScrollRange(RecyclerView$y recyclerView$y) {
        int n3 = this.maxScroll;
        int n4 = this.minScroll;
        return n3 - n4;
    }

    public RecyclerView$LayoutParams generateDefaultLayoutParams() {
        int n3 = -2;
        RecyclerView$LayoutParams recyclerView$LayoutParams = new RecyclerView$LayoutParams(n3, n3);
        return recyclerView$LayoutParams;
    }

    public int getCarouselAlignment() {
        return this.carouselAlignment;
    }

    public int getContainerHeight() {
        return this.getHeight();
    }

    public int getContainerWidth() {
        return this.getWidth();
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        float f5;
        super.getDecoratedBoundsWithMargins(view, rect);
        int n3 = rect.centerY();
        float f6 = n3;
        int n4 = this.isHorizontal();
        if (n4 != 0) {
            n3 = rect.centerX();
            f6 = n3;
        }
        CarouselLayoutManager$KeylineRange carouselLayoutManager$KeylineRange = CarouselLayoutManager.getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), f6, true);
        f6 = this.getMaskedItemSizeForLocOffset(f6, carouselLayoutManager$KeylineRange);
        n4 = this.isHorizontal();
        int n7 = 0;
        float f7 = 0.0f;
        int n8 = 0x40000000;
        float f8 = 2.0f;
        if (n4 != 0) {
            n4 = rect.width();
            f5 = ((float)n4 - f6) / f8;
        } else {
            n4 = 0;
            f5 = 0.0f;
            carouselLayoutManager$KeylineRange = null;
        }
        boolean bl2 = this.isHorizontal();
        if (!bl2) {
            n7 = rect.height();
            f7 = ((float)n7 - f6) / f8;
        }
        n3 = (int)((float)rect.left + f5);
        n8 = (int)((float)rect.top + f7);
        n4 = (int)((float)rect.right - f5);
        n7 = (int)((float)rect.bottom - f7);
        rect.set(n3, n8, n4, n7);
    }

    public int getOffsetToScrollToPosition(int n3, KeylineState keylineState) {
        n3 = this.getScrollOffsetForPosition(n3, keylineState);
        int n4 = this.scrollOffset;
        return n3 - n4;
    }

    public int getOffsetToScrollToPositionForSnap(int n3, boolean n4) {
        Object object = this.keylineStateList;
        int n7 = this.scrollOffset;
        float f5 = n7;
        int n8 = this.minScroll;
        float f6 = n8;
        int n10 = this.maxScroll;
        float f7 = n10;
        boolean bl2 = true;
        object = ((KeylineStateList)object).getShiftedState(f5, f6, f7, bl2);
        int n14 = this.getOffsetToScrollToPosition(n3, (KeylineState)object);
        Object object2 = this.keylineStatePositionMap;
        if (object2 != null) {
            object2 = this.getKeylineStateForPosition(n3);
            n3 = this.getOffsetToScrollToPosition(n3, (KeylineState)object2);
        } else {
            n3 = n14;
        }
        if (n4 != 0 && (n4 = Math.abs(n3)) < (n7 = Math.abs(n14))) {
            n14 = n3;
        }
        return n14;
    }

    public int getOrientation() {
        return this.orientationHelper.orientation;
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isHorizontal() {
        CarouselOrientationHelper carouselOrientationHelper = this.orientationHelper;
        int n3 = carouselOrientationHelper.orientation;
        if (!n3) {
            n3 = 1;
        } else {
            n3 = 0;
            carouselOrientationHelper = null;
        }
        return n3 != 0;
    }

    public boolean isLayoutRtl() {
        int n3;
        int n4 = this.isHorizontal();
        if (n4 == 0 || (n4 = this.getLayoutDirection()) != (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void measureChildWithMargins(View var1_1, int var2_2, int var3_3) {
        block4: {
            var4_4 = var1_1 /* !! */  instanceof Maskable;
            if (var4_4 == 0) break block4;
            var5_5 = (RecyclerView$LayoutParams)var1_1 /* !! */ .getLayoutParams();
            var6_6 = new Rect();
            this.calculateItemDecorationsForChild(var1_1 /* !! */ , (Rect)var6_6);
            var7_7 = var6_6.left;
            var8_8 = var6_6.right;
            var7_7 = var7_7 + var8_8 + var2_2;
            var2_2 = var6_6.top;
            var9_9 = var6_6.bottom;
            var2_2 = var2_2 + var9_9 + var3_3;
            var10_10 = this.keylineStateList;
            if (var10_10 == null) ** GOTO lbl-1000
            var6_6 = this.orientationHelper;
            var9_9 = var6_6.orientation;
            if (var9_9 == 0) {
                var10_10 = var10_10.getDefaultState();
                var11_11 = var10_10.getItemSize();
            } else lbl-1000:
            // 2 sources

            {
                var3_3 = var5_5.width;
                var11_11 = var3_3;
            }
            var6_6 = this.keylineStateList;
            if (var6_6 == null) ** GOTO lbl-1000
            var12_12 = this.orientationHelper;
            var8_8 = var12_12.orientation;
            var13_13 = 1;
            if (var8_8 == var13_13) {
                var6_6 = var6_6.getDefaultState();
                var14_14 = var6_6.getItemSize();
            } else lbl-1000:
            // 2 sources

            {
                var9_9 = var5_5.height;
                var14_14 = var9_9;
            }
            var8_8 = this.getWidth();
            var13_13 = this.getWidthMode();
            var15_15 = this.getPaddingLeft();
            var16_16 = this.getPaddingRight() + var15_15;
            var15_15 = var5_5.leftMargin;
            var16_16 += var15_15;
            var15_15 = var5_5.rightMargin;
            var16_16 = var16_16 + var15_15 + var7_7;
            var3_3 = (int)var11_11;
            var7_7 = (int)this.canScrollHorizontally();
            var3_3 = RecyclerView$o.getChildMeasureSpec(var8_8, var13_13, var16_16, var3_3, (boolean)var7_7);
            var7_7 = this.getHeight();
            var8_8 = this.getHeightMode();
            var13_13 = this.getPaddingTop();
            var15_15 = this.getPaddingBottom() + var13_13;
            var13_13 = var5_5.topMargin;
            var15_15 += var13_13;
            var4_4 = var5_5.bottomMargin;
            var15_15 = var15_15 + var4_4 + var2_2;
            var2_2 = (int)var14_14;
            var4_4 = (int)this.canScrollVertically();
            var2_2 = RecyclerView$o.getChildMeasureSpec(var7_7, var8_8, var15_15, var2_2, (boolean)var4_4);
            var1_1 /* !! */ .measure(var3_3, var2_2);
            return;
        }
        var1_1 /* !! */  = new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        throw var1_1 /* !! */ ;
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        CarouselStrategy carouselStrategy = this.carouselStrategy;
        Context context = recyclerView.getContext();
        carouselStrategy.initialize(context);
        this.refreshKeylineState();
        carouselStrategy = this.recyclerViewSizeChangeListener;
        recyclerView.addOnLayoutChangeListener((View.OnLayoutChangeListener)carouselStrategy);
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView$u recyclerView$u) {
        super.onDetachedFromWindow(recyclerView, recyclerView$u);
        recyclerView$u = this.recyclerViewSizeChangeListener;
        recyclerView.removeOnLayoutChangeListener((View.OnLayoutChangeListener)recyclerView$u);
    }

    public View onFocusSearchFailed(View view, int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        int n4 = this.getChildCount();
        if (n4 == 0) {
            return null;
        }
        if ((n3 = this.convertFocusDirectionToLayoutDirection(n3)) == (n4 = -1 << -1)) {
            return null;
        }
        n4 = -1;
        if (n3 == n4) {
            int n7 = this.getPosition(view);
            if (n7 == 0) {
                return null;
            }
            n7 = 0;
            View view2 = this.getChildAt(0);
            n3 = this.getPosition(view2) + -1;
            this.addViewAtPosition(recyclerView$u, n3, 0);
            view = this.getChildClosestToStart();
        } else {
            int n8 = this.getPosition(view);
            if (n8 == (n3 = this.getItemCount() + -1)) {
                return null;
            }
            n8 = this.getChildCount() + -1;
            view = this.getChildAt(n8);
            n8 = this.getPosition(view) + 1;
            this.addViewAtPosition(recyclerView$u, n8, n4);
            view = this.getChildClosestToEnd();
        }
        return view;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int n3 = this.getChildCount();
        if (n3 > 0) {
            View view = this.getChildAt(0);
            n3 = this.getPosition(view);
            accessibilityEvent.setFromIndex(n3);
            n3 = this.getChildCount() + -1;
            view = this.getChildAt(n3);
            n3 = this.getPosition(view);
            accessibilityEvent.setToIndex(n3);
        }
    }

    public void onItemsAdded(RecyclerView recyclerView, int n3, int n4) {
        super.onItemsAdded(recyclerView, n3, n4);
        this.updateItemCount();
    }

    public void onItemsRemoved(RecyclerView recyclerView, int n3, int n4) {
        super.onItemsRemoved(recyclerView, n3, n4);
        this.updateItemCount();
    }

    public void onLayoutChildren(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        int n3 = recyclerView$y.b();
        if (n3 > 0) {
            float f5 = this.getContainerSize();
            int n4 = 0;
            Object object = null;
            float f6 = f5 - 0.0f;
            n3 = (int)(f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1));
            if (n3 > 0) {
                int n7;
                Object object2;
                boolean bl2;
                n3 = (int)(this.isLayoutRtl() ? 1 : 0);
                object = this.keylineStateList;
                if (object == null) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    object = null;
                }
                if (n4 != 0) {
                    this.recalculateKeylineStateList(recyclerView$u);
                }
                KeylineStateList keylineStateList = this.keylineStateList;
                boolean bl22 = this.calculateStartScroll(keylineStateList);
                KeylineStateList keylineStateList2 = this.keylineStateList;
                boolean bl3 = this.calculateEndScroll(recyclerView$y, keylineStateList2);
                boolean bl4 = n3 != 0 ? bl3 : bl22;
                this.minScroll = bl4;
                if (n3 != 0) {
                    bl2 = bl22;
                }
                this.maxScroll = bl2;
                if (n4 != 0) {
                    this.scrollOffset = bl22;
                    object2 = this.keylineStateList;
                    n4 = this.getItemCount();
                    bl22 = this.minScroll;
                    int n8 = this.maxScroll;
                    bl4 = this.isLayoutRtl();
                    this.keylineStatePositionMap = object2 = ((KeylineStateList)object2).getKeylineStateForPositionMap(n4, (int)(bl22 ? 1 : 0), n8, bl4);
                    n3 = this.currentEstimatedPosition;
                    n4 = -1;
                    if (n3 != n4) {
                        object = this.getKeylineStateForPosition(n3);
                        this.scrollOffset = n3 = this.getScrollOffsetForPosition(n3, (KeylineState)object);
                    }
                }
                n3 = this.scrollOffset;
                n4 = this.minScroll;
                bl22 = this.maxScroll;
                n4 = CarouselLayoutManager.calculateShouldScrollBy(0, n3, n4, (int)(bl22 ? 1 : 0));
                this.scrollOffset = n3 += n4;
                n3 = this.currentFillStartPosition;
                n4 = recyclerView$y.b();
                this.currentFillStartPosition = n3 = PK1.b(n3, 0, n4);
                object2 = this.keylineStateList;
                this.updateCurrentKeylineStateForScrollOffset((KeylineStateList)object2);
                this.detachAndScrapAttachedViews(recyclerView$u);
                this.fill(recyclerView$u, recyclerView$y);
                this.lastItemCount = n7 = this.getItemCount();
                return;
            }
        }
        this.removeAndRecycleAllViews(recyclerView$u);
        this.currentFillStartPosition = 0;
    }

    public void onLayoutCompleted(RecyclerView$y recyclerView$y) {
        super.onLayoutCompleted(recyclerView$y);
        int n3 = this.getChildCount();
        if (n3 == 0) {
            this.currentFillStartPosition = 0;
        } else {
            recyclerView$y = this.getChildAt(0);
            this.currentFillStartPosition = n3 = this.getPosition((View)recyclerView$y);
        }
        this.validateChildOrderIfDebugging();
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect object, boolean bl2, boolean bl3) {
        object = this.keylineStateList;
        boolean bl4 = false;
        KeylineStateList keylineStateList = null;
        if (object == null) {
            return false;
        }
        int n3 = this.getPosition(view);
        int n4 = this.getPosition(view);
        KeylineState keylineState = this.getKeylineStateForPosition(n4);
        if ((n3 = this.getSmallestScrollOffsetToFocalKeyline(n3, keylineState)) == 0) {
            return false;
        }
        int n7 = this.scrollOffset;
        int n8 = this.minScroll;
        int n10 = this.maxScroll;
        n3 = CarouselLayoutManager.calculateShouldScrollBy(n3, n7, n8, n10);
        keylineStateList = this.keylineStateList;
        float f5 = this.scrollOffset + n3;
        float f6 = this.minScroll;
        float f7 = this.maxScroll;
        object = keylineStateList.getShiftedState(f5, f6, f7);
        int n14 = this.getPosition(view);
        n14 = this.getSmallestScrollOffsetToFocalKeyline(n14, (KeylineState)object);
        this.scrollBy(recyclerView, n14);
        return true;
    }

    public int scrollHorizontallyBy(int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        boolean bl2 = this.canScrollHorizontally();
        n3 = bl2 ? this.scrollBy(n3, recyclerView$u, recyclerView$y) : 0;
        return n3;
    }

    public void scrollToPosition(int n3) {
        int n4;
        this.currentEstimatedPosition = n3;
        Object object = this.keylineStateList;
        if (object == null) {
            return;
        }
        object = this.getKeylineStateForPosition(n3);
        this.scrollOffset = n4 = this.getScrollOffsetForPosition(n3, (KeylineState)object);
        n4 = this.getItemCount() + -1;
        n4 = Math.max(0, n4);
        this.currentFillStartPosition = n3 = PK1.b(n3, 0, n4);
        KeylineStateList keylineStateList = this.keylineStateList;
        this.updateCurrentKeylineStateForScrollOffset(keylineStateList);
        this.requestLayout();
    }

    public int scrollVerticallyBy(int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        boolean bl2 = this.canScrollVertically();
        n3 = bl2 ? this.scrollBy(n3, recyclerView$u, recyclerView$y) : 0;
        return n3;
    }

    public void setCarouselAlignment(int n3) {
        this.carouselAlignment = n3;
        this.refreshKeylineState();
    }

    public void setCarouselStrategy(CarouselStrategy carouselStrategy) {
        this.carouselStrategy = carouselStrategy;
        this.refreshKeylineState();
    }

    public void setDebuggingEnabled(RecyclerView recyclerView, boolean bl2) {
        this.isDebuggingEnabled = bl2;
        CarouselLayoutManager$DebugItemDecoration carouselLayoutManager$DebugItemDecoration = this.debugItemDecoration;
        recyclerView.removeItemDecoration(carouselLayoutManager$DebugItemDecoration);
        if (bl2) {
            CarouselLayoutManager$DebugItemDecoration carouselLayoutManager$DebugItemDecoration2 = this.debugItemDecoration;
            recyclerView.addItemDecoration(carouselLayoutManager$DebugItemDecoration2);
        }
        recyclerView.invalidateItemDecorations();
    }

    public void setOrientation(int n3) {
        int n4;
        if (n3 != 0 && n3 != (n4 = 1)) {
            String string2 = hj0_0.a(n3, "invalid orientation:");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        n4 = 0;
        this.assertNotInLayoutOrScroll(null);
        CarouselOrientationHelper carouselOrientationHelper = this.orientationHelper;
        if (carouselOrientationHelper == null || n3 != (n4 = carouselOrientationHelper.orientation)) {
            CarouselOrientationHelper carouselOrientationHelper2;
            this.orientationHelper = carouselOrientationHelper2 = CarouselOrientationHelper.createOrientationHelper(this, n3);
            this.refreshKeylineState();
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView$y object, int n3) {
        recyclerView = recyclerView.getContext();
        object = new CarouselLayoutManager$1(this, (Context)recyclerView);
        ((RecyclerView$x)object).setTargetPosition(n3);
        this.startSmoothScroll((RecyclerView$x)object);
    }
}

