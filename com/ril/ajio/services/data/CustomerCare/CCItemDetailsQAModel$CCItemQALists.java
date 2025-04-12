/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.CustomerCare;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.CustomerCare.CCHelpInterface;
import com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel$CCItemQALists$1;

public class CCItemDetailsQAModel$CCItemQALists
implements Parcelable,
CCHelpInterface {
    public static final Parcelable.Creator CREATOR;
    private String answer;
    private String attachmentFileName;
    private String attachmentFileNameReadOnly;
    private String attachmentFilePath;
    private String attachmentFilePathReadOnly;
    private Uri attachmentFileUri;
    private String attachmentMimeType;
    private String attachmentMimeTypeReadOnly;
    private boolean attachmentRequired;
    private String base64;
    private boolean callbackEnabled;
    private String callbackMessage;
    private String category;
    private boolean chatEnabled;
    private String chatMessage;
    private String comment;
    private String commentReadOnly;
    private String description;
    private boolean isComplaint;
    private String leafcategory;
    private String noofDays;
    private String orderNumber;
    private String productName;
    private String question;
    private String subcategory;
    private String workGroup;

    static {
        CCItemDetailsQAModel$CCItemQALists$1 cCItemDetailsQAModel$CCItemQALists$1 = new CCItemDetailsQAModel$CCItemQALists$1();
        CREATOR = cCItemDetailsQAModel$CCItemQALists$1;
    }

    public CCItemDetailsQAModel$CCItemQALists() {
    }

    public CCItemDetailsQAModel$CCItemQALists(Parcel object) {
        Object object2 = object.readString();
        this.answer = object2;
        object2 = object.readString();
        this.category = object2;
        object2 = object.readString();
        this.description = object2;
        int n3 = object.readByte();
        boolean bl2 = false;
        int n4 = 1;
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        this.isComplaint = n3;
        object2 = object.readString();
        this.leafcategory = object2;
        object2 = object.readString();
        this.noofDays = object2;
        object2 = object.readString();
        this.orderNumber = object2;
        object2 = object.readString();
        this.question = object2;
        object2 = object.readString();
        this.subcategory = object2;
        object2 = object.readString();
        this.workGroup = object2;
        n3 = object.readInt();
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        this.attachmentRequired = n3;
        object2 = object.readString();
        this.comment = object2;
        object2 = object.readString();
        this.attachmentFilePath = object2;
        object2 = object.readString();
        this.attachmentFileName = object2;
        object2 = Uri.class.getClassLoader();
        object2 = (Uri)object.readParcelable((ClassLoader)object2);
        this.attachmentFileUri = object2;
        this.base64 = object2 = object.readString();
        this.attachmentMimeType = object2 = object.readString();
        this.attachmentMimeTypeReadOnly = object2 = object.readString();
        this.attachmentFilePathReadOnly = object2 = object.readString();
        this.commentReadOnly = object2 = object.readString();
        this.attachmentFileNameReadOnly = object2 = object.readString();
        this.chatMessage = object2 = object.readString();
        n3 = object.readByte();
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        this.chatEnabled = n3;
        this.callbackMessage = object2 = object.readString();
        n3 = object.readByte();
        if (n3 != 0) {
            bl2 = true;
        }
        this.callbackEnabled = bl2;
        object = object.readString();
        this.productName = object;
    }

    public int describeContents() {
        return 0;
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getAttachmentFileName() {
        return this.attachmentFileName;
    }

    public String getAttachmentFileNameReadOnly() {
        return this.attachmentFileNameReadOnly;
    }

    public String getAttachmentFilePath() {
        return this.attachmentFilePath;
    }

    public String getAttachmentFilePathReadOnly() {
        return this.attachmentFilePathReadOnly;
    }

    public Uri getAttachmentFileUri() {
        return this.attachmentFileUri;
    }

    public String getAttachmentMimeType() {
        return this.attachmentMimeType;
    }

    public String getAttachmentMimeTypeReadOnly() {
        return this.attachmentMimeTypeReadOnly;
    }

    public boolean getAttachmentRequired() {
        return this.attachmentRequired;
    }

    public String getBase64() {
        return this.base64;
    }

    public String getCallbackMessage() {
        return this.callbackMessage;
    }

    public String getCategory() {
        return this.category;
    }

    public String getChatMessage() {
        return this.chatMessage;
    }

    public String getComment() {
        return this.comment;
    }

    public String getCommentReadOnly() {
        return this.commentReadOnly;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getIsComplaint() {
        return this.isComplaint;
    }

    public String getLeafcategory() {
        return this.leafcategory;
    }

    public String getNoofDays() {
        return this.noofDays;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getSubcategory() {
        return this.subcategory;
    }

    public String getWorkGroup() {
        return this.workGroup;
    }

    public boolean isCallbackEnabled() {
        return this.callbackEnabled;
    }

    public boolean isChatEnabled() {
        return this.chatEnabled;
    }

    public void setAttachmentFileName(String string2) {
        this.attachmentFileName = string2;
    }

    public void setAttachmentFileNameReadOnly(String string2) {
        this.attachmentFileNameReadOnly = string2;
    }

    public void setAttachmentFilePath(String string2) {
        this.attachmentFilePath = string2;
    }

    public void setAttachmentFilePathReadOnly(String string2) {
        this.attachmentFilePathReadOnly = string2;
    }

    public void setAttachmentFileUri(Uri uri) {
        this.attachmentFileUri = uri;
    }

    public void setAttachmentMimeType(String string2) {
        this.attachmentMimeType = string2;
    }

    public void setAttachmentMimeTypeReadOnly(String string2) {
        this.attachmentMimeTypeReadOnly = string2;
    }

    public void setAttachmentRequired(boolean bl2) {
        this.attachmentRequired = bl2;
    }

    public void setBase64(String string2) {
        this.base64 = string2;
    }

    public void setCallbackEnabled(boolean bl2) {
        this.callbackEnabled = bl2;
    }

    public void setCallbackMessage(String string2) {
        this.callbackMessage = string2;
    }

    public void setCategory(String string2) {
        this.category = string2;
    }

    public void setChatEnabled(boolean bl2) {
        this.chatEnabled = bl2;
    }

    public void setChatMessage(String string2) {
        this.chatMessage = string2;
    }

    public void setComment(String string2) {
        this.comment = string2;
    }

    public void setCommentReadOnly(String string2) {
        this.commentReadOnly = string2;
    }

    public void setDescription(String string2) {
        this.description = string2;
    }

    public void setLeafcategory(String string2) {
        this.leafcategory = string2;
    }

    public void setNoofDays(String string2) {
        this.noofDays = string2;
    }

    public void setOrderNumber(String string2) {
        this.orderNumber = string2;
    }

    public void setProductName(String string2) {
        this.productName = string2;
    }

    public void setSubcategory(String string2) {
        this.subcategory = string2;
    }

    public void setWorkGroup(String string2) {
        this.workGroup = string2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.answer;
        parcel.writeString(string2);
        string2 = this.category;
        parcel.writeString(string2);
        string2 = this.description;
        parcel.writeString(string2);
        n3 = (byte)(this.isComplaint ? 1 : 0);
        parcel.writeByte((byte)n3);
        string2 = this.leafcategory;
        parcel.writeString(string2);
        string2 = this.noofDays;
        parcel.writeString(string2);
        string2 = this.orderNumber;
        parcel.writeString(string2);
        string2 = this.question;
        parcel.writeString(string2);
        string2 = this.subcategory;
        parcel.writeString(string2);
        string2 = this.workGroup;
        parcel.writeString(string2);
        n3 = (int)(this.attachmentRequired ? 1 : 0);
        parcel.writeInt(n3);
        string2 = this.comment;
        parcel.writeString(string2);
        string2 = this.attachmentFilePath;
        parcel.writeString(string2);
        string2 = this.attachmentFileName;
        parcel.writeString(string2);
        string2 = this.attachmentFileUri;
        parcel.writeParcelable((Parcelable)string2, 1);
        string2 = this.base64;
        parcel.writeString(string2);
        string2 = this.attachmentMimeType;
        parcel.writeString(string2);
        string2 = this.attachmentMimeTypeReadOnly;
        parcel.writeString(string2);
        string2 = this.getAttachmentFilePathReadOnly();
        parcel.writeString(string2);
        string2 = this.getCommentReadOnly();
        parcel.writeString(string2);
        string2 = this.getAttachmentFileNameReadOnly();
        parcel.writeString(string2);
        string2 = this.chatMessage;
        parcel.writeString(string2);
        n3 = (byte)(this.chatEnabled ? 1 : 0);
        parcel.writeByte((byte)n3);
        string2 = this.callbackMessage;
        parcel.writeString(string2);
        n3 = (byte)(this.callbackEnabled ? 1 : 0);
        parcel.writeByte((byte)n3);
        string2 = this.productName;
        parcel.writeString(string2);
    }
}

