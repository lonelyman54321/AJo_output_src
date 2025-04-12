/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;

public final class c$c
extends Lambda
implements Function2 {
    public final /* synthetic */ CoroutineContext[] c;
    public final /* synthetic */ Ref$IntRef d;

    public c$c(CoroutineContext[] coroutineContextArray, Ref$IntRef ref$IntRef) {
        this.c = coroutineContextArray;
        this.d = ref$IntRef;
        super(2);
    }

    public final void a(Unit object, CoroutineContext$Element coroutineContext$Element) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(coroutineContext$Element, "element");
        object = this.d;
        int n4 = ((Ref$IntRef)object).element;
        ((Ref$IntRef)object).element = n3 = n4 + 1;
        this.c[n4] = coroutineContext$Element;
    }
}

