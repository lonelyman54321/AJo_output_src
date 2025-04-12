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

public class AddToWishListEvent
extends a {
    private CopyOnWriteArrayList cartProductList;
    private AtomicReference currency;

    public AddToWishListEvent(AddToWishListEvent object) {
        super((a)object);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.cartProductList = copyOnWriteArrayList;
        super();
        this.currency = copyOnWriteArrayList;
        copyOnWriteArrayList = ((AddToWishListEvent)object).cartProductList;
        this.setCartProductList(copyOnWriteArrayList);
        object = (Currency)((AddToWishListEvent)object).currency.get();
        this.setCurrency((Currency)object);
    }

    public AddToWishListEvent(Iterable iterable) {
        Serializable serializable;
        this.cartProductList = serializable = new Serializable();
        this.currency = serializable;
        this.setCartProductList(iterable);
    }

    public AddToWishListEvent(Currency currency, Iterable iterable) {
        Serializable serializable;
        this.cartProductList = serializable = new Serializable();
        this.currency = serializable;
        this.setCartProductList(iterable);
        this.setCurrency(currency);
    }

    public AddToWishListEvent(CartProduct ... object) {
        Serializable serializable;
        this.cartProductList = serializable = new Serializable();
        this.currency = serializable;
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
}

