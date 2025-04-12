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

public final class SD3$e
extends sd3_0 {
    public boolean k;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean e(float f5, long l2, Tn1 tn1, View view) {
        GenericDeclaration genericDeclaration;
        int n3 = 1;
        boolean bl2 = view instanceof MotionLayout;
        if (bl2) {
            Object object = view;
            object = (MotionLayout)view;
            f5 = this.d(f5, l2, tn1, view);
            ((MotionLayout)object).setProgress(f5);
            return this.h;
        }
        bl2 = this.k;
        if (bl2) {
            return false;
        }
        try {
            Class<Float> clazz;
            genericDeclaration = view.getClass();
            String string2 = "setProgress";
            Class[] classArray = new Class[n3];
            classArray[0] = clazz = Float.TYPE;
            genericDeclaration = ((Class)genericDeclaration).getMethod(string2, classArray);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            this.k = n3;
            bl2 = false;
            genericDeclaration = null;
        }
        if (genericDeclaration == null) return this.h;
        try {
            f5 = this.d(f5, l2, tn1, view);
            Float f6 = Float.valueOf(f5);
            Object[] objectArray = new Object[n3];
            objectArray[0] = f6;
            ((Method)genericDeclaration).invoke(view, objectArray);
            return this.h;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return this.h;
        }
    }
}

