/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.location.Location
 *  android.os.Bundle
 *  android.widget.Toast
 */
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.SimpleStringData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from yM
 */
public final class ym_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ym_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object location) {
        Object object = this.b;
        Object object2 = "this$0";
        int n3 = 1;
        int n4 = 0;
        Object object3 = null;
        int n7 = this.a;
        switch (n7) {
            default: {
                Object object4 = location;
                object4 = (DataCallback)location;
                object = (hy3_0)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                ((hy3_0)object).o.k(object4);
                return Unit.a;
            }
            case 1: {
                void var11_24;
                Location location2 = location;
                DataCallback dataCallback = (DataCallback)location;
                object = (ux0_0)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                ((ux0_0)object).Qa(false);
                object2 = cp_1.Companion;
                int n8 = nn_2.b((cp$a)object2, dataCallback);
                if (n8 == 0) return Unit.a;
                Intrinsics.checkNotNull(dataCallback);
                n8 = dataCallback.getStatus();
                Object var11_19 = null;
                Object object5 = "getMessage(...)";
                String string2 = "format(...)";
                if (n8 == 0) {
                    void var11_22;
                    String string3;
                    String string4;
                    object2 = (SimpleStringData)dataCallback.getData();
                    if (object2 != null && (string4 = ((SimpleStringData)object2).getMessage()) != null && (n7 = (string3 = ((SimpleStringData)object2).getMessage()).length()) > 0) {
                        object = StringCompanionObject.INSTANCE;
                        int n10 = R$string.acc_alert_message;
                        object = hv3_0.K(n10);
                        String string5 = ((SimpleStringData)object2).getMessage();
                        Object[] objectArray = new Object[n3];
                        objectArray[0] = string5;
                        object = xh2_0.a(objectArray, n3, (String)object, string2);
                        object2 = ((SimpleStringData)object2).getMessage();
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
                        mq0_2.d((String)object2, (String)object);
                        return Unit.a;
                    }
                    object2 = uy1_0.a;
                    Bundle bundle = new Bundle();
                    object2 = uy1_0.c;
                    Object object6 = uy1_0.a();
                    bundle.putString((String)object2, (String)object6);
                    bundle.putString("page_type", "my account screen");
                    object5 = uy1_0.a;
                    string2 = ((NewCustomEventsRevamp)object5).getEC_USER_ACCOUNTS();
                    object2 = AnalyticsManager.Companion;
                    String string6 = bv_0.a((AnalyticsManager$Companion)object2);
                    String string7 = cv_0.a((AnalyticsManager$Companion)object2);
                    String string8 = uy1_0.l;
                    String string9 = uy1_0.h;
                    int n14 = 1536;
                    String string10 = "user_account_interactions";
                    String string11 = "update email address";
                    String string12 = "update email address";
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, string2, string8, string9, string10, string11, string12, string6, bundle, string7, false, null, n14, null);
                    object6 = ((m51_0)object).getContext();
                    object3 = ux0_0.class;
                    object2 = new Intent((Context)object6, (Class)object3);
                    object6 = ((ux0_0)object).j;
                    if (object6 == null) {
                        object6 = "mEmailEt";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    } else {
                        String string13 = object6;
                    }
                    object6 = var11_22.getText().toString();
                    object3 = "EDIT_UPDATED_INFO";
                    object2.putExtra((String)object3, (String)object6);
                    object6 = ((Fragment)object).getTargetFragment();
                    Intrinsics.checkNotNull(object6);
                    n4 = ((Fragment)object).getTargetRequestCode();
                    n7 = -1;
                    ((Fragment)object6).onActivityResult(n4, n7, (Intent)object2);
                    ((BottomSheetDialogFragment)object).dismiss();
                    return Unit.a;
                }
                int n15 = dataCallback.getStatus();
                if (n15 != n3) return Unit.a;
                object = dataCallback.getError();
                if (object != null) {
                    DataError$ErrorMessage dataError$ErrorMessage = ((DataError)object).getErrorMessage();
                }
                if (var11_24 != null) {
                    object2 = ((DataError)object).getErrorMessage().getMessage();
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
                    n8 = ((String)object2).length();
                    if (n8 > 0) {
                        object2 = StringCompanionObject.INSTANCE;
                        n8 = R$string.acc_error_message;
                        object2 = hv3_0.K(n8);
                        String string14 = ((DataError)object).getErrorMessage().getMessage();
                        Object[] objectArray = new Object[n3];
                        objectArray[0] = string14;
                        object2 = xh2_0.a(objectArray, n3, (String)object2, string2);
                        object = ((DataError)object).getErrorMessage().getMessage();
                        Intrinsics.checkNotNullExpressionValue(object, (String)object5);
                        hv3_0.o0(0, (String)object, (String)object2);
                        return Unit.a;
                    }
                }
                object = StringCompanionObject.INSTANCE;
                n15 = R$string.acc_error_message;
                object = hv3_0.K(n15);
                object2 = hv3_0.K(R$string.email_not_able_to_update);
                Object[] objectArray = new Object[n3];
                objectArray[0] = object2;
                object = xh2_0.a(objectArray, n3, (String)object, string2);
                n8 = R$string.email_not_able_to_update;
                object2 = hv3_0.K(n8);
                mq0_2.d((String)object2, (String)object);
                return Unit.a;
            }
            case 0: 
        }
        Location location3 = location;
        location3 = location;
        object = (CartAddressListBottomSheet)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        if (location3 != null) {
            double d2;
            ((CartAddressListBottomSheet)object).G = d2 = location3.getLatitude();
            double d5 = location3.getLongitude();
            object3 = ((CartAddressListBottomSheet)object).u;
            if (object3 == null) return Unit.a;
            double d7 = ((CartAddressListBottomSheet)object).G;
            object3.b8(d7, d5);
            return Unit.a;
        }
        object = ((Fragment)object).requireContext();
        object2 = "Location not found";
        object = Toast.makeText((Context)object, (CharSequence)object2, (int)0);
        object.show();
        return Unit.a;
    }
}

