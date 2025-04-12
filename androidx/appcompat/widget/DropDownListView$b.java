/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AbsListView
 *  android.widget.AdapterView
 */
package androidx.appcompat.widget;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public final class DropDownListView$b {
    public static final Method a;
    public static final Method b;
    public static final Method c;
    public static final boolean d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        int n3;
        Class<Integer> clazz;
        Method method = null;
        boolean bl2 = true;
        Class<AdapterView> clazz2 = AdapterView.class;
        Object object = AbsListView.class;
        Class[] classArray = "positionSelector";
        try {
            clazz = Integer.TYPE;
            n3 = 5;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return;
        }
        Class[] classArray2 = new Class[n3];
        classArray2[0] = clazz;
        Class<View> clazz3 = View.class;
        classArray2[bl2] = clazz3;
        Class<Boolean> clazz4 = Boolean.TYPE;
        int n4 = 2;
        classArray2[n4] = clazz4;
        Class<Float> clazz5 = Float.TYPE;
        n4 = 3;
        classArray2[n4] = clazz5;
        n4 = 4;
        classArray2[n4] = clazz5;
        object = ((Class)object).getDeclaredMethod((String)classArray, classArray2);
        a = object;
        ((AccessibleObject)object).setAccessible(bl2);
        object = "setSelectedPositionInt";
        classArray = new Class[bl2];
        classArray[0] = clazz;
        object = clazz2.getDeclaredMethod((String)object, classArray);
        b = object;
        ((AccessibleObject)object).setAccessible(bl2);
        object = "setNextSelectedPositionInt";
        classArray = new Class[bl2];
        classArray[0] = clazz;
        method = clazz2.getDeclaredMethod((String)object, classArray);
        c = method;
        ((AccessibleObject)method).setAccessible(bl2);
        d = bl2;
    }
}

