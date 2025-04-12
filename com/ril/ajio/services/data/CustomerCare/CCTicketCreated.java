/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CustomerCare;

import com.ril.ajio.services.data.CustomerCare.CCHelpInterface;

public class CCTicketCreated
implements CCHelpInterface {
    private String date;
    private boolean isDuplicateTickets;
    private String oldIncidentNum;
    private String status;
    private String ticketId;

    public String getDate() {
        return this.date;
    }

    public String getOldIncidentNum() {
        return this.oldIncidentNum;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public boolean isDuplicateTickets() {
        return this.isDuplicateTickets;
    }
}

