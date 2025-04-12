/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.customview.widget.ViewDragHelper$b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

class BottomSheetBehavior$5
extends ViewDragHelper$b {
    final /* synthetic */ BottomSheetBehavior this$0;
    private long viewCapturedMillis;

    public BottomSheetBehavior$5(BottomSheetBehavior bottomSheetBehavior) {
        this.this$0 = bottomSheetBehavior;
    }

    private boolean releasedLow(View view) {
        int n3 = view.getTop();
        BottomSheetBehavior bottomSheetBehavior = this.this$0;
        int n4 = bottomSheetBehavior.parentHeight;
        int n7 = (bottomSheetBehavior.getExpandedOffset() + n4) / 2;
        if (n3 > n7) {
            n3 = 1;
        } else {
            n3 = 0;
            view = null;
        }
        return n3;
    }

    public int clampViewPositionHorizontal(View view, int n3, int n4) {
        return view.getLeft();
    }

    public int clampViewPositionVertical(View view, int n3, int n4) {
        n4 = this.this$0.getExpandedOffset();
        int n7 = this.getViewVerticalDragRange(view);
        return PK1.b(n3, n4, n7);
    }

    public int getViewVerticalDragRange(View object) {
        object = this.this$0;
        boolean bl2 = BottomSheetBehavior.access$1600((BottomSheetBehavior)object);
        if (bl2) {
            return this.this$0.parentHeight;
        }
        return this.this$0.collapsedOffset;
    }

    public void onViewDragStateChanged(int n3) {
        BottomSheetBehavior bottomSheetBehavior;
        int n4 = 1;
        if (n3 == n4 && (n3 = (int)(BottomSheetBehavior.access$1300(bottomSheetBehavior = this.this$0) ? 1 : 0)) != 0) {
            bottomSheetBehavior = this.this$0;
            bottomSheetBehavior.setStateInternal(n4);
        }
    }

    public void onViewPositionChanged(View view, int n3, int n4, int n7, int n8) {
        this.this$0.dispatchOnSlide(n4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onViewReleased(View view, float f5, float f6) {
        int n3;
        BottomSheetBehavior bottomSheetBehavior;
        int n4;
        block8: {
            float f7;
            block7: {
                boolean bl2;
                int n7;
                int n8;
                int n10;
                block13: {
                    block14: {
                        block5: {
                            BottomSheetBehavior bottomSheetBehavior2;
                            block12: {
                                block11: {
                                    boolean bl3;
                                    float f8;
                                    float f11;
                                    block9: {
                                        int n14;
                                        block10: {
                                            boolean bl4;
                                            float f12;
                                            float f14;
                                            boolean bl5;
                                            float f15;
                                            block4: {
                                                BottomSheetBehavior bottomSheetBehavior3;
                                                int n15;
                                                block6: {
                                                    n4 = 6;
                                                    f7 = 8.4E-45f;
                                                    n10 = 3;
                                                    n14 = 4;
                                                    f15 = 5.6E-45f;
                                                    boolean bl6 = false;
                                                    float f16 = f6 - 0.0f;
                                                    Object object = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                                                    if (object >= 0) break block4;
                                                    bottomSheetBehavior = this.this$0;
                                                    boolean bl7 = BottomSheetBehavior.access$1400(bottomSheetBehavior);
                                                    if (bl7) break block5;
                                                    n15 = view.getTop();
                                                    long l2 = System.currentTimeMillis();
                                                    long l3 = this.viewCapturedMillis;
                                                    l2 -= l3;
                                                    bottomSheetBehavior3 = this.this$0;
                                                    n3 = bottomSheetBehavior3.shouldSkipHalfExpandedStateWhenDragging();
                                                    if (n3 == 0) break block6;
                                                    f5 = n15;
                                                    n3 = 1120403456;
                                                    f6 = 100.0f;
                                                    f5 *= f6;
                                                    bottomSheetBehavior3 = this.this$0;
                                                    n4 = bottomSheetBehavior3.parentHeight;
                                                    f7 = n4;
                                                    boolean bl8 = bottomSheetBehavior3.shouldExpandOnUpwardDrag(l2, f5 /= f7);
                                                    if (!bl8) break block7;
                                                    break block5;
                                                }
                                                bottomSheetBehavior3 = this.this$0;
                                                n3 = bottomSheetBehavior3.halfExpandedOffset;
                                                if (n15 <= n3) break block5;
                                                break block8;
                                            }
                                            BottomSheetBehavior bottomSheetBehavior4 = this.this$0;
                                            boolean bl9 = bottomSheetBehavior4.hideable;
                                            if (!bl9 || !(bl5 = bottomSheetBehavior4.shouldHide(view, f6))) break block9;
                                            float f17 = (f5 = Math.abs(f5)) - (f15 = Math.abs(f6));
                                            Object object = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                                            if ((object >= 0 || (f14 = (f12 = f6 - (f5 = (float)BottomSheetBehavior.access$1500(bottomSheetBehavior = this.this$0))) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) <= 0) && !(bl4 = this.releasedLow(view))) break block10;
                                            n4 = 5;
                                            f7 = 7.0E-45f;
                                            break block8;
                                        }
                                        bottomSheetBehavior = this.this$0;
                                        boolean bl10 = BottomSheetBehavior.access$1400(bottomSheetBehavior);
                                        if (bl10) break block5;
                                        int n16 = view.getTop();
                                        BottomSheetBehavior bottomSheetBehavior5 = this.this$0;
                                        n3 = bottomSheetBehavior5.getExpandedOffset();
                                        int n17 = Math.abs(n16 - n3);
                                        n3 = view.getTop();
                                        BottomSheetBehavior bottomSheetBehavior6 = this.this$0;
                                        n14 = bottomSheetBehavior6.halfExpandedOffset;
                                        if (n17 >= (n3 = Math.abs(n3 - n14))) break block8;
                                        break block5;
                                    }
                                    float f18 = f6 - 0.0f;
                                    Object object = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                                    if (object == false || (f11 = (f8 = (f5 = Math.abs(f5)) - (f6 = Math.abs(f6))) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) > 0) break block11;
                                    bottomSheetBehavior = this.this$0;
                                    boolean bl11 = BottomSheetBehavior.access$1400(bottomSheetBehavior);
                                    if (bl11) break block7;
                                    int n18 = view.getTop();
                                    BottomSheetBehavior bottomSheetBehavior7 = this.this$0;
                                    n3 = bottomSheetBehavior7.halfExpandedOffset;
                                    n3 = Math.abs(n18 - n3);
                                    BottomSheetBehavior bottomSheetBehavior8 = this.this$0;
                                    n10 = bottomSheetBehavior8.collapsedOffset;
                                    int n19 = Math.abs(n18 - n10);
                                    if (n3 < n19 && !(bl3 = (bottomSheetBehavior = this.this$0).shouldSkipHalfExpandedStateWhenDragging())) break block8;
                                    break block7;
                                }
                                n8 = view.getTop();
                                bottomSheetBehavior2 = this.this$0;
                                n3 = BottomSheetBehavior.access$1400(bottomSheetBehavior2);
                                if (n3 == 0) break block12;
                                bottomSheetBehavior2 = this.this$0;
                                n3 = bottomSheetBehavior2.fitToContentsOffset;
                                n3 = Math.abs(n8 - n3);
                                BottomSheetBehavior bottomSheetBehavior9 = this.this$0;
                                n4 = bottomSheetBehavior9.collapsedOffset;
                                int n20 = Math.abs(n8 - n4);
                                if (n3 >= n20) break block7;
                                break block5;
                            }
                            bottomSheetBehavior2 = this.this$0;
                            n7 = bottomSheetBehavior2.halfExpandedOffset;
                            if (n8 >= n7) break block13;
                            n3 = bottomSheetBehavior2.collapsedOffset;
                            if (n8 >= (n3 = Math.abs(n8 - n3))) break block14;
                        }
                        n4 = 3;
                        f7 = 4.2E-45f;
                        break block8;
                    }
                    bottomSheetBehavior = this.this$0;
                    boolean bl12 = bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging();
                    if (!bl12) break block8;
                    break block7;
                }
                n3 = Math.abs(n8 - n7);
                BottomSheetBehavior bottomSheetBehavior10 = this.this$0;
                n10 = bottomSheetBehavior10.collapsedOffset;
                int n21 = Math.abs(n8 - n10);
                if (n3 < n21 && !(bl2 = (bottomSheetBehavior = this.this$0).shouldSkipHalfExpandedStateWhenDragging())) break block8;
            }
            n4 = 4;
            f7 = 5.6E-45f;
        }
        bottomSheetBehavior = this.this$0;
        n3 = bottomSheetBehavior.shouldSkipSmoothAnimation();
        BottomSheetBehavior.access$100(bottomSheetBehavior, view, n4, n3 != 0);
    }

    public boolean tryCaptureView(View view, int n3) {
        long l2;
        WeakReference weakReference;
        BottomSheetBehavior bottomSheetBehavior = this.this$0;
        int n4 = bottomSheetBehavior.state;
        boolean bl2 = false;
        int n7 = 1;
        if (n4 == n7) {
            return false;
        }
        int n8 = bottomSheetBehavior.touchingScrollingChild;
        if (n8 != 0) {
            return false;
        }
        n8 = 3;
        if (n4 == n8 && (n4 = bottomSheetBehavior.activePointerId) == n3) {
            int n10;
            weakReference = bottomSheetBehavior.nestedScrollingChildRef;
            if (weakReference != null) {
                weakReference = (View)weakReference.get();
            } else {
                n3 = 0;
                weakReference = null;
            }
            if (weakReference != null && (n3 = (int)(weakReference.canScrollVertically(n10 = -1) ? 1 : 0)) != 0) {
                return false;
            }
        }
        this.viewCapturedMillis = l2 = System.currentTimeMillis();
        weakReference = this.this$0.viewRef;
        if (weakReference != null && (weakReference = weakReference.get()) == view) {
            bl2 = true;
        }
        return bl2;
    }
}

