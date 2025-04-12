/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hC
 */
public final class hc_1
implements Function0 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ yp0_0 d;
    public final /* synthetic */ Resource e;

    public /* synthetic */ hc_1(dr0_0 dr0_02, boolean bl2, c80 c802, yp0_0 yp0_02, Resource resource) {
        this.a = dr0_02;
        this.b = bl2;
        this.c = c802;
        this.d = yp0_02;
        this.e = resource;
    }

    public final Object invoke() {
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        i90_0 i90_02 = this.c;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        yp0_0 yp0_02 = this.d;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        dr0_02.d0();
        int n3 = 3;
        boolean bl2 = this.b;
        Resource resource = this.e;
        if (bl2) {
            ac_2 ac_22 = new ac_2(yp0_02, resource, null);
            Ae3.d(i90_02, null, null, ac_22, n3);
        } else {
            bc_2 bc_22 = new bc_2(yp0_02, resource, null);
            Ae3.d(i90_02, null, null, bc_22, n3);
        }
        return Unit.a;
    }
}

