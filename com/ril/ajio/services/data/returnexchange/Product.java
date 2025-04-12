/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.returnexchange;

import com.ril.ajio.services.data.returnexchange.WasPriceData;
import java.io.Serializable;
import java.util.List;

public final class Product
implements Serializable {
    private List baseOptions;
    private String baseProduct;
    private String brandName;
    private String brickCategory;
    private String brickName;
    private String brickSubCategory;
    private String catalogName;
    private String code;
    private List images;
    private String name;
    private String url;
    private String verticalName;
    private WasPriceData wasPriceData;

    public final List getBaseOptions() {
        return this.baseOptions;
    }

    public final String getBaseProduct() {
        return this.baseProduct;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final String getBrickCategory() {
        return this.brickCategory;
    }

    public final String getBrickName() {
        return this.brickName;
    }

    public final String getBrickSubCategory() {
        return this.brickSubCategory;
    }

    public final String getCatalogName() {
        return this.catalogName;
    }

    public final String getCode() {
        return this.code;
    }

    public final List getImages() {
        return this.images;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVerticalName() {
        return this.verticalName;
    }

    public final WasPriceData getWasPriceData() {
        return this.wasPriceData;
    }

    public final void setBaseOptions(List list) {
        this.baseOptions = list;
    }

    public final void setBaseProduct(String string2) {
        this.baseProduct = string2;
    }

    public final void setBrandName(String string2) {
        this.brandName = string2;
    }

    public final void setBrickCategory(String string2) {
        this.brickCategory = string2;
    }

    public final void setBrickName(String string2) {
        this.brickName = string2;
    }

    public final void setBrickSubCategory(String string2) {
        this.brickSubCategory = string2;
    }

    public final void setCatalogName(String string2) {
        this.catalogName = string2;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setImages(List list) {
        this.images = list;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public final void setVerticalName(String string2) {
        this.verticalName = string2;
    }

    public final void setWasPriceData(WasPriceData wasPriceData) {
        this.wasPriceData = wasPriceData;
    }
}

