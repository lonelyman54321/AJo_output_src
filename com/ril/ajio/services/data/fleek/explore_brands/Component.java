/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import com.ril.ajio.services.data.fleek.explore_brands.Cta;
import com.ril.ajio.services.data.fleek.explore_brands.MetaData;
import com.ril.ajio.services.data.fleek.explore_brands.Style;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Component {
    private String contentType;
    private Cta cta;
    private String heading;
    private boolean isGaFiredInCurrentSession;
    private MetaData metaData;
    private MetaData metadata;
    private Style style;
    private String subHeading;
    private p83_0 subcomponents;
    private String template;
    private String type;
    private String uuid;

    public Component() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, 4095, null);
    }

    public Component(String string2, Cta cta, String string3, MetaData metaData, MetaData metaData2, Style style2, String string4, p83_0 p83_02, String string5, String string6, boolean bl2, String string7) {
        Intrinsics.checkNotNullParameter(string7, "uuid");
        this.contentType = string2;
        this.cta = cta;
        this.heading = string3;
        this.metaData = metaData;
        this.metadata = metaData2;
        this.style = style2;
        this.subHeading = string4;
        this.subcomponents = p83_02;
        this.template = string5;
        this.type = string6;
        this.isGaFiredInCurrentSession = bl2;
        this.uuid = string7;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ Component(String object, Cta object2, String object3, MetaData object4, MetaData metaData, Style object5, String object6, p83_0 object7, String object8, String string2, boolean bl2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        void var35_39;
        Object string4;
        Object p83_02;
        Object string5;
        Object style2;
        MetaData metaData2;
        Object metaData3;
        Object string6;
        Object cta;
        Object string7;
        int n4 = n3;
        int n7 = n3 & 1;
        String string8 = null;
        if (n7 != 0) {
            n7 = 0;
            string7 = null;
        } else {
            string7 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            cta = null;
        } else {
            cta = object2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string6 = null;
        } else {
            string6 = object3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            metaData3 = null;
        } else {
            metaData3 = object4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            metaData2 = null;
        } else {
            metaData2 = metaData;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            style2 = null;
        } else {
            style2 = object5;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string5 = null;
        } else {
            string5 = object6;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            p83_02 = null;
        } else {
            p83_02 = object7;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string4 = null;
        } else {
            string4 = object8;
        }
        int bl3 = n4 & 0x200;
        if (bl3 == 0) {
            string8 = string2;
        }
        int n20 = n4 & 0x400;
        if (n20 != 0) {
            boolean bl4 = false;
        } else {
            boolean bl5 = bl2;
        }
        String string9 = (n4 &= 0x800) != 0 ? UUID.randomUUID().toString() : string3;
        object = this;
        object2 = string7;
        object3 = cta;
        object4 = string6;
        metaData = metaData3;
        object5 = metaData2;
        object6 = style2;
        object7 = string5;
        object8 = p83_02;
        string2 = string4;
        this((String)string7, (Cta)cta, (String)string6, (MetaData)metaData3, metaData2, (Style)style2, (String)string5, (p83_0)p83_02, (String)string4, string8, (boolean)var35_39, string9);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ Component copy$default(Component component, String string2, Cta cta, String string3, MetaData metaData, MetaData metaData2, Style style2, String string4, p83_0 p83_02, String string5, String string6, boolean bl2, String string7, int n3, Object object) {
        void var37_40;
        Component component2 = component;
        int n4 = n3;
        int n7 = n3 & 1;
        String string8 = n7 != 0 ? component.contentType : string2;
        int n8 = n4 & 2;
        Cta cta2 = n8 != 0 ? component2.cta : cta;
        int n10 = n4 & 4;
        String string9 = n10 != 0 ? component2.heading : string3;
        int n14 = n4 & 8;
        MetaData metaData3 = n14 != 0 ? component2.metaData : metaData;
        int n15 = n4 & 0x10;
        MetaData metaData4 = n15 != 0 ? component2.metadata : metaData2;
        int n16 = n4 & 0x20;
        Style style3 = n16 != 0 ? component2.style : style2;
        int n17 = n4 & 0x40;
        String string10 = n17 != 0 ? component2.subHeading : string4;
        int n18 = n4 & 0x80;
        p83_0 p83_03 = n18 != 0 ? component2.subcomponents : p83_02;
        int n19 = n4 & 0x100;
        String string11 = n19 != 0 ? component2.template : string5;
        int n20 = n4 & 0x200;
        String string12 = n20 != 0 ? component2.type : string6;
        int bl3 = n4 & 0x400;
        if (bl3 != 0) {
            boolean bl4 = component2.isGaFiredInCurrentSession;
        } else {
            boolean bl5 = bl2;
        }
        String string13 = (n4 &= 0x800) != 0 ? component2.uuid : string7;
        string2 = string8;
        cta = cta2;
        string3 = string9;
        metaData = metaData3;
        metaData2 = metaData4;
        style2 = style3;
        string4 = string10;
        p83_02 = p83_03;
        string5 = string11;
        string6 = string12;
        bl2 = var37_40;
        string7 = string13;
        return component.copy(string8, cta2, string9, metaData3, metaData4, style3, string10, p83_03, string11, string12, (boolean)var37_40, string13);
    }

    public final String component1() {
        return this.contentType;
    }

    public final String component10() {
        return this.type;
    }

    public final boolean component11() {
        return this.isGaFiredInCurrentSession;
    }

    public final String component12() {
        return this.uuid;
    }

    public final Cta component2() {
        return this.cta;
    }

    public final String component3() {
        return this.heading;
    }

    public final MetaData component4() {
        return this.metaData;
    }

    public final MetaData component5() {
        return this.metadata;
    }

    public final Style component6() {
        return this.style;
    }

    public final String component7() {
        return this.subHeading;
    }

    public final p83_0 component8() {
        return this.subcomponents;
    }

    public final String component9() {
        return this.template;
    }

    public final Component copy(String string2, Cta cta, String string3, MetaData metaData, MetaData metaData2, Style style2, String string4, p83_0 p83_02, String string5, String string6, boolean bl2, String string7) {
        Intrinsics.checkNotNullParameter(string7, "uuid");
        Component component = new Component(string2, cta, string3, metaData, metaData2, style2, string4, p83_02, string5, string6, bl2, string7);
        return component;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Component;
        if (!bl3) {
            return false;
        }
        object = (Component)object;
        Object object2 = this.contentType;
        Object object3 = ((Component)object).contentType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cta;
        object3 = ((Component)object).cta;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.heading;
        object3 = ((Component)object).heading;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.metaData;
        object3 = ((Component)object).metaData;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.metadata;
        object3 = ((Component)object).metadata;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.style;
        object3 = ((Component)object).style;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subHeading;
        object3 = ((Component)object).subHeading;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subcomponents;
        object3 = ((Component)object).subcomponents;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.template;
        object3 = ((Component)object).template;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object3 = ((Component)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isGaFiredInCurrentSession;
        boolean bl4 = ((Component)object).isGaFiredInCurrentSession;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.uuid;
        object = ((Component)object).uuid;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final String getHeading() {
        return this.heading;
    }

    public final MetaData getMetaData() {
        return this.metaData;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final String getSubHeading() {
        return this.subHeading;
    }

    public final p83_0 getSubcomponents() {
        return this.subcomponents;
    }

    public final String getTemplate() {
        return this.template;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.contentType;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.cta;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Cta)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.heading;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.metaData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((MetaData)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.metadata;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((MetaData)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.style;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Style)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.subHeading;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.subcomponents;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.template;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.type;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isGaFiredInCurrentSession ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        return this.uuid.hashCode() + n4;
    }

    public final boolean isGaFiredInCurrentSession() {
        return this.isGaFiredInCurrentSession;
    }

    public final void setContentType(String string2) {
        this.contentType = string2;
    }

    public final void setCta(Cta cta) {
        this.cta = cta;
    }

    public final void setGaFiredInCurrentSession(boolean bl2) {
        this.isGaFiredInCurrentSession = bl2;
    }

    public final void setHeading(String string2) {
        this.heading = string2;
    }

    public final void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public final void setMetadata(MetaData metaData) {
        this.metadata = metaData;
    }

    public final void setStyle(Style style2) {
        this.style = style2;
    }

    public final void setSubHeading(String string2) {
        this.subHeading = string2;
    }

    public final void setSubcomponents(p83_0 p83_02) {
        this.subcomponents = p83_02;
    }

    public final void setTemplate(String string2) {
        this.template = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final void setUuid(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.uuid = string2;
    }

    public String toString() {
        String string2 = this.contentType;
        Cta cta = this.cta;
        String string3 = this.heading;
        MetaData metaData = this.metaData;
        MetaData metaData2 = this.metadata;
        Style style2 = this.style;
        String string4 = this.subHeading;
        p83_0 p83_02 = this.subcomponents;
        String string5 = this.template;
        String string6 = this.type;
        boolean bl2 = this.isGaFiredInCurrentSession;
        String string7 = this.uuid;
        StringBuilder stringBuilder = new StringBuilder("Component(contentType=");
        stringBuilder.append(string2);
        stringBuilder.append(", cta=");
        stringBuilder.append(cta);
        stringBuilder.append(", heading=");
        stringBuilder.append(string3);
        stringBuilder.append(", metaData=");
        stringBuilder.append(metaData);
        stringBuilder.append(", metadata=");
        stringBuilder.append(metaData2);
        stringBuilder.append(", style=");
        stringBuilder.append(style2);
        stringBuilder.append(", subHeading=");
        stringBuilder.append(string4);
        stringBuilder.append(", subcomponents=");
        stringBuilder.append(p83_02);
        stringBuilder.append(", template=");
        X50.a(stringBuilder, string5, ", type=", string6, ", isGaFiredInCurrentSession=");
        stringBuilder.append(bl2);
        stringBuilder.append(", uuid=");
        stringBuilder.append(string7);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

