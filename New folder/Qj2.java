/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;
import com.ril.ajio.plp.PLPExtras;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class Qj2
extends zj0_0 {
    public Qj2(Activity activity) {
        super(activity);
    }

    public final void b(int n3, Bundle bundle, Bundle bundle2, String string2, String string3, String string4, String string5) {
        Object object;
        Object object2;
        boolean bl2;
        Qj2 qj2 = this;
        Object object3 = string5;
        Object object4 = this.b;
        ((jo_2)object4).u();
        ((jo_2)object4).w();
        ((jo_2)object4).v();
        object4 = null;
        boolean bl3 = true;
        boolean bl4 = string5 != null && (bl2 = kotlin.text.b.h(string5, (String)(object2 = "video"), false)) == bl3;
        object4 = object;
        object2 = n3;
        int n4 = 1610350532;
        Object object5 = null;
        Boolean bl5 = null;
        int n7 = 3;
        Object object6 = string3;
        object3 = string5;
        PLPExtras pLPExtras = object;
        object = string4;
        ((PLPExtras)object4)((Integer)object2, string3, null, string5, string4, string2, null, null, null, null, null, null, null, null, null, null, bundle, null, null, null, null, null, null, false, false, bl4, null, bundle2, null, null, n4, n7);
        object4 = string4 == null ? ld3_2.STORE_AJIO.getStoreId() : string4;
        Intrinsics.checkNotNullParameter(object4, "<set-?>");
        object2 = pLPExtras;
        pLPExtras.H = object4;
        object4 = qj2.a;
        boolean bl6 = object4 instanceof AjioHomeActivity;
        if (bl6) {
            object6 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
            Intrinsics.checkNotNull(object4, (String)object6);
            object5 = object4;
            object5 = (AjioHomeActivity)object4;
            ((AjioHomeActivity)object5).Q2().a.k(pLPExtras);
            object3 = pLPExtras.e;
            if (object3 == null) {
                object3 = "";
            }
            object2 = ((PLPExtras)object2).H;
            object = at2_1.b((String)object3, (String)object2);
            Intrinsics.checkNotNull(object4, (String)object6);
            object3 = ((AjioHomeActivity)object5).T0;
            bl5 = Boolean.FALSE;
            bl3 = true;
            ((AjioHomeActivity)object5).Q1((Fragment)object3, (Fragment)object, bl3, string2, bl5);
        } else {
            bl6 = object4 instanceof OrderConfirmationActivity;
            if (bl6) {
                Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type com.ril.ajio.payment.activity.OrderConfirmationActivity");
                object6 = object4;
                object6 = (OrderConfirmationActivity)object4;
                object5 = new Bundle();
                boolean bl7 = true;
                object5.putBoolean("GOTO_PLP_FROM_THANKYOU_AGE", bl7);
                object5.putParcelable("PLP_EXTRAS", (Parcelable)pLPExtras);
                object3 = AjioHomeActivity.class;
                object2 = new Intent((Context)object6, (Class)object3);
                object2.putExtras((Bundle)object5);
                ((Activity)object4).startActivity((Intent)object2);
            }
        }
    }

    public final void c(String string2) {
        jo_2 jo_22 = this.b;
        jo_22.u();
        jo_22.w();
        jo_22.v();
        jo_22 = this.a;
        boolean bl2 = jo_22 instanceof AjioHomeActivity;
        if (bl2) {
            Object object;
            Object object2 = object;
            int n3 = -524321;
            q22_0 q22_02 = null;
            boolean bl3 = false;
            String string3 = "seoDynamicCategoryPage";
            int n4 = 3;
            Object object3 = string2;
            object = new PLPExtras(null, null, null, null, null, string2, null, null, null, null, null, null, null, null, null, null, null, string3, null, null, null, null, null, false, false, false, null, null, null, null, n3, n4);
            object2 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
            Intrinsics.checkNotNull(jo_22, (String)object2);
            Object object4 = jo_22;
            object4 = (AjioHomeActivity)((Object)jo_22);
            ((AjioHomeActivity)object4).Q2().a.k(object);
            Object object5 = ((PLPExtras)object).e;
            if (object5 == null) {
                object5 = "";
            }
            object = ((PLPExtras)object).H;
            q22_02 = at2_1.b((String)object5, (String)object);
            Intrinsics.checkNotNull(jo_22, (String)object2);
            object5 = ((AjioHomeActivity)object4).T0;
            object3 = Boolean.FALSE;
            bl3 = true;
            ((AjioHomeActivity)object4).Q1((Fragment)object5, q22_02, bl3, string2, (Boolean)object3);
        }
    }

    public final void d(int n3, Bundle bundle, Bundle bundle2, String string2, String string3, String string4, String string5) {
        String string6;
        String string7 = string2;
        String string8 = string4;
        Intrinsics.checkNotNullParameter(string2, "linkURL");
        Intrinsics.checkNotNullParameter(string4, "pattern");
        String string9 = bj0_1.c(bj0_1.e(string2), string4);
        boolean bl2 = false;
        Object object = null;
        StringsKt.F(string2, "isFromCoupon=true", false);
        String string10 = "brandPageCode";
        int n4 = StringsKt.F(string2, string10, false);
        String string11 = "?";
        String string12 = "";
        string10 = n4 != 0 && (n4 = StringsKt.F(string2, string11, false)) != 0 ? bj0_1.a(string10, string2) : string12;
        bl2 = StringsKt.F(string7, string11, false);
        if (bl2) {
            object = "query";
            string6 = string7 = bj0_1.a((String)object, string7);
        } else {
            string6 = string12;
        }
        string7 = "w";
        int n7 = Intrinsics.areEqual(string8, string7);
        if (n7 != 0) {
            String string13 = "83";
            Qj2 qj2 = this;
            this.b(n3, bundle, bundle2, string13, string6, string3, string5);
        } else {
            string7 = "s";
            n7 = Intrinsics.areEqual(string8, string7);
            if (n7 != 0) {
                string7 = ((Object)StringsKt.m0(string10)).toString();
                n7 = string7.length();
                if (n7 > 0) {
                    string7 = new Bundle();
                    string12 = bundle2 != null ? bundle2 : string7;
                    string7 = "brand_id";
                    string12.putString(string7, string10);
                    String string14 = "";
                    string9 = "83";
                    object = this;
                    n4 = n3;
                    string11 = bundle;
                    this.b(n3, bundle, (Bundle)string12, string9, string14, string3, string5);
                } else {
                    n7 = string6.length();
                    string8 = "&curated=true&curatedid=";
                    if (n7 == 0) {
                        String string15 = kp1_0.c(string8, string9);
                        string9 = "83";
                        object = this;
                        n4 = n3;
                        string11 = bundle;
                        string12 = bundle2;
                        this.b(n3, bundle, bundle2, string9, string15, string3, string5);
                    } else {
                        String string16 = n1.a(string6, string8, string9);
                        string9 = "83";
                        object = this;
                        n4 = n3;
                        string11 = bundle;
                        string12 = bundle2;
                        this.b(n3, bundle, bundle2, string9, string16, string3, string5);
                    }
                }
            } else {
                object = this;
                n4 = n3;
                string11 = bundle;
                string12 = bundle2;
                String string17 = string6;
                this.b(n3, bundle, bundle2, string9, string6, string3, string5);
            }
        }
    }
}

