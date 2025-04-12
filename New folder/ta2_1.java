/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import com.ril.ajio.services.data.Product.OfferPrice;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.fleek.feedModel.FnlColorVariantData;
import com.ril.ajio.services.data.fleek.feedModel.Price;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import com.ril.ajio.services.data.fleek.feedModel.WasPriceData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tA2
 */
public final class ta2_1
implements Function1 {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Resource c;
    public final /* synthetic */ dr0_0 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ ta2_1(Configuration configuration, boolean bl2, Resource resource, dr0_0 dr0_02, Function1 function1) {
        this.a = configuration;
        this.b = bl2;
        this.c = resource;
        this.d = dr0_02;
        this.e = function1;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        Object object2 = object;
        object2 = (zp1)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "$configuration");
        Object object4 = this.d;
        Intrinsics.checkNotNullParameter(object4, "$fleekViewModel");
        Function1 function1 = this.e;
        Intrinsics.checkNotNullParameter(function1, "$sendProductImpressionDataMiniPLP");
        Object object5 = "layoutCoordinates";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        boolean bl3 = az3_0.a((zp1)object2, (Configuration)object3);
        if (bl3 && (bl3 = this.b) && (object2 = this.c) != null && !(bl2 = ((Resource)object2).isGaFiredInCurrentSession()) && !(bl2 = ((ArrayList)(object3 = ((dr0_0)object4).Q0)).contains(object2))) {
            bl2 = true;
            ((Resource)object2).setGaFiredInCurrentSession(bl2);
            ((dr0_0)object4).Q0.add(object2);
            object3 = new ArrayList();
            object4 = new Product();
            object5 = ((Resource)object2).getId();
            ((Product)object4).setId((String)object5);
            object5 = ((Resource)object2).getCode();
            ((Product)object4).setCode((String)object5);
            object5 = ((Resource)object2).getName();
            ((Product)object4).setName((String)object5);
            object5 = ((Resource)object2).getImages();
            ((Product)object4).setImages((List)object5);
            object5 = ((Resource)object2).getDiscountPercent();
            ((Product)object4).setDiscountPercent((String)object5);
            int n3 = 8191;
            Object object6 = object5;
            object5 = new com.ril.ajio.services.data.Price(null, null, null, null, null, null, null, null, null, null, null, null, null, n3, null);
            object6 = ((Resource)object2).getPrice();
            String string2 = null;
            object6 = object6 != null ? ((Price)object6).getDisplayformattedValue() : null;
            ((com.ril.ajio.services.data.Price)object5).setDisplayformattedValue((String)object6);
            object6 = ((Resource)object2).getPrice();
            object6 = object6 != null ? ((Price)object6).getFormattedValue() : null;
            ((com.ril.ajio.services.data.Price)object5).setFormattedValue((String)object6);
            object6 = ((Resource)object2).getPrice();
            object6 = object6 != null ? ((Price)object6).getValue() : null;
            ((com.ril.ajio.services.data.Price)object5).setValue((String)object6);
            ((Product)object4).setPrice((com.ril.ajio.services.data.Price)object5);
            n3 = 0;
            int n4 = 8191;
            object5 = new com.ril.ajio.services.data.Price(null, null, null, null, null, null, null, null, null, null, null, null, null, n4, null);
            object6 = ((Resource)object2).getWasPriceData();
            object6 = object6 != null ? ((WasPriceData)object6).getDisplayformattedValue() : null;
            ((com.ril.ajio.services.data.Price)object5).setDisplayformattedValue((String)object6);
            object6 = ((Resource)object2).getWasPriceData();
            object6 = object6 != null ? ((WasPriceData)object6).getFormattedValue() : null;
            ((com.ril.ajio.services.data.Price)object5).setFormattedValue((String)object6);
            object6 = ((Resource)object2).getWasPriceData();
            object6 = object6 != null ? ((WasPriceData)object6).getValue() : null;
            ((com.ril.ajio.services.data.Price)object5).setValue((String)object6);
            ((Product)object4).setWasPriceData((com.ril.ajio.services.data.Price)object5);
            object5 = new OfferPrice();
            object6 = ((Resource)object2).getOfferPrice();
            object6 = object6 != null ? ((com.ril.ajio.services.data.fleek.feedModel.OfferPrice)object6).getDisplayformattedValue() : null;
            ((com.ril.ajio.services.data.Price)object5).setDisplayformattedValue((String)object6);
            object6 = ((Resource)object2).getOfferPrice();
            object6 = object6 != null ? ((com.ril.ajio.services.data.fleek.feedModel.OfferPrice)object6).getFormattedValue() : null;
            ((com.ril.ajio.services.data.Price)object5).setFormattedValue((String)object6);
            object6 = ((Resource)object2).getOfferPrice();
            object6 = object6 != null ? ((com.ril.ajio.services.data.fleek.feedModel.OfferPrice)object6).getValue() : null;
            ((com.ril.ajio.services.data.Price)object5).setValue((String)object6);
            ((Product)object4).setOfferPrice((OfferPrice)object5);
            object5 = new ProductFnlColorVariantData();
            object6 = ((Resource)object2).getFnlColorVariantData();
            object6 = object6 != null ? ((FnlColorVariantData)object6).getBrandName() : null;
            ((ProductFnlColorVariantData)object5).setBrandName((String)object6);
            object6 = ((Resource)object2).getFnlColorVariantData();
            object6 = object6 != null ? ((FnlColorVariantData)object6).getColorGroup() : null;
            ((ProductFnlColorVariantData)object5).setColorGroup((String)object6);
            object2 = ((Resource)object2).getFnlColorVariantData();
            if (object2 != null) {
                string2 = ((FnlColorVariantData)object2).getOutfitPictureURL();
            }
            ((ProductFnlColorVariantData)object5).setOutfitPictureURL(string2);
            ((Product)object4).setFnlColorVariantData((ProductFnlColorVariantData)object5);
            ((ArrayList)object3).add(object4);
            function1.invoke(object3);
        }
        return Unit.a;
    }
}

