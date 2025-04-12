/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Product.ProductImage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class NT
implements F62 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ NT(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Unable to fully structure code
     */
    public final void onChanged(Object var1_1) {
        var2_2 = "this$0";
        var3_3 = this.b;
        var4_4 = 1;
        var5_5 = null;
        var6_6 = this.a;
        switch (var6_6) {
            default: {
                var1_1 = (String)var1_1;
                var3_3 = (NewProductDetailsFragment)var3_3;
                Intrinsics.checkNotNullParameter(var3_3, (String)var2_2);
                var7_7 = TextUtils.isEmpty((CharSequence)var1_1);
                if (var7_7 != 0) ** GOTO lbl55
                Intrinsics.checkNotNull(var1_1);
                var2_2 = var3_3.cb().q;
                var4_4 = 0;
                var8_9 = null;
                if (var2_2 == null) ** GOTO lbl-1000
                var2_2 = var3_3.cb().q;
                Intrinsics.checkNotNull(var2_2);
                var2_2 = var2_2.getProductGalleryImageUrls();
                if (var2_2 == null) ** GOTO lbl-1000
                var2_2 = var3_3.cb().q;
                Intrinsics.checkNotNull(var2_2);
                var2_2 = var2_2.getProductGalleryImageUrls();
                if (var2_2 != null) {
                    var7_7 = Intrinsics.compare(var2_2.size(), 0);
                } else {
                    var7_7 = 0;
                    var2_2 = null;
                }
                if (var7_7 > 0 && (var2_2 = var3_3.getContext()) != null) {
                    n13_0.Companion.getClass();
                    var2_2 = N13$a.a();
                    var9_11 = var3_3.cb().q;
                    Intrinsics.checkNotNull(var9_11);
                    var9_11 = var9_11.getProductGalleryImageUrls();
                    if (var9_11 != null && (var5_5 = (ProductImage)var9_11.get(0)) != null) {
                        var8_9 = var5_5.getUrl();
                    }
                    var5_5 = var3_3.requireContext();
                    Intrinsics.checkNotNullExpressionValue(var5_5, "requireContext(...)");
                    var9_11 = new n22_0((NewProductDetailsFragment)var3_3, (String)var1_1);
                    var2_2.a(var8_9, (Context)var5_5, (s13_0)var9_11);
                } else if ((var2_2 = var3_3.getContext()) != null) {
                    var2_2 = var3_3.getContext();
                    var6_6 = R$string.pop_n_peek_share_subject;
                    var9_12 = hv3_0.K(var6_6);
                    var10_15 = R$string.share_product;
                    var11_16 = hv3_0.K(var10_15);
                    d23_0.f((Context)var2_2, (String)var1_1, var9_12, null, var11_16);
                    var3_3.S = false;
                }
                var1_1 = var3_3.cb().R0;
                var2_2 = "";
                var1_1.k(var2_2);
lbl55:
                // 2 sources

                return;
            }
            case 0: 
        }
        var1_1 = (DataCallback)var1_1;
        var3_3 = (ot_2)var3_3;
        Intrinsics.checkNotNullParameter(var3_3, (String)var2_2);
        var2_2 = cp_1.Companion;
        var7_8 = nn_2.b((cp$a)var2_2, (DataCallback)var1_1);
        if (var7_8) {
            var2_2 = "format(...)";
            if (var1_1 != null && (var6_6 = var1_1.getStatus()) == 0) {
                var1_1 = StringCompanionObject.INSTANCE;
                var12_19 = R$string.acc_alert_popup;
                var1_1 = hv3_0.K(var12_19);
                var6_6 = R$string.address_deleted_successfully;
                var9_13 = hv3_0.K(var6_6);
                var11_17 = new Object[var4_4];
                var11_17[0] = var9_13;
                var1_1 = xh2_0.a(var11_17, var4_4, (String)var1_1, (String)var2_2);
                var2_2 = var3_3.b;
                if (var2_2 != null) {
                    var4_4 = R$string.address_deleted_successfully;
                    var8_10 = hv3_0.K(var4_4);
                    var2_2.showNotification(var8_10, (String)var1_1);
                }
                var3_3.Oa();
            } else {
                var12_20 = var1_1.getStatus();
                if (var12_20 == var4_4) {
                    var1_1 = var3_3.g;
                    if (var1_1 != null) {
                        var1_1.P0();
                    }
                    var1_1 = StringCompanionObject.INSTANCE;
                    var12_20 = R$string.acc_error_message;
                    var1_1 = hv3_0.K(var12_20);
                    var6_6 = R$string.delete_address_alert;
                    var9_14 = hv3_0.K(var6_6);
                    var11_18 = new Object[var4_4];
                    var11_18[0] = var9_14;
                    var1_1 = xh2_0.a(var11_18, var4_4, (String)var1_1, (String)var2_2);
                    var2_2 = var3_3.b;
                    if (var2_2 != null) {
                        var13_21 = R$string.delete_address_alert;
                        var3_3 = hv3_0.K(var13_21);
                        var2_2.showNotification((String)var3_3, (String)var1_1);
                    }
                }
            }
        }
    }
}

