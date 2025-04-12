/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Payment.InstantDiscountInfo;

public final class Mo2
implements View.OnClickListener {
    public final /* synthetic */ dv_0 a;
    public final /* synthetic */ InstantDiscountInfo b;

    public /* synthetic */ Mo2(dv_0 dv_02, InstantDiscountInfo instantDiscountInfo) {
        this.a = dv_02;
        this.b = instantDiscountInfo;
    }

    public final void onClick(View object) {
        object = this.a;
        if (object != null) {
            Object object2 = this.b;
            object2 = object2 != null ? ((InstantDiscountInfo)object2).getTncURL() : null;
            object.d6((String)object2);
        }
    }
}

