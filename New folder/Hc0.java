/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.CouponPromotion.CouponPromotion;
import com.ril.ajio.view.BaseActivity;

public final class Hc0
implements F62 {
    public final /* synthetic */ jc0_0 a;

    public /* synthetic */ Hc0(jc0_0 jc0_02) {
        this.a = jc0_02;
    }

    public final void onChanged(Object object) {
        int n3 = 1;
        BaseActivity baseActivity = null;
        object = (DataCallback)object;
        jc0_0 jc0_02 = this.a;
        jc0_02.getClass();
        Object object2 = cp_1.Companion;
        int n4 = nn_2.b(object2, (DataCallback)object);
        if (n4 != 0) {
            object2 = jc0_02.c;
            if (object2 != null) {
                ((AjioProgressView)((Object)object2)).dismiss();
            }
            if ((n4 = ((DataCallback)object).getStatus()) == 0) {
                jc0_02.e = object = (CouponPromotion)((DataCallback)object).getData();
                object = ((CouponPromotion)object).getSaleStartTime();
                String string2 = jc0_02.e.getSaleEndTime();
                if ((object = cb2_0.a((String)object, string2, (String)(object2 = jc0_02.e.getServerTime()))) != null) {
                    n3 = (int)(((fn3_0)object).c ? 1 : 0);
                    if (n3 != 0) {
                        object = ((fn3_0)object).b;
                        jc0_02.Oa((String)object);
                        object = jc0_02.b;
                        object.setEnabled(false);
                    } else {
                        n3 = (int)(((fn3_0)object).a ? 1 : 0);
                        if (n3 != 0) {
                            String string3 = ((fn3_0)object).b;
                            long l2 = ((fn3_0)object).f;
                            object2 = object;
                            object = new ic0_0(jc0_02, l2, l2, string3);
                            object.start();
                        } else {
                            object = ((fn3_0)object).b;
                            jc0_02.Oa((String)object);
                        }
                    }
                }
            } else {
                n4 = ((DataCallback)object).getStatus();
                if (n4 == n3 && (object2 = ((DataError)(object = ((DataCallback)object).getError())).getErrorMessage()) != null && (object2 = jc0_02.a) != null && (n4 = (int)(object2.isFinishing() ? 1 : 0)) == 0 && (n4 = (object2 = jc0_02.a) instanceof BaseActivity) != 0) {
                    n4 = R$string.acc_error_message;
                    object2 = hv3_0.K(n4);
                    String string4 = ((DataError)object).getErrorMessage().getMessage();
                    Object object3 = new Object[n3];
                    object3[0] = string4;
                    object3 = String.format((String)object2, object3);
                    baseActivity = (BaseActivity)jc0_02.a;
                    object = ((DataError)object).getErrorMessage().getMessage();
                    baseActivity.showNotification((String)object, (String)object3);
                }
            }
        }
    }
}

