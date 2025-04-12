/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

public final class L4
implements View.OnClickListener {
    public final /* synthetic */ s4_0 a;

    public /* synthetic */ L4(s4_0 s4_02) {
        this.a = s4_02;
    }

    public final void onClick(View view) {
        s4_0 s4_02 = this.a;
        Intrinsics.checkNotNullParameter(s4_02, "this$0");
        NewCustomEventsRevamp newCustomEventsRevamp = s4_02.g;
        String string2 = newCustomEventsRevamp.getEC_ADD_INTERACTION();
        String string3 = s4_02.h;
        String string4 = s4_02.i;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "add address", "", "ma_add_address", "address list screen - my account", "address management screen", string3, null, string4, false, null, 1536, null);
        s4_02.Ra(null);
    }
}

