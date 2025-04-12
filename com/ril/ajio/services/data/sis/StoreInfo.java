/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.sis;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.sis.StoreInfo$1;

public final class StoreInfo
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String activeAltText;
    public String activeImageUrl;
    private String appPopupLogo;
    public String aspectRatio;
    public String biggerLogo;
    private String bottomNavBarId;
    private String chevronBackgroundcolor;
    private String chevronBordercolor;
    public String colorTheme;
    private boolean displayInChevron;
    private Boolean displayInInterstitial;
    public String headerIconColor;
    private String inactiveAltText;
    public String inactiveImageUrl;
    public String pageType;
    private int position;
    public String smallerLogo;
    public String storeId;
    private String storeSubTitle;
    public String storeTitle;
    public String subdomain;
    private String textColor;

    static {
        StoreInfo$1 storeInfo$1 = new StoreInfo$1();
        CREATOR = storeInfo$1;
    }

    public StoreInfo() {
        this.displayInChevron = false;
        this.displayInInterstitial = null;
    }

    public StoreInfo(Parcel object) {
        String string2;
        int n3 = 0;
        Object object2 = null;
        this.displayInChevron = false;
        this.displayInInterstitial = null;
        this.biggerLogo = string2 = object.readString();
        this.colorTheme = string2 = object.readString();
        this.pageType = string2 = object.readString();
        this.smallerLogo = string2 = object.readString();
        this.storeTitle = string2 = object.readString();
        this.subdomain = string2 = object.readString();
        this.headerIconColor = string2 = object.readString();
        this.storeId = string2 = object.readString();
        this.chevronBackgroundcolor = string2 = object.readString();
        this.chevronBordercolor = string2 = object.readString();
        this.textColor = string2 = object.readString();
        this.storeSubTitle = string2 = object.readString();
        this.bottomNavBarId = string2 = object.readString();
        int n4 = object.readInt();
        int n7 = 1;
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        this.displayInChevron = n4;
        n4 = object.readInt();
        if (n4 == n7) {
            n3 = 1;
        }
        object2 = n3 != 0;
        this.displayInInterstitial = object2;
        this.position = n3 = object.readInt();
        this.appPopupLogo = object2 = object.readString();
        this.activeImageUrl = object2 = object.readString();
        this.inactiveImageUrl = object2 = object.readString();
        this.aspectRatio = object2 = object.readString();
        this.activeAltText = object2 = object.readString();
        object = object.readString();
        this.inactiveAltText = object;
    }

    public static StoreInfo getSampleInfo() {
        StoreInfo storeInfo = new StoreInfo();
        storeInfo.setColorTheme("#000000");
        storeInfo.setHeaderIconColor("#FFFFFF");
        storeInfo.setStoreTitle("Trends");
        return storeInfo;
    }

    public int describeContents() {
        return 0;
    }

    public String getActiveAltText() {
        return this.activeAltText;
    }

    public String getActiveImageUrl() {
        return this.activeImageUrl;
    }

    public String getAppPopupLogo() {
        return this.appPopupLogo;
    }

    public String getAspectRatio() {
        return this.aspectRatio;
    }

    public String getBiggerLogo() {
        return this.biggerLogo;
    }

    public String getBottomNavBarId() {
        return this.bottomNavBarId;
    }

    public String getChevronBackgroundcolor() {
        return this.chevronBackgroundcolor;
    }

    public String getChevronBordercolor() {
        return this.chevronBordercolor;
    }

    public String getColorTheme() {
        return this.colorTheme;
    }

    public String getHeaderIconColor() {
        return this.headerIconColor;
    }

    public String getInactiveAltText() {
        return this.inactiveAltText;
    }

    public String getInactiveImageUrl() {
        return this.inactiveImageUrl;
    }

    public String getPageType() {
        return this.pageType;
    }

    public int getPosition() {
        return this.position;
    }

    public String getSmallerLogo() {
        return this.smallerLogo;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public String getStoreSubTitle() {
        return this.storeSubTitle;
    }

    public String getStoreTitle() {
        return this.storeTitle;
    }

    public String getSubdomain() {
        return this.subdomain;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public boolean isDisplayInChevron() {
        Boolean bl2 = this.displayInInterstitial;
        if (bl2 == null) {
            return this.displayInChevron;
        }
        return bl2;
    }

    public boolean isDisplayInInterstitial() {
        return this.displayInInterstitial;
    }

    public void setActiveAltText(String string2) {
        this.activeAltText = string2;
    }

    public void setActiveImageUrl(String string2) {
        this.activeImageUrl = string2;
    }

    public void setAppPopupLogo(String string2) {
        this.appPopupLogo = string2;
    }

    public void setAspectRatio(String string2) {
        this.aspectRatio = string2;
    }

    public void setBiggerLogo(String string2) {
        this.biggerLogo = string2;
    }

    public void setBottomNavBarId(String string2) {
        this.bottomNavBarId = string2;
    }

    public void setChevronBackgroundcolor(String string2) {
        this.chevronBackgroundcolor = string2;
    }

    public void setChevronBordercolor(String string2) {
        this.chevronBordercolor = string2;
    }

    public void setColorTheme(String string2) {
        this.colorTheme = string2;
    }

    public void setDisplayInChevron(boolean bl2) {
        this.displayInChevron = bl2;
    }

    public void setDisplayInInterstitial(boolean bl2) {
        Boolean bl3;
        this.displayInInterstitial = bl3 = Boolean.valueOf(bl2);
    }

    public void setHeaderIconColor(String string2) {
        this.headerIconColor = string2;
    }

    public void setInactiveAltText(String string2) {
        this.inactiveAltText = string2;
    }

    public void setInactiveImageUrl(String string2) {
        this.inactiveImageUrl = string2;
    }

    public void setPageType(String string2) {
        this.pageType = string2;
    }

    public void setPosition(int n3) {
        this.position = n3;
    }

    public void setSmallerLogo(String string2) {
        this.smallerLogo = string2;
    }

    public void setStoreId(String string2) {
        this.storeId = string2;
    }

    public void setStoreSubTitle(String string2) {
        this.storeSubTitle = string2;
    }

    public void setStoreTitle(String string2) {
        this.storeTitle = string2;
    }

    public void setSubdomain(String string2) {
        this.subdomain = string2;
    }

    public void setTextColor(String string2) {
        this.textColor = string2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.biggerLogo;
        parcel.writeString(string2);
        string2 = this.colorTheme;
        parcel.writeString(string2);
        string2 = this.pageType;
        parcel.writeString(string2);
        string2 = this.smallerLogo;
        parcel.writeString(string2);
        string2 = this.storeTitle;
        parcel.writeString(string2);
        string2 = this.subdomain;
        parcel.writeString(string2);
        string2 = this.headerIconColor;
        parcel.writeString(string2);
        string2 = this.storeId;
        parcel.writeString(string2);
        string2 = this.chevronBackgroundcolor;
        parcel.writeString(string2);
        string2 = this.chevronBordercolor;
        parcel.writeString(string2);
        string2 = this.textColor;
        parcel.writeString(string2);
        string2 = this.storeSubTitle;
        parcel.writeString(string2);
        string2 = this.bottomNavBarId;
        parcel.writeString(string2);
        n3 = (int)(this.displayInChevron ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.displayInInterstitial.booleanValue() ? 1 : 0);
        parcel.writeInt(n3);
        n3 = this.position;
        parcel.writeInt(n3);
        string2 = this.appPopupLogo;
        parcel.writeString(string2);
        string2 = this.activeImageUrl;
        String string3 = "";
        if (string2 == null) {
            string2 = string3;
        }
        parcel.writeString(string2);
        string2 = this.inactiveImageUrl;
        if (string2 != null) {
            string3 = string2;
        }
        parcel.writeString(string3);
        string2 = this.aspectRatio;
        parcel.writeString(string2);
        string2 = this.activeAltText;
        parcel.writeString(string2);
        string2 = this.inactiveAltText;
        parcel.writeString(string2);
    }
}

