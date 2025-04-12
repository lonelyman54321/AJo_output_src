/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wi1
 */
public final class wi1_2 {
    public static final wi1$a Companion;
    public final jo_2 a;
    public final ExecutorService b;
    public final zr1_1 c;
    public final zr1_1 d;
    public boolean e;
    public q60_0 f;

    static {
        wi1$a wi1$a;
        Companion = wi1$a = new Object();
    }

    public wi1_2() {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Object object = new jo_2((Context)aJIOApplication);
        this.a = object;
        object = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(object, "newSingleThreadExecutor(...)");
        this.b = object;
        this.c = object = new zr1_1();
        this.d = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(qu3 object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        boolean bl2;
                        boolean bl3 = this.e;
                        if (bl3) break block4;
                        this.e = bl3 = true;
                        zr1_1 zr1_12 = this.c;
                        zr1_12.i(object);
                        object = this.f;
                        if (object == null || (bl2 = ((q60_0)object).isDisposed()) || (object = this.f) == null) break block4;
                        gr0_2.dispose((AtomicReference)object);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

