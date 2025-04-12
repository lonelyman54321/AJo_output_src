/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 */
package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.helper.widget.Carousel$1;
import androidx.constraintlayout.helper.widget.Carousel$a;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a$b;
import androidx.constraintlayout.motion.widget.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import java.util.ArrayList;

public class Carousel
extends MotionHelper {
    public final Runnable A;
    public final ArrayList n;
    public int o;
    public MotionLayout p;
    public int q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;

    public Carousel(Context object) {
        super((Context)object);
        int n3;
        super();
        this.n = object;
        this.o = 0;
        this.q = n3 = -1;
        this.r = false;
        this.s = n3;
        this.t = n3;
        this.u = n3;
        this.v = n3;
        this.w = 0.9f;
        this.x = 4;
        this.y = 1;
        this.z = 2.0f;
        new Carousel$1(this);
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        ArrayList arrayList;
        this.n = arrayList = new ArrayList();
        this.o = 0;
        this.q = n3 = -1;
        this.r = false;
        this.s = n3;
        this.t = n3;
        this.u = n3;
        this.v = n3;
        this.w = 0.9f;
        this.x = 4;
        this.y = 1;
        this.z = 2.0f;
        new Carousel$1(this);
        this.s(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int n4;
        ArrayList arrayList;
        this.n = arrayList = new ArrayList();
        this.o = 0;
        this.q = n4 = -1;
        this.r = false;
        this.s = n4;
        this.t = n4;
        this.u = n4;
        this.v = n4;
        this.w = 0.9f;
        this.x = 4;
        this.y = 1;
        this.z = 2.0f;
        new Carousel$1(this);
        this.s(context, attributeSet);
    }

    public final void a(int n3) {
        int n4 = this.o;
        int n7 = this.v;
        if (n3 == n7) {
            this.o = ++n4;
        } else {
            n7 = this.u;
            if (n3 == n7) {
                this.o = n4 += -1;
            }
        }
        n3 = (int)(this.r ? 1 : 0);
        n4 = 0;
        if (n3 != 0) {
            throw null;
        }
        throw null;
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.o;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object object = this.getParent();
        boolean bl2 = object instanceof MotionLayout;
        if (bl2) {
            int n3;
            int n4;
            object = (MotionLayout)this.getParent();
            ArrayList arrayList = this.n;
            arrayList.clear();
            for (n4 = 0; n4 < (n3 = this.b); ++n4) {
                n3 = this.a[n4];
                View view = ((ConstraintLayout)((Object)object)).getViewById(n3);
                arrayList.add(view);
            }
            this.p = object;
            int n7 = this.y;
            n4 = 2;
            if (n7 == n4) {
                n7 = this.t;
                object = ((MotionLayout)object).l(n7);
                n7 = 5;
                if (object != null && (object = ((a$b)object).l) != null) {
                    ((b)object).c = n7;
                }
                object = this.p;
                n4 = this.s;
                if ((object = ((MotionLayout)object).l(n4)) != null && (object = ((a$b)object).l) != null) {
                    ((b)object).c = n7;
                }
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.clear();
    }

    public final void s(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            int[] nArray = R$styleable.Carousel;
            context = context.obtainStyledAttributes(attributeSet, nArray);
            int n3 = context.getIndexCount();
            nArray = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                float f5;
                float f6;
                int n4;
                int n7 = context.getIndex(i3);
                if (n7 == (n4 = R$styleable.Carousel_carousel_firstView)) {
                    n4 = this.q;
                    this.q = n7 = context.getResourceId(n7, n4);
                    continue;
                }
                n4 = R$styleable.Carousel_carousel_backwardTransition;
                if (n7 == n4) {
                    n4 = this.s;
                    this.s = n7 = context.getResourceId(n7, n4);
                    continue;
                }
                n4 = R$styleable.Carousel_carousel_forwardTransition;
                if (n7 == n4) {
                    n4 = this.t;
                    this.t = n7 = context.getResourceId(n7, n4);
                    continue;
                }
                n4 = R$styleable.Carousel_carousel_emptyViewsBehavior;
                if (n7 == n4) {
                    n4 = this.x;
                    this.x = n7 = context.getInt(n7, n4);
                    continue;
                }
                n4 = R$styleable.Carousel_carousel_previousState;
                if (n7 == n4) {
                    n4 = this.u;
                    this.u = n7 = context.getResourceId(n7, n4);
                    continue;
                }
                n4 = R$styleable.Carousel_carousel_nextState;
                if (n7 == n4) {
                    n4 = this.v;
                    this.v = n7 = context.getResourceId(n7, n4);
                    continue;
                }
                n4 = R$styleable.Carousel_carousel_touchUp_dampeningFactor;
                if (n7 == n4) {
                    f6 = this.w;
                    this.w = f5 = context.getFloat(n7, f6);
                    continue;
                }
                n4 = R$styleable.Carousel_carousel_touchUpMode;
                if (n7 == n4) {
                    n4 = this.y;
                    this.y = n7 = context.getInt(n7, n4);
                    continue;
                }
                n4 = R$styleable.Carousel_carousel_touchUp_velocityThreshold;
                if (n7 == n4) {
                    f6 = this.z;
                    this.z = f5 = context.getFloat(n7, f6);
                    continue;
                }
                n4 = R$styleable.Carousel_carousel_infinite;
                if (n7 != n4) continue;
                n4 = (int)(this.r ? 1 : 0);
                n7 = (int)(context.getBoolean(n7, n4 != 0) ? 1 : 0);
                this.r = n7;
            }
            context.recycle();
        }
    }

    public void setAdapter(Carousel$a carousel$a) {
    }

    public void setInfinite(boolean bl2) {
        this.r = bl2;
    }
}

