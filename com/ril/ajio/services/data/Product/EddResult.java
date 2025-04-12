/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.FraudEngineEddResponse;
import com.ril.ajio.services.data.Product.Status;
import java.util.ArrayList;

public class EddResult {
    private boolean codEligible;
    private boolean finalCodEligible;
    private boolean finalExchangeable;
    private int finalReturnWindow;
    private boolean finalReturnable;
    private FraudEngineEddResponse fraudEngineResponse;
    private boolean isFirstTimeCalled;
    private String pinCode;
    private ArrayList productDetails = null;
    private String returnLayoutMessage;
    private boolean servicability;
    private Status status;

    public int getFinalReturnWindow() {
        return this.finalReturnWindow;
    }

    public FraudEngineEddResponse getFraudEngineResponse() {
        return this.fraudEngineResponse;
    }

    public String getPinCode() {
        return this.pinCode;
    }

    public ArrayList getProductDetails() {
        return this.productDetails;
    }

    public String getReturnLayoutMessage() {
        return this.returnLayoutMessage;
    }

    public Status getStatus() {
        return this.status;
    }

    public boolean isCodEligible() {
        return this.codEligible;
    }

    public boolean isFinalCodEligible() {
        return this.finalCodEligible;
    }

    public boolean isFinalExchangeable() {
        return this.finalExchangeable;
    }

    public boolean isFinalReturnable() {
        return this.finalReturnable;
    }

    public boolean isFirstTimeCalled() {
        return this.isFirstTimeCalled;
    }

    public boolean isServicability() {
        return this.servicability;
    }

    public void setCodEligible(boolean bl2) {
        this.codEligible = bl2;
    }

    public void setFinalCodEligible(boolean bl2) {
        this.finalCodEligible = bl2;
    }

    public void setFinalExchangeable(boolean bl2) {
        this.finalExchangeable = bl2;
    }

    public void setFinalReturnWindow(int n3) {
        this.finalReturnWindow = n3;
    }

    public void setFinalReturnable(boolean bl2) {
        this.finalReturnable = bl2;
    }

    public void setFirstTimeCalled(boolean bl2) {
        this.isFirstTimeCalled = bl2;
    }

    public void setFraudEngineResponse(FraudEngineEddResponse fraudEngineEddResponse) {
        this.fraudEngineResponse = fraudEngineEddResponse;
    }

    public void setPinCode(String string2) {
        this.pinCode = string2;
    }

    public void setProductDetails(ArrayList arrayList) {
        this.productDetails = arrayList;
    }

    public void setReturnLayoutMessage(String string2) {
        this.returnLayoutMessage = string2;
    }

    public void setServicability(boolean bl2) {
        this.servicability = bl2;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

