/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CustomerCare;

import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfoNew;
import com.ril.ajio.services.data.CustomerCare.CCHelpInterface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CCItemMultiFileAttachModel
implements CCHelpInterface {
    private final CCComplaintAttachInfoNew attacheInfo;
    private String attachmentError;
    private String commentError;
    private final String header;
    private final boolean isAttachmentMandatory;
    private final boolean isCommentMandatory;
    private final int maxImagesAllowed;

    public CCItemMultiFileAttachModel(CCComplaintAttachInfoNew cCComplaintAttachInfoNew, int n3, boolean bl2, boolean bl3, String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string4, "header");
        this.attacheInfo = cCComplaintAttachInfoNew;
        this.maxImagesAllowed = n3;
        this.isAttachmentMandatory = bl2;
        this.isCommentMandatory = bl3;
        this.attachmentError = string2;
        this.commentError = string3;
        this.header = string4;
    }

    public /* synthetic */ CCItemMultiFileAttachModel(CCComplaintAttachInfoNew cCComplaintAttachInfoNew, int n3, boolean bl2, boolean bl3, String string2, String string3, String string4, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 0x10;
        String string5 = n7 != 0 ? null : string2;
        n7 = n4 & 0x20;
        String string6 = n7 != 0 ? null : string3;
        this(cCComplaintAttachInfoNew, n3, bl2, bl3, string5, string6, string4);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ CCItemMultiFileAttachModel copy$default(CCItemMultiFileAttachModel cCItemMultiFileAttachModel, CCComplaintAttachInfoNew cCComplaintAttachInfoNew, int n3, boolean bl2, boolean bl3, String string2, String string3, String string4, int n4, Object object) {
        String string5;
        String string6;
        String string7;
        boolean bl4;
        void var8_10;
        int n7 = var8_10 & 1;
        if (n7 != 0) {
            cCComplaintAttachInfoNew = cCItemMultiFileAttachModel.attacheInfo;
        }
        if ((n7 = var8_10 & 2) != 0) {
            n3 = cCItemMultiFileAttachModel.maxImagesAllowed;
        }
        n7 = n3;
        n3 = var8_10 & 4;
        if (n3 != 0) {
            bl2 = cCItemMultiFileAttachModel.isAttachmentMandatory;
        }
        boolean bl5 = bl2;
        n3 = var8_10 & 8;
        if (n3 != 0) {
            bl4 = cCItemMultiFileAttachModel.isCommentMandatory;
        }
        void var12_14 = bl4;
        n3 = var8_10 & 0x10;
        if (n3 != 0) {
            string7 = cCItemMultiFileAttachModel.attachmentError;
        }
        void var13_15 = string7;
        n3 = var8_10 & 0x20;
        if (n3 != 0) {
            string6 = cCItemMultiFileAttachModel.commentError;
        }
        void var14_16 = string6;
        n3 = var8_10 & 0x40;
        if (n3 != 0) {
            string5 = cCItemMultiFileAttachModel.header;
        }
        void var15_17 = string5;
        int n8 = n7;
        string5 = var13_15;
        return cCItemMultiFileAttachModel.copy(cCComplaintAttachInfoNew, n7, bl5, (boolean)var12_14, (String)var13_15, (String)var14_16, (String)var15_17);
    }

    public final CCComplaintAttachInfoNew component1() {
        return this.attacheInfo;
    }

    public final int component2() {
        return this.maxImagesAllowed;
    }

    public final boolean component3() {
        return this.isAttachmentMandatory;
    }

    public final boolean component4() {
        return this.isCommentMandatory;
    }

    public final String component5() {
        return this.attachmentError;
    }

    public final String component6() {
        return this.commentError;
    }

    public final String component7() {
        return this.header;
    }

    public final CCItemMultiFileAttachModel copy(CCComplaintAttachInfoNew cCComplaintAttachInfoNew, int n3, boolean bl2, boolean bl3, String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string4, "header");
        CCItemMultiFileAttachModel cCItemMultiFileAttachModel = new CCItemMultiFileAttachModel(cCComplaintAttachInfoNew, n3, bl2, bl3, string2, string3, string4);
        return cCItemMultiFileAttachModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof CCItemMultiFileAttachModel;
        if (n3 == 0) {
            return false;
        }
        object = (CCItemMultiFileAttachModel)object;
        Object object2 = this.attacheInfo;
        Object object3 = ((CCItemMultiFileAttachModel)object).attacheInfo;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.maxImagesAllowed;
        int n4 = ((CCItemMultiFileAttachModel)object).maxImagesAllowed;
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isAttachmentMandatory ? 1 : 0);
        n4 = (int)(((CCItemMultiFileAttachModel)object).isAttachmentMandatory ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isCommentMandatory ? 1 : 0);
        n4 = (int)(((CCItemMultiFileAttachModel)object).isCommentMandatory ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.attachmentError;
        object3 = ((CCItemMultiFileAttachModel)object).attachmentError;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.commentError;
        object3 = ((CCItemMultiFileAttachModel)object).commentError;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.header;
        object = ((CCItemMultiFileAttachModel)object).header;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final CCComplaintAttachInfoNew getAttacheInfo() {
        return this.attacheInfo;
    }

    public final String getAttachmentError() {
        return this.attachmentError;
    }

    public final String getCommentError() {
        return this.commentError;
    }

    public final String getHeader() {
        return this.header;
    }

    public final int getMaxImagesAllowed() {
        return this.maxImagesAllowed;
    }

    public int hashCode() {
        int n3;
        CCComplaintAttachInfoNew cCComplaintAttachInfoNew = this.attacheInfo;
        int n4 = 0;
        if (cCComplaintAttachInfoNew == null) {
            n3 = 0;
            cCComplaintAttachInfoNew = null;
        } else {
            n3 = cCComplaintAttachInfoNew.hashCode();
        }
        n3 *= 31;
        int n7 = this.maxImagesAllowed;
        n3 = (n3 + n7) * 31;
        n7 = (int)(this.isAttachmentMandatory ? 1 : 0);
        int n8 = 1237;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        n7 = (int)(this.isCommentMandatory ? 1 : 0);
        if (n7 != 0) {
            n8 = 1231;
        }
        n3 = (n3 + n8) * 31;
        String string2 = this.attachmentError;
        if (string2 == null) {
            n7 = 0;
            string2 = null;
        } else {
            n7 = string2.hashCode();
        }
        n3 = (n3 + n7) * 31;
        string2 = this.commentError;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        n3 = (n3 + n4) * 31;
        return this.header.hashCode() + n3;
    }

    public final boolean isAttachmentMandatory() {
        return this.isAttachmentMandatory;
    }

    public final boolean isCommentMandatory() {
        return this.isCommentMandatory;
    }

    public final void setAttachmentError(String string2) {
        this.attachmentError = string2;
    }

    public final void setCommentError(String string2) {
        this.commentError = string2;
    }

    public String toString() {
        CCComplaintAttachInfoNew cCComplaintAttachInfoNew = this.attacheInfo;
        int n3 = this.maxImagesAllowed;
        boolean bl2 = this.isAttachmentMandatory;
        boolean bl3 = this.isCommentMandatory;
        String string2 = this.attachmentError;
        String string3 = this.commentError;
        String string4 = this.header;
        StringBuilder stringBuilder = new StringBuilder("CCItemMultiFileAttachModel(attacheInfo=");
        stringBuilder.append(cCComplaintAttachInfoNew);
        stringBuilder.append(", maxImagesAllowed=");
        stringBuilder.append(n3);
        stringBuilder.append(", isAttachmentMandatory=");
        I81.a(", isCommentMandatory=", ", attachmentError=", stringBuilder, bl2, bl3);
        X50.a(stringBuilder, string2, ", commentError=", string3, ", header=");
        return h30_0.a(stringBuilder, string4, ")");
    }
}

