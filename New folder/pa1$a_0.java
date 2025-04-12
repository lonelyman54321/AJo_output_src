/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.Login.UcpToken;
import kotlin.Unit;

/*
 * Renamed from PA1$a
 */
public final class pa1$a_0
implements fs0_2 {
    public final /* synthetic */ oa1_1 a;

    public pa1$a_0(oa1_1 oa1_12) {
        this.a = oa1_12;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object emit(Object object, f80_0 object2) {
        object = (DataCallback)object;
        int n3 = ((DataCallback)object).getStatus();
        oa1_1 oa1_12 = this.a;
        if (n3 == 0) {
            object2 = oa1_12.c;
            boolean bl2 = false;
            Object var6_7 = null;
            object2 = ((UserRepo)object2).getUserProfile(false);
            Object object3 = new ma1_2(oa1_12);
            na1_1 na1_12 = new na1_1(object3);
            int n4 = 1;
            object3 = new tz_1(oa1_12, n4);
            mk0_0 mk0_02 = new mk0_0(object3);
            object2 = ((g53_0)object2).f(na1_12, mk0_02);
            object3 = oa1_12.d;
            ((t30_0)object3).b((yr0_2)object2);
            object2 = (DataCallback)oa1_12.i.d();
            if (object2 != null && (object2 = (UcpToken)((DataCallback)object2).getData()) != null) {
                bl2 = ((UcpToken)object2).isReferralCodeValid();
            }
            oa1_12.K = bl2;
        } else {
            int n7;
            n3 = ((DataCallback)object).getStatus();
            if (n3 == (n7 = 1)) {
                object2 = ((DataCallback)object).getError();
                if (object2 == null || (object2 = ((DataError)object2).getErrorMessage()) == null || (object2 = ((DataError$ErrorMessage)object2).getType()) == null) {
                    object2 = "Unknown error occurred";
                }
                Object object4 = object2;
                NewCustomEventsRevamp newCustomEventsRevamp = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
                String string2 = oa1_12.L;
                object2 = oa1_12.I;
                String string3 = oa1_1.n((String)object2);
                boolean bl3 = oa1_12.K;
                String string4 = "my account screen";
                Object var7_10 = null;
                String string5 = "my account screen";
                newCustomEventsRevamp.sendLoginRegisterEvent(false, string2, string5, string4, string3, bl3, (String)object4);
            }
        }
        oa1_12.i.k(object);
        return Unit.a;
    }
}

