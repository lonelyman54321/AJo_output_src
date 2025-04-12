/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.GridSpaceItemDecoration;
import com.ril.ajio.customviews.widgets.AjioCustomGridLayoutManager;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.FeatureData;
import com.ril.ajio.services.data.Product.FeatureValue;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.SectionData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.ranges.f;
import kotlin.text.StringsKt;

/*
 * Renamed from Qh2
 */
public final class qh2_1
extends RecyclerView$B
implements View.OnClickListener {
    public static final Qh2$a Companion;
    public static final int t;
    public final View a;
    public final yi2_1 b;
    public final View c;
    public final ConstraintLayout d;
    public final AjioTextView e;
    public final ImageView f;
    public kv1_1 g;
    public final RecyclerView h;
    public final ConstraintLayout i;
    public final ConstraintLayout j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public kv1_1 n;
    public kv1_1 o;
    public final RecyclerView p;
    public final RecyclerView q;
    public final TextView r;
    public final NewCustomEventsRevamp s;

    static {
        Object object = new Object();
        Companion = object;
        object = h40_0.a;
        t = h40_0.k().optInt("max_key_value_pair");
    }

    public qh2_1(View object, yi2_1 yi2_12) {
        int n3;
        int n4;
        NewCustomEventsRevamp newCustomEventsRevamp;
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        super((View)object);
        this.a = object;
        this.b = yi2_12;
        this.s = newCustomEventsRevamp = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        Intrinsics.checkNotNullParameter(object, "itemView");
        this.c = object;
        newCustomEventsRevamp = null;
        String string2 = "parentView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        }
        object.getContext();
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        }
        int n7 = R$id.parent_product_details;
        object = (ConstraintLayout)object.findViewById(n7);
        this.i = object;
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        }
        n7 = R$id.cl_product_details;
        object = (ConstraintLayout)object.findViewById(n7);
        this.j = object;
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        }
        n7 = R$id.cl_more_less_details;
        object = (ConstraintLayout)object.findViewById(n7);
        this.d = object;
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        }
        n7 = R$id.row_pdp_details_tv_more_less;
        object = (AjioTextView)object.findViewById(n7);
        this.e = object;
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        }
        n7 = R$id.product_details_header;
        object = (TextView)object.findViewById(n7);
        this.r = object;
        n4 = yi2_12.c9();
        if (n4 == 0) {
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                object = null;
            }
            n3 = R$id.row_pdp_details_imv_more_detail;
            object = (ImageView)object.findViewById(n3);
            this.f = object;
        }
        if ((object = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        }
        n3 = R$id.recycler_view;
        object = (RecyclerView)object.findViewById(n3);
        this.h = object;
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        }
        n3 = R$id.rv_section2;
        object = (RecyclerView)object.findViewById(n3);
        this.p = object;
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        }
        n3 = R$id.rv_section3;
        object = (RecyclerView)object.findViewById(n3);
        this.q = object;
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        }
        n3 = R$id.row_pdp_description_layout_other_info;
        object = (RelativeLayout)object.findViewById(n3);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            newCustomEventsRevamp = object;
        }
        n4 = R$id.row_pdp_description_layout_disclosure;
        object = (LinearLayout)newCustomEventsRevamp.findViewById(n4);
    }

    public final void A(ArrayList arrayList) {
        kv1_1 kv1_12;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.g = kv1_12 = new kv1_1(arrayList2, true, false, false);
    }

    public final void B(ArrayList arrayList) {
        kv1_1 kv1_12;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.n = kv1_12 = new kv1_1(arrayList2, false, true, false);
    }

    public final void onClick(View object) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.cl_more_less_details;
        if (n3 == n4) {
            object = this.b;
            n3 = (int)(object.c9() ? 1 : 0);
            n4 = 0;
            string2 = null;
            String string3 = "mMoreLessButton";
            Object object2 = null;
            if (n3 != 0) {
                int n7;
                String string4;
                object = this.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object = null;
                }
                if ((n3 = (int)(StringsKt.F((CharSequence)(object = ((Object)((AppCompatTextView)object).getText()).toString()), string4 = hv3_0.K(n7 = R$string.plus_more_details), false) ? 1 : 0)) != 0) {
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                    } else {
                        object2 = object;
                    }
                    n3 = R$string.minus_less_details;
                    object = hv3_0.K(n3);
                    object2.setText((CharSequence)object);
                    this.x();
                } else {
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                    } else {
                        object2 = object;
                    }
                    n3 = R$string.plus_more_details;
                    object = hv3_0.K(n3);
                    object2.setText((CharSequence)object);
                    this.w();
                }
            } else {
                object = this.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object = null;
                }
                object = ((Object)((AppCompatTextView)object).getText()).toString();
                String string5 = "More details";
                n3 = (int)(StringsKt.F((CharSequence)object, string5, false) ? 1 : 0);
                string2 = "mMoreLessImage";
                if (n3 != 0) {
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n3 = 0;
                        object = null;
                    }
                    int n8 = R$string.less_details;
                    string3 = hv3_0.K(n8);
                    object.setText((CharSequence)string3);
                    object = this.f;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object2 = object;
                    }
                    n3 = R$drawable.ic_up_arrow_sneaker_hood;
                    object = hv3_0.r(n3);
                    object2.setImageDrawable((Drawable)object);
                    this.x();
                } else {
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n3 = 0;
                        object = null;
                    }
                    int n10 = R$string.more_details;
                    string3 = hv3_0.K(n10);
                    object.setText((CharSequence)string3);
                    object = this.f;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object2 = object;
                    }
                    n3 = R$drawable.ic_down_arrow_sneaker_hood;
                    object = hv3_0.r(n3);
                    object2.setImageDrawable((Drawable)object);
                    this.w();
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void w() {
        block74: {
            block75: {
                block73: {
                    block72: {
                        block71: {
                            block70: {
                                var1_1 = this.p;
                                var2_2 = this.q;
                                var3_3 = h40_0.a;
                                var4_4 = h40_0.n2();
                                var5_5 = "rv_section2";
                                var6_6 = "rv_section3";
                                var7_7 /* !! */  = "detailsAdapter";
                                var8_8 = 4;
                                var9_9 = 8;
                                var10_10 = 1;
                                var11_11 = "filteredFeatureDataList";
                                var12_12 = null;
                                if (var4_4 == 0) break block70;
                                var3_3 = this.k;
                                if (var3_3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                    var4_4 = 0;
                                    var3_3 = null;
                                }
                                if ((var4_4 = var3_3.size()) <= 0) ** GOTO lbl-1000
                                var3_3 = this.k;
                                if (var3_3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                    var4_4 = 0;
                                    var3_3 = null;
                                }
                                if ((var4_4 = var3_3.size()) > var9_9) {
                                    var3_3 = this.g;
                                    if (var3_3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var7_7 /* !! */ );
                                        var4_4 = 0;
                                        var3_3 = null;
                                    }
                                    var3_3.g();
                                    var13_13 /* !! */  = this.k;
                                    if (var13_13 /* !! */  == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                        var14_17 = 0;
                                        var13_13 /* !! */  = null;
                                    }
                                    var15_18 = kotlin.ranges.f.m(0, var9_9);
                                    var13_13 /* !! */  = CollectionsKt.c0(var13_13 /* !! */ , var15_18);
                                    var7_7 /* !! */  = new ArrayList<E>(var13_13 /* !! */ );
                                    var3_3.h(var7_7 /* !! */ , false);
                                } else lbl-1000:
                                // 2 sources

                                {
                                    if ((var3_3 = this.k) == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                        var4_4 = 0;
                                        var3_3 = null;
                                    }
                                    if ((var4_4 = var3_3.size()) > 0) {
                                        var3_3 = this.g;
                                        if (var3_3 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var7_7 /* !! */ );
                                            var4_4 = 0;
                                            var3_3 = null;
                                        }
                                        var3_3.g();
                                        var13_14 = this.k;
                                        if (var13_14 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                            var14_17 = 0;
                                            var13_14 = null;
                                        }
                                        var7_7 /* !! */  = new ArrayList<E>(var13_14);
                                        var13_14 = this.k;
                                        if (var13_14 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                            var14_17 = 0;
                                            var13_14 = null;
                                        }
                                        if ((var14_17 = var13_14.size()) <= (var16_19 = 6)) {
                                            var14_17 = 1;
                                        } else {
                                            var14_17 = 0;
                                            var13_14 = null;
                                        }
                                        var3_3.h(var7_7 /* !! */ , (boolean)var14_17);
                                    }
                                }
                                break block71;
                            }
                            var3_3 = this.k;
                            if (var3_3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                var4_4 = 0;
                                var3_3 = null;
                            }
                            if ((var4_4 = var3_3.size()) <= 0) ** GOTO lbl-1000
                            var3_3 = this.k;
                            if (var3_3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                var4_4 = 0;
                                var3_3 = null;
                            }
                            if ((var4_4 = var3_3.size()) > var8_8) {
                                if (var1_1 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                                    var4_4 = 0;
                                    var3_3 = null;
                                } else {
                                    var3_3 = var1_1;
                                }
                                var3_3.setVisibility(var9_9);
                                if (var2_2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                                    var4_4 = 0;
                                    var3_3 = null;
                                } else {
                                    var3_3 = var2_2;
                                }
                                var3_3.setVisibility(var9_9);
                                var3_3 = this.g;
                                if (var3_3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var7_7 /* !! */ );
                                    var4_4 = 0;
                                    var3_3 = null;
                                }
                                var3_3.g();
                                var13_15 /* !! */  = this.k;
                                if (var13_15 /* !! */  == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                    var14_17 = 0;
                                    var13_15 /* !! */  = null;
                                }
                                var15_18 = kotlin.ranges.f.m(0, var8_8);
                                var13_15 /* !! */  = CollectionsKt.c0(var13_15 /* !! */ , var15_18);
                                var7_7 /* !! */  = new ArrayList<E>(var13_15 /* !! */ );
                                var3_3.h(var7_7 /* !! */ , false);
                            } else lbl-1000:
                            // 2 sources

                            {
                                if ((var3_3 = this.k) == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                    var4_4 = 0;
                                    var3_3 = null;
                                }
                                if ((var4_4 = var3_3.size()) > 0) {
                                    var3_3 = this.g;
                                    if (var3_3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var7_7 /* !! */ );
                                        var4_4 = 0;
                                        var3_3 = null;
                                    }
                                    var3_3.g();
                                    var13_16 = this.k;
                                    if (var13_16 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                        var14_17 = 0;
                                        var13_16 = null;
                                    }
                                    var7_7 /* !! */  = new ArrayList<E>(var13_16);
                                    var13_16 = this.k;
                                    if (var13_16 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                        var14_17 = 0;
                                        var13_16 = null;
                                    }
                                    if ((var14_17 = var13_16.size()) < var8_8) {
                                        var14_17 = 1;
                                    } else {
                                        var14_17 = 0;
                                        var13_16 = null;
                                    }
                                    var3_3.h(var7_7 /* !! */ , (boolean)var14_17);
                                }
                            }
                        }
                        var3_3 = this.l;
                        var7_7 /* !! */  = "section2filteredFeatureDataList";
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var7_7 /* !! */ );
                            var4_4 = 0;
                            var3_3 = null;
                        }
                        var4_4 = var3_3.size();
                        var14_17 = 7;
                        if (var4_4 <= 0) ** GOTO lbl-1000
                        var4_4 = (int)h40_0.n2();
                        if (var4_4 == 0) break block72;
                        var3_3 = this.k;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                            var4_4 = 0;
                            var3_3 = null;
                        }
                        if ((var4_4 = var3_3.size()) < var14_17) ** GOTO lbl-1000
                    }
                    if ((var4_4 = (int)h40_0.n2()) == 0) {
                        var3_3 = this.k;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                            var4_4 = 0;
                            var3_3 = null;
                        }
                        ** if ((var4_4 = var3_3.size()) >= var8_8) goto lbl-1000
                    }
                    ** GOTO lbl-1000
lbl-1000:
                    // 2 sources

                    {
                        var1_1 = this.n;
                        var3_3 = "detailsAdapterTwo";
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
                            var17_20 = 0;
                            var1_1 = null;
                        }
                        var1_1.g();
                        var5_5 = this.n;
                        if (var5_5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
                            var18_21 = false;
                            var5_5 = null;
                        }
                        var5_5.f = var10_10;
                        var4_4 = (int)h40_0.p2();
                        if (var4_4 != 0) {
                            var5_5 = this.l;
                            if (var5_5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var7_7 /* !! */ );
                                var18_21 = false;
                                var5_5 = null;
                            }
                            if ((var19_22 = this.l) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var7_7 /* !! */ );
                                var20_23 = 0;
                                var19_22 = null;
                            }
                            if ((var20_23 = var19_22.size()) > var10_10) {
                                var20_23 = 1;
                            } else {
                                var20_23 = 0;
                                var19_22 = null;
                            }
                            var15_18 = new c(0, var20_23, var10_10);
                            var5_5 = CollectionsKt.c0(var5_5, var15_18);
                            var3_3 = new Object(var5_5);
                            var1_1.h((ArrayList)var3_3, false);
                        } else {
                            var5_5 = this.l;
                            if (var5_5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var7_7 /* !! */ );
                                var18_21 = false;
                                var5_5 = null;
                            }
                            var15_18 = new c(0, 0, var10_10);
                            var5_5 = CollectionsKt.c0(var5_5, var15_18);
                            var3_3 = new Object(var5_5);
                            var1_1.h((ArrayList)var3_3, false);
                        }
                        ** GOTO lbl218
                    }
lbl-1000:
                    // 3 sources

                    {
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                            var17_20 = 0;
                            var1_1 = null;
                        }
                        var1_1.setVisibility(var9_9);
                    }
lbl218:
                    // 3 sources

                    var1_1 = this.k;
                    if (var1_1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                        var17_20 = 0;
                        var1_1 = null;
                    }
                    if ((var17_20 = var1_1.size()) != 0) break block73;
                    var1_1 = this.l;
                    if (var1_1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var7_7 /* !! */ );
                        var17_20 = 0;
                        var1_1 = null;
                    }
                    if ((var17_20 = var1_1.size()) == 0) break block74;
                }
                if ((var17_20 = (int)h40_0.n2()) == 0) break block75;
                var1_1 = this.k;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var17_20 = 0;
                    var1_1 = null;
                }
                if ((var17_20 = var1_1.size()) == 0) break block75;
                var1_1 = this.k;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var17_20 = 0;
                    var1_1 = null;
                }
                if ((var17_20 = var1_1.size()) >= var14_17) break block75;
                var1_1 = this.l;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var7_7 /* !! */ );
                    var17_20 = 0;
                    var1_1 = null;
                }
                if ((var17_20 = var1_1.size()) == 0) break block74;
            }
            if ((var17_20 = (int)h40_0.n2()) != 0) ** GOTO lbl-1000
            var1_1 = this.k;
            if (var1_1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                var17_20 = 0;
                var1_1 = null;
            }
            if ((var17_20 = var1_1.size()) == 0) ** GOTO lbl-1000
            var1_1 = this.k;
            if (var1_1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                var17_20 = 0;
                var1_1 = null;
            }
            if ((var17_20 = var1_1.size()) >= var8_8) ** GOTO lbl-1000
            var1_1 = this.l;
            if (var1_1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var7_7 /* !! */ );
                var17_20 = 0;
                var1_1 = null;
            }
            if ((var17_20 = var1_1.size()) != 0) ** GOTO lbl-1000
        }
        var1_1 = this.m;
        var3_3 = "section3filteredFeatureDataList";
        if (var1_1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
            var17_20 = 0;
            var1_1 = null;
        }
        if ((var17_20 = var1_1.size()) > 0) {
            if (var2_2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                var2_2 = null;
            }
            var2_2.setVisibility(0);
            var1_1 = this.o;
            var2_2 = "detailsAdapterThree";
            if (var1_1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                var17_20 = 0;
                var1_1 = null;
            }
            var1_1.g();
            var5_5 = this.o;
            if (var5_5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                var18_21 = false;
                var5_5 = null;
            }
            var5_5.f = false;
            var18_21 = h40_0.o2();
            if (!var18_21) {
                var6_6 = this.m;
                if (var6_6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var3_3);
                    var6_6 = null;
                }
                var3_3 = new Object(0, 0, var10_10);
                var3_3 = CollectionsKt.c0((List)var6_6, var3_3);
                var5_5 = new ArrayList(var3_3);
                var1_1.h(var5_5, false);
            } else {
                var6_6 = this.m;
                if (var6_6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var3_3);
                    var6_6 = null;
                }
                if ((var21_24 = this.m) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var3_3);
                    var8_8 = 0;
                    var21_24 = null;
                }
                if ((var4_4 = var21_24.size()) > var10_10) {
                    var4_4 = 1;
                } else {
                    var4_4 = 0;
                    var3_3 = null;
                }
                var7_7 /* !! */  = new ArrayList<E>(0, var4_4, var10_10);
                var3_3 = CollectionsKt.c0((List)var6_6, var7_7 /* !! */ );
                var5_5 = new ArrayList(var3_3);
                var1_1.h(var5_5, false);
            }
            var1_1 = this.o;
            if (var1_1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
            } else {
                var12_12 = var1_1;
            }
            var12_12.f = var10_10;
        } else lbl-1000:
        // 5 sources

        {
            if (var2_2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                var2_2 = null;
            }
            var2_2.setVisibility(var9_9);
        }
        this.y("view less");
    }

    public final void x() {
        Object object;
        ArrayList arrayList;
        int n3;
        Object object2 = this.k;
        String string2 = "filteredFeatureDataList";
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        n3 = ((ArrayList)object2).size();
        boolean bl2 = true;
        if (n3 > 0) {
            object2 = this.g;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("detailsAdapter");
                n3 = 0;
                object2 = null;
            }
            ((kv1_1)object2).g();
            arrayList = this.k;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                arrayList = null;
            }
            ((kv1_1)object2).h(arrayList, bl2);
        }
        object2 = this.l;
        string2 = "section2filteredFeatureDataList";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        n3 = ((ArrayList)object2).size();
        arrayList = null;
        if (n3 > 0) {
            object2 = this.p;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rv_section2");
                n3 = 0;
                object2 = null;
            }
            object2.setVisibility(0);
            object2 = this.n;
            object = "detailsAdapterTwo";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n3 = 0;
                object2 = null;
            }
            ((kv1_1)object2).g();
            kv1_1 kv1_12 = this.n;
            if (kv1_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                kv1_12 = null;
            }
            kv1_12.f = false;
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object = null;
            }
            ((kv1_1)object2).h((ArrayList)object, bl2);
        }
        object2 = this.m;
        string2 = "section3filteredFeatureDataList";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        if ((n3 = ((ArrayList)object2).size()) > 0) {
            object2 = this.q;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rv_section3");
                n3 = 0;
                object2 = null;
            }
            object2.setVisibility(0);
            object2 = this.o;
            Object object4 = "detailsAdapterThree";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object2 = null;
            }
            ((kv1_1)object2).g();
            object = this.o;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                object = null;
            }
            ((kv1_1)object).f = false;
            object4 = this.m;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object4;
            }
            ((kv1_1)object2).h((ArrayList)object3, false);
        }
        this.y("view more");
    }

    public final void y(String string2) {
        Bundle bundle = new Bundle();
        Object object = this.b;
        Object object2 = object.l6();
        bundle.putString("product_id", (String)object2);
        object2 = object.x5();
        String string3 = null;
        object2 = object2 != null ? ((Product)object2).getName() : null;
        String string4 = "product_name";
        bundle.putString(string4, (String)object2);
        object = object.x5();
        if (object != null) {
            string3 = ((Product)object).getBrandName();
        }
        bundle.putString("product_brand", string3);
        object = AnalyticsManager.Companion;
        String string5 = bv_0.a((AnalyticsManager$Companion)object);
        String string6 = cv_0.a((AnalyticsManager$Companion)object);
        object = this.s;
        string4 = string2;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, "product details interactions", "product detail", string2, "product_details_interactions", "pdp screen", "pdp screen", string5, bundle, string6, false, null, 1536, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void z(SectionData var1_1, SectionData var2_2, SectionData var3_3) {
        block257: {
            block250: {
                block256: {
                    block255: {
                        block254: {
                            block253: {
                                block252: {
                                    block251: {
                                        block249: {
                                            block238: {
                                                block247: {
                                                    block248: {
                                                        block246: {
                                                            block244: {
                                                                block245: {
                                                                    block243: {
                                                                        block242: {
                                                                            block241: {
                                                                                block240: {
                                                                                    block239: {
                                                                                        block225: {
                                                                                            block226: {
                                                                                                block237: {
                                                                                                    block233: {
                                                                                                        block234: {
                                                                                                            block236: {
                                                                                                                block235: {
                                                                                                                    block227: {
                                                                                                                        block232: {
                                                                                                                            block228: {
                                                                                                                                block229: {
                                                                                                                                    block231: {
                                                                                                                                        block230: {
                                                                                                                                            var4_4 = this;
                                                                                                                                            var5_5 = this.i;
                                                                                                                                            var6_6 = this.e;
                                                                                                                                            var7_7 = this.h;
                                                                                                                                            var8_8 = this.q;
                                                                                                                                            var9_9 = this.p;
                                                                                                                                            var10_10 = this.d;
                                                                                                                                            var11_11 = h40_0.a;
                                                                                                                                            var11_11 = h40_0.k();
                                                                                                                                            var12_12 /* !! */  = "better_pdp_title";
                                                                                                                                            var11_11 = var11_11.optString((String)var12_12 /* !! */ );
                                                                                                                                            var13_13 = "optString(...)";
                                                                                                                                            Intrinsics.checkNotNullExpressionValue(var11_11, (String)var13_13);
                                                                                                                                            if (var11_11 != null && (var14_14 = var11_11.length()) != 0) {
                                                                                                                                                var11_11 = this.r;
                                                                                                                                                if (var11_11 == null) {
                                                                                                                                                    Intrinsics.throwUninitializedPropertyAccessException("product_details_header");
                                                                                                                                                    var14_14 = 0;
                                                                                                                                                    var11_11 = null;
                                                                                                                                                }
                                                                                                                                                var15_15 = h40_0.k();
                                                                                                                                                var12_12 /* !! */  = var15_15.optString((String)var12_12 /* !! */ );
                                                                                                                                                Intrinsics.checkNotNullExpressionValue(var12_12 /* !! */ , (String)var13_13);
                                                                                                                                                var11_11.setText((CharSequence)var12_12 /* !! */ );
                                                                                                                                            }
                                                                                                                                            var16_16 = qh2_1.t;
                                                                                                                                            var17_17 = "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Product.FeatureData>";
                                                                                                                                            var18_18 = "mMoreLessLayout";
                                                                                                                                            var19_19 = "filteredFeatureDataList";
                                                                                                                                            var20_20 = 0;
                                                                                                                                            var21_21 /* !! */  = null;
                                                                                                                                            var13_13 = "recyclerview";
                                                                                                                                            if (var1_1 == null) break block226;
                                                                                                                                            var22_22 = var1_1.getFeatureData();
                                                                                                                                            if (var22_22 != null) {
                                                                                                                                                var23_23 = var22_22.size();
                                                                                                                                            } else {
                                                                                                                                                var23_23 = 0;
                                                                                                                                                var22_22 = null;
                                                                                                                                            }
                                                                                                                                            if (var23_23 <= 0) break block226;
                                                                                                                                            var22_22 = var1_1.getFeatureData();
                                                                                                                                            Intrinsics.checkNotNull(var22_22);
                                                                                                                                            var22_22 = (Iterable)var22_22;
                                                                                                                                            var15_15 = new ArrayList();
                                                                                                                                            var22_22 = var22_22.iterator();
                                                                                                                                            while (var24_24 = var22_22.hasNext()) {
                                                                                                                                                var25_25 = var11_11 = var22_22.next();
                                                                                                                                                var25_25 = (FeatureData)var11_11;
                                                                                                                                                var26_26 = var25_25.getName();
                                                                                                                                                if (var26_26 == null) ** GOTO lbl-1000
                                                                                                                                                var12_12 /* !! */  = var25_25.getFeatureValues();
                                                                                                                                                if (var12_12 /* !! */  != null && (var12_12 /* !! */  = (FeatureValue)var12_12 /* !! */ .get(0)) != null) {
                                                                                                                                                    var12_12 /* !! */  = var12_12 /* !! */ .getValue();
                                                                                                                                                } else {
                                                                                                                                                    var27_27 = 0;
                                                                                                                                                    var12_12 /* !! */  = null;
                                                                                                                                                }
                                                                                                                                                if (var12_12 /* !! */  == null || (var27_27 = TextUtils.isEmpty((CharSequence)(var12_12 /* !! */  = var25_25.getName()))) != 0) ** GOTO lbl-1000
                                                                                                                                                var12_12 /* !! */  = var25_25.getFeatureValues();
                                                                                                                                                if (var12_12 /* !! */  != null && (var12_12 /* !! */  = (FeatureValue)var12_12 /* !! */ .get(0)) != null) {
                                                                                                                                                    var12_12 /* !! */  = var12_12 /* !! */ .getValue();
                                                                                                                                                } else {
                                                                                                                                                    var27_27 = 0;
                                                                                                                                                    var12_12 /* !! */  = null;
                                                                                                                                                }
                                                                                                                                                var27_27 = TextUtils.isEmpty((CharSequence)var12_12 /* !! */ );
                                                                                                                                                if (var27_27 == 0) {
                                                                                                                                                    var27_27 = 1;
                                                                                                                                                } else lbl-1000:
                                                                                                                                                // 3 sources

                                                                                                                                                {
                                                                                                                                                    var27_27 = 0;
                                                                                                                                                    var12_12 /* !! */  = null;
                                                                                                                                                }
                                                                                                                                                if (var27_27 == 0) continue;
                                                                                                                                                var15_15.add(var11_11);
                                                                                                                                            }
                                                                                                                                            var4_4.k = var15_15;
                                                                                                                                            var14_14 = var15_15.size();
                                                                                                                                            if (var14_14 > var16_16) {
                                                                                                                                                var14_14 = 1;
                                                                                                                                                if (var16_16 == var14_14) {
                                                                                                                                                    var12_12 /* !! */  = var4_4.k;
                                                                                                                                                    if (var12_12 /* !! */  == null) {
                                                                                                                                                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                                                                                                                                        var27_27 = 0;
                                                                                                                                                        var12_12 /* !! */  = null;
                                                                                                                                                    }
                                                                                                                                                    var15_15 = new c(0, 0, var14_14);
                                                                                                                                                    var11_11 = CollectionsKt.c0(var12_12 /* !! */ , (IntRange)var15_15);
                                                                                                                                                    var11_11 = (Collection)var11_11;
                                                                                                                                                    var4_4.k = var12_12 /* !! */  = new ArrayList(var11_11);
                                                                                                                                                } else {
                                                                                                                                                    var11_11 = var4_4.k;
                                                                                                                                                    if (var11_11 == null) {
                                                                                                                                                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                                                                                                                                        var14_14 = 0;
                                                                                                                                                        var11_11 = null;
                                                                                                                                                    }
                                                                                                                                                    var12_12 /* !! */  = kotlin.ranges.f.m(0, var16_16);
                                                                                                                                                    var11_11 = CollectionsKt.c0((List)var11_11, (IntRange)var12_12 /* !! */ );
                                                                                                                                                    Intrinsics.checkNotNull(var11_11, var17_17);
                                                                                                                                                    var11_11 = (ArrayList)var11_11;
                                                                                                                                                    var4_4.k = var11_11;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var11_11 = h40_0.a;
                                                                                                                                            var14_14 = (int)h40_0.n2();
                                                                                                                                            var12_12 /* !! */  = "detailsAdapter";
                                                                                                                                            if (var14_14 == 0) break block227;
                                                                                                                                            var11_11 = var4_4.k;
                                                                                                                                            if (var11_11 == null) {
                                                                                                                                                Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                                                                                                                                var14_14 = 0;
                                                                                                                                                var11_11 = null;
                                                                                                                                            }
                                                                                                                                            if ((var14_14 = var11_11.size()) > (var28_28 = 8)) break block228;
                                                                                                                                            if (var10_10 == null) {
                                                                                                                                                Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                                                                                                                                                var14_14 = 0;
                                                                                                                                                var11_11 = null;
                                                                                                                                            } else {
                                                                                                                                                var11_11 = var10_10;
                                                                                                                                            }
                                                                                                                                            var11_11.setVisibility(var28_28);
                                                                                                                                            var11_11 = var4_4.k;
                                                                                                                                            if (var11_11 == null) {
                                                                                                                                                Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                                                                                                                                var14_14 = 0;
                                                                                                                                                var11_11 = null;
                                                                                                                                            }
                                                                                                                                            var4_4.A((ArrayList)var11_11);
                                                                                                                                            var11_11 = var4_4.k;
                                                                                                                                            if (var11_11 == null) {
                                                                                                                                                Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                                                                                                                                var14_14 = 0;
                                                                                                                                                var11_11 = null;
                                                                                                                                            }
                                                                                                                                            if ((var14_14 = var11_11.size()) > (var28_28 = 6)) break block229;
                                                                                                                                            if (var2_2 == null) break block230;
                                                                                                                                            var11_11 = var2_2.getFeatureData();
                                                                                                                                            if (var11_11 != null) {
                                                                                                                                                var14_14 = var11_11.size();
                                                                                                                                            } else {
                                                                                                                                                var14_14 = 0;
                                                                                                                                                var11_11 = null;
                                                                                                                                            }
                                                                                                                                            if (var14_14 > 0) break block231;
                                                                                                                                        }
                                                                                                                                        if (var3_3 == null) break block229;
                                                                                                                                        var11_11 = var3_3.getFeatureData();
                                                                                                                                        if (var11_11 != null) {
                                                                                                                                            var14_14 = var11_11.size();
                                                                                                                                        } else {
                                                                                                                                            var14_14 = 0;
                                                                                                                                            var11_11 = null;
                                                                                                                                        }
                                                                                                                                        if (var14_14 <= 0) break block229;
                                                                                                                                    }
                                                                                                                                    if ((var11_11 = var4_4.g) == null) {
                                                                                                                                        Intrinsics.throwUninitializedPropertyAccessException(var12_12 /* !! */ );
                                                                                                                                        var14_14 = 0;
                                                                                                                                        var11_11 = null;
                                                                                                                                    }
                                                                                                                                    var28_28 = 1;
                                                                                                                                    var11_11.e = var28_28;
                                                                                                                                }
                                                                                                                                var22_22 = var5_5;
                                                                                                                                break block232;
                                                                                                                            }
                                                                                                                            if (var10_10 == null) {
                                                                                                                                Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                                                                                                                                var14_14 = 0;
                                                                                                                                var11_11 = null;
                                                                                                                            } else {
                                                                                                                                var11_11 = var10_10;
                                                                                                                            }
                                                                                                                            var11_11.setVisibility(0);
                                                                                                                            var11_11 = var4_4.k;
                                                                                                                            if (var11_11 == null) {
                                                                                                                                Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                                                                                                                var22_22 = var5_5;
                                                                                                                                var14_14 = 0;
                                                                                                                                var11_11 = null;
lbl167:
                                                                                                                                // 2 sources

                                                                                                                                while (true) {
                                                                                                                                    continue;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var22_22 = var5_5;
                                                                                                                            ** while (true)
                                                                                                                            var28_28 = 8;
                                                                                                                            var5_5 = kotlin.ranges.f.m(0, var28_28);
                                                                                                                            var5_5 = CollectionsKt.c0((List)var11_11, (IntRange)var5_5);
                                                                                                                            Intrinsics.checkNotNull(var5_5, var17_17);
                                                                                                                            var5_5 = (ArrayList)var5_5;
                                                                                                                            var4_4.A((ArrayList)var5_5);
                                                                                                                        }
                                                                                                                        if (var7_7 == null) {
                                                                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                                                                                                                            var29_29 = 1;
                                                                                                                            var30_30 = false;
                                                                                                                            var7_7 = null;
                                                                                                                        } else {
                                                                                                                            var29_29 = 1;
                                                                                                                        }
                                                                                                                        var7_7.setHasFixedSize((boolean)var29_29);
                                                                                                                        var11_11 = var7_7.getContext();
                                                                                                                        var31_31 = 2 != 0;
                                                                                                                        var5_5 = new AjioCustomGridLayoutManager((Context)var11_11, (int)var31_31);
                                                                                                                        var7_7.setLayoutManager((RecyclerView$o)var5_5);
                                                                                                                        var11_11 = var7_7.getContext().getResources().getDisplayMetrics();
                                                                                                                        var14_14 = var11_11.densityDpi / 160;
                                                                                                                        var32_32 = var14_14;
                                                                                                                        var34_33 = 5.5;
                                                                                                                        var5_5 = new GridSpaceItemDecoration(var32_32 *= var34_33);
                                                                                                                        var7_7.addItemDecoration((RecyclerView$n)var5_5);
                                                                                                                        var5_5 = var4_4.g;
                                                                                                                        if (var5_5 == null) {
                                                                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var12_12 /* !! */ );
                                                                                                                            var29_29 = 0;
                                                                                                                            var5_5 = null;
                                                                                                                        }
                                                                                                                        var7_7.setAdapter((RecyclerView$f)var5_5);
                                                                                                                        var36_34 = var6_6;
lbl203:
                                                                                                                        // 2 sources

                                                                                                                        while (true) {
                                                                                                                            var29_29 = 8;
                                                                                                                            break block225;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var22_22 = var5_5;
                                                                                                                    var5_5 = var4_4.k;
                                                                                                                    if (var5_5 == null) {
                                                                                                                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                                                                                                        var29_29 = 0;
                                                                                                                        var5_5 = null;
                                                                                                                    }
                                                                                                                    if ((var29_29 = var5_5.size()) > (var14_14 = 4)) break block233;
                                                                                                                    if (var10_10 == null) {
                                                                                                                        Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                                                                                                                        var29_29 = 0;
                                                                                                                        var5_5 = null;
                                                                                                                    } else {
                                                                                                                        var5_5 = var10_10;
                                                                                                                    }
                                                                                                                    if (var10_10 == null) {
                                                                                                                        Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                                                                                                                        var14_14 = 0;
                                                                                                                        var11_11 = null;
                                                                                                                    } else {
                                                                                                                        var11_11 = var10_10;
                                                                                                                    }
                                                                                                                    var14_14 = var11_11.getVisibility();
                                                                                                                    if (var14_14 == 0) {
                                                                                                                        var14_14 = 0;
                                                                                                                        var11_11 = null;
                                                                                                                    } else {
                                                                                                                        var14_14 = 8;
                                                                                                                    }
                                                                                                                    var5_5.setVisibility(var14_14);
                                                                                                                    var11_11 = var4_4.k;
                                                                                                                    if (var11_11 == null) {
                                                                                                                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                                                                                                        var14_14 = 0;
                                                                                                                        var11_11 = null;
                                                                                                                    }
                                                                                                                    var5_5 = new ArrayList(var11_11);
                                                                                                                    var4_4.A((ArrayList)var5_5);
                                                                                                                    var5_5 = var4_4.k;
                                                                                                                    if (var5_5 == null) {
                                                                                                                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                                                                                                        var29_29 = 0;
                                                                                                                        var5_5 = null;
                                                                                                                    }
                                                                                                                    if ((var29_29 = var5_5.size()) >= (var14_14 = 4)) break block234;
                                                                                                                    if (var2_2 == null) break block235;
                                                                                                                    var5_5 = var2_2.getFeatureData();
                                                                                                                    if (var5_5 != null) {
                                                                                                                        var29_29 = var5_5.size();
                                                                                                                    } else {
                                                                                                                        var29_29 = 0;
                                                                                                                        var5_5 = null;
                                                                                                                    }
                                                                                                                    if (var29_29 > 0) break block236;
                                                                                                                }
                                                                                                                if (var3_3 == null) break block234;
                                                                                                                var5_5 = var3_3.getFeatureData();
                                                                                                                if (var5_5 != null) {
                                                                                                                    var29_29 = var5_5.size();
                                                                                                                } else {
                                                                                                                    var29_29 = 0;
                                                                                                                    var5_5 = null;
                                                                                                                }
                                                                                                                if (var29_29 <= 0) break block234;
                                                                                                            }
                                                                                                            if ((var5_5 = var4_4.g) == null) {
                                                                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var12_12 /* !! */ );
                                                                                                                var29_29 = 0;
                                                                                                                var5_5 = null;
                                                                                                            }
                                                                                                            var14_14 = 1;
                                                                                                            var5_5.e = var14_14;
                                                                                                        }
                                                                                                        var36_34 = var6_6;
                                                                                                        break block237;
                                                                                                    }
                                                                                                    if (var10_10 == null) {
                                                                                                        Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                                                                                                        var29_29 = 0;
                                                                                                        var5_5 = null;
                                                                                                        var14_14 = 0;
                                                                                                        var11_11 = null;
                                                                                                    } else {
                                                                                                        var11_11 = var10_10;
                                                                                                        var29_29 = 0;
                                                                                                        var5_5 = null;
                                                                                                    }
                                                                                                    var11_11.setVisibility(0);
                                                                                                    var21_21 /* !! */  = var4_4.k;
                                                                                                    if (var21_21 /* !! */  == null) {
                                                                                                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                                                                                        var36_34 = var6_6;
                                                                                                        var20_20 = 0;
                                                                                                        var21_21 /* !! */  = null;
lbl291:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            continue;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    var36_34 = var6_6;
                                                                                                    ** while (true)
                                                                                                    var28_28 = 4;
                                                                                                    var6_6 = kotlin.ranges.f.m(0, var28_28);
                                                                                                    var5_5 = CollectionsKt.c0((List)var21_21 /* !! */ , (IntRange)var6_6);
                                                                                                    var11_11 = new ArrayList(var5_5);
                                                                                                    var4_4.A((ArrayList)var11_11);
                                                                                                }
                                                                                                if (var7_7 == null) {
                                                                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                                                                                                    var29_29 = 1;
                                                                                                    var30_30 = false;
                                                                                                    var7_7 = null;
                                                                                                } else {
                                                                                                    var29_29 = 1;
                                                                                                }
                                                                                                var7_7.setHasFixedSize((boolean)var29_29);
                                                                                                var6_6 = var7_7.getContext();
                                                                                                var5_5 = new LinearLayoutManager((Context)var6_6);
                                                                                                var7_7.setLayoutManager((RecyclerView$o)var5_5);
                                                                                                var5_5 = var4_4.g;
                                                                                                if (var5_5 == null) {
                                                                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_12 /* !! */ );
                                                                                                    var29_29 = 0;
                                                                                                    var5_5 = null;
                                                                                                }
                                                                                                var7_7.setAdapter((RecyclerView$f)var5_5);
                                                                                                ** while (true)
                                                                                            }
                                                                                            var22_22 = var5_5;
                                                                                            var36_34 = var6_6;
                                                                                            var5_5 = new ArrayList();
                                                                                            var4_4.k = var5_5;
                                                                                            if (var7_7 == null) {
                                                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                                                                                                var29_29 = 8;
                                                                                                var30_30 = false;
                                                                                                var7_7 = null;
                                                                                            } else {
                                                                                                var29_29 = 8;
                                                                                            }
                                                                                            var7_7.setVisibility(var29_29);
                                                                                        }
                                                                                        var6_6 = "rv_section2";
                                                                                        if (var9_9 == null) {
                                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                                                                                            var30_30 = false;
                                                                                            var7_7 = null;
                                                                                        } else {
                                                                                            var7_7 = var9_9;
                                                                                        }
                                                                                        var7_7.setVisibility(var29_29);
                                                                                        if (var2_2 != null) {
                                                                                            var5_5 = var2_2.getFeatureData();
                                                                                        } else {
                                                                                            var29_29 = 0;
                                                                                            var5_5 = null;
                                                                                        }
                                                                                        var11_11 = "section2filteredFeatureDataList";
                                                                                        if (var5_5 == null) break block238;
                                                                                        var5_5 = var2_2.getFeatureData();
                                                                                        if (var5_5 != null) {
                                                                                            var29_29 = var5_5.size();
                                                                                        } else {
                                                                                            var29_29 = 0;
                                                                                            var5_5 = null;
                                                                                        }
                                                                                        if (var29_29 <= 0) break block238;
                                                                                        var5_5 = var2_2.getFeatureData();
                                                                                        if (var5_5 == null) break block239;
                                                                                        var5_5 = (Iterable)var5_5;
                                                                                        var12_12 /* !! */  = new ArrayList();
                                                                                        var5_5 = var5_5.iterator();
                                                                                        while (var31_31 = var5_5.hasNext()) {
                                                                                            var21_21 /* !! */  = var13_13 = var5_5.next();
                                                                                            var21_21 /* !! */  = (FeatureData)var13_13;
                                                                                            var15_15 = var21_21 /* !! */ .getName();
                                                                                            if (var15_15 == null) ** GOTO lbl-1000
                                                                                            var15_15 = var21_21 /* !! */ .getFeatureValues();
                                                                                            if (var15_15 == null) ** GOTO lbl-1000
                                                                                            var30_30 = false;
                                                                                            var7_7 = null;
                                                                                            if ((var15_15 = (FeatureValue)var15_15.get(0)) != null) {
                                                                                                var7_7 = var15_15.getValue();
                                                                                            } else lbl-1000:
                                                                                            // 2 sources

                                                                                            {
                                                                                                var30_30 = false;
                                                                                                var7_7 = null;
                                                                                            }
                                                                                            if (var7_7 == null || (var30_30 = TextUtils.isEmpty((CharSequence)(var7_7 = var21_21 /* !! */ .getName())))) ** GOTO lbl-1000
                                                                                            var7_7 = var21_21 /* !! */ .getFeatureValues();
                                                                                            if (var7_7 == null) ** GOTO lbl-1000
                                                                                            var20_20 = 0;
                                                                                            var21_21 /* !! */  = null;
                                                                                            if ((var7_7 = (FeatureValue)var7_7.get(0)) != null) {
                                                                                                var7_7 = var7_7.getValue();
                                                                                            } else lbl-1000:
                                                                                            // 2 sources

                                                                                            {
                                                                                                var30_30 = false;
                                                                                                var7_7 = null;
                                                                                            }
                                                                                            var30_30 = TextUtils.isEmpty(var7_7);
                                                                                            if (!var30_30) {
                                                                                                var30_30 = true;
                                                                                            } else lbl-1000:
                                                                                            // 3 sources

                                                                                            {
                                                                                                var30_30 = false;
                                                                                                var7_7 = null;
                                                                                            }
                                                                                            if (!var30_30) continue;
                                                                                            var12_12 /* !! */ .add(var13_13);
                                                                                        }
                                                                                        break block240;
                                                                                    }
                                                                                    var27_27 = 0;
                                                                                    var12_12 /* !! */  = null;
                                                                                }
                                                                                Intrinsics.checkNotNull(var12_12 /* !! */ , var17_17);
                                                                                var4_4.l = var12_12 /* !! */ ;
                                                                                if (var12_12 /* !! */  == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                                                                    var27_27 = 0;
                                                                                    var12_12 /* !! */  = null;
                                                                                }
                                                                                if ((var29_29 = var12_12 /* !! */ .size()) > var16_16) {
                                                                                    var29_29 = 1;
                                                                                    if (var16_16 == var29_29) {
                                                                                        var7_7 = var4_4.l;
                                                                                        if (var7_7 == null) {
                                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                                                                            var30_30 = false;
                                                                                            var7_7 = null;
                                                                                        }
                                                                                        var31_31 = false;
                                                                                        var13_13 = null;
                                                                                        var12_12 /* !! */  = new c(0, 0, var29_29);
                                                                                        var5_5 = CollectionsKt.c0((List)var7_7, (IntRange)var12_12 /* !! */ );
                                                                                        var5_5 = (Collection)var5_5;
                                                                                        var7_7 = new ArrayList(var5_5);
                                                                                        var4_4.l = var7_7;
                                                                                    } else {
                                                                                        var5_5 = var4_4.l;
                                                                                        if (var5_5 == null) {
                                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                                                                            var29_29 = 0;
                                                                                            var5_5 = null;
                                                                                        }
                                                                                        var30_30 = false;
                                                                                        var7_7 = null;
                                                                                        var12_12 /* !! */  = kotlin.ranges.f.m(0, var16_16);
                                                                                        var5_5 = CollectionsKt.c0((List)var5_5, (IntRange)var12_12 /* !! */ );
                                                                                        Intrinsics.checkNotNull(var5_5, var17_17);
                                                                                        var4_4.l = var5_5 = (ArrayList)var5_5;
                                                                                    }
                                                                                }
                                                                                var5_5 = h40_0.a;
                                                                                var29_29 = (int)h40_0.n2();
                                                                                var7_7 = "detailsAdapterTwo";
                                                                                if (var29_29 != 0) break block241;
                                                                                var5_5 = var4_4.k;
                                                                                if (var5_5 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                                                                    var29_29 = 0;
                                                                                    var5_5 = null;
                                                                                }
                                                                                if ((var29_29 = var5_5.size()) >= (var27_27 = 4)) break block242;
                                                                            }
                                                                            if ((var5_5 = var4_4.k) == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                                                                var29_29 = 0;
                                                                                var5_5 = null;
                                                                            }
                                                                            if ((var29_29 = var5_5.size()) < (var27_27 = 7)) break block243;
                                                                        }
                                                                        if (var10_10 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                                                                            var29_29 = 0;
                                                                            var5_5 = null;
                                                                            var27_27 = 0;
                                                                            var12_12 /* !! */  = null;
                                                                        } else {
                                                                            var12_12 /* !! */  = var10_10;
                                                                            var29_29 = 0;
                                                                            var5_5 = null;
                                                                        }
                                                                        var12_12 /* !! */ .setVisibility(0);
                                                                        var5_5 = var4_4.l;
                                                                        if (var5_5 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                                                            var29_29 = 0;
                                                                            var5_5 = null;
                                                                        }
                                                                        if ((var29_29 = var5_5.size()) <= var16_16) {
                                                                            var5_5 = var4_4.l;
                                                                            if (var5_5 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                                                                var29_29 = 0;
                                                                                var5_5 = null;
                                                                            }
                                                                            var4_4.B((ArrayList)var5_5);
                                                                        } else {
                                                                            var12_12 /* !! */  = var4_4.l;
                                                                            if (var12_12 /* !! */  == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                                                                var27_27 = 0;
                                                                                var12_12 /* !! */  = null;
                                                                            }
                                                                            var20_20 = 0;
                                                                            var21_21 /* !! */  = null;
                                                                            var28_28 = 1;
                                                                            var13_13 = new c(0, var16_16, var28_28);
                                                                            var12_12 /* !! */  = CollectionsKt.c0(var12_12 /* !! */ , (IntRange)var13_13);
                                                                            var5_5 = new ArrayList(var12_12 /* !! */ );
                                                                            var4_4.B((ArrayList)var5_5);
                                                                        }
                                                                        var37_35 = var16_16;
                                                                        break block244;
                                                                    }
                                                                    if (var9_9 == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                                                                        var29_29 = 0;
                                                                        var5_5 = null;
                                                                        var27_27 = 0;
                                                                        var12_12 /* !! */  = null;
                                                                    } else {
                                                                        var12_12 /* !! */  = var9_9;
                                                                        var29_29 = 0;
                                                                        var5_5 = null;
                                                                    }
                                                                    var12_12 /* !! */ .setVisibility(0);
                                                                    var29_29 = (int)h40_0.p2();
                                                                    if (var29_29 != 0) {
                                                                        var12_12 /* !! */  = var4_4.l;
                                                                        if (var12_12 /* !! */  == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                                                            var27_27 = 0;
                                                                            var12_12 /* !! */  = null;
                                                                        }
                                                                        if ((var21_21 /* !! */  = var4_4.l) == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                                                            var20_20 = 0;
                                                                            var21_21 /* !! */  = null;
                                                                        }
                                                                        var20_20 = var21_21 /* !! */ .size();
                                                                        var28_28 = 1;
                                                                        var37_35 = var16_16;
                                                                        if (var20_20 > var28_28) {
                                                                            var20_20 = 1;
lbl515:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
                                                                        }
                                                                        var20_20 = 0;
                                                                        var21_21 /* !! */  = null;
                                                                        ** continue;
                                                                        var16_16 = 0;
                                                                        var13_13 = new c(0, var20_20, var28_28);
                                                                        var12_12 /* !! */  = CollectionsKt.c0(var12_12 /* !! */ , (IntRange)var13_13);
                                                                        var5_5 = new ArrayList(var12_12 /* !! */ );
                                                                        var4_4.B((ArrayList)var5_5);
                                                                    } else {
                                                                        var37_35 = var16_16;
                                                                        var12_12 /* !! */  = var4_4.l;
                                                                        if (var12_12 /* !! */  == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                                                            var27_27 = 0;
                                                                            var12_12 /* !! */  = null;
                                                                        }
                                                                        var20_20 = 0;
                                                                        var21_21 /* !! */  = null;
                                                                        var28_28 = 1;
                                                                        var13_13 = new c(0, 0, var28_28);
                                                                        var12_12 /* !! */  = CollectionsKt.c0(var12_12 /* !! */ , (IntRange)var13_13);
                                                                        var5_5 = new ArrayList(var12_12 /* !! */ );
                                                                        var4_4.B((ArrayList)var5_5);
                                                                    }
                                                                    var5_5 = var4_4.k;
                                                                    if (var5_5 == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                                                        var29_29 = 0;
                                                                        var5_5 = null;
                                                                    }
                                                                    if ((var29_29 = var5_5.size()) >= (var27_27 = 7)) break block244;
                                                                    var5_5 = var4_4.l;
                                                                    if (var5_5 == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                                                        var29_29 = 0;
                                                                        var5_5 = null;
                                                                    }
                                                                    if ((var29_29 = var5_5.size()) > (var27_27 = 1) && (var29_29 = (int)h40_0.p2()) == 0) break block245;
                                                                    var5_5 = var4_4.l;
                                                                    if (var5_5 == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                                                        var29_29 = 0;
                                                                        var5_5 = null;
                                                                    }
                                                                    if ((var29_29 = var5_5.size()) > (var27_27 = 2) && (var29_29 = (int)h40_0.p2()) != 0) break block245;
                                                                    if (var3_3 == null) break block244;
                                                                    var5_5 = var3_3.getFeatureData();
                                                                    if (var5_5 != null) {
                                                                        var29_29 = var5_5.size();
                                                                    } else {
                                                                        var29_29 = 0;
                                                                        var5_5 = null;
                                                                    }
                                                                    if (var29_29 <= 0) break block244;
                                                                }
                                                                if ((var5_5 = var4_4.n) == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                                                                    var29_29 = 0;
                                                                    var5_5 = null;
                                                                }
                                                                var27_27 = 1;
                                                                var5_5.f = var27_27;
                                                            }
                                                            var5_5 = var4_4.l;
                                                            if (var5_5 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                                                var29_29 = 0;
                                                                var5_5 = null;
                                                            }
                                                            if ((var29_29 = var5_5.size()) <= (var27_27 = 2) || (var29_29 = (int)h40_0.p2()) == 0) break block246;
                                                            if (var10_10 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                                                                var29_29 = 0;
                                                                var5_5 = null;
                                                                var27_27 = 0;
                                                                var12_12 /* !! */  = null;
                                                            } else {
                                                                var12_12 /* !! */  = var10_10;
                                                                var29_29 = 0;
                                                                var5_5 = null;
                                                            }
                                                            var12_12 /* !! */ .setVisibility(0);
                                                            break block247;
                                                        }
                                                        var5_5 = var4_4.l;
                                                        if (var5_5 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                                            var29_29 = 0;
                                                            var5_5 = null;
                                                        }
                                                        if ((var29_29 = var5_5.size()) <= (var27_27 = 1) || (var29_29 = (int)h40_0.p2()) != 0) break block248;
                                                        if (var10_10 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                                                            var29_29 = 0;
                                                            var5_5 = null;
                                                            var27_27 = 0;
                                                            var12_12 /* !! */  = null;
                                                        } else {
                                                            var12_12 /* !! */  = var10_10;
                                                            var29_29 = 0;
                                                            var5_5 = null;
                                                        }
                                                        var12_12 /* !! */ .setVisibility(0);
                                                        break block247;
                                                    }
                                                    if (var3_3 == null) ** GOTO lbl-1000
                                                    var5_5 = var3_3.getFeatureData();
                                                    if (var5_5 != null) {
                                                        var29_29 = var5_5.size();
                                                    } else {
                                                        var29_29 = 0;
                                                        var5_5 = null;
                                                    }
                                                    if (var29_29 > 0) {
                                                        if (var10_10 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                                                            var29_29 = 0;
                                                            var5_5 = null;
                                                            var27_27 = 0;
                                                            var12_12 /* !! */  = null;
                                                        } else {
                                                            var12_12 /* !! */  = var10_10;
                                                            var29_29 = 0;
                                                            var5_5 = null;
                                                        }
                                                        var12_12 /* !! */ .setVisibility(0);
                                                    } else lbl-1000:
                                                    // 2 sources

                                                    {
                                                        if (var10_10 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                                                            var29_29 = 0;
                                                            var5_5 = null;
                                                        } else {
                                                            var5_5 = var10_10;
                                                        }
                                                        if (var10_10 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                                                            var27_27 = 0;
                                                            var12_12 /* !! */  = null;
                                                        } else {
                                                            var12_12 /* !! */  = var10_10;
                                                        }
                                                        var27_27 = var12_12 /* !! */ .getVisibility();
                                                        if (var27_27 == 0) {
                                                            var27_27 = 1;
                                                        } else {
                                                            var27_27 = 0;
                                                            var12_12 /* !! */  = null;
                                                        }
                                                        if (var27_27 != 0) {
                                                            var27_27 = 0;
                                                            var12_12 /* !! */  = null;
                                                        } else {
                                                            var27_27 = 8;
                                                        }
                                                        var5_5.setVisibility(var27_27);
                                                    }
                                                }
                                                if (var9_9 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                                                    var29_29 = 1;
                                                    var38_36 = 0;
                                                    var9_9 = null;
                                                } else {
                                                    var29_29 = 1;
                                                }
                                                var9_9.setHasFixedSize((boolean)var29_29);
                                                var29_29 = (int)h40_0.p2();
                                                if (var29_29 != 0) {
                                                    var6_6 = var9_9.getContext();
                                                    var27_27 = 2;
                                                    var5_5 = new AjioCustomGridLayoutManager((Context)var6_6, var27_27);
                                                    var9_9.setLayoutManager((RecyclerView$o)var5_5);
                                                    var6_6 = var9_9.getContext().getResources().getDisplayMetrics();
                                                    var39_37 = var6_6.densityDpi / 160;
                                                    var40_38 = var39_37;
                                                    var32_32 = 5.5;
                                                    var5_5 = new GridSpaceItemDecoration(var40_38 *= var32_32);
                                                    var9_9.addItemDecoration((RecyclerView$n)var5_5);
                                                } else {
                                                    var6_6 = var9_9.getContext();
                                                    var5_5 = new LinearLayoutManager((Context)var6_6);
                                                    var9_9.setLayoutManager((RecyclerView$o)var5_5);
                                                }
                                                var5_5 = var4_4.n;
                                                if (var5_5 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                                                    var29_29 = 0;
                                                    var5_5 = null;
                                                }
                                                var9_9.setAdapter((RecyclerView$f)var5_5);
                                                var29_29 = 8;
                                                break block249;
                                            }
                                            var37_35 = var16_16;
                                            var4_4.l = var5_5 = new ArrayList();
                                            if (var9_9 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                                                var29_29 = 8;
                                                var38_36 = 0;
                                                var9_9 = null;
                                            } else {
                                                var29_29 = 8;
                                            }
                                            var9_9.setVisibility(var29_29);
                                        }
                                        var6_6 = "rv_section3";
                                        if (var8_8 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                                            var30_30 = false;
                                            var7_7 = null;
                                        } else {
                                            var7_7 = var8_8;
                                        }
                                        var7_7.setVisibility(var29_29);
                                        if (var3_3 != null) {
                                            var5_5 = var3_3.getFeatureData();
                                        } else {
                                            var29_29 = 0;
                                            var5_5 = null;
                                        }
                                        var7_7 = "section3filteredFeatureDataList";
                                        if (var5_5 == null) break block250;
                                        var5_5 = var3_3.getFeatureData();
                                        if (var5_5 != null) {
                                            var29_29 = var5_5.size();
                                        } else {
                                            var29_29 = 0;
                                            var5_5 = null;
                                        }
                                        if (var29_29 <= 0) break block250;
                                        var5_5 = var3_3.getFeatureData();
                                        if (var5_5 == null) break block251;
                                        var5_5 = (Iterable)var5_5;
                                        var9_9 = new ArrayList();
                                        var5_5 = var5_5.iterator();
                                        while ((var27_27 = (int)var5_5.hasNext()) != 0) {
                                            var12_12 /* !! */  = var5_5.next();
                                            var13_13 = var12_12 /* !! */ ;
                                            var13_13 = (FeatureData)var12_12 /* !! */ ;
                                            var21_21 /* !! */  = var13_13.getName();
                                            if (var21_21 /* !! */  == null) ** GOTO lbl-1000
                                            var21_21 /* !! */  = var13_13.getFeatureValues();
                                            if (var21_21 /* !! */  == null) ** GOTO lbl-1000
                                            var28_28 = 0;
                                            var15_15 = null;
                                            if ((var21_21 /* !! */  = (FeatureValue)var21_21 /* !! */ .get(0)) != null) {
                                                var21_21 /* !! */  = var21_21 /* !! */ .getValue();
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var20_20 = 0;
                                                var21_21 /* !! */  = null;
                                            }
                                            if (var21_21 /* !! */  == null || (var20_20 = (int)TextUtils.isEmpty((CharSequence)(var21_21 /* !! */  = var13_13.getName()))) != 0) ** GOTO lbl-1000
                                            if ((var13_13 = var13_13.getFeatureValues()) == null) ** GOTO lbl-1000
                                            var20_20 = 0;
                                            var21_21 /* !! */  = null;
                                            if ((var13_13 = (FeatureValue)var13_13.get(0)) != null) {
                                                var13_13 = var13_13.getValue();
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var31_31 = false;
                                                var13_13 = null;
                                            }
                                            var31_31 = TextUtils.isEmpty((CharSequence)var13_13);
                                            if (!var31_31) {
                                                var31_31 = true;
                                            } else lbl-1000:
                                            // 3 sources

                                            {
                                                var31_31 = false;
                                                var13_13 = null;
                                            }
                                            if (!var31_31) continue;
                                            var9_9.add(var12_12 /* !! */ );
                                        }
                                        break block252;
                                    }
                                    var38_36 = 0;
                                    var9_9 = null;
                                }
                                Intrinsics.checkNotNull(var9_9, var17_17);
                                var4_4.m = var9_9;
                                if (var9_9 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                                    var38_36 = 0;
                                    var9_9 = null;
                                }
                                var29_29 = var9_9.size();
                                var38_36 = var37_35;
                                if (var29_29 > var37_35) {
                                    var29_29 = 1;
                                    if (var37_35 == var29_29) {
                                        var9_9 = var4_4.m;
                                        if (var9_9 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                                            var38_36 = 0;
                                            var9_9 = null;
                                        }
                                        var31_31 = false;
                                        var13_13 = null;
                                        var12_12 /* !! */  = new c(0, 0, var29_29);
                                        var5_5 = CollectionsKt.c0(var9_9, (IntRange)var12_12 /* !! */ );
                                        var5_5 = (Collection)var5_5;
                                        var9_9 = new ArrayList(var5_5);
                                        var4_4.m = var9_9;
                                    } else {
                                        var5_5 = var4_4.m;
                                        if (var5_5 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                                            var29_29 = 0;
                                            var5_5 = null;
                                        }
                                        var27_27 = 0;
                                        var12_12 /* !! */  = null;
                                        var9_9 = kotlin.ranges.f.m(0, var38_36);
                                        var5_5 = CollectionsKt.c0((List)var5_5, (IntRange)var9_9);
                                        Intrinsics.checkNotNull(var5_5, var17_17);
                                        var4_4.m = var5_5 = (ArrayList)var5_5;
                                    }
                                }
                                if ((var5_5 = var4_4.k) == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                    var29_29 = 0;
                                    var5_5 = null;
                                }
                                if ((var29_29 = var5_5.size()) != 0) break block253;
                                var5_5 = var4_4.l;
                                if (var5_5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                    var29_29 = 0;
                                    var5_5 = null;
                                }
                                if ((var29_29 = var5_5.size()) == 0) ** GOTO lbl-1000
                            }
                            var5_5 = h40_0.a;
                            var29_29 = (int)h40_0.n2();
                            if (var29_29 == 0) break block254;
                            var5_5 = var4_4.k;
                            if (var5_5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                var29_29 = 0;
                                var5_5 = null;
                            }
                            if ((var29_29 = var5_5.size()) == 0) break block254;
                            var5_5 = var4_4.k;
                            if (var5_5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                var29_29 = 0;
                                var5_5 = null;
                            }
                            if ((var29_29 = var5_5.size()) >= (var38_36 = 7)) break block254;
                            var5_5 = var4_4.l;
                            if (var5_5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                var29_29 = 0;
                                var5_5 = null;
                            }
                            if ((var29_29 = var5_5.size()) == 0) ** GOTO lbl-1000
                        }
                        if ((var29_29 = (int)h40_0.n2()) == 0) {
                            var5_5 = var4_4.k;
                            if (var5_5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                var29_29 = 0;
                                var5_5 = null;
                            }
                            if ((var29_29 = var5_5.size()) != 0) {
                                var5_5 = var4_4.k;
                                if (var5_5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                                    var29_29 = 0;
                                    var5_5 = null;
                                }
                                if ((var29_29 = var5_5.size()) < (var38_36 = 4)) {
                                    var5_5 = var4_4.l;
                                    if (var5_5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                                        var29_29 = 0;
                                        var5_5 = null;
                                    }
                                    ** if ((var29_29 = var5_5.size()) != 0) goto lbl-1000
                                }
                            }
                        }
                        ** GOTO lbl-1000
lbl-1000:
                        // 3 sources

                        {
                            if (var8_8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                                var29_29 = 0;
                                var5_5 = null;
                                var38_36 = 0;
                                var9_9 = null;
                            } else {
                                var9_9 = var8_8;
                                var29_29 = 0;
                                var5_5 = null;
                            }
                            var9_9.setVisibility(0);
                            var5_5 = h40_0.a;
                            var29_29 = (int)h40_0.o2();
                            if (var29_29 == 0) {
                                var12_12 /* !! */  = var4_4.m;
                                if (var12_12 /* !! */  == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                                    var27_27 = 0;
                                    var12_12 /* !! */  = null;
                                }
                                var20_20 = 0;
                                var21_21 /* !! */  = null;
                                var28_28 = 1;
                                var13_13 = new c(0, 0, var28_28);
                                var12_12 /* !! */  = CollectionsKt.c0(var12_12 /* !! */ , (IntRange)var13_13);
                                var9_9 = new ArrayList(var12_12 /* !! */ );
                                var5_5 = new kv1_1(var9_9, false, false, (boolean)var28_28);
                                var4_4.o = var5_5;
                            } else {
                                var12_12 /* !! */  = var4_4.m;
                                if (var12_12 /* !! */  == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                                    var27_27 = 0;
                                    var12_12 /* !! */  = null;
                                }
                                if ((var21_21 /* !! */  = var4_4.m) == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                                    var20_20 = 0;
                                    var21_21 /* !! */  = null;
                                }
                                if ((var20_20 = var21_21 /* !! */ .size()) > (var28_28 = 1)) {
                                    var20_20 = 1;
lbl894:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var20_20 = 0;
                                var21_21 /* !! */  = null;
                                ** continue;
                                var16_16 = 0;
                                var13_13 = new c(0, var20_20, var28_28);
                                var12_12 /* !! */  = CollectionsKt.c0(var12_12 /* !! */ , (IntRange)var13_13);
                                var9_9 = new ArrayList(var12_12 /* !! */ );
                                var4_4.o = var5_5 = new kv1_1(var9_9, false, false, (boolean)var28_28);
                            }
                            ** GOTO lbl914
                        }
lbl-1000:
                        // 2 sources

                        {
                            if ((var12_12 /* !! */  = var4_4.m) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                                var27_27 = 0;
                                var12_12 /* !! */  = null;
                            }
                            var9_9 = new ArrayList(var12_12 /* !! */ );
                            var27_27 = 0;
                            var12_12 /* !! */  = null;
                            var31_31 = true;
                            var4_4.o = var5_5 = new kv1_1(var9_9, false, false, var31_31);
                        }
lbl914:
                        // 3 sources

                        var5_5 = h40_0.a;
                        var29_29 = (int)h40_0.o2();
                        var9_9 = "detailsAdapterThree";
                        if (var29_29 != 0) break block255;
                        var5_5 = var4_4.m;
                        if (var5_5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                            var29_29 = 0;
                            var5_5 = null;
                        }
                        if ((var29_29 = var5_5.size()) <= (var27_27 = 1)) break block255;
                        var5_5 = var4_4.o;
                        if (var5_5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                            var29_29 = 0;
                            var5_5 = null;
                        }
                        var5_5.f = var27_27;
                        if (var10_10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                            var29_29 = 0;
                            var5_5 = null;
                            var27_27 = 0;
                            var12_12 /* !! */  = null;
                        } else {
                            var12_12 /* !! */  = var10_10;
                            var29_29 = 0;
                            var5_5 = null;
                        }
                        var12_12 /* !! */ .setVisibility(0);
                        break block256;
                    }
                    if ((var29_29 = (int)h40_0.o2()) == 0) ** GOTO lbl-1000
                    var5_5 = var4_4.m;
                    if (var5_5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                        var29_29 = 0;
                        var5_5 = null;
                    }
                    if ((var29_29 = var5_5.size()) > (var27_27 = 2)) {
                        var5_5 = var4_4.o;
                        if (var5_5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                            var29_29 = 0;
                            var5_5 = null;
                        }
                        var27_27 = 1;
                        var5_5.f = var27_27;
                        if (var10_10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                            var29_29 = 0;
                            var5_5 = null;
                            var27_27 = 0;
                            var12_12 /* !! */  = null;
                        } else {
                            var12_12 /* !! */  = var10_10;
                            var29_29 = 0;
                            var5_5 = null;
                        }
                        var12_12 /* !! */ .setVisibility(0);
                    } else if ((var29_29 = (int)h40_0.o2()) != 0 && (var5_5 = var4_4.n) != null) {
                        if (var10_10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                            var29_29 = 0;
                            var5_5 = null;
                            var27_27 = 0;
                            var12_12 /* !! */  = null;
                        } else {
                            var12_12 /* !! */  = var10_10;
                            var29_29 = 0;
                            var5_5 = null;
                        }
                        var12_12 /* !! */ .setVisibility(0);
                    }
                }
                if (var8_8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                    var29_29 = 1;
                    var42_39 = false;
                    var8_8 = null;
                } else {
                    var29_29 = 1;
                }
                var8_8.setHasFixedSize((boolean)var29_29);
                var29_29 = (int)h40_0.o2();
                if (var29_29 != 0) {
                    var6_6 = var8_8.getContext();
                    var27_27 = 2;
                    var5_5 = new AjioCustomGridLayoutManager((Context)var6_6, var27_27);
                    var8_8.setLayoutManager((RecyclerView$o)var5_5);
                    var6_6 = var8_8.getContext().getResources().getDisplayMetrics();
                    var39_37 = var6_6.densityDpi / 160;
                    var40_38 = var39_37;
                    var32_32 = 5.5;
                    var5_5 = new GridSpaceItemDecoration(var40_38 *= var32_32);
                    var8_8.addItemDecoration((RecyclerView$n)var5_5);
                } else {
                    var6_6 = var8_8.getContext();
                    var5_5 = new LinearLayoutManager((Context)var6_6);
                    var8_8.setLayoutManager((RecyclerView$o)var5_5);
                }
                var5_5 = var4_4.o;
                if (var5_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                    var29_29 = 0;
                    var5_5 = null;
                }
                var8_8.setAdapter((RecyclerView$f)var5_5);
                break block257;
            }
            var4_4.m = var5_5 = new ArrayList();
            if (var8_8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                var29_29 = 8;
                var42_39 = false;
                var8_8 = null;
            } else {
                var29_29 = 8;
            }
            var8_8.setVisibility(var29_29);
        }
        if (var10_10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var18_18);
            var10_10 = null;
        }
        var10_10.setOnClickListener(var4_4);
        var5_5 = var4_4.b;
        var29_29 = (int)var5_5.c9();
        var6_6 = "mMoreLessButton";
        if (var29_29 != 0) {
            if (var36_34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                var29_29 = 0;
                var5_5 = null;
            } else {
                var5_5 = var36_34;
            }
            var5_5 = var5_5.getPaint();
            var42_39 = true;
            var5_5.setUnderlineText(var42_39);
            if (var36_34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                var39_37 = 0;
                var6_6 = null;
            } else {
                var6_6 = var36_34;
            }
            var29_29 = R$string.plus_more_details;
            var5_5 = hv3_0.K(var29_29);
            var6_6.setText((CharSequence)var5_5);
        } else {
            if (var36_34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                var39_37 = 0;
                var6_6 = null;
            } else {
                var6_6 = var36_34;
            }
            var29_29 = R$string.more_details;
            var5_5 = hv3_0.K(var29_29);
            var6_6.setText((CharSequence)var5_5);
            var5_5 = var4_4.f;
            if (var5_5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMoreLessImage");
                var29_29 = 0;
                var5_5 = null;
            }
            var39_37 = R$drawable.ic_down_arrow_sneaker_hood;
            var6_6 = hv3_0.r(var39_37);
            var5_5.setImageDrawable((Drawable)var6_6);
        }
        var5_5 = var4_4.k;
        if (var5_5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var19_19);
            var29_29 = 0;
            var5_5 = null;
        }
        var29_29 = (int)var5_5.isEmpty();
        var39_37 = 1;
        var8_8 = "parentLayout";
        if ((var29_29 ^= var39_37) != 0) ** GOTO lbl-1000
        var5_5 = var4_4.l;
        if (var5_5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
            var29_29 = 0;
            var5_5 = null;
        }
        if ((var29_29 = var5_5.isEmpty() ^ var39_37) != 0) ** GOTO lbl-1000
        var5_5 = var4_4.m;
        if (var5_5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
            var29_29 = 0;
            var5_5 = null;
        }
        if ((var29_29 = var5_5.isEmpty() ^ var39_37) == 0) {
            if (var22_22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                var29_29 = 0;
                var5_5 = null;
lbl1093:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var5_5 = var22_22;
            ** continue;
            var39_37 = 8;
            var5_5.setVisibility(var39_37);
            var5_5 = var4_4.j;
            if (var5_5 == null) {
                var5_5 = "clProductDetails";
                Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                var20_20 = 0;
                var21_21 /* !! */  = null;
            } else {
                var21_21 /* !! */  = var5_5;
            }
            var21_21 /* !! */ .setVisibility(var39_37);
        } else lbl-1000:
        // 3 sources

        {
            if (var22_22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                var29_29 = 0;
                var5_5 = null;
lbl1113:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var5_5 = var22_22;
            ** continue;
            var39_37 = 0;
            var6_6 = null;
            var5_5.setVisibility(0);
        }
    }
}

