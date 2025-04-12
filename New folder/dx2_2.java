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
 * Renamed from dx2
 */
public final class dx2_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ux2_1 c;
    public final /* synthetic */ Ref$ObjectRef d;

    public dx2_2(ux2_1 ux2_12, Ref$ObjectRef ref$ObjectRef, f80_0 f80_02) {
        this.c = ux2_12;
        this.d = ref$ObjectRef;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ux2_1 ux2_12 = this.c;
        Ref$ObjectRef ref$ObjectRef = this.d;
        dx2_2 dx2_22 = new dx2_2(ux2_12, ref$ObjectRef, f80_02);
        dx2_22.b = object;
        return dx2_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (dx2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((dx2_2)object).invokeSuspend(object2);
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
                object3 = "access$getClientType$p(...)";
                String string4 = "Android";
                Intrinsics.checkNotNullExpressionValue(string4, (String)object3);
                this.b = object2;
                this.a = n3;
                object = ((ux2_1)object).b;
                object = wx2_12.k(string2, string3, (String)object, this);
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

