/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Login.OTPData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

public final class Vz1
implements F62 {
    public final /* synthetic */ da1_1 a;

    public /* synthetic */ Vz1(da1_1 da1_12) {
        this.a = da1_12;
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
        object3 = ((da1_1)object2).A;
        if (object3 != null) {
            object3.stopLoader();
        }
        bl2 = false;
        object3 = null;
        String string2 = "getMessage(...)";
        if (object != null && (n3 = ((DataCallback)object).getStatus()) == 0) {
            String string3;
            if ((object = (OTPData)((DataCallback)object).getData()) != null) {
                string3 = ((OTPData)object).getMessage();
            } else {
                n4 = 0;
                string3 = null;
            }
            if (string3 != null) {
                string3 = ((OTPData)object).getMessage();
                Intrinsics.checkNotNullExpressionValue(string3, string2);
                n4 = string3.length();
                if (n4 != 0) {
                    object = ((OTPData)object).getMessage();
                    Intrinsics.checkNotNullExpressionValue(object, string2);
                    hv3_0.o0(0, (String)object, null);
                    ((da1_1)object2).Ua();
                    return;
                }
            }
            ((da1_1)object2).Sa();
            return;
        }
        n3 = ((DataCallback)object).getStatus();
        if (n3 != n4) return;
        ((da1_1)object2).Ua();
        object = ((DataCallback)object).getError();
        if (object != null) {
            object3 = ((DataError)object).getErrors();
        }
        String string4 = "format(...)";
        if (object3 == null) {
            object = StringCompanionObject.INSTANCE;
            int n7 = R$string.acc_error_message;
            object = hv3_0.K(n7);
            int n8 = R$string.something_wrong_msg;
            object2 = hv3_0.K(n8);
            object3 = new Object[n4];
            object3[0] = object2;
            object = xh2_0.a((Object[])object3, n4, (String)object, string4);
            n4 = R$string.something_wrong_msg;
            String string5 = hv3_0.K(n4);
            hv3_0.o0(0, string5, (String)object);
            return;
        }
        object = ((DataError)object).getErrors().iterator();
        while (bl2 = object.hasNext()) {
            int n10;
            object3 = (DataError$ErrorMessage)object.next();
            Object object4 = ((DataError$ErrorMessage)object3).getSubject();
            if (object4 != null) {
                object4 = ((DataError$ErrorMessage)object3).getSubject();
                String string6 = "getSubject(...)";
                Intrinsics.checkNotNullExpressionValue(object4, string6);
                n10 = ((String)object4).length();
                if (n10 != 0) {
                    String string7;
                    String string8;
                    String string9;
                    object4 = ((DataError$ErrorMessage)object3).getSubject();
                    n10 = (int)(b.i((String)object4, string9 = "uid", n4 != 0) ? 1 : 0);
                    if (n10 != 0) {
                        ((da1_1)object2).Qa();
                    }
                    if ((n10 = (int)(b.i((String)(object4 = ((DataError$ErrorMessage)object3).getSubject()), string8 = "mobileNumber", n4 != 0) ? 1 : 0)) != 0) {
                        ((da1_1)object2).Qa();
                    }
                    if ((n10 = (int)(b.i((String)(object4 = ((DataError$ErrorMessage)object3).getSubject()), string7 = "password", n4 != 0) ? 1 : 0)) == 0) continue;
                    object4 = StringCompanionObject.INSTANCE;
                    n10 = R$string.acc_error_message;
                    object4 = hv3_0.K(n10);
                    String string10 = ((DataError$ErrorMessage)object3).getMessage();
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = string10;
                    object4 = xh2_0.a(objectArray, n4, (String)object4, string4);
                    object3 = ((DataError$ErrorMessage)object3).getMessage();
                    Intrinsics.checkNotNullExpressionValue(object3, string2);
                    hv3_0.o0(0, (String)object3, (String)object4);
                    continue;
                }
            }
            if ((object4 = ((DataError$ErrorMessage)object3).getType()) != null) {
                bl2 = b.i((String)(object3 = ((DataError$ErrorMessage)object3).getType()), (String)(object4 = "DuplicateUidError"), n4 != 0);
                if (!bl2) continue;
                ((da1_1)object2).Qa();
                continue;
            }
            object3 = ((DataError$ErrorMessage)object3).getMessage();
            object3 = kp1_0.c("Error has occurred for registering customer, ", (String)object3);
            object4 = StringCompanionObject.INSTANCE;
            n10 = R$string.acc_error_message;
            object4 = hv3_0.K(n10);
            Object[] objectArray = new Object[n4];
            objectArray[0] = object3;
            object4 = xh2_0.a(objectArray, n4, (String)object4, string4);
            hv3_0.o0(0, (String)object3, (String)object4);
        }
    }
}

