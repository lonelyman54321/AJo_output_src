/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Order.ReturnRequest;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dO2
 */
public final class do2_1
implements View.OnClickListener {
    public final /* synthetic */ fo2_2 a;

    public /* synthetic */ do2_1(fo2_2 fo2_22) {
        this.a = fo2_22;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ReturnRequest returnRequest = ((fo2_2)object).g;
        if (returnRequest != null && (object = ((fo2_2)object).a) != null) {
            boolean bl2 = true;
            object.t5(returnRequest, bl2);
        }
    }
}

