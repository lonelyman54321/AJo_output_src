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
 * Renamed from uz1
 */
public final class uz1_0
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ az1_2 a;

    public /* synthetic */ uz1_0(az1_2 az1_22) {
        this.a = az1_22;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean bl2) {
        az1_2 az1_22 = this.a;
        Intrinsics.checkNotNullParameter(az1_22, "this$0");
        String string2 = "referralCodeInputLayout";
        Object object = null;
        if (bl2) {
            Object object2 = az1_22.H;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object = object2;
            }
            boolean bl3 = false;
            string2 = null;
            object.setVisibility(0);
            int n3 = 1536;
            object2 = az1_22.X;
            String string3 = "user accounts interactions";
            String string4 = "Sign-up";
            String string5 = "i have invite code| check in";
            String string6 = "user_account_interactions";
            String string7 = "Sign Up screen";
            String string8 = "";
            String string9 = az1_22.Y;
            String string10 = az1_22.Z;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string3, string4, string5, string6, string7, string8, string9, null, string10, false, null, n3, null);
        } else {
            Object object3 = az1_22.x;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("referralCodeETV");
                object3 = null;
            }
            String string11 = "";
            object3.setText(string11);
            object3 = az1_22.H;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object = object3;
            }
            int n4 = 8;
            object.setVisibility(n4);
            int n7 = 1536;
            object3 = az1_22.X;
            string11 = "user accounts interactions";
            String string12 = "Sign-up";
            String string13 = "i have invite code| check out";
            String string14 = "user_account_interactions";
            String string15 = "Sign Up screen";
            String string16 = "";
            String string17 = az1_22.Y;
            String string18 = az1_22.Z;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string11, string12, string13, string14, string15, string16, string17, null, string18, false, null, n7, null);
        }
    }
}

