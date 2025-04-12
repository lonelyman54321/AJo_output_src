/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.SimpleStringData;
import com.ril.ajio.view.BaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Cx0
 */
public final class cx0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cx0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        int n3;
        Object[] objectArray;
        Object object2 = this.b;
        Object object3 = "this$0";
        int n4 = 0;
        Object object4 = null;
        int n7 = 1;
        int n8 = this.a;
        switch (n8) {
            default: {
                Object object5 = object;
                object5 = (Throwable)object;
                object2 = (hy3_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object2 = ((hy3_0)object2).q;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object5);
                object3 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object5, "verify_otp_access_profile", false, null, null, 28, null);
                ((LiveData)object2).k(object3);
                return Unit.a;
            }
            case 1: {
                object4 = object;
                object4 = (Throwable)object;
                object2 = (wf1_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object2 = ((wf1_2)object2).f;
                object3 = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object4);
                object3 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object3, (Throwable)object4, "impsRequest", false, null, null, 28, null);
                ((LiveData)object2).k(object3);
                return Unit.a;
            }
            case 0: 
        }
        Object object6 = object;
        object6 = (DataCallback)object;
        object2 = (dx0_1)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = cp_1.Companion;
        int n10 = nn_2.b((cp$a)object3, (DataCallback)object6);
        if (n10 == 0) return Unit.a;
        Intrinsics.checkNotNull(object6);
        n10 = ((DataCallback)object6).getStatus();
        Object object7 = null;
        String string2 = "getMessage(...)";
        String string3 = "format(...)";
        if (n10 == 0) {
            object3 = uy1_0.a;
            object3 = new Bundle();
            Object[] objectArray2 = uy1_0.c;
            String string4 = uy1_0.a();
            object3.putString((String)objectArray2, string4);
            object3.putString("page_type", "my account screen");
            objectArray2 = uy1_0.a;
            string4 = objectArray2.getEC_USER_ACCOUNTS();
            Object object8 = AnalyticsManager.Companion;
            String string5 = bv_0.a((AnalyticsManager$Companion)object8);
            String string6 = cv_0.a((AnalyticsManager$Companion)object8);
            object8 = uy1_0.f;
            String string7 = uy1_0.h;
            int n14 = 1536;
            String string8 = "user_account_interactions";
            String string9 = "my account screen";
            String string10 = "my account screen";
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)objectArray2, string4, (String)object8, string7, string8, string9, string10, string5, (Bundle)object3, string6, false, null, n14, null);
            object3 = (SimpleStringData)((DataCallback)object6).getData();
            if (object3 != null && (object6 = ((SimpleStringData)object3).getMessage()) != null && (n8 = ((String)(object6 = ((SimpleStringData)object3).getMessage())).length()) > 0) {
                object6 = StringCompanionObject.INSTANCE;
                n8 = R$string.acc_alert_message;
                object6 = hv3_0.K(n8);
                object7 = ((SimpleStringData)object3).getMessage();
                objectArray2 = new Object[n7];
                objectArray2[0] = object7;
                object4 = xh2_0.a(objectArray2, n7, (String)object6, string3);
                object3 = ((SimpleStringData)object3).getMessage();
                Intrinsics.checkNotNullExpressionValue(object3, string2);
                object2.getClass();
                mq0_2.d((String)object3, (String)object4);
                ((dx0_1)object2).Oa();
                return Unit.a;
            }
            object3 = ((dx0_1)object2).a;
            n10 = object3 instanceof BaseActivity;
            if (n10 != 0) {
                n10 = R$string.mobile_update_msg;
                object3 = hv3_0.K(n10);
                object6 = ((dx0_1)object2).c;
                if (object6 == null) {
                    object6 = "mMobileEt";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                } else {
                    object7 = object6;
                }
                object6 = object7.getText();
                object7 = new StringBuilder();
                ((StringBuilder)object7).append((String)object3);
                ((StringBuilder)object7).append(object6);
                object3 = ((StringBuilder)object7).toString();
                object6 = StringCompanionObject.INSTANCE;
                n8 = R$string.acc_alert_message;
                object6 = hv3_0.K(n8);
                object7 = new Object[n7];
                object7[0] = object3;
                object4 = xh2_0.a((Object[])object7, n7, (String)object6, string3);
                Activity activity = ((dx0_1)object2).a;
                object6 = "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity";
                Intrinsics.checkNotNull(activity, (String)object6);
                activity = (BaseActivity)activity;
                activity.showNotification((String)object3, (String)object4);
            }
            ((dx0_1)object2).Oa();
            return Unit.a;
        }
        n10 = ((DataCallback)object6).getStatus();
        if (n10 != n7) return Unit.a;
        object3 = (SimpleStringData)((DataCallback)object6).getData();
        if (object3 != null && (objectArray = ((SimpleStringData)object3).getMessage()) != null && (n3 = (objectArray = ((SimpleStringData)object3).getMessage()).length()) > 0) {
            object6 = StringCompanionObject.INSTANCE;
            n8 = R$string.acc_alert_message;
            object6 = hv3_0.K(n8);
            object7 = ((SimpleStringData)object3).getMessage();
            objectArray = new Object[n7];
            objectArray[0] = object7;
            object4 = xh2_0.a(objectArray, n7, (String)object6, string3);
            object3 = ((SimpleStringData)object3).getMessage();
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            object2.getClass();
            mq0_2.d((String)object3, (String)object4);
            ((dx0_1)object2).Oa();
            return Unit.a;
        }
        object3 = ((DataCallback)object6).getError();
        if (object3 != null) {
            object7 = ((DataError)object3).getErrorMessage();
        }
        if (object7 != null) {
            object6 = ((DataError)object3).getErrorMessage().getMessage();
            Intrinsics.checkNotNullExpressionValue(object6, string2);
            n8 = ((String)object6).length();
            if (n8 > 0) {
                object2 = StringCompanionObject.INSTANCE;
                int n15 = R$string.acc_error_message;
                object2 = hv3_0.K(n15);
                object6 = ((DataError)object3).getErrorMessage().getMessage();
                object7 = new Object[n7];
                object7[0] = object6;
                object2 = xh2_0.a((Object[])object7, n7, (String)object2, string3);
                object3 = ((DataError)object3).getErrorMessage().getMessage();
                Intrinsics.checkNotNullExpressionValue(object3, string2);
                hv3_0.o0(0, (String)object3, (String)object2);
                return Unit.a;
            }
        }
        object3 = StringCompanionObject.INSTANCE;
        n10 = R$string.acc_error_message;
        object3 = hv3_0.K(n10);
        n8 = R$string.phone_not_able_to_update;
        object6 = hv3_0.K(n8);
        object7 = new Object[n7];
        object7[0] = object6;
        object3 = xh2_0.a((Object[])object7, n7, (String)object3, string3);
        n4 = R$string.phone_not_able_to_update;
        object4 = hv3_0.K(n4);
        object2.getClass();
        mq0_2.d((String)object4, (String)object3);
        return Unit.a;
    }
}

