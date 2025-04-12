/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.viewinterop;

import androidx.compose.ui.viewinterop.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b$a
extends Lambda
implements Function2 {
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public b$a(Function1 function1, LP1 lP1, Function1 function12, int n3, int n4) {
        this.c = function1;
        this.d = lP1;
        this.e = function12;
        this.f = n3;
        this.g = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        LP1 lP1 = this.d;
        Function1 function1 = this.e;
        Function1 function12 = this.c;
        int n4 = this.g;
        b.a(function12, lP1, function1, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

