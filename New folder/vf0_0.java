/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f$c;
import com.ril.ajio.R$string;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from vF0
 */
public final class vf0_0
implements vv1$a,
o60_0,
w3 {
    public final /* synthetic */ Object a;

    public /* synthetic */ vf0_0(Object object) {
        this.a = object;
    }

    public void a(Object object) {
        int n3 = 1;
        object = (Boolean)object;
        bg2_1 bg2_12 = (bg2_1)this.a;
        Intrinsics.checkNotNullParameter(bg2_12, "this$0");
        String string2 = "isGranted";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean n4 = (Boolean)object;
        if (n4) {
            object = bg2_12.Pa();
            String string4 = bg2_12.r;
            string2 = bg2_12.s;
            ((qz1_2)object).i(string4, string2);
        } else {
            object = StringCompanionObject.INSTANCE;
            int n7 = R$string.acc_error_message;
            object = hv3_0.K(n7);
            int n8 = R$string.external_storage_error_message;
            string2 = hv3_0.K(n8);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            object = xh2_0.a(objectArray, n3, (String)object, "format(...)");
            n3 = R$string.external_storage_error_message;
            String string3 = bg2_12.getString(n3);
            string2 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(string3, string2);
            mq0_2.b(string3, (String)object);
        }
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public void invoke(Object object) {
        object = (f$c)object;
        List list = (List)this.a;
        object.l(list);
    }
}

