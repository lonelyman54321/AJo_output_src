/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.text.TextUtils
 *  android.widget.ImageView
 */
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.h;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Payment.BinResponse;
import com.ril.ajio.services.data.Product.PriceRevealMetaInfo;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductRvStoreType;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from b22
 */
public final class b22_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ b22_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke(Object object) {
        int n3;
        Object object2 = null;
        Object object3 = null;
        int n4 = 1;
        Fragment fragment = this.b;
        Object object4 = "this$0";
        int n7 = this.a;
        object = (DataCallback)object;
        switch (n7) {
            default: {
                fragment = (h)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object4);
                object4 = "cartDataCallback";
                Intrinsics.checkNotNullParameter(object, (String)object4);
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == 0) {
                    ((h)fragment).B = object4 = (BinResponse)((DataCallback)object).getData();
                    object4 = ((DataCallback)object).getData();
                    if (object4 != null) {
                        Object object5;
                        object = (BinResponse)((DataCallback)object).getData();
                        object4 = new da$a();
                        ((da$a)object4).k = n4;
                        ((da$a)object4).g = n4;
                        if (object != null) {
                            object5 = ((BinResponse)object).getIconUrl();
                        } else {
                            n4 = 0;
                            object5 = null;
                        }
                        ImageView imageView = ((h)fragment).g;
                        if (imageView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cardImage");
                            n7 = 0;
                            imageView = null;
                        }
                        ((da$a)object4).n = object5;
                        ((da$a)object4).u = imageView;
                        ((da$a)object4).a();
                        if (object != null) {
                            object5 = ((BinResponse)object).getLowSuccessRate();
                            object4 = Boolean.TRUE;
                            n4 = (int)(Intrinsics.areEqual(object5, object4) ? 1 : 0);
                        } else {
                            n4 = 0;
                            object5 = null;
                        }
                        object4 = "pfContainer";
                        if (n4 != 0 && (n4 = (int)(TextUtils.isEmpty((CharSequence)(object5 = ((BinResponse)object).getMessage())) ? 1 : 0)) == 0) {
                            object5 = ((h)fragment).r;
                            if (object5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                                n4 = 0;
                                object5 = null;
                            }
                            object5.setVisibility(0);
                            object2 = ((h)fragment).r;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            } else {
                                object3 = object2;
                            }
                            object = ((BinResponse)object).getMessage();
                            object3.setText((CharSequence)object);
                        } else {
                            object = ((h)fragment).r;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            } else {
                                object3 = object;
                            }
                            int n10 = 8;
                            object3.setVisibility(n10);
                        }
                    }
                } else {
                    int n14 = ((DataCallback)object).getStatus();
                    if (n14 == n4) {
                        ((h)fragment).D = null;
                        ((h)fragment).B = null;
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        fragment = (NewProductDetailsFragment)fragment;
        Intrinsics.checkNotNullParameter(fragment, (String)object4);
        Intrinsics.checkNotNullParameter(object, "recentlyViewedProductsDataCallback");
        object4 = cp_1.Companion;
        int n15 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n15 != 0) {
            n15 = ((DataCallback)object).getStatus();
            if (n15 == 0) {
                object4 = ((DataCallback)object).getData();
                if (object4 != null) {
                    Object object6;
                    object = (RecentlyViewedProducts)((DataCallback)object).getData();
                    object4 = tr2_2.a;
                    n15 = (int)(tr2_2.u(((NewProductDetailsFragment)fragment).f1) ? 1 : 0);
                    if (n15 != 0) {
                        if (object != null) {
                            object4 = ((RecentlyViewedProducts)object).getPriceRevealMetaInfo();
                        } else {
                            n15 = 0;
                            object4 = null;
                        }
                        if (object4 != null) {
                            object6 = ((PriceRevealMetaInfo)object4).getSaleStartTime();
                            object4 = ((PriceRevealMetaInfo)object4).getSaleEndTime();
                            tr2_2.B((Long)object6, (Long)object4);
                        }
                    }
                    if (object != null) {
                        object = ((RecentlyViewedProducts)object).getProducts();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object = (ArrayList)object;
                    object4 = (ArrayList)((NewProductDetailsFragment)fragment).ib().f.d();
                    if (object4 != null && (n7 = ((ArrayList)object4).size()) > 0) {
                        object4 = object4.iterator();
                        while ((n7 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                            boolean bl2;
                            object6 = (ProductRvStoreType)object4.next();
                            if (object == null) continue;
                            Iterator iterator = object.iterator();
                            while (bl2 = iterator.hasNext()) {
                                Object object7;
                                Product product = (Product)iterator.next();
                                String string2 = ((ProductRvStoreType)object6).getProductCode();
                                int n16 = Intrinsics.areEqual(string2, object7 = (object7 = product.getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object7).getColorGroup() : null);
                                if (!n16) continue;
                                n16 = ((ProductRvStoreType)object6).getStoreType();
                                if (n16 == n4) {
                                    n16 = 1;
                                } else {
                                    n16 = 0;
                                    string2 = null;
                                }
                                product.setStoreType(n16 != 0);
                            }
                        }
                    }
                    ((NewProductDetailsFragment)fragment).Qb((ArrayList)object);
                }
            } else {
                n3 = ((DataCallback)object).getStatus();
                if (n3 == n4) {
                    ((NewProductDetailsFragment)fragment).Qb(null);
                }
            }
        }
        fragment.getClass();
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        n3 = (int)(((ao0_0)object).a("android_HomePageRecentlyView") ? 1 : 0);
        object2 = fragment.getActivity();
        if (object2 != null && n3 != 0) {
            object = new Intent("com.ril.ajio:recentlyViewed");
            object2 = Xv1.a((Context)fragment.requireActivity());
            ((Xv1)object2).c((Intent)object);
        }
        return Unit.a;
    }
}

