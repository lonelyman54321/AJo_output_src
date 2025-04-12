/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.pushnotification.amp.CTPushAmpWorker;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class Hq2$a
extends CI3$a {
    public Hq2$a(long l2, TimeUnit timeUnit, TimeUnit timeUnit2) {
        long l3;
        qx1 qx12;
        Object object = CTPushAmpWorker.class;
        Intrinsics.checkNotNullParameter(object, "workerClass");
        Intrinsics.checkNotNullParameter((Object)timeUnit, "repeatIntervalTimeUnit");
        Intrinsics.checkNotNullParameter((Object)timeUnit2, "flexIntervalTimeUnit");
        super((Class)object);
        EI3 eI3 = this.b;
        l2 = timeUnit.toMillis(l2);
        long l4 = 5;
        long l7 = timeUnit2.toMillis(l4);
        long l8 = 900000L;
        long l12 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
        if (l12 < 0) {
            eI3.getClass();
            object = qx1.a();
            object.getClass();
        }
        eI3.h = l2 = f.b(l2, l8);
        l2 = 300000L;
        long l14 = l7 - l2;
        Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object2 < 0) {
            qx12 = qx1.a();
            qx12.getClass();
        }
        if ((object2 = (l3 = l7 - (l2 = eI3.h)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            qx12 = qx1.a();
            qx12.getClass();
        }
        long l15 = eI3.h;
        eI3.i = l2 = f.i(l7, 300000L, l15);
    }

    public final CI3 b() {
        Object object = this.b;
        boolean bl2 = ((EI3)object).q ^ true;
        if (bl2) {
            Intrinsics.checkNotNullParameter(this, "builder");
            UUID uUID = this.a;
            EI3 eI3 = this.b;
            Set set = this.c;
            object = new CI3(uUID, eI3, set);
            return object;
        }
        String string2 = "PeriodicWorkRequests cannot be expedited".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final CI3$a c() {
        return this;
    }
}

