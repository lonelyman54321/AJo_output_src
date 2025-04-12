/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.PointerIcon
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewParent
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.Window
 *  android.view.WindowInsets
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 */
package androidx.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.R$id;
import androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager;
import androidx.core.view.ViewCompat$a;
import androidx.core.view.ViewCompat$b;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.ViewCompat$d;
import androidx.core.view.ViewCompat$e;
import androidx.core.view.ViewCompat$g;
import androidx.core.view.ViewCompat$h;
import androidx.core.view.ViewCompat$i;
import androidx.core.view.ViewCompat$j;
import androidx.core.view.ViewCompat$l;
import androidx.core.view.WindowInsetsAnimationCompat$Impl21;
import androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat$b;
import androidx.core.view.WindowInsetsAnimationCompat$c$a;
import androidx.core.view.a;
import androidx.core.view.a$a;
import androidx.core.view.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public final class ViewCompat {
    public static WeakHashMap a;
    public static Field b;
    public static boolean c = false;
    public static ThreadLocal d;
    public static final int[] e;
    public static final ec3_0 f;
    public static final ViewCompat$AccessibilityPaneVisibilityManager g;

    static {
        int n3 = R$id.accessibility_custom_action_0;
        int n4 = R$id.accessibility_custom_action_1;
        int n7 = R$id.accessibility_custom_action_2;
        int n8 = R$id.accessibility_custom_action_3;
        int n10 = R$id.accessibility_custom_action_4;
        int n14 = R$id.accessibility_custom_action_5;
        int n15 = R$id.accessibility_custom_action_6;
        int n16 = R$id.accessibility_custom_action_7;
        int n17 = R$id.accessibility_custom_action_8;
        int n18 = R$id.accessibility_custom_action_9;
        int n19 = R$id.accessibility_custom_action_10;
        int n20 = R$id.accessibility_custom_action_11;
        int n21 = R$id.accessibility_custom_action_12;
        int n22 = R$id.accessibility_custom_action_13;
        int n24 = R$id.accessibility_custom_action_14;
        int n25 = R$id.accessibility_custom_action_15;
        int n26 = R$id.accessibility_custom_action_16;
        int n27 = R$id.accessibility_custom_action_17;
        int n28 = R$id.accessibility_custom_action_18;
        int n29 = R$id.accessibility_custom_action_19;
        int n30 = R$id.accessibility_custom_action_20;
        int n32 = R$id.accessibility_custom_action_21;
        int n34 = R$id.accessibility_custom_action_22;
        int n35 = R$id.accessibility_custom_action_23;
        int n36 = R$id.accessibility_custom_action_24;
        int n37 = R$id.accessibility_custom_action_25;
        int n38 = R$id.accessibility_custom_action_26;
        int n39 = R$id.accessibility_custom_action_27;
        int n41 = R$id.accessibility_custom_action_28;
        int n42 = R$id.accessibility_custom_action_29;
        int n43 = R$id.accessibility_custom_action_30;
        int n44 = R$id.accessibility_custom_action_31;
        e = new int[]{n3, n4, n7, n8, n10, n14, n15, n16, n17, n18, n19, n20, n21, n22, n24, n25, n26, n27, n28, n29, n30, n32, n34, n35, n36, n37, n38, n39, n41, n42, n43, n44};
        Object object = new Object();
        f = object;
        g = object = new ViewCompat$AccessibilityPaneVisibilityManager();
    }

    public static zd3_1 a(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        if ((weakHashMap = (zd3_1)a.get(view)) == null) {
            weakHashMap = new zd3_1(view);
            WeakHashMap weakHashMap2 = a;
            weakHashMap2.put(view, weakHashMap);
        }
        return weakHashMap;
    }

    public static f b(View view, f f5) {
        WindowInsets windowInsets;
        boolean bl2;
        WindowInsets windowInsets2 = f5.g();
        if (windowInsets2 != null && !(bl2 = (windowInsets = ViewCompat$b.a(view, windowInsets2)).equals((Object)windowInsets2))) {
            return androidx.core.view.f.h(view, windowInsets);
        }
        return f5;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static boolean c(View var0, KeyEvent var1_2) {
        var2_3 = Build.VERSION.SDK_INT;
        var3_4 = 28;
        var4_5 = false;
        if (var2_3 >= var3_4) {
            return false;
        }
        var5_6 = ViewCompat$l.d;
        var2_3 = R$id.tag_unhandled_key_event_manager;
        var5_6 = (ViewCompat$l)var0.getTag(var2_3);
        if (var5_6 == null) {
            var5_6 = new ViewCompat$l();
            var3_4 = R$id.tag_unhandled_key_event_manager;
            var0.setTag(var3_4, var5_6);
        }
        var3_4 = var1_2.getAction();
        var6_7 = 1;
        if (var3_4 != 0) ** GOTO lbl47
        var7_8 = var5_6.a;
        if (var7_8 != null) {
            var7_8.clear();
        }
        if ((var8_9 = (var7_8 = ViewCompat$l.d).isEmpty()) != 0) ** GOTO lbl47
        // MONITORENTER : var7_8
        var9_10 = var5_6.a;
        if (var9_10 == null) {
            var5_6.a = var9_10 = new WeakHashMap<K, V>();
        }
        var8_9 = var7_8.size() - var6_7;
        while (true) {
            if (var8_9 < 0) ** GOTO lbl-1000
            {
                block14: {
                    var10_11 = ViewCompat$l.d;
                    var11_12 = var10_11.get(var8_9);
                    var11_12 = (WeakReference)var11_12;
                    var11_12 = var11_12.get();
                    if ((var11_12 = (View)var11_12) != null) break block14;
                    var10_11.remove(var8_9);
                    ** GOTO lbl70
                }
                var10_11 = var5_6.a;
                var12_13 = Boolean.TRUE;
                var10_11.put(var11_12, var12_13);
                var10_11 = var11_12.getParent();
                ** GOTO lbl61
            }
lbl-1000:
            // 1 sources

            {
                // MONITOREXIT : var7_8
lbl47:
                // 3 sources

                var0 = var5_6.a(var0, var1_2);
                var3_4 = var1_2.getAction();
                if (var3_4 == 0) {
                    var15_16 = var1_2.getKeyCode();
                    if (var0 != null && (var3_4 = (int)KeyEvent.isModifierKey((int)var15_16)) == 0) {
                        var7_8 = var5_6.b;
                        if (var7_8 == null) {
                            var7_8 = new Object();
                            var5_6.b = var7_8;
                        }
                        var5_6 = var5_6.b;
                        var7_8 = new Object(var0);
                        var5_6.put(var15_16, var7_8);
                    }
                }
                if (var0 == null) return var4_5;
                return true;
lbl61:
                // 2 sources

                while (var13_14 = var10_11 instanceof View) {
                    var11_12 = var5_6.a;
                    var12_13 = var10_11;
                    var12_13 = (View)var10_11;
                    var14_15 = Boolean.TRUE;
                    var11_12.put((Object)var12_13, (Boolean)var14_15);
                    var10_11 = ((ViewParent)var10_11).getParent();
                }
lbl70:
                // 2 sources

                var8_9 += -1;
                continue;
            }
            break;
        }
    }

    public static View.AccessibilityDelegate d(View object) {
        Object object2;
        block10: {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 29;
            if (n3 >= n4) {
                return ViewCompat$h.a(object);
            }
            n3 = (int)(c ? 1 : 0);
            n4 = 0;
            object2 = null;
            if (n3 != 0) break block10;
            Object object3 = b;
            boolean bl2 = true;
            if (object3 == null) {
                object3 = View.class;
                String string2 = "mAccessibilityDelegate";
                try {
                    object3 = ((Class)object3).getDeclaredField(string2);
                }
                catch (Throwable throwable) {
                    c = bl2;
                    break block10;
                }
                b = object3;
                ((AccessibleObject)object3).setAccessible(bl2);
            }
            object3 = b;
            object = ((Field)object3).get(object);
            n3 = object instanceof View.AccessibilityDelegate;
            if (n3 == 0) break block10;
            try {
                object2 = object = (View.AccessibilityDelegate)object;
            }
            catch (Throwable throwable) {
                c = bl2;
            }
        }
        return object2;
    }

    public static CharSequence e(View object) {
        int n3 = R$id.tag_accessibility_pane_title;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 28;
        if (n4 >= n7) {
            object = ViewCompat$g.a(object);
        } else {
            Class<CharSequence> clazz = CharSequence.class;
            if ((n3 = (int)(clazz.isInstance(object = object.getTag(n3)) ? 1 : 0)) == 0) {
                object = null;
            }
        }
        return (CharSequence)object;
    }

    public static ArrayList f(View view) {
        int n3 = R$id.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList)view.getTag(n3);
        if (arrayList == null) {
            arrayList = new ArrayList();
            int n4 = R$id.tag_accessibility_actions;
            view.setTag(n4, arrayList);
        }
        return arrayList;
    }

    public static Rect g() {
        Rect rect = d;
        if (rect == null) {
            rect = new ThreadLocal();
            d = rect;
        }
        if ((rect = (Rect)d.get()) == null) {
            rect = new Rect();
            ThreadLocal threadLocal = d;
            threadLocal.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] h(View view) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        if (n3 >= n4) {
            return ViewCompat$j.a(view);
        }
        n3 = R$id.tag_on_receive_content_mime_types;
        return (String[])view.getTag(n3);
    }

    public static f i(View view) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            return ViewCompat$d.a(view);
        }
        return ViewCompat$c.f(view);
    }

    public static UG3 j(View view) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            return ViewCompat$i.b(view);
        }
        Context context = view.getContext();
        while (true) {
            n4 = context instanceof ContextWrapper;
            UG3 uG3 = null;
            if (n4 == 0) break;
            n4 = context instanceof Activity;
            if (n4 != 0) {
                if ((context = ((Activity)context).getWindow()) != null) {
                    uG3 = new UG3(view, (Window)context);
                }
                return uG3;
            }
            context = ((ContextWrapper)context).getBaseContext();
        }
        return null;
    }

    public static void k(int n3, View object) {
        Context context = object.getContext();
        CharSequence charSequence = "accessibility";
        int n4 = (context = (AccessibilityManager)context.getSystemService(charSequence)).isEnabled();
        if (n4 == 0) {
            return;
        }
        charSequence = ViewCompat.e(object);
        int n7 = 1;
        if (charSequence != null && (n4 = object.isShown()) != 0 && (n4 = object.getWindowVisibility()) == 0) {
            n4 = 1;
        } else {
            n4 = 0;
            charSequence = null;
        }
        int n8 = object.getAccessibilityLiveRegion();
        int n10 = 32;
        if (n8 == 0 && n4 == 0) {
            if (n3 == n10) {
                charSequence = AccessibilityEvent.obtain();
                object.onInitializeAccessibilityEvent((AccessibilityEvent)charSequence);
                charSequence.setEventType(n10);
                charSequence.setContentChangeTypes(n3);
                charSequence.setSource(object);
                object.onPopulateAccessibilityEvent((AccessibilityEvent)charSequence);
                List list = charSequence.getText();
                object = ViewCompat.e(object);
                list.add(object);
                context.sendAccessibilityEvent((AccessibilityEvent)charSequence);
            } else {
                context = object.getParent();
                if (context != null) {
                    context = object.getParent();
                    try {
                        context.notifySubtreeAccessibilityStateChanged(object, object, n3);
                    }
                    catch (AbstractMethodError abstractMethodError) {
                        ViewParent viewParent = object.getParent();
                        viewParent.getClass();
                    }
                }
            }
        } else {
            context = AccessibilityEvent.obtain();
            if (n4 == 0) {
                n10 = 2048;
            }
            context.setEventType(n10);
            context.setContentChangeTypes(n3);
            if (n4 != 0) {
                List list = context.getText();
                charSequence = ViewCompat.e(object);
                list.add(charSequence);
                n3 = object.getImportantForAccessibility();
                if (n3 == 0) {
                    object.setImportantForAccessibility(n7);
                }
            }
            object.sendAccessibilityEventUnchecked((AccessibilityEvent)context);
        }
    }

    public static void l(int n3, View view) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 >= n7) {
            view.offsetLeftAndRight(n3);
        } else {
            int n8;
            Rect rect = ViewCompat.g();
            ViewParent viewParent = view.getParent();
            int n10 = viewParent instanceof View;
            if (n10 != 0) {
                ViewParent viewParent2 = viewParent;
                viewParent2 = (View)viewParent;
                n8 = viewParent2.getLeft();
                int n14 = viewParent2.getTop();
                int n15 = viewParent2.getRight();
                n10 = viewParent2.getBottom();
                rect.set(n8, n14, n15, n10);
                n10 = view.getLeft();
                n8 = view.getTop();
                n14 = view.getRight();
                n15 = view.getBottom();
                n10 = rect.intersects(n10, n8, n14, n15) ^ 1;
            } else {
                n10 = 0;
                Object var7_8 = null;
            }
            view.offsetLeftAndRight(n3);
            n3 = view.getVisibility();
            if (n3 == 0) {
                ViewCompat.x(view);
                ViewParent viewParent3 = view.getParent();
                n8 = viewParent3 instanceof View;
                if (n8 != 0) {
                    viewParent3 = (View)viewParent3;
                    ViewCompat.x((View)viewParent3);
                }
            }
            if (n10 != 0) {
                int n16;
                n3 = view.getLeft();
                n10 = view.getTop();
                if ((n3 = (int)(rect.intersect(n3, n10, n8 = view.getRight(), n16 = view.getBottom()) ? 1 : 0)) != 0) {
                    viewParent = (View)viewParent;
                    viewParent.invalidate(rect);
                }
            }
        }
    }

    public static void m(int n3, View view) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 >= n7) {
            view.offsetTopAndBottom(n3);
        } else {
            int n8;
            Rect rect = ViewCompat.g();
            ViewParent viewParent = view.getParent();
            int n10 = viewParent instanceof View;
            if (n10 != 0) {
                ViewParent viewParent2 = viewParent;
                viewParent2 = (View)viewParent;
                n8 = viewParent2.getLeft();
                int n14 = viewParent2.getTop();
                int n15 = viewParent2.getRight();
                n10 = viewParent2.getBottom();
                rect.set(n8, n14, n15, n10);
                n10 = view.getLeft();
                n8 = view.getTop();
                n14 = view.getRight();
                n15 = view.getBottom();
                n10 = rect.intersects(n10, n8, n14, n15) ^ 1;
            } else {
                n10 = 0;
                Object var7_8 = null;
            }
            view.offsetTopAndBottom(n3);
            n3 = view.getVisibility();
            if (n3 == 0) {
                ViewCompat.x(view);
                ViewParent viewParent3 = view.getParent();
                n8 = viewParent3 instanceof View;
                if (n8 != 0) {
                    viewParent3 = (View)viewParent3;
                    ViewCompat.x((View)viewParent3);
                }
            }
            if (n10 != 0) {
                int n16;
                n3 = view.getLeft();
                n10 = view.getTop();
                if ((n3 = (int)(rect.intersect(n3, n10, n8 = view.getRight(), n16 = view.getBottom()) ? 1 : 0)) != 0) {
                    viewParent = (View)viewParent;
                    viewParent.invalidate(rect);
                }
            }
        }
    }

    public static f n(View view, f f5) {
        WindowInsets windowInsets;
        boolean bl2;
        WindowInsets windowInsets2 = f5.g();
        if (windowInsets2 != null && !(bl2 = (windowInsets = ViewCompat$b.b(view, windowInsets2)).equals((Object)windowInsets2))) {
            return androidx.core.view.f.h(view, windowInsets);
        }
        return f5;
    }

    public static M60 o(View object, M60 m60) {
        Object object2 = "ViewCompat";
        int n3 = 3;
        int n4 = Log.isLoggable((String)object2, (int)n3);
        if (n4 != 0) {
            Objects.toString(m60);
            object.getClass();
            object.getId();
        }
        if ((n4 = Build.VERSION.SDK_INT) >= (n3 = 31)) {
            return ViewCompat$j.b(object, m60);
        }
        n4 = R$id.tag_on_receive_content_listener;
        object2 = (V82)object.getTag(n4);
        W82 w82 = f;
        if (object2 != null) {
            if ((m60 = object2.a((View)object, m60)) == null) {
                object = null;
            } else {
                n4 = object instanceof W82;
                if (n4 != 0) {
                    w82 = object;
                    w82 = (W82)object;
                }
                object = w82.onReceiveContent(m60);
            }
            return object;
        }
        n4 = object instanceof W82;
        if (n4 != 0) {
            w82 = object;
            w82 = (W82)object;
        }
        return w82.onReceiveContent(m60);
    }

    public static void p(int n3, View object) {
        int n4;
        object = ViewCompat.f((View)object);
        for (int i3 = 0; i3 < (n4 = object.size()); ++i3) {
            C2$a c2$a = (C2$a)object.get(i3);
            n4 = c2$a.a();
            if (n4 != n3) continue;
            object.remove(i3);
            break;
        }
    }

    public static void q(View view, C2$a object, String object2, E2 e2) {
        if (e2 == null && object2 == null) {
            int n3 = ((C2$a)object).a();
            ViewCompat.p(n3, view);
            ViewCompat.k(0, view);
        } else {
            int n4;
            int n7 = ((C2$a)object).b;
            Class clazz = ((C2$a)object).c;
            C2$a c2$a = new C2$a(null, n7, (CharSequence)object2, e2, clazz);
            object = ViewCompat.d(view);
            if (object == null) {
                n4 = 0;
                object = null;
            } else {
                boolean bl2 = object instanceof a$a;
                object = bl2 ? ((a$a)((Object)object)).a : (object2 = new a((View.AccessibilityDelegate)object));
            }
            if (object == null) {
                object = new a();
            }
            ViewCompat.s(view, (a)object);
            n4 = c2$a.a();
            ViewCompat.p(n4, view);
            object = ViewCompat.f(view);
            object.add(c2$a);
            ViewCompat.k(0, view);
        }
    }

    public static void r(View view, Context context, int[] nArray, AttributeSet attributeSet, TypedArray typedArray, int n3, int n4) {
        int n7 = Build.VERSION.SDK_INT;
        int n8 = 29;
        if (n7 >= n8) {
            ViewCompat$h.b(view, context, nArray, attributeSet, typedArray, n3, n4);
        }
    }

    public static void s(View view, a a2) {
        View.AccessibilityDelegate accessibilityDelegate;
        int n3;
        if (a2 == null && (n3 = (accessibilityDelegate = ViewCompat.d(view)) instanceof a$a) != 0) {
            a2 = new a();
        }
        if ((n3 = view.getImportantForAccessibility()) == 0) {
            n3 = 1;
            view.setImportantForAccessibility(n3);
        }
        a2 = a2 == null ? null : a2.getBridge();
        view.setAccessibilityDelegate((View.AccessibilityDelegate)a2);
    }

    /*
     * WARNING - void declaration
     */
    public static void t(View view, CharSequence object) {
        int bl2 = R$id.tag_accessibility_pane_title;
        int n3 = 28;
        Class<CharSequence> clazz = CharSequence.class;
        int n4 = 8;
        Object object2 = new ViewCompat$a(bl2, clazz, n4, n3);
        ((ViewCompat$a)object2).d(view, object);
        object2 = g;
        if (object != null) {
            void var3_8;
            Boolean bl3;
            int n7;
            object = ((ViewCompat$AccessibilityPaneVisibilityManager)object2).a;
            boolean bl4 = view.isShown();
            if (bl4 && (n7 = view.getWindowVisibility()) == 0) {
                boolean bl5 = true;
            } else {
                boolean bl6 = false;
                bl3 = null;
            }
            bl3 = (boolean)var3_8;
            ((WeakHashMap)object).put(view, bl3);
            view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object2);
            boolean bl7 = view.isAttachedToWindow();
            if (bl7) {
                view = view.getViewTreeObserver();
                view.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object2);
            }
        } else {
            object = ((ViewCompat$AccessibilityPaneVisibilityManager)object2).a;
            ((WeakHashMap)object).remove(view);
            view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)object2);
            view = view.getViewTreeObserver();
            view.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object2);
        }
    }

    public static void u(View view, ColorStateList colorStateList) {
        int n3 = Build.VERSION.SDK_INT;
        ViewCompat$c.k(view, colorStateList);
        int n4 = 21;
        if (n3 == n4) {
            colorStateList = view.getBackground();
            Object object = ViewCompat$c.c(view);
            if (object == null && (object = ViewCompat$c.d(view)) == null) {
                n3 = 0;
                object = null;
            } else {
                n3 = 1;
            }
            if (colorStateList != null && n3 != 0) {
                n3 = (int)(colorStateList.isStateful() ? 1 : 0);
                if (n3 != 0) {
                    object = view.getDrawableState();
                    colorStateList.setState((int[])object);
                }
                view.setBackground((Drawable)colorStateList);
            }
        }
    }

    public static void v(View view, Vv2 vv2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            vv2 = vv2 != null ? vv2.a : null;
            vv2 = DC3.a(vv2);
            ViewCompat$e.a(view, (PointerIcon)vv2);
        }
    }

    public static void w(View view, WindowInsetsAnimationCompat.b b2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        WindowInsetsAnimationCompat$c$a windowInsetsAnimationCompat$c$a = null;
        if (n3 >= n4) {
            if (b2 != null) {
                windowInsetsAnimationCompat$c$a = new WindowInsetsAnimationCompat$c$a(b2);
            }
            sg3_0.a(view, windowInsetsAnimationCompat$c$a);
        } else {
            Object object = WindowInsetsAnimationCompat$Impl21.e;
            n3 = R$id.tag_on_apply_window_listener;
            object = view.getTag(n3);
            if (b2 == null) {
                int n7 = R$id.tag_window_insets_animation_callback;
                view.setTag(n7, null);
                if (object == null) {
                    view.setOnApplyWindowInsetsListener(null);
                }
            } else {
                WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener windowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener = new WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener(view, b2);
                int n8 = R$id.tag_window_insets_animation_callback;
                view.setTag(n8, (Object)windowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener);
                if (object == null) {
                    view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)windowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener);
                }
            }
        }
    }

    public static void x(View view) {
        float f5 = view.getTranslationY();
        float f6 = 1.0f + f5;
        view.setTranslationY(f6);
        view.setTranslationY(f5);
    }
}

