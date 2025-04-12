/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.io.Serializable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Hn$a
implements View.OnClickListener {
    public final View a;
    public final String b;
    public Method c;
    public Context d;

    public Hn$a(View view, String string2) {
        this.a = view;
        this.b = string2;
    }

    public final void onClick(View object) {
        IllegalAccessException illegalAccessException2;
        Serializable serializable;
        block23: {
            Context context;
            GenericDeclaration genericDeclaration;
            int n3;
            block21: {
                int n4 = 0;
                serializable = null;
                n3 = 1;
                genericDeclaration = this.c;
                if (genericDeclaration == null) {
                    Object object2;
                    Object object3;
                    genericDeclaration = this.a;
                    context = genericDeclaration.getContext();
                    while (true) {
                        boolean bl2;
                        block20: {
                            object3 = this.b;
                            if (context == null) break;
                            try {
                                boolean bl3 = context.isRestricted();
                                if (bl3) break block20;
                            }
                            catch (NoSuchMethodException noSuchMethodException) {}
                            Class<?> clazz = context.getClass();
                            Class[] classArray = new Class[n3];
                            Class<View> clazz2 = View.class;
                            classArray[0] = clazz2;
                            object3 = clazz.getMethod((String)object3, classArray);
                            if (object3 == null) break block20;
                            this.c = object3;
                            this.d = context;
                            break block21;
                        }
                        if (bl2 = context instanceof ContextWrapper) {
                            context = ((ContextWrapper)context).getBaseContext();
                            continue;
                        }
                        context = null;
                    }
                    int n7 = genericDeclaration.getId();
                    if (n7 == (n4 = -1)) {
                        object = "";
                    } else {
                        serializable = new StringBuilder(" with id '");
                        object2 = genericDeclaration.getContext().getResources();
                        object = object2.getResourceEntryName(n7);
                        ((StringBuilder)serializable).append((String)object);
                        ((StringBuilder)serializable).append("'");
                        object = ((StringBuilder)serializable).toString();
                    }
                    object2 = Gn.a("Could not find method ", (String)object3, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    genericDeclaration = genericDeclaration.getClass();
                    ((StringBuilder)object2).append(genericDeclaration);
                    ((StringBuilder)object2).append((String)object);
                    object = ((StringBuilder)object2).toString();
                    serializable = new IllegalStateException((String)object);
                    throw serializable;
                }
            }
            genericDeclaration = this.c;
            context = this.d;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            try {
                genericDeclaration.invoke(context, objectArray);
                return;
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (IllegalAccessException illegalAccessException2) {
                break block23;
            }
            serializable = new IllegalStateException("Could not execute method for android:onClick", invocationTargetException);
            throw serializable;
        }
        serializable = new IllegalStateException("Could not execute non-public method for android:onClick", illegalAccessException2);
        throw serializable;
    }
}

