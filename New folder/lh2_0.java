/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
import android.widget.CompoundButton;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lh2
 */
public final class lh2_0
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ qh2_2 a;

    public /* synthetic */ lh2_0(qh2_2 qh2_22) {
        this.a = qh2_22;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean bl2) {
        qh2_2 qh2_22 = this.a;
        Intrinsics.checkNotNullParameter(qh2_22, "this$0");
        Object object = rm2_0.a;
        object = bl2 ? "check" : "uncheck";
        NewCustomEventsRevamp.newPushCustomEvent$default(rm2_0.a, "pan interactions", "checkbox click", (String)object, "pan_interactions", "PAN verification screen", "PAN verification screen", "bag screen", null, "bag screen", false, null, 1536, null);
        qh2_22.Pa();
    }
}

