/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Op2$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ op2_2 b;
    public final /* synthetic */ PaymentInstruments c;
    public final /* synthetic */ TenantResponse d;
    public final /* synthetic */ HashSet e;
    public final /* synthetic */ PriceRequest f;
    public final /* synthetic */ hj_1 g;

    public Op2$a(op2_2 op2_22, PaymentInstruments paymentInstruments, TenantResponse tenantResponse, HashSet hashSet, PriceRequest priceRequest, hj_1 hj_12, f80_0 f80_02) {
        this.b = op2_22;
        this.c = paymentInstruments;
        this.d = tenantResponse;
        this.e = hashSet;
        this.f = priceRequest;
        this.g = hj_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        PriceRequest priceRequest = this.f;
        hj_1 hj_12 = this.g;
        op2_2 op2_22 = this.b;
        PaymentInstruments paymentInstruments = this.c;
        TenantResponse tenantResponse = this.d;
        HashSet hashSet = this.e;
        object = new Op2$a(op2_22, paymentInstruments, tenantResponse, hashSet, priceRequest, hj_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Op2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Op2$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = this.b;
            Object object2 = ((op2_2)object).a;
            HashSet hashSet = this.e;
            Object object3 = this.f;
            PaymentInstruments paymentInstruments = this.c;
            TenantResponse tenantResponse = this.d;
            object2 = ((oo2_1)object2).c(paymentInstruments, tenantResponse, hashSet, (PriceRequest)object3);
            hj_1 hj_12 = this.g;
            Op2$a$a op2$a$a = new Op2$a$a((op2_2)object, hj_12, null);
            object3 = new at0_1((es0_2)object2, op2$a$a);
            object2 = new Op2$a$b((op2_2)object, hj_12);
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object2, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

