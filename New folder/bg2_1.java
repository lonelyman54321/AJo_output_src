/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.D;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.permission.PermissionTrigger;
import com.ril.ajio.services.data.CustomerCare.InitiateChat;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.user.AffiliateData;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Timer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from bg2
 */
public final class bg2_1
extends ew_2
implements f82_0 {
    public static final bg2$a Companion;
    public final D b;
    public String c;
    public String d;
    public String e;
    public String f;
    public ReturnOrderItemDetails g;
    public fo3 h;
    public vh3_2 i;
    public OnFragmentInteractionListener j;
    public ps1_2 k;
    public final t30_0 l;
    public Timer m;
    public gE2 n;
    public String o;
    public AffiliateData p;
    public String q;
    public String r;
    public String s;
    public final D t;
    public boolean u;
    public InitiateChat v;
    public boolean w;
    public final lq2_1 x;
    public final I3 y;

    static {
        bg2$a bg2$a;
        Companion = bg2$a = new Object();
    }

    public bg2_1() {
        Object object = new bg2$f(this);
        Object object2 = et1_2.NONE;
        Object object3 = new bg2$g((bg2$f)object);
        object = yr1_2.a((et1_2)((Object)object2), (Function0)object3);
        object2 = Reflection.getOrCreateKotlinClass(qz1_2.class);
        super((rq1_2)object);
        Lambda lambda = new bg2$i((rq1_2)object);
        bg2$j bg2$j = new bg2$j(this, (rq1_2)object);
        this.b = object = LW0.a(this, (yn1_2)object2, (Function0)object3, lambda, bg2$j);
        this.l = object = new t30_0();
        this.r = object = "";
        this.s = object;
        object = Reflection.getOrCreateKotlinClass(lq2_0.class);
        super(this);
        super(this);
        super(this);
        this.t = object = LW0.a(this, (yn1_2)object, (Function0)object2, (Function0)object3, lambda);
        lq2_1.Companion.getClass();
        object = lq2$a_0.a(this);
        ((lq2_1)object).e();
        object3 = Iq2$b.b;
        object2 = new iq2_1[]{object3};
        ((lq2_1)object).g((iq2_1)object2);
        object2 = PermissionTrigger.RATINGS;
        ((lq2_1)object).f((PermissionTrigger)((Object)object2));
        this.x = object;
        object = new x3();
        super(this);
        object = this.registerForActivityResult((x3)object, (w3)object2);
        Intrinsics.checkNotNullExpressionValue(object, "registerForActivityResult(...)");
        this.y = object;
    }

    public final void Oa() {
        boolean bl2 = hv3_0.D();
        boolean bl3 = h40_0.l2();
        qz1_2 qz1_22 = this.Pa();
        Object object = qz1_22.c;
        Serializable serializable = Boolean.TRUE;
        ((h83_0)object).setValue(serializable);
        object = md3_0.c(qz1_22);
        serializable = new vz1_2(qz1_22, bl2, bl3, null);
        Ae3.d((i90_0)object, null, null, (Function2)((Object)serializable), 3);
    }

    public final qz1_2 Pa() {
        return (qz1_2)this.b.getValue();
    }

    public final void Q4(boolean bl2) {
        Object[] objectArray = null;
        String string2 = "format(...)";
        int n3 = 1;
        if (bl2) {
            Object object = StringCompanionObject.INSTANCE;
            int n4 = R$string.acc_alert_message;
            object = hv3_0.K(n4);
            String string3 = "Invoice Downloaded to the Downloads directory.";
            Object[] objectArray2 = new Object[n3];
            objectArray2[0] = string3;
            objectArray = Arrays.copyOf(objectArray2, n3);
            object = String.format((String)object, objectArray);
            Intrinsics.checkNotNullExpressionValue(object, string2);
            mq0_2.b(string3, (String)object);
        } else {
            Object object = StringCompanionObject.INSTANCE;
            int n7 = R$string.acc_alert_message;
            object = hv3_0.K(n7);
            String string4 = "Unable to download invoice.";
            Object[] objectArray3 = new Object[n3];
            objectArray3[0] = string4;
            objectArray = Arrays.copyOf(objectArray3, n3);
            object = String.format((String)object, objectArray);
            Intrinsics.checkNotNullExpressionValue(object, string2);
            mq0_2.b(string4, (String)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onAttach(Context object) {
        CharSequence charSequence;
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        try {
            object2 = this.getActivity();
            charSequence = "null cannot be cast to non-null type com.ril.ajio.customviews.widgets.OnFragmentInteractionListener";
            Intrinsics.checkNotNull(object2, (String)charSequence);
            this.j = object2 = (OnFragmentInteractionListener)object2;
        }
        catch (ClassCastException classCastException) {
            yn3_0.a.e(classCastException);
            object2 = this.getActivity();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object2);
            stringBuilder.append(" must implement OnFragmentInteractionListener");
            object2 = stringBuilder.toString();
            ClassCastException classCastException3 = new ClassCastException((String)object2);
            throw classCastException3;
        }
        try {
            object2 = this.getActivity();
            charSequence = "null cannot be cast to non-null type com.ril.ajio.view.MyAcountFragmentsListener";
            Intrinsics.checkNotNull(object2, (String)charSequence);
            this.k = object2 = (ps1_2)object2;
        }
        catch (ClassCastException classCastException) {
            yn3_0.a.e(classCastException);
            object2 = this.getActivity();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(object2);
            ((StringBuilder)charSequence).append(" must implement MyAcountFragmentsListener");
            object2 = ((StringBuilder)charSequence).toString();
            ClassCastException classCastException2 = new ClassCastException((String)object2);
            throw classCastException2;
        }
        boolean bl2 = object instanceof vh3_2;
        charSequence = null;
        if (bl2) {
            object2 = object;
            this.i = object2 = (vh3_2)object;
        } else {
            object2 = yn3_0.a;
            String string2 = "must implement TabListener";
            Object[] objectArray = new Object[]{};
            ((yn3$a)object2).d(string2, objectArray);
        }
        bl2 = object instanceof fo3;
        if (bl2) {
            this.h = object = (fo3)object;
            return;
        }
        object = yn3_0.a;
        object2 = "must implement ToolbarListener";
        charSequence = new Object[]{};
        ((yn3$a)object).d((String)object2, (Object[])charSequence);
    }

    public final void onCreate(Bundle object) {
        Object object2 = null;
        int n3 = 1;
        super.onCreate((Bundle)object);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object4 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(object4, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Object object5 = gE2.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object3, (E$b)object4, (Wd0)object, object5, string2);
        object3 = "<this>";
        object4 = sw0_0.a(object5, (String)object3, object5, string2, string2);
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object3 = object4.getQualifiedName();
        if (object3 != null) {
            boolean bl2;
            boolean bl3;
            object5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object3 = ((String)object5).concat((String)object3);
            this.n = object = (gE2)((pD3)object).a((yn1_2)object4, (String)object3);
            object = this.getArguments();
            if (object != null) {
                object3 = "order_detail_code";
                bl3 = object.containsKey((String)object3);
                if (bl3) {
                    this.e = object3 = object.getString((String)object3);
                    object3 = this.Pa().d;
                    object4 = this.e;
                    ((h83_0)object3).setValue(object4);
                }
                if (bl3 = object.containsKey((String)(object3 = "clicked_item_code"))) {
                    this.f = object3 = object.getString((String)object3);
                    object3 = this.Pa();
                    ((qz1_2)object3).g = object4 = this.f;
                }
                if (bl3 = object.containsKey((String)(object3 = "exchange_id"))) {
                    this.c = object3 = object.getString((String)object3);
                    object3 = this.Pa();
                    ((qz1_2)object3).h = object4 = this.c;
                }
                if (bl3 = object.containsKey((String)(object3 = "RETURN_ID"))) {
                    this.d = object3 = object.getString((String)object3);
                    object3 = this.Pa();
                    object4 = this.d;
                    object3 = ((qz1_2)object3).i;
                    ((h83_0)object3).setValue(object4);
                }
                if (bl3 = object.containsKey((String)(object3 = "is_from_customer_care_page"))) {
                    boolean bl4;
                    bl3 = object.getBoolean((String)object3);
                    if (bl3) {
                        object4 = this.h;
                        if (object4 != null) {
                            object4.hideToolbarLayout();
                        }
                        if ((object4 = this.i) != null) {
                            object4.showTabLayout(false);
                        }
                    }
                    object4 = this.Pa();
                    ((qz1_2)object4).e = bl4 = object.getBoolean((String)object3);
                }
                if (bl3 = object.containsKey((String)(object3 = "IS_RETURN_ID_REDIRECTION"))) {
                    object4 = this.Pa();
                    ((qz1_2)object4).f = bl2 = object.getBoolean((String)object3);
                }
            }
            object = this.Pa().L;
            object3 = new I22(this, n3);
            object4 = new bg2$b((Function1)object3);
            ((LiveData)object).e(this, (F62)object4);
            object = nu1_0.a(this);
            bl3 = false;
            object4 = null;
            object3 = new dg2_2(this, null);
            int n4 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)object3, n4);
            object = h40_0.a;
            bl2 = h40_0.U0();
            if (bl2) {
                v31.b();
            }
            object = nu1_0.a(this);
            object3 = new fg2_2(this, null);
            Ae3.d((i90_0)object, null, null, (Function2)object3, n4);
            object = nu1_0.a(this);
            object3 = new ig2_1(this, null);
            Ae3.d((i90_0)object, null, null, (Function2)object3, n4);
            bl2 = h40_0.U0();
            if (bl2) {
                object = this.Pa().s0;
                object3 = new yf2_0(this);
                object5 = new bg2$b((Function1)object3);
                ((LiveData)object).e(this, (F62)object5);
                object = this.Pa().u0;
                object3 = new z81_0(this, n3);
                object5 = new bg2$b((Function1)object3);
                ((LiveData)object).e(this, (F62)object5);
            }
            if ((object = this.n) != null && (object = ((gE2)object).a) != null) {
                object3 = new zf2_1(this, 0);
                object2 = new bg2$b((Function1)object3);
                ((R53)object).e(this, (F62)object2);
            }
            if ((object = this.n) != null && (object = ((gE2)object).b) != null) {
                object2 = new b91_0(this, n3);
                bg2$b bg2$b = new bg2$b((Function1)object2);
                ((R53)object).e(this, bg2$b);
            }
            object = nu1_0.a(this);
            object2 = new hg2_2(this, null);
            ((iu1_0)object).c((Function2)object2);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.order_summary_compose_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroyView() {
        Timer timer = this.m;
        if (timer != null) {
            timer.cancel();
        }
        super.onDestroyView();
    }

    public final void onResume() {
        super.onResume();
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushOpenScreenEvent("order item details screen");
        this.Oa();
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        object2 = this.k;
        if (object2 != null) {
            object2.hideToolbarLayout();
        }
        if ((object2 = this.getActivity()) != null && (object2 = object2.getWindow()) != null) {
            int n4 = 16;
            object2.setSoftInputMode(n4);
        }
        if ((object = (ComposeView)object.findViewById(n3 = R$id.order_summary_compose)) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentView");
            object = null;
        }
        object2 = new jg2_2(this);
        u10 u102 = new u10(-1008837320, object2, true);
        ((ComposeView)((Object)object)).setContent(u102);
    }
}

