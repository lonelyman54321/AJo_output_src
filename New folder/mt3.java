/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
import android.graphics.Typeface;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class mt3
extends lt3 {
    /*
     * WARNING - void declaration
     */
    public final Typeface k(Object object) {
        void var1_4;
        int n3 = 0;
        Object object2 = null;
        int n4 = 1;
        Object object3 = this.f;
        object3 = Array.newInstance(object3, n4);
        Array.set(object3, 0, object);
        object = this.l;
        int n7 = -1;
        Integer n8 = n7;
        Integer n10 = n7;
        int n14 = 4;
        Object[] objectArray = new Object[n14];
        objectArray[0] = object3;
        object2 = "sans-serif";
        objectArray[n4] = object2;
        n3 = 2;
        objectArray[n3] = n8;
        n3 = 3;
        objectArray[n3] = n10;
        n3 = 0;
        object2 = null;
        object = ((Method)object).invoke(null, objectArray);
        try {
            return (Typeface)object;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        object2 = new RuntimeException((Throwable)var1_4);
        throw object2;
    }

    public final Method o(Class genericDeclaration) {
        boolean bl2 = true;
        genericDeclaration = Array.newInstance(genericDeclaration, (int)(bl2 ? 1 : 0)).getClass();
        Class[] classArray = new Class[4];
        classArray[0] = genericDeclaration;
        classArray[bl2] = String.class;
        genericDeclaration = Integer.TYPE;
        classArray[2] = genericDeclaration;
        classArray[3] = genericDeclaration;
        genericDeclaration = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", classArray);
        ((AccessibleObject)((Object)genericDeclaration)).setAccessible(bl2);
        return genericDeclaration;
    }
}

