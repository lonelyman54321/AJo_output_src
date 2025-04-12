/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

public final class ZF2
implements n {
    public final zs2_1 a;

    public ZF2(zs2_1 zs2_12) {
        Intrinsics.checkNotNullParameter(zs2_12, "owner");
        this.a = zs2_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(mu1_1 object, i$a object2) {
        Intrinsics.checkNotNullParameter(object, "source");
        Intrinsics.checkNotNullParameter(object2, "event");
        Object object3 = i$a.ON_CREATE;
        if (object2 != object3) {
            object = new AssertionError((Object)"Next event must be ON_CREATE");
            throw object;
        }
        object.getLifecycle().c(this);
        object = this.a;
        object2 = object.getSavedStateRegistry();
        object3 = "androidx.savedstate.Restarter";
        object2 = ((xs2_1)object2).a((String)object3);
        if (object2 == null) {
            return;
        }
        object3 = "classes_to_restore";
        if ((object2 = object2.getStringArrayList((String)object3)) == null) {
            object = new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            throw object;
        }
        object2 = object2.iterator();
        boolean bl2;
        while (bl2 = object2.hasNext()) {
            object3 = (String)object2.next();
            Object object4 = "Class ";
            Object object5 = ZF2.class;
            try {
                object5 = ((Class)object5).getClassLoader();
                Object object6 = null;
                object5 = Class.forName((String)object3, false, (ClassLoader)object5);
                object6 = xS2$a.class;
                object5 = ((Class)object5).asSubclass(object6);
                object6 = "{\n                Class.\u2026class.java)\n            }";
                Intrinsics.checkNotNullExpressionValue(object5, (String)object6);
                object6 = null;
            }
            catch (ClassNotFoundException classNotFoundException) {
                object3 = cP.a((String)object4, (String)object3, " wasn't found");
                object2 = new RuntimeException((String)object3, classNotFoundException);
                throw object2;
            }
            try {
                object4 = ((Class)object5).getDeclaredConstructor(null);
                boolean bl3 = true;
                ((AccessibleObject)object4).setAccessible(bl3);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                object3 = new StringBuilder((String)object4);
                object4 = ((Class)object5).getSimpleName();
                ((StringBuilder)object3).append((String)object4);
                ((StringBuilder)object3).append(" must have default constructor in order to be automatically recreated");
                object3 = ((StringBuilder)object3).toString();
                object2 = new IllegalStateException((String)object3, noSuchMethodException);
                throw object2;
            }
            try {
                object4 = ((Constructor)object4).newInstance(null);
                object5 = "{\n                constr\u2026wInstance()\n            }";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                object4 = (xS2$a)object4;
                object4.a((zs2_1)object);
            }
            catch (Exception exception) {
                object3 = kp1_0.c("Failed to instantiate ", (String)object3);
                object2 = new RuntimeException((String)object3, exception);
                throw object2;
            }
        }
        return;
    }
}

