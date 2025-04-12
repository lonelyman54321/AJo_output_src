/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import com.ril.ajio.services.data.fleek.feedModel.Metadata;
import com.ril.ajio.services.data.fleek.feedModel.Style;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Component {
    private String contentType;
    private String heading;
    private boolean isGaFiredInCurrentSession;
    private String isSeen;
    private Metadata metadata;
    private Integer noOfSeenPosts;
    private String postId;
    private p83_0 seenPosts;
    private Style style;
    private SubcomponentsOwner subComponentsOwner;
    private String subHeading;
    private String subType;
    private p83_0 subcomponent;
    private p83_0 subcomponents;
    private String template;
    private String type;
    private String uuid;

    public Component() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 131071, null);
    }

    public Component(String string2, String string3, String string4, Metadata metadata, Integer n3, String string5, p83_0 p83_02, Style style2, String string6, String string7, p83_0 p83_03, p83_0 p83_04, SubcomponentsOwner subcomponentsOwner, String string8, String string9, boolean bl2, String string10) {
        Intrinsics.checkNotNullParameter(string10, "uuid");
        this.contentType = string2;
        this.heading = string3;
        this.isSeen = string4;
        this.metadata = metadata;
        this.noOfSeenPosts = n3;
        this.postId = string5;
        this.seenPosts = p83_02;
        this.style = style2;
        this.subHeading = string6;
        this.subType = string7;
        this.subcomponent = p83_03;
        this.subcomponents = p83_04;
        this.subComponentsOwner = subcomponentsOwner;
        this.template = string8;
        this.type = string9;
        this.isGaFiredInCurrentSession = bl2;
        this.uuid = string10;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ Component(String object, String string2, String string3, Metadata object2, Integer object3, String object4, p83_0 object5, Style object6, String object7, String string4, p83_0 object8, p83_0 p83_02, SubcomponentsOwner object9, String object10, String string5, boolean bl2, String string6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        void var51_54;
        String string7;
        Object string8;
        Object subcomponentsOwner;
        p83_0 p83_03;
        Object p83_04;
        String string9;
        Object string10;
        Object style2;
        Object p83_05;
        Object string11;
        Object n4;
        Object metadata;
        String string12;
        String string13;
        Object string14;
        int n7 = n3;
        int n8 = n3 & 1;
        if (n8 != 0) {
            n8 = 0;
            string14 = null;
        } else {
            string14 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string13 = null;
        } else {
            string13 = string2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            string12 = null;
        } else {
            string12 = string3;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            metadata = null;
        } else {
            metadata = object2;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            n4 = null;
        } else {
            n4 = object3;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            string11 = null;
        } else {
            string11 = object4;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            p83_05 = null;
        } else {
            p83_05 = object5;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            style2 = null;
        } else {
            style2 = object6;
        }
        int n20 = n7 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            string10 = null;
        } else {
            string10 = object7;
        }
        int n21 = n7 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            string9 = null;
        } else {
            string9 = string4;
        }
        int n22 = n7 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            p83_04 = null;
        } else {
            p83_04 = object8;
        }
        int n24 = n7 & 0x800;
        if (n24 != 0) {
            n24 = 0;
            p83_03 = null;
        } else {
            p83_03 = p83_02;
        }
        int n25 = n7 & 0x1000;
        if (n25 != 0) {
            n25 = 0;
            subcomponentsOwner = null;
        } else {
            subcomponentsOwner = object9;
        }
        int n26 = n7 & 0x2000;
        if (n26 != 0) {
            n26 = 0;
            string8 = null;
        } else {
            string8 = object10;
        }
        int n27 = n7 & 0x4000;
        if (n27 != 0) {
            n27 = 0;
            string7 = null;
        } else {
            string7 = string5;
        }
        int bl3 = n7 & 0x8000;
        if (bl3 != 0) {
            boolean bl4 = false;
        } else {
            boolean bl5 = bl2;
        }
        int n28 = 65536;
        String string15 = (n7 &= n28) != 0 ? UUID.randomUUID().toString() : string6;
        object = this;
        string2 = string14;
        string3 = string13;
        object2 = string12;
        object3 = metadata;
        object4 = n4;
        object5 = string11;
        object6 = p83_05;
        object7 = style2;
        string4 = string10;
        object8 = string9;
        p83_02 = p83_04;
        object9 = p83_03;
        object10 = subcomponentsOwner;
        string5 = string8;
        this((String)string14, string13, string12, (Metadata)metadata, (Integer)n4, (String)string11, (p83_0)p83_05, (Style)style2, (String)string10, string9, (p83_0)p83_04, p83_03, (SubcomponentsOwner)subcomponentsOwner, (String)string8, string7, (boolean)var51_54, string15);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ Component copy$default(Component component, String string2, String string3, String string4, Metadata metadata, Integer n3, String string5, p83_0 p83_02, Style style2, String string6, String string7, p83_0 p83_03, p83_0 p83_04, SubcomponentsOwner subcomponentsOwner, String string8, String string9, boolean bl2, String string10, int n4, Object object) {
        void var48_52;
        Component component2 = component;
        int n7 = n4;
        int n8 = n4 & 1;
        String string11 = n8 != 0 ? component.contentType : string2;
        int n10 = n7 & 2;
        String string12 = n10 != 0 ? component2.heading : string3;
        int n14 = n7 & 4;
        String string13 = n14 != 0 ? component2.isSeen : string4;
        int n15 = n7 & 8;
        Metadata metadata2 = n15 != 0 ? component2.metadata : metadata;
        int n16 = n7 & 0x10;
        Integer n17 = n16 != 0 ? component2.noOfSeenPosts : n3;
        int n18 = n7 & 0x20;
        String string14 = n18 != 0 ? component2.postId : string5;
        int n19 = n7 & 0x40;
        p83_0 p83_05 = n19 != 0 ? component2.seenPosts : p83_02;
        int n20 = n7 & 0x80;
        Style style3 = n20 != 0 ? component2.style : style2;
        int n21 = n7 & 0x100;
        String string15 = n21 != 0 ? component2.subHeading : string6;
        int n22 = n7 & 0x200;
        String string16 = n22 != 0 ? component2.subType : string7;
        int n24 = n7 & 0x400;
        p83_0 p83_06 = n24 != 0 ? component2.subcomponent : p83_03;
        int n25 = n7 & 0x800;
        p83_0 p83_07 = n25 != 0 ? component2.subcomponents : p83_04;
        int n26 = n7 & 0x1000;
        SubcomponentsOwner subcomponentsOwner2 = n26 != 0 ? component2.subComponentsOwner : subcomponentsOwner;
        int bl3 = n7 & 0x2000;
        String string17 = bl3 != 0 ? component2.template : string8;
        string8 = string17;
        int n27 = n7 & 0x4000;
        string17 = n27 != 0 ? component2.type : string9;
        int n28 = n7 & 0x8000;
        string9 = string17;
        if (n28 != 0) {
            boolean bl4 = component2.isGaFiredInCurrentSession;
        } else {
            boolean bl5 = bl2;
        }
        n28 = 65536;
        String string18 = (n7 &= n28) != 0 ? component2.uuid : string10;
        string2 = string11;
        string3 = string12;
        string4 = string13;
        metadata = metadata2;
        n3 = n17;
        string5 = string14;
        p83_02 = p83_05;
        style2 = style3;
        string6 = string15;
        string7 = string16;
        p83_03 = p83_06;
        p83_04 = p83_07;
        subcomponentsOwner = subcomponentsOwner2;
        bl2 = var48_52;
        string10 = string18;
        return component.copy(string11, string12, string13, metadata2, n17, string14, p83_05, style3, string15, string16, p83_06, p83_07, subcomponentsOwner2, string8, string9, (boolean)var48_52, string18);
    }

    public final String component1() {
        return this.contentType;
    }

    public final String component10() {
        return this.subType;
    }

    public final p83_0 component11() {
        return this.subcomponent;
    }

    public final p83_0 component12() {
        return this.subcomponents;
    }

    public final SubcomponentsOwner component13() {
        return this.subComponentsOwner;
    }

    public final String component14() {
        return this.template;
    }

    public final String component15() {
        return this.type;
    }

    public final boolean component16() {
        return this.isGaFiredInCurrentSession;
    }

    public final String component17() {
        return this.uuid;
    }

    public final String component2() {
        return this.heading;
    }

    public final String component3() {
        return this.isSeen;
    }

    public final Metadata component4() {
        return this.metadata;
    }

    public final Integer component5() {
        return this.noOfSeenPosts;
    }

    public final String component6() {
        return this.postId;
    }

    public final p83_0 component7() {
        return this.seenPosts;
    }

    public final Style component8() {
        return this.style;
    }

    public final String component9() {
        return this.subHeading;
    }

    public final Component copy(String string2, String string3, String string4, Metadata metadata, Integer n3, String string5, p83_0 p83_02, Style style2, String string6, String string7, p83_0 p83_03, p83_0 p83_04, SubcomponentsOwner subcomponentsOwner, String string8, String string9, boolean bl2, String string10) {
        Intrinsics.checkNotNullParameter(string10, "uuid");
        Component component = new Component(string2, string3, string4, metadata, n3, string5, p83_02, style2, string6, string7, p83_03, p83_04, subcomponentsOwner, string8, string9, bl2, string10);
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
        object2 = this.heading;
        object3 = ((Component)object).heading;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isSeen;
        object3 = ((Component)object).isSeen;
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
        object2 = this.noOfSeenPosts;
        object3 = ((Component)object).noOfSeenPosts;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.postId;
        object3 = ((Component)object).postId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.seenPosts;
        object3 = ((Component)object).seenPosts;
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
        object2 = this.subType;
        object3 = ((Component)object).subType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subcomponent;
        object3 = ((Component)object).subcomponent;
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
        object2 = this.subComponentsOwner;
        object3 = ((Component)object).subComponentsOwner;
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

    public final String getHeading() {
        return this.heading;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final Integer getNoOfSeenPosts() {
        return this.noOfSeenPosts;
    }

    public final String getPostId() {
        return this.postId;
    }

    public final p83_0 getSeenPosts() {
        return this.seenPosts;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final SubcomponentsOwner getSubComponentsOwner() {
        return this.subComponentsOwner;
    }

    public final String getSubHeading() {
        return this.subHeading;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final p83_0 getSubcomponent() {
        return this.subcomponent;
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
        Object object = this.heading;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isSeen;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.metadata;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Metadata)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.noOfSeenPosts;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.postId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.seenPosts;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.subType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.subcomponent;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.subComponentsOwner;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((SubcomponentsOwner)object).hashCode();
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

    public final String isSeen() {
        return this.isSeen;
    }

    public final void setContentType(String string2) {
        this.contentType = string2;
    }

    public final void setGaFiredInCurrentSession(boolean bl2) {
        this.isGaFiredInCurrentSession = bl2;
    }

    public final void setHeading(String string2) {
        this.heading = string2;
    }

    public final void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public final void setNoOfSeenPosts(Integer n3) {
        this.noOfSeenPosts = n3;
    }

    public final void setPostId(String string2) {
        this.postId = string2;
    }

    public final void setSeen(String string2) {
        this.isSeen = string2;
    }

    public final void setSeenPosts(p83_0 p83_02) {
        this.seenPosts = p83_02;
    }

    public final void setStyle(Style style2) {
        this.style = style2;
    }

    public final void setSubComponentsOwner(SubcomponentsOwner subcomponentsOwner) {
        this.subComponentsOwner = subcomponentsOwner;
    }

    public final void setSubHeading(String string2) {
        this.subHeading = string2;
    }

    public final void setSubType(String string2) {
        this.subType = string2;
    }

    public final void setSubcomponent(p83_0 p83_02) {
        this.subcomponent = p83_02;
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
        Object object = this;
        String string2 = this.contentType;
        String string3 = this.heading;
        String string4 = this.isSeen;
        Metadata metadata = this.metadata;
        Integer n3 = this.noOfSeenPosts;
        String string5 = this.postId;
        p83_0 p83_02 = this.seenPosts;
        Style style2 = this.style;
        String string6 = this.subHeading;
        String string7 = this.subType;
        p83_0 p83_03 = this.subcomponent;
        p83_0 p83_04 = this.subcomponents;
        SubcomponentsOwner subcomponentsOwner = this.subComponentsOwner;
        String string8 = this.template;
        String string9 = this.type;
        boolean bl2 = this.isGaFiredInCurrentSession;
        String string10 = this.uuid;
        object = og_1.a("Component(contentType=", string2, ", heading=", string3, ", isSeen=");
        ((StringBuilder)object).append(string4);
        ((StringBuilder)object).append(", metadata=");
        ((StringBuilder)object).append(metadata);
        ((StringBuilder)object).append(", noOfSeenPosts=");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(", postId=");
        ((StringBuilder)object).append(string5);
        ((StringBuilder)object).append(", seenPosts=");
        ((StringBuilder)object).append(p83_02);
        ((StringBuilder)object).append(", style=");
        ((StringBuilder)object).append(style2);
        ((StringBuilder)object).append(", subHeading=");
        X50.a((StringBuilder)object, string6, ", subType=", string7, ", subcomponent=");
        ((StringBuilder)object).append(p83_03);
        ((StringBuilder)object).append(", subcomponents=");
        ((StringBuilder)object).append(p83_04);
        ((StringBuilder)object).append(", subComponentsOwner=");
        ((StringBuilder)object).append(subcomponentsOwner);
        ((StringBuilder)object).append(", template=");
        string2 = string8;
        ((StringBuilder)object).append(string8);
        ((StringBuilder)object).append(", type=");
        string2 = string9;
        ((StringBuilder)object).append(string9);
        ((StringBuilder)object).append(", isGaFiredInCurrentSession=");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(", uuid=");
        string3 = string10;
        return h30_0.a((StringBuilder)object, string10, ")");
    }
}

