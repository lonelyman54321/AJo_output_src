/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Lp2
 */
public final class lp2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ op2_2 b;
    public final /* synthetic */ PaymentInstruments c;
    public final /* synthetic */ TenantResponse d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ boolean f;

    public lp2_2(op2_2 op2_22, PaymentInstruments paymentInstruments, TenantResponse tenantResponse, ArrayList arrayList, boolean bl2, f80_0 f80_02) {
        this.b = op2_22;
        this.c = paymentInstruments;
        this.d = tenantResponse;
        this.e = arrayList;
        this.f = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ArrayList arrayList = this.e;
        boolean bl2 = this.f;
        op2_2 op2_22 = this.b;
        PaymentInstruments paymentInstruments = this.c;
        TenantResponse tenantResponse = this.d;
        object = new lp2_2(op2_22, paymentInstruments, tenantResponse, arrayList, bl2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (lp2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((lp2_2)object).invokeSuspend(object2);
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
            boolean bl2 = this.f;
            Object object3 = this.c;
            TenantResponse tenantResponse = this.d;
            ArrayList arrayList = this.e;
            int n7 = 16;
            Object object4 = oo2_1.d((oo2_1)object2, (PaymentInstruments)object3, tenantResponse, arrayList, bl2, false, n7);
            object2 = new lp2$a_0((op2_2)object, null);
            object3 = new at0_1((es0_2)object4, (gx0_2)object2);
            object4 = new Lp2$b((op2_2)object);
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object4, this);
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

