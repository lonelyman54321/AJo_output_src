/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.data.database.entity.ListShareProductExperience;
import com.ril.ajio.data.database.entity.SharedWithMe;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ej2
 */
public final class ej2_0
implements F62 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ej2_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onChanged(Object var1_1) {
        var2_2 = 2;
        var3_3 = "this$0";
        var4_4 = this.b;
        var5_5 = 1;
        var6_6 = this.a;
        switch (var6_6) {
            default: {
                var1_1 = (DataCallback)var1_1;
                var7_7 = B23.Companion;
                var4_4 = (B23)var4_4;
                Intrinsics.checkNotNullParameter(var4_4, (String)var3_3);
                var4_4.getClass();
                var3_3 = cp_1.Companion;
                var8_8 = nn_2.b((cp$a)var3_3, (DataCallback)var1_1);
                if (var8_8 == 0) ** GOTO lbl140
                Intrinsics.checkNotNull(var1_1);
                var8_8 = var1_1.getStatus();
                if (var8_8 == 0) ** GOTO lbl24
                if (var8_8 == var5_5) {
                    var1_1 = var4_4.Ra().fswmdProgressView;
                    var1_1.dismiss();
                }
                ** GOTO lbl140
lbl24:
                // 1 sources

                var1_1 = var1_1.getData();
                Intrinsics.checkNotNull(var1_1);
                var4_4.h = var1_1 = (SharedWithMe)var1_1;
                var3_3 = var4_4.c;
                var7_7 = "sharedWithMeViewModel";
                var9_9 = null;
                if (var3_3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                    var8_8 = 0;
                    var3_3 = null;
                }
                if (var1_1 == null) ** GOTO lbl59
                var3_3 = UserInformation.getInstance((Context)var3_3.getApplication()).getEncryptedUuid();
                var10_10 = "getEncryptedUuid(...)";
                Intrinsics.checkNotNullExpressionValue(var3_3, (String)var10_10);
                var11_11 = var3_3.length();
                if (var11_11 == 0) ** GOTO lbl-1000
                var10_10 = var1_1.getShareProductExperience();
                if (var10_10 != null) {
                    var10_10 = var10_10.getSenderId();
                } else {
                    var11_11 = 0;
                    var10_10 = null;
                }
                var8_8 = (int)Intrinsics.areEqual(var3_3, var10_10);
                if (var8_8 == 0) lbl-1000:
                // 2 sources

                {
                    if ((var3_3 = var1_1.getShareProductExperience()) != null && (var3_3 = var3_3.getDSender()) != null) {
                        var3_3 = ai0_2.f((String)var3_3);
                    } else {
                        var8_8 = 0;
                        var3_3 = null;
                    }
                    var10_10 = "Shared by ";
                    var3_3 = kp1_0.c((String)var10_10, (String)var3_3);
                } else {
                    var3_3 = "Shared by Me";
                }
                if (var3_3 != null) ** GOTO lbl62
                ** GOTO lbl61
lbl59:
                // 1 sources

                var3_3.getClass();
lbl61:
                // 2 sources

                var3_3 = "";
lbl62:
                // 2 sources

                if ((var11_11 = (var10_10 = var4_4.getActivity()) instanceof AjioHomeActivity) != 0) {
                    var10_10 = var4_4.getActivity();
                    var12_12 /* !! */  = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
                    Intrinsics.checkNotNull(var10_10, var12_12 /* !! */ );
                    var10_10 = ((AjioHomeActivity)var10_10).k0;
                    if (var10_10 != null) {
                        var12_12 /* !! */  = AjioCustomToolbar$DisplayMode.TITLE;
                        var10_10.setDisplayMode((AjioCustomToolbar$DisplayMode)var12_12 /* !! */ );
                    }
                }
                if ((var10_10 = var4_4.d) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sharedWithMeDetailListener");
                    var11_11 = 0;
                    var10_10 = null;
                }
                var10_10.b((String)var3_3);
                var8_8 = (int)var1_1.isEmpty();
                if (var8_8 != 0) {
                    var4_4.Qa();
                } else {
                    var8_8 = (int)var1_1.isLinkExpired();
                    var11_11 = 0;
                    var10_10 = null;
                    if (var8_8 != 0) {
                        var4_4.Ra().fswmdProgressView.dismiss();
                        var1_1 = var4_4.Ra().fswmdRvList;
                        var13_13 /* !! */  = "fswmdRvList";
                        Intrinsics.checkNotNullExpressionValue(var1_1, var13_13 /* !! */ );
                        ai0_2.i((View)var1_1);
                        var1_1 = var4_4.e;
                        if (var1_1 != null) {
                            var1_1.setVisible(false);
                        }
                        var1_1 = var4_4.Ra().sharedStateLayout;
                        var13_13 /* !! */  = var1_1.fswmdIvState;
                        var8_8 = R$drawable.ic_img_link_expired;
                        var13_13 /* !! */ .setImageResource(var8_8);
                        var13_13 /* !! */  = var1_1.fswmdTvState;
                        var8_8 = R$string.link_expired;
                        var13_13 /* !! */ .setText(var8_8);
                        var13_13 /* !! */  = var1_1.fswmdLayoutStateDesc;
                        var3_3 = "fswmdLayoutStateDesc";
                        Intrinsics.checkNotNullExpressionValue(var13_13 /* !! */ , (String)var3_3);
                        ai0_2.i((View)var13_13 /* !! */ );
                        var1_1 = var1_1.fswmdLayoutState;
                        var13_13 /* !! */  = "fswmdLayoutState";
                        Intrinsics.checkNotNullExpressionValue(var1_1, var13_13 /* !! */ );
                        ai0_2.B((View)var1_1);
                    } else {
                        var3_3 = var4_4.c;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                        } else {
                            var9_9 = var3_3;
                        }
                        var1_1 = var1_1.getProductsShared();
                        var9_9.getClass();
                        Intrinsics.checkNotNullParameter(var1_1, "productsShared");
                        var3_3 = new StringBuilder();
                        var14_16 = var1_1.size();
                        while (var11_11 < var14_16) {
                            var7_7 = ((ListShareProductExperience)var1_1.get(var11_11)).getProductId();
                            var3_3.append((String)var7_7);
                            var6_6 = var14_16 + -1;
                            if (var11_11 < var6_6) {
                                var7_7 = ",";
                                var3_3.append((String)var7_7);
                            }
                            var11_11 += var5_5;
                        }
                        var1_1 = var3_3.toString();
                        var1_1 = var9_9.d.a((String)var1_1, "SharedWithMeProductList");
                        var3_3 = new t4_0(var9_9, var2_2);
                        var4_4 = new kx1_0(var5_5, (Function1)var3_3);
                        var3_3 = new v4_0(var9_9, var2_2);
                        var13_14 = new lx1_0(var5_5, (Function1)var3_3);
                        var1_1 = var1_1.f((o60_0)var4_4, (o60_0)var13_14);
                        var13_14 = var9_9.e;
                        var13_14.b((yr0_2)var1_1);
                    }
                }
lbl140:
                // 5 sources

                return;
            }
            case 0: 
        }
        var1_1 = (Long)var1_1;
        var4_4 = (fj2_1)var4_4;
        Intrinsics.checkNotNullParameter(var4_4, (String)var3_3);
        var13_15 = var4_4.i;
        var3_3 = eb_2.a;
        Intrinsics.checkNotNull(var1_1);
        var1_1 = eb_2.a(var1_1.longValue());
        var13_15.setText((CharSequence)var1_1);
    }
}

