/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class E5
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ E5(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object objectArray) {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = 0;
        Object object3 = null;
        int n4 = 1;
        int n7 = this.a;
        switch (n7) {
            default: {
                Object object4 = objectArray;
                object4 = (DataCallback)objectArray;
                object2 = (oy1_1)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = cp_1.Companion;
                int n8 = nn_2.b((cp$a)object, (DataCallback)object4);
                if (n8 != 0) {
                    kx3_0.a = n4;
                    ((oy1_1)object2).Wa();
                    n8 = ((DataCallback)object4).getStatus();
                    Object object5 = "format(...)";
                    if (n8 == 0) {
                        object = ((Fragment)object2).getActivity();
                        if (object != null) {
                            int n10;
                            object = StringCompanionObject.INSTANCE;
                            n8 = R$string.acc_alert_message;
                            object = hv3_0.K(n8);
                            object4 = hv3_0.K(R$string.removed_wishlist_refresh);
                            Object object6 = new Object[n4];
                            object6[0] = object4;
                            object = xh2_0.a((Object[])object6, n4, (String)object, (String)object5);
                            object4 = hv3_0.K(R$string.removed_wishlist_refresh);
                            ((oy1_1)object2).gb((String)object4, (String)object);
                            object = ((oy1_1)object2).T;
                            n7 = -1;
                            if (object != null) {
                                object5 = ((oy1_1)object2).Qa().i.c;
                                n10 = object5 != null ? ((Product)object5).getViewHolderPos() : -1;
                                ((n32_0)object).Oa(n10);
                            }
                            if ((n8 = ((ArrayList)(object = ((oy1_1)object2).Qa().y)).isEmpty() ^ n4) != 0 && (object = ((oy1_1)object2).Qa().D) != null && (n8 = ((String)object).length()) != 0) {
                                String string2;
                                boolean bl2;
                                Object object7;
                                object = ((oy1_1)object2).Qa().y;
                                object3 = new ArrayList();
                                object = ((ArrayList)object).iterator();
                                while ((n10 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                                    object6 = object5 = object.next();
                                    object6 = ((Product)object5).getCode();
                                    bl2 = Intrinsics.areEqual(object6, object7 = ((oy1_1)object2).Qa().D);
                                    if (!bl2) continue;
                                    ((ArrayList)object3).add(object5);
                                }
                                object = ((oy1_1)object2).Qa().z;
                                object5 = new ArrayList();
                                object = ((ArrayList)object).iterator();
                                while (bl2 = object.hasNext()) {
                                    object7 = object6 = object.next();
                                    object7 = ((PlpProductUIModel)object6).getProductColorCode();
                                    boolean bl3 = Intrinsics.areEqual(object7, string2 = ((oy1_1)object2).Qa().D);
                                    if (!bl3) continue;
                                    ((ArrayList)object5).add(object6);
                                }
                                ((oy1_1)object2).Qa().y.removeAll((Collection<?>)object3);
                                ((oy1_1)object2).Qa().z.removeAll((Collection<?>)object5);
                                ((AbstractCollection)((oy1_1)object2).Qa().A).removeAll((Collection<?>)object3);
                                object = ((oy1_1)object2).Qa();
                                ((ky1_0)object).B = n10 = ((ky1_0)object).B + n7;
                                object = ((oy1_1)object2).Qa().y;
                                object4 = ((oy1_1)object2).Qa().z;
                                ((oy1_1)object2).cb((ArrayList)object, (ArrayList)object4);
                                object = ((oy1_1)object2).Qa().x;
                                if (object != null) {
                                    object = ((oy1_1)object2).Qa().x;
                                    Intrinsics.checkNotNull(object);
                                    object = ((ProductsList)object).getPagination();
                                    if (object != null && (n8 = (int)(((ky1_0)(object = ((oy1_1)object2).Qa())).h() ? 1 : 0)) == 0) {
                                        object = ((oy1_1)object2).Qa().x;
                                        Intrinsics.checkNotNull(object);
                                        object = ((ProductsList)object).getPagination();
                                        Intrinsics.checkNotNull(object);
                                        object4 = ((oy1_1)object2).Qa().z;
                                        n7 = ((ArrayList)object4).size() / 10 - n4;
                                        ((Pagination)object).setCurrentPage(n7);
                                    }
                                }
                                object = ((oy1_1)object2).Qa();
                                object3 = (Product)CollectionsKt.firstOrNull((List)object3);
                                WishListRepo wishListRepo = ((ky1_0)object).c;
                                object4 = "closet screen";
                                wishListRepo.removedFromClosetAnalytics((Product)object3, (String)object4);
                                object6 = ((ky1_0)object).d;
                                object7 = ((NewCustomEventsRevamp)object6).getEC_WISHLIST_INTERACTIONS();
                                String string3 = ((ky1_0)object).f;
                                int n14 = 1536;
                                string2 = "remove from closet";
                                String string4 = "";
                                String string5 = "remove_from_closet";
                                String string6 = "closet screen";
                                String string7 = "closet screen";
                                object = ((ky1_0)object).g;
                                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, (String)object7, string2, string4, string5, string6, string7, string3, null, (String)object, false, null, n14, null);
                                if (object3 != null) {
                                    object = el1_2.a;
                                    object = yt2_2.WISHLIST;
                                    el1_2.d((yt2_2)((Object)object), (Product)object3);
                                }
                            } else {
                                object = ((oy1_1)object2).Qa().y;
                                n8 = ((ArrayList)object).isEmpty() ^ n4;
                                if (n8 != 0) {
                                    object = "iterator(...)";
                                    Object object8 = ((oy1_1)object2).Qa().y;
                                    object4 = ((oy1_1)object2).Qa().z;
                                    object5 = ((oy1_1)object2).Qa().i.c;
                                    try {
                                        object6 = ((ArrayList)object8).iterator();
                                        Intrinsics.checkNotNullExpressionValue(object6, (String)object);
                                        Iterator iterator = ((ArrayList)object4).iterator();
                                        Intrinsics.checkNotNullExpressionValue(iterator, object);
                                        if (object5 != null) {
                                            Object object9;
                                            Object object10;
                                            while (true) {
                                                n8 = (int)(object6.hasNext() ? 1 : 0);
                                                object10 = "next(...)";
                                                if (n8 == 0) break;
                                                object = object6.next();
                                                Intrinsics.checkNotNullExpressionValue(object, (String)object10);
                                                object = (Product)object;
                                                object10 = ((Product)object).getCode();
                                                object9 = ((Product)object5).getFnlColorVariantData();
                                                object9 = object9 != null ? ((ProductFnlColorVariantData)object9).getColorGroup() : null;
                                                boolean bl4 = Intrinsics.areEqual(object10, object9);
                                                if (!bl4) {
                                                    if ((object = ((Product)object).getFnlColorVariantData()) != null) {
                                                        object = ((ProductFnlColorVariantData)object).getColorGroup();
                                                    } else {
                                                        n8 = 0;
                                                        object = null;
                                                    }
                                                    object10 = ((Product)object5).getFnlColorVariantData();
                                                    if (object10 != null) {
                                                        object10 = ((ProductFnlColorVariantData)object10).getColorGroup();
                                                    } else {
                                                        bl4 = false;
                                                        object10 = null;
                                                    }
                                                    if ((n8 = (int)(Intrinsics.areEqual(object, object10) ? 1 : 0)) == 0) continue;
                                                }
                                                object6.remove();
                                            }
                                            while ((n8 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                                                object = iterator.next();
                                                Intrinsics.checkNotNullExpressionValue(object, (String)object10);
                                                object = (PlpProductUIModel)object;
                                                object6 = ((PlpProductUIModel)object).getProductCode();
                                                object9 = ((Product)object5).getFnlColorVariantData();
                                                object9 = object9 != null ? ((ProductFnlColorVariantData)object9).getColorGroup() : null;
                                                boolean bl5 = Intrinsics.areEqual(object6, object9);
                                                if (!bl5) {
                                                    if ((object = ((PlpProductUIModel)object).getFnlColorVariantData()) != null) {
                                                        object = ((ProductFnlColorVariantData)object).getColorGroup();
                                                    } else {
                                                        n8 = 0;
                                                        object = null;
                                                    }
                                                    object6 = ((Product)object5).getFnlColorVariantData();
                                                    if (object6 != null) {
                                                        object6 = ((ProductFnlColorVariantData)object6).getColorGroup();
                                                    } else {
                                                        bl5 = false;
                                                        object6 = null;
                                                    }
                                                    if ((n8 = (int)(Intrinsics.areEqual(object, object6) ? 1 : 0)) == 0) continue;
                                                }
                                                iterator.remove();
                                            }
                                            ((oy1_1)object2).cb((ArrayList)object8, (ArrayList)object4);
                                        }
                                    }
                                    catch (ConcurrentModificationException concurrentModificationException) {
                                        object = yn3_0.a;
                                        object8 = Unit.a;
                                        object5 = "Concurrent Modification Exception ";
                                        object4 = new StringBuilder((String)object5);
                                        ((StringBuilder)object4).append(object8);
                                        object8 = ((StringBuilder)object4).toString();
                                        object3 = new Object[]{};
                                        ((yn3$a)object).a((String)object8, (Object[])object3);
                                    }
                                }
                            }
                            if ((n8 = ((ArrayList)(object = ((oy1_1)object2).Qa().y)).size()) > 0) {
                                ((oy1_1)object2).bb();
                            } else {
                                ((oy1_1)object2).fb();
                            }
                            object = ((oy1_1)object2).r;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("cartClosetListener");
                                n8 = 0;
                                object = null;
                            }
                            object.updateCartWishCount();
                        }
                    } else {
                        n8 = ((DataCallback)object4).getStatus();
                        if (n8 == n4) {
                            object = StringCompanionObject.INSTANCE;
                            n8 = R$string.acc_alert_message;
                            object = hv3_0.K(n8);
                            n7 = R$string.remove_wish_list_alert;
                            object4 = hv3_0.K(n7);
                            Object[] objectArray2 = new Object[n4];
                            objectArray2[0] = object4;
                            object = xh2_0.a(objectArray2, n4, (String)object, (String)object5);
                            n3 = R$string.remove_wish_list_alert;
                            object3 = hv3_0.K(n3);
                            ((oy1_1)object2).gb((String)object3, (String)object);
                        }
                    }
                    object = ((oy1_1)object2).Qa().i;
                    ((BH3)object).c = null;
                }
                return Unit.a;
            }
            case 0: 
        }
        object3 = objectArray;
        object3 = (Throwable)objectArray;
        object2 = (G5)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = ((G5)object2).b;
        object2 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(object3);
        object2 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object2, (Throwable)object3, "ajioCashWalletToBankTransferStatus", false, null, null, 28, null);
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

