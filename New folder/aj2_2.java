/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.FrameLayout
 *  android.widget.RelativeLayout
 */
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from aj2
 */
public final class aj2_2
extends RecyclerView$B
implements m63_0 {
    public final View a;
    public final yi2_1 b;
    public final a92 c;
    public final View d;
    public final AjioTextView e;
    public final AjioTextView f;
    public final ConstraintLayout g;
    public final RelativeLayout h;
    public final FrameLayout i;
    public final RelativeLayout j;
    public final RecyclerView k;
    public final RelativeLayout l;
    public final ArrayList m;
    public float n;
    public final zi2_1 o;

    public aj2_2(View object, yi2_1 object2, a92 object3) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "pdpInfoProvider");
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.o = object3 = object2.Aa();
        object3 = "itemView";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        this.d = object;
        object2 = (NewProductDetailsFragment)object2;
        int n3 = ((NewProductDetailsFragment)object2).f1;
        String string2 = "parentView";
        ArrayList<Object> arrayList = null;
        if (n3 != 0) {
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object = null;
            }
            int n4 = R$id.similar_to_title;
            object = (AjioTextView)object.findViewById(n4);
            this.f = object;
        } else {
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object = null;
            }
            n3 = R$id.sim_prod_name;
            object = (AjioTextView)object.findViewById(n3);
            this.e = object;
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object = null;
            }
            n3 = R$id.similar_to_parent_layout;
            object = (ConstraintLayout)object.findViewById(n3);
            this.g = object;
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object = null;
            }
            n3 = R$id.similar_to_filters_rl;
            object = (RelativeLayout)object.findViewById(n3);
            this.h = object;
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object = null;
            }
            n3 = R$id.similar_to_filter_fl;
            object = (FrameLayout)object.findViewById(n3);
            this.i = object;
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object = null;
            }
            n3 = R$id.similar_to_filter_close_rl;
            object = (RelativeLayout)object.findViewById(n3);
            this.j = object;
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object = null;
            }
            n3 = R$id.similar_to_size_rv;
            object = (RecyclerView)object.findViewById(n3);
            this.k = object;
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object = null;
            }
            n3 = R$id.similar_to_custom_size_filters_rl;
            object = (RelativeLayout)object.findViewById(n3);
            this.l = object;
            object = ((NewProductDetailsFragment)object2).cb().C;
            if (object != null) {
                int n7 = yx_2.o((Iterable)object, 10);
                arrayList = new ArrayList<Object>(n7);
                object = ((ArrayList)object).iterator();
                while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object2 = ((ProductOptionVariant)object.next()).clone();
                    arrayList.add(object2);
                }
            }
            object = "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Product.ProductOptionVariant>";
            Intrinsics.checkNotNull(arrayList, (String)object);
            this.m = arrayList;
        }
    }

    public final void f(String object, ProductOptionVariant productOptionVariant, int n3) {
        String string2 = "size";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(productOptionVariant, "optionVariant");
        object = this.k;
        if (object != null) {
            object = this.m;
            if (object != null) {
                object = ((ArrayList)object).set(n3, productOptionVariant);
            }
            if ((object = this.m) != null) {
                object = object.iterator();
                while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    String string3;
                    ProductOptionVariant productOptionVariant2 = (ProductOptionVariant)object.next();
                    string2 = productOptionVariant2.getCode();
                    boolean bl2 = Intrinsics.areEqual(string2, string3 = productOptionVariant.getCode());
                    if (bl2) {
                        bl2 = true;
                        productOptionVariant2.setSelected(bl2);
                        continue;
                    }
                    bl2 = false;
                    string2 = null;
                    productOptionVariant2.setSelected(false);
                }
            }
            if ((object = this.k) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("similarToSizeRv");
                object = null;
            }
            if ((object = ((RecyclerView)object).getAdapter()) != null) {
                ((RecyclerView$f)object).notifyDataSetChanged();
            }
        }
    }

    public final void l(String string2, ProductOptionVariant productOptionVariant) {
        Intrinsics.checkNotNullParameter(string2, "size");
        Intrinsics.checkNotNullParameter(productOptionVariant, "optionVariant");
        a92 a922 = this.c;
        if (a922 != null) {
            a922.U3(string2, productOptionVariant);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void w() {
        block59: {
            block58: {
                var1_1 = this.f;
                var2_2 = this.k;
                var3_3 /* !! */  = this.j;
                var4_4 = this.i;
                var5_5 /* !! */  = this.g;
                var6_6 = this.m;
                var7_7 = this.b;
                var8_8 = var7_7.c9();
                if (var8_8) {
                    var9_9 = var7_7.w0();
                    var3_3 /* !! */  = "title";
                    if (var9_9) {
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var3_3 /* !! */ );
                            var10_11 = false;
                            var1_1 = null;
                        }
                        ai0_2.B((View)var1_1);
                    } else {
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var3_3 /* !! */ );
                            var10_12 = false;
                            var1_1 = null;
                        }
                        ai0_2.i((View)var1_1);
                    }
                    return;
                }
                var1_1 = var7_7.o5();
                var11_14 = ld3_2.STORE_AJIOGRAM.getStoreId();
                var10_13 = Intrinsics.areEqual(var1_1, var11_14);
                var8_8 = false;
                var11_14 = null;
                var12_15 = "similarToParentLayout";
                if (var10_13 && !(var10_13 = var7_7.w0())) {
                    if (var5_5 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var12_15);
                        var10_13 = false;
                        var1_1 = null;
                    } else {
                        var1_1 = var5_5 /* !! */ ;
                    }
                    ai0_2.i((View)var1_1);
                    if (var5_5 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var12_15);
                        var10_13 = false;
                        var1_1 = null;
                    } else {
                        var1_1 = var5_5 /* !! */ ;
                    }
                    var1_1.setMaxHeight(0);
                }
                if ((var1_1 = var7_7.x5()) != null) {
                    var1_1 = var1_1.getBrandName();
                } else {
                    var10_13 = false;
                    var1_1 = null;
                }
                var13_16 = "";
                if (var1_1 == null) break block58;
                var1_1 = var7_7.x5();
                if (var1_1 != null) {
                    var1_1 = var1_1.getBrandName();
                } else {
                    var10_13 = false;
                    var1_1 = null;
                }
                break block59;
            }
            var1_1 = var7_7.x5();
            if (var1_1 != null) {
                var1_1 = var1_1.getFnlColorVariantData();
            } else {
                var10_13 = false;
                var1_1 = null;
            }
            if (var1_1 == null) ** GOTO lbl-1000
            var1_1 = var7_7.x5();
            if (var1_1 != null) {
                var1_1 = var1_1.getFnlColorVariantData();
            } else {
                var10_13 = false;
                var1_1 = null;
            }
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getBrandName();
            if (var1_1 != null) {
                var1_1 = var7_7.x5();
                if (var1_1 != null) {
                    var1_1 = var1_1.getFnlColorVariantData();
                } else {
                    var10_13 = false;
                    var1_1 = null;
                }
                Intrinsics.checkNotNull(var1_1);
                var1_1 = var1_1.getBrandName();
            } else lbl-1000:
            // 2 sources

            {
                var1_1 = var13_16;
            }
        }
        var14_17 = var7_7.x5();
        var14_17 = var14_17 != null ? var14_17.getName() : null;
        var14_17 = var14_17 != null ? ((var14_17 = var7_7.x5()) != null ? var14_17.getName() : null) : var13_16;
        var15_18 = ": ";
        var1_1 = n1.a((String)var1_1, (String)var15_18, (String)var14_17);
        var14_17 = this.e;
        if (var14_17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prodName");
            var14_17 = null;
        }
        var14_17.setText((CharSequence)var1_1);
        if (var5_5 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var12_15);
            var5_5 /* !! */  = null;
        }
        ai0_2.t((View)var5_5 /* !! */ );
        var1_1 = h40_0.a;
        var1_1 = var7_7.o5();
        var10_13 = h40_0.t2((String)var1_1);
        if (!var10_13) {
            return;
        }
        var1_1 = this.h;
        if (var1_1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filtersRl");
            var10_13 = false;
            var1_1 = null;
        }
        ai0_2.B((View)var1_1);
        var1_1 = "filterFl";
        if (var4_4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var1_1);
            var5_5 /* !! */  = null;
        } else {
            var5_5 /* !! */  = var4_4;
        }
        ai0_2.B((View)var5_5 /* !! */ );
        var5_5 /* !! */  = "closeFilterRl";
        if (var3_3 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5 /* !! */ );
            var12_15 = null;
        } else {
            var12_15 = var3_3 /* !! */ ;
        }
        ai0_2.i((View)var12_15);
        var12_15 = var7_7.pa();
        var14_17 = new Ref$ObjectRef();
        var14_17.element = var15_18 = var7_7.E7();
        var12_15 = var12_15 != null ? var12_15.getCode() : null;
        var15_18 = (Map)var14_17.element;
        var16_19 = var7_7.x5();
        if (var16_19 != null) {
            var16_19 = var16_19.getCode();
        } else {
            var17_20 = false;
            var16_19 = null;
        }
        var18_21 = var15_18.containsKey(var16_19);
        if (var18_21 != 0) {
            var15_18 = (Map)var14_17.element;
            var16_19 = var7_7.x5();
            if (var16_19 != null) {
                var16_19 = var16_19.getCode();
            } else {
                var17_20 = false;
                var16_19 = null;
            }
            var15_18 = (String)var15_18.get(var16_19);
            if (var15_18 != null) {
                var13_16 = var15_18;
            }
            var18_21 = var13_16.length();
            if (var18_21 > 0) {
                var12_15 = var13_16;
            }
        }
        if (var12_15 != null) {
            if (var6_6 != null) {
                var13_16 = var6_6.iterator();
                while ((var18_21 = var13_16.hasNext()) != 0) {
                    var15_18 = (ProductOptionVariant)var13_16.next();
                    var16_19 = var15_18.getCode();
                    var17_20 = Intrinsics.areEqual(var16_19, var12_15);
                    var15_18.setSelected(var17_20);
                }
            }
            if (var4_4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var1_1);
                var12_15 = null;
            } else {
                var12_15 = var4_4;
            }
            ai0_2.i((View)var12_15);
            if (var3_3 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var5_5 /* !! */ );
                var12_15 = null;
            } else {
                var12_15 = var3_3 /* !! */ ;
            }
            ai0_2.B((View)var12_15);
            var12_15 = this.l;
            if (var12_15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("similarToCustomSizeFilterRl");
                var12_15 = null;
            }
            ai0_2.B((View)var12_15);
        }
        var12_15 = "similarToSizeRv";
        if (var2_2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var12_15);
            var19_22 = false;
            var13_16 = null;
        } else {
            var13_16 = var2_2;
        }
        var16_19 = this.d;
        if (var16_19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentView");
            var17_20 = false;
            var16_19 = null;
        }
        var16_19 = var16_19.getContext();
        var15_18 = new LinearLayoutManager((Context)var16_19, 0, false);
        var13_16.setLayoutManager((RecyclerView$o)var15_18);
        if (var6_6 != null) {
            if (var2_2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var12_15);
                var8_8 = false;
                var11_14 = null;
            } else {
                var11_14 = var2_2;
            }
            var11_14 = var11_14.getAdapter();
            var19_22 = var11_14 instanceof p43_0;
            if (var19_22) {
                var11_14 = (p43_0)var11_14;
            } else {
                var8_8 = false;
                var11_14 = null;
            }
            if (var11_14 != null) {
                Intrinsics.checkNotNull(var6_6);
                Intrinsics.checkNotNullParameter(var6_6, "mSizes");
                Intrinsics.checkNotNullParameter(var7_7, "mPdpInfoProvider");
                Intrinsics.checkNotNullParameter(this, "mSizeSelection");
                var2_2 = var11_14.c;
                var2_2.clear();
                var2_2.addAll(var6_6);
                var11_14.a = var7_7;
                var11_14.b = this;
                var11_14.notifyDataSetChanged();
            } else {
                if (var2_2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_15);
                    var9_10 = 0;
                    var2_2 = null;
                }
                Intrinsics.checkNotNull(var6_6);
                var11_14 = new p43_0(var6_6, var7_7, this);
                var2_2.setAdapter((RecyclerView$f)var11_14);
            }
        }
        if (var4_4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var1_1);
            var4_4 = null;
        }
        var9_10 = 3;
        var1_1 = new ok_1(this, var9_10);
        var4_4.setOnClickListener((View.OnClickListener)var1_1);
        if (var3_3 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5 /* !! */ );
            var3_3 /* !! */  = null;
        }
        var1_1 = new vd_0(this, (Serializable)var14_17, 1);
        var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var1_1);
    }
}

