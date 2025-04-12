/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.gson.JsonObject;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.Status;
import com.ril.ajio.services.data.ajiocash.transform.AjioWalletTransform;
import com.ril.ajio.services.utils.JsonUtils;
import io.reactivex.Scheduler;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from M5
 */
public final class m5_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m5_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = "format(...)";
        boolean bl2 = false;
        Object object3 = null;
        int n3 = 1;
        Object object4 = this.b;
        Object object5 = "this$0";
        boolean bl3 = false;
        Object object6 = null;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (DataCallback)object;
                object4 = (hy3_0)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object5);
                ((hy3_0)object4).r.k(object);
                return Unit.a;
            }
            case 2: {
                object = (dl2_2)object;
                object4 = (oo2_1)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object5);
                String string2 = "PAYMENT_PayNowByUPI";
                Intrinsics.checkNotNullParameter(string2, "$requestID");
                Intrinsics.checkNotNullParameter(object, "response");
                object2 = (JsonObject)((dl2_2)object).b;
                object5 = ((dl2_2)object).a;
                bl3 = ((cl2_2)object5).d();
                if (bl3 && object2 != null) {
                    object = JsonUtils.toJson(object2);
                    object6 = PayNowResponse.class;
                    if ((object = (PayNowResponse)JsonUtils.fromJson((String)object, (Class)object6)) != null && (object6 = ((PayNowResponse)object).getError()) != null) {
                        object6 = ((Error)object6).getCode();
                    } else {
                        bl3 = false;
                        object6 = null;
                    }
                    if (object6 != null) {
                        object6 = ((PayNowResponse)object).getError();
                        if (object6 != null) {
                            object3 = ((Error)object6).getDescription();
                        }
                        if (object3 != null) {
                            if ((object = ((PayNowResponse)object).getError()) == null || (object = ((Error)object).getDescription()) == null) {
                                object = "";
                            }
                            object4.getClass();
                            int n7 = ((cl2_2)object5).d;
                            oo2_1.h(n7, string2, (String)object);
                        }
                    }
                    object = DataCallback.Companion.onSuccess(object2);
                } else {
                    object2 = ApiErrorRepo.INSTANCE;
                    object5 = "single page checkout";
                    object6 = "Forward";
                    boolean bl4 = true;
                    object3 = object;
                    object = ((ApiErrorRepo)object2).handleApiError((dl2_2)object, string2, bl4, (String)object5, (String)object6);
                }
                return object;
            }
            case 1: {
                int n8;
                object = (DataCallback)object;
                object4 = (az1_2)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object5);
                object5 = ((az1_2)object4).j;
                if (object5 != null) {
                    object5.stopLoader();
                }
                if ((n8 = nn_2.b((cp$a)(object5 = cp_1.Companion), (DataCallback)object)) != 0) {
                    if (object != null && (n8 = ((DataCallback)object).getStatus()) == 0) {
                        int n10;
                        if ((object = (Status)((DataCallback)object).getData()) != null && (n10 = ((Status)object).isSuccess()) == n3) {
                            object = ((az1_2)object4).x;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("referralCodeETV");
                                n10 = 0;
                                object = null;
                            }
                            if ((object = ((AppCompatEditText)object).getText()) != null) {
                                object = object.toString();
                            } else {
                                n10 = 0;
                                object = null;
                            }
                            bv1_0.a = object;
                            object = new Bundle();
                            object.putBoolean("ISFROMSOCIALLOGIN", false);
                            object.putBoolean("ISEXISTINGSOCIALLOGINUSER", n3 != 0);
                            object.putBoolean("ISMANUALSIGNUP", false);
                            object2 = "ISEXISTINGUSER";
                            object.putBoolean((String)object2, false);
                            boolean bl5 = ((az1_2)object4).i;
                            String string3 = "INPUT_MOBILE_EMAILID";
                            if (bl5) {
                                object2 = ((az1_2)object4).J;
                                if (object2 == null) {
                                    object2 = "emailId";
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                                } else {
                                    object3 = object2;
                                }
                                object2 = object3.getText().toString();
                                object.putString(string3, (String)object2);
                            } else {
                                object2 = ((az1_2)object4).K;
                                if (object2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mobileNumber");
                                    bl5 = false;
                                    object2 = null;
                                }
                                if ((object2 = object2.getText()) != null) {
                                    object3 = object2.toString();
                                }
                                object.putString(string3, (String)object3);
                            }
                            object3 = ((az1_2)object4).h;
                            object.putSerializable("ACCOUNTCHECK_RESPONSE", (Serializable)object3);
                            object2 = ((az1_2)object4).Ra().f();
                            object3 = "QUERYCUSTOMER_DATA";
                            object.putParcelable((String)object3, (Parcelable)object2);
                            boolean bl6 = ((az1_2)object4).i;
                            object.putBoolean("ISINPUTMOBILENUMBER", bl6);
                            da1_1.Companion.getClass();
                            object = da1$a_0.a((Bundle)object);
                            object2 = ((az1_2)object4).j;
                            if (object2 != null) {
                                object3 = "SignInOTPFragment";
                                object2.Z0((Fragment)object, (String)object3);
                            }
                        }
                    } else {
                        int n14 = ((DataCallback)object).getStatus();
                        if (n14 == n3) {
                            if ((object = ((DataCallback)object).getError()) != null) {
                                object3 = ((DataError)object).getErrorMessage();
                            }
                            if (object3 != null) {
                                object3 = StringCompanionObject.INSTANCE;
                                int n15 = R$string.acc_error_message;
                                object3 = hv3_0.K(n15);
                                object4 = ((DataError)object).getErrorMessage().getMessage();
                                object5 = new Object[n3];
                                object5[0] = object4;
                                object2 = xh2_0.a((Object[])object5, n3, (String)object3, (String)object2);
                                object = ((DataError)object).getErrorMessage().getMessage();
                                object3 = "getMessage(...)";
                                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                                hv3_0.o0(0, (String)object, (String)object2);
                            }
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object4 = (q5_0)object4;
        Intrinsics.checkNotNullParameter(object4, (String)object5);
        object5 = cp_1.Companion;
        int n16 = nn_2.b((cp$a)object5, (DataCallback)object);
        if (n16 != 0) {
            Object object7;
            object5 = ((q5_0)object4).m;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shimmerView");
                n16 = 0;
                object5 = null;
            }
            if ((object7 = ((q5_0)object4).l) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shimmerParent");
                n4 = 0;
                object7 = null;
            }
            hv3_0.t0((ShimmerFrameLayout)((Object)object5), object7);
            n16 = ((DataCallback)object).getStatus();
            if (n16 == 0) {
                if ((object = (AjioWalletTransform)((DataCallback)object).getData()) != null) {
                    boolean bl7;
                    object2 = ((q5_0)object4).e;
                    object5 = "ajioWalletVM";
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        boolean bl8 = false;
                        object2 = null;
                    }
                    ((wc_1)object2).j = object;
                    ((q5_0)object4).Ua();
                    object = ((q5_0)object4).e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        bl7 = false;
                        object = null;
                    }
                    object = ((wc_1)object).j;
                    ((q5_0)object4).Oa(n3, object);
                    bl7 = ((q5_0)object4).Sa();
                    if (bl7) {
                        object = ((q5_0)object4).e;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        } else {
                            object3 = object;
                        }
                        object = ((wc_1)object3).f;
                        object = ((wc_1)object3).b.c((zr1_1)object);
                        object2 = new hc_2((Hj)object3, 0);
                        o60_0 o60_02 = new ic_0(0, (Function1)object2);
                        object2 = new n53_0((q63_0)object, (bx0_2)((Object)o60_02));
                        object = qt2_2.c;
                        object = ((g53_0)object2).h((Scheduler)object);
                        object2 = ti_2.a();
                        object = ((g53_0)object).e((Scheduler)object2);
                        object2 = new jc_2(0);
                        o60_02 = new kc_0(object2, 0);
                        object2 = new lc_2(0);
                        object5 = new mc_0((lc_2)object2);
                        object = ((g53_0)object).f(o60_02, (o60_0)object5);
                        object2 = ((wc_1)object3).c;
                        ((t30_0)object2).b((yr0_2)object);
                    } else {
                        ((q5_0)object4).Pa();
                    }
                    ((q5_0)object4).Ta();
                }
            } else {
                int n17 = ((DataCallback)object).getStatus();
                if (n17 == n3 && (object = ((Fragment)object4).getContext()) != null) {
                    object5 = StringCompanionObject.INSTANCE;
                    n16 = R$string.acc_error_message;
                    object5 = hv3_0.K(n16);
                    n4 = R$string.something_wrong_msg;
                    object7 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object7;
                    object2 = xh2_0.a(objectArray, n3, (String)object5, (String)object2);
                    object4 = ((q5_0)object4).b;
                    if (object4 == null) {
                        object4 = "activityFragmentListener";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    } else {
                        object3 = object4;
                    }
                    int n18 = R$string.something_wrong_msg;
                    object4 = hv3_0.K(n18);
                    object3.showToastNotification((Context)object, (String)object4, n3, (String)object2);
                }
            }
        }
        return Unit.a;
    }
}

