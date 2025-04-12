/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnHoverListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.view.accessibility.AccessibilityManager
 */
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.R$dimen;
import androidx.core.view.ViewCompat;

/*
 * Renamed from xo3
 */
public final class xo3_0
implements View.OnLongClickListener,
View.OnHoverListener,
View.OnAttachStateChangeListener {
    public static xo3_0 k;
    public static xo3_0 l;
    public final View a;
    public final CharSequence b;
    public final int c;
    public final wo3_0 d;
    public final B31 e;
    public int f;
    public int g;
    public yo3_0 h;
    public boolean i;
    public boolean j;

    public xo3_0(View view, CharSequence charSequence) {
        Object object = new wo3_0(this);
        this.d = object;
        int n3 = 2;
        super(this, n3);
        this.e = object;
        this.a = view;
        this.b = charSequence;
        charSequence = ViewConfiguration.get((Context)view.getContext());
        object = OC3.a;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 28;
        int n8 = n4 >= n7 ? OC3$b.a((ViewConfiguration)charSequence) : charSequence.getScaledTouchSlop() / n3;
        this.c = n8;
        this.j = true;
        view.setOnLongClickListener((View.OnLongClickListener)this);
        view.setOnHoverListener((View.OnHoverListener)this);
    }

    public static void b(xo3_0 object) {
        xo3_0 xo3_02 = k;
        if (xo3_02 != null) {
            wo3_0 wo3_02 = xo3_02.d;
            xo3_02 = xo3_02.a;
            xo3_02.removeCallbacks(wo3_02);
        }
        k = object;
        if (object != null) {
            int n3 = ViewConfiguration.getLongPressTimeout();
            long l2 = n3;
            View view = ((xo3_0)object).a;
            object = ((xo3_0)object).d;
            view.postDelayed((Runnable)object, l2);
        }
    }

    public final void a() {
        Object object = l;
        View view = this.a;
        if (object == this) {
            l = null;
            object = this.h;
            if (object != null) {
                boolean bl2;
                View view2 = ((yo3_0)object).b;
                Object object2 = view2.getParent();
                if (object2 != null) {
                    object = ((yo3_0)object).a;
                    object2 = "window";
                    object = (WindowManager)object.getSystemService((String)object2);
                    object.removeView(view2);
                }
                this.h = null;
                this.j = bl2 = true;
                view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            }
        }
        if ((object = k) == this) {
            xo3_0.b(null);
        }
        object = this.e;
        view.removeCallbacks((Runnable)object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void c(boolean n3) {
        long l2;
        int n4;
        ViewGroup.LayoutParams layoutParams;
        View view;
        B31 b31;
        int n7;
        int n8;
        Context context;
        String string2;
        ViewParent viewParent;
        View view2;
        boolean bl2;
        Object object;
        int n10;
        Object object2;
        View view3;
        Object object3;
        block22: {
            void var23_38;
            boolean bl3;
            block21: {
                object3 = this;
                view3 = this.a;
                boolean bl4 = view3.isAttachedToWindow();
                if (!bl4) {
                    return;
                }
                boolean bl5 = false;
                xo3_0.b(null);
                object2 = l;
                if (object2 != null) {
                    ((xo3_0)object2).a();
                }
                l = object3;
                int n14 = n3;
                ((xo3_0)object3).i = n3;
                Context context2 = view3.getContext();
                ((xo3_0)object3).h = object2 = new yo3_0(context2);
                n10 = ((xo3_0)object3).f;
                object = ((xo3_0)object3).g;
                bl2 = ((xo3_0)object3).i;
                view2 = ((yo3_0)object2).b;
                viewParent = view2.getParent();
                string2 = "window";
                context = ((yo3_0)object2).a;
                if (viewParent != null && (viewParent = view2.getParent()) != null) {
                    viewParent = (WindowManager)context.getSystemService(string2);
                    viewParent.removeView(view2);
                }
                viewParent = ((yo3_0)object2).c;
                CharSequence charSequence = ((xo3_0)object3).b;
                viewParent.setText(charSequence);
                viewParent = ((yo3_0)object2).d;
                charSequence = view3.getApplicationWindowToken();
                viewParent.token = charSequence;
                charSequence = context.getResources();
                n8 = R$dimen.tooltip_precise_anchor_threshold;
                n7 = charSequence.getDimensionPixelOffset(n8);
                n8 = view3.getWidth();
                int n15 = 2;
                if (n8 < n7) {
                    n10 = view3.getWidth() / n15;
                }
                n8 = view3.getHeight();
                if (n8 >= n7) {
                    charSequence = context.getResources();
                    n8 = R$dimen.tooltip_precise_anchor_extra_offset;
                    n7 = charSequence.getDimensionPixelOffset(n8);
                    n8 = object + n7;
                    object -= n7;
                } else {
                    n8 = view3.getHeight();
                    object = 0;
                    b31 = null;
                }
                viewParent.gravity = n7 = 49;
                charSequence = context.getResources();
                int n16 = bl2 ? R$dimen.tooltip_y_offset_touch : R$dimen.tooltip_y_offset_non_touch;
                n7 = charSequence.getDimensionPixelOffset(n16);
                view = view3.getRootView();
                layoutParams = view.getLayoutParams();
                n4 = layoutParams instanceof WindowManager.LayoutParams;
                if (n4 == 0) break block21;
                layoutParams = (WindowManager.LayoutParams)layoutParams;
                n4 = layoutParams.type;
                if (n4 == n15) break block22;
            }
            Context context3 = view3.getContext();
            while (bl3 = var23_38 instanceof ContextWrapper) {
                bl3 = var23_38 instanceof Activity;
                if (bl3) {
                    Window window = ((Activity)var23_38).getWindow();
                    view = window.getDecorView();
                    break;
                }
                Context context4 = ((ContextWrapper)var23_38).getBaseContext();
            }
        }
        if (view == null) {
            object3 = string2;
        } else {
            int n17;
            reference var29_64;
            reference var28_60;
            String string3;
            int n18;
            layoutParams = ((yo3_0)object2).e;
            view.getWindowVisibleDisplayFrame((Rect)layoutParams);
            int n19 = layoutParams.left;
            if (n19 < 0 && (n18 = layoutParams.top) < 0) {
                void var27_51;
                Resources resources = context.getResources();
                String string4 = "dimen";
                object3 = "android";
                string3 = string2;
                string2 = "status_bar_height";
                int n20 = resources.getIdentifier(string2, string4, (String)object3);
                if (n20 != 0) {
                    int n21 = resources.getDimensionPixelSize(n20);
                } else {
                    boolean bl6 = false;
                    object3 = null;
                }
                string2 = resources.getDisplayMetrics();
                int n22 = ((DisplayMetrics)string2).widthPixels;
                int n24 = ((DisplayMetrics)string2).heightPixels;
                n4 = 0;
                Object var23_43 = null;
                layoutParams.set(0, (int)var27_51, n22, n24);
            } else {
                string3 = string2;
                n4 = 0;
                Object var23_44 = null;
            }
            object3 = ((yo3_0)object2).g;
            view.getLocationOnScreen((int[])object3);
            object2 = ((yo3_0)object2).f;
            view3.getLocationOnScreen((int[])object2);
            Object object4 = object2[0];
            Object object5 = object3[0];
            object2[0] = var28_60 = object4 - object5;
            int n25 = 1;
            Object object6 = object2[n25];
            Object object7 = object3[n25];
            object2[n25] = var29_64 = object6 - object7;
            reference var28_61 = var28_60 + n10;
            int n26 = view.getWidth();
            n10 = 2;
            int n27 = n26 / n10;
            reference var28_62 = var28_61 - n27;
            viewParent.x = (int)var28_62;
            int n28 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
            view2.measure(n28, n28);
            int n29 = view2.getMeasuredHeight();
            Object object8 = object2[n25];
            object = object + object8 - n7 - n29;
            reference var4_8 = object8 + n8 + n7;
            viewParent.y = bl2 ? (object >= 0 ? object : (int)var4_8) : ((n17 = n29 + var4_8) <= (n10 = layoutParams.height()) ? (Object)var4_8 : object);
            object3 = string3;
        }
        ((WindowManager)context.getSystemService((String)object3)).addView(view2, (ViewGroup.LayoutParams)viewParent);
        object3 = this;
        view3.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        boolean bl7 = this.i;
        if (bl7) {
            l2 = 2500L;
        } else {
            long l3;
            object2 = ViewCompat.a;
            int n32 = view3.getWindowSystemUiVisibility();
            n32 = n32 & (n10 = 1);
            if (n32 == n10) {
                int n34 = ViewConfiguration.getLongPressTimeout();
                l2 = n34;
                l3 = 3000L;
            } else {
                int n35 = ViewConfiguration.getLongPressTimeout();
                l2 = n35;
                l3 = 15000L;
            }
            l2 = l3 - l2;
        }
        b31 = ((xo3_0)object3).e;
        view3.removeCallbacks((Runnable)b31);
        view3.postDelayed((Runnable)b31, l2);
    }

    public final boolean onHover(View object, MotionEvent motionEvent) {
        block8: {
            int n3;
            int n4;
            block9: {
                int n7;
                int n8;
                block7: {
                    object = this.h;
                    if (object != null && (n4 = this.i) != 0) {
                        return false;
                    }
                    object = this.a;
                    Context context = object.getContext();
                    String string2 = "accessibility";
                    n8 = (context = (AccessibilityManager)context.getSystemService(string2)).isEnabled();
                    if (n8 != 0 && (n7 = context.isTouchExplorationEnabled()) != 0) {
                        return false;
                    }
                    n7 = motionEvent.getAction();
                    if (n7 == (n8 = 7)) break block7;
                    n4 = 10;
                    float f5 = 1.4E-44f;
                    if (n7 == n4) {
                        n4 = 1;
                        f5 = Float.MIN_VALUE;
                        this.j = n4;
                        this.a();
                    }
                    break block8;
                }
                n4 = (int)(object.isEnabled() ? 1 : 0);
                if (n4 == 0 || (object = this.h) != null) break block8;
                float f6 = motionEvent.getX();
                n4 = (int)f6;
                float f7 = motionEvent.getY();
                n3 = (int)f7;
                n7 = (int)(this.j ? 1 : 0);
                if (n7 != 0) break block9;
                n7 = this.f;
                if ((n7 = Math.abs(n4 - n7)) > (n8 = this.c)) break block9;
                n7 = this.g;
                if ((n7 = Math.abs(n3 - n7)) <= n8) break block8;
            }
            this.f = n4;
            this.g = n3;
            this.j = false;
            xo3_0.b(this);
        }
        return false;
    }

    public final boolean onLongClick(View view) {
        int bl2;
        int n3;
        this.f = n3 = view.getWidth() / 2;
        this.g = bl2 = view.getHeight() / 2;
        boolean bl3 = true;
        this.c(bl3);
        return bl3;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.a();
    }
}

