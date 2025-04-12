/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 */
import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.payment.fragment.h;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from tr2
 */
public final class tr2_1
implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Dialog a;
    public final /* synthetic */ String b;
    public final /* synthetic */ h c;
    public final /* synthetic */ String[] d;

    public /* synthetic */ tr2_1(Dialog dialog, String string2, h h3, String[] stringArray) {
        this.a = dialog;
        this.b = string2;
        this.c = h3;
        this.d = stringArray;
    }

    public final void onItemClick(AdapterView object, View object2, int n3, long l2) {
        object = null;
        int n4 = 1;
        Dialog dialog = this.a;
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$mode");
        h h3 = this.c;
        Intrinsics.checkNotNullParameter(h3, "this$0");
        Object object3 = "$valuelist";
        Object object4 = this.d;
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        int n7 = -1;
        if (n3 == n7) {
            dialog.dismiss();
        } else {
            Object object5;
            object3 = "month";
            n7 = (int)(kotlin.text.b.i(string2, (String)object3, n4 != 0) ? 1 : 0);
            string2 = null;
            if (n7 != 0) {
                n7 = 8;
                object4 = "format(...)";
                String string3 = "expiremonthEt";
                if (n3 <= n7) {
                    object3 = h3.p;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                    } else {
                        string2 = object3;
                    }
                    object3 = StringCompanionObject.INSTANCE;
                    object5 = n3 += n4;
                    object3 = new Object[n4];
                    object3[0] = object5;
                    object = Arrays.copyOf(object3, n4);
                    object2 = "0%d";
                    object = String.format((String)object2, (Object[])object);
                    Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                    string2.setText((CharSequence)object);
                } else {
                    object3 = h3.p;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                    } else {
                        string2 = object3;
                    }
                    object3 = StringCompanionObject.INSTANCE;
                    object5 = n3 += n4;
                    object3 = new Object[n4];
                    object3[0] = object5;
                    object = Arrays.copyOf(object3, n4);
                    object2 = "%d";
                    object = String.format((String)object2, (Object[])object);
                    Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                    string2.setText((CharSequence)object);
                }
            } else {
                object = object4[n3];
                object2 = h3.o;
                if (object2 == null) {
                    object2 = "expireyearEt";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                } else {
                    string2 = object2;
                }
                string2.setText((CharSequence)object);
            }
            object = AnalyticsManager.Companion;
            object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
            object5 = "Expirydate_entered";
            object3 = "Expiry date selected";
            ((GTMEvents)object2).pushButtonTapEvent((String)object5, object3, (String)object);
            dialog.dismiss();
        }
    }
}

