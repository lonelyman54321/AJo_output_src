/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.ondemand.customercare.view.common;

import android.text.TextUtils;
import com.ril.ajio.services.data.Cart.CartItem;
import com.ril.ajio.services.data.CustomerCare.CCHelpInterface;
import com.ril.ajio.services.data.CustomerCare.QuestionAnswerList;

public class UiCCComponent
implements CartItem {
    public static final int CC_ATTACHMENT_VIEW = 21;
    public static final int CC_ATTACHMENT_VIEW_TYPE_EXPANDABLE = 103;
    public static final int CC_ATTACHMENT_VIEW_TYPE_EXPANDABLE_EXPANDED = 104;
    public static final int CC_ATTACHMENT_VIEW_TYPE_MULTIPLE_FILES = 105;
    public static final int CC_ATTACHMENT_VIEW_TYPE_MULTIPLE_FILES_READ_ONLY = 106;
    public static final int CC_ATTACHMENT_VIEW_TYPE_READ_ONLY = 101;
    public static final int CC_ATTACHMENT_VIEW_TYPE_READ_WRITE = 102;
    public static final int CC_CART_VIEW = 16;
    public static final int CC_COMPLAINT_DETAIL_VIEW = 22;
    public static final int CC_COMPLAINT_VIEW = 19;
    public static final int CC_COMPLAINT_VIEW_ITEM = 20;
    public static final int CC_CONTACT_US_VIEW = 8;
    public static final int CC_DIVIDER = 1;
    public static final int CC_FAQ_ANSWER = 18;
    public static final int CC_FAQ_SEARCH = 23;
    public static final int CC_FAQ_SEARCH_RESULT_VIEW = 24;
    public static final int CC_FAQ_VIEW = 2;
    public static final int CC_FOOTER_VIEW = 17;
    public static final int CC_HEADER_VIEW = 3;
    public static final int CC_HELP_BUTTON = 6;
    public static final int CC_ITEM_DETAIL_PRODUCT_VIEW = 13;
    public static final int CC_ITEM_DETAIL_VIEW = 7;
    public static final int CC_ITEM_HELP_ALERT_VIEW = 11;
    public static final int CC_ITEM_HELP_CONTACT_US_VIEW = 15;
    public static final int CC_ITEM_HELP_HEADER_VIEW = 12;
    public static final int CC_ITEM_HELP_RATING_VIEW = 10;
    public static final int CC_ITEM_LIST_PRODUCT_VIEW = 9;
    public static final int CC_LOGIN_VIEW = 5;
    public static final int CC_SELECT_ORDER_PRODUCT_VIEW = 14;
    public static final int CC_TITLE_VIEW = 4;
    private int attachmentViewType;
    private Object data;
    private int height;
    private CCHelpInterface helpInterface;
    private int leftMargin;
    private String name;
    private int position;
    private QuestionAnswerList questionAnswerList;
    private int rightMargin;
    private int type;

    public UiCCComponent(int n3, int n4) {
        this.type = n3;
        this.height = n4;
    }

    public UiCCComponent(int n3, int n4, int n7, int n8) {
        this.type = n3;
        this.height = n4;
        this.rightMargin = n8;
        this.leftMargin = n7;
    }

    public UiCCComponent(int n3, QuestionAnswerList questionAnswerList, int n4) {
        this.type = n3;
        this.position = n4;
        this.questionAnswerList = questionAnswerList;
    }

    public UiCCComponent(int n3, Object object, int n4) {
        this.type = n3;
        this.data = object;
        this.position = n4;
    }

    public UiCCComponent(int n3, String string2) {
        this.type = n3;
        this.name = string2;
    }

    public UiCCComponent(int n3, String string2, int n4) {
        this.type = n3;
        this.position = n4;
        this.name = string2;
    }

    public UiCCComponent(int n3, String string2, CCHelpInterface cCHelpInterface) {
        this.type = n3;
        this.name = string2;
        this.helpInterface = cCHelpInterface;
    }

    public UiCCComponent(int n3, String string2, CCHelpInterface cCHelpInterface, int n4) {
        this.type = n3;
        this.name = string2;
        this.helpInterface = cCHelpInterface;
        this.attachmentViewType = n4;
    }

    public int getAttachmentViewType() {
        return this.attachmentViewType;
    }

    public Object getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLeftMargin() {
        return this.leftMargin;
    }

    public String getName() {
        String string2 = this.name;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            this.name = string2 = " ";
        }
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public CCHelpInterface getQAItem() {
        return this.helpInterface;
    }

    public QuestionAnswerList getQuestionAnswerList() {
        return this.questionAnswerList;
    }

    public int getRightMargin() {
        return this.rightMargin;
    }

    public int getType() {
        return this.type;
    }

    public void setAttachmentViewType(int n3) {
        this.attachmentViewType = n3;
    }
}

