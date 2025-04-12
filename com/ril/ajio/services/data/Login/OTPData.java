/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Login;

public class OTPData {
    private int isReferralCodeValid;
    private String message;
    private String otpCode;
    private String otpExpirationTime;
    private String referralCodeMessage;
    private boolean success;

    public String getMessage() {
        return this.message;
    }

    public String getOtpCode() {
        return this.otpCode;
    }

    public String getOtpExpirationTime() {
        return this.otpExpirationTime;
    }

    public String getReferralCodeMessage() {
        return this.referralCodeMessage;
    }

    public boolean isReferralCodeValid() {
        int n3 = this.isReferralCodeValid;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setMessage(String string2) {
        this.message = string2;
    }

    public void setOtpCode(String string2) {
        this.otpCode = string2;
    }

    public void setOtpExpirationTime(String string2) {
        this.otpExpirationTime = string2;
    }

    public void setSuccess(boolean bl2) {
        this.success = bl2;
    }
}

