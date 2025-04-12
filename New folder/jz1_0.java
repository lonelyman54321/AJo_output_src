/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.RadioButton
 *  android.widget.RadioGroup
 *  android.widget.RadioGroup$OnCheckedChangeListener
 */
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Jz1
 */
public final class jz1_0
implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ lz1_2 b;

    public /* synthetic */ jz1_0(View view, lz1_2 lz1_22) {
        this.a = view;
        this.b = lz1_22;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onCheckedChanged(RadioGroup object, int n3) {
        void var1_6;
        String string2;
        View view = this.a;
        Intrinsics.checkNotNullParameter(view, "$rootView");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        RadioGroup radioGroup = ((lz1_2)object2).l;
        Intrinsics.checkNotNull(radioGroup);
        int n4 = radioGroup.getCheckedRadioButtonId();
        View view2 = view.findViewById(n4);
        Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.widget.RadioButton");
        String string3 = ((Object)((RadioButton)view2).getText()).toString();
        boolean bl2 = true;
        n4 = (int)(kotlin.text.b.i(string3, "male", bl2) ? 1 : 0);
        String string4 = "signup screen";
        object2 = "Join Ajio";
        if (n4 != 0) {
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            string2 = "Male";
        } else {
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            string2 = "Female";
        }
        tj2_0.e((AnalyticsManager$Companion)var1_6, (String)object2, string2, string4);
    }
}

