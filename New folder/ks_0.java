/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.launch.activity.SplashScreenActivity;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KS
 */
public final class ks_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ks_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        Object object3 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                object = SplashScreenActivity.Companion;
                object2 = (SplashScreenActivity)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                boolean bl2 = ((SplashScreenActivity)object2).q0;
                if (bl2) {
                    object = ((SplashScreenActivity)object2).p0;
                    if (object == null) {
                        object = object2.getIntent();
                        object3 = "getIntent(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                        ((SplashScreenActivity)object2).y2((Intent)object);
                    }
                    ((SplashScreenActivity)object2).D2();
                } else {
                    at2_1.d((Context)object2);
                    object2.finish();
                }
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                object2 = (g)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                Intrinsics.checkNotNullParameter(object, "UpiRedirectCallback");
                object3 = cp_1.Companion;
                int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (n4) {
                    object3 = ((g)object2).c;
                    if (object3 != null) {
                        object3.h();
                    }
                    n4 = ((DataCallback)object).getStatus();
                    n3 = 0;
                    if (!n4) {
                        object2 = ((g)object2).Wa();
                        boolean bl3 = dm0_0.b;
                        object = JsonUtils.toJson(((DataCallback)object).getData());
                        int n7 = 12;
                        object3 = new hj2_0((String)object, n7, bl3, false);
                        ((kj2_1)object2).c((hj2_0)object3);
                    } else {
                        int n8 = ((DataCallback)object).getStatus();
                        if (n8 == (n4 = 1)) {
                            object = ((g)object2).Wa();
                            n4 = (int)(dm0_0.b ? 1 : 0);
                            int n10 = 14;
                            boolean bl4 = false;
                            object2 = new hj2_0(null, n10, n4 != 0, false);
                            ((kj2_1)object).c((hj2_0)object2);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (Throwable)object;
        object2 = (ps_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        yn3_0.a.e((Throwable)object);
        object = ((ps_0)object2).e;
        object2 = DataCallback.Companion;
        object3 = Boolean.FALSE;
        object2 = ((DataCallback$Companion)object2).onSuccess(object3);
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

