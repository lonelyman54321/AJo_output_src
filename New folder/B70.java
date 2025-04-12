/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class B70
extends Lambda
implements Function2 {
    public final /* synthetic */ P70 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ LP1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ int i;

    public B70(P70 p70, Function0 function0, Yk3 yk3, LP1 lP1, boolean bl2, u10 u102, int n3) {
        this.c = p70;
        this.d = function0;
        this.e = yk3;
        this.f = lP1;
        this.g = bl2;
        this.h = u102;
        this.i = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.i | 1);
        Object object4 = object = this.e;
        object4 = (Yk3)object;
        Object object5 = object = this.h;
        object5 = (u10)object;
        P70 p70 = this.c;
        Function0 function0 = this.d;
        LP1 lP1 = this.f;
        boolean bl2 = this.g;
        C70.b(p70, function0, (Yk3)object4, lP1, bl2, (u10)object5, (b30_0)object3, n3);
        return Unit.a;
    }
}

