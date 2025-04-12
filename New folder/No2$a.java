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
import com.ril.ajio.services.data.Payment.InstantDiscountInfo;
import kotlin.jvm.internal.Intrinsics;

public final class No2$a
extends ClickableSpan {
    public final /* synthetic */ dv_0 a;
    public final /* synthetic */ InstantDiscountInfo b;

    public No2$a(dv_0 dv_02, InstantDiscountInfo instantDiscountInfo) {
        this.a = dv_02;
        this.b = instantDiscountInfo;
    }

    public final void onClick(View object) {
        Object object2 = "widget";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = this.a;
        if (object != null) {
            object2 = this.b;
            object2 = object2 != null ? ((InstantDiscountInfo)object2).getTncURL() : null;
            object.d6((String)object2);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        boolean bl2 = og1_1.b();
        textPaint.setUnderlineText(bl2);
    }
}

