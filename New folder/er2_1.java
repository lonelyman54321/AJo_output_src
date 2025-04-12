/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.view.View
 */
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.gson.JsonObject;
import com.ril.ajio.payment.fragment.h;
import com.ril.ajio.services.data.Payment.BinRequest;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.JsonUtils;
import io.reactivex.Scheduler;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Er2
 */
public final class er2_1
implements TextWatcher {
    public boolean a;
    public final /* synthetic */ h b;

    public er2_1(h h3) {
        this.b = h3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void afterTextChanged(Editable var1_1) {
        block15: {
            block24: {
                block23: {
                    block17: {
                        block22: {
                            block21: {
                                block20: {
                                    block19: {
                                        block18: {
                                            block16: {
                                                var2_2 /* !! */  = "s";
                                                Intrinsics.checkNotNullParameter(var1_1, var2_2 /* !! */ );
                                                var3_3 = this.a;
                                                if (var3_3 != 0) {
                                                    return;
                                                }
                                                var3_3 = var1_1.length();
                                                if (var3_3 <= (var4_4 = 4)) break block15;
                                                var2_2 /* !! */  = var1_1.toString();
                                                var5_5 = "";
                                                var2_2 /* !! */  = oo1_1.a("\\s", var2_2 /* !! */ , var5_5);
                                                var6_6 = new StringBuilder(var2_2 /* !! */ );
                                                var2_2 /* !! */  = var6_6.toString();
                                                var7_7 = 3;
                                                var8_8 = 2;
                                                var9_9 = 1;
                                                if (var2_2 /* !! */  != null) break block16;
                                                var2_2 /* !! */  = kl_2.NONE;
                                                break block17;
                                            }
                                            var10_10 = var2_2 /* !! */ .length();
                                            if (var10_10 <= var9_9 || (var10_10 = (int)var2_2 /* !! */ .startsWith((String)(var11_11 = (Object)"4"))) == 0) break block18;
                                            var2_2 /* !! */  = kl_2.VISA_CARD;
                                            break block17;
                                        }
                                        var10_10 = var2_2 /* !! */ .length();
                                        if (var10_10 <= var8_8 || (var10_10 = (int)var2_2 /* !! */ .startsWith((String)(var11_11 = (Object)"34"))) == 0 && (var10_10 = (int)var2_2 /* !! */ .startsWith((String)(var11_11 = (Object)"37"))) == 0) break block19;
                                        var2_2 /* !! */  = kl_2.AMEX_CARD;
                                        break block17;
                                    }
                                    var10_10 = var2_2 /* !! */ .length();
                                    if (var10_10 <= var8_8 || (var10_10 = (int)var2_2 /* !! */ .startsWith((String)(var11_11 = (Object)"64"))) == 0 && (var10_10 = (int)var2_2 /* !! */ .startsWith((String)(var11_11 = (Object)"65"))) == 0) break block20;
                                    var2_2 /* !! */  = kl_2.DISCOVER_CARD;
                                    break block17;
                                }
                                var10_10 = var2_2 /* !! */ .length();
                                if (var10_10 <= var4_4) ** GOTO lbl-1000
                                var11_11 = var2_2 /* !! */ .substring(0, var4_4);
                                var12_12 = Integer.parseInt((String)var11_11);
                                if ((var12_12 < (var13_13 = 5100) || var12_12 > (var13_13 = 5599)) && (var12_12 < (var13_13 = 2221) || var12_12 > (var13_13 = 2720))) break block21;
                                var2_2 /* !! */  = kl_2.MASTER_CARD;
                                break block17;
                            }
                            var13_13 = 6011;
                            if (var12_12 != var13_13) break block22;
                            var2_2 /* !! */  = kl_2.DISCOVER_CARD;
                            break block17;
                        }
                        var14_14 = "62";
                        var13_13 = (int)var11_11.startsWith((String)var14_14);
                        if (var13_13 == 0) ** GOTO lbl-1000
                        var13_13 = 6282;
                        if (var12_12 >= var13_13 && var12_12 <= (var13_13 = 6288)) {
                            var2_2 /* !! */  = kl_2.DISCOVER_CARD;
                        } else {
                            var10_10 = Integer.parseInt((String)(var11_11 = var11_11.substring(0, var7_7)));
                            if (var10_10 >= (var12_12 = 624) && var10_10 <= (var12_12 = 626)) {
                                var2_2 /* !! */  = kl_2.DISCOVER_CARD;
                            } else lbl-1000:
                            // 3 sources

                            {
                                var2_2 /* !! */  = (var10_10 = var2_2 /* !! */ .length()) > (var12_12 = 6) && (var3_3 = Integer.parseInt(var2_2 /* !! */  = var2_2 /* !! */ .substring(0, var12_12))) >= (var10_10 = 622126) && var3_3 <= (var10_10 = 622925) ? kl_2.DISCOVER_CARD : kl_2.NONE;
                            }
                        }
                    }
                    if (var2_2 /* !! */  == null) {
                        var3_3 = -1;
                    } else {
                        var11_11 = Er2$a.$EnumSwitchMapping$0;
                        var3_3 = var2_2 /* !! */ .ordinal();
                        var3_3 = var11_11[var3_3];
                    }
                    var11_11 = "toString(...)";
                    var15_15 = " ";
                    var14_14 = this.b;
                    if (var3_3 == var9_9 || var3_3 == var8_8 || var3_3 == var7_7) break block23;
                    var7_7 = 10;
                    if (var3_3 == var4_4) ** GOTO lbl97
                    var8_8 = 5;
                    if (var3_3 == var8_8) {
                        this.a = var9_9;
                        var3_3 = var1_1.length();
                        var14_14.getClass();
                        var8_8 = var6_6.length();
                        var13_13 = 0;
                        var14_14 = null;
                        while (var9_9 < var8_8) {
                            if (var9_9 == var4_4 || var9_9 == var7_7 || var9_9 == (var16_16 = 15)) {
                                var16_16 = var9_9 + var13_13;
                                var6_6.insert(var16_16, var15_15);
                                ++var13_13;
                            }
                            ++var9_9;
                        }
                        var17_18 = var6_6.toString();
                        Intrinsics.checkNotNullExpressionValue(var17_18, (String)var11_11);
                        var1_1.replace(0, var3_3, (CharSequence)var17_18);
                    } else {
                        var1_1 = new NoWhenBranchMatchedException();
                        throw var1_1;
lbl97:
                        // 1 sources

                        this.a = var9_9;
                        var3_3 = var1_1.length();
                        var14_14.getClass();
                        var8_8 = var6_6.length();
                        var13_13 = 0;
                        var14_14 = null;
                        while (var9_9 < var8_8) {
                            if (var9_9 == var4_4 || var9_9 == var7_7 || var9_9 == (var16_17 = 14)) {
                                var16_17 = var9_9 + var13_13;
                                var6_6.insert(var16_17, var15_15);
                                ++var13_13;
                            }
                            ++var9_9;
                        }
                        var17_19 = var6_6.toString();
                        Intrinsics.checkNotNullExpressionValue(var17_19, (String)var11_11);
                        var1_1.replace(0, var3_3, (CharSequence)var17_19);
                    }
                    break block24;
                }
                this.a = var9_9;
                var3_3 = var1_1.length();
                var14_14.getClass();
                var4_4 = var6_6.length();
                var7_7 = 0;
                var5_5 = null;
                while (var9_9 < var4_4) {
                    var8_8 = var9_9 % 4;
                    if (var8_8 == 0) {
                        var8_8 = var9_9 + var7_7;
                        var6_6.insert(var8_8, var15_15);
                        ++var7_7;
                    }
                    ++var9_9;
                }
                var17_20 = var6_6.toString();
                Intrinsics.checkNotNullExpressionValue(var17_20, (String)var11_11);
                var1_1.replace(0, var3_3, (CharSequence)var17_20);
            }
            this.a = false;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "arg0");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        int n8;
        Object object = "query";
        Intrinsics.checkNotNullParameter(charSequence, (String)object);
        h h3 = this.b;
        Object object2 = h3.v;
        CharSequence charSequence2 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtInvalidCardNumber");
            n7 = 0;
            object2 = null;
        }
        ai0_2.i((View)object2);
        charSequence = h.Ra(((Object)charSequence).toString());
        h3.C = null;
        h3.F = null;
        h3.D = null;
        h3.Ua(null);
        n7 = ((String)charSequence).length();
        int n10 = 8;
        if (n7 == n10) {
            int n14 = 0;
            int n15 = 7;
            Object object3 = object2;
            object2 = new BinRequest(null, null, null, n15, null);
            ((BinRequest)object2).setBinNumber((String)charSequence);
            object3 = h3.Pa();
            Object object4 = h3.Qa().E;
            object3.getClass();
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object = ((op2_2)object3).a;
            object.getClass();
            Intrinsics.checkNotNullParameter(object2, "binRequest");
            Object object5 = UrlHelper.Companion.getInstance();
            Object object6 = new Object[]{};
            String string2 = "payment";
            String string3 = "bin_info";
            object5 = ((UrlHelper)object5).getApiUrl(string2, string3, object6);
            object6 = object4 != null ? ((TenantResponse)object4).getTenant() : null;
            ((BinRequest)object2).setTenant((Tenant)object6);
            if (object4 != null) {
                object4 = ((TenantResponse)object4).getAccessToken();
                ((BinRequest)object2).setAccessToken((String)object4);
            } else {
                object4 = "TenantResponse is null";
                mz3_0.F((String)object4);
            }
            object2 = JsonUtils.toJson(object2);
            object4 = JsonObject.class;
            object2 = (JsonObject)JsonUtils.fromJson((String)object2, object4);
            if (object2 == null) {
                object2 = new JsonObject();
            }
            object4 = ((oo2_1)object).a;
            object6 = "PAYMENT_BinInfo";
            object2 = object4.getBinInfo((String)object5, (JsonObject)object2, (String)object6);
            object4 = qt2_2.c;
            object2 = ((g53_0)object2).h((Scheduler)object4);
            object4 = ti_2.a();
            object2 = ((g53_0)object2).e((Scheduler)object4);
            object4 = new yn2_1((oo2_1)object);
            object = new zn2_2((Function1)object4);
            object4 = new s53_0((q63_0)object2, (bx0_2)object);
            object = new Object();
            object2 = new u53_0((q63_0)object4, (bx0_2)object);
            Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
            n14 = 3;
            object = new G8(object3, n14);
            object4 = new bp2_1((G8)object);
            object = new cp2_2(object3, 0);
            object5 = new dp2_1((cp2_2)object);
            object = ((g53_0)object2).f((o60_0)object4, (o60_0)object5);
            object2 = ((op2_2)object3).b;
            ((t30_0)object2).b((yr0_2)object);
        }
        if ((n8 = ((String)charSequence).length()) < n10) {
            h3.B = null;
            charSequence = h3.g;
            if (charSequence == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardImage");
                n8 = 0;
                charSequence = null;
            }
            charSequence.setImageBitmap(null);
            charSequence = h3.r;
            if (charSequence == null) {
                charSequence = "pfContainer";
                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
            } else {
                charSequence2 = charSequence;
            }
            charSequence2.setVisibility(n10);
        }
    }
}

