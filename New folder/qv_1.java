/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.l;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qv
 */
public final class qv_1
extends rm3_0
implements o62_0 {
    public static final qv$a Companion;
    public ConstraintLayout b;
    public RecyclerView c;
    public AjioAspectRatioImageView d;
    public zi2_1 e;
    public NewProductDetailsFragment f;
    public AjioImageView g;
    public String h;

    static {
        qv$a qv$a;
        Companion = qv$a = new Object();
    }

    public qv_1() {
        String string2;
        this.h = string2 = ld3_2.STORE_AJIO.getStoreId();
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = this.getTargetFragment();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.pdprefresh.callbacks.PDPInfoSetter");
        object = (zi2_1)object;
        this.e = object;
        object = this.getTargetFragment();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment");
        object = (NewProductDetailsFragment)object;
        this.f = object;
    }

    public final void onCreate(Bundle object) {
        boolean bl2;
        String string2;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 >= n4) {
                mv_1.a(object);
            } else {
                string2 = "PDP_BANK_OFFER";
                object.getParcelableArrayList(string2);
            }
            string2 = ld3_2.STORE_AJIO.getStoreId();
            String string3 = "PDP_PRODUCT_STORE_TYPE";
            object = object.getString(string3, string2);
            this.h = object;
        }
        object = this.h;
        Intrinsics.checkNotNullParameter(object, "storeId");
        string2 = ld3_2.STORE_AJIOGRAM.getStoreId();
        this.a = bl2 = Intrinsics.areEqual(object, string2);
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        nv_0 nv_02 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)nv_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.pdp_bank_offers_popup_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onStart() {
        block14: {
            block15: {
                super.onStart();
                var1_1 = this.c;
                var2_2 = null;
                var1_1 = var1_1 != null ? var1_1.getAdapter() : null;
                if (var1_1 != null) break block14;
                var1_1 = this.getTargetFragment();
                Intrinsics.checkNotNull(var1_1, "null cannot be cast to non-null type com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment");
                var1_1 = (NewProductDetailsFragment)var1_1;
                var3_3 = this.f;
                var4_4 = "pdpInfoProvider";
                if (var3_3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var4_4);
                    var5_5 = 0;
                    var3_3 = null;
                }
                if ((var3_3 = var3_3.l1) != null) {
                    var3_3 = var3_3.getAllBankOffer();
                } else {
                    var5_5 = 0;
                    var3_3 = null;
                }
                if (var3_3 == null || (var6_6 = var3_3.isEmpty())) break block15;
                var8_8 /* !! */  = this.requireContext();
                var9_9 = true;
                var7_7 = new LinearLayoutManager(var8_8 /* !! */ , (int)var9_9, false);
                var8_8 /* !! */  = this.c;
                if (var8_8 /* !! */  != null) {
                    var8_8 /* !! */ .setLayoutManager((RecyclerView$o)var7_7);
                }
                var8_8 /* !! */  = h40_0.a;
                var10_10 = h40_0.x1();
                var11_11 = "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Offers.BankOfferItem>";
                if (!var10_10) ** GOTO lbl-1000
                var8_8 /* !! */  = this.f;
                if (var8_8 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var4_4);
                    var10_10 = false;
                    var8_8 /* !! */  = null;
                }
                if (!(var10_10 = var8_8 /* !! */ .f1)) {
                    Intrinsics.checkNotNull(var3_3, var11_11);
                    var8_8 /* !! */  = this.f;
                    if (var8_8 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var4_4);
                    } else {
                        var2_2 = var8_8 /* !! */ ;
                    }
                    var7_7 = new lv_1((ArrayList)var3_3, (NewProductDetailsFragment)var1_1, (NewProductDetailsFragment)var2_2);
                    var1_1 = this.c;
                    if (var1_1 != null) {
                        var1_1.setAdapter((RecyclerView$f)var7_7);
                    }
                } else lbl-1000:
                // 2 sources

                {
                    Intrinsics.checkNotNull(var3_3, var11_11);
                    var1_1 = new mh2_1((ArrayList)var3_3, var9_9);
                    var2_2 = this.c;
                    if (var2_2 != null) {
                        var2_2.setAdapter((RecyclerView$f)var1_1);
                    }
                    var2_2 = this.requireContext();
                    var5_5 = var7_7.getOrientation();
                    var1_1 = new l((Context)var2_2, var5_5);
                    var1_1 = this.c;
                    if (var1_1 != null) {
                        var2_2 = new qv$b();
                        var1_1.addItemDecoration((RecyclerView$n)var2_2);
                    }
                }
                if ((var1_1 = this.c) != null) {
                    var1_1.setVisibility(0);
                }
            }
            if ((var1_1 = this.d) != null) {
                var2_2 = new pv_0(this, 0);
                var1_1.setOnClickListener((View.OnClickListener)var2_2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onViewCreated(View var1_1, Bundle var2_2) {
        Intrinsics.checkNotNullParameter(var1_1 /* !! */ , "itemView");
        var3_3 = R$id.parent_layout;
        var4_4 /* !! */  = (ConstraintLayout)var1_1 /* !! */ .findViewById(var3_3);
        this.b = var4_4 /* !! */ ;
        var3_3 = R$id.bank_offers_rv;
        var4_4 /* !! */  = (RecyclerView)var1_1 /* !! */ .findViewById(var3_3);
        this.c = var4_4 /* !! */ ;
        var3_3 = R$id.close;
        var4_4 /* !! */  = (AjioAspectRatioImageView)var1_1 /* !! */ .findViewById(var3_3);
        this.d = var4_4 /* !! */ ;
        var3_3 = R$id.disc_img;
        var1_1 /* !! */  = (AjioImageView)var1_1 /* !! */ .findViewById(var3_3);
        this.g = var1_1 /* !! */ ;
        var1_1 /* !! */  = h40_0.a;
        var5_5 = h40_0.x1();
        if (!var5_5) ** GOTO lbl-1000
        var1_1 /* !! */  = this.f;
        if (var1_1 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdpInfoProvider");
            var5_5 = false;
            var1_1 /* !! */  = null;
        }
        if (!(var5_5 = var1_1 /* !! */ .f1)) {
            var1_1 /* !! */  = this.g;
            if (var1_1 /* !! */  != null) {
                var1_1 /* !! */ .setVisibility(0);
            }
        } else if ((var1_1 /* !! */  = this.g) != null) {
            var3_3 = 8;
            var1_1 /* !! */ .setVisibility(var3_3);
        }
        var4_4 /* !! */  = Looper.getMainLooper();
        var1_1 /* !! */  = new Handler((Looper)var4_4 /* !! */ );
        var4_4 /* !! */  = new ov_0(this, 0);
        var1_1 /* !! */ .postDelayed((Runnable)var4_4 /* !! */ , (long)100);
    }
}

