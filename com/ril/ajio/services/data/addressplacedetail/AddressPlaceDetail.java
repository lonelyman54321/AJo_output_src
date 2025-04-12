/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.addressplacedetail;

import com.ril.ajio.services.data.addressplacedetail.Result;
import java.util.ArrayList;

public class AddressPlaceDetail {
    private ArrayList htmlAttributions;
    private Result result;
    private String status;

    public ArrayList getHtmlAttributions() {
        return this.htmlAttributions;
    }

    public Result getResult() {
        return this.result;
    }

    public String getStatus() {
        return this.status;
    }

    public void setHtmlAttributions(ArrayList arrayList) {
        this.htmlAttributions = arrayList;
    }

    public void setResult(Result result2) {
        this.result = result2;
    }

    public void setStatus(String string2) {
        this.status = string2;
    }
}

