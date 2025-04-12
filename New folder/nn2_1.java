/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Nn2
 */
public final class nn2_1
implements bx0_2,
o60_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ nn2_1(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Object object2 = null;
        int n3 = 1;
        Object object3 = dn2_2.Companion;
        object3 = "this$0";
        Object object4 = (dn2_2)this.a;
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        boolean bl2 = object instanceof uy2_2;
        if (bl2) {
            object = (uy2_2)object;
            ((dn2_2)object4).Va((uy2_2)object);
        } else {
            object3 = "format(...)";
            if (object != null) {
                object = object.toString();
                object4 = StringCompanionObject.INSTANCE;
                int n4 = R$string.acc_alert_message;
                object4 = hv3_0.K(n4);
                Object[] objectArray = new Object[n3];
                objectArray[0] = object;
                object2 = Arrays.copyOf(objectArray, n3);
                object2 = String.format((String)object4, object2);
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                mq0_2.b((String)object, (String)object2);
            } else {
                int n7 = R$string.something_wrong_msg;
                object = hv3_0.K(n7);
                object4 = StringCompanionObject.INSTANCE;
                int n8 = R$string.acc_alert_message;
                object4 = hv3_0.K(n8);
                Object[] objectArray = new Object[n3];
                objectArray[0] = object;
                object2 = Arrays.copyOf(objectArray, n3);
                object2 = String.format((String)object4, object2);
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                mq0_2.b((String)object, (String)object2);
            }
        }
    }

    public Object apply(Object object) {
        return (DataCallback)oj_0.a((Function1)this.a, "$tmp0", object, "p0", object);
    }
}

