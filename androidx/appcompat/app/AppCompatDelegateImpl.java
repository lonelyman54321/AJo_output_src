/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.UiModeManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.location.LocationManager
 *  android.media.AudioManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.util.AndroidRuntimeException
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 *  android.view.KeyCharacterMap
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory
 *  android.view.LayoutInflater$Factory2
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.Window$Callback
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow
 *  android.widget.TextView
 *  android.window.OnBackInvokedCallback
 *  android.window.OnBackInvokedDispatcher
 */
package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$style;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegateImpl$2;
import androidx.appcompat.app.AppCompatDelegateImpl$6;
import androidx.appcompat.app.AppCompatDelegateImpl$a;
import androidx.appcompat.app.AppCompatDelegateImpl$c;
import androidx.appcompat.app.AppCompatDelegateImpl$d;
import androidx.appcompat.app.AppCompatDelegateImpl$e;
import androidx.appcompat.app.AppCompatDelegateImpl$f;
import androidx.appcompat.app.AppCompatDelegateImpl$g;
import androidx.appcompat.app.AppCompatDelegateImpl$h;
import androidx.appcompat.app.AppCompatDelegateImpl$i;
import androidx.appcompat.app.AppCompatDelegateImpl$j;
import androidx.appcompat.app.AppCompatDelegateImpl$k;
import androidx.appcompat.app.AppCompatDelegateImpl$l;
import androidx.appcompat.app.AppCompatDelegateImpl$m;
import androidx.appcompat.app.AppCompatDelegateImpl$n;
import androidx.appcompat.app.ToolbarActionBar;
import androidx.appcompat.app.g;
import androidx.appcompat.app.g$c;
import androidx.appcompat.app.h;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.b$a;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d$a;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ContentFrameLayout$a;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.app.a;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$b;
import androidx.core.view.ViewCompat$c;
import androidx.lifecycle.i$b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class AppCompatDelegateImpl
extends g
implements d$a,
LayoutInflater.Factory2 {
    public static final boolean A0;
    public static final a53 y0;
    public static final int[] z0;
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public AppCompatDelegateImpl$m[] M;
    public AppCompatDelegateImpl$m N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Configuration S;
    public final int T;
    public int U;
    public int X;
    public boolean Y;
    public AppCompatDelegateImpl$k Z;
    public final Object j;
    public final Context k;
    public AppCompatDelegateImpl$i k0;
    public Window l;
    public AppCompatDelegateImpl$h m;
    public final Rm n;
    public ActionBar o;
    public vg3_1 p;
    public boolean p0;
    public CharSequence q;
    public int q0;
    public ij0 r;
    public final Runnable r0;
    public AppCompatDelegateImpl$c s;
    public boolean s0;
    public AppCompatDelegateImpl$n t;
    public Rect t0;
    public P2 u;
    public Rect u0;
    public ActionBarContextView v;
    public Hn v0;
    public PopupWindow w;
    public OnBackInvokedDispatcher w0;
    public Runnable x;
    public OnBackInvokedCallback x0;
    public zd3_1 y;
    public final boolean z;

    static {
        a53 a532;
        y0 = a532 = new a53();
        z0 = new int[]{16842836};
        String string2 = Build.FINGERPRINT;
        A0 = "robolectric".equals(string2) ^ true;
    }

    public AppCompatDelegateImpl(Context object, Window window, Rm object2, Object object3) {
        int n3;
        int n4;
        AppCompatActivity appCompatActivity = null;
        this.y = null;
        this.z = true;
        this.T = n4 = -100;
        AppCompatDelegateImpl$2 appCompatDelegateImpl$2 = new AppCompatDelegateImpl$2(this);
        this.r0 = appCompatDelegateImpl$2;
        this.k = object;
        this.n = object2;
        this.j = object3;
        int n7 = object3 instanceof Dialog;
        if (n7 != 0) {
            while (object != null) {
                n7 = object instanceof AppCompatActivity;
                if (n7 != 0) {
                    appCompatActivity = object;
                    appCompatActivity = (AppCompatActivity)object;
                    break;
                }
                n7 = object instanceof ContextWrapper;
                if (n7 == 0) break;
                object = ((ContextWrapper)object).getBaseContext();
            }
            if (appCompatActivity != null) {
                object = appCompatActivity.getDelegate();
                this.T = n3 = ((g)object).f();
            }
        }
        if ((n3 = this.T) == n4) {
            object = y0;
            object2 = this.j.getClass().getName();
            if ((object2 = (Integer)((a53)object).get(object2)) != null) {
                this.T = n7 = ((Integer)object2).intValue();
                object2 = this.j.getClass().getName();
                ((a53)object).remove(object2);
            }
        }
        if (window != null) {
            this.C(window);
        }
        qn.d();
    }

    public static jw1 D(Context object) {
        Object object2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        int n7 = 0;
        Locale locale = null;
        if (n3 >= n4) {
            return null;
        }
        Object object3 = androidx.appcompat.app.g.c;
        if (object3 == null) {
            return null;
        }
        object = AppCompatDelegateImpl.O(object.getApplicationContext().getResources().getConfiguration());
        n7 = 24;
        int n8 = 0;
        object3 = object3.a;
        if (n3 >= n7) {
            n3 = (int)(object3.isEmpty() ? 1 : 0);
            if (n3 != 0) {
                object2 = jw1.b;
            } else {
                object2 = new LinkedHashSet();
                while (true) {
                    n7 = object3.size();
                    nw1 nw12 = object.a;
                    int n10 = nw12.size() + n7;
                    if (n8 >= n10) break;
                    n7 = object3.size();
                    if (n8 < n7) {
                        locale = object3.get(n8);
                    } else {
                        n7 = object3.size();
                        n7 = n8 - n7;
                        nw12 = object.a;
                        locale = nw12.get(n7);
                    }
                    if (locale != null) {
                        object2.add(locale);
                    }
                    ++n8;
                }
                n4 = object2.size();
                object3 = new Locale[n4];
                object2 = jw1.a(object2.toArray((T[])object3));
            }
        } else {
            n3 = (int)(object3.isEmpty() ? 1 : 0);
            object2 = n3 != 0 ? jw1.b : jw1.b(AppCompatDelegateImpl$e.b(object3.get(0)));
        }
        object3 = ((jw1)object2).a;
        n4 = (int)(object3.isEmpty() ? 1 : 0);
        if (n4 == 0) {
            object = object2;
        }
        return object;
    }

    public static Configuration H(Context object, int n3, jw1 object2, Configuration configuration, boolean bl2) {
        int n4;
        int n7 = 1;
        if (n3 != n7) {
            n7 = 2;
            if (n3 != n7) {
                if (bl2) {
                    n4 = 0;
                    object = null;
                } else {
                    object = object.getApplicationContext().getResources().getConfiguration();
                    n4 = ((Configuration)object).uiMode & 0x30;
                }
            } else {
                n4 = 32;
            }
        } else {
            n4 = 16;
        }
        Configuration configuration2 = new Configuration();
        bl2 = false;
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        int n8 = configuration2.uiMode & 0xFFFFFFCF;
        configuration2.uiMode = n4 |= n8;
        if (object2 != null) {
            n4 = Build.VERSION.SDK_INT;
            n8 = 24;
            if (n4 >= n8) {
                AppCompatDelegateImpl$f.d(configuration2, (jw1)object2);
            } else {
                object = ((jw1)object2).a;
                object2 = object.get(0);
                configuration2.setLocale((Locale)object2);
                object = object.get(0);
                configuration2.setLayoutDirection((Locale)object);
            }
        }
        return configuration2;
    }

    public static jw1 O(Configuration configuration) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            return AppCompatDelegateImpl$f.b(configuration);
        }
        return jw1.b(AppCompatDelegateImpl$e.b(configuration.locale));
    }

    public final P2 A(P2$a object) {
        if (object != null) {
            Object object2 = this.u;
            if (object2 != null) {
                ((P2)object2).a();
            }
            object2 = new AppCompatDelegateImpl$d(this, (P2$a)object);
            this.Q();
            object = this.o;
            Rm rm = this.n;
            if (object != null) {
                this.u = object = ((ActionBar)object).z((AppCompatDelegateImpl$d)object2);
                if (object != null && rm != null) {
                    rm.onSupportActionModeStarted((P2)object);
                }
            }
            if ((object = this.u) == null) {
                Object object3;
                int n3;
                float f5;
                int n4;
                block27: {
                    object = this.y;
                    if (object != null) {
                        ((zd3_1)object).b();
                    }
                    if ((object = this.u) != null) {
                        ((P2)object).a();
                    }
                    n4 = 0;
                    f5 = 0.0f;
                    object = null;
                    if (rm != null && (n3 = this.R) == 0) {
                        try {
                            object3 = rm.onWindowStartingSupportActionMode((P2$a)object2);
                            break block27;
                        }
                        catch (AbstractMethodError abstractMethodError) {}
                    }
                    n3 = 0;
                    object3 = null;
                }
                if (object3 != null) {
                    this.u = object3;
                } else {
                    Object object4;
                    Object object5;
                    object3 = this.v;
                    boolean bl2 = true;
                    if (object3 == null) {
                        n3 = this.J;
                        if (n3 != 0) {
                            Object object6;
                            object3 = new TypedValue();
                            object5 = this.k;
                            object4 = object5.getTheme();
                            int n7 = R$attr.actionBarTheme;
                            object4.resolveAttribute(n7, (TypedValue)object3, bl2);
                            n7 = ((TypedValue)object3).resourceId;
                            if (n7 != 0) {
                                object6 = object5.getResources().newTheme();
                                object6.setTo((Resources.Theme)object4);
                                int n8 = ((TypedValue)object3).resourceId;
                                object6.applyStyle(n8, bl2);
                                object4 = new d80((Context)object5, 0);
                                ((d80)((Object)object4)).getTheme().setTo(object6);
                                object5 = object4;
                            }
                            object4 = new ActionBarContextView((Context)object5);
                            this.v = object4;
                            n7 = R$attr.actionModePopupWindowStyle;
                            object4 = new PopupWindow((Context)object5, null, n7);
                            this.w = object4;
                            Nw2.b((PopupWindow)object4, 2);
                            object4 = this.w;
                            object6 = this.v;
                            object4.setContentView((View)object6);
                            this.w.setWidth(-1);
                            object4 = object5.getTheme();
                            n7 = R$attr.actionBarSize;
                            object4.resolveAttribute(n7, (TypedValue)object3, bl2);
                            n3 = ((TypedValue)object3).data;
                            object5 = object5.getResources().getDisplayMetrics();
                            n3 = TypedValue.complexToDimensionPixelSize((int)n3, (DisplayMetrics)object5);
                            object5 = this.v;
                            ((ActionBarContextView)((Object)object5)).setContentHeight(n3);
                            object3 = this.w;
                            int n10 = -2;
                            object3.setHeight(n10);
                            this.x = object3 = new AppCompatDelegateImpl$6(this);
                        } else {
                            object3 = this.B;
                            int n14 = R$id.action_mode_bar_stub;
                            if ((object3 = (ViewStubCompat)object3.findViewById(n14)) != null) {
                                object5 = LayoutInflater.from((Context)this.M());
                                ((ViewStubCompat)((Object)object3)).setLayoutInflater((LayoutInflater)object5);
                                object3 = (ActionBarContextView)((ViewStubCompat)((Object)object3)).a();
                                this.v = object3;
                            }
                        }
                    }
                    if ((object3 = this.v) != null) {
                        object3 = this.y;
                        if (object3 != null) {
                            ((zd3_1)object3).b();
                        }
                        this.v.h();
                        object5 = this.v.getContext();
                        object4 = this.v;
                        object3 = new Object();
                        ((lb3_0)object3).c = object5;
                        ((lb3_0)object3).d = object4;
                        ((lb3_0)object3).e = object2;
                        object4 = object4.getContext();
                        object5 = new d((Context)object4);
                        ((lb3_0)object3).h = object5 = ((d)object5).setDefaultShowAsAction((int)(bl2 ? 1 : 0));
                        ((d)object5).setCallback((d$a)object3);
                        object2 = ((AppCompatDelegateImpl$d)object2).a;
                        boolean bl3 = object2.c((P2)object3, (Menu)object5);
                        if (bl3) {
                            ((lb3_0)object3).g();
                            object = this.v;
                            ((ActionBarContextView)((Object)object)).f((P2)object3);
                            this.u = object3;
                            n4 = this.A;
                            if (n4 == 0 || (object = this.B) == null || (n4 = (int)(object.isLaidOut() ? 1 : 0)) == 0) {
                                bl2 = false;
                            }
                            n4 = 1065353216;
                            f5 = 1.0f;
                            if (bl2) {
                                object2 = this.v;
                                n3 = 0;
                                object3 = null;
                                object2.setAlpha(0.0f);
                                object2 = ViewCompat.a((View)this.v);
                                ((zd3_1)object2).a(f5);
                                this.y = object2;
                                object = new ym_0(this);
                                ((zd3_1)object2).d((BD3)object);
                            } else {
                                object2 = this.v;
                                object2.setAlpha(f5);
                                this.v.setVisibility(0);
                                object = this.v.getParent();
                                n4 = object instanceof View;
                                if (n4 != 0) {
                                    object = (View)this.v.getParent();
                                    object2 = ViewCompat.a;
                                    ViewCompat$b.c((View)object);
                                }
                            }
                            object = this.w;
                            if (object != null) {
                                object = this.l.getDecorView();
                                object2 = this.x;
                                object.post((Runnable)object2);
                            }
                        } else {
                            this.u = null;
                        }
                    }
                }
                object = this.u;
                if (object != null && rm != null) {
                    rm.onSupportActionModeStarted((P2)object);
                }
                this.Y();
                this.u = object = this.u;
            }
            this.Y();
            return this.u;
        }
        object = new IllegalArgumentException("ActionMode callback can not be null.");
        throw object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean B(boolean var1_1, boolean var2_2) {
        block96: {
            block97: {
                block95: {
                    block99: {
                        block98: {
                            var3_3 = this;
                            var4_4 = this.R;
                            var5_5 = 0;
                            var6_6 = null;
                            if (var4_4 != 0) {
                                return false;
                            }
                            var4_4 = this.T;
                            var7_7 = -100;
                            if (var4_4 == var7_7) {
                                var4_4 = androidx.appcompat.app.g.b;
                            }
                            var8_8 = var3_3.k;
                            var9_9 = var3_3.S(var4_4, var8_8);
                            var10_10 = Build.VERSION.SDK_INT;
                            var11_11 = 33;
                            var12_12 = 0;
                            var13_13 /* !! */  = null;
                            if (var10_10 < var11_11) {
                                var14_14 = AppCompatDelegateImpl.D(var8_8);
                            } else {
                                var11_11 = 0;
                                var14_14 = null;
                            }
                            if (!var2_2 && var14_14 != null) {
                                var14_14 = AppCompatDelegateImpl.O(var8_8.getResources().getConfiguration());
                            }
                            var15_15 /* !! */  = AppCompatDelegateImpl.H(var8_8, var9_9, var14_14, null, false);
                            var16_16 = var3_3.Y;
                            var17_17 = 24;
                            var18_18 = 1;
                            var19_19 = var3_3.j;
                            if (var16_16 != 0 || (var16_16 = var19_19 instanceof Activity) == 0) ** GOTO lbl58
                            var20_20 = var8_8.getPackageManager();
                            if (var20_20 == null) {
                                var10_10 = 0;
                                var21_21 /* !! */  = null;
                            } else {
                                block92: {
                                    var22_22 = 29;
                                    if (var10_10 >= var22_22) {
                                        var10_10 = 0x100C0000;
                                    } else if (var10_10 >= var17_17) {
                                        var10_10 = 786432;
                                    } else {
                                        var10_10 = 0;
                                        var21_21 /* !! */  = null;
                                    }
                                    var24_24 = var19_19.getClass();
                                    var23_23 = new ComponentName(var8_8, var24_24);
                                    var21_21 /* !! */  = var20_20.getActivityInfo(var23_23, var10_10);
                                    if (var21_21 /* !! */  == null) break block92;
                                    var10_10 = var21_21 /* !! */ .configChanges;
                                    try {
                                        var3_3.X = var10_10;
                                    }
                                    catch (PackageManager.NameNotFoundException v0) {
                                        var3_3.X = 0;
                                    }
                                }
                                var3_3.Y = var18_18;
                                var10_10 = var3_3.X;
                            }
                            var20_20 = var3_3.S;
                            if (var20_20 == null) {
                                var20_20 = var8_8.getResources().getConfiguration();
                            }
                            var22_22 = var20_20.uiMode & 48;
                            var25_25 = var15_15 /* !! */ .uiMode & 48;
                            var20_20 = AppCompatDelegateImpl.O((Configuration)var20_20);
                            var26_26 = var14_14 == null ? null : AppCompatDelegateImpl.O(var15_15 /* !! */ );
                            if (var22_22 != var25_25) {
                                var22_22 = 512;
                            } else {
                                var22_22 = 0;
                                var23_23 = null;
                            }
                            if (var26_26 != null && (var16_16 = var20_20.equals(var26_26)) == 0) {
                                var22_22 |= 8196;
                            }
                            var16_16 = ~var10_10 & var22_22;
                            var18_18 = 28;
                            if (var16_16 == 0 || !var1_1 || (var16_16 = (int)var3_3.P) == 0 || (var16_16 = (int)AppCompatDelegateImpl.A0) == 0 && (var16_16 = (int)var3_3.Q) == 0 || (var16_16 = var19_19 instanceof Activity) == 0) ** GOTO lbl-1000
                            var20_20 = var19_19;
                            var20_20 = (Activity)var19_19;
                            var27_27 = var20_20.isChild();
                            if (!var27_27) {
                                var12_12 = Build.VERSION.SDK_INT;
                                var5_5 = 31;
                                if (var12_12 >= var5_5 && (var5_5 = var22_22 & 8192) != 0) {
                                    var6_6 = var20_20.getWindow().getDecorView();
                                    var28_28 = var15_15 /* !! */ .getLayoutDirection();
                                    var6_6.setLayoutDirection(var28_28);
                                }
                                if (var12_12 >= var18_18) {
                                    var20_20.recreate();
                                } else {
                                    var13_13 /* !! */  = var20_20.getMainLooper();
                                    var6_6 = new Handler((Looper)var13_13 /* !! */ );
                                    var13_13 /* !! */  = new a((Activity)var20_20);
                                    var6_6.post((Runnable)var13_13 /* !! */ );
                                }
                                var5_5 = 1;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var5_5 = 0;
                                var6_6 = null;
                            }
                            if (var5_5 != 0 || var22_22 == 0) break block97;
                            var5_5 = var22_22 & var10_10;
                            if (var5_5 == var22_22) {
                                var5_5 = 1;
                            } else {
                                var5_5 = 0;
                                var6_6 = null;
                            }
                            var21_21 /* !! */  = var8_8.getResources();
                            var15_15 /* !! */  = var21_21 /* !! */ .getConfiguration();
                            var13_13 /* !! */  = new Configuration(var15_15 /* !! */ );
                            var15_15 /* !! */  = var21_21 /* !! */ .getConfiguration();
                            var13_13 /* !! */ .uiMode = var28_28 = var15_15 /* !! */ .uiMode & -49 | var25_25;
                            if (var26_26 != null) {
                                var28_28 = Build.VERSION.SDK_INT;
                                if (var28_28 >= var17_17) {
                                    AppCompatDelegateImpl$f.d(var13_13 /* !! */ , var26_26);
                                } else {
                                    var15_15 /* !! */  = var26_26.a;
                                    var16_16 = 0;
                                    var20_20 = null;
                                    var24_24 = var15_15 /* !! */ .get(0);
                                    var13_13 /* !! */ .setLocale(var24_24);
                                    var15_15 /* !! */  = var15_15 /* !! */ .get(0);
                                    var13_13 /* !! */ .setLayoutDirection((Locale)var15_15 /* !! */ );
                                }
                            }
                            var15_15 /* !! */  = null;
                            var21_21 /* !! */ .updateConfiguration(var13_13 /* !! */ , null);
                            var16_16 = Build.VERSION.SDK_INT;
                            var25_25 = 26;
                            var28_28 = 23;
                            if (var16_16 >= var25_25 || var16_16 >= var18_18) ** GOTO lbl240
                            var29_29 = "mDrawableCache";
                            var24_24 = Resources.class;
                            if (var16_16 < var17_17) break block98;
                            var16_16 = (int)ZK2.h;
                            if (var16_16 != 0) ** GOTO lbl148
                            var20_20 = "mResourcesImpl";
                            var20_20 = var24_24.getDeclaredField((String)var20_20);
                            ZK2.g = var20_20;
                            var25_25 = 1;
                            var20_20.setAccessible((boolean)var25_25);
                            catch (NoSuchFieldException v1) {
                                var25_25 = 1;
                            }
lbl146:
                            // 2 sources

                            while (true) {
                                ZK2.h = var25_25;
lbl148:
                                // 2 sources

                                if ((var20_20 = ZK2.g) == null) ** GOTO lbl240
                                try {
                                    var21_21 /* !! */  = var20_20.get(var21_21 /* !! */ );
                                }
                                catch (IllegalAccessException v2) {
                                    var10_10 = 0;
                                    var21_21 /* !! */  = null;
                                }
                                if (var21_21 /* !! */  == null) ** GOTO lbl240
                                var16_16 = ZK2.b;
                                if (var16_16 != 0) ** GOTO lbl172
                                var20_20 = var21_21 /* !! */ .getClass();
                                var20_20 = var20_20.getDeclaredField(var29_29);
                                ZK2.a = var20_20;
                                var18_18 = 1;
                                var20_20.setAccessible((boolean)var18_18);
                                catch (NoSuchFieldException v3) {
                                    var18_18 = 1;
                                }
lbl170:
                                // 2 sources

                                while (true) {
                                    block93: {
                                        ZK2.b = var18_18;
lbl172:
                                        // 2 sources

                                        if ((var20_20 = ZK2.a) != null) {
                                            try {
                                                var30_30 = var21_21 /* !! */  = var20_20.get(var21_21 /* !! */ );
                                                break block93;
                                            }
                                            catch (IllegalAccessException v4) {}
                                        }
                                        var27_27 = false;
                                        var30_30 = null;
                                    }
                                    if (var30_30 != null) {
                                        ZK2.a(var30_30);
                                    }
                                    ** GOTO lbl240
                                    break;
                                }
                                break;
                            }
                        }
                        if (var16_16 < var28_28) break block99;
                        var16_16 = (int)ZK2.b;
                        if (var16_16 != 0) ** GOTO lbl199
                        var20_20 = var24_24.getDeclaredField(var29_29);
                        ZK2.a = var20_20;
                        var18_18 = 1;
                        var20_20.setAccessible((boolean)var18_18);
                        catch (NoSuchFieldException v5) {
                            var18_18 = 1;
                        }
lbl197:
                        // 2 sources

                        while (true) {
                            block94: {
                                ZK2.b = var18_18;
lbl199:
                                // 2 sources

                                if ((var20_20 = ZK2.a) != null) {
                                    try {
                                        var21_21 /* !! */  = var20_20.get(var21_21 /* !! */ );
                                        var30_31 /* !! */  = var21_21 /* !! */ ;
                                        break block94;
                                    }
                                    catch (IllegalAccessException v6) {}
                                }
                                var27_27 = false;
                                var30_31 /* !! */  = null;
                            }
                            if (var30_31 /* !! */  != null) {
                                ZK2.a(var30_31 /* !! */ );
                            }
                            ** GOTO lbl240
                            break;
                        }
                    }
                    var16_16 = (int)ZK2.b;
                    if (var16_16 != 0) ** GOTO lbl229
                    var20_20 = var24_24.getDeclaredField(var29_29);
                    ZK2.a = var20_20;
                    var18_18 = 1;
                    try {
                        var20_20.setAccessible((boolean)var18_18);
                        break block95;
                    }
                    catch (NoSuchFieldException v7) {
                        ** continue;
                    }
                    catch (NoSuchFieldException v8) {
                        var18_18 = 1;
                    }
                }
lbl227:
                // 2 sources

                while (true) {
                    ZK2.b = var18_18;
lbl229:
                    // 2 sources

                    if ((var20_20 = ZK2.a) != null) {
                        var21_21 /* !! */  = var20_20.get(var21_21 /* !! */ );
                        try {
                            var30_32 = var21_21 /* !! */  = (Map)var21_21 /* !! */ ;
                        }
                        catch (IllegalAccessException v9) {
                            var27_27 = false;
                            var30_32 = null;
                        }
                        if (var30_32 != null) {
                            var30_32.clear();
                        }
                    }
lbl240:
                    // 10 sources

                    if ((var10_10 = var3_3.U) == 0) ** GOTO lbl-1000
                    var8_8.setTheme(var10_10);
                    var10_10 = Build.VERSION.SDK_INT;
                    if (var10_10 >= var28_28) {
                        var21_21 /* !! */  = var8_8.getTheme();
                        var28_28 = var3_3.U;
                        var16_16 = 1;
                        var21_21 /* !! */ .applyStyle(var28_28, (boolean)var16_16);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var16_16 = 1;
                    }
                    if (var5_5 != 0 && (var5_5 = var19_19 instanceof Activity) != 0) {
                        var6_6 = var19_19;
                        var6_6 = (Activity)var19_19;
                        var10_10 = var6_6 instanceof mu1_1;
                        if (var10_10 != 0) {
                            var21_21 /* !! */  = var6_6;
                            var21_21 /* !! */  = ((mu1_1)var6_6).getLifecycle().b();
                            var10_10 = var21_21 /* !! */ .isAtLeast((i$b)(var15_15 /* !! */  = i$b.CREATED));
                            if (var10_10 != 0) {
                                ((Activity)var6_6).onConfigurationChanged(var13_13 /* !! */ );
                            }
                        } else {
                            var10_10 = (int)var3_3.Q;
                            if (var10_10 != 0 && (var10_10 = var3_3.R) == 0) {
                                var6_6.onConfigurationChanged(var13_13 /* !! */ );
                            }
                        }
                    }
                    var18_18 = 1;
                    break block96;
                    break;
                }
            }
            var18_18 = var5_5;
        }
        if (var18_18 != 0 && (var5_5 = var19_19 instanceof AppCompatActivity) != 0) {
            var5_5 = var22_22 & 512;
            if (var5_5 != 0) {
                var6_6 = var19_19;
                var6_6 = (AppCompatActivity)var19_19;
                var6_6.onNightModeChanged(var9_9);
            }
            if ((var5_5 = var22_22 & 4) != 0) {
                var19_19 = (AppCompatActivity)var19_19;
                var19_19.onLocalesChanged(var14_14);
            }
        }
        if (var26_26 != null) {
            var6_6 = AppCompatDelegateImpl.O(var8_8.getResources().getConfiguration());
            var9_9 = Build.VERSION.SDK_INT;
            if (var9_9 >= var17_17) {
                AppCompatDelegateImpl$f.c((jw1)var6_6);
            } else {
                var6_6 = var6_6.a;
                var9_9 = 0;
                var6_6 = var6_6.get(0);
                Locale.setDefault((Locale)var6_6);
            }
        }
        if (var4_4 == 0) {
            var6_6 = var3_3.N(var8_8);
            var6_6.e();
        } else {
            var6_6 = var3_3.Z;
            if (var6_6 != null) {
                var6_6.a();
            }
        }
        var5_5 = 3;
        if (var4_4 == var5_5) {
            var31_33 = var3_3.k0;
            if (var31_33 == null) {
                var3_3.k0 = var31_33 = new AppCompatDelegateImpl$i(var3_3, var8_8);
            }
            var31_33 = var3_3.k0;
            var31_33.e();
        } else {
            var31_34 = var3_3.k0;
            if (var31_34 != null) {
                var31_34.a();
            }
        }
        return (boolean)var18_18;
        catch (NoSuchFieldException v10) {}
        ** while (true)
        catch (NoSuchFieldException v11) {}
        ** while (true)
        catch (NoSuchFieldException v12) {}
        ** while (true)
    }

    public final void C(Window object) {
        Object object2 = this.l;
        Object object3 = "AppCompat has already installed itself into the Window";
        if (object2 == null) {
            object2 = object.getCallback();
            boolean bl2 = object2 instanceof AppCompatDelegateImpl$h;
            if (!bl2) {
                this.m = object3 = new AppCompatDelegateImpl$h(this, (Window.Callback)object2);
                object.setCallback((Window.Callback)object3);
                object2 = this.k;
                object3 = z0;
                bl2 = false;
                object2 = Tn3.e((Context)object2, null, (int[])object3);
                object3 = ((Tn3)object2).c(0);
                if (object3 != null) {
                    object.setBackgroundDrawable((Drawable)object3);
                }
                ((Tn3)object2).g();
                this.l = object;
                int n3 = Build.VERSION.SDK_INT;
                int n4 = 33;
                if (n3 >= n4 && (object = this.w0) == null) {
                    if (object != null && (object2 = this.x0) != null) {
                        AppCompatDelegateImpl$g.c(object, object2);
                        this.x0 = null;
                    }
                    if ((n4 = (object = this.j) instanceof Activity) != 0 && (object2 = (object = (Activity)object).getWindow()) != null) {
                        object = AppCompatDelegateImpl$g.a((Activity)object);
                        this.w0 = object;
                    } else {
                        this.w0 = null;
                    }
                    this.Y();
                }
                return;
            }
            object = new IllegalStateException((String)object3);
            throw object;
        }
        object = new IllegalStateException((String)object3);
        throw object;
    }

    public final void E(int n3, AppCompatDelegateImpl$m object, d d2) {
        boolean bl2;
        Window.Callback callback2;
        int n4;
        if (d2 == null) {
            if (object == null && n3 >= 0 && n3 < (n4 = ((AppCompatDelegateImpl$m[])(callback2 = this.M)).length)) {
                object = callback2[n3];
            }
            if (object != null) {
                d2 = ((AppCompatDelegateImpl$m)object).h;
            }
        }
        if (object != null && !(bl2 = ((AppCompatDelegateImpl$m)object).m)) {
            return;
        }
        bl2 = this.R;
        if (!bl2) {
            object = this.m;
            callback2 = this.l.getCallback();
            object.getClass();
            n4 = 1;
            try {
                ((AppCompatDelegateImpl$h)object).e = n4;
                callback2.onPanelClosed(n3, (Menu)d2);
            }
            finally {
                ((AppCompatDelegateImpl$h)object).e = false;
            }
        }
    }

    public final void F(d d2) {
        int n3;
        boolean bl2 = this.L;
        if (bl2) {
            return;
        }
        this.L = bl2 = true;
        this.r.g();
        Window.Callback callback2 = this.l.getCallback();
        if (callback2 != null && (n3 = this.R) == 0) {
            n3 = 108;
            callback2.onPanelClosed(n3, (Menu)d2);
        }
        this.L = false;
    }

    public final void G(AppCompatDelegateImpl$m object, boolean bl2) {
        int n3;
        boolean bl3;
        AppCompatDelegateImpl$l appCompatDelegateImpl$l;
        boolean bl4;
        Object object2;
        int n4;
        if (bl2 && (n4 = ((AppCompatDelegateImpl$m)object).a) == 0 && (object2 = this.r) != null && (n4 = (int)(object2.d() ? 1 : 0)) != 0) {
            object = ((AppCompatDelegateImpl$m)object).h;
            this.F((d)object);
            return;
        }
        object2 = (WindowManager)this.k.getSystemService("window");
        if (object2 != null && (bl4 = ((AppCompatDelegateImpl$m)object).m) && (appCompatDelegateImpl$l = ((AppCompatDelegateImpl$m)object).e) != null) {
            object2.removeView((View)appCompatDelegateImpl$l);
            if (bl2) {
                int n7 = ((AppCompatDelegateImpl$m)object).a;
                this.E(n7, (AppCompatDelegateImpl$m)object, null);
            }
        }
        ((AppCompatDelegateImpl$m)object).k = false;
        ((AppCompatDelegateImpl$m)object).l = false;
        ((AppCompatDelegateImpl$m)object).m = false;
        ((AppCompatDelegateImpl$m)object).f = null;
        ((AppCompatDelegateImpl$m)object).n = bl3 = true;
        AppCompatDelegateImpl$m appCompatDelegateImpl$m = this.N;
        if (appCompatDelegateImpl$m == object) {
            this.N = null;
        }
        if ((n3 = ((AppCompatDelegateImpl$m)object).a) == 0) {
            this.Y();
        }
    }

    /*
     * Unable to fully structure code
     */
    public final boolean I(KeyEvent var1_1) {
        block18: {
            block22: {
                block25: {
                    block26: {
                        block23: {
                            block24: {
                                block19: {
                                    block21: {
                                        block20: {
                                            var2_3 = this.j;
                                            var3_4 = var2_3 instanceof zn1$a_0;
                                            var4_5 = true;
                                            if ((var3_4 || (var5_6 = var2_3 instanceof on) != 0) && (var2_3 = this.l.getDecorView()) != null && (var5_6 = (int)zn1_0.a((View)var2_3, (KeyEvent)var1_1)) != 0) {
                                                return var4_5;
                                            }
                                            var5_6 = var1_1.getKeyCode();
                                            var3_4 = false;
                                            var6_7 = 82;
                                            if (var5_6 == var6_7) {
                                                var2_3 = this.m;
                                                var7_8 = this.l.getCallback();
                                                var2_3.getClass();
                                                try {
                                                    var2_3.d = var4_5;
                                                    var8_9 = (int)var7_8.dispatchKeyEvent((KeyEvent)var1_1);
                                                    if (var8_9 != 0) {
                                                        return var4_5;
                                                    }
                                                }
                                                finally {
                                                    var2_3.d = false;
                                                }
                                            }
                                            var5_6 = var1_1.getKeyCode();
                                            var8_9 = var1_1.getAction();
                                            var9_10 = 4;
                                            if (var8_9 != 0) break block19;
                                            if (var5_6 == var9_10) break block20;
                                            if (var5_6 != var6_7) break block21;
                                            var5_6 = var1_1.getRepeatCount();
                                            if (var5_6 == 0) {
                                                var2_3 = this.P(0);
                                                var3_4 = var2_3.m;
                                                if (!var3_4) {
                                                    this.W((AppCompatDelegateImpl$m)var2_3, (KeyEvent)var1_1);
                                                }
                                            }
                                            break block18;
                                        }
                                        var10_11 = var1_1.getFlags() & 128;
                                        if (var10_11 == 0) {
                                            var4_5 = false;
                                        }
                                        this.O = var4_5;
                                    }
lbl44:
                                    // 3 sources

                                    while (true) {
                                        var4_5 = false;
                                        break block18;
                                        break;
                                    }
                                }
                                if (var5_6 == var9_10) break block22;
                                if (var5_6 != var6_7) ** GOTO lbl44
                                var2_3 = this.u;
                                if (var2_3 != null) break block18;
                                var2_3 = this.P(0);
                                var11_14 = this.r;
                                var7_8 = this.k;
                                if (var11_14 == null || (var6_7 = (int)var11_14.a()) == 0 || (var6_7 = (int)(var11_14 = ViewConfiguration.get((Context)var7_8)).hasPermanentMenuKey()) != 0) break block23;
                                var11_14 = this.r;
                                var6_7 = (int)var11_14.d();
                                if (var6_7 != 0) break block24;
                                var6_7 = (int)this.R;
                                if (var6_7 != 0 || (var10_12 = (int)this.W((AppCompatDelegateImpl$m)var2_3, (KeyEvent)var1_1)) == 0) ** GOTO lbl-1000
                                var1_1 = this.r;
                                var10_12 = (int)var1_1.c();
                                break block25;
                            }
                            var1_1 = this.r;
                            var10_12 = (int)var1_1.b();
                            break block25;
                        }
                        var6_7 = (int)var2_3.m;
                        if (var6_7 != 0 || (var9_10 = (int)var2_3.l) != 0) break block26;
                        var6_7 = (int)var2_3.k;
                        if (var6_7 == 0) ** GOTO lbl-1000
                        var6_7 = (int)var2_3.o;
                        if (var6_7 != 0) {
                            var2_3.k = false;
                            var6_7 = (int)this.W((AppCompatDelegateImpl$m)var2_3, (KeyEvent)var1_1);
                        } else {
                            var6_7 = 1;
                        }
                        if (var6_7 != 0) {
                            this.U((AppCompatDelegateImpl$m)var2_3, (KeyEvent)var1_1);
                            var10_12 = 1;
                        } else lbl-1000:
                        // 3 sources

                        {
                            var10_12 = 0;
                            var1_1 = null;
                        }
                        break block25;
                    }
                    this.G((AppCompatDelegateImpl$m)var2_3, var4_5);
                    var10_12 = var6_7;
                }
                if (var10_12 != 0) {
                    var1_1 = var7_8.getApplicationContext();
                    var2_3 = "audio";
                    if ((var1_1 = (AudioManager)var1_1.getSystemService((String)var2_3)) != null) {
                        var1_1.playSoundEffect(0);
                    }
                }
                break block18;
            }
            var10_13 = this.T();
            if (var10_13) ** break;
            ** while (true)
        }
        return var4_5;
    }

    public final void J(int n3) {
        ij0 ij02;
        boolean bl2;
        AppCompatDelegateImpl$m appCompatDelegateImpl$m = this.P(n3);
        d d2 = appCompatDelegateImpl$m.h;
        if (d2 != null) {
            d2 = new Bundle();
            d d5 = appCompatDelegateImpl$m.h;
            d5.saveActionViewStates((Bundle)d2);
            int n4 = d2.size();
            if (n4 > 0) {
                appCompatDelegateImpl$m.p = d2;
            }
            appCompatDelegateImpl$m.h.stopDispatchingItemsChanged();
            d2 = appCompatDelegateImpl$m.h;
            d2.clear();
        }
        appCompatDelegateImpl$m.o = bl2 = true;
        appCompatDelegateImpl$m.n = bl2;
        int n7 = 108;
        if ((n3 == n7 || n3 == 0) && (ij02 = this.r) != null) {
            appCompatDelegateImpl$m = this.P(0);
            appCompatDelegateImpl$m.k = false;
            n3 = 0;
            ij02 = null;
            this.W(appCompatDelegateImpl$m, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void K() {
        Object object;
        int n3;
        Object object2;
        int n4;
        int n7;
        boolean bl2;
        int n8;
        int n10;
        Object object3;
        Object object4;
        block33: {
            block37: {
                block35: {
                    int n14;
                    block36: {
                        n14 = this.A;
                        if (n14 != 0) return;
                        object4 = R$styleable.AppCompatTheme;
                        object3 = this.k;
                        object4 = object3.obtainStyledAttributes((int[])object4);
                        n10 = R$styleable.AppCompatTheme_windowActionBar;
                        if ((n10 = (int)(object4.hasValue(n10) ? 1 : 0)) == 0) {
                            object4.recycle();
                            object4 = new IllegalStateException;
                            ((IllegalStateException)object4)("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
                            throw object4;
                        }
                        n10 = R$styleable.AppCompatTheme_windowNoTitle;
                        n10 = (int)(object4.getBoolean(n10, false) ? 1 : 0);
                        n8 = 108;
                        bl2 = true;
                        if (n10 != 0) {
                            this.t((int)(bl2 ? 1 : 0));
                        } else {
                            n10 = R$styleable.AppCompatTheme_windowActionBar;
                            if ((n10 = (int)(object4.getBoolean(n10, false) ? 1 : 0)) != 0) {
                                this.t(n8);
                            }
                        }
                        n10 = R$styleable.AppCompatTheme_windowActionBarOverlay;
                        n10 = (int)(object4.getBoolean(n10, false) ? 1 : 0);
                        n7 = 109;
                        if (n10 != 0) {
                            this.t(n7);
                        }
                        n10 = R$styleable.AppCompatTheme_windowActionModeOverlay;
                        if ((n10 = (int)(object4.getBoolean(n10, false) ? 1 : 0)) != 0) {
                            n10 = 10;
                            this.t(n10);
                        }
                        n10 = R$styleable.AppCompatTheme_android_windowIsFloating;
                        n10 = (int)(object4.getBoolean(n10, false) ? 1 : 0);
                        this.J = n10;
                        object4.recycle();
                        this.L();
                        this.l.getDecorView();
                        object4 = LayoutInflater.from((Context)object3);
                        n10 = (int)(this.K ? 1 : 0);
                        n4 = 0;
                        if (n10 != 0) break block35;
                        n10 = (int)(this.J ? 1 : 0);
                        if (n10 == 0) break block36;
                        n10 = R$layout.abc_dialog_title_material;
                        object4 = (ViewGroup)object4.inflate(n10, null);
                        this.H = false;
                        this.G = false;
                        break block37;
                    }
                    n14 = this.G;
                    if (n14 != 0) {
                        object4 = new TypedValue;
                        object4();
                        object2 = object3.getTheme();
                        n3 = R$attr.actionBarTheme;
                        object2.resolveAttribute(n3, (TypedValue)object4, bl2);
                        n10 = ((TypedValue)object4).resourceId;
                        if (n10 != 0) {
                            n14 = ((TypedValue)object4).resourceId;
                            object2 = new d80((Context)object3, n14);
                        } else {
                            object2 = object3;
                        }
                        object4 = LayoutInflater.from((Context)object2);
                        n10 = R$layout.abc_screen_toolbar;
                        object4 = (ViewGroup)object4.inflate(n10, null);
                        n10 = R$id.decor_content_parent;
                        object2 = (ij0)object4.findViewById(n10);
                        this.r = object2;
                        Window.Callback callback2 = this.l.getCallback();
                        object2.setWindowCallback(callback2);
                        n10 = this.H;
                        if (n10 != 0) {
                            object2 = this.r;
                            object2.f(n7);
                        }
                        if ((n10 = this.E) != 0) {
                            object2 = this.r;
                            n7 = 2;
                            object2.f(n7);
                        }
                        if ((n10 = this.F) != 0) {
                            object2 = this.r;
                            n7 = 5;
                            object2.f(n7);
                        }
                        break block37;
                    } else {
                        n14 = 0;
                        object4 = null;
                    }
                    break block37;
                }
                n10 = (int)(this.I ? 1 : 0);
                if (n10 != 0) {
                    n10 = R$layout.abc_screen_simple_overlay_action_mode;
                    object4 = (ViewGroup)object4.inflate(n10, null);
                } else {
                    n10 = R$layout.abc_screen_simple;
                    object4 = (ViewGroup)object4.inflate(n10, null);
                }
            }
            if (object4 == null) {
                object4 = new IllegalArgumentException;
                object3 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                n10 = (int)(this.G ? 1 : 0);
                ((StringBuilder)object3).append(n10 != 0);
                ((StringBuilder)object3).append(", windowActionBarOverlay: ");
                n10 = (int)(this.H ? 1 : 0);
                ((StringBuilder)object3).append(n10 != 0);
                ((StringBuilder)object3).append(", android:windowIsFloating: ");
                n10 = (int)(this.J ? 1 : 0);
                ((StringBuilder)object3).append(n10 != 0);
                ((StringBuilder)object3).append(", windowActionModeOverlay: ");
                n10 = this.I;
                ((StringBuilder)object3).append(n10 != 0);
                ((StringBuilder)object3).append(", windowNoTitle: ");
                n10 = this.K;
                object3 = Vm.a(" }", n10 != 0, (StringBuilder)object3);
                ((IllegalArgumentException)object4)((String)object3);
                throw object4;
            }
            object2 = new wm_0(this);
            object = ViewCompat.a;
            ViewCompat$c.o((View)object4, (T72)object2);
            object2 = this.r;
            if (object2 == null) {
                n10 = R$id.title;
                object2 = (TextView)object4.findViewById(n10);
                this.C = object2;
            }
            n10 = (int)(dE3.a ? 1 : 0);
            object2 = object4.getClass();
            object = "makeOptionalFitsSystemWindows";
            object2 = object2.getMethod((String)object, null);
            n7 = (int)(object2.isAccessible() ? 1 : 0);
            if (n7 != 0) break block33;
            object2.setAccessible(bl2);
        }
        try {
            object2.invoke(object4, null);
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {}
        n10 = R$id.action_bar_activity_content;
        object2 = (ContentFrameLayout)object4.findViewById(n10);
        object = this.l;
        n3 = 0x1020002;
        object = (ViewGroup)object.findViewById(n3);
        if (object != null) {
            int n15;
            while ((n15 = object.getChildCount()) > 0) {
                View view = object.getChildAt(0);
                object.removeViewAt(0);
                object2.addView(view);
            }
            object.setId(-1);
            object2.setId(n3);
            n15 = object instanceof FrameLayout;
            if (n15 != 0) {
                object = (FrameLayout)object;
                object.setForeground(null);
            }
        }
        this.l.setContentView((View)object4);
        object = new xm_0(this);
        object2.setAttachListener((ContentFrameLayout$a)object);
        this.B = (ViewGroup)object4;
        object4 = this.j;
        n10 = object4 instanceof Activity;
        object4 = n10 != 0 ? (Object)((Activity)object4).getTitle() : (Object)this.q;
        n10 = TextUtils.isEmpty((CharSequence)object4);
        if (n10 == 0) {
            object2 = this.r;
            if (object2 != null) {
                object2.setWindowTitle((CharSequence)object4);
            } else {
                object2 = this.o;
                if (object2 != null) {
                    object2.y((CharSequence)object4);
                } else {
                    object2 = this.C;
                    if (object2 != null) {
                        object2.setText((CharSequence)object4);
                    }
                }
            }
        }
        object4 = (Object)((ContentFrameLayout)this.B.findViewById(n3));
        object2 = this.l.getDecorView();
        n7 = object2.getPaddingLeft();
        n4 = object2.getPaddingTop();
        n3 = object2.getPaddingRight();
        n10 = object2.getPaddingBottom();
        ((ContentFrameLayout)((Object)object4)).setDecorPadding(n7, n4, n3, n10);
        object2 = R$styleable.AppCompatTheme;
        object3 = object3.obtainStyledAttributes((int[])object2);
        n10 = R$styleable.AppCompatTheme_windowMinWidthMajor;
        object = ((ContentFrameLayout)((Object)object4)).getMinWidthMajor();
        object3.getValue(n10, (TypedValue)object);
        n10 = R$styleable.AppCompatTheme_windowMinWidthMinor;
        object = ((ContentFrameLayout)((Object)object4)).getMinWidthMinor();
        object3.getValue(n10, (TypedValue)object);
        n10 = R$styleable.AppCompatTheme_windowFixedWidthMajor;
        n10 = (int)(object3.hasValue(n10) ? 1 : 0);
        if (n10 != 0) {
            n10 = R$styleable.AppCompatTheme_windowFixedWidthMajor;
            object = ((ContentFrameLayout)((Object)object4)).getFixedWidthMajor();
            object3.getValue(n10, (TypedValue)object);
        }
        n10 = R$styleable.AppCompatTheme_windowFixedWidthMinor;
        if ((n10 = (int)(object3.hasValue(n10) ? 1 : 0)) != 0) {
            n10 = R$styleable.AppCompatTheme_windowFixedWidthMinor;
            object = ((ContentFrameLayout)((Object)object4)).getFixedWidthMinor();
            object3.getValue(n10, (TypedValue)object);
        }
        n10 = R$styleable.AppCompatTheme_windowFixedHeightMajor;
        if ((n10 = (int)(object3.hasValue(n10) ? 1 : 0)) != 0) {
            n10 = R$styleable.AppCompatTheme_windowFixedHeightMajor;
            object = ((ContentFrameLayout)((Object)object4)).getFixedHeightMajor();
            object3.getValue(n10, (TypedValue)object);
        }
        n10 = R$styleable.AppCompatTheme_windowFixedHeightMinor;
        if ((n10 = (int)(object3.hasValue(n10) ? 1 : 0)) != 0) {
            n10 = R$styleable.AppCompatTheme_windowFixedHeightMinor;
            object = ((ContentFrameLayout)((Object)object4)).getFixedHeightMinor();
            object3.getValue(n10, (TypedValue)object);
        }
        object3.recycle();
        object4.requestLayout();
        this.A = bl2;
        object4 = this.P(0);
        boolean bl3 = this.R;
        if (bl3) return;
        object4 = ((AppCompatDelegateImpl$m)object4).h;
        if (object4 != null) return;
        this.R(n8);
    }

    public final void L() {
        boolean bl2;
        Object object = this.l;
        if (object == null && (bl2 = (object = this.j) instanceof Activity)) {
            object = ((Activity)object).getWindow();
            this.C((Window)object);
        }
        if ((object = this.l) != null) {
            return;
        }
        object = new IllegalStateException("We have not been given a Window");
        throw object;
    }

    public final Context M() {
        this.Q();
        ActionBar actionBar = this.o;
        actionBar = actionBar != null ? actionBar.e() : null;
        if (actionBar == null) {
            actionBar = this.k;
        }
        return actionBar;
    }

    public final AppCompatDelegateImpl$j N(Context object) {
        AppCompatDelegateImpl$k appCompatDelegateImpl$k = this.Z;
        if (appCompatDelegateImpl$k == null) {
            Ss3 ss3 = Ss3.d;
            if (ss3 == null) {
                object = object.getApplicationContext();
                LocationManager locationManager = (LocationManager)object.getSystemService("location");
                Ss3.d = ss3 = new Ss3((Context)object, locationManager);
            }
            object = Ss3.d;
            this.Z = appCompatDelegateImpl$k = new AppCompatDelegateImpl$k(this, (Ss3)object);
        }
        return this.Z;
    }

    public final AppCompatDelegateImpl$m P(int n3) {
        Object object;
        int n4;
        AppCompatDelegateImpl$m[] appCompatDelegateImpl$mArray = this.M;
        if (appCompatDelegateImpl$mArray == null || (n4 = appCompatDelegateImpl$mArray.length) <= n3) {
            n4 = n3 + 1;
            object = new AppCompatDelegateImpl$m[n4];
            if (appCompatDelegateImpl$mArray != null) {
                int n7 = appCompatDelegateImpl$mArray.length;
                System.arraycopy(appCompatDelegateImpl$mArray, 0, object, 0, n7);
            }
            this.M = object;
            appCompatDelegateImpl$mArray = object;
        }
        if ((object = appCompatDelegateImpl$mArray[n3]) == null) {
            object = new Object();
            object.a = n3;
            object.n = false;
            appCompatDelegateImpl$mArray[n3] = object;
        }
        return object;
    }

    public final void Q() {
        Object object;
        this.K();
        boolean bl2 = this.G;
        if (bl2 && (object = this.o) == null) {
            object = this.j;
            boolean bl3 = object instanceof Activity;
            if (bl3) {
                object = (Activity)object;
                boolean bl4 = this.H;
                h h3 = new h(bl4, (Activity)object);
                this.o = h3;
            } else {
                bl3 = object instanceof Dialog;
                if (bl3) {
                    object = (Dialog)object;
                    h h5 = new h((Dialog)object);
                    this.o = h5;
                }
            }
            object = this.o;
            if (object != null) {
                bl3 = this.s0;
                ((ActionBar)object).m(bl3);
            }
        }
    }

    public final void R(int n3) {
        int n4 = this.q0;
        int n7 = 1;
        this.q0 = n3 = n7 << n3 | n4;
        n3 = (int)(this.p0 ? 1 : 0);
        if (n3 == 0) {
            View view = this.l.getDecorView();
            Runnable runnable2 = this.r0;
            view.postOnAnimation(runnable2);
            this.p0 = n7;
        }
    }

    public final int S(int n3, Context context) {
        int n4 = -100;
        int n7 = -1;
        if (n3 != n4) {
            if (n3 != n7) {
                if (n3 != 0) {
                    n4 = 1;
                    if (n3 != n4 && n3 != (n4 = 2)) {
                        n4 = 3;
                        if (n3 == n4) {
                            AppCompatDelegateImpl$i appCompatDelegateImpl$i = this.k0;
                            if (appCompatDelegateImpl$i == null) {
                                this.k0 = appCompatDelegateImpl$i = new AppCompatDelegateImpl$i(this, context);
                            }
                            return this.k0.c();
                        }
                        IllegalStateException illegalStateException = new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        throw illegalStateException;
                    }
                } else {
                    Object object;
                    n3 = Build.VERSION.SDK_INT;
                    n4 = 23;
                    if (n3 >= n4) {
                        object = context.getApplicationContext();
                        String string2 = "uimode";
                        n3 = (object = (UiModeManager)object.getSystemService(string2)).getNightMode();
                        if (n3 == 0) {
                            return n7;
                        }
                    }
                    object = this.N(context);
                    n3 = ((AppCompatDelegateImpl$j)object).c();
                }
            }
            return n3;
        }
        return n7;
    }

    public final boolean T() {
        boolean bl2 = this.O;
        this.O = false;
        AppCompatDelegateImpl$m appCompatDelegateImpl$m = this.P(0);
        boolean bl3 = appCompatDelegateImpl$m.m;
        boolean bl4 = true;
        if (bl3) {
            if (!bl2) {
                this.G(appCompatDelegateImpl$m, bl4);
            }
            return bl4;
        }
        Object object = this.u;
        if (object != null) {
            ((P2)object).a();
            return bl4;
        }
        this.Q();
        object = this.o;
        if (object != null && (bl2 = ((ActionBar)object).b())) {
            return bl4;
        }
        return false;
    }

    public final void U(AppCompatDelegateImpl$m appCompatDelegateImpl$m, KeyEvent object) {
        block23: {
            int n3;
            block29: {
                int n4;
                Object object2;
                int n7;
                int n8;
                Object object3;
                Context context;
                int n10;
                block26: {
                    block25: {
                        Object object4;
                        int n14;
                        int n15;
                        int n16;
                        block30: {
                            block28: {
                                block27: {
                                    block24: {
                                        d d2;
                                        n10 = appCompatDelegateImpl$m.m;
                                        if (n10 != 0 || (n10 = this.R) != 0) break block23;
                                        n10 = appCompatDelegateImpl$m.a;
                                        context = this.k;
                                        if (n10 == 0) {
                                            object3 = context.getResources().getConfiguration();
                                            n8 = object3.screenLayout & 0xF;
                                            n3 = 4;
                                            if (n8 == n3) {
                                                return;
                                            }
                                        }
                                        object3 = this.l.getCallback();
                                        n3 = 1;
                                        if (object3 != null && (n8 = (int)(object3.onMenuOpened(n10, (Menu)(d2 = appCompatDelegateImpl$m.h)) ? 1 : 0)) == 0) {
                                            this.G(appCompatDelegateImpl$m, n3 != 0);
                                            return;
                                        }
                                        object3 = "window";
                                        if ((context = (WindowManager)context.getSystemService((String)object3)) == null) {
                                            return;
                                        }
                                        n16 = this.W(appCompatDelegateImpl$m, (KeyEvent)object);
                                        if (n16 == 0) {
                                            return;
                                        }
                                        object = appCompatDelegateImpl$m.e;
                                        n8 = 0;
                                        object3 = null;
                                        n15 = -2;
                                        if (object == null || (n14 = appCompatDelegateImpl$m.n) != 0) break block24;
                                        object = appCompatDelegateImpl$m.g;
                                        if (object == null || (object = object.getLayoutParams()) == null || (n16 = object.width) != (n14 = -1)) break block25;
                                        n7 = -1;
                                        break block26;
                                    }
                                    if (object == null) {
                                        object = this.M();
                                        object2 = new TypedValue();
                                        object4 = object.getResources().newTheme();
                                        Resources.Theme theme = object.getTheme();
                                        object4.setTo(theme);
                                        n4 = R$attr.actionBarPopupTheme;
                                        object4.resolveAttribute(n4, object2, n3 != 0);
                                        n4 = object2.resourceId;
                                        if (n4 != 0) {
                                            object4.applyStyle(n4, n3 != 0);
                                        }
                                        n4 = R$attr.panelMenuListTheme;
                                        object4.resolveAttribute(n4, object2, n3 != 0);
                                        n14 = object2.resourceId;
                                        if (n14 != 0) {
                                            object4.applyStyle(n14, n3 != 0);
                                        } else {
                                            n14 = R$style.Theme_AppCompat_CompactMenu;
                                            object4.applyStyle(n14, n3 != 0);
                                        }
                                        object2 = new d80((Context)object, 0);
                                        object2.getTheme().setTo(object4);
                                        appCompatDelegateImpl$m.j = object2;
                                        object = R$styleable.AppCompatTheme;
                                        object = object2.obtainStyledAttributes((int[])object);
                                        n14 = R$styleable.AppCompatTheme_panelBackground;
                                        appCompatDelegateImpl$m.b = n14 = object.getResourceId(n14, 0);
                                        n14 = R$styleable.AppCompatTheme_android_windowAnimationStyle;
                                        appCompatDelegateImpl$m.d = n14 = object.getResourceId(n14, 0);
                                        object.recycle();
                                        object2 = appCompatDelegateImpl$m.j;
                                        object = new AppCompatDelegateImpl$l(this, (d80)((Object)object2));
                                        appCompatDelegateImpl$m.e = object;
                                        appCompatDelegateImpl$m.c = n16 = 81;
                                    } else {
                                        n14 = appCompatDelegateImpl$m.n;
                                        if (n14 != 0 && (n16 = object.getChildCount()) > 0) {
                                            object = appCompatDelegateImpl$m.e;
                                            object.removeAllViews();
                                        }
                                    }
                                    object = appCompatDelegateImpl$m.g;
                                    if (object == null) break block27;
                                    appCompatDelegateImpl$m.f = object;
                                    break block28;
                                }
                                object = appCompatDelegateImpl$m.h;
                                if (object == null) break block29;
                                object = this.t;
                                if (object == null) {
                                    object = new AppCompatDelegateImpl$n(this);
                                    this.t = object;
                                }
                                object = this.t;
                                object2 = appCompatDelegateImpl$m.i;
                                if (object2 == null) {
                                    object4 = appCompatDelegateImpl$m.j;
                                    n4 = R$layout.abc_list_menu_item_layout;
                                    object2 = new b((Context)object4, n4);
                                    appCompatDelegateImpl$m.i = object2;
                                    object2.f = object;
                                    object = appCompatDelegateImpl$m.h;
                                    object.addMenuPresenter((androidx.appcompat.view.menu.h)object2);
                                }
                                object = appCompatDelegateImpl$m.i;
                                object2 = appCompatDelegateImpl$m.e;
                                object4 = object.d;
                                if (object4 == null) {
                                    object4 = object.b;
                                    n4 = R$layout.abc_expanded_menu_layout;
                                    object2 = (ExpandedMenuView)object4.inflate(n4, (ViewGroup)object2, false);
                                    object.d = object2;
                                    object2 = object.g;
                                    if (object2 == null) {
                                        object2 = new b$a((b)object);
                                        object.g = object2;
                                    }
                                    object2 = object.d;
                                    object4 = object.g;
                                    object2.setAdapter((ListAdapter)object4);
                                    object2 = object.d;
                                    object2.setOnItemClickListener((AdapterView.OnItemClickListener)object);
                                }
                                object = object.d;
                                appCompatDelegateImpl$m.f = object;
                                if (object == null) break block29;
                            }
                            object = appCompatDelegateImpl$m.f;
                            if (object == null) break block29;
                            object = appCompatDelegateImpl$m.g;
                            if (object != null) break block30;
                            object = appCompatDelegateImpl$m.i;
                            object2 = object.g;
                            if (object2 == null) {
                                object2 = new b$a((b)object);
                                object.g = object2;
                            }
                            if ((n16 = (object = object.g).getCount()) <= 0) break block29;
                        }
                        object = appCompatDelegateImpl$m.f.getLayoutParams();
                        if (object == null) {
                            object = new ViewGroup.LayoutParams(n15, n15);
                        }
                        n14 = appCompatDelegateImpl$m.b;
                        object4 = appCompatDelegateImpl$m.e;
                        object4.setBackgroundResource(n14);
                        object2 = appCompatDelegateImpl$m.f.getParent();
                        n7 = object2 instanceof ViewGroup;
                        if (n7 != 0) {
                            object2 = (ViewGroup)object2;
                            object4 = appCompatDelegateImpl$m.f;
                            object2.removeView((View)object4);
                        }
                        object2 = appCompatDelegateImpl$m.e;
                        object4 = appCompatDelegateImpl$m.f;
                        object2.addView((View)object4, (ViewGroup.LayoutParams)object);
                        object = appCompatDelegateImpl$m.f;
                        n16 = (int)(object.hasFocus() ? 1 : 0);
                        if (n16 == 0) {
                            object = appCompatDelegateImpl$m.f;
                            object.requestFocus();
                        }
                    }
                    n7 = -2;
                }
                appCompatDelegateImpl$m.l = false;
                int n17 = 1002;
                n4 = -2;
                int n18 = 0x820000;
                int n19 = -3;
                object2 = object;
                object = new WindowManager.LayoutParams(n7, n4, 0, 0, n17, n18, n19);
                object.gravity = n8 = appCompatDelegateImpl$m.c;
                object.windowAnimations = n8 = appCompatDelegateImpl$m.d;
                object3 = appCompatDelegateImpl$m.e;
                context.addView((View)object3, (ViewGroup.LayoutParams)object);
                appCompatDelegateImpl$m.m = n3;
                if (n10 == 0) {
                    this.Y();
                }
                return;
            }
            appCompatDelegateImpl$m.n = n3;
        }
    }

    public final boolean V(AppCompatDelegateImpl$m object, int n3, KeyEvent keyEvent) {
        boolean bl2;
        boolean n4 = keyEvent.isSystem();
        boolean bl3 = false;
        if (n4) {
            return false;
        }
        boolean bl4 = ((AppCompatDelegateImpl$m)object).k;
        if ((bl4 || (bl2 = this.W((AppCompatDelegateImpl$m)object, keyEvent))) && (object = ((AppCompatDelegateImpl$m)object).h) != null) {
            int n7 = 1;
            bl3 = ((d)object).performShortcut(n3, keyEvent, n7);
        }
        return bl3;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean W(AppCompatDelegateImpl$m object, KeyEvent object2) {
        boolean bl2;
        Object object3;
        Object object4;
        boolean bl3 = this.R;
        if (bl3) {
            return false;
        }
        bl3 = ((AppCompatDelegateImpl$m)object).k;
        int bl4 = 1;
        if (bl3) {
            return bl4;
        }
        Object object5 = this.N;
        if (object5 != null && object5 != object) {
            this.G((AppCompatDelegateImpl$m)object5, false);
        }
        object5 = this.l.getCallback();
        int n3 = ((AppCompatDelegateImpl$m)object).a;
        if (object5 != null) {
            object4 = object5.onCreatePanelView(n3);
            ((AppCompatDelegateImpl$m)object).g = object4;
        }
        int n4 = 108;
        boolean bl5 = n3 == 0 || n3 == n4;
        if (bl5 && (object3 = this.r) != null) {
            object3.setMenuPrepared();
        }
        if (!((object3 = ((AppCompatDelegateImpl$m)object).g) != null || bl5 && (bl2 = (object3 = this.o) instanceof ToolbarActionBar))) {
            void var18_24;
            void var18_20;
            boolean bl6;
            object3 = ((AppCompatDelegateImpl$m)object).h;
            if (object3 == null || (bl6 = ((AppCompatDelegateImpl$m)object).o)) {
                Object object6;
                if (object3 == null) {
                    object3 = this.k;
                    if ((n3 == 0 || n3 == n4) && (object4 = this.r) != null) {
                        int n7;
                        Resources.Theme theme;
                        object4 = new TypedValue();
                        object6 = object3.getTheme();
                        int n8 = R$attr.actionBarTheme;
                        object6.resolveAttribute(n8, (TypedValue)object4, bl4 != 0);
                        n8 = ((TypedValue)object4).resourceId;
                        if (n8 != 0) {
                            theme = object3.getResources().newTheme();
                            theme.setTo(object6);
                            n7 = ((TypedValue)object4).resourceId;
                            theme.applyStyle(n7, bl4 != 0);
                            n7 = R$attr.actionBarWidgetTheme;
                            theme.resolveAttribute(n7, (TypedValue)object4, bl4 != 0);
                        } else {
                            n8 = R$attr.actionBarWidgetTheme;
                            object6.resolveAttribute(n8, (TypedValue)object4, bl4 != 0);
                            n8 = 0;
                            theme = null;
                        }
                        n7 = ((TypedValue)object4).resourceId;
                        if (n7 != 0) {
                            if (theme == null) {
                                theme = object3.getResources().newTheme();
                                theme.setTo(object6);
                            }
                            n4 = ((TypedValue)object4).resourceId;
                            theme.applyStyle(n4, bl4 != 0);
                        }
                        if (theme != null) {
                            object4 = new d80((Context)object3, 0);
                            ((d80)((Object)object4)).getTheme().setTo(theme);
                            object3 = object4;
                        }
                    }
                    object4 = new d((Context)object3);
                    ((d)object4).setCallback(this);
                    object3 = ((AppCompatDelegateImpl$m)object).h;
                    if (object4 != object3) {
                        if (object3 != null) {
                            object6 = ((AppCompatDelegateImpl$m)object).i;
                            ((d)object3).removeMenuPresenter((androidx.appcompat.view.menu.h)object6);
                        }
                        ((AppCompatDelegateImpl$m)object).h = object4;
                        object3 = ((AppCompatDelegateImpl$m)object).i;
                        if (object3 != null) {
                            ((d)object4).addMenuPresenter((androidx.appcompat.view.menu.h)object3);
                        }
                    }
                    if ((object4 = ((AppCompatDelegateImpl$m)object).h) == null) {
                        return false;
                    }
                }
                if (bl5 && (object4 = this.r) != null) {
                    object3 = this.s;
                    if (object3 == null) {
                        this.s = object3 = new AppCompatDelegateImpl$c(this);
                    }
                    object3 = ((AppCompatDelegateImpl$m)object).h;
                    object6 = this.s;
                    object4.setMenu((Menu)object3, (h$a)object6);
                }
                ((AppCompatDelegateImpl$m)object).h.stopDispatchingItemsChanged();
                object4 = ((AppCompatDelegateImpl$m)object).h;
                n3 = (int)(object5.onCreatePanelMenu(n3, (Menu)object4) ? 1 : 0);
                if (n3 == 0) {
                    object2 = ((AppCompatDelegateImpl$m)object).h;
                    if (object2 != null) {
                        if (object2 != null) {
                            object5 = ((AppCompatDelegateImpl$m)object).i;
                            ((d)object2).removeMenuPresenter((androidx.appcompat.view.menu.h)object5);
                        }
                        ((AppCompatDelegateImpl$m)object).h = null;
                    }
                    if (bl5 && (object = this.r) != null) {
                        object2 = this.s;
                        object.setMenu(null, (h$a)object2);
                    }
                    return false;
                }
                ((AppCompatDelegateImpl$m)object).o = false;
            }
            ((AppCompatDelegateImpl$m)object).h.stopDispatchingItemsChanged();
            Bundle bundle = ((AppCompatDelegateImpl$m)object).p;
            if (bundle != null) {
                object4 = ((AppCompatDelegateImpl$m)object).h;
                ((d)object4).restoreActionViewStates(bundle);
                ((AppCompatDelegateImpl$m)object).p = null;
            }
            if (!(bl3 = object5.onPreparePanel(0, (View)(bundle = ((AppCompatDelegateImpl$m)object).g), (Menu)(object4 = ((AppCompatDelegateImpl$m)object).h)))) {
                if (bl5 && (object2 = this.r) != null) {
                    object5 = this.s;
                    object2.setMenu(null, (h$a)object5);
                }
                ((AppCompatDelegateImpl$m)object).h.startDispatchingItemsChanged();
                return false;
            }
            if (object2 != null) {
                int bl7 = object2.getDeviceId();
            } else {
                int n7 = -1;
            }
            object2 = KeyCharacterMap.load((int)var18_20);
            int n8 = object2.getKeyboardType();
            if (n8 != bl4) {
                boolean bl7 = true;
            } else {
                boolean bl8 = false;
                object2 = null;
            }
            object5 = ((AppCompatDelegateImpl$m)object).h;
            ((d)object5).setQwertyMode((boolean)var18_24);
            object2 = ((AppCompatDelegateImpl$m)object).h;
            ((d)object2).startDispatchingItemsChanged();
        }
        ((AppCompatDelegateImpl$m)object).k = bl4;
        ((AppCompatDelegateImpl$m)object).l = false;
        this.N = object;
        return bl4;
    }

    public final void X() {
        boolean bl2 = this.A;
        if (!bl2) {
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Window feature must be requested before adding content");
        throw androidRuntimeException;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Y() {
        OnBackInvokedCallback onBackInvokedCallback;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 < n4) return;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.w0;
        n4 = 0;
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = null;
        if (onBackInvokedDispatcher != null) {
            P2 p2;
            AppCompatDelegateImpl$m appCompatDelegateImpl$m = this.P(0);
            n3 = (int)(appCompatDelegateImpl$m.m ? 1 : 0);
            if (n3 != 0 || (p2 = this.u) != null) {
                n4 = 1;
            }
        }
        if (n4 != 0 && (onBackInvokedCallback = this.x0) == null) {
            OnBackInvokedCallback onBackInvokedCallback2;
            this.x0 = onBackInvokedCallback2 = AppCompatDelegateImpl$g.b(this.w0, this);
            return;
        }
        if (n4 != 0) return;
        OnBackInvokedCallback onBackInvokedCallback3 = this.x0;
        if (onBackInvokedCallback3 == null) return;
        onBackInvokedDispatcher2 = this.w0;
        AppCompatDelegateImpl$g.c(onBackInvokedDispatcher2, onBackInvokedCallback3);
        n3 = 0;
        Object var3_12 = null;
        this.x0 = null;
    }

    public final void a(View object, ViewGroup.LayoutParams layoutParams) {
        this.K();
        ((ViewGroup)this.B.findViewById(0x1020002)).addView((View)object, layoutParams);
        object = this.m;
        layoutParams = this.l.getCallback();
        ((AppCompatDelegateImpl$h)object).a((Window.Callback)layoutParams);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Context b(Context context) {
        int n3;
        Context context2;
        Object object;
        Object object2;
        float f5;
        int n4;
        Object object3;
        int n7;
        int n8;
        int n10;
        boolean bl2;
        block45: {
            block46: {
                this.P = bl2 = true;
                n10 = this.T;
                n8 = -100;
                if (n10 == n8) {
                    n10 = androidx.appcompat.app.g.b;
                }
                n10 = this.S(n10, context);
                n8 = (int)(androidx.appcompat.app.g.k(context) ? 1 : 0);
                if (n8 == 0 || (n8 = (int)(androidx.appcompat.app.g.k(context) ? 1 : 0)) == 0) break block45;
                n8 = Build.VERSION.SDK_INT;
                n7 = 33;
                if (n8 < n7) break block46;
                n8 = (int)(androidx.appcompat.app.g.f ? 1 : 0);
                if (n8 == 0) {
                    object3 = androidx.appcompat.app.g.a;
                    n4 = 1;
                    f5 = Float.MIN_VALUE;
                    object2 = new d9_0(context, n4);
                    ((g$c)object3).execute((Runnable)object2);
                }
                break block45;
            }
            object3 = androidx.appcompat.app.g.i;
            synchronized (object3) {
                Throwable throwable2;
                block44: {
                    block42: {
                        block47: {
                            block43: {
                                try {
                                    object2 = androidx.appcompat.app.g.c;
                                    if (object2 != null) break block42;
                                    object2 = androidx.appcompat.app.g.d;
                                    if (object2 != null) break block43;
                                    object2 = Se3.c(context);
                                    androidx.appcompat.app.g.d = object2 = jw1.b((String)object2);
                                }
                                catch (Throwable throwable2) {
                                    break block44;
                                }
                            }
                            object2 = androidx.appcompat.app.g.d;
                            object2 = ((jw1)object2).a;
                            n7 = (int)(object2.isEmpty() ? 1 : 0);
                            if (n7 == 0) break block47;
                            break block45;
                        }
                        androidx.appcompat.app.g.c = object2 = androidx.appcompat.app.g.d;
                        break block45;
                    }
                    object = androidx.appcompat.app.g.d;
                    n7 = (int)(((jw1)object2).equals(object) ? 1 : 0);
                    if (n7 == 0) {
                        androidx.appcompat.app.g.d = object2 = androidx.appcompat.app.g.c;
                        object2 = ((jw1)object2).a;
                        object2 = object2.a();
                        Se3.b(context, (String)object2);
                    }
                    break block45;
                }
                throw throwable2;
            }
        }
        object3 = AppCompatDelegateImpl.D(context);
        n7 = context instanceof ContextThemeWrapper;
        n4 = 0;
        f5 = 0.0f;
        object = null;
        Configuration configuration = null;
        if (n7 != 0) {
            object2 = AppCompatDelegateImpl.H(context, n10, (jw1)object3, null, false);
            context2 = context;
            try {
                context2 = (ContextThemeWrapper)context;
                context2.applyOverrideConfiguration((Configuration)object2);
                return context;
            }
            catch (IllegalStateException illegalStateException) {}
        }
        if ((n7 = context instanceof d80) != 0) {
            object2 = AppCompatDelegateImpl.H(context, n10, (jw1)object3, null, false);
            object = context;
            try {
                object = (d80)context;
                ((d80)((Object)object)).a((Configuration)object2);
                return context;
            }
            catch (IllegalStateException illegalStateException) {}
        }
        if ((n7 = (int)(A0 ? 1 : 0)) == 0) {
            return context;
        }
        object2 = new Configuration();
        ((Configuration)object2).uiMode = -1;
        n4 = 0;
        f5 = 0.0f;
        object = null;
        ((Configuration)object2).fontScale = 0.0f;
        object2 = context.createConfigurationContext((Configuration)object2).getResources().getConfiguration();
        context2 = context.getResources().getConfiguration();
        ((Configuration)object2).uiMode = n3 = context2.uiMode;
        n3 = (int)(object2.equals((Configuration)context2) ? 1 : 0);
        if (n3 == 0) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            n4 = object2.diff((Configuration)context2);
            if (n4 != 0) {
                f5 = ((Configuration)object2).fontScale;
                float f6 = context2.fontScale;
                float f7 = f5 - f6;
                n4 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
                if (n4 != 0) {
                    configuration.fontScale = f6;
                }
                if ((n4 = ((Configuration)object2).mcc) != (n3 = context2.mcc)) {
                    configuration.mcc = n3;
                }
                if ((n4 = ((Configuration)object2).mnc) != (n3 = context2.mnc)) {
                    configuration.mnc = n3;
                }
                n4 = Build.VERSION.SDK_INT;
                n3 = 24;
                f6 = 3.4E-44f;
                if (n4 >= n3) {
                    AppCompatDelegateImpl$f.a((Configuration)object2, (Configuration)context2, configuration);
                } else {
                    Locale locale = ((Configuration)object2).locale;
                    Locale locale2 = context2.locale;
                    n3 = (int)(Objects.equals(locale, locale2) ? 1 : 0);
                    if (n3 == 0) {
                        configuration.locale = locale = context2.locale;
                    }
                }
                n3 = ((Configuration)object2).touchscreen;
                int n14 = context2.touchscreen;
                if (n3 != n14) {
                    configuration.touchscreen = n14;
                }
                if ((n3 = ((Configuration)object2).keyboard) != (n14 = context2.keyboard)) {
                    configuration.keyboard = n14;
                }
                if ((n3 = ((Configuration)object2).keyboardHidden) != (n14 = context2.keyboardHidden)) {
                    configuration.keyboardHidden = n14;
                }
                if ((n3 = ((Configuration)object2).navigation) != (n14 = context2.navigation)) {
                    configuration.navigation = n14;
                }
                if ((n3 = ((Configuration)object2).navigationHidden) != (n14 = context2.navigationHidden)) {
                    configuration.navigationHidden = n14;
                }
                if ((n3 = ((Configuration)object2).orientation) != (n14 = context2.orientation)) {
                    configuration.orientation = n14;
                }
                if ((n3 = ((Configuration)object2).screenLayout & 0xF) != (n14 = context2.screenLayout & 0xF)) {
                    configuration.screenLayout = n3 = configuration.screenLayout | n14;
                }
                if ((n3 = ((Configuration)object2).screenLayout & 0xC0) != (n14 = context2.screenLayout & 0xC0)) {
                    configuration.screenLayout = n3 = configuration.screenLayout | n14;
                }
                if ((n3 = ((Configuration)object2).screenLayout & 0x30) != (n14 = context2.screenLayout & 0x30)) {
                    configuration.screenLayout = n3 = configuration.screenLayout | n14;
                }
                if ((n3 = ((Configuration)object2).screenLayout & 0x300) != (n14 = context2.screenLayout & 0x300)) {
                    configuration.screenLayout = n3 = configuration.screenLayout | n14;
                }
                n3 = 26;
                f6 = 3.6E-44f;
                if (n4 >= n3) {
                    n4 = fn_0.a((Configuration)object2) & 3;
                    if (n4 != (n3 = fn_0.a((Configuration)context2) & 3)) {
                        n4 = fn_0.a(configuration);
                        n3 = fn_0.a((Configuration)context2) & 3;
                        gn_0.a(configuration, n4 |= n3);
                    }
                    if ((n4 = fn_0.a((Configuration)object2) & 0xC) != (n3 = fn_0.a((Configuration)context2) & 0xC)) {
                        n4 = fn_0.a(configuration);
                        n3 = fn_0.a((Configuration)context2) & 0xC;
                        gn_0.a(configuration, n4 |= n3);
                    }
                }
                if ((n4 = ((Configuration)object2).uiMode & 0xF) != (n3 = context2.uiMode & 0xF)) {
                    configuration.uiMode = n4 = configuration.uiMode | n3;
                }
                if ((n4 = ((Configuration)object2).uiMode & 0x30) != (n3 = context2.uiMode & 0x30)) {
                    configuration.uiMode = n4 = configuration.uiMode | n3;
                }
                if ((n4 = ((Configuration)object2).screenWidthDp) != (n3 = context2.screenWidthDp)) {
                    configuration.screenWidthDp = n3;
                }
                if ((n4 = ((Configuration)object2).screenHeightDp) != (n3 = context2.screenHeightDp)) {
                    configuration.screenHeightDp = n3;
                }
                if ((n4 = ((Configuration)object2).smallestScreenWidthDp) != (n3 = context2.smallestScreenWidthDp)) {
                    configuration.smallestScreenWidthDp = n3;
                }
                if ((n7 = ((Configuration)object2).densityDpi) != (n4 = context2.densityDpi)) {
                    configuration.densityDpi = n4;
                }
            }
        }
        Configuration configuration2 = AppCompatDelegateImpl.H(context, n10, (jw1)object3, configuration, bl2);
        n8 = R$style.Theme_AppCompat_Empty;
        d80 d802 = new d80(context, n8);
        d802.a(configuration2);
        try {
            context = context.getTheme();
            if (context == null) return d802;
        }
        catch (NullPointerException nullPointerException) {
            return d802;
        }
        context = d802.getTheme();
        WK2$e.a((Resources.Theme)context);
        return d802;
    }

    public final View c(int n3) {
        this.K();
        return this.l.findViewById(n3);
    }

    public final Context d() {
        return this.k;
    }

    public final AppCompatDelegateImpl$a e() {
        AppCompatDelegateImpl$a appCompatDelegateImpl$a = new AppCompatDelegateImpl$a(this);
        return appCompatDelegateImpl$a;
    }

    public final int f() {
        return this.T;
    }

    public final MenuInflater g() {
        vg3_1 vg3_12 = this.p;
        if (vg3_12 == null) {
            this.Q();
            ActionBar actionBar = this.o;
            actionBar = actionBar != null ? actionBar.e() : this.k;
            this.p = vg3_12 = new vg3_1((Context)actionBar);
        }
        return this.p;
    }

    public final ActionBar h() {
        this.Q();
        return this.o;
    }

    public final void i() {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.k);
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory == null) {
            layoutInflater.setFactory2((LayoutInflater.Factory2)this);
        } else {
            layoutInflater = layoutInflater.getFactory2();
            boolean cfr_ignored_0 = layoutInflater instanceof AppCompatDelegateImpl;
        }
    }

    public final void j() {
        ActionBar actionBar = this.o;
        if (actionBar != null) {
            this.Q();
            actionBar = this.o;
            boolean bl2 = actionBar.g();
            if (!bl2) {
                bl2 = false;
                actionBar = null;
                this.R(0);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(Configuration object) {
        boolean bl2 = this.G;
        if (bl2 && (bl2 = this.A)) {
            this.Q();
            object = this.o;
            if (object != null) {
                ((ActionBar)object).h();
            }
        }
        object = qn.a();
        Context context = this.k;
        synchronized (object) {
            OK2 oK2 = ((qn)object).a;
            oK2.k(context);
        }
        context = this.k.getResources().getConfiguration();
        object = new Configuration((Configuration)context);
        this.S = object;
        this.B(false, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m() {
        Object object;
        boolean bl2;
        this.P = bl2 = true;
        this.B(false, bl2);
        this.L();
        Object object2 = this.j;
        boolean bl3 = object2 instanceof Activity;
        if (bl3) {
            block10: {
                try {
                    object2 = (Activity)object2;
                    try {
                        object = object2.getComponentName();
                        object2 = dU1.c((Context)object2, (ComponentName)object);
                        break block10;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(nameNotFoundException);
                        throw illegalArgumentException;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {}
                object2 = null;
            }
            if (object2 != null) {
                object2 = this.o;
                if (object2 == null) {
                    this.s0 = bl2;
                } else {
                    ((ActionBar)object2).m(bl2);
                }
            }
            object2 = androidx.appcompat.app.g.h;
            synchronized (object2) {
                androidx.appcompat.app.g.s(this);
                object = androidx.appcompat.app.g.g;
                WeakReference<AppCompatDelegateImpl> weakReference = new WeakReference<AppCompatDelegateImpl>(this);
                ((Np)object).add(weakReference);
            }
        }
        object = this.k.getResources().getConfiguration();
        object2 = new Configuration((Configuration)object);
        this.S = object2;
        this.Q = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n() {
        Object object;
        Object object2 = this.j;
        int n3 = object2 instanceof Activity;
        if (n3 != 0) {
            object2 = androidx.appcompat.app.g.h;
            synchronized (object2) {
                androidx.appcompat.app.g.s(this);
            }
        }
        if ((n3 = this.p0) != 0) {
            object2 = this.l.getDecorView();
            object = this.r0;
            object2.removeCallbacks((Runnable)object);
        }
        this.R = true;
        n3 = this.T;
        int n4 = -100;
        if (n3 != n4 && (n4 = (object2 = this.j) instanceof Activity) != 0 && (n3 = (int)((object2 = (Activity)object2).isChangingConfigurations() ? 1 : 0)) != 0) {
            object2 = y0;
            object = this.j.getClass().getName();
            int n7 = this.T;
            Integer n8 = n7;
            ((a53)object2).put(object, n8);
        } else {
            object2 = y0;
            object = this.j.getClass().getName();
            ((a53)object2).remove(object);
        }
        object2 = this.o;
        if (object2 != null) {
            ((ActionBar)object2).i();
        }
        if ((object2 = this.Z) != null) {
            ((AppCompatDelegateImpl$j)object2).a();
        }
        if ((object2 = this.k0) != null) {
            ((AppCompatDelegateImpl$j)object2).a();
        }
    }

    public final void o() {
        this.K();
    }

    public final View onCreateView(View view, String string2, Context context, AttributeSet attributeSet) {
        Object object;
        Hn hn;
        Object object2 = this.v0;
        if (object2 == null) {
            object2 = R$styleable.AppCompatTheme;
            hn = this.k;
            object2 = hn.obtainStyledAttributes((int[])object2);
            int n3 = R$styleable.AppCompatTheme_viewInflaterClass;
            object = object2.getString(n3);
            object2.recycle();
            if (object == null) {
                this.v0 = object2 = new Hn();
            } else {
                object2 = hn.getClassLoader();
                object2 = ((ClassLoader)object2).loadClass((String)object);
                hn = null;
                object2 = ((Class)object2).getDeclaredConstructor(null);
                object2 = ((Constructor)object2).newInstance(null);
                object2 = (Hn)object2;
                try {
                    this.v0 = object2;
                }
                catch (Throwable throwable) {
                    this.v0 = object2 = new Hn();
                }
            }
        }
        hn = this.v0;
        object = view;
        return hn.createView(view, string2, context, attributeSet, false, false, true, false);
    }

    public final View onCreateView(String string2, Context context, AttributeSet attributeSet) {
        return this.onCreateView(null, string2, context, attributeSet);
    }

    public final boolean onMenuItemSelected(d d2, MenuItem menuItem) {
        boolean bl2;
        Window.Callback callback2 = this.l.getCallback();
        if (callback2 != null && !(bl2 = this.R)) {
            AppCompatDelegateImpl$m appCompatDelegateImpl$m;
            block4: {
                d2 = d2.getRootMenu();
                AppCompatDelegateImpl$m[] appCompatDelegateImpl$mArray = this.M;
                int n3 = appCompatDelegateImpl$mArray != null ? appCompatDelegateImpl$mArray.length : 0;
                for (int i3 = 0; i3 < n3; ++i3) {
                    d d5;
                    appCompatDelegateImpl$m = appCompatDelegateImpl$mArray[i3];
                    if (appCompatDelegateImpl$m == null || (d5 = appCompatDelegateImpl$m.h) != d2) {
                        continue;
                    }
                    break block4;
                }
                appCompatDelegateImpl$m = null;
            }
            if (appCompatDelegateImpl$m != null) {
                int n4 = appCompatDelegateImpl$m.a;
                return callback2.onMenuItemSelected(n4, menuItem);
            }
        }
        return false;
    }

    public final void onMenuModeChange(d object) {
        boolean bl2;
        object = this.r;
        int n3 = 1;
        boolean bl3 = false;
        if (object != null && (bl2 = object.a()) && (!(bl2 = (object = ViewConfiguration.get((Context)this.k)).hasPermanentMenuKey()) || (bl2 = (object = this.r).e()))) {
            object = this.l.getCallback();
            Object object2 = this.r;
            int n4 = object2.d();
            int n7 = 108;
            if (n4 != 0) {
                Object object3 = this.r;
                object3.b();
                n3 = this.R;
                if (n3 == 0) {
                    object3 = this.P((int)0).h;
                    object.onPanelClosed(n7, (Menu)object3);
                }
            } else if (object != null && (n4 = this.R) == 0) {
                View view;
                boolean bl4;
                Object object4;
                n4 = this.p0;
                if (n4 != 0 && (n3 &= (n4 = this.q0)) != 0) {
                    object4 = this.l.getDecorView();
                    object2 = this.r0;
                    object4.removeCallbacks((Runnable)object2);
                    object2 = (AppCompatDelegateImpl$2)object2;
                    ((AppCompatDelegateImpl$2)object2).run();
                }
                object4 = this.P(0);
                object2 = ((AppCompatDelegateImpl$m)object4).h;
                if (object2 != null && !(bl4 = ((AppCompatDelegateImpl$m)object4).o) && (bl3 = object.onPreparePanel(0, view = ((AppCompatDelegateImpl$m)object4).g, (Menu)object2))) {
                    object4 = ((AppCompatDelegateImpl$m)object4).h;
                    object.onMenuOpened(n7, (Menu)object4);
                    object = this.r;
                    object.c();
                }
            }
        } else {
            object = this.P(0);
            ((AppCompatDelegateImpl$m)object).n = n3;
            this.G((AppCompatDelegateImpl$m)object, false);
            n3 = 0;
            Object var8_10 = null;
            this.U((AppCompatDelegateImpl$m)object, null);
        }
    }

    public final void p() {
        this.Q();
        ActionBar actionBar = this.o;
        if (actionBar != null) {
            boolean bl2 = true;
            actionBar.w(bl2);
        }
    }

    public final void q() {
        this.B(true, false);
    }

    public final void r() {
        this.Q();
        ActionBar actionBar = this.o;
        if (actionBar != null) {
            actionBar.w(false);
        }
    }

    public final boolean t(int n3) {
        int n4 = 8;
        int n7 = 109;
        int n8 = 108;
        if (n3 == n4) {
            n3 = 108;
        } else {
            n4 = 9;
            if (n3 == n4) {
                n3 = 109;
            }
        }
        n4 = (int)(this.K ? 1 : 0);
        if (n4 != 0 && n3 == n8) {
            return false;
        }
        n4 = (int)(this.G ? 1 : 0);
        int n10 = 1;
        if (n4 != 0 && n3 == n10) {
            this.G = false;
        }
        if (n3 != n10) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 5;
                if (n3 != n4) {
                    n4 = 10;
                    if (n3 != n4) {
                        if (n3 != n8) {
                            if (n3 != n7) {
                                return this.l.requestFeature(n3);
                            }
                            this.X();
                            this.H = n10;
                            return n10;
                        }
                        this.X();
                        this.G = n10;
                        return n10;
                    }
                    this.X();
                    this.I = n10;
                    return n10;
                }
                this.X();
                this.F = n10;
                return n10;
            }
            this.X();
            this.E = n10;
            return n10;
        }
        this.X();
        this.K = n10;
        return n10;
    }

    public final void u(int n3) {
        this.K();
        ViewGroup viewGroup = (ViewGroup)this.B.findViewById(0x1020002);
        viewGroup.removeAllViews();
        LayoutInflater.from((Context)this.k).inflate(n3, viewGroup);
        AppCompatDelegateImpl$h appCompatDelegateImpl$h = this.m;
        viewGroup = this.l.getCallback();
        appCompatDelegateImpl$h.a((Window.Callback)viewGroup);
    }

    public final void v(View object) {
        this.K();
        ViewGroup viewGroup = (ViewGroup)this.B.findViewById(0x1020002);
        viewGroup.removeAllViews();
        viewGroup.addView((View)object);
        object = this.m;
        viewGroup = this.l.getCallback();
        ((AppCompatDelegateImpl$h)object).a((Window.Callback)viewGroup);
    }

    public final void w(View object, ViewGroup.LayoutParams layoutParams) {
        this.K();
        ViewGroup viewGroup = (ViewGroup)this.B.findViewById(0x1020002);
        viewGroup.removeAllViews();
        viewGroup.addView((View)object, layoutParams);
        object = this.m;
        layoutParams = this.l.getCallback();
        ((AppCompatDelegateImpl$h)object).a((Window.Callback)layoutParams);
    }

    public final void x(Toolbar object) {
        Object object2 = this.j;
        boolean bl2 = object2 instanceof Activity;
        if (!bl2) {
            return;
        }
        this.Q();
        Object object3 = this.o;
        boolean bl3 = object3 instanceof h;
        if (!bl3) {
            bl3 = false;
            AppCompatDelegateImpl$h appCompatDelegateImpl$h = null;
            this.p = null;
            if (object3 != null) {
                ((ActionBar)object3).i();
            }
            this.o = null;
            if (object != null) {
                bl3 = object2 instanceof Activity;
                object2 = bl3 ? ((Activity)object2).getTitle() : this.q;
                appCompatDelegateImpl$h = this.m;
                object3 = new ToolbarActionBar((Toolbar)object, (CharSequence)object2, appCompatDelegateImpl$h);
                this.o = object3;
                object2 = this.m;
                ((AppCompatDelegateImpl$h)object2).b = object3 = ((ToolbarActionBar)object3).c;
                boolean bl4 = true;
                ((Toolbar)object).setBackInvokedCallbackEnabled(bl4);
            } else {
                object = this.m;
                ((AppCompatDelegateImpl$h)object).b = null;
            }
            this.j();
            return;
        }
        object = new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        throw object;
    }

    public final void y(int n3) {
        this.U = n3;
    }

    public final void z(CharSequence charSequence) {
        this.q = charSequence;
        Object object = this.r;
        if (object != null) {
            object.setWindowTitle(charSequence);
        } else {
            object = this.o;
            if (object != null) {
                ((ActionBar)object).y(charSequence);
            } else {
                object = this.C;
                if (object != null) {
                    object.setText(charSequence);
                }
            }
        }
    }
}

