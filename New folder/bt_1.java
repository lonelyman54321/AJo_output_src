/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Product.EddResult;
import com.ril.ajio.services.data.Product.PDPClosetActionIdentifier;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductWishlistState;
import com.ril.ajio.services.data.Product.SimilarProductWishlistDataHolder;
import com.ril.ajio.services.data.Product.Status;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BT
 */
public final class bt_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bt_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object object2 = "this$0";
        int n4 = 4;
        Object object3 = null;
        Object object4 = this.b;
        int n7 = this.a;
        switch (n7) {
            default: {
                object = (r50)object;
                Intrinsics.checkNotNullParameter(object, "$this$constrain");
                Object object5 = ((r50)object).g;
                object2 = ((r50)object).c;
                Object object6 = ((t50)object2).f;
                float f5 = uq0_0.o;
                n91.a((o91)object5, (y50$a_0)object6, f5, n4);
                object5 = ((t50)object2).c;
                object6 = ((r50)object).d;
                sb3_0.a((tb3_0)object6, (y50$b_0)object5, f5, n4);
                object5 = ((t50)object2).e;
                sb3_0.a(((r50)object).f, (y50$b_0)object5, f5, n4);
                object2 = "spread";
                object5 = new zq0_0((String)object2);
                ((r50)object).b((zq0_0)object5);
                object4 = (Subcomponent)object4;
                if (object4 != null && (object5 = ((Subcomponent)object4).getResourceOwner()) != null) {
                    object3 = ((ResourceOwner)object5).getTags();
                }
                object5 = (object3 = (Collection)object3) != null && (n3 = (int)(object3.isEmpty() ? 1 : 0)) == 0 ? tE3.b : tE3.c;
                object2 = r50.k[2];
                object = ((r50)object).j;
                object.getClass();
                String string2 = "property";
                Intrinsics.checkNotNullParameter(object2, string2);
                object3 = ((y62_0)object).b;
                Intrinsics.checkNotNullParameter(object2, string2);
                ((y62_0)object).b = object5;
                ((r50$b)object).c((gn1_2)object2, object3, object5);
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                object4 = (NewProductDetailsFragment)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object2);
                object2 = cp_1.Companion;
                int n8 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n8 != 0) {
                    kx3_0.a = n3;
                    object2 = ((NewProductDetailsFragment)object4).h;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                        n8 = 0;
                        object2 = null;
                    }
                    object2.stopLoader();
                    n8 = ((DataCallback)object).getStatus();
                    if (n8 == 0) {
                        Object object7;
                        object = ((NewProductDetailsFragment)object4).cb().p.d;
                        object2 = PDPClosetActionIdentifier.FROM_SIMILAR_STL;
                        n7 = -1;
                        if (object == object2) {
                            int n10;
                            object = ((NewProductDetailsFragment)object4).s1;
                            if (object != null) {
                                object2 = ((NewProductDetailsFragment)object4).cb().p.c;
                                n8 = object2 != null ? ((Product)object2).getViewHolderPos() : -1;
                                ((n32_0)object).Oa(n8);
                            }
                            if ((object = ((NewProductDetailsFragment)object4).x1) != null && (n10 = ((Fragment)object).isAdded()) == n3 && (object = ((NewProductDetailsFragment)object4).x1) != null) {
                                object7 = ((NewProductDetailsFragment)object4).cb().p.c;
                                if (object7 != null) {
                                    n7 = ((Product)object7).getViewHolderPos();
                                }
                                if ((object = ((N43)object).e) != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                                    ((RecyclerView$f)object).notifyItemChanged(n7);
                                }
                            }
                        } else {
                            int n14;
                            object = ((NewProductDetailsFragment)object4).cb().p.d;
                            object7 = PDPClosetActionIdentifier.FROM_SIMILAR;
                            if (object == object7) {
                                object = ((NewProductDetailsFragment)object4).cb();
                                object2 = ((NewProductDetailsFragment)object4).cb().p.c;
                                if (object2 != null) {
                                    n7 = ((Product)object2).getViewHolderPos();
                                }
                                object2 = ProductWishlistState.REMOVED;
                                ((e12_0)object).J0 = object7 = new SimilarProductWishlistDataHolder(n7, (ProductWishlistState)((Object)object2));
                            } else {
                                n14 = 0;
                                object = null;
                                ((NewProductDetailsFragment)object4).ob(false);
                            }
                            object = ((NewProductDetailsFragment)object4).L;
                            if (object != null) {
                                object = ((RecyclerView)object).getAdapter();
                            } else {
                                n14 = 0;
                                object = null;
                            }
                            n3 = object instanceof yh2_1;
                            if (n3 != 0) {
                                object = (yh2_1)object;
                            } else {
                                n14 = 0;
                                object = null;
                            }
                            if (object != null) {
                                n3 = 26;
                                object = ((yh2_1)object).g(n3);
                            } else {
                                n14 = 0;
                                object = null;
                            }
                            if (object != null) {
                                n14 = ((Number)object).intValue();
                                object7 = ((NewProductDetailsFragment)object4).L;
                                if (object7 != null && (object7 = ((RecyclerView)object7).getAdapter()) != null) {
                                    ((RecyclerView$f)object7).notifyItemChanged(n14);
                                }
                            }
                            if ((object = ((NewProductDetailsFragment)object4).cb().p.b) != null) {
                                ((Product)object).getViewHolderPos();
                            }
                            if ((object = ((NewProductDetailsFragment)object4).L) != null) {
                                object = ((RecyclerView)object).getAdapter();
                            } else {
                                n14 = 0;
                                object = null;
                            }
                            n3 = object instanceof yh2_1;
                            if (n3 != 0) {
                                object = (yh2_1)object;
                            } else {
                                n14 = 0;
                                object = null;
                            }
                            if (object != null) {
                                ((yh2_1)object).k();
                            }
                        }
                        object = ((NewProductDetailsFragment)object4).cb().p;
                        object7 = PDPClosetActionIdentifier.DEFAULT;
                        object.getClass();
                        Intrinsics.checkNotNullParameter(object7, "<set-?>");
                        ((BH3)object).d = object7;
                        rw_1.a(n4, null);
                        object = ((NewProductDetailsFragment)object4).cb().p;
                        object7 = ((NewProductDetailsFragment)object4).cb().p.c;
                        object2 = "pdp screen";
                        ((BH3)object).d((Product)object7, (String)object2);
                    } else {
                        int n15 = ((DataCallback)object).getStatus();
                        if (n15 == n3) {
                            n15 = 5;
                            rw_1.a(n15, null);
                        }
                    }
                    object = ((NewProductDetailsFragment)object4).cb().p;
                    ((BH3)object).c = null;
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object4 = (CheckoutFragment)object4;
        Intrinsics.checkNotNullParameter(object4, (String)object2);
        Intrinsics.checkNotNullParameter(object, "eddResultDataCallback");
        object2 = cp_1.Companion;
        int n16 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n16 != 0) {
            n16 = ((DataCallback)object).getStatus();
            if (n16 == 0) {
                object = (EddResult)((DataCallback)object).getData();
                object2 = ((CheckoutFragment)object4).h;
                String string3 = "checkOutViewModel";
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n16 = 0;
                    object2 = null;
                }
                ((ps_0)object2).l = object;
                if (object != null && ((object2 = ((EddResult)object).getStatus()) == null || (n16 = ((Status)(object2 = ((EddResult)object).getStatus())).getStatusCode()) != n3)) {
                    object = ((CheckoutFragment)object4).h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                    } else {
                        object3 = object;
                    }
                    object = ((ps_0)object3).k;
                    ((CheckoutFragment)object4).Wa((Cart)object);
                } else {
                    ss_1.a((EddResult)object, null);
                    ((CheckoutFragment)object4).Xa(null);
                }
            } else {
                n16 = ((DataCallback)object).getStatus();
                if (n16 == n3) {
                    Object object8 = ss_1.a;
                    object8 = ((DataCallback)object).getError();
                    ss_1.a(null, (DataError)object8);
                    object = ((DataCallback)object).getError();
                    ((CheckoutFragment)object4).Xa((DataError)object);
                }
            }
        }
        return Unit.a;
    }
}

