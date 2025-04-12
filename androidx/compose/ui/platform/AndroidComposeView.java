/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Canvas
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Trace
 *  android.util.LongSparseArray
 *  android.util.SparseArray
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.MotionEvent$PointerCoords
 *  android.view.MotionEvent$PointerProperties
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnDragListener
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewStructure
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.view.ViewTreeObserver$OnTouchModeChangeListener
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.animation.AnimationUtils
 *  android.view.autofill.AutofillId
 *  android.view.autofill.AutofillValue
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 */
package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.focus.b;
import androidx.compose.ui.platform.AndroidComposeView$a;
import androidx.compose.ui.platform.AndroidComposeView$b;
import androidx.compose.ui.platform.AndroidComposeView$c;
import androidx.compose.ui.platform.AndroidComposeView$d;
import androidx.compose.ui.platform.AndroidComposeView$f;
import androidx.compose.ui.platform.AndroidComposeView$g;
import androidx.compose.ui.platform.AndroidComposeView$h;
import androidx.compose.ui.platform.AndroidComposeView$i;
import androidx.compose.ui.platform.AndroidComposeView$j;
import androidx.compose.ui.platform.AndroidComposeView$k;
import androidx.compose.ui.platform.AndroidComposeView$l;
import androidx.compose.ui.platform.AndroidComposeView$m;
import androidx.compose.ui.platform.AndroidComposeView$n;
import androidx.compose.ui.platform.AndroidComposeView$o;
import androidx.compose.ui.platform.AndroidComposeView$p;
import androidx.compose.ui.platform.AndroidComposeView$q;
import androidx.compose.ui.platform.AndroidComposeView$r;
import androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1;
import androidx.compose.ui.platform.AndroidComposeView$s;
import androidx.compose.ui.platform.AndroidComposeView$t;
import androidx.compose.ui.platform.AndroidComposeView$u;
import androidx.compose.ui.platform.AndroidViewsHandler;
import androidx.compose.ui.platform.DrawChildContainer;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.platform.ViewLayer$c;
import androidx.compose.ui.platform.ViewLayerContainer;
import androidx.compose.ui.platform.c;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import androidx.emoji2.text.EmojiCompat;
import androidx.lifecycle.i;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class AndroidComposeView
extends ViewGroup
implements sg2_0,
fd3_0,
Ow2,
jm0_1 {
    public static Class R0;
    public static Method S0;
    public final ef_1 A;
    public final ParcelableSnapshotMutableState A0;
    public boolean B;
    public final dt2_1 B0;
    public final pf_0 C;
    public final xh1_0 C0;
    public final ch2 D;
    public final QP1 D0;
    public boolean E;
    public final mj_0 E0;
    public AndroidViewsHandler F;
    public MotionEvent F0;
    public DrawChildContainer G;
    public long G0;
    public c60 H;
    public final hf3_0 H0;
    public boolean I;
    public final WR1 I0;
    public final YK1 J;
    public final AndroidComposeView$resendMotionEventRunnable$1 J0;
    public final bj_1 K;
    public final Uf K0;
    public long L;
    public boolean L0;
    public final int[] M;
    public final AndroidComposeView$r M0;
    public final float[] N;
    public final DJ N0;
    public final float[] O;
    public boolean O0;
    public final float[] P;
    public final ft2_1 P0;
    public long Q;
    public final AndroidComposeView$p Q0;
    public boolean R;
    public long S;
    public boolean T;
    public final ParcelableSnapshotMutableState U;
    public long a;
    public final boolean b;
    public final zp1_2 c;
    public final ParcelableSnapshotMutableState d;
    public final b e;
    public CoroutineContext f;
    public final gs0_0 g;
    public final dg3_0 h;
    public final LP1 i;
    public final LP1 j;
    public final zl_0 k;
    public final mp0 k0;
    public final xp1_0 l;
    public final AndroidComposeView m;
    public final LY2 n;
    public final c o;
    public pg_1 p;
    public Function1 p0;
    public final ze_0 q;
    public final Rf q0;
    public final Hh r;
    public final Sf r0;
    public final bt s;
    public final Tf s0;
    public final ArrayList t;
    public final Bl3 t0;
    public ArrayList u;
    public final Al3 u0;
    public boolean v;
    public final AtomicReference v0;
    public boolean w;
    public final oo0_0 w0;
    public final iq1_0 x;
    public final Eh x0;
    public final ew2_0 y;
    public final ParcelableSnapshotMutableState y0;
    public Function1 z;
    public int z0;

    public AndroidComposeView(Context context, CoroutineContext coroutineContext) {
        int n3;
        long l2;
        Object object;
        fx0_2 fx0_22;
        AndroidComposeView$l androidComposeView$l;
        AndroidComposeView$k androidComposeView$k;
        AndroidComposeView$j androidComposeView$j;
        FunctionReferenceImpl functionReferenceImpl;
        FunctionReferenceImpl functionReferenceImpl2;
        int n4;
        long l3;
        AndroidComposeView androidComposeView = this;
        Context context2 = context;
        super(context);
        this.a = l3 = 9205357640488583168L;
        this.b = n4 = 1;
        Object object2 = new zp1_2();
        this.c = object2;
        object2 = ap1_0.a(context);
        J83.i();
        vf_1 vf_12 = vf_1.b;
        this.d = object2 = J83.f(object2, vf_12);
        Object object3 = new tz0_0();
        Object object4 = new EmptySemanticsElement((tz0_0)object3);
        object2 = functionReferenceImpl2;
        Object object5 = this;
        super(1, this, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
        object2 = functionReferenceImpl;
        super(2, this, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
        object2 = androidComposeView$j;
        super(1, this, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
        object2 = androidComposeView$k;
        super(0, this, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
        object2 = androidComposeView$l;
        super(0, this, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
        int n7 = 0;
        object2 = fx0_22;
        Object object6 = this;
        super((Object)this, AndroidComposeView.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0);
        object2 = object;
        object6 = functionReferenceImpl2;
        object5 = functionReferenceImpl;
        Object object7 = androidComposeView$j;
        Object object8 = androidComposeView$k;
        Object object9 = androidComposeView$l;
        object = new b((AndroidComposeView$h)functionReferenceImpl2, (AndroidComposeView$i)functionReferenceImpl, androidComposeView$j, androidComposeView$k, androidComposeView$l, (AndroidComposeView$m)fx0_22);
        this.e = object;
        fx0_22 = null;
        object2 = functionReferenceImpl2;
        object5 = this;
        super(3, this, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        object = new gs0_0((AndroidComposeView$g)functionReferenceImpl2);
        object2 = coroutineContext;
        this.f = coroutineContext;
        this.g = object;
        this.h = object2 = new dg3_0();
        object2 = new AndroidComposeView$o(this);
        this.i = object2 = androidx.compose.ui.input.key.a.a((Function1)object2);
        this.j = object6 = androidx.compose.ui.input.rotary.a.a(AndroidComposeView$s.c);
        this.k = object5 = new zl_0();
        functionReferenceImpl2 = null;
        int n8 = 3;
        object5 = new xp1_0(n8, 0, false);
        object7 = jp2_0.b;
        ((xp1_0)object5).i((al1_1)object7);
        object7 = this.getDensity();
        ((xp1_0)object5).c0((Vo0)object7);
        object2 = kp1_0.a((LP1)object4, (LP1)object6).then((LP1)object2);
        object6 = this.getFocusOwner().h();
        object2 = object2.then((LP1)object6);
        object6 = ((gs0_0)object).d;
        object2 = object2.then((LP1)object6);
        ((xp1_0)object5).l((LP1)object2);
        this.l = object5;
        this.m = this;
        object6 = this.getRoot();
        this.n = object2 = new LY2((xp1_0)object6, (tz0_0)object3);
        this.o = object3 = new c(this);
        object9 = "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;";
        int n10 = 1;
        object7 = Fg.class;
        object8 = "getContentCaptureSessionCompat";
        object2 = functionReferenceImpl;
        object5 = this;
        super(0, this, (Class)object7, (String)object8, (String)object9, n10);
        this.p = object4 = new pg_1(this, (Function0)((Object)functionReferenceImpl));
        this.q = object2 = new ze_0(context);
        this.r = object2 = new Hh(this);
        this.s = object2 = new bt();
        object2 = new ArrayList();
        this.t = object2;
        this.x = object2 = new iq1_0();
        object6 = this.getRoot();
        this.y = object2 = new ew2_0((xp1_0)object6);
        this.z = object2 = AndroidComposeView$d.c;
        int n14 = AndroidComposeView.G();
        object6 = null;
        if (n14 != 0) {
            object5 = this.getAutofillTree();
            object2 = new ef_1((View)this, (bt)object5);
        } else {
            n14 = 0;
            object2 = null;
        }
        androidComposeView.A = object2;
        androidComposeView.C = object2 = new pf_0(context2);
        object5 = new AndroidComposeView$t(androidComposeView);
        androidComposeView.D = object2 = new ch2((AndroidComposeView$t)object5);
        object5 = this.getRoot();
        androidComposeView.J = object2 = new YK1((xp1_0)object5);
        object5 = ViewConfiguration.get((Context)context);
        androidComposeView.K = object2 = new bj_1((ViewConfiguration)object5);
        n14 = -1 >>> 1;
        androidComposeView.L = l2 = Ti1.a(n14, n14);
        object2 = new int[]{0, 0};
        androidComposeView.M = (int[])object2;
        object2 = QK1.a();
        androidComposeView.N = (float[])object2;
        object5 = QK1.a();
        androidComposeView.O = (float[])object5;
        object5 = QK1.a();
        androidComposeView.P = (float[])object5;
        androidComposeView.Q = -1;
        androidComposeView.S = l2 = 9187343241974906880L;
        androidComposeView.T = n4;
        androidComposeView.U = object5 = J83.g(null);
        object5 = new AndroidComposeView$u(androidComposeView);
        androidComposeView.k0 = object5 = J83.e((Function0)object5);
        androidComposeView.q0 = object5 = new Rf(androidComposeView);
        androidComposeView.r0 = object5 = new Sf(androidComposeView);
        androidComposeView.s0 = object5 = new Tf(androidComposeView);
        object7 = this.getView();
        androidComposeView.t0 = object5 = new Bl3((View)object7, androidComposeView);
        object8 = Fg.a;
        object8.getClass();
        super((zt2_0)object5);
        androidComposeView.u0 = object7;
        object5 = new AtomicReference(null);
        androidComposeView.v0 = object5;
        object7 = this.getTextInputService();
        androidComposeView.w0 = object5 = new oo0_0((Al3)object7);
        androidComposeView.x0 = object5 = new Object();
        object5 = XU0.a(context);
        J83.i();
        androidComposeView.y0 = object5 = J83.f(object5, vf_12);
        object5 = context.getResources().getConfiguration();
        n8 = Build.VERSION.SDK_INT;
        int n15 = 31;
        if (n8 >= n15) {
            n3 = Qf.a((Configuration)object5);
        } else {
            n3 = 0;
            object5 = null;
        }
        androidComposeView.z0 = n3;
        object5 = context.getResources().getConfiguration();
        n3 = object5.getLayoutDirection();
        if (n3 != 0) {
            if (n3 != n4) {
                n3 = 0;
                object5 = null;
            } else {
                object5 = bp1_0.Rtl;
            }
        } else {
            object5 = bp1_0.Ltr;
        }
        if (object5 == null) {
            object5 = bp1_0.Ltr;
        }
        object5 = J83.g(object5);
        androidComposeView.A0 = object5;
        object5 = new dt2_1((View)androidComposeView);
        androidComposeView.B0 = object5;
        n7 = this.isInTouchMode();
        n7 = n7 != 0 ? 1 : 2;
        super(androidComposeView);
        object5 = new xh1_0(n7, (AndroidComposeView$c)fx0_22);
        androidComposeView.C0 = object5;
        object5 = new QP1(androidComposeView);
        androidComposeView.D0 = object5;
        object5 = new mj_0((View)androidComposeView);
        androidComposeView.E0 = object5;
        object5 = new hf3_0();
        androidComposeView.H0 = object5;
        n7 = 16;
        object9 = new Function0[n7];
        object5 = new WR1((Object[])object9);
        androidComposeView.I0 = object5;
        object5 = new AndroidComposeView$resendMotionEventRunnable$1(androidComposeView);
        androidComposeView.J0 = object5;
        object5 = new Uf(androidComposeView);
        androidComposeView.K0 = object5;
        object5 = new AndroidComposeView$r(androidComposeView);
        androidComposeView.M0 = object5;
        n3 = 29;
        if (n8 < n3) {
            super((float[])object2);
        } else {
            super();
        }
        androidComposeView.N0 = object9;
        object2 = androidComposeView.p;
        androidComposeView.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object2);
        androidComposeView.setWillNotDraw(false);
        androidComposeView.setFocusable(n4 != 0);
        n14 = 26;
        if (n8 >= n14) {
            object2 = Eg.a;
            ((Eg)object2).a((View)androidComposeView, n4, false);
        }
        androidComposeView.setFocusableInTouchMode(n4 != 0);
        androidComposeView.setClipChildren(false);
        ViewCompat.s((View)androidComposeView, (a)object3);
        androidComposeView.setOnDragListener((View.OnDragListener)object);
        object2 = this.getRoot();
        ((xp1_0)object2).n(androidComposeView);
        if (n8 >= n3) {
            object2 = pg.a;
            ((pg)object2).a((View)androidComposeView);
        }
        if (n8 >= n15) {
            object6 = new ft2_1();
        }
        androidComposeView.P0 = object6;
        androidComposeView.Q0 = object2 = new AndroidComposeView$p(androidComposeView);
    }

    public static final void B(AndroidComposeView object, int n3, AccessibilityNodeInfo accessibilityNodeInfo, String string2) {
        object = ((AndroidComposeView)object).o;
        String string3 = ((c)object).B;
        boolean bl2 = Intrinsics.areEqual(string2, string3);
        int n4 = -1;
        if (bl2) {
            object = ((c)object).z;
            int n7 = ((Li1)object).c(n3);
            if (n7 != n4) {
                Bundle bundle = accessibilityNodeInfo.getExtras();
                bundle.putInt(string2, n7);
            }
        } else {
            int n8;
            string3 = ((c)object).C;
            bl2 = Intrinsics.areEqual(string2, string3);
            if (bl2 && (n8 = ((Li1)(object = ((c)object).A)).c(n3)) != n4) {
                Bundle bundle = accessibilityNodeInfo.getExtras();
                bundle.putInt(string2, n8);
            }
        }
    }

    public static final /* synthetic */ boolean C(AndroidComposeView androidComposeView, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public static final /* synthetic */ AndroidComposeView$b D(AndroidComposeView androidComposeView) {
        return androidComposeView.get_viewTreeOwners();
    }

    public static final boolean E(AndroidComposeView androidComposeView, LT0 object, aG2 aG22) {
        boolean bl2;
        boolean bl3 = androidComposeView.isFocused();
        if (!bl3 && !(bl3 = androidComposeView.hasFocus())) {
            int n3;
            n3 = object != null && (object = WT0.c(n3 = ((LT0)object).a)) != null ? (Integer)object : 130;
            aG22 = aG22 != null ? cf_2.e(aG22) : null;
            bl2 = super.requestFocus(n3, (Rect)aG22);
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static final /* synthetic */ void F(AndroidComposeView androidComposeView, bp1_0 bp1_02) {
        androidComposeView.setLayoutDirection(bp1_02);
    }

    public static boolean G() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        n3 = n3 >= n4 ? 1 : 0;
        return n3 != 0;
    }

    public static void H(ViewGroup viewGroup) {
        int n3 = viewGroup.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = viewGroup.getChildAt(i3);
            boolean bl2 = object instanceof AndroidComposeView;
            if (bl2) {
                object = (AndroidComposeView)object;
                ((AndroidComposeView)object).v();
                continue;
            }
            bl2 = object instanceof ViewGroup;
            if (!bl2) continue;
            object = (ViewGroup)object;
            AndroidComposeView.H((ViewGroup)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static long I(int n3) {
        long l2;
        long l3;
        int n4 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.getSize((int)n3);
        int n7 = 32;
        int n8 = -1 << -1;
        if (n4 != n8) {
            if (n4 != 0) {
                n8 = 0x40000000;
                if (n4 == n8) {
                    l3 = n3;
                    Mt3$a mt3$a = mt3_0.b;
                    l2 = l3 << n7;
                    return l2 |= l3;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                throw illegalStateException;
            }
            l3 = 0;
            Mt3$a mt3$a = mt3_0.b;
            l2 = l3 << n7;
            n3 = -1 >>> 1;
        } else {
            l3 = 0;
            l2 = l3 << n7;
        }
        l3 = n3;
        return l2 |= l3;
    }

    public static View J(int n3, View view) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 29;
        if (n4 < n7) {
            Object object = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            n7 = 1;
            ((AccessibleObject)object).setAccessible(n7 != 0);
            object = ((Method)object).invoke((Object)view, null);
            Integer n8 = n3;
            n4 = Intrinsics.areEqual(object, n8);
            if (n4 != 0) {
                return view;
            }
            n4 = view instanceof ViewGroup;
            if (n4 != 0) {
                view = (ViewGroup)view;
                n4 = view.getChildCount();
                n8 = null;
                for (n7 = 0; n7 < n4; ++n7) {
                    View view2 = view.getChildAt(n7);
                    if ((view2 = AndroidComposeView.J(n3, view2)) == null) continue;
                    return view2;
                }
            }
        }
        return null;
    }

    public static void L(xp1_0 objectArray) {
        objectArray.H();
        objectArray = objectArray.D();
        int n3 = objectArray.c;
        if (n3 > 0) {
            objectArray = objectArray.a;
            int n4 = 0;
            do {
                xp1_0 xp1_02 = (xp1_0)objectArray[n4];
                AndroidComposeView.L(xp1_02);
            } while (++n4 < n3);
        }
    }

    public static boolean N(MotionEvent motionEvent) {
        nQ1 nQ12;
        int n3;
        float f5 = motionEvent.getX();
        int n4 = Float.isInfinite(f5);
        if (n4 == 0 && (n3 = Float.isNaN(f5)) == 0 && (n4 = (int)(Float.isInfinite(f5 = motionEvent.getY()) ? 1 : 0)) == 0 && (n3 = Float.isNaN(f5)) == 0 && (n4 = (int)(Float.isInfinite(f5 = motionEvent.getRawX()) ? 1 : 0)) == 0 && (n3 = Float.isNaN(f5)) == 0 && (n4 = (int)(Float.isInfinite(f5 = motionEvent.getRawY()) ? 1 : 0)) == 0 && (n3 = Float.isNaN(f5)) == 0) {
            n3 = 0;
            f5 = 0.0f;
            nQ12 = null;
        } else {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        }
        if (n3 == 0) {
            n4 = motionEvent.getPointerCount();
            for (int i3 = 1; i3 < n4; ++i3) {
                f5 = motionEvent.getX(i3);
                int n7 = Float.isInfinite(f5);
                if (n7 == 0 && (n3 = Float.isNaN(f5)) == 0 && (n7 = Float.isInfinite(f5 = motionEvent.getY(i3))) == 0 && (n3 = Float.isNaN(f5)) == 0 && ((n3 = Build.VERSION.SDK_INT) < (n7 = 29) || (n3 = (int)((nQ12 = nQ1.a).a(motionEvent, i3) ? 1 : 0)) != 0)) {
                    n3 = 0;
                    f5 = 0.0f;
                    nQ12 = null;
                } else {
                    n3 = 1;
                    f5 = Float.MIN_VALUE;
                }
                if (n3 != 0) break;
            }
        }
        return n3 != 0;
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final AndroidComposeView$b get_viewTreeOwners() {
        return (AndroidComposeView$b)this.U.getValue();
    }

    private void setDensity(Vo0 vo0) {
        this.d.setValue(vo0);
    }

    private void setFontFamilyResolver(RU0$a rU0$a) {
        this.y0.setValue(rU0$a);
    }

    private void setLayoutDirection(bp1_0 bp1_02) {
        this.A0.setValue((Object)bp1_02);
    }

    private final void set_viewTreeOwners(AndroidComposeView$b androidComposeView$b) {
        this.U.setValue(androidComposeView$b);
    }

    public final /* synthetic */ void A(mu1_1 mu1_12) {
        im0.a(mu1_12);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int K(MotionEvent var1_1) {
        block29: {
            block34: {
                block33: {
                    var2_2 = this;
                    var3_3 = var1_1;
                    var4_6 = this.O;
                    var5_7 = this.J0;
                    this.removeCallbacks((Runnable)var5_7);
                    try {
                        this.Q = var6_8 = AnimationUtils.currentAnimationTimeMillis();
                        var5_7 = this.N0;
                        var5_7.a((View)this, (float[])var4_6);
                        var5_7 = this.P;
                        lk1_0.a((float[])var4_6, (float[])var5_7);
                        var8_9 = var1_1.getX();
                        var9_10 = var1_1.getY();
                        var6_8 = h72.a(var8_9, var9_10);
                        var10_11 = QK1.b((float[])var4_6, var6_8);
                        var9_10 = var1_1.getRawX();
                        var12_12 = e72.d(var10_11);
                        var9_10 -= var12_12;
                    }
                    catch (Throwable var3_5) {
                        break block29;
                    }
                    {
                        var12_12 = var1_1.getRawY();
                        var13_13 = e72.e(var10_11);
                    }
                    {
                        this.S = var10_11 = h72.a(var9_10, var12_12 -= var13_13);
                        this.R = var14_14 = true;
                        this.b(false);
                        var4_6 = "AndroidOwner:onTouch";
                        Trace.beginSection((String)var4_6);
                    }
                    try {
                        var15_15 = var1_1.getActionMasked();
                        var16_16 = this.F0;
                        var17_17 = 3;
                        var19_19 = var16_16 != null && (var18_18 = var16_16.getToolType(0)) == var17_17;
                    }
                    catch (Throwable var3_4) {
                        ** GOTO lbl-1000
                    }
                    var20_20 = 10;
                    var21_21 = var2_2.y;
                    if (var16_16 == null) ** GOTO lbl71
                    {
                        block31: {
                            block30: {
                                var18_18 = var16_16.getSource();
                                if (var18_18 == (var22_22 = var1_1.getSource()) && (var18_18 = var16_16.getToolType(0)) == (var22_22 = var3_3.getToolType(0))) {
                                    var18_18 = 0;
                                    var13_13 = 0.0f;
                                    var4_6 = null;
                                } else {
                                    var18_18 = 1;
                                    var13_13 = 1.4E-45f;
                                }
                                if (var18_18 == 0) break block30;
                                var18_18 = var16_16.getButtonState();
                                if (var18_18 != 0 || (var18_18 = var16_16.getActionMasked()) == 0) ** GOTO lbl-1000
                                var22_22 = 2;
                                var8_9 = 2.8E-45f;
                                if (var18_18 == var22_22) ** GOTO lbl-1000
                                var22_22 = 6;
                                var8_9 = 8.4E-45f;
                                if (var18_18 != var22_22) {
                                    var18_18 = var16_16.getActionMasked();
                                    if (var18_18 != var20_20 && var19_19) {
                                        var23_23 = var16_16.getEventTime();
                                        var25_24 = 1;
                                        var26_25 = 1.4E-45f;
                                        var27_26 = 10;
                                        var9_10 = 1.4E-44f;
                                        var4_6 = this;
                                        var5_7 = var16_16;
                                        this.W(var16_16, var27_26, var23_23, (boolean)var25_24);
                                    }
                                } else lbl-1000:
                                // 3 sources

                                {
                                    var21_21.b();
                                }
                            }
                            if ((var18_18 = var3_3.getToolType(0)) == var17_17) {
                                var18_18 = 1;
                                var13_13 = 1.4E-45f;
                            } else {
                                var18_18 = 0;
                                var13_13 = 0.0f;
                                var4_6 = null;
                            }
                            var25_24 = 9;
                            var26_25 = 1.3E-44f;
                            if (!var19_19 && var18_18 != 0 && var15_15 != var17_17 && var15_15 != var25_24 && (var18_18 = (int)this.O(var1_1)) != 0) {
                                var23_23 = var1_1.getEventTime();
                                var15_15 = 1;
                                var28_27 = 1.4E-45f;
                                var27_26 = 9;
                                var9_10 = 1.3E-44f;
                                var4_6 = this;
                                var5_7 = var1_1;
                                var17_17 = 9;
                                var25_24 = var15_15;
                                var26_25 = var28_27;
                                this.W(var1_1, var27_26, var23_23, (boolean)var15_15);
                            } else {
                                var17_17 = 9;
                            }
                            if (var16_16 != null) {
                                var16_16.recycle();
                            }
                            if ((var4_6 = (Object)var2_2.F0) == null || (var18_18 = var4_6.getAction()) != var20_20) ** GOTO lbl155
                            var4_6 = var2_2.F0;
                            if (var4_6 == null) break block31;
                            var18_18 = var4_6.getPointerId(0);
                            ** GOTO lbl-1000
                        }
                        var18_18 = -1;
                    }
                    var13_13 = 0.0f / 0.0f;
lbl-1000:
                    // 2 sources

                    {
                        var22_22 = var1_1.getAction();
                        var29_28 = var2_2.x;
                    }
                    {
                        block32: {
                            if (var22_22 != var17_17 || (var22_22 = var1_1.getHistorySize()) != 0) break block32;
                            if (var18_18 >= 0) {
                                var5_7 = var29_28.c;
                                var5_7.delete(var18_18);
                                var5_7 = var29_28.b;
                                var5_7.delete(var18_18);
                            }
                            ** GOTO lbl155
                        }
                        var22_22 = var1_1.getAction();
                        if (var22_22 != 0 || (var22_22 = var1_1.getHistorySize()) != 0) ** GOTO lbl155
                        var5_7 = var2_2.F0;
                    }
                    var12_12 = 0.0f / 0.0f;
                    if (var5_7 == null) break block33;
                    {
                        var8_9 = var5_7.getX();
                        ** GOTO lbl-1000
                    }
                }
                var22_22 = 2143289344;
                var8_9 = 0.0f / 0.0f;
lbl-1000:
                // 2 sources

                {
                    var30_29 = var2_2.F0;
                    if (var30_29 != null) {
                        var12_12 = var30_29.getY();
                    }
                    var31_30 = var1_1.getX();
                    var26_25 = var1_1.getY();
                }
                var22_22 = (int)(var8_9 == var31_30 ? 0 : (var8_9 < var31_30 ? -1 : 1));
                if (var22_22 != 0 || (var22_22 = (int)(var12_12 == var26_25 ? 0 : (var12_12 < var26_25 ? -1 : 1))) != 0) break block34;
                var22_22 = 0;
                var8_9 = 0.0f;
                var5_7 = null;
                ** GOTO lbl-1000
            }
            var22_22 = 1;
            var8_9 = 1.4E-45f;
lbl-1000:
            // 2 sources

            {
                var32_31 = var2_2.F0;
                var23_23 = var32_31 != null ? var32_31.getEventTime() : (long)-1;
                var33_32 = var1_1.getEventTime();
                var25_24 = var23_23 == var33_32 ? 0 : (var23_23 < var33_32 ? -1 : 1);
                if (!var25_24) {
                    var14_14 = false;
                }
                if (var22_22 != 0 || var14_14) {
                    if (var18_18 >= 0) {
                        var5_7 = var29_28.c;
                        var5_7.delete(var18_18);
                        var5_7 = var29_28.b;
                        var5_7.delete(var18_18);
                    }
                    var4_6 = var21_21.b;
                    var4_6 = var4_6.b;
                    var4_6 = var4_6.a;
                    var4_6.g();
                }
lbl155:
                // 6 sources

                var4_6 = MotionEvent.obtainNoHistory((MotionEvent)var1_1);
                var2_2.F0 = (MotionEvent)var4_6;
                var35_33 = this.V(var1_1);
            }
            {
                Trace.endSection();
                var2_2.R = false;
                return var35_33;
            }
lbl-1000:
            // 1 sources

            {
                Trace.endSection();
                throw var3_4;
            }
        }
        var2_2.R = false;
        throw var3_5;
    }

    public final void M(xp1_0 objectArray) {
        YK1 yK1 = this.J;
        int n3 = 0;
        yK1.p((xp1_0)objectArray, false);
        objectArray = objectArray.D();
        int n4 = objectArray.c;
        if (n4 > 0) {
            objectArray = objectArray.a;
            do {
                xp1_0 xp1_02 = (xp1_0)objectArray[n3];
                this.M(xp1_02);
            } while (++n3 < n4);
        }
    }

    public final boolean O(MotionEvent motionEvent) {
        float f5;
        int n3;
        float f6;
        float f7;
        float f8;
        float f11;
        float f12 = motionEvent.getX();
        float f14 = motionEvent.getY();
        float f15 = 0.0f - f12;
        Object object = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
        if (object <= 0 && (f11 = (f8 = f12 - (f7 = (float)(object = (Object)this.getWidth()))) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) <= 0 && (f11 = (f6 = 0.0f - f14) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) <= 0 && (n3 = (f5 = f14 - (f12 = (float)(f11 = (float)this.getHeight()))) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) <= 0) {
            n3 = 1;
            f14 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f14 = 0.0f;
            motionEvent = null;
        }
        return n3 != 0;
    }

    public final boolean P(MotionEvent motionEvent) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        float f12;
        float f14;
        int n3;
        int n4;
        int n7;
        int n8 = motionEvent.getPointerCount();
        if (n8 != (n7 = 1)) {
            return n7 != 0;
        }
        MotionEvent motionEvent2 = this.F0;
        if (motionEvent2 != null && (n4 = motionEvent2.getPointerCount()) == (n3 = motionEvent.getPointerCount()) && (n4 = (int)((f14 = (f12 = motionEvent.getRawX()) - (f11 = motionEvent2.getRawX())) == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1))) == 0 && (f8 = (f7 = (f6 = motionEvent.getRawY()) - (f5 = motionEvent2.getRawY())) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) == false) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public final void Q(Qg2 qg2, boolean bl2) {
        ArrayList arrayList = this.t;
        if (!bl2) {
            bl2 = this.v;
            if (!bl2) {
                arrayList.remove(qg2);
                ArrayList arrayList2 = this.u;
                if (arrayList2 != null) {
                    arrayList2.remove(qg2);
                }
            }
        } else {
            bl2 = this.v;
            if (!bl2) {
                arrayList.add(qg2);
            } else {
                ArrayList<Qg2> arrayList3 = this.u;
                if (arrayList3 == null) {
                    this.u = arrayList3 = new ArrayList<Qg2>();
                }
                arrayList3.add(qg2);
            }
        }
    }

    public final aG2 R() {
        Object object;
        boolean bl2 = this.isFocused();
        if (bl2) {
            object = this.getFocusOwner().k();
        } else {
            object = this.findFocus();
            if (object != null) {
                object = WT0.a(object);
            } else {
                bl2 = false;
                object = null;
            }
        }
        return object;
    }

    public final void S() {
        long l2;
        long l3;
        long l4;
        long l7;
        Object object = this.R;
        if (!object && (l7 = (l4 = (l3 = AnimationUtils.currentAnimationTimeMillis()) - (l2 = this.Q)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            boolean bl2;
            this.Q = l3;
            Object object2 = this.N0;
            Object object3 = this.O;
            object2.a((View)this, (float[])object3);
            object2 = this.P;
            lk1_0.a(object3, (float[])object2);
            object2 = this.getParent();
            object3 = this;
            while (bl2 = object2 instanceof ViewGroup) {
                object3 = object2;
                object3 = (View)object2;
                object2 = object3;
                object2 = ((ViewGroup)object3).getParent();
            }
            object2 = this.M;
            object3.getLocationOnScreen((int[])object2);
            bl2 = false;
            Object object4 = object2[0];
            float f5 = (float)object4;
            l7 = 1;
            Object object5 = object2[l7];
            float f6 = (float)object5;
            object3.getLocationInWindow((int[])object2);
            Object object6 = object2[0];
            float f7 = (float)object6;
            object = object2[l7];
            float f8 = (float)object;
            this.S = l3 = h72.a(f5 -= f7, f6 -= f8);
        }
    }

    public final boolean T(Qg2 qg2) {
        int n3;
        int n4;
        DrawChildContainer drawChildContainer = this.G;
        if (drawChildContainer != null && (n4 = ViewLayer.u) == 0 && (n4 = Build.VERSION.SDK_INT) < (n3 = 23)) {
            n4 = 0;
            drawChildContainer = null;
        } else {
            n4 = 1;
        }
        if (n4 != 0) {
            WR1 wR1;
            Object object;
            WeakReference<Qg2> weakReference;
            do {
                object = this.H0;
                weakReference = ((hf3_0)object).b.poll();
                wR1 = ((hf3_0)object).a;
                if (weakReference == null) continue;
                wR1.m(weakReference);
            } while (weakReference != null);
            object = ((hf3_0)object).b;
            weakReference = new WeakReference<Qg2>(qg2, (ReferenceQueue<Qg2>)object);
            wR1.b(weakReference);
        }
        return n4 != 0;
    }

    public final void U(xp1_0 xp1_02) {
        boolean bl2 = this.isLayoutRequested();
        if (!bl2 && (bl2 = this.isAttachedToWindow())) {
            int n3;
            if (xp1_02 != null) {
                Xp1$f xp1$f;
                Object object;
                while (xp1_02 != null && (object = xp1_02.z.r.k) == (xp1$f = Xp1$f.InMeasureBlock)) {
                    bl2 = this.I;
                    if (!bl2) {
                        object = xp1_02.A();
                        if (object == null) break;
                        object = object.y.b;
                        long l2 = ((Ns2)object).d;
                        boolean bl3 = c60.g(l2);
                        if (bl3 && (bl2 = c60.f(l2))) break;
                    }
                    xp1_02 = xp1_02.A();
                }
                if (xp1_02 == (object = this.getRoot())) {
                    this.requestLayout();
                    return;
                }
            }
            if ((n3 = this.getWidth()) != 0 && (n3 = this.getHeight()) != 0) {
                this.invalidate();
            } else {
                this.requestLayout();
            }
        }
    }

    public final int V(MotionEvent motionEvent) {
        Object object;
        Object object2;
        int n3 = this.O0;
        int n4 = 0;
        List list = null;
        if (n3 != 0) {
            this.O0 = false;
            n3 = motionEvent.getMetaState();
            this.h.getClass();
            object2 = new kw2(n3);
            object = dg3_0.b;
            ((h83_0)object).setValue(object2);
        }
        object = this.x;
        object2 = ((iq1_0)object).a(motionEvent, this);
        ew2_0 ew2_02 = this.y;
        if (object2 != null) {
            int n7;
            dw2_1 dw2_12;
            list = ((cw2_0)object2).a;
            int n8 = list.size() + -1;
            if (n8 >= 0) {
                while (true) {
                    int n10 = n8 + -1;
                    dw2_1 dw2_13 = dw2_12 = list.get(n8);
                    dw2_13 = dw2_12;
                    boolean bl2 = dw2_13.e;
                    if (!bl2) {
                        if (n10 < 0) break;
                        n8 = n10;
                        continue;
                    }
                    break;
                }
            } else {
                n8 = 0;
                dw2_12 = null;
            }
            if ((dw2_12 = (dw2_1)dw2_12) != null) {
                long l2;
                this.a = l2 = dw2_12.d;
            }
            n4 = (int)(this.O(motionEvent) ? 1 : 0);
            n4 = ew2_02.a((cw2_0)object2, this, n4 != 0);
            int n14 = motionEvent.getActionMasked();
            if ((n14 == 0 || n14 == (n7 = 5)) && (n14 = n4 & 1) == 0) {
                n14 = motionEvent.getActionIndex();
                int n15 = motionEvent.getPointerId(n14);
                object2 = ((iq1_0)object).c;
                object2.delete(n15);
                object = ((iq1_0)object).b;
                object.delete(n15);
            }
        } else {
            ew2_02.b();
        }
        return n4;
    }

    public final void W(MotionEvent motionEvent, int n3, long l2, boolean bl2) {
        int n4;
        long l3;
        float f5;
        MotionEvent.PointerProperties pointerProperties;
        int n7;
        MotionEvent.PointerCoords pointerCoords;
        MotionEvent.PointerProperties pointerProperties2;
        int n8;
        AndroidComposeView androidComposeView = this;
        MotionEvent motionEvent2 = motionEvent;
        int n10 = motionEvent.getActionMasked();
        int n14 = -1;
        boolean bl3 = false;
        int n15 = 1;
        if (n10 != n15) {
            n8 = 6;
            if (n10 == n8) {
                n14 = motionEvent.getActionIndex();
            }
        } else {
            n10 = 9;
            if (n3 != n10 && n3 != (n10 = 10)) {
                n14 = 0;
            }
        }
        n10 = motionEvent.getPointerCount();
        n8 = n14 >= 0 ? 1 : 0;
        n8 = n10 - n8;
        if (n8 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArray = new MotionEvent.PointerProperties[n8];
        cw2_0 cw2_02 = null;
        for (n10 = 0; n10 < n8; ++n10) {
            pointerPropertiesArray[n10] = pointerProperties2 = new MotionEvent.PointerProperties();
        }
        pointerProperties2 = new MotionEvent.PointerCoords[n8];
        cw2_02 = null;
        for (n10 = 0; n10 < n8; ++n10) {
            pointerCoords = new MotionEvent.PointerCoords();
            pointerProperties2[n10] = pointerCoords;
        }
        cw2_02 = null;
        for (n10 = 0; n10 < n8; ++n10) {
            float f6;
            if (n14 >= 0 && n10 >= n14) {
                n7 = 1;
                f6 = Float.MIN_VALUE;
            } else {
                n7 = 0;
                f6 = 0.0f;
                pointerCoords = null;
            }
            pointerProperties = pointerPropertiesArray[n10];
            motionEvent2.getPointerProperties(n7 += n10, pointerProperties);
            pointerProperties = pointerProperties2[n10];
            motionEvent2.getPointerCoords(n7, (MotionEvent.PointerCoords)pointerProperties);
            f6 = pointerProperties.x;
            f5 = pointerProperties.y;
            l3 = h72.a(f6, f5);
            l3 = androidComposeView.s(l3);
            pointerProperties.x = f6 = e72.d(l3);
            pointerProperties.y = f6 = e72.e(l3);
        }
        if (bl2) {
            n4 = 0;
            pointerProperties = null;
        } else {
            n4 = n10 = motionEvent.getButtonState();
        }
        long l4 = motionEvent.getDownTime();
        l3 = motionEvent.getEventTime();
        bl3 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
        l4 = !bl3 ? l2 : motionEvent.getDownTime();
        n7 = motionEvent.getMetaState();
        f5 = motionEvent.getXPrecision();
        float f7 = motionEvent.getYPrecision();
        int n16 = motionEvent.getDeviceId();
        int n17 = motionEvent.getEdgeFlags();
        int n18 = motionEvent.getSource();
        int n19 = motionEvent.getFlags();
        n15 = n18;
        n18 = n19;
        motionEvent2 = MotionEvent.obtain((long)l4, (long)l2, (int)n3, (int)n8, (MotionEvent.PointerProperties[])pointerPropertiesArray, (MotionEvent.PointerCoords[])pointerProperties2, (int)n7, (int)n4, (float)f5, (float)f7, (int)n16, (int)n17, (int)n15, (int)n19);
        cw2_02 = androidComposeView.x.a(motionEvent2, androidComposeView);
        Intrinsics.checkNotNull(cw2_02);
        androidComposeView.y.a(cw2_02, androidComposeView, true);
        motionEvent2.recycle();
    }

    public final void X() {
        int n3;
        Object object = this.M;
        this.getLocationOnScreen((int[])object);
        long l2 = this.L;
        long l3 = l2 >> 32;
        int n4 = (int)l3;
        long l4 = 0xFFFFFFFFL;
        int n7 = (int)(l2 &= l4);
        boolean bl2 = false;
        int n8 = object[0];
        int n10 = 1;
        if (n4 != n8 || n7 != (n3 = object[n10])) {
            long l7;
            int n14 = object[n10];
            this.L = l7 = Ti1.a(n8, n14);
            n14 = -1 >>> 1;
            if (n4 != n14 && n7 != n14) {
                object = this.getRoot().z.r;
                ((bq1$b)object).u0();
                bl2 = true;
            }
        }
        this.J.a(bl2);
    }

    public final void addView(View view) {
        this.addView(view, -1);
    }

    public final void addView(View view, int n3) {
        Intrinsics.checkNotNull(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = this.generateDefaultLayoutParams();
        }
        this.addViewInLayout(view, n3, layoutParams, true);
    }

    public final void addView(View view, int n3, int n4) {
        ViewGroup.LayoutParams layoutParams = this.generateDefaultLayoutParams();
        layoutParams.width = n3;
        layoutParams.height = n4;
        this.addViewInLayout(view, -1, layoutParams, true);
    }

    public final void addView(View view, int n3, ViewGroup.LayoutParams layoutParams) {
        this.addViewInLayout(view, n3, layoutParams, true);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        this.addViewInLayout(view, -1, layoutParams, true);
    }

    public final void autofill(SparseArray object) {
        Object object2;
        boolean bl2 = AndroidComposeView.G();
        if (bl2 && (object2 = this.A) != null) {
            int n3 = object.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                Ws ws = Ws.a;
                int n4 = object.keyAt(i3);
                Object object3 = ff_0.a(object.get(n4));
                boolean bl3 = ws.d((AutofillValue)object3);
                if (bl3) {
                    ((Object)ws.i((AutofillValue)object3)).toString();
                    object3 = ((ef_1)object2).b.a;
                    Object object4 = n4;
                    object4 = (at)((LinkedHashMap)object3).get(object4);
                    continue;
                }
                n4 = (int)(ws.b((AutofillValue)object3) ? 1 : 0);
                String string2 = "message";
                if (n4 == 0) {
                    n4 = (int)(ws.c((AutofillValue)object3) ? 1 : 0);
                    if (n4 == 0) {
                        n4 = (int)(ws.e((AutofillValue)object3) ? 1 : 0);
                        if (n4 == 0) {
                            continue;
                        }
                        object2 = "An operation is not implemented: b/138604541:  Add onFill() callback for toggle";
                        Intrinsics.checkNotNullParameter(object2, string2);
                        object = new Error((String)object2);
                        throw object;
                    }
                    object2 = "An operation is not implemented: b/138604541: Add onFill() callback for list";
                    Intrinsics.checkNotNullParameter(object2, string2);
                    object = new Error((String)object2);
                    throw object;
                }
                object2 = "An operation is not implemented: b/138604541: Add onFill() callback for date";
                Intrinsics.checkNotNullParameter(object2, string2);
                object = new Error((String)object2);
                throw object;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(boolean bl2) {
        Throwable throwable2;
        block7: {
            YK1 yK1 = this.J;
            Object object = yK1.b;
            boolean bl3 = ((jp0)object).c();
            if (bl3 || (bl3 = ((WR1)(object = yK1.e.a)).l())) {
                Object object2;
                block6: {
                    object = "AndroidOwner:measureAndLayout";
                    Trace.beginSection((String)object);
                    if (bl2) {
                        try {
                            object2 = this.M0;
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    bl2 = false;
                    object2 = null;
                }
                bl2 = yK1.j((AndroidComposeView$r)object2);
                if (bl2) {
                    this.requestLayout();
                }
                bl2 = false;
                object2 = null;
                yK1.a(false);
                boolean bl4 = this.w;
                if (bl4) {
                    yK1 = this.getViewTreeObserver();
                    yK1.dispatchOnGlobalLayout();
                    this.w = false;
                }
                object2 = Unit.a;
                Trace.endSection();
            }
            return;
        }
        Trace.endSection();
        throw throwable2;
    }

    public final long c(long l2) {
        this.S();
        return QK1.b(this.O, l2);
    }

    public final boolean canScrollHorizontally(int n3) {
        long l2 = this.a;
        return this.o.d(l2, n3, false);
    }

    public final boolean canScrollVertically(int n3) {
        long l2 = this.a;
        return this.o.d(l2, n3, true);
    }

    public final void d(Eu$b eu$b) {
        this.J.f.b(eu$b);
        this.U(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void dispatchDraw(Canvas object) {
        int n3;
        Object object2;
        int n4 = 1;
        int n7 = this.isAttachedToWindow();
        if (n7 == 0) {
            object2 = this.getRoot();
            AndroidComposeView.L((xp1_0)object2);
        }
        n7 = Rg2.a;
        this.b(n4 != 0);
        object2 = A83.c;
        // MONITORENTER : object2
        Object object3 = A83.j;
        object3 = ((AtomicReference)object3).get();
        object3 = (f01_0)object3;
        object3 = ((RR1)object3).h;
        if (object3 != null && (n3 = ((ft2_0)object3).c()) == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            object3 = null;
        }
        // MONITOREXIT : object2
        if (n3 != 0) {
            A83.a();
        }
        this.v = n4;
        object2 = this.k;
        object3 = ((zl_0)object2).a;
        Object object4 = ((mf_0)object3).a;
        ((mf_0)object3).a = object;
        xp1_0 xp1_02 = this.getRoot();
        xp1_02.s((iL)object3, null);
        ((zl_0)object2).a.a = object4;
        object2 = this.t;
        n7 = ((ArrayList)object2).isEmpty() ^ n4;
        if (n7 != 0) {
            object2 = this.t;
            n7 = ((ArrayList)object2).size();
            object3 = null;
            for (n3 = 0; n3 < n7; n3 += n4) {
                object4 = (Qg2)this.t.get(n3);
                object4.k();
            }
        }
        if ((n4 = ViewLayer.u) != 0) {
            n4 = object.save();
            n7 = 0;
            object2 = null;
            object.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw((Canvas)object);
            object.restoreToCount(n4);
        }
        this.t.clear();
        this.v = false;
        object = this.u;
        if (object == null) return;
        Intrinsics.checkNotNull(object);
        ArrayList arrayList = this.t;
        arrayList.addAll(object);
        ((ArrayList)object).clear();
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent object) {
        int n3;
        Uf uf;
        int n4 = this.L0;
        int n7 = 0;
        int n8 = 8;
        float f5 = 1.1E-44f;
        if (n4 != 0) {
            uf = this.K0;
            this.removeCallbacks(uf);
            int n10 = object.getActionMasked();
            if (n10 == n8) {
                this.L0 = false;
            } else {
                uf.run();
            }
        }
        if ((n4 = object.getActionMasked()) == n8) {
            n4 = (int)(AndroidComposeView.N((MotionEvent)object) ? 1 : 0);
            if (n4 == 0 && (n4 = (int)(this.isAttachedToWindow() ? 1 : 0)) != 0) {
                float f6 = 5.877472E-39f;
                n4 = (int)(object.isFromSource(0x400000) ? 1 : 0);
                if (n4 != 0) {
                    MP2 mP2;
                    float f7;
                    uf = ViewConfiguration.get((Context)this.getContext());
                    n7 = 26;
                    f5 = -object.getAxisValue(n7);
                    Object object2 = this.getContext();
                    int n14 = Build.VERSION.SDK_INT;
                    if (n14 >= n7) {
                        object2 = OC3.a;
                        f7 = OC3$a.b((ViewConfiguration)uf);
                    } else {
                        f7 = OC3.a((ViewConfiguration)uf, object2);
                    }
                    float f8 = f7 * f5;
                    object2 = this.getContext();
                    f6 = n14 >= n7 ? OC3$a.a((ViewConfiguration)uf) : OC3.a((ViewConfiguration)uf, object2);
                    long l2 = object.getEventTime();
                    int n15 = object.getDeviceId();
                    object2 = mP2;
                    float f11 = f8;
                    f8 = f6 *= f5;
                    mP2 = new MP2(f11, f6, n15, l2);
                    object = this.getFocusOwner();
                    n3 = (int)(object.o(mP2) ? 1 : 0);
                } else {
                    n3 = this.K((MotionEvent)object);
                    n4 = 1;
                    f6 = Float.MIN_VALUE;
                    if ((n3 &= n4) != 0) {
                        n7 = 1;
                    }
                    n3 = n7;
                }
            } else {
                n3 = super.dispatchGenericMotionEvent((MotionEvent)object);
            }
        } else {
            n3 = super.dispatchGenericMotionEvent((MotionEvent)object);
        }
        return n3 != 0;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean bl2;
        block19: {
            int n3;
            Object object;
            int n4;
            Uf uf;
            int n7;
            int n8;
            MotionEvent motionEvent2;
            AndroidComposeView androidComposeView;
            block20: {
                int n10;
                AndroidComposeView androidComposeView2;
                int n14;
                float f5;
                int n15;
                int n16;
                c c2;
                block18: {
                    int n17;
                    float f6;
                    int n18;
                    Object object2;
                    block21: {
                        androidComposeView = this;
                        motionEvent2 = motionEvent;
                        n8 = -1;
                        n7 = this.L0;
                        uf = this.K0;
                        if (n7 != 0) {
                            this.removeCallbacks(uf);
                            uf.run();
                        }
                        n7 = AndroidComposeView.N(motionEvent);
                        bl2 = false;
                        if (n7 != 0 || (n7 = this.isAttachedToWindow()) == 0) break block19;
                        c2 = androidComposeView.o;
                        object2 = c2.d;
                        n16 = object2.isEnabled();
                        n4 = 1;
                        if (n16 != 0 && (n15 = object2.isTouchExplorationEnabled()) != 0) {
                            n15 = 1;
                            f5 = Float.MIN_VALUE;
                        } else {
                            n15 = 0;
                            f5 = 0.0f;
                            object2 = null;
                        }
                        n16 = 10;
                        n18 = 7;
                        f6 = 9.8E-45f;
                        if (n15 == 0) break block20;
                        n15 = motionEvent.getAction();
                        n17 = 256;
                        int n19 = 12;
                        n14 = 128;
                        androidComposeView2 = c2.a;
                        n10 = -1 << -1;
                        if (n15 == n18) break block21;
                        n18 = 9;
                        f6 = 1.3E-44f;
                        if (n15 == n18) break block21;
                        if (n15 == n16) {
                            n8 = c2.b;
                            if (n8 != n10) {
                                if (n8 != n10) {
                                    c2.b = n10;
                                    androidx.compose.ui.platform.c.y(c2, n10, n14, null, n19);
                                    androidx.compose.ui.platform.c.y(c2, n8, n17, null, n19);
                                }
                            } else {
                                object = androidComposeView2.getAndroidViewsHandler$ui_release();
                                object.dispatchGenericMotionEvent(motionEvent2);
                            }
                        }
                        break block20;
                    }
                    f5 = motionEvent.getX();
                    f6 = motionEvent.getY();
                    androidComposeView2.b(n4 != 0);
                    C61 c61 = new C61();
                    Object object3 = androidComposeView2.getRoot();
                    long l2 = h72.a(f5, f6);
                    object2 = xp1_0.J;
                    object2 = ((xp1_0)object3).y;
                    object3 = ((T32)object2).c;
                    Object object4 = w32_0.I;
                    long l3 = ((w32_0)object3).g1(l2, n4 != 0);
                    object2 = ((T32)object2).c;
                    W32$b w32$b = w32_0.O;
                    boolean bl3 = true;
                    boolean bl4 = true;
                    ((w32_0)object2).n1(w32$b, l3, c61, bl3, bl4);
                    n15 = xx_2.h(c61);
                    while (true) {
                        block23: {
                            block22: {
                                if (n8 >= n15) break block22;
                                object3 = c61.a[n15];
                                Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                                object3 = go0.f((LP1$c)object3);
                                object4 = (AndroidViewHolder)androidComposeView2.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(object3);
                                if (object4 == null) break block23;
                            }
                            n10 = -1 << -1;
                            break block18;
                        }
                        object4 = ((xp1_0)object3).y;
                        n17 = 8;
                        n18 = (int)(((T32)object4).d(n17) ? 1 : 0);
                        if (n18 != 0) {
                            n18 = ((xp1_0)object3).b;
                            n18 = c2.u(n18);
                            n16 = (int)(VY2.d((GY2)(object3 = JY2.a((xp1_0)object3, false))) ? 1 : 0);
                            if (n16 != 0) break;
                        }
                        n15 += n8;
                    }
                    n10 = n18;
                }
                object = androidComposeView2.getAndroidViewsHandler$ui_release();
                object.dispatchGenericMotionEvent(motionEvent2);
                n8 = c2.b;
                if (n8 != n10) {
                    c2.b = n10;
                    n15 = 12;
                    f5 = 1.7E-44f;
                    androidx.compose.ui.platform.c.y(c2, n10, n14, null, n15);
                    n16 = 256;
                    androidx.compose.ui.platform.c.y(c2, n8, n16, null, n15);
                }
            }
            n8 = motionEvent.getActionMasked();
            n7 = 7;
            if (n8 != n7) {
                n7 = 10;
                if (n8 == n7 && (n8 = (int)(this.O(motionEvent) ? 1 : 0)) != 0) {
                    n8 = motionEvent2.getToolType(0);
                    if (n8 == (n7 = 3) && (n8 = motionEvent.getButtonState()) != 0) {
                        return false;
                    }
                    object = androidComposeView.F0;
                    if (object != null) {
                        object.recycle();
                    }
                    androidComposeView.F0 = motionEvent2 = MotionEvent.obtainNoHistory((MotionEvent)motionEvent);
                    androidComposeView.L0 = n4;
                    androidComposeView.postDelayed(uf, 8);
                    return false;
                }
            } else {
                n8 = (int)(this.P(motionEvent) ? 1 : 0);
                if (n8 == 0) {
                    return false;
                }
            }
            if ((n3 = this.K(motionEvent) & n4) != 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean bl2;
        int n3 = this.isFocused();
        if (n3 != 0) {
            n3 = keyEvent.getMetaState();
            this.h.getClass();
            Object object = new kw2(n3);
            dg3_0.b.setValue(object);
            bu0_1 bu0_12 = this.getFocusOwner();
            object = au0_1.c;
            n3 = (int)(bu0_12.i(keyEvent, (Function0)object) ? 1 : 0);
            if (n3 == 0 && !(bl2 = super.dispatchKeyEvent(keyEvent))) {
                bl2 = false;
                keyEvent = null;
            } else {
                bl2 = true;
            }
        } else {
            bu0_1 bu0_13 = this.getFocusOwner();
            AndroidComposeView$f androidComposeView$f = new AndroidComposeView$f(this, keyEvent);
            bl2 = bu0_13.i(keyEvent, androidComposeView$f);
        }
        return bl2;
    }

    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        boolean bl2;
        bu0_1 bu0_12;
        boolean bl3 = this.isFocused();
        if (bl3 && (bl3 = (bu0_12 = this.getFocusOwner()).e(keyEvent)) || (bl2 = super.dispatchKeyEventPreIme(keyEvent))) {
            bl2 = true;
        } else {
            bl2 = false;
            keyEvent = null;
        }
        return bl2;
    }

    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        int n3 = 23;
        int n4 = Build.VERSION.SDK_INT;
        if (n3 <= n4 && n4 < (n3 = 28)) {
            ng_0 ng_02 = ng_0.a;
            View view = this.getView();
            ng_02.a(viewStructure, view);
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int n3;
        Uf uf;
        int n4 = this.L0;
        boolean bl2 = false;
        if (n4 != 0) {
            int n7;
            uf = this.K0;
            this.removeCallbacks(uf);
            MotionEvent motionEvent2 = this.F0;
            Intrinsics.checkNotNull(motionEvent2);
            int n8 = motionEvent.getActionMasked();
            if (n8 == 0 && (n8 = motionEvent2.getSource()) == (n7 = motionEvent.getSource()) && (n3 = motionEvent2.getToolType(0)) == (n8 = motionEvent.getToolType(0))) {
                this.L0 = false;
            } else {
                uf.run();
            }
        }
        if ((n4 = AndroidComposeView.N(motionEvent)) == 0 && (n4 = this.isAttachedToWindow()) != 0) {
            n4 = motionEvent.getActionMasked();
            if (n4 == (n3 = 2) && (n4 = (int)(this.P(motionEvent) ? 1 : 0)) == 0) {
                return false;
            }
            int n10 = this.K(motionEvent);
            n4 = n10 & 2;
            n3 = 1;
            if (n4 != 0) {
                uf = this.getParent();
                uf.requestDisallowInterceptTouchEvent(n3 != 0);
            }
            if ((n10 &= n3) != 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final Qg2 e(Function2 function2, Function0 function0, W01 object) {
        int n3;
        int n4;
        Object object2;
        block13: {
            if (object != null) {
                Z01 z01;
                Z01 z012 = z01;
                AndroidComposeView androidComposeView = this;
                Function2 function22 = function2;
                z01 = new Z01((W01)object, null, this, function2, function0);
                return z01;
            }
            do {
                object = this.H0;
                object2 = ((hf3_0)object).b.poll();
                object = ((hf3_0)object).a;
                if (object2 == null) continue;
                ((WR1)object).m(object2);
            } while (object2 != null);
            while ((n4 = ((WR1)object).l()) != 0) {
                n4 = ((WR1)object).c + -1;
                object2 = ((Reference)((WR1)object).n(n4)).get();
                if (object2 == null) continue;
                break block13;
            }
            n4 = 0;
            object2 = null;
        }
        object2 = (Qg2)object2;
        if (object2 != null) {
            object2.e(function2, function0);
            return object2;
        }
        int n7 = this.isHardwareAccelerated();
        n4 = 23;
        if (n7 != 0 && (n7 = Build.VERSION.SDK_INT) >= n4 && n7 != (n3 = 28)) {
            W01 w01 = this.getGraphicsContext().b();
            T01 t01 = this.getGraphicsContext();
            Function2 function23 = function2;
            object = new Z01(w01, t01, this, function2, function0);
            return object;
        }
        n7 = (int)(this.isHardwareAccelerated() ? 1 : 0);
        if (n7 != 0 && (n7 = Build.VERSION.SDK_INT) >= n4 && (n7 = (int)(this.T ? 1 : 0)) != 0) {
            try {
                object = new gj2_0(this, function2, function0);
                return object;
            }
            catch (Throwable throwable) {
                n7 = 0;
                object = null;
                this.T = false;
            }
        }
        if ((object = this.G) == null) {
            n7 = (int)(ViewLayer.t ? 1 : 0);
            if (n7 == 0) {
                object2 = this.getContext();
                object = new View((Context)object2);
                ViewLayer$c.a((View)object);
            }
            if ((n7 = (int)(ViewLayer.u ? 1 : 0)) != 0) {
                object2 = this.getContext();
                object = new DrawChildContainer((Context)object2);
            } else {
                object2 = this.getContext();
                object = new ViewLayerContainer((Context)object2);
            }
            this.G = object;
            n4 = -1;
            this.addView((View)object, n4);
        }
        object2 = this.G;
        Intrinsics.checkNotNull(object2);
        object = new ViewLayer(this, (DrawChildContainer)((Object)object2), function2, function0);
        return object;
    }

    public final void f(float[] fArray) {
        this.S();
        float[] fArray2 = this.O;
        QK1.g(fArray, fArray2);
        float f5 = e72.d(this.S);
        float f6 = e72.e(this.S);
        Object object = Fg.a;
        object = this.N;
        QK1.d((float[])object);
        QK1.i((float[])object, f5, f6);
        Fg.b(fArray, (float[])object);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final View findViewByAccessibilityIdTraversal(int n3) {
        void var4_7;
        block13: {
            String string2;
            Object object;
            boolean bl2 = false;
            int n4 = 1;
            Object var4_4 = null;
            try {
                int n7 = Build.VERSION.SDK_INT;
                int n8 = 29;
                if (n7 < n8) break block13;
                object = View.class;
                string2 = "findViewByAccessibilityIdTraversal";
            }
            catch (NoSuchMethodException noSuchMethodException) {
                return var4_7;
            }
            Class[] classArray = new Class[n4];
            Class<Integer> clazz = Integer.TYPE;
            classArray[0] = clazz;
            object = ((Class)object).getDeclaredMethod(string2, classArray);
            ((AccessibleObject)object).setAccessible(n4 != 0);
            Object object2 = n3;
            Object[] objectArray = new Object[n4];
            objectArray[0] = object2;
            object2 = ((Method)object).invoke((Object)this, objectArray);
            bl2 = object2 instanceof View;
            if (!bl2) return var4_7;
            Object object3 = object2 = (View)object2;
            return var4_7;
        }
        View view = AndroidComposeView.J(n3, (View)this);
        return var4_7;
    }

    public final View focusSearch(View view, int n3) {
        if (view != null) {
            AndroidComposeView$n androidComposeView$n;
            Object object = WT0.a(view);
            Object object2 = WT0.d(n3);
            int n4 = object2 != null ? ((LT0)object2).a : 6;
            bu0_1 bu0_12 = this.getFocusOwner();
            object = bu0_12.a(n4, (aG2)object, androidComposeView$n = AndroidComposeView$n.c);
            boolean bl2 = Intrinsics.areEqual(object, object2 = Boolean.TRUE);
            if (bl2) {
                return this;
            }
        }
        return super.focusSearch(view, n3);
    }

    public final void g(xp1_0 xp1_02) {
        this.J.e.a.b(xp1_02);
        xp1_02.H = true;
        this.U(null);
    }

    public ze_0 getAccessibilityManager() {
        return this.q;
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        AndroidViewsHandler androidViewsHandler = this.F;
        if (androidViewsHandler == null) {
            Context context = this.getContext();
            this.F = androidViewsHandler = new AndroidViewsHandler(context);
            int n3 = -1;
            this.addView((View)androidViewsHandler, n3);
            this.requestLayout();
        }
        androidViewsHandler = this.F;
        Intrinsics.checkNotNull((Object)androidViewsHandler);
        return androidViewsHandler;
    }

    public Is getAutofill() {
        return this.A;
    }

    public bt getAutofillTree() {
        return this.s;
    }

    public pf_0 getClipboardManager() {
        return this.C;
    }

    public final Function1 getConfigurationChangeObserver() {
        return this.z;
    }

    public final pg_1 getContentCaptureManager$ui_release() {
        return this.p;
    }

    public CoroutineContext getCoroutineContext() {
        return this.f;
    }

    public Vo0 getDensity() {
        return (Vo0)this.d.getValue();
    }

    public Ds0 getDragAndDropManager() {
        return this.g;
    }

    public bu0_1 getFocusOwner() {
        return this.e;
    }

    public final void getFocusedRect(Rect rect) {
        Object object = this.R();
        if (object != null) {
            int n3;
            int n4;
            rect.left = n4 = Math.round(((aG2)object).a);
            rect.top = n4 = Math.round(((aG2)object).b);
            float f5 = ((aG2)object).c;
            rect.right = n4 = Math.round(f5);
            float f6 = ((aG2)object).d;
            rect.bottom = n3 = Math.round(f6);
            object = Unit.a;
        } else {
            boolean bl2 = false;
            float f7 = 0.0f;
            object = null;
        }
        if (object == null) {
            super.getFocusedRect(rect);
        }
    }

    public RU0$a getFontFamilyResolver() {
        return (RU0$a)this.y0.getValue();
    }

    public LU0$a getFontLoader() {
        return this.x0;
    }

    public T01 getGraphicsContext() {
        return this.r;
    }

    public t31 getHapticFeedBack() {
        return this.B0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.J.b.c();
    }

    public Wh1 getInputModeManager() {
        return this.C0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.Q;
    }

    public bp1_0 getLayoutDirection() {
        return (bp1_0)((Object)this.A0.getValue());
    }

    public long getMeasureIteration() {
        YK1 yK1 = this.J;
        boolean bl2 = yK1.c;
        if (bl2) {
            return yK1.g;
        }
        bh1_1.b("measureIteration should be only used during the measure/layout pass");
        throw null;
    }

    public QP1 getModifierLocalManager() {
        return this.D0;
    }

    public Ns2$a getPlacementScope() {
        Object object = Os2.a;
        object = new tg2_2(this);
        return object;
    }

    public Wv2 getPointerIconService() {
        return this.Q0;
    }

    public xp1_0 getRoot() {
        return this.l;
    }

    public IP2 getRootForTest() {
        return this.m;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        Object object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        boolean bl2 = false;
        if (n3 >= n4 && (object = this.P0) != null) {
            object = (Boolean)((ft2_1)object).a.getValue();
            bl2 = (Boolean)object;
        }
        return bl2;
    }

    public LY2 getSemanticsOwner() {
        return this.n;
    }

    public zp1_2 getSharedDrawScope() {
        return this.c;
    }

    public boolean getShowLayoutBounds() {
        return this.E;
    }

    public ch2 getSnapshotObserver() {
        return this.D;
    }

    public b93 getSoftwareKeyboardController() {
        return this.w0;
    }

    public Al3 getTextInputService() {
        return this.u0;
    }

    public zm3 getTextToolbar() {
        return this.E0;
    }

    public View getView() {
        return this;
    }

    public NC3 getViewConfiguration() {
        return this.K;
    }

    public final AndroidComposeView$b getViewTreeOwners() {
        return (AndroidComposeView$b)this.k0.getValue();
    }

    public cg3_0 getWindowInfo() {
        return this.h;
    }

    public final void h(xp1_0 xp1_02, boolean bl2) {
        this.J.f(xp1_02, bl2);
    }

    public final void i(xp1_0 object) {
        Np np;
        boolean bl2;
        boolean bl3;
        Object object2 = this.o;
        ((c)object2).v = bl3 = true;
        boolean bl4 = ((c)object2).o();
        if (bl4) {
            ((c)object2).q((xp1_0)object);
        }
        object2 = this.p;
        ((pg_1)object2).h = bl3;
        bl3 = ((pg_1)object2).d();
        if (bl3 && (bl2 = (np = ((pg_1)object2).i).add(object))) {
            object = ((pg_1)object2).j;
            object2 = Unit.a;
            object.j(object2);
        }
    }

    public final void j(xp1_0 xp1_02) {
        YK1 yK1 = this.J;
        jp0 jp02 = yK1.b;
        jp02.a.c(xp1_02);
        jp02.b.c(xp1_02);
        yK1.e.a.m(xp1_02);
        this.B = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void l(xp1_0 object, boolean n3, boolean n4) {
        block16: {
            boolean bl2;
            YK1 yK1;
            block18: {
                block19: {
                    xp1_0 xp1_02;
                    int n7;
                    block17: {
                        int n8;
                        int n10;
                        int n14;
                        int n15;
                        block9: {
                            block13: {
                                Object object2;
                                block15: {
                                    xp1_0 xp1_03;
                                    block14: {
                                        Object object3;
                                        block10: {
                                            block12: {
                                                block11: {
                                                    n15 = 5;
                                                    n14 = 4;
                                                    n10 = 3;
                                                    n8 = 2;
                                                    yK1 = this.J;
                                                    n7 = 1;
                                                    if (n3 == 0) break block9;
                                                    yK1.getClass();
                                                    Xp1$d xp1$d = ((xp1_0)object).z.c;
                                                    int[] nArray = YK1$b.$EnumSwitchMapping$0;
                                                    n3 = xp1$d.ordinal();
                                                    n3 = nArray[n3];
                                                    if (n3 == n7) return;
                                                    if (n3 != n8) {
                                                        if (n3 == n10) return;
                                                        if (n3 != n14 && n3 != n15) {
                                                            object = new NoWhenBranchMatchedException();
                                                            throw object;
                                                        }
                                                    }
                                                    bq1 bq12 = ((xp1_0)object).z;
                                                    n15 = (int)(bq12.g ? 1 : 0);
                                                    if ((n15 != 0 || (n15 = (int)(bq12.h ? 1 : 0)) != 0) && n4 == 0) return;
                                                    bq12.h = n7;
                                                    bq12.i = n7;
                                                    bq12.e = n7;
                                                    bq12.f = n7;
                                                    n3 = (int)(((xp1_0)object).I ? 1 : 0);
                                                    if (n3 != 0) return;
                                                    xp1_03 = ((xp1_0)object).A();
                                                    object3 = ((xp1_0)object).M();
                                                    object2 = Boolean.TRUE;
                                                    n4 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
                                                    object2 = yK1.b;
                                                    if (n4 == 0) break block10;
                                                    if (xp1_03 == null) break block11;
                                                    object3 = xp1_03.z;
                                                    n4 = (int)(((bq1)object3).g ? 1 : 0);
                                                    if (n4 == n7) break block10;
                                                }
                                                if (xp1_03 == null) break block12;
                                                object3 = xp1_03.z;
                                                n4 = (int)(((bq1)object3).h ? 1 : 0);
                                                if (n4 == n7) break block10;
                                            }
                                            ((jp0)object2).a((xp1_0)object, n7 != 0);
                                            break block13;
                                        }
                                        if ((n4 = (int)(((xp1_0)object).L() ? 1 : 0)) == 0) break block13;
                                        if (xp1_03 == null) break block14;
                                        object3 = xp1_03.z;
                                        n4 = (int)(((bq1)object3).e ? 1 : 0);
                                        if (n4 == n7) break block13;
                                    }
                                    if (xp1_03 == null) break block15;
                                    bq1 bq13 = xp1_03.z;
                                    n3 = (int)(bq13.d ? 1 : 0);
                                    if (n3 == n7) break block13;
                                }
                                ((jp0)object2).a((xp1_0)object, false);
                            }
                            boolean bl3 = yK1.d;
                            if (bl3) return;
                            this.U(null);
                            return;
                        }
                        yK1.getClass();
                        Xp1$d xp1$d = ((xp1_0)object).z.c;
                        int[] nArray = YK1$b.$EnumSwitchMapping$0;
                        n3 = xp1$d.ordinal();
                        n3 = nArray[n3];
                        if (n3 == n7 || n3 == n8 || n3 == n10 || n3 == n14) return;
                        if (n3 != n15) break block16;
                        bq1 bq14 = ((xp1_0)object).z;
                        if (n4 == 0) {
                            n4 = (int)(((xp1_0)object).L() ? 1 : 0);
                            bq1$b bq1$b = bq14.r;
                            n15 = (int)(bq1$b.t ? 1 : 0);
                            if (n4 == n15 && ((n4 = (int)(bq14.d ? 1 : 0)) != 0 || (n4 = (int)(bq14.e ? 1 : 0)) != 0)) return;
                        }
                        bq14.e = n7;
                        bq14.f = n7;
                        n4 = (int)(((xp1_0)object).I ? 1 : 0);
                        if (n4 != 0) return;
                        bq1$b bq1$b = bq14.r;
                        n3 = (int)(bq1$b.t ? 1 : 0);
                        if (n3 == 0) return;
                        xp1_02 = ((xp1_0)object).A();
                        if (xp1_02 == null) break block17;
                        bq1 bq15 = xp1_02.z;
                        n4 = (int)(bq15.e ? 1 : 0);
                        if (n4 == n7) break block18;
                    }
                    if (xp1_02 == null) break block19;
                    bq1 bq16 = xp1_02.z;
                    n3 = (int)(bq16.d ? 1 : 0);
                    if (n3 == n7) break block18;
                }
                jp0 jp02 = yK1.b;
                jp02.a((xp1_0)object, false);
            }
            if (bl2 = yK1.d) return;
            this.U(null);
            return;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m(xp1_0 object, long l2) {
        YK1 yK1 = this.J;
        String string2 = "AndroidOwner:measureAndLayout";
        Trace.beginSection((String)string2);
        try {
            yK1.k((xp1_0)object, l2);
            object = yK1.b;
            boolean bl2 = ((jp0)object).c();
            if (!bl2) {
                bl2 = false;
                object = null;
                yK1.a(false);
                boolean bl3 = this.w;
                if (bl3) {
                    ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
                    viewTreeObserver.dispatchOnGlobalLayout();
                    this.w = false;
                }
            }
            object = Unit.a;
            return;
        }
        finally {
            Trace.endSection();
        }
    }

    public final long n(long l2) {
        this.S();
        float f5 = e72.d(l2);
        float f6 = e72.d(this.S);
        float f7 = e72.e(l2);
        float f8 = e72.e(this.S);
        float[] fArray = this.P;
        long l3 = h72.a(f5 -= f6, f7 -= f8);
        return QK1.b(fArray, l3);
    }

    public final long o(long l2) {
        this.S();
        return QK1.b(this.P, l2);
    }

    public final void onAttachedToWindow() {
        Object object;
        block11: {
            block12: {
                Object object2;
                int n3;
                Object object3;
                block10: {
                    mu1_1 mu1_12;
                    super.onAttachedToWindow();
                    object = this.hasWindowFocus();
                    object3 = this.h.a;
                    ((h83_0)object3).setValue(object);
                    object = this.getRoot();
                    this.M((xp1_0)object);
                    AndroidComposeView.L(this.getRoot());
                    object = this.getSnapshotObserver().a;
                    ((S83)object).e();
                    n3 = AndroidComposeView.G();
                    if (n3 != 0 && (object = this.A) != null) {
                        object3 = Ys.a;
                        ((Ys)((Object)object3)).a((ef_1)object);
                    }
                    object = VD3.a((View)this);
                    object3 = ZD3.a((View)this);
                    object2 = this.getViewTreeOwners();
                    if (object2 != null && (object == null || object3 == null || object == (mu1_12 = ((AndroidComposeView$b)object2).a) && object3 == mu1_12)) break block10;
                    if (object == null) break block11;
                    if (object3 == null) break block12;
                    if (object2 != null && (object2 = ((AndroidComposeView$b)object2).a) != null && (object2 = object2.getLifecycle()) != null) {
                        ((i)object2).c(this);
                    }
                    object.getLifecycle().a(this);
                    object2 = new AndroidComposeView$b((mu1_1)object, (zs2_1)object3);
                    this.set_viewTreeOwners((AndroidComposeView$b)object2);
                    object = this.p0;
                    if (object != null) {
                        object.invoke(object2);
                    }
                    this.p0 = null;
                }
                n3 = (n3 = this.isInTouchMode()) != 0 ? 1 : 2;
                object3 = this.C0;
                object3.getClass();
                object2 = new Vh1(n3);
                ((xh1_0)object3).b.setValue(object2);
                object = this.getViewTreeOwners();
                if (object != null && (object = ((AndroidComposeView$b)object).a) != null) {
                    object = object.getLifecycle();
                } else {
                    n3 = 0;
                    object = null;
                }
                if (object != null) {
                    ((i)object).a(this);
                    object3 = this.p;
                    ((i)object).a((lu1)object3);
                    object = this.getViewTreeObserver();
                    object3 = this.q0;
                    object.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object3);
                    object = this.getViewTreeObserver();
                    object3 = this.r0;
                    object.addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)object3);
                    object = this.getViewTreeObserver();
                    object3 = this.s0;
                    object.addOnTouchModeChangeListener((ViewTreeObserver.OnTouchModeChangeListener)object3);
                    n3 = Build.VERSION.SDK_INT;
                    int n4 = 31;
                    if (n3 >= n4) {
                        object = wg_0.a;
                        ((wg_0)object).b((View)this);
                    }
                    return;
                }
                bh1_1.d("No lifecycle owner exists");
                throw null;
            }
            object = new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            throw object;
        }
        object = new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
        throw object;
    }

    public final boolean onCheckIsTextEditor() {
        boolean bl2;
        Object object = (y03)this.v0.get();
        boolean bl3 = false;
        Object object2 = null;
        if (object != null) {
            object = ((y03)object).b;
        } else {
            bl2 = false;
            object = null;
        }
        object = (ti)object;
        if (object == null) {
            return this.t0.d;
        }
        object = (y03)((ti)object).d.get();
        if (object != null) {
            object2 = ((y03)object).b;
        }
        object2 = (Uh1)object2;
        bl2 = false;
        object = null;
        if (object2 != null) {
            bl3 = ((Uh1)object2).e;
            boolean bl4 = true;
            if ((bl3 ^= bl4) == bl4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Object object = ap1_0.a(this.getContext());
        this.setDensity((Vo0)object);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 0;
        int n7 = 31;
        int n8 = n3 >= n7 ? Qf.a(configuration) : 0;
        int n10 = this.z0;
        if (n8 != n10) {
            if (n3 >= n7) {
                n4 = Qf.a(configuration);
            }
            this.z0 = n4;
            object = XU0.a(this.getContext());
            this.setFontFamilyResolver((RU0$a)object);
        }
        this.z.invoke(configuration);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final InputConnection onCreateInputConnection(EditorInfo var1_1) {
        block64: {
            block44: {
                block53: {
                    block63: {
                        block45: {
                            block55: {
                                block62: {
                                    block61: {
                                        block60: {
                                            block59: {
                                                block58: {
                                                    block57: {
                                                        block56: {
                                                            block54: {
                                                                block41: {
                                                                    block52: {
                                                                        block51: {
                                                                            block50: {
                                                                                block49: {
                                                                                    block48: {
                                                                                        block47: {
                                                                                            block46: {
                                                                                                var2_3 = 1;
                                                                                                var3_4 = (y03)this.v0.get();
                                                                                                var4_5 = 0;
                                                                                                var5_6 = null;
                                                                                                var3_4 = var3_4 != null ? var3_4.b : null;
                                                                                                if ((var3_4 = (ti)var3_4) != null) break block44;
                                                                                                var3_4 = this.t0;
                                                                                                var6_7 = var3_4.d;
                                                                                                if (!var6_7) break block45;
                                                                                                var5_6 = var3_4.h;
                                                                                                var7_9 = var3_4.g;
                                                                                                var8_11 = var5_6.e;
                                                                                                var9_13 = Qe1.a(var8_11, var2_3);
                                                                                                var10_14 = var5_6.a;
                                                                                                var11_15 = 0;
                                                                                                var12_16 = 4;
                                                                                                var13_17 = 7;
                                                                                                var14_18 = 5;
                                                                                                var15_19 = 6;
                                                                                                var16_20 = 3;
                                                                                                var17_21 = 2;
                                                                                                if (var9_13 == 0) break block46;
                                                                                                if (var10_14) lbl-1000:
                                                                                                // 2 sources

                                                                                                {
                                                                                                    while (true) {
                                                                                                        var11_15 = 6;
                                                                                                        break block41;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break block41;
                                                                                            }
                                                                                            var9_13 = Qe1.a(var8_11, 0);
                                                                                            if (var9_13 == 0) break block47;
                                                                                            var11_15 = 1;
                                                                                            break block41;
                                                                                        }
                                                                                        var9_13 = Qe1.a(var8_11, var17_21);
                                                                                        if (var9_13 == 0) break block48;
                                                                                        var11_15 = 2;
                                                                                        break block41;
                                                                                    }
                                                                                    var9_13 = Qe1.a(var8_11, var15_19);
                                                                                    if (var9_13 == 0) break block49;
                                                                                    var11_15 = 5;
                                                                                    break block41;
                                                                                }
                                                                                var9_13 = Qe1.a(var8_11, var14_18);
                                                                                if (var9_13 == 0) break block50;
                                                                                var11_15 = 7;
                                                                                break block41;
                                                                            }
                                                                            var9_13 = (int)Qe1.a(var8_11, var16_20);
                                                                            if (var9_13 == 0) break block51;
                                                                            var11_15 = 3;
                                                                            break block41;
                                                                        }
                                                                        var9_13 = (int)Qe1.a(var8_11, var12_16);
                                                                        if (var9_13 == 0) break block52;
                                                                        var11_15 = 4;
                                                                        break block41;
                                                                    }
                                                                    if ((var8_11 = (int)Qe1.a(var8_11, var13_17)) != 0) {
                                                                        ** continue;
                                                                    }
                                                                    break block53;
                                                                }
                                                                var1_1.imeOptions = var11_15;
                                                                var8_11 = var5_6.d;
                                                                var9_13 = zo1_0.a(var8_11, var2_3);
                                                                if (var9_13 == 0) break block54;
                                                                var1_1.inputType = var2_3;
                                                                break block55;
                                                            }
                                                            var9_13 = zo1_0.a(var8_11, var17_21);
                                                            if (var9_13 == 0) break block56;
                                                            var1_1.inputType = var2_3;
                                                            var8_11 = var1_1.imeOptions;
                                                            var9_13 = -1 << -1;
                                                            var1_1.imeOptions = var8_11 |= var9_13;
                                                            break block55;
                                                        }
                                                        var9_13 = zo1_0.a(var8_11, var16_20);
                                                        if (var9_13 == 0) break block57;
                                                        var1_1.inputType = var17_21;
                                                        break block55;
                                                    }
                                                    var9_13 = (int)zo1_0.a(var8_11, var12_16);
                                                    if (var9_13 == 0) break block58;
                                                    var1_1.inputType = var16_20;
                                                    break block55;
                                                }
                                                var9_13 = (int)zo1_0.a(var8_11, var14_18);
                                                if (var9_13 == 0) break block59;
                                                var1_1.inputType = var8_11 = 17;
                                                break block55;
                                            }
                                            var9_13 = (int)zo1_0.a(var8_11, var15_19);
                                            if (var9_13 == 0) break block60;
                                            var1_1.inputType = var8_11 = 33;
                                            break block55;
                                        }
                                        var9_13 = (int)zo1_0.a(var8_11, var13_17);
                                        if (var9_13 == 0) break block61;
                                        var1_1.inputType = var8_11 = 129;
                                        break block55;
                                    }
                                    var9_13 = (int)zo1_0.a(var8_11, 8);
                                    if (var9_13 == 0) break block62;
                                    var1_1.inputType = var8_11 = 18;
                                    break block55;
                                }
                                var9_13 = 9;
                                if ((var8_11 = (int)zo1_0.a(var8_11, var9_13)) == 0) break block63;
                                var1_1.inputType = var8_11 = 8194;
                            }
                            if (!var10_14 && (var9_13 = (var8_11 = var1_1.inputType) & 1) == var2_3) {
                                var9_13 = 131072;
                                var1_1.inputType = var8_11 |= var9_13;
                                var8_11 = (int)Qe1.a(var5_6.e, var2_3);
                                if (var8_11 != 0) {
                                    var8_11 = var1_1.imeOptions;
                                    var9_13 = 0x40000000;
                                    var1_1.imeOptions = var8_11 |= var9_13;
                                }
                            }
                            if ((var8_11 = var1_1.inputType & var2_3) == var2_3) {
                                var8_11 = var5_6.b;
                                if ((var2_3 = (int)xo1_1.a(var8_11, var2_3)) != 0) {
                                    var1_1.inputType = var2_3 = var1_1.inputType | 4096;
                                } else {
                                    var2_3 = (int)xo1_1.a(var8_11, var17_21);
                                    if (var2_3 != 0) {
                                        var1_1.inputType = var2_3 = var1_1.inputType | 8192;
                                    } else {
                                        var2_3 = (int)xo1_1.a(var8_11, var16_20);
                                        if (var2_3 != 0) {
                                            var1_1.inputType = var2_3 = var1_1.inputType | 16384;
                                        }
                                    }
                                }
                                var2_3 = (int)var5_6.c;
                                if (var2_3 != 0) {
                                    var2_3 = var1_1.inputType;
                                    var4_5 = 32768;
                                    var1_1.inputType = var2_3 |= var4_5;
                                }
                            }
                            var18_22 = var7_9.b;
                            var2_3 = mm3.c;
                            var1_1.initialSelStart = var2_3 = (int)(var18_22 >> 32);
                            var20_23 = 0xFFFFFFFFL;
                            var1_1.initialSelEnd = var2_3 = (int)(var18_22 &= var20_23);
                            var22_24 = var7_9.a.a;
                            ky0_0.a((EditorInfo)var1_1, (CharSequence)var22_24);
                            var2_3 = var1_1.imeOptions;
                            var4_5 = 0x2000000;
                            var1_1.imeOptions = var2_3 |= var4_5;
                            var2_3 = (int)EmojiCompat.c();
                            if (var2_3 != 0) {
                                var22_24 = EmojiCompat.a();
                                var22_24.i((EditorInfo)var1_1);
                            }
                            var1_1 = var3_4.g;
                            var2_3 = (int)var3_4.h.c;
                            var5_6 = new Dl3((Bl3)var3_4);
                            var7_9 = new YF2((ql3_0)var1_1, (Dl3)var5_6, (boolean)var2_3);
                            var1_1 = var3_4.i;
                            var22_24 = new WeakReference<Object>(var7_9);
                            var1_1.add(var22_24);
                            var5_6 = var7_9;
                        }
                        return var5_6;
                    }
                    var22_25 = "Invalid Keyboard Type".toString();
                    var1_1 = new IllegalStateException(var22_25);
                    throw var1_1;
                }
                var22_26 = "invalid ImeAction".toString();
                var1_1 = new IllegalStateException(var22_26);
                throw var1_1;
            }
            var22_27 = (y03)var3_4.d.get();
            if (var22_27 != null) {
                var22_27 = var22_27.b;
            } else {
                var2_3 = 0;
                var22_27 = null;
            }
            var22_27 = (Uh1)var22_27;
            if (var22_27 == null) break block64;
            var3_4 = var22_27.c;
            synchronized (var3_4) {
                block43: {
                    block42: {
                        var6_8 = var22_27.e;
                        if (var6_8 == 0) break block42;
                        break block64;
                    }
                    var5_6 = var22_27.a;
                    var1_1 = var5_6.a((EditorInfo)var1_1);
                    var5_6 = new Th1((Uh1)var22_27);
                    var6_8 = Build.VERSION.SDK_INT;
                    var8_12 = 34;
                    if (var6_8 < var8_12) break block43;
                    var7_10 /* !! */  = new M52((InputConnection)var1_1, (Th1)var5_6);
lbl197:
                    // 4 sources

                    while (true) {
                        var5_6 = var7_10 /* !! */ ;
                        ** GOTO lbl214
                        break;
                    }
                }
                var8_12 = 25;
                if (var6_8 >= var8_12) {
                    var7_10 /* !! */  = new M52((InputConnection)var1_1, (Th1)var5_6);
                }
                var8_12 = 24;
                if (var6_8 >= var8_12) {
                    var7_10 /* !! */  = new M52((InputConnection)var1_1, (Th1)var5_6);
                }
                var7_10 /* !! */  = new M52((InputConnection)var1_1, (Th1)var5_6);
                ** continue;
lbl214:
                // 1 sources

                var1_1 = var22_27.d;
                var22_27 = new Object(var7_10 /* !! */ );
                var1_1.b(var22_27);
            }
        }
        return var5_6;
    }

    public final void onCreateVirtualViewTranslationRequests(long[] lArray, int[] nArray, Consumer consumer) {
        pg_1 pg_12 = this.p;
        pg_12.getClass();
        Pg$b.a.b(pg_12, lArray, nArray, consumer);
    }

    public final void onDestroy(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public final void onDetachedFromWindow() {
        int n3;
        super.onDetachedFromWindow();
        Object object = this.getSnapshotObserver().a;
        Object object2 = ((S83)object).g;
        if (object2 != null) {
            ((oq_2)object2).a();
        }
        ((S83)object).b();
        object = this.getViewTreeOwners();
        int n4 = 0;
        object2 = null;
        if (object != null && (object = ((AndroidComposeView$b)object).a) != null) {
            object = object.getLifecycle();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object2 = this.p;
            ((i)object).c((lu1)object2);
            ((i)object).c(this);
            n3 = AndroidComposeView.G();
            if (n3 != 0 && (object = this.A) != null) {
                object2 = Ys.a;
                ((Ys)((Object)object2)).b((ef_1)object);
            }
            object = this.getViewTreeObserver();
            object2 = this.q0;
            object.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object2);
            object = this.getViewTreeObserver();
            object2 = this.r0;
            object.removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)object2);
            object = this.getViewTreeObserver();
            object2 = this.s0;
            object.removeOnTouchModeChangeListener((ViewTreeObserver.OnTouchModeChangeListener)object2);
            n3 = Build.VERSION.SDK_INT;
            n4 = 31;
            if (n3 >= n4) {
                object = wg_0.a;
                ((wg_0)object).a((View)this);
            }
            return;
        }
        bh1_1.d("No lifecycle owner exists");
        throw null;
    }

    public final void onDraw(Canvas canvas) {
    }

    public final void onFocusChanged(boolean bl2, int n3, Rect rect) {
        super.onFocusChanged(bl2, n3, rect);
        if (!bl2 && !(bl2 = this.hasFocus())) {
            bu0_1 bu0_12 = this.getFocusOwner();
            bu0_12.n();
        }
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        Object object = this.M0;
        YK1 yK1 = this.J;
        yK1.j((AndroidComposeView$r)object);
        this.H = null;
        this.X();
        object = this.F;
        if (object != null) {
            object = this.getAndroidViewsHandler$ui_release();
            n7 -= n3;
            n3 = 0;
            object.layout(0, 0, n7, n8 -= n4);
        }
    }

    /*
     * Exception decompiling
     */
    public final void onMeasure(int var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 46->50)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void onProvideAutofillVirtualStructure(ViewStructure object, int n3) {
        ef_1 ef_12;
        n3 = (int)(AndroidComposeView.G() ? 1 : 0);
        if (n3 != 0 && object != null && (ef_12 = this.A) != null) {
            boolean bl2;
            Ns ns = Ns.a;
            Object object2 = ef_12.b;
            LinkedHashMap linkedHashMap = ((bt)object2).a;
            int n4 = linkedHashMap.size();
            n4 = ns.a((ViewStructure)object, n4);
            object2 = ((bt)object2).a.entrySet().iterator();
            while (bl2 = object2.hasNext()) {
                Object object3 = (Map.Entry)object2.next();
                Number number = (Number)object3.getKey();
                int n7 = number.intValue();
                Object object4 = object3 = object3.getValue();
                object4 = (at)object3;
                ViewStructure viewStructure = ns.b((ViewStructure)object, n4);
                if (viewStructure == null) {
                    ++n4;
                    continue;
                }
                Ws ws = Ws.a;
                object = ws.a((ViewStructure)object);
                Intrinsics.checkNotNull(object);
                ws.g(viewStructure, (AutofillId)object, n7);
                object3 = ef_12.a.getContext().getPackageName();
                object2 = viewStructure;
                n4 = n7;
                ns.d(viewStructure, n7, (String)object3, null, null);
                ws.h(viewStructure, 1);
                object4.getClass();
                throw null;
            }
        }
    }

    public final void onRtlPropertiesChanged(int n3) {
        int n4 = this.b;
        if (n4 != 0) {
            bp1_0 bp1_02;
            if (n3 != 0) {
                n4 = 1;
                if (n3 != n4) {
                    n3 = 0;
                    bp1_02 = null;
                } else {
                    bp1_02 = bp1_0.Rtl;
                }
            } else {
                bp1_02 = bp1_0.Ltr;
            }
            if (bp1_02 == null) {
                bp1_02 = bp1_0.Ltr;
            }
            this.setLayoutDirection(bp1_02);
        }
    }

    public final void onScrollCaptureSearch(Rect object, Point object2, Consumer consumer) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        if (n3 >= n4 && (object = this.P0) != null) {
            object2 = this.getSemanticsOwner();
            CoroutineContext coroutineContext = this.getCoroutineContext();
            ((ft2_1)object).c((View)this, (LY2)object2, coroutineContext, consumer);
        }
    }

    public final /* synthetic */ void onStart(mu1_1 mu1_12) {
        im0.c(mu1_12);
    }

    public final void onStop(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        pg_1 pg_12 = this.p;
        pg_12.getClass();
        Pg$b.a.c(pg_12, longSparseArray);
    }

    public final void onWindowFocusChanged(boolean bl2) {
        boolean bl3;
        Boolean bl4 = bl2;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.h.a;
        parcelableSnapshotMutableState.setValue(bl4);
        this.O0 = bl3 = true;
        super.onWindowFocusChanged(bl2);
        if (bl2) {
            bl2 = AndroidComposeView$a.a();
            bl3 = this.getShowLayoutBounds();
            if (bl3 != bl2) {
                this.setShowLayoutBounds(bl2);
                this.r();
            }
        }
    }

    public final void p(mu1_1 mu1_12) {
        boolean bl2 = AndroidComposeView$a.a();
        this.setShowLayoutBounds(bl2);
    }

    /*
     * Unable to fully structure code
     */
    public final j90_0 q(Function2 var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof xf_0;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (xf_0)var2_2;
        var5_5 = var4_4.c;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.c = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new xf_0(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.c;
        var7_7 = 1;
        if (var6_6 != 0) {
            if (var6_6 != var7_7) {
                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1;
            }
            vl2_2.b(var2_2);
        } else {
            vl2_2.b(var2_2);
            var2_2 = this.v0;
            var9_9 = new yf_0(this);
            var4_4.c = var7_7;
            var10_10 = new z03_0(var9_9, (AtomicReference)var2_2, (Function2)var1_1, null);
            var1_1 = kotlinx.coroutines.d.c(var10_10, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        var1_1 = new KotlinNothingValueException();
        throw var1_1;
    }

    public final void r() {
        AndroidComposeView.L(this.getRoot());
    }

    public final boolean requestFocus(int n3, Rect object) {
        aG2 aG22;
        boolean bl2 = this.isFocused();
        if (bl2) {
            return true;
        }
        Object object2 = this.getFocusOwner().j();
        bl2 = object2.getHasFocus();
        if (bl2) {
            return super.requestFocus(n3, object);
        }
        Object object3 = WT0.d(n3);
        n3 = object3 != null ? ((LT0)object3).a : 7;
        object2 = this.getFocusOwner();
        if (object != null) {
            int n4 = object.left;
            float f5 = n4;
            int n7 = object.top;
            float f6 = n7;
            int n8 = object.right;
            float f7 = n8;
            int n10 = object.bottom;
            float f8 = n10;
            aG22 = new aG2(f5, f6, f7, f8);
        } else {
            aG22 = null;
        }
        object = new AndroidComposeView$q(n3);
        object3 = object2.a(n3, aG22, (Function1)object);
        if (object3 != null) {
            n3 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
        } else {
            n3 = 0;
            object3 = null;
        }
        return n3 != 0;
    }

    public final long s(long l2) {
        this.S();
        l2 = QK1.b(this.O, l2);
        float f5 = e72.d(l2);
        float f6 = e72.d(this.S) + f5;
        float f7 = e72.e(l2);
        float f8 = e72.e(this.S) + f7;
        return h72.a(f6, f8);
    }

    public void setAccessibilityEventBatchIntervalMillis(long l2) {
        this.o.e = l2;
    }

    public final void setConfigurationChangeObserver(Function1 function1) {
        this.z = function1;
    }

    public final void setContentCaptureManager$ui_release(pg_1 pg_12) {
        this.p = pg_12;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void setCoroutineContext(CoroutineContext object) {
        Object object2;
        this.f = object;
        object = this.getRoot().y.e;
        int n3 = object instanceof vg3_2;
        if (n3 != 0) {
            object2 = object;
            object2 = (vg3_2)object;
            object2.m0();
        }
        object2 = ((LP1$c)object).a;
        int n4 = ((LP1$c)object2).m;
        if (n4 != 0) {
            object2 = ((LP1$c)object2).f;
            object = go0.f((fo0)object);
            n4 = 16;
            int[] nArray = new int[n4];
            WR1[] wR1Array = new WR1[n4];
            int n7 = 0;
            while (object != null) {
                Object object3;
                if (object2 == null) {
                    object2 = ((xp1_0)object).y.e;
                }
                int n8 = ((LP1$c)object2).d & n4;
                int n10 = 1;
                if (n8 != 0) {
                    while (object2 != null) {
                        n8 = ((LP1$c)object2).c & n4;
                        if (n8 != 0) {
                            object3 = object2;
                            WR1 wR1 = null;
                            while (object3 != null) {
                                int n14 = object3 instanceof gw2_0;
                                if (n14 != 0) {
                                    n14 = (object3 = (gw2_0)object3) instanceof vg3_2;
                                    if (n14 != 0) {
                                        object3 = (vg3_2)object3;
                                        object3.m0();
                                    }
                                } else {
                                    n14 = ((LP1$c)object3).c & n4;
                                    if (n14 != 0 && (n14 = object3 instanceof mo0_0) != 0) {
                                        Object object4 = object3;
                                        object4 = ((mo0_0)object3).o;
                                        int n15 = 0;
                                        while (object4 != null) {
                                            int n16 = ((LP1$c)object4).c & n4;
                                            if (n16 != 0) {
                                                if (++n15 == n10) {
                                                    object3 = object4;
                                                } else {
                                                    if (wR1 == null) {
                                                        Object[] objectArray = new LP1$c[n4];
                                                        wR1 = new WR1(objectArray);
                                                    }
                                                    if (object3 != null) {
                                                        wR1.b(object3);
                                                        n8 = 0;
                                                        object3 = null;
                                                    }
                                                    wR1.b(object4);
                                                }
                                            }
                                            object4 = ((LP1$c)object4).f;
                                        }
                                        if (n15 == n10) continue;
                                    }
                                }
                                object3 = go0.b(wR1);
                            }
                        }
                        object2 = ((LP1$c)object2).f;
                    }
                }
                if ((n3 = ((WR1)(object = ((xp1_0)object).D())).k()) == 0) {
                    n3 = nArray.length;
                    if (n7 >= n3) {
                        n3 = nArray.length * 2;
                        nArray = Arrays.copyOf(nArray, n3);
                        object2 = "copyOf(this, newSize)";
                        Intrinsics.checkNotNullExpressionValue(nArray, (String)object2);
                        n8 = wR1Array.length * 2;
                        wR1Array = Arrays.copyOf(wR1Array, n8);
                        Intrinsics.checkNotNullExpressionValue(wR1Array, (String)object2);
                    }
                    nArray[n7] = n3 = ((WR1)object).c - n10;
                    wR1Array[n7] = object;
                    ++n7;
                }
                if (n7 <= 0) return;
                int n17 = n7 + -1;
                n3 = nArray[n17];
                if (n3 < 0) return;
                if (n7 > 0) {
                    object3 = wR1Array[n17];
                    Intrinsics.checkNotNull(object3);
                    if (n3 > 0) {
                        nArray[n17] = n10 = nArray[n17] + -1;
                    } else if (n3 == 0) {
                        wR1Array[n17] = null;
                        n7 += -1;
                    }
                } else {
                    object2 = "Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()".toString();
                    object = new IllegalStateException((String)object2);
                    throw object;
                }
                object = (xp1_0)((WR1)object3).a[n3];
                n3 = 0;
                object2 = null;
            }
            return;
        }
        bh1_1.c("visitSubtree called on an unattached node");
        throw null;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long l2) {
        this.Q = l2;
    }

    public final void setOnViewTreeOwnersAvailable(Function1 function1) {
        boolean bl2;
        AndroidComposeView$b androidComposeView$b = this.getViewTreeOwners();
        if (androidComposeView$b != null) {
            function1.invoke(androidComposeView$b);
        }
        if (!(bl2 = this.isAttachedToWindow())) {
            this.p0 = function1;
        }
    }

    public void setShowLayoutBounds(boolean bl2) {
        this.E = bl2;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(Function0 function0) {
        WR1 wR1 = this.I0;
        boolean bl2 = wR1.h(function0);
        if (!bl2) {
            wR1.b(function0);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void v() {
        Object[] objectArray;
        Object object;
        Object object2;
        int n4 = 1;
        int n3 = this.B;
        if (n3 != 0) {
            int n7;
            object2 = this.getSnapshotObserver().a;
            object = ug2_1.c;
            objectArray = ((S83)object2).f;
            // MONITORENTER : objectArray
            object2 = ((S83)object2).f;
            int n8 = ((WR1)object2).c;
            int n10 = 0;
            for (n7 = 0; n7 < n8; n7 += n4) {
                Object object3;
                Object object4 = ((WR1)object2).a;
                object4 = object4[n7];
                object4 = (S83$a)object4;
                ((S83$a)object4).e((Function1)object);
                object4 = ((S83$a)object4).f;
                int n14 = ((dt2_0)object4).e;
                if (n14 != 0) {
                    n14 = 1;
                } else {
                    n14 = 0;
                    object4 = null;
                }
                if ((n14 ^= n4) != 0) {
                    n10 += n4;
                    continue;
                }
                if (n10 <= 0) continue;
                object4 = ((WR1)object2).a;
                int n15 = n7 - n10;
                object4[n15] = object3 = object4[n7];
            }
            object = ((WR1)object2).a;
            n7 = n8 - n10;
            rp_1.n(n7, n8, null, (Object[])object);
            ((WR1)object2).c = n7;
            object2 = Unit.a;
            this.B = false;
        }
        if ((object2 = this.F) != null) {
            AndroidComposeView.H((ViewGroup)object2);
        }
        while ((n3 = ((WR1)(object2 = this.I0)).l()) != 0) {
            object2 = this.I0;
            n3 = ((WR1)object2).c;
            object = null;
            for (int i3 = 0; i3 < n3; i3 += n4) {
                objectArray = this.I0.a;
                Function0 function0 = (Function0)objectArray[i3];
                objectArray[i3] = null;
                if (function0 == null) continue;
                function0.invoke();
            }
            object = this.I0;
            ((WR1)object).o(0, n3);
        }
    }

    public final void w(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public final void x() {
        boolean bl2;
        Object object = this.o;
        ((c)object).v = bl2 = true;
        boolean bl3 = ((c)object).o();
        if (bl3 && !(bl3 = ((c)object).G)) {
            ((c)object).G = bl2;
            Handler handler = ((c)object).i;
            object = ((c)object).H;
            handler.post((Runnable)object);
        }
        object = this.p;
        ((pg_1)object).h = bl2;
        bl3 = ((pg_1)object).d();
        if (bl3 && !(bl3 = ((pg_1)object).p)) {
            ((pg_1)object).p = bl2;
            Handler handler = ((pg_1)object).k;
            object = ((pg_1)object).q;
            handler.post((Runnable)object);
        }
    }

    public final void y(xp1_0 object, boolean bl2, boolean bl3, boolean bl4) {
        block6: {
            YK1 yK1;
            block4: {
                block5: {
                    boolean bl5;
                    Object object2;
                    block7: {
                        block8: {
                            block11: {
                                Object object3;
                                block10: {
                                    block12: {
                                        block9: {
                                            Xp1$f xp1$f;
                                            boolean bl6;
                                            boolean bl7;
                                            yK1 = this.J;
                                            if (!bl2) break block4;
                                            yK1.getClass();
                                            object2 = ((xp1_0)object).c;
                                            if (object2 == null) break block5;
                                            object2 = ((xp1_0)object).z;
                                            int[] nArray = YK1$b.$EnumSwitchMapping$0;
                                            object3 = ((bq1)object2).c;
                                            int bl62 = object3.ordinal();
                                            boolean bl8 = nArray[bl62];
                                            if (bl8 == (bl5 = true)) break block6;
                                            boolean bl9 = 2 != 0;
                                            if (bl8 == bl9 || bl8 == (bl7 = 3 != 0) || bl8 == (bl6 = 4 != 0)) break block7;
                                            int n3 = 5;
                                            if (bl8 != n3) break block8;
                                            boolean bl10 = ((bq1)object2).g;
                                            if (bl10 && !bl3) break block6;
                                            ((bq1)object2).g = bl5;
                                            ((bq1)object2).d = bl5;
                                            bl3 = ((xp1_0)object).I;
                                            if (bl3) break block6;
                                            Object object4 = ((xp1_0)object).M();
                                            object3 = Boolean.TRUE;
                                            bl3 = Intrinsics.areEqual(object4, object3);
                                            object3 = yK1.b;
                                            if (!bl3 && (!(bl3 = ((bq1)object2).g) || (object4 = ((xp1_0)object).y()) != (xp1$f = Xp1$f.InMeasureBlock) && ((object2 = ((bq1)object2).s) == null || (object2 = ((bq1$a_0)object2).r) == null || (bl2 = ((Sc)object2).f()) != bl5))) break block9;
                                            object2 = ((xp1_0)object).A();
                                            if (object2 == null) break block10;
                                            object2 = ((xp1_0)object2).z;
                                            bl2 = ((bq1)object2).g;
                                            if (bl2 != bl5) break block10;
                                        }
                                        if (!(bl2 = ((xp1_0)object).L()) && !(bl2 = YK1.h((xp1_0)object))) break block11;
                                        object2 = ((xp1_0)object).A();
                                        if (object2 == null) break block12;
                                        object2 = ((xp1_0)object2).z;
                                        bl2 = ((bq1)object2).d;
                                        if (bl2 == bl5) break block11;
                                    }
                                    bl2 = false;
                                    object2 = null;
                                    ((jp0)object3).a((xp1_0)object, false);
                                    break block11;
                                }
                                ((jp0)object3).a((xp1_0)object, bl5);
                            }
                            if (!(bl2 = yK1.d) && bl4) {
                                this.U((xp1_0)object);
                            }
                            break block6;
                        }
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    object2 = new YK1$a((xp1_0)object, bl5, bl3);
                    object = yK1.h;
                    ((WR1)object).b(object2);
                    break block6;
                }
                bh1_1.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
                throw null;
            }
            bl2 = yK1.p((xp1_0)object, bl3);
            if (bl2 && bl4) {
                this.U((xp1_0)object);
            }
        }
    }

    public final void z() {
        this.w = true;
    }
}

