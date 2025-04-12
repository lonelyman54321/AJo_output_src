/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import com.ril.ajio.services.data.Login.Data;
import com.ril.ajio.services.data.Login.UcpToken;
import com.ril.ajio.services.data.user.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from ly1
 */
public final class ly1_1
implements Function1 {
    public final /* synthetic */ LoginActivityRevampNew a;

    public /* synthetic */ ly1_1(LoginActivityRevampNew loginActivityRevampNew) {
        this.a = loginActivityRevampNew;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object object2 = LoginActivityRevampNew.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n3 != 0) {
            if (object != null && (n3 = ((DataCallback)object).getStatus()) == 0) {
                Object object4;
                boolean bl2;
                boolean bl3;
                Object object5;
                boolean bl4;
                String string2;
                User user = new User();
                if ((object = (UcpToken)((DataCallback)object).getData()) != null && (object = ((UcpToken)object).getData()) != null) {
                    object = ((Iterable)object).iterator();
                    while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                        object3 = (Data)object.next();
                        string2 = ((Data)object3).getTokenProvider();
                        if (string2 == null || (bl4 = StringsKt.F(string2, (CharSequence)(object5 = "UCP"), bl3 = true)) != bl3) continue;
                        ((Data)object3).toString();
                        object2.getClass();
                    }
                }
                object = ((LoginActivityRevampNew)object2).r0;
                n3 = 0;
                object3 = null;
                string2 = "loginViewModel";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object = null;
                }
                if (bl2 = ((oa1_1)object).K) {
                    object = h40_0.a;
                    object = z40_0.Companion;
                    object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("UCP_Configuratiion").getString("referralMessage");
                    Intrinsics.checkNotNullExpressionValue(object, "getString(...)");
                    object5 = null;
                    object4 = "";
                    hv3_0.o0(0, (String)object, (String)object4);
                }
                object5 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
                String string3 = ((LoginActivityRevampNew)object2).M0;
                object = ((LoginActivityRevampNew)object2).r0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object = null;
                }
                if ((object4 = ((LoginActivityRevampNew)object2).r0) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl3 = false;
                    object4 = null;
                }
                object4 = ((oa1_1)object4).I;
                object.getClass();
                String string4 = oa1_1.n((String)object4);
                object = ((LoginActivityRevampNew)object2).r0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object3 = object;
                }
                boolean bl5 = ((oa1_1)object3).K;
                String string5 = "my account screen";
                String string6 = "my account screen";
                int n4 = 64;
                NewCustomEventsRevamp.sendLoginRegisterEvent$default((NewCustomEventsRevamp)object5, true, string3, string6, string5, string4, bl5, null, n4, null);
                bl3 = false;
                object4 = null;
                string3 = "";
                bl4 = false;
                string2 = null;
                object5 = "";
                object3 = object2;
                ((LoginActivityRevampNew)object2).Q0(user, false, (String)object5, false, string3);
                ((LoginActivityRevampNew)object2).startLoader();
            } else {
                object2.finish();
            }
        }
        return Unit.a;
    }
}

