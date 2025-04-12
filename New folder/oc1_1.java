/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Oc1
 */
public final class oc1_1
extends Lambda
implements Function2 {
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ wr1_1 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public oc1_1(Function0 function0, LP1 lP1, boolean bl2, wr1_1 wr1_12, u10 u102, int n3, int n4) {
        this.c = function0;
        this.d = lP1;
        this.e = bl2;
        this.f = wr1_12;
        this.g = u102;
        this.h = n3;
        this.i = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.h | 1);
        int n4 = this.i;
        Object object4 = object = this.g;
        object4 = (u10)object;
        Function0 function0 = this.c;
        LP1 lP1 = this.d;
        boolean bl2 = this.e;
        wr1_1 wr1_12 = this.f;
        pc1_0.a(function0, lP1, bl2, wr1_12, (u10)object4, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

