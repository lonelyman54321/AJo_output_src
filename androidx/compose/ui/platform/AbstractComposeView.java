/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.R$id;
import androidx.compose.ui.platform.AbstractComposeView$a;
import androidx.compose.ui.platform.j;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public abstract class AbstractComposeView
extends ViewGroup {
    public WeakReference a;
    public IBinder b;
    public j c;
    public A30 d;
    public Function0 e;
    public boolean f;
    public boolean g;
    public boolean h;

    public AbstractComposeView(Context context) {
        this(context, null, 6, 0);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public AbstractComposeView(Context object, AttributeSet object2, int n3) {
        super(object, object2, n3);
        this.setClipChildren(false);
        this.setClipToPadding(false);
        super(this);
        this.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
        super(this);
        n3 = vw2.a;
        Intrinsics.checkNotNullParameter((Object)this, "<this>");
        Object object3 = "listener";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        xw2 xw22 = vw2.b((View)this);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        xw22.a.add(object2);
        this.e = object3 = new ic3_1(this, (JC3)object, (hc3_0)object2);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int n3, int n4) {
        if ((n3 &= 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(A30 object) {
        A30 a30 = this.d;
        if (a30 != object) {
            this.d = object;
            a30 = null;
            if (object != null) {
                this.a = null;
            }
            if ((object = this.c) != null) {
                ((j)object).o();
                this.c = null;
                boolean bl2 = this.isAttachedToWindow();
                if (bl2) {
                    this.d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        IBinder iBinder2 = this.b;
        if (iBinder2 != iBinder) {
            this.b = iBinder;
            iBinder = null;
            this.a = null;
        }
    }

    public abstract void a(b30_0 var1, int var2);

    public final void addView(View view) {
        this.b();
        super.addView(view);
    }

    public final void addView(View view, int n3) {
        this.b();
        super.addView(view, n3);
    }

    public final void addView(View view, int n3, int n4) {
        this.b();
        super.addView(view, n3, n4);
    }

    public final void addView(View view, int n3, ViewGroup.LayoutParams layoutParams) {
        this.b();
        super.addView(view, n3, layoutParams);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        this.b();
        super.addView(view, layoutParams);
    }

    public final boolean addViewInLayout(View view, int n3, ViewGroup.LayoutParams layoutParams) {
        this.b();
        return super.addViewInLayout(view, n3, layoutParams);
    }

    public final boolean addViewInLayout(View view, int n3, ViewGroup.LayoutParams layoutParams, boolean bl2) {
        this.b();
        return super.addViewInLayout(view, n3, layoutParams, bl2);
    }

    public final void b() {
        boolean bl2 = this.g;
        if (bl2) {
            return;
        }
        CharSequence charSequence = new StringBuilder("Cannot add views to ");
        String string2 = ((Object)((Object)this)).getClass().getSimpleName();
        charSequence.append(string2);
        charSequence.append("; only Compose content is supported");
        charSequence = charSequence.toString();
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException((String)charSequence);
        throw unsupportedOperationException;
    }

    public final void c() {
        j j3 = this.c;
        if (j3 != null) {
            j3.o();
        }
        this.c = null;
        this.requestLayout();
    }

    public final void d() {
        j j3 = this.c;
        if (j3 == null) {
            j3 = null;
            boolean bl2 = true;
            try {
                j j5;
                this.g = bl2;
                A30 a30 = this.g();
                AbstractComposeView$a abstractComposeView$a = new AbstractComposeView$a(this);
                int n3 = -656146368;
                u10 u102 = new u10(n3, abstractComposeView$a, bl2);
                this.c = j5 = nj3_0.a(this, a30, u102);
            }
            finally {
                this.g = false;
            }
        }
    }

    public void e(boolean bl2, int n3, int n4, int n7, int n8) {
        View view = this.getChildAt(0);
        if (view != null) {
            int n10 = this.getPaddingLeft();
            int n14 = this.getPaddingTop();
            n7 -= n3;
            n3 = this.getPaddingRight();
            n7 -= n3;
            n8 -= n4;
            n3 = this.getPaddingBottom();
            view.layout(n10, n14, n7, n8 -= n3);
        }
    }

    public void f(int n3, int n4) {
        int n7 = 0;
        View view = this.getChildAt(0);
        if (view == null) {
            super.onMeasure(n3, n4);
            return;
        }
        int n8 = View.MeasureSpec.getSize((int)n3);
        int n10 = this.getPaddingLeft();
        n8 -= n10;
        n10 = this.getPaddingRight();
        n8 -= n10;
        n8 = Math.max(0, n8);
        n10 = View.MeasureSpec.getSize((int)n4);
        int n14 = this.getPaddingTop();
        n10 -= n14;
        n14 = this.getPaddingBottom();
        n7 = Math.max(0, n10 -= n14);
        n3 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.makeMeasureSpec((int)n8, (int)n3);
        n4 = View.MeasureSpec.getMode((int)n4);
        n4 = View.MeasureSpec.makeMeasureSpec((int)n7, (int)n4);
        view.measure(n3, n4);
        n3 = view.getMeasuredWidth();
        n4 = this.getPaddingLeft() + n3;
        n3 = this.getPaddingRight() + n4;
        n4 = view.getMeasuredHeight();
        n7 = this.getPaddingTop() + n4;
        n4 = this.getPaddingBottom() + n7;
        this.setMeasuredDimension(n3, n4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final A30 g() {
        block14: {
            block19: {
                block18: {
                    block17: {
                        block16: {
                            block15: {
                                var1_1 = this.d;
                                if (var1_1 != null) break block14;
                                var1_1 = uh3_0.b((View)this);
                                if (var1_1 == null) {
                                    var2_2 /* !! */  = this.getParent();
                                    while (var1_1 == null && (var3_3 = var2_2 /* !! */  instanceof View) != 0) {
                                        var1_1 = var2_2 /* !! */ ;
                                        var1_1 = uh3_0.b((View)var2_2 /* !! */ );
                                        var2_2 /* !! */  = var2_2 /* !! */ .getParent();
                                    }
                                }
                                var2_2 /* !! */  = null;
                                if (var1_1 == null) break block15;
                                var3_3 = var1_1 instanceof FF2;
                                if (var3_3 == 0) ** GOTO lbl-1000
                                var4_4 /* !! */  = var1_1;
                                var4_4 /* !! */  = (FF2$d)((FF2)var1_1).r.getValue();
                                var3_3 = var4_4 /* !! */ .compareTo(var5_5 /* !! */  = FF2$d.ShuttingDown);
                                if (var3_3 <= 0) {
                                    var3_3 = 0;
                                    var4_4 /* !! */  = null;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var4_4 /* !! */  = var1_1;
                                }
                                if (var4_4 /* !! */  != null) {
                                    this.a = var5_5 /* !! */  = new WeakReference<A30>(var4_4 /* !! */ );
                                }
                                break block16;
                            }
                            var6_6 = false;
                            var1_1 = null;
                        }
                        if (var1_1 != null) break block14;
                        var1_1 = this.a;
                        if (var1_1 == null || (var1_1 = (A30)var1_1.get()) == null) break block17;
                        var3_3 = var1_1 instanceof FF2;
                        if (var3_3 == 0) break block18;
                        var4_4 /* !! */  = var1_1;
                        var4_4 /* !! */  = (FF2$d)((FF2)var1_1).r.getValue();
                        var3_3 = var4_4 /* !! */ .compareTo(var5_5 /* !! */  = FF2$d.ShuttingDown);
                        if (var3_3 > 0) break block18;
                    }
                    var6_6 = false;
                    var1_1 = null;
                }
                if (var1_1 != null) break block14;
                var6_6 = this.isAttachedToWindow();
                if (!var6_6) ** GOTO lbl85
                var1_1 = this.getParent();
                var4_4 /* !! */  = this;
                while ((var7_7 = var1_1 instanceof View) != 0 && (var7_7 = (var1_1 = (View)var1_1).getId()) != (var8_8 = 0x1020002)) {
                    var9_9 = var1_1.getParent();
                    var4_4 /* !! */  = var1_1;
                    var1_1 = var9_9;
                }
                var1_1 = uh3_0.b((View)var4_4 /* !! */ );
                if (var1_1 != null) break block19;
                var1_1 = ((mh3_0)pH3.a.get()).a((View)var4_4 /* !! */ );
                var7_7 = R$id.androidx_compose_ui_view_composition_context;
                var4_4 /* !! */ .setTag(var7_7, var1_1);
                var5_5 /* !! */  = e01_0.a;
                var10_10 /* !! */  = var4_4 /* !! */ .getHandler();
                var12_12 = "windowRecomposer cleanup";
                var11_11 = new c21_0(var10_10 /* !! */ , var12_12, false);
                var10_10 /* !! */  = new oh3_2((FF2)var1_1, (View)var4_4 /* !! */ , null);
                var13_13 = 2;
                var11_11 = var11_11.e;
                var5_5 /* !! */  = Ae3.d(var5_5 /* !! */ , var11_11, null, (Function2)var10_10 /* !! */ , var13_13);
                var10_10 /* !! */  = new nH3((mb3_2)var5_5 /* !! */ );
                var4_4 /* !! */ .addOnAttachStateChangeListener((View.OnAttachStateChangeListener)var10_10 /* !! */ );
                ** GOTO lbl74
            }
            var3_3 = var1_1 instanceof FF2;
            if (var3_3 != 0) {
                var1_1 = (FF2)var1_1;
lbl74:
                // 2 sources

                var4_4 /* !! */  = (FF2$d)var1_1.r.getValue();
                var5_5 /* !! */  = FF2$d.ShuttingDown;
                var3_3 = var4_4 /* !! */ .compareTo(var5_5 /* !! */ );
                if (var3_3 > 0) {
                    var2_2 /* !! */  = var1_1;
                }
                if (var2_2 /* !! */  != null) {
                    this.a = var4_4 /* !! */  = new WeakReference(var2_2 /* !! */ );
                }
            } else {
                var2_2 /* !! */  = "root viewTreeParentCompositionContext is not a Recomposer".toString();
                var1_1 = new IllegalStateException((String)var2_2 /* !! */ );
                throw var1_1;
lbl85:
                // 1 sources

                var1_1 = new StringBuilder("Cannot locate windowRecomposer; View ");
                var1_1.append((Object)this);
                var1_1.append(" is not attached to a window");
                bh1_1.c(var1_1.toString());
                throw null;
            }
        }
        return var1_1;
    }

    public final boolean getHasComposition() {
        boolean bl2;
        j j3 = this.c;
        if (j3 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            j3 = null;
        }
        return bl2;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f;
    }

    public final boolean isTransitionGroup() {
        boolean bl2 = this.h;
        bl2 = !bl2 || (bl2 = super.isTransitionGroup());
        return bl2;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IBinder iBinder = this.getWindowToken();
        this.setPreviousAttachedWindowToken(iBinder);
        boolean bl2 = this.getShouldCreateCompositionOnAttachedToWindow();
        if (bl2) {
            this.d();
        }
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        this.e(bl2, n3, n4, n7, n8);
    }

    public final void onMeasure(int n3, int n4) {
        this.d();
        this.f(n3, n4);
    }

    public final void onRtlPropertiesChanged(int n3) {
        View view = this.getChildAt(0);
        if (view != null) {
            view.setLayoutDirection(n3);
        }
    }

    public final void setParentCompositionContext(A30 a30) {
        this.setParentContext(a30);
    }

    public final void setShowLayoutBounds(boolean bl2) {
        this.f = bl2;
        Object object = this.getChildAt(0);
        if (object != null) {
            object = (sg2_0)object;
            object.setShowLayoutBounds(bl2);
        }
    }

    public void setTransitionGroup(boolean bl2) {
        super.setTransitionGroup(bl2);
        this.h = true;
    }

    public final void setViewCompositionStrategy(KC3 object) {
        Function0 function0 = this.e;
        if (function0 != null) {
            function0.invoke();
        }
        this.e = object = object.a(this);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

