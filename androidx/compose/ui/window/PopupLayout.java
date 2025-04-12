/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewOutlineProvider
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 */
package androidx.compose.ui.window;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.R$id;
import androidx.compose.ui.R$string;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.window.PopupLayout$a;
import androidx.compose.ui.window.PopupLayout$b;
import androidx.compose.ui.window.PopupLayout$c;
import androidx.compose.ui.window.PopupLayout$d;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class PopupLayout
extends AbstractComposeView {
    public static final PopupLayout$a B = PopupLayout$a.c;
    public final int[] A;
    public Function0 i;
    public Mw2 j;
    public String k;
    public final View l;
    public final iw2_0 m;
    public final WindowManager n;
    public final WindowManager.LayoutParams o;
    public Lw2 p;
    public bp1_0 q;
    public final ParcelableSnapshotMutableState r;
    public final ParcelableSnapshotMutableState s;
    public Vi1 t;
    public final mp0 u;
    public final Rect v;
    public final S83 w;
    public Object x;
    public final ParcelableSnapshotMutableState y;
    public boolean z;

    public PopupLayout() {
        throw null;
    }

    public PopupLayout(Function0 object, Mw2 object2, String object3, View view, Vo0 vo0, Lw2 lw2, UUID uUID) {
        kw2_0 kw2_02;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4) {
        } else {
        }
        Context context = view.getContext();
        int n7 = 6;
        super(context, null, n7, 0);
        this.i = object;
        this.j = object2;
        this.k = object3;
        this.l = view;
        this.m = kw2_02;
        object = view.getContext().getSystemService("window");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.WindowManager");
        object = (WindowManager)object;
        this.n = object;
        object = new WindowManager.LayoutParams();
        ((WindowManager.LayoutParams)object).gravity = 0x800033;
        object2 = this.j;
        int n8 = xi.c(view);
        n3 = (int)(((Mw2)object2).b ? 1 : 0);
        int n10 = ((Mw2)object2).a;
        if (n3 != 0 && n8 != 0) {
            n10 |= 0x2000;
        } else if (n3 != 0 && n8 == 0) {
            n10 &= 0xFFFFDFFF;
        }
        ((WindowManager.LayoutParams)object).flags = n10;
        ((WindowManager.LayoutParams)object).type = 1002;
        object2 = view.getApplicationWindowToken();
        ((WindowManager.LayoutParams)object).token = object2;
        ((WindowManager.LayoutParams)object).width = n10 = -2;
        ((WindowManager.LayoutParams)object).height = n10;
        ((WindowManager.LayoutParams)object).format = -3;
        object2 = view.getContext().getResources();
        n8 = R$string.default_popup_window_title;
        object2 = object2.getString(n8);
        object.setTitle((CharSequence)object2);
        this.o = object;
        this.p = lw2;
        object = bp1_0.Ltr;
        this.q = object;
        object = J83.g(null);
        this.r = object;
        object = J83.g(null);
        this.s = object;
        object = new fw2_0(this);
        object = J83.e((Function0)object);
        this.u = object;
        float f5 = 8;
        object2 = new Rect();
        this.v = object2;
        object3 = new hw2_1(this);
        this.w = object2 = new S83((Function1)object3);
        this.setId(0x1020002);
        object2 = VD3.a(view);
        VD3.b((View)this, (mu1_1)object2);
        object2 = ae3_0.a(view);
        ae3_0.b((View)this, (sD3)object2);
        object2 = ZD3.a(view);
        ZD3.b((View)this, (zs2_1)object2);
        n10 = R$id.compose_view_saveable_id_tag;
        object3 = new StringBuilder("Popup:");
        ((StringBuilder)object3).append(uUID);
        object3 = ((StringBuilder)object3).toString();
        this.setTag(n10, object3);
        this.setClipChildren(false);
        f5 = vo0.J0(f5);
        this.setElevation(f5);
        object = new ViewOutlineProvider();
        this.setOutlineProvider((ViewOutlineProvider)object);
        object = J83.g(A10.a);
        this.y = object;
        object = new int[2];
        this.A = (int[])object;
    }

    private final Function2 getContent() {
        return (Function2)this.y.getValue();
    }

    private final int getDisplayHeight() {
        float f5 = this.getContext().getResources().getDisplayMetrics().density;
        return Math.round((float)this.getContext().getResources().getConfiguration().screenHeightDp * f5);
    }

    private final int getDisplayWidth() {
        float f5 = this.getContext().getResources().getDisplayMetrics().density;
        return Math.round((float)this.getContext().getResources().getConfiguration().screenWidthDp * f5);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    private final zp1 getParentLayoutCoordinates() {
        return (zp1)this.s.getValue();
    }

    public static final /* synthetic */ zp1 h(PopupLayout popupLayout) {
        return popupLayout.getParentLayoutCoordinates();
    }

    private final void setContent(Function2 function2) {
        this.y.setValue(function2);
    }

    private final void setParentLayoutCoordinates(zp1 zp12) {
        this.s.setValue(zp12);
    }

    public final void a(b30_0 object, int n3) {
        Function2 function2;
        object = object.g(-857613600);
        int n4 = n3 & 6;
        int n7 = 2;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x((Object)this) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        if ((n4 &= 3) == n7 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            function2 = this.getContent();
            n7 = 0;
            Integer n8 = 0;
            function2.invoke(object, n8);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = function2 = new PopupLayout$b(this, n3);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent object) {
        int n3;
        int n4 = object.getKeyCode();
        if (n4 == (n3 = 4)) {
            Mw2 mw2 = this.j;
            n4 = (int)(mw2.c ? 1 : 0);
            if (n4) {
                mw2 = this.getKeyDispatcherState();
                if (mw2 == null) {
                    return super.dispatchKeyEvent((KeyEvent)object);
                }
                n4 = object.getAction();
                n3 = 1;
                if (!n4 && !(n4 = object.getRepeatCount())) {
                    mw2 = this.getKeyDispatcherState();
                    if (mw2 != null) {
                        mw2.startTracking((KeyEvent)object, (Object)this);
                    }
                    return n3 != 0;
                }
                n4 = object.getAction();
                if (n4 == n3 && (mw2 = this.getKeyDispatcherState()) != null && (n4 = mw2.isTracking((KeyEvent)object)) && !(n4 = object.isCanceled())) {
                    object = this.i;
                    if (object != null) {
                        object.invoke();
                    }
                    return n3 != 0;
                }
            }
        }
        return super.dispatchKeyEvent((KeyEvent)object);
    }

    /*
     * WARNING - void declaration
     */
    public final void e(boolean bl2, int n3, int n4, int n7, int n8) {
        void var5_8;
        void var4_7;
        int n10;
        void var2_5;
        super.e(bl2, (int)var2_5, n10, (int)var4_7, (int)var5_8);
        Mw2 mw2 = this.j;
        boolean bl3 = mw2.f;
        if (!bl3) {
            int n14;
            boolean bl4 = false;
            mw2 = this.getChildAt(0);
            if (mw2 == null) {
                return;
            }
            WindowManager.LayoutParams layoutParams = this.o;
            layoutParams.width = n10 = mw2.getMeasuredWidth();
            layoutParams.height = n14 = mw2.getMeasuredHeight();
            mw2 = this.n;
            iw2_0 iw2_02 = this.m;
            iw2_02.b((WindowManager)mw2, (View)this, (ViewGroup.LayoutParams)layoutParams);
        }
    }

    public final void f(int n3, int n4) {
        Mw2 mw2 = this.j;
        int n7 = mw2.f;
        if (n7 != 0) {
            super.f(n3, n4);
        } else {
            n3 = this.getDisplayWidth();
            n4 = -1 << -1;
            n3 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)n4);
            n7 = this.getDisplayHeight();
            n4 = View.MeasureSpec.makeMeasureSpec((int)n7, (int)n4);
            super.f(n3, n4);
        }
    }

    public final boolean getCanCalculatePosition() {
        return (Boolean)this.u.getValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.o;
    }

    public final bp1_0 getParentLayoutDirection() {
        return this.q;
    }

    public final bj1 getPopupContentSize-bOM6tXw() {
        return (bj1)this.r.getValue();
    }

    public final Lw2 getPositionProvider() {
        return this.p;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.z;
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.k;
    }

    public final void i(Function0 object, Mw2 object2, String string2, bp1_0 bp1_02) {
        int n3;
        this.i = object;
        this.k = string2;
        object = this.j;
        int n4 = Intrinsics.areEqual(object, object2);
        if (n4 == 0) {
            n4 = ((Mw2)object2).f;
            string2 = this.o;
            if (n4 != 0) {
                object = this.j;
                n4 = ((Mw2)object).f;
                if (n4 == 0) {
                    ((WindowManager.LayoutParams)string2).width = n4 = -2;
                    ((WindowManager.LayoutParams)string2).height = n4;
                }
            }
            this.j = object2;
            object = this.l;
            n4 = xi.c((View)object);
            boolean bl2 = ((Mw2)object2).b;
            n3 = ((Mw2)object2).a;
            if (bl2 && n4 != 0) {
                n3 |= 0x2000;
            } else if (bl2 && n4 == 0) {
                n3 &= 0xFFFFDFFF;
            }
            ((WindowManager.LayoutParams)string2).flags = n3;
            object = this.n;
            object2 = this.m;
            object2.b((WindowManager)object, (View)this, (ViewGroup.LayoutParams)string2);
        }
        object = PopupLayout$c.$EnumSwitchMapping$0;
        n3 = bp1_02.ordinal();
        n4 = object[n3];
        n3 = 1;
        if (n4 != n3) {
            int n7 = 2;
            if (n4 != n7) {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
        } else {
            n3 = 0;
            object2 = null;
        }
        super.setLayoutDirection(n3);
    }

    public final void j() {
        Object object = this.getParentLayoutCoordinates();
        if (object != null) {
            float f5;
            int n3;
            boolean bl2 = object.e();
            if (!bl2) {
                n3 = 0;
                f5 = 0.0f;
                object = null;
            }
            if (object != null) {
                long l2 = object.a();
                long l3 = object.J(0L);
                f5 = e72.d(l3);
                n3 = Math.round(f5);
                float f6 = e72.e(l3);
                int n4 = Math.round(f6);
                l3 = Ti1.a(n3, n4);
                int n7 = 32;
                long l4 = l3 >> n7;
                int n8 = (int)l4;
                long l7 = 0xFFFFFFFFL;
                int n10 = (int)(l3 &= l7);
                long l8 = l2 >> n7;
                n4 = (int)l8 + n8;
                int n14 = (int)(l2 &= l7) + n10;
                object = new Vi1(n8, n10, n4, n14);
                Vi1 vi1 = this.t;
                bl2 = Intrinsics.areEqual(object, vi1);
                if (!bl2) {
                    this.t = object;
                    this.l();
                }
            }
        }
    }

    public final void k(zp1 zp12) {
        this.setParentLayoutCoordinates(zp12);
        this.j();
    }

    public final void l() {
        Vi1 vi1 = this.t;
        if (vi1 == null) {
            return;
        }
        Object object = this.getPopupContentSize-bOM6tXw();
        if (object != null) {
            PopupLayout$d popupLayout$d;
            iw2_0 iw2_02 = this.m;
            Object object2 = this.l;
            Object object3 = this.v;
            iw2_02.a((Rect)object3, (View)object2);
            object2 = xi.a;
            int n3 = object3.left;
            int n4 = object3.top;
            int n7 = object3.right;
            int n8 = object3.bottom;
            long l2 = dj1.a(n7 -= n3, n8 -= n4);
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = 0L;
            long l3 = ((bj1)object).a;
            object = popupLayout$d;
            object2 = ref$LongRef;
            object3 = this;
            long l4 = l2;
            popupLayout$d = new PopupLayout$d(ref$LongRef, this, vi1, l2, l3);
            object = this.w;
            object2 = B;
            ((S83)object).d((Object)this, (Function1)object2, popupLayout$d);
            object = this.o;
            long l7 = ref$LongRef.element;
            int n10 = 32;
            ((WindowManager.LayoutParams)object).x = n7 = (int)(l7 >> n10);
            l4 = 0xFFFFFFFFL;
            ((WindowManager.LayoutParams)object).y = n8 = (int)(l7 &= l4);
            object2 = this.j;
            n3 = (int)(object2.e ? 1 : 0);
            if (n3 != 0) {
                l7 = l2 >> n10;
                n8 = (int)l7;
                long l8 = l2 & l4;
                n3 = (int)l8;
                iw2_02.c((View)this, n8, n3);
            }
            object2 = this.n;
            iw2_02.b((WindowManager)object2, (View)this, (ViewGroup.LayoutParams)object);
        }
    }

    public final void onAttachedToWindow() {
        int n3;
        super.onAttachedToWindow();
        this.w.e();
        Object object = this.j;
        int n4 = ((Mw2)object).c;
        if (n4 != 0 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 33)) {
            object = this.x;
            if (object == null) {
                this.x = object = dm.a(this.i);
            }
            object = this.x;
            dm.b((View)this, object);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Object object = this.w;
        oq_2 oq_22 = ((S83)object).g;
        if (oq_22 != null) {
            oq_22.a();
        }
        ((S83)object).b();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4) {
            object = this.x;
            dm.c((View)this, object);
        }
        this.x = null;
    }

    public final boolean onTouchEvent(MotionEvent object) {
        float f5;
        int n3;
        int n4;
        Mw2 mw2 = this.j;
        boolean bl2 = mw2.d;
        if (!bl2) {
            return super.onTouchEvent((MotionEvent)object);
        }
        bl2 = true;
        if (object != null && (n4 = object.getAction()) == 0) {
            float f6;
            float f7;
            int n7;
            float f8;
            float f11;
            float f12 = object.getX();
            n3 = 0;
            f5 = 0.0f;
            float f14 = f12 - 0.0f;
            n4 = (int)(f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1));
            if (n4 < 0 || (n4 = (int)((f11 = (f12 = object.getX()) - (f8 = (float)(n7 = this.getWidth()))) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1))) >= 0 || (n4 = (int)((f7 = (f12 = object.getY()) - 0.0f) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) < 0 || (n4 = (int)((f6 = (f12 = object.getY()) - (f5 = (float)(n3 = this.getHeight()))) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) >= 0) {
                object = this.i;
                if (object != null) {
                    object.invoke();
                }
                return bl2;
            }
        }
        if (object != null) {
            n4 = object.getAction();
            n3 = 4;
            f5 = 5.6E-45f;
            if (n4 == n3) {
                object = this.i;
                if (object != null) {
                    object.invoke();
                }
                return bl2;
            }
        }
        return super.onTouchEvent((MotionEvent)object);
    }

    public final void setContent(A30 a30, Function2 function2) {
        this.setParentCompositionContext(a30);
        this.setContent(function2);
        this.z = true;
    }

    public void setLayoutDirection(int n3) {
    }

    public final void setParentLayoutDirection(bp1_0 bp1_02) {
        this.q = bp1_02;
    }

    public final void setPopupContentSize-fhxjrPA(bj1 bj12) {
        this.r.setValue(bj12);
    }

    public final void setPositionProvider(Lw2 lw2) {
        this.p = lw2;
    }

    public final void setTestTag(String string2) {
        this.k = string2;
    }
}

