/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.services.data.Cart.PanCardVerificationRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from pm2
 */
public final class pm2_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ qm2_2 b;
    public final /* synthetic */ PanCardVerificationRequest c;

    public pm2_1(qm2_2 qm2_22, PanCardVerificationRequest panCardVerificationRequest, f80_0 f80_02) {
        this.b = qm2_22;
        this.c = panCardVerificationRequest;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qm2_2 qm2_22 = this.b;
        PanCardVerificationRequest panCardVerificationRequest = this.c;
        object = new pm2_1(qm2_22, panCardVerificationRequest, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pm2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pm2_1)object).invokeSuspend(object2);
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
            Object object2 = ((qm2_2)object).a;
            Object object3 = this.c;
            object2 = ((CartApiRepo)object2).checkForPanVerification((PanCardVerificationRequest)object3);
            object3 = new pm2$a_0((qm2_2)object, null);
            at0_1 at0_12 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new pm2$b((qm2_2)object);
            this.a = n4;
            object = at0_12.collect((fs0_2)object2, this);
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

