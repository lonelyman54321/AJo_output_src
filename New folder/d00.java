/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.databinding.FragmentLoginLayoutNewBinding;
import com.ril.ajio.login.activity.a;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class d00
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d00(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        e00$a e00$a;
        Object object2;
        Object object3;
        Object object4;
        int n3;
        block40: {
            int n4;
            block39: {
                n3 = 1;
                object4 = "this$0";
                object3 = this.b;
                Object object5 = null;
                n4 = this.a;
                switch (n4) {
                    default: {
                        boolean bl2;
                        Object object6 = object;
                        object6 = (DataCallback)object;
                        object3 = (ry1_1)object3;
                        Intrinsics.checkNotNullParameter(object3, (String)object4);
                        object4 = ((ry1_1)object3).g;
                        if (object4 != null) {
                            object4.stopLoader();
                        }
                        if (bl2 = nn_2.b((cp$a)(object4 = cp_1.Companion), (DataCallback)object6)) {
                            int n7;
                            hv3_0.S(((Fragment)object3).getActivity());
                            bl2 = false;
                            object4 = null;
                            if (object6 != null && (n7 = ((DataCallback)object6).getStatus()) == 0) {
                                ((ry1_1)object3).h = object6 = (AccountCheckResponse)((DataCallback)object6).getData();
                                if (object6 != null) {
                                    n4 = (int)(((AccountCheckResponse)object6).isSuccess() ? 1 : 0);
                                    Object object7 = "";
                                    if (n4 == 0) {
                                        object4 = ((ry1_1)object3).r;
                                        if (object4 != null && (object4 = ((FragmentLoginLayoutNewBinding)object4).mobileEt) != null && (object4 = ((AppCompatEditText)object4).getText()) != null && (object4 = object4.toString()) != null && (object4 = ((Object)StringsKt.m0((CharSequence)object4)).toString()) != null) {
                                            object7 = object4;
                                        }
                                        object4 = hv3_0.a;
                                        object4.getClass();
                                        bl2 = hv3_0.s();
                                        object6 = "NewUserFragment";
                                        if (bl2) {
                                            object4 = ((ry1_1)object3).g;
                                            if (object4 != null) {
                                                Az1$a az1$a = az1_2.Companion;
                                                Pair pair = new Pair("USER_INPUT_VALUE", object7);
                                                object3 = ((ry1_1)object3).h;
                                                String string2 = "param2";
                                                object7 = new Pair(string2, object3);
                                                int n8 = 2;
                                                object3 = new Pair[n8];
                                                object3[0] = pair;
                                                object3[n3] = object7;
                                                Bundle bundle = DE.b((Pair[])object3);
                                                az1$a.getClass();
                                                Intrinsics.checkNotNullParameter(bundle, "arguments");
                                                object3 = new az1_2();
                                                ((Fragment)object3).setArguments(bundle);
                                                object4.Z0((Fragment)object3, (String)object6);
                                            }
                                        } else {
                                            a a2 = ((ry1_1)object3).g;
                                            if (a2 != null) {
                                                object4 = lz1_2.Companion;
                                                object3 = ((ry1_1)object3).h;
                                                Intrinsics.checkNotNull(object3);
                                                object4.getClass();
                                                object4 = Lz1$a.a((String)object7, (AccountCheckResponse)object3);
                                                a2.Z0((Fragment)object4, (String)object6);
                                            }
                                        }
                                    } else {
                                        object5 = Ey1.a;
                                        object5 = ((ry1_1)object3).r;
                                        if (object5 != null && (object5 = ((FragmentLoginLayoutNewBinding)object5).mobileEt) != null && (object5 = ((AppCompatEditText)object5).getText()) != null) {
                                            object4 = object5.toString();
                                        }
                                        object5 = new QueryCustomer();
                                        if (object4 != null && (object4 = ((Object)StringsKt.m0((CharSequence)object4)).toString()) != null) {
                                            object7 = object4;
                                        }
                                        ((QueryCustomer)object5).setMobileNumber((String)object7);
                                        ((QueryCustomer)object5).setMobileNumberEnterered(n3 != 0);
                                        oa1_1 oa1_12 = ((ry1_1)object3).i;
                                        if (oa1_12 != null) {
                                            object4 = "<set-?>";
                                            Intrinsics.checkNotNullParameter(object5, (String)object4);
                                            oa1_12.C = object5;
                                        }
                                        if ((oa1_12 = ((ry1_1)object3).i) != null) {
                                            object4 = "login/signup screen";
                                            oa1_12.k((QueryCustomer)object5, (String)object4);
                                        }
                                    }
                                }
                            } else {
                                n7 = ((DataCallback)object6).getStatus();
                                if (n7 == n3) {
                                    Object object8;
                                    int n10;
                                    Object object9;
                                    Object object10 = ((ry1_1)object3).r;
                                    if (object10 != null && (object10 = ((FragmentLoginLayoutNewBinding)object10).loginContinueTv) != null) {
                                        object10.setClickable(n3 != 0);
                                    }
                                    if ((object9 = ((ry1_1)object3).r) != null && (object9 = ((FragmentLoginLayoutNewBinding)object9).loginContinueTv) != null) {
                                        object9.setVisibility(0);
                                    }
                                    object9 = ((ry1_1)object3).r;
                                    n7 = 1065353216;
                                    float f5 = 1.0f;
                                    if (object9 != null && (object9 = ((FragmentLoginLayoutNewBinding)object9).loginContinueTv) != null) {
                                        ((AjioTextView)object9).setAlpha(f5);
                                    }
                                    if ((object9 = ((ry1_1)object3).r) != null && (object9 = ((FragmentLoginLayoutNewBinding)object9).progressBarMobile) != null) {
                                        int n14 = 8;
                                        object9.setVisibility(n14);
                                    }
                                    if ((object9 = ((ry1_1)object3).r) != null && (object9 = ((FragmentLoginLayoutNewBinding)object9).mobileEt) != null) {
                                        object9.setAlpha(f5);
                                    }
                                    object9 = ((DataCallback)object6).getError();
                                    object6 = ((ry1_1)object3).m;
                                    object10 = "Login Form - ";
                                    Object object11 = "getMessage(...)";
                                    if (object9 != null && (n10 = TextUtils.isEmpty((CharSequence)(object8 = ((DataError)object9).getErrorMessage().getMessage()))) == 0) {
                                        object8 = ((DataError)object9).getErrorMessage().getMessage();
                                        Intrinsics.checkNotNullExpressionValue(object8, (String)object11);
                                        hv3_0.o0(0, (String)object8, null);
                                        object11 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                        String string3 = ((DataError)object9).getErrorMessage().getMessage();
                                        GTMEvents.gtmEventsToGa$default((GTMEvents)object11, "formErrorEvent", "Login Form", string3, "login/signup screen", null, null, null, 112, null);
                                        object4 = ((NewCustomEventsRevamp)object6).getEC_FORM();
                                        object9 = ((DataError)object9).getErrorMessage().getMessage();
                                        object8 = kp1_0.c((String)object10, (String)object9);
                                        object11 = "error";
                                        String string4 = "form_error";
                                        string3 = "login/signup screen";
                                        String string5 = "user account screen";
                                        String string6 = ((ry1_1)object3).n;
                                        String string7 = ((ry1_1)object3).o;
                                        int n15 = 1536;
                                        object10 = object4;
                                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, (String)object4, (String)object11, (String)object8, string4, string3, string5, string6, null, string7, false, null, n15, null);
                                    } else {
                                        if (object9 != null) {
                                            object8 = ((DataError)object9).getErrors();
                                        } else {
                                            n10 = 0;
                                            object8 = null;
                                        }
                                        if (object8 != null && (n10 = (object8 = ((DataError)object9).getErrors()).size()) > 0) {
                                            object8 = ((DataError$ErrorMessage)((DataError)object9).getErrors().get(0)).getMessage();
                                            Intrinsics.checkNotNullExpressionValue(object8, (String)object11);
                                            hv3_0.o0(0, (String)object8, null);
                                            object11 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                            String string8 = ((DataError$ErrorMessage)((DataError)object9).getErrors().get(0)).getMessage();
                                            GTMEvents.gtmEventsToGa$default((GTMEvents)object11, "formErrorEvent", "Login Form", string8, "login/signup screen", null, null, null, 112, null);
                                            object4 = ((NewCustomEventsRevamp)object6).getEC_FORM();
                                            object9 = ((DataError$ErrorMessage)((DataError)object9).getErrors().get(0)).getMessage();
                                            object8 = kp1_0.c((String)object10, (String)object9);
                                            object11 = "error";
                                            String string9 = "form_error";
                                            string8 = "login/signup screen";
                                            String string10 = "user account screen";
                                            String string11 = ((ry1_1)object3).n;
                                            String string12 = ((ry1_1)object3).o;
                                            int n16 = 1536;
                                            object10 = object4;
                                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, (String)object4, (String)object11, (String)object8, string9, string8, string10, string11, null, string12, false, null, n16, null);
                                        } else {
                                            n3 = R$string.something_wrong_msg;
                                            object9 = hv3_0.K(n3);
                                            hv3_0.o0(0, (String)object9, null);
                                        }
                                    }
                                }
                            }
                        }
                        return Unit.a;
                    }
                    case 0: 
                }
                object2 = object;
                object2 = (Integer)object;
                object3 = (e00)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                Intrinsics.checkNotNull(object2);
                int n17 = (Integer)object2;
                object4 = ((e00)object3).E(n17);
                if (object4 == null) break block39;
                n17 = (Integer)object2;
                object4 = ((e00)object3).E(n17);
                Intrinsics.checkNotNull(object4);
                object4 = ((RecentlyViewedProducts)object4).getProducts();
                if (object4 == null || (n17 = (int)(object4.isEmpty() ? 1 : 0)) != 0) break block39;
                n17 = (Integer)object2;
                object4 = ((e00)object3).E(n17);
                Intrinsics.checkNotNull(object4);
                object4 = ((RecentlyViewedProducts)object4).getProducts();
                Intrinsics.checkNotNull(object4);
                n17 = object4.size();
                n4 = 4;
                if (n17 >= n4) break block40;
            }
            object4 = ((e00)object3).f();
            n4 = (Integer)object2;
            ((oz_2)object4).c(n4);
        }
        if ((object4 = ((e00)object3).o) == (e00$a = e00$a.PDP)) {
            object2 = ((e00)object3).D;
            if (object2 != null) {
                object4 = new uz_1(object3, 0);
                object2.post((Runnable)object4);
            }
        } else {
            object4 = ((e00)object3).v;
            if (object4 != null) {
                n3 = (Integer)object2;
                ((RecyclerView$f)object4).notifyItemChanged(n3);
            }
        }
        return Unit.a;
    }
}

