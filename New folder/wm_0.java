/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.FrameLayout$LayoutParams
 */
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R$color;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/*
 * Renamed from Wm
 */
public final class wm_0
implements T72 {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public wm_0(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    public final f onApplyWindowInsets(View view, f view2) {
        Object object;
        View view3;
        boolean bl2;
        int n3 = 2;
        int n4 = 1;
        int n7 = 0;
        int n8 = view2.d();
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        appCompatDelegateImpl.getClass();
        int n10 = view2.d();
        ActionBarContextView actionBarContextView = appCompatDelegateImpl.v;
        int n14 = 8;
        if (actionBarContextView != null && (bl2 = (actionBarContextView = actionBarContextView.getLayoutParams()) instanceof ViewGroup.MarginLayoutParams)) {
            actionBarContextView = (ViewGroup.MarginLayoutParams)appCompatDelegateImpl.v.getLayoutParams();
            ActionBarContextView actionBarContextView2 = appCompatDelegateImpl.v;
            int n15 = actionBarContextView2.isShown();
            if (n15 != 0) {
                Object object2;
                actionBarContextView2 = appCompatDelegateImpl.t0;
                if (actionBarContextView2 == null) {
                    actionBarContextView2 = new Rect();
                    appCompatDelegateImpl.t0 = actionBarContextView2;
                    actionBarContextView2 = new Rect();
                    appCompatDelegateImpl.u0 = actionBarContextView2;
                }
                actionBarContextView2 = appCompatDelegateImpl.t0;
                Rect rect = appCompatDelegateImpl.u0;
                int n16 = view2.b();
                int n17 = view2.d();
                int n18 = view2.c();
                int n19 = view2.a();
                actionBarContextView2.set(n16, n17, n18, n19);
                Object object3 = appCompatDelegateImpl.B;
                n17 = Build.VERSION.SDK_INT;
                n18 = 29;
                if (n17 >= n18) {
                    n3 = (int)(dE3.a ? 1 : 0);
                    dE3$a.a((View)object3, (Rect)actionBarContextView2, rect);
                } else {
                    block44: {
                        n17 = (int)(dE3.a ? 1 : 0);
                        if (n17 == 0) {
                            Class<Rect> clazz;
                            Class[] classArray;
                            dE3.a = n4;
                            object2 = View.class;
                            String string2 = "computeFitSystemWindows";
                            try {
                                classArray = new Class[n3];
                                clazz = Rect.class;
                            }
                            catch (NoSuchMethodException noSuchMethodException) {}
                            classArray[0] = clazz;
                            classArray[n4] = clazz;
                            object2 = ((Class)object2).getDeclaredMethod(string2, classArray);
                            dE3.b = object2;
                            n17 = (int)(((AccessibleObject)object2).isAccessible() ? 1 : 0);
                            if (n17 != 0) break block44;
                            object2 = dE3.b;
                            ((AccessibleObject)object2).setAccessible(n4 != 0);
                        }
                    }
                    if ((object2 = dE3.b) != null) {
                        try {
                            view3 = new Object[n3];
                        }
                        catch (Exception exception) {}
                        view3[0] = actionBarContextView2;
                        view3[n4] = rect;
                        ((Method)object2).invoke(object3, (Object[])view3);
                    }
                }
                n3 = ((Rect)actionBarContextView2).top;
                int n20 = ((Rect)actionBarContextView2).left;
                n15 = ((Rect)actionBarContextView2).right;
                object3 = ViewCompat.i((View)appCompatDelegateImpl.B);
                if (object3 == null) {
                    n17 = 0;
                    object2 = null;
                } else {
                    n17 = ((f)object3).b();
                }
                if (object3 == null) {
                    n16 = 0;
                    object3 = null;
                } else {
                    n16 = ((f)object3).c();
                }
                n18 = ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin;
                if (n18 == n3 && (n18 = ((ViewGroup.MarginLayoutParams)actionBarContextView).leftMargin) == n20 && (n18 = ((ViewGroup.MarginLayoutParams)actionBarContextView).rightMargin) == n15) {
                    n15 = 0;
                    float f5 = 0.0f;
                    actionBarContextView2 = null;
                } else {
                    ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin = n3;
                    ((ViewGroup.MarginLayoutParams)actionBarContextView).leftMargin = n20;
                    ((ViewGroup.MarginLayoutParams)actionBarContextView).rightMargin = n15;
                    n15 = 1;
                    float f6 = Float.MIN_VALUE;
                }
                rect = appCompatDelegateImpl.k;
                if (n3 > 0 && (view3 = appCompatDelegateImpl.D) == null) {
                    appCompatDelegateImpl.D = view3 = new View((Context)rect);
                    view3.setVisibility(n14);
                    n18 = ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin;
                    n19 = 51;
                    int n21 = -1;
                    view3 = new FrameLayout.LayoutParams(n21, n18, n19);
                    view3.leftMargin = n17;
                    view3.rightMargin = n16;
                    object3 = appCompatDelegateImpl.B;
                    object2 = appCompatDelegateImpl.D;
                    object3.addView((View)object2, n21, (ViewGroup.LayoutParams)view3);
                } else {
                    view3 = appCompatDelegateImpl.D;
                    if (view3 != null) {
                        view3 = (ViewGroup.MarginLayoutParams)view3.getLayoutParams();
                        n18 = view3.height;
                        n19 = ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin;
                        if (n18 != n19 || (n18 = view3.leftMargin) != n17 || (n18 = view3.rightMargin) != n16) {
                            view3.height = n19;
                            view3.leftMargin = n17;
                            view3.rightMargin = n16;
                            object3 = appCompatDelegateImpl.D;
                            object3.setLayoutParams((ViewGroup.LayoutParams)view3);
                        }
                    }
                }
                view3 = appCompatDelegateImpl.D;
                if (view3 == null) {
                    n4 = 0;
                    object = null;
                }
                if (n4 != 0 && (n3 = view3.getVisibility()) != 0) {
                    view3 = appCompatDelegateImpl.D;
                    n16 = view3.getWindowSystemUiVisibility() & 0x2000;
                    if (n16 != 0) {
                        n16 = R$color.abc_decor_view_status_guard_light;
                        n20 = t70.getColor((Context)rect, n16);
                    } else {
                        n16 = R$color.abc_decor_view_status_guard;
                        n20 = t70.getColor((Context)rect, n16);
                    }
                    view3.setBackgroundColor(n20);
                }
                if ((n3 = (int)(appCompatDelegateImpl.I ? 1 : 0)) == 0 && n4 != 0) {
                    n10 = 0;
                }
                n3 = n4;
                n4 = n15;
            } else {
                n3 = ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin;
                if (n3 != 0) {
                    ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin = 0;
                    n3 = 0;
                    view3 = null;
                } else {
                    n3 = 0;
                    view3 = null;
                    n4 = 0;
                    object = null;
                }
            }
            if (n4 != 0) {
                object = appCompatDelegateImpl.v;
                object.setLayoutParams((ViewGroup.LayoutParams)actionBarContextView);
            }
        } else {
            n3 = 0;
            view3 = null;
        }
        if ((object = appCompatDelegateImpl.D) != null) {
            if (n3 == 0) {
                n7 = 8;
            }
            object.setVisibility(n7);
        }
        if (n8 != n10) {
            n3 = view2.b();
            n4 = view2.c();
            n7 = view2.a();
            view3 = view2.f(n3, n10, n4, n7);
            object = view;
        } else {
            object = view;
            view3 = view2;
        }
        return ViewCompat.n(object, (f)view3);
    }
}

