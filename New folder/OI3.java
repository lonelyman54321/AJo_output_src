/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import kotlin.jvm.internal.Intrinsics;

public abstract class OI3 {
    public abstract void a(Context var1, String var2, WorkerParameters var3);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final c b(Context object, String object2, WorkerParameters object3) {
        Class[] classArray;
        int n3 = 1;
        int n4 = 2;
        Intrinsics.checkNotNullParameter(object, "appContext");
        Intrinsics.checkNotNullParameter(object2, "workerClassName");
        GenericDeclaration genericDeclaration = "workerParameters";
        Intrinsics.checkNotNullParameter(object3, (String)((Object)genericDeclaration));
        this.a((Context)object, (String)object2, (WorkerParameters)object3);
        try {
            genericDeclaration = Class.forName((String)object2);
            classArray = c.class;
            genericDeclaration = ((Class)genericDeclaration).asSubclass(classArray);
            classArray = "{\n                Class.\u2026class.java)\n            }";
            Intrinsics.checkNotNullExpressionValue(genericDeclaration, (String)classArray);
        }
        catch (Throwable throwable) {
            object2 = qx1.a();
            int n8 = PI3.a;
            object2.getClass();
            throw throwable;
        }
        try {
            Class clazz;
            classArray = new Class[n4];
            classArray[0] = clazz = Context.class;
            classArray[n3] = clazz = WorkerParameters.class;
            genericDeclaration = ((Class)genericDeclaration).getDeclaredConstructor(classArray);
            Object[] objectArray = new Object[n4];
            objectArray[0] = object;
            objectArray[n3] = object3;
            object = ((Constructor)genericDeclaration).newInstance(objectArray);
            object3 = "{\n                val co\u2026Parameters)\n            }";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            object = (c)object;
            boolean bl2 = ((c)object).isUsed();
            if (!bl2) {
                return object;
            }
            object = new StringBuilder("WorkerFactory (");
            object3 = this.getClass().getName();
            ((StringBuilder)object).append((String)object3);
        }
        catch (Throwable throwable) {
            object2 = qx1.a();
            int n7 = PI3.a;
            object2.getClass();
            throw throwable;
        }
        ((StringBuilder)object).append(") returned an instance of a ListenableWorker (");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        object = ((StringBuilder)object).toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

