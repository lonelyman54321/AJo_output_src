/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.DataSetObserver
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.AppCompatPopupWindow;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.ListPopupWindow$ListSelectorHider;
import androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable;
import androidx.appcompat.widget.ListPopupWindow$a;
import androidx.appcompat.widget.ListPopupWindow$b;
import androidx.appcompat.widget.ListPopupWindow$c;
import androidx.appcompat.widget.ListPopupWindow$d;
import androidx.appcompat.widget.ListPopupWindow$e;
import androidx.appcompat.widget.c;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;

public class ListPopupWindow
implements q43 {
    public static final Method A;
    public static final Method B;
    public static final Method C;
    public final Context a;
    public ListAdapter b;
    public DropDownListView c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public final int m;
    public ListPopupWindow$c n;
    public View o;
    public AdapterView.OnItemClickListener p;
    public AdapterView.OnItemSelectedListener q;
    public final ListPopupWindow$ResizePopupRunnable r;
    public final ListPopupWindow$e s;
    public final ListPopupWindow$d t;
    public final ListPopupWindow$ListSelectorHider u;
    public final Handler v;
    public final Rect w;
    public Rect x;
    public boolean y;
    public final PopupWindow z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Class<Boolean> clazz;
        Class[] classArray;
        Object object;
        GenericDeclaration genericDeclaration = null;
        int n3 = 1;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 28;
        Class<PopupWindow> clazz2 = PopupWindow.class;
        if (n4 <= n7) {
            object = "setClipToScreenEnabled";
            try {
                classArray = new Class[n3];
                classArray[0] = clazz = Boolean.TYPE;
                A = object = clazz2.getDeclaredMethod((String)object, classArray);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            object = "setEpicenterBounds";
            try {
                classArray = new Class[n3];
                classArray[0] = clazz = Rect.class;
                C = object = clazz2.getDeclaredMethod((String)object, classArray);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
        }
        if ((n4 = Build.VERSION.SDK_INT) > (n7 = 23)) return;
        object = "getMaxAvailableHeight";
        n7 = 3;
        try {
            classArray = new Class[n7];
            classArray[0] = clazz = View.class;
            classArray[n3] = genericDeclaration = Integer.TYPE;
            genericDeclaration = Boolean.TYPE;
            n3 = 2;
            classArray[n3] = genericDeclaration;
            genericDeclaration = clazz2.getDeclaredMethod((String)object, classArray);
            B = genericDeclaration;
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return;
        }
    }

    public ListPopupWindow(Context context) {
        int n3 = R$attr.listPopupWindowStyle;
        this(context, null, n3);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.listPopupWindowStyle;
        this(context, attributeSet, n3);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int n3) {
        this(context, attributeSet, n3, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int n3, int n4) {
        int n7;
        int n8;
        this.d = n8 = -2;
        this.e = n8;
        this.h = 1002;
        AppCompatPopupWindow appCompatPopupWindow = null;
        this.l = 0;
        this.m = n7 = -1 >>> 1;
        Object object = new ListPopupWindow$ResizePopupRunnable(this);
        this.r = object;
        this.s = object = new ListPopupWindow$e(this);
        this.t = object = new ListPopupWindow$d(this);
        this.u = object = new ListPopupWindow$ListSelectorHider(this);
        object = new Rect();
        this.w = object;
        this.a = context;
        Looper looper = context.getMainLooper();
        object = new Handler(looper);
        this.v = object;
        object = R$styleable.ListPopupWindow;
        object = context.obtainStyledAttributes(attributeSet, (int[])object, n3, n4);
        int n10 = R$styleable.ListPopupWindow_android_dropDownHorizontalOffset;
        this.f = n10 = object.getDimensionPixelOffset(n10, 0);
        n10 = R$styleable.ListPopupWindow_android_dropDownVerticalOffset;
        this.g = n8 = object.getDimensionPixelOffset(n10, 0);
        n10 = 1;
        if (n8 != 0) {
            this.i = n10;
        }
        object.recycle();
        super(context, attributeSet, n3, n4);
        appCompatPopupWindow.a(context, attributeSet, n3, n4);
        this.z = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(n10);
    }

    public final boolean a() {
        return this.z.isShowing();
    }

    public final int b() {
        return this.f;
    }

    public final void d(int n3) {
        this.f = n3;
    }

    public final void dismiss() {
        PopupWindow popupWindow = this.z;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.c = null;
        popupWindow = this.v;
        ListPopupWindow$ResizePopupRunnable listPopupWindow$ResizePopupRunnable = this.r;
        popupWindow.removeCallbacks((Runnable)listPopupWindow$ResizePopupRunnable);
    }

    public final Drawable f() {
        return this.z.getBackground();
    }

    public final void h(int n3) {
        this.g = n3;
        this.i = true;
    }

    public final int k() {
        boolean bl2 = this.i;
        if (!bl2) {
            return 0;
        }
        return this.g;
    }

    public void m(ListAdapter object) {
        ListPopupWindow$c listPopupWindow$c = this.n;
        if (listPopupWindow$c == null) {
            this.n = listPopupWindow$c = new ListPopupWindow$c(this);
        } else {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver((DataSetObserver)listPopupWindow$c);
            }
        }
        this.b = object;
        if (object != null) {
            listPopupWindow$c = this.n;
            object.registerDataSetObserver((DataSetObserver)listPopupWindow$c);
        }
        if ((object = this.c) != null) {
            listPopupWindow$c = this.b;
            object.setAdapter((ListAdapter)listPopupWindow$c);
        }
    }

    public final ListView n() {
        return this.c;
    }

    public DropDownListView o(Context context, boolean bl2) {
        DropDownListView dropDownListView = new DropDownListView(context, bl2);
        return dropDownListView;
    }

    public final void p(int n3) {
        Drawable drawable2 = this.z.getBackground();
        if (drawable2 != null) {
            Rect rect = this.w;
            drawable2.getPadding(rect);
            int n4 = rect.left;
            int n7 = rect.right;
            this.e = n4 = n4 + n7 + n3;
        } else {
            this.e = n3;
        }
    }

    public final void setBackgroundDrawable(Drawable drawable2) {
        this.z.setBackgroundDrawable(drawable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void show() {
        Object object;
        int n3;
        int n4;
        int n7;
        PopupWindow popupWindow;
        int n8;
        ListPopupWindow$ListSelectorHider listPopupWindow$ListSelectorHider;
        int n10;
        int n14;
        block54: {
            block55: {
                int n15;
                int n16;
                int n17;
                int n18;
                int n19;
                int n20;
                Rect rect;
                Object object2;
                Object object3;
                block51: {
                    n14 = 2;
                    n10 = 0;
                    listPopupWindow$ListSelectorHider = null;
                    n8 = 1;
                    object3 = this.c;
                    popupWindow = this.z;
                    object2 = this.a;
                    if (object3 == null) {
                        n7 = this.y ^ n8;
                        object3 = this.o((Context)object2, n7 != 0);
                        this.c = object3;
                        ListAdapter listAdapter = this.b;
                        object3.setAdapter(listAdapter);
                        object3 = this.c;
                        AdapterView.OnItemClickListener onItemClickListener = this.p;
                        object3.setOnItemClickListener(onItemClickListener);
                        this.c.setFocusable(n8 != 0);
                        this.c.setFocusableInTouchMode(n8 != 0);
                        object3 = this.c;
                        c c2 = new c(this);
                        object3.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)c2);
                        object3 = this.c;
                        ListPopupWindow$d listPopupWindow$d = this.t;
                        object3.setOnScrollListener((AbsListView.OnScrollListener)listPopupWindow$d);
                        object3 = this.q;
                        if (object3 != null) {
                            DropDownListView dropDownListView = this.c;
                            dropDownListView.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)object3);
                        }
                        object3 = this.c;
                        popupWindow.setContentView((View)object3);
                    } else {
                        object3 = (ViewGroup)popupWindow.getContentView();
                    }
                    object3 = popupWindow.getBackground();
                    rect = this.w;
                    if (object3 != null) {
                        object3.getPadding(rect);
                        n7 = rect.top;
                        n20 = rect.bottom + n7;
                        n19 = this.i;
                        if (n19 == 0) {
                            this.g = n7 = -n7;
                        }
                    } else {
                        rect.setEmpty();
                        n20 = 0;
                    }
                    if ((n7 = popupWindow.getInputMethodMode()) == n14) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        object3 = null;
                    }
                    View view = this.o;
                    n18 = this.g;
                    n4 = Build.VERSION.SDK_INT;
                    n17 = 23;
                    if (n4 <= n17) {
                        Method method = B;
                        if (method != null) {
                            try {
                                Integer n21 = n18;
                                object3 = n7 != 0;
                                n16 = 3;
                                Object[] objectArray = new Object[n16];
                                objectArray[0] = view;
                                objectArray[n8] = n21;
                                objectArray[n14] = object3;
                                object3 = method.invoke((Object)popupWindow, objectArray);
                                object3 = (Integer)object3;
                                n7 = (Integer)object3;
                                break block51;
                            }
                            catch (Exception exception) {}
                        }
                        n7 = popupWindow.getMaxAvailableHeight(view, n18);
                    } else {
                        n7 = ListPopupWindow$a.a(popupWindow, view, n18, n7 != 0);
                    }
                }
                n19 = this.d;
                n18 = -2;
                n4 = -1;
                if (n19 == n4) {
                    n7 += n20;
                } else {
                    n17 = this.e;
                    if (n17 != n18) {
                        n16 = 0x40000000;
                        if (n17 != n4) {
                            n3 = View.MeasureSpec.makeMeasureSpec((int)n17, (int)n16);
                        } else {
                            object2 = object2.getResources().getDisplayMetrics();
                            n3 = ((DisplayMetrics)object2).widthPixels;
                            n17 = rect.left;
                            n15 = rect.right;
                            n3 = View.MeasureSpec.makeMeasureSpec((int)(n3 - (n17 += n15)), (int)n16);
                        }
                    } else {
                        object2 = object2.getResources().getDisplayMetrics();
                        n3 = ((DisplayMetrics)object2).widthPixels;
                        n17 = rect.left;
                        n15 = rect.right;
                        n3 -= (n17 += n15);
                        n15 = -1 << -1;
                        n3 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)n15);
                    }
                    DropDownListView dropDownListView = this.c;
                    n7 = dropDownListView.a(n3, n7);
                    if (n7 > 0) {
                        object2 = this.c;
                        n3 = object2.getPaddingTop();
                        DropDownListView dropDownListView2 = this.c;
                        n15 = dropDownListView2.getPaddingBottom() + n3 + n20;
                    } else {
                        n15 = 0;
                        Object var9_18 = null;
                    }
                    n7 += n15;
                }
                object2 = this.z;
                n3 = object2.getInputMethodMode();
                if (n3 == n14) {
                    n14 = 1;
                } else {
                    n14 = 0;
                    object = null;
                }
                n3 = this.h;
                Nw2.b(popupWindow, n3);
                n3 = (int)(popupWindow.isShowing() ? 1 : 0);
                if (n3 != 0) {
                    object2 = this.o;
                    n3 = (int)(object2.isAttachedToWindow() ? 1 : 0);
                    if (n3 == 0) {
                        return;
                    }
                    n3 = this.e;
                    if (n3 == n4) {
                        n3 = -1;
                    } else if (n3 == n18) {
                        object2 = this.o;
                        n3 = object2.getWidth();
                    }
                    if (n19 == n4) {
                        n19 = n14 != 0 ? n7 : -1;
                        if (n14 != 0) {
                            n14 = this.e;
                            if (n14 == n4) {
                                n14 = -1;
                            } else {
                                n14 = 0;
                                object = null;
                            }
                            popupWindow.setWidth(n14);
                            popupWindow.setHeight(0);
                        } else {
                            n14 = this.e;
                            if (n14 == n4) {
                                n10 = -1;
                            }
                            popupWindow.setWidth(n10);
                            popupWindow.setHeight(n4);
                        }
                    } else if (n19 == n18) {
                        n19 = n7;
                    }
                    popupWindow.setOutsideTouchable(n8 != 0);
                    object = this.o;
                    n15 = this.f;
                    n20 = this.g;
                    n10 = n3 < 0 ? -1 : n3;
                    n18 = n19 < 0 ? -1 : n19;
                    object2 = object;
                    n19 = n10;
                    popupWindow.update((View)object, n15, n20, n10, n18);
                    return;
                }
                n14 = this.e;
                if (n14 == n4) {
                    n14 = -1;
                } else if (n14 == n18) {
                    object = this.o;
                    n14 = object.getWidth();
                }
                if (n19 == n4) {
                    n19 = -1;
                } else if (n19 == n18) {
                    n19 = n7;
                }
                popupWindow.setWidth(n14);
                popupWindow.setHeight(n19);
                n14 = Build.VERSION.SDK_INT;
                n7 = 28;
                if (n14 <= n7) {
                    object = A;
                    if (object != null) {
                        try {
                            object2 = new Object[n8];
                            Boolean bl2 = Boolean.TRUE;
                            object2[0] = bl2;
                            ((Method)object).invoke((Object)popupWindow, (Object[])object2);
                        }
                        catch (Exception exception) {}
                    }
                } else {
                    ListPopupWindow$b.b(popupWindow, n8 != 0);
                }
                popupWindow.setOutsideTouchable(n8 != 0);
                object = this.s;
                popupWindow.setTouchInterceptor((View.OnTouchListener)object);
                n14 = (int)(this.k ? 1 : 0);
                if (n14 != 0) {
                    n14 = (int)(this.j ? 1 : 0);
                    Nw2.a(popupWindow, n14 != 0);
                }
                if ((n14 = Build.VERSION.SDK_INT) > n7) break block55;
                object = C;
                if (object == null) break block54;
                try {
                    object3 = this.x;
                    object2 = new Object[n8];
                    object2[0] = object3;
                    ((Method)object).invoke((Object)popupWindow, (Object[])object2);
                    break block54;
                }
                catch (Exception exception) {}
            }
            object = this.x;
            ListPopupWindow$b.a(popupWindow, (Rect)object);
        }
        object = this.o;
        n10 = this.f;
        n7 = this.g;
        n3 = this.l;
        popupWindow.showAsDropDown((View)object, n10, n7, n3);
        object = this.c;
        object.setSelection(n4);
        n14 = (int)(this.y ? 1 : 0);
        if ((n14 == 0 || (n14 = (int)(((DropDownListView)((Object)(object = this.c))).isInTouchMode() ? 1 : 0)) != 0) && (object = this.c) != null) {
            ((DropDownListView)((Object)object)).setListSelectionHidden(n8 != 0);
            object.requestLayout();
        }
        if ((n14 = (int)(this.y ? 1 : 0)) != 0) return;
        object = this.v;
        listPopupWindow$ListSelectorHider = this.u;
        object.post((Runnable)listPopupWindow$ListSelectorHider);
    }
}

