/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.services.data.Cart;

import android.text.TextUtils;
import com.ril.ajio.services.data.Cart.CartAppliedVoucher;
import com.ril.ajio.services.data.Cart.CartItem;
import com.ril.ajio.services.data.Cart.CartPromotionDetail;
import java.io.Serializable;
import java.util.List;

public class CartPromotion
implements CartItem,
Serializable,
Comparable {
    private List consumedEntries;
    private String description;
    private String detailLink = null;
    private boolean isApplied = false;
    private boolean isCouponCode = false;
    private boolean isTier = false;
    private CartPromotionDetail promotion;
    private String voucherMessages;

    public CartPromotion() {
    }

    public CartPromotion(CartAppliedVoucher object) {
        CartPromotionDetail cartPromotionDetail;
        boolean bl2;
        String string2;
        this.consumedEntries = null;
        this.description = string2 = ((CartAppliedVoucher)object).getCode();
        this.isApplied = bl2 = true;
        this.isCouponCode = bl2;
        this.voucherMessages = null;
        this.detailLink = null;
        this.promotion = cartPromotionDetail = new CartPromotionDetail();
        string2 = ((CartAppliedVoucher)object).getVoucherCode();
        cartPromotionDetail.setCode(string2);
        cartPromotionDetail = this.promotion;
        object = ((CartAppliedVoucher)object).getDescription();
        cartPromotionDetail.setDescription((String)object);
    }

    public CartPromotion(CartPromotion serializable) {
        boolean bl2;
        Object object = serializable.getConsumedEntires();
        this.consumedEntries = object;
        this.description = object = serializable.description;
        this.isApplied = bl2 = serializable.isApplied();
        this.isCouponCode = bl2 = serializable.isCouponCode();
        this.voucherMessages = object = serializable.getVoucherMessages();
        this.detailLink = object = serializable.getDetailLink();
        serializable = serializable.getPromotion();
        this.promotion = serializable;
    }

    private String getDetailLink() {
        return this.detailLink;
    }

    public int compareTo(CartPromotion object) {
        boolean bl2;
        Object object2 = ((CartPromotion)object).promotion;
        int n3 = -1;
        if (object2 == null) {
            return n3;
        }
        object2 = this.promotion;
        int n4 = 1;
        if (object2 == null) {
            return n4;
        }
        boolean bl3 = this.isCouponCode;
        if (bl3) {
            return n3;
        }
        bl3 = ((CartPromotion)object).isCouponCode;
        if (bl3) {
            return n4;
        }
        bl3 = this.isApplied;
        if (bl3) {
            return n3;
        }
        bl3 = ((CartPromotion)object).isApplied;
        if (bl3) {
            return n4;
        }
        boolean bl4 = TextUtils.isEmpty((CharSequence)(object2 = ((CartPromotionDetail)object2).getPromotionType()));
        if (!bl4 && (bl4 = TextUtils.isEmpty((CharSequence)(object2 = ((CartPromotion)object).promotion.getPromotionType())))) {
            return n3;
        }
        object2 = this.promotion.getPromotionType();
        bl4 = TextUtils.isEmpty((CharSequence)object2);
        if (bl4 && !(bl2 = TextUtils.isEmpty((CharSequence)(object = ((CartPromotion)object).promotion.getPromotionType())))) {
            return n4;
        }
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = false;
        if (object == null) {
            return false;
        }
        boolean bl4 = object instanceof CartPromotion;
        if (!bl4) {
            return false;
        }
        String string2 = ((CartPromotion)(object = (CartPromotion)object)).getDescription();
        bl4 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl4 && !(bl4 = TextUtils.isEmpty((CharSequence)(string2 = this.getDescription()))) && (bl2 = ((String)(object = ((CartPromotion)object).getDescription())).equalsIgnoreCase(string2 = this.getDescription()))) {
            bl3 = true;
        }
        return bl3;
    }

    public List getConsumedEntires() {
        return this.consumedEntries;
    }

    public String getDescription() {
        return this.description;
    }

    public CartPromotionDetail getPromotion() {
        return this.promotion;
    }

    public String getVoucherMessages() {
        return this.voucherMessages;
    }

    public int hashCode() {
        String string2 = this.getDescription();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            return this.getDescription().hashCode();
        }
        return 0;
    }

    public boolean isApplied() {
        return this.isApplied;
    }

    public boolean isCouponCode() {
        return this.isCouponCode;
    }

    public boolean isTier() {
        boolean bl2;
        Object object = this.promotion;
        if (object != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object = ((CartPromotionDetail)object).getPromotionType())))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public void setApplied(boolean bl2) {
        this.isApplied = bl2;
    }

    public void setConsumedEntires(List list) {
        this.consumedEntries = list;
    }

    public void setCouponCode(boolean bl2) {
        this.isCouponCode = bl2;
    }

    public void setDescription(String string2) {
        this.description = string2;
    }

    public void setDetailLink(String string2) {
        this.detailLink = string2;
    }

    public void setPromotion(CartPromotionDetail cartPromotionDetail) {
        this.promotion = cartPromotionDetail;
    }

    public void setVoucherMessages(String string2) {
        this.voucherMessages = string2;
    }
}

