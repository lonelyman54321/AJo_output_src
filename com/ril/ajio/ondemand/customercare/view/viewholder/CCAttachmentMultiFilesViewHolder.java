/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.TextWatcher
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioToggleButton;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.ondemand.customercare.view.adapter.CCAttachmentItemAdapter;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.ondemand.customercare.view.fragment.CCBaseFragment;
import com.ril.ajio.ondemand.customercare.view.viewholder.AttachItemClickListener;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentListener;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentMultiFilesViewHolder$1;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentMultiFilesViewHolder$2;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentMultiFilesViewHolder$attachItemClickListener$1;
import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfoNew;
import com.ril.ajio.services.data.CustomerCare.CCItemMultiFileAttachModel;
import com.ril.ajio.services.data.CustomerCare.ImageData;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class CCAttachmentMultiFilesViewHolder
extends uv_2 {
    private CCItemMultiFileAttachModel attachInfoModel;
    private final AttachItemClickListener attachItemClickListener;
    private final LinearLayout attachParent;
    private final AjioToggleButton attachToggle;
    private final CCAttachmentItemAdapter attachmentAdapter;
    private final TextView attachmentInfo;
    private boolean attachmentRequired;
    private int attachmentViewType;
    private final CCAttachmentListener ccAttachmentListener;
    private final EditText comment;
    private final TextView commentInfo;
    private final View infoContainer;
    private final LinearLayout mainAttachmentContainer;
    private final RecyclerView rvAttachments;
    private final TextView submitBtn;
    private final TextView tvAddMoreImages;

    public CCAttachmentMultiFilesViewHolder(View object, i82_0 object2, CCAttachmentListener object3) {
        CCAttachmentItemAdapter cCAttachmentItemAdapter;
        Intrinsics.checkNotNullParameter(object, "view");
        super((View)object, (i82_0)object2);
        this.ccAttachmentListener = object3;
        object2 = this.itemView;
        int n3 = R$id.row_cc_attach_comment;
        object2 = object2.findViewById(n3);
        object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (EditText)object2;
        this.comment = object2;
        Object object4 = this.itemView;
        int n4 = R$id.row_cc_attach_container;
        object4 = object4.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
        this.infoContainer = object4;
        object4 = this.itemView;
        n4 = R$id.attachment_container;
        object4 = object4.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
        object4 = (LinearLayout)object4;
        this.mainAttachmentContainer = object4;
        object4 = this.itemView;
        n4 = R$id.expand_attachment;
        object4 = object4.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
        object4 = (AjioToggleButton)object4;
        this.attachToggle = object4;
        object4 = this.itemView;
        n4 = R$id.row_cc_submit_btn;
        object4 = object4.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
        object4 = (TextView)object4;
        this.submitBtn = object4;
        View view = this.itemView;
        int n7 = R$id.row_cc_attach_upload;
        view = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view, (String)object3);
        view = (TextView)view;
        this.attachmentInfo = view;
        view = this.itemView;
        n7 = R$id.character_limit;
        view = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view, (String)object3);
        view = (TextView)view;
        this.commentInfo = view;
        view = this.itemView;
        n7 = R$id.tv_add_more_images;
        view = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view, (String)object3);
        view = (TextView)view;
        this.tvAddMoreImages = view;
        Object object5 = this.itemView;
        int n8 = R$id.attachParent;
        object5 = object5.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
        object5 = (LinearLayout)object5;
        this.attachParent = object5;
        object5 = this.itemView;
        n8 = R$id.rv_attachments;
        object5 = object5.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
        object5 = (RecyclerView)object5;
        this.rvAttachments = object5;
        this.attachItemClickListener = object3 = new CCAttachmentMultiFilesViewHolder$attachItemClickListener$1(this);
        this.attachmentAdapter = cCAttachmentItemAdapter = new CCAttachmentItemAdapter((AttachItemClickListener)object3);
        this.attachmentRequired = false;
        this.attachmentViewType = -1;
        CCAttachmentMultiFilesViewHolder$1 cCAttachmentMultiFilesViewHolder$1 = new CCAttachmentMultiFilesViewHolder$1(this);
        object2.addTextChangedListener((TextWatcher)cCAttachmentMultiFilesViewHolder$1);
        object = object.getContext();
        object2 = new LinearLayoutManager((Context)object, 1, false);
        ((RecyclerView)object5).setLayoutManager((RecyclerView$o)object2);
        int n10 = mz3_0.d(16);
        object2 = new CCAttachmentMultiFilesViewHolder$2(n10);
        ((RecyclerView)object5).addItemDecoration((RecyclerView$n)object2);
        ((RecyclerView)object5).setAdapter(cCAttachmentItemAdapter);
        super(this);
        view.setOnClickListener((View.OnClickListener)object);
        super(this);
        object4.setOnClickListener((View.OnClickListener)object);
    }

    private static final void _init_$lambda$0(CCAttachmentMultiFilesViewHolder object, View object2) {
        object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((CCAttachmentMultiFilesViewHolder)object).ccAttachmentListener;
        if (object != null) {
            object.addMoreImageClick();
        }
    }

    private static final void _init_$lambda$1(CCAttachmentMultiFilesViewHolder object, View object2) {
        object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((uv_2)object).getMOnCCClickListener();
        if (object != null) {
            object2 = null;
            int n3 = 32;
            object.onViewItemClick(null, n3);
        }
    }

    public static final /* synthetic */ void access$checkSubmitBtn(CCAttachmentMultiFilesViewHolder cCAttachmentMultiFilesViewHolder) {
        cCAttachmentMultiFilesViewHolder.checkSubmitBtn();
    }

    public static final /* synthetic */ CCAttachmentListener access$getCcAttachmentListener$p(CCAttachmentMultiFilesViewHolder cCAttachmentMultiFilesViewHolder) {
        return cCAttachmentMultiFilesViewHolder.ccAttachmentListener;
    }

    public static final /* synthetic */ void access$validateCommentErrors(CCAttachmentMultiFilesViewHolder cCAttachmentMultiFilesViewHolder) {
        cCAttachmentMultiFilesViewHolder.validateCommentErrors();
    }

    /*
     * Unable to fully structure code
     */
    private final void checkSubmitBtn() {
        block17: {
            block16: {
                var1_1 = this.attachInfoModel;
                var2_2 = 0;
                var3_3 = null;
                if (var1_1 != null && (var1_1 = var1_1.getAttacheInfo()) != null && (var1_1 = var1_1.getImageData()) != null && (var1_1 = (ImageData)CollectionsKt.firstOrNull((List)var1_1)) != null) {
                    var1_1 = var1_1.getFileName();
                } else {
                    var4_4 = false;
                    var1_1 = null;
                }
                if (var1_1 != null && (var4_4 = var1_1.length())) break block16;
                var1_1 = this.attachInfoModel;
                if (var1_1 != null && (var1_1 = var1_1.getAttacheInfo()) != null) {
                    var1_1 = var1_1.getComments();
                } else {
                    var4_4 = false;
                    var1_1 = null;
                }
                if (var1_1 == null || !(var4_4 = var1_1.length())) break block17;
            }
            var1_1 = this.attachInfoModel;
            var5_5 = true;
            if (var1_1 == null || (var4_4 = (boolean)var1_1.isAttachmentMandatory()) != var5_5) ** GOTO lbl-1000
            var1_1 = this.attachInfoModel;
            if (var1_1 != null && (var1_1 = var1_1.getAttacheInfo()) != null) {
                var1_1 = var1_1.getImageData();
            } else {
                var4_4 = false;
                var1_1 = null;
            }
            if (var1_1 != null && !(var4_4 = (boolean)var1_1.isEmpty())) lbl-1000:
            // 2 sources

            {
                var4_4 = true;
            } else {
                var4_4 = false;
                var1_1 = null;
            }
            var6_6 = this.attachInfoModel;
            if (var6_6 == null || (var7_7 = var6_6.isCommentMandatory()) != var5_5) ** GOTO lbl-1000
            var6_6 = this.attachInfoModel;
            if (var6_6 != null && (var6_6 = var6_6.getAttacheInfo()) != null) {
                var3_3 = var6_6.getComments();
            }
            if (var3_3 != null && (var2_2 = var3_3.length()) != 0) lbl-1000:
            // 2 sources

            {
                var2_2 = 1;
            } else {
                var2_2 = 0;
                var3_3 = null;
            }
            if (var4_4 && var2_2 != 0) {
                var1_1 = this.submitBtn;
                var4_4 = var1_1.isEnabled();
                if (!var4_4) {
                    this.toggleSubmitBtn(var5_5);
                }
            } else {
                var1_1 = this.submitBtn;
                var4_4 = var1_1.isEnabled();
                if (var4_4) {
                    this.toggleSubmitBtn(false);
                }
            }
            return;
        }
        var1_1 = this.submitBtn;
        var4_4 = var1_1.isEnabled();
        if (var4_4) {
            this.toggleSubmitBtn(false);
        }
    }

    private static final void setData$lambda$2(CCAttachmentMultiFilesViewHolder cCAttachmentMultiFilesViewHolder, UiCCComponent object, View object2) {
        Intrinsics.checkNotNullParameter(cCAttachmentMultiFilesViewHolder, "this$0");
        Intrinsics.checkNotNullParameter(object, "$uiCCComponent");
        object2 = cCAttachmentMultiFilesViewHolder.attachToggle;
        int n3 = object2.isChecked();
        if (n3 != 0) {
            n3 = 104;
            ((UiCCComponent)object).setAttachmentViewType(n3);
            object = cCAttachmentMultiFilesViewHolder.ccAttachmentListener;
            if (object != null) {
                object.sendEnterMoreDetailsGAEvent();
            }
            cCAttachmentMultiFilesViewHolder = cCAttachmentMultiFilesViewHolder.mainAttachmentContainer;
            boolean bl2 = false;
            object = null;
            cCAttachmentMultiFilesViewHolder.setVisibility(0);
        } else {
            n3 = 103;
            ((UiCCComponent)object).setAttachmentViewType(n3);
            cCAttachmentMultiFilesViewHolder = cCAttachmentMultiFilesViewHolder.mainAttachmentContainer;
            int n4 = 8;
            cCAttachmentMultiFilesViewHolder.setVisibility(n4);
        }
    }

    private final void setToggleVisibility(boolean bl2) {
        if (bl2) {
            this.attachToggle.setVisibility(0);
            LinearLayout linearLayout = this.attachParent;
            linearLayout.setPadding(0, 0, 0, 0);
        } else {
            this.attachToggle.setVisibility(8);
            LinearLayout linearLayout = this.attachParent;
            int n3 = mz3_0.d(16);
            linearLayout.setPadding(0, n3, 0, 0);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void toggleAddMoreView() {
        int n3;
        Object object = this.attachInfoModel;
        int n4 = 0;
        if (object != null && (object = ((CCItemMultiFileAttachModel)object).getAttacheInfo()) != null && (object = ((CCComplaintAttachInfoNew)object).getImageData()) != null) {
            n3 = ((ArrayList)object).size();
        } else {
            n3 = 0;
            object = null;
        }
        CCItemMultiFileAttachModel cCItemMultiFileAttachModel = this.attachInfoModel;
        if (cCItemMultiFileAttachModel != null) {
            n4 = cCItemMultiFileAttachModel.getMaxImagesAllowed();
        }
        if (n3 < n4) {
            object = this.attachInfoModel;
            if (object != null && (object = ((CCItemMultiFileAttachModel)object).getAttacheInfo()) != null && (object = ((CCComplaintAttachInfoNew)object).getImageData()) != null && (object = (ImageData)CollectionsKt.T((List)object)) != null) {
                object = ((ImageData)object).getFileName();
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null && (n3 = object.length()) != 0) {
                object = this.tvAddMoreImages;
                ai0_2.B((View)object);
                return;
            }
        }
        object = this.tvAddMoreImages;
        ai0_2.i((View)object);
    }

    private final void toggleSubmitBtn(boolean bl2) {
        if (bl2) {
            this.submitBtn.setEnabled(true);
            TextView textView = this.submitBtn;
            int n3 = hv3_0.m(R$color.accent_color_11);
            textView.setTextColor(n3);
            textView = this.submitBtn;
            n3 = R$drawable.revamp_secondary_button_bg;
            textView.setBackgroundResource(n3);
        } else {
            this.submitBtn.setEnabled(false);
            TextView textView = this.submitBtn;
            int n4 = hv3_0.m(R$color.accent_color_12);
            textView.setTextColor(n4);
            textView = this.submitBtn;
            n4 = R$drawable.revamp_disable_btn_bg;
            textView.setBackgroundResource(n4);
        }
    }

    private final void updateExpandState(boolean bl2) {
        if (bl2) {
            LinearLayout linearLayout = this.mainAttachmentContainer;
            boolean bl3 = false;
            linearLayout.setVisibility(0);
        } else {
            LinearLayout linearLayout = this.mainAttachmentContainer;
            int n3 = 8;
            linearLayout.setVisibility(n3);
        }
    }

    private final void validateAttachmentErrors() {
        int n3;
        Object object = this.attachInfoModel;
        int n4 = 0;
        Object object2 = null;
        if (object != null && (object = ((CCItemMultiFileAttachModel)object).getAttacheInfo()) != null && (object = ((CCComplaintAttachInfoNew)object).getImageData()) != null && (object = (ImageData)CollectionsKt.T((List)object)) != null) {
            object = ((ImageData)object).getFileName();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null && (n3 = object.length()) != 0) {
            object = this.attachmentInfo;
            ai0_2.i((View)object);
        } else {
            ai0_2.B((View)this.attachmentInfo);
            object = this.attachInfoModel;
            if (object != null) {
                object = ((CCItemMultiFileAttachModel)object).getAttachmentError();
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null && (n3 = object.length()) != 0) {
                object = this.attachmentInfo;
                CCItemMultiFileAttachModel cCItemMultiFileAttachModel = this.attachInfoModel;
                if (cCItemMultiFileAttachModel != null) {
                    object2 = cCItemMultiFileAttachModel.getAttachmentError();
                }
                object.setText((CharSequence)object2);
                object = this.attachmentInfo;
                object2 = object.getContext();
                int n7 = R$color.color_complaint_alert;
                n4 = t70.getColor(object2, n7);
                object.setTextColor(n4);
            } else {
                object = this.attachmentInfo;
                object2 = object.getContext();
                int n8 = R$string.upload_picture;
                object2 = object2.getString(n8);
                object.setText((CharSequence)object2);
                object = this.attachmentInfo;
                object2 = object.getContext();
                n8 = R$color.accent_color_18;
                n4 = t70.getColor(object2, n8);
                object.setTextColor(n4);
            }
        }
    }

    private final void validateCommentErrors() {
        int n3;
        Object object = this.attachInfoModel;
        int n4 = 0;
        Object object2 = null;
        if (object != null) {
            object = ((CCItemMultiFileAttachModel)object).getCommentError();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null && (n3 = object.length()) != 0) {
            object = this.commentInfo;
            n3 = (int)(object.isEnabled() ? 1 : 0);
            if (n3 != 0) {
                object = this.commentInfo;
                int n7 = 0;
                object.setEnabled(false);
                object = this.commentInfo;
                CCItemMultiFileAttachModel cCItemMultiFileAttachModel = this.attachInfoModel;
                if (cCItemMultiFileAttachModel != null) {
                    object2 = cCItemMultiFileAttachModel.getCommentError();
                }
                object.setText((CharSequence)object2);
                object = this.commentInfo;
                object2 = this.attachmentInfo.getContext();
                n7 = R$color.color_complaint_alert;
                n4 = t70.getColor(object2, n7);
                object.setTextColor(n4);
            }
        } else {
            object = this.commentInfo;
            n3 = (int)(object.isEnabled() ? 1 : 0);
            if (n3 == 0) {
                this.commentInfo.setEnabled(true);
                object = this.commentInfo;
                object2 = object.getContext();
                int n8 = R$string.cc_characters_limit;
                object2 = object2.getString(n8);
                object.setText((CharSequence)object2);
                object = this.commentInfo;
                object2 = this.attachmentInfo.getContext();
                n8 = R$color.accent_color_18;
                n4 = t70.getColor(object2, n8);
                object.setTextColor(n4);
            }
        }
    }

    public static /* synthetic */ void w(CCAttachmentMultiFilesViewHolder cCAttachmentMultiFilesViewHolder, View view) {
        CCAttachmentMultiFilesViewHolder._init_$lambda$0(cCAttachmentMultiFilesViewHolder, view);
    }

    public static /* synthetic */ void x(CCAttachmentMultiFilesViewHolder cCAttachmentMultiFilesViewHolder, UiCCComponent uiCCComponent, View view) {
        CCAttachmentMultiFilesViewHolder.setData$lambda$2(cCAttachmentMultiFilesViewHolder, uiCCComponent, view);
    }

    public static /* synthetic */ void y(CCAttachmentMultiFilesViewHolder cCAttachmentMultiFilesViewHolder, View view) {
        CCAttachmentMultiFilesViewHolder._init_$lambda$1(cCAttachmentMultiFilesViewHolder, view);
    }

    public final CCItemMultiFileAttachModel getAttachInfoModel() {
        return this.attachInfoModel;
    }

    public final void setAttachInfoModel(CCItemMultiFileAttachModel cCItemMultiFileAttachModel) {
        this.attachInfoModel = cCItemMultiFileAttachModel;
    }

    public void setData(Object object, int n3) {
        n3 = object instanceof UiCCComponent;
        if (n3 != 0) {
            object = (UiCCComponent)object;
            this.attachmentViewType = n3 = ((UiCCComponent)object).getAttachmentViewType();
            Object object2 = ((UiCCComponent)object).getQAItem();
            n3 = object2 instanceof CCItemMultiFileAttachModel;
            int n4 = 8;
            if (n3 != 0) {
                int n7;
                object2 = ((UiCCComponent)object).getQAItem();
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.services.data.CustomerCare.CCItemMultiFileAttachModel");
                object2 = (CCItemMultiFileAttachModel)object2;
                this.attachInfoModel = object2;
                object2 = this.infoContainer;
                boolean bl2 = false;
                object2.setVisibility(0);
                object2 = this.attachmentAdapter;
                ArrayList arrayList = this.attachInfoModel;
                String string2 = null;
                arrayList = arrayList != null && (arrayList = ((CCItemMultiFileAttachModel)((Object)arrayList)).getAttacheInfo()) != null ? ((CCComplaintAttachInfoNew)((Object)arrayList)).getImageData() : null;
                Object object3 = this.attachInfoModel;
                int n8 = 1;
                if (object3 != null && (n7 = ((CCItemMultiFileAttachModel)object3).isAttachmentMandatory()) == n8) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    object3 = null;
                }
                ((CCAttachmentItemAdapter)object2).setData(arrayList, n7 != 0);
                object2 = this.attachInfoModel;
                if (object2 != null && (n3 = (int)(((CCItemMultiFileAttachModel)object2).isAttachmentMandatory() ? 1 : 0)) == n8) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    object2 = null;
                }
                this.attachmentRequired = n3;
                object2 = this.attachToggle;
                arrayList = new tf_2(this, (UiCCComponent)object);
                object2.setOnClickListener((View.OnClickListener)arrayList);
                object = this.getMOnCCClickListener();
                int n10 = object instanceof CCBaseFragment;
                if (n10 != 0) {
                    object = this.attachToggle;
                    object2 = FontsManager.getInstance();
                    arrayList = this.getMOnCCClickListener();
                    object3 = "null cannot be cast to non-null type com.ril.ajio.ondemand.customercare.view.fragment.CCBaseFragment";
                    Intrinsics.checkNotNull(arrayList, (String)object3);
                    arrayList = ((CCBaseFragment)((Object)arrayList)).getContext();
                    object2 = Typeface.create((Typeface)((FontsManager)object2).getTypefaceWithFont((Context)arrayList, n4), (int)0);
                    object.setTypeface((Typeface)object2);
                }
                object = this.attachToggle;
                object2 = this.attachInfoModel;
                if (object2 != null) {
                    object2 = ((CCItemMultiFileAttachModel)object2).getHeader();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                object.setTextOn((CharSequence)object2);
                object = this.attachToggle;
                object2 = this.attachInfoModel;
                if (object2 != null) {
                    object2 = ((CCItemMultiFileAttachModel)object2).getHeader();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                object.setTextOff((CharSequence)object2);
                this.setToggleVisibility(n8 != 0);
                n10 = this.attachmentViewType;
                n3 = 104;
                if (n10 == n3) {
                    bl2 = true;
                }
                this.attachToggle.setChecked(bl2);
                this.updateExpandState(bl2);
                object = this.submitBtn;
                object2 = "Submit";
                object.setText((CharSequence)object2);
                object = this.attachInfoModel;
                if (object != null && (n10 = (int)(((CCItemMultiFileAttachModel)object).isCommentMandatory() ? 1 : 0)) == n8) {
                    object = this.comment;
                    object2 = "Comments (mandatory)";
                    object.setHint((CharSequence)object2);
                } else {
                    object = this.comment;
                    object2 = "Comments";
                    object.setHint((CharSequence)object2);
                }
                object = this.comment;
                object2 = this.attachInfoModel;
                if (object2 != null && (object2 = ((CCItemMultiFileAttachModel)object2).getAttacheInfo()) != null) {
                    string2 = ((CCComplaintAttachInfoNew)object2).getComments();
                }
                object.setText(string2);
                this.validateAttachmentErrors();
                this.validateCommentErrors();
                this.toggleAddMoreView();
                this.checkSubmitBtn();
            } else {
                object = this.infoContainer;
                object.setVisibility(n4);
            }
        }
    }
}

