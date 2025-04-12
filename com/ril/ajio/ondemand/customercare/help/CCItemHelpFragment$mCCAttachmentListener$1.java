/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ondemand.customercare.help;

import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.ondemand.customercare.help.CCItemHelpFragment;
import com.ril.ajio.ondemand.customercare.view.adapter.CCBaseAdapter;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentListener;
import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfo;
import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfoNew;
import com.ril.ajio.services.data.CustomerCare.CCComplaintDetailInfo;
import com.ril.ajio.services.data.CustomerCare.CCItemMultiFileAttachModel;
import com.ril.ajio.services.data.CustomerCare.ImageData;
import com.ril.ajio.services.query.CustomerCareQuery.CCTicketCreateQuery;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class CCItemHelpFragment$mCCAttachmentListener$1
implements CCAttachmentListener {
    final /* synthetic */ CCItemHelpFragment this$0;

    public CCItemHelpFragment$mCCAttachmentListener$1(CCItemHelpFragment cCItemHelpFragment) {
        this.this$0 = cCItemHelpFragment;
    }

    public static /* synthetic */ void a(CCItemHelpFragment cCItemHelpFragment) {
        CCItemHelpFragment$mCCAttachmentListener$1.onFocusChange$lambda$0(cCItemHelpFragment);
    }

    private static final void onFocusChange$lambda$0(CCItemHelpFragment object) {
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean n3 = ((CCItemHelpFragment)object).isExpandable();
        if (n3) {
            object2 = ((CCItemHelpFragment)object).getMCCItemHelpAdapter();
            if (object2 != null && (object2 = ((CCItemHelpFragment)object).getMRecyclerView()) != null) {
                object = ((CCItemHelpFragment)object).getMCCItemHelpAdapter();
                Intrinsics.checkNotNull(object);
                int n8 = ((CCBaseAdapter)object).getItemCount() + -1;
                ((RecyclerView)object2).smoothScrollToPosition(n8);
            }
        } else {
            int n4;
            int n7 = ((CCItemHelpFragment)object).getMHelpBtnIndex();
            if (n7 > (n4 = -1) && (object2 = ((CCItemHelpFragment)object).getMRecyclerView()) != null) {
                int n8 = ((CCItemHelpFragment)object).getMHelpBtnIndex();
                ((RecyclerView)object2).smoothScrollToPosition(n8);
            }
        }
    }

    public void addMoreImageClick() {
        int n3;
        Object object = this.this$0.getAttachModel();
        int n4 = 0;
        if (object != null && (object = ((CCItemMultiFileAttachModel)object).getAttacheInfo()) != null && (object = ((CCComplaintAttachInfoNew)object).getImageData()) != null) {
            n3 = ((ArrayList)object).size();
        } else {
            n3 = 0;
            object = null;
        }
        CCItemMultiFileAttachModel cCItemMultiFileAttachModel = this.this$0.getAttachModel();
        if (cCItemMultiFileAttachModel != null) {
            n4 = cCItemMultiFileAttachModel.getMaxImagesAllowed();
        }
        if (n3 < n4 && (object = this.this$0.getAttachModel()) != null && (object = ((CCItemMultiFileAttachModel)object).getAttacheInfo()) != null && (object = ((CCComplaintAttachInfoNew)object).getImageData()) != null) {
            int n7 = 31;
            cCItemMultiFileAttachModel = null;
            ImageData imageData = new ImageData(null, null, null, null, null, n7, null);
            ((ArrayList)object).add(imageData);
        }
        CCItemHelpFragment.access$notifyAttachmentViewMultiFile(this.this$0);
    }

    public void onFocusChange() {
        RecyclerView recyclerView = this.this$0.getMRecyclerView();
        Intrinsics.checkNotNull(recyclerView);
        CCItemHelpFragment cCItemHelpFragment = this.this$0;
        yg_2 yg_22 = new yg_2(cCItemHelpFragment);
        recyclerView.postDelayed(yg_22, 100);
    }

    public void onTextChange(String string2) {
        Object object = this.this$0;
        boolean bl2 = ((CCItemHelpFragment)object).isExpandable();
        if (bl2) {
            object = this.this$0.getMCCComplaintAttachInfo();
            if (object != null) {
                ((CCComplaintAttachInfo)object).setComments(string2);
            }
        } else {
            object = this.this$0.getMCCTicketCreateQuery();
            if (object != null) {
                ((CCTicketCreateQuery)object).setComments(string2);
            }
        }
    }

    public void sendEnterMoreDetailsGAEvent() {
        NewCustomEventsRevamp newCustomEventsRevamp = CCItemHelpFragment.access$getNewCustomEventsRevamp$p(this.this$0);
        String string2 = CCItemHelpFragment.access$getNewEEcommerceEventsRevamp$p(this.this$0).getPrevScreen();
        String string3 = CCItemHelpFragment.access$getNewEEcommerceEventsRevamp$p(this.this$0).getPrevScreenType();
        String string4 = CCItemHelpFragment.access$getEventLabel(this.this$0);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "complaint card screen interactions", "enter more details", string4, "complaint_card_screen_interactions", "complaint card screen", null, string2, null, string3, false, null, 1696, null);
    }

    public void sendTellUsMoreGAEvent() {
        Object object = this.this$0.getMCCComplaintDetailInfo();
        if (object != null) {
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Object object2 = this.this$0.getMCCComplaintDetailInfo();
            Intrinsics.checkNotNull(object2);
            object2 = ((CCComplaintDetailInfo)object2).getTicketId();
            Object object3 = this.this$0.getMCCComplaintDetailInfo();
            Intrinsics.checkNotNull(object3);
            object3 = ((CCComplaintDetailInfo)object3).getOrderCode();
            Object object4 = this.this$0.getMCCComplaintDetailInfo();
            Intrinsics.checkNotNull(object4);
            object4 = ((CCComplaintDetailInfo)object4).getIncidentStatus();
            Object object5 = this.this$0.getMCCComplaintDetailInfo();
            Intrinsics.checkNotNull(object5);
            long l2 = ((CCComplaintDetailInfo)object5).getResolutionBy();
            object5 = k7.f(l2, "yyyy-MM-dd");
            String string2 = "Complaintcard_tellmore_Clicked_";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append((String)object2);
            object2 = "_";
            stringBuilder.append((String)object2);
            stringBuilder.append((String)object3);
            stringBuilder.append((String)object2);
            stringBuilder.append((String)object4);
            stringBuilder.append((String)object2);
            stringBuilder.append((String)object5);
            object2 = stringBuilder.toString();
            object3 = "complaint detail page";
            object4 = "Selfcare - Tellus more complaint card details tap";
            ((GTMEvents)object).pushButtonTapEvent((String)object4, object2, (String)object3);
        }
    }
}

