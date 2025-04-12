/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnTouchListener
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioToggleButton;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.ondemand.customercare.view.fragment.CCBaseFragment;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentListener;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentViewHolderRefresh$ClickListener;
import com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel$CCItemQALists;
import kotlin.jvm.internal.Intrinsics;

public final class CCAttachmentViewHolderRefresh
extends uv_2 {
    private final TextView attachCmntRead;
    private final TextView attachFileTxt;
    private final TextView attachOptional;
    private final LinearLayout attachParent;
    private final AjioToggleButton attachToggle;
    private final CardView attachment;
    private final ImageView attachmentImage;
    private final TextView attachmentInfo;
    private final View attachmentParent;
    private boolean attachmentRequired;
    private final ImageView attachmentSample;
    private final TextView attachmentText;
    private int attachmentViewType;
    private final CCAttachmentListener ccAttachmentListener;
    private final EditText comment;
    private final TextView deleteAttachment;
    private final View infoContainer;
    private boolean isDelete;
    private final LinearLayout mainAttachmentContainer;
    private final TextView mandatoryText;
    private final TextView submitBtn;
    private final TextView uploadTxt;
    private final LinearLayout writeContainer;

    public CCAttachmentViewHolderRefresh(View object, i82_0 i82_02, CCAttachmentListener object2) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object, i82_02);
        this.ccAttachmentListener = object2;
        int n3 = R$id.row_cc_attach_comment;
        i82_02 = object.findViewById(n3);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(i82_02, (String)object2);
        i82_02 = (EditText)i82_02;
        this.comment = i82_02;
        int n4 = R$id.row_cc_attach_container;
        Object object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        this.infoContainer = object3;
        n4 = R$id.row_cc_attach_optional;
        object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (TextView)object3;
        this.attachOptional = object3;
        n4 = R$id.attachment_container;
        object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (LinearLayout)object3;
        this.mainAttachmentContainer = object3;
        n4 = R$id.row_cc_attach_attachment;
        object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (CardView)((Object)object3);
        this.attachment = object3;
        n4 = R$id.cc_attachment_image;
        object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (ImageView)object3;
        this.attachmentImage = object3;
        n4 = R$id.row_cc_attach_attachment_sample;
        object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (ImageView)object3;
        this.attachmentSample = object3;
        n4 = R$id.row_cc_attach_text;
        object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (TextView)object3;
        this.attachmentText = object3;
        n4 = R$id.row_cc_attach_info;
        object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (TextView)object3;
        this.attachmentInfo = object3;
        n4 = R$id.cc_attach_delete;
        object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (TextView)object3;
        this.deleteAttachment = object3;
        int n7 = R$id.expand_attachment;
        Object object4 = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
        object4 = (AjioToggleButton)object4;
        this.attachToggle = object4;
        n7 = R$id.row_cc_submit_btn;
        object4 = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
        object4 = (TextView)object4;
        this.submitBtn = object4;
        int n8 = R$id.row_cc_attach_parent;
        View view = object.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        this.attachmentParent = view;
        int n10 = R$id.row_cc_write_container;
        View view2 = object.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object2);
        view2 = (LinearLayout)view2;
        this.writeContainer = view2;
        n10 = R$id.row_cc_attach_upload;
        view2 = object.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object2);
        view2 = (TextView)view2;
        this.uploadTxt = view2;
        n10 = R$id.row_cc_attach_comment_read;
        view2 = object.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object2);
        view2 = (TextView)view2;
        this.attachCmntRead = view2;
        n10 = R$id.mandatory_txt;
        view2 = object.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object2);
        view2 = (TextView)view2;
        this.mandatoryText = view2;
        n10 = R$id.attachParent;
        view2 = object.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object2);
        view2 = (LinearLayout)view2;
        this.attachParent = view2;
        n10 = R$id.cc_attach_txt;
        object = object.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.attachFileTxt = object;
        this.attachmentRequired = false;
        n10 = 16;
        object2 = new CCAttachmentViewHolderRefresh$ClickListener(this, n10);
        view.setOnClickListener((View.OnClickListener)object2);
        n8 = -1;
        object2 = new CCAttachmentViewHolderRefresh$ClickListener(this, n8);
        object3.setOnClickListener((View.OnClickListener)object2);
        object2 = new CCAttachmentViewHolderRefresh$ClickListener(this, n8);
        object4.setOnClickListener((View.OnClickListener)object2);
        object2 = new CCAttachmentViewHolderRefresh$ClickListener(this, n10);
        object.setOnClickListener((View.OnClickListener)object2);
        this.attachmentViewType = n8;
        super(this);
        i82_02.addTextChangedListener((TextWatcher)object);
        super(this);
        i82_02.setOnFocusChangeListener((View.OnFocusChangeListener)object);
        super(this);
        i82_02.setOnTouchListener((View.OnTouchListener)object);
    }

    private static final void _init_$lambda$0(CCAttachmentViewHolderRefresh object, View object2, boolean bl2) {
        object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        if (bl2 && (object = ((CCAttachmentViewHolderRefresh)object).ccAttachmentListener) != null) {
            object.onFocusChange();
        }
    }

    private static final boolean _init_$lambda$1(CCAttachmentViewHolderRefresh object, View object2, MotionEvent motionEvent) {
        object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((CCAttachmentViewHolderRefresh)object).ccAttachmentListener;
        if (object != null) {
            object.onFocusChange();
        }
        return false;
    }

    public static final /* synthetic */ void access$checkSubmitBtn(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh) {
        cCAttachmentViewHolderRefresh.checkSubmitBtn();
    }

    public static final /* synthetic */ CardView access$getAttachment$p(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh) {
        return cCAttachmentViewHolderRefresh.attachment;
    }

    public static final /* synthetic */ View access$getAttachmentParent$p(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh) {
        return cCAttachmentViewHolderRefresh.attachmentParent;
    }

    public static final /* synthetic */ ImageView access$getAttachmentSample$p(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh) {
        return cCAttachmentViewHolderRefresh.attachmentSample;
    }

    public static final /* synthetic */ CCAttachmentListener access$getCcAttachmentListener$p(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh) {
        return cCAttachmentViewHolderRefresh.ccAttachmentListener;
    }

    public static final /* synthetic */ void access$handleDeleteBtn(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh, boolean bl2) {
        cCAttachmentViewHolderRefresh.handleDeleteBtn(bl2);
    }

    public static final /* synthetic */ void access$setAttachmentText(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh, boolean bl2, String string2) {
        cCAttachmentViewHolderRefresh.setAttachmentText(bl2, string2);
    }

    private final void checkSubmitBtn() {
        int n3 = this.attachmentRequired;
        boolean bl2 = true;
        if (n3 != 0) {
            Object object = this.submitBtn;
            n3 = (int)(object.isEnabled() ? 1 : 0);
            if (n3 == 0) {
                n3 = (int)(this.isDelete ? 1 : 0);
                if (n3 != 0 && (n3 = (object = this.comment.getText().toString()).length()) > 0) {
                    this.toggleSubmitBtn(bl2);
                }
            } else {
                n3 = (int)(this.isDelete ? 1 : 0);
                if (n3 == 0 || (n3 = (object = this.comment.getText().toString()).length()) == 0) {
                    this.toggleSubmitBtn(false);
                }
            }
        } else {
            n3 = this.attachmentViewType;
            int n4 = 101;
            if (n3 != n4) {
                Object object = this.submitBtn;
                n3 = (int)(object.isEnabled() ? 1 : 0);
                if (n3 == 0) {
                    n3 = (int)(this.isDelete ? 1 : 0);
                    if (n3 != 0 || (n3 = (object = this.comment.getText().toString()).length()) > 0) {
                        this.toggleSubmitBtn(bl2);
                    }
                } else {
                    n3 = (int)(this.isDelete ? 1 : 0);
                    if (n3 == 0 && (n3 = (object = this.comment.getText().toString()).length()) == 0) {
                        this.toggleSubmitBtn(false);
                    }
                }
            }
        }
    }

    private final void handleDeleteBtn(boolean bl2) {
        int n3 = 8;
        if (bl2) {
            this.attachFileTxt.setVisibility(n3);
            TextView textView = this.deleteAttachment;
            textView.setVisibility(0);
        } else {
            this.attachFileTxt.setVisibility(0);
            TextView textView = this.deleteAttachment;
            textView.setVisibility(n3);
        }
    }

    private final void setAttachmentText(boolean bl2, String string2) {
        TextView textView;
        int n3 = 8;
        if (bl2) {
            this.isDelete = bl2 = true;
            this.attachOptional.setVisibility(n3);
            this.attachmentText.setVisibility(0);
            this.attachmentInfo.setVisibility(0);
            textView = this.attachmentInfo;
            textView.setText((CharSequence)string2);
        } else {
            this.isDelete = false;
            this.attachOptional.setVisibility(0);
            this.attachmentText.setVisibility(n3);
            textView = this.attachmentInfo;
            textView.setVisibility(n3);
        }
        bl2 = this.attachmentRequired;
        if (bl2) {
            textView = this.attachOptional;
            int n4 = R$string.attach_file;
            string2 = hv3_0.K(n4);
            textView.setText((CharSequence)string2);
            textView = this.mandatoryText;
            textView.setVisibility(0);
        } else {
            textView = this.attachOptional;
            int n7 = R$string.attach_file_refresh;
            string2 = hv3_0.K(n7);
            textView.setText((CharSequence)string2);
            textView = this.mandatoryText;
            textView.setVisibility(n3);
        }
    }

    private static final void setData$lambda$2(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh, View object) {
        Intrinsics.checkNotNullParameter(cCAttachmentViewHolderRefresh, "this$0");
        object = cCAttachmentViewHolderRefresh.attachToggle;
        int n3 = object.isChecked();
        if (n3 != 0) {
            object = cCAttachmentViewHolderRefresh.ccAttachmentListener;
            if (object != null) {
                object.sendTellUsMoreGAEvent();
            }
            cCAttachmentViewHolderRefresh = cCAttachmentViewHolderRefresh.mainAttachmentContainer;
            n3 = 0;
            object = null;
            cCAttachmentViewHolderRefresh.setVisibility(0);
        } else {
            cCAttachmentViewHolderRefresh = cCAttachmentViewHolderRefresh.mainAttachmentContainer;
            n3 = 8;
            cCAttachmentViewHolderRefresh.setVisibility(n3);
        }
    }

    private final void setImageContainer() {
        this.attachment.setVisibility(0);
        this.attachmentSample.setVisibility(8);
        View view = this.attachmentParent;
        CCAttachmentViewHolderRefresh$ClickListener cCAttachmentViewHolderRefresh$ClickListener = new CCAttachmentViewHolderRefresh$ClickListener(this, 17);
        view.setOnClickListener((View.OnClickListener)cCAttachmentViewHolderRefresh$ClickListener);
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

    private final void toggleSubmitBtn(boolean bl2) {
        if (bl2) {
            this.submitBtn.setEnabled(true);
            TextView textView = this.submitBtn;
            int n3 = hv3_0.m(R$color.accent_color_11);
            textView.setTextColor(n3);
            textView = this.submitBtn;
            n3 = R$drawable.revamp_secondary_button_bg;
            textView.setBackgroundResource(n3);
            textView = this.submitBtn;
            int n4 = -1;
            CCAttachmentViewHolderRefresh$ClickListener cCAttachmentViewHolderRefresh$ClickListener = new CCAttachmentViewHolderRefresh$ClickListener(this, n4);
            textView.setOnClickListener((View.OnClickListener)cCAttachmentViewHolderRefresh$ClickListener);
        } else {
            this.submitBtn.setEnabled(false);
            TextView textView = this.submitBtn;
            int n7 = hv3_0.m(R$color.accent_color_12);
            textView.setTextColor(n7);
            textView = this.submitBtn;
            n7 = R$drawable.revamp_disable_btn_bg;
            textView.setBackgroundResource(n7);
            textView = this.submitBtn;
            n7 = 0;
            Object var4_7 = null;
            textView.setOnClickListener(null);
        }
    }

    public static /* synthetic */ void w(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh, View view) {
        CCAttachmentViewHolderRefresh.setData$lambda$2(cCAttachmentViewHolderRefresh, view);
    }

    public static /* synthetic */ boolean x(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh, View view, MotionEvent motionEvent) {
        return CCAttachmentViewHolderRefresh._init_$lambda$1(cCAttachmentViewHolderRefresh, view, motionEvent);
    }

    public static /* synthetic */ void y(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh, View view, boolean bl2) {
        CCAttachmentViewHolderRefresh._init_$lambda$0(cCAttachmentViewHolderRefresh, view, bl2);
    }

    public void setData(Object object, int n3) {
        n3 = object instanceof UiCCComponent;
        if (n3 != 0) {
            object = (UiCCComponent)object;
            this.attachmentViewType = n3 = ((UiCCComponent)object).getAttachmentViewType();
            Object object2 = ((UiCCComponent)object).getQAItem();
            n3 = object2 instanceof CCItemDetailsQAModel$CCItemQALists;
            int n4 = 8;
            if (n3 != 0) {
                Object object3;
                Object object4;
                this.infoContainer.setVisibility(0);
                this.attachmentParent.setVisibility(0);
                object = ((UiCCComponent)object).getQAItem();
                object2 = "null cannot be cast to non-null type com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel.CCItemQALists";
                Intrinsics.checkNotNull(object, (String)object2);
                object = (CCItemDetailsQAModel$CCItemQALists)object;
                n3 = (int)(((CCItemDetailsQAModel$CCItemQALists)object).getAttachmentRequired() ? 1 : 0);
                this.attachmentRequired = n3;
                n3 = this.attachmentViewType;
                int n7 = 104;
                int n8 = 103;
                boolean bl2 = true;
                if (n3 != n8 && n3 != n7) {
                    this.attachToggle.setChecked(bl2);
                    this.setToggleVisibility(false);
                    object2 = this.submitBtn;
                    object4 = "Raise Complaint";
                    object2.setText((CharSequence)object4);
                } else {
                    object2 = this.attachToggle;
                    object3 = new wf_2(this);
                    object2.setOnClickListener((View.OnClickListener)object3);
                    object2 = this.attachToggle;
                    int n10 = this.attachmentViewType;
                    if (n10 != n8 && n10 != n7) {
                        n7 = 0;
                        object4 = null;
                    } else {
                        n7 = 1;
                    }
                    object2.setChecked(n7 != 0);
                    object2 = this.getMOnCCClickListener();
                    n3 = object2 instanceof CCBaseFragment;
                    if (n3 != 0) {
                        object2 = this.attachToggle;
                        object4 = FontsManager.getInstance();
                        i82_0 i82_02 = this.getMOnCCClickListener();
                        object3 = "null cannot be cast to non-null type com.ril.ajio.ondemand.customercare.view.fragment.CCBaseFragment";
                        Intrinsics.checkNotNull(i82_02, (String)object3);
                        i82_02 = ((CCBaseFragment)((Object)i82_02)).getContext();
                        object4 = Typeface.create((Typeface)((FontsManager)object4).getTypefaceWithFont((Context)i82_02, n4), (int)0);
                        object2.setTypeface((Typeface)object4);
                    }
                    this.setToggleVisibility(bl2);
                    object2 = this.submitBtn;
                    object4 = "Submit";
                    object2.setText((CharSequence)object4);
                }
                this.attachment.setVisibility(n4);
                object2 = this.attachmentSample;
                object2.setVisibility(0);
                this.handleDeleteBtn(false);
                n3 = this.attachmentViewType;
                n7 = 101;
                n8 = 18;
                object3 = "application/pdf";
                if (n3 == n7) {
                    object2 = this.attachmentParent;
                    n7 = 0;
                    object4 = null;
                    object2.setBackground(null);
                    this.writeContainer.setVisibility(n4);
                    this.uploadTxt.setVisibility(n4);
                    object2 = ((CCItemDetailsQAModel$CCItemQALists)object).getAttachmentFilePathReadOnly();
                    n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                    if (n3 == 0) {
                        object2 = ((CCItemDetailsQAModel$CCItemQALists)object).getAttachmentMimeTypeReadOnly();
                        n3 = (int)(((String)object3).equalsIgnoreCase((String)object2) ? 1 : 0);
                        if (n3 != 0) {
                            object2 = this.attachmentSample;
                            n7 = R$drawable.ic_attachment_pdf;
                            object2.setImageResource(n7);
                            object2 = this.attachmentParent;
                            object4 = new CCAttachmentViewHolderRefresh$ClickListener(this, n8);
                            object2.setOnClickListener((View.OnClickListener)object4);
                        } else {
                            object2 = this.attachmentImage;
                            object4 = ((CCItemDetailsQAModel$CCItemQALists)object).getAttachmentFilePathReadOnly();
                            object4 = ty2_2.d(n4, (String)object4);
                            object2.setImageBitmap((Bitmap)object4);
                            this.setImageContainer();
                        }
                    } else {
                        object2 = this.attachmentParent;
                        object2.setVisibility(n4);
                    }
                    object2 = ((CCItemDetailsQAModel$CCItemQALists)object).getAttachmentFileNameReadOnly();
                    this.setAttachmentText(bl2, (String)object2);
                    object2 = ((CCItemDetailsQAModel$CCItemQALists)object).getCommentReadOnly();
                    n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                    if (n3 == 0) {
                        this.attachCmntRead.setVisibility(0);
                        object2 = this.attachCmntRead;
                        object = ((CCItemDetailsQAModel$CCItemQALists)object).getCommentReadOnly();
                        object2.setText((CharSequence)object);
                    } else {
                        object = this.attachCmntRead;
                        object.setVisibility(n4);
                    }
                } else {
                    Object object5;
                    object2 = this.attachmentParent;
                    n7 = R$drawable.cc_rounded_bg_blue_refresh;
                    object4 = hv3_0.r(n7);
                    object2.setBackground((Drawable)object4);
                    this.writeContainer.setVisibility(0);
                    this.uploadTxt.setVisibility(0);
                    this.attachCmntRead.setVisibility(n4);
                    object2 = ((CCItemDetailsQAModel$CCItemQALists)object).getAttachmentMimeType();
                    n3 = (int)(((String)object3).equalsIgnoreCase((String)object2) ? 1 : 0);
                    if (n3 != 0) {
                        this.handleDeleteBtn(bl2);
                        object2 = this.attachmentSample;
                        n4 = R$drawable.ic_attachment_pdf;
                        object2.setImageResource(n4);
                        object2 = this.attachmentParent;
                        object5 = new CCAttachmentViewHolderRefresh$ClickListener(this, n8);
                        object2.setOnClickListener((View.OnClickListener)object5);
                    } else {
                        object2 = ((CCItemDetailsQAModel$CCItemQALists)object).getAttachmentFilePath();
                        n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                        if (n3 == 0 || (object2 = ((CCItemDetailsQAModel$CCItemQALists)object).getAttachmentFileUri()) != null) {
                            this.handleDeleteBtn(bl2);
                            object2 = ((CCItemDetailsQAModel$CCItemQALists)object).getAttachmentFilePath();
                            n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                            if (n3 == 0) {
                                object2 = this.attachmentImage;
                                object4 = ((CCItemDetailsQAModel$CCItemQALists)object).getAttachmentFilePath();
                                object5 = ty2_2.d(n4, (String)object4);
                                object2.setImageBitmap((Bitmap)object5);
                                this.setImageContainer();
                            } else {
                                object2 = this.attachmentImage;
                                object5 = ((CCItemDetailsQAModel$CCItemQALists)object).getAttachmentFileUri();
                                object2.setImageURI((Uri)object5);
                                this.setImageContainer();
                            }
                        }
                    }
                    object2 = ((CCItemDetailsQAModel$CCItemQALists)object).getComment();
                    n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                    object5 = "";
                    if (n3 == 0) {
                        object2 = this.comment;
                        object4 = ((CCItemDetailsQAModel$CCItemQALists)object).getComment();
                        object2.setText((CharSequence)object4);
                    } else {
                        object2 = this.comment;
                        object2.setText((CharSequence)object5);
                    }
                    object2 = ((CCItemDetailsQAModel$CCItemQALists)object).getAttachmentFileName();
                    n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                    if (n3 == 0) {
                        object = ((CCItemDetailsQAModel$CCItemQALists)object).getAttachmentFileName();
                        this.setAttachmentText(bl2, (String)object);
                    } else {
                        this.setAttachmentText(false, (String)object5);
                    }
                    this.checkSubmitBtn();
                }
            } else {
                object = this.infoContainer;
                object.setVisibility(n4);
            }
        }
    }
}

