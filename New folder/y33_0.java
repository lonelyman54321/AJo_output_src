/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.PriceReveal;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.SaleGAData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Y33
 */
public final class y33_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ Product a;
    public final /* synthetic */ BannerData b;
    public final /* synthetic */ int c;
    public final /* synthetic */ e43_0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;

    public y33_0(Product product, BannerData bannerData, int n3, e43_0 e43_02, String string2, long l2, f80_0 f80_02) {
        this.a = product;
        this.b = bannerData;
        this.c = n3;
        this.d = e43_02;
        this.e = string2;
        this.f = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.e;
        long l2 = this.f;
        Product product = this.a;
        BannerData bannerData = this.b;
        int n3 = this.c;
        e43_0 e43_02 = this.d;
        object = new y33_0(product, bannerData, n3, e43_02, string2, l2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (y33_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((y33_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        SaleGAData saleGAData;
        boolean bl2;
        Object object2;
        int n3;
        Object object3;
        Object object4;
        y33_0 y33_02 = this;
        Object object5 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object5 = this.a;
        boolean bl3 = ((Product)object5).isDODEnabled();
        Boolean bl4 = null;
        if (!bl3) {
            bl3 = false;
            object4 = null;
            boolean bl5 = tr2_2.p(false);
            boolean bl6 = true;
            if (bl5) {
                float f5;
                int n4;
                float f6;
                object3 = ((Product)object5).getOfferPrice();
                n3 = 0;
                if (object3 != null && (object3 = ((Price)object3).getPriceReveal()) != null && (object3 = ((PriceReveal)object3).getBestPrice()) != null) {
                    f6 = ((Float)object3).floatValue();
                } else {
                    n4 = 0;
                    f6 = 0.0f;
                    object3 = null;
                }
                n4 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
                if (n4 > 0) {
                    bl3 = true;
                }
                if ((object2 = ((Product)object5).getOfferPrice()) != null && (object2 = ((Price)object2).getPriceReveal()) != null && (object2 = ((PriceReveal)object2).getBestPrice()) != null) {
                    object2 = ((Float)object2).toString();
                } else {
                    bl6 = false;
                    object2 = null;
                }
                object5 = ((Product)object5).getOfferPrice();
                if (object5 != null && (object5 = ((Price)object5).getPriceReveal()) != null) {
                    object5 = ((PriceReveal)object5).getDiscountPercent();
                } else {
                    bl2 = false;
                    object5 = null;
                }
                saleGAData = new SaleGAData(bl3, (String)object2, (String)object5);
            } else {
                int n7;
                object3 = ((Product)object5).getOfferPrice();
                if (object3 != null) {
                    object3 = ((Price)object3).getValue();
                } else {
                    n7 = 0;
                    object3 = null;
                    float f7 = 0.0f;
                }
                if (object3 == null || (n7 = ((String)object3).length()) == 0) {
                    bl3 = true;
                }
                bl3 ^= bl6;
                if ((object5 = ((Product)object5).getOfferPrice()) != null) {
                    object5 = ((Price)object5).getValue();
                } else {
                    bl2 = false;
                    object5 = null;
                }
                saleGAData = new SaleGAData(bl3, (String)object5, null);
            }
        } else {
            boolean bl7 = false;
            saleGAData = null;
        }
        object5 = eb_2.a;
        object5 = y33_02.b;
        if (object5 != null && (object5 = ((BannerData)object5).getDynamicPageMetadata()) != null) {
            object5 = ((DynamicPageMetadata)object5).getDuration();
        } else {
            bl2 = false;
            object5 = null;
        }
        bl2 = eb_2.d((Long)object5);
        object5 = bl2 ? "shop the look video" : "shop the look";
        Object object6 = object5;
        object5 = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object5).getInstance().getNewEEcommerceEventsRevamp();
        object4 = ((AnalyticsManager$Companion)object5).getInstance().getNewEEcommerceEventsRevamp();
        String string2 = ((NewEEcommerceEventsRevamp)object4).getEE_SELECT_ITEM();
        String string3 = o72_0.a;
        String string4 = bv_0.a((AnalyticsManager$Companion)object5);
        if (saleGAData != null) {
            bl3 = saleGAData.isSalePriceAvailable();
            bl4 = bl3;
        }
        String string5 = cv_0.a((AnalyticsManager$Companion)object5);
        object5 = y33_02.d;
        object4 = y33_02.e;
        String string6 = e43_0.b((e43_0)object5, (String)object4);
        object3 = y33_02.a;
        n3 = y33_02.c;
        object5 = y33_02.b;
        long l2 = y33_02.f;
        NewEEcommerceEventsRevamp.pushEEProductSelect$default((NewEEcommerceEventsRevamp)object2, (Product)object3, n3, string2, (String)object6, "NA", string3, true, string4, "plp screen", bl4, string5, string6, "banner_shop_the_look", false, null, (BannerData)object5, l2, null, null, null, null, null, 4087808, null);
        return Unit.a;
    }
}

