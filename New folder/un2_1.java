/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Order.ReturnRefundLinksEnum;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uN2
 */
public final class un2_1
implements View.OnClickListener {
    public final /* synthetic */ yn2_2 a;

    public /* synthetic */ un2_1(yn2_2 yn2_22) {
        this.a = yn2_22;
    }

    public final void onClick(View view) {
        yn2_2 yn2_22 = this.a;
        Intrinsics.checkNotNullParameter(yn2_22, "this$0");
        ReturnRefundLinksEnum returnRefundLinksEnum = ReturnRefundLinksEnum.RAISE_A_CONCERN;
        yn2_22.O0("", returnRefundLinksEnum);
    }
}

