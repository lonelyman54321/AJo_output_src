/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.videoPlayer.model.FleekConfigs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from MJ0
 */
public final class mj0_2
implements Function0 {
    public final /* synthetic */ f23_0 a;
    public final /* synthetic */ dr0_0 b;

    public /* synthetic */ mj0_2(f23_0 f23_02, dr0_0 dr0_02) {
        this.a = f23_02;
        this.b = dr0_02;
    }

    public final Object invoke() {
        int n3 = 1;
        f23_0 f23_02 = this.a;
        Intrinsics.checkNotNullParameter(f23_02, "$sharedFleekVM");
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Object object = h40_0.a;
        object = h40_0.x();
        if (object == null || (object = ((FleekConfigs)object).getFleekUpdatedMessage()) == null) {
            object = "Feed Updated";
        }
        Object object2 = StringCompanionObject.INSTANCE;
        object2 = hv3_0.K(R$string.acc_alert_message);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        Object object3 = xh2_0.a(objectArray, n3, (String)object2, "format(...)");
        hv3_0.a.getClass();
        Intrinsics.checkNotNullParameter(object, "message");
        mq0_2.c((String)object, (String)object3);
        f23_02.a.clear();
        f23_02.c.clear();
        object3 = vJ0$b.a;
        dr0_02.M((vj0_0)object3);
        dr0_02.U();
        object3 = pp0_0.a;
        object3 = new qg3_2(2, null);
        Ae3.d(pp0_0.b, null, null, (Function2)object3, 3);
        return Unit.a;
    }
}

