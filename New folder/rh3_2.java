/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Rh3
 */
public final class rh3_2
extends Lambda
implements Function2 {
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public rh3_2(u10 u102, Function2 function2, int n3) {
        this.c = u102;
        this.d = function2;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.e | 1);
        Function2 function2 = this.d;
        Uh3.d((u10)this.c, function2, (b30_0)object, n3);
        return Unit.a;
    }
}

