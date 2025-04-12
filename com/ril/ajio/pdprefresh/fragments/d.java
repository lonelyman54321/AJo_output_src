/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
package com.ril.ajio.pdprefresh.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.FragmentCustomerReviewPhotosBinding;
import com.ril.ajio.pdprefresh.fragments.d$a;
import com.ril.ajio.pdprefresh.fragments.d$b;
import com.ril.ajio.pdprefresh.fragments.d$c;
import com.ril.ajio.pdprefresh.fragments.d$d;
import com.ril.ajio.pdprefresh.fragments.d$e;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class d
extends i51_0 {
    public static final d$b Companion;
    public static final /* synthetic */ gn1_2[] j;
    public final hh3_2 f;
    public Product g;
    public String h;
    public final cc3_2 i;

    static {
        Object object = jz.a(d.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentCustomerReviewPhotosBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        j = gn1_2Array;
        Companion = object = new Object();
    }

    public d() {
        Object object = new dh0_1(this);
        this.f = object = yr1_2.b((Function0)object);
        this.h = "";
        this.i = object = z80_0.c(d$c.a, this);
    }

    public final void Pa(b30_0 b30_02, int n3) {
        Object object;
        int n4;
        Object object2 = null;
        int n7 = 483659242;
        Object object3 = b30_02;
        Object object4 = b30_02.g(n7);
        object3 = this.h;
        int n8 = 355087402;
        float f5 = 3.4372377E-26f;
        ((j30_0)object4).K(n8);
        if (object3 == null) {
            n4 = 0;
            object3 = null;
        } else {
            object = this.f;
            yh0_0 yh0_02 = (yh0_0)((hh3_2)object).getValue();
            ((yh0_0)((hh3_2)object).getValue()).getClass();
            object = "optionCode";
            Intrinsics.checkNotNullParameter(object3, (String)object);
            Pair pair = new Pair(object, object3);
            n4 = 20;
            object3 = n4;
            object = new Pair("pageSize", object3);
            object3 = Boolean.TRUE;
            Pair pair2 = new Pair("reviewsWithImages", object3);
            int n10 = 3;
            Pair[] pairArray = new Pair[n10];
            pairArray[0] = pair;
            int n14 = 1;
            pairArray[n14] = object;
            n8 = 2;
            f5 = 2.8E-45f;
            pairArray[n8] = pair2;
            object = fh1_2.h(pairArray);
            object3 = qt1.a(yh0_02.d((HashMap)object, (Boolean)object3), (b30_0)object4);
        }
        ((j30_0)object4).T(false);
        object2 = LP1$a.b;
        f5 = 300;
        object2 = androidx.compose.foundation.layout.j.d((LP1)object2, f5);
        long l2 = OX.f;
        object = new d$a((lt1)object3, this);
        n4 = -310742994;
        u10 u102 = v10.c(n4, (fx0_2)object, (b30_0)object4);
        n8 = 0;
        f5 = 0.0f;
        object = null;
        long l3 = 0L;
        int n15 = 1573254;
        int n16 = 58;
        object3 = object2;
        jg3_0.a((LP1)object2, null, l2, l3, null, 0.0f, u102, (b30_0)object4, n15, n16);
        object2 = ((j30_0)object4).X();
        if (object2 != null) {
            n4 = n3;
            ((CF2)object2).d = object4 = new eh0_1(this, n3);
        }
    }

    public final void Qa(lt1 lt12, int n3, b30_0 object, int n4) {
        Intrinsics.checkNotNullParameter(lt12, "review");
        int n7 = -234967296;
        object = object.g(n7);
        Object object2 = LP1$a.b;
        float f5 = 106;
        int n8 = 107;
        float f6 = n8;
        object2 = androidx.compose.foundation.layout.j.i((LP1)object2, f5, f6);
        int n10 = 8;
        f5 = n10;
        object2 = androidx.compose.foundation.layout.h.e((LP1)object2, f5);
        rp2_0 rp2_02 = SP2.a(f5);
        Object object3 = new d$e(lt12, n3, this);
        int n14 = -1031618691;
        u10 u102 = v10.c(n14, (fx0_2)object3, (b30_0)object);
        long l2 = 0L;
        int n15 = 1572870;
        int n16 = 60;
        object3 = object2;
        JL.a((LP1)object2, rp2_02, l2, null, 0.0f, u102, (b30_0)object, n15, n16);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new fh0_2(this, lt12, n3, n4);
        }
    }

    public final void Ra(b30_0 object, int n3) {
        block9: {
            Object object2;
            block8: {
                int n4;
                block7: {
                    object = object.g(1209380991);
                    n4 = n3 & 1;
                    if (n4 || !(n4 = (int)(((j30_0)object).h() ? 1 : 0))) break block7;
                    ((j30_0)object).D();
                    break block8;
                }
                object2 = LP1$a.b;
                float f5 = 106;
                float f6 = 107;
                object2 = androidx.compose.foundation.layout.j.i((LP1)object2, f5, f6);
                int n7 = 8;
                f5 = n7;
                object2 = androidx.compose.foundation.layout.h.e((LP1)object2, f5);
                Object object3 = SP2.a(f5);
                object2 = dz3_0.a(QV.a((LP1)object2, (i13)object3));
                object3 = Nc$a.a;
                f6 = 0.0f;
                object3 = HA.e((Nc)object3, false);
                int n8 = ((j30_0)object).P;
                Object object4 = ((j30_0)object).P();
                object2 = a30_0.c((b30_0)object, (LP1)object2);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = ((j30_0)object).a;
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block9;
                ((j30_0)object).A();
                bl2 = ((j30_0)object).O;
                if (bl2) {
                    ((j30_0)object).C((Function0)((Object)serializable));
                } else {
                    ((j30_0)object).n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object, object3, (Function2)((Object)serializable));
                object3 = N20$a.d;
                Ow3.a((b30_0)object, object4, (Function2)object3);
                object3 = N20$a.f;
                boolean bl3 = ((j30_0)object).O;
                if (bl3 || !(bl3 = Intrinsics.areEqual(object4 = ((j30_0)object).v(), serializable = Integer.valueOf(n8)))) {
                    rk_0.a(n8, (j30_0)object, n8, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object3);
                n4 = 1;
                ((j30_0)object).T(n4 != 0);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                ((CF2)object).d = object2 = new gh0_2(this, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        bh0_0 bh0_02 = new bh0_0((BottomSheetDialog)object, this);
        object.setOnShowListener((DialogInterface.OnShowListener)bh0_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        int n3;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = this.getArguments();
        String string2 = null;
        String string3 = "OptionCode";
        if (object != null) {
            object = object.getString(string3);
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object = this.getArguments();
            if (object != null) {
                string2 = object.getString(string3);
            }
            this.h = string2;
        }
        n3 = R$layout.fragment_customer_review_photos;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object = j;
        Object object3 = object[0];
        cc3_2 cc3_22 = this.i;
        object3 = cc3_22.b((gn1_2)object3, this);
        String string2 = "getValue(...)";
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        object3 = ((FragmentCustomerReviewPhotosBinding)object3).imCancelBtn;
        ch0_0 ch0_02 = new ch0_0(this);
        object3.setOnClickListener((View.OnClickListener)ch0_02);
        object = object[0];
        object = cc3_22.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = ((FragmentCustomerReviewPhotosBinding)object).bottomsheetCompose;
        object2 = new d$d(this);
        object3 = new u10(456705892, object2, true);
        ((ComposeView)((Object)object)).setContent((Function2)object3);
    }
}

