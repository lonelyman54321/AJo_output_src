/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.TenantResponse;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Kp2
 */
public final class kp2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ op2_2 b;
    public final /* synthetic */ TenantResponse c;
    public final /* synthetic */ PriceRequest d;
    public final /* synthetic */ Float e;

    public kp2_2(op2_2 op2_22, TenantResponse tenantResponse, PriceRequest priceRequest, Float f5, f80_0 f80_02) {
        this.b = op2_22;
        this.c = tenantResponse;
        this.d = priceRequest;
        this.e = f5;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        PriceRequest priceRequest = this.d;
        Float f5 = this.e;
        op2_2 op2_22 = this.b;
        TenantResponse tenantResponse = this.c;
        object = new kp2_2(op2_22, tenantResponse, priceRequest, f5, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (kp2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kp2_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            Object object2;
            Object object3;
            vl2_2.b(object);
            object = this.b.a;
            TenantResponse tenantResponse = this.c;
            PriceRequest priceRequest = this.d;
            Float f5 = this.e;
            synchronized (object) {
                object2 = object3;
                object3 = new qo2_2(priceRequest, tenantResponse, f5, (oo2_1)object, null);
                object2 = new br2_2((Function2)object3);
                object3 = ir0_2.a;
                object3 = em0_2.b;
                object3 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
                object2 = new po2_1((es0_2)object3, (oo2_1)object);
                object3 = ir0_2.a;
                object3 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
            }
            object2 = this.b;
            priceRequest = null;
            object = new Kp2$a((op2_2)object2, null);
            object2 = new at0_1((es0_2)object3, (gx0_2)object);
            object3 = this.b;
            object = new Kp2$b((op2_2)object3);
            this.a = n4;
            object = ((at0_1)object2).collect((fs0_2)object, this);
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

