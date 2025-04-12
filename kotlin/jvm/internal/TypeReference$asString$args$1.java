/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KTypeProjection;

final class TypeReference$asString$args$1
extends Lambda
implements Function1 {
    final /* synthetic */ TypeReference this$0;

    public TypeReference$asString$args$1(TypeReference typeReference) {
        this.this$0 = typeReference;
        super(1);
    }

    public final CharSequence invoke(KTypeProjection kTypeProjection) {
        Intrinsics.checkNotNullParameter(kTypeProjection, "it");
        return TypeReference.access$asString(this.this$0, kTypeProjection);
    }
}

