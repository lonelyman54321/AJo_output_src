/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from CU1
 */
public final class cu1_1
extends qw_2
implements PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener {
    public final vs1_2 d;
    public final float e;

    public cu1_1(ArrayList arrayList, vs1_2 vs1_22, float f5, op2_2 op2_22, mu1_1 mu1_12, kj2_1 kj2_12) {
        Intrinsics.checkNotNullParameter(vs1_22, "listener");
        super(arrayList, op2_22, mu1_12, kj2_12);
        this.d = vs1_22;
        this.e = f5;
    }

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block31: {
            block32: {
                var3_3 = null;
                var4_4 = 1;
                var5_5 = "viewHolder";
                Intrinsics.checkNotNullParameter(var1_1, (String)var5_5);
                var6_6 = this.a;
                if (var6_6 == null) break block31;
                var7_7 = (PaymentInstrumentInfo)var6_6.get(var2_2);
                var8_8 = var1_1;
                var8_8 = (cu1$a_0)var1_1;
                Intrinsics.checkNotNullParameter(var8_8, (String)var5_5);
                var9_9 = var8_8 instanceof cu1$a_0;
                if (!var9_9) break block32;
                var5_5 = var8_8.itemView;
                var10_10 = var2_2;
                var5_5.setTag((Object)var10_10);
                var5_5 = ((cu1$a_0)var8_8).a;
                var11_11 = 0;
                var10_10 = null;
                if (var7_7 != null) {
                    var12_12 = var7_7.getName();
                } else {
                    var13_13 = 0;
                    var12_12 = null;
                }
                var5_5.setText((CharSequence)var12_12);
                if (var7_7 != null) {
                    var5_5 = var7_7.getName();
                } else {
                    var9_9 = false;
                    var5_5 = null;
                    var14_14 = 0.0f;
                }
                var13_13 = R$string.net_banking;
                var12_12 = hv3_0.K(var13_13);
                var15_15 = " ";
                var5_5 = n1.a((String)var5_5, (String)var15_15, (String)var12_12);
                var12_12 = ((cu1$a_0)var8_8).a;
                var12_12.setContentDescription((CharSequence)var5_5);
                var5_5 = ((cu1$a_0)var8_8).f;
                if (var7_7 != null) {
                    var12_12 = var7_7.getPriceValidation();
                    if (var12_12 != null && (var12_12 = var12_12.getPriceSplitup()) != null) {
                        var12_12 = var12_12.getOfferDetails();
                    } else {
                        var13_13 = 0;
                        var12_12 = null;
                    }
                    if (var12_12 != null && (var15_15 = var7_7.getPriceValidation()) != null) {
                        var15_15 = var7_7.getPriceValidation();
                        if (var15_15 != null) {
                            var15_15 = var15_15.getInstantDiscountMsg();
                        } else {
                            var16_16 = false;
                            var15_15 = null;
                            var17_17 = 0.0f;
                        }
                        var16_16 = TextUtils.isEmpty((CharSequence)var15_15);
                        if (!var16_16) {
                            var15_15 = var7_7.getPriceValidation();
                            if (var15_15 != null) {
                                var15_15 = var15_15.getInstantDiscountMsg();
                            } else {
                                var16_16 = false;
                                var15_15 = null;
                                var17_17 = 0.0f;
                            }
                            var12_12.setInstantDiscountMsg((String)var15_15);
                        }
                        if ((var15_15 = var7_7.getPriceValidation()) != null && (var15_15 = var15_15.getPriceSplitup()) != null) {
                            var15_15 = var15_15.getNetPayableAmount();
                        } else {
                            var16_16 = false;
                            var15_15 = null;
                            var17_17 = 0.0f;
                        }
                        var12_12.setNetPayableAmount((Float)var15_15);
                    }
                    if (var5_5 != null) {
                        var15_15 = var7_7.getName();
                        var18_18 = "netbanking-";
                        var15_15 = kp1_0.c(var18_18, (String)var15_15);
                        var5_5.setData(null, (OfferDetails)var12_12, var4_4, (String)var15_15);
                    }
                }
                if (var5_5 != null) {
                    var5_5.setCardClickListener(this);
                }
                if (var7_7 != null && (var5_5 = var7_7.getPriceValidation()) != null && (var5_5 = var5_5.getPriceSplitup()) != null) {
                    var5_5 = var5_5.getNetPayableAmount();
                } else {
                    var9_9 = false;
                    var5_5 = null;
                    var14_14 = 0.0f;
                }
                var12_12 = ((cu1$a_0)var8_8).d;
                var17_17 = this.e;
                var18_18 = "format(...)";
                var19_19 = "PAY \u20b9%s SECURELY";
                if (var5_5 == null) {
                    var20_20 = StringCompanionObject.INSTANCE;
                    var20_20 = kq2_1.a(var17_17);
                    var21_21 = new Object[var4_4];
                    var21_21[0] = var20_20;
                    zn0_1.b((Object[])var21_21, var4_4, var19_19, var18_18, (TextView)var12_12);
                } else {
                    var20_20 = StringCompanionObject.INSTANCE;
                    var22_22 = var5_5.floatValue();
                    var20_20 = kq2_1.a(var22_22);
                    var21_21 = new Object[var4_4];
                    var21_21[0] = var20_20;
                    zn0_1.b((Object[])var21_21, var4_4, var19_19, var18_18, (TextView)var12_12);
                }
                var20_20 = ((cu1$a_0)var8_8).b;
                var20_20.setContentDescription((CharSequence)"");
                var21_21 = new da$a();
                var21_21.k = var4_4;
                var21_21.g = var4_4;
                if (var7_7 != null) {
                    var10_10 = var7_7.getIconURL();
                }
                var21_21.n = var10_10;
                var21_21.u = var20_20;
                var21_21.a();
                var11_11 = this.c;
                var20_20 = ((cu1$a_0)var8_8).c;
                var23_23 = 8;
                if (var2_2 == var11_11) {
                    var20_20.setVisibility(0);
                } else {
                    var20_20.setVisibility(var23_23);
                    if (var5_5 == null) {
                        var5_5 = kq2_1.a(var17_17);
                        var10_10 = new Object[var4_4];
                        var10_10[0] = var5_5;
                        zn0_1.b(var10_10, var4_4, var19_19, var18_18, (TextView)var12_12);
                    } else {
                        var14_14 = var5_5.floatValue();
                        var5_5 = kq2_1.a(var14_14);
                        var10_10 = new Object[var4_4];
                        var10_10[0] = var5_5;
                        zn0_1.b(var10_10, var4_4, var19_19, var18_18, (TextView)var12_12);
                    }
                    var5_5 = kq2_1.a(var17_17);
                    var10_10 = new Object[var4_4];
                    var10_10[0] = var5_5;
                    zn0_1.b(var10_10, var4_4, var19_19, var18_18, (TextView)var12_12);
                }
                this.b.getClass();
                var5_5 = ((cu1$a_0)var8_8).e;
                var8_8 = "pfContainer";
                Intrinsics.checkNotNullParameter(var5_5, (String)var8_8);
                if (var7_7 != null) {
                    var8_8 = var7_7.getLowSuccessRate();
                    var10_10 = Boolean.TRUE;
                    var24_24 = Intrinsics.areEqual(var8_8, var10_10);
                } else {
                    var24_24 = 0;
                    var8_8 = null;
                }
                if (var24_24 == 0) ** GOTO lbl-1000
                var8_8 = var7_7.getMessage();
                if (var8_8 != null && (var24_24 = var8_8.length()) != 0) {
                    var4_4 = 0;
                }
                if (var4_4 == 0) {
                    var5_5.setVisibility(0);
                    var3_3 = var7_7.getMessage();
                    var5_5.setText((CharSequence)var3_3);
                } else lbl-1000:
                // 2 sources

                {
                    var5_5.setVisibility(var23_23);
                }
            }
            var1_1 = var1_1.itemView;
            var6_6 = (ArrayList)var6_6;
            var3_3 = new au1_2(this, var2_2, (ArrayList)var6_6);
            var1_1.setOnClickListener((View.OnClickListener)var3_3);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        String string2 = "viewGroup";
        Intrinsics.checkNotNullParameter(viewGroup, string2);
        boolean bl2 = og1_1.b();
        if (bl2) {
            string2 = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.pesdk_lux_netbanking_row;
            viewGroup = string2.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
        } else {
            string2 = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.pesdk_netbanking_row;
            viewGroup = string2.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
        }
        Object object = n3;
        viewGroup.setTag(object);
        object = new cu1$a_0(this, (View)viewGroup);
        return object;
    }

    public final void onLoyaltyDeSelected(LpStoredCardBalance lpStoredCardBalance) {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.onLoyaltyDeSelected(this, lpStoredCardBalance);
    }

    public final void onLoyaltySelected(LpStoredCardBalance lpStoredCardBalance) {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.onLoyaltySelected(this, lpStoredCardBalance);
    }

    public final void onOfferClicked(OfferDetails offerDetails) {
        Intrinsics.checkNotNullParameter(offerDetails, "offerDetail");
        this.d.b(offerDetails);
    }

    public final void onRegisterMobileClicked(LpStoredCardBalance lpStoredCardBalance) {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.onRegisterMobileClicked(this, lpStoredCardBalance);
    }

    public final void showLoyaltyInfoFragment() {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.showLoyaltyInfoFragment(this);
    }
}

