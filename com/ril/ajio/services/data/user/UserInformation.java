/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.ril.ajio.services.data.user;

import android.content.Context;
import android.text.TextUtils;
import com.ajio.ril.core.network.AnonymousToken;
import com.ril.ajio.services.datastorage.SecuredPreferences;
import java.util.Calendar;

public class UserInformation {
    private static UserInformation instance;
    private String USER_STATUS_GUEST = "guest";
    private String USER_STATUS_LOGGED_IN = "logged in";
    private String USER_STATUS_MESSAGE_GUEST = "Guest";
    private Calendar calendarTokenExpiration;
    private SecuredPreferences securedPreferences;
    private boolean tokenInvalid = false;

    private UserInformation(Context context) {
        SecuredPreferences securedPreferences;
        this.securedPreferences = securedPreferences = new SecuredPreferences(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static UserInformation getInstance(Context context) {
        Object object = instance;
        if (object != null) return instance;
        object = UserInformation.class;
        synchronized (object) {
            try {
                UserInformation userInformation = instance;
                if (userInformation != null) return instance;
                instance = userInformation = new UserInformation(context);
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private long getIssuedTimeFromPrefs() {
        return this.securedPreferences.getIssuedOn();
    }

    private boolean isTokenNotAvailable() {
        String string2;
        boolean bl2 = this.isUserOnline();
        if (bl2 && (bl2 = TextUtils.isEmpty((CharSequence)(string2 = this.getSecureAccessToken()))) || !(bl2 = this.isUserOnline()) && (bl2 = TextUtils.isEmpty((CharSequence)(string2 = AnonymousToken.getAccessToken())))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public boolean checkUserParams() {
        String string2 = this.securedPreferences.getUserEmail();
        String string3 = this.securedPreferences.getUserId();
        String string4 = this.securedPreferences.getUserName();
        String string5 = this.securedPreferences.getCustomerUUID();
        String string6 = this.securedPreferences.getUserPhoneNumber();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!(bl2 || (bl2 = TextUtils.isEmpty((CharSequence)string4)) || (bl2 = TextUtils.isEmpty((CharSequence)string5)) || (bl2 = TextUtils.isEmpty((CharSequence)string6)) || (bl2 = TextUtils.isEmpty((CharSequence)string3)))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public String getCartGuId() {
        return this.securedPreferences.getCartGuId();
    }

    public String getClientId() {
        return this.securedPreferences.getClientId();
    }

    public String getCmsPreviewInfo() {
        return this.securedPreferences.getCmsPreviewInfo();
    }

    public String getCohortDataForGuestAjioStoreUser() {
        return this.securedPreferences.getAjioStoreGuestCohortValue();
    }

    public String getCohortLinkData() {
        return this.securedPreferences.getLinkCohortValue();
    }

    public String getCustomerIdentity() {
        int n3;
        String string2 = this.securedPreferences.getIdentity();
        if (string2 == null || (n3 = string2.length()) == 0) {
            string2 = "";
        }
        return string2;
    }

    public String getCustomerUUID() {
        int n3;
        String string2 = this.securedPreferences.getCustomerUUID();
        if (string2 == null || (n3 = string2.length()) == 0) {
            string2 = "";
        }
        return string2;
    }

    public String getDisplayUid() {
        return this.securedPreferences.getDisplayUid();
    }

    public String getEncryptedId() {
        return this.securedPreferences.getEncryptedId();
    }

    public String getEncryptedUserName() {
        String string2 = this.securedPreferences.getEncryptedUserName();
        int n3 = string2.length();
        if (n3 == 0) {
            string2 = "";
        }
        return string2;
    }

    public String getEncryptedUuid() {
        String string2 = this.securedPreferences.getEncryptedUuid();
        int n3 = string2.length();
        if (n3 == 0) {
            string2 = "";
        }
        return string2;
    }

    public String getEncryptionKey() {
        return this.securedPreferences.getEncryptionKey();
    }

    public String getEncryptionKeyVersion() {
        return this.securedPreferences.getEncryptionKeyVersion();
    }

    public long getExpiryTimeFromPrefs() {
        return this.securedPreferences.getExpiresIn();
    }

    public String getGuId() {
        return this.securedPreferences.getGuId();
    }

    public String getGuestAccessToken() {
        return this.securedPreferences.getGuestAccessToken();
    }

    public String getLoggedInStatus() {
        return this.securedPreferences.getLoggedInStatus();
    }

    public String getName() {
        return this.securedPreferences.getName();
    }

    public String getNewClientId() {
        return this.securedPreferences.getNewClientId();
    }

    public String getNotifyMeData() {
        return this.securedPreferences.getNotifyMeData();
    }

    public String getSecureAccessToken() {
        return this.securedPreferences.getAccessToken();
    }

    public String getSecureRefreshToken() {
        return this.securedPreferences.getRefreshToken();
    }

    public String getTaxPayerId() {
        return this.securedPreferences.getTaxPayerId();
    }

    public String getUCPReferralCode() {
        return this.securedPreferences.getUcpReferralCode();
    }

    public String getUcpAccessToken() {
        return this.securedPreferences.getUcpAccessToken();
    }

    public long getUcpExpiresIn() {
        return this.securedPreferences.getUcpExpiresIn();
    }

    public String getUcpRefreshToken() {
        return this.securedPreferences.getUcpRefreshToken();
    }

    public String getUserCohortValue() {
        return this.securedPreferences.getUserCohortValue();
    }

    public String getUserCohortValueV3() {
        return this.securedPreferences.getUserCohortValueV3();
    }

    public String getUserDeviceId() {
        return this.securedPreferences.getUserDeviceId();
    }

    public String getUserDeviceIdCohortValue() {
        return this.securedPreferences.getUserDeviceIdCohortValue();
    }

    public String getUserDeviceIdCohortValueV3() {
        return this.securedPreferences.getUserDeviceIdCohortValueV3();
    }

    public String getUserEmailId() {
        return this.securedPreferences.getUserEmail();
    }

    public String getUserId() {
        int n3;
        String string2 = this.securedPreferences.getUserId();
        if (string2 == null || (n3 = string2.length()) == 0) {
            string2 = "anonymous";
        }
        return string2.toLowerCase();
    }

    public String getUserName() {
        return this.securedPreferences.getUserName();
    }

    public String getUserOriginalReferralLink() {
        return this.securedPreferences.getUserOriginalReferralLink();
    }

    public String getUserPhoneNumber() {
        return this.securedPreferences.getUserPhoneNumber();
    }

    public String getUserReferralCode() {
        return this.securedPreferences.getUserReferralCode();
    }

    public String getUserReferralLink() {
        return this.securedPreferences.getUserReferralLink();
    }

    public String getUserSegementIds() {
        return this.securedPreferences.getUserSegementIds();
    }

    public String getUserStatus() {
        boolean bl2 = this.isUserOnline();
        if (bl2) {
            return this.USER_STATUS_LOGGED_IN;
        }
        return this.USER_STATUS_GUEST;
    }

    public String getUserStatusMessage() {
        String string2 = this.getLoggedInStatus();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return this.USER_STATUS_MESSAGE_GUEST;
        }
        return this.getLoggedInStatus();
    }

    public Boolean isAjioStoreGuestCohortValueFromCustomerApi() {
        return this.securedPreferences.isAjioStoreGuestCohortValueFromCustomerApi();
    }

    public boolean isEarlyAccessMember() {
        return this.securedPreferences.isEarlyAccessMember();
    }

    public Boolean isOnBoardingShown() {
        return this.securedPreferences.isOnBoardingShown();
    }

    public boolean isTokenExpired() {
        Calendar calendar = this.calendarTokenExpiration;
        if (calendar == null) {
            this.calendarTokenExpiration = calendar = Calendar.getInstance();
        }
        calendar = this.calendarTokenExpiration;
        long l2 = this.getIssuedTimeFromPrefs();
        long l3 = this.getExpiryTimeFromPrefs() * 1000L + l2 - 120000L;
        calendar.setTimeInMillis(l3);
        calendar = this.calendarTokenExpiration;
        Calendar calendar2 = Calendar.getInstance();
        return calendar.before(calendar2);
    }

    public boolean isTokenInValidNew() {
        Object object = cw.Companion;
        object.getClass();
        boolean bl2 = cw$a.a();
        boolean bl3 = false;
        if (bl2) {
            bl2 = this.isUserOnline();
            if (bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.securedPreferences.getAccessToken()))) && (bl2 = this.isTokenExpired()) || !(bl2 = this.isUserOnline()) && (bl2 = TextUtils.isEmpty((CharSequence)(object = AnonymousToken.getAccessToken())))) {
                bl3 = true;
            }
            return bl3;
        }
        bl2 = this.isTokenNotAvailable();
        if (bl2 || (bl2 = this.isUserOnline()) && (bl2 = this.isTokenExpired())) {
            bl3 = true;
        }
        return bl3;
    }

    public boolean isTokenInvalid() {
        boolean bl2 = this.tokenInvalid;
        bl2 = bl2 || (bl2 = this.isTokenNotAvailable());
        return bl2;
    }

    public boolean isUserOnline() {
        String string2;
        boolean bl2;
        String string3 = this.getUserId();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl3 && !(bl2 = string3.equals(string2 = "anonymous"))) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        return bl2;
    }

    public void removeCartGuId() {
        this.securedPreferences.removeCartGuId();
    }

    public void removeCartIdFromPref() {
        this.securedPreferences.removeCartIdFromPref();
    }

    public void removeCmsPreviewInfo() {
        this.securedPreferences.removeCmsPreviewInfo();
    }

    public void removeNotifyMeData() {
        this.securedPreferences.removeNotifyMeData();
    }

    public void reset() {
        this.calendarTokenExpiration = null;
        this.tokenInvalid = false;
        this.securedPreferences.clearUserInfo();
    }

    public void setAccessToken(String string2) {
        this.securedPreferences.setAccessToken(string2);
    }

    public void setCartGuId(String string2) {
        this.securedPreferences.setCartGuId(string2);
    }

    public void setClientId(String string2) {
        this.securedPreferences.setClientId(string2);
    }

    public void setCmsPreviewInfo(String string2) {
        this.securedPreferences.setCmsPreviewInfo(string2);
    }

    public void setCohortDataForGuestAjioStoreUser(String string2, Boolean bl2) {
        SecuredPreferences securedPreferences = this.securedPreferences;
        boolean bl3 = bl2;
        securedPreferences.setAjioStoreGuestCohortValue(string2, bl3);
    }

    public void setCohortLinkData(String string2) {
        this.securedPreferences.setLinkCohortValue(string2);
    }

    public void setCustomerIdentity(String string2) {
        this.securedPreferences.setIdentity(string2);
    }

    public void setCustomerUUID(String string2) {
        this.securedPreferences.setCustomerUUID(string2);
    }

    public void setDisplayUid(String string2) {
        this.securedPreferences.setDisplayUid(string2);
    }

    public void setEarlyAccessMember(boolean bl2) {
        this.securedPreferences.setEarlyAccessFlag(bl2);
    }

    public void setEncryptedId(String string2) {
        this.securedPreferences.setEncryptedId(string2);
    }

    public void setEncryptionKey(String string2) {
        this.securedPreferences.setEncryptionKey(string2);
    }

    public void setEncryptionKeyVersion(String string2) {
        this.securedPreferences.setEncryptionKeyVersion(string2);
    }

    public void setExpires_in(long l2) {
        this.securedPreferences.setExpiresIn(l2);
    }

    public void setGuId(String string2) {
        this.securedPreferences.setGuId(string2);
    }

    public void setGuestAccessToken(String string2) {
        this.securedPreferences.setGuestAccessToken(string2);
    }

    public void setIssuedOn(long l2) {
        this.securedPreferences.setIssuedOn(l2);
    }

    public void setLoggedInStatus(String string2) {
        boolean bl2;
        if (string2 == null) {
            return;
        }
        String string3 = "facebook";
        boolean bl3 = string2.equalsIgnoreCase(string3);
        string2 = bl3 ? "Logged in via FB" : ((bl3 = string2.equalsIgnoreCase(string3 = "google")) ? "Logged in via google" : ((bl3 = string2.equalsIgnoreCase(string3 = "smartlock")) ? "Logged in via google smartlock" : ((bl2 = string2.equalsIgnoreCase(string3 = "Guest")) ? string3 : "Logged in manual")));
        this.securedPreferences.setLoggedInStatus(string2);
    }

    public void setName(String string2) {
        this.securedPreferences.setName(string2);
    }

    public void setNewClientId(String string2) {
        this.securedPreferences.setNewClientId(string2);
    }

    public void setNotifyMeData(String string2) {
        this.securedPreferences.setNotifyMeData(string2);
    }

    public void setOnBoardingShown(Boolean bl2) {
        SecuredPreferences securedPreferences = this.securedPreferences;
        boolean bl3 = bl2;
        securedPreferences.setOnBoardingShown(bl3);
    }

    public void setRefreshToken(String string2) {
        this.securedPreferences.setRefreshToken(string2);
    }

    public void setTaxPayerId(String string2) {
        this.securedPreferences.setTaxPayerId(string2);
    }

    public void setTokenInvalid(boolean bl2) {
        this.tokenInvalid = bl2;
    }

    public void setUcpAccessToken(String string2) {
        this.securedPreferences.setUcpAccessToken(string2);
    }

    public void setUcpReferralCode(String string2) {
        this.securedPreferences.setUcpReferralCode(string2);
    }

    public void setUcpRefreshToken(String string2) {
        this.securedPreferences.setUcpRefreshToken(string2);
    }

    public void setUcpTokenExpires(Long l2) {
        SecuredPreferences securedPreferences = this.securedPreferences;
        long l3 = l2;
        securedPreferences.setUcpExpiresIn(l3);
    }

    public void setUserCohortValue(String string2) {
        this.securedPreferences.setUserCohortValue(string2);
    }

    public void setUserCohortValueV3(String string2) {
        this.securedPreferences.setUserCohortValueV3(string2);
    }

    public void setUserDeviceId(String string2) {
        this.securedPreferences.setUserDeviceId(string2);
    }

    public void setUserDeviceIdCohortValue(String string2) {
        this.securedPreferences.setUserDeviceIdCohortValue(string2);
    }

    public void setUserDeviceIdCohortValueV3(String string2) {
        this.securedPreferences.setUserDeviceIdCohortValueV3(string2);
    }

    public void setUserEmailId(String string2) {
        this.securedPreferences.setUserEmail(string2);
    }

    public void setUserId(String object) {
        Object[] objectArray = this.securedPreferences;
        try {
            objectArray.setUserID((String)object);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object = yn3_0.a;
            ((yn3$a)object).l("LoginRepository");
            objectArray = new Object[]{};
            String string2 = "IllegalArgumentException: ${e.message.toString()}";
            ((yn3$a)object).d(string2, objectArray);
        }
    }

    public void setUserName(String string2) {
        this.securedPreferences.setUserName(string2);
    }

    public void setUserOriginalReferralLink(String string2) {
        this.securedPreferences.setUserOriginalReferralLink(string2);
    }

    public void setUserPhoneNumber(String string2) {
        this.securedPreferences.setUserPhoneNumber(string2);
    }

    public void setUserReferralCode(String string2) {
        this.securedPreferences.setUserReferralCode(string2);
    }

    public void setUserReferralLink(String string2) {
        this.securedPreferences.setUserReferralLink(string2);
    }

    public void setUserSegementIds(String string2) {
        this.securedPreferences.setUserSegementIds(string2);
    }
}

