/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.services.data.Cart;

import android.text.TextUtils;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.GenericName;
import java.io.Serializable;

public class CartDeliveryAddress
implements Serializable {
    private String addressPOC;
    private boolean codEligible;
    private GenericName country;
    private String customAddressType;
    private boolean defaultAddress;
    private String deliveryModeValue;
    private String deliverySlaType;
    private String district;
    private boolean dropAtStoreService;
    private long eddTimeDiff;
    private String estimateDeliveryDate;
    private String estimateDeliveryDateYYYYMMDD;
    private boolean exchangeService;
    private String firstName;
    private String formattedAddress;
    private boolean fwdService;
    private String id;
    private boolean isCodAvailable;
    private boolean isDeliveredAddress;
    private boolean isDroppedAtStore;
    private boolean isPickupAddress;
    private boolean isReturnonHold;
    private boolean isSelectedAddress;
    private boolean isSelfShipAddress;
    private boolean isServiceAble;
    private boolean isStorePickUpAvailable;
    private String landmark;
    private String lastName;
    private String line1;
    private String line2;
    private AddressType mAddressType;
    private int nsCount = 0;
    private int oosCount = 0;
    private String phone;
    private String postalCode = "";
    private String returnMessage;
    private boolean reverseService;
    private String selectedAddressType;
    private int serviceableCount = 0;
    private Boolean shippingAddress;
    private String state;
    private String title;
    private String titleCode;
    private int totalCount = 0;
    private String town;
    private Boolean visibleInAddressBook;

    public String getAddressPOC() {
        return this.addressPOC;
    }

    public AddressType getAddressType() {
        return this.mAddressType;
    }

    public String getCompleteAddress() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.line1;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            string2 = this.line1;
            stringBuilder.append(string2);
        }
        string2 = this.line2;
        bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string3 = ", ";
        if (!bl2) {
            string2 = stringBuilder.toString();
            bl2 = string2.isEmpty();
            if (!bl2) {
                stringBuilder.append(string3);
            }
            string2 = this.line2;
            stringBuilder.append(string2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = this.landmark)))) {
            string2 = stringBuilder.toString();
            bl2 = string2.isEmpty();
            if (!bl2) {
                stringBuilder.append(string3);
            }
            string2 = this.landmark;
            stringBuilder.append(string2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = this.town)))) {
            string2 = stringBuilder.toString();
            bl2 = string2.isEmpty();
            if (!bl2) {
                stringBuilder.append(string3);
            }
            string2 = this.town;
            stringBuilder.append(string2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = this.district)))) {
            string2 = stringBuilder.toString();
            bl2 = string2.isEmpty();
            if (!bl2) {
                stringBuilder.append(string3);
            }
            string2 = this.district;
            stringBuilder.append(string2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = this.state)))) {
            string2 = stringBuilder.toString();
            bl2 = string2.isEmpty();
            if (!bl2) {
                stringBuilder.append(string3);
            }
            string2 = this.state;
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    public GenericName getCountry() {
        return this.country;
    }

    public String getCustomAddressType() {
        return this.customAddressType;
    }

    public String getDeliveryModeValue() {
        return this.deliveryModeValue;
    }

    public String getDeliverySlaType() {
        return this.deliverySlaType;
    }

    public String getDistrict() {
        return this.district;
    }

    public long getEddTimeDiff() {
        return this.eddTimeDiff;
    }

    public String getEstimateDeliveryDate() {
        return this.estimateDeliveryDate;
    }

    public String getEstimateDeliveryDateYYYYMMDD() {
        return this.estimateDeliveryDateYYYYMMDD;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getFormattedAddress() {
        return this.formattedAddress;
    }

    public String getFullName() {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.firstName;
        if (string2 != null && !(bl2 = string2.isEmpty())) {
            string2 = this.firstName;
            stringBuilder.append(string2);
        }
        if ((string2 = this.lastName) != null && !(bl2 = string2.isEmpty())) {
            stringBuilder.append(" ");
            string2 = this.lastName;
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    public String getId() {
        return this.id;
    }

    public String getLandmark() {
        return this.landmark;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getLine1() {
        return this.line1;
    }

    public String getLine2() {
        return this.line2;
    }

    public int getNsCount() {
        return this.nsCount;
    }

    public int getOosCount() {
        return this.oosCount;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getReturnMessage() {
        return this.returnMessage;
    }

    public String getSelectedAddressType() {
        return this.selectedAddressType;
    }

    public int getServiceableCount() {
        return this.serviceableCount;
    }

    public Boolean getShippingAddress() {
        return this.shippingAddress;
    }

    public String getState() {
        return this.state;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitleCode() {
        return this.titleCode;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public String getTown() {
        return this.town;
    }

    public Boolean getVisibleInAddressBook() {
        return this.visibleInAddressBook;
    }

    public boolean isCodAvailable() {
        return this.isCodAvailable;
    }

    public boolean isCodEligible() {
        return this.codEligible;
    }

    public boolean isDefaultAddress() {
        return this.defaultAddress;
    }

    public boolean isDeliveredAddress() {
        return this.isDeliveredAddress;
    }

    public boolean isDropAtStoreService() {
        return this.dropAtStoreService;
    }

    public boolean isDroppedAtStore() {
        return this.isDroppedAtStore;
    }

    public boolean isExchangeService() {
        return this.exchangeService;
    }

    public boolean isFwdService() {
        return this.fwdService;
    }

    public boolean isPickupAddress() {
        return this.isPickupAddress;
    }

    public boolean isReturnonHold() {
        return this.isReturnonHold;
    }

    public boolean isReverseService() {
        return this.reverseService;
    }

    public boolean isSelectedAddress() {
        return this.isSelectedAddress;
    }

    public boolean isSelfShipAddress() {
        return this.isSelfShipAddress;
    }

    public boolean isServiceAble() {
        return this.isServiceAble;
    }

    public boolean isStorePickUpAvailable() {
        return this.isStorePickUpAvailable;
    }

    public void setAddressPOC(String string2) {
        this.addressPOC = string2;
    }

    public void setAddressType(AddressType addressType) {
        this.mAddressType = addressType;
    }

    public void setCodAvailable(boolean bl2) {
        this.isCodAvailable = bl2;
    }

    public void setCodEligible(boolean bl2) {
        this.codEligible = bl2;
    }

    public void setCountry(GenericName genericName) {
        this.country = genericName;
    }

    public void setCustomAddressType(String string2) {
        this.customAddressType = string2;
    }

    public void setDefaultAddress(boolean bl2) {
        this.defaultAddress = bl2;
    }

    public void setDeliveredAddress(boolean bl2) {
        this.isDeliveredAddress = bl2;
    }

    public void setDeliveryModeValue(String string2) {
        this.deliveryModeValue = string2;
    }

    public void setDeliverySlaType(String string2) {
        this.deliverySlaType = string2;
    }

    public void setDistrict(String string2) {
        this.district = string2;
    }

    public void setDropAtStoreService(boolean bl2) {
        this.dropAtStoreService = bl2;
    }

    public void setDroppedAtStore(boolean bl2) {
        this.isDroppedAtStore = bl2;
    }

    public void setEddTimeDiff(long l2) {
        this.eddTimeDiff = l2;
    }

    public void setEstimateDeliveryDate(String string2) {
        this.estimateDeliveryDate = string2;
    }

    public void setEstimateDeliveryDateYYYYMMDD(String string2) {
        this.estimateDeliveryDateYYYYMMDD = string2;
    }

    public void setExchangeService(boolean bl2) {
        this.exchangeService = bl2;
    }

    public void setFirstName(String string2) {
        this.firstName = string2;
    }

    public void setFormattedAddress(String string2) {
        this.formattedAddress = string2;
    }

    public void setFwdService(boolean bl2) {
        this.fwdService = bl2;
    }

    public void setId(String string2) {
        this.id = string2;
    }

    public void setLandmark(String string2) {
        this.landmark = string2;
    }

    public void setLastName(String string2) {
        this.lastName = string2;
    }

    public void setLine1(String string2) {
        this.line1 = string2;
    }

    public void setLine2(String string2) {
        this.line2 = string2;
    }

    public void setNsCount(int n3) {
        this.nsCount = n3;
    }

    public void setOosCount(int n3) {
        this.oosCount = n3;
    }

    public void setPhone(String string2) {
        this.phone = string2;
    }

    public void setPickupAddress(boolean bl2) {
        this.isPickupAddress = bl2;
    }

    public void setPostalCode(String string2) {
        this.postalCode = string2;
    }

    public void setReturnMessage(String string2) {
        this.returnMessage = string2;
    }

    public void setReturnonHold(boolean bl2) {
        this.isReturnonHold = bl2;
    }

    public void setReverseService(boolean bl2) {
        this.reverseService = bl2;
    }

    public void setSelectedAddress(boolean bl2) {
        this.isSelectedAddress = bl2;
    }

    public void setSelectedAddressType(String string2) {
        this.selectedAddressType = string2;
    }

    public void setSelfShipAddress(boolean bl2) {
        this.isSelfShipAddress = bl2;
    }

    public void setServiceAble(boolean bl2) {
        this.isServiceAble = bl2;
    }

    public void setServiceableCount(int n3) {
        this.serviceableCount = n3;
    }

    public void setShippingAddress(Boolean bl2) {
        this.shippingAddress = bl2;
    }

    public void setState(String string2) {
        this.state = string2;
    }

    public void setStorePickUpAvailable(boolean bl2) {
        this.isStorePickUpAvailable = bl2;
    }

    public void setTitle(String string2) {
        this.title = string2;
    }

    public void setTitleCode(String string2) {
        this.titleCode = string2;
    }

    public void setTotalCount(int n3) {
        this.totalCount = n3;
    }

    public void setTown(String string2) {
        this.town = string2;
    }

    public void setVisibleInAddressBook(Boolean bl2) {
        this.visibleInAddressBook = bl2;
    }
}

