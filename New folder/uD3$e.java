/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class uD3$e
extends ud3_1 {
    public boolean g;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void f(float f5, View object) {
        String string2;
        GenericDeclaration genericDeclaration;
        int n3 = 1;
        boolean bl2 = object instanceof MotionLayout;
        if (bl2) {
            object = (MotionLayout)object;
            f5 = this.a(f5);
            ((MotionLayout)object).setProgress(f5);
            return;
        }
        bl2 = this.g;
        if (bl2) {
            return;
        }
        try {
            genericDeclaration = object.getClass();
            string2 = "setProgress";
        }
        catch (NoSuchMethodException noSuchMethodException) {
            this.g = n3;
            return;
        }
        Class[] classArray = new Class[n3];
        Class<Float> clazz = Float.TYPE;
        classArray[0] = clazz;
        genericDeclaration = ((Class)genericDeclaration).getMethod(string2, classArray);
        if (genericDeclaration == null) return;
        f5 = this.a(f5);
        Float f6 = Float.valueOf(f5);
        Object[] objectArray = new Object[n3];
        objectArray[0] = f6;
        try {
            ((Method)genericDeclaration).invoke(object, objectArray);
            return;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return;
        }
    }
}

