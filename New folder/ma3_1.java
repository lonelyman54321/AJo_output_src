/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ma3
 */
public final class ma3_1
implements Callable {
    public final Object call() {
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        Intrinsics.checkNotNullParameter(object, "context");
        jZ1 jZ12 = jZ1.b;
        if (jZ12 == null) {
            jZ1.b = jZ12 = new jZ1((AJIOApplication)object);
        }
        object = jZ1.b;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ajio.ril.core.analytics.NewGATracker_Revamp");
        return ((jZ1)object).a.get("&cid");
    }
}

