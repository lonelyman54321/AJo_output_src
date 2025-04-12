/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Payment.TenantResponse;
import kotlin.Unit;

/*
 * Renamed from to2
 */
public final class to2_2
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ oo2_1 b;
    public final /* synthetic */ TenantResponse c;

    public to2_2(es0_2 es0_22, oo2_1 oo2_12, TenantResponse tenantResponse) {
        this.a = es0_22;
        this.b = oo2_12;
        this.c = tenantResponse;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        oo2_1 oo2_12 = this.b;
        TenantResponse tenantResponse = this.c;
        to2$a to2$a = new to2$a((fs0_2)object, oo2_12, tenantResponse);
        if ((object = this.a.collect(to2$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

