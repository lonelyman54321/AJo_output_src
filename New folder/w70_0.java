/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from W70
 */
public final class w70_0
extends Lambda
implements Function2 {
    public final /* synthetic */ Lw2 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ LP1 e;
    public final /* synthetic */ E70 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;

    public w70_0(K70 k70, Function0 function0, LP1 lP1, E70 e70, Yk3 yk3, int n3) {
        this.c = k70;
        this.d = function0;
        this.e = lP1;
        this.f = e70;
        this.g = yk3;
        this.h = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.h | 1);
        Object object4 = object = this.c;
        object4 = (K70)object;
        Object object5 = object = this.g;
        object5 = (Yk3)object;
        Function0 function0 = this.d;
        LP1 lP1 = this.e;
        E70 e70 = this.f;
        X70.c((K70)object4, function0, lP1, e70, (Yk3)object5, (b30_0)object3, n3);
        return Unit.a;
    }
}

