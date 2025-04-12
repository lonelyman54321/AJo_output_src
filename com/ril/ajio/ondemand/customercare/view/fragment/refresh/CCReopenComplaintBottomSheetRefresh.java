/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.fragment.refresh;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.view.fragment.refresh.CCReopenComplaintBottomSheetRefresh$Companion;
import com.ril.ajio.ondemand.customercare.view.fragment.refresh.CCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$1;
import com.ril.ajio.ondemand.customercare.view.fragment.refresh.CCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$2;
import com.ril.ajio.ondemand.customercare.view.fragment.refresh.CCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$3;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel;
import com.ril.ajio.services.data.CustomerCare.CCComplaintDetailInfo;
import com.ril.ajio.services.data.CustomerCare.CCTicketCreated;
import com.ril.ajio.services.query.CustomerCareQuery.CCTicketCreateQuery;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;

public final class CCReopenComplaintBottomSheetRefresh
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public static final CCReopenComplaintBottomSheetRefresh$Companion Companion;
    public static final String GTM_SCREEN_NAME = "CC_REOPEN_COMPLAINT";
    private ImageView cancelBtn;
    private final rq1_2 ccViewModel$delegate;
    private EditText comment;
    private TextView submit;

    static {
        CCReopenComplaintBottomSheetRefresh$Companion cCReopenComplaintBottomSheetRefresh$Companion;
        Companion = cCReopenComplaintBottomSheetRefresh$Companion = new CCReopenComplaintBottomSheetRefresh$Companion(null);
    }

    public CCReopenComplaintBottomSheetRefresh() {
        Object object = Reflection.getOrCreateKotlinClass(CCViewModel.class);
        CCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$1 cCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$1 = new CCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$1(this);
        CCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$2 cCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$2 = new CCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$2(null, this);
        CCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$3 cCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$3 = new CCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$3(this);
        this.ccViewModel$delegate = object = LW0.a(this, (yn1_2)object, cCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$1, cCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$2, cCReopenComplaintBottomSheetRefresh$special$$inlined$activityViewModels$default$3);
    }

    public static /* synthetic */ void Oa(BottomSheetDialog bottomSheetDialog, DialogInterface dialogInterface) {
        CCReopenComplaintBottomSheetRefresh.onCreateDialog$lambda$0(bottomSheetDialog, dialogInterface);
    }

    public static /* synthetic */ void Pa(CCReopenComplaintBottomSheetRefresh cCReopenComplaintBottomSheetRefresh, DataCallback dataCallback) {
        CCReopenComplaintBottomSheetRefresh.initObservables$lambda$1(cCReopenComplaintBottomSheetRefresh, dataCallback);
    }

    private final CCViewModel getCcViewModel() {
        return (CCViewModel)this.ccViewModel$delegate.getValue();
    }

    private final void initObservables() {
        LiveData liveData = this.getCcViewModel().getCreateCCTicketObservable();
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        ig_1 ig_12 = new ig_1(this);
        liveData.e(mu1_12, ig_12);
    }

    private static final void initObservables$lambda$1(CCReopenComplaintBottomSheetRefresh object, DataCallback object2) {
        Intent intent = null;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "this$0");
        cp_1.Companion.getClass();
        Object object3 = cp$a.e();
        object3.getClass();
        int n4 = cp_1.J((DataCallback)object2);
        if (n4 != 0) {
            Intrinsics.checkNotNull(object2);
            n4 = ((DataCallback)object2).getStatus();
            CharSequence charSequence = "format(...)";
            if (n4 == 0) {
                int n7;
                Object object4;
                object2 = (CCTicketCreated)((DataCallback)object2).getData();
                n4 = R$string.reopen_complaint_success;
                String string2 = null;
                if (object2 != null) {
                    object4 = ((CCTicketCreated)object2).getTicketId();
                } else {
                    n7 = 0;
                    object4 = null;
                }
                Object[] objectArray = new Object[n3];
                objectArray[0] = object4;
                object3 = hv3_0.L(n4, objectArray);
                object4 = StringCompanionObject.INSTANCE;
                n7 = R$string.acc_alert_message;
                object4 = hv3_0.K(n7);
                objectArray = new Object[n3];
                objectArray[0] = object3;
                intent = Arrays.copyOf(objectArray, n3);
                intent = String.format((String)object4, (Object[])intent);
                Intrinsics.checkNotNullExpressionValue(intent, (String)charSequence);
                mq0_2.c((String)object3, (String)intent);
                intent = super.getCcViewModel().getCcComplaintDetailInfo();
                if (intent != null && object2 != null) {
                    intent = AnalyticsManager.Companion.getInstance().getGa();
                    Object object5 = super.getCcViewModel().getCcComplaintDetailInfo();
                    if (object5 != null) {
                        object5 = ((CCComplaintDetailInfo)object5).getTicketId();
                    } else {
                        n3 = 0;
                        object5 = null;
                    }
                    object3 = ((CCTicketCreated)object2).getTicketId();
                    object4 = "Complaintcard_Reopen_submit_success_";
                    charSequence = new StringBuilder((String)object4);
                    ((StringBuilder)charSequence).append((String)object5);
                    ((StringBuilder)charSequence).append("_");
                    ((StringBuilder)charSequence).append((String)object3);
                    object5 = ((StringBuilder)charSequence).toString();
                    object3 = "Selfcare \u2013 Reopen submit success on complaint card details";
                    intent.trackBannerImpressionEvent((String)object3, (String)object5);
                }
                if ((intent = ((Fragment)object).getTargetFragment()) != null) {
                    intent = new Intent();
                    if (object2 != null) {
                        string2 = ((CCTicketCreated)object2).getOldIncidentNum();
                    }
                    intent.putExtra("INCIDENT_ID", string2);
                    object2 = ((Fragment)object).getTargetFragment();
                    if (object2 != null) {
                        n3 = ((Fragment)object).getTargetRequestCode();
                        n4 = -1;
                        ((Fragment)object2).onActivityResult(n3, n4, intent);
                    }
                }
                ((BottomSheetDialogFragment)object).dismiss();
            } else {
                int n8 = ((DataCallback)object2).getStatus();
                if (n8 == n3) {
                    int n10;
                    object = ((DataCallback)object2).getError();
                    if (object != null && (object2 = ((DataError)object).getErrors()) != null && (n10 = (object2 = ((DataError)object).getErrors()).isEmpty()) == 0) {
                        object2 = yn3_0.a;
                        object = ((DataError$ErrorMessage)((DataError)object).errors.get(0)).getMessage();
                        object3 = new Object[]{};
                        ((yn3$a)object2).a((String)object, object3);
                    }
                    object = StringCompanionObject.INSTANCE;
                    n8 = R$string.acc_error_message_page_load_fail;
                    object = hv3_0.K(n8);
                    object2 = hv3_0.K(R$string.something_wrong_msg);
                    object3 = new Object[n3];
                    object3[0] = object2;
                    object2 = Arrays.copyOf(object3, n3);
                    object = String.format((String)object, (Object[])object2);
                    Intrinsics.checkNotNullExpressionValue(object, (String)charSequence);
                    n10 = R$string.something_wrong_msg;
                    object2 = hv3_0.K(n10);
                    mq0_2.c((String)object2, (String)object);
                }
            }
        }
    }

    private static final void onCreateDialog$lambda$0(BottomSheetDialog bottomSheetDialog, DialogInterface object) {
        object = "$dialog";
        Intrinsics.checkNotNullParameter(bottomSheetDialog, (String)object);
        int n3 = com.google.android.material.R$id.design_bottom_sheet;
        bottomSheetDialog = bottomSheetDialog.findViewById(n3);
        if (bottomSheetDialog != null) {
            n3 = 0;
            object = null;
            bottomSheetDialog.setBackgroundColor(0);
        }
    }

    private final void submitRequest() {
        Object object = this.getCcViewModel().getCcComplaintDetailInfo();
        if (object != null) {
            boolean bl2;
            object = this.getCcViewModel().getCcComplaintDetailInfo();
            Intrinsics.checkNotNull(object);
            Object object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Object object3 = ((CCComplaintDetailInfo)object).getTicketId();
            String string2 = ((CCComplaintDetailInfo)object).getOrderCode();
            String string3 = ((CCComplaintDetailInfo)object).getIncidentStatus();
            Object object4 = new StringBuilder("Complaintcard_Reopen_submit_");
            ((StringBuilder)object4).append((String)object3);
            object3 = "_";
            ((StringBuilder)object4).append((String)object3);
            ((StringBuilder)object4).append(string2);
            ((StringBuilder)object4).append((String)object3);
            ((StringBuilder)object4).append(string3);
            object3 = ((StringBuilder)object4).toString();
            string3 = "Selfcare \u2013 Reopen submit on complaint card details";
            ((GTMEvents)object2).pushButtonTapEvent(string3, object3, GTM_SCREEN_NAME);
            int n3 = 8191;
            object4 = object2;
            object2 = new CCTicketCreateQuery(null, null, null, null, null, null, null, null, null, null, null, false, null, n3, null);
            object3 = this;
            string2 = this.comment;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("comment");
                bl2 = false;
                string2 = null;
            }
            string2 = string2.getText().toString();
            ((CCTicketCreateQuery)object2).setComments(string2);
            string2 = ((CCComplaintDetailInfo)object).getOrderCode();
            ((CCTicketCreateQuery)object2).setOrderCode(string2);
            string2 = ((CCComplaintDetailInfo)object).getCategory();
            ((CCTicketCreateQuery)object2).setCategory(string2);
            string2 = ((CCComplaintDetailInfo)object).getSubCategory();
            ((CCTicketCreateQuery)object2).setSubCategory(string2);
            string2 = ((CCComplaintDetailInfo)object).getLeafCategory();
            ((CCTicketCreateQuery)object2).setLeafCategory(string2);
            string2 = ((CCComplaintDetailInfo)object).getProductCodeForReopenedInc();
            ((CCTicketCreateQuery)object2).setDescription(string2);
            string2 = ((CCComplaintDetailInfo)object).getNoOfDays();
            ((CCTicketCreateQuery)object2).setNoOfDays(string2);
            string2 = ((CCComplaintDetailInfo)object).getAgentGroup();
            ((CCTicketCreateQuery)object2).setWorkgroup(string2);
            bl2 = true;
            ((CCTicketCreateQuery)object2).setIncidentToReopen(bl2);
            object = ((CCComplaintDetailInfo)object).getIncidentId();
            ((CCTicketCreateQuery)object2).setCurrentIncidentNum((String)object);
            object = this.getCcViewModel();
            ((CCViewModel)object).createTicket((CCTicketCreateQuery)object2);
        } else {
            CCReopenComplaintBottomSheetRefresh cCReopenComplaintBottomSheetRefresh = this;
        }
    }

    public void onClick(View object) {
        int n3;
        int n4;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.submit_btn;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            this.submitRequest();
        } else {
            n7 = R$id.cancelBtn;
            if (object != null && (n4 = ((Integer)object).intValue()) == n7) {
                this.dismiss();
            }
        }
    }

    public Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        hg_1 hg_12 = new hg_1((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)hg_12);
        return object;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.dialog_cc_reopen_complaint_refresh;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public void onViewCreated(View object, Bundle bundle) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onViewCreated((View)object, bundle);
        int n3 = R$id.submit_btn;
        bundle = (TextView)object.findViewById(n3);
        this.submit = bundle;
        n3 = R$id.comment;
        bundle = (EditText)object.findViewById(n3);
        this.comment = bundle;
        n3 = R$id.cancelBtn;
        object = (ImageView)object.findViewById(n3);
        this.cancelBtn = object;
        object = this.submit;
        n3 = 0;
        bundle = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("submit");
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.cancelBtn;
        if (object == null) {
            object = "cancelBtn";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            bundle = object;
        }
        bundle.setOnClickListener((View.OnClickListener)this);
        this.initObservables();
    }
}

