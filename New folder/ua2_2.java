/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;
import com.ril.ajio.payment.activity.OrderConfirmationActivity$a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ua2
 */
public final class ua2_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ua2_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (NM2)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = ((NM2)object).k;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userRepo");
                    object = null;
                }
                return ((UserRepo)object).getUserInformation();
            }
            case 0: 
        }
        OrderConfirmationActivity$a orderConfirmationActivity$a = OrderConfirmationActivity.Companion;
        object = (OrderConfirmationActivity)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        orderConfirmationActivity$a = object.getApplication();
        String string2 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(orderConfirmationActivity$a, string2);
        object = object.getApplication();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        UserRepo userRepo = new UserRepo((Application)object);
        object2 = new hy3_0((Application)orderConfirmationActivity$a, userRepo);
        return object2;
    }
}

