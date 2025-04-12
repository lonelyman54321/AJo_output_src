/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.login.activity.a;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Wz1
 */
public final class wz1_1
implements F62 {
    public final /* synthetic */ da1_1 a;

    public /* synthetic */ wz1_1(da1_1 da1_12) {
        this.a = da1_12;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (bl2) {
            object3 = ((da1_1)object2).A;
            if (object3 != null) {
                object3.stopLoader();
            }
            if (object != null && !(bl2 = ((DataCallback)object).getStatus())) {
                boolean bl3;
                ((da1_1)object2).n = object = (AccountCheckResponse)((DataCallback)object).getData();
                if (object != null && (bl3 = ((AccountCheckResponse)object).isSuccess()) == (bl2 = true)) {
                    bv1_0.g = bl2;
                    object = ((da1_1)object2).n;
                    String string2 = null;
                    if (object != null && (bl3 = (boolean)((AccountCheckResponse)object).isSocialLogin()) == bl2) {
                        object = ((da1_1)object2).t;
                        if (object != null && !(bl3 = (boolean)TextUtils.isEmpty((CharSequence)object))) {
                            object = ((da1_1)object2).A;
                            if (object != null) {
                                object.startLoader();
                            }
                            object = new QueryCustomer();
                            boolean bl4 = ((da1_1)object2).z;
                            if (bl4) {
                                string2 = ((da1_1)object2).t;
                                ((QueryCustomer)object).setMobileNumber(string2);
                                ((QueryCustomer)object).setMobileNumberEnterered(bl2);
                            } else {
                                object3 = ((da1_1)object2).t;
                                if (object3 != null && !(bl2 = TextUtils.isEmpty((CharSequence)object3))) {
                                    object3 = ((da1_1)object2).t;
                                    if (object3 != null) {
                                        object3 = ((String)object3).toLowerCase();
                                        String string3 = "toLowerCase(...)";
                                        Intrinsics.checkNotNullExpressionValue(object3, string3);
                                    } else {
                                        bl2 = false;
                                        object3 = null;
                                    }
                                    ((QueryCustomer)object).setEmail((String)object3);
                                    ((QueryCustomer)object).setMobileNumberEnterered(false);
                                }
                            }
                            object2 = ((da1_1)object2).p;
                            Intrinsics.checkNotNull(object2);
                            object3 = "social login - otp screen";
                            ((oa1_1)object2).k((QueryCustomer)object, (String)object3);
                        }
                    } else {
                        a a2;
                        AccountCheckResponse accountCheckResponse;
                        object = ((da1_1)object2).s;
                        if (object != null && (accountCheckResponse = ((da1_1)object2).n) != null && (a2 = ((da1_1)object2).A) != null) {
                            pA1$a pA1$a = pA1.Companion;
                            boolean bl5 = ((da1_1)object2).y;
                            object = ((Object)StringsKt.m0((CharSequence)object)).toString();
                            pA1$a.getClass();
                            object = pA1$a.a(accountCheckResponse, bl2, bl5, (String)object, false);
                            object2 = "LoginPasswordFragment";
                            a2.Z0((Fragment)object, (String)object2);
                        }
                    }
                }
            }
        }
    }
}

