/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 */
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from uS
 */
public final class us_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ us_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object object2 = "this$0";
        Object[] objectArray = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                int n7;
                object = (DataCallback)object;
                objectArray = (s12)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, (String)object2);
                object2 = objectArray.b;
                if (object2 != null) {
                    object2.stopLoader();
                }
                if ((n7 = nn_2.b((cp$a)(object2 = cp_1.Companion), (DataCallback)object)) != 0) {
                    n7 = ((DataCallback)object).getStatus();
                    if (n7 == 0) {
                        Object object3;
                        int n8;
                        object2 = objectArray.Ta();
                        if (object2 != null) {
                            object = (ProductsList)((DataCallback)object).getData();
                            ((F12)object2).l((ProductsList)object);
                        }
                        object = objectArray.h;
                        n7 = 0;
                        object2 = null;
                        if (object != null) {
                            object = ((RecyclerView)object).getAdapter();
                        } else {
                            n8 = 0;
                            object = null;
                        }
                        n8 = object instanceof FI0;
                        if (n8 != 0) {
                            object = objectArray.h;
                            if (object != null) {
                                object = ((RecyclerView)object).getAdapter();
                            } else {
                                n8 = 0;
                                object = null;
                            }
                            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.plp.filters.adapters.FacetNameAdapter");
                            object = (FI0)object;
                            object3 = objectArray.Ta();
                            if (object3 != null && (object3 = ((F12)object3).d) != null) {
                                object3 = ((bv2_0)object3).N;
                            } else {
                                n4 = 0;
                                object3 = null;
                            }
                            Intrinsics.checkNotNull(object3);
                            object3 = ((ProductsList)object3).getFacets();
                            Intrinsics.checkNotNull(object3);
                            object3 = ImmutableList.copyOf((Collection)objectArray.Va((List)object3));
                            Intrinsics.checkNotNullExpressionValue(object3, "copyOf(...)");
                            object.getClass();
                            String string2 = "facetList";
                            Intrinsics.checkNotNullParameter(object3, string2);
                            ((FI0)object).a = object3;
                            ((RecyclerView$f)object).notifyDataSetChanged();
                        }
                        objectArray.updateTitle();
                        object = objectArray.Ta();
                        if (object != null && (object = ((F12)object).d) != null) {
                            object = ((bv2_0)object).X;
                        } else {
                            n8 = 0;
                            object = null;
                        }
                        if (object != null) {
                            object = objectArray.Ta();
                            if (object != null && (object = ((F12)object).d) != null) {
                                object = ((bv2_0)object).Y;
                            } else {
                                n8 = 0;
                                object = null;
                            }
                            object3 = objectArray.Ta();
                            if (object3 != null && (object3 = ((F12)object3).d) != null && (object3 = ((bv2_0)object3).X) != null) {
                                object3 = ((Facet)object3).getCode();
                            } else {
                                n4 = 0;
                                object3 = null;
                            }
                            n8 = (int)(Intrinsics.areEqual(object, object3) ? 1 : 0);
                            if (n8 == 0 && (object = objectArray.Ta()) != null && (object = ((F12)object).d) != null) {
                                object3 = objectArray.Ta();
                                if (object3 != null && (object3 = ((F12)object3).d) != null && (object3 = ((bv2_0)object3).X) != null) {
                                    object3 = ((Facet)object3).getCode();
                                } else {
                                    n4 = 0;
                                    object3 = null;
                                }
                                ((bv2_0)object).Y = (String)object3;
                            }
                            object = objectArray.Ta();
                            Intrinsics.checkNotNull(object);
                            object = ((F12)object).d.X;
                            Intrinsics.checkNotNull(object);
                            objectArray.ab((Facet)object);
                        }
                        if ((object = objectArray.Ta()) != null && (object = ((F12)object).d) != null && (n8 = ((bv2_0)object).h0) == n3) {
                            object = objectArray.Ta();
                            if (object != null) {
                                object = ((F12)object).d;
                            } else {
                                n8 = 0;
                                object = null;
                            }
                            Intrinsics.checkNotNull(object);
                            ((bv2_0)object).h0 = false;
                            n8 = R$string.no_product_selected_filter;
                            object = hv3_0.K(n8);
                            hv3_0.o0(n3, (String)object, null);
                        }
                        if ((n8 = objectArray.m) != 0) {
                            objectArray.bb();
                            objectArray.m = false;
                        }
                    } else {
                        int n10 = ((DataCallback)object).getStatus();
                        if (n10 == n3) {
                            object = StringCompanionObject.INSTANCE;
                            n10 = R$string.acc_error_message;
                            object = hv3_0.K(n10);
                            object2 = hv3_0.K(R$string.something_wrong_msg);
                            objectArray = new Object[n3];
                            objectArray[0] = object2;
                            object = xh2_0.a(objectArray, n3, (String)object, "format(...)");
                            n7 = R$string.something_wrong_msg;
                            object2 = hv3_0.K(n7);
                            hv3_0.o0(n3, (String)object2, (String)object);
                        }
                    }
                }
                return Unit.a;
            }
            case 1: {
                object = (View)object;
                objectArray = (dr0_0)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, "$fleekViewModel");
                object2 = Looper.getMainLooper();
                Handler handler = new Handler((Looper)object2);
                object2 = new J61(0, objectArray, object);
                object = od3_2.a();
                objectArray.getClass();
                Intrinsics.checkNotNullParameter(object, "storeID");
                long l2 = h40_0.o((String)object);
                long l3 = 1000;
                handler.postDelayed((Runnable)object2, l2 *= l3);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        objectArray = (ps_0)objectArray;
        Intrinsics.checkNotNullParameter(objectArray, (String)object2);
        objectArray.c.k(object);
        return Unit.a;
    }
}

