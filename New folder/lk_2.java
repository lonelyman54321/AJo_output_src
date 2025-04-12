/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.orderhistory.CancelReturnRequest;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.OrderDetailApi;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from LK
 */
public final class lk_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mk_2 c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ CancelReturnRequest e;

    public lk_2(mk_2 mk_22, Ref$ObjectRef ref$ObjectRef, CancelReturnRequest cancelReturnRequest, f80_0 f80_02) {
        this.c = mk_22;
        this.d = ref$ObjectRef;
        this.e = cancelReturnRequest;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.d;
        CancelReturnRequest cancelReturnRequest = this.e;
        mk_2 mk_22 = this.c;
        lk_2 lk_22 = new lk_2(mk_22, ref$ObjectRef, cancelReturnRequest, f80_02);
        lk_22.b = object;
        return lk_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (lk_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((lk_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block2;
                            if (n7 == n3) break block3;
                            if (n7 != n4) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (fs0_2)this.b;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object2 = object = this.b;
                object2 = (fs0_2)object;
                object = this.c;
                OrderDetailApi orderDetailApi = ((mk_2)object).a;
                String string2 = (String)this.d.element;
                Object object3 = ((mk_2)object).d;
                Intrinsics.checkNotNullExpressionValue(object3, "access$getUserInformation$p(...)");
                object3 = ServiceUtil.getToken((UserInformation)object3);
                CharSequence charSequence = new StringBuilder("Bearer ");
                charSequence.append((String)object3);
                object3 = charSequence.toString();
                object.getClass();
                charSequence = "Android";
                Intrinsics.checkNotNullExpressionValue(charSequence, "access$getClientType$p(...)");
                this.b = object2;
                this.a = n3;
                CancelReturnRequest cancelReturnRequest = this.e;
                object = orderDetailApi.returnCancelRequest(string2, (String)object3, (String)charSequence, cancelReturnRequest, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            n3 = 0;
            this.b = null;
            this.a = n4;
            object = object2.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

