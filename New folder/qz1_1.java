/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Status;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Qz1
 */
public final class qz1_1
implements F62 {
    public final /* synthetic */ sz1_2 a;

    public /* synthetic */ qz1_1(sz1_2 sz1_22) {
        this.a = sz1_22;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onChanged(Object object) {
        int n3;
        int n4 = 1;
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (!bl2) return;
        object3 = ((sz1_2)object2).y;
        if (object3 != null) {
            object3.stopLoader();
        }
        bl2 = false;
        object3 = null;
        if (object != null && (n3 = ((DataCallback)object).getStatus()) == 0) {
            Object object4 = ((DataCallback)object).getData();
            if (object4 != null) {
                object4 = ((DataCallback)object).getData();
                Intrinsics.checkNotNull(object4);
                object4 = (Status)object4;
                n4 = (int)(((Status)object4).isSuccess() ? 1 : 0);
                if (n4 == 0) {
                    boolean bl3;
                    object4 = (Status)((DataCallback)object).getData();
                    if (object4 != null) {
                        object4 = ((Status)object4).getMessage();
                    } else {
                        n4 = 0;
                        object4 = null;
                    }
                    if (object4 != null && (n4 = ((String)object4).length()) != 0) {
                        object = ((DataCallback)object).getData();
                        Intrinsics.checkNotNull(object);
                        object = ((Status)object).getMessage();
                    } else {
                        object = "Can not generate OTP. Please try again";
                    }
                    object4 = ((sz1_2)object2).q;
                    String string2 = "errorTv";
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        object4 = null;
                    }
                    object4.setVisibility(0);
                    object4 = ((sz1_2)object2).q;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        object4 = null;
                    }
                    object4.setText((CharSequence)object);
                    object = ((sz1_2)object2).q;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl3 = false;
                        object = null;
                    }
                    ai0_2.a((View)object);
                    object = ((sz1_2)object2).p;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("errorIv");
                        bl3 = false;
                        object = null;
                    }
                    object.setVisibility(0);
                    object = ((sz1_2)object2).r;
                    if (object == null) {
                        object = "resendOtpTv";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        object3 = object;
                    }
                    object3.setVisibility(0);
                    return;
                }
            }
            object = cp$a.e();
            object.getClass();
            boolean bl4 = cp_1.f();
            if (!bl4) {
                ((sz1_2)object2).Qa();
                return;
            }
            object = ((sz1_2)object2).j;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("timerTv");
                bl4 = false;
                object = null;
            }
            n4 = 8;
            object.setVisibility(n4);
            object = ((sz1_2)object2).k;
            if (object == null) {
                object = "checkingMsgTv";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object3 = object;
            }
            object3.setVisibility(n4);
            return;
        }
        int n7 = ((DataCallback)object).getStatus();
        if (n7 != n4) return;
        if ((object = ((DataCallback)object).getError()) != null) {
            object3 = ((DataError)object).getErrorMessage();
        }
        if (object3 == null) return;
        object2 = StringCompanionObject.INSTANCE;
        n7 = R$string.acc_error_message;
        object2 = hv3_0.K(n7);
        object3 = ((DataError)object).getErrorMessage().getMessage();
        Object[] objectArray = new Object[n4];
        objectArray[0] = object3;
        object3 = "format(...)";
        String string3 = xh2_0.a(objectArray, n4, (String)object2, (String)object3);
        object = ((DataError)object).getErrorMessage().getMessage();
        object2 = "getMessage(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        hv3_0.o0(0, (String)object, string3);
    }
}

