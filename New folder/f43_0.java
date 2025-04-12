/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.R$string;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from f43
 */
public final class f43_0
implements Runnable {
    public final /* synthetic */ View a;

    public /* synthetic */ f43_0(View view) {
        this.a = view;
    }

    public final void run() {
        int n3 = 1;
        View view = this.a;
        if (view != null) {
            Object object = StringCompanionObject.INSTANCE;
            int n4 = R$string.acc_info_popup;
            object = hv3_0.K(n4);
            int n7 = R$string.talk_to_us;
            String string2 = hv3_0.K(n7);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            Object object2 = Arrays.copyOf(objectArray, n3);
            object2 = String.format((String)object, object2);
            object = "format(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            view.setContentDescription((CharSequence)object2);
        }
        if (view != null) {
            ai0_2.a(view);
        }
    }
}

