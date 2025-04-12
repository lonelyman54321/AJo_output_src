/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.events;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.retargeting.data.CartProduct;
import com.jio.retargeting.data.Filters;
import com.jio.retargeting.events.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

public class ProductSearchViewEvent
extends a {
    private CopyOnWriteArrayList cartProductList;
    private AtomicReference currency;
    private CopyOnWriteArrayList filtersList;
    private AtomicReference searchString;

    public ProductSearchViewEvent(ProductSearchViewEvent object) {
        super((a)object);
        Serializable serializable = new CopyOnWriteArrayList();
        this.cartProductList = serializable;
        serializable = new CopyOnWriteArrayList();
        this.filtersList = serializable;
        super();
        this.currency = serializable;
        super();
        this.searchString = serializable;
        serializable = ((ProductSearchViewEvent)object).cartProductList;
        this.setCartProductList((Iterable)((Object)serializable));
        serializable = (Currency)((ProductSearchViewEvent)object).currency.get();
        this.setCurrency((Currency)serializable);
        serializable = ((ProductSearchViewEvent)object).getFiltersList();
        this.setFiltersList((Iterable)((Object)serializable));
        object = ((ProductSearchViewEvent)object).getSearchString();
        this.setSearchString((String)object);
    }

    public ProductSearchViewEvent(Iterable iterable, Iterable iterable2) {
        Serializable serializable;
        this.cartProductList = serializable = new Serializable();
        this.filtersList = serializable = new Serializable();
        this.currency = serializable;
        super();
        this.searchString = serializable;
        this.setCartProductList(iterable);
        this.setFiltersList(iterable2);
    }

    public ProductSearchViewEvent(Currency currency, Iterable iterable, Iterable iterable2, String string2) {
        Serializable serializable;
        this.cartProductList = serializable = new Serializable();
        this.filtersList = serializable = new Serializable();
        this.currency = serializable;
        super();
        this.searchString = serializable;
        this.setCartProductList(iterable);
        this.setCurrency(currency);
        this.setFiltersList(iterable2);
        this.setSearchString(string2);
    }

    public ProductSearchViewEvent(CartProduct ... object) {
        Serializable serializable;
        this.cartProductList = serializable = new Serializable();
        this.filtersList = serializable = new Serializable();
        this.currency = serializable;
        super();
        this.searchString = serializable;
        object = Arrays.asList(object);
        super(object);
        this.setCartProductList((Iterable)((Object)serializable));
    }

    private CopyOnWriteArrayList makeCartProducts(Iterable object) {
        boolean bl2;
        CopyOnWriteArrayList<CartProduct> copyOnWriteArrayList = new CopyOnWriteArrayList<CartProduct>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            CartProduct cartProduct = (CartProduct)object.next();
            String string2 = cartProduct.getProductId();
            int n3 = cartProduct.getPrice();
            int n4 = cartProduct.getQuantity();
            String string3 = cartProduct.getSegment();
            String string4 = cartProduct.getVertical();
            String string5 = cartProduct.getBrickname();
            String string6 = cartProduct.getSkuName();
            CartProduct cartProduct2 = new CartProduct(string2, n3, n4, string3, string4, string5, string6);
            copyOnWriteArrayList.add(cartProduct2);
        }
        return copyOnWriteArrayList;
    }

    private CopyOnWriteArrayList makeFilters(Iterable object) {
        boolean bl2;
        CopyOnWriteArrayList<Filters> copyOnWriteArrayList = new CopyOnWriteArrayList<Filters>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Filters)object.next();
            String string2 = ((Filters)object2).getName();
            object2 = ((Filters)object2).getValue();
            Filters filters = new Filters(string2, (List)object2);
            copyOnWriteArrayList.add(filters);
        }
        return copyOnWriteArrayList;
    }

    public void addCartProduct(CartProduct object) {
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument cartProduct must not be null", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        this.cartProductList.add(object);
    }

    public CopyOnWriteArrayList getCartProductList() {
        return this.cartProductList;
    }

    public Currency getCurrency() {
        return (Currency)this.currency.get();
    }

    public CopyOnWriteArrayList getFiltersList() {
        return this.filtersList;
    }

    public String getSearchString() {
        return (String)this.searchString.get();
    }

    public void setCartProductList(Iterable object) {
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument cartProductList must not be null", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        object = this.makeCartProducts((Iterable)object);
        this.cartProductList = object;
    }

    public void setCurrency(Currency object) {
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument currency must not be null", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        this.currency.set(object);
    }

    public void setFiltersList(Iterable object) {
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument filtersList must not be null", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        object = this.makeFilters((Iterable)object);
        this.filtersList = object;
    }

    public void setFiltersList(Filters ... object) {
        object = Arrays.asList(object);
        ArrayList arrayList = new ArrayList(object);
        this.setFiltersList(arrayList);
    }

    public void setSearchString(String object) {
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument listName must not be null", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        this.searchString.set(object);
    }
}

