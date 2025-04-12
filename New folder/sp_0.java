/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.deeplink.DeepLinkResult$Status;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from sp
 */
public final class sp_0
implements DeepLinkListener {
    public final /* synthetic */ tp_0 a;

    public /* synthetic */ sp_0(tp_0 tp_02) {
        this.a = tp_02;
    }

    public final void onDeepLinking(DeepLinkResult object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "deepLinkResult");
        Object object3 = ((DeepLinkResult)object).getStatus();
        Object object4 = DeepLinkResult$Status.FOUND;
        if (object3 == object4 && (object = ((DeepLinkResult)object).getDeepLink().getDeepLinkValue()) != null) {
            ((tp_0)object2).b.setValue(object);
            object3 = "linkCohort";
            object4 = null;
            boolean bl2 = StringsKt.F((CharSequence)object, (CharSequence)object3, false);
            if (bl2) {
                String string2 = "ajioapps://";
                bl2 = b.s((String)object, string2, false);
                if (bl2) {
                    string2 = "ajioapps";
                    String string3 = "https";
                    object = b.n((String)object, string2, string3, false);
                }
                object = Uri.parse((String)object).getQueryParameter((String)object3);
                object3 = h40_0.a;
                int n3 = h40_0.V0();
                if (n3 != 0) {
                    object2 = ((tp_0)object2).a;
                    UserInformation.getInstance((Context)object2).setCohortLinkData((String)object);
                    object3 = UserInformation.getInstance((Context)object2).getCohortDataForGuestAjioStoreUser();
                    object4 = "getCohortDataForGuestAjioStoreUser(...)";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                    n3 = ((String)object3).length();
                    if (n3 == 0 || (n3 = (int)(Intrinsics.areEqual(object3 = UserInformation.getInstance((Context)object2).isAjioStoreGuestCohortValueFromCustomerApi(), object4 = Boolean.FALSE) ? 1 : 0)) != 0) {
                        object2 = UserInformation.getInstance((Context)object2);
                        object3 = Boolean.FALSE;
                        ((UserInformation)object2).setCohortDataForGuestAjioStoreUser((String)object, (Boolean)object3);
                    }
                }
            }
        }
    }
}

