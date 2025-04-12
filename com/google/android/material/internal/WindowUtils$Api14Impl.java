/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.view.Display
 *  android.view.WindowManager
 */
package com.google.android.material.internal;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.material.internal.WindowUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class WindowUtils$Api14Impl {
    private WindowUtils$Api14Impl() {
    }

    public static Rect getCurrentWindowBounds(WindowManager windowManager) {
        int n3;
        windowManager = windowManager.getDefaultDisplay();
        Point point = WindowUtils$Api14Impl.getRealSizeForDisplay((Display)windowManager);
        Rect rect = new Rect();
        int n4 = point.x;
        if (n4 != 0 && (n3 = point.y) != 0) {
            rect.right = n4;
            rect.bottom = n3;
        } else {
            windowManager.getRectSize(rect);
        }
        return rect;
    }

    private static Point getRealSizeForDisplay(Display display) {
        int n3 = 1;
        Point point = new Point();
        Object object = Display.class;
        String string2 = "getRealSize";
        Class[] classArray = new Class[n3];
        Class<Point> clazz = Point.class;
        classArray[0] = clazz;
        object = ((Class)object).getDeclaredMethod(string2, classArray);
        ((AccessibleObject)object).setAccessible(n3 != 0);
        Object[] objectArray = new Object[n3];
        objectArray[0] = point;
        try {
            ((Method)object).invoke((Object)display, objectArray);
        }
        catch (InvocationTargetException invocationTargetException) {
            WindowUtils.access$000();
        }
        catch (IllegalAccessException illegalAccessException) {
            WindowUtils.access$000();
        }
        catch (NoSuchMethodException noSuchMethodException) {
            WindowUtils.access$000();
        }
        return point;
    }
}

