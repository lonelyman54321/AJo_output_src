/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from e40
 */
public final class e40_0
implements yq_1 {
    public final ConcurrentHashMap a;

    public e40_0() {
        ConcurrentHashMap concurrentHashMap;
        this.a = concurrentHashMap = new ConcurrentHashMap();
    }

    public final Object a(xq_2 xq_22) {
        Intrinsics.checkNotNullParameter(xq_22, "key");
        return this.h().get(xq_22);
    }

    public final void b(xq_2 xq_22) {
        Intrinsics.checkNotNullParameter(xq_22, "key");
        this.h().remove(xq_22);
    }

    public final Object c(xq_2 object, Function0 object2) {
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "block");
        ConcurrentHashMap concurrentHashMap = this.a;
        Object v4 = concurrentHashMap.get(object);
        if (v4 != null) {
            return v4;
        }
        if ((object = concurrentHashMap.putIfAbsent(object, object2 = object2.invoke())) != null) {
            object2 = object;
        }
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return object2;
    }

    public final void d(xq_2 xq_22, Object object) {
        Intrinsics.checkNotNullParameter(xq_22, "key");
        Intrinsics.checkNotNullParameter(object, "value");
        this.h().put(xq_22, object);
    }

    public final List e() {
        return CollectionsKt.k0(this.h().keySet());
    }

    public final boolean f(xq_2 xq_22) {
        Intrinsics.checkNotNullParameter(xq_22, "key");
        return this.h().containsKey(xq_22);
    }

    public final Object g(xq_2 object) {
        Intrinsics.checkNotNullParameter(object, "key");
        Object object2 = this.a((xq_2)object);
        if (object2 != null) {
            return object2;
        }
        StringBuilder stringBuilder = new StringBuilder("No instance for key ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public final Map h() {
        return this.a;
    }
}

