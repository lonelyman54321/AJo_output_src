/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.query.QueryCustomer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zw3
 */
public final class zw3_0
implements Function2 {
    public final /* synthetic */ hw3_0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ zw3_0(hw3_0 hw3_02, String string2) {
        this.a = hw3_02;
        this.b = string2;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = this.b;
        Intrinsics.checkNotNullParameter(object4, "$otp");
        Intrinsics.checkNotNullParameter(object, "email");
        Object object5 = "phoneNo";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        object3 = ((hw3_0)object3).m;
        if (object3 != null) {
            Intrinsics.checkNotNullParameter(object4, "otp");
            Intrinsics.checkNotNullParameter(object2, "userPhoneNo");
            Intrinsics.checkNotNullParameter(object, "userEmail");
            object = new QueryCustomer();
            ((QueryCustomer)object).setMobileNumber((String)object2);
            object2 = ((hy3_0)object3).m().getUserEmailId();
            ((QueryCustomer)object).setEmail((String)object2);
            ((QueryCustomer)object).setOtp((String)object4);
            object2 = ((hy3_0)object3).e.a();
            ((QueryCustomer)object).setAdId((String)object2);
            object = ((hy3_0)object3).g.verifyRILEmployeeProfile((QueryCustomer)object);
            int n3 = 3;
            object2 = new m5_0(object3, n3);
            object4 = new Sa2(1, (Function1)object2);
            int n4 = 4;
            object2 = new bf1_0(object3, n4);
            int n7 = 2;
            object5 = new ta2_0(n7, (Function1)object2);
            object = ((g53_0)object).f((o60_0)object4, (o60_0)object5);
            object2 = ((hy3_0)object3).x;
            ((t30_0)object2).b((yr0_2)object);
            object = Unit.a;
        } else {
            object = null;
        }
        return object;
    }
}

