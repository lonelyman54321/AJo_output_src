/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import java.util.concurrent.Callable;

/*
 * Renamed from mI
 */
public final class mi_2
implements Callable {
    public final /* synthetic */ CTInboxMessage a;
    public final /* synthetic */ oi_1 b;

    public mi_2(oi_1 oi_12, CTInboxMessage cTInboxMessage) {
        this.b = oi_12;
        this.a = cTInboxMessage;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Object object = this.b.f.b;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object2 = this.b;
                        Object object3 = this.a;
                        object3 = ((CTInboxMessage)object3).l;
                        boolean bl2 = ((oi_1)object2).b((String)object3);
                        if (!bl2) break block3;
                        object2 = this.b;
                        object2 = ((oi_1)object2).g;
                        object2.getClass();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return null;
            }
            throw throwable2;
        }
    }
}

