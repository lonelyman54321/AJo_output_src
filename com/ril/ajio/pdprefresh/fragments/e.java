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
package com.ril.ajio.pdprefresh.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import com.ril.ajio.pdprefresh.fragments.d;
import com.ril.ajio.pdprefresh.fragments.e$a;
import com.ril.ajio.pdprefresh.fragments.e$b;
import com.ril.ajio.pdprefresh.fragments.e$c;
import com.ril.ajio.pdprefresh.fragments.e$d;
import com.ril.ajio.pdprefresh.fragments.e$e;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.ratings.RatingsModel;
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class e
extends j51_0
implements hd2_0,
yv0_1 {
    public static final e$a Companion;
    public final D f;
    public j3_0 g;
    public yi2_1 h;
    public lz1_1 i;

    static {
        e$a e$a;
        Companion = e$a = new Object();
    }

    public e() {
        Object object = Reflection.getOrCreateKotlinClass(yh0_0.class);
        e$c e$c = new e$c(this);
        e$d e$d = new e$d(this);
        e$e e$e = new e$e(this);
        this.f = object = LW0.a(this, (yn1_2)object, e$c, e$d, e$e);
    }

    public final void G3() {
    }

    public final yh0_0 Pa() {
        return (yh0_0)this.f.getValue();
    }

    public final void Qa() {
        Object object = LD2.a;
        object = this.h;
        Product product = null;
        object = object != null && (object = object.x5()) != null ? ((Product)object).getCode() : null;
        Object object2 = this.h;
        object2 = object2 != null && (object2 = object2.x5()) != null ? ((Product)object2).getName() : null;
        Object object3 = this.h;
        object3 = object3 != null && (object3 = object3.x5()) != null ? ((Product)object3).getBrickCode() : null;
        String string2 = "customer photos";
        String string3 = "clicked";
        LD2.c(string2, string3, (String)object, (String)object2, (String)object3);
        object = com.ril.ajio.pdprefresh.fragments.d.Companion;
        object2 = this.h;
        if (!(object2 != null && (object2 = object2.x5()) != null && (object2 = ((Product)object2).getFnlColorVariantData()) != null && (object2 = ((ProductFnlColorVariantData)object2).getColorGroup()) != null || (object2 = this.h) != null && (object2 = object2.x5()) != null && (object2 = ((Product)object2).getCode()) != null)) {
            object2 = "";
        }
        if ((object3 = this.h) != null) {
            product = object3.x5();
        }
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "optionCode");
        object = new Bundle();
        object.putCharSequence("OptionCode", (CharSequence)object2);
        object2 = new d();
        ((d)object2).g = product;
        ((Fragment)object2).setArguments((Bundle)object);
        object = this.requireActivity().getSupportFragmentManager();
        ((DialogFragment)object2).show((FragmentManager)object, "CustomerReviewPhotosBottomSheet");
    }

    public final void V2(Integer object) {
        int n3;
        Object object2;
        Object object3 = this.h;
        if (object3 != null) {
            object3 = object3.d7();
            object2 = Boolean.FALSE;
            n3 = Intrinsics.areEqual(object3, object2);
        } else {
            n3 = 0;
            object3 = null;
        }
        object2 = null;
        if (n3 != 0) {
            object3 = this.Pa().q;
            ((h83_0)object3).setValue(object);
            object = this.i;
            if (object == null) {
                object = "loginListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = object;
            }
            object = "source - reviews";
            n3 = 67;
            object2.z0(n3, (String)object);
        } else {
            this.Pa().f((Integer)object);
            object3 = LD2.a;
            object = String.valueOf(object);
            object3 = this.h;
            if (object3 != null && (object3 = object3.x5()) != null) {
                object3 = ((Product)object3).getCode();
            } else {
                n3 = 0;
                object3 = null;
            }
            Object object4 = this.h;
            object4 = object4 != null && (object4 = object4.x5()) != null ? ((Product)object4).getName() : null;
            Object object5 = this.h;
            if (object5 != null && (object5 = object5.x5()) != null) {
                object2 = ((Product)object5).getBrickCode();
            }
            object5 = "Mark as helpful";
            LD2.c((String)object5, (String)object, (String)object3, (String)object4, (String)object2);
        }
    }

    public final boolean d1(int n3, int n4) {
        int n7 = 67;
        if (n3 == n7 && n4 == (n3 = -1)) {
            Integer n8 = (Integer)this.Pa().q.getValue();
            if (n8 != null && (n4 = ((Number)n8).intValue()) != n3) {
                Object object = this.Pa().p;
                Boolean bl2 = Boolean.TRUE;
                ((h83_0)object).setValue(bl2);
                object = this.Pa();
                n8 = n4;
                ((yh0_0)object).f(n8);
            }
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public final void g1() {
        var1_1 = this;
        var3_3 = this.h;
        var4_4 = null;
        var5_5 = var3_3 != null && (var3_3 = var3_3.x5()) != null ? (var3_3 = var3_3.getBrandName()) : null;
        var3_3 = var1_1.h;
        var6_6 = var3_3 != null && (var3_3 = var3_3.x5()) != null ? (var3_3 = var3_3.getName()) : null;
        var3_3 = var1_1.h;
        if (var3_3 == null || (var3_3 = var3_3.E2()) == null) ** GOTO lbl-1000
        var7_7 = null;
        if ((var3_3 = (ProductImage)var3_3.get(0)) != null) {
            var7_7 = var3_3 = var3_3.getUrl();
        } else lbl-1000:
        // 2 sources

        {
            var7_7 = null;
        }
        var8_8 = Float.valueOf(0.0f);
        var3_3 = var1_1.h;
        var9_9 = var3_3 != null ? (var3_3 = var3_3.l6()) : null;
        var3_3 = var1_1.h;
        var10_10 = var3_3 != null && (var3_3 = var3_3.x5()) != null ? (var3_3 = var3_3.getBrickName()) : null;
        var3_3 = var1_1.h;
        var11_11 = var3_3 != null ? (var3_3 = var3_3.o5()) : null;
        var3_3 = var2_2;
        var4_4 = var5_5;
        var5_5 = var6_6;
        var6_6 = var7_7;
        var7_7 = var8_8;
        var8_8 = var9_9;
        var9_9 = var10_10;
        var1_1 = var2_2;
        var2_2 = var11_11;
        var3_3((String)var4_4, (String)var5_5, (String)var6_6, (Float)var7_7, (String)var8_8, "PDP", null, null, (String)var10_10, null, null, null, null, (String)var11_11, 7680, null);
        var1_1 = wD2$a.b(wd2_0.Companion, (RatingsModel)var1_1);
        var3_3 = this.getChildFragmentManager();
        var1_1.show((FragmentManager)var3_3, "RatingBottomSheetFragment");
    }

    public final void j3() {
        sh1_0.Companion.getClass();
        sh1_0 sh1_02 = new sh1_0();
        FragmentManager fragmentManager = this.getChildFragmentManager();
        sh1_02.show(fragmentManager, "RatingBottomSheetFragment");
    }

    public final void j6(Integer object, Boolean object2, ProductReview object3) {
        Object object4 = Boolean.TRUE;
        boolean bl2 = Intrinsics.areEqual(object2, object4);
        if (bl2) {
            this.Qa();
        } else {
            int n3;
            bl2 = false;
            object2 = null;
            if (object3 != null) {
                rz3_0.Companion.getClass();
                object4 = Rz3$a.f((ProductReview)object3);
            } else {
                object4 = null;
            }
            ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
            if (object4 != null) {
                arrayList.add((Boolean)object4);
            }
            object4 = LD2.a;
            object3 = object3 != null ? ((ProductReview)object3).getReviewId() : null;
            object3 = String.valueOf(object3);
            object4 = this.h;
            object4 = object4 != null && (object4 = object4.x5()) != null ? ((Product)object4).getCode() : null;
            Object object5 = this.h;
            object5 = object5 != null && (object5 = object5.x5()) != null ? ((Product)object5).getName() : null;
            Object object6 = this.h;
            if (object6 != null && (object6 = object6.x5()) != null) {
                object6 = ((Product)object6).getBrickCode();
            } else {
                n3 = 0;
                object6 = null;
            }
            String string2 = "review photos - viewed";
            LD2.c(string2, (String)object3, (String)object4, (String)object5, (String)object6);
            object3 = this.getActivity();
            if (object3 != null && (object3 = ((FragmentActivity)object3).getSupportFragmentManager()) != null) {
                object5 = EO2.Companion;
                if (object != null) {
                    int n4;
                    n3 = n4 = ((Integer)object).intValue();
                } else {
                    boolean bl3 = false;
                    object = null;
                    n3 = 0;
                    object6 = null;
                }
                object = this.h;
                Object object7 = object != null ? (object = object.l6()) : null;
                object = this.h;
                if (object != null) {
                    object2 = object.x5();
                }
                string2 = null;
                int n7 = 64;
                object = EO2$a.b((EO2$a)object5, arrayList, n3, 0, 0, (String)object7, (Product)object2, n7);
                object2 = "ReviewImageBottomSheet";
                ((DialogFragment)object).show((FragmentManager)object3, (String)object2);
            }
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            this.g = object2 = (j3_0)object;
        }
        if (bl2 = object instanceof lz1_1) {
            object = (lz1_1)object;
            this.i = object;
            return;
        }
        object = pn_2.b(object, " must implement LoginListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        Intrinsics.checkNotNullParameter(object, "inflater");
        object2 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(object2, "requireContext(...)");
        object = new ComposeView((Context)object2, null, 6, 0);
        object2 = new e$b(this);
        object3 = new u10(-1747724155, object2, true);
        ((ComposeView)((Object)object)).setContent((Function2)object3);
        return object;
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.Pa();
        object2 = object.g;
        object = object.f.get(0);
        ((h83_0)object2).setValue(object);
        object = this.Pa();
        object2 = Boolean.FALSE;
        object.h.setValue(object2);
        this.Pa().i.setValue(object2);
        this.Pa().e();
    }
}

