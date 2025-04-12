/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.query;

import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.PaymentChannelInformation;
import com.ril.ajio.services.data.Payment.Tenant;
import java.util.ArrayList;

public final class FetchWalletsRequest {
    private String accessToken;
    private Customer customer;
    private ArrayList internalWallets;
    private Order order;
    private PaymentChannelInformation paymentChannelInformation;
    private String paymentInstrumentWalletChecksum;
    private String requestChecksum;
    private Tenant tenant;
    private String transactionToken;

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Customer getCustomer() {
        return this.customer;
    }

    public final ArrayList getInternalWallets() {
        return this.internalWallets;
    }

    public final Order getOrder() {
        return this.order;
    }

    public final PaymentChannelInformation getPaymentChannelInformation() {
        return this.paymentChannelInformation;
    }

    public final String getPaymentInstrumentWalletChecksum() {
        return this.paymentInstrumentWalletChecksum;
    }

    public final String getRequestChecksum() {
        return this.requestChecksum;
    }

    public final Tenant getTenant() {
        return this.tenant;
    }

    public final String getTransactionToken() {
        return this.transactionToken;
    }

    public final void setAccessToken(String string2) {
        this.accessToken = string2;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final void setInternalWallets(ArrayList arrayList) {
        this.internalWallets = arrayList;
    }

    public final void setOrder(Order order) {
        this.order = order;
    }

    public final void setPaymentChannelInformation(PaymentChannelInformation paymentChannelInformation) {
        this.paymentChannelInformation = paymentChannelInformation;
    }

    public final void setPaymentInstrumentWalletChecksum(String string2) {
        this.paymentInstrumentWalletChecksum = string2;
    }

    public final void setRequestChecksum(String string2) {
        this.requestChecksum = string2;
    }

    public final void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public final void setTransactionToken(String string2) {
        this.transactionToken = string2;
    }
}

