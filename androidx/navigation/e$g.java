/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e$g
extends Lambda
implements Function1 {
    public final /* synthetic */ String c;

    public e$g(String string2) {
        this.c = string2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (String)object;
        String string2 = this.c;
        return Intrinsics.areEqual(object, string2);
    }
}

