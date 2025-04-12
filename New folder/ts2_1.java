/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from TS2
 */
public final class ts2_1
extends Lambda
implements Function2 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ gx0_2 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ lg3_0 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ int k;

    public ts2_1(boolean bl2, int n3, Function2 function2, u10 u102, u10 u103, Function2 function22, lg3_0 lg3_02, Function2 function23, int n4) {
        this.c = bl2;
        this.d = n3;
        this.e = function2;
        this.f = u102;
        this.g = u103;
        this.h = function22;
        this.i = lg3_02;
        this.j = function23;
        this.k = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.k | 1);
        Object object4 = object = this.f;
        object4 = (u10)object;
        Object object5 = object = this.g;
        object5 = (u10)object;
        boolean bl2 = this.c;
        int n4 = this.d;
        Function2 function2 = this.e;
        Function2 function22 = this.h;
        lg3_0 lg3_02 = this.i;
        Function2 function23 = this.j;
        HS2.c(bl2, n4, function2, (u10)object4, (u10)object5, function22, lg3_02, function23, (b30_0)object3, n3);
        return Unit.a;
    }
}

