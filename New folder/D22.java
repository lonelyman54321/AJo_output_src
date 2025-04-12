/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Login.CustomerType;
import com.ril.ajio.services.data.Product.NewUserBanner;
import com.ril.ajio.services.data.user.LocationData;
import com.ril.ajio.services.data.user.LocationData$Companion;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class D22
implements Function1 {
    public final /* synthetic */ q22_0 a;

    public /* synthetic */ D22(q22_0 q22_02) {
        this.a = q22_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        q22_0 q22_02 = this.a;
        Intrinsics.checkNotNullParameter(q22_02, "this$0");
        Object object2 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (bl2) {
            int n3;
            int n4;
            object2 = (D32)((DataCallback)object).getData();
            int n7 = 0;
            Object object3 = null;
            if (object2 != null) {
                object2 = ((D32)object2).a;
            } else {
                bl2 = false;
                object2 = null;
            }
            object = (D32)((DataCallback)object).getData();
            if (object != null) {
                object = ((D32)object).b;
            } else {
                n4 = 0;
                object = null;
            }
            if (object != null && (n3 = ((DataCallback)object).getStatus()) == 0) {
                int n8;
                String string2;
                object = (CustomerType)((DataCallback)object).getData();
                Object object4 = q22_02.Va();
                if (object != null) {
                    string2 = ((CustomerType)object).getCustomerType();
                } else {
                    n8 = 0;
                    string2 = null;
                }
                ((jo_2)object4).q(string2);
                object4 = q22_02.r;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("homeListener");
                    n3 = 0;
                    object4 = null;
                }
                n8 = 1;
                object4.u0(n8 != 0);
                object4 = z40_0.Companion;
                string2 = q22_02.requireActivity().getApplication();
                String string3 = "getApplication(...)";
                Intrinsics.checkNotNullExpressionValue(string2, string3);
                object4.getClass();
                object4 = z40$a.a((Context)string2).a;
                string2 = "enable_locale";
                n3 = (int)(((ao0_0)object4).a(string2) ? 1 : 0);
                if (n3 != 0) {
                    if (object != null) {
                        object3 = ((CustomerType)object).getPincode();
                    }
                    if (object3 != null && (n7 = ((String)object3).length()) != 0 && object != null) {
                        string3 = ((CustomerType)object).getCity();
                        String string4 = ((CustomerType)object).getState();
                        String string5 = ((CustomerType)object).getZone();
                        String string6 = ((CustomerType)object).getPincode();
                        n8 = 101;
                        object4 = object3;
                        object3 = new LocationData(n8, string3, string4, string5, string6);
                        object = q22_02.cb();
                        n4 = (int)(((F12)object).g() ? 1 : 0);
                        if (n4 != 0 && ((object = q22_02.Va().i()) == null || (n4 = (int)(((LocationData$Companion)(object = LocationData.Companion)).isDiffLocaleData((LocationData)(object4 = q22_02.Va().i()), (LocationData)object3) ? 1 : 0)) != 0)) {
                            object = AnalyticsManager.Companion.getInstance().getCt();
                            ((CleverTapEvents)object).pushLocaleData((LocationData)object3);
                        }
                        object = q22_02.Va();
                        ((jo_2)object).r((LocationData)object3);
                    }
                }
            }
            if (object2 != null && (n4 = ((DataCallback)object2).getStatus()) == 0 && (object = (NewUserBanner)((DataCallback)object2).getData()) != null) {
                object2 = q22_02.Va().f();
                q22_02.nb((NewUserBanner)object, (String)object2);
            }
        }
        return Unit.a;
    }
}

