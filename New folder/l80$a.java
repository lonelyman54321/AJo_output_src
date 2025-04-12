/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.a$a;
import java.util.concurrent.Callable;

public final class l80$a
implements Callable {
    public final /* synthetic */ l80_0 a;

    public l80$a(l80_0 l80_02) {
        this.a = l80_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Object object = this.a;
        Object object2 = ((l80_0)object).f.b;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                Object object3;
                try {
                    object3 = ((l80_0)object).e;
                    if (object3 != null) {
                        object = ((l80_0)object).h;
                        object.getClass();
                        return null;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object3 = ((l80_0)object).k;
                if ((object3 = ((mp0_0)object3).f()) != null) {
                    CleverTapInstanceConfig cleverTapInstanceConfig = ((l80_0)object).i;
                    Object object4 = ((l80_0)object).k;
                    String string2 = ((mp0_0)object4).f();
                    object4 = ((l80_0)object).b;
                    Object object5 = ((l80_0)object).j;
                    object5 = ((Nh0)object4).c((Context)object5);
                    ti_0 ti_02 = ((l80_0)object).f;
                    tf_0 tf_02 = ((l80_0)object).h;
                    boolean bl2 = qb3_2.b;
                    object4 = object3;
                    ((l80_0)object).e = object3 = new oi_1(cleverTapInstanceConfig, string2, (mh0_0)object5, ti_02, tf_02, bl2);
                    object = ((l80_0)object).h;
                    object.getClass();
                } else {
                    object = ((l80_0)object).i;
                    object = ((CleverTapInstanceConfig)object).b();
                    object.getClass();
                    object = a$a.INFO;
                    ((a$a)((Object)object)).intValue();
                }
                return null;
            }
            throw throwable2;
        }
    }
}

