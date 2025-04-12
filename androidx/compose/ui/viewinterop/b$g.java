/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.viewinterop;

import androidx.compose.ui.viewinterop.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b$g
extends Lambda
implements Function2 {
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public b$g(Function1 function1, LP1 lP1, Function1 function12, Function1 function13, Function1 function14, int n3, int n4) {
        this.c = function1;
        this.d = lP1;
        this.e = function12;
        this.f = function13;
        this.g = function14;
        this.h = n3;
        this.i = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.h | 1);
        Function1 function1 = this.f;
        Function1 function12 = this.g;
        Function1 function13 = this.c;
        LP1 lP1 = this.d;
        Function1 function14 = this.e;
        int n4 = this.i;
        b.b(function13, lP1, function14, function1, function12, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

