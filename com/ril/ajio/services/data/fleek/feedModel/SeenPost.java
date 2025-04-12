/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import com.ril.ajio.services.data.fleek.feedModel.Style;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SeenPost {
    private String contentType;
    private String isSeen;
    private String postId;
    private Style style;
    private SubcomponentsOwner subComponentsOwner;
    private p83_0 subcomponent;
    private String template;
    private String type;

    public SeenPost() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public SeenPost(String string2, String string3, String string4, Style style2, p83_0 p83_02, SubcomponentsOwner subcomponentsOwner, String string5, String string6) {
        this.contentType = string2;
        this.isSeen = string3;
        this.postId = string4;
        this.style = style2;
        this.subcomponent = p83_02;
        this.subComponentsOwner = subcomponentsOwner;
        this.template = string5;
        this.type = string6;
    }

    public /* synthetic */ SeenPost(String object, String string2, String string3, Style object2, p83_0 object3, SubcomponentsOwner object4, String object5, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string5;
        SubcomponentsOwner subcomponentsOwner;
        p83_0 p83_02;
        Style style2;
        String string6;
        String string7;
        String string8;
        int n4 = n3;
        int n7 = n3 & 1;
        String string9 = null;
        if (n7 != 0) {
            n7 = 0;
            string8 = null;
        } else {
            string8 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string7 = null;
        } else {
            string7 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string6 = null;
        } else {
            string6 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            style2 = null;
        } else {
            style2 = object2;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            p83_02 = null;
        } else {
            p83_02 = object3;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            subcomponentsOwner = null;
        } else {
            subcomponentsOwner = object4;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string5 = null;
        } else {
            string5 = object5;
        }
        if ((n4 &= 0x80) == 0) {
            string9 = string4;
        }
        object = this;
        string2 = string8;
        string3 = string7;
        object2 = string6;
        object3 = style2;
        object4 = p83_02;
        object5 = subcomponentsOwner;
        string4 = string5;
        this(string8, string7, string6, style2, p83_02, subcomponentsOwner, string5, string9);
    }

    public static /* synthetic */ SeenPost copy$default(SeenPost seenPost, String string2, String string3, String string4, Style style2, p83_0 p83_02, SubcomponentsOwner subcomponentsOwner, String string5, String string6, int n3, Object object) {
        SeenPost seenPost2 = seenPost;
        int n4 = n3;
        int n7 = n3 & 1;
        String string7 = n7 != 0 ? seenPost.contentType : string2;
        int n8 = n4 & 2;
        String string8 = n8 != 0 ? seenPost2.isSeen : string3;
        int n10 = n4 & 4;
        String string9 = n10 != 0 ? seenPost2.postId : string4;
        int n14 = n4 & 8;
        Style style3 = n14 != 0 ? seenPost2.style : style2;
        int n15 = n4 & 0x10;
        p83_0 p83_03 = n15 != 0 ? seenPost2.subcomponent : p83_02;
        int n16 = n4 & 0x20;
        SubcomponentsOwner subcomponentsOwner2 = n16 != 0 ? seenPost2.subComponentsOwner : subcomponentsOwner;
        int n17 = n4 & 0x40;
        String string10 = n17 != 0 ? seenPost2.template : string5;
        String string11 = (n4 &= 0x80) != 0 ? seenPost2.type : string6;
        string2 = string7;
        string3 = string8;
        string4 = string9;
        style2 = style3;
        p83_02 = p83_03;
        subcomponentsOwner = subcomponentsOwner2;
        string5 = string10;
        string6 = string11;
        return seenPost.copy(string7, string8, string9, style3, p83_03, subcomponentsOwner2, string10, string11);
    }

    public final String component1() {
        return this.contentType;
    }

    public final String component2() {
        return this.isSeen;
    }

    public final String component3() {
        return this.postId;
    }

    public final Style component4() {
        return this.style;
    }

    public final p83_0 component5() {
        return this.subcomponent;
    }

    public final SubcomponentsOwner component6() {
        return this.subComponentsOwner;
    }

    public final String component7() {
        return this.template;
    }

    public final String component8() {
        return this.type;
    }

    public final SeenPost copy(String string2, String string3, String string4, Style style2, p83_0 p83_02, SubcomponentsOwner subcomponentsOwner, String string5, String string6) {
        SeenPost seenPost = new SeenPost(string2, string3, string4, style2, p83_02, subcomponentsOwner, string5, string6);
        return seenPost;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SeenPost;
        if (!bl3) {
            return false;
        }
        object = (SeenPost)object;
        Object object2 = this.contentType;
        Object object3 = ((SeenPost)object).contentType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isSeen;
        object3 = ((SeenPost)object).isSeen;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.postId;
        object3 = ((SeenPost)object).postId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.style;
        object3 = ((SeenPost)object).style;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subcomponent;
        object3 = ((SeenPost)object).subcomponent;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subComponentsOwner;
        object3 = ((SeenPost)object).subComponentsOwner;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.template;
        object3 = ((SeenPost)object).template;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object = ((SeenPost)object).type;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getPostId() {
        return this.postId;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final SubcomponentsOwner getSubComponentsOwner() {
        return this.subComponentsOwner;
    }

    public final p83_0 getSubcomponent() {
        return this.subcomponent;
    }

    public final String getTemplate() {
        return this.template;
    }

    public final String getType() {
        return this.type;
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
        Object object = this.isSeen;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        object = this.style;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Style)object).hashCode();
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
        return n4 + n7;
    }

    public final String isSeen() {
        return this.isSeen;
    }

    public final void setContentType(String string2) {
        this.contentType = string2;
    }

    public final void setPostId(String string2) {
        this.postId = string2;
    }

    public final void setSeen(String string2) {
        this.isSeen = string2;
    }

    public final void setStyle(Style style2) {
        this.style = style2;
    }

    public final void setSubComponentsOwner(SubcomponentsOwner subcomponentsOwner) {
        this.subComponentsOwner = subcomponentsOwner;
    }

    public final void setSubcomponent(p83_0 p83_02) {
        this.subcomponent = p83_02;
    }

    public final void setTemplate(String string2) {
        this.template = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public String toString() {
        CharSequence charSequence = this.contentType;
        String string2 = this.isSeen;
        String string3 = this.postId;
        Style style2 = this.style;
        p83_0 p83_02 = this.subcomponent;
        SubcomponentsOwner subcomponentsOwner = this.subComponentsOwner;
        String string4 = this.template;
        String string5 = this.type;
        charSequence = og_1.a("SeenPost(contentType=", (String)charSequence, ", isSeen=", string2, ", postId=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", style=");
        ((StringBuilder)charSequence).append(style2);
        ((StringBuilder)charSequence).append(", subcomponent=");
        ((StringBuilder)charSequence).append(p83_02);
        ((StringBuilder)charSequence).append(", subComponentsOwner=");
        ((StringBuilder)charSequence).append(subcomponentsOwner);
        ((StringBuilder)charSequence).append(", template=");
        return ko_0.a((StringBuilder)charSequence, string4, ", type=", string5, ")");
    }
}

