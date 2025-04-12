/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Intent;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.login.activity.ResetPasswordActivity;
import com.ril.ajio.services.data.SimpleStringData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from qK2
 */
public final class qk2_1
implements F62 {
    public final /* synthetic */ ResetPasswordActivity a;

    public /* synthetic */ qk2_1(ResetPasswordActivity resetPasswordActivity) {
        this.a = resetPasswordActivity;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onChanged(Object object) {
        Object[] objectArray;
        Object object2;
        Object object3;
        int n3;
        Object object4;
        block6: {
            block7: {
                JSONException jSONException2;
                block5: {
                    block4: {
                        object4 = null;
                        n3 = 1;
                        object = (DataCallback)object;
                        object3 = ResetPasswordActivity.Companion;
                        object3 = this.a;
                        Intrinsics.checkNotNullParameter(object3, "this$0");
                        object2 = cp_1.Companion;
                        int n4 = nn_2.b((cp$a)object2, (DataCallback)object);
                        if (n4 == 0) return;
                        object2 = ((ResetPasswordActivity)object3).s0;
                        objectArray = null;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mProgressView");
                            n4 = 0;
                            object2 = null;
                        }
                        ((AjioProgressView)((Object)object2)).dismiss();
                        if (object == null || (n4 = ((DataCallback)object).getStatus()) != 0) break block6;
                        try {
                            object = ((DataCallback)object).getData();
                            object = (SimpleStringData)object;
                            if (object == null) break block4;
                            objectArray = ((SimpleStringData)object).getMessage();
                        }
                        catch (JSONException jSONException2) {
                            break block5;
                        }
                    }
                    object4 = new JSONObject((String)objectArray);
                    object = "message";
                    object = object4.getString((String)object);
                    break block7;
                }
                object4 = yn3_0.a;
                ((yn3$a)object4).e(jSONException2);
                object = "";
            }
            object4 = new Intent();
            String string2 = "resetpasswordmessage";
            object4.putExtra(string2, (String)object);
            int n7 = -1;
            object3.setResult(n7, (Intent)object4);
            object3.finish();
            return;
        }
        int n8 = ((DataCallback)object).getStatus();
        if (n8 != n3) return;
        if ((object = ((DataCallback)object).getError()) != null) {
            objectArray = ((DataError)object).errors;
        }
        if (objectArray == null) return;
        object3 = ((DataError)object).errors;
        n8 = object3.size();
        if (n8 <= 0) return;
        object3 = StringCompanionObject.INSTANCE;
        n8 = R$string.acc_error_message;
        object3 = hv3_0.K(n8);
        object2 = ((DataError$ErrorMessage)((DataError)object).errors.get(0)).getMessage();
        objectArray = new Object[n3];
        objectArray[0] = object2;
        object2 = "format(...)";
        String string3 = xh2_0.a(objectArray, n3, (String)object3, (String)object2);
        object = ((DataError$ErrorMessage)((DataError)object).errors.get(0)).getMessage();
        object4 = "getMessage(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
        mq0_2.c((String)object, string3);
    }
}

