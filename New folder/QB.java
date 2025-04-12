/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class QB
implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ i90_0 b;
    public final /* synthetic */ yp0_0 c;
    public final /* synthetic */ Product d;

    public /* synthetic */ QB(boolean bl2, c80 c802, yp0_0 yp0_02, Product product) {
        this.a = bl2;
        this.b = c802;
        this.c = yp0_02;
        this.d = product;
    }

    public final Object invoke() {
        i90_0 i90_02 = this.b;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        yp0_0 yp0_02 = this.c;
        String string2 = "$fleekBrandPageGAEventsUtil";
        Intrinsics.checkNotNullParameter(yp0_02, string2);
        int n3 = 3;
        boolean bl2 = this.a;
        Product product = this.d;
        if (bl2) {
            sd_2 sd_22 = new sd_2(yp0_02, product, null);
            Ae3.d(i90_02, null, null, sd_22, n3);
        } else {
            td_2 td_22 = new td_2(yp0_02, product, null);
            Ae3.d(i90_02, null, null, td_22, n3);
        }
        return Unit.a;
    }
}

