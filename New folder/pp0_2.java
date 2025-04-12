/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from pp0
 */
public final class pp0_2 {
    public final ConcurrentHashMap a;

    public pp0_2() {
        ConcurrentHashMap concurrentHashMap;
        this.a = concurrentHashMap = new ConcurrentHashMap(16);
    }

    public final Object a(SerialDescriptor object, pp0$a_1 pp0$a_1) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        Intrinsics.checkNotNullParameter(pp0$a_1, "key");
        object = (Map)this.a.get(object);
        Object object2 = null;
        object = object != null ? object.get(pp0$a_1) : null;
        if (object != null) {
            object2 = object;
        }
        return object2;
    }
}

