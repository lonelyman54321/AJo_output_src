/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;
import java.util.Map;

public final class ExpandedProductParsedResult
extends ParsedResult {
    public static final String KILOGRAM = "KG";
    public static final String POUND = "LB";
    private final String bestBeforeDate;
    private final String expirationDate;
    private final String lotNumber;
    private final String packagingDate;
    private final String price;
    private final String priceCurrency;
    private final String priceIncrement;
    private final String productID;
    private final String productionDate;
    private final String rawText;
    private final String sscc;
    private final Map uncommonAIs;
    private final String weight;
    private final String weightIncrement;
    private final String weightType;

    public ExpandedProductParsedResult(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, Map map2) {
        Object object = ParsedResultType.PRODUCT;
        super((ParsedResultType)((Object)object));
        object = string2;
        this.rawText = string2;
        object = string3;
        this.productID = string3;
        object = string4;
        this.sscc = string4;
        object = string5;
        this.lotNumber = string5;
        object = string6;
        this.productionDate = string6;
        object = string7;
        this.packagingDate = string7;
        object = string8;
        this.bestBeforeDate = string8;
        object = string9;
        this.expirationDate = string9;
        object = string10;
        this.weight = string10;
        object = string11;
        this.weightType = string11;
        object = string12;
        this.weightIncrement = string12;
        object = string13;
        this.price = string13;
        object = string14;
        this.priceIncrement = string14;
        object = string15;
        this.priceCurrency = string15;
        object = map2;
        this.uncommonAIs = map2;
    }

    private static boolean equalsOrNull(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }

    private static int hashNotNull(Object object) {
        if (object == null) {
            return 0;
        }
        return object.hashCode();
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof ExpandedProductParsedResult;
        if (!bl3) {
            return false;
        }
        object = (ExpandedProductParsedResult)object;
        Object object2 = this.productID;
        String string2 = ((ExpandedProductParsedResult)object).productID;
        bl3 = ExpandedProductParsedResult.equalsOrNull(object2, string2);
        return bl3 && (bl3 = ExpandedProductParsedResult.equalsOrNull(object2 = this.sscc, string2 = ((ExpandedProductParsedResult)object).sscc)) && (bl3 = ExpandedProductParsedResult.equalsOrNull(object2 = this.lotNumber, string2 = ((ExpandedProductParsedResult)object).lotNumber)) && (bl3 = ExpandedProductParsedResult.equalsOrNull(object2 = this.productionDate, string2 = ((ExpandedProductParsedResult)object).productionDate)) && (bl3 = ExpandedProductParsedResult.equalsOrNull(object2 = this.bestBeforeDate, string2 = ((ExpandedProductParsedResult)object).bestBeforeDate)) && (bl3 = ExpandedProductParsedResult.equalsOrNull(object2 = this.expirationDate, string2 = ((ExpandedProductParsedResult)object).expirationDate)) && (bl3 = ExpandedProductParsedResult.equalsOrNull(object2 = this.weight, string2 = ((ExpandedProductParsedResult)object).weight)) && (bl3 = ExpandedProductParsedResult.equalsOrNull(object2 = this.weightType, string2 = ((ExpandedProductParsedResult)object).weightType)) && (bl3 = ExpandedProductParsedResult.equalsOrNull(object2 = this.weightIncrement, string2 = ((ExpandedProductParsedResult)object).weightIncrement)) && (bl3 = ExpandedProductParsedResult.equalsOrNull(object2 = this.price, string2 = ((ExpandedProductParsedResult)object).price)) && (bl3 = ExpandedProductParsedResult.equalsOrNull(object2 = this.priceIncrement, string2 = ((ExpandedProductParsedResult)object).priceIncrement)) && (bl3 = ExpandedProductParsedResult.equalsOrNull(object2 = this.priceCurrency, string2 = ((ExpandedProductParsedResult)object).priceCurrency)) && (bl2 = ExpandedProductParsedResult.equalsOrNull(object2 = this.uncommonAIs, object = ((ExpandedProductParsedResult)object).uncommonAIs));
    }

    public String getBestBeforeDate() {
        return this.bestBeforeDate;
    }

    public String getDisplayResult() {
        return String.valueOf(this.rawText);
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public String getLotNumber() {
        return this.lotNumber;
    }

    public String getPackagingDate() {
        return this.packagingDate;
    }

    public String getPrice() {
        return this.price;
    }

    public String getPriceCurrency() {
        return this.priceCurrency;
    }

    public String getPriceIncrement() {
        return this.priceIncrement;
    }

    public String getProductID() {
        return this.productID;
    }

    public String getProductionDate() {
        return this.productionDate;
    }

    public String getRawText() {
        return this.rawText;
    }

    public String getSscc() {
        return this.sscc;
    }

    public Map getUncommonAIs() {
        return this.uncommonAIs;
    }

    public String getWeight() {
        return this.weight;
    }

    public String getWeightIncrement() {
        return this.weightIncrement;
    }

    public String getWeightType() {
        return this.weightType;
    }

    public int hashCode() {
        int n3 = ExpandedProductParsedResult.hashNotNull(this.productID);
        int n4 = ExpandedProductParsedResult.hashNotNull(this.sscc);
        n3 ^= n4;
        n4 = ExpandedProductParsedResult.hashNotNull(this.lotNumber);
        n3 ^= n4;
        n4 = ExpandedProductParsedResult.hashNotNull(this.productionDate);
        n3 ^= n4;
        n4 = ExpandedProductParsedResult.hashNotNull(this.bestBeforeDate);
        n3 ^= n4;
        n4 = ExpandedProductParsedResult.hashNotNull(this.expirationDate);
        n3 ^= n4;
        n4 = ExpandedProductParsedResult.hashNotNull(this.weight);
        n3 ^= n4;
        n4 = ExpandedProductParsedResult.hashNotNull(this.weightType);
        n3 ^= n4;
        n4 = ExpandedProductParsedResult.hashNotNull(this.weightIncrement);
        n3 ^= n4;
        n4 = ExpandedProductParsedResult.hashNotNull(this.price);
        n3 ^= n4;
        n4 = ExpandedProductParsedResult.hashNotNull(this.priceIncrement);
        n3 ^= n4;
        n4 = ExpandedProductParsedResult.hashNotNull(this.priceCurrency);
        n3 ^= n4;
        n4 = ExpandedProductParsedResult.hashNotNull(this.uncommonAIs);
        return n3 ^ n4;
    }
}

