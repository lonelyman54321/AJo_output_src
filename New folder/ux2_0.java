/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ux2
 */
public final class ux2_0
extends Lambda
implements Function2 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public ux2_0(boolean bl2, Function2 function2, int n3) {
        this.c = bl2;
        this.d = function2;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.e | 1);
        boolean bl2 = this.c;
        Function2 function2 = this.d;
        Vx2.a(bl2, function2, (b30_0)object, n3);
        return Unit.a;
    }
}

