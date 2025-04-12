/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import java.io.Serializable;

public class AccountCheckResponse
implements Serializable {
    private String captchaImage;
    private boolean captchaInputRequired;
    private String encryptedId;
    private String maskedEmailId;
    private String maskedMobileNumber;
    private boolean resetPasswordFirstLogin;
    private boolean socialLogin;
    private boolean success;
    private String userName;

    public String getCaptchaImage() {
        return this.captchaImage;
    }

    public String getEncryptedId() {
        return this.encryptedId;
    }

    public String getMaskedEmailId() {
        return this.maskedEmailId;
    }

    public String getMaskedMobileNumber() {
        return this.maskedMobileNumber;
    }

    public String getUserName() {
        return this.userName;
    }

    public boolean isCaptchaInputRequired() {
        return this.captchaInputRequired;
    }

    public boolean isResetPasswordFirstLogin() {
        return this.resetPasswordFirstLogin;
    }

    public boolean isSocialLogin() {
        return this.socialLogin;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setEncryptedId(String string2) {
        this.encryptedId = string2;
    }

    public void setMaskedEmailId(String string2) {
        this.maskedEmailId = string2;
    }

    public void setMaskedMobileNumber(String string2) {
        this.maskedMobileNumber = string2;
    }

    public void setResetPasswordFirstLogin(boolean bl2) {
        this.resetPasswordFirstLogin = bl2;
    }

    public void setSocialLogin(boolean bl2) {
        this.socialLogin = bl2;
    }

    public void setSuccess(boolean bl2) {
        this.success = bl2;
    }

    public void setUserName(String string2) {
        this.userName = string2;
    }
}

