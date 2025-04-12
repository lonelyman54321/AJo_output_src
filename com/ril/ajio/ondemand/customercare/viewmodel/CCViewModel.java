/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
package com.ril.ajio.ondemand.customercare.viewmodel;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.CcApiRepo;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$createComplaintTicket$1;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$createComplaintTicketNew$1;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$createTicket$1;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$getCCComplaintDetail$1;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$getCCComplaintList$1;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$getCCFaqSearch$1;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$getCCFaqs$1;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$getCallMeBackInfo$1;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$getQALinks$1;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$getSelectedEntryStatus$1;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$initiateChat$1;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$submitCallMeBackDetail$1;
import com.ril.ajio.services.data.CustomerCare.AverageWaitTime;
import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfo;
import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfoNew;
import com.ril.ajio.services.data.CustomerCare.CCComplaintDetailInfo;
import com.ril.ajio.services.data.CustomerCare.CallMeBackInfo;
import com.ril.ajio.services.data.CustomerCare.TimeSlots;
import com.ril.ajio.services.query.CustomerCareQuery.CCTicketCreateQuery;
import com.ril.ajio.services.query.QuerySubmitCallMeBack;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class CCViewModel
extends Hj {
    private final zr1_1 _ccComplaintNewAttachInfoMLD;
    private final LiveData cCComplaintNewAttachInfoObservable;
    private CallMeBackInfo callMeBackInfo;
    private HashMap callMeLangEstWaitTimeMap;
    private int callMeNowPos;
    private String callMeSelectedLang;
    private TimeSlots callMeSelectedTimeSlot;
    private final CcApiRepo ccApiRepo;
    private final zr1_1 ccCallMeBackInfoMLD;
    private final zr1_1 ccCartEntryStatusMLD;
    private final LiveData ccCartEntryStatusObservable;
    private final zr1_1 ccComplaintAttachInfoMLD;
    private CCComplaintDetailInfo ccComplaintDetailInfo;
    private final zr1_1 ccComplaintDetailMLD;
    private final zr1_1 ccComplaintListMLD;
    private final zr1_1 ccFaqSearchMLD;
    private final zr1_1 ccFaqsMLD;
    private final zr1_1 ccInitiateChatMLD;
    private final zr1_1 ccItemDetailsQAMLD;
    private final LiveData ccItemDetailsQAObservable;
    private final zr1_1 ccSubmitCallMeBackMLD;
    private final zr1_1 createCCTicketMLD;

    public CCViewModel(Application object) {
        CcApiRepo ccApiRepo;
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        this.callMeSelectedLang = "";
        this.callMeNowPos = -1;
        this.ccApiRepo = ccApiRepo = new CcApiRepo((Context)object);
        super();
        this.ccCartEntryStatusMLD = object;
        this.ccCartEntryStatusObservable = object;
        super();
        this.ccItemDetailsQAMLD = object;
        this.ccItemDetailsQAObservable = object;
        super();
        this.createCCTicketMLD = object;
        super();
        this.ccFaqsMLD = object;
        super();
        this.ccFaqSearchMLD = object;
        super();
        this.ccComplaintListMLD = object;
        super();
        this.ccComplaintDetailMLD = object;
        super();
        this.ccComplaintAttachInfoMLD = object;
        super();
        this._ccComplaintNewAttachInfoMLD = object;
        this.cCComplaintNewAttachInfoObservable = object;
        super();
        this.ccCallMeBackInfoMLD = object;
        super();
        this.ccSubmitCallMeBackMLD = object;
        super();
        this.ccInitiateChatMLD = object;
    }

    public static final /* synthetic */ CcApiRepo access$getCcApiRepo$p(CCViewModel cCViewModel) {
        return cCViewModel.ccApiRepo;
    }

    public static final /* synthetic */ zr1_1 access$getCcCallMeBackInfoMLD$p(CCViewModel cCViewModel) {
        return cCViewModel.ccCallMeBackInfoMLD;
    }

    public static final /* synthetic */ zr1_1 access$getCcCartEntryStatusMLD$p(CCViewModel cCViewModel) {
        return cCViewModel.ccCartEntryStatusMLD;
    }

    public static final /* synthetic */ zr1_1 access$getCcComplaintAttachInfoMLD$p(CCViewModel cCViewModel) {
        return cCViewModel.ccComplaintAttachInfoMLD;
    }

    public static final /* synthetic */ zr1_1 access$getCcComplaintDetailMLD$p(CCViewModel cCViewModel) {
        return cCViewModel.ccComplaintDetailMLD;
    }

    public static final /* synthetic */ zr1_1 access$getCcComplaintListMLD$p(CCViewModel cCViewModel) {
        return cCViewModel.ccComplaintListMLD;
    }

    public static final /* synthetic */ zr1_1 access$getCcFaqSearchMLD$p(CCViewModel cCViewModel) {
        return cCViewModel.ccFaqSearchMLD;
    }

    public static final /* synthetic */ zr1_1 access$getCcFaqsMLD$p(CCViewModel cCViewModel) {
        return cCViewModel.ccFaqsMLD;
    }

    public static final /* synthetic */ zr1_1 access$getCcInitiateChatMLD$p(CCViewModel cCViewModel) {
        return cCViewModel.ccInitiateChatMLD;
    }

    public static final /* synthetic */ zr1_1 access$getCcItemDetailsQAMLD$p(CCViewModel cCViewModel) {
        return cCViewModel.ccItemDetailsQAMLD;
    }

    public static final /* synthetic */ zr1_1 access$getCcSubmitCallMeBackMLD$p(CCViewModel cCViewModel) {
        return cCViewModel.ccSubmitCallMeBackMLD;
    }

    public static final /* synthetic */ zr1_1 access$getCreateCCTicketMLD$p(CCViewModel cCViewModel) {
        return cCViewModel.createCCTicketMLD;
    }

    public static final /* synthetic */ zr1_1 access$get_ccComplaintNewAttachInfoMLD$p(CCViewModel cCViewModel) {
        return cCViewModel._ccComplaintNewAttachInfoMLD;
    }

    public final void createComplaintTicket(CCComplaintAttachInfo cCComplaintAttachInfo) {
        Intrinsics.checkNotNullParameter(cCComplaintAttachInfo, "query");
        aW aW2 = md3_0.c(this);
        CCViewModel$createComplaintTicket$1 cCViewModel$createComplaintTicket$1 = new CCViewModel$createComplaintTicket$1(this, cCComplaintAttachInfo, null);
        Ae3.d(aW2, null, null, cCViewModel$createComplaintTicket$1, 3);
    }

    public final void createComplaintTicketNew(CCComplaintAttachInfoNew cCComplaintAttachInfoNew) {
        Intrinsics.checkNotNullParameter(cCComplaintAttachInfoNew, "attachInfo");
        aW aW2 = md3_0.c(this);
        CCViewModel$createComplaintTicketNew$1 cCViewModel$createComplaintTicketNew$1 = new CCViewModel$createComplaintTicketNew$1(cCComplaintAttachInfoNew, this, null);
        Ae3.d(aW2, null, null, cCViewModel$createComplaintTicketNew$1, 3);
    }

    public final void createTicket(CCTicketCreateQuery cCTicketCreateQuery) {
        Intrinsics.checkNotNullParameter(cCTicketCreateQuery, "query");
        aW aW2 = md3_0.c(this);
        CCViewModel$createTicket$1 cCViewModel$createTicket$1 = new CCViewModel$createTicket$1(this, cCTicketCreateQuery, null);
        Ae3.d(aW2, null, null, cCViewModel$createTicket$1, 3);
    }

    public final LiveData getCCComplaintAttachInfoObservable() {
        return this.ccComplaintAttachInfoMLD;
    }

    public final void getCCComplaintDetail(String string2) {
        Intrinsics.checkNotNullParameter(string2, "incidentID");
        aW aW2 = md3_0.c(this);
        CCViewModel$getCCComplaintDetail$1 cCViewModel$getCCComplaintDetail$1 = new CCViewModel$getCCComplaintDetail$1(this, string2, null);
        Ae3.d(aW2, null, null, cCViewModel$getCCComplaintDetail$1, 3);
    }

    public final LiveData getCCComplaintDetailObservable() {
        return this.ccComplaintDetailMLD;
    }

    public final void getCCComplaintList() {
        aW aW2 = md3_0.c(this);
        CCViewModel$getCCComplaintList$1 cCViewModel$getCCComplaintList$1 = new CCViewModel$getCCComplaintList$1(this, null);
        Ae3.d(aW2, null, null, cCViewModel$getCCComplaintList$1, 3);
    }

    public final LiveData getCCComplaintListObservable() {
        return this.ccComplaintListMLD;
    }

    public final LiveData getCCComplaintNewAttachInfoObservable() {
        return this.cCComplaintNewAttachInfoObservable;
    }

    public final void getCCFaqSearch(String string2) {
        Intrinsics.checkNotNullParameter(string2, "faqSearchText");
        aW aW2 = md3_0.c(this);
        CCViewModel$getCCFaqSearch$1 cCViewModel$getCCFaqSearch$1 = new CCViewModel$getCCFaqSearch$1(this, string2, null);
        Ae3.d(aW2, null, null, cCViewModel$getCCFaqSearch$1, 3);
    }

    public final void getCCFaqs() {
        aW aW2 = md3_0.c(this);
        CCViewModel$getCCFaqs$1 cCViewModel$getCCFaqs$1 = new CCViewModel$getCCFaqs$1(this, null);
        Ae3.d(aW2, null, null, cCViewModel$getCCFaqs$1, 3);
    }

    public final CallMeBackInfo getCallMeBackInfo() {
        return this.callMeBackInfo;
    }

    public final void getCallMeBackInfo() {
        aW aW2 = md3_0.c(this);
        CCViewModel$getCallMeBackInfo$1 cCViewModel$getCallMeBackInfo$1 = new CCViewModel$getCallMeBackInfo$1(this, null);
        Ae3.d(aW2, null, null, cCViewModel$getCallMeBackInfo$1, 3);
    }

    public final HashMap getCallMeLangEstWaitTimeMap() {
        return this.callMeLangEstWaitTimeMap;
    }

    public final int getCallMeNowPos() {
        return this.callMeNowPos;
    }

    public final String getCallMeSelectedLang() {
        return this.callMeSelectedLang;
    }

    public final TimeSlots getCallMeSelectedTimeSlot() {
        return this.callMeSelectedTimeSlot;
    }

    public final LiveData getCcCallMeBackInfoObservable() {
        return this.ccCallMeBackInfoMLD;
    }

    public final LiveData getCcCartEntryStatusObservable() {
        return this.ccCartEntryStatusObservable;
    }

    public final CCComplaintDetailInfo getCcComplaintDetailInfo() {
        return this.ccComplaintDetailInfo;
    }

    public final LiveData getCcFaqSearchObservable() {
        return this.ccFaqSearchMLD;
    }

    public final LiveData getCcFaqsObservable() {
        return this.ccFaqsMLD;
    }

    public final LiveData getCcInitiateChatObservable() {
        return this.ccInitiateChatMLD;
    }

    public final LiveData getCcItemDetailsQAObservable() {
        return this.ccItemDetailsQAObservable;
    }

    public final LiveData getCcSubmitCallMeBackObservable() {
        return this.ccSubmitCallMeBackMLD;
    }

    public final LiveData getCreateCCTicketObservable() {
        return this.createCCTicketMLD;
    }

    public final void getQALinks(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "orderCode");
        Intrinsics.checkNotNullParameter(string3, "entryNumber");
        Intrinsics.checkNotNullParameter(string4, "itemStatus");
        aW aW2 = md3_0.c(this);
        CCViewModel$getQALinks$1 cCViewModel$getQALinks$1 = new CCViewModel$getQALinks$1(this, string2, string3, string4, null);
        Ae3.d(aW2, null, null, cCViewModel$getQALinks$1, 3);
    }

    public final void getSelectedEntryStatus(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "orderCode");
        Intrinsics.checkNotNullParameter(string3, "entryNumber");
        aW aW2 = md3_0.c(this);
        CCViewModel$getSelectedEntryStatus$1 cCViewModel$getSelectedEntryStatus$1 = new CCViewModel$getSelectedEntryStatus$1(this, string2, string3, null);
        Ae3.d(aW2, null, null, cCViewModel$getSelectedEntryStatus$1, 3);
    }

    public final void initiateChat() {
        aW aW2 = md3_0.c(this);
        CCViewModel$initiateChat$1 cCViewModel$initiateChat$1 = new CCViewModel$initiateChat$1(this, null);
        Ae3.d(aW2, null, null, cCViewModel$initiateChat$1, 3);
    }

    public final void processResponse(CallMeBackInfo object, boolean bl2) {
        boolean bl3;
        Object object2;
        this.callMeBackInfo = object;
        Object object3 = this.callMeLangEstWaitTimeMap;
        if (object3 == null) {
            object3 = new HashMap();
            this.callMeLangEstWaitTimeMap = object3;
        } else if (object3 != null) {
            ((HashMap)object3).clear();
        }
        boolean bl4 = false;
        object3 = null;
        if (object != null) {
            object2 = ((CallMeBackInfo)((Object)object)).getLanguages();
        } else {
            bl3 = false;
            object2 = null;
        }
        int n3 = 0;
        if (object2 != null && !(bl3 = object2.isEmpty())) {
            Intrinsics.checkNotNull(object);
            this.callMeSelectedLang = object2 = (String)((CallMeBackInfo)((Object)object)).getLanguages().get(0);
        }
        if (object != null) {
            object2 = ((CallMeBackInfo)((Object)object)).getAverageWaitTime();
        } else {
            bl3 = false;
            object2 = null;
        }
        String string2 = "iterator(...)";
        if (object2 != null && !(bl3 = object2.isEmpty())) {
            int n4;
            Intrinsics.checkNotNull(object);
            object2 = ((CallMeBackInfo)((Object)object)).getAverageWaitTime().iterator();
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            while ((n4 = object2.hasNext()) != 0) {
                Object object4 = (AverageWaitTime)object2.next();
                String string3 = ((AverageWaitTime)object4).getLanguage();
                Object object5 = ((AverageWaitTime)object4).getWaitTimeInMin();
                n4 = ((AverageWaitTime)object4).getLuxury();
                if (bl2 != n4 || string3 == null || (n4 = string3.length()) == 0 || object5 == null || (object4 = this.callMeLangEstWaitTimeMap) == null) continue;
                Object object6 = Locale.ROOT;
                String string4 = "ROOT";
                Intrinsics.checkNotNullExpressionValue(object6, string4);
                string3 = string3.toLowerCase((Locale)object6);
                object6 = "toLowerCase(...)";
                Intrinsics.checkNotNullExpressionValue(string3, (String)object6);
                object5 = ((Integer)object5).toString();
                object4 = (String)((HashMap)object4).put(string3, object5);
            }
        }
        if (object != null) {
            object3 = ((CallMeBackInfo)((Object)object)).getTimeSlots();
        }
        if (object3 != null && !(bl2 = object3.isEmpty())) {
            Intrinsics.checkNotNull(object);
            object = ((CallMeBackInfo)((Object)object)).getTimeSlots().iterator();
            Intrinsics.checkNotNullExpressionValue(object, string2);
            while (bl2 = object.hasNext()) {
                boolean bl5;
                Object object7 = (TimeSlots)object.next();
                object3 = ((TimeSlots)object7).getSlotDay();
                bl4 = b.i((String)object3, (String)(object2 = "TODAY"), bl5 = true);
                if (bl4 && (bl2 = b.i((String)(object7 = ((TimeSlots)object7).getSlotTime()), (String)(object3 = "NOW"), bl5))) {
                    this.callMeNowPos = n3;
                    break;
                }
                ++n3;
            }
        }
    }

    public final void setCallMeBackInfo(CallMeBackInfo callMeBackInfo) {
        this.callMeBackInfo = callMeBackInfo;
    }

    public final void setCallMeLangEstWaitTimeMap(HashMap hashMap) {
        this.callMeLangEstWaitTimeMap = hashMap;
    }

    public final void setCallMeNowPos(int n3) {
        this.callMeNowPos = n3;
    }

    public final void setCallMeSelectedLang(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.callMeSelectedLang = string2;
    }

    public final void setCallMeSelectedTimeSlot(TimeSlots timeSlots) {
        this.callMeSelectedTimeSlot = timeSlots;
    }

    public final void setCcComplaintDetailInfo(CCComplaintDetailInfo cCComplaintDetailInfo) {
        this.ccComplaintDetailInfo = cCComplaintDetailInfo;
    }

    public final void submitCallMeBackDetail(QuerySubmitCallMeBack querySubmitCallMeBack) {
        Intrinsics.checkNotNullParameter(querySubmitCallMeBack, "querySubmitCallMeBack");
        aW aW2 = md3_0.c(this);
        CCViewModel$submitCallMeBackDetail$1 cCViewModel$submitCallMeBackDetail$1 = new CCViewModel$submitCallMeBackDetail$1(this, querySubmitCallMeBack, null);
        Ae3.d(aW2, null, null, cCViewModel$submitCallMeBackDetail$1, 3);
    }
}

