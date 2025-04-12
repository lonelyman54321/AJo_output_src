/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.query.ProductListQuery;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.g;

public final class Q22$b
extends RecyclerViewScrollListener {
    public final /* synthetic */ q22_0 a;

    public Q22$b(q22_0 q22_02) {
        this.a = q22_02;
    }

    public final boolean isLastPage() {
        return this.a.cb().d.u();
    }

    public final void onLoadMore() {
        Object object = this.a.cb().d;
        Object object2 = ((bv2_0)object).P;
        int n3 = 0;
        fv2_1 fv2_12 = null;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            int n4 = ((ProductListQuery)object2).getCurrentPage();
            ProductListQuery productListQuery = ((bv2_0)object).P;
            Intrinsics.checkNotNull(productListQuery);
            int n7 = productListQuery.getTotalPages();
            int n8 = 1;
            if (n4 < (n7 -= n8)) {
                ((bv2_0)object).Y0 = n8;
            } else {
                n4 = (int)(((bv2_0)object).Y0 ? 1 : 0);
                if (n4 != 0) {
                    ((bv2_0)object).Y0 = false;
                }
                n8 = 0;
            }
            object2 = ((bv2_0)object).P;
            n7 = 0;
            productListQuery = null;
            if (object2 != null) {
                object2 = ((ProductListQuery)object2).getStoreId();
            } else {
                n4 = 0;
                object2 = null;
            }
            if (object2 != null && (n4 = ((String)object2).length()) != 0) {
                object2 = ((bv2_0)object).P;
                if (object2 != null) {
                    object2 = ((ProductListQuery)object2).getStoreId();
                } else {
                    n4 = 0;
                    object2 = null;
                }
                String string2 = ld3_2.STORE_AJIO.getStoreId();
                n4 = (int)(Intrinsics.areEqual(object2, string2) ? 1 : 0);
                if (n4 == 0) {
                    bv2_0.b2 = false;
                }
            }
            if (n8 != 0) {
                object2 = ir0_2.a;
                object2 = em0_2.b;
                fv2_12 = new fv2_1((bv2_0)object, null);
                int n10 = 2;
                object = ((bv2_0)object).e;
                Ae3.d((i90_0)object, (CoroutineContext)object2, null, fv2_12, n10);
            }
            n3 = n8;
        }
        this.setLoadingSate(n3 != 0);
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = 8;
        q22_0 q22_02 = this.a;
        if (n3 == 0) {
            Object object2;
            n3 = (int)(q22_02.x0 ? 1 : 0);
            if (n3 == 0 && (object2 = q22_02.D) != null) {
                object2.setVisibility(0);
            }
            n3 = q22_02.Za();
            Object object3 = q22_02.getViewLifecycleOwner();
            Object object4 = "getViewLifecycleOwner(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            object3 = nu1_0.a((mu1_1)object3);
            g g3 = ir0_2.a;
            g3 = em0_2.b;
            Object object5 = new t22_0(q22_02, n3, null);
            n3 = 2;
            Ae3.d((i90_0)object3, g3, null, (Function2)object5, n3);
            int n7 = object.canScrollVertically(-1) ^ 1;
            object5 = q22_02.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
            object4 = nu1_0.a((mu1_1)object5);
            object5 = new u22_0(q22_02, n7 != 0, null);
            Ae3.d((i90_0)object4, g3, null, (Function2)object5, n3);
            int n8 = ig2_2.a((RecyclerView)object);
            if (n8 == 0 && (object = q22_02.G0) != (object2 = Yj2.NONE)) {
                q22_02.z0();
            }
            if ((n8 = (int)(q22_02.x0 ? 1 : 0)) != 0) {
                object = q22_02.D;
                if (object != null) {
                    object.setVisibility(n4);
                }
            } else {
                object = q22_02.D;
                if (object != null) {
                    object.setVisibility(0);
                }
            }
            if ((n8 = (int)(h40_0.Q1() ? 1 : 0)) != 0) {
                n8 = q22_02.B0;
                n3 = 100;
                n7 = q22_02.l;
                if (n8 == n7) {
                    object = q22_02.y;
                    int n10 = q22_02.b1;
                    if (n10 < n3 && object != null && (n3 = object.getVisibility()) == n4) {
                        object2 = new w22_0(object, 0);
                        object.post((Runnable)object2);
                    }
                } else {
                    object = q22_02.x;
                    int n14 = q22_02.b1;
                    if (n14 < n3 && object != null && (n3 = object.getVisibility()) == n4) {
                        object2 = new w22_0(object, 0);
                        object.post((Runnable)object2);
                    }
                }
            }
        } else {
            int n15 = q22_02.x0;
            if (n15 != 0) {
                object = q22_02.D;
                if (object != null) {
                    object.setVisibility(n4);
                }
            } else {
                n15 = q22_02.a1;
                if (n15 > 0 && (object = q22_02.D) != null) {
                    object.setVisibility(n4);
                }
            }
            object = q22_02.cb();
            ((F12)object).k(false);
        }
    }

    public final void onScrolled(RecyclerView object, int n3, int n4) {
        Object object2;
        int n7;
        int n8;
        Object object3;
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onScrolled((RecyclerView)object, n3, n4);
        Object object4 = this.a;
        ((q22_0)object4).a1 = n4;
        ((q22_0)object4).b1 = n4 = ((RecyclerView)object).computeVerticalScrollOffset();
        int n10 = ((q22_0)object4).y0;
        int n14 = 100;
        if (n10 != 0) {
            n10 = ((q22_0)object4).a1;
            if (n10 > 0 && n4 > (n10 = 260)) {
                object3 = ((q22_0)object4).C;
                if (object3 != null) {
                    n10 = 8;
                    object3.setVisibility(n10);
                }
                ((q22_0)object4).A0 = n4 = ((q22_0)object4).b1;
            } else {
                n10 = ((q22_0)object4).A0;
                n8 = 500;
                if ((n10 < n8 || (n10 -= n4) > n14) && (object3 = ((q22_0)object4).C) != null) {
                    object3.setVisibility(0);
                }
            }
        }
        if ((n4 = ((q22_0)object4).a1) > 0) {
            object4.I5();
        }
        object3 = ((q22_0)object4).B;
        n10 = 0;
        string2 = null;
        if (object3 != null) {
            object3 = ((RecyclerView)object3).getLayoutManager();
        } else {
            n4 = 0;
            object3 = null;
        }
        Object object5 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager";
        if (object3 != null && (n7 = object3 instanceof GridLayoutManager) != 0) {
            object2 = object3;
            object2 = (GridLayoutManager)object3;
            n7 = ((LinearLayoutManager)object2).findLastCompletelyVisibleItemPosition();
        } else {
            Intrinsics.checkNotNull(object3, (String)object5);
            object2 = object3;
            object2 = (LinearLayoutManager)object3;
            n7 = ((LinearLayoutManager)object2).findLastCompletelyVisibleItemPosition();
        }
        int n15 = -1;
        if (n7 == n15) {
            object3 = (LinearLayoutManager)object3;
            n7 = ((LinearLayoutManager)object3).findLastVisibleItemPosition();
        }
        object3 = ((q22_0)object4).B;
        int n16 = 1;
        String string3 = " Products";
        String string4 = " Product";
        if (object3 != null && (n4 = (object3 = ((RecyclerView)object3).getAdapter()) instanceof q22) != 0) {
            int n17;
            object3 = ((q22_0)object4).B;
            if (object3 != null) {
                object3 = ((RecyclerView)object3).getAdapter();
            } else {
                n4 = 0;
                object3 = null;
            }
            Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type com.ril.ajio.plp.adapter.NewProductListAdapter");
            object3 = (q22)object3;
            Object object6 = ((q22_0)object4).cb().d.M;
            if (object6 != null && (object6 = ((ProductsList)object6).getPagination()) != null) {
                n17 = ((Pagination)object6).getTotalResults();
                object6 = n17;
            } else {
                n17 = 0;
                object6 = null;
            }
            if (object6 != null) {
                if (n7 != n15) {
                    n4 = ((q22)object3).h(n7);
                    n7 = (int)(og1_1.c() ? 1 : 0);
                    String string5 = "/";
                    if (n7 == 0) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append(n4);
                        ((StringBuilder)object2).append(string5);
                        ((StringBuilder)object2).append(object6);
                        object3 = ((StringBuilder)object2).toString();
                    } else {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append(n4);
                        ((StringBuilder)object2).append(string5);
                        ((StringBuilder)object2).append(object6);
                        object3 = ((StringBuilder)object2).toString();
                    }
                } else {
                    object3 = String.valueOf(object6);
                }
                n7 = (Integer)object6;
                if (n7 == n16) {
                    string3 = string4;
                }
                object3 = Ft2.a((String)object3, string3);
                object2 = ((q22_0)object4).cb().d;
                ((bv2_0)object2).f1 = object3;
                ((q22_0)object4).Db((String)object3);
            }
        } else {
            object3 = ((q22_0)object4).cb().d.M;
            if (object3 != null && (object3 = ((ProductsList)object3).getPagination()) != null) {
                n4 = ((Pagination)object3).getTotalResults();
                object3 = n4;
            } else {
                n4 = 0;
                object3 = null;
            }
            if (object3 != null && (n7 = ((Integer)object3).intValue()) == n16) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(object3);
                ((StringBuilder)object2).append(string4);
                object3 = ((StringBuilder)object2).toString();
            } else {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(object3);
                ((StringBuilder)object2).append(string3);
                object3 = ((StringBuilder)object2).toString();
            }
            ((q22_0)object4).Db((String)object3);
        }
        object3 = ((RecyclerView)object).getLayoutManager();
        Intrinsics.checkNotNull(object3, (String)object5);
        object3 = (LinearLayoutManager)object3;
        n4 = ((LinearLayoutManager)object3).findFirstVisibleItemPosition();
        object = ((RecyclerView)object).getLayoutManager();
        Intrinsics.checkNotNull(object, (String)object5);
        object = (LinearLayoutManager)object;
        int n18 = ((LinearLayoutManager)object).findLastCompletelyVisibleItemPosition();
        object5 = ((q22_0)object4).cb().d;
        n8 = (int)(((bv2_0)object5).s ? 1 : 0);
        if (n8 != 0 && (n8 = (int)(((sm3_0)object4).a ? 1 : 0)) != 0) {
            block50: {
                if (n4 <= n18) {
                    n8 = n4;
                    while (true) {
                        if ((object2 = ((q22_0)object4).B) != null) {
                            object2 = ((RecyclerView)object2).findViewHolderForAdapterPosition(n8);
                        } else {
                            n7 = 0;
                            object2 = null;
                        }
                        if (object2 != null && (n7 = object2 instanceof uj2_0) != 0) {
                            n8 = 1;
                            break block50;
                        }
                        if (n8 == n18) break;
                        ++n8;
                    }
                }
                n8 = 0;
                object5 = null;
            }
            n7 = ((q22_0)object4).a1;
            if (n7 > 0 && (n7 = (int)(((q22_0)object4).H0 ? 1 : 0)) != 0) {
                n8 = 0;
                object5 = null;
            }
            if (n8 != 0) {
                ((q22_0)object4).H0 = false;
                object4.p0();
            } else {
                ((q22_0)object4).H0 = n16;
                object4.O3();
            }
        }
        if ((n8 = (int)(((q22_0)object4).jb() ? 1 : 0)) != 0) {
            block51: {
                if (n4 <= n18) {
                    while (true) {
                        if ((object5 = ((q22_0)object4).B) != null) {
                            object5 = ((RecyclerView)object5).findViewHolderForAdapterPosition(n4);
                        } else {
                            n8 = 0;
                            object5 = null;
                        }
                        if (object5 != null && (n8 = object5 instanceof tj2_1) != 0) {
                            n18 = 1;
                            break block51;
                        }
                        if (n4 == n18) break;
                        ++n4;
                    }
                }
                n18 = 0;
                object = null;
            }
            n4 = ((q22_0)object4).a1;
            if (n4 > 0 && (n4 = (int)(((q22_0)object4).K0 ? 1 : 0)) != 0) {
                n18 = 0;
                object = null;
            }
            if (n18 != 0) {
                ((q22_0)object4).K0 = false;
                object4.Z5();
            } else {
                ((q22_0)object4).K0 = n16;
                object4.ya();
            }
        }
        if ((n18 = (int)(h40_0.Q1() ? 1 : 0)) != 0) {
            n18 = ((q22_0)object4).B0;
            n4 = ((q22_0)object4).l;
            if (n18 == n4) {
                object = ((q22_0)object4).y;
                n3 = ((q22_0)object4).b1;
                if (n3 > n14 && object != null && (n3 = object.getVisibility()) == 0) {
                    object4 = new F22((View)object);
                    object.post((Runnable)object4);
                }
            } else {
                object = ((q22_0)object4).x;
                n3 = ((q22_0)object4).b1;
                if (n3 > n14 && object != null && (n3 = object.getVisibility()) == 0) {
                    object4 = new F22((View)object);
                    object.post((Runnable)object4);
                }
            }
        }
    }
}

