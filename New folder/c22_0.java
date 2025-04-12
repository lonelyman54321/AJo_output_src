/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Closet.SaveForLaterResponse;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.PDPClosetActionIdentifier;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductWishlistState;
import com.ril.ajio.services.data.Product.SimilarProductWishlistDataHolder;
import com.ril.ajio.services.data.StatusNew;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from c22
 */
public final class c22_0
implements F62 {
    public final /* synthetic */ NewProductDetailsFragment a;

    public /* synthetic */ c22_0(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onChanged(Object object) {
        NewProductDetailsFragment newProductDetailsFragment;
        block66: {
            Object object2;
            Object object3;
            Object object4;
            int n3;
            Object object5;
            int n4;
            block62: {
                Object object6;
                block68: {
                    int n7;
                    int n8;
                    block67: {
                        block64: {
                            int n10;
                            int n14;
                            block63: {
                                int n15;
                                Object object7;
                                Object object8;
                                block65: {
                                    Exception exception2;
                                    block61: {
                                        block60: {
                                            block59: {
                                                int n16;
                                                n4 = 0;
                                                object5 = null;
                                                n3 = 1;
                                                object = (DataCallback)object;
                                                object4 = "Final_price";
                                                newProductDetailsFragment = this.a;
                                                Intrinsics.checkNotNullParameter(newProductDetailsFragment, "this$0");
                                                object3 = cp_1.Companion;
                                                n8 = nn_2.b((cp$a)object3, (DataCallback)object);
                                                if (n8 == 0) return;
                                                kx3_0.a = n3;
                                                object3 = newProductDetailsFragment.h;
                                                if (object3 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                                                    n8 = 0;
                                                    object3 = null;
                                                }
                                                object3.stopLoader();
                                                n8 = object.getStatus();
                                                object2 = "format(...)";
                                                if (n8 != 0) break block62;
                                                n8 = (int)(newProductDetailsFragment.ua() ? 1 : 0);
                                                n14 = 3;
                                                if (n8 != 0) {
                                                    newProductDetailsFragment.ac(n14);
                                                }
                                                object = (SaveForLaterResponse)object.getData();
                                                object3 = "";
                                                if (object == null || (object8 = object.getStatusCode()) == null || (n16 = ((Integer)object8).intValue()) != 0) break block63;
                                                object8 = object.getStatus();
                                                if (object8 != null) {
                                                    object8 = ((StatusNew)object8).getMessageDescription();
                                                } else {
                                                    n16 = 0;
                                                    object8 = null;
                                                }
                                                if (object8 != null && (n16 = ((String)object8).length()) != 0) {
                                                    if ((object = object.getStatus()) == null || (object = object.getMessageDescription()) == null) {
                                                        object = object3;
                                                    }
                                                } else {
                                                    n7 = R$string.revamp_moved_to_closet_successfully;
                                                    object = hv3_0.K(n7);
                                                }
                                                object8 = StringCompanionObject.INSTANCE;
                                                n16 = R$string.acc_alert_message;
                                                object8 = hv3_0.K(n16);
                                                Object object9 = new Object[n3];
                                                object9[0] = object;
                                                object2 = xh2_0.a((Object[])object9, n3, (String)object8, (String)object2);
                                                newProductDetailsFragment.showNotification((String)object, (String)object2);
                                                newProductDetailsFragment.J0 = n3;
                                                object = newProductDetailsFragment.cb().p.b;
                                                if (object == null) break block64;
                                                object2 = object.getFnlColorVariantData();
                                                object2 = object2 != null ? ((ProductFnlColorVariantData)object2).getColorGroup() : null;
                                                object2 = object2 == null ? object.getCode() : ((object2 = object.getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object2).getColorGroup() : null);
                                                newProductDetailsFragment.Ua((String)object2);
                                                NewProductDetailsFragment.Eb((Product)object);
                                                object2 = object.getPrice();
                                                if (object2 == null) {
                                                    return;
                                                }
                                                object2 = newProductDetailsFragment.cb();
                                                object8 = object.getCode();
                                                object9 = object.getPrice();
                                                object9 = object9 != null ? ((Price)object9).getValue() : null;
                                                object2.getClass();
                                                object2 = md3_0.c((jD3)object2);
                                                v02_0 v02_02 = new v02_0((String)object8, (String)object9, null);
                                                Ae3.d((i90_0)object2, null, null, v02_02, n14);
                                                object2 = g62_0.c;
                                                object7 = DW.c((Product)object);
                                                n16 = 1000;
                                                ((g62_0)object2).b(object7, n16);
                                                kx3_0.a = n3;
                                                kx3_0.b = null;
                                                object2 = new Object();
                                                object8 = object.getCode();
                                                ((HashMap)object2).put("SKU", object8);
                                                object8 = object.getName();
                                                ((HashMap)object2).put("Name", object8);
                                                object7 = "Brand";
                                                object8 = object.getBrandName();
                                                ((HashMap)object2).put(object7, object8);
                                                try {
                                                    object7 = object.getPrice();
                                                    if (object7 == null) break block59;
                                                    object7 = ((Price)object7).getValue();
                                                    break block60;
                                                }
                                                catch (Exception exception2) {
                                                    break block61;
                                                }
                                            }
                                            n14 = 0;
                                            object7 = null;
                                        }
                                        ((HashMap)object2).put(object4, object7);
                                        break block65;
                                    }
                                    ((HashMap)object2).put(object4, object3);
                                    object4 = yn3_0.a;
                                    object4.e(exception2);
                                }
                                object4 = object.getVariantOptions();
                                object7 = "0";
                                object8 = "MRP";
                                if (object4 != null && (object4 = (ProductOptionItem)object4.get(0)) != null && (object4 = object4.getWasPriceData()) != null) {
                                    if ((object4 = object4.getValue()) != null) {
                                        object7 = object4;
                                    }
                                    object4 = Double.valueOf((String)object7);
                                    ((HashMap)object2).put(object8, object4);
                                } else {
                                    object4 = object.getWasPriceData();
                                    if (object4 != null) {
                                        if ((object4 = object4.getValue()) != null) {
                                            object7 = object4;
                                        }
                                        object4 = Double.valueOf((String)object7);
                                        ((HashMap)object2).put(object8, object4);
                                    }
                                }
                                object4 = object.getFnlProductData();
                                Intrinsics.checkNotNull(object4);
                                object4 = object4.getPlanningCategory();
                                ((HashMap)object2).put("Category", object4);
                                object4 = object.getFnlProductData();
                                Intrinsics.checkNotNull(object4);
                                object4 = object4.getProductGroups();
                                object7 = "Vertical";
                                if (object4 != null) {
                                    object4 = object.getFnlProductData();
                                    Intrinsics.checkNotNull(object4);
                                    object4 = object4.getProductGroups();
                                    ((HashMap)object2).put(object7, object4);
                                } else {
                                    ((HashMap)object2).put(object7, object3);
                                }
                                object4 = object.getFnlColorVariantData();
                                if (object4 != null) {
                                    object4 = object4.getBrickName();
                                    object7 = "Brick";
                                    if (object4 != null) {
                                        ((HashMap)object2).put(object7, object4);
                                    } else {
                                        ((HashMap)object2).put(object7, object3);
                                    }
                                }
                                object4 = object.getProductGalleryImageUrls();
                                object7 = "Image_URL";
                                if (object4 != null && (n15 = object4.isEmpty()) == n3) {
                                    ((HashMap)object2).put(object7, object3);
                                } else {
                                    object4 = object.getProductGalleryImageUrls();
                                    if (object4 != null && (object4 = (ProductImage)object4.get(0)) != null) {
                                        object4 = object4.getUrl();
                                    } else {
                                        n15 = 0;
                                        object4 = null;
                                    }
                                    ((HashMap)object2).put(object7, object4);
                                }
                                object4 = od3_2.a();
                                n8 = object4.length();
                                if (n8 > 0) {
                                    object3 = "Store Type";
                                    ((HashMap)object2).put(object3, object4);
                                }
                                object4 = AnalyticsManager.Companion.getInstance().getCt();
                                object3 = new AnalyticsData$Builder();
                                object3 = ((AnalyticsData$Builder)object3).eventMap((HashMap)object2).build();
                                object4.addedToCloset((AnalyticsData)object3);
                                object4 = el1_2.a;
                                object4 = yt2_2.PDP;
                                el1_2.c((yt2_2)((Object)object4), (Product)object);
                                break block64;
                            }
                            newProductDetailsFragment.J0 = n3;
                            object4 = newProductDetailsFragment.cb().p.b;
                            if (object4 != null) {
                                Object object10 = object4.getFnlColorVariantData();
                                if (object10 != null) {
                                    object10 = ((ProductFnlColorVariantData)object10).getColorGroup();
                                } else {
                                    n14 = 0;
                                    object10 = null;
                                }
                                if (object10 == null) {
                                    object10 = object4.getCode();
                                } else {
                                    object10 = object4.getFnlColorVariantData();
                                    if (object10 != null) {
                                        object10 = ((ProductFnlColorVariantData)object10).getColorGroup();
                                    } else {
                                        n14 = 0;
                                        object10 = null;
                                    }
                                }
                                newProductDetailsFragment.Ua((String)object10);
                                NewProductDetailsFragment.Eb((Product)object4);
                            }
                            if (object != null && (object4 = object.getStatus()) != null) {
                                object4 = object4.getMessageDescription();
                            } else {
                                n10 = 0;
                                object4 = null;
                            }
                            if (object4 != null && (n10 = object4.length()) != 0) {
                                if (object != null && (object = object.getStatus()) != null && (object = object.getMessageDescription()) != null) {
                                    object3 = object;
                                }
                            } else {
                                n7 = R$string.revamp_closet_alert_msg;
                                object3 = hv3_0.K(n7);
                            }
                            object = StringCompanionObject.INSTANCE;
                            n7 = R$string.acc_alert_message;
                            object = hv3_0.K(n7);
                            object4 = new Object[n3];
                            object4[0] = object3;
                            object = xh2_0.a(object4, n3, (String)object, (String)object2);
                            newProductDetailsFragment.showNotification((String)object3, (String)object);
                        }
                        object = z40_0.Companion;
                        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                        object4 = "wishlist_state_enable";
                        n7 = (int)(object.a((String)object4) ? 1 : 0);
                        if (n7 == 0) break block66;
                        object = newProductDetailsFragment.cb().p.d;
                        object4 = PDPClosetActionIdentifier.FROM_SIMILAR_STL;
                        n8 = -1;
                        if (object != object4) break block67;
                        object = newProductDetailsFragment.s1;
                        if (object != null) {
                            object5 = newProductDetailsFragment.cb().p.b;
                            n4 = object5 != null ? ((Product)object5).getViewHolderPos() : -1;
                            object.Oa(n4);
                        }
                        if ((object = newProductDetailsFragment.x1) != null && (n7 = (int)(object.isAdded() ? 1 : 0)) == n3 && (object = newProductDetailsFragment.x1) != null) {
                            object5 = newProductDetailsFragment.cb().p.b;
                            if (object5 != null) {
                                n8 = ((Product)object5).getViewHolderPos();
                            }
                            if ((object = object.e) != null && (object = object.getAdapter()) != null) {
                                object.notifyItemChanged(n8);
                            }
                        }
                        break block68;
                    }
                    object = newProductDetailsFragment.cb().p.d;
                    object6 = PDPClosetActionIdentifier.FROM_SIMILAR;
                    if (object == object6) {
                        object = newProductDetailsFragment.cb();
                        object6 = newProductDetailsFragment.cb().p.b;
                        if (object6 != null) {
                            n8 = ((Product)object6).getViewHolderPos();
                        }
                        object6 = ProductWishlistState.ADDED;
                        object.J0 = object5 = new SimilarProductWishlistDataHolder(n8, (ProductWishlistState)((Object)object6));
                    } else {
                        newProductDetailsFragment.ob(false);
                    }
                    object = newProductDetailsFragment.L;
                    if (object != null) {
                        object = object.getAdapter();
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    n4 = object instanceof yh2_1;
                    if (n4 != 0) {
                        object = (yh2_1)object;
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    if (object != null) {
                        n4 = 26;
                        object = object.g(n4);
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    if (object != null) {
                        n7 = ((Number)object).intValue();
                        object5 = newProductDetailsFragment.L;
                        if (object5 != null && (object5 = ((RecyclerView)object5).getAdapter()) != null) {
                            ((RecyclerView$f)object5).notifyItemChanged(n7);
                        }
                    }
                    if ((object = newProductDetailsFragment.cb().p.b) != null) {
                        object.getViewHolderPos();
                    }
                    if ((object = newProductDetailsFragment.L) != null) {
                        object = object.getAdapter();
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    n4 = object instanceof yh2_1;
                    if (n4 != 0) {
                        object = (yh2_1)object;
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    if (object != null) {
                        ((yh2_1)object).k();
                    }
                }
                object = newProductDetailsFragment.cb().p;
                object5 = PDPClosetActionIdentifier.DEFAULT;
                object.getClass();
                object6 = "<set-?>";
                Intrinsics.checkNotNullParameter(object5, (String)object6);
                object.d = object5;
                break block66;
            }
            int n17 = object.getStatus();
            if (n17 == n3) {
                object = StringCompanionObject.INSTANCE;
                n17 = R$string.acc_alert_message;
                object = hv3_0.K(n17);
                int n18 = R$string.pdp_details_not_available;
                object4 = hv3_0.K(n18);
                object3 = new Object[n3];
                object3[0] = object4;
                object = xh2_0.a((Object[])object3, n3, (String)object, (String)object2);
                n4 = R$string.pdp_details_not_available;
                object5 = newProductDetailsFragment.getString(n4);
                newProductDetailsFragment.showNotification((String)object5, (String)object);
            }
        }
        object = newProductDetailsFragment.cb().p;
        object.b = null;
    }
}

