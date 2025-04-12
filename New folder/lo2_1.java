/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LO2
 */
public final class lo2_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ NO2 c;
    public final /* synthetic */ Integer d;

    public lo2_1(NO2 nO2, Integer n3, f80_0 f80_02) {
        this.c = nO2;
        this.d = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        NO2 nO2 = this.c;
        Integer n3 = this.d;
        lo2_1 lo2_12 = new lo2_1(nO2, n3, f80_02);
        lo2_12.b = object;
        return lo2_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (lo2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((lo2_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            Object object3;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                int n7;
                block2: {
                    block3: {
                        block4: {
                            n7 = 1;
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            n4 = this.a;
                            n3 = 2;
                            if (n4 == 0) break block2;
                            if (n4 == n7) break block3;
                            if (n4 != n3) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object3 = (fs0_2)this.b;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object = (fs0_2)this.b;
                object2 = this.c;
                Ch0 ch0 = ((NO2)object2).a;
                object2 = ((NO2)object2).b;
                String string2 = ((UserInformation)object2).getCustomerUUID();
                String string3 = "review_like";
                Intrinsics.checkNotNullParameter(string3, "<this>");
                Object object4 = UrlHelper.Companion.getInstance();
                Object object5 = new Object[n7];
                object5[0] = string2;
                string2 = ((UrlHelper)object4).getApiUrl("reviews", string3, object5);
                string3 = ((UserInformation)object2).getUserEmailId();
                Intrinsics.checkNotNullExpressionValue(string3, "getUserEmailId(...)");
                Intrinsics.checkNotNullExpressionValue(object2, "access$getUserInformation$p(...)");
                object2 = ServiceUtil.getToken((UserInformation)object2);
                String string4 = kp1_0.c("Bearer ", (String)object2);
                this.b = object;
                this.a = n7;
                object4 = this.d;
                object5 = this;
                object3 = ch0.b(string2, (Integer)object4, string3, string4, this);
                if (object3 == j90_02) {
                    return j90_02;
                }
                Object object6 = object3;
                object3 = object;
                object = object6;
            }
            n4 = 0;
            object2 = null;
            this.b = null;
            this.a = n3;
            object = object3.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

