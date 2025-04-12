/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.lifecycle.E$c;
import com.ril.ajio.data.repo.BaseRepo;

/*
 * Renamed from kD3
 */
public final class kd3_2
extends E$c {
    public static volatile kd3_2 c;
    public BaseRepo a;
    public Application b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static kd3_2 a() {
        Object object = c;
        if (object != null) return c;
        object = kd3_2.class;
        synchronized (object) {
            try {
                kd3_2 kd3_22 = c;
                if (kd3_22 != null) return c;
                c = kd3_22 = new kd3_2();
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final jD3 create(Class object) {
        Object object2 = h5_0.class;
        boolean bl2 = ((Class)object).isAssignableFrom((Class<?>)object2);
        if (bl2) {
            object2 = this.a;
            object = new h5_0((BaseRepo)object2);
            return object;
        }
        object2 = hy3_0.class;
        bl2 = ((Class)object).isAssignableFrom((Class<?>)object2);
        if (bl2) {
            object2 = this.b;
            BaseRepo baseRepo = this.a;
            object = new hy3_0((Application)object2, baseRepo);
            return object;
        }
        object2 = h91.class;
        bl2 = ((Class)object).isAssignableFrom((Class<?>)object2);
        if (bl2) {
            object2 = this.b;
            BaseRepo baseRepo = this.a;
            object = new h91((Application)object2, baseRepo);
            return object;
        }
        object2 = uc3_2.class;
        bl2 = ((Class)object).isAssignableFrom((Class<?>)object2);
        if (bl2) {
            object2 = this.b;
            object = new uc3_2((Application)object2);
            return object;
        }
        object2 = ys2_1.class;
        bl2 = ((Class)object).isAssignableFrom((Class<?>)object2);
        if (bl2) {
            object2 = this.a;
            object = new ys2_1((BaseRepo)object2);
            return object;
        }
        object2 = w23_0.class;
        bl2 = ((Class)object).isAssignableFrom((Class<?>)object2);
        if (bl2) {
            object2 = this.b;
            BaseRepo baseRepo = this.a;
            object = new w23_0((Application)object2, baseRepo);
            return object;
        }
        object2 = x9_0.class;
        bl2 = ((Class)object).isAssignableFrom((Class<?>)object2);
        if (bl2) {
            object2 = (n9_0)this.a;
            Application application = this.b;
            object = new x9_0((n9_0)object2, application);
            return object;
        }
        object = ((Class)object).getName();
        object = "Unknown ViewModel class: ".concat((String)object);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

