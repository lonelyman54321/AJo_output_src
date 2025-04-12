/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.permission;

import com.ril.ajio.permission.PopUpDialogModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SessionsData {
    public static final int $stable;
    private final PopUpDialogModel inAppPopUpDialogModel;
    private final PopUpDialogModel systemDialogModel;

    public SessionsData() {
        this(null, null, 3, null);
    }

    public SessionsData(PopUpDialogModel popUpDialogModel, PopUpDialogModel popUpDialogModel2) {
        this.inAppPopUpDialogModel = popUpDialogModel;
        this.systemDialogModel = popUpDialogModel2;
    }

    public /* synthetic */ SessionsData(PopUpDialogModel popUpDialogModel, PopUpDialogModel popUpDialogModel2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            popUpDialogModel = null;
        }
        if ((n3 &= 2) != 0) {
            popUpDialogModel2 = null;
        }
        this(popUpDialogModel, popUpDialogModel2);
    }

    public static /* synthetic */ SessionsData copy$default(SessionsData sessionsData, PopUpDialogModel popUpDialogModel, PopUpDialogModel popUpDialogModel2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            popUpDialogModel = sessionsData.inAppPopUpDialogModel;
        }
        if ((n3 &= 2) != 0) {
            popUpDialogModel2 = sessionsData.systemDialogModel;
        }
        return sessionsData.copy(popUpDialogModel, popUpDialogModel2);
    }

    public final PopUpDialogModel component1() {
        return this.inAppPopUpDialogModel;
    }

    public final PopUpDialogModel component2() {
        return this.systemDialogModel;
    }

    public final SessionsData copy(PopUpDialogModel popUpDialogModel, PopUpDialogModel popUpDialogModel2) {
        SessionsData sessionsData = new SessionsData(popUpDialogModel, popUpDialogModel2);
        return sessionsData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SessionsData;
        if (!bl3) {
            return false;
        }
        object = (SessionsData)object;
        PopUpDialogModel popUpDialogModel = this.inAppPopUpDialogModel;
        PopUpDialogModel popUpDialogModel2 = ((SessionsData)object).inAppPopUpDialogModel;
        bl3 = Intrinsics.areEqual(popUpDialogModel, popUpDialogModel2);
        if (!bl3) {
            return false;
        }
        popUpDialogModel = this.systemDialogModel;
        object = ((SessionsData)object).systemDialogModel;
        boolean bl4 = Intrinsics.areEqual(popUpDialogModel, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final PopUpDialogModel getInAppPopUpDialogModel() {
        return this.inAppPopUpDialogModel;
    }

    public final PopUpDialogModel getSystemDialogModel() {
        return this.systemDialogModel;
    }

    public int hashCode() {
        int n3;
        PopUpDialogModel popUpDialogModel = this.inAppPopUpDialogModel;
        int n4 = 0;
        if (popUpDialogModel == null) {
            n3 = 0;
            popUpDialogModel = null;
        } else {
            n3 = popUpDialogModel.hashCode();
        }
        n3 *= 31;
        PopUpDialogModel popUpDialogModel2 = this.systemDialogModel;
        if (popUpDialogModel2 != null) {
            n4 = popUpDialogModel2.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        PopUpDialogModel popUpDialogModel = this.inAppPopUpDialogModel;
        PopUpDialogModel popUpDialogModel2 = this.systemDialogModel;
        StringBuilder stringBuilder = new StringBuilder("SessionsData(inAppPopUpDialogModel=");
        stringBuilder.append(popUpDialogModel);
        stringBuilder.append(", systemDialogModel=");
        stringBuilder.append(popUpDialogModel2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

