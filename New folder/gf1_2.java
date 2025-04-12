/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import com.ril.ajio.myaccount.order.imps.a;
import com.ril.ajio.myaccount.order.imps.d;
import com.ril.ajio.myaccount.order.imps.e;
import com.ril.ajio.services.data.Order.ImpsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from gf1
 */
public final class gf1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gf1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        Object object3 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object4 = object;
                object4 = (Throwable)object;
                object2 = (hy3_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = ((hy3_0)object2).p;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object4);
                object2 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object4, "request_otp_access_profile", false, null, null, 28, null);
                ((LiveData)object).k(object2);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object2 = (d)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n4 != 0) {
            object3 = ((d)object2).y;
            if (object3 != null) {
                ((AjioLoaderView)((Object)object3)).stopLoader();
            }
            if (object != null) {
                n4 = ((DataCallback)object).getStatus();
                n3 = 1;
                if (n4 == 0) {
                    if ((object = (ImpsData)((DataCallback)object).getData()) != null) {
                        object3 = ((ImpsData)object).getStatusCode();
                        String string2 = "200";
                        Object var5_6 = null;
                        n4 = (int)(kotlin.text.b.i((String)object3, string2, false) ? 1 : 0);
                        if (n4 != 0) {
                            int n7;
                            object = ((d)object2).j;
                            if (object != null && (n7 = object.n1()) == n3) {
                                com.ril.ajio.myaccount.order.imps.a.Companion.getClass();
                                object = new Bundle();
                                object3 = new a();
                                ((Fragment)object3).setArguments((Bundle)object);
                                object = ((d)object2).j;
                                if (object != null) {
                                    object2 = com.ril.ajio.myaccount.order.imps.a.j;
                                    object.m1((Fragment)object3, (String)object2, false);
                                }
                            } else {
                                n7 = ((d)object2).O;
                                if (n7) {
                                    object = ((Fragment)object2).requireActivity();
                                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.imps.ReturnImpsActivity");
                                    object = (ReturnImpsActivity)object;
                                    object.getClass();
                                    object2 = new Intent();
                                    n4 = -1;
                                    object.setResult(n4, (Intent)object2);
                                    object.finish();
                                } else {
                                    n7 = (int)(((d)object2).P ? 1 : 0);
                                    if (n7) {
                                        object = e.Companion;
                                        n4 = R$string.bank_details_received;
                                        object3 = ((Fragment)object2).getString(n4);
                                        Intrinsics.checkNotNullExpressionValue(object3, "getString(...)");
                                        object.getClass();
                                        Intrinsics.checkNotNullParameter(object3, "successMessage");
                                        object = new e();
                                        string2 = new Bundle();
                                        String string3 = "SUCCESS_MESSAGE";
                                        string2.putString(string3, (String)object3);
                                        object3 = "IS_RCS_BANK_ACCOUNT_DETAILS";
                                        string2.putBoolean((String)object3, n3 != 0);
                                        ((Fragment)object).setArguments((Bundle)string2);
                                        object2 = ((d)object2).j;
                                        if (object2 != null) {
                                            object3 = e.m;
                                            object2.m1((Fragment)object, (String)object3, false);
                                        }
                                    } else {
                                        object = new e();
                                        object2 = ((d)object2).j;
                                        if (object2 != null) {
                                            e.Companion.getClass();
                                            object3 = e.m;
                                            object2.m1((Fragment)object, (String)object3, false);
                                        }
                                    }
                                }
                            }
                        } else {
                            object3 = ((ImpsData)object).getMessage();
                            n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                            if (n4 == 0) {
                                object = ((ImpsData)object).getMessage();
                                ((d)object2).Ta((String)object);
                            } else {
                                int n8 = R$string.imps_tranc_failed;
                                object = ((Fragment)object2).getString(n8);
                                ((d)object2).Ta((String)object);
                            }
                        }
                    }
                } else {
                    int n10 = ((DataCallback)object).getStatus();
                    if (n10 == n3) {
                        n10 = R$string.imps_tranc_failed;
                        object = ((Fragment)object2).getString(n10);
                        ((d)object2).Ta((String)object);
                    }
                }
            }
        }
        return Unit.a;
    }
}

