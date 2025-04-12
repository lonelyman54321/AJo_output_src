/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.dresstool.DressToolModel;
import com.ril.ajio.services.data.dresstool.NoResult;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ov0
 */
public final class ov0_0
extends jD3 {
    public final fv0_0 a;
    public final ParcelableSnapshotMutableState b;
    public final ParcelableSnapshotMutableState c;
    public final ParcelableSnapshotMutableState d;
    public Bundle e;
    public boolean f;

    public ov0_0(fv0_0 object) {
        Intrinsics.checkNotNullParameter(object, "dressToolUseCase");
        this.a = object;
        this.b = object = J83.g(Bv0$c.a);
        this.c = object = J83.g(am2$c_0.a);
        this.d = object = J83.g(Boolean.FALSE);
    }

    public static final void b(ov0_0 ov0_02) {
        String string2;
        String string3;
        Object object = ov0_02.b.getValue();
        boolean bl2 = object instanceof Bv0$d;
        int n3 = 0;
        Object object2 = null;
        object = bl2 ? (Bv0$d)object : null;
        if (object != null && (object = ((Bv0$d)object).a) != null) {
            object2 = ((DressToolModel)object).getNo_result_screen();
        }
        if (object2 == null || (string3 = ((NoResult)object2).getTitle()) == null) {
            int n4 = R$string.dress_tool_result_error_message;
            string3 = hv3_0.K(n4);
        }
        if (object2 == null || (string2 = ((NoResult)object2).getSubtitle()) == null) {
            int n7 = R$string.dress_tool_result_error_description;
            string2 = hv3_0.K(n7);
        }
        if (object2 == null || (object2 = ((NoResult)object2).getCta_text()) == null) {
            n3 = R$string.continue_shopping;
            object2 = hv3_0.K(n3);
        }
        NoResult noResult = new NoResult(string3, string2, (String)object2);
        object = new am2$a_0(noResult);
        ov0_02.c.setValue(object);
    }

    public final String c() {
        Object object = this.e;
        if (object != null) {
            String string2 = "dress_tool_ingress";
            object = object.getString(string2);
        } else {
            object = null;
        }
        if (object == null) {
            object = "";
        }
        return object;
    }

    public final void d(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "label");
        Intrinsics.checkNotNullParameter(string4, "action");
        NewCustomEventsRevamp newCustomEventsRevamp = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        Pair[] pairArray = this.c();
        Pair pair = new Pair("dress_tool_ingress", pairArray);
        pairArray = new Pair[]{pair};
        pairArray = DE.b(pairArray);
        newCustomEventsRevamp.newDressToolInteractionsCustomEvent(string4, string3, string2, (Bundle)pairArray);
    }

    public final void e(String string2) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Pair[] pairArray = this.c();
        Pair pair = new Pair("dress_tool_ingress", pairArray);
        pairArray = new Pair[]{pair};
        pairArray = DE.b(pairArray);
        vb0_0.a(AnalyticsManager.Companion, string2, (Bundle)pairArray);
    }
}

