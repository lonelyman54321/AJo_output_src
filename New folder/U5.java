/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.ajiocash.BankTransferRequestBody;
import com.ril.ajio.services.data.ajiocash.Customer;
import com.ril.ajio.services.data.ajiocash.Tenant;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class U5
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public static final U5$a Companion;
    public G5 a;
    public AjioTextView b;
    public AjioTextView c;
    public ShimmerFrameLayout d;
    public String e;
    public ConstraintLayout f;

    static {
        U5$a u5$a;
        Companion = u5$a = new Object();
    }

    public final void Oa(String object) {
        Object object2 = null;
        Object object3 = "prod";
        Object object4 = "qa";
        if (object3 != object4 && object3 != (object4 = "qaregression")) {
            object4 = h40_0.a;
            object4 = z40_0.Companion;
            object4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object4).a;
            object3 = "ajio_cash_bank_transfer_access_token";
            int n3 = ((String)(object4 = ((ao0_0)object4).b((String)object3))).length();
            if (n3 == 0) {
                object4 = "acc_tkn_f5701c03-ac5a-11e9-ba48-a32d700347d1";
            }
        } else {
            object4 = "AJIO_ACCESS_123";
        }
        object3 = UserInformation.getInstance(this.getContext());
        Object object5 = ((UserInformation)object3).getCustomerUUID();
        object3 = ((UserInformation)object3).getUserEmailId();
        Object object6 = new Customer((String)object5, (String)object3);
        Object object7 = "AJIO";
        object5 = new Tenant((String)object7);
        object3 = new BankTransferRequestBody((String)object4, (Customer)object6, (String)object, (Tenant)object5);
        object = this.a;
        if (object != null) {
            object4 = "AJIO_STATUS";
            object6 = "screenName";
            Intrinsics.checkNotNullParameter(object4, (String)object6);
            object5 = "bankTransferStatus";
            Intrinsics.checkNotNullParameter(object3, (String)object5);
            object7 = g6.a;
            Intrinsics.checkNotNullParameter(object4, (String)object6);
            Intrinsics.checkNotNullParameter(object3, (String)object5);
            object4 = UrlHelper.Companion.getInstance();
            object6 = g6.b;
            object5 = ((UserInformation)object6).getUserId();
            int n4 = 1;
            object7 = new Object[n4];
            object7[0] = object5;
            String string2 = "bank_transfer_status";
            object4 = ((UrlHelper)object4).getApiUrl("ajio_cash", string2, (Object[])object7);
            Intrinsics.checkNotNullExpressionValue(object6, "userInformation");
            object6 = ServiceUtil.getToken((UserInformation)object6);
            object6 = kp1_0.c("Bearer ", (String)object6);
            object5 = "ajioCashWalletToBankTransferStatus";
            object7 = g6.a;
            object4 = object7.getAjioCashTransferStatus((String)object4, (String)object6, (String)object5, (BankTransferRequestBody)object3);
            object3 = qt2_2.c;
            object4 = ((g53_0)object4).h((Scheduler)object3);
            object3 = ti_2.a();
            object4 = ((g53_0)object4).e((Scheduler)object3);
            object3 = new c6_0();
            object6 = new d6((Function1)object3);
            object3 = new s53_0((q63_0)object4, (bx0_2)object6);
            object4 = new ty1_1();
            object6 = new u53_0((q63_0)object3, (bx0_2)object4);
            Intrinsics.checkNotNullExpressionValue(object6, "onErrorReturn(...)");
            object4 = new C5(object, 0);
            object3 = new D5((C5)object4);
            object4 = new E5(object, 0);
            object2 = new F5(object4);
            object2 = ((g53_0)object6).f((o60_0)object3, (o60_0)object2);
            object = ((G5)object).a;
            ((t30_0)object).b((yr0_2)object2);
        }
    }

    public final void Pa() {
        t5_0 t5_02;
        int n3;
        Object object = this.b;
        if (object != null) {
            n3 = 8;
            object.setVisibility(n3);
        }
        if ((object = this.f) != null) {
            n3 = 0;
            t5_02 = null;
            object.setVisibility(0);
        }
        if ((object = this.c) != null) {
            t5_02 = new t5_0(this);
            object.setOnClickListener(t5_02);
        }
    }

    public final void onClick(View view) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(view, string2);
        int n3 = view.getId();
        int n4 = R$id.od_cancel_imv_close;
        if (n3 == n4) {
            this.dismissAllowingStateLoss();
        }
    }

    public final void onCreate(Bundle object) {
        Object object2;
        super.onCreate((Bundle)object);
        int n3 = R$style.PinCodeBottomSheetFragment;
        this.setStyle(0, n3);
        object = this.getArguments();
        if (object != null) {
            object2 = "TRANSACTION_ID";
            object = object.getString((String)object2);
        } else {
            object = null;
        }
        this.e = object;
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Class<G5> clazz = G5.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object, clazz, string2);
        object2 = ef0_0.a(clazz, string2, string2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.a = object = (G5)((pD3)object).a((yn1_2)object2, (String)object3);
            object = ye3_0.a;
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object2 = ye3_0.a;
            ((GTMEvents)object).pushOpenScreenEvent((String)object2);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_ajio_cash_imps_status;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.od_cancel_imv_close;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, "findViewById(...)");
        object2 = (ImageView)object2;
        int n4 = R$id.imps_transfer_status_message;
        this.b = object3 = (AjioTextView)object.findViewById(n4);
        n4 = R$id.spShimmerView;
        object3 = (ShimmerFrameLayout)object.findViewById(n4);
        this.d = object3;
        n4 = R$id.error_layout;
        object = (ConstraintLayout)object.findViewById(n4);
        this.f = object;
        if (object != null) {
            n4 = R$id.cta_button;
            object = (AjioTextView)object.findViewById(n4);
        } else {
            object = null;
        }
        this.c = object;
        object2.setOnClickListener((View.OnClickListener)this);
        hv3_0.p0(this.d);
        object = this.e;
        this.Oa((String)object);
        object = this.a;
        if (object != null && (object = ((G5)object).b) != null) {
            object2 = this.getViewLifecycleOwner();
            object3 = new R5(this, 0);
            U5$b u5$b = new U5$b((R5)object3);
            ((LiveData)object).e((mu1_1)object2, u5$b);
        }
    }
}

