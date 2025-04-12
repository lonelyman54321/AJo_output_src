/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.ajiocash.SpendHistory;
import kotlin.jvm.internal.Intrinsics;

public final class A
implements View.OnClickListener {
    public final /* synthetic */ C a;
    public final /* synthetic */ SpendHistory b;

    public /* synthetic */ A(C c2, SpendHistory spendHistory) {
        this.a = c2;
        this.b = spendHistory;
    }

    public final void onClick(View object) {
        float f5;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((C)object).a;
        Object object2 = this.b;
        Float f6 = ((SpendHistory)object2).getSpendCash();
        float f7 = 0.0f;
        if (f6 != null) {
            f5 = f6.floatValue();
        } else {
            f5 = 0.0f;
            f6 = null;
        }
        Float f8 = ((SpendHistory)object2).getSpendPoints();
        if (f8 != null) {
            f7 = f8.floatValue();
        }
        if ((object2 = ((SpendHistory)object2).getOrderId()) == null) {
            object2 = "";
        }
        object.O4(f5, f7, (String)object2);
    }
}

