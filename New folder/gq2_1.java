/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from GQ2
 */
public final class gq2_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ lq2_0 b;

    public gq2_1(lq2_0 lq2_02, f80_0 f80_02) {
        this.b = lq2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        lq2_0 lq2_02 = this.b;
        object = new gq2_1(lq2_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (gq2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((gq2_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block6: {
            Object object2;
            int n3;
            lq2_0 lq2_02;
            j90_0 j90_02;
            block7: {
                int n4;
                int n7;
                block3: {
                    block4: {
                        block5: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            n7 = this.a;
                            lq2_02 = this.b;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block3;
                            if (n7 == n4) break block4;
                            if (n7 != n3) break block5;
                            vl2_2.b(object);
                            break block6;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block7;
                }
                vl2_2.b(object);
                this.a = n4;
                lq2_02.getClass();
                object = UrlHelper.Companion.getInstance();
                n7 = 0;
                object2 = new Object[]{};
                String string2 = "rto_data";
                object = ((UrlHelper)object).getApiUrl("order", string2, object2);
                object2 = new Ref$ObjectRef();
                Object object3 = lq2_02.d();
                n4 = (int)(((UserInformation)object3).isUserOnline() ? 1 : 0);
                if (n4 != 0) {
                    object3 = ServiceUtil.getToken(lq2_02.d());
                    string2 = "Bearer ";
                    object2.element = object3 = kp1_0.c(string2, (String)object3);
                }
                string2 = null;
                object3 = new hq2_1((Ref$ObjectRef)object2, lq2_02, (String)object, null);
                object = new br2_2((Function2)object3);
                object2 = ir0_2.a;
                object2 = em0_2.b;
                object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
                n4 = 3;
                object2 = new qg3_2(n4, null);
                object3 = new at0_1((es0_2)object, (gx0_2)object2);
                if (object3 == j90_02) {
                    return j90_02;
                }
                object = object3;
            }
            object = (es0_2)object;
            object2 = new gq2$a_0(lq2_02);
            this.a = n3;
            object = object.collect((fs0_2)object2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

