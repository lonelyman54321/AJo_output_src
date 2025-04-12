/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from OS
 */
public final class os_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ PaymentInstruments c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ps_0 e;

    public os_0(ArrayList arrayList, PaymentInstruments paymentInstruments, boolean bl2, ps_0 ps_02, f80_0 f80_02) {
        this.b = arrayList;
        this.c = paymentInstruments;
        this.d = bl2;
        this.e = ps_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.d;
        ps_0 ps_02 = this.e;
        ArrayList arrayList = this.b;
        PaymentInstruments paymentInstruments = this.c;
        object = new os_0(arrayList, paymentInstruments, bl2, ps_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (os_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((os_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            Object object3;
            int n3;
            at0_1 at0_12;
            j90_0 j90_02;
            block6: {
                int n4;
                int n7;
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            n7 = this.a;
                            at0_12 = null;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block2;
                            if (n7 == n4) break block3;
                            if (n7 != n3) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object = InternalWalletUtil.a;
                this.a = n4;
                object.getClass();
                n7 = (int)(this.d ? 1 : 0);
                object3 = this.b;
                PaymentInstruments paymentInstruments = this.c;
                object = new ij1_2(paymentInstruments, n7 != 0, (List)object3, null);
                object2 = new br2_2((Function2)object);
                object = ir0_2.a;
                object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = (es0_2)object;
            object3 = this.e;
            object2 = new OS$a((ps_0)object3, null);
            at0_12 = new at0_1((es0_2)object, (gx0_2)object2);
            object = new OS$b((ps_0)object3);
            this.a = n3;
            object = at0_12.collect((fs0_2)object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

