/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 */
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.pickfromstore.StoreNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YT
 */
public final class yt_0
extends RecyclerView$f
implements View.OnClickListener {
    public final List a;
    public final a82_0 b;
    public StoreNode c;
    public final NewCustomEventsRevamp d;
    public EditText e;

    public yt_0(ArrayList object, a82_0 a82_02) {
        Intrinsics.checkNotNullParameter(object, "dataList");
        Intrinsics.checkNotNullParameter(a82_02, "findStoreClickListener");
        this.a = object;
        this.b = a82_02;
        this.d = object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
    }

    public final void g(String string2) {
        int n3;
        Intrinsics.checkNotNullParameter(string2, "pinCode");
        Object object = this.e;
        if (object != null) {
            object.setText((CharSequence)string2);
        }
        if ((object = this.e) != null) {
            n3 = string2.length();
            object.setSelection(n3);
        }
        if ((object = this.e) != null) {
            object.clearFocus();
        }
        if ((object = this.b) != null) {
            n3 = 0;
            object.L4(null);
        }
        if (object != null) {
            object.w(string2);
        }
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

    public final int getItemViewType(int n3) {
        List list = this.a;
        Intrinsics.checkNotNull(list);
        return ((kc3_1)list.get((int)n3)).a;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block27: {
            var3_3 = 1;
            var4_4 /* !! */  = null;
            var5_5 = "viewHolder";
            Intrinsics.checkNotNullParameter(var1_1, (String)var5_5);
            var6_6 = this.getItemViewType(var2_2);
            var7_7 = 2;
            if (var6_6 != var7_7) break block27;
            var1_1 = (YT$d)var1_1;
            var5_5 = this.a;
            Intrinsics.checkNotNull(var5_5);
            var8_8 = ((kc3_1)var5_5.get((int)var2_2)).b;
            Intrinsics.checkNotNull(var8_8, "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.pickfromstore.StoreNode");
            var5_5 = var8_8.getStoreAddress();
            var7_7 = (int)var8_8.isRefundByCash();
            if (var7_7 != 0) {
                var7_7 = (int)og1_1.b();
                if (var7_7 != 0) {
                    var9_9 = var1_1.b;
                    var10_10 = hv3_0.m(R$color.luxe_color_121212);
                    var9_9.setTextColor(var10_10);
                } else {
                    var9_9 = var1_1.b;
                    var10_10 = hv3_0.m(R$color.accent_color_2);
                    var9_9.setTextColor(var10_10);
                }
                var9_9 = var1_1.b;
                var10_10 = R$string.edd_cod_available;
                var11_11 = hv3_0.K(var10_10);
                var9_9.setText((CharSequence)var11_11);
            } else {
                var7_7 = (int)og1_1.b();
                if (var7_7 != 0) {
                    var9_9 = var1_1.b;
                    var10_10 = hv3_0.m(R$color.luxe_color_121212);
                    var9_9.setTextColor(var10_10);
                } else {
                    var9_9 = var1_1.b;
                    var10_10 = hv3_0.m(R$color.accent_color_1);
                    var9_9.setTextColor(var10_10);
                }
                var9_9 = var1_1.b;
                var10_10 = R$string.edd_cod_unavailable;
                var11_11 = hv3_0.K(var10_10);
                var9_9.setText((CharSequence)var11_11);
            }
            var9_9 = this.c;
            if (var9_9 == null) ** GOTO lbl-1000
            Intrinsics.checkNotNull(var9_9);
            var9_9 = var9_9.getStoreNodeID();
            var11_11 = var8_8.getStoreNodeID();
            var7_7 = (int)Intrinsics.areEqual(var9_9, var11_11);
            if (var7_7 != 0) {
                var9_9 = var1_1.i;
                var10_10 = 0;
                var11_11 = null;
                if (var9_9 != null) {
                    var9_9.setOnClickListener(null);
                }
                if ((var9_9 = var1_1.i) != null) {
                    var9_9.setTag(null);
                }
                if ((var9_9 = var1_1.j) != null) {
                    var9_9.setChecked((boolean)var3_3);
                }
            } else lbl-1000:
            // 2 sources

            {
                if ((var9_9 = var1_1.i) != null) {
                    var9_9.setTag(var8_8);
                }
                if ((var9_9 = var1_1.i) != null) {
                    var9_9.setOnClickListener((View.OnClickListener)this);
                }
                if ((var9_9 = var1_1.j) != null) {
                    var9_9.setChecked(false);
                }
            }
            var9_9 = var5_5.getLine1();
            var7_7 = (int)TextUtils.isEmpty((CharSequence)var9_9);
            var11_11 = "";
            var9_9 = var7_7 == 0 ? var5_5.getLine1() : var11_11;
            var12_12 = var5_5.getLine2();
            var13_13 = TextUtils.isEmpty((CharSequence)var12_12);
            var14_14 = ",";
            if (var13_13 == 0) {
                var12_12 = var5_5.getLine2();
                var9_9 = n1.a((String)var9_9, var14_14, var12_12);
            }
            var12_12 = var5_5.getLandmark();
            var13_13 = TextUtils.isEmpty((CharSequence)var12_12);
            var15_15 = 8;
            if (var13_13 == 0) {
                var1_1.g.setVisibility(0);
                var12_12 = var5_5.getLandmark();
                var16_16 = var1_1.d;
                var16_16.setText((CharSequence)var12_12);
            } else {
                var12_12 = var1_1.g;
                var12_12.setVisibility(var15_15);
            }
            var12_12 = var5_5.getPhone();
            var13_13 = TextUtils.isEmpty((CharSequence)var12_12);
            if (var13_13 == 0) {
                var1_1.h.setVisibility(0);
                var12_12 = var5_5.getPhone();
                var16_16 = var1_1.e;
                var16_16.setText((CharSequence)var12_12);
            } else {
                var12_12 = var1_1.h;
                var12_12.setVisibility(var15_15);
            }
            var12_12 = var8_8.getStoreTime();
            var13_13 = TextUtils.isEmpty((CharSequence)var12_12);
            if (var13_13 == 0) {
                var12_12 = var1_1.f;
                var12_12.setVisibility(0);
                var13_13 = R$string.timing_format;
                var17_17 = var8_8.getStoreTime();
                var18_18 = new Object[var3_3];
                var18_18[0] = var17_17;
                var18_18 = hv3_0.L(var13_13, (Object[])var18_18);
                var4_4 /* !! */  = var1_1.f;
                var4_4 /* !! */ .setText((CharSequence)var18_18);
            } else {
                var18_18 = var1_1.f;
                var18_18.setVisibility(var15_15);
            }
            var18_18 = var5_5.getTown();
            var3_3 = TextUtils.isEmpty((CharSequence)var18_18);
            if (var3_3 == 0) {
                var18_18 = var5_5.getTown();
                var9_9 = n1.a((String)var9_9, var14_14, (String)var18_18);
            }
            if ((var3_3 = (int)TextUtils.isEmpty((CharSequence)(var18_18 = var5_5.getDistrict()))) == 0) {
                var18_18 = var5_5.getDistrict();
                var9_9 = n1.a((String)var9_9, var14_14, (String)var18_18);
            }
            if ((var3_3 = (int)TextUtils.isEmpty((CharSequence)(var18_18 = var5_5.getState()))) == 0) {
                var18_18 = var5_5.getState();
                var9_9 = n1.a((String)var9_9, var14_14, (String)var18_18);
            }
            if ((var3_3 = (int)TextUtils.isEmpty((CharSequence)(var18_18 = var5_5.getPostalCode()))) == 0) {
                var18_18 = var5_5.getPostalCode();
                var4_4 /* !! */  = "-";
                var9_9 = n1.a((String)var9_9, (String)var4_4 /* !! */ , (String)var18_18);
            }
            if ((var3_3 = (int)TextUtils.isEmpty((CharSequence)(var18_18 = var8_8.getStoreName()))) == 0) {
                var18_18 = var1_1.a;
                var8_8 = var8_8.getStoreName();
                var18_18.setText((CharSequence)var8_8);
            } else {
                var8_8 = var1_1.a;
                var8_8.setText((CharSequence)var11_11);
            }
            var1_1 = var1_1.c;
            var1_1.setText((CharSequence)var9_9);
        }
    }

    public final void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        a82_0 a82_02 = this.b;
        if (a82_02 == null) {
            return;
        }
        int n3 = object.getId();
        int n4 = R$id.dns_tv_findstore;
        Editable editable = null;
        if (n3 == n4) {
            a82_02.L4(null);
            a82_02.v();
        } else {
            n4 = R$id.tv_pincode_check;
            Object object2 = this.d;
            if (n3 == n4) {
                Bundle bundle = new Bundle();
                object = ((NewCustomEventsRevamp)object2).getPOSTAL_CODE();
                Object object3 = this.e;
                if (object3 != null) {
                    object3 = object3.getText();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                object3 = String.valueOf(object3);
                bundle.putString((String)object, (String)object3);
                object2 = ((NewCustomEventsRevamp)object2).getEC_CHECKOUT_INTERACTIONS();
                String string2 = "find_store";
                String string3 = "find store click";
                String string4 = "";
                object3 = a82_02;
                a82_02.C7(string3, (String)object2, string4, bundle, string2);
                a82_02.L4(null);
                object = this.e;
                if (object != null) {
                    editable = object.getText();
                }
                object = String.valueOf(editable);
                a82_02.w((String)object);
                object = this.e;
                if (object != null) {
                    object.clearFocus();
                }
            } else {
                Object object4;
                n4 = R$id.row_find_store;
                if (n3 == n4 && (n3 = (object4 = object.getTag()) instanceof StoreNode) != 0) {
                    object = object.getTag();
                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.pickfromstore.StoreNode");
                    object = (StoreNode)object;
                    object2 = ((NewCustomEventsRevamp)object2).getEC_CHECKOUT_INTERACTIONS();
                    String string5 = ((StoreNode)object).getStoreName();
                    Intrinsics.checkNotNull(string5);
                    Object var7_8 = null;
                    String string6 = "find store search select";
                    String string7 = "store_search_select";
                    object4 = a82_02;
                    a82_02.C7(string6, (String)object2, string5, null, string7);
                    a82_02.L4((StoreNode)object);
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Object object2;
        String string2 = "parent";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = 1;
        if (n3 != n4) {
            Object object3;
            n4 = 3;
            if (n3 != n4) {
                n4 = 4;
                if (n3 != n4) {
                    Object object4;
                    n3 = (int)(og1_1.b() ? 1 : 0);
                    if (n3 != 0) {
                        object4 = LayoutInflater.from((Context)object.getContext());
                        n4 = R$layout.row_find_store_lux;
                        object = object4.inflate(n4, (ViewGroup)object, false);
                    } else {
                        object4 = LayoutInflater.from((Context)object.getContext());
                        n4 = R$layout.row_find_store_store_revamp;
                        object = object4.inflate(n4, (ViewGroup)object, false);
                    }
                    object4 = new YT$d(this, (View)object);
                    return object4;
                }
                Object object5 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_no_item_eligible;
                object = object5.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullParameter(object, "itemView");
                object5 = new RecyclerView$B((View)object);
                return object5;
            }
            n3 = (int)(og1_1.b() ? 1 : 0);
            if (n3 != 0) {
                object3 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_no_store_found_lux;
                object = object3.inflate(n4, (ViewGroup)object, false);
            } else {
                object3 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_no_store_found_revamp;
                object = object3.inflate(n4, (ViewGroup)object, false);
            }
            string2 = "itemView";
            Intrinsics.checkNotNullParameter(object, string2);
            object3 = new RecyclerView$B((View)object);
            n4 = R$id.dns_tv_findstore;
            object = (AjioTextView)object.findViewById(n4);
            n4 = (int)(og1_1.b() ? 1 : 0);
            if (n4 != 0 && object != null) {
                ((AjioTextView)object).underlineText();
            }
            if (object != null) {
                object.setOnClickListener((View.OnClickListener)this);
            }
            return object3;
        }
        n3 = (int)(og1_1.b() ? 1 : 0);
        if (n3 != 0) {
            object2 = LayoutInflater.from((Context)object.getContext());
            n4 = R$layout.row_checkout_find_store_lux;
            object = object2.inflate(n4, (ViewGroup)object, false);
        } else {
            object2 = LayoutInflater.from((Context)object.getContext());
            n4 = R$layout.row_checkout_find_store_revamp;
            object = object2.inflate(n4, (ViewGroup)object, false);
        }
        object2 = new YT$a(this, (View)object);
        return object2;
    }
}

