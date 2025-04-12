/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData$a;
import com.google.gson.JsonObject;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Closet.SaveForLaterResponse;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.stl.fragment.ShopTheLookFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from Bf1
 */
public final class bf1_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bf1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        var2_2 = 1;
        var3_3 = 0;
        var4_4 = null;
        var5_5 = "this$0";
        var6_6 = this.b;
        var7_7 = this.a;
        switch (var7_7) {
            default: {
                var8_8 = var1_1;
                var8_8 = (Throwable)var1_1;
                var6_6 = (hy3_0)var6_6;
                Intrinsics.checkNotNullParameter(var6_6, (String)var5_5);
                var1_1 = var6_6.r;
                var9_9 = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(var8_8);
                var10_12 = ApiErrorRepo.handleApiException$default(var9_9, (Throwable)var8_8, "verify_otp_access_profile", false, null, null, 28, null);
                var1_1.k(var10_12);
                return Unit.a;
            }
            case 3: {
                var1_1 = (DataCallback)var1_1;
                var5_5 = cp_1.Companion;
                var11_15 = nn_2.b((cp$a)var5_5, (DataCallback)var1_1);
                if (var11_15 != 0) {
                    var6_6 = (ShopTheLookFragment)var6_6;
                    var5_5 = var6_6.k;
                    if (var5_5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                        var11_15 = 0;
                        var5_5 = null;
                    }
                    var5_5.stopLoader();
                    var11_15 = var1_1.getStatus();
                    if (var11_15 == 0) {
                        var5_5 = z40_0.Companion;
                        var5_5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var5_5).a;
                        var12_16 = "wishlist_state_enable";
                        var11_15 = (int)var5_5.a((String)var12_16);
                        if (var11_15 != 0) {
                            var5_5 = var6_6.a;
                            if (var5_5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("stlHomeRv");
                                var11_15 = 0;
                                var5_5 = null;
                            }
                            var11_15 = ShopTheLookFragment.Pa((RecyclerView)var5_5);
                            var12_16 = var6_6.f;
                            if (var12_16 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("shopTheLookBannerDetailsAdapter");
                                var7_7 = 0;
                                var12_16 = null;
                            }
                            var12_16.notifyItemChanged(var11_15);
                        }
                        if ((var1_1 = (SaveForLaterResponse)var1_1.getData()) != null) {
                            var5_5 = var1_1.getStatusCode();
                            if (var5_5 != null && (var11_15 = var5_5.intValue()) == 0) {
                                if ((var1_1 = var1_1.getStatus()) != null) {
                                    var1_1 = var1_1.getMessageDescription();
                                } else {
                                    var13_19 = 0;
                                    var1_1 = null;
                                }
                                var11_15 = 3;
                                rw_1.a(var11_15, (String)var1_1);
                                var1_1 = var6_6.Ra().h.b;
                                if (var1_1 != null) {
                                    var5_5 = el1_2.a;
                                    var5_5 = yt2_2.PDP;
                                    el1_2.c((yt2_2)var5_5, (Product)var1_1);
                                }
                                if ((var1_1 = var6_6.Ra().h.b) != null && (var1_1 = var1_1.getFnlColorVariantData()) != null) {
                                    var1_1 = var1_1.getColorGroup();
                                } else {
                                    var13_19 = 0;
                                    var1_1 = null;
                                }
                                if (var1_1 != null && (var13_19 = var1_1.length()) != 0 && (var1_1 = var6_6.Ra().h.b) != null) {
                                    var5_5 = var6_6.Ra().h.b;
                                    if (var5_5 != null) {
                                        var5_5 = var5_5.getFnlColorVariantData();
                                    } else {
                                        var11_15 = 0;
                                        var5_5 = null;
                                    }
                                    Intrinsics.checkNotNull(var5_5);
                                    var5_5 = var5_5.getColorGroup();
                                    var1_1.setCode((String)var5_5);
                                }
                                if ((var1_1 = var6_6.Ra().h.b) != null) {
                                    var1_1 = g62_0.c;
                                    var5_5 = var6_6.Ra().h.b;
                                    Intrinsics.checkNotNull(var5_5);
                                    var5_5 = DW.c((Product)var5_5);
                                    var7_7 = 1000;
                                    var1_1.b(var5_5, var7_7);
                                    kx3_0.a = var2_2;
                                    kx3_0.b = null;
                                }
                            } else {
                                if ((var1_1 = var1_1.getStatus()) != null) {
                                    var1_1 = var1_1.getMessageDescription();
                                } else {
                                    var13_20 = false;
                                    var1_1 = null;
                                }
                                var2_2 = 2;
                                rw_1.a(var2_2, (String)var1_1);
                            }
                        } else {
                            rw_1.a(var2_2, null);
                        }
                        var1_1 = var6_6.Ra().h;
                        var1_1.b = null;
                    } else {
                        var13_21 = var1_1.getStatus();
                        if (var13_21 == var2_2) {
                            rw_1.a(var2_2, null);
                        }
                    }
                }
                return Unit.a;
            }
            case 2: {
                var1_1 = (dl2_2)var1_1;
                var6_6 = (oo2_1)var6_6;
                Intrinsics.checkNotNullParameter(var6_6, (String)var5_5);
                var5_5 = "PAYMENT_AbortTransaction";
                Intrinsics.checkNotNullParameter(var5_5, "$requestID");
                Intrinsics.checkNotNullParameter(var1_1, "response");
                var10_13 = (JsonObject)var1_1.b;
                var12_17 = var1_1.a;
                var14_22 = var12_17.d();
                if (var14_22 && var10_13 != null) {
                    var1_1 = JsonUtils.toJson(var10_13);
                    var9_10 = PayNowResponse.class;
                    if ((var1_1 = (PayNowResponse)JsonUtils.fromJson((String)var1_1, var9_10)) != null && (var9_10 = var1_1.getError()) != null) {
                        var9_10 = var9_10.getCode();
                    } else {
                        var14_22 = false;
                        var9_10 = null;
                    }
                    if (var9_10 != null) {
                        var9_10 = var1_1.getError();
                        if (var9_10 != null) {
                            var4_4 = var9_10.getDescription();
                        }
                        if (var4_4 != null) {
                            if ((var1_1 = var1_1.getError()) == null || (var1_1 = var1_1.getDescription()) == null) {
                                var1_1 = "";
                            }
                            var6_6.getClass();
                            var3_3 = var12_17.d;
                            oo2_1.h(var3_3, (String)var5_5, (String)var1_1);
                        }
                    }
                    var1_1 = DataCallback.Companion.onSuccess(var10_13);
                } else {
                    var10_13 = ApiErrorRepo.INSTANCE;
                    var12_17 = "single page checkout";
                    var9_11 = "Forward";
                    var15_23 = true;
                    var4_4 = var1_1;
                    var1_1 = var10_13.handleApiError((dl2_2)var1_1, (String)var5_5, var15_23, (String)var12_17, var9_11);
                }
                return var1_1;
            }
            case 1: {
                var4_4 = var1_1;
                var4_4 = (Throwable)var1_1;
                var6_6 = (db2_1)var6_6;
                Intrinsics.checkNotNullParameter(var6_6, (String)var5_5);
                var1_1 = var6_6.u;
                var10_14 = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(var4_4);
                var10_14 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)var10_14, (Throwable)var4_4, "RETURN_UPLOAD_IMAGE", false, null, null, 28, null);
                var1_1.k(var10_14);
                return Unit.a;
            }
            case 0: 
        }
        var1_1 = (JSONObject)var1_1;
        var6_6 = (InAppController)var6_6;
        var6_6.getClass();
        var4_4 = CustomTemplateInAppData.CREATOR;
        var4_4.getClass();
        var1_1 = CustomTemplateInAppData$a.a((JSONObject)var1_1);
        if (var1_1 == null || (var4_4 = var1_1.a) == null) ** GOTO lbl-1000
        var5_5 = var6_6.i;
        var5_5.getClass();
        var12_18 = "templateName";
        Intrinsics.checkNotNullParameter(var4_4, var12_18);
        var5_5 = var5_5.b;
        var3_3 = var5_5.containsKey(var4_4);
        if (var3_3 == 0) {
            var3_3 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = 0;
            var4_4 = null;
        }
        if (var3_3 != 0) {
            var1_1 = var1_1.a;
            var1_1 = var6_6.l;
            var1_1.getClass();
            com.clevertap.android.sdk.b.i();
        }
        return var3_3 ^ true;
    }
}

