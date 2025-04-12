/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.options;

import com.ril.ajio.services.data.options.CuratedImage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CuratedWidgetItem {
    private String filters;
    private String header;
    private CuratedImage images;
    private int position;
    private String subheader;
    private String widgetName;

    public CuratedWidgetItem(String string2, String string3, String string4, CuratedImage curatedImage, int n3, String string5) {
        Intrinsics.checkNotNullParameter(string5, "widgetName");
        this.filters = string2;
        this.header = string3;
        this.subheader = string4;
        this.images = curatedImage;
        this.position = n3;
        this.widgetName = string5;
    }

    public /* synthetic */ CuratedWidgetItem(String string2, String string3, String string4, CuratedImage curatedImage, int n3, String string5, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        String string6 = n7 != 0 ? null : string2;
        n7 = n4 & 2;
        String string7 = n7 != 0 ? null : string3;
        n7 = n4 & 4;
        String string8 = n7 != 0 ? null : string4;
        n7 = n4 & 8;
        CuratedImage curatedImage2 = n7 != 0 ? null : curatedImage;
        this(string6, string7, string8, curatedImage2, n3, string5);
    }

    public static /* synthetic */ CuratedWidgetItem copy$default(CuratedWidgetItem curatedWidgetItem, String string2, String object, String string3, CuratedImage object2, int n3, String object3, int n4, Object object4) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = curatedWidgetItem.filters;
        }
        if ((n7 = n4 & 2) != 0) {
            object = curatedWidgetItem.header;
        }
        object4 = object;
        int n8 = n4 & 4;
        if (n8 != 0) {
            string3 = curatedWidgetItem.subheader;
        }
        String string4 = string3;
        n8 = n4 & 8;
        if (n8 != 0) {
            object2 = curatedWidgetItem.images;
        }
        CuratedImage curatedImage = object2;
        n8 = n4 & 0x10;
        if (n8 != 0) {
            n3 = curatedWidgetItem.position;
        }
        int n10 = n3;
        n8 = n4 & 0x20;
        if (n8 != 0) {
            object3 = curatedWidgetItem.widgetName;
        }
        String string5 = object3;
        object = curatedWidgetItem;
        string3 = string2;
        object2 = object4;
        object3 = curatedImage;
        n4 = n10;
        object4 = string5;
        return curatedWidgetItem.copy(string2, (String)object2, string4, curatedImage, n10, string5);
    }

    public final String component1() {
        return this.filters;
    }

    public final String component2() {
        return this.header;
    }

    public final String component3() {
        return this.subheader;
    }

    public final CuratedImage component4() {
        return this.images;
    }

    public final int component5() {
        return this.position;
    }

    public final String component6() {
        return this.widgetName;
    }

    public final CuratedWidgetItem copy(String string2, String string3, String string4, CuratedImage curatedImage, int n3, String string5) {
        Intrinsics.checkNotNullParameter(string5, "widgetName");
        CuratedWidgetItem curatedWidgetItem = new CuratedWidgetItem(string2, string3, string4, curatedImage, n3, string5);
        return curatedWidgetItem;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof CuratedWidgetItem;
        if (n3 == 0) {
            return false;
        }
        object = (CuratedWidgetItem)object;
        Object object2 = this.filters;
        Object object3 = ((CuratedWidgetItem)object).filters;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.header;
        object3 = ((CuratedWidgetItem)object).header;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.subheader;
        object3 = ((CuratedWidgetItem)object).subheader;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.images;
        object3 = ((CuratedWidgetItem)object).images;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.position;
        int n4 = ((CuratedWidgetItem)object).position;
        if (n3 != n4) {
            return false;
        }
        object2 = this.widgetName;
        object = ((CuratedWidgetItem)object).widgetName;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getFilters() {
        return this.filters;
    }

    public final String getHeader() {
        return this.header;
    }

    public final CuratedImage getImages() {
        return this.images;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getSubheader() {
        return this.subheader;
    }

    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.filters;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.header;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.subheader;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.images;
        if (object != null) {
            n7 = ((CuratedImage)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = this.position;
        n4 = (n4 + n7) * 31;
        return this.widgetName.hashCode() + n4;
    }

    public final void setFilters(String string2) {
        this.filters = string2;
    }

    public final void setHeader(String string2) {
        this.header = string2;
    }

    public final void setImages(CuratedImage curatedImage) {
        this.images = curatedImage;
    }

    public final void setPosition(int n3) {
        this.position = n3;
    }

    public final void setSubheader(String string2) {
        this.subheader = string2;
    }

    public final void setWidgetName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.widgetName = string2;
    }

    public String toString() {
        CharSequence charSequence = this.filters;
        String string2 = this.header;
        String string3 = this.subheader;
        CuratedImage curatedImage = this.images;
        int n3 = this.position;
        String string4 = this.widgetName;
        charSequence = og_1.a("CuratedWidgetItem(filters=", (String)charSequence, ", header=", string2, ", subheader=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", images=");
        ((StringBuilder)charSequence).append(curatedImage);
        ((StringBuilder)charSequence).append(", position=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", widgetName=");
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

