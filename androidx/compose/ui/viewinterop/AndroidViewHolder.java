/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.Region$Op
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 */
package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.R$id;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.viewinterop.AndroidViewHolder$a;
import androidx.compose.ui.viewinterop.AndroidViewHolder$b;
import androidx.compose.ui.viewinterop.AndroidViewHolder$c;
import androidx.compose.ui.viewinterop.AndroidViewHolder$d;
import androidx.compose.ui.viewinterop.AndroidViewHolder$e;
import androidx.compose.ui.viewinterop.AndroidViewHolder$f;
import androidx.compose.ui.viewinterop.AndroidViewHolder$g;
import androidx.compose.ui.viewinterop.AndroidViewHolder$h;
import androidx.compose.ui.viewinterop.AndroidViewHolder$i;
import androidx.compose.ui.viewinterop.AndroidViewHolder$j;
import androidx.compose.ui.viewinterop.AndroidViewHolder$k;
import androidx.compose.ui.viewinterop.AndroidViewHolder$l;
import androidx.compose.ui.viewinterop.AndroidViewHolder$m;
import androidx.compose.ui.viewinterop.AndroidViewHolder$n;
import androidx.compose.ui.viewinterop.AndroidViewHolder$o;
import androidx.compose.ui.viewinterop.AndroidViewHolder$p;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.compose.ui.viewinterop.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

public class AndroidViewHolder
extends ViewGroup
implements xu1_2,
C20,
Tg2 {
    public static final AndroidViewHolder$a w = AndroidViewHolder$a.c;
    public final pU1 a;
    public final View b;
    public final sg2_0 c;
    public Function0 d;
    public boolean e;
    public Function0 f;
    public Function0 g;
    public LP1 h;
    public Function1 i;
    public Vo0 j;
    public Function1 k;
    public mu1_1 l;
    public zs2_1 m;
    public final AndroidViewHolder$o n;
    public final AndroidViewHolder$n o;
    public Function1 p;
    public final int[] q;
    public int r;
    public int s;
    public final yu1_0 t;
    public boolean u;
    public final xp1_0 v;

    public AndroidViewHolder(Context object, A30 object2, int n3, pU1 object3, View object4, sg2_0 object5) {
        super((Context)object);
        int n4;
        this.a = object3;
        this.b = object4;
        this.c = object5;
        if (object2 != null) {
            object = uh3_0.a;
            n4 = R$id.androidx_compose_ui_view_composition_context;
            this.setTag(n4, object2);
        }
        n4 = 0;
        this.setSaveFromParentEnabled(false);
        this.addView((View)object4);
        this.d = object2 = AndroidViewHolder$p.c;
        this.f = object2 = AndroidViewHolder$m.c;
        this.g = object2 = AndroidViewHolder$l.c;
        this.h = object2 = LP1$a.b;
        Object object6 = km3.a();
        this.j = object6;
        object4 = this;
        object4 = (ViewFactoryHolder)this;
        this.n = object6 = new AndroidViewHolder$o((ViewFactoryHolder)object4);
        this.o = object6 = new AndroidViewHolder$n((ViewFactoryHolder)object4);
        object6 = new int[2];
        this.q = (int[])object6;
        this.r = n3 = -1 << -1;
        this.s = n3;
        this.t = object6 = new Object();
        int n7 = 3;
        object6 = new xp1_0(n7, 0, false);
        ((xp1_0)object6).j = this;
        object = androidx.compose.ui.viewinterop.a.a;
        object = androidx.compose.ui.input.nestedscroll.a.a((LP1)object2, (oU1)object, (pU1)object3);
        boolean bl2 = true;
        object3 = AndroidViewHolder$g.c;
        object = CY2.b((LP1)object, bl2, (Function1)object3);
        object2 = new iw2_1();
        ((iw2_1)object2).b = object3 = new jw2_0((ViewFactoryHolder)object4);
        object3 = new Object();
        object5 = ((iw2_1)object2).c;
        if (object5 != null) {
            ((vj2_1)object5).a = null;
        }
        ((iw2_1)object2).c = object3;
        ((vj2_1)object3).a = object2;
        this.setOnRequestDisallowInterceptTouchEvent$ui_release((Function1)object3);
        object = object.then((LP1)object2);
        object2 = new AndroidViewHolder$h((ViewFactoryHolder)object4, (xp1_0)object6, (ViewFactoryHolder)object4);
        object = androidx.compose.ui.draw.a.a((LP1)object, (Function1)object2);
        object2 = new AndroidViewHolder$i((ViewFactoryHolder)object4, (xp1_0)object6);
        object = androidx.compose.ui.layout.c.a((LP1)object, (Function1)object2);
        object2 = this.h.then((LP1)object);
        ((xp1_0)object6).l((LP1)object2);
        this.i = object2 = new AndroidViewHolder$b((xp1_0)object6, (LP1)object);
        object = this.j;
        ((xp1_0)object6).c0((Vo0)object);
        this.k = object = new AndroidViewHolder$c((xp1_0)object6);
        ((xp1_0)object6).F = object = new AndroidViewHolder$d((ViewFactoryHolder)object4, (xp1_0)object6);
        ((xp1_0)object6).G = object = new AndroidViewHolder$e((ViewFactoryHolder)object4);
        object = new AndroidViewHolder$f((ViewFactoryHolder)object4, (xp1_0)object6);
        ((xp1_0)object6).i((al1_1)object);
        this.v = object6;
    }

    public static final /* synthetic */ ch2 b(ViewFactoryHolder viewFactoryHolder) {
        return super.getSnapshotObserver();
    }

    public static final int d(AndroidViewHolder androidViewHolder, int n3, int n4, int n7) {
        androidViewHolder.getClass();
        int n8 = 0x40000000;
        if (n7 < 0 && n3 != n4) {
            n3 = -2;
            int n10 = -1 >>> 1;
            if (n7 == n3 && n4 != n10) {
                n8 = View.MeasureSpec.makeMeasureSpec((int)n4, (int)(-1 << -1));
            } else {
                n3 = -1;
                if (n7 == n3 && n4 != n10) {
                    n8 = View.MeasureSpec.makeMeasureSpec((int)n4, (int)n8);
                } else {
                    androidViewHolder = null;
                    n8 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                }
            }
        } else {
            n3 = kotlin.ranges.f.g(n7, n3, n4);
            n8 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)n8);
        }
        return n8;
    }

    private final ch2 getSnapshotObserver() {
        boolean bl2 = this.isAttachedToWindow();
        if (bl2) {
            return this.c.getSnapshotObserver();
        }
        bh1_1.c("Expected AndroidViewHolder to be attached when observing reads.");
        throw null;
    }

    public final void a() {
        this.g.invoke();
    }

    public final void c() {
        this.f.invoke();
        this.removeAllViewsInLayout();
    }

    public final void g() {
        Object object = this.b;
        ViewParent viewParent = object.getParent();
        if (viewParent != this) {
            this.addView((View)object);
        } else {
            object = this.f;
            object.invoke();
        }
    }

    public final boolean gatherTransparentRegion(Region region) {
        boolean bl2 = true;
        if (region == null) {
            return bl2;
        }
        int[] nArray = this.q;
        this.getLocationInWindow(nArray);
        int n3 = nArray[0];
        int n4 = nArray[bl2];
        int n7 = this.getWidth() + n3;
        int n8 = nArray[bl2];
        int n10 = this.getHeight() + n8;
        Region.Op op2 = Region.Op.DIFFERENCE;
        region.op(n3, n4, n7, n10, op2);
        return bl2;
    }

    public CharSequence getAccessibilityClassName() {
        return this.getClass().getName();
    }

    public final Vo0 getDensity() {
        return this.j;
    }

    public final View getInteropView() {
        return this.b;
    }

    public final xp1_0 getLayoutNode() {
        return this.v;
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams == null) {
            int n3 = -1;
            layoutParams = new ViewGroup.LayoutParams(n3, n3);
        }
        return layoutParams;
    }

    public final mu1_1 getLifecycleOwner() {
        return this.l;
    }

    public final LP1 getModifier() {
        return this.h;
    }

    public int getNestedScrollAxes() {
        yu1_0 yu1_02 = this.t;
        int n3 = yu1_02.a;
        return yu1_02.b | n3;
    }

    public final Function1 getOnDensityChanged$ui_release() {
        return this.k;
    }

    public final Function1 getOnModifierChanged$ui_release() {
        return this.i;
    }

    public final Function1 getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.p;
    }

    public final Function0 getRelease() {
        return this.g;
    }

    public final Function0 getReset() {
        return this.f;
    }

    public final zs2_1 getSavedStateRegistryOwner() {
        return this.m;
    }

    public final Function0 getUpdate() {
        return this.d;
    }

    public final View getView() {
        return this.b;
    }

    public final ViewParent invalidateChildInParent(int[] object, Rect object2) {
        super.invalidateChildInParent((int[])object, object2);
        boolean bl2 = this.u;
        if (bl2) {
            object = new fj_0;
            object2 = this.o;
            ((fj_0)object)((Function0)object2);
            object2 = this.b;
            object2.postOnAnimation((Runnable)object);
        } else {
            object = this.v;
            ((xp1_0)object).G();
        }
        return null;
    }

    public final boolean isNestedScrollingEnabled() {
        return this.b.isNestedScrollingEnabled();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n.invoke();
    }

    public final void onDescendantInvalidated(View object, View object2) {
        super.onDescendantInvalidated((View)object, object2);
        boolean bl2 = this.u;
        if (bl2) {
            object2 = this.o;
            object = new fj_0((Function0)object2);
            object2 = this.b;
            object2.postOnAnimation((Runnable)object);
        } else {
            object = this.v;
            ((xp1_0)object).G();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getSnapshotObserver().a.c(this);
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        this.b.layout(0, 0, n7 -= n3, n8 -= n4);
    }

    public final void onMeasure(int n3, int n4) {
        int n7;
        View view = this.b;
        ViewParent viewParent = view.getParent();
        if (viewParent != this) {
            n3 = View.MeasureSpec.getSize((int)n3);
            n4 = View.MeasureSpec.getSize((int)n4);
            this.setMeasuredDimension(n3, n4);
            return;
        }
        int n8 = view.getVisibility();
        if (n8 == (n7 = 8)) {
            this.setMeasuredDimension(0, 0);
            return;
        }
        view.measure(n3, n4);
        n8 = view.getMeasuredWidth();
        int n10 = view.getMeasuredHeight();
        this.setMeasuredDimension(n8, n10);
        this.r = n3;
        this.s = n4;
    }

    public final boolean onNestedFling(View object, float f5, float f6, boolean bl2) {
        object = this.b;
        boolean bl3 = object.isNestedScrollingEnabled();
        if (!bl3) {
            return false;
        }
        float f7 = -1.0f;
        long l2 = XA3.a(f5 *= f7, f6 *= f7);
        object = this.a.c();
        AndroidViewHolder$j androidViewHolder$j = new AndroidViewHolder$j(bl2, this, l2, null);
        Ae3.d((i90_0)object, null, null, androidViewHolder$j, 3);
        return false;
    }

    public final boolean onNestedPreFling(View view, float f5, float f6) {
        view = this.b;
        boolean bl2 = view.isNestedScrollingEnabled();
        if (!bl2) {
            return false;
        }
        float f7 = -1.0f;
        long l2 = XA3.a(f5 *= f7, f6 *= f7);
        i90_0 i90_02 = this.a.c();
        AndroidViewHolder$k androidViewHolder$k = new AndroidViewHolder$k(this, l2, null);
        Ae3.d(i90_02, null, null, androidViewHolder$k, 3);
        return false;
    }

    public final void onNestedPreScroll(View view, int n3, int n4, int[] nArray, int n7) {
        boolean bl2;
        view = this.b;
        int n8 = view.isNestedScrollingEnabled();
        if (n8 == 0) {
            return;
        }
        float f5 = n3;
        n3 = -1;
        float f6 = n3;
        float f7 = (float)n4 * f6;
        long l2 = h72.a(f5 *= f6, f7);
        n4 = 1;
        f7 = Float.MIN_VALUE;
        n7 = n7 == 0 ? 1 : 2;
        yr3_0 yr3_02 = this.a.a;
        ru1_0 ru1_02 = null;
        if (yr3_02 != null && (bl2 = yr3_02.m)) {
            ru1_02 = yr3_02 = Zr3.b(yr3_02);
            ru1_02 = yr3_02;
        }
        l2 = ru1_02 != null ? ru1_02.onPreScroll-OzD1aCk(l2, n7) : 0L;
        nArray[0] = n7 = qu1_1.a(e72.d(l2));
        nArray[n4] = n8 = qu1_1.a(e72.e(l2));
    }

    public final void onNestedScroll(View object, int n3, int n4, int n7, int n8, int n10) {
        int n14;
        object = this.b;
        int n15 = object.isNestedScrollingEnabled();
        if (n15 == 0) {
            return;
        }
        float f5 = n3;
        n3 = -1;
        float f6 = n3;
        float f7 = (float)n4 * f6;
        long l2 = h72.a(f5 *= f6, f7);
        f5 = (float)n7 * f6;
        f7 = (float)n8 * f6;
        long l3 = h72.a(f5, f7);
        if (n10 == 0) {
            n15 = 1;
            f5 = Float.MIN_VALUE;
            n14 = 1;
        } else {
            n15 = 2;
            f5 = 2.8E-45f;
            n14 = 2;
        }
        object = this.a.a;
        n3 = 0;
        f6 = 0.0f;
        ru1_0 ru1_02 = null;
        if (object != null && (n4 = (int)(object.m ? 1 : 0)) != 0) {
            object = Zr3.b((yr3_0)object);
            ru1_02 = object;
            ru1_02 = (ru1_0)object;
        }
        if (ru1_02 != null) {
            ru1_02.onPostScroll-DzOQY0M(l2, l3, n14);
        }
    }

    public final void onNestedScroll(View view, int n3, int n4, int n7, int n8, int n10, int[] nArray) {
        int n14;
        view = this.b;
        int n15 = (int)(view.isNestedScrollingEnabled() ? 1 : 0);
        if (n15 == 0) {
            return;
        }
        float f5 = n3;
        n3 = -1;
        float f6 = n3;
        float f7 = (float)n4 * f6;
        long l2 = h72.a(f5 *= f6, f7);
        f5 = (float)n7 * f6;
        f7 = (float)n8 * f6;
        long l3 = h72.a(f5, f7);
        n15 = 1;
        f5 = Float.MIN_VALUE;
        if (n10 == 0) {
            n14 = 1;
        } else {
            n3 = 2;
            f6 = 2.8E-45f;
            n14 = 2;
        }
        yr3_0 yr3_02 = this.a.a;
        n4 = 0;
        f7 = 0.0f;
        ru1_0 ru1_02 = null;
        if (yr3_02 != null && (n7 = (int)(yr3_02.m ? 1 : 0)) != 0) {
            ru1_02 = yr3_02 = Zr3.b(yr3_02);
            ru1_02 = yr3_02;
        }
        long l4 = ru1_02 != null ? ru1_02.onPostScroll-DzOQY0M(l2, l3, n14) : 0L;
        nArray[0] = n7 = qu1_1.a(e72.d(l4));
        nArray[n15] = n3 = qu1_1.a(e72.e(l4));
    }

    public final void onNestedScrollAccepted(View view, View object, int n3, int n4) {
        int n7 = 1;
        object = this.t;
        if (n4 == n7) {
            object.b = n3;
        } else {
            object.a = n3;
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int n3, int n4) {
        int n7 = n3 & 2;
        boolean bl2 = true;
        if (n7 == 0 && (n7 = n3 & 1) == 0) {
            bl2 = false;
        }
        return bl2;
    }

    public final void onStopNestedScroll(View object, int n3) {
        object = this.t;
        int n4 = 1;
        if (n3 == n4) {
            object.b = 0;
        } else {
            object.a = 0;
        }
    }

    public final void onWindowVisibilityChanged(int n3) {
        super.onWindowVisibilityChanged(n3);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 < n7 && n3 == 0) {
            xp1_0 xp1_02 = this.v;
            xp1_02.G();
        }
    }

    public final void requestDisallowInterceptTouchEvent(boolean bl2) {
        Function1 function1 = this.p;
        if (function1 != null) {
            Boolean bl3 = bl2;
            function1.invoke(bl3);
        }
        super.requestDisallowInterceptTouchEvent(bl2);
    }

    public final boolean s0() {
        return this.isAttachedToWindow();
    }

    public final void setDensity(Vo0 vo0) {
        Object object = this.j;
        if (vo0 != object) {
            this.j = vo0;
            object = this.k;
            if (object != null) {
                object.invoke(vo0);
            }
        }
    }

    public final void setLifecycleOwner(mu1_1 mu1_12) {
        mu1_1 mu1_13 = this.l;
        if (mu1_12 != mu1_13) {
            this.l = mu1_12;
            VD3.b((View)this, mu1_12);
        }
    }

    public final void setModifier(LP1 lP1) {
        Object object = this.h;
        if (lP1 != object) {
            this.h = lP1;
            object = this.i;
            if (object != null) {
                object.invoke(lP1);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1 function1) {
        this.k = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1 function1) {
        this.i = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1 function1) {
        this.p = function1;
    }

    public final void setRelease(Function0 function0) {
        this.g = function0;
    }

    public final void setReset(Function0 function0) {
        this.f = function0;
    }

    public final void setSavedStateRegistryOwner(zs2_1 zs2_12) {
        zs2_1 zs2_13 = this.m;
        if (zs2_12 != zs2_13) {
            this.m = zs2_12;
            ZD3.b((View)this, zs2_12);
        }
    }

    public final void setUpdate(Function0 function0) {
        this.d = function0;
        this.e = true;
        this.n.invoke();
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}

