/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.kmm.shared.model.home.transform.BannerAdsMetaData;
import com.ril.ajio.services.entity.Banner;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class BZ1$c
implements Av {
    public final /* synthetic */ bz1_2 a;

    public BZ1$c(bz1_2 bz1_22) {
        this.a = bz1_22;
    }

    public final void I4(Banner object, int n3, String string2) {
        Intrinsics.checkNotNullParameter(object, "banner");
        Object object2 = ((Banner)object).getBannerType();
        int n4 = Intrinsics.areEqual(object2, "AD");
        String string3 = "Web view Screen";
        String string4 = "ajio";
        String string5 = "bannerViewModel";
        Object object3 = null;
        bz1_2 bz1_22 = this.a;
        if (n4 != 0) {
            Object object4;
            if (string2 != null && (n4 = string2.length()) != 0 && (n4 = (int)(((h40_0)(object2 = h40_0.a)).p1((xv$a_0)((Object)(object4 = xv$a_0.MyAccount))) ? 1 : 0)) != 0) {
                boolean bl2;
                bz1_2.Qa(bz1_22, (Banner)object, n3);
                Object object5 = ((Banner)object).getBannerAdsMetaData();
                if (object5 != null && (object5 = ((BannerAdsMetaData)object5).getClickTracker()) != null) {
                    if ((object = ((Banner)object).getBannerAdsMetaData()) != null) {
                        object = ((BannerAdsMetaData)object).getCcbValue();
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    Intrinsics.checkNotNullParameter(object5, "url");
                    long l2 = k7.p();
                    object2 = String.valueOf(l2);
                    object4 = "[trq]";
                    object5 = b.n((String)object5, (String)object4, (String)object2, false);
                    if (object == null) {
                        object = "";
                    }
                    object2 = "[ccb]";
                    object = b.n((String)object5, (String)object2, (String)object, false);
                    object5 = bz1_22.a1;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                    } else {
                        object3 = object5;
                    }
                    ((BannerAdViewModel)object3).callBannerClickImpression((String)object);
                }
                if (bl2 = StringsKt.F(string2, string4, false)) {
                    object = AnalyticsManager.Companion;
                    km_1.a((AnalyticsManager$Companion)object, string3);
                }
                object = kj0_1.g();
                object5 = bz1_22.getActivity();
                ((kj0_1)object).w((Activity)object5, string2);
            }
        } else {
            String string6;
            object2 = ((Banner)object).getBannerType();
            n4 = (int)(Intrinsics.areEqual(object2, string6 = "EXTERNAL_AD") ? 1 : 0);
            if (n4 != 0) {
                if (string2 != null && (n4 = string2.length()) != 0) {
                    object2 = h40_0.a;
                    object2 = xv$a_0.MyAccount;
                    n4 = (int)(h40_0.r2((xv$a_0)((Object)object2)) ? 1 : 0);
                    if (n4 != 0) {
                        Object object6;
                        boolean bl3;
                        bz1_2.Qa(bz1_22, (Banner)object, n3);
                        object = ((Banner)object).getBannerAdsMetaData();
                        if (object != null) {
                            object = ((BannerAdsMetaData)object).getClickTracker();
                        } else {
                            bl3 = false;
                            object = null;
                        }
                        if (object != null) {
                            object6 = bz1_22.a1;
                            if (object6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string5);
                            } else {
                                object3 = object6;
                            }
                            ((BannerAdViewModel)object3).callBannerClickImpression((String)object);
                        }
                        if (bl3 = StringsKt.F(string2, string4, false)) {
                            object = AnalyticsManager.Companion;
                            km_1.a((AnalyticsManager$Companion)object, string3);
                        }
                        object = kj0_1.g();
                        object6 = bz1_22.getActivity();
                        ((kj0_1)object).w((Activity)object6, string2);
                    }
                }
            } else if (string2 != null && (n4 = string2.length()) != 0) {
                object2 = h40_0.a;
                object2 = xv$a_0.MyAccount;
                n4 = (int)(h40_0.R0((xv$a_0)((Object)object2)) ? 1 : 0);
                if (n4 != 0) {
                    bz1_2.Qa(bz1_22, (Banner)object, n3);
                    object = kj0_1.g();
                    FragmentActivity fragmentActivity = bz1_22.getActivity();
                    ((kj0_1)object).w(fragmentActivity, string2);
                }
            }
        }
    }

    public final void u9(BannerAdsMetaData object) {
        Intrinsics.checkNotNullParameter(object, "bannerAdsMetaData");
        Object object2 = ((BannerAdsMetaData)object).getImpressionTracker();
        if (object2 != null) {
            object = ((BannerAdsMetaData)object).getCcbValue();
            Intrinsics.checkNotNullParameter(object2, "url");
            long l2 = k7.p();
            String string2 = String.valueOf(l2);
            String string3 = "[trq]";
            object2 = b.n((String)object2, string3, string2, false);
            if (object == null) {
                object = "";
            }
            string2 = "[ccb]";
            object = b.n((String)object2, string2, (String)object, false);
            object2 = this.a.a1;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bannerViewModel");
                object2 = null;
            }
            ((BannerAdViewModel)object2).callBannerViewImpression((String)object);
        }
    }
}

