/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ril.ajio.services.data.Order.ReturnRefundLinksEnum;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QN2
 */
public final class qn2_0
extends ClickableSpan {
    public final /* synthetic */ rn2_2 a;

    public qn2_0(rn2_2 rn2_22) {
        this.a = rn2_22;
    }

    public final void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "p0");
        object = this.a;
        HN2 hN2 = object.a;
        if (hN2 != null) {
            object = object.m;
            ReturnRefundLinksEnum returnRefundLinksEnum = ReturnRefundLinksEnum.REFUND_POLICY;
            hN2.O0((String)object, returnRefundLinksEnum);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        textPaint.setUnderlineText(false);
    }
}

