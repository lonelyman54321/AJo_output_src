/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfoNew;
import java.util.Map;

public interface CcApi {
    public Object createCCTicket(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public Object createComplaintTicket(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public Object createComplaintTicketNew(String var1, String var2, String var3, String var4, String var5, CCComplaintAttachInfoNew var6, f80_0 var7);

    public Object getCCComplaintDetail(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public Object getCCComplaintList(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public Object getCCFaqSearch(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public Object getCCFaqs(String var1, String var2, String var3, String var4, String var5, f80_0 var6);

    public Object getCCItemDetailsQA(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public Object getCCSelectedEntryStatus(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public Object getCallMeBackInfo(String var1, String var2, String var3, String var4, String var5, f80_0 var6);

    public Object initiateChat(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public Object submitCallMeBackDetail(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);
}

