/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.common.base.Supplier;

public final class SE0
implements Supplier {
    public final /* synthetic */ Context a;

    public /* synthetic */ SE0(Context context) {
        this.a = context;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object get() {
        Object object = this.a;
        Object object2 = nl0_1.n;
        object2 = nl0_1.class;
        synchronized (object2) {
            try {
                Object object3 = nl0_1.t;
                if (object3 != null) return nl0_1.t;
                object3 = new nl0$a((Context)object);
                object = ((nl0$a)object3).a();
                nl0_1.t = object;
                return nl0_1.t;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

