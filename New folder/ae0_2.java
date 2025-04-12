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
 *  android.widget.RadioGroup$OnCheckedChangeListener
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.HeaderRecyclerViewAdapter;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.IfscResponse;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from aE0
 */
public final class ae0_2
extends HeaderRecyclerViewAdapter {
    public final AppCompatActivity a;
    public final th2_0 b;
    public final ReturnOrderItemDetails c;
    public final boolean d;
    public final HashMap e;
    public final ArrayList f;
    public zd0_2 g;
    public boolean h;

    public ae0_2(AppCompatActivity arrayList, th2_0 object, ReturnOrderItemDetails object2, boolean bl2, HashMap hashMap) {
        boolean bl3;
        boolean bl4;
        Intrinsics.checkNotNullParameter(arrayList, "activity");
        Intrinsics.checkNotNullParameter(object, "mRefundOptionsCheckListener");
        String string2 = "returnOrderItemDetails";
        Intrinsics.checkNotNullParameter(object2, string2);
        this.a = arrayList;
        this.b = object;
        this.c = object2;
        this.d = bl2;
        this.e = hashMap;
        this.f = arrayList = new ArrayList<Object>();
        this.h = bl4 = true;
        arrayList.clear();
        object = ((ReturnOrderItemDetails)object2).getSelectedControllerConfirmedList().iterator();
        object2 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        while (bl3 = object.hasNext()) {
            object2 = (CartEntry)object.next();
            CartEntry cartEntry = ((CartEntry)object2).getOrderEntry();
            bl2 = cartEntry.isExchangeItem();
            boolean bl5 = this.d;
            if (bl2 && !bl5) {
                arrayList.add(object2);
            }
            if (!(bl2 = (cartEntry = ((CartEntry)object2).getOrderEntry()).isReturnItem()) || !bl5) continue;
            arrayList.add(object2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final boolean g() {
        block9: {
            block8: {
                block11: {
                    block10: {
                        var1_1 = this.g;
                        var2_2 = false;
                        if (var1_1 == null) break block9;
                        Intrinsics.checkNotNull(var1_1);
                        var3_3 = StringsKt.m0(String.valueOf(var1_1.l.getText())).toString();
                        var4_4 = var3_3.length();
                        var5_5 = var1_1.r;
                        var6_6 = 11;
                        var7_7 = "";
                        if (var4_4 < var6_6) {
                            var5_5.setText("IFSC code should be 11 characters long");
                            var8_8 = "IFSC Code :  IFSC code should be 11 characters long";
lbl13:
                            // 4 sources

                            while (true) {
                                var6_6 = 0;
                                var9_9 = null;
                                break block8;
                                break;
                            }
                        }
                        var9_9 = var1_1.e;
                        var8_8 = var3_3.subSequence(0, 4);
                        var4_4 = (int)var9_9.c((CharSequence)var8_8);
                        if (var4_4 != 0) break block10;
                        var5_5.setText("First 4 characters should have only alphabets");
                        var8_8 = "IFSC Code :  first 4 characters should have only alphabets";
                        ** GOTO lbl13
                    }
                    var8_8 = var1_1.d;
                    var4_4 = (int)var8_8.c(var3_3);
                    if (var4_4 != 0) break block11;
                    var5_5.setText("Allowed characters are A-Z,0-9");
                    var8_8 = "IFSC Code :  allowed characters are A-Z,0-9";
                    ** GOTO lbl13
                }
                var8_8 = var1_1.f;
                var4_4 = (int)var8_8.c(var3_3);
                if (var4_4 == 0) {
                    var5_5.setText("Please enter a valid format IFSC code");
                    var8_8 = "IFSC Code : please enter a valid format IFSC code";
                    ** continue;
                }
                var8_8 = var7_7;
                var6_6 = 1;
            }
            var10_10 = kotlin.text.b.k((CharSequence)var8_8);
            if (!var10_10) {
                var11_11 = var1_1.c;
                var11_11.U((String)var8_8, var3_3);
            }
            var12_12 = 8;
            if (var6_6 != 0) {
                var5_5.setVisibility(var12_12);
                var2_2 = true;
            } else {
                var5_5.setVisibility(0);
                var8_8 = var1_1.m;
                if (var8_8 != null) {
                    var8_8.setText((CharSequence)var7_7);
                }
                if (var8_8 != null) {
                    var8_8.setVisibility(var12_12);
                }
                var8_8 = var1_1.o;
                var8_8.setVisibility(var12_12);
                var1_1 = var1_1.n;
                var1_1.setVisibility(0);
            }
        }
        return var2_2;
    }

    public final int getBasicItemCount() {
        int n3;
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.size();
        }
        return n3;
    }

    public final int getBasicItemType(int n3) {
        return n3;
    }

    public final int getItemCount() {
        int n3 = this.getBasicItemCount();
        boolean bl2 = this.useFooter();
        if (bl2) {
            ++n3;
        }
        return n3;
    }

    public final void h(IfscResponse object) {
        Object object2 = this.g;
        if (object2 != null) {
            Object object3 = ((Object)StringsKt.m0(String.valueOf(((zd0_2)object2).l.getText()))).toString();
            AjioTextView ajioTextView = ((zd0_2)object2).n;
            View view = ((zd0_2)object2).o;
            AjioTextView ajioTextView2 = ((zd0_2)object2).r;
            object2 = ((zd0_2)object2).m;
            int n3 = 8;
            String string2 = "";
            if (object != null) {
                object3 = ((IfscResponse)object).getErrorMessage();
                boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
                if (!bl2) {
                    object = ((IfscResponse)object).getErrorMessage();
                    ajioTextView2.setText((CharSequence)object);
                    ajioTextView2.setVisibility(0);
                    if (object2 != null) {
                        object2.setText((CharSequence)string2);
                    }
                    if (object2 != null) {
                        object2.setVisibility(n3);
                    }
                    view.setVisibility(n3);
                    ajioTextView.setVisibility(0);
                } else {
                    object3 = ((IfscResponse)object).getImps();
                    bl2 = (Boolean)object3;
                    if (!bl2) {
                        object = "IMPS is not supported by your bank. Try with some other bank's account";
                        ajioTextView2.setText((CharSequence)object);
                        ajioTextView2.setVisibility(0);
                        if (object2 != null) {
                            object2.setText((CharSequence)string2);
                        }
                        if (object2 != null) {
                            object2.setVisibility(n3);
                        }
                        view.setVisibility(n3);
                        ajioTextView.setVisibility(0);
                    } else {
                        object3 = ((IfscResponse)object).getBranch();
                        if (object3 != null && !(bl2 = kotlin.text.b.k((CharSequence)object3))) {
                            string2 = ((IfscResponse)object).getBranch();
                        }
                        object3 = ((IfscResponse)object).getCity();
                        String string3 = ", ";
                        if (object3 != null && !(bl2 = kotlin.text.b.k((CharSequence)object3))) {
                            object3 = ((IfscResponse)object).getCity();
                            string2 = n1.a(string2, string3, (String)object3);
                        }
                        if ((object3 = ((IfscResponse)object).getState()) != null && !(bl2 = kotlin.text.b.k((CharSequence)object3))) {
                            object = ((IfscResponse)object).getState();
                            string2 = n1.a(string2, string3, (String)object);
                        }
                        if (object2 != null) {
                            object2.setText((CharSequence)string2);
                        }
                        if (object2 != null) {
                            object2.setVisibility(0);
                        }
                        view.setVisibility(0);
                        ajioTextView.setVisibility(n3);
                        ajioTextView2.setVisibility(n3);
                    }
                }
            } else {
                int n4;
                int n7 = ((String)object3).length();
                if (n7 != (n4 = 11)) {
                    ajioTextView2.setVisibility(n3);
                    if (object2 != null) {
                        object2.setText((CharSequence)string2);
                    }
                    if (object2 != null) {
                        object2.setVisibility(n3);
                    }
                    view.setVisibility(n3);
                    ajioTextView.setVisibility(0);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindBasicItemView(RecyclerView$B var1_1, int var2_2) {
        block69: {
            block65: {
                block66: {
                    block64: {
                        block68: {
                            block67: {
                                Intrinsics.checkNotNull(var1_1, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.exchangereturn.adapter.ExchangeReturnViewHolder");
                                var1_1 = (be0_2)var1_1;
                                var3_3 = this.f;
                                Intrinsics.checkNotNull(var3_3);
                                var4_4 = ((CartEntry)var3_3.get(var2_2)).getOrderEntry();
                                Intrinsics.checkNotNull(var4_4);
                                var1_1.getClass();
                                Intrinsics.checkNotNullParameter(var4_4, "cartEntry");
                                var3_3 = var4_4.getProduct();
                                var5_5 = var1_1.c;
                                var6_6 = 1;
                                var7_7 = 1.4E-45f;
                                if (var3_3 != null) {
                                    var8_8 /* !! */  = var4_4.getProduct().getImages();
                                    if (var8_8 /* !! */  != null) {
                                        var8_8 /* !! */  = var4_4.getProduct().getImages();
                                        Intrinsics.checkNotNull(var8_8 /* !! */ );
                                        var8_8 /* !! */  = var8_8 /* !! */ .iterator();
                                        while (var9_9 = var8_8 /* !! */ .hasNext()) {
                                            var10_10 = (ProductImage)var8_8 /* !! */ .next();
                                            var11_11 = var10_10.component1();
                                            var12_12 = var10_10.component2();
                                            var10_10 = var10_10.component3();
                                            var13_13 = "cartIcon";
                                            var14_14 = kotlin.text.b.i((String)var11_11, (String)var13_13, (boolean)var6_6);
                                            if (var14_14 == 0 || !(var9_9 = kotlin.text.b.i((String)var10_10, (String)(var11_11 = "PRIMARY"), (boolean)var6_6))) continue;
                                            var10_10 = new da$a();
                                            var10_10.k = var6_6;
                                            var10_10.r = var6_6;
                                            var14_14 = R$string.acc_banner;
                                            var11_11 = hv3_0.K(var14_14);
                                            var10_10.b((String)var11_11);
                                            var10_10.n = var11_11 = UrlHelper.Companion.getInstance().getImageUrl(var12_12);
                                            var10_10.u = var5_5;
                                            var10_10.a();
                                        }
                                    }
                                } else {
                                    var15_15 = R$drawable.item_dummy_noimg;
                                    var5_5.setImageResource(var15_15);
                                }
                                if ((var16_16 = var4_4.isExchangeItem()) == 0 && (var5_5 = var3_3.getCode()) != null && (var16_16 = var5_5.length()) != 0 && (var5_5 = var1_1.b) != null && (var15_15 = (int)var5_5.containsKey(var8_8 /* !! */  = var3_3.getCode())) == var6_6) {
                                    var17_17 = a21.a;
                                    var8_8 /* !! */  = a21$a.RETURN_INIT;
                                    var10_10 = var1_1.itemView;
                                    var11_11 = "itemView";
                                    Intrinsics.checkNotNullExpressionValue(var10_10, (String)var11_11);
                                    var3_3 = var3_3.getCode();
                                    var3_3 = (ArrayList)var5_5.get(var3_3);
                                    a21.i((a21)var17_17, (a21$a)var8_8 /* !! */ , (View)var10_10, (ArrayList)var3_3);
                                }
                                var3_3 = var1_1.a.getOrderCode();
                                Intrinsics.checkNotNullExpressionValue(var3_3, "getOrderCode(...)");
                                var5_5 = "EX";
                                var6_6 = 0;
                                var7_7 = 0.0f;
                                var17_17 = null;
                                var18_18 = kotlin.text.b.s((String)var3_3, (String)var5_5, false);
                                if (var18_18) {
                                    var4_4.setExchangeEligible(false);
                                }
                                var18_18 = var4_4.isReturnItem();
                                var5_5 = var1_1.d;
                                var8_8 /* !! */  = var1_1.e;
                                var10_10 = var1_1.g;
                                var11_11 = var1_1.f;
                                var19_19 = 8;
                                if (!var18_18) break block65;
                                var5_5.setText((CharSequence)"Return Request");
                                var11_11.setVisibility(0);
                                var10_10.setVisibility(0);
                                var3_3 = var4_4.getBasePrice();
                                var5_5 = var4_4.getProduct().getWasPriceData();
                                var13_13 = var3_3 != null ? var3_3.getFormattedValue() : "0.0";
                                var13_13 = mz3_0.H((String)var13_13);
                                var11_11.setText((CharSequence)var13_13);
                                var13_13 = "0.0f";
                                if (var3_3 != null) {
                                    var20_20 = var3_3.getValue();
                                    if (var20_20 != null) {
                                        var21_21 = Float.parseFloat((String)var20_20);
                                    } else {
                                        var22_22 = 0;
                                        var21_21 = 0.0f;
                                        var20_20 = null;
                                    }
                                } else {
                                    var21_21 = Float.parseFloat((String)var13_13);
                                }
                                if (var5_5 != null) {
                                    var13_13 = var5_5.getValue();
                                    if (var13_13 != null) {
                                        var23_23 = Float.parseFloat((String)var13_13);
                                    } else {
                                        var24_24 = 0;
                                        var23_23 = 0.0f;
                                        var13_13 = null;
                                    }
                                } else {
                                    var23_23 = Float.parseFloat((String)var13_13);
                                }
                                var21_21 = (var23_23 - var21_21) / var23_23;
                                var23_23 = 100;
                                var24_24 = ok1_1.b(var21_21 *= var23_23);
                                if (var5_5 != null) {
                                    var5_5.getFormattedValue();
                                }
                                if (var24_24 <= 0) {
                                    var10_10.setVisibility(var19_19);
                                } else {
                                    var10_10.setVisibility(var19_19);
                                }
                                var16_16 = (int)var4_4.isReturnItem();
                                if (var16_16 == 0) break block66;
                                var5_5 = var4_4.getTotalPrice();
                                var9_9 = false;
                                var10_10 = null;
                                if (var3_3 != null) {
                                    var3_3 = var5_5.getValue();
                                    if (var3_3 != null) {
                                        var25_25 = Float.parseFloat((String)var3_3);
                                        var3_3 = Float.valueOf(var25_25);
                                    } else {
                                        var18_18 = false;
                                        var3_3 = null;
                                        var25_25 = 0.0f;
                                    }
                                } else {
                                    var3_3 = Float.valueOf(0.0f);
                                }
                                var5_5 = var4_4.getOrderTotalQuantity();
                                if (var5_5 != null) {
                                    var16_16 = var5_5.intValue();
                                    if (var3_3 != null) {
                                        var25_25 = var3_3.floatValue();
                                        var26_26 = var16_16;
                                        var3_3 = Float.valueOf(var25_25 /= var26_26);
                                    } else {
                                        var18_18 = false;
                                        var3_3 = null;
                                        var25_25 = 0.0f;
                                    }
                                }
                                var5_5 = cp_1.Companion;
                                var5_5.getClass();
                                var16_16 = (int)cp$a.w();
                                var1_1 = var1_1.h;
                                if (var16_16 == 0) ** GOTO lbl287
                                var1_1.setVisibility(0);
                                var16_16 = (int)cp$a.k((CartEntry)var4_4);
                                if (var16_16 == 0) break block67;
                                var5_5 = var4_4.getConvenienceFee();
                                if (var5_5 != null && (var5_5 = var5_5.getRVP()) != null) {
                                    var5_5 = var5_5.isFeeCharged();
                                    var13_13 = Boolean.TRUE;
                                    var16_16 = (int)Intrinsics.areEqual(var5_5, var13_13);
                                } else {
                                    var16_16 = 0;
                                    var26_26 = 0.0f;
                                    var5_5 = null;
                                }
                                if (var16_16 == 0) ** GOTO lbl-1000
                                var5_5 = var4_4.getConvenienceFee();
                                if (var5_5 != null && (var5_5 = var5_5.getRVP()) != null) {
                                    var26_26 = var5_5.getNetAmount();
                                    var5_5 = Float.valueOf(var26_26);
                                } else {
                                    var16_16 = 0;
                                    var5_5 = null;
                                    var26_26 = 0.0f;
                                }
                                if (var5_5 != null) {
                                    var26_26 = var5_5.floatValue();
                                    var13_13 = var4_4.getOrderTotalQuantity();
                                    if (var13_13 != null) {
                                        var24_24 = var13_13.intValue();
                                    } else {
                                        var24_24 = 0;
                                        var23_23 = 0.0f;
                                        var13_13 = null;
                                    }
                                    var23_23 = var24_24;
                                    var26_26 = var26_26 / var23_23 + 0.0f;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var16_16 = 0;
                                    var26_26 = 0.0f;
                                    var5_5 = null;
                                }
                                var13_13 = var4_4.getConvenienceFee();
                                if (var13_13 != null && (var13_13 = var13_13.getCOD()) != null) {
                                    var13_13 = var13_13.isFeeCharged();
                                    var20_20 = Boolean.TRUE;
                                    var24_24 = (int)Intrinsics.areEqual(var13_13, var20_20);
                                } else {
                                    var24_24 = 0;
                                    var23_23 = 0.0f;
                                    var13_13 = null;
                                }
                                if (var24_24 != 0) {
                                    var13_13 = var4_4.getConvenienceFee();
                                    if (var13_13 != null && (var13_13 = var13_13.getCOD()) != null) {
                                        var23_23 = var13_13.getNetAmount();
                                        var13_13 = Float.valueOf(var23_23);
                                    } else {
                                        var24_24 = 0;
                                        var13_13 = null;
                                        var23_23 = 0.0f;
                                    }
                                    if (var13_13 != null) {
                                        var23_23 = var13_13.floatValue();
                                        var20_20 = var4_4.getOrderTotalQuantity();
                                        if (var20_20 != null) {
                                            var22_22 = var20_20.intValue();
                                        } else {
                                            var22_22 = 0;
                                            var21_21 = 0.0f;
                                            var20_20 = null;
                                        }
                                        var21_21 = var22_22;
                                        var26_26 += (var23_23 /= var21_21);
                                    }
                                }
                                if ((var13_13 = var4_4.getConvenienceFee()) != null && (var13_13 = var13_13.getDelivery()) != null) {
                                    var13_13 = var13_13.isFeeCharged();
                                    var20_20 = Boolean.TRUE;
                                    var24_24 = (int)Intrinsics.areEqual(var13_13, var20_20);
                                } else {
                                    var24_24 = 0;
                                    var23_23 = 0.0f;
                                    var13_13 = null;
                                }
                                if (var24_24 != 0) {
                                    var13_13 = var4_4.getConvenienceFee();
                                    if (var13_13 != null && (var13_13 = var13_13.getDelivery()) != null) {
                                        var23_23 = var13_13.getNetAmount();
                                        var13_13 = Float.valueOf(var23_23);
                                    } else {
                                        var24_24 = 0;
                                        var13_13 = null;
                                        var23_23 = 0.0f;
                                    }
                                    if (var13_13 != null) {
                                        var23_23 = var13_13.floatValue();
                                        var20_20 = var4_4.getOrderTotalQuantity();
                                        if (var20_20 != null) {
                                            var22_22 = var20_20.intValue();
                                        } else {
                                            var22_22 = 0;
                                            var21_21 = 0.0f;
                                            var20_20 = null;
                                        }
                                        var21_21 = var22_22;
                                        var26_26 += (var23_23 /= var21_21);
                                    }
                                }
                                if ((var24_24 = (int)h40_0.P1()) != 0) {
                                    var13_13 = var4_4.getConvenienceFee();
                                    if (var13_13 != null && (var13_13 = var13_13.getPriorityDelivery()) != null) {
                                        var13_13 = var13_13.isFeeCharged();
                                        var20_20 = Boolean.TRUE;
                                        var24_24 = (int)Intrinsics.areEqual(var13_13, var20_20);
                                    } else {
                                        var24_24 = 0;
                                        var23_23 = 0.0f;
                                        var13_13 = null;
                                    }
                                    if (var24_24 != 0) {
                                        var13_13 = var4_4.getConvenienceFee();
                                        if (var13_13 != null && (var13_13 = var13_13.getPriorityDelivery()) != null) {
                                            var23_23 = var13_13.getNetAmount();
                                            var13_13 = Float.valueOf(var23_23);
                                        } else {
                                            var24_24 = 0;
                                            var13_13 = null;
                                            var23_23 = 0.0f;
                                        }
                                        if (var13_13 != null) {
                                            var23_23 = var13_13.floatValue();
                                            var20_20 = var4_4.getOrderTotalQuantity();
                                            if (var20_20 != null) {
                                                var6_6 = var20_20.intValue();
                                            }
                                            var7_7 = var6_6;
                                            var26_26 += (var23_23 /= var7_7);
                                        }
                                    }
                                }
                                break block68;
                            }
                            var5_5 = var4_4.getOrderTotalQuantity();
                            if (var5_5 == null) ** GOTO lbl-1000
                            var16_16 = var5_5.intValue();
                            var17_17 = var4_4.getConvenienceFee();
                            if (var17_17 != null && (var17_17 = var17_17.getTotal()) != null) {
                                var7_7 = var17_17.getNetAmount();
                                var26_26 = var16_16;
                                var7_7 /= var26_26;
                                var26_26 = var7_7;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var16_16 = 0;
                                var26_26 = 0.0f;
                                var5_5 = null;
                            }
                        }
                        if ((var17_17 = var4_4.getOrderTotalQuantity()) == null) ** GOTO lbl-1000
                        var6_6 = var17_17.intValue();
                        var13_13 = var4_4.getConvenienceFee();
                        if (var13_13 != null && (var13_13 = var13_13.getTotal()) != null) {
                            var23_23 = var13_13.getNetAmount();
                            var7_7 = var6_6;
                            var23_23 /= var7_7;
                        } else lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                var24_24 = 0;
                                var23_23 = 0.0f;
                                var13_13 = null;
                                break block64;
                                break;
                            }
lbl287:
                            // 1 sources

                            var16_16 = 0;
                            var26_26 = 0.0f;
                            var5_5 = null;
                            ** continue;
                        }
                    }
                    var2_2 = (int)cp$a.m((CartEntry)var4_4);
                    if (var2_2 != 0 || (var2_2 = (int)((cfr_temp_0 = var26_26 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1))) <= 0) {
                        var1_1.setVisibility(var19_19);
                    }
                    if (var3_3 != null) {
                        var27_27 = var3_3.floatValue() + var23_23;
                        var10_10 = Float.valueOf(var27_27);
                    }
                    var1_1 = cp$a.f(String.valueOf(var10_10));
                    var11_11.setText((CharSequence)var1_1);
                }
                var8_8 /* !! */ .setVisibility(var19_19);
                break block69;
            }
            var28_28 = var4_4.isExchangeItem();
            if (var28_28) {
                var5_5.setText((CharSequence)"Exchange Request");
                var1_1 = var4_4.getProduct().getSelectedSize();
                var3_3 = "Exchange with size <B>";
                var4_4 = new StringBuilder((String)var3_3);
                var4_4.append((String)var1_1);
                var4_4.append("</B>");
                var1_1 = hv3_0.f(var4_4.toString());
                var8_8 /* !! */ .setText((CharSequence)var1_1);
                var8_8 /* !! */ .setVisibility(0);
                var11_11.setVisibility(var19_19);
                var10_10.setVisibility(var19_19);
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onBindFooterView(RecyclerView$B var1_1, int var2_2) {
        block95: {
            block94: {
                block93: {
                    block101: {
                        block103: {
                            block91: {
                                block102: {
                                    block92: {
                                        block90: {
                                            block100: {
                                                block98: {
                                                    block97: {
                                                        block96: {
                                                            var3_3 = this;
                                                            var4_4 = var1_1;
                                                            var5_7 = true;
                                                            var6_8 = 1.4E-45f;
                                                            var7_9 = 0;
                                                            var8_10 = 0.0f;
                                                            var9_11 = null;
                                                            Intrinsics.checkNotNull(var1_1, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.exchangereturn.adapter.ExchangeReturnFooterViewHolder");
                                                            var10_12 = var1_1;
                                                            var10_12 = (zd0_2)var1_1;
                                                            var11_13 = this.h;
                                                            var12_14 = var10_12.b;
                                                            var13_15 = var10_12.w;
                                                            var14_16 = var12_14.getRefundOptions();
                                                            var15_17 = "storeCredit";
                                                            var16_18 = var10_12.u;
                                                            var17_19 = var10_12.v;
                                                            var18_20 = 8;
                                                            var19_21 /* !! */  = var10_12.h;
                                                            if (var14_16 == null || (var20_22 = (var14_16 = var12_14.getRefundOptions()).size()) == 0) break block96;
                                                            var12_14.setSelectedRefundOption("");
                                                            var16_18.setVisibility(0);
                                                            ai0_2.i((View)var17_19);
                                                            var14_16 = var12_14.getRefundOptions();
                                                            var20_22 = (int)var14_16.contains(var15_17);
                                                            if (var20_22 != 0) {
                                                                var19_21 /* !! */ .setVisibility(0);
                                                                var10_12.w();
                                                            } else {
                                                                var19_21 /* !! */ .setVisibility(var18_20);
                                                            }
                                                            var14_16 = z40_0.Companion;
                                                            var14_16 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var14_16).a;
                                                            var20_22 = (int)var14_16.a("enableIMPS");
                                                            var16_18 = var10_12.i;
                                                            if (var20_22 != 0) {
                                                                var14_16 = var12_14.getRefundOptions();
                                                                var20_22 = (int)var14_16.contains(var21_23 = "bankTransfer");
                                                                if (var20_22 != 0) {
                                                                    var16_18.setVisibility(0);
                                                                    var12_14.setRefundToBankSelected(var5_7);
                                                                } else {
                                                                    var16_18.setVisibility(var18_20);
                                                                    var12_14.setRefundToBankSelected(false);
                                                                }
                                                            } else {
                                                                var16_18.setVisibility(var18_20);
                                                                var12_14.setRefundToBankSelected(false);
                                                            }
                                                            var14_16 = var10_12.g;
                                                            var14_16.clearCheck();
                                                            var16_18 = new vd0_1((zd0_2)var10_12, (boolean)var11_13);
                                                            var14_16.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener)var16_18);
                                                            var11_13 = var12_14.isRefundToBankSelected();
                                                            if (var11_13 != 0) {
                                                                var11_13 = R$id.rb_banktransfer;
                                                                var14_16.check(var11_13);
                                                                break block97;
                                                            } else {
                                                                var11_13 = (int)var12_14.isAjioStoreCreditsSelected();
                                                                if (var11_13 != 0) {
                                                                    var11_13 = R$id.rb_ajiostorecredits;
                                                                    var14_16.check(var11_13);
                                                                }
                                                            }
                                                            break block97;
                                                        }
                                                        var16_18.setVisibility(var18_20);
                                                        ai0_2.B((View)var17_19);
                                                    }
                                                    var4_4 = cp_1.Companion;
                                                    var4_4.getClass();
                                                    var11_13 = cp$a.w();
                                                    var14_16 = var10_12.A;
                                                    if (var11_13 == 0 && var14_16 != null) {
                                                        ai0_2.i((View)var14_16);
                                                    }
                                                    if ((var11_13 = var12_14.isRefundToBankSelected()) != 0 || (var11_13 = var12_14.isAjioStoreCreditsSelected()) != 0) {
                                                        ai0_2.i((View)var17_19);
                                                    }
                                                    var4_4 = new ArrayList();
                                                    var22_24 = 0;
                                                    var23_25 = 0.0f;
                                                    var16_18 = null;
                                                    var10_12.C = 0.0f;
                                                    var17_19 = var12_14.getSelectedControllerConfirmedList();
                                                    if (var17_19 == null) break block98;
                                                    var17_19 = var17_19.iterator();
                                                    var24_26 = 0.0f;
                                                    var25_27 = null;
                                                    var26_28 = 0.0f;
                                                    var27_29 = null;
                                                    var28_30 = 0.0f;
                                                    var29_31 = null;
                                                    var30_32 = 0.0;
                                                    var32_33 = 0.0f;
                                                    var33_34 = null;
                                                    while (var34_35 = var17_19.hasNext()) {
                                                        block88: {
                                                            block89: {
                                                                block99: {
                                                                    var35_36 = (CartEntry)var17_19.next();
                                                                    var36_37 = var35_36.getOrderEntry();
                                                                    var4_4.add(var36_37);
                                                                    var36_37 = var35_36.getOrderEntry();
                                                                    if (var36_37 != null && (var36_37 = var36_37.getTotalPrice()) != null) {
                                                                        var36_37 = var36_37.getValue();
                                                                    } else {
                                                                        var18_20 = 0;
                                                                        var36_37 = null;
                                                                    }
                                                                    if (var36_37 == null || (var18_20 = var36_37.length()) == 0) {
                                                                        while (true) {
                                                                            var37_38 = var17_19;
                                                                            break block88;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if ((var36_37 = var35_36.getOrderEntry()) == null) ** continue;
                                                                    var18_20 = var36_37.getReturnEditedQuantity();
                                                                    var33_34 = var35_36.getOrderEntry();
                                                                    if (var33_34 != null && (var33_34 = var33_34.getTotalPrice()) != null) {
                                                                        var33_34 = var33_34.getValue();
                                                                    } else {
                                                                        var32_33 = 0.0f;
                                                                        var33_34 = null;
                                                                    }
                                                                    Intrinsics.checkNotNull(var33_34);
                                                                    var32_33 = Float.parseFloat((String)var33_34);
                                                                    var38_39 = var35_36.getOrderEntry();
                                                                    var39_40 = var38_39.getOrderTotalQuantity();
                                                                    var9_11 = "getOrderTotalQuantity(...)";
                                                                    Intrinsics.checkNotNullExpressionValue(var39_40, (String)var9_11);
                                                                    var6_8 = var39_40.floatValue();
                                                                    var32_33 /= var6_8;
                                                                    var6_8 = var10_12.C;
                                                                    var40_41 = var18_20;
                                                                    var10_12.C = var6_8 = (var32_33 *= var40_41) + var6_8;
                                                                    var39_40 = var12_14.getActionContent();
                                                                    if (var39_40 != null && (var39_40 = var39_40.getReturn_fee()) != null) {
                                                                        var32_33 = var6_8 = var39_40.floatValue();
                                                                    } else {
                                                                        var32_33 = 0.0f;
                                                                        var33_34 = null;
                                                                    }
                                                                    var6_8 = var32_33 * var40_41;
                                                                    var28_30 = var6_8 + var28_30;
                                                                    var39_40 = var35_36.getOrderEntry().getBankDiscountPromoAmt();
                                                                    if (var39_40 != null) {
                                                                        var41_42 = var39_40.doubleValue();
                                                                        var39_40 = var35_36.getOrderEntry().getOrderTotalQuantity();
                                                                        Intrinsics.checkNotNullExpressionValue(var39_40, (String)var9_11);
                                                                        var43_43 = var39_40.doubleValue();
                                                                        var41_42 /= var43_43;
                                                                        var37_38 = var17_19;
                                                                        var45_44 = var18_20;
                                                                        var30_32 = (var41_42 *= var45_44) + var30_32;
                                                                    } else {
                                                                        var37_38 = var17_19;
                                                                    }
                                                                    var16_18 = cp_1.Companion;
                                                                    var17_19 = var35_36.getOrderEntry();
                                                                    var16_18.getClass();
                                                                    var22_24 = cp$a.k((CartEntry)var17_19);
                                                                    if (var22_24 == 0) break block99;
                                                                    var16_18 = var35_36.getOrderEntry();
                                                                    if (var16_18 != null && (var16_18 = var16_18.getConvenienceFee()) != null && (var16_18 = var16_18.getRVP()) != null) {
                                                                        var16_18 = var16_18.isFeeCharged();
                                                                        var17_19 = Boolean.TRUE;
                                                                        var22_24 = Intrinsics.areEqual(var16_18, var17_19);
                                                                    } else {
                                                                        var22_24 = 0;
                                                                        var23_25 = 0.0f;
                                                                        var16_18 = null;
                                                                    }
                                                                    if (var22_24 != 0) {
                                                                        var16_18 = var35_36.getOrderEntry();
                                                                        if (var16_18 != null && (var16_18 = var16_18.getConvenienceFee()) != null && (var16_18 = var16_18.getRVP()) != null) {
                                                                            var23_25 = var16_18.getNetAmount();
                                                                            var16_18 = Float.valueOf(var23_25);
                                                                        } else {
                                                                            var22_24 = 0;
                                                                            var23_25 = 0.0f;
                                                                            var16_18 = null;
                                                                        }
                                                                        if (var16_18 != null) {
                                                                            var23_25 = var16_18.floatValue();
                                                                            var17_19 = var35_36.getOrderEntry().getOrderTotalQuantity();
                                                                            Intrinsics.checkNotNullExpressionValue(var17_19, (String)var9_11);
                                                                            var47_45 = var17_19.floatValue();
                                                                            var23_25 = var23_25 / var47_45 * var40_41;
                                                                            var26_28 = var23_25 + var26_28;
                                                                        }
                                                                    }
                                                                    if ((var16_18 = var35_36.getOrderEntry()) != null && (var16_18 = var16_18.getConvenienceFee()) != null && (var16_18 = var16_18.getCOD()) != null) {
                                                                        var16_18 = var16_18.isFeeCharged();
                                                                        var17_19 = Boolean.TRUE;
                                                                        var22_24 = Intrinsics.areEqual(var16_18, var17_19);
                                                                    } else {
                                                                        var22_24 = 0;
                                                                        var23_25 = 0.0f;
                                                                        var16_18 = null;
                                                                    }
                                                                    if (var22_24 != 0) {
                                                                        var16_18 = var35_36.getOrderEntry();
                                                                        if (var16_18 != null && (var16_18 = var16_18.getConvenienceFee()) != null && (var16_18 = var16_18.getCOD()) != null) {
                                                                            var23_25 = var16_18.getNetAmount();
                                                                            var16_18 = Float.valueOf(var23_25);
                                                                        } else {
                                                                            var22_24 = 0;
                                                                            var23_25 = 0.0f;
                                                                            var16_18 = null;
                                                                        }
                                                                        if (var16_18 != null) {
                                                                            var23_25 = var16_18.floatValue();
                                                                            var17_19 = var35_36.getOrderEntry().getOrderTotalQuantity();
                                                                            Intrinsics.checkNotNullExpressionValue(var17_19, (String)var9_11);
                                                                            var47_45 = var17_19.floatValue();
                                                                            var23_25 = var23_25 / var47_45 * var40_41;
                                                                            var26_28 = var23_25 + var26_28;
                                                                        }
                                                                    }
                                                                    if ((var16_18 = var35_36.getOrderEntry()) != null && (var16_18 = var16_18.getConvenienceFee()) != null && (var16_18 = var16_18.getDelivery()) != null) {
                                                                        var16_18 = var16_18.isFeeCharged();
                                                                        var17_19 = Boolean.TRUE;
                                                                        var22_24 = (int)Intrinsics.areEqual(var16_18, var17_19);
                                                                    } else {
                                                                        var22_24 = 0;
                                                                        var23_25 = 0.0f;
                                                                        var16_18 = null;
                                                                    }
                                                                    if (var22_24 != 0) {
                                                                        var16_18 = var35_36.getOrderEntry();
                                                                        if (var16_18 != null && (var16_18 = var16_18.getConvenienceFee()) != null && (var16_18 = var16_18.getDelivery()) != null) {
                                                                            var23_25 = var16_18.getNetAmount();
                                                                            var16_18 = Float.valueOf(var23_25);
                                                                        } else {
                                                                            var22_24 = 0;
                                                                            var23_25 = 0.0f;
                                                                            var16_18 = null;
                                                                        }
                                                                        if (var16_18 != null) {
                                                                            var23_25 = var16_18.floatValue();
                                                                            var17_19 = var35_36.getOrderEntry().getOrderTotalQuantity();
                                                                            Intrinsics.checkNotNullExpressionValue(var17_19, (String)var9_11);
                                                                            var47_45 = var17_19.floatValue();
                                                                            var26_28 = var23_25 = var23_25 / var47_45 * var40_41 + var26_28;
                                                                        }
                                                                    }
                                                                    if ((var22_24 = h40_0.P1()) == 0) break block89;
                                                                    var16_18 = var35_36.getOrderEntry();
                                                                    if (var16_18 != null && (var16_18 = var16_18.getConvenienceFee()) != null && (var16_18 = var16_18.getPriorityDelivery()) != null) {
                                                                        var16_18 = var16_18.isFeeCharged();
                                                                        var17_19 = Boolean.TRUE;
                                                                        var22_24 = (int)Intrinsics.areEqual(var16_18, var17_19);
                                                                    } else {
                                                                        var22_24 = 0;
                                                                        var23_25 = 0.0f;
                                                                        var16_18 = null;
                                                                    }
                                                                    if (var22_24 != 0) {
                                                                        var16_18 = var35_36.getOrderEntry();
                                                                        if (var16_18 != null && (var16_18 = var16_18.getConvenienceFee()) != null && (var16_18 = var16_18.getPriorityDelivery()) != null) {
                                                                            var23_25 = var16_18.getNetAmount();
                                                                            var16_18 = Float.valueOf(var23_25);
                                                                        } else {
                                                                            var22_24 = 0;
                                                                            var23_25 = 0.0f;
                                                                            var16_18 = null;
                                                                        }
                                                                        if (var16_18 != null) {
                                                                            var23_25 = var16_18.floatValue();
                                                                            var17_19 = var35_36.getOrderEntry().getOrderTotalQuantity();
                                                                            Intrinsics.checkNotNullExpressionValue(var17_19, (String)var9_11);
                                                                            var47_45 = var17_19.floatValue();
lbl248:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var23_25 = var23_25 / var47_45 * var40_41;
                                                                                var26_28 = var23_25 + var26_28;
                                                                                break block89;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    break block89;
                                                                }
                                                                var16_18 = var35_36.getOrderEntry().getConvenienceFee();
                                                                if (var16_18 != null && (var16_18 = var16_18.getTotal()) != null) {
                                                                    var23_25 = var16_18.getNetAmount();
                                                                    var17_19 = var35_36.getOrderEntry().getOrderTotalQuantity();
                                                                    Intrinsics.checkNotNullExpressionValue(var17_19, (String)var9_11);
                                                                    var47_45 = var17_19.floatValue();
                                                                    ** continue;
                                                                }
                                                            }
                                                            if ((var16_18 = var35_36.getOrderEntry().getConvenienceFee()) != null && (var16_18 = var16_18.getTotal()) != null) {
                                                                var23_25 = var16_18.getNetAmount();
                                                                var17_19 = var35_36.getOrderEntry().getOrderTotalQuantity();
                                                                Intrinsics.checkNotNullExpressionValue(var17_19, (String)var9_11);
                                                                var8_10 = var17_19.floatValue();
                                                                var23_25 = var23_25 / var8_10 * var40_41;
                                                                var24_26 += var23_25;
                                                            }
                                                        }
                                                        var17_19 = var37_38;
                                                        var5_7 = true;
                                                        var6_8 = 1.4E-45f;
                                                        var7_9 = 0;
                                                        var8_10 = 0.0f;
                                                        var9_11 = null;
                                                        var22_24 = 0;
                                                        var23_25 = 0.0f;
                                                        var16_18 = null;
                                                    }
                                                    var8_10 = var28_30;
                                                    var23_25 = var32_33;
                                                    break block100;
                                                }
                                                var7_9 = 0;
                                                var8_10 = 0.0f;
                                                var9_11 = null;
                                                var22_24 = 0;
                                                var23_25 = 0.0f;
                                                var16_18 = null;
                                                var24_26 = 0.0f;
                                                var25_27 = null;
                                                var26_28 = 0.0f;
                                                var27_29 = null;
                                                var30_32 = 0.0;
                                            }
                                            var17_19 = cp_1.Companion;
                                            var17_19.getClass();
                                            var48_46 = cp$a.u();
                                            if (!var48_46) {
                                                var10_12.C = var47_45 = var10_12.C + var24_26;
                                                var48_46 = cp$a.l(var4_4);
                                                if (var48_46) {
                                                    var10_12.C = var47_45 = var10_12.C - var26_28;
                                                }
                                            }
                                            var47_45 = var10_12.C;
                                            var36_37 = Float.valueOf(var47_45);
                                            Intrinsics.checkNotNull(var36_37);
                                            var49_47 = (double)var47_45 - var30_32;
                                            var51_48 /* !! */  = var12_14.isSelfShip();
                                            if (var51_48 /* !! */  != 0) {
                                                cp$a.e().getClass();
                                                var21_23 = cp_1.B();
                                                var40_41 = Float.parseFloat((String)var21_23);
                                                var52_49 = var40_41;
                                                var49_47 += var52_49;
                                            }
                                            var21_23 = h40_0.a;
                                            var51_48 /* !! */  = h40_0.g2();
                                            if (var51_48 /* !! */  != 0) {
                                                var5_7 = false;
                                                var6_8 = 0.0f;
                                                var39_40 = null;
                                                cfr_temp_0 = var8_10 - 0.0f;
                                                var51_48 /* !! */  = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                                if (var51_48 /* !! */  > 0) {
                                                    var52_49 = var8_10;
                                                    var49_47 -= var52_49;
                                                }
                                            }
                                            if ((var7_9 = (cfr_temp_1 = var49_47 - (var52_49 = 0.0)) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1)) >= 0) {
                                                var52_49 = var49_47;
                                            }
                                            var9_11 = hv3_0.K(R$string.total_refund_amount_detail);
                                            var17_19 = cp$a.f(String.valueOf(var52_49));
                                            var9_11 = n1.a((String)var9_11, " ", (String)var17_19);
                                            var10_12.x.setText((CharSequence)var9_11);
                                            var4_4 = var4_4.iterator();
                                            var7_9 = 0;
                                            var8_10 = 0.0f;
                                            var9_11 = null;
                                            var48_46 = false;
                                            var47_45 = 0.0f;
                                            var17_19 = null;
                                            var18_20 = 0;
                                            var36_37 = null;
                                            var51_48 /* !! */  = 0;
                                            var40_41 = 0.0f;
                                            var21_23 = null;
                                            while ((var54_50 = var4_4.hasNext()) != 0) {
                                                var37_38 = (CartEntry)var4_4.next();
                                                var25_27 = var37_38.getConvenienceFee().getDelivery();
                                                if (var25_27 != null) {
                                                    var25_27 = var25_27.isFeeCharged();
                                                    var39_40 = Boolean.TRUE;
                                                    var5_7 = Intrinsics.areEqual(var25_27, var39_40);
                                                } else {
                                                    var5_7 = false;
                                                    var6_8 = 0.0f;
                                                    var39_40 = null;
                                                }
                                                if (var5_7) {
                                                    var7_9 = 1;
                                                    var8_10 = 1.4E-45f;
                                                    continue;
                                                }
                                                var39_40 = var37_38.getConvenienceFee().getCOD();
                                                if (var39_40 != null) {
                                                    var39_40 = var39_40.isFeeCharged();
                                                    var25_27 = Boolean.TRUE;
                                                    var5_7 = Intrinsics.areEqual(var39_40, var25_27);
                                                } else {
                                                    var5_7 = false;
                                                    var6_8 = 0.0f;
                                                    var39_40 = null;
                                                }
                                                if (var5_7) {
                                                    var18_20 = 1;
                                                    continue;
                                                }
                                                var39_40 = var37_38.getConvenienceFee().getRVP();
                                                if (var39_40 != null) {
                                                    var39_40 = var39_40.isFeeCharged();
                                                    var25_27 = Boolean.TRUE;
                                                    var5_7 = Intrinsics.areEqual(var39_40, var25_27);
                                                } else {
                                                    var5_7 = false;
                                                    var6_8 = 0.0f;
                                                    var39_40 = null;
                                                }
                                                if (var5_7) {
                                                    var48_46 = true;
                                                    var47_45 = 1.4E-45f;
                                                    continue;
                                                }
                                                var5_7 = h40_0.P1();
                                                if (!var5_7) continue;
                                                var39_40 = var37_38.getConvenienceFee().getPriorityDelivery();
                                                if (var39_40 != null) {
                                                    var39_40 = var39_40.isFeeCharged();
                                                    var37_38 = Boolean.TRUE;
                                                    var5_7 = Intrinsics.areEqual(var39_40, var37_38);
                                                } else {
                                                    var5_7 = false;
                                                    var6_8 = 0.0f;
                                                    var39_40 = null;
                                                }
                                                if (!var5_7) continue;
                                                var51_48 /* !! */  = 1;
                                                var40_41 = 1.4E-45f;
                                            }
                                            try {
                                                var4_4 = var10_12.y;
                                                var54_50 = 0;
                                                var55_51 = 0.0f;
                                                var37_38 = null;
                                                var39_40 = new xd0_2(var10_12, 0);
                                                var4_4.setOnClickListener((View.OnClickListener)var39_40);
                                                var4_4 = h40_0.a;
                                                var11_13 = (int)h40_0.g2();
                                                if (var11_13 != 0) {
                                                    var4_4 = null;
                                                }
                                                ** GOTO lbl-1000
                                            }
                                            catch (Exception var4_5) {
                                                break block90;
                                            }
                                            cfr_temp_2 = var23_25 - 0.0f;
                                            var11_13 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                                            if (var11_13 > 0) {
                                                var11_13 = 1;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var11_13 = 0;
                                                var4_4 = null;
                                            }
                                            var39_40 = "{return_fee}";
                                            var55_51 = 1.0f;
                                            var25_27 = var10_12.z;
                                            var3_3 = var10_12.B;
                                            var54_50 = var26_28 == var55_51 ? 0 : (var26_28 < var55_51 ? -1 : 1);
                                            if (var54_50 >= 0) break block101;
                                            {
                                                ai0_2.i((View)var25_27);
                                                ai0_2.i((View)var14_16);
                                                ai0_2.B((View)var13_15);
                                                if (var11_13 == 0) break block91;
                                                ai0_2.B((View)var14_16);
                                                ai0_2.B((View)var3_3);
                                                var4_4 = var12_14.getActionContent();
                                                if (var4_4 == null || (var4_4 = var4_4.getReturn_fee_strip()) == null) break block92;
                                            }
                                            var7_9 = (int)var23_25;
                                            var9_11 = String.valueOf(var7_9);
                                            var20_22 = 0;
                                            var14_16 = null;
                                            var36_37 = kotlin.text.b.n((String)var4_4, (String)var39_40, (String)var9_11, false);
                                            break block102;
                                        }
                                        var29_31 = var10_12;
                                        var56_52 = var19_21 /* !! */ ;
                                        break block94;
                                    }
                                    var18_20 = 0;
                                    var36_37 = null;
                                }
                                var3_3.setText((CharSequence)var36_37);
                                break block103;
                            }
                            ai0_2.i((View)var3_3);
                        }
                        var29_31 = var10_12;
                        var56_52 = var19_21 /* !! */ ;
                        break block95;
                    }
                    var37_38 = cp_1.Companion;
                    var37_38.getClass();
                    var54_50 = (int)cp$a.w();
                    if (var54_50 != 0) {
                        ai0_2.B((View)var14_16);
                    }
                    ai0_2.B((View)var13_15);
                    if (!(var7_9 != 0 || var48_46 || var18_20 != 0 || (var54_50 = (int)h40_0.P1()) != 0 && var51_48 /* !! */  != 0 || (var54_50 = (int)cp$a.u()) != 0)) {
                        ai0_2.i((View)var25_27);
lbl470:
                        // 2 sources

                        while (true) {
                            var29_31 = var10_12;
                            var56_52 = var19_21 /* !! */ ;
                            var57_53 = true;
                            break block93;
                            break;
                        }
                    }
                    ** while (var25_27 == null)
lbl476:
                    // 1 sources

                    var54_50 = R$string.order_summary_return_refund_fee_details;
                    var27_29 = qz2_0.u(var26_28);
                    var27_29 = String.valueOf(var27_29);
                    var29_31 = var10_12;
                    var56_52 = var19_21 /* !! */ ;
                    var57_54 = 1;
                    try {
                        var19_21 /* !! */  = new Object[var57_54];
                        var19_21 /* !! */ [0] = var27_29;
                        var19_21 /* !! */  = hv3_0.L(var54_50, var19_21 /* !! */ );
                        var25_27.setText((CharSequence)var19_21 /* !! */ );
                    }
                    catch (Exception var4_6) {
                        break block94;
                    }
                }
                if (var11_13 == 0) ** GOTO lbl507
                ai0_2.B((View)var14_16);
                ai0_2.B((View)var3_3);
                var14_16 = var12_14.getActionContent();
                if (var14_16 == null || (var14_16 = var14_16.getReturn_fee_strip()) == null) ** GOTO lbl501
                var22_24 = (int)var23_25;
                {
                    block105: {
                        block104: {
                            var16_18 = String.valueOf(var22_24);
                            var19_21 /* !! */  = null;
                            var39_40 = kotlin.text.b.n((String)var14_16, (String)var39_40, (String)var16_18, false);
                            break block104;
lbl501:
                            // 1 sources

                            var5_7 = false;
                            var6_8 = 0.0f;
                            var39_40 = null;
                        }
                        var3_3.setText((CharSequence)var39_40);
                        break block105;
lbl507:
                        // 1 sources

                        ai0_2.i((View)var3_3);
                    }
                    if (var7_9 == 0 && !var48_46 && var18_20 == 0) {
                        var58_55 = true;
                    } else {
                        var58_55 = false;
                        var3_3 = null;
                    }
                    var5_7 = h40_0.P1();
                    if (var5_7) {
                        if (var58_55 && var51_48 /* !! */  == 0) {
                            var5_7 = true;
                            var6_8 = 1.4E-45f;
                        } else {
                            var5_7 = false;
                            var6_8 = 0.0f;
                            var39_40 = null;
                        }
                        var58_55 = var5_7;
                    }
                    if (var58_55 && var11_13 == 0) {
                        ai0_2.i((View)var13_15);
                    }
                    break block95;
                }
            }
            var3_3 = "<this>";
            Intrinsics.checkNotNullParameter(var4_4, (String)var3_3);
        }
        var4_4 = h40_0.a;
        var4_4 = z40_0.Companion;
        var4_4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var4_4).a;
        var3_3 = "enable_hnm_post_order";
        var11_13 = (int)var4_4.a((String)var3_3);
        if (var11_13 != 0 && (var4_4 = var12_14.getRefundOptions()) != null && (var11_13 = (int)(var4_4 = var12_14.getRefundOptions()).contains(var15_17)) == 0) {
            var3_3 = var56_52;
            var5_7 = false;
            var6_8 = 0.0f;
            var56_52.setVisibility(0);
            var29_31.w();
            var56_52.setEnabled(false);
            var56_52.setChecked(false);
            var4_4 = hv3_0.K(R$string.ajio_wallet_not_available);
            var56_52.setText((CharSequence)var4_4);
            var11_13 = hv3_0.m(R$color.pesdk_color_2);
            var56_52.setTextColor(var11_13);
            var4_4 = hv3_0.K(R$string.refund_money_transfer_to_ajio_wallet_is_not_applicable_on_these_products);
            var39_40 = var29_31;
            var39_40 = var29_31.s;
            var39_40.setText((CharSequence)var4_4);
            var11_13 = R$drawable.custom_btn_radio_disabled;
            var56_52.setButtonDrawable(var11_13);
        }
        var3_3 = this;
        var4_4 = this.c;
        Intrinsics.checkNotNullParameter(var4_4, "returnOrderItemDetails");
        var39_40 = this.a;
        Intrinsics.checkNotNullParameter(var39_40, "activity");
        var9_11 = new wd0_2((ReturnOrderItemDetails)var4_4, (ReturnOrderItemDetails)var4_4, (AppCompatActivity)var39_40);
        var13_15.setOnClickListener((View.OnClickListener)var9_11);
        this.h = false;
    }

    public final void onBindHeaderView(RecyclerView$B recyclerView$B, int n3) {
    }

    public final RecyclerView$B onCreateBasicItemViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.exchange_return_items_list_row_verify;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        ReturnOrderItemDetails returnOrderItemDetails = this.c;
        HashMap hashMap = this.e;
        object = new be0_2((View)viewGroup, returnOrderItemDetails, hashMap);
        return object;
    }

    public final RecyclerView$B onCreateFooterViewHolder(ViewGroup object, int n3) {
        Intrinsics.checkNotNullParameter(object, "parent");
        zd0_2 zd0_22 = this.g;
        if (zd0_22 == null) {
            zd0_22 = LayoutInflater.from((Context)object.getContext());
            int n4 = R$layout.exchange_returns_itemslist_footer;
            object = zd0_22.inflate(n4, (ViewGroup)object, false);
            Intrinsics.checkNotNullExpressionValue(object, "inflate(...)");
            ReturnOrderItemDetails returnOrderItemDetails = this.c;
            th2_0 th2_02 = this.b;
            AppCompatActivity appCompatActivity = this.a;
            this.g = zd0_22 = new zd0_2(appCompatActivity, (View)object, returnOrderItemDetails, th2_02);
        }
        object = this.g;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.exchangereturn.adapter.ExchangeReturnFooterViewHolder");
        return object;
    }

    public final RecyclerView$B onCreateHeaderViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean useFooter() {
        int n3 = this.d;
        if (n3 == 0) return 0 != 0;
        ArrayList arrayList = this.f;
        Intrinsics.checkNotNull(arrayList);
        n3 = arrayList.size();
        if (n3 <= 0) return 0 != 0;
        return 1 != 0;
    }

    public final boolean useHeader() {
        return false;
    }
}

