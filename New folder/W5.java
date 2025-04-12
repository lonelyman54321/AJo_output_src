/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.ajiocash.ActivePoints;
import kotlin.jvm.internal.Intrinsics;

public final class W5
implements View.OnClickListener {
    public final /* synthetic */ X5 a;
    public final /* synthetic */ ActivePoints b;

    public /* synthetic */ W5(X5 x5, ActivePoints activePoints) {
        this.a = x5;
        this.b = activePoints;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((X5)object).a;
        Object object2 = this.b;
        String string2 = ((ActivePoints)object2).getOrderId();
        Object object3 = "";
        if (string2 == null) {
            string2 = object3;
        }
        if ((object2 = ((ActivePoints)object2).getItemId()) != null) {
            object3 = object2;
        }
        object.d3(string2, (String)object3);
    }
}

