/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CustomerCare;

import com.ril.ajio.services.data.CustomerCare.CCHelpInterface;
import java.io.Serializable;
import java.util.List;

public class CCComplaintInfoHelper
implements Serializable,
CCHelpInterface {
    private List incidentDetail;

    public List getIncidentDetail() {
        return this.incidentDetail;
    }

    public void setIncidentDetail(List list) {
        this.incidentDetail = list;
    }
}

