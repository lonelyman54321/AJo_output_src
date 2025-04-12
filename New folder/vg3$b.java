/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.os.Build$VERSION
 *  android.view.InflateException
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.View
 */
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public final class vg3$b {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public final /* synthetic */ vg3_1 E;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public Q2 z;

    public vg3$b(vg3_1 vg3_12, Menu menu2) {
        boolean bl2;
        this.E = vg3_12;
        this.a = menu2;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = bl2 = true;
        this.g = bl2;
    }

    public final Object a(String constructor, Class[] classArray, Object[] objectArray) {
        Object object;
        try {
            object = this.E;
        }
        catch (Exception exception) {
            return null;
        }
        object = object.c;
        object = object.getClassLoader();
        constructor = Class.forName((String)((Object)constructor), false, (ClassLoader)object);
        constructor = ((Class)((Object)constructor)).getConstructor(classArray);
        boolean bl2 = true;
        ((AccessibleObject)constructor).setAccessible(bl2);
        return constructor.newInstance(objectArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(MenuItem object) {
        Object object2;
        int n3;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        int n4 = this.s;
        Object object7 = object.setChecked(n4 != 0);
        int n7 = this.t;
        object7 = object7.setVisible(n7 != 0);
        n7 = this.u;
        object7 = object7.setEnabled(n7 != 0);
        n7 = this.r;
        int n8 = 0;
        Object object8 = null;
        int n10 = 1;
        if (n7 >= n10) {
            n7 = 1;
        } else {
            n7 = 0;
            object6 = null;
        }
        object7 = object7.setCheckable(n7 != 0);
        object6 = this.l;
        object7 = object7.setTitleCondensed((CharSequence)object6);
        n7 = this.m;
        object7.setIcon(n7);
        n4 = this.v;
        if (n4 >= 0) {
            object.setShowAsAction(n4);
        }
        object7 = this.y;
        object6 = this.E;
        if (object7 != null) {
            object7 = ((vg3_1)((Object)object6)).c;
            n4 = (int)(object7.isRestricted() ? 1 : 0);
            if (n4 != 0) {
                object = new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                throw object;
            }
            object5 = ((vg3_1)((Object)object6)).d;
            if (object5 == null) {
                ((vg3_1)((Object)object6)).d = object5 = vg3_1.a(((vg3_1)((Object)object6)).c);
            }
            object5 = ((vg3_1)((Object)object6)).d;
            object4 = this.y;
            object7 = new Object();
            ((vg3$a)object7).a = object5;
            object5 = object5.getClass();
            try {
                object3 = vg3$a.c;
                ((vg3$a)object7).b = object3 = ((Class)object5).getMethod((String)object4, (Class<?>)object3);
            }
            catch (Exception exception) {
                object6 = Gn.a("Couldn't resolve menu item onClick handler ", (String)object4, " in class ");
                object8 = ((Class)object5).getName();
                ((StringBuilder)object6).append((String)object8);
                object6 = ((StringBuilder)object6).toString();
                object7 = new InflateException((String)object6);
                ((Throwable)object7).initCause(exception);
                throw object7;
            }
            object.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)object7);
        }
        if ((n4 = this.r) >= (n3 = 2)) {
            n4 = object instanceof f;
            if (n4 != 0) {
                object7 = object;
                object7 = (f)object;
                ((f)object7).g(n10 != 0);
            } else {
                n4 = object instanceof do1_1;
                if (n4 != 0) {
                    object7 = object;
                    object7 = (do1_1)object;
                    try {
                        object5 = ((do1_1)object7).e;
                        object4 = ((do1_1)object7).d;
                        if (object5 == null) {
                            Class<Boolean> clazz;
                            object5 = object4.getClass();
                            object3 = "setExclusiveCheckable";
                            Class[] classArray = new Class[n10];
                            classArray[0] = clazz = Boolean.TYPE;
                            object5 = ((Class)object5).getDeclaredMethod((String)object3, classArray);
                            ((do1_1)object7).e = object5;
                        }
                        object7 = ((do1_1)object7).e;
                        object5 = new Object[n10];
                        object5[0] = object3 = Boolean.TRUE;
                        ((Method)object7).invoke(object4, (Object[])object5);
                    }
                    catch (Exception exception) {}
                }
            }
        }
        if ((object7 = this.x) != null) {
            object8 = vg3_1.e;
            object6 = ((vg3_1)((Object)object6)).a;
            object7 = (View)this.a((String)object7, (Class[])object8, (Object[])object6);
            ((MenuItem)object).setActionView((View)object7);
            n8 = 1;
        }
        if ((n4 = this.w) > 0 && n8 == 0) {
            ((MenuItem)object).setActionView(n4);
        }
        if ((object7 = this.z) != null && (n7 = object instanceof wg3_1) != 0) {
            object6 = object;
            object6 = (wg3_1)object;
            object6.a((Q2)object7);
        }
        object7 = this.A;
        n7 = object instanceof wg3_1;
        n8 = 26;
        if (n7 != 0) {
            object2 = object;
            object2 = (wg3_1)object;
            object2.setContentDescription((CharSequence)object7);
        } else {
            n10 = Build.VERSION.SDK_INT;
            if (n10 >= n8) {
                ao1_1.b((MenuItem)object, (CharSequence)object7);
            }
        }
        object7 = this.B;
        if (n7 != 0) {
            object2 = object;
            object2 = (wg3_1)object;
            object2.setTooltipText((CharSequence)object7);
        } else {
            n10 = Build.VERSION.SDK_INT;
            if (n10 >= n8) {
                ao1_1.f((MenuItem)object, (CharSequence)object7);
            }
        }
        n4 = this.n;
        n10 = this.o;
        if (n7 != 0) {
            object5 = object;
            object5 = (wg3_1)object;
            object5.setAlphabeticShortcut((char)n4, n10);
        } else {
            n3 = Build.VERSION.SDK_INT;
            if (n3 >= n8) {
                ao1_1.a((MenuItem)object, (char)n4, n10);
            }
        }
        n4 = this.p;
        n10 = this.q;
        if (n7 != 0) {
            object5 = object;
            object5 = (wg3_1)object;
            object5.setNumericShortcut((char)n4, n10);
        } else {
            n3 = Build.VERSION.SDK_INT;
            if (n3 >= n8) {
                ao1_1.e((MenuItem)object, (char)n4, n10);
            }
        }
        object7 = this.D;
        if (object7 != null) {
            if (n7 != 0) {
                object2 = object;
                object2 = (wg3_1)object;
                object2.setIconTintMode((PorterDuff.Mode)object7);
            } else {
                n10 = Build.VERSION.SDK_INT;
                if (n10 >= n8) {
                    ao1_1.d((MenuItem)object, (PorterDuff.Mode)object7);
                }
            }
        }
        if ((object7 = this.C) == null) return;
        if (n7 != 0) {
            object = (wg3_1)object;
            object.setIconTintList((ColorStateList)object7);
            return;
        }
        n7 = Build.VERSION.SDK_INT;
        if (n7 < n8) return;
        ao1_1.c((MenuItem)object, (ColorStateList)object7);
    }
}

