/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 */
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.ImageSearchResponse;
import com.ril.ajio.services.data.Offers.AllOffersItem;
import com.ril.ajio.services.data.Offers.OffersList;
import com.ril.ajio.services.data.Offers.VoucherOfferItem;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.PriceRevealMetaInfo;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.ProductType;
import com.ril.ajio.services.query.CurrentQuery;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from mc0
 */
public final class mc0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ mc0_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object view) {
        int n3;
        int n4;
        Fragment fragment;
        Object object;
        Object object2;
        block24: {
            int n7;
            Object object3;
            block25: {
                DataCallback dataCallback;
                block23: {
                    int n8 = 0;
                    object2 = null;
                    object = "this$0";
                    fragment = this.b;
                    n4 = 1;
                    object3 = null;
                    n7 = this.a;
                    switch (n7) {
                        default: {
                            String string2;
                            int n10;
                            int n14;
                            View view2 = view;
                            ImageSearchResponse imageSearchResponse = (ImageSearchResponse)view;
                            fragment = (q22_0)fragment;
                            Intrinsics.checkNotNullParameter(fragment, (String)object);
                            object = ((Z51)fragment).getContext();
                            if (object != null) {
                                String string3 = "PREFERENCE_NAME";
                                object = object.getSharedPreferences(string3, 0);
                            } else {
                                n14 = 0;
                                object = null;
                            }
                            if (object != null && (n10 = object.getBoolean(string2 = "IsFacetNameClicked", false)) == n4) {
                                object2 = object.edit();
                                if (object2 != null) {
                                    object2.putBoolean(string2, false);
                                }
                                if (object2 == null) return Unit.a;
                                object2.apply();
                                return Unit.a;
                            }
                            ((q22_0)fragment).y0 = n4;
                            if (imageSearchResponse != null) {
                                boolean bl2;
                                Object object4;
                                object = new ProductsList();
                                try {
                                    object4 = imageSearchResponse.getProducts();
                                    bl2 = TypeIntrinsics.isMutableList(object4);
                                    if (!bl2) {
                                        n4 = 0;
                                        object4 = null;
                                    }
                                    ((ProductsList)object).setProducts((List)object4);
                                }
                                catch (Exception exception) {
                                    object4 = yn3_0.a;
                                    String string4 = "Exception while adding products:";
                                    Object[] objectArray = new Object[]{};
                                    ((yn3$a)object4).a(string4, objectArray);
                                }
                                object4 = imageSearchResponse.getPagination();
                                ((ProductsList)object).setPagination((Pagination)object4);
                                object4 = imageSearchResponse.getProduct_types();
                                ((ProductsList)object).setProduct_types((List)object4);
                                object4 = imageSearchResponse.getIm_id();
                                ((ProductsList)object).setIm_id((String)object4);
                                object4 = imageSearchResponse.getCurrentQuery();
                                ((ProductsList)object).setCurrentQuery((CurrentQuery)object4);
                                object4 = imageSearchResponse.getSorts();
                                ((ProductsList)object).setSorts((List)object4);
                                object4 = imageSearchResponse.getFacets();
                                ((ProductsList)object).setFacets((List)object4);
                                object4 = imageSearchResponse.getPriceRevealMetaInfo();
                                ((ProductsList)object).setPriceRevealMetaInfo((PriceRevealMetaInfo)object4);
                                object4 = imageSearchResponse.getQuickFilters();
                                ((ProductsList)object).setQuickFilters((List)object4);
                                object4 = imageSearchResponse.getProduct_types();
                                if (object4 != null) {
                                    object4 = object4.iterator();
                                    while ((n7 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                                        String string5;
                                        ProductType productType = (ProductType)object4.next();
                                        bl2 = productType.getSelected();
                                        if (!bl2) continue;
                                        ((q22_0)fragment).z0 = string5 = productType.getType();
                                    }
                                }
                                object4 = ((q22_0)fragment).N;
                                View view3 = ((q22_0)fragment).O;
                                hv3_0.t0((ShimmerFrameLayout)((Object)object4), view3);
                                ((q22_0)fragment).xb((ProductsList)object);
                                ((q22_0)fragment).yb();
                                object4 = ((q22_0)fragment).cb();
                                ((F12)object4).n((ProductsList)object, false);
                                n4 = (int)(((q22_0)fragment).zb() ? 1 : 0);
                                if (n4 != 0) {
                                    return Unit.a;
                                }
                                n4 = (int)(((q22_0)fragment).jb() ? 1 : 0);
                                if (n4 != 0) {
                                    object4 = ((q22_0)fragment).cb().d;
                                    object3 = ((ProductsList)object).getQuickFilters();
                                    ((bv2_0)object4).E((List)object3);
                                    fragment.o0();
                                    object4 = ((ProductsList)object).getPagination();
                                    if (object4 != null) {
                                        n8 = ((Pagination)object4).getCurrentPage();
                                        object2 = n8;
                                    }
                                    ((q22_0)fragment).kb((Integer)object2);
                                }
                                ((q22_0)fragment).Ta((ProductsList)object);
                                return Unit.a;
                            }
                            object2 = cp_1.Companion;
                            n8 = km_1.b((cp$a)object2);
                            if (n8 == 0) {
                                object2 = StringCompanionObject.INSTANCE;
                                n8 = R$string.acc_error_message_page_load_fail;
                                object2 = hv3_0.K(n8);
                                object = hv3_0.K(R$string.something_wrong_msg);
                                Object[] objectArray = new Object[n4];
                                objectArray[0] = object;
                                object2 = xh2_0.a(objectArray, n4, (String)object2, "format(...)");
                                n14 = R$string.something_wrong_msg;
                                object = hv3_0.K(n14);
                                hv3_0.o0(n4, (String)object, (String)object2);
                            }
                            object2 = ((q22_0)fragment).P;
                            Intrinsics.checkNotNull(object2);
                            ((RecyclerViewScrollListener)object2).setLoadingSate(false);
                            return Unit.a;
                        }
                        case 0: 
                    }
                    View view4 = view;
                    dataCallback = (DataCallback)view;
                    fragment = (pc0_2)fragment;
                    Intrinsics.checkNotNullParameter(fragment, (String)object);
                    object = cp_1.Companion;
                    n3 = nn_2.b((cp$a)object, dataCallback);
                    if (n3 == 0) return Unit.a;
                    n3 = dataCallback.getStatus();
                    if (n3 != 0) break block23;
                    object = (OffersList)dataCallback.getData();
                    object3 = ((pc0_2)fragment).g;
                    if (object3 == null) break block24;
                    if (object != null) {
                        object2 = ((OffersList)object).getAllVouchers();
                    }
                    if (object2 == null) break block24;
                    object2 = object2.iterator();
                    break block25;
                }
                n3 = dataCallback.getStatus();
                if (n3 != n4) break block24;
                object = dataCallback.getError();
                yn3$a yn3$a = yn3_0.a;
                if (object != null && (object = ((DataError)object).getErrorMessage()) != null) {
                    object2 = ((DataError$ErrorMessage)object).getMessage();
                }
                object = new Object[]{};
                yn3$a.k((String)object2, (Object[])object);
                break block24;
            }
            while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                AllOffersItem allOffersItem;
                object = (VoucherOfferItem)object2.next();
                String string6 = ((VoucherOfferItem)object).getVoucherCode();
                n7 = (int)(TextUtils.isEmpty((CharSequence)string6) ? 1 : 0);
                if (n7 != 0) continue;
                Object object5 = ((VoucherOfferItem)object).getDetailsURL();
                Object object6 = ((VoucherOfferItem)object).getVoucherCode();
                String string7 = ((VoucherOfferItem)object).getCartPageDescription();
                String string8 = ((VoucherOfferItem)object).getVoucherDescription();
                String string9 = ((VoucherOfferItem)object).getVoucherTncUrl();
                String string10 = ((VoucherOfferItem)object).getType();
                long l2 = -1;
                long l3 = -1;
                long l4 = -1;
                AllOffersItem allOffersItem2 = allOffersItem;
                allOffersItem = new AllOffersItem((String)object5, (String)object6, string7, string8, string9, l2, l3, l4, string10, false);
                String string11 = ((VoucherOfferItem)object).getVoucherExpireDate();
                boolean bl3 = TextUtils.isEmpty((CharSequence)string11);
                if (!bl3) {
                    long l7;
                    object = ((VoucherOfferItem)object).getVoucherExpireDate();
                    Intrinsics.checkNotNull(object);
                    String string12 = "yyyy-MM-dd'T'HH:mm:ss";
                    TextUtils.isEmpty((CharSequence)string12);
                    object6 = Locale.ENGLISH;
                    object5 = new SimpleDateFormat(string12, (Locale)object6);
                    try {
                        object = ((DateFormat)object5).parse((String)object);
                        l7 = ((Date)object).getTime();
                    }
                    catch (ParseException parseException) {
                        l7 = 0L;
                    }
                    fd0_2.b(l7, allOffersItem);
                }
                object = ((fd0_2)object3).g;
                ((ArrayList)object).add(allOffersItem);
            }
        }
        if ((object2 = ((pc0_2)fragment).e) == null) return Unit.a;
        object = (Integer)((LiveData)object2).d();
        Intrinsics.checkNotNull(object);
        n3 = (Integer)object + n4;
        object = n3;
        ((LiveData)object2).k(object);
        return Unit.a;
    }
}

