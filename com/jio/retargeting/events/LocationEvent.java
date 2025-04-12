/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.events;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.retargeting.data.CartProduct;
import com.jio.retargeting.events.a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Currency;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

public class LocationEvent
extends a {
    private CopyOnWriteArrayList cartProductList;
    private AtomicReference currency;
    private AtomicReference latitude;
    private AtomicReference longitude;
    private AtomicReference pincode;

    public LocationEvent(LocationEvent object) {
        super((a)object);
        Object object2 = new CopyOnWriteArrayList();
        this.cartProductList = object2;
        super();
        this.currency = object2;
        super();
        this.pincode = object2;
        super();
        this.latitude = object2;
        super();
        this.longitude = object2;
        object2 = ((LocationEvent)object).cartProductList;
        this.setCartProductList((Iterable)object2);
        object2 = (Currency)((LocationEvent)object).currency.get();
        this.setCurrency((Currency)object2);
        object2 = (String)((LocationEvent)object).pincode.get();
        this.setPincode((String)object2);
        object2 = (String)((LocationEvent)object).latitude.get();
        this.setLatitude((String)object2);
        object = (String)((LocationEvent)object).longitude.get();
        this.setLongitude((String)object);
    }

    public LocationEvent(Iterable iterable) {
        Serializable serializable;
        this.cartProductList = serializable = new Serializable();
        this.currency = serializable;
        super();
        this.pincode = serializable;
        super();
        this.latitude = serializable;
        super();
        this.longitude = serializable;
        this.setCartProductList(iterable);
    }

    public LocationEvent(Currency currency, Iterable iterable, String string2, String string3, String string4) {
        Serializable serializable;
        this.cartProductList = serializable = new Serializable();
        this.currency = serializable;
        super();
        this.pincode = serializable;
        super();
        this.latitude = serializable;
        super();
        this.longitude = serializable;
        this.setCartProductList(iterable);
        this.setCurrency(currency);
        this.setPincode(string2);
        this.setLatitude(string3);
        this.setLongitude(string4);
    }

    public LocationEvent(CartProduct ... object) {
        Serializable serializable;
        this.cartProductList = serializable = new Serializable();
        this.currency = serializable;
        super();
        this.pincode = serializable;
        super();
        this.latitude = serializable;
        super();
        this.longitude = serializable;
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

    public String getLatitude() {
        return (String)this.latitude.get();
    }

    public String getLongitude() {
        return (String)this.longitude.get();
    }

    public String getPincode() {
        return (String)this.pincode.get();
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

    public void setLatitude(String object) {
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument latitude must not be null", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        this.latitude.set(object);
    }

    public void setLongitude(String object) {
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument longitude must not be null", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        this.longitude.set(object);
    }

    public void setPincode(String object) {
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument pincode must not be null", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        this.pincode.set(object);
    }
}

