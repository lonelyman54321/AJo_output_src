/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.ondemand.customercare.help;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.help.CCItemHelpAdapter;
import com.ril.ajio.ondemand.customercare.help.CCItemHelpFragment$Companion;
import com.ril.ajio.ondemand.customercare.help.CCItemHelpFragment$mCCAttachmentListener$1;
import com.ril.ajio.ondemand.customercare.help.CCItemHelpFragment$sam$androidx_lifecycle_Observer$0;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.ondemand.customercare.view.dialog.CCContactUsDialog;
import com.ril.ajio.ondemand.customercare.view.fragment.CCBaseFragment;
import com.ril.ajio.ondemand.customercare.view.fragment.refresh.CCAttachBottomSheetRefresh;
import com.ril.ajio.ondemand.customercare.view.fragment.refresh.CCReopenComplaintBottomSheetRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentListener;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel;
import com.ril.ajio.services.data.CustomerCare.ActionData;
import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfo;
import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfoNew;
import com.ril.ajio.services.data.CustomerCare.CCComplaintDetailInfo;
import com.ril.ajio.services.data.CustomerCare.CCHelpInterface;
import com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel$CCItemQALists;
import com.ril.ajio.services.data.CustomerCare.CCItemMultiFileAttachModel;
import com.ril.ajio.services.data.CustomerCare.CCTicketCreated;
import com.ril.ajio.services.data.CustomerCare.ImageData;
import com.ril.ajio.services.query.CustomerCareQuery.CCTicketCreateQuery;
import com.ril.ajio.utility.image.CCClearCachedImageWorker;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

public final class CCItemHelpFragment
extends CCBaseFragment
implements i82_0,
OnNavigationClickListener {
    public static final int CAMERA_CLICK = 202;
    public static final String CLICK_TYPE = "CLICK_TYPE";
    public static final CCItemHelpFragment$Companion Companion;
    public static final int FILE_CLICK = 201;
    public static final int IMAGE_CAPTURE_CODE = 102;
    public static final String INCIDENT_ID = "INCIDENT_ID";
    public static final int MAX_FILE_SIZE = 1;
    public static final String MIME_TYPE_IMG_JPG = "image/jpeg";
    public static final String MIME_TYPE_IMG_PNG = "image/png";
    public static final String MIME_TYPE_PDF = "application/pdf";
    public static final int READ_REQUEST_CODE = 101;
    public static final int REQUEST_CAMERA_PERMISSION = 201;
    public static final String TAG = "CCItemHelpFragment";
    public static final int TYPE_DIALOG_ATTACH = 1001;
    public static final int TYPE_DIALOG_REOPEN_TICKET = 1002;
    private CCItemMultiFileAttachModel attachModel;
    private HashMap bundledatalist;
    private xf_1 cCBundleViewModel;
    private final wq_0 ccCustomEvent;
    private t30_0 compositeDisposable;
    private CustomToolbarViewMerger customToolbarViewMerger;
    private Dialog imageDialog;
    private boolean isExpandable;
    private boolean isLuxeOrder;
    private int mAttachmentIndex;
    private final CCAttachmentListener mCCAttachmentListener;
    private CCComplaintAttachInfo mCCComplaintAttachInfo;
    private CCComplaintDetailInfo mCCComplaintDetailInfo;
    private CCItemHelpAdapter mCCItemHelpAdapter;
    private CCTicketCreateQuery mCCTicketCreateQuery;
    private CCViewModel mCCViewModel;
    private int mHelpBtnIndex;
    private Uri mImageCaptureUri;
    private String mIncidentId;
    private OnFragmentInteractionListener mListener;
    private String mOrderId;
    private String mOrderStatus;
    private String mProductCode;
    private RecyclerView mRecyclerView;
    private ty2_2 mSelfCareFileHelper;
    private ArrayList mViewDataList;
    private final NewCustomEventsRevamp newCustomEventsRevamp;
    private final NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
    private final F62 observerCreateTicket;
    private final o60_0 onErrorImageProcess;
    private final o60_0 onSuccessImageProcess;
    private final String previousScreen;
    private final String previousScreenType;
    private CCItemDetailsQAModel$CCItemQALists qaItem;
    private String title;
    private li3_1 workManager;

    static {
        CCItemHelpFragment$Companion cCItemHelpFragment$Companion;
        Companion = cCItemHelpFragment$Companion = new CCItemHelpFragment$Companion(null);
    }

    public CCItemHelpFragment() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = AnalyticsManager.Companion;
        this.newEEcommerceEventsRevamp = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.newCustomEventsRevamp = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.previousScreen = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.previousScreenType = object = newEEcommerceEventsRevamp.getPrevScreenType();
        this.title = "Help For Issue";
        object = new HashMap();
        this.bundledatalist = object;
        this.ccCustomEvent = object = new wq_0();
        this.observerCreateTicket = object = new vg_2(this);
        this.onSuccessImageProcess = object = new wg_2(this);
        this.onErrorImageProcess = object = new xg_2(this);
        this.mCCAttachmentListener = object = new CCItemHelpFragment$mCCAttachmentListener$1(this);
    }

    public static /* synthetic */ Unit Oa(CCItemHelpFragment cCItemHelpFragment, DataCallback dataCallback) {
        return CCItemHelpFragment.initObservables$lambda$4(cCItemHelpFragment, dataCallback);
    }

    public static /* synthetic */ void Pa(CCItemHelpFragment cCItemHelpFragment, Throwable throwable) {
        CCItemHelpFragment.onErrorImageProcess$lambda$12(cCItemHelpFragment, throwable);
    }

    public static /* synthetic */ void Qa(CCItemHelpFragment cCItemHelpFragment, DataCallback dataCallback) {
        CCItemHelpFragment.observerCreateTicket$lambda$1(cCItemHelpFragment, dataCallback);
    }

    public static /* synthetic */ Unit Ra(CCItemHelpFragment cCItemHelpFragment, DataCallback dataCallback) {
        return CCItemHelpFragment.initObservables$lambda$5(cCItemHelpFragment, dataCallback);
    }

    public static /* synthetic */ void Sa(CCItemHelpFragment cCItemHelpFragment, Object object) {
        CCItemHelpFragment.onSuccessImageProcess$lambda$11(cCItemHelpFragment, object);
    }

    public static /* synthetic */ void Ta(CCItemHelpFragment cCItemHelpFragment, View view) {
        CCItemHelpFragment.setImageDialog$lambda$10(cCItemHelpFragment, view);
    }

    public static /* synthetic */ void Ua(CCItemHelpFragment cCItemHelpFragment) {
        CCItemHelpFragment.setToolbarUI$lambda$0(cCItemHelpFragment);
    }

    public static /* synthetic */ Unit Va(CCItemHelpFragment cCItemHelpFragment, DataCallback dataCallback) {
        return CCItemHelpFragment.initObservables$lambda$6(cCItemHelpFragment, dataCallback);
    }

    public static final /* synthetic */ String access$getEventLabel(CCItemHelpFragment cCItemHelpFragment) {
        return cCItemHelpFragment.getEventLabel();
    }

    public static final /* synthetic */ NewCustomEventsRevamp access$getNewCustomEventsRevamp$p(CCItemHelpFragment cCItemHelpFragment) {
        return cCItemHelpFragment.newCustomEventsRevamp;
    }

    public static final /* synthetic */ NewEEcommerceEventsRevamp access$getNewEEcommerceEventsRevamp$p(CCItemHelpFragment cCItemHelpFragment) {
        return cCItemHelpFragment.newEEcommerceEventsRevamp;
    }

    public static final /* synthetic */ void access$notifyAttachmentViewMultiFile(CCItemHelpFragment cCItemHelpFragment) {
        cCItemHelpFragment.notifyAttachmentViewMultiFile();
    }

    private final int addCommonQAViews(int n3) {
        int n4;
        Object object;
        CCItemDetailsQAModel$CCItemQALists cCItemDetailsQAModel$CCItemQALists;
        int n7;
        ArrayList arrayList = this.mViewDataList;
        String string2 = "";
        if (arrayList != null) {
            n7 = 12;
            cCItemDetailsQAModel$CCItemQALists = this.qaItem;
            object = new UiCCComponent(n7, string2, cCItemDetailsQAModel$CCItemQALists);
            arrayList.add(n3, object);
        }
        int n8 = n3 + 1;
        object = this.qaItem;
        if (object != null && (n4 = ((CCItemDetailsQAModel$CCItemQALists)object).getIsComplaint()) == (n7 = 1)) {
            object = this.mViewDataList;
            if (object != null) {
                cCItemDetailsQAModel$CCItemQALists = this.qaItem;
                int n10 = 102;
                int n14 = 21;
                UiCCComponent uiCCComponent = new UiCCComponent(n14, string2, cCItemDetailsQAModel$CCItemQALists, n10);
                ((ArrayList)object).add(n8, uiCCComponent);
            }
            this.mAttachmentIndex = n8;
            n8 = n3 + 2;
        }
        return n8;
    }

    private final void checkAttachmentView() {
        int n3;
        int n4;
        Object object;
        Object object2 = this.mViewDataList;
        if (object2 != null && (object = this.mCCItemHelpAdapter) != null && (n4 = this.mAttachmentIndex) > (n3 = -1)) {
            if (object2 != null) {
                ((ArrayList)object2).remove(n4);
            }
            boolean bl2 = this.isExpandable;
            object = "";
            n3 = 21;
            if (bl2) {
                object2 = this.mViewDataList;
                Intrinsics.checkNotNull(object2);
                int n7 = this.mAttachmentIndex;
                CCItemDetailsQAModel$CCItemQALists cCItemDetailsQAModel$CCItemQALists = this.qaItem;
                int n8 = 104;
                UiCCComponent uiCCComponent = new UiCCComponent(n3, (String)object, cCItemDetailsQAModel$CCItemQALists, n8);
                ((ArrayList)object2).add(n7, uiCCComponent);
            } else {
                object2 = this.mViewDataList;
                if (object2 != null) {
                    int n10 = this.mAttachmentIndex;
                    CCItemDetailsQAModel$CCItemQALists cCItemDetailsQAModel$CCItemQALists = this.qaItem;
                    UiCCComponent uiCCComponent = new UiCCComponent(n3, (String)object, cCItemDetailsQAModel$CCItemQALists);
                    ((ArrayList)object2).add(n10, uiCCComponent);
                }
            }
            object2 = this.mCCItemHelpAdapter;
            Intrinsics.checkNotNull(object2);
            n4 = this.mAttachmentIndex;
            ((RecyclerView$f)object2).notifyItemChanged(n4);
        }
    }

    private final void createComplaintTicket() {
        Object object;
        Object object2 = this.mCCComplaintAttachInfo;
        if (object2 != null && (object = this.mCCComplaintDetailInfo) != null) {
            if (object2 != null) {
                object = object != null ? ((CCComplaintDetailInfo)object).getIncidentId() : null;
                ((CCComplaintAttachInfo)object2).setIncidentId((String)object);
            }
            this.showProgress();
            object2 = this.mCCViewModel;
            if (object2 != null) {
                object = this.mCCComplaintAttachInfo;
                Intrinsics.checkNotNull(object);
                ((CCViewModel)object2).createComplaintTicket((CCComplaintAttachInfo)object);
            }
        }
    }

    private final void createComplaintTicketMultiFile() {
        Object object = this.attachModel;
        CCComplaintAttachInfoNew cCComplaintAttachInfoNew = null;
        object = object != null ? ((CCItemMultiFileAttachModel)object).getAttacheInfo() : null;
        if (object != null && (object = this.mCCComplaintDetailInfo) != null) {
            CCItemMultiFileAttachModel cCItemMultiFileAttachModel = this.attachModel;
            if (cCItemMultiFileAttachModel != null) {
                int n3;
                Object object2;
                Object object3;
                if (cCItemMultiFileAttachModel != null && (object3 = cCItemMultiFileAttachModel.getAttacheInfo()) != null) {
                    object = this.mCCComplaintDetailInfo;
                    object2 = object != null ? (object = ((CCComplaintDetailInfo)object).getIncidentId()) : null;
                    n3 = 6;
                    object3 = object = CCComplaintAttachInfoNew.copy$default((CCComplaintAttachInfoNew)object3, (String)object2, null, null, n3, null);
                } else {
                    object3 = null;
                }
                int n4 = 126;
                object2 = null;
                n3 = 0;
                object = CCItemMultiFileAttachModel.copy$default(cCItemMultiFileAttachModel, (CCComplaintAttachInfoNew)object3, 0, false, false, null, null, null, n4, null);
            } else {
                object = null;
            }
            this.attachModel = object;
            this.showProgress();
            object = this.mCCViewModel;
            if (object != null) {
                cCItemMultiFileAttachModel = this.attachModel;
                if (cCItemMultiFileAttachModel != null) {
                    cCComplaintAttachInfoNew = cCItemMultiFileAttachModel.getAttacheInfo();
                }
                Intrinsics.checkNotNull(cCComplaintAttachInfoNew);
                ((CCViewModel)object).createComplaintTicketNew(cCComplaintAttachInfoNew);
            }
        }
    }

    private final void createTicket() {
        Object object = this.mCCTicketCreateQuery;
        if (object != null) {
            Object object2;
            if (object != null) {
                object2 = this.qaItem;
                Intrinsics.checkNotNull(object2);
                object2 = ((CCItemDetailsQAModel$CCItemQALists)object2).getOrderNumber();
                ((CCTicketCreateQuery)object).setOrderCode((String)object2);
            }
            if ((object = this.mCCTicketCreateQuery) != null) {
                object2 = this.qaItem;
                Intrinsics.checkNotNull(object2);
                object2 = ((CCItemDetailsQAModel$CCItemQALists)object2).getCategory();
                ((CCTicketCreateQuery)object).setCategory((String)object2);
            }
            if ((object = this.mCCTicketCreateQuery) != null) {
                object2 = this.qaItem;
                Intrinsics.checkNotNull(object2);
                object2 = ((CCItemDetailsQAModel$CCItemQALists)object2).getSubcategory();
                ((CCTicketCreateQuery)object).setSubCategory((String)object2);
            }
            if ((object = this.mCCTicketCreateQuery) != null) {
                object2 = this.qaItem;
                Intrinsics.checkNotNull(object2);
                object2 = ((CCItemDetailsQAModel$CCItemQALists)object2).getLeafcategory();
                ((CCTicketCreateQuery)object).setLeafCategory((String)object2);
            }
            if ((object = this.mCCTicketCreateQuery) != null) {
                object2 = this.qaItem;
                Intrinsics.checkNotNull(object2);
                object2 = ((CCItemDetailsQAModel$CCItemQALists)object2).getDescription();
                ((CCTicketCreateQuery)object).setDescription((String)object2);
            }
            if ((object = this.mCCTicketCreateQuery) != null) {
                object2 = this.qaItem;
                Intrinsics.checkNotNull(object2);
                object2 = ((CCItemDetailsQAModel$CCItemQALists)object2).getNoofDays();
                ((CCTicketCreateQuery)object).setNoOfDays((String)object2);
            }
            if ((object = this.mCCTicketCreateQuery) != null) {
                object2 = this.qaItem;
                Intrinsics.checkNotNull(object2);
                object2 = ((CCItemDetailsQAModel$CCItemQALists)object2).getWorkGroup();
                ((CCTicketCreateQuery)object).setWorkgroup((String)object2);
            }
            this.showProgress();
            object = this.getMActivity();
            if (object != null) {
                object = this.getMActivity();
                hv3_0.S((Activity)object);
            }
            if ((object = this.mCCViewModel) != null) {
                object2 = this.mCCTicketCreateQuery;
                Intrinsics.checkNotNull(object2);
                ((CCViewModel)object).createTicket((CCTicketCreateQuery)object2);
            }
        }
    }

    private final void createViewDataList(boolean bl2, String object, CCHelpInterface object2) {
        Object object3;
        Serializable serializable;
        Object object4;
        Object object5;
        int n3 = this.isReturnFlowOptimizationEnabled();
        if (n3 != 0) {
            this.createViewDataListMultipleImages(bl2, (String)object5, (CCHelpInterface)object4);
            return;
        }
        this.mViewDataList = serializable = new Serializable();
        int n4 = this.isExpandable;
        String string2 = null;
        int n7 = 2;
        int n8 = 10;
        int n10 = 1;
        String string3 = "";
        if (n4 != 0) {
            object3 = this.mCCComplaintDetailInfo;
            if (object3 != null) {
                int n14 = 22;
                object5 = new UiCCComponent(n14, string3, (CCHelpInterface)object3);
                serializable.add(0, object5);
                object3 = this.mViewDataList;
                if (object3 != null) {
                    object5 = new UiCCComponent(n10, n8);
                    ((ArrayList)object3).add(n10, object5);
                }
                this.qaItem = object3 = new CCItemDetailsQAModel$CCItemQALists();
                boolean bl3 = this.isComplaintClosed();
                int n15 = 103;
                if (!bl3) {
                    object3 = this.mViewDataList;
                    if (object3 != null) {
                        n3 = 21;
                        CCItemDetailsQAModel$CCItemQALists cCItemDetailsQAModel$CCItemQALists = this.qaItem;
                        object4 = new UiCCComponent(n3, string3, cCItemDetailsQAModel$CCItemQALists, n15);
                        ((ArrayList)object3).add(n7, object4);
                    }
                    this.mAttachmentIndex = n7;
                } else {
                    boolean bl4 = this.isComplaintClosed();
                    if (bl4) {
                        boolean bl5;
                        object3 = this.mCCComplaintDetailInfo;
                        if (object3 != null) {
                            string2 = ((CCComplaintDetailInfo)object3).getNoOfDays();
                        }
                        if (!(bl5 = TextUtils.isEmpty(string2))) {
                            object3 = this.mCCComplaintDetailInfo;
                            Intrinsics.checkNotNull(object3);
                            boolean bl6 = ((CCComplaintDetailInfo)object3).getCurrentIncidentReopened();
                            if (!bl6) {
                                object3 = this.mCCViewModel;
                                if (object3 != null && (object3 = ((CCViewModel)object3).getCreateCCTicketObservable()) != null) {
                                    object4 = this.observerCreateTicket;
                                    ((LiveData)object3).j((F62)object4);
                                }
                                if ((object3 = this.mViewDataList) != null) {
                                    serializable = this.qaItem;
                                    object4 = new UiCCComponent(n8, string3, (CCHelpInterface)serializable, n15);
                                    ((ArrayList)object3).add(n7, object4);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            boolean bl7;
            if (bl2 && (bl7 = object4 instanceof CCTicketCreated)) {
                n4 = 11;
                object3 = new UiCCComponent(n4, string3, (CCHelpInterface)object4);
                serializable.add(0, object3);
                object3 = this.mViewDataList;
                if (object3 != null) {
                    n3 = 6;
                    object4 = new UiCCComponent(n3, (String)object5);
                    ((ArrayList)object3).add(n10, object4);
                }
                this.mHelpBtnIndex = n10;
            } else {
                object3 = this.qaItem;
                n7 = object3 != null ? this.addCommonQAViews(0) : 0;
            }
            object3 = this.mViewDataList;
            if (object3 != null) {
                object5 = new UiCCComponent(n10, n8);
                ((ArrayList)object3).add(n7, object5);
            }
            int n16 = n7 + 1;
            object5 = this.mViewDataList;
            if (object5 != null) {
                object4 = new UiCCComponent(n8, string3, null);
                ((ArrayList)object5).add(n16, object4);
            }
            int n17 = n7 + 2;
            object5 = this.mViewDataList;
            if (object5 != null) {
                object4 = new UiCCComponent(n10, n8);
                ((ArrayList)object5).add(n17, object4);
            }
            n7 += 3;
            object3 = this.mViewDataList;
            if (object3 != null) {
                int n18 = 15;
                object5 = new UiCCComponent(n18, string3);
                ((ArrayList)object3).add(n7, object5);
            }
        }
        object5 = this.mViewDataList;
        object4 = this.mCCAttachmentListener;
        this.mCCItemHelpAdapter = object3 = new CCItemHelpAdapter((List)object5, this, (CCAttachmentListener)object4);
        object5 = this.mRecyclerView;
        if (object5 != null) {
            ((RecyclerView)object5).setAdapter((RecyclerView$f)object3);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final void createViewDataListMultipleImages(boolean n3, String object, CCHelpInterface object2) {
        Object object3;
        Object object4;
        Object object5;
        Object object6 = new ArrayList();
        this.mViewDataList = object6;
        int n4 = this.isExpandable;
        String string2 = null;
        int n7 = 10;
        String string3 = "";
        int n8 = 1;
        int n10 = 0;
        if (n4 != 0) {
            object5 = this.mCCComplaintDetailInfo;
            if (object5 != null) {
                int n14 = 22;
                object4 = new UiCCComponent(n14, string3, (CCHelpInterface)object5);
                ((ArrayList)object6).add(object4);
                object5 = this.mViewDataList;
                if (object5 != null) {
                    object4 = new UiCCComponent(n8, n7);
                    ((ArrayList)object5).add(object4);
                }
                this.qaItem = object5 = new CCItemDetailsQAModel$CCItemQALists();
                boolean bl2 = this.isComplaintClosed();
                int n15 = 103;
                if (!bl2) {
                    Object object7;
                    void var1_5;
                    object5 = this.mCCComplaintDetailInfo;
                    if (object5 != null) {
                        object5 = ((CCComplaintDetailInfo)object5).getDisableComplaintCardAction();
                        object3 = Boolean.TRUE;
                        boolean bl3 = Intrinsics.areEqual(object5, object3);
                    } else {
                        boolean bl4 = false;
                        object5 = null;
                    }
                    n14 = 104;
                    if (var1_5 == false) {
                        void var1_9;
                        int n16;
                        object5 = this.mCCComplaintDetailInfo;
                        if (object5 == null || (object5 = ((CCComplaintDetailInfo)object5).getUserUploadActionData()) == null || (n16 = ((ArrayList)object5).isEmpty()) != n8) {
                            n8 = 0;
                        }
                        if (n8 != 0) {
                            n15 = 104;
                        }
                        this.initAttachmentModel();
                        object5 = this.mViewDataList;
                        if (object5 != null) {
                            n4 = 105;
                            object7 = this.attachModel;
                            object6 = new UiCCComponent(n4, string3, (CCHelpInterface)object7, n15);
                            ((ArrayList)object5).add(object6);
                        }
                        if ((object5 = this.mViewDataList) != null) {
                            int n17 = xx_2.h((List)object5);
                        } else {
                            boolean bl5 = false;
                            object5 = null;
                        }
                        this.mAttachmentIndex = var1_9;
                    }
                    if ((object5 = this.mCCComplaintDetailInfo) != null && (object5 = ((CCComplaintDetailInfo)object5).getUserUploadActionData()) != null) {
                        object5 = object5.iterator();
                        while ((n15 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                            object4 = object5.next();
                            int n18 = n10 + 1;
                            if (n10 >= 0) {
                                object4 = (ActionData)object4;
                                ArrayList arrayList = this.mViewDataList;
                                if (arrayList != null) {
                                    n8 = 106;
                                    object7 = new UiCCComponent(n8, string3, (CCHelpInterface)object4, n14);
                                    arrayList.add(object7);
                                }
                                n10 = n18;
                                continue;
                            }
                            xx_2.n();
                            throw null;
                        }
                    }
                } else {
                    boolean bl6 = this.isComplaintClosed();
                    if (bl6) {
                        boolean bl7;
                        object5 = this.mCCComplaintDetailInfo;
                        if (object5 != null) {
                            string2 = ((CCComplaintDetailInfo)object5).getNoOfDays();
                        }
                        if (!(bl7 = TextUtils.isEmpty(string2))) {
                            object5 = this.mCCComplaintDetailInfo;
                            Intrinsics.checkNotNull(object5);
                            boolean bl8 = ((CCComplaintDetailInfo)object5).getCurrentIncidentReopened();
                            if (!bl8) {
                                object5 = this.mCCViewModel;
                                if (object5 != null && (object5 = ((CCViewModel)object5).getCreateCCTicketObservable()) != null) {
                                    object3 = this.observerCreateTicket;
                                    ((LiveData)object5).j((F62)object3);
                                }
                                if ((object5 = this.mViewDataList) != null) {
                                    object6 = this.qaItem;
                                    object3 = new UiCCComponent(n7, string3, (CCHelpInterface)object6, n15);
                                    ((ArrayList)object5).add(object3);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            boolean bl9;
            if (n3 != 0 && (bl9 = object3 instanceof CCTicketCreated)) {
                n4 = 11;
                object5 = new UiCCComponent(n4, string3, (CCHelpInterface)object3);
                ((ArrayList)object6).add(0, object5);
                object5 = this.mViewDataList;
                if (object5 != null) {
                    int n19 = 6;
                    object3 = new UiCCComponent(n19, (String)object4);
                    ((ArrayList)object5).add(n8, object3);
                }
                this.mHelpBtnIndex = n8;
                n10 = 2;
            } else {
                object5 = this.qaItem;
                if (object5 != null) {
                    n10 = this.addCommonQAViews(0);
                }
            }
            object5 = this.mViewDataList;
            if (object5 != null) {
                object4 = new UiCCComponent(n8, n7);
                ((ArrayList)object5).add(n10, object4);
            }
            int n20 = n10 + 1;
            object4 = this.mViewDataList;
            if (object4 != null) {
                object3 = new UiCCComponent(n7, string3, null);
                ((ArrayList)object4).add(n20, object3);
            }
            int n21 = n10 + 2;
            object4 = this.mViewDataList;
            if (object4 != null) {
                object3 = new UiCCComponent(n8, n7);
                ((ArrayList)object4).add(n21, object3);
            }
            n10 += 3;
            object5 = this.mViewDataList;
            if (object5 != null) {
                int n22 = 15;
                object4 = new UiCCComponent(n22, string3);
                ((ArrayList)object5).add(n10, object4);
            }
        }
        object4 = this.mViewDataList;
        object3 = this.mCCAttachmentListener;
        this.mCCItemHelpAdapter = object5 = new CCItemHelpAdapter((List)object4, this, (CCAttachmentListener)object3);
        object4 = this.mRecyclerView;
        if (object4 != null) {
            ((RecyclerView)object4).setAdapter((RecyclerView$f)object5);
        }
    }

    private final void fileSizeError() {
        CCItemMultiFileAttachModel cCItemMultiFileAttachModel = this.attachModel;
        if (cCItemMultiFileAttachModel != null) {
            int n3 = R$string.cc_file_size_too_big;
            String string2 = this.getString(n3);
            cCItemMultiFileAttachModel.setAttachmentError(string2);
        }
        this.notifyAttachmentViewMultiFile();
    }

    private final void getComplaintDetail() {
        Object object = this.mIncidentId;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            this.showProgress();
            object = this.mCCViewModel;
            if (object != null) {
                String string2 = this.mIncidentId;
                Intrinsics.checkNotNull(string2);
                ((CCViewModel)object).getCCComplaintDetail(string2);
            }
        }
    }

    private final String getEventLabel() {
        Object object = this.mCCComplaintDetailInfo;
        String string2 = null;
        object = object != null ? ((CCComplaintDetailInfo)object).getTicketId() : null;
        Object object2 = this.mCCComplaintDetailInfo;
        if (object2 != null) {
            string2 = ((CCComplaintDetailInfo)object2).getOrderCode();
        }
        long l2 = (object2 = this.mCCComplaintDetailInfo) != null ? ((CCComplaintDetailInfo)object2).getResolutionBy() : (long)-1;
        object2 = k7.f(l2, "yyyy-MM-dd");
        StringBuilder stringBuilder = new StringBuilder("Complaintcard  Clicked  ");
        stringBuilder.append((String)object);
        stringBuilder.append("  ");
        stringBuilder.append(string2);
        stringBuilder.append("  Open  ");
        stringBuilder.append((String)object2);
        return stringBuilder.toString();
    }

    private final void hideProgress() {
        pf_1 pf_12 = this.getCcActivityListener();
        if (pf_12 != null) {
            pf_12.stopLoader();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void imageSelectedEvent(boolean bl2) {
        String string2 = bl2 ? "image upload success" : "image upload failure";
        String string3 = string2;
        NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
        String string4 = this.newEEcommerceEventsRevamp.getPrevScreen();
        String string5 = this.newEEcommerceEventsRevamp.getPrevScreenType();
        String string6 = this.getEventLabel();
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "complaint card screen interactions", string3, string6, "complaint_card_screen_interactions", "complaint card screen", null, string4, null, string5, false, null, 1696, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void initAttachmentModel() {
        CCItemMultiFileAttachModel cCItemMultiFileAttachModel;
        boolean bl2;
        CCComplaintAttachInfoNew cCComplaintAttachInfoNew;
        boolean bl3;
        CCItemHelpFragment cCItemHelpFragment = this;
        int n3 = 0;
        Object object = null;
        int n4 = 1;
        Object object2 = this.mCCComplaintDetailInfo;
        if (object2 != null) {
            object2 = ((CCComplaintDetailInfo)object2).getIncidentId();
        } else {
            bl3 = false;
            object2 = null;
        }
        Object object3 = object2;
        int n7 = 31;
        object2 = new ImageData(null, null, null, null, null, n7, null);
        Object[] objectArray = new ImageData[n4];
        objectArray[0] = object2;
        ArrayList arrayList = xx_2.d(objectArray);
        int n8 = 2;
        boolean bl4 = false;
        objectArray = null;
        object2 = cCComplaintAttachInfoNew;
        cCComplaintAttachInfoNew = new CCComplaintAttachInfoNew((String)object3, null, arrayList, n8, null);
        object2 = cCItemHelpFragment.mCCComplaintDetailInfo;
        if (object2 != null && (object2 = ((CCComplaintDetailInfo)object2).getMaxImageUploadCounter()) != null) {
            bl4 = bl3 = ((Integer)object2).intValue();
        } else {
            bl4 = false;
            objectArray = null;
        }
        object2 = cCItemHelpFragment.mCCComplaintDetailInfo;
        if (object2 != null) {
            object2 = ((CCComplaintDetailInfo)object2).isImageMandatory();
            object3 = Boolean.TRUE;
            bl2 = bl3 = (boolean)Intrinsics.areEqual(object2, object3);
        } else {
            bl2 = false;
            arrayList = null;
        }
        object2 = cCItemHelpFragment.mCCComplaintDetailInfo;
        if (object2 != null) {
            object = ((CCComplaintDetailInfo)object2).isCommentMandatory();
            object2 = Boolean.TRUE;
            n8 = n3 = Intrinsics.areEqual(object, object2);
        } else {
            n8 = 0;
        }
        object = cCItemHelpFragment.mCCComplaintDetailInfo;
        object = object != null && (object = ((CCComplaintDetailInfo)object).getUserUploadActionData()) != null && (n3 = object.isEmpty() ^ n4) == n4 ? "Enter more details" : "Enter Issue details";
        object2 = cCItemMultiFileAttachModel;
        object3 = cCComplaintAttachInfoNew;
        cCItemHelpFragment.attachModel = cCItemMultiFileAttachModel = new CCItemMultiFileAttachModel(cCComplaintAttachInfoNew, (int)(bl4 ? 1 : 0), bl2, n8 != 0, null, null, (String)object);
    }

    private final void initObservables() {
        CCItemHelpFragment$sam$androidx_lifecycle_Observer$0 cCItemHelpFragment$sam$androidx_lifecycle_Observer$0;
        Object object;
        mu1_1 mu1_12;
        Object object2 = this.mCCViewModel;
        if (object2 != null && (object2 = ((CCViewModel)object2).getCreateCCTicketObservable()) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            object = this.observerCreateTicket;
            ((LiveData)object2).e(mu1_12, (F62)object);
        }
        if ((object2 = this.mCCViewModel) != null && (object2 = ((CCViewModel)object2).getCCComplaintDetailObservable()) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            object = new qg_2(this);
            cCItemHelpFragment$sam$androidx_lifecycle_Observer$0 = new CCItemHelpFragment$sam$androidx_lifecycle_Observer$0((Function1)object);
            ((LiveData)object2).e(mu1_12, cCItemHelpFragment$sam$androidx_lifecycle_Observer$0);
        }
        if ((object2 = this.mCCViewModel) != null && (object2 = ((CCViewModel)object2).getCCComplaintAttachInfoObservable()) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            object = new rg_2(this);
            cCItemHelpFragment$sam$androidx_lifecycle_Observer$0 = new CCItemHelpFragment$sam$androidx_lifecycle_Observer$0((Function1)object);
            ((LiveData)object2).e(mu1_12, cCItemHelpFragment$sam$androidx_lifecycle_Observer$0);
        }
        if ((object2 = this.mCCViewModel) != null && (object2 = ((CCViewModel)object2).getCCComplaintNewAttachInfoObservable()) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            object = new sg_2(this);
            cCItemHelpFragment$sam$androidx_lifecycle_Observer$0 = new CCItemHelpFragment$sam$androidx_lifecycle_Observer$0((Function1)object);
            ((LiveData)object2).e(mu1_12, cCItemHelpFragment$sam$androidx_lifecycle_Observer$0);
        }
    }

    private static final Unit initObservables$lambda$4(CCItemHelpFragment cCItemHelpFragment, DataCallback dataCallback) {
        CCItemHelpFragment cCItemHelpFragment2 = cCItemHelpFragment;
        int n3 = 1;
        int n4 = 0;
        String string2 = null;
        Intrinsics.checkNotNullParameter(cCItemHelpFragment, "this$0");
        cp_1.Companion.getClass();
        Object object = cp$a.e();
        object.getClass();
        int n7 = cp_1.J(dataCallback);
        if (n7 != 0) {
            int n8;
            cCItemHelpFragment.hideProgress();
            n7 = 0;
            object = null;
            if (dataCallback != null && (n8 = dataCallback.getStatus()) == 0) {
                CCComplaintDetailInfo cCComplaintDetailInfo;
                int n10;
                Object object2;
                Object object3;
                Object object4 = new ArrayList();
                Object object5 = (CCComplaintDetailInfo)dataCallback.getData();
                if (object5 != null && (object5 = ((CCComplaintDetailInfo)object5).getUserUploadActionData()) != null) {
                    boolean bl2;
                    object5 = object5.iterator();
                    while (bl2 = object5.hasNext()) {
                        object3 = (ActionData)object5.next();
                        object2 = ((ActionData)object3).getCommentMessage();
                        if (!(object2 != null && (n10 = ((String)object2).length()) != 0 || (object2 = (Collection)((ActionData)object3).getImageDetails()) != null && (n10 = (int)(object2.isEmpty() ? 1 : 0)) == 0)) continue;
                        ((ArrayList)object4).add(object3);
                    }
                }
                object5 = dataCallback.getData();
                object3 = object5;
                object3 = (CCComplaintDetailInfo)object5;
                if (object3 != null) {
                    int n14 = (int)(((ArrayList)object4).isEmpty() ? 1 : 0);
                    Object object6 = (n3 ^= n14) != 0 ? object4 : null;
                    n10 = 0;
                    object2 = null;
                    long l2 = 0L;
                    long l3 = 0L;
                    long l4 = 0L;
                    int n15 = 0xF7FFFFF;
                    cCComplaintDetailInfo = CCComplaintDetailInfo.copy$default((CCComplaintDetailInfo)object3, null, null, l2, l3, l4, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, object6, null, null, null, null, n15, null);
                } else {
                    n3 = 0;
                    cCComplaintDetailInfo = null;
                }
                cCItemHelpFragment2.mCCComplaintDetailInfo = cCComplaintDetailInfo;
                object4 = cCItemHelpFragment2.mCCViewModel;
                if (object4 != null) {
                    ((CCViewModel)object4).setCcComplaintDetailInfo(cCComplaintDetailInfo);
                }
                cCItemHelpFragment2.createViewDataList(false, null, null);
            } else {
                n8 = dataCallback.getStatus();
                if (n8 == n3) {
                    Object object7 = dataCallback.getError();
                    if (object7 != null) {
                        object = ((DataError)object7).getErrors();
                    }
                    if (object != null) {
                        object = ((DataError)object7).getErrors();
                        Object[] objectArray = "getErrors(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)objectArray);
                        object = (Collection)object;
                        n7 = object.isEmpty() ^ n3;
                        if (n7 != 0) {
                            object = yn3_0.a;
                            objectArray = ((DataError$ErrorMessage)((DataError)object7).getErrors().get(0)).getMessage();
                            Object[] objectArray2 = new Object[]{};
                            ((yn3$a)object).a((String)objectArray, objectArray2);
                            object7 = ((DataError$ErrorMessage)((DataError)object7).getErrors().get(0)).getMessage();
                            objectArray = new Throwable((String)object7);
                            ((yn3$a)object).e((Throwable)objectArray);
                            object = StringCompanionObject.INSTANCE;
                            n7 = R$string.acc_error_message;
                            object = hv3_0.K(n7);
                            n8 = R$string.something_wrong_msg;
                            object7 = hv3_0.K(n8);
                            objectArray = new Object[n3];
                            objectArray[0] = object7;
                            Object object8 = Arrays.copyOf(objectArray, n3);
                            object8 = String.format((String)object, object8);
                            Intrinsics.checkNotNullExpressionValue(object8, "format(...)");
                            n4 = R$string.something_wrong_msg;
                            string2 = hv3_0.K(n4);
                            cCItemHelpFragment2.showNotification(string2, (String)object8);
                        }
                    }
                }
            }
        }
        return Unit.a;
    }

    private static final Unit initObservables$lambda$5(CCItemHelpFragment object, DataCallback object2) {
        int n3 = 0;
        Object object3 = null;
        int n4 = 1;
        Intrinsics.checkNotNullParameter(object, "this$0");
        cp_1.Companion.getClass();
        Object object4 = cp$a.e();
        object4.getClass();
        boolean bl2 = cp_1.J((DataCallback)object2);
        if (bl2) {
            int n7;
            ((CCItemHelpFragment)object).hideProgress();
            object4 = ((CCBaseFragment)object).getMActivity();
            if (object4 != null) {
                object4 = ((CCBaseFragment)object).getMActivity();
                hv3_0.S((Activity)object4);
            }
            object4 = "format(...)";
            if (object2 != null && (n7 = ((DataCallback)object2).getStatus()) == 0) {
                Object[] objectArray;
                Object object5;
                ((CCItemHelpFragment)object).qaItem = object2 = new CCItemDetailsQAModel$CCItemQALists();
                ((CCItemHelpFragment)object).mCCComplaintAttachInfo = object2 = new CCComplaintAttachInfo();
                ((CCItemHelpFragment)object).initAttachmentModel();
                ((CCItemHelpFragment)object).mSelfCareFileHelper = object2 = new ty2_2(n4 != 0);
                int n8 = ((CCItemHelpFragment)object).mAttachmentIndex;
                n7 = -1;
                if (n8 > n7) {
                    object5 = ((CCItemHelpFragment)object).mViewDataList;
                    if (object5 != null) {
                        ((ArrayList)object5).remove(n8);
                    }
                    if ((object2 = ((CCItemHelpFragment)object).mViewDataList) != null) {
                        n7 = ((CCItemHelpFragment)object).mAttachmentIndex;
                        CCItemDetailsQAModel$CCItemQALists cCItemDetailsQAModel$CCItemQALists = ((CCItemHelpFragment)object).qaItem;
                        int n10 = 21;
                        String string2 = "";
                        int n14 = 104;
                        objectArray = new UiCCComponent(n10, string2, cCItemDetailsQAModel$CCItemQALists, n14);
                        ((ArrayList)object2).add(n7, objectArray);
                    }
                    if ((object2 = ((CCItemHelpFragment)object).mCCItemHelpAdapter) != null) {
                        n7 = ((CCItemHelpFragment)object).mAttachmentIndex;
                        ((RecyclerView$f)object2).notifyItemChanged(n7);
                    }
                }
                object2 = StringCompanionObject.INSTANCE;
                n8 = R$string.acc_alert_message;
                object2 = hv3_0.K(n8);
                n7 = R$string.complaint_thanks_msg;
                object5 = hv3_0.K(n7);
                objectArray = new Object[n4];
                objectArray[0] = object5;
                object3 = Arrays.copyOf(objectArray, n4);
                object2 = String.format((String)object2, object3);
                Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                n3 = R$string.complaint_thanks_msg;
                object3 = hv3_0.K(n3);
                ((CCItemHelpFragment)object).showNotification((String)object3, (String)object2);
                object3 = CCClearCachedImageWorker.class;
                String string3 = "workerClass";
                Intrinsics.checkNotNullParameter(object3, string3);
                object2 = new CI3$a((Class)object3);
                object2 = (y92)((CI3$a)object2).a();
                object = ((CCItemHelpFragment)object).workManager;
                if (object != null) {
                    ((li3_1)object).c((y92)object2);
                }
            } else if (object2 != null && (n7 = ((DataCallback)object2).getStatus()) == n4) {
                Object object6;
                if ((object2 = ((DataCallback)object2).getError()) != null) {
                    object6 = ((DataError)object2).getErrors();
                } else {
                    n7 = 0;
                    object6 = null;
                }
                if (object6 != null) {
                    object6 = ((DataError)object2).getErrors();
                    Object[] objectArray = "getErrors(...)";
                    Intrinsics.checkNotNullExpressionValue(object6, (String)objectArray);
                    object6 = (Collection)object6;
                    n7 = object6.isEmpty() ^ n4;
                    if (n7 != 0) {
                        ((DataError$ErrorMessage)((DataError)object2).getErrors().get(0)).getMessage();
                        object6 = yn3_0.a;
                        object2 = ((DataError$ErrorMessage)((DataError)object2).getErrors().get(0)).getMessage();
                        objectArray = new Throwable((String)object2);
                        ((yn3$a)object6).e((Throwable)objectArray);
                        object2 = StringCompanionObject.INSTANCE;
                        int n15 = R$string.acc_error_message;
                        object2 = hv3_0.K(n15);
                        n7 = R$string.something_wrong_msg;
                        object6 = hv3_0.K(n7);
                        objectArray = new Object[n4];
                        objectArray[0] = object6;
                        object3 = Arrays.copyOf(objectArray, n4);
                        object2 = String.format((String)object2, object3);
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                        n3 = R$string.something_wrong_msg;
                        object3 = hv3_0.K(n3);
                        super.showNotification((String)object3, (String)object2);
                    }
                }
            }
        }
        return Unit.a;
    }

    private static final Unit initObservables$lambda$6(CCItemHelpFragment cCItemHelpFragment, DataCallback dataCallback) {
        Object object = cCItemHelpFragment;
        Object object2 = null;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(cCItemHelpFragment, "this$0");
        cp_1.Companion.getClass();
        Object object3 = cp$a.e();
        object3.getClass();
        boolean bl2 = cp_1.J(dataCallback);
        if (bl2) {
            int n4;
            cCItemHelpFragment.hideProgress();
            object3 = cCItemHelpFragment.getMActivity();
            if (object3 != null) {
                object3 = cCItemHelpFragment.getMActivity();
                hv3_0.S((Activity)object3);
            }
            object3 = "format(...)";
            if (dataCallback != null && (n4 = dataCallback.getStatus()) == 0) {
                Object object4 = new ty2_2(n3 != 0);
                ((CCItemHelpFragment)object).mSelfCareFileHelper = object4;
                Object object5 = ((CCItemHelpFragment)object).newCustomEventsRevamp;
                String string2 = ((CCItemHelpFragment)object).newEEcommerceEventsRevamp.getPrevScreen();
                String string3 = ((CCItemHelpFragment)object).newEEcommerceEventsRevamp.getPrevScreenType();
                String string4 = cCItemHelpFragment.getEventLabel();
                String string5 = "details submitted";
                String string6 = "complaint_card_screen_interactions";
                String string7 = "complaint card screen";
                int n7 = 1696;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, "complaint card screen interactions", string5, string4, string6, string7, null, string2, null, string3, false, null, n7, null);
                cCItemHelpFragment.getComplaintDetail();
                object4 = StringCompanionObject.INSTANCE;
                n4 = R$string.acc_alert_message;
                object4 = hv3_0.K(n4);
                int n8 = R$string.complaint_thanks_msg;
                object5 = hv3_0.K(n8);
                Object[] objectArray = new Object[n3];
                objectArray[0] = object5;
                object2 = Arrays.copyOf(objectArray, n3);
                object2 = String.format((String)object4, (Object[])object2);
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                n3 = R$string.complaint_thanks_msg;
                Object object6 = hv3_0.K(n3);
                ((CCItemHelpFragment)object).showNotification((String)object6, (String)object2);
                object6 = CCClearCachedImageWorker.class;
                object3 = "workerClass";
                Intrinsics.checkNotNullParameter(object6, (String)object3);
                object2 = new CI3$a((Class)object6);
                object2 = (y92)((CI3$a)object2).a();
                object = ((CCItemHelpFragment)object).workManager;
                if (object != null) {
                    ((li3_1)object).c((y92)object2);
                }
            } else if (dataCallback != null && (n4 = dataCallback.getStatus()) == n3) {
                int n10;
                Object object7;
                Object object8 = dataCallback.getError();
                if (object8 != null) {
                    object7 = ((DataError)object8).getErrors();
                } else {
                    n10 = 0;
                    object7 = null;
                }
                if (object7 != null) {
                    object7 = ((DataError)object8).getErrors();
                    Object[] objectArray = "getErrors(...)";
                    Intrinsics.checkNotNullExpressionValue(object7, (String)objectArray);
                    object7 = (Collection)object7;
                    n10 = object7.isEmpty() ^ n3;
                    if (n10 != 0) {
                        ((DataError$ErrorMessage)((DataError)object8).getErrors().get(0)).getMessage();
                        object7 = yn3_0.a;
                        object8 = ((DataError$ErrorMessage)((DataError)object8).getErrors().get(0)).getMessage();
                        objectArray = new Throwable((String)object8);
                        ((yn3$a)object7).e((Throwable)objectArray);
                        object8 = StringCompanionObject.INSTANCE;
                        n4 = R$string.acc_error_message;
                        object8 = hv3_0.K(n4);
                        n10 = R$string.something_wrong_msg;
                        object7 = hv3_0.K(n10);
                        objectArray = new Object[n3];
                        objectArray[0] = object7;
                        object2 = Arrays.copyOf(objectArray, n3);
                        object2 = String.format((String)object8, (Object[])object2);
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                        n3 = R$string.something_wrong_msg;
                        String string8 = hv3_0.K(n3);
                        ((CCItemHelpFragment)object).showNotification(string8, (String)object2);
                    }
                }
            }
        }
        return Unit.a;
    }

    private final boolean isComplaintClosed() {
        Object object = this.mCCComplaintDetailInfo;
        object = object != null ? ((CCComplaintDetailInfo)object).getIncidentStatus() : null;
        return "Closed".equalsIgnoreCase((String)object);
    }

    private final boolean isReturnFlowOptimizationEnabled() {
        return h40_0.a.h2();
    }

    private final void notifyAttachmentViewMultiFile() {
        Object object = this.mViewDataList;
        if (object != null) {
            object = xx_2.g((Collection)object);
            int n3 = this.mAttachmentIndex;
            int n4 = ((IntRange)object).e(n3);
            if (n4 == (n3 = 1) && (object = this.mCCItemHelpAdapter) != null) {
                n3 = this.mAttachmentIndex;
                ((RecyclerView$f)object).notifyItemChanged(n3);
            }
        }
    }

    private static final void observerCreateTicket$lambda$1(CCItemHelpFragment object, DataCallback object2) {
        int n3 = 1;
        boolean bl2 = false;
        String string2 = null;
        Intrinsics.checkNotNullParameter(object, "this$0");
        cp_1.Companion.getClass();
        Object object3 = cp$a.e();
        object3.getClass();
        int n4 = cp_1.J((DataCallback)object2);
        if (n4 != 0) {
            ((CCItemHelpFragment)object).hideProgress();
            if (object2 != null && (n4 = ((DataCallback)object2).getStatus()) == 0) {
                if ((object2 = (CCTicketCreated)((DataCallback)object2).getData()) != null) {
                    ((CCItemHelpFragment)object).isExpandable = false;
                    object3 = "success";
                    string2 = ((CCTicketCreated)object2).getStatus();
                    bl2 = ((String)object3).equalsIgnoreCase(string2);
                    string2 = bl2 ? "Continue Shopping" : "RAISE COMPLAINT";
                    ((CCItemHelpFragment)object).createViewDataList(n3 != 0, string2, (CCHelpInterface)object2);
                    Class<CCClearCachedImageWorker> clazz = CCClearCachedImageWorker.class;
                    string2 = "workerClass";
                    Intrinsics.checkNotNullParameter(clazz, string2);
                    object2 = new CI3$a(clazz);
                    object2 = (y92)((CI3$a)object2).a();
                    object = ((CCItemHelpFragment)object).workManager;
                    if (object != null) {
                        ((li3_1)object).c((y92)object2);
                    }
                }
            } else if (object2 != null && (n4 = ((DataCallback)object2).getStatus()) == n3) {
                if ((object2 = ((DataCallback)object2).getError()) != null) {
                    object3 = ((DataError)object2).getErrors();
                } else {
                    n4 = 0;
                    object3 = null;
                }
                if (object3 != null) {
                    object3 = ((DataError)object2).getErrors();
                    Object[] objectArray = "getErrors(...)";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)objectArray);
                    object3 = (Collection)object3;
                    n4 = object3.isEmpty() ^ n3;
                    if (n4 != 0) {
                        object3 = yn3_0.a;
                        object2 = ((DataError$ErrorMessage)((DataError)object2).getErrors().get(0)).getMessage();
                        objectArray = new Throwable((String)object2);
                        ((yn3$a)object3).e((Throwable)objectArray);
                        object2 = StringCompanionObject.INSTANCE;
                        int n7 = R$string.acc_error_message;
                        object2 = hv3_0.K(n7);
                        n4 = R$string.something_wrong_msg;
                        object3 = hv3_0.K(n4);
                        objectArray = new Object[n3];
                        objectArray[0] = object3;
                        Object object4 = Arrays.copyOf(objectArray, n3);
                        object2 = String.format((String)object2, object4);
                        Intrinsics.checkNotNullExpressionValue(object2, "format(...)");
                        n3 = R$string.something_wrong_msg;
                        object4 = hv3_0.K(n3);
                        super.showNotification((String)object4, (String)object2);
                    }
                }
            }
        }
    }

    private static final void onErrorImageProcess$lambda$12(CCItemHelpFragment cCItemHelpFragment, Throwable object) {
        Intrinsics.checkNotNullParameter(cCItemHelpFragment, "this$0");
        object = StringCompanionObject.INSTANCE;
        object = hv3_0.K(R$string.acc_error_message);
        Object object2 = hv3_0.K(R$string.something_wrong_msg);
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object2;
        object2 = Arrays.copyOf(objectArray, n3);
        object = String.format((String)object, object2);
        Intrinsics.checkNotNullExpressionValue(object, "format(...)");
        int n4 = R$string.something_wrong_msg;
        object2 = hv3_0.K(n4);
        cCItemHelpFragment.showNotification((String)object2, (String)object);
        boolean bl2 = cCItemHelpFragment.isReturnFlowOptimizationEnabled();
        if (bl2) {
            cCItemHelpFragment.imageSelectedEvent(false);
            cCItemHelpFragment.uploadError();
        }
    }

    private final void onFileReadResult(Intent object) {
        int n3;
        int n4 = 1;
        boolean bl2 = false;
        Object object2 = null;
        int n7 = 0;
        String string2 = null;
        if (object != null) {
            object = object.getData();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object.toString();
            Object object3 = this.getMActivity();
            if (object3 != null) {
                float f5;
                Object object4;
                object3 = this.getMActivity();
                if (object3 != null && (object3 = object3.getContentResolver()) != null) {
                    object3 = object3.getType((Uri)object);
                } else {
                    object4 = 0;
                    object3 = null;
                    f5 = 0.0f;
                }
                if (object3 != null) {
                    Object object5 = "image";
                    object4 = StringsKt.F((CharSequence)object3, (CharSequence)object5, false);
                    if (object4 != 0) {
                        this.showProgress();
                        this.startImageProcessing((Uri)object);
                    } else {
                        object3 = this.mSelfCareFileHelper;
                        Intrinsics.checkNotNull(object3);
                        object5 = this.getMActivity();
                        object3.getClass();
                        f5 = ty2_2.f((Context)object5, (Uri)object);
                        float f6 = 0.0f;
                        object5 = null;
                        String string3 = "format(...)";
                        float f7 = f5 - 0.0f;
                        float f8 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                        if (f8 == false) {
                            object = StringCompanionObject.INSTANCE;
                            n3 = R$string.acc_error_message;
                            object = hv3_0.K(n3);
                            n7 = R$string.something_wrong_msg;
                            string2 = hv3_0.K(n7);
                            object3 = new Object[n4];
                            object3[0] = string2;
                            Object object6 = Arrays.copyOf(object3, n4);
                            object = String.format((String)object, object6);
                            Intrinsics.checkNotNullExpressionValue(object, string3);
                            n4 = R$string.something_wrong_msg;
                            object6 = hv3_0.K(n4);
                            this.showNotification((String)object6, (String)object);
                        } else {
                            f8 = 1065353216;
                            f6 = 1.0f;
                            float f11 = f5 - f6;
                            object4 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                            if (object4 > 0) {
                                object = StringCompanionObject.INSTANCE;
                                n3 = R$string.acc_alert_message;
                                object = hv3_0.K(n3);
                                string2 = "File should be less than 1mb.";
                                object3 = new Object[n4];
                                object3[0] = string2;
                                Object[] objectArray = Arrays.copyOf(object3, n4);
                                object = String.format((String)object, objectArray);
                                Intrinsics.checkNotNullExpressionValue(object, string3);
                                mq0_2.c(string2, (String)object);
                            } else {
                                Object object7 = this.mSelfCareFileHelper;
                                if (object7 != null) {
                                    object7 = ty2_2.b((Context)this.getMActivity(), (Uri)object);
                                } else {
                                    n4 = 0;
                                    object7 = null;
                                }
                                object2 = this.mSelfCareFileHelper;
                                if (object2 != null) {
                                    object2 = this.getMActivity();
                                    object = ty2_2.e((Context)object2, (Uri)object);
                                } else {
                                    n3 = 0;
                                    object = null;
                                }
                                bl2 = TextUtils.isEmpty((CharSequence)object);
                                if (bl2) {
                                    object = this.mSelfCareFileHelper;
                                    if (object != null) {
                                        object2 = "pdf";
                                        object = ty2_2.c("PDF", (String)object2);
                                    } else {
                                        n3 = 0;
                                        object = null;
                                    }
                                }
                                bl2 = this.isExpandable;
                                object3 = MIME_TYPE_PDF;
                                if (bl2) {
                                    object2 = this.mCCComplaintAttachInfo;
                                    if (object2 != null) {
                                        ((CCComplaintAttachInfo)object2).setBase64String((String)object7);
                                    }
                                    if ((object7 = this.mCCComplaintAttachInfo) != null) {
                                        ((CCComplaintAttachInfo)object7).setContentType((String)object3);
                                    }
                                    if ((object7 = this.mCCComplaintAttachInfo) != null) {
                                        ((CCComplaintAttachInfo)object7).setFileName((String)object);
                                    }
                                } else {
                                    object2 = this.mCCTicketCreateQuery;
                                    if (object2 != null) {
                                        ((CCTicketCreateQuery)object2).setBase64String((String)object7);
                                    }
                                    if ((object7 = this.mCCTicketCreateQuery) != null) {
                                        ((CCTicketCreateQuery)object7).setContentType((String)object3);
                                    }
                                    if ((object7 = this.mCCTicketCreateQuery) != null) {
                                        ((CCTicketCreateQuery)object7).setFileName((String)object);
                                    }
                                }
                                this.checkAttachmentView();
                                object7 = this.qaItem;
                                if (object7 != null) {
                                    bl2 = this.isExpandable;
                                    if (bl2) {
                                        object2 = this.mCCComplaintAttachInfo;
                                        if (object2 != null) {
                                            object2 = ((CCComplaintAttachInfo)object2).getComments();
                                        } else {
                                            bl2 = false;
                                            object2 = null;
                                        }
                                        ((CCItemDetailsQAModel$CCItemQALists)object7).setComment((String)object2);
                                    } else {
                                        object2 = this.mCCTicketCreateQuery;
                                        if (object2 != null) {
                                            object2 = ((CCTicketCreateQuery)object2).getComments();
                                        } else {
                                            bl2 = false;
                                            object2 = null;
                                        }
                                        ((CCItemDetailsQAModel$CCItemQALists)object7).setComment((String)object2);
                                    }
                                    object7 = this.qaItem;
                                    if (object7 != null) {
                                        ((CCItemDetailsQAModel$CCItemQALists)object7).setAttachmentMimeType((String)object3);
                                    }
                                    if ((object7 = this.qaItem) != null) {
                                        object2 = this.mSelfCareFileHelper;
                                        if (object2 != null) {
                                            string2 = ty2_2.i((String)object);
                                        }
                                        ((CCItemDetailsQAModel$CCItemQALists)object7).setAttachmentFileName(string2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final void onFileReadResultForMultiFiles(Intent object) {
        int n3 = 0;
        float f5 = 0.0f;
        Object object2 = null;
        if ((object = object != null ? object.getData() : null) != null) {
            object.toString();
            Object object3 = this.getMActivity();
            if (object3 != null && (object3 = object3.getContentResolver()) != null) {
                object2 = object3.getType((Uri)object);
            }
            if (object2 != null) {
                object3 = "image";
                n3 = StringsKt.F(object2, (CharSequence)object3, false);
                if (n3 != 0) {
                    float f6;
                    object2 = this.mSelfCareFileHelper;
                    object3 = null;
                    if (object2 != null) {
                        object2 = this.getMActivity();
                        f5 = ty2_2.f((Context)object2, (Uri)object);
                    } else {
                        n3 = 0;
                        f5 = 0.0f;
                        object2 = null;
                    }
                    n3 = (f6 = f5 - 0.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
                    if (n3 <= 0) {
                        this.uploadError();
                        this.imageSelectedEvent(false);
                    } else {
                        this.resetFileSizeError();
                        this.showProgress();
                        this.startImageProcessing((Uri)object);
                    }
                } else {
                    this.setMultiImagePdfData((Uri)object);
                }
            }
        }
    }

    private static final void onSuccessImageProcess$lambda$11(CCItemHelpFragment cCItemHelpFragment, Object object) {
        int n3 = 0;
        Object object2 = null;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(cCItemHelpFragment, (String)object3);
        int n4 = cCItemHelpFragment.isReturnFlowOptimizationEnabled();
        int n7 = 1;
        if (n4 != 0) {
            n4 = object instanceof uy2_2;
            if (n4 != 0) {
                cCItemHelpFragment.imageSelectedEvent(n7 != 0);
                object = (uy2_2)object;
                cCItemHelpFragment.setMultiImageData((uy2_2)object);
            } else {
                cCItemHelpFragment.imageSelectedEvent(false);
                cCItemHelpFragment.uploadError();
            }
        } else {
            n4 = object instanceof uy2_2;
            if (n4 != 0) {
                object = (uy2_2)object;
                cCItemHelpFragment.setImageData((uy2_2)object);
            } else {
                object = (String)object;
                n4 = TextUtils.isEmpty((CharSequence)object);
                String string2 = "format(...)";
                if (n4 == 0) {
                    object3 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_alert_message;
                    object3 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n7];
                    objectArray[0] = object;
                    object2 = Arrays.copyOf(objectArray, n7);
                    object2 = String.format((String)object3, object2);
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    Intrinsics.checkNotNull(object);
                    cCItemHelpFragment.showNotification((String)object, (String)object2);
                } else {
                    object = StringCompanionObject.INSTANCE;
                    int n8 = R$string.acc_error_message;
                    object = hv3_0.K(n8);
                    n4 = R$string.something_wrong_msg;
                    object3 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n7];
                    objectArray[0] = object3;
                    object2 = Arrays.copyOf(objectArray, n7);
                    object = String.format((String)object, object2);
                    Intrinsics.checkNotNullExpressionValue(object, string2);
                    n3 = R$string.something_wrong_msg;
                    object2 = hv3_0.K(n3);
                    cCItemHelpFragment.showNotification((String)object2, (String)object);
                }
            }
        }
        cCItemHelpFragment.hideProgress();
    }

    private final void openCamera() {
        Object object = this.getMActivity();
        if (object != null) {
            boolean bl2;
            object = this.getMActivity();
            int n3 = 0;
            String string2 = null;
            if (object != null) {
                object = object.getExternalCacheDir();
            } else {
                bl2 = false;
                object = null;
            }
            if (object != null) {
                Object object2 = "/ComplaintDetails";
                File file = new File((File)object, (String)object2);
                file.mkdir();
                bl2 = file.exists();
                if (bl2) {
                    object = file.getAbsolutePath();
                    object2 = this.mSelfCareFileHelper;
                    if (object2 != null) {
                        object2 = "jpeg";
                        string2 = ty2_2.c("IMG", (String)object2);
                    }
                    file = new File((String)object, string2);
                    object = this.getMActivity();
                    Intrinsics.checkNotNull(object);
                    n3 = R$string.file_authority;
                    string2 = this.getString(n3);
                    object = FileProvider.d((Context)object, string2, file);
                    this.mImageCaptureUri = object;
                    object = new Intent("android.media.action.IMAGE_CAPTURE");
                    string2 = "output";
                    file = this.mImageCaptureUri;
                    object.putExtra(string2, (Parcelable)file);
                    n3 = 102;
                    this.startActivityForResult((Intent)object, n3);
                }
            }
        }
    }

    private final void performFileSearch() {
        AppCompatActivity appCompatActivity = this.getMActivity();
        if (appCompatActivity != null) {
            appCompatActivity = this.getMActivity();
            Intrinsics.checkNotNull(appCompatActivity);
            boolean bl2 = appCompatActivity.isFinishing();
            if (!bl2) {
                String[] stringArray = "android.intent.action.OPEN_DOCUMENT";
                appCompatActivity = new Intent((String)stringArray);
                stringArray = "android.intent.category.OPENABLE";
                appCompatActivity.addCategory((String)stringArray);
                stringArray = "*/*";
                appCompatActivity.setType((String)stringArray);
                stringArray = MIME_TYPE_IMG_JPG;
                String string2 = MIME_TYPE_IMG_PNG;
                String string3 = MIME_TYPE_PDF;
                stringArray = new String[]{stringArray, string2, string3};
                string2 = "android.intent.extra.MIME_TYPES";
                appCompatActivity.putExtra(string2, stringArray);
                int n3 = 101;
                try {
                    this.startActivityForResult((Intent)appCompatActivity, n3);
                }
                catch (Exception exception) {
                    stringArray = yn3_0.a;
                    stringArray.e(exception);
                }
            }
        }
    }

    private final void processBundle() {
        Object object = this.cCBundleViewModel;
        object = object != null ? ((xf_1)object).c : null;
        if (object != null) {
            boolean bl2;
            String string2;
            Object object2 = ((zq_1)object).a;
            boolean bl3 = object2 instanceof CCItemDetailsQAModel$CCItemQALists;
            if (bl3) {
                string2 = "null cannot be cast to non-null type com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel.CCItemQALists";
                Intrinsics.checkNotNull(object2, string2);
                this.qaItem = object2 = (CCItemDetailsQAModel$CCItemQALists)object2;
            }
            if (bl3 = TextUtils.isEmpty((CharSequence)(object2 = ((zq_1)object).d))) {
                object2 = "";
            }
            this.mOrderId = object2;
            this.isExpandable = bl2 = ((zq_1)object).g;
            if (bl2) {
                this.title = object2 = "Complaint Details";
            }
            this.isLuxeOrder = bl2 = ((zq_1)object).f;
            this.mIncidentId = object2 = ((zq_1)object).e;
            this.mOrderStatus = object2 = ((zq_1)object).b;
            this.mProductCode = object = ((zq_1)object).c;
            object = this.bundledatalist;
            object2 = this.cCBundleViewModel;
            Intrinsics.checkNotNull(object2);
            object2 = ((xf_1)object2).c;
            Intrinsics.checkNotNull(object2);
            object2 = String.valueOf(((zq_1)object2).b);
            ((HashMap)object).put("status", object2);
            object = this.bundledatalist;
            object2 = this.cCBundleViewModel;
            Intrinsics.checkNotNull(object2);
            object2 = ((xf_1)object2).c;
            Intrinsics.checkNotNull(object2);
            object2 = String.valueOf(((zq_1)object2).d);
            ((HashMap)object).put("order_id", object2);
            object = this.bundledatalist;
            object2 = this.cCBundleViewModel;
            Intrinsics.checkNotNull(object2);
            object2 = ((xf_1)object2).c;
            Intrinsics.checkNotNull(object2);
            object2 = String.valueOf(((zq_1)object2).c);
            string2 = "product_id";
            ((HashMap)object).put(string2, object2);
        }
    }

    private final void resetFileSizeError() {
        CCItemMultiFileAttachModel cCItemMultiFileAttachModel = this.attachModel;
        if (cCItemMultiFileAttachModel != null) {
            cCItemMultiFileAttachModel.setAttachmentError(null);
        }
        this.notifyAttachmentViewMultiFile();
    }

    private final void resetImageData() {
        Object object = this.mCCTicketCreateQuery;
        if (object != null) {
            ((CCTicketCreateQuery)object).setBase64String(null);
        }
        if ((object = this.mCCTicketCreateQuery) != null) {
            ((CCTicketCreateQuery)object).setContentType(null);
        }
        if ((object = this.mCCTicketCreateQuery) != null) {
            ((CCTicketCreateQuery)object).setFileName(null);
        }
        if ((object = this.mCCComplaintAttachInfo) != null) {
            ((CCComplaintAttachInfo)object).setBase64String(null);
        }
        if ((object = this.mCCComplaintAttachInfo) != null) {
            ((CCComplaintAttachInfo)object).setContentType(null);
        }
        if ((object = this.mCCComplaintAttachInfo) != null) {
            ((CCComplaintAttachInfo)object).setFileName(null);
        }
        if ((object = this.qaItem) != null) {
            ((CCItemDetailsQAModel$CCItemQALists)object).setAttachmentFilePath(null);
        }
        if ((object = this.qaItem) != null) {
            ((CCItemDetailsQAModel$CCItemQALists)object).setAttachmentFileName(null);
        }
    }

    private final void setImageData(uy2_2 object) {
        Object object2;
        Object object3 = ((uy2_2)object).a;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
        String string2 = null;
        if (bl2) {
            object3 = this.mSelfCareFileHelper;
            if (object3 != null) {
                object2 = "jpg";
                object3 = ty2_2.c("IMG", (String)object2);
            } else {
                bl2 = false;
                object3 = null;
            }
            ((uy2_2)object).a = object3;
        }
        bl2 = this.isExpandable;
        object2 = MIME_TYPE_IMG_JPG;
        if (bl2) {
            String string3;
            object3 = this.mCCComplaintAttachInfo;
            if (object3 != null) {
                string3 = ((uy2_2)object).b;
                ((CCComplaintAttachInfo)object3).setBase64String(string3);
            }
            if ((object3 = this.mCCComplaintAttachInfo) != null) {
                string3 = ((uy2_2)object).a;
                ((CCComplaintAttachInfo)object3).setFileName(string3);
            }
            if ((object3 = this.mCCComplaintAttachInfo) != null) {
                ((CCComplaintAttachInfo)object3).setContentType((String)object2);
            }
        } else {
            String string4;
            object3 = this.mCCTicketCreateQuery;
            if (object3 != null) {
                string4 = ((uy2_2)object).b;
                ((CCTicketCreateQuery)object3).setBase64String(string4);
            }
            if ((object3 = this.mCCTicketCreateQuery) != null) {
                string4 = ((uy2_2)object).a;
                ((CCTicketCreateQuery)object3).setFileName(string4);
            }
            if ((object3 = this.mCCTicketCreateQuery) != null) {
                ((CCTicketCreateQuery)object3).setContentType((String)object2);
            }
        }
        if ((object3 = this.qaItem) != null) {
            boolean bl3 = this.isExpandable;
            if (bl3) {
                Intrinsics.checkNotNull(object3);
                object2 = this.mCCComplaintAttachInfo;
                if (object2 != null) {
                    object2 = ((CCComplaintAttachInfo)object2).getComments();
                } else {
                    bl3 = false;
                    object2 = null;
                }
                ((CCItemDetailsQAModel$CCItemQALists)object3).setComment((String)object2);
            } else {
                Intrinsics.checkNotNull(object3);
                object2 = this.mCCTicketCreateQuery;
                if (object2 != null) {
                    object2 = ((CCTicketCreateQuery)object2).getComments();
                } else {
                    bl3 = false;
                    object2 = null;
                }
                ((CCItemDetailsQAModel$CCItemQALists)object3).setComment((String)object2);
            }
            object3 = this.qaItem;
            Intrinsics.checkNotNull(object3);
            object2 = this.mSelfCareFileHelper;
            if (object2 != null) {
                string2 = ty2_2.i(((uy2_2)object).a);
            }
            ((CCItemDetailsQAModel$CCItemQALists)object3).setAttachmentFileName(string2);
            object3 = ((uy2_2)object).c;
            bl2 = TextUtils.isEmpty((CharSequence)object3);
            if (!bl2) {
                object3 = this.qaItem;
                if (object3 != null) {
                    object = ((uy2_2)object).c;
                    ((CCItemDetailsQAModel$CCItemQALists)object3).setAttachmentFilePath((String)object);
                }
            } else {
                object3 = this.qaItem;
                if (object3 != null) {
                    object = ((uy2_2)object).e;
                    ((CCItemDetailsQAModel$CCItemQALists)object3).setAttachmentFileUri((Uri)object);
                }
            }
        }
        this.checkAttachmentView();
    }

    private final void setImageDialog() {
        Object object = this.getMActivity();
        if (object != null) {
            int n3;
            Object object2 = this.getMActivity();
            Intrinsics.checkNotNull(object2);
            object = new Dialog((Context)object2);
            this.imageDialog = object;
            int n4 = R$layout.dialog_attachment_image;
            object.setContentView(n4);
            object = this.imageDialog;
            n4 = 0;
            object2 = null;
            object = object != null ? object.getWindow() : null;
            if (object != null) {
                object = this.imageDialog;
                if (object != null && (object = object.getWindow()) != null) {
                    n3 = 17170445;
                    object.setBackgroundDrawableResource(n3);
                }
                if ((object = this.imageDialog) != null && (object = object.getWindow()) != null) {
                    n3 = mz3_0.d(290);
                    int n7 = mz3_0.d(570);
                    object.setLayout(n3, n7);
                }
            }
            object = this.imageDialog;
            n3 = 1;
            if (object != null) {
                object.setCancelable(n3 != 0);
            }
            if ((object = this.imageDialog) != null) {
                object.setCanceledOnTouchOutside(n3 != 0);
            }
            if ((object = this.imageDialog) != null) {
                n4 = R$id.preview_image;
                object2 = object = object.findViewById(n4);
                object2 = (LinearLayout)object;
            }
            if (object2 != null) {
                object = new tg_2(this);
                object2.setOnClickListener((View.OnClickListener)object);
            }
        }
    }

    private static final void setImageDialog$lambda$10(CCItemHelpFragment cCItemHelpFragment, View object) {
        object = "this$0";
        Intrinsics.checkNotNullParameter(cCItemHelpFragment, (String)object);
        cCItemHelpFragment = cCItemHelpFragment.imageDialog;
        if (cCItemHelpFragment != null) {
            cCItemHelpFragment.dismiss();
        }
    }

    private final void setMultiImageData(uy2_2 object) {
        int n3;
        Object object2 = ((uy2_2)object).a;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (bl2) {
            object2 = this.mSelfCareFileHelper;
            if (object2 != null) {
                String string2 = "jpg";
                object2 = ty2_2.c("IMG", string2);
            } else {
                bl2 = false;
                object2 = null;
            }
            ((uy2_2)object).a = object2;
        }
        if ((object2 = this.attachModel) != null && (object2 = ((CCItemMultiFileAttachModel)object2).getAttacheInfo()) != null && (object2 = ((CCComplaintAttachInfoNew)object2).getImageData()) != null && (n3 = object2.isEmpty() ^ 1) != 0) {
            n3 = xx_2.h((List)object2);
            int n4 = xx_2.h((List)object2);
            Object e2 = ((ArrayList)object2).get(n4);
            Object object3 = e2;
            object3 = (ImageData)e2;
            String string3 = ((uy2_2)object).a;
            String string4 = ((uy2_2)object).b;
            String string5 = ((uy2_2)object).c;
            Uri uri = ((uy2_2)object).e;
            String string6 = MIME_TYPE_IMG_JPG;
            object = ((ImageData)object3).copy(string3, string6, string4, string5, uri);
            ((ArrayList)object2).set(n3, object);
        }
        this.notifyAttachmentViewMultiFile();
    }

    private final void setMultiImagePdfData(Uri object) {
        float f5;
        Object object2;
        float f6;
        int n3 = 1;
        Object object3 = null;
        Object object4 = this.mSelfCareFileHelper;
        int n4 = 0;
        float f7 = 0.0f;
        Object object5 = null;
        if (object4 != null) {
            object4 = this.getMActivity();
            f6 = ty2_2.f((Context)object4, object);
        } else {
            object2 = 0;
            f6 = 0.0f;
            object4 = null;
        }
        n4 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
        if (n4 == 0) {
            this.imageSelectedEvent(false);
            object = StringCompanionObject.INSTANCE;
            int n7 = R$string.acc_error_message;
            object = hv3_0.K(n7);
            object2 = R$string.something_wrong_msg;
            object4 = hv3_0.K(object2);
            object5 = new Object[n3];
            object5[0] = object4;
            Object object6 = Arrays.copyOf(object5, n3);
            object = String.format((String)object, object6);
            Intrinsics.checkNotNullExpressionValue(object, "format(...)");
            n3 = R$string.something_wrong_msg;
            object6 = hv3_0.K(n3);
            this.showNotification((String)object6, (String)object);
        } else {
            n4 = 1065353216;
            f7 = 1.0f;
            float f8 = f6 - f7;
            object2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object2 > 0) {
                this.imageSelectedEvent(false);
                this.fileSizeError();
            } else {
                Object object7;
                this.resetFileSizeError();
                object3 = this.mSelfCareFileHelper;
                object2 = 0;
                f6 = 0.0f;
                object4 = null;
                Object object8 = object3 != null ? (object3 = ty2_2.b((Context)this.getMActivity(), object)) : null;
                object3 = this.mSelfCareFileHelper;
                object3 = object3 != null ? ty2_2.e((Context)this.getMActivity(), object) : null;
                n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                if (n4 != 0) {
                    object3 = this.mSelfCareFileHelper;
                    if (object3 != null) {
                        object3 = "PDF";
                        object4 = ty2_2.c((String)object3, "pdf");
                    }
                    object7 = object4;
                } else {
                    object7 = object3;
                }
                object3 = this.attachModel;
                if (object3 != null && (object3 = ((CCItemMultiFileAttachModel)object3).getAttacheInfo()) != null && (object3 = ((CCComplaintAttachInfoNew)object3).getImageData()) != null && (object2 = object3.isEmpty() ^ n3) != 0) {
                    object2 = xx_2.h((List)object3);
                    n4 = xx_2.h((List)object3);
                    object5 = (ImageData)((ArrayList)object3).get(n4);
                    String string2 = MIME_TYPE_PDF;
                    object = ((ImageData)object5).copy((String)object7, string2, (String)object8, null, (Uri)object);
                    ((ArrayList)object3).set((int)object2, object);
                }
                this.imageSelectedEvent(n3 != 0);
                this.notifyAttachmentViewMultiFile();
            }
        }
    }

    private final void setToolbarUI(String string2) {
        Object object = this.customToolbarViewMerger;
        int n3 = 0;
        Object object2 = null;
        if ((object = object != null ? ((CustomToolbarViewMerger)object).getToolbar() : null) != null) {
            object = this.customToolbarViewMerger;
            if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
                object.invalidate();
            }
            if ((object = this.getMActivity()) != null) {
                CustomToolbarViewMerger customToolbarViewMerger = this.customToolbarViewMerger;
                if (customToolbarViewMerger != null) {
                    object2 = customToolbarViewMerger.getToolbar();
                }
                ((AppCompatActivity)object).setSupportActionBar((Toolbar)object2);
            }
        }
        object2 = Looper.getMainLooper();
        object = new Handler(object2);
        object2 = new ug_2(this);
        long l2 = 300L;
        object.postDelayed((Runnable)object2, l2);
        object = this.customToolbarViewMerger;
        if (object != null) {
            ((CustomToolbarViewMerger)object).setNavigationClick();
        }
        if ((object = this.customToolbarViewMerger) != null) {
            n3 = 8;
            ((CustomToolbarViewMerger)object).setSubTitleVisibility(n3);
        }
        if ((object = this.customToolbarViewMerger) != null) {
            ((CustomToolbarViewMerger)object).setTitleText(string2);
        }
    }

    private static final void setToolbarUI$lambda$0(CCItemHelpFragment object) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((CCItemHelpFragment)object).customToolbarViewMerger;
        if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
            ai0_2.a((View)object);
        }
    }

    private final void showImageDialog(String object, Uri uri) {
        Dialog dialog = this.imageDialog;
        if (dialog != null) {
            if (dialog != null) {
                int n3 = R$id.attachment_image;
                dialog = (ImageView)dialog.findViewById(n3);
            } else {
                dialog = null;
            }
            boolean bl2 = TextUtils.isEmpty((CharSequence)object);
            if (!bl2) {
                if (dialog != null) {
                    object = this.qaItem;
                    Intrinsics.checkNotNull(object);
                    object = ((CCItemDetailsQAModel$CCItemQALists)object).getAttachmentFilePath();
                    int n4 = 1;
                    object = ty2_2.d(n4, (String)object);
                    dialog.setImageBitmap((Bitmap)object);
                }
            } else if (uri != null && dialog != null) {
                dialog.setImageURI(uri);
            }
            if ((object = this.imageDialog) != null) {
                object.show();
            }
        }
    }

    private final void showNotification(String string2, String string3) {
        pf_1 pf_12 = this.getCcActivityListener();
        if (pf_12 != null) {
            AJIOApplication.Companion.getClass();
            AJIOApplication aJIOApplication = AJIOApplication$a.a();
            int n3 = 1;
            pf_12.showToastNotification((Context)aJIOApplication, string2, n3, string3);
        }
    }

    private final void showProgress() {
        pf_1 pf_12 = this.getCcActivityListener();
        if (pf_12 != null) {
            pf_12.startLoader();
        }
    }

    private final void startCamera() {
        String[] stringArray = this.getMActivity();
        if (stringArray != null) {
            stringArray = this.getMActivity();
            Intrinsics.checkNotNull(stringArray);
            String string2 = "android.permission.CAMERA";
            int n3 = t70.checkSelfPermission((Context)stringArray, string2);
            if (n3 == 0) {
                this.openCamera();
            } else {
                stringArray = new String[]{string2};
                int n4 = 201;
                this.requestPermissions(stringArray, n4);
            }
        }
    }

    private final void startImageProcessing(Uri object) {
        block9: {
            Object object2 = this.getContext();
            Object object3 = this.mSelfCareFileHelper;
            Object object4 = new me1_2((Context)object2, (ty2_2)object3);
            object2 = this.onSuccessImageProcess;
            object3 = this.onErrorImageProcess;
            object = ((me1_2)object4).a((Uri)object, (o60_0)object2, (o60_0)object3);
            if (object == null) break block9;
            object4 = this.compositeDisposable;
            if (object4 == null) break block9;
            try {
                ((t30_0)object4).b((yr0_2)object);
            }
            catch (Exception exception) {
                object4 = yn3_0.a;
                ((yn3$a)object4).e(exception);
            }
        }
    }

    private final void uploadError() {
        CCItemMultiFileAttachModel cCItemMultiFileAttachModel = this.attachModel;
        if (cCItemMultiFileAttachModel != null) {
            int n3 = R$string.cc_upload_failed;
            String string2 = this.getString(n3);
            cCItemMultiFileAttachModel.setAttachmentError(string2);
        }
        this.notifyAttachmentViewMultiFile();
    }

    public final CCItemMultiFileAttachModel getAttachModel() {
        return this.attachModel;
    }

    public final xf_1 getCCBundleViewModel() {
        return this.cCBundleViewModel;
    }

    public final t30_0 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final CustomToolbarViewMerger getCustomToolbarViewMerger() {
        return this.customToolbarViewMerger;
    }

    public final Dialog getImageDialog() {
        return this.imageDialog;
    }

    public final int getMAttachmentIndex() {
        return this.mAttachmentIndex;
    }

    public final CCAttachmentListener getMCCAttachmentListener() {
        return this.mCCAttachmentListener;
    }

    public final CCComplaintAttachInfo getMCCComplaintAttachInfo() {
        return this.mCCComplaintAttachInfo;
    }

    public final CCComplaintDetailInfo getMCCComplaintDetailInfo() {
        return this.mCCComplaintDetailInfo;
    }

    public final CCItemHelpAdapter getMCCItemHelpAdapter() {
        return this.mCCItemHelpAdapter;
    }

    public final CCTicketCreateQuery getMCCTicketCreateQuery() {
        return this.mCCTicketCreateQuery;
    }

    public final CCViewModel getMCCViewModel() {
        return this.mCCViewModel;
    }

    public final int getMHelpBtnIndex() {
        return this.mHelpBtnIndex;
    }

    public final Uri getMImageCaptureUri() {
        return this.mImageCaptureUri;
    }

    public final String getMIncidentId() {
        return this.mIncidentId;
    }

    public final String getMOrderId() {
        return this.mOrderId;
    }

    public final String getMOrderStatus() {
        return this.mOrderStatus;
    }

    public final String getMProductCode() {
        return this.mProductCode;
    }

    public final RecyclerView getMRecyclerView() {
        return this.mRecyclerView;
    }

    public final ty2_2 getMSelfCareFileHelper() {
        return this.mSelfCareFileHelper;
    }

    public final ArrayList getMViewDataList() {
        return this.mViewDataList;
    }

    public final o60_0 getOnErrorImageProcess() {
        return this.onErrorImageProcess;
    }

    public final o60_0 getOnSuccessImageProcess() {
        return this.onSuccessImageProcess;
    }

    public final CCItemDetailsQAModel$CCItemQALists getQaItem() {
        return this.qaItem;
    }

    public final String getTitle() {
        return this.title;
    }

    public final li3_1 getWorkManager() {
        return this.workManager;
    }

    public final boolean isExpandable() {
        return this.isExpandable;
    }

    public final boolean isLuxeOrder() {
        return this.isLuxeOrder;
    }

    public void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
        object = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        E$b e$b = object.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(e$b, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        object2 = new pD3((rd3_0)object3, e$b, (Wd0)object);
        object = CCViewModel.class;
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object = rn1_2.c((Class)object);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object, "<this>");
        object3 = object.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.mCCViewModel = object = (CCViewModel)((pD3)object2).a((yn1_2)object, (String)object3);
            this.initObservables();
            this.getComplaintDetail();
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public void onActivityResult(int n3, int n4, Intent object) {
        int n7 = 0;
        int n8 = 1;
        int n10 = 102;
        int n14 = -1;
        if (n3 == n10) {
            if (n4 != n14) {
                if (n4 == 0) {
                    Object object2 = StringCompanionObject.INSTANCE;
                    n3 = R$string.acc_alert_message;
                    object2 = hv3_0.K(n3);
                    String string2 = "Cancelled";
                    object = new Object[n8];
                    object[0] = string2;
                    object = Arrays.copyOf(object, n8);
                    object2 = String.format((String)object2, object);
                    object = "format(...)";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                    mq0_2.c(string2, (String)object2);
                }
            } else {
                this.showProgress();
                Uri uri = this.mImageCaptureUri;
                this.startImageProcessing(uri);
            }
        } else {
            n8 = 101;
            if (n3 == n8 && n4 == n14) {
                n3 = (int)(this.isReturnFlowOptimizationEnabled() ? 1 : 0);
                if (n3 != 0) {
                    this.onFileReadResultForMultiFiles((Intent)object);
                } else {
                    this.onFileReadResult((Intent)object);
                }
            } else {
                n8 = 1001;
                if (n3 == n8 && n4 == n14) {
                    if (object != null) {
                        String string3 = CLICK_TYPE;
                        n4 = object.getIntExtra(string3, 0);
                        if (n4 == (n8 = 201)) {
                            this.performFileSearch();
                        } else {
                            n3 = object.getIntExtra(string3, 0);
                            if (n3 == (n4 = 202)) {
                                this.startCamera();
                            }
                        }
                    }
                } else {
                    String string4;
                    n7 = 1002;
                    if (n3 == n7 && n4 == n14 && object != null && (n4 = (int)(TextUtils.isEmpty((CharSequence)(string4 = object.getStringExtra(INCIDENT_ID))) ? 1 : 0)) == 0) {
                        this.showProgress();
                        CCViewModel cCViewModel = this.mCCViewModel;
                        if (cCViewModel != null) {
                            Intrinsics.checkNotNull(string4);
                            cCViewModel.getCCComplaintDetail(string4);
                        }
                    }
                }
            }
        }
    }

    public void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof OnFragmentInteractionListener;
        if (bl2) {
            object = (OnFragmentInteractionListener)object;
            this.mListener = object;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object object = this.getMActivity();
        Intrinsics.checkNotNull(object);
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object4 = object.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(object4, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        object2 = new pD3((rd3_0)object3, (E$b)object4, (Wd0)object);
        object = xf_1.class;
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object4 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        object = Reflection.getOrCreateKotlinClass(object);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object, (String)object4);
        object3 = object.getQualifiedName();
        if (object3 != null) {
            int n3;
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.cCBundleViewModel = object = (xf_1)((pD3)object2).a((yn1_2)object, (String)object3);
            this.customToolbarViewMerger = object = new CustomToolbarViewMerger(this);
            this.compositeDisposable = object = new t30_0();
            this.mSelfCareFileHelper = object = new ty2_2(true);
            object3 = object;
            this.mCCTicketCreateQuery = object = new CCTicketCreateQuery(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
            this.mAttachmentIndex = n3 = -1;
            this.mHelpBtnIndex = n3;
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            Intrinsics.checkNotNullParameter(object, "context");
            object = ni3_1.i((Context)object);
            Intrinsics.checkNotNullExpressionValue(object, "getInstance(context)");
            this.workManager = object;
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_ccitemhelp_refresh;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "inflate(...)");
        object = this.customToolbarViewMerger;
        Intrinsics.checkNotNull(object);
        ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        return layoutInflater;
    }

    public void onDestroy() {
        boolean bl2;
        Object object = this.cCBundleViewModel;
        if (object != null) {
            ((xf_1)object).c = null;
        }
        super.onDestroy();
        object = this.compositeDisposable;
        if (object != null && !(bl2 = ((t30_0)object).b) && (object = this.compositeDisposable) != null) {
            ((t30_0)object).d();
        }
    }

    public void onNavigationClick() {
        boolean bl2;
        AppCompatActivity appCompatActivity = this.getMActivity();
        if (appCompatActivity != null && !(bl2 = appCompatActivity.isFinishing()) && (appCompatActivity = this.getMActivity()) != null) {
            appCompatActivity.onBackPressed();
        }
    }

    public void onRequestPermissionsResult(int n3, String[] object, int[] nArray) {
        Intrinsics.checkNotNullParameter(object, "permissions");
        String string2 = "grantResults";
        Intrinsics.checkNotNullParameter(nArray, string2);
        int n4 = 201;
        if (n3 == n4) {
            n3 = 0;
            string2 = "android.permission.CAMERA";
            boolean bl2 = Intrinsics.areEqual(object = object[0], string2);
            if (bl2 && (n3 = nArray[0]) == 0) {
                this.openCamera();
            }
        }
    }

    public void onResume() {
        super.onResume();
        NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
        String string2 = this.newEEcommerceEventsRevamp.getPrevScreen();
        String string3 = this.newEEcommerceEventsRevamp.getPrevScreenType();
        newCustomEventsRevamp.newPushCustomScreenView("customer care - item details - faq screen", "customer care screen", string2, null, string3);
    }

    public void onStop() {
        super.onStop();
        this.newEEcommerceEventsRevamp.setPreviousScreenData("customer care - item details - faq screen", "customer care screen");
    }

    public void onViewCreated(View view, Bundle bundle) {
        Object object;
        CCItemHelpFragment cCItemHelpFragment = this;
        Object object2 = view;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(view, (String)object3);
        super.onViewCreated(view, bundle);
        int bl2 = R$id.fragment_ccitemhelp_rv;
        object2 = (RecyclerView)view.findViewById(bl2);
        this.mRecyclerView = object2;
        if (object2 != null) {
            object = this.requireActivity();
            object3 = new LinearLayoutManager((Context)object);
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object3);
        }
        if ((object2 = cCItemHelpFragment.mRecyclerView) != null) {
            boolean bl3 = true;
            ((RecyclerView)object2).setHasFixedSize(bl3);
        }
        int n3 = 8191;
        object = object2;
        cCItemHelpFragment.mCCTicketCreateQuery = object2 = new CCTicketCreateQuery(null, null, null, null, null, null, null, null, null, null, null, false, null, n3, null);
        cCItemHelpFragment.mCCComplaintAttachInfo = object2 = new CCComplaintAttachInfo();
        this.initAttachmentModel();
        this.setImageDialog();
        this.processBundle();
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushOpenScreenEvent("customer care - item details - faq screen");
        object2 = cCItemHelpFragment.title;
        cCItemHelpFragment.setToolbarUI((String)object2);
        object2 = cCItemHelpFragment.qaItem;
        boolean bl4 = false;
        object3 = null;
        object = "RAISE COMPLAINT";
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            boolean bl5 = ((CCItemDetailsQAModel$CCItemQALists)object2).getIsComplaint();
            if (!bl5) {
                object = "Continue Shopping";
            }
            cCItemHelpFragment.createViewDataList(false, (String)object, null);
        } else {
            cCItemHelpFragment.createViewDataList(false, (String)object, null);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onViewItemClick(Object var1_1, int var2_2) {
        block83: {
            block84: {
                block85: {
                    block88: {
                        block89: {
                            block86: {
                                block87: {
                                    var3_3 = this;
                                    var4_4 = var1_1;
                                    var5_5 = var2_2;
                                    var6_6 = false;
                                    var7_7 = null;
                                    var8_8 = 1;
                                    var9_9 = this.getMActivity();
                                    if (var9_9 == null) break block83;
                                    var9_9 = this.getMActivity();
                                    Intrinsics.checkNotNull(var9_9);
                                    var10_10 = var9_9.isFinishing();
                                    if (var10_10 != 0) break block83;
                                    if (var2_2 == 0) break block84;
                                    var10_10 = 9;
                                    var11_11 = "selfCare item page";
                                    var12_12 = "_";
                                    var13_13 = 0;
                                    var14_14 = null;
                                    if (var2_2 == var10_10) break block85;
                                    var10_10 = 23;
                                    var15_15 = "yyyy-MM-dd";
                                    var16_17 = "complaint detail page";
                                    var17_19 = "format(...)";
                                    if (var2_2 == var10_10) break block86;
                                    var10_10 = 25;
                                    if (var2_2 == var10_10) break block87;
                                    var10_10 = 28;
                                    if (var2_2 == var10_10) ** GOTO lbl-1000
                                    var10_10 = 29;
                                    if (var2_2 == var10_10) ** GOTO lbl420
                                    var10_10 = 31;
                                    if (var2_2 == var10_10) ** GOTO lbl393
                                    var10_10 = 32;
                                    if (var2_2 == var10_10) ** GOTO lbl326
                                    switch (var2_2) {
                                        default: {
                                            switch (var2_2) {
                                                default: {
                                                    break;
                                                }
                                                case 21: {
                                                    var18_21 = this.getMActivity();
                                                    if (var18_21 != null) {
                                                        var4_4 = (String)var1_1;
                                                        var18_21 = new Bundle();
                                                        var7_7 = "product_code";
                                                        var18_21.putString((String)var7_7, (String)var4_4);
                                                        var18_21.putBoolean("CLEAR_STACK", (boolean)var8_8);
                                                        var18_21.putBoolean("is_from_customer_care_page", (boolean)var8_8);
                                                        var4_4 = this.mListener;
                                                        if (var4_4 != null) {
                                                            var7_7 = "";
                                                            var8_8 = 35;
                                                            var4_4.onFragmentInteraction((String)var7_7, var8_8, (Bundle)var18_21);
                                                            break;
                                                        }
                                                    }
                                                    break block83;
                                                }
                                                case 20: {
                                                    var4_4 = this.getCcActivityListener();
                                                    if (var4_4 != null) {
                                                        var5_5 = 102;
                                                        var4_4.addFragment(var5_5, null, (boolean)var8_8);
                                                        break;
                                                    }
                                                    break block83;
                                                }
                                                case 19: {
                                                    this.resetImageData();
                                                    break;
                                                }
                                            }
                                            break block83;
                                        }
                                        case 17: {
                                            var4_4 = this.getMActivity();
                                            if (var4_4 != null) {
                                                var4_4 = this.qaItem;
                                                if (var4_4 != null) {
                                                    var4_4 = var4_4.getAttachmentFilePath();
                                                } else {
                                                    var19_33 = false;
                                                    var4_4 = null;
                                                }
                                                var19_33 = TextUtils.isEmpty((CharSequence)var4_4);
                                                if (!var19_33) {
                                                    var4_4 = var3_3.qaItem;
                                                    if (var4_4 != null) {
                                                        var4_4 = var4_4.getAttachmentFilePath();
                                                    } else {
                                                        var19_33 = false;
                                                        var4_4 = null;
                                                    }
                                                    var3_3.showImageDialog((String)var4_4, null);
                                                    break;
                                                }
                                                var4_4 = var3_3.qaItem;
                                                if (var4_4 != null) {
                                                    var4_4 = var4_4.getAttachmentFileUri();
                                                } else {
                                                    var19_33 = false;
                                                    var4_4 = null;
                                                }
                                                if (var4_4 != null) {
                                                    var4_4 = var3_3.qaItem;
                                                    Intrinsics.checkNotNull(var4_4);
                                                    var4_4 = var4_4.getAttachmentFileUri();
                                                    var3_3.showImageDialog(null, (Uri)var4_4);
                                                    break;
                                                }
                                            }
                                            break block83;
                                        }
                                        case 15: {
                                            var19_34 = this.isExpandable;
                                            if (var19_34 != 0) {
                                                var4_4 = this.mCCComplaintDetailInfo;
                                                if (var4_4 != null) {
                                                    var4_4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                                    var18_22 /* !! */  = this.mCCComplaintDetailInfo;
                                                    Intrinsics.checkNotNull(var18_22 /* !! */ );
                                                    var18_22 /* !! */  = var18_22 /* !! */ .getTicketId();
                                                    var9_9 = this.mCCComplaintDetailInfo;
                                                    Intrinsics.checkNotNull(var9_9);
                                                    var9_9 = var9_9.getOrderCode();
                                                    var11_11 = this.mCCComplaintDetailInfo;
                                                    Intrinsics.checkNotNull(var11_11);
                                                    var11_11 = var11_11.getIncidentStatus();
                                                    var15_15 = "Complaintcard_NotResolved_";
                                                    var14_14 = new StringBuilder((String)var15_15);
                                                    var14_14.append((String)var18_22 /* !! */ );
                                                    var14_14.append((String)var12_12);
                                                    var14_14.append((String)var9_9);
                                                    var14_14.append((String)var12_12);
                                                    var14_14.append((String)var11_11);
                                                    var18_22 /* !! */  = var14_14.toString();
                                                    var9_9 = "Selfcare \u2013 User feeback complaint not resolved on complaint card details";
                                                    var4_4.pushButtonTapEvent((String)var9_9, var18_22 /* !! */ , (String)var16_17);
                                                }
                                                var4_4 = z40_0.Companion;
                                                AJIOApplication.Companion.getClass();
                                                var18_22 /* !! */  = AJIOApplication$a.a();
                                                var4_4.getClass();
                                                var4_4 = z40$a.a((Context)var18_22 /* !! */ ).a;
                                                var18_22 /* !! */  = "Selfcare_Complaint_Card_reopened";
                                                var19_34 = var4_4.a((String)var18_22 /* !! */ );
                                                if (var19_34 != 0 && (var4_4 = this.getMActivity()) != null) {
                                                    var4_4 = var3_3.mCCViewModel;
                                                    if (var4_4 != null) {
                                                        var18_22 /* !! */  = var3_3.mCCComplaintDetailInfo;
                                                        var4_4.setCcComplaintDetailInfo((CCComplaintDetailInfo)var18_22 /* !! */ );
                                                    }
                                                    var4_4 = new CCReopenComplaintBottomSheetRefresh();
                                                    var5_5 = 1002;
                                                    var4_4.setTargetFragment(var3_3, var5_5);
                                                    var18_22 /* !! */  = this.getMActivity();
                                                    Intrinsics.checkNotNull(var18_22 /* !! */ );
                                                    var18_22 /* !! */  = var18_22 /* !! */ .getSupportFragmentManager();
                                                    var7_7 = "ReOpenComplaint";
                                                    var4_4.show((FragmentManager)var18_22 /* !! */ , (String)var7_7);
                                                    break;
                                                }
                                                var4_4 = StringCompanionObject.INSTANCE;
                                                var19_34 = R$string.acc_alert_message;
                                                var4_4 = hv3_0.K(var19_34);
                                                var18_22 /* !! */  = hv3_0.K(R$string.thanks_feedback);
                                                var9_9 = new Object[var8_8];
                                                var9_9[0] = var18_22 /* !! */ ;
                                                var18_22 /* !! */  = Arrays.copyOf(var9_9, var8_8);
                                                var4_4 = String.format((String)var4_4, var18_22 /* !! */ );
                                                Intrinsics.checkNotNullExpressionValue(var4_4, var17_19);
                                                var5_5 = R$string.thanks_feedback;
                                                var18_22 /* !! */  = hv3_0.K(var5_5);
                                                mq0_2.c(var18_22 /* !! */ , (String)var4_4);
                                                break;
                                            }
                                            var4_4 = this.qaItem;
                                            if (var4_4 != null) {
                                                Intrinsics.checkNotNull(var4_4);
                                                var4_4 = var4_4.getQuestion();
                                                var5_5 = (int)TextUtils.isEmpty((CharSequence)var4_4);
                                                if (var5_5 == 0) {
                                                    var18_23 = this.mOrderId;
                                                    var5_5 = (int)TextUtils.isEmpty((CharSequence)var18_23);
                                                    var7_7 = "Was_Not_Helpful_Clicked_";
                                                    if (var5_5 == 0) {
                                                        var18_23 = this.mOrderId;
                                                        var20_40 = new StringBuilder((String)var7_7);
                                                        var20_40.append((String)var18_23);
                                                        var20_40.append((String)var12_12);
                                                        var20_40.append((String)var4_4);
                                                        var18_23 = var20_40.toString();
                                                    } else {
                                                        var18_23 = new StringBuilder((String)var7_7);
                                                        var18_23.append((String)var4_4);
                                                        var18_23 = var18_23.toString();
                                                    }
                                                    var7_7 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                                    var20_40 = new StringBuilder();
                                                    var20_40.append((String)var18_23);
                                                    var20_40.append((String)var4_4);
                                                    var18_23 = var20_40.toString();
                                                    var7_7.pushButtonTapEvent(var18_23, (String)var11_11);
                                                    var12_12 = var3_3.newCustomEventsRevamp;
                                                    var14_14 = var12_12.getEC_FAQ_INTERACTION();
                                                    var7_7 = "thumbs down - ";
                                                    var18_23 = new StringBuilder((String)var7_7);
                                                    var18_23.append((String)var4_4);
                                                    var16_17 = var18_23.toString();
                                                    var21_44 = var3_3.previousScreen;
                                                    var4_4 = var3_3.previousScreenType;
                                                    var15_15 = "faq feedback";
                                                    var17_19 = "faq_feedback";
                                                    var22_47 = "consolidated order details screen";
                                                    var23_52 = "order management screen";
                                                    var24_56 = null;
                                                    var25_59 = 1536;
                                                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var12_12, (String)var14_14, (String)var15_15, (String)var16_17, var17_19, var22_47, var23_52, var21_44, null, (String)var4_4, false, null, var25_59, null);
                                                    var4_4 = var3_3.ccCustomEvent;
                                                    var26_62 = var3_3.newCustomEventsRevamp.getEC_SELF_CARE_INTERACTION();
                                                    var27_65 = var3_3.newCustomEventsRevamp.getEA_WAS_THAT_HELPFUL_THUMBS_DOWN();
                                                    var18_23 = var3_3.bundledatalist;
                                                    var28_68 = "thums up";
                                                    var29_71 = "customer care - item details - faq screen";
                                                    var30_74 = var18_23;
                                                    var4_4.a(var26_62, var27_65, var28_68, var29_71, (HashMap)var18_23);
                                                    break;
                                                }
                                            }
                                            break block83;
                                        }
                                        case 14: {
                                            var19_35 = this.isExpandable;
                                            if (var19_35 != 0) {
                                                var4_4 = this.mCCComplaintDetailInfo;
                                                if (var4_4 != null) {
                                                    var4_4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                                    var18_24 /* !! */  = this.mCCComplaintDetailInfo;
                                                    Intrinsics.checkNotNull(var18_24 /* !! */ );
                                                    var18_24 /* !! */  = var18_24 /* !! */ .getTicketId();
                                                    var9_9 = this.mCCComplaintDetailInfo;
                                                    Intrinsics.checkNotNull(var9_9);
                                                    var9_9 = var9_9.getOrderCode();
                                                    var11_11 = this.mCCComplaintDetailInfo;
                                                    Intrinsics.checkNotNull(var11_11);
                                                    var11_11 = var11_11.getIncidentStatus();
                                                    var14_14 = this.mCCComplaintDetailInfo;
                                                    Intrinsics.checkNotNull(var14_14);
                                                    var31_78 = var14_14.getResolutionBy();
                                                    var14_14 = k7.f(var31_78, (String)var15_15);
                                                    var22_48 = "Complaintcard_SuccesfullyResolved_";
                                                    var15_15 = new StringBuilder(var22_48);
                                                    var15_15.append((String)var18_24 /* !! */ );
                                                    var15_15.append((String)var12_12);
                                                    var15_15.append((String)var9_9);
                                                    var15_15.append((String)var12_12);
                                                    var15_15.append((String)var11_11);
                                                    var15_15.append((String)var12_12);
                                                    var15_15.append((String)var14_14);
                                                    var18_24 /* !! */  = var15_15.toString();
                                                    var9_9 = "Selfcare \u2013 User feeback complaint successfully resolved on complaint card details";
                                                    var4_4.pushButtonTapEvent((String)var9_9, var18_24 /* !! */ , (String)var16_17);
                                                }
                                                var4_4 = StringCompanionObject.INSTANCE;
                                                var19_35 = R$string.acc_alert_message;
                                                var4_4 = hv3_0.K(var19_35);
                                                var18_24 /* !! */  = hv3_0.K(R$string.thanks_feedback);
                                                var9_9 = new Object[var8_8];
                                                var9_9[0] = var18_24 /* !! */ ;
                                                var18_24 /* !! */  = Arrays.copyOf(var9_9, var8_8);
                                                var4_4 = String.format((String)var4_4, var18_24 /* !! */ );
                                                Intrinsics.checkNotNullExpressionValue(var4_4, var17_19);
                                                var5_5 = R$string.thanks_feedback;
                                                var18_24 /* !! */  = hv3_0.K(var5_5);
                                                mq0_2.c((String)var18_24 /* !! */ , (String)var4_4);
                                                break;
                                            }
                                            var4_4 = this.qaItem;
                                            if (var4_4 != null) {
                                                Intrinsics.checkNotNull(var4_4);
                                                var4_4 = var4_4.getQuestion();
                                                var5_5 = (int)TextUtils.isEmpty((CharSequence)var4_4);
                                                if (var5_5 == 0) {
                                                    var18_25 = this.mOrderId;
                                                    var5_5 = (int)TextUtils.isEmpty((CharSequence)var18_25);
                                                    var7_7 = "Was_Helpful_Clicked_";
                                                    if (var5_5 == 0) {
                                                        var18_25 = this.mOrderId;
                                                        var20_41 = new StringBuilder((String)var7_7);
                                                        var20_41.append((String)var18_25);
                                                        var20_41.append((String)var12_12);
                                                        var20_41.append((String)var4_4);
                                                        var18_25 = var20_41.toString();
                                                    } else {
                                                        var18_25 = new StringBuilder((String)var7_7);
                                                        var18_25.append((String)var4_4);
                                                        var18_25 = var18_25.toString();
                                                    }
                                                    AnalyticsManager.Companion.getInstance().getGtmEvents().pushButtonTapEvent(var18_25, (String)var11_11);
                                                    var12_12 = var3_3.newCustomEventsRevamp;
                                                    var14_14 = var12_12.getEC_FAQ_INTERACTION();
                                                    var7_7 = "thumbs up - ";
                                                    var18_25 = new StringBuilder((String)var7_7);
                                                    var18_25.append((String)var4_4);
                                                    var16_17 = var18_25.toString();
                                                    var21_45 = var3_3.previousScreen;
                                                    var4_4 = var3_3.previousScreenType;
                                                    var15_15 = "faq feedback";
                                                    var17_19 = "faq_feedback";
                                                    var22_49 = "consolidated order details screen";
                                                    var23_53 = "order management screen";
                                                    var24_57 = null;
                                                    var25_60 = 1536;
                                                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var12_12, (String)var14_14, (String)var15_15, (String)var16_17, var17_19, var22_49, var23_53, var21_45, null, (String)var4_4, false, null, var25_60, null);
                                                    var4_4 = var3_3.ccCustomEvent;
                                                    var26_63 = var3_3.newCustomEventsRevamp.getEC_SELF_CARE_INTERACTION();
                                                    var27_66 = var3_3.newCustomEventsRevamp.getEA_WAS_THAT_HELPFUL_THUMBS_UP();
                                                    var18_25 = var3_3.bundledatalist;
                                                    var28_69 = "thums up";
                                                    var29_72 = "customer care - item details - faq screen";
                                                    var30_75 = var18_25;
                                                    var4_4.a(var26_63, var27_66, var28_69, var29_72, (HashMap)var18_25);
                                                    break;
                                                }
                                            }
                                            break block83;
                                        }
lbl326:
                                        // 1 sources

                                        var4_4 = this.newCustomEventsRevamp;
                                        var33_80 = this.newEEcommerceEventsRevamp.getPrevScreen();
                                        var18_26 = this.newEEcommerceEventsRevamp;
                                        var34_81 = var18_26.getPrevScreenType();
                                        var35_82 = this.getEventLabel();
                                        var36_83 = "complaint card screen interactions";
                                        var37_85 = "submit";
                                        var38_87 = "complaint_card_screen_interactions";
                                        var39_88 = "complaint card screen";
                                        var40_89 = 1696;
                                        var30_76 = var4_4;
                                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var4_4, var36_83, var37_85, var35_82, var38_87, var39_88, null, var33_80, null, var34_81, false, null, var40_89, null);
                                        var4_4 = this.mCCComplaintDetailInfo;
                                        if (var4_4 != null) {
                                            var4_4 = var4_4.isImageMandatory();
                                            var18_26 = Boolean.TRUE;
                                            var19_36 = Intrinsics.areEqual(var4_4, var18_26);
                                        } else {
                                            var19_36 = 0;
                                            var4_4 = null;
                                        }
                                        if (var19_36 != 0) {
                                            var4_4 = var3_3.attachModel;
                                            if (var4_4 != null && (var4_4 = var4_4.getAttacheInfo()) != null && (var4_4 = var4_4.getImageData()) != null && (var19_36 = var4_4.isEmpty()) == var8_8) {
                                                var19_36 = 1;
                                            } else {
                                                var19_36 = 0;
                                                var4_4 = null;
                                            }
                                            if (var19_36 != 0) {
                                                var4_4 = var3_3.attachModel;
                                                if (var4_4 != null) {
                                                    var5_5 = R$string.cc_upload_file_to_submit;
                                                    var18_26 = var3_3.getString(var5_5);
                                                    var4_4.setAttachmentError((String)var18_26);
                                                }
                                                this.notifyAttachmentViewMultiFile();
                                                break;
                                            }
                                        }
                                        if ((var4_4 = var3_3.mCCComplaintDetailInfo) != null) {
                                            var4_4 = var4_4.isCommentMandatory();
                                            var18_26 = Boolean.TRUE;
                                            var19_36 = Intrinsics.areEqual(var4_4, var18_26);
                                        } else {
                                            var19_36 = 0;
                                            var4_4 = null;
                                        }
                                        if (var19_36 != 0) {
                                            var4_4 = var3_3.attachModel;
                                            if (var4_4 != null && (var4_4 = var4_4.getAttacheInfo()) != null && (var4_4 = var4_4.getComments()) != null) {
                                                var19_36 = var4_4.length();
                                                if (var19_36 == 0) {
                                                    var19_36 = 1;
                                                } else {
                                                    var19_36 = 0;
                                                    var4_4 = null;
                                                }
                                                if (var19_36 == var8_8) {
                                                    var6_6 = true;
                                                }
                                            }
                                            if (var6_6) {
                                                var4_4 = var3_3.attachModel;
                                                if (var4_4 != null) {
                                                    var5_5 = R$string.cc_comment_mandatory;
                                                    var18_26 = var3_3.getString(var5_5);
                                                    var4_4.setCommentError((String)var18_26);
                                                }
                                                this.notifyAttachmentViewMultiFile();
                                                break;
                                            }
                                        }
                                        if ((var4_4 = var3_3.attachModel) != null) {
                                            var4_4.setAttachmentError(null);
                                        }
                                        if ((var4_4 = var3_3.attachModel) != null) {
                                            var4_4.setCommentError(null);
                                        }
                                        this.createComplaintTicketMultiFile();
                                        break;
lbl393:
                                        // 1 sources

                                        var5_5 = var1_1 instanceof Integer;
                                        if (var5_5 != 0) {
                                            var18_27 = this.attachModel;
                                            if (var18_27 != null && (var18_27 = var18_27.getAttacheInfo()) != null && (var18_27 = var18_27.getImageData()) != null) {
                                                var19_37 = ((Number)var1_1).intValue();
                                                var4_4 = (ImageData)var18_27.remove(var19_37);
                                            }
                                            if ((var4_4 = var3_3.attachModel) != null && (var4_4 = var4_4.getAttacheInfo()) != null && (var4_4 = var4_4.getImageData()) != null && (var19_37 = (int)var4_4.isEmpty()) == var8_8) {
                                                var6_6 = true;
                                            }
                                            if (var6_6 && (var4_4 = var3_3.attachModel) != null && (var4_4 = var4_4.getAttacheInfo()) != null && (var4_4 = var4_4.getImageData()) != null) {
                                                var41_90 = false;
                                                var11_11 = null;
                                                var12_12 = null;
                                                var6_6 = false;
                                                var7_7 = null;
                                                var8_8 = 0;
                                                var20_42 = null;
                                                var10_10 = 0;
                                                var9_9 = null;
                                                var13_13 = 31;
                                                var15_15 = null;
                                                var18_27 = var16_17;
                                                var16_17 = new ImageData(null, null, null, null, null, var13_13, null);
                                                var4_4.add(var16_17);
                                            }
                                            this.notifyAttachmentViewMultiFile();
                                            break;
                                        }
                                        break block83;
lbl420:
                                        // 1 sources

                                        var5_5 = var1_1 instanceof Integer;
                                        if (var5_5 != 0 && (var18_28 = this.attachModel) != null && (var18_28 = var18_28.getAttacheInfo()) != null && (var18_28 = var18_28.getImageData()) != null && (var4_4 = (ImageData)CollectionsKt.N(var19_38 = ((Number)var1_1).intValue(), (List)var18_28)) != null) {
                                            var18_28 = var4_4.getFilePath();
                                            if (var18_28 != null && (var5_5 = var18_28.length()) != 0) {
                                                var5_5 = 0;
                                                var18_28 = null;
                                            } else {
                                                var5_5 = 1;
                                            }
                                            if (var5_5 == 0) {
                                                var4_4 = var4_4.getFilePath();
                                                var3_3.showImageDialog((String)var4_4, null);
                                                break;
                                            }
                                            var18_28 = var4_4.getFileUri();
                                            if (var18_28 == null) {
                                                var6_6 = true;
                                            }
                                            if (!var6_6) {
                                                var4_4 = var4_4.getFileUri();
                                                var3_3.showImageDialog(null, (Uri)var4_4);
                                                break;
                                            }
                                        }
                                        break block83;
                                        case 16: lbl-1000:
                                        // 2 sources

                                        {
                                            if ((var4_4 = this.getMActivity()) != null) {
                                                var4_4 = new CCAttachBottomSheetRefresh();
                                                var5_5 = 1001;
                                                var4_4.setTargetFragment(var3_3, var5_5);
                                                var18_29 = this.getMActivity();
                                                Intrinsics.checkNotNull(var18_29);
                                                var18_29 = var18_29.getSupportFragmentManager();
                                                var7_7 = "ATTACHMENT_DIALOG";
                                                var4_4.show((FragmentManager)var18_29, (String)var7_7);
                                                break;
                                            }
                                            break block83;
                                        }
                                    }
                                    break block83;
                                }
                                var4_4 = (String)var1_1;
                                this.showProgress();
                                var18_30 = this.mCCViewModel;
                                if (var18_30 != null) {
                                    Intrinsics.checkNotNull(var4_4);
                                    var18_30.getCCComplaintDetail((String)var4_4);
                                }
                                break block83;
                            }
                            var4_4 = this.qaItem;
                            if (var4_4 != null) {
                                Intrinsics.checkNotNull(var4_4);
                                var19_39 = var4_4.getIsComplaint();
                                if (var19_39 != 0) {
                                    var4_4 = this.qaItem;
                                    Intrinsics.checkNotNull(var4_4);
                                    var4_4 = var4_4.getQuestion();
                                    var5_5 = (int)TextUtils.isEmpty((CharSequence)var4_4);
                                    if (var5_5 == 0) {
                                        var18_31 = this.mOrderId;
                                        var5_5 = (int)TextUtils.isEmpty((CharSequence)var18_31);
                                        var9_9 = "Raise ticket_";
                                        if (var5_5 == 0) {
                                            var18_31 = this.mOrderId;
                                            var22_50 = new StringBuilder((String)var9_9);
                                            var22_50.append((String)var18_31);
                                            var22_50.append((String)var12_12);
                                            var22_50.append((String)var4_4);
                                            var4_4 = var22_50.toString();
                                        } else {
                                            var18_31 = new StringBuilder((String)var9_9);
                                            var18_31.append((String)var4_4);
                                            var4_4 = var18_31.toString();
                                        }
                                        var18_31 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                        var18_31.pushButtonTapEvent(var4_4, (String)var11_11);
                                    }
                                }
                            }
                            if ((var4_4 = var3_3.qaItem) == null) break block88;
                            var5_5 = (int)var3_3.isExpandable;
                            var9_9 = "File and comment is mandatory";
                            if (var5_5 == 0) break block89;
                            var4_4 = var3_3.mCCComplaintDetailInfo;
                            if (var4_4 != null) {
                                var4_4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                var18_31 = var3_3.mCCComplaintDetailInfo;
                                Intrinsics.checkNotNull(var18_31);
                                var18_31 = var18_31.getTicketId();
                                var11_11 = var3_3.mCCComplaintDetailInfo;
                                Intrinsics.checkNotNull(var11_11);
                                var11_11 = var11_11.getOrderCode();
                                var14_14 = var3_3.mCCComplaintDetailInfo;
                                Intrinsics.checkNotNull(var14_14);
                                var14_14 = var14_14.getIncidentStatus();
                                var22_50 = var3_3.mCCComplaintDetailInfo;
                                Intrinsics.checkNotNull(var22_50);
                                var31_79 = var22_50.getResolutionBy();
                                var15_15 = k7.f(var31_79, (String)var15_15);
                                var23_54 = "Complaintcard_submitmore_Clicked_";
                                var22_50 = new StringBuilder(var23_54);
                                var22_50.append((String)var18_31);
                                var22_50.append((String)var12_12);
                                var22_50.append((String)var11_11);
                                var22_50.append((String)var12_12);
                                var22_50.append((String)var14_14);
                                var22_50.append((String)var12_12);
                                var22_50.append((String)var15_15);
                                var18_31 = var22_50.toString();
                                var11_11 = "Selfcare - submit more info complaint card details tap";
                                var4_4.pushButtonTapEvent((String)var11_11, var18_31, (String)var16_17);
                            }
                            var4_4 = var3_3.qaItem;
                            Intrinsics.checkNotNull(var4_4);
                            var19_39 = (int)var4_4.getAttachmentRequired();
                            if (var19_39 == 0) ** GOTO lbl-1000
                            var4_4 = var3_3.mCCComplaintAttachInfo;
                            Intrinsics.checkNotNull(var4_4);
                            var4_4 = var4_4.getBase64String();
                            var19_39 = (int)TextUtils.isEmpty((CharSequence)var4_4);
                            if (var19_39 != 0) ** GOTO lbl-1000
                            var4_4 = var3_3.mCCComplaintAttachInfo;
                            Intrinsics.checkNotNull(var4_4);
                            var4_4 = var4_4.getComments();
                            var19_39 = (int)TextUtils.isEmpty((CharSequence)var4_4);
                            if (var19_39 != 0) lbl-1000:
                            // 2 sources

                            {
                                var4_4 = StringCompanionObject.INSTANCE;
                                var19_39 = R$string.acc_alert_message;
                                var4_4 = hv3_0.K(var19_39);
                                var18_31 = new Object[var8_8];
                                var18_31[0] = var9_9;
                                var18_31 = Arrays.copyOf(var18_31, var8_8);
                                var4_4 = String.format((String)var4_4, (Object[])var18_31);
                                Intrinsics.checkNotNullExpressionValue(var4_4, var17_19);
                                var3_3.showNotification((String)var9_9, (String)var4_4);
                            } else lbl-1000:
                            // 2 sources

                            {
                                this.createComplaintTicket();
                            }
                            break block83;
                        }
                        Intrinsics.checkNotNull(var4_4);
                        var19_39 = (int)var4_4.getAttachmentRequired();
                        if (var19_39 == 0) ** GOTO lbl-1000
                        var4_4 = var3_3.mCCTicketCreateQuery;
                        Intrinsics.checkNotNull(var4_4);
                        var4_4 = var4_4.getBase64String();
                        var19_39 = (int)TextUtils.isEmpty((CharSequence)var4_4);
                        if (var19_39 != 0) ** GOTO lbl-1000
                        var4_4 = var3_3.mCCTicketCreateQuery;
                        if (var4_4 != null) {
                            var14_14 = var4_4.getComments();
                        }
                        if ((var19_39 = (int)TextUtils.isEmpty(var14_14)) != 0) lbl-1000:
                        // 2 sources

                        {
                            var4_4 = StringCompanionObject.INSTANCE;
                            var19_39 = R$string.acc_alert_message;
                            var4_4 = hv3_0.K(var19_39);
                            var18_31 = new Object[var8_8];
                            var18_31[0] = var9_9;
                            var18_31 = Arrays.copyOf(var18_31, var8_8);
                            var4_4 = String.format((String)var4_4, (Object[])var18_31);
                            Intrinsics.checkNotNullExpressionValue(var4_4, var17_19);
                            var3_3.showNotification((String)var9_9, (String)var4_4);
                        } else lbl-1000:
                        // 2 sources

                        {
                            this.createTicket();
                        }
                        break block83;
                    }
                    var4_4 = StringCompanionObject.INSTANCE;
                    var19_39 = R$string.acc_error_message;
                    var4_4 = hv3_0.K(var19_39);
                    var18_31 = hv3_0.K(R$string.something_wrong_msg);
                    var9_9 = new Object[var8_8];
                    var9_9[0] = var18_31;
                    var18_31 = Arrays.copyOf(var9_9, var8_8);
                    var4_4 = String.format((String)var4_4, (Object[])var18_31);
                    Intrinsics.checkNotNullExpressionValue(var4_4, var17_19);
                    var5_5 = R$string.something_wrong_msg;
                    var18_31 = hv3_0.K(var5_5);
                    var3_3.showNotification((String)var18_31, (String)var4_4);
                    break block83;
                }
                var4_4 = this.qaItem;
                if (var4_4 != null) {
                    Intrinsics.checkNotNull(var4_4);
                    var4_4 = var4_4.getQuestion();
                    var5_5 = (int)TextUtils.isEmpty((CharSequence)var4_4);
                    if (var5_5 == 0) {
                        var18_32 = this.mOrderId;
                        var5_5 = (int)TextUtils.isEmpty((CharSequence)var18_32);
                        var7_7 = "Raise contact_us_";
                        if (var5_5 == 0) {
                            var18_32 = this.mOrderId;
                            var20_43 = new StringBuilder((String)var7_7);
                            var20_43.append((String)var18_32);
                            var20_43.append((String)var12_12);
                            var20_43.append((String)var4_4);
                            var4_4 = var20_43.toString();
                        } else {
                            var18_32 = new StringBuilder((String)var7_7);
                            var18_32.append((String)var4_4);
                            var4_4 = var18_32.toString();
                        }
                        AnalyticsManager.Companion.getInstance().getGtmEvents().pushButtonTapEvent(var4_4, (String)var11_11);
                        var15_16 = var3_3.newCustomEventsRevamp;
                        var16_18 = var15_16.getEC_CC_ORDER_INTERACTION();
                        var4_4 = var3_3.previousScreen;
                        var18_32 = var3_3.previousScreenType;
                        var25_61 = false;
                        var17_20 = "contact us";
                        var22_51 = "";
                        var23_55 = "contact_us";
                        var21_46 = "consolidated order details screen";
                        var24_58 = "order management screen";
                        var42_92 = 1536;
                        var26_64 = null;
                        NewCustomEventsRevamp.newPushCustomEvent$default(var15_16, var16_18, var17_20, var22_51, var23_55, var21_46, var24_58, (String)var4_4, null, (String)var18_32, false, null, var42_92, null);
                        var4_4 = var3_3.ccCustomEvent;
                        var28_70 = var3_3.newCustomEventsRevamp.getEC_SELF_CARE_INTERACTION();
                        var29_73 = var3_3.newCustomEventsRevamp.getEA_CONTACT_US();
                        var18_32 = var3_3.bundledatalist;
                        var30_77 = "";
                        var36_84 = "customer care - item details - faq screen";
                        var27_67 = var4_4;
                        var37_86 = var18_32;
                        var4_4.a(var28_70, var29_73, var30_77, var36_84, (HashMap)var18_32);
                    }
                    var18_32 = var3_3.qaItem;
                    var7_7 = var3_3.mOrderId;
                    var20_43 = var3_3.mOrderStatus;
                    var9_9 = var3_3.mProductCode;
                    var41_91 = var3_3.isLuxeOrder;
                    var4_4 = new Object();
                    var4_4.a = null;
                    var4_4.b = var18_32;
                    var4_4.c = var7_7;
                    var4_4.d = var20_43;
                    var4_4.e = var9_9;
                    var4_4.f = var41_91;
                    var18_32 = var3_3.cCBundleViewModel;
                    if (var18_32 != null) {
                        var18_32.a = var4_4;
                    }
                    var4_4 = CCContactUsDialog.Companion.newInstance();
                    var18_32 = this.getMActivity();
                    Intrinsics.checkNotNull(var18_32);
                    var18_32 = var18_32.getSupportFragmentManager();
                    var7_7 = "CCContactUsFragment";
                    var4_4.show((FragmentManager)var18_32, (String)var7_7);
                }
                break block83;
            }
            var4_4 = this.getContext();
            at2_1.e((Context)var4_4);
        }
    }

    public final void setAttachModel(CCItemMultiFileAttachModel cCItemMultiFileAttachModel) {
        this.attachModel = cCItemMultiFileAttachModel;
    }

    public final void setCCBundleViewModel(xf_1 xf_12) {
        this.cCBundleViewModel = xf_12;
    }

    public final void setCompositeDisposable(t30_0 t30_02) {
        this.compositeDisposable = t30_02;
    }

    public final void setCustomToolbarViewMerger(CustomToolbarViewMerger customToolbarViewMerger) {
        this.customToolbarViewMerger = customToolbarViewMerger;
    }

    public final void setExpandable(boolean bl2) {
        this.isExpandable = bl2;
    }

    public final void setImageDialog(Dialog dialog) {
        this.imageDialog = dialog;
    }

    public final void setLuxeOrder(boolean bl2) {
        this.isLuxeOrder = bl2;
    }

    public final void setMAttachmentIndex(int n3) {
        this.mAttachmentIndex = n3;
    }

    public final void setMCCComplaintAttachInfo(CCComplaintAttachInfo cCComplaintAttachInfo) {
        this.mCCComplaintAttachInfo = cCComplaintAttachInfo;
    }

    public final void setMCCComplaintDetailInfo(CCComplaintDetailInfo cCComplaintDetailInfo) {
        this.mCCComplaintDetailInfo = cCComplaintDetailInfo;
    }

    public final void setMCCItemHelpAdapter(CCItemHelpAdapter cCItemHelpAdapter) {
        this.mCCItemHelpAdapter = cCItemHelpAdapter;
    }

    public final void setMCCTicketCreateQuery(CCTicketCreateQuery cCTicketCreateQuery) {
        this.mCCTicketCreateQuery = cCTicketCreateQuery;
    }

    public final void setMCCViewModel(CCViewModel cCViewModel) {
        this.mCCViewModel = cCViewModel;
    }

    public final void setMHelpBtnIndex(int n3) {
        this.mHelpBtnIndex = n3;
    }

    public final void setMImageCaptureUri(Uri uri) {
        this.mImageCaptureUri = uri;
    }

    public final void setMIncidentId(String string2) {
        this.mIncidentId = string2;
    }

    public final void setMOrderId(String string2) {
        this.mOrderId = string2;
    }

    public final void setMOrderStatus(String string2) {
        this.mOrderStatus = string2;
    }

    public final void setMProductCode(String string2) {
        this.mProductCode = string2;
    }

    public final void setMRecyclerView(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }

    public final void setMSelfCareFileHelper(ty2_2 ty2_22) {
        this.mSelfCareFileHelper = ty2_22;
    }

    public final void setMViewDataList(ArrayList arrayList) {
        this.mViewDataList = arrayList;
    }

    public final void setQaItem(CCItemDetailsQAModel$CCItemQALists cCItemDetailsQAModel$CCItemQALists) {
        this.qaItem = cCItemDetailsQAModel$CCItemQALists;
    }

    public final void setTitle(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.title = string2;
    }

    public final void setWorkManager(li3_1 li3_12) {
        this.workManager = li3_12;
    }
}

