/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.ArrayList;
import kotlin.Unit;

/*
 * Renamed from ro2
 */
public final class ro2_2
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ PaymentInstruments b;
    public final /* synthetic */ TenantResponse c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ArrayList e;

    public ro2_2(es0_2 es0_22, PaymentInstruments paymentInstruments, TenantResponse tenantResponse, boolean bl2, ArrayList arrayList) {
        this.a = es0_22;
        this.b = paymentInstruments;
        this.c = tenantResponse;
        this.d = bl2;
        this.e = arrayList;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        PaymentInstruments paymentInstruments = this.b;
        TenantResponse tenantResponse = this.c;
        boolean bl2 = this.d;
        ArrayList arrayList = this.e;
        ro2$a ro2$a = new ro2$a((fs0_2)object, paymentInstruments, tenantResponse, bl2, arrayList);
        if ((object = this.a.collect(ro2$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

