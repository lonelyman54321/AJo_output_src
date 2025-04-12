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
 * Renamed from tz1
 */
public final class tz1_0
implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ RadioGroup b;
    public final /* synthetic */ az1_2 c;

    public /* synthetic */ tz1_0(View view, RadioGroup radioGroup, az1_2 az1_22) {
        this.a = view;
        this.b = radioGroup;
        this.c = az1_22;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onCheckedChanged(RadioGroup object, int n3) {
        void var3_12;
        void var1_5;
        View view = this.a;
        Intrinsics.checkNotNullParameter(view, "$view");
        RadioGroup radioGroup = this.b;
        Intrinsics.checkNotNullParameter(radioGroup, "$genderOptions");
        az1_2 az1_22 = this.c;
        Intrinsics.checkNotNullParameter(az1_22, "this$0");
        int n4 = radioGroup.getCheckedRadioButtonId();
        View view2 = view.findViewById(n4);
        Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.widget.RadioButton");
        String string2 = ((Object)((RadioButton)view2).getText()).toString();
        String string3 = "male";
        boolean bl2 = true;
        boolean bl3 = kotlin.text.b.i(string2, string3, bl2);
        String string4 = "signup screen";
        String string5 = "Join Ajio";
        if (bl3) {
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            String string6 = "Male";
        } else {
            String string7 = "female";
            n4 = (int)(kotlin.text.b.i(string2, string7, bl2) ? 1 : 0);
            if (n4 != 0) {
                AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                String string8 = "Female";
            } else {
                AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                String string9 = "Other";
            }
        }
        tj2_0.e((AnalyticsManager$Companion)var1_5, string5, (String)var3_12, string4);
        az1_22.Ua();
    }
}

