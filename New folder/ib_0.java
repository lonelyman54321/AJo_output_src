/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IB
 */
public final class ib_0
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ yp0_0 d;

    public /* synthetic */ ib_0(Activity activity, dr0_0 dr0_02, c80 c802, yp0_0 yp0_02) {
        this.a = activity;
        this.b = dr0_02;
        this.c = c802;
        this.d = yp0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Product)object;
        object2 = (Boolean)object2;
        boolean bl2 = (Boolean)object2;
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$fleekViewModel");
        Object object4 = this.c;
        Intrinsics.checkNotNullParameter(object4, "$coroutineScope");
        yp0_0 yp0_02 = this.d;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        Activity activity = this.a;
        if (activity != null) {
            object4 = (c80)object4;
            QB qB = new QB(bl2, (c80)object4, yp0_02, (Product)object);
            object4 = new Object();
            object3.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(qB, "successExecutingFunction");
            object3 = "failureExecutingFunction";
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            if (bl2) {
                object2 = dr0_0.w(activity);
                boolean bl3 = false;
                object3 = null;
                ((fq0_2)object2).Ua(false, (Product)object, qB, (Function0)object4);
            } else {
                object2 = dr0_0.w(activity);
                boolean bl4 = true;
                ((fq0_2)object2).Ua(bl4, (Product)object, qB, (Function0)object4);
            }
        }
        return Unit.a;
    }
}

