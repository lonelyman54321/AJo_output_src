/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from z70
 */
public final class z70_0
extends Lambda
implements Function2 {
    public final /* synthetic */ P70 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ LP1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;

    public z70_0(P70 p70, Function0 function0, LP1 lP1, Yk3 yk3, int n3) {
        this.c = p70;
        this.d = function0;
        this.e = lP1;
        this.f = yk3;
        this.g = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.g | 1);
        Function0 function0 = this.d;
        Object object4 = object = this.f;
        object4 = (Yk3)object;
        P70 p70 = this.c;
        LP1 lP1 = this.e;
        C70.a(p70, function0, lP1, (Yk3)object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

