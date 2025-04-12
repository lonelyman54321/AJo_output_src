/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import com.ril.ajio.services.data.Home.BannerDetails;
import com.ril.ajio.services.data.Home.LuxeFooterData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class NewPageDetails
implements Serializable {
    private ArrayList ajioStoryData;
    private final String allowedCustomerState;
    private final String allowedCustomerType;
    private int appUpdateStatus;
    private final String application;
    private BannerDetails banner;
    private ArrayList bannerImageDetails;
    private int bannerPosition;
    private List closetCardItems;
    private int closetCount;
    private HashMap closetItemsPrice;
    private long closetLatestMillis = -1;
    private int componentPosition;
    private int displayEndTimerBefore;
    private int displayStartTimerBefore;
    private String gameName;
    private String height;
    private BannerDetails heroBanner;
    private String imageHeight;
    private String imageWidth;
    private boolean isAjioRevamp;
    private boolean isClosetDataComplete;
    private boolean isEcommerceEventPushed;
    private boolean isNoFlagCheck;
    private BannerDetails leftBanner;
    private LuxeFooterData luxeHomeFooterData;
    private BannerDetails middleBanner;
    private String mobileCatAppUrl;
    private ArrayList nativeFeatureHeroListDetails;
    private boolean offerEnd;
    private long offerEndTime;
    private boolean offerStart;
    private long offerStartTime;
    private ArrayList orderList;
    private String pageTitle;
    private String position;
    private List products;
    private HashMap recentlyViewedProdPrice;
    private float referralAmount;
    private BannerDetails rightBanner;
    private String subText;
    private int timeOut;
    private String title;
    private boolean topBannerForNewAppDisabled;
    private String typeCode;
    private String viewAllName;
    private String viewAllUrlLink;
    private BannerDetails viewAllUrlLinkPageContentDetails;

    public final ArrayList getAjioStoryData() {
        return this.ajioStoryData;
    }

    public final String getAllowedCustomerState() {
        return this.allowedCustomerState;
    }

    public final String getAllowedCustomerType() {
        return this.allowedCustomerType;
    }

    public final int getAppUpdateStatus() {
        return this.appUpdateStatus;
    }

    public final String getApplication() {
        return this.application;
    }

    public final BannerDetails getBanner() {
        return this.banner;
    }

    public final ArrayList getBannerImageDetails() {
        return this.bannerImageDetails;
    }

    public final int getBannerPosition() {
        return this.bannerPosition;
    }

    public final List getClosetCardItems() {
        return this.closetCardItems;
    }

    public final int getClosetCount() {
        return this.closetCount;
    }

    public final HashMap getClosetItemsPrice() {
        return this.closetItemsPrice;
    }

    public final long getClosetLatestMillis() {
        return this.closetLatestMillis;
    }

    public final int getComponentPosition() {
        return this.componentPosition;
    }

    public final int getDisplayEndTimerBefore() {
        return this.displayEndTimerBefore;
    }

    public final int getDisplayStartTimerBefore() {
        return this.displayStartTimerBefore;
    }

    public final String getGameName() {
        return this.gameName;
    }

    public final String getHeight() {
        return this.height;
    }

    public final BannerDetails getHeroBanner() {
        return this.heroBanner;
    }

    public final String getImageHeight() {
        return this.imageHeight;
    }

    public final String getImageWidth() {
        return this.imageWidth;
    }

    public final BannerDetails getLeftBanner() {
        return this.leftBanner;
    }

    public final LuxeFooterData getLuxeHomeFooterData() {
        return this.luxeHomeFooterData;
    }

    public final BannerDetails getMiddleBanner() {
        return this.middleBanner;
    }

    public final String getMobileCatAppUrl() {
        return this.mobileCatAppUrl;
    }

    public final ArrayList getNativeFeatureHeroListDetails() {
        return this.nativeFeatureHeroListDetails;
    }

    public final boolean getOfferEnd() {
        return this.offerEnd;
    }

    public final long getOfferEndTime() {
        return this.offerEndTime;
    }

    public final boolean getOfferStart() {
        return this.offerStart;
    }

    public final long getOfferStartTime() {
        return this.offerStartTime;
    }

    public final ArrayList getOrderList() {
        return this.orderList;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final String getPosition() {
        return this.position;
    }

    public final List getProducts() {
        return this.products;
    }

    public final HashMap getRecentlyViewedProdPrice() {
        return this.recentlyViewedProdPrice;
    }

    public final float getReferralAmount() {
        return this.referralAmount;
    }

    public final BannerDetails getRightBanner() {
        return this.rightBanner;
    }

    public final String getSubText() {
        return this.subText;
    }

    public final int getTimeOut() {
        return this.timeOut;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getTopBannerForNewAppDisabled() {
        return this.topBannerForNewAppDisabled;
    }

    public final String getTypeCode() {
        return this.typeCode;
    }

    public final String getViewAllName() {
        return this.viewAllName;
    }

    public final String getViewAllUrlLink() {
        return this.viewAllUrlLink;
    }

    public final BannerDetails getViewAllUrlLinkPageContentDetails() {
        return this.viewAllUrlLinkPageContentDetails;
    }

    public final boolean isAjioRevamp() {
        return this.isAjioRevamp;
    }

    public final boolean isClosetDataComplete() {
        return this.isClosetDataComplete;
    }

    public final boolean isEcommerceEventPushed() {
        return this.isEcommerceEventPushed;
    }

    public final boolean isNoFlagCheck() {
        return this.isNoFlagCheck;
    }

    public final void setAjioRevamp(boolean bl2) {
        this.isAjioRevamp = bl2;
    }

    public final void setAjioStoryData(ArrayList arrayList) {
        this.ajioStoryData = arrayList;
    }

    public final void setAppUpdateStatus(int n3) {
        this.appUpdateStatus = n3;
    }

    public final void setBanner(BannerDetails bannerDetails) {
        this.banner = bannerDetails;
    }

    public final void setBannerImageDetails(ArrayList arrayList) {
        this.bannerImageDetails = arrayList;
    }

    public final void setBannerPosition(int n3) {
        this.bannerPosition = n3;
    }

    public final void setClosetCardItems(List list) {
        this.closetCardItems = list;
    }

    public final void setClosetCount(int n3) {
        this.closetCount = n3;
    }

    public final void setClosetDataComplete(boolean bl2) {
        this.isClosetDataComplete = bl2;
    }

    public final void setClosetItemsPrice(HashMap hashMap) {
        this.closetItemsPrice = hashMap;
    }

    public final void setClosetLatestMillis(long l2) {
        this.closetLatestMillis = l2;
    }

    public final void setComponentPosition(int n3) {
        this.componentPosition = n3;
    }

    public final void setDisplayEndTimerBefore(int n3) {
        this.displayEndTimerBefore = n3;
    }

    public final void setDisplayStartTimerBefore(int n3) {
        this.displayStartTimerBefore = n3;
    }

    public final void setEcommerceEventPushed(boolean bl2) {
        this.isEcommerceEventPushed = bl2;
    }

    public final void setGameName(String string2) {
        this.gameName = string2;
    }

    public final void setHeight(String string2) {
        this.height = string2;
    }

    public final void setHeroBanner(BannerDetails bannerDetails) {
        this.heroBanner = bannerDetails;
    }

    public final void setImageHeight(String string2) {
        this.imageHeight = string2;
    }

    public final void setImageWidth(String string2) {
        this.imageWidth = string2;
    }

    public final void setLeftBanner(BannerDetails bannerDetails) {
        this.leftBanner = bannerDetails;
    }

    public final void setLuxeHomeFooterData(LuxeFooterData luxeFooterData) {
        this.luxeHomeFooterData = luxeFooterData;
    }

    public final void setMiddleBanner(BannerDetails bannerDetails) {
        this.middleBanner = bannerDetails;
    }

    public final void setMobileCatAppUrl(String string2) {
        this.mobileCatAppUrl = string2;
    }

    public final void setNativeFeatureHeroListDetails(ArrayList arrayList) {
        this.nativeFeatureHeroListDetails = arrayList;
    }

    public final void setNoFlagCheck(boolean bl2) {
        this.isNoFlagCheck = bl2;
    }

    public final void setOfferEnd(boolean bl2) {
        this.offerEnd = bl2;
    }

    public final void setOfferEndTime(long l2) {
        this.offerEndTime = l2;
    }

    public final void setOfferStart(boolean bl2) {
        this.offerStart = bl2;
    }

    public final void setOfferStartTime(long l2) {
        this.offerStartTime = l2;
    }

    public final void setOrderList(ArrayList arrayList) {
        this.orderList = arrayList;
    }

    public final void setPageTitle(String string2) {
        this.pageTitle = string2;
    }

    public final void setPosition(String string2) {
        this.position = string2;
    }

    public final void setProducts(List list) {
        this.products = list;
    }

    public final void setRecentlyViewedProdPrice(HashMap hashMap) {
        this.recentlyViewedProdPrice = hashMap;
    }

    public final void setReferralAmount(float f5) {
        this.referralAmount = f5;
    }

    public final void setRightBanner(BannerDetails bannerDetails) {
        this.rightBanner = bannerDetails;
    }

    public final void setSubText(String string2) {
        this.subText = string2;
    }

    public final void setTimeOut(int n3) {
        this.timeOut = n3;
    }

    public final void setTitle(String string2) {
        this.title = string2;
    }

    public final void setTopBannerForNewAppDisabled(boolean bl2) {
        this.topBannerForNewAppDisabled = bl2;
    }

    public final void setTypeCode(String string2) {
        this.typeCode = string2;
    }

    public final void setViewAllName(String string2) {
        this.viewAllName = string2;
    }

    public final void setViewAllUrlLink(String string2) {
        this.viewAllUrlLink = string2;
    }

    public final void setViewAllUrlLinkPageContentDetails(BannerDetails bannerDetails) {
        this.viewAllUrlLinkPageContentDetails = bannerDetails;
    }
}

