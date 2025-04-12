/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.services.datastorage;

import android.content.Context;
import com.ril.ajio.services.datastorage.SecuredPreferences$Companion;
import com.ril.ajio.services.helper.SecurityHelper;
import kotlin.jvm.internal.Intrinsics;

public final class SecuredPreferences
extends sw_0 {
    public static final SecuredPreferences$Companion Companion;
    private static final String PREF_NAME = "com.ril.ajio_preferences";

    static {
        SecuredPreferences$Companion securedPreferences$Companion;
        Companion = securedPreferences$Companion = new SecuredPreferences$Companion(null);
    }

    public SecuredPreferences(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(PREF_NAME, context);
    }

    public final void clearUserInfo() {
        this.removePreference("refresh_token");
        this.removePreference("access_token");
        this.removePreference("user_online");
        this.removePreference("EXPIRES_IN");
        this.removePreference("ISSUED_ON");
        this.removePreference("USER_ID");
        this.removePreference("USER_NAME");
        this.removePreference("USER_EMAIL_ID");
        this.removePreference("USER_PHONE_NUMBER");
        this.removePreference("CUSTOMER_UUID");
        this.removePreference("GU_ID");
        this.removePreference("CART_GU_ID");
        this.removePreference("Logged In Status");
        this.removePreference("USER_REFERRAL_CODE");
        this.removePreference("USER_REFERRAL_LINK");
        this.removePreference("USER_ORIGINAL_REFERRAL_LINK");
        this.removePreference("encryptedId");
        this.removePreference("userCohortValue");
        this.removePreference("userCohortValueV3");
        this.removePreference("early_access_member");
        this.removePreference("is_on_boarding_shown");
        this.removePreference("user_segement_ids");
        this.removePreference("notify_me");
        this.removePreference("taxPayerId");
        this.removePreference("encryptionKey");
        this.removePreference("keyVersion");
        String string2 = "displayUID";
        this.removePreference(string2);
        this.removePreference("refresh_token_ucp");
        this.removePreference("access_token_ucp");
        this.removePreference("UCP_EXPIRES_IN");
        this.removePreference(string2);
    }

    public final String getAccessToken() {
        return SecurityHelper.decrypt(this.getPreference("access_token", ""));
    }

    public final String getAjioStoreGuestCohortValue() {
        String string2 = SecurityHelper.decrypt(this.getPreference("guestCohortValue", ""));
        Intrinsics.checkNotNullExpressionValue(string2, "decrypt(...)");
        return string2;
    }

    public final String getCartGuId() {
        return SecurityHelper.decrypt(this.getPreference("CART_GU_ID", ""));
    }

    public final String getClientId() {
        return SecurityHelper.decrypt(this.getPreference("client_id", ""));
    }

    public final String getCmsPreviewInfo() {
        return SecurityHelper.decrypt(this.getPreference("cmsPreviewInfo", ""));
    }

    public final String getCustomerUUID() {
        return SecurityHelper.decrypt(this.getPreference("CUSTOMER_UUID", ""));
    }

    public final String getDisplayUid() {
        String string2 = SecurityHelper.decrypt(this.getPreference("displayUID", ""));
        Intrinsics.checkNotNullExpressionValue(string2, "decrypt(...)");
        return string2;
    }

    public final String getEncryptedId() {
        return SecurityHelper.decrypt(this.getPreference("encryptedId", ""));
    }

    public final String getEncryptedUserName() {
        String string2 = this.getPreference("USER_NAME", "");
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public final String getEncryptedUuid() {
        String string2 = this.getPreference("CUSTOMER_UUID", "");
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public final String getEncryptionKey() {
        String string2 = SecurityHelper.decrypt(this.getPreference("encryptionKey", ""));
        Intrinsics.checkNotNullExpressionValue(string2, "decrypt(...)");
        return string2;
    }

    public final String getEncryptionKeyVersion() {
        String string2 = SecurityHelper.decrypt(this.getPreference("keyVersion", ""));
        Intrinsics.checkNotNullExpressionValue(string2, "decrypt(...)");
        return string2;
    }

    public final long getExpiresIn() {
        return this.getPreference("EXPIRES_IN", 0L);
    }

    public final String getGuId() {
        return SecurityHelper.decrypt(this.getPreference("GU_ID", ""));
    }

    public final String getGuestAccessToken() {
        return SecurityHelper.decrypt(this.getPreference("userGuestToken", ""));
    }

    public final String getIdentity() {
        return SecurityHelper.decrypt(this.getPreference("CUSTOMER_IDENTITY", ""));
    }

    public final long getIssuedOn() {
        return this.getPreference("ISSUED_ON", 0L);
    }

    public final String getLinkCohortValue() {
        String string2 = SecurityHelper.decrypt(this.getPreference("linkCohortValue", ""));
        Intrinsics.checkNotNullExpressionValue(string2, "decrypt(...)");
        return string2;
    }

    public final String getLoggedInStatus() {
        return SecurityHelper.decrypt(this.getPreference("Logged In Status", ""));
    }

    public final String getName() {
        return SecurityHelper.decrypt(this.getPreference("NAME", ""));
    }

    public final String getNewClientId() {
        return SecurityHelper.decrypt(this.getPreference("tvc_client_id", ""));
    }

    public final String getNotifyMeData() {
        return this.getPreference("notify_me", "");
    }

    public final String getRefreshToken() {
        return SecurityHelper.decrypt(this.getPreference("refresh_token", ""));
    }

    public final String getTaxPayerId() {
        String string2 = SecurityHelper.decrypt(this.getPreference("taxPayerId", ""));
        Intrinsics.checkNotNullExpressionValue(string2, "decrypt(...)");
        return string2;
    }

    public final String getUcpAccessToken() {
        return SecurityHelper.decrypt(this.getPreference("access_token_ucp", ""));
    }

    public final long getUcpExpiresIn() {
        return this.getPreference("UCP_EXPIRES_IN", 0L);
    }

    public final String getUcpReferralCode() {
        return SecurityHelper.decrypt(this.getPreference("UCP_REFERRAL_CODE", ""));
    }

    public final String getUcpRefreshToken() {
        return SecurityHelper.decrypt(this.getPreference("refresh_token_ucp", ""));
    }

    public final String getUserCohortValue() {
        return SecurityHelper.decrypt(this.getPreference("userCohortValue", ""));
    }

    public final String getUserCohortValueV3() {
        return SecurityHelper.decrypt(this.getPreference("userCohortValueV3", ""));
    }

    public final String getUserDeviceId() {
        return SecurityHelper.decrypt(this.getPreference("userDeviceId", ""));
    }

    public final String getUserDeviceIdCohortValue() {
        return SecurityHelper.decrypt(this.getPreference("userDeviceIdCohortValue", ""));
    }

    public final String getUserDeviceIdCohortValueV3() {
        return SecurityHelper.decrypt(this.getPreference("userDeviceIdCohortValueV3", ""));
    }

    public final String getUserEmail() {
        return SecurityHelper.decrypt(this.getPreference("USER_EMAIL_ID", ""));
    }

    public final String getUserId() {
        return SecurityHelper.decrypt(this.getPreference("USER_ID", ""));
    }

    public final String getUserName() {
        return SecurityHelper.decrypt(this.getPreference("USER_NAME", ""));
    }

    public final String getUserOriginalReferralLink() {
        return SecurityHelper.decrypt(this.getPreference("USER_ORIGINAL_REFERRAL_LINK", ""));
    }

    public final String getUserPhoneNumber() {
        return SecurityHelper.decrypt(this.getPreference("USER_PHONE_NUMBER", ""));
    }

    public final String getUserReferralCode() {
        return SecurityHelper.decrypt(this.getPreference("USER_REFERRAL_CODE", ""));
    }

    public final String getUserReferralLink() {
        return SecurityHelper.decrypt(this.getPreference("USER_REFERRAL_LINK", ""));
    }

    public final String getUserSegementIds() {
        return String.valueOf(this.getPreference("user_segement_ids", ""));
    }

    public final boolean isAjioStoreGuestCohortValueFromCustomerApi() {
        return this.getPreference("isFromCustomerApi", false);
    }

    public final boolean isEarlyAccessMember() {
        return this.getPreference("early_access_member", false);
    }

    public final boolean isOnBoardingShown() {
        return this.getPreference("is_on_boarding_shown", false);
    }

    public final void removeCartGuId() {
        this.removePreference("GU_ID");
        this.removePreference("CART_GU_ID");
    }

    public final void removeCartIdFromPref() {
        this.removePreference("CART_ID");
    }

    public final void removeCmsPreviewInfo() {
        this.removePreference("cmsPreviewInfo");
    }

    public final void removeNotifyMeData() {
        this.removePreference("notify_me");
    }

    public final void setAccessToken(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "access_token";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setAjioStoreGuestCohortValue(String string2, boolean bl2) {
        if (string2 != null) {
            this.putPreference("isFromCustomerApi", bl2);
            int n3 = string2.length();
            String string3 = "guestCohortValue";
            if (n3 == 0) {
                this.putPreference(string3, string2);
            } else {
                String string4 = "encrypt(...)";
                cx2_1.a(string2, string4, this, string3);
            }
        }
    }

    public final void setCartGuId(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "CART_GU_ID";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setClientId(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "client_id";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setCmsPreviewInfo(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            String string3 = "encrypt(...)";
            String string4 = "cmsPreviewInfo";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setCustomerUUID(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "CUSTOMER_UUID";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setDisplayUid(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "displayUID";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setEarlyAccessFlag(boolean bl2) {
        this.putPreference("early_access_member", bl2);
    }

    public final void setEncryptedId(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "encryptedId";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setEncryptionKey(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "encryptionKey";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setEncryptionKeyVersion(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "keyVersion";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setExpiresIn(long l2) {
        this.putPreference("EXPIRES_IN", l2);
    }

    public final void setGuId(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "GU_ID";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setGuestAccessToken(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "userGuestToken";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setIdentity(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "CUSTOMER_IDENTITY";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setIssuedOn(long l2) {
        this.putPreference("ISSUED_ON", l2);
    }

    public final void setLinkCohortValue(String string2) {
        if (string2 != null) {
            int n3 = string2.length();
            String string3 = "linkCohortValue";
            if (n3 > 0) {
                String string4 = "encrypt(...)";
                cx2_1.a(string2, string4, this, string3);
            } else {
                this.putPreference(string3, string2);
            }
        }
    }

    public final void setLoggedInStatus(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "Logged In Status";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setName(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "NAME";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setNewClientId(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "tvc_client_id";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setNotifyMeData(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.putPreference("notify_me", string2);
    }

    public final void setOnBoardingShown(boolean bl2) {
        this.putPreference("is_on_boarding_shown", bl2);
    }

    public final void setRefreshToken(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "refresh_token";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setTaxPayerId(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "taxPayerId";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUcpAccessToken(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "access_token_ucp";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUcpExpiresIn(long l2) {
        this.putPreference("UCP_EXPIRES_IN", l2);
    }

    public final void setUcpReferralCode(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "UCP_REFERRAL_CODE";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUcpRefreshToken(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "refresh_token_ucp";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUserCohortValue(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "userCohortValue";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUserCohortValueV3(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "userCohortValueV3";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUserDeviceId(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "userDeviceId";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUserDeviceIdCohortValue(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "userDeviceIdCohortValue";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUserDeviceIdCohortValueV3(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "userDeviceIdCohortValueV3";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUserEmail(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "USER_EMAIL_ID";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUserID(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "USER_ID";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUserName(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "USER_NAME";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUserOriginalReferralLink(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "USER_ORIGINAL_REFERRAL_LINK";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUserPhoneNumber(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "USER_PHONE_NUMBER";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUserReferralCode(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "USER_REFERRAL_CODE";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUserReferralLink(String string2) {
        if (string2 != null) {
            String string3 = "encrypt(...)";
            String string4 = "USER_REFERRAL_LINK";
            cx2_1.a(string2, string3, this, string4);
        }
    }

    public final void setUserSegementIds(String string2) {
        Intrinsics.checkNotNullParameter(string2, "ids");
        this.putPreference("user_segement_ids", string2);
    }
}

