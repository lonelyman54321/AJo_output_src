/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.payment.activity.OrderConfirmationActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ta2
 */
public final class ta2_2
implements Function0 {
    public final /* synthetic */ OrderConfirmationActivity a;

    public /* synthetic */ ta2_2(OrderConfirmationActivity orderConfirmationActivity) {
        this.a = orderConfirmationActivity;
    }

    public final Object invoke() {
        Object object = OrderConfirmationActivity.Companion;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = new ua2_2(object2, 0);
        Object object3 = new pw_2((Function0)object);
        object = "owner";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object3, string2);
        rd3_0 rd3_02 = object2.getViewModelStore();
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = object2.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object3, string2);
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        object2 = hy3_0.class;
        string2 = "modelClass";
        object = on_2.c(rd3_02, (pw_2)object3, (Wd0)object, (Class)object2, string2);
        object2 = ef0_0.a((Class)object2, string2, string2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (hy3_0)((pD3)object).a((yn1_2)object2, (String)object3);
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

