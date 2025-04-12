/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnRefundNewReturnCreation
implements Serializable {
    private final ArrayList bodyContent;
    private final ArrayList bottomLinkContent;
    private final String headerMessage;
    private final Boolean isReturnCancelled;
    private final Boolean isWindowAvailable;
    private final String message;
    private final String subMessage;

    public ReturnRefundNewReturnCreation(String string2, String string3, String string4, ArrayList arrayList, ArrayList arrayList2, Boolean bl2, Boolean bl3) {
        this.message = string2;
        this.subMessage = string3;
        this.headerMessage = string4;
        this.bodyContent = arrayList;
        this.bottomLinkContent = arrayList2;
        this.isWindowAvailable = bl2;
        this.isReturnCancelled = bl3;
    }

    public /* synthetic */ ReturnRefundNewReturnCreation(String string2, String string3, String string4, ArrayList arrayList, ArrayList arrayList2, Boolean bl2, Boolean bl3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bl4;
        int n4 = n3 & 0x20;
        Boolean bl5 = n4 != 0 ? (bl4 = Boolean.FALSE) : bl2;
        n4 = n3 & 0x40;
        Boolean bl6 = n4 != 0 ? (bl4 = Boolean.FALSE) : bl3;
        this(string2, string3, string4, arrayList, arrayList2, bl5, bl6);
    }

    public static /* synthetic */ ReturnRefundNewReturnCreation copy$default(ReturnRefundNewReturnCreation returnRefundNewReturnCreation, String string2, String object, String string3, ArrayList object2, ArrayList object3, Boolean serializable, Boolean serializable2, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = returnRefundNewReturnCreation.message;
        }
        if ((n4 = n3 & 2) != 0) {
            object = returnRefundNewReturnCreation.subMessage;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = returnRefundNewReturnCreation.headerMessage;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = returnRefundNewReturnCreation.bodyContent;
        }
        ArrayList arrayList = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = returnRefundNewReturnCreation.bottomLinkContent;
        }
        ArrayList arrayList2 = object3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            serializable = returnRefundNewReturnCreation.isWindowAvailable;
        }
        Boolean bl2 = serializable;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            serializable2 = returnRefundNewReturnCreation.isReturnCancelled;
        }
        Boolean bl3 = serializable2;
        object = returnRefundNewReturnCreation;
        string3 = string2;
        object2 = object4;
        object3 = string4;
        serializable = arrayList;
        serializable2 = arrayList2;
        object4 = bl3;
        return returnRefundNewReturnCreation.copy(string2, (String)object2, string4, arrayList, arrayList2, bl2, bl3);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.subMessage;
    }

    public final String component3() {
        return this.headerMessage;
    }

    public final ArrayList component4() {
        return this.bodyContent;
    }

    public final ArrayList component5() {
        return this.bottomLinkContent;
    }

    public final Boolean component6() {
        return this.isWindowAvailable;
    }

    public final Boolean component7() {
        return this.isReturnCancelled;
    }

    public final ReturnRefundNewReturnCreation copy(String string2, String string3, String string4, ArrayList arrayList, ArrayList arrayList2, Boolean bl2, Boolean bl3) {
        ReturnRefundNewReturnCreation returnRefundNewReturnCreation = new ReturnRefundNewReturnCreation(string2, string3, string4, arrayList, arrayList2, bl2, bl3);
        return returnRefundNewReturnCreation;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReturnRefundNewReturnCreation;
        if (!bl3) {
            return false;
        }
        object = (ReturnRefundNewReturnCreation)object;
        Object object2 = this.message;
        Object object3 = ((ReturnRefundNewReturnCreation)object).message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subMessage;
        object3 = ((ReturnRefundNewReturnCreation)object).subMessage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.headerMessage;
        object3 = ((ReturnRefundNewReturnCreation)object).headerMessage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bodyContent;
        object3 = ((ReturnRefundNewReturnCreation)object).bodyContent;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bottomLinkContent;
        object3 = ((ReturnRefundNewReturnCreation)object).bottomLinkContent;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isWindowAvailable;
        object3 = ((ReturnRefundNewReturnCreation)object).isWindowAvailable;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isReturnCancelled;
        object = ((ReturnRefundNewReturnCreation)object).isReturnCancelled;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getBodyContent() {
        return this.bodyContent;
    }

    public final ArrayList getBottomLinkContent() {
        return this.bottomLinkContent;
    }

    public final String getHeaderMessage() {
        return this.headerMessage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getSubMessage() {
        return this.subMessage;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.message;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.subMessage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.headerMessage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bodyContent;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bottomLinkContent;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isWindowAvailable;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isReturnCancelled;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isReturnCancelled() {
        return this.isReturnCancelled;
    }

    public final Boolean isWindowAvailable() {
        return this.isWindowAvailable;
    }

    public String toString() {
        CharSequence charSequence = this.message;
        String string2 = this.subMessage;
        String string3 = this.headerMessage;
        ArrayList arrayList = this.bodyContent;
        ArrayList arrayList2 = this.bottomLinkContent;
        Boolean bl2 = this.isWindowAvailable;
        Boolean bl3 = this.isReturnCancelled;
        charSequence = og_1.a("ReturnRefundNewReturnCreation(message=", (String)charSequence, ", subMessage=", string2, ", headerMessage=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", bodyContent=");
        ((StringBuilder)charSequence).append(arrayList);
        ((StringBuilder)charSequence).append(", bottomLinkContent=");
        ((StringBuilder)charSequence).append(arrayList2);
        ((StringBuilder)charSequence).append(", isWindowAvailable=");
        ((StringBuilder)charSequence).append(bl2);
        ((StringBuilder)charSequence).append(", isReturnCancelled=");
        return nx3_0.a((StringBuilder)charSequence, bl3, ")");
    }
}

