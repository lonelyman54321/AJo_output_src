/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.services.data.Closet.WishListSizeChartRequestBody;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from AW
 */
public final class aw_1
extends BottomSheetDialogFragment
implements View.OnClickListener,
c92 {
    public static final AW$a Companion;
    public LinearLayout a;
    public TextView b;
    public RecyclerView c;
    public TextView d;
    public TextView e;
    public ky1_0 f;
    public tw_1 g;
    public final ArrayList h;
    public ArrayList i;
    public LinearLayoutManager j;
    public int k;
    public ProductOptionItem l;
    public TextView m;
    public final NewCustomEventsRevamp n;
    public final NewEEcommerceEventsRevamp o;
    public String p;
    public final ArrayList q;
    public String r;
    public String s;

    static {
        AW$a aW$a;
        Companion = aW$a = new Object();
    }

    public aw_1() {
        NewCustomEventsRevamp newCustomEventsRevamp;
        Object object = new ArrayList();
        this.h = object;
        object = AnalyticsManager.Companion;
        this.n = newCustomEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.o = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        object = new ArrayList();
        this.q = object;
        this.r = object = "";
        this.s = object;
    }

    public static final String Oa(String string2) {
        block5: {
            block4: {
                if (string2 == null) break block4;
                int n3 = string2.length();
                if (n3 <= 0) {
                    string2 = null;
                }
                if (string2 != null) break block5;
            }
            string2 = "%20";
        }
        return string2;
    }

    public final void onClick(View object) {
        Object object2 = null;
        int n3 = 1;
        String string2 = "v";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = object.getId();
        int n7 = R$id.cancel;
        if (n4 != n7 && n4 != (n7 = R$id.cancelBtn)) {
            n7 = R$id.addToBag;
            if (n4 == n7) {
                object = this.l;
                if (object != null) {
                    object = this.getTargetFragment();
                    if (object != null) {
                        object = new Intent();
                        object2 = new Bundle();
                        ProductOptionItem productOptionItem = this.l;
                        object2.putSerializable("slected_product", (Serializable)productOptionItem);
                        string2 = "product_quantity";
                        object2.putInt(string2, n3);
                        object.putExtras((Bundle)object2);
                        object2 = this.getTargetFragment();
                        if (object2 != null) {
                            n3 = this.getTargetRequestCode();
                            n7 = -1;
                            ((Fragment)object2).onActivityResult(n3, n7, (Intent)object);
                        }
                        this.dismiss();
                    }
                } else {
                    object = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_alert_message;
                    object = hv3_0.K(n4);
                    n7 = R$string.select_size_text;
                    string2 = hv3_0.K(n7);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = string2;
                    string2 = "format(...)";
                    object = xh2_0.a(objectArray, n3, (String)object, string2);
                    n3 = R$string.select_size_text;
                    String string3 = hv3_0.K(n3);
                    hv3_0.o0(0, string3, (String)object);
                }
            }
        } else {
            this.dismiss();
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Class<ky1_0> clazz = ky1_0.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object, clazz, string2);
        object2 = ef0_0.a(clazz, string2, string2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.f = object = (ky1_0)((pD3)object).a((yn1_2)object2, (String)object3);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        wW wW2 = new wW((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)wW2);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.closet_size_bottomsheet_refresh;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onViewCreated(View var1_1, Bundle var2_2) {
        block70: {
            block67: {
                block68: {
                    block69: {
                        block66: {
                            block65: {
                                block64: {
                                    var3_3 = this;
                                    var4_4 /* !! */  = var1_1;
                                    var5_5 = 1;
                                    Intrinsics.checkNotNullParameter(var1_1, "view");
                                    super.onViewCreated(var1_1, var2_2);
                                    var6_6 = R$id.parent_layout;
                                    var7_7 = (LinearLayout)var1_1.findViewById((int)var6_6);
                                    this.a = var7_7;
                                    var6_6 = R$id.cart_size_info_tv_header;
                                    var7_7 = (TextView)var1_1.findViewById((int)var6_6);
                                    this.b = var7_7;
                                    var6_6 = R$id.closet_size_progress_bar;
                                    var7_7 = (AjioLoaderView)var1_1.findViewById((int)var6_6);
                                    var6_6 = R$id.sizeRv;
                                    var7_7 = (RecyclerView)var1_1.findViewById((int)var6_6);
                                    this.c = var7_7;
                                    var6_6 = R$id.size_unit_tv;
                                    var7_7 = (TextView)var1_1.findViewById((int)var6_6);
                                    this.d = var7_7;
                                    var6_6 = R$id.brand_size_tv;
                                    var7_7 = (TextView)var1_1.findViewById((int)var6_6);
                                    this.e = var7_7;
                                    var6_6 = R$id.cart_size_chart_tv_header;
                                    var7_7 = (TextView)var1_1.findViewById((int)var6_6);
                                    this.m = var7_7;
                                    var8_8 = this.requireActivity();
                                    var9_9 = 0;
                                    var10_10 = null;
                                    var7_7 = new LinearLayoutManager((Context)var8_8, 0, false);
                                    this.j = var7_7;
                                    var7_7 = this.c;
                                    var8_8 = "recyclerViewSize";
                                    var11_11 = 0;
                                    var12_12 = null;
                                    if (var7_7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                                        var6_6 = false;
                                        var7_7 = null;
                                    }
                                    var13_13 = var3_3.j;
                                    var7_7.setLayoutManager((RecyclerView$o)var13_13);
                                    var13_13 = Looper.getMainLooper();
                                    var7_7 = new Handler((Looper)var13_13);
                                    var13_13 = new vW(var3_3);
                                    var14_14 = 100;
                                    var7_7.postDelayed((Runnable)var13_13, var14_14);
                                    var13_13 = var3_3.h;
                                    var3_3.g = var7_7 = new tw_1(var3_3, (ArrayList)var13_13);
                                    var7_7 = var3_3.c;
                                    if (var7_7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                                        var6_6 = false;
                                        var7_7 = null;
                                    }
                                    var8_8 = var3_3.g;
                                    var16_15 = "mProductDetailSizeAdapter";
                                    if (var8_8 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var16_15);
                                        var17_16 = 0;
                                        var8_8 = null;
                                    }
                                    var7_7.setAdapter((RecyclerView$f)var8_8);
                                    var7_7 = this.getArguments();
                                    var8_8 = "product";
                                    if (var7_7 != null) {
                                        var6_6 = var7_7.containsKey((String)var8_8);
                                        var7_7 = var6_6;
                                    } else {
                                        var6_6 = false;
                                        var7_7 = null;
                                    }
                                    if (var7_7 != null && (var7_7 = this.getArguments()) != null) {
                                        var18_17 = Build.VERSION.SDK_INT;
                                        var19_18 = 33;
                                        if (var18_17 >= var19_18) {
                                            var7_7 = uw_1.a((Bundle)var7_7);
                                        } else {
                                            var17_16 = (var7_7 = var7_7.getSerializable((String)var8_8)) instanceof Product;
                                            if (var17_16 == 0) {
                                                var6_6 = false;
                                                var7_7 = null;
                                            }
                                            var7_7 = (Product)var7_7;
                                        }
                                        var7_7 = (Product)var7_7;
                                    } else {
                                        var6_6 = false;
                                        var7_7 = null;
                                    }
                                    var17_16 = R$id.cancel;
                                    var4_4 /* !! */ .findViewById(var17_16).setOnClickListener((View.OnClickListener)var3_3);
                                    var17_16 = R$id.addToBag;
                                    var4_4 /* !! */ .findViewById(var17_16).setOnClickListener((View.OnClickListener)var3_3);
                                    var17_16 = R$id.cancelBtn;
                                    var4_4 /* !! */ .findViewById(var17_16).setOnClickListener((View.OnClickListener)var3_3);
                                    var4_4 /* !! */  = ",";
                                    var8_8 = "";
                                    if (var7_7 == null) break block67;
                                    var20_19 = new Bundle();
                                    var21_20 = var7_7.getCode();
                                    var20_19.putString("product_id", (String)var21_20);
                                    var22_21 = var7_7.getName();
                                    var20_19.putString("product_name", (String)var22_21);
                                    var21_20 = var7_7.getFnlColorVariantData();
                                    if (var21_20 != null) {
                                        var21_20 = var21_20.getBrandName();
                                    } else {
                                        var18_17 = 0;
                                        var21_20 = null;
                                    }
                                    var20_19.putString("product_brand", (String)var21_20);
                                    var21_20 = var3_3.n;
                                    var22_21 = var21_20.getPRODUCT_SIZE();
                                    var23_22 = var7_7.getSelectedSize();
                                    var20_19.putString((String)var22_21, (String)var23_22);
                                    var22_21 = var21_20.getEC_CLOSET_INTERACTIONS();
                                    var23_22 = var3_3.o;
                                    var24_23 = var23_22.getPrevScreen();
                                    var25_24 = var23_22.getPrevScreenType();
                                    var26_25 = 1536;
                                    var27_26 = null;
                                    var28_27 = "";
                                    var29_28 = "size_chart_interaction";
                                    var30_29 = "closet screen";
                                    var31_30 = null;
                                    var32_31 = null;
                                    var33_32 /* !! */  = var20_19;
                                    var20_19 = "closet screen";
                                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var21_20, (String)var22_21, "select size view", (String)var28_27, (String)var29_28, var30_29, (String)var20_19, var24_23, var33_32 /* !! */ , (String)var25_24, false, null, var26_25, null);
                                    var3_3.p = null;
                                    var21_20 = var3_3.q;
                                    var21_20.clear();
                                    var3_3.r = var8_8;
                                    var13_13.clear();
                                    var22_21 = new ArrayList();
                                    var3_3.i = var22_21;
                                    var22_21 = var7_7.getBaseOptions();
                                    var23_22 = "size";
                                    if (var22_21 != null && (var22_21 = (ProductOption)CollectionsKt.firstOrNull(var22_21)) != null && (var22_21 = var22_21.getOptions()) != null && (var22_21 = (ProductOptionItem)CollectionsKt.firstOrNull((List)var22_21)) != null && (var22_21 = var22_21.getAttributes()) != null) {
                                        var22_21 = ((Iterable)var22_21).iterator();
                                        while ((var34_33 = var22_21.hasNext()) != 0) {
                                            var28_27 = (ProductOptionVariant)var22_21.next();
                                            var29_28 = var28_27.getAttributeName();
                                            var28_27 = var28_27.getAttributeValue();
                                            var30_29 = "selection1";
                                            var35_34 = kotlin.text.b.i((String)var29_28, var30_29, (boolean)var5_5);
                                            if (var35_34 != 0 && var28_27 != null && (var35_34 = var28_27.length()) != 0 || (var36_35 = kotlin.text.b.i((String)var29_28, var30_29 = "selection2", (boolean)var5_5)) == 0 || var28_27 == null || (var36_35 = var28_27.length()) == 0 || (var36_35 = (int)var28_27.equalsIgnoreCase((String)var23_22)) != 0) continue;
                                            var3_3.p = var28_27;
                                        }
                                    }
                                    if ((var22_21 = var7_7.getProductOptionItems()) != null) {
                                        var22_21 = var22_21.iterator();
                                        while ((var34_33 = var22_21.hasNext()) != 0) {
                                            var28_27 = (ProductOptionItem)var22_21.next();
                                            var29_28 = var3_3.i;
                                            if (var29_28 != null) {
                                                var29_28.add(var28_27);
                                            }
                                            if ((var29_28 = var3_3.p) != null && (var36_35 = kotlin.text.b.k((CharSequence)var29_28)) == 0) {
                                                if (var28_27 != null && (var28_27 = var28_27.getVariantOptionQualifiers()) != null) {
                                                    var28_27 = ((Iterable)var28_27).iterator();
                                                    var36_35 = 0;
                                                    var29_28 = null;
                                                    var35_34 = 0;
                                                    var30_29 = null;
                                                    while (var37_36 = var28_27.hasNext()) {
                                                        var20_19 = (ProductOptionVariant)var28_27.next();
                                                        var12_12 = var20_19.getQualifier();
                                                        var24_23 = var20_19.getValue();
                                                        var10_10 = var3_3.p;
                                                        var9_9 = (int)kotlin.text.b.i((String)var10_10, var12_12, (boolean)var5_5);
                                                        if (var9_9 != 0) {
                                                            var10_10 = var3_3.p;
                                                            var9_9 = (int)var23_22.equalsIgnoreCase((String)var10_10);
                                                            if (var9_9 == 0 && (var10_10 = var20_19.getName()) != null && (var9_9 = (int)kotlin.text.b.k((CharSequence)var10_10)) == 0 && (var9_9 = (var10_10 = var3_3.r).length()) == 0) {
                                                                var10_10 = var20_19.getName();
                                                                Intrinsics.checkNotNull(var10_10);
                                                                var3_3.r = var10_10;
                                                            }
                                                            var29_28 = var24_23;
                                                        }
                                                        if ((var9_9 = (int)(var10_10 = "uom").equalsIgnoreCase((String)var12_12)) != 0) {
                                                            var30_29 = var24_23;
                                                        }
                                                        var9_9 = 0;
                                                        var10_10 = null;
                                                        var11_11 = 0;
                                                        var12_12 = null;
                                                    }
                                                } else {
                                                    var36_35 = 0;
                                                    var29_28 = null;
                                                    var35_34 = 0;
                                                    var30_29 = null;
                                                }
                                                if (var29_28 != null && (var9_9 = (int)kotlin.text.b.k((CharSequence)var29_28)) == 0 && var30_29 != null && (var9_9 = (int)kotlin.text.b.k(var30_29)) == 0) {
                                                    var10_10 = new StringBuilder();
                                                    var10_10.append(var29_28);
                                                    var12_12 = " ";
                                                    var10_10.append((String)var12_12);
                                                    var10_10.append((Object)var30_29);
                                                    var10_10 = var10_10.toString();
                                                    var21_20.add(var10_10);
                                                }
                                            }
                                            var9_9 = 0;
                                            var10_10 = null;
                                            var11_11 = 0;
                                            var12_12 = null;
                                        }
                                    }
                                    var10_10 = ((Iterable)var7_7.getProductOptionVariants()).iterator();
                                    var11_11 = 0;
                                    var12_12 = null;
                                    while (var19_18 = (int)var10_10.hasNext()) {
                                        var22_21 = var10_10.next();
                                        var38_37 = var11_11 + 1;
                                        if (var11_11 >= 0) {
                                            var22_21 = (ProductOptionVariant)var22_21;
                                            var28_27 = null;
                                            var22_21.setSelected(false);
                                            var34_33 = var21_20.size();
                                            if (var11_11 < var34_33) {
                                                var12_12 = (String)var21_20.get(var11_11);
                                                var22_21.setSizeValue((String)var12_12);
                                            }
                                            var13_13.add(var22_21);
                                            var11_11 = var38_37;
                                            continue;
                                        }
                                        xx_2.n();
                                        throw null;
                                    }
                                    var9_9 = 0;
                                    var10_10 = null;
                                    var12_12 = var7_7.getBaseOptions();
                                    if (var12_12 != null && (var12_12 = (ProductOption)CollectionsKt.firstOrNull((List)var12_12)) != null) {
                                        if ((var12_12 = var12_12.getOptions()) != null && (var12_12 = (ProductOptionItem)CollectionsKt.firstOrNull((List)var12_12)) != null) {
                                            var21_20 = var12_12.getAttributes();
                                            if (var21_20 != null && (var18_17 = (var21_20 = (Collection)var21_20).isEmpty() ^ var5_5) == var5_5) {
                                                var12_12 = var12_12.getAttributes();
                                                Intrinsics.checkNotNull(var12_12);
                                                var12_12 = ((Iterable)var12_12).iterator();
                                                var21_20 = var8_8;
                                                var22_21 = var8_8;
                                                while ((var38_37 = (int)var12_12.hasNext()) != 0) {
                                                    var29_28 = "sizeFormat";
                                                    var23_22 = (ProductOptionVariant)var12_12.next();
                                                    var28_27 = var23_22.getAttributeName();
                                                    var34_33 = (int)var29_28.equalsIgnoreCase((String)var28_27);
                                                    if (var34_33 != 0) {
                                                        var21_20 = Y63.e(String.valueOf(var23_22.getAttributeValue()));
                                                    }
                                                    if ((var34_33 = (int)(var29_28 = "standardSizeFormat").equalsIgnoreCase((String)(var28_27 = var23_22.getAttributeName()))) == 0) continue;
                                                    var22_21 = Y63.e(String.valueOf(var23_22.getAttributeValue()));
                                                }
                                            } else {
                                                var21_20 = var8_8;
                                                var22_21 = var8_8;
                                            }
                                            var12_12 = new Pair(var21_20, var22_21);
                                        } else {
                                            var12_12 = new Pair(var8_8, var8_8);
                                        }
                                    } else {
                                        var12_12 = new Pair(var8_8, var8_8);
                                    }
                                    var18_17 = var13_13.isEmpty() ^ var5_5;
                                    if (var18_17) {
                                        var21_20 = var13_13.iterator();
                                        while (var19_18 = (int)var21_20.hasNext()) {
                                            var22_21 = (ProductOptionVariant)var21_20.next();
                                            var23_22 = (String)var12_12.a;
                                            var22_21.setBrandSizeFormat((String)var23_22);
                                            var23_22 = (String)var12_12.b;
                                            var22_21.setUniversalSizeFormat((String)var23_22);
                                            var38_37 = (int)var22_21.isStockAvailable();
                                            if (var38_37 != 0) continue;
                                            var23_22 = var3_3.s;
                                            var22_21 = var22_21.getValue();
                                            var3_3.s = var22_21 = n1.a((String)var23_22, (String)var22_21, (String)var4_4 /* !! */ );
                                        }
                                    }
                                    if ((var11_11 = (int)var13_13.isEmpty()) != 0 && ((var12_12 = var3_3.i) == null || (var11_11 = (int)var12_12.isEmpty()) != 0)) {
                                        this.dismiss();
                                    } else {
                                        var12_12 = (ProductOptionVariant)CollectionsKt.firstOrNull((List)var13_13);
                                        if (var12_12 != null) {
                                            var13_13 = var3_3.d;
                                            if (var13_13 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("sizeUnitTv");
                                                var13_13 = null;
                                            }
                                            Y63.h((TextView)var13_13, (ProductOptionVariant)var12_12);
                                            var12_12 = var3_3.g;
                                            if (var12_12 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException((String)var16_15);
                                                var11_11 = 0;
                                                var12_12 = null;
                                            }
                                            var12_12.notifyDataSetChanged();
                                        }
                                    }
                                    var12_12 = h40_0.a;
                                    var12_12 = z40_0.Companion;
                                    var12_12 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var12_12).a;
                                    var13_13 = "wishlist_size_guide";
                                    var12_12 = var12_12.d((String)var13_13);
                                    var16_15 = "isSizeGuideApplicable";
                                    var18_17 = var12_12.has((String)var16_15);
                                    var22_21 = "Size chart not available for wishlist";
                                    if (!var18_17) break block68;
                                    var21_20 = "false";
                                    var11_11 = (int)Boolean.parseBoolean((String)(var12_12 = var12_12.optString((String)var16_15, (String)var21_20)));
                                    if (var11_11 == 0) break block69;
                                    var12_12 = var3_3.f;
                                    var16_15 = "mClosetViewModel";
                                    if (var12_12 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var16_15);
                                        var11_11 = 0;
                                        var12_12 = null;
                                    }
                                    var12_12 = var12_12.H;
                                    var21_20 = this.getViewLifecycleOwner();
                                    var22_21 = new xW(var3_3, (Product)var7_7);
                                    var23_22 = new AW$b((xW)var22_21);
                                    var12_12.e((mu1_1)var21_20, (F62)var23_22);
                                    var12_12 = var3_3.f;
                                    if (var12_12 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var16_15);
                                        var11_11 = 0;
                                        var12_12 = null;
                                    }
                                    var16_15 = (var16_15 = var7_7.getBaseOptions()) != null && (var16_15 = (ProductOption)CollectionsKt.firstOrNull(var16_15)) != null && (var16_15 = var16_15.getOptions()) != null && (var16_15 = (ProductOptionItem)CollectionsKt.firstOrNull(var16_15)) != null ? var16_15.getAttributes() : null;
                                    var21_20 = "";
                                    if (var16_15 == null) ** GOTO lbl-1000
                                    var22_21 = var16_15;
                                    var22_21 = ((Iterable)var16_15).iterator();
                                    while ((var38_37 = (int)var22_21.hasNext()) != 0) {
                                        var28_27 = var23_22 = var22_21.next();
                                        var28_27 = ((ProductOptionVariant)var23_22).getAttributeName();
                                        var34_33 = (int)Intrinsics.areEqual(var28_27, var29_28 = "season");
                                        if (var34_33 == 0) continue;
                                        break block64;
                                    }
                                    var38_37 = 0;
                                    var23_22 = null;
                                }
                                var23_22 = (ProductOptionVariant)var23_22;
                                if (var23_22 != null && (var22_21 = var23_22.getAttributeValue()) != null) {
                                    var39_38 = var22_21;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var39_38 = var21_20;
                                }
                                if (var16_15 == null) ** GOTO lbl-1000
                                var22_21 = var16_15;
                                var22_21 = ((Iterable)var16_15).iterator();
                                while ((var38_37 = (int)var22_21.hasNext()) != 0) {
                                    var28_27 = var23_22 = var22_21.next();
                                    var28_27 = ((ProductOptionVariant)var23_22).getAttributeName();
                                    var34_33 = (int)Intrinsics.areEqual(var28_27, var29_28 = "styleType");
                                    if (var34_33 == 0) continue;
                                    break block65;
                                }
                                var38_37 = 0;
                                var23_22 = null;
                            }
                            var23_22 = (ProductOptionVariant)var23_22;
                            if (var23_22 != null && (var22_21 = var23_22.getAttributeValue()) != null) {
                                var40_39 = var22_21;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var40_39 = var21_20;
                            }
                            if (var16_15 == null) ** GOTO lbl-1000
                            var16_15 = ((Iterable)var16_15).iterator();
                            while (var19_18 = var16_15.hasNext()) {
                                var23_22 = var22_21 = var16_15.next();
                                var23_22 = ((ProductOptionVariant)var22_21).getAttributeName();
                                var38_37 = (int)Intrinsics.areEqual(var23_22, var28_27 = "categoryDesc");
                                if (var38_37 == 0) continue;
                                break block66;
                            }
                            var19_18 = 0;
                            var22_21 = null;
                        }
                        var22_21 = (ProductOptionVariant)var22_21;
                        if (var22_21 != null) {
                            var16_15 = var22_21.getAttributeValue();
                        } else lbl-1000:
                        // 2 sources

                        {
                            var16_15 = null;
                        }
                        var22_21 = "clothing";
                        var5_5 = kotlin.text.b.i(var16_15, (String)var22_21, (boolean)var5_5);
                        if (var5_5) {
                            var41_40 = "YES";
lbl366:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var41_40 = "NO";
                        ** while (true)
                        var42_41 = var41_40;
                        var41_40 = h40_0.a;
                        var41_40 = z40_0.Companion;
                        var16_15 = AJIOApplication.Companion;
                        var31_30 = Q.a((AJIOApplication$a)var16_15, (z40$a)var41_40).a.d((String)var13_13).optString("applicationName", (String)var21_20);
                        var32_31 = var7_7.getCode();
                        var43_42 = var7_7.getBrickCode();
                        var13_13 = var7_7.getFnlColorVariantData();
                        var27_26 = var13_13 != null ? (var13_13 = var13_13.getBrandCode()) : null;
                        var44_43 = var7_7.getBrickCategory();
                        var25_24 = var41_40;
                        var33_32 /* !! */  = var21_20;
                        var41_40 = new WishListSizeChartRequestBody(var31_30, var32_31, var43_42, (String)var27_26, (String)var21_20, (String)var21_20, (String)var39_38, (String)var40_39, var44_43, (String)var42_41);
                        var12_12.getClass();
                        Intrinsics.checkNotNullParameter(var41_40, "requestBody");
                        var41_40 = var12_12.c.getSizeChartForProduct((WishListSizeChartRequestBody)var41_40);
                        var16_15 = null;
                        var13_13 = new yy1_2(var12_12, 0);
                        var21_20 = new zy1_1((yy1_2)var13_13);
                        var13_13 = new ay1_1((ky1_0)var12_12);
                        var22_21 = new cy1_2(0, (Function1)var13_13);
                        var41_40 = var41_40.f((o60_0)var21_20, (o60_0)var22_21);
                        var12_12 = var12_12.G;
                        var12_12.b((yr0_2)var41_40);
                        break block70;
                    }
                    var16_15 = null;
                    var41_40 = yn3_0.a;
                    var12_12 = new Object[]{};
                    var41_40.a((String)var22_21, (Object[])var12_12);
                    break block70;
                }
                var16_15 = null;
                var41_40 = yn3_0.a;
                var12_12 = new Object[]{};
                var41_40.a((String)var22_21, (Object[])var12_12);
                break block70;
            }
            var9_9 = 0;
            var10_10 = null;
            this.dismiss();
        }
        var41_40 = var3_3.r;
        var5_5 = var41_40.length();
        var12_12 = "headerTv";
        if (var5_5 > 0) {
            var41_40 = var3_3.b;
            if (var41_40 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                var11_11 = 0;
                var12_12 = null;
            } else {
                var12_12 = var41_40;
            }
            var41_40 = var3_3.r;
            var13_13 = "Select ";
            var10_10 = new StringBuilder((String)var13_13);
            var10_10.append((String)var41_40);
            var41_40 = var10_10.toString();
            var12_12.setText((CharSequence)var41_40);
        } else {
            var41_40 = var3_3.b;
            if (var41_40 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                var11_11 = 0;
                var12_12 = null;
            } else {
                var12_12 = var41_40;
            }
            var5_5 = R$string.select_size;
            var12_12.setText(var5_5);
        }
        Intrinsics.checkNotNull(var7_7);
        var41_40 = new Bundle();
        var10_10 = var3_3.s;
        var9_9 = var10_10.length();
        var12_12 = "out_of_stock_sizes_count";
        var13_13 = "out_of_stock_sizes";
        if (var9_9 == 0) {
            var41_40.putString((String)var13_13, (String)var8_8);
            var41_40.putString((String)var12_12, (String)var8_8);
        } else {
            var8_8 = StringsKt.V(var3_3.s, (String)var4_4 /* !! */ );
            var41_40.putString((String)var13_13, (String)var8_8);
            var4_4 /* !! */  = new String[]{var4_4 /* !! */ };
            var9_9 = 6;
            var13_13 = null;
            var45_44 = StringsKt.a0((CharSequence)var8_8, var4_4 /* !! */ , false, 0, var9_9).size();
            var4_4 /* !! */  = String.valueOf(var45_44);
            var41_40.putString((String)var12_12, (String)var4_4 /* !! */ );
        }
        var25_24 = var29_28;
        var29_28 = new AnalyticsData(null, null, null, 0L, null, null, null, null, null, (Bundle)var41_40, null, null, null, null, null, null, 65023, null);
        var13_13 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        var23_22 = var7_7.getCode();
        var13_13.gtmEventsToGaWithCategory("closet interaction", "add_to_cart_from_closet", "Added to Cart", (String)var23_22, "closet screen", (AnalyticsData)var29_28);
    }

    public final void q2(String object, String object2, int n3, boolean bl2, ProductOptionVariant object3, boolean bl3) {
        int n4;
        Intrinsics.checkNotNullParameter(object2, "sizeName");
        object = this.h;
        object2 = (ProductOptionVariant)((ArrayList)object).get(n3);
        ((ArrayList)object).remove(n3);
        ((ProductOptionVariant)object2).setSelected(true);
        ((ArrayList)object).add(n3, object2);
        object2 = this.i;
        Object object4 = null;
        if (object2 != null) {
            object2 = (ProductOptionItem)((ArrayList)object2).get(n3);
        } else {
            n4 = 0;
            object2 = null;
        }
        this.l = object2;
        n4 = this.k;
        int n7 = -1;
        if (n4 > n7 && n4 != n3) {
            object2 = (ProductOptionVariant)((ArrayList)object).get(n4);
            n7 = this.k;
            ((ArrayList)object).remove(n7);
            ((ProductOptionVariant)object2).setSelected(false);
            n7 = this.k;
            ((ArrayList)object).add(n7, object2);
        }
        if ((object2 = this.g) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProductDetailSizeAdapter");
            n4 = 0;
            object2 = null;
        }
        ((RecyclerView$f)object2).notifyDataSetChanged();
        this.k = n3;
        n4 = (int)(hv3_0.Y() ? 1 : 0);
        if (n4 != 0) {
            object2 = (ProductOptionVariant)((ArrayList)object).get(n3);
            object3 = this.d;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sizeUnitTv");
                n7 = 0;
                object3 = null;
            }
            Y63.h((TextView)object3, (ProductOptionVariant)object2);
            object2 = Y63.j((ProductOptionVariant)((ArrayList)object).get(n3));
            object3 = Boolean.TRUE;
            n4 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
            object3 = "brandSizeTv";
            if (n4 != 0) {
                int n8;
                String string2;
                object2 = this.e;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n4 = 0;
                    object2 = null;
                }
                if ((string2 = Y63.b((ProductOptionVariant)((ArrayList)object).get(n3))) != null && (n8 = string2.length()) != 0) {
                    object = Y63.b((ProductOptionVariant)((ArrayList)object).get(n3));
                    String string3 = "Brand Size ";
                    object = kp1_0.c(string3, (String)object);
                } else {
                    object = "";
                }
                object2.setText((CharSequence)object);
                object = this.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    object4 = object;
                }
                object4.setVisibility(0);
            } else {
                object = this.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    object4 = object;
                }
                int n10 = 4;
                object4.setVisibility(n10);
            }
        }
    }
}

