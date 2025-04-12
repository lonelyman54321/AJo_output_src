/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ProductFnlColorVariantData
implements Serializable {
    private String aboutBrandImgUrl;
    private final String brandCode;
    private String brandName;
    private String color;
    private String colorGroup;
    private final String deliverySlaTag;
    private String descriptionV2;
    private final String exclusiveTill;
    private boolean isAllPromotions;
    private final int maxQuantity;
    private String mobileAppVideoUrl;
    private String outfitPictureURL;
    private String productTag;
    private String sizeGuideDesktop;
    private final String sizeGuideServiceUrl;
    private final String sizeGuideUrl;
    private transient JSONArray sizeJSONArray;
    private final String sizeToolTip;

    public final String getAboutBrandImgUrl() {
        return this.aboutBrandImgUrl;
    }

    public final String getBrandCode() {
        return this.brandCode;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final String getBrickName() {
        block12: {
            String string2 = "BRICK_NAME";
            Object object = "sizeChart";
            String string3 = this.sizeGuideDesktop;
            if (string3 != null) {
                String string4 = this.sizeGuideDesktop;
                string3 = new JSONObject(string4);
                boolean bl2 = string3.has((String)object);
                if (!bl2) break block12;
                object = string3.getJSONArray((String)object);
                int n3 = object.length();
                if (n3 <= 0) break block12;
                n3 = 0;
                string3 = null;
                object = object.get(0);
                object = (JSONObject)object;
                if (object == null) break block12;
                n3 = (int)(object.has(string2) ? 1 : 0);
                if (n3 == 0) break block12;
                try {
                    return object.getString(string2);
                }
                catch (JSONException jSONException) {
                    object = yn3_0.a;
                    ((yn3$a)object).e(jSONException);
                }
            }
        }
        return null;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getColorGroup() {
        return this.colorGroup;
    }

    public final String getDeliverySlaTag() {
        return this.deliverySlaTag;
    }

    public final String getDescriptionV2() {
        return this.descriptionV2;
    }

    public final String getExclusiveTill() {
        return this.exclusiveTill;
    }

    public final int getMaxQuantity() {
        return this.maxQuantity;
    }

    public final String getMobileAppVideoUrl() {
        return this.mobileAppVideoUrl;
    }

    public final String getOutfitPictureURL() {
        return this.outfitPictureURL;
    }

    public final String getProductTag() {
        return this.productTag;
    }

    public final String getSizeGuideDesktop() {
        return this.sizeGuideDesktop;
    }

    public final String getSizeGuideServiceUrl() {
        return this.sizeGuideServiceUrl;
    }

    public final String getSizeGuideUrl() {
        return this.sizeGuideUrl;
    }

    public final JSONArray getSizeJSONArray() {
        int n3;
        Object object = this.sizeJSONArray;
        if (object == null && (object = this.sizeToolTip) != null && (n3 = object.length()) != 0) {
            Object object2 = this.sizeToolTip;
            object = new JSONArray((String)object2);
            try {
                this.sizeJSONArray = object;
            }
            catch (JSONException jSONException) {
                object2 = yn3_0.a;
                ((yn3$a)object2).e(jSONException);
            }
        }
        return this.sizeJSONArray;
    }

    public final boolean isAllPromotions() {
        return this.isAllPromotions;
    }

    public final void setAboutBrandImgUrl(String string2) {
        this.aboutBrandImgUrl = string2;
    }

    public final void setAllPromotions(boolean bl2) {
        this.isAllPromotions = bl2;
    }

    public final void setBrandName(String string2) {
        this.brandName = string2;
    }

    public final void setColor(String string2) {
        this.color = string2;
    }

    public final void setColorGroup(String string2) {
        this.colorGroup = string2;
    }

    public final void setDescriptionV2(String string2) {
        this.descriptionV2 = string2;
    }

    public final void setMobileAppVideoUrl(String string2) {
        this.mobileAppVideoUrl = string2;
    }

    public final void setOutfitPictureURL(String string2) {
        this.outfitPictureURL = string2;
    }

    public final void setProductTag(String string2) {
        this.productTag = string2;
    }

    public final void setSizeGuideDesktop(String string2) {
        this.sizeGuideDesktop = string2;
    }
}

