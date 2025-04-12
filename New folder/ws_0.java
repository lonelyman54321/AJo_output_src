/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from WS
 */
public final class ws_0
extends Lambda
implements Function2 {
    public final /* synthetic */ ao3 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ LP1 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ wr1_1 g;
    public final /* synthetic */ RS h;
    public final /* synthetic */ int i;

    public ws_0(ao3 ao32, Function0 function0, LP1 lP1, boolean bl2, wr1_1 wr1_12, RS rS, int n3) {
        this.c = ao32;
        this.d = function0;
        this.e = lP1;
        this.f = bl2;
        this.g = wr1_12;
        this.h = rS;
        this.i = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.i | 1);
        LP1 lP1 = this.e;
        boolean bl2 = this.f;
        ao3 ao32 = this.c;
        Function0 function0 = this.d;
        wr1_1 wr1_12 = this.g;
        RS rS = this.h;
        VS.c(ao32, function0, lP1, bl2, wr1_12, rS, (b30_0)object3, n3);
        return Unit.a;
    }
}

