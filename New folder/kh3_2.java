/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.view.Display
 *  android.view.DisplayCutout
 */
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kH3
 */
public final class kh3_2
implements hH3 {
    public static final kh3_2 a;

    static {
        kh3_2 kh3_22;
        a = kh3_22 = new kh3_2();
        Intrinsics.checkNotNullExpressionValue(kh3_2.class.getSimpleName(), "WindowMetricsCalculatorC\u2026at::class.java.simpleName");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Rect a(Activity object) {
        int n3;
        Object object2;
        Object[] objectArray;
        GenericDeclaration genericDeclaration;
        DisplayCutout displayCutout;
        Object object3;
        Rect rect;
        AnnotatedElement annotatedElement;
        String string2;
        int n4;
        int n7;
        block25: {
            n7 = 0;
            n4 = 1;
            string2 = "displayCutout";
            annotatedElement = "activity";
            Intrinsics.checkNotNullParameter(object, (String)((Object)annotatedElement));
            rect = new Rect();
            object3 = object.getResources().getConfiguration();
            displayCutout = null;
            genericDeclaration = Configuration.class;
            objectArray = "windowConfiguration";
            try {
                genericDeclaration = ((Class)genericDeclaration).getDeclaredField((String)objectArray);
                ((AccessibleObject)((Object)genericDeclaration)).setAccessible(n4 != 0);
                object3 = ((Field)((Object)genericDeclaration)).get(object3);
                Intrinsics.checkNotNullParameter(object, (String)((Object)annotatedElement));
                boolean bl2 = d3.a((Activity)object);
                objectArray = "null cannot be cast to non-null type android.graphics.Rect";
                if (bl2) {
                    genericDeclaration = object3.getClass();
                    object2 = "getBounds";
                    object3 = ((Method)(genericDeclaration = ((Class)genericDeclaration).getDeclaredMethod((String)object2, null))).invoke(object3, null);
                    if (object3 == null) {
                        object3 = new NullPointerException((String)objectArray);
                        throw object3;
                    }
                    object3 = (Rect)object3;
                    rect.set((Rect)object3);
                    break block25;
                } else {
                    genericDeclaration = object3.getClass();
                    object2 = "getAppBounds";
                    object3 = ((Method)(genericDeclaration = ((Class)genericDeclaration).getDeclaredMethod((String)object2, null))).invoke(object3, null);
                    if (object3 == null) {
                        object3 = new NullPointerException((String)objectArray);
                        throw object3;
                    }
                    object3 = (Rect)object3;
                    rect.set((Rect)object3);
                }
                break block25;
            }
            catch (IllegalAccessException illegalAccessException) {
                object3 = object.getWindowManager().getDefaultDisplay();
                object3.getRectSize(rect);
                break block25;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                object3 = object.getWindowManager().getDefaultDisplay();
                object3.getRectSize(rect);
                break block25;
            }
            catch (NoSuchFieldException noSuchFieldException) {
                object3 = object.getWindowManager().getDefaultDisplay();
                object3.getRectSize(rect);
                break block25;
            }
            catch (InvocationTargetException invocationTargetException) {}
            object3 = object.getWindowManager().getDefaultDisplay();
            object3.getRectSize(rect);
        }
        object3 = object.getWindowManager().getDefaultDisplay();
        genericDeclaration = new Point();
        Intrinsics.checkNotNullExpressionValue(object3, "currentDisplay");
        Intrinsics.checkNotNullParameter(object3, "display");
        objectArray = "point";
        Intrinsics.checkNotNullParameter(genericDeclaration, (String)objectArray);
        object3.getRealSize(genericDeclaration);
        Intrinsics.checkNotNullParameter(object, (String)((Object)annotatedElement));
        int n8 = d3.a((Activity)object);
        if (n8 == 0) {
            int n10;
            n8 = kh3_2.b((Context)object);
            n3 = rect.bottom + n8;
            if (n3 == (n10 = ((Point)genericDeclaration).y)) {
                rect.bottom = n3;
            } else {
                n3 = rect.right + n8;
                n10 = ((Point)genericDeclaration).x;
                if (n3 == n10) {
                    rect.right = n3;
                } else {
                    n3 = rect.left;
                    if (n3 == n8) {
                        rect.left = 0;
                    }
                }
            }
        }
        if ((n8 = rect.width()) < (n3 = ((Point)genericDeclaration).x) || (n8 = rect.height()) < (n3 = ((Point)genericDeclaration).y)) {
            Intrinsics.checkNotNullParameter(object, (String)((Object)annotatedElement));
            int n14 = d3.a((Activity)object);
            if (n14 == 0) {
                object = "android.view.DisplayInfo";
                try {
                    object = Class.forName((String)object);
                    object = ((Class)object).getConstructor(null);
                    ((AccessibleObject)object).setAccessible(n4 != 0);
                    object = ((Constructor)object).newInstance(null);
                    annotatedElement = object3.getClass();
                    objectArray = "getDisplayInfo";
                    object2 = object.getClass();
                    Class[] classArray = new Class[n4];
                    classArray[0] = object2;
                    annotatedElement = ((Class)annotatedElement).getDeclaredMethod((String)objectArray, classArray);
                    ((AccessibleObject)annotatedElement).setAccessible(n4 != 0);
                    objectArray = new Object[n4];
                    objectArray[0] = object;
                    ((Method)annotatedElement).invoke(object3, objectArray);
                    annotatedElement = object.getClass();
                    annotatedElement = ((Class)annotatedElement).getDeclaredField(string2);
                    ((AccessibleObject)annotatedElement).setAccessible(n4 != 0);
                    object = ((Field)annotatedElement).get(object);
                    n4 = iH3.a(object);
                    if (n4 != 0) {
                        displayCutout = jh3_0.a(object);
                    }
                }
                catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {}
                if (displayCutout != null) {
                    n14 = rect.left;
                    Intrinsics.checkNotNullParameter(displayCutout, string2);
                    n4 = lr0_0.a(displayCutout);
                    if (n14 == n4) {
                        rect.left = 0;
                    }
                    n14 = ((Point)genericDeclaration).x;
                    n4 = rect.right;
                    n14 -= n4;
                    Intrinsics.checkNotNullParameter(displayCutout, string2);
                    n4 = jr0.a(displayCutout);
                    if (n14 == n4) {
                        n14 = rect.right;
                        Intrinsics.checkNotNullParameter(displayCutout, string2);
                        rect.right = n4 = jr0.a(displayCutout) + n14;
                    }
                    n14 = rect.top;
                    Intrinsics.checkNotNullParameter(displayCutout, string2);
                    n4 = mr0.a(displayCutout);
                    if (n14 == n4) {
                        rect.top = 0;
                    }
                    n14 = ((Point)genericDeclaration).y;
                    n7 = rect.bottom;
                    n14 -= n7;
                    Intrinsics.checkNotNullParameter(displayCutout, string2);
                    n7 = kr0.a(displayCutout);
                    if (n14 == n7) {
                        n14 = rect.bottom;
                        Intrinsics.checkNotNullParameter(displayCutout, string2);
                        rect.bottom = n7 = kr0.a(displayCutout) + n14;
                    }
                }
            }
        }
        return rect;
    }

    public static int b(Context context) {
        int n3;
        String string2;
        String string3;
        String string4;
        int n4 = (context = context.getResources()).getIdentifier(string4 = "navigation_bar_height", string3 = "dimen", string2 = "android");
        if (n4 > 0) {
            n3 = context.getDimensionPixelSize(n4);
        } else {
            n3 = 0;
            context = null;
        }
        return n3;
    }

    public static Point c(Display display) {
        String string2 = "display";
        Intrinsics.checkNotNullParameter(display, string2);
        Point point = new Point();
        Intrinsics.checkNotNullParameter(display, string2);
        Intrinsics.checkNotNullParameter(point, "point");
        display.getRealSize(point);
        return point;
    }
}

