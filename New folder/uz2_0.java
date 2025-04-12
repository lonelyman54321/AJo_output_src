/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Uz2
 */
public final class uz2_0
implements o60_0 {
    public final /* synthetic */ Yz2 a;

    public /* synthetic */ uz2_0(Yz2 yz2) {
        this.a = yz2;
    }

    public final void accept(Object object) {
        int n3 = 1;
        Object object2 = Yz2.Companion;
        object2 = "this$0";
        Object[] objectArray = this.a;
        Intrinsics.checkNotNullParameter(objectArray, (String)object2);
        int n4 = object instanceof uy2_2;
        if (n4 != 0) {
            object = (uy2_2)object;
            objectArray.setImageData((uy2_2)object);
        } else {
            int n7 = R$string.something_wrong_msg;
            object = hv3_0.K(n7);
            object2 = StringCompanionObject.INSTANCE;
            n4 = R$string.acc_error_message;
            object2 = hv3_0.K(n4);
            objectArray = new Object[n3];
            objectArray[0] = object;
            Object object3 = Arrays.copyOf(objectArray, n3);
            object3 = String.format((String)object2, object3);
            object2 = "format(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
            mq0_2.b((String)object, (String)object3);
        }
    }
}

