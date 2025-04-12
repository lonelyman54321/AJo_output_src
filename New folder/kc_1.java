/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KC
 */
public final class kc_1
implements Function0 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ yp0_0 d;
    public final /* synthetic */ Resource e;

    public /* synthetic */ kc_1(dr0_0 dr0_02, boolean bl2, c80 c802, yp0_0 yp0_02, Resource resource) {
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
            yc_1 yc_12 = new yc_1(yp0_02, resource, null);
            Ae3.d(i90_02, null, null, yc_12, n3);
        } else {
            zc_0 zc_02 = new zc_0(yp0_02, resource, null);
            Ae3.d(i90_02, null, null, zc_02, n3);
        }
        return Unit.a;
    }
}

