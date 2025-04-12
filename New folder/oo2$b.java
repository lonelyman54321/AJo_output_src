/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.HashSet;
import kotlin.Unit;

public final class oo2$b
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ oo2_1 b;
    public final /* synthetic */ PaymentInstruments c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ TenantResponse e;

    public oo2$b(es0_2 es0_22, oo2_1 oo2_12, PaymentInstruments paymentInstruments, HashSet hashSet, TenantResponse tenantResponse) {
        this.a = es0_22;
        this.b = oo2_12;
        this.c = paymentInstruments;
        this.d = hashSet;
        this.e = tenantResponse;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        oo2_1 oo2_12 = this.b;
        PaymentInstruments paymentInstruments = this.c;
        HashSet hashSet = this.d;
        TenantResponse tenantResponse = this.e;
        oo2$b$a oo2$b$a = new oo2$b$a((fs0_2)object, oo2_12, paymentInstruments, hashSet, tenantResponse);
        if ((object = this.a.collect(oo2$b$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

