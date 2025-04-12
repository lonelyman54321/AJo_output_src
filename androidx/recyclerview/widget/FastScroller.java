/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.StateListDrawable
 *  android.view.MotionEvent
 */
package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.FastScroller$1;
import androidx.recyclerview.widget.FastScroller$a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.RecyclerView$y;

public final class FastScroller
extends RecyclerView$n
implements RecyclerView$r {
    public static final int[] C = new int[]{16842919};
    public static final int[] D = new int[0];
    public int A;
    public final Runnable B;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q = 0;
    public int r = 0;
    public final RecyclerView s;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x;
    public final int[] y;
    public final ValueAnimator z;

    public FastScroller(RecyclerView recyclerView, StateListDrawable object, Drawable drawable2, StateListDrawable stateListDrawable, Drawable drawable3, int n3, int n4, int n7) {
        int n8 = 2;
        Object object2 = new int[n8];
        this.x = object2;
        object2 = new int[n8];
        this.y = object2;
        Object object3 = new float[n8];
        object3[0] = 0.0f;
        object3[1] = 1.0f;
        object3 = ValueAnimator.ofFloat((float[])object3);
        this.z = (ValueAnimator)object3;
        this.A = 0;
        FastScroller$1 fastScroller$1 = new FastScroller$1(this);
        this.B = fastScroller$1;
        object2 = new FastScroller$a;
        super(this);
        this.c = object;
        this.d = drawable2;
        this.g = stateListDrawable;
        this.h = drawable3;
        int n10 = object.getIntrinsicWidth();
        this.e = n10 = Math.max(n3, n10);
        n10 = drawable2.getIntrinsicWidth();
        this.f = n10 = Math.max(n3, n10);
        int n14 = stateListDrawable.getIntrinsicWidth();
        this.i = n14 = Math.max(n3, n14);
        n14 = drawable3.getIntrinsicWidth();
        this.j = n14 = Math.max(n3, n14);
        this.a = n4;
        this.b = n7;
        n14 = 255;
        object.setAlpha(n14);
        drawable2.setAlpha(n14);
        super(this);
        object3.addListener((Animator.AnimatorListener)object);
        super(this);
        object3.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        object = this.s;
        if (object != recyclerView) {
            if (object != null) {
                ((RecyclerView)object).removeItemDecoration(this);
                this.s.removeOnItemTouchListener(this);
                this.s.removeOnScrollListener((RecyclerView$s)object2);
                object = this.s;
                object.removeCallbacks((Runnable)fastScroller$1);
            }
            this.s = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.s.addOnItemTouchListener(this);
                recyclerView = this.s;
                recyclerView.addOnScrollListener((RecyclerView$s)object2);
            }
        }
    }

    public static int h(float f5, float f6, int[] nArray, int n3, int n4, int n7) {
        int n8 = nArray[1];
        int n10 = nArray[0];
        if ((n8 -= n10) == 0) {
            return 0;
        }
        f6 -= f5;
        f5 = n8;
        f6 /= f5;
        f5 = n3 -= n7;
        int n14 = (int)(f6 *= f5);
        if ((n4 += n14) < n3 && n4 >= 0) {
            return n14;
        }
        return 0;
    }

    public final void a(RecyclerView recyclerView, MotionEvent object) {
        int n3 = this.v;
        if (n3 == 0) {
            return;
        }
        n3 = object.getAction();
        int n4 = 2;
        float f5 = 2.8E-45f;
        int n7 = 1;
        if (n3 == 0) {
            float f6 = object.getX();
            float f7 = object.getY();
            n3 = (int)(this.g(f6, f7) ? 1 : 0);
            f7 = object.getX();
            float f8 = object.getY();
            boolean bl2 = this.f(f7, f8);
            if (n3 != 0 || bl2) {
                if (bl2) {
                    this.w = n7;
                    n3 = (int)object.getX();
                    this.p = f6 = (float)n3;
                } else if (n3 != 0) {
                    this.w = n4;
                    n3 = (int)object.getY();
                    this.m = f6 = (float)n3;
                }
                this.i(n4);
            }
        } else {
            n3 = object.getAction();
            boolean bl3 = false;
            float f11 = 0.0f;
            if (n3 == n7 && (n3 = this.v) == n4) {
                n3 = 0;
                float f12 = 0.0f;
                this.m = 0.0f;
                this.p = 0.0f;
                this.i(n7);
                this.w = 0;
            } else {
                n3 = object.getAction();
                if (n3 == n4 && (n3 = this.v) == n4) {
                    int n8;
                    int n10;
                    int n14;
                    float f14;
                    float f15;
                    int[] nArray;
                    float f16;
                    this.j();
                    n3 = this.w;
                    float f17 = 2.0f;
                    int n15 = this.b;
                    if (n3 == n7) {
                        int n16;
                        f16 = object.getX();
                        nArray = this.y;
                        nArray[0] = n15;
                        nArray[n7] = n16 = this.q - n15;
                        f15 = n15;
                        f16 = Math.min((float)n16, f16);
                        f14 = Math.abs((float)this.o - (f16 = Math.max(f15, f16)));
                        float f18 = f14 - f17;
                        n16 = (int)(f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1));
                        if (n16 >= 0) {
                            f14 = this.p;
                            n14 = this.s.computeHorizontalScrollRange();
                            RecyclerView recyclerView2 = this.s;
                            n10 = recyclerView2.computeHorizontalScrollOffset();
                            n8 = this.q;
                            f15 = f16;
                            n16 = FastScroller.h(f14, f16, nArray, n14, n10, n8);
                            if (n16 != 0) {
                                recyclerView2 = this.s;
                                recyclerView2.scrollBy(n16, 0);
                            }
                            this.p = f16;
                        }
                    }
                    if ((n3 = this.w) == n4) {
                        int n17;
                        f16 = object.getY();
                        nArray = this.x;
                        nArray[0] = n15;
                        nArray[n7] = n17 = this.r - n15;
                        f5 = n15;
                        f16 = Math.min((float)n17, f16);
                        float f19 = Math.abs((float)this.l - (f16 = Math.max(f5, f16)));
                        float f20 = f19 - f17;
                        n17 = (int)(f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1));
                        if (n17 >= 0) {
                            f14 = this.m;
                            n14 = this.s.computeVerticalScrollRange();
                            object = this.s;
                            n10 = ((RecyclerView)object).computeVerticalScrollOffset();
                            n8 = this.r;
                            f15 = f16;
                            n17 = FastScroller.h(f14, f16, nArray, n14, n10, n8);
                            if (n17 != 0) {
                                RecyclerView recyclerView3 = this.s;
                                recyclerView3.scrollBy(0, n17);
                            }
                            this.m = f16;
                        }
                    }
                }
            }
        }
    }

    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean bl2;
        block7: {
            block8: {
                int n3;
                int n4;
                block6: {
                    n4 = this.v;
                    bl2 = false;
                    n3 = 2;
                    int n7 = 1;
                    if (n4 != n7) break block6;
                    float f5 = motionEvent.getX();
                    float f6 = motionEvent.getY();
                    n4 = (int)(this.g(f5, f6) ? 1 : 0);
                    f6 = motionEvent.getX();
                    float f7 = motionEvent.getY();
                    boolean bl3 = this.f(f6, f7);
                    int n8 = motionEvent.getAction();
                    if (n8 != 0 || n4 == 0 && !bl3) break block7;
                    if (bl3) {
                        this.w = n7;
                        n4 = (int)motionEvent.getX();
                        this.p = f5 = (float)n4;
                    } else if (n4 != 0) {
                        this.w = n3;
                        n4 = (int)motionEvent.getY();
                        this.m = f5 = (float)n4;
                    }
                    this.i(n3);
                    break block8;
                }
                if (n4 != n3) break block7;
            }
            bl2 = true;
        }
        return bl2;
    }

    public final void e(boolean bl2) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean f(float f5, float f6) {
        int n3 = this.r;
        int n4 = this.i;
        float f7 = n3 -= n4;
        float f8 = f6 - f7;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object < 0) return 0 != 0;
        int n7 = this.o;
        n3 = this.n;
        n4 = n3 / 2;
        float f11 = n7 - n4;
        float f12 = f5 - f11;
        if ((n4 = (int)(f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1))) < 0) return 0 != 0;
        f6 = n3 = n3 / 2 + n7;
        float f14 = f5 - f6;
        Object object2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object2 > 0) return 0 != 0;
        return 1 != 0;
    }

    public final boolean g(float f5, float f6) {
        float f7;
        float f8;
        float f11;
        float f12;
        RecyclerView recyclerView = this.s;
        int n3 = recyclerView.getLayoutDirection();
        boolean bl2 = false;
        int n4 = 1;
        if (n3 == n4) {
            n3 = 1;
            f12 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f12 = 0.0f;
            recyclerView = null;
        }
        int n7 = this.e;
        if (n3 != 0 ? (f11 = (f8 = f5 - (f12 = (float)n7)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) <= 0 : (f11 = (f7 = f5 - (f12 = (float)(n3 = this.q - n7))) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) >= 0) {
            float f14;
            f11 = this.l;
            n3 = this.k / 2;
            float f15 = f11 - n3;
            float f16 = f6 - f15;
            n7 = (int)(f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1));
            if (n7 >= 0 && (f11 = (f14 = f6 - (f5 = (float)(n3 += f11))) == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1)) <= 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final void i(int n3) {
        Object object;
        int n4;
        Runnable runnable2 = this.B;
        Object object2 = this.c;
        int n7 = 2;
        if (n3 == n7 && (n4 = this.v) != n7) {
            object = C;
            object2.setState((int[])object);
            object = this.s;
            object.removeCallbacks(runnable2);
        }
        if (n3 == 0) {
            object = this.s;
            object.invalidate();
        } else {
            this.j();
        }
        n4 = this.v;
        if (n4 == n7 && n3 != n7) {
            int[] nArray = D;
            object2.setState(nArray);
            this.s.removeCallbacks(runnable2);
            object2 = this.s;
            n7 = 1200;
            long l2 = n7;
            object2.postDelayed(runnable2, l2);
        } else {
            int n8 = 1;
            if (n3 == n8) {
                this.s.removeCallbacks(runnable2);
                object2 = this.s;
                n7 = 1500;
                long l3 = n7;
                object2.postDelayed(runnable2, l3);
            }
        }
        this.v = n3;
    }

    public final void j() {
        block3: {
            int n3;
            ValueAnimator valueAnimator;
            int n4;
            int n7;
            block2: {
                n7 = 1;
                n4 = this.A;
                valueAnimator = this.z;
                if (n4 == 0) break block2;
                n3 = 3;
                if (n4 != n3) break block3;
                valueAnimator.cancel();
            }
            this.A = n7;
            Float f5 = (Float)valueAnimator.getAnimatedValue();
            float f6 = f5.floatValue();
            n3 = 2;
            float[] fArray = new float[n3];
            fArray[0] = f6;
            n4 = 1065353216;
            fArray[n7] = f6 = 1.0f;
            valueAnimator.setFloatValues(fArray);
            valueAnimator.setDuration(500L);
            long l2 = 0L;
            valueAnimator.setStartDelay(l2);
            valueAnimator.start();
        }
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView$y object) {
        int n3;
        int n4 = this.q;
        object = this.s;
        int n7 = object.getWidth();
        float f5 = 0.0f;
        if (n4 == n7 && (n4 = this.r) == (n7 = (object = this.s).getHeight())) {
            n4 = this.A;
            if (n4 != 0) {
                float f6;
                StateListDrawable stateListDrawable;
                int n8;
                int n10;
                int n14;
                int n15;
                n4 = (int)(this.t ? 1 : 0);
                n7 = 0;
                float f7 = 0.0f;
                object = null;
                if (n4 != 0) {
                    n4 = this.q;
                    n15 = this.e;
                    n4 -= n15;
                    n14 = this.l;
                    n10 = this.k;
                    n8 = n10 / 2;
                    n14 -= n8;
                    stateListDrawable = this.c;
                    stateListDrawable.setBounds(0, 0, n15, n10);
                    n10 = this.r;
                    int n16 = this.f;
                    Drawable drawable2 = this.d;
                    drawable2.setBounds(0, 0, n16, n10);
                    RecyclerView recyclerView2 = this.s;
                    n10 = recyclerView2.getLayoutDirection();
                    n16 = 1;
                    if (n10 == n16) {
                        drawable2.draw(canvas);
                        f6 = n15;
                        float f8 = n14;
                        canvas.translate(f6, f8);
                        f6 = -1.0f;
                        n10 = 1065353216;
                        f8 = 1.0f;
                        canvas.scale(f6, f8);
                        stateListDrawable.draw(canvas);
                        canvas.scale(f6, f8);
                        n4 = -n15;
                        f6 = n4;
                        n15 = -n14;
                        float f11 = n15;
                        canvas.translate(f6, f11);
                    } else {
                        float f12 = n4;
                        canvas.translate(f12, 0.0f);
                        drawable2.draw(canvas);
                        f12 = n14;
                        canvas.translate(0.0f, f12);
                        stateListDrawable.draw(canvas);
                        n4 = -n4;
                        f6 = n4;
                        n15 = -n14;
                        f12 = n15;
                        canvas.translate(f6, f12);
                    }
                }
                if ((n4 = (int)(this.u ? 1 : 0)) != 0) {
                    n4 = this.r;
                    n15 = this.i;
                    n4 -= n15;
                    n14 = this.o;
                    n10 = this.n;
                    n8 = n10 / 2;
                    n14 -= n8;
                    stateListDrawable = this.g;
                    stateListDrawable.setBounds(0, 0, n10, n15);
                    n15 = this.q;
                    n10 = this.j;
                    Drawable drawable3 = this.h;
                    drawable3.setBounds(0, 0, n15, n10);
                    f5 = n4;
                    canvas.translate(0.0f, f5);
                    drawable3.draw(canvas);
                    f5 = n14;
                    canvas.translate(f5, 0.0f);
                    stateListDrawable.draw(canvas);
                    n7 = -n14;
                    f7 = n7;
                    n4 = -n4;
                    f6 = n4;
                    canvas.translate(f7, f6);
                }
            }
            return;
        }
        this.q = n3 = this.s.getWidth();
        this.r = n3 = this.s.getHeight();
        this.i(0);
    }
}

