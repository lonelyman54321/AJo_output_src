/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.google.gson.JsonObject;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fy0
 */
public final class fy0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fy0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        Object object3 = "";
        Object object4 = "this$0";
        Object object5 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                Object object6 = object;
                object6 = (dl2_2)object;
                object5 = (oo2_1)object5;
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                String string2 = "PAYMENT_TransactionStatus";
                Intrinsics.checkNotNullParameter(string2, "$requestID");
                Intrinsics.checkNotNullParameter(object6, "response");
                object = (JsonObject)((dl2_2)object6).b;
                object2 = ((dl2_2)object6).a;
                boolean bl2 = ((cl2_2)object2).d();
                if (bl2 && object != null) {
                    Object object7;
                    object4 = (PayNowResponse)JsonUtils.fromJson(JsonUtils.toJson(object), PayNowResponse.class);
                    n4 = 0;
                    String string3 = null;
                    if (object4 != null && (object7 = ((PayNowResponse)object4).getError()) != null) {
                        object7 = ((Error)object7).getCode();
                    } else {
                        boolean bl3 = false;
                        object7 = null;
                    }
                    if (object7 != null) {
                        object7 = ((PayNowResponse)object4).getError();
                        if (object7 != null) {
                            string3 = ((Error)object7).getDescription();
                        }
                        if (string3 != null) {
                            if ((object4 = ((PayNowResponse)object4).getError()) != null && (object4 = ((Error)object4).getDescription()) != null) {
                                object3 = object4;
                            }
                            object5.getClass();
                            n3 = ((cl2_2)object2).d;
                            oo2_1.h(n3, string2, (String)object3);
                        }
                    }
                    object2 = DataCallback.Companion;
                    object = ((DataCallback$Companion)object2).onSuccess(object);
                } else {
                    ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                    String string4 = "single page checkout";
                    String string5 = "Forward";
                    boolean bl4 = true;
                    object = apiErrorRepo.handleApiError((dl2_2)object6, string2, bl4, string4, string5);
                }
                return object;
            }
            case 1: {
                object = (Bitmap)object;
                object5 = (pA1)object5;
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                boolean bl5 = ((Fragment)object5).isAdded();
                if (bl5 && (bl5 = ((Fragment)object5).isVisible()) && !(bl5 = ((Fragment)object5).isRemoving())) {
                    object4 = yn3_0.a;
                    String string6 = Thread.currentThread().getName();
                    int n7 = 1;
                    Object[] objectArray = new Object[n7];
                    objectArray[0] = string6;
                    string6 = "LoginPassword Success %s";
                    ((yn3$a)object4).a(string6, objectArray);
                    if (object != null) {
                        object4 = ((pA1)object5).s;
                        Intrinsics.checkNotNull(object4);
                        object4.setImageBitmap((Bitmap)object);
                        object = ((pA1)object5).t;
                        if (object != null) {
                            object.setText((CharSequence)object3);
                        }
                        object = ((pA1)object5).r;
                        Intrinsics.checkNotNull(object);
                        object.setVisibility(0);
                    } else {
                        object = ((pA1)object5).r;
                        Intrinsics.checkNotNull(object);
                        n3 = 8;
                        object.setVisibility(n3);
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        ((Boolean)object).getClass();
        object5 = (hy0_2)object5;
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        object = ((hy0_2)object5).g;
        if (object != null) {
            ((zc_1)object).Ra();
        }
        return Unit.a;
    }
}

