/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.DrawableContainer
 *  android.graphics.drawable.DrawableContainer$DrawableContainerState
 *  android.graphics.drawable.InsetDrawable
 *  android.os.Build$VERSION
 */
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/*
 * Renamed from Ut0
 */
public final class ut0_0 {
    public static Method a;
    public static boolean b;
    public static Method c;
    public static boolean d;

    public static void a(Drawable drawable2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            drawable2.clearColorFilter();
        } else {
            drawable2.clearColorFilter();
            n3 = drawable2 instanceof InsetDrawable;
            if (n3 != 0) {
                drawable2 = ((InsetDrawable)drawable2).getDrawable();
                ut0_0.a(drawable2);
            } else {
                n3 = drawable2 instanceof fj3_0;
                if (n3 != 0) {
                    drawable2 = ((fj3_0)drawable2).a();
                    ut0_0.a(drawable2);
                } else {
                    n3 = drawable2 instanceof DrawableContainer;
                    if (n3 != 0 && (drawable2 = (DrawableContainer.DrawableContainerState)((DrawableContainer)drawable2).getConstantState()) != null) {
                        n3 = drawable2.getChildCount();
                        for (n4 = 0; n4 < n3; ++n4) {
                            Drawable drawable3 = drawable2.getChild(n4);
                            if (drawable3 == null) continue;
                            ut0_0.a(drawable3);
                        }
                    }
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int b(Drawable object) {
        Method method;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            return Ut0$a.a((Drawable)object);
        }
        n3 = (int)(d ? 1 : 0);
        n4 = 0;
        if (!n3) {
            n3 = 1;
            Object object2 = Drawable.class;
            String string2 = "getLayoutDirection";
            try {
                c = object2 = ((Class)object2).getDeclaredMethod(string2, null);
                ((AccessibleObject)object2).setAccessible(n3 != 0);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            d = n3;
        }
        if ((method = c) != null) {
            try {
                object = method.invoke(object, null);
                object = (Integer)object;
                return (Integer)object;
            }
            catch (Exception exception) {
                c = null;
            }
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean c(Drawable drawable2, int n3) {
        Object[] objectArray;
        Object object;
        boolean bl2 = true;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 >= n7) {
            return Ut0$a.b(drawable2, n3);
        }
        n4 = (int)(b ? 1 : 0);
        if (n4 == 0) {
            object = Drawable.class;
            objectArray = "setLayoutDirection";
            try {
                Class<Integer> clazz;
                Class[] classArray = new Class[bl2];
                classArray[0] = clazz = Integer.TYPE;
                a = object = ((Class)object).getDeclaredMethod((String)objectArray, classArray);
                ((AccessibleObject)object).setAccessible(bl2);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            b = bl2;
        }
        if ((object = a) != null) {
            try {
                Integer n8 = n3;
                objectArray = new Object[bl2];
                objectArray[0] = n8;
                ((Method)object).invoke((Object)drawable2, objectArray);
                return bl2;
            }
            catch (Exception exception) {
                drawable2 = null;
                a = null;
            }
        }
        return false;
    }

    public static void d(Drawable drawable2, int n3) {
        drawable2.setTint(n3);
    }

    public static void e(Drawable drawable2, ColorStateList colorStateList) {
        drawable2.setTintList(colorStateList);
    }

    public static void f(Drawable drawable2, PorterDuff.Mode mode) {
        drawable2.setTintMode(mode);
    }

    public static Drawable g(Drawable drawable2) {
        boolean bl2 = drawable2 instanceof fj3_0;
        if (bl2) {
            drawable2 = ((fj3_0)drawable2).a();
        }
        return drawable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Drawable h(Drawable object) {
        ij3_0 ij3_02;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            return object;
        }
        n3 = object instanceof Pn3;
        if (n3 != 0) return (Drawable)object;
        hJ3 hJ32 = new Drawable();
        hJ32.d = ij3_02 = hJ32.d();
        hJ32.b((Drawable)object);
        object = hJ3.h;
        if (object != null) return hJ32;
        object = Drawable.class;
        String string2 = "isProjected";
        try {
            hJ3.h = object = ((Class)object).getDeclaredMethod(string2, null);
            return hJ32;
        }
        catch (Exception exception) {
            return hJ32;
        }
    }
}

