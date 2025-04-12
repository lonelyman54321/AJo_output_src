/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.permission;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PopUpDialogModel {
    public static final int $stable;
    private final String description;
    private final String negativeButton;
    private final String positiveButton;
    private final String title;

    public PopUpDialogModel() {
        this(null, null, null, null, 15, null);
    }

    public PopUpDialogModel(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(string3, "description");
        Intrinsics.checkNotNullParameter(string4, "positiveButton");
        Intrinsics.checkNotNullParameter(string5, "negativeButton");
        this.title = string2;
        this.description = string3;
        this.positiveButton = string4;
        this.negativeButton = string5;
    }

    public /* synthetic */ PopUpDialogModel(String string2, String string3, String string4, String string5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        String string6 = "";
        if (n4 != 0) {
            string2 = string6;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = string6;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = string6;
        }
        if ((n3 &= 8) != 0) {
            string5 = string6;
        }
        this(string2, string3, string4, string5);
    }

    public static /* synthetic */ PopUpDialogModel copy$default(PopUpDialogModel popUpDialogModel, String string2, String string3, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = popUpDialogModel.title;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = popUpDialogModel.description;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = popUpDialogModel.positiveButton;
        }
        if ((n3 &= 8) != 0) {
            string5 = popUpDialogModel.negativeButton;
        }
        return popUpDialogModel.copy(string2, string3, string4, string5);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.positiveButton;
    }

    public final String component4() {
        return this.negativeButton;
    }

    public final PopUpDialogModel copy(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(string3, "description");
        Intrinsics.checkNotNullParameter(string4, "positiveButton");
        Intrinsics.checkNotNullParameter(string5, "negativeButton");
        PopUpDialogModel popUpDialogModel = new PopUpDialogModel(string2, string3, string4, string5);
        return popUpDialogModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PopUpDialogModel;
        if (!bl3) {
            return false;
        }
        object = (PopUpDialogModel)object;
        String string2 = this.title;
        String string3 = ((PopUpDialogModel)object).title;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.description;
        string3 = ((PopUpDialogModel)object).description;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.positiveButton;
        string3 = ((PopUpDialogModel)object).positiveButton;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.negativeButton;
        object = ((PopUpDialogModel)object).negativeButton;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getNegativeButton() {
        return this.negativeButton;
    }

    public final String getPositiveButton() {
        return this.positiveButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int n3 = this.title.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.description;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.positiveButton;
        n3 = zy_2.b(n3, n4, string2);
        return this.negativeButton.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.title;
        String string3 = this.description;
        String string4 = this.positiveButton;
        String string5 = this.negativeButton;
        return ko_0.a(og_1.a("PopUpDialogModel(title=", string2, ", description=", string3, ", positiveButton="), string4, ", negativeButton=", string5, ")");
    }
}

