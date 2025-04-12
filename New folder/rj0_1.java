/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.view.PaymentActivity;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from RJ0
 */
public final class rj0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rj0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                Iterator iterator = object;
                iterator = (Throwable)object;
                object3 = (hy3_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object = ((hy3_0)object3).o;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(iterator);
                DataCallback dataCallback = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)((Object)iterator), "request_otp_access_profile", false, null, null, 28, null);
                ((LiveData)object).k(dataCallback);
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                n4 = PaymentActivity.I0;
                object3 = (PaymentActivity)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = cp_1.Companion;
                int n7 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n7 != 0) {
                    if (object != null && (n7 = ((DataCallback)object).getStatus()) == 0) {
                        object = ((DataCallback)object).getData();
                        object = JsonUtils.toJson(object);
                        object3.getClass();
                        try {
                            ((PaymentActivity)object3).F2((String)object);
                        }
                        catch (Exception exception) {
                            yn3$a yn3$a = yn3_0.a;
                            yn3$a.e(exception);
                        }
                    } else {
                        n7 = ((DataCallback)object).getStatus();
                        if (n7 == n3) {
                            String string2;
                            object2 = new StringBuilder();
                            object = ((DataCallback)object).getError();
                            Intrinsics.checkNotNull(object);
                            object = ((DataError)object).errors.iterator();
                            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                                string2 = ((DataError$ErrorMessage)object.next()).getMessage();
                                ((StringBuilder)object2).append(string2);
                                string2 = " ";
                                ((StringBuilder)object2).append(string2);
                            }
                            object = StringCompanionObject.INSTANCE;
                            int n8 = R$string.acc_error_message_page_load_fail;
                            object = hv3_0.K(n8);
                            string2 = ((StringBuilder)object2).toString();
                            Object[] objectArray = new Object[n3];
                            Object var6_8 = null;
                            objectArray[0] = string2;
                            string2 = "format(...)";
                            object = xh2_0.a(objectArray, n3, (String)object, string2);
                            String string3 = ((StringBuilder)object2).toString();
                            ((PaymentActivity)object3).showNotification(string3, (String)object);
                            ((PaymentActivity)object3).b1();
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (Integer)object;
        int n10 = (Integer)object;
        object3 = (p83_0)object3;
        n3 = 0;
        String string4 = null;
        if (object3 != null && (object2 = (Component)((p83_0)object3).get(n10)) != null && (object2 = ((Component)object2).getType()) != null) {
            object = (Component)((p83_0)object3).get(n10);
            if (object != null) {
                string4 = ((Component)object).getSubType();
            }
            string4 = Ft2.a((String)object2, string4);
        }
        return string4;
    }
}

