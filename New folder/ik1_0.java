/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ik1
 */
public final class ik1_0 {
    public final FP2 a;
    public final Set b;

    public ik1_0(FP2 object) {
        Intrinsics.checkNotNullParameter(object, "database");
        this.a = object;
        object = new IdentityHashMap();
        object = Collections.newSetFromMap(object);
        Intrinsics.checkNotNullExpressionValue(object, "newSetFromMap(IdentityHashMap())");
        this.b = object;
    }
}

