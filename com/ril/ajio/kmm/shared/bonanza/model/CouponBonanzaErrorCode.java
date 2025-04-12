/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

public final class CouponBonanzaErrorCode {
    public static final int ERROR_INSUFFICIENT_POINTS_BALANCE = 2001;
    public static final int ERROR_INTERNAL_SERVER_ERROR = 2003;
    public static final int ERROR_SAME_VOUCHER_BOUGHT_AGAIN = 2002;
    public static final int FETCH_BONANZA_SERVER_EXCEPTION = 500;
    public static final CouponBonanzaErrorCode INSTANCE;

    static {
        CouponBonanzaErrorCode couponBonanzaErrorCode;
        INSTANCE = couponBonanzaErrorCode = new CouponBonanzaErrorCode();
    }

    private CouponBonanzaErrorCode() {
    }
}

