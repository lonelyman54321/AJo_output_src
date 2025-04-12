/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from hx2
 */
public final class hx2_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ux2_1 c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ boolean e;

    public hx2_1(ux2_1 ux2_12, Ref$ObjectRef ref$ObjectRef, boolean bl2, f80_0 f80_02) {
        this.c = ux2_12;
        this.d = ref$ObjectRef;
        this.e = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ux2_1 ux2_12 = this.c;
        Ref$ObjectRef ref$ObjectRef = this.d;
        boolean bl2 = this.e;
        hx2_1 hx2_12 = new hx2_1(ux2_12, ref$ObjectRef, bl2, f80_02);
        hx2_12.b = object;
        return hx2_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (hx2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hx2_1)object).invokeSuspend(object2);
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
                wx2_1 wx2_12 = ((ux2_1)object).a;
                String string2 = (String)this.d.element;
                Object object3 = ((ux2_1)object).f;
                Intrinsics.checkNotNullExpressionValue(object3, "access$getUserInformation$p(...)");
                String string3 = ServiceUtil.getToken((UserInformation)object3);
                object3 = new StringBuilder("Bearer ");
                ((StringBuilder)object3).append(string3);
                string3 = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullExpressionValue("Android", "access$getClientType$p(...)");
                this.b = object2;
                this.a = n3;
                String string4 = "getOrderList";
                boolean bl2 = this.e;
                object3 = ((ux2_1)object).b;
                object = wx2_12.e(string2, string3, (String)object3, string4, bl2, this);
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

