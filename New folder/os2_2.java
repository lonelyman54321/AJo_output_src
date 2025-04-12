/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
import android.view.MotionEvent;
import android.view.View;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.UPI;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from os2
 */
public final class os2_2
implements View.OnTouchListener {
    public final /* synthetic */ ss2_2 a;

    public /* synthetic */ os2_2(ss2_2 ss2_22) {
        this.a = ss2_22;
    }

    public final boolean onTouch(View object, MotionEvent object2) {
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = object2.t;
        if (object != null) {
            Object object3 = object2.v;
            UPI uPI = ((cu3)object3).n;
            object = ((UPI)object).getPriceValidation();
            uPI.setPriceValidation((PriceValidation)object);
            object = object2.t;
            uPI = null;
            object = object != null ? ((UPI)object).getOfferDetails() : null;
            object3 = ((cu3)object3).n;
            ((UPI)object3).setOfferDetails((OfferDetails)object);
            object2.t = null;
        }
        return false;
    }
}

