/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;

public final class e
extends Lambda
implements Function1 {
    public final /* synthetic */ CharSequence c;

    public e(CharSequence charSequence) {
        this.c = charSequence;
        super(1);
    }

    public final String a(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "it");
        return StringsKt__StringsKt.A(this.c, intRange);
    }
}

