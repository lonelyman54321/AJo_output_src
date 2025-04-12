/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.View
 *  android.widget.FrameLayout
 */
package in.juspay.hypersdk.mystique;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

public class SwypeLayout
extends FrameLayout {
    private static final String TAG = "SwypeLayout";
    public static WeakReference activeLayoutWeakReference;
    public static WeakReference partialSwypeWeakReference;
    private boolean didDisplace = false;
    private int leftEdge = 0;
    private View mContent = null;
    private float mDisplaceX = 0.0f;
    private boolean mEnabled = false;
    private View mLeftOption = null;
    private View mRightOption = null;
    private float mX = 0.0f;
    private int rightEdge = 250;

    public SwypeLayout(Context context) {
        super(context);
    }

    public static void clear() {
        Object object = (SwypeLayout)((Object)activeLayoutWeakReference.get());
        if (object != null) {
            object.reset();
            object = new WeakReference(null);
            activeLayoutWeakReference = object;
        }
        if ((object = (SwypeLayout)((Object)partialSwypeWeakReference.get())) != null) {
            object.reset();
            partialSwypeWeakReference = object = new WeakReference(null);
        }
    }

    private void handleSwype(float f5, boolean bl2) {
        Object object;
        int n3;
        float f6;
        block18: {
            boolean bl3;
            block17: {
                int n4;
                int n7 = this.leftEdge;
                if (n7 == 0 && (n4 = this.rightEdge) == 0) {
                    return;
                }
                f6 = n7;
                float f7 = this.mX;
                f5 -= f7;
                f7 = this.mDisplaceX + f5;
                n3 = -1082130432;
                f5 = -1.0f;
                bl3 = true;
                float f8 = f7 - 0.0f;
                Object object2 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                if (object2 < 0) {
                    n7 = this.rightEdge;
                    f6 = n7;
                    f7 *= f5;
                    object2 = true;
                } else {
                    object2 = false;
                }
                float f11 = f7 == f6 ? 0 : (f7 > f6 ? 1 : -1);
                if (f11 > 0) {
                    f7 = f6;
                }
                if (bl2) {
                    double d2 = f7 /= f6;
                    double d5 = 0.4;
                    double d7 = d2 - d5;
                    n4 = (int)(d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1));
                    if (n4 <= 0) {
                        n7 = 0;
                        f6 = 0.0f;
                    }
                } else {
                    f6 = f7;
                }
                Object object3 = (SwypeLayout)((Object)partialSwypeWeakReference.get());
                if (object3 != null && object3 != this) {
                    ((SwypeLayout)((Object)object3)).reset();
                }
                partialSwypeWeakReference = object3 = new WeakReference(this);
                if (object2 != false) {
                    f6 *= f5;
                }
                f5 = this.mDisplaceX - f6;
                f7 = 20.0f;
                object2 = false;
                n4 = (int)(f5 == f7 ? 0 : (f5 > f7 ? 1 : -1));
                if (n4 > 0) break block17;
                n4 = -1046478848;
                f7 = -20.0f;
                float f12 = f5 - f7;
                n3 = (int)(f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1));
                if (n3 >= 0) break block18;
            }
            this.didDisplace = bl3;
            object = (SwypeLayout)((Object)activeLayoutWeakReference.get());
            if (object != null && object != this) {
                object.reset();
                object = new WeakReference(null);
                activeLayoutWeakReference = object;
            }
        }
        if (bl2) {
            this.mDisplaceX = f6;
            object = this.mContent.animate();
            long l2 = 150L;
            object = object.setDuration(l2);
            WI0 wI0 = new WI0();
            object = object.setInterpolator((TimeInterpolator)wI0);
            object.translationX(f6);
            float f14 = f6 - 0.0f;
            n3 = (int)(f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1));
            if (n3 != 0) {
                object = new WeakReference(this);
                activeLayoutWeakReference = object;
            }
            object = new WeakReference(null);
            partialSwypeWeakReference = object;
        } else {
            object = this.mContent;
            object.setTranslationX(f6);
        }
    }

    private void processClick(MotionEvent motionEvent) {
        float f5 = this.getMeasuredHeight();
        int n3 = this.getMeasuredWidth();
        float f6 = n3;
        float f7 = motionEvent.getY();
        float f8 = motionEvent.getX();
        Object object = f5 == f7 ? 0 : (f5 < f7 ? -1 : 1);
        if (object >= 0) {
            float f11;
            object = false;
            f5 = 0.0f;
            float f12 = f7 - 0.0f;
            Object object2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            if (object2 >= 0 && (object2 = (f11 = f8 - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) >= 0 && (object2 = f8 == f6 ? 0 : (f8 > f6 ? 1 : -1)) <= 0) {
                f7 = this.mDisplaceX;
                float f14 = f7 - 0.0f;
                Object object3 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                if (object3 == false) {
                    motionEvent = this.mContent;
                    motionEvent.callOnClick();
                } else {
                    float f15;
                    float f16;
                    float f17;
                    float f18 = f7 - 0.0f;
                    object = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                    if (object < 0 && (object = (f17 = f8 - (f6 -= (f5 = (float)this.rightEdge))) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1)) >= 0) {
                        motionEvent = this.mRightOption;
                        motionEvent.callOnClick();
                    } else if (object3 > 0 && (f16 = (f15 = f8 - (f5 = (float)(object = (Object)this.leftEdge))) == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1)) <= 0) {
                        motionEvent = this.mLeftOption;
                        motionEvent.callOnClick();
                    } else {
                        this.reset();
                    }
                }
            }
        }
    }

    private boolean tagChildren() {
        int bl2 = this.getChildCount();
        int bl3 = 3;
        View view = null;
        if (bl2 != bl3) {
            return false;
        }
        View view2 = this.getChildAt(0);
        boolean bl4 = true;
        view = this.getChildAt((int)(bl4 ? 1 : 0));
        int n3 = 2;
        View view3 = this.getChildAt(n3);
        View view4 = this.mContent;
        if (view2 != view4 || view != (view4 = this.mLeftOption) || view3 != (view4 = this.mRightOption)) {
            this.mContent = view2;
            this.mLeftOption = view;
            this.mRightOption = view3;
            this.reset();
        }
        return bl4;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mEnabled;
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        View view = this.mContent;
        if (view == null && !(bl2 = this.tagChildren())) {
            return;
        }
        n7 -= n3;
        view = this.mContent;
        n3 = view.getMeasuredWidth();
        n4 = this.mContent.getMeasuredHeight();
        view.layout(0, 0, n3, n4);
        view = this.mLeftOption;
        n3 = view.getMeasuredWidth();
        n4 = this.mContent.getMeasuredHeight();
        view.layout(0, 0, n3, n4);
        view = this.mRightOption;
        n3 = view.getMeasuredWidth();
        n3 = n7 - n3;
        n4 = this.mRightOption.getMeasuredWidth();
        view.layout(n3, 0, n7, n4);
        this.mContent.bringToFront();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean bl2 = motionEvent.getActionMasked();
        boolean bl3 = true;
        if (bl2) {
            if (bl2 != bl3) {
                boolean bl4 = 2 != 0;
                if (bl2 == bl4) {
                    float f7 = motionEvent.getX();
                    this.handleSwype(f7, false);
                }
            } else {
                float f5 = motionEvent.getX();
                this.handleSwype(f5, bl3);
                f5 = 0.0f;
                this.mX = 0.0f;
                boolean bl5 = this.didDisplace;
                if (bl5) {
                    this.didDisplace = false;
                    return false;
                }
                this.processClick(motionEvent);
            }
        } else {
            float f6;
            this.mX = f6 = motionEvent.getX();
        }
        return bl3;
    }

    public void reset() {
        int n3;
        this.mDisplaceX = 0.0f;
        this.leftEdge = n3 = this.mLeftOption.getMeasuredWidth();
        this.rightEdge = n3 = this.mRightOption.getMeasuredWidth();
        this.mContent.setTranslationZ(2.0f);
        this.mContent.animate().setDuration(150L).translationX(0.0f);
    }

    public void setSwypeEnabled(boolean bl2) {
        boolean bl3 = this.mEnabled;
        if (bl3 != bl2 && bl3) {
            this.reset();
        }
        this.mEnabled = bl2;
    }
}

