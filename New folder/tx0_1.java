/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.EditProfileData;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from tx0
 */
public final class tx0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tx0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        boolean bl2 = true;
        Object object2 = null;
        Object object3 = this.b;
        Object object4 = "this$0";
        int n3 = this.a;
        object = (DataCallback)object;
        switch (n3) {
            default: {
                object3 = (v33)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                ((v33)object3).e.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object3 = (ux0_0)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        ((ux0_0)object3).Qa(false);
        object4 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n4 != 0) {
            if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
                if ((object = (AccountCheckResponse)((DataCallback)object).getData()) != null) {
                    boolean bl3 = ((AccountCheckResponse)object).isSuccess();
                    if (!bl3) {
                        ((ux0_0)object3).Qa(bl2);
                        object = ((ux0_0)object3).f;
                        if (object != null) {
                            Object object5;
                            object2 = ((ux0_0)object3).x;
                            object4 = "";
                            if (object2 == null || (object2 = object2.getFirstName()) == null) {
                                object2 = object4;
                            }
                            if ((object5 = ((ux0_0)object3).x) == null || (object5 = object5.getLastName()) == null) {
                                object5 = object4;
                            }
                            if ((object3 = ((ux0_0)object3).x) != null && (object3 = ((EditProfileData)object3).getMobileNumber()) != null) {
                                object4 = object3;
                            }
                            ((hy3_0)object).r((String)object2, (String)object5, (String)object4, bl2);
                        }
                    } else {
                        object = ((ux0_0)object3).o;
                        bl2 = false;
                        Object object6 = null;
                        object4 = "mEmailErrorTv";
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            bl3 = false;
                            object = null;
                        }
                        n3 = R$string.email_address_already_linked;
                        object.setText(n3);
                        object = ((ux0_0)object3).o;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            bl3 = false;
                            object = null;
                        }
                        object.setVisibility(0);
                        object = ((ux0_0)object3).o;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        } else {
                            object6 = object;
                        }
                        ai0_2.a((View)object6);
                    }
                }
            } else {
                object = StringCompanionObject.INSTANCE;
                int n7 = R$string.acc_error_message;
                object = hv3_0.K(n7);
                int n8 = R$string.something_wrong_msg;
                object3 = hv3_0.K(n8);
                object4 = new Object[bl2];
                object4[0] = object3;
                object2 = "format(...)";
                object = xh2_0.a(object4, (int)(bl2 ? 1 : 0), (String)object, (String)object2);
                bl2 = R$string.server_alert_title;
                String string2 = hv3_0.K((int)(bl2 ? 1 : 0));
                mq0_2.d(string2, (String)object);
            }
        }
        return Unit.a;
    }
}

