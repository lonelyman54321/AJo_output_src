/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.view.animation.LayoutAnimationController
 *  android.widget.ImageView
 */
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.SpotLight;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wi2
 */
public final class wi2_2
extends RecyclerView$B
implements View.OnClickListener {
    public final View a;
    public final yi2_1 b;
    public final ImageView c;
    public final View d;
    public final View e;

    public wi2_2(View view, yi2_1 yi2_12) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        super(view);
        this.a = view;
        this.b = yi2_12;
        int n3 = R$id.pdp_product_img;
        yi2_12 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(yi2_12, string2);
        yi2_12 = (ImageView)yi2_12;
        this.c = yi2_12;
        n3 = R$id.spotLightContainer;
        yi2_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(yi2_12, string2);
        this.d = yi2_12;
        n3 = R$id.spotLightTitle;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.e = view;
    }

    public final void onClick(View object) {
        object = this.b;
        int n3 = object.u7();
        if (n3 == 0) {
            n3 = this.getBindingAdapterPosition();
            Serializable serializable = object.P();
            int n4 = 0;
            Integer n7 = null;
            ArrayList arrayList = serializable != null ? ((SpotLight)serializable).getSpotLightAttributes() : null;
            if (arrayList != null) {
                int n8;
                if ((serializable = ((SpotLight)serializable).getSpotLightAttributes()) != null) {
                    n8 = ((ArrayList)serializable).size();
                    n7 = n8;
                }
                Intrinsics.checkNotNull(n7);
                n8 = n7;
                n4 = 1;
                if (n8 > n4) {
                    n3 += -1;
                }
            }
            object.D9(n3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void w(int var1_1, SpotLight var2_2, ProductImage var3_3) {
        block12: {
            block11: {
                var4_4 = 8;
                var5_5 /* !! */  = this.d;
                var6_6 = null;
                var7_7 = this.c;
                var8_8 = 1;
                if (var2_2 == null || (var9_9 = var2_2.getImageToDisplay()) != var1_1) break block11;
                var10_10 = h40_0.a;
                var10_10 = z40_0.Companion;
                var10_10 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var10_10).a;
                var11_11 = "is_product_key_feature_enabled";
                var9_9 = (int)var10_10.a((String)var11_11);
                if (var9_9 == 0) break block11;
                var10_10 = var2_2.getSpotLightAttributes();
                if (var10_10 == null) ** GOTO lbl-1000
                var10_10 = var2_2.getSpotLightAttributes();
                if (var10_10 != null) {
                    var9_9 = var10_10.size();
                    var10_10 = var9_9;
                } else {
                    var9_9 = 0;
                    var10_10 = null;
                }
                Intrinsics.checkNotNull(var10_10);
                var9_9 = var10_10.intValue();
                if (var9_9 > var8_8) {
                    var7_7.setOnClickListener(null);
                    var12_12 = this.a;
                    var10_10 = var12_12.getContext();
                    var13_13 = R$anim.fade_transaction_anim;
                    var10_10 = AnimationUtils.loadAnimation((Context)var10_10, (int)var13_13);
                    var11_11 = this.e;
                    var11_11.setAnimation((Animation)var10_10);
                    var9_9 = 0;
                    var10_10 = null;
                    var5_5 /* !! */ .setVisibility(0);
                    var5_5 /* !! */  = var2_2.getSpotLightAttributes();
                    if (var5_5 /* !! */  != null) {
                        var5_5 /* !! */  = var2_2.getSpotLightAttributes();
                        if (var5_5 /* !! */  != null) {
                            var9_9 = R$id.spotLightRv;
                            var10_10 = var12_12.findViewById(var9_9);
                            Intrinsics.checkNotNullExpressionValue(var10_10, "findViewById(...)");
                            var10_10 = (RecyclerView)var10_10;
                            var14_14 /* !! */  = var12_12.getContext();
                            var11_11 = new LinearLayoutManager(var14_14 /* !! */ );
                            var10_10.setLayoutManager((RecyclerView$o)var11_11);
                            var13_13 = R$anim.layout_animation_right_to_left;
                            var11_11 = AnimationUtils.loadLayoutAnimation((Context)var12_12.getContext(), (int)var13_13);
                            var10_10.setLayoutAnimation((LayoutAnimationController)var11_11);
                            var12_12 = var12_12.getContext();
                            var14_14 /* !! */  = "getContext(...)";
                            Intrinsics.checkNotNullExpressionValue(var12_12, (String)var14_14 /* !! */ );
                            var11_11 = new jj2_1((Context)var12_12, (ArrayList)var5_5 /* !! */ );
                            var10_10.setAdapter((RecyclerView$f)var11_11);
                        }
                        if ((var4_4 = (int)var2_2.isProductSpotLightShown()) == 0) {
                            var12_12 = this.b;
                            var5_5 /* !! */  = var2_2.getSpotLightAttributes();
                            var12_12.b4((ArrayList)var5_5 /* !! */ );
                        }
                        var2_2.setProductSpotLightShown((boolean)var8_8);
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var7_7.setOnClickListener((View.OnClickListener)this);
                    var5_5 /* !! */ .setVisibility(var4_4);
                }
                break block12;
            }
            var7_7.setOnClickListener((View.OnClickListener)this);
            var5_5 /* !! */ .setVisibility(var4_4);
        }
        if (var3_3 != null && (var2_2 = var3_3.getAltText()) != null) {
            var12_12 = new StringBuilder();
            var12_12.append((String)var2_2);
            var2_2 = " index ";
            var12_12.append((String)var2_2);
            var12_12.append(var1_1);
            var15_15 = var12_12.toString();
            var7_7.setContentDescription((CharSequence)var15_15);
        }
        var15_15 = new da$a();
        var15_15.k = var8_8;
        var15_15.r = var8_8;
        var15_15.s = var8_8;
        var2_2 = hv3_0.K(R$string.acc_icon_product_placeholder);
        var15_15.b((String)var2_2);
        var15_15.a = var16_16 = R$drawable.component_placeholder;
        var15_15.b = var4_4 = R$drawable.item_dummy_noimg;
        var15_15.c = var16_16;
        var15_15.i = var8_8;
        var15_15.z = var8_8;
        if (var3_3 != null) {
            var2_2 = var3_3.getUrl();
        } else {
            var16_16 = 0;
            var2_2 = null;
        }
        var15_15.y = var2_2;
        if (var3_3 != null) {
            var6_6 = var3_3.getUrl();
        }
        var15_15.n = var6_6;
        var15_15.u = var7_7;
        var15_15.a();
    }
}

