/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextWatcher;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import kotlin.jvm.internal.Intrinsics;

public final class ss2$a
implements TextWatcher {
    public final /* synthetic */ ss2_2 a;

    public ss2$a(ss2_2 ss2_22) {
        this.a = ss2_22;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "s");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    public final void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(object, "s");
        Object object2 = new StringBuilder("VPA Id entered in UPI-");
        ((StringBuilder)object2).append(object);
        object = ((StringBuilder)object2).toString();
        object2 = AnalyticsManager.Companion;
        GTMEvents gTMEvents = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
        String string2 = "VPA_entered";
        ak0_0.a((AnalyticsManager$Companion)object2, gTMEvents, string2, (String)object);
        object = this.a;
        object.getClass();
        object2 = cp_1.Companion;
        object2.getClass();
        n3 = (int)(cp$a.s() ? 1 : 0);
        if (n3 != 0) {
            object2 = ((ss2_2)object).u;
            n4 = -1;
            if (object2 == null || (n7 = ((tt3_0)object2).f) != n4) {
                if (object2 != null) {
                    ((tt3_0)object2).f = n4;
                }
                if (object2 != null) {
                    object2.notifyDataSetChanged();
                }
            }
        }
        object2 = ((ss2_2)object).k;
        n4 = 0;
        gTMEvents = null;
        object2.setVisibility(0);
        object = ((ss2_2)object).p;
        if (object != null) {
            object.setVisibility(0);
        }
    }
}

