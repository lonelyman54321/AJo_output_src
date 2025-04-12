/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

public final class c
extends Lambda
implements Function2 {
    public final /* synthetic */ char[] c;
    public final /* synthetic */ boolean d;

    public c(char[] cArray, boolean bl2) {
        this.c = cArray;
        this.d = bl2;
        super(2);
    }

    public final Pair a(CharSequence object, int n3) {
        Intrinsics.checkNotNullParameter(object, "$this$$receiver");
        Object object2 = this.c;
        boolean bl2 = this.d;
        int n4 = StringsKt__StringsKt.v((CharSequence)object, object2, n3, bl2);
        if (n4 < 0) {
            n4 = 0;
            object = null;
        } else {
            object = n4;
            n3 = 1;
            Integer n7 = n3;
            object2 = new Pair;
            object2(object, n7);
            object = object2;
        }
        return object;
    }
}

