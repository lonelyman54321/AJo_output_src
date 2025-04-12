/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

public final class KTypeProjection$a {
    public KTypeProjection$a(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static KTypeProjection a(kn1_1 kn1_12) {
        Intrinsics.checkNotNullParameter(kn1_12, "type");
        nn1_1 nn1_12 = nn1_1.INVARIANT;
        KTypeProjection kTypeProjection = new KTypeProjection(nn1_12, kn1_12);
        return kTypeProjection;
    }
}

