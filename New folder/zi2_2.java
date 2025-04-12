/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zi2
 */
public final class zi2_2
extends RecyclerView$B {
    public final View a;
    public final yi2_1 b;
    public final s82_0 c;
    public final mu1_1 d;
    public final View e;
    public final LinearLayout f;
    public final RecyclerView g;
    public final ShimmerFrameLayout h;
    public final View i;
    public final LinearLayoutManager j;
    public final View k;
    public ArrayList l;
    public ArrayList m;
    public final RelativeLayout n;
    public final zi2_1 o;
    public boolean p;
    public float q;
    public boolean r;

    public zi2_2(View object, yi2_1 object2, s82_0 object3, LiveData liveData, mu1_1 mu1_12) {
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "pdpInfoProvider");
        String string2 = "onProductClickListener";
        Intrinsics.checkNotNullParameter(object3, string2);
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = mu1_12;
        object2.o5();
        this.o = object3 = object2.Aa();
        Intrinsics.checkNotNullParameter(object, "itemView");
        this.e = object;
        object3 = null;
        this.m = null;
        if (object != null) {
            n4 = R$id.similar_products_layout;
            object = (LinearLayout)object.findViewById(n4);
        } else {
            n3 = 0;
            object = null;
        }
        this.f = object;
        Intrinsics.checkNotNull(object);
        n4 = R$id.divider5;
        object = object.findViewById(n4);
        this.k = object;
        object = this.e;
        if (object != null) {
            n4 = R$id.similar_products_list_item;
            object = (RecyclerView)object.findViewById(n4);
        } else {
            n3 = 0;
            object = null;
        }
        this.g = object;
        object = this.e;
        if (object != null) {
            n4 = R$id.plp_shimmer_view;
            object = (ShimmerFrameLayout)object.findViewById(n4);
        } else {
            n3 = 0;
            object = null;
        }
        this.h = object;
        object = this.e;
        if (object != null) {
            n4 = R$id.plp_shimmer_container;
            object = object.findViewById(n4);
        } else {
            n3 = 0;
            object = null;
        }
        this.i = object;
        object = this.e;
        if (object != null) {
            n4 = R$id.no_product_available_rl;
            object = (RelativeLayout)object.findViewById(n4);
        } else {
            n3 = 0;
            object = null;
        }
        this.n = object;
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        n3 = ((ao0_0)object).g("pdpSimilarProductListType");
        string2 = this.e;
        if (n3 != 0 && (n3 = (int)(object2.c9() ? 1 : 0)) == 0) {
            if (string2 != null) {
                object3 = string2.getContext();
            }
            n4 = 2;
            int n7 = 1;
            object = new GridLayoutManager((Context)object3, n4, n7, false);
        } else {
            if (string2 != null) {
                object3 = string2.getContext();
            }
            Intrinsics.checkNotNull(object3);
            object = new LinearLayoutManager((Context)object3, 0, false);
        }
        this.j = object;
        object = this.g;
        if (object != null) {
            ((RecyclerView)object).setNestedScrollingEnabled(false);
        }
        if ((object = this.g) != null) {
            object3 = this.j;
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object3);
        }
        if ((n3 = (int)(object2.c7() ? 1 : 0)) != 0 && liveData != null) {
            Intrinsics.checkNotNull(mu1_12);
            int n8 = 1;
            object = new pw1_1(this, n8);
            object2 = new Zi2$a((pw1_1)object);
            liveData.e(mu1_12, (F62)object2);
        }
    }

    public final void w(int n3) {
        int n4 = -1;
        if (n3 > n4) {
            Object object = this.g;
            boolean bl2 = false;
            if (object != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                n4 = ((RecyclerView$f)object).getItemCount();
            } else {
                n4 = 0;
                object = null;
            }
            if (n3 < n4) {
                object = this.l;
                if (object != null && (object = (PlpProductUIModel)((ArrayList)object).get(n3)) != null) {
                    Object object2 = this.l;
                    if (object2 != null && (object2 = (PlpProductUIModel)((ArrayList)object2).get(n3)) != null) {
                        bl2 = ((PlpProductUIModel)object2).isProductWishlisted();
                    }
                    ((PlpProductUIModel)object).setProductWishlisted(bl2 ^= true);
                }
                if ((object = this.g) != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                    ((RecyclerView$f)object).notifyItemChanged(n3);
                }
            }
        }
    }

    public final void x(ArrayList object, ArrayList object2) {
        this.l = object2;
        this.m = object;
        int n3 = 1;
        yi2_1 yi2_12 = this.b;
        if (object != null) {
            int n4 = yi2_12.c9();
            if (n4 != 0 && (object = this.f) != null) {
                int n7 = hv3_0.m(R$color.luxe_color_121212);
                object.setBackgroundColor(n7);
            }
            if ((n4 = yi2_12.c7()) != 0) {
                object = this.l;
                if (object != null && (n4 = ((ArrayList)object).isEmpty()) != n3) {
                    object = this.n;
                    if (object != null) {
                        ai0_2.i((View)object);
                    }
                    if ((object = this.g) != null) {
                        ai0_2.B((View)object);
                    }
                } else {
                    object = this.n;
                    if (object != null) {
                        ai0_2.B((View)object);
                    }
                    if ((object = this.g) != null) {
                        ai0_2.i((View)object);
                    }
                }
            }
            object = this.f;
            Intrinsics.checkNotNull(object);
            n3 = 0;
            object2 = null;
            object.setVisibility(0);
            ArrayList arrayList = this.m;
            object = this.g;
            if (object != null) {
                ArrayList arrayList2 = this.l;
                boolean bl2 = yi2_12.c9();
                s82_0 s82_02 = this.c;
                object2 = new q32_0(s82_02, arrayList, arrayList2, bl2, false);
                ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
            }
        } else {
            int n8 = yi2_12.c7();
            yi2_12 = null;
            if (n8 != 0) {
                object = this.l;
                if (object != null && (n8 = ((ArrayList)object).isEmpty()) != n3) {
                    object = this.g;
                    if (object != null) {
                        ai0_2.B((View)object);
                    }
                    if ((object = this.n) != null) {
                        ai0_2.i((View)object);
                    }
                } else {
                    object = this.g;
                    Intrinsics.checkNotNull(object);
                    ((RecyclerView)object).setAdapter(null);
                    this.l = null;
                    object = this.f;
                    if (object != null) {
                        ai0_2.B((View)object);
                    }
                    if ((object = this.n) != null) {
                        ai0_2.B((View)object);
                    }
                    if ((object = this.g) != null) {
                        ai0_2.i((View)object);
                    }
                }
            } else {
                object = this.g;
                Intrinsics.checkNotNull(object);
                ((RecyclerView)object).setAdapter(null);
                object = this.f;
                Intrinsics.checkNotNull(object);
                n3 = 8;
                object.setVisibility(n3);
                this.l = null;
            }
        }
    }
}

