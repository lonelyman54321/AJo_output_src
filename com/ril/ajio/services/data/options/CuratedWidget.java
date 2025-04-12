/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.options;

import com.ril.ajio.services.data.options.CuratedLayoutType;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CuratedWidget {
    private ArrayList curatedWidgetItemList;
    private CuratedLayoutType layoutType;
    private String widgetLevel;
    private String widgetName;

    public CuratedWidget() {
        this(null, null, null, null, 15, null);
    }

    public CuratedWidget(String string2, String string3, ArrayList arrayList, CuratedLayoutType curatedLayoutType) {
        Intrinsics.checkNotNullParameter(arrayList, "curatedWidgetItemList");
        Intrinsics.checkNotNullParameter((Object)curatedLayoutType, "layoutType");
        this.widgetName = string2;
        this.widgetLevel = string3;
        this.curatedWidgetItemList = arrayList;
        this.layoutType = curatedLayoutType;
    }

    public /* synthetic */ CuratedWidget(String string2, String string3, ArrayList arrayList, CuratedLayoutType curatedLayoutType, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            arrayList = new ArrayList();
        }
        if ((n3 &= 8) != 0) {
            curatedLayoutType = CuratedLayoutType.HOME_WIDGET_TYPE_SHIMMER;
        }
        this(string2, string3, arrayList, curatedLayoutType);
    }

    public static /* synthetic */ CuratedWidget copy$default(CuratedWidget curatedWidget, String string2, String string3, ArrayList arrayList, CuratedLayoutType curatedLayoutType, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = curatedWidget.widgetName;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = curatedWidget.widgetLevel;
        }
        if ((n4 = n3 & 4) != 0) {
            arrayList = curatedWidget.curatedWidgetItemList;
        }
        if ((n3 &= 8) != 0) {
            curatedLayoutType = curatedWidget.layoutType;
        }
        return curatedWidget.copy(string2, string3, arrayList, curatedLayoutType);
    }

    public final String component1() {
        return this.widgetName;
    }

    public final String component2() {
        return this.widgetLevel;
    }

    public final ArrayList component3() {
        return this.curatedWidgetItemList;
    }

    public final CuratedLayoutType component4() {
        return this.layoutType;
    }

    public final CuratedWidget copy(String string2, String string3, ArrayList arrayList, CuratedLayoutType curatedLayoutType) {
        Intrinsics.checkNotNullParameter(arrayList, "curatedWidgetItemList");
        Intrinsics.checkNotNullParameter((Object)curatedLayoutType, "layoutType");
        CuratedWidget curatedWidget = new CuratedWidget(string2, string3, arrayList, curatedLayoutType);
        return curatedWidget;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CuratedWidget;
        if (!bl3) {
            return false;
        }
        object = (CuratedWidget)object;
        Object object2 = this.widgetName;
        Object object3 = ((CuratedWidget)object).widgetName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.widgetLevel;
        object3 = ((CuratedWidget)object).widgetLevel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.curatedWidgetItemList;
        object3 = ((CuratedWidget)object).curatedWidgetItemList;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.layoutType;
        object = ((CuratedWidget)object).layoutType;
        if (object2 != object) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getCuratedWidgetItemList() {
        return this.curatedWidgetItemList;
    }

    public final CuratedLayoutType getLayoutType() {
        return this.layoutType;
    }

    public final String getWidgetLevel() {
        return this.widgetLevel;
    }

    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int n3;
        String string2 = this.widgetName;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.widgetLevel;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = (this.curatedWidgetItemList.hashCode() + n3) * 31;
        return ((Object)((Object)this.layoutType)).hashCode() + n4;
    }

    public final void setCuratedWidgetItemList(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.curatedWidgetItemList = arrayList;
    }

    public final void setLayoutType(CuratedLayoutType curatedLayoutType) {
        Intrinsics.checkNotNullParameter((Object)curatedLayoutType, "<set-?>");
        this.layoutType = curatedLayoutType;
    }

    public final void setWidgetLevel(String string2) {
        this.widgetLevel = string2;
    }

    public final void setWidgetName(String string2) {
        this.widgetName = string2;
    }

    public String toString() {
        CharSequence charSequence = this.widgetName;
        String string2 = this.widgetLevel;
        ArrayList arrayList = this.curatedWidgetItemList;
        CuratedLayoutType curatedLayoutType = this.layoutType;
        charSequence = og_1.a("CuratedWidget(widgetName=", (String)charSequence, ", widgetLevel=", string2, ", curatedWidgetItemList=");
        ((StringBuilder)charSequence).append(arrayList);
        ((StringBuilder)charSequence).append(", layoutType=");
        ((StringBuilder)charSequence).append((Object)curatedLayoutType);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

