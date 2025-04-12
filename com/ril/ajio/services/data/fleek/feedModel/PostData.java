/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import com.ril.ajio.services.data.fleek.feedModel.PriceRevealMetaInfo;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PostData {
    private String description;
    private String innerResourceTitle;
    private ArrayList innerResources;
    private Boolean isLiked;
    private String isPinned;
    private Boolean isSeen;
    private Integer likesCount;
    private String postId;
    private List postMedia;
    private String postType;
    private PriceRevealMetaInfo priceRevealMetaInfo;
    private SubcomponentsOwner subComponentsOwner;
    private String subTitle;
    private List subcomponent;
    private String template;
    private String tenant;
    private String type;

    public PostData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public PostData(String string2, String string3, ArrayList arrayList, Boolean bl2, String string4, Boolean bl3, Integer n3, List list, String string5, String string6, PriceRevealMetaInfo priceRevealMetaInfo, String string7, String string8, String string9, String string10, List list2, SubcomponentsOwner subcomponentsOwner) {
        this.description = string2;
        this.innerResourceTitle = string3;
        this.innerResources = arrayList;
        this.isLiked = bl2;
        this.isPinned = string4;
        this.isSeen = bl3;
        this.likesCount = n3;
        this.postMedia = list;
        this.postId = string5;
        this.postType = string6;
        this.priceRevealMetaInfo = priceRevealMetaInfo;
        this.subTitle = string7;
        this.template = string8;
        this.tenant = string9;
        this.type = string10;
        this.subcomponent = list2;
        this.subComponentsOwner = subcomponentsOwner;
    }

    public /* synthetic */ PostData(String object, String string2, ArrayList object2, Boolean serializable, String object3, Boolean object4, Integer constable, List object5, String object6, String string3, PriceRevealMetaInfo object7, String object8, String string4, String string5, String string6, List object9, SubcomponentsOwner object10, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        SubcomponentsOwner subcomponentsOwner;
        List list;
        String string7;
        String string8;
        String string9;
        String string10;
        PriceRevealMetaInfo priceRevealMetaInfo;
        String string11;
        String string12;
        List list2;
        Integer n4;
        String string13;
        Boolean bl2;
        ArrayList arrayList;
        String string14;
        String string15;
        int n7 = n3;
        int n8 = n3 & 1;
        if (n8 != 0) {
            n8 = 0;
            string15 = null;
        } else {
            string15 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string14 = null;
        } else {
            string14 = string2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            arrayList = null;
        } else {
            arrayList = object2;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            bl2 = null;
        } else {
            bl2 = serializable;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            string13 = null;
        } else {
            string13 = object3;
        }
        int n17 = n7 & 0x20;
        Object object11 = n17 != 0 ? Boolean.FALSE : object4;
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            n4 = null;
        } else {
            n4 = constable;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            list2 = null;
        } else {
            list2 = object5;
        }
        int n20 = n7 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            string12 = null;
        } else {
            string12 = object6;
        }
        int n21 = n7 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            string11 = null;
        } else {
            string11 = string3;
        }
        int n22 = n7 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            priceRevealMetaInfo = null;
        } else {
            priceRevealMetaInfo = object7;
        }
        int n24 = n7 & 0x800;
        if (n24 != 0) {
            n24 = 0;
            string10 = null;
        } else {
            string10 = object8;
        }
        int n25 = n7 & 0x1000;
        if (n25 != 0) {
            n25 = 0;
            string9 = null;
        } else {
            string9 = string4;
        }
        int n26 = n7 & 0x2000;
        if (n26 != 0) {
            n26 = 0;
            string8 = null;
        } else {
            string8 = string5;
        }
        int n27 = n7 & 0x4000;
        if (n27 != 0) {
            n27 = 0;
            string7 = null;
        } else {
            string7 = string6;
        }
        int n28 = n7 & 0x8000;
        if (n28 != 0) {
            n28 = 0;
            list = null;
        } else {
            list = object9;
        }
        int n29 = 65536;
        if ((n7 &= n29) != 0) {
            n7 = 0;
            subcomponentsOwner = null;
        } else {
            subcomponentsOwner = object10;
        }
        object = this;
        string2 = string15;
        object2 = string14;
        serializable = arrayList;
        object3 = bl2;
        object4 = string13;
        constable = object11;
        object5 = n4;
        object6 = list2;
        string3 = string12;
        object7 = string11;
        object8 = priceRevealMetaInfo;
        string4 = string10;
        string5 = string9;
        string6 = string8;
        object9 = string7;
        object10 = list;
        this(string15, string14, arrayList, bl2, string13, (Boolean)object11, n4, list2, string12, string11, priceRevealMetaInfo, string10, string9, string8, string7, list, subcomponentsOwner);
    }

    public static /* synthetic */ PostData copy$default(PostData postData, String string2, String string3, ArrayList arrayList, Boolean bl2, String string4, Boolean bl3, Integer n3, List list, String string5, String string6, PriceRevealMetaInfo priceRevealMetaInfo, String string7, String string8, String string9, String string10, List object, SubcomponentsOwner subcomponentsOwner, int n4, Object object2) {
        PostData postData2 = postData;
        int n7 = n4;
        int n8 = n4 & 1;
        String string11 = n8 != 0 ? postData.description : string2;
        int n10 = n7 & 2;
        String string12 = n10 != 0 ? postData2.innerResourceTitle : string3;
        int n14 = n7 & 4;
        ArrayList arrayList2 = n14 != 0 ? postData2.innerResources : arrayList;
        int n15 = n7 & 8;
        Boolean bl4 = n15 != 0 ? postData2.isLiked : bl2;
        int n16 = n7 & 0x10;
        String string13 = n16 != 0 ? postData2.isPinned : string4;
        int n17 = n7 & 0x20;
        Boolean bl5 = n17 != 0 ? postData2.isSeen : bl3;
        int n18 = n7 & 0x40;
        Integer n19 = n18 != 0 ? postData2.likesCount : n3;
        int n20 = n7 & 0x80;
        List list2 = n20 != 0 ? postData2.postMedia : list;
        int n21 = n7 & 0x100;
        String string14 = n21 != 0 ? postData2.postId : string5;
        int n22 = n7 & 0x200;
        String string15 = n22 != 0 ? postData2.postType : string6;
        int n24 = n7 & 0x400;
        PriceRevealMetaInfo priceRevealMetaInfo2 = n24 != 0 ? postData2.priceRevealMetaInfo : priceRevealMetaInfo;
        int n25 = n7 & 0x800;
        String string16 = n25 != 0 ? postData2.subTitle : string7;
        int n26 = n7 & 0x1000;
        String string17 = n26 != 0 ? postData2.template : string8;
        int n27 = n7 & 0x2000;
        Object object3 = n27 != 0 ? postData2.tenant : string9;
        string9 = object3;
        n27 = n7 & 0x4000;
        object3 = n27 != 0 ? postData2.type : string10;
        int n28 = n7 & 0x8000;
        string10 = object3;
        object3 = n28 != 0 ? postData2.subcomponent : object;
        n28 = 65536;
        SubcomponentsOwner subcomponentsOwner2 = (n7 &= n28) != 0 ? postData2.subComponentsOwner : subcomponentsOwner;
        string2 = string11;
        string3 = string12;
        arrayList = arrayList2;
        bl2 = bl4;
        string4 = string13;
        bl3 = bl5;
        n3 = n19;
        list = list2;
        string5 = string14;
        string6 = string15;
        priceRevealMetaInfo = priceRevealMetaInfo2;
        string7 = string16;
        string8 = string17;
        object = object3;
        subcomponentsOwner = subcomponentsOwner2;
        return postData.copy(string11, string12, arrayList2, bl4, string13, bl5, n19, list2, string14, string15, priceRevealMetaInfo2, string16, string17, string9, string10, (List)object3, subcomponentsOwner2);
    }

    public final String component1() {
        return this.description;
    }

    public final String component10() {
        return this.postType;
    }

    public final PriceRevealMetaInfo component11() {
        return this.priceRevealMetaInfo;
    }

    public final String component12() {
        return this.subTitle;
    }

    public final String component13() {
        return this.template;
    }

    public final String component14() {
        return this.tenant;
    }

    public final String component15() {
        return this.type;
    }

    public final List component16() {
        return this.subcomponent;
    }

    public final SubcomponentsOwner component17() {
        return this.subComponentsOwner;
    }

    public final String component2() {
        return this.innerResourceTitle;
    }

    public final ArrayList component3() {
        return this.innerResources;
    }

    public final Boolean component4() {
        return this.isLiked;
    }

    public final String component5() {
        return this.isPinned;
    }

    public final Boolean component6() {
        return this.isSeen;
    }

    public final Integer component7() {
        return this.likesCount;
    }

    public final List component8() {
        return this.postMedia;
    }

    public final String component9() {
        return this.postId;
    }

    public final PostData copy(String string2, String string3, ArrayList arrayList, Boolean bl2, String string4, Boolean bl3, Integer n3, List list, String string5, String string6, PriceRevealMetaInfo priceRevealMetaInfo, String string7, String string8, String string9, String string10, List list2, SubcomponentsOwner subcomponentsOwner) {
        PostData postData = new PostData(string2, string3, arrayList, bl2, string4, bl3, n3, list, string5, string6, priceRevealMetaInfo, string7, string8, string9, string10, list2, subcomponentsOwner);
        return postData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PostData;
        if (!bl3) {
            return false;
        }
        object = (PostData)object;
        Object object2 = this.description;
        Object object3 = ((PostData)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.innerResourceTitle;
        object3 = ((PostData)object).innerResourceTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.innerResources;
        object3 = ((PostData)object).innerResources;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isLiked;
        object3 = ((PostData)object).isLiked;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isPinned;
        object3 = ((PostData)object).isPinned;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isSeen;
        object3 = ((PostData)object).isSeen;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.likesCount;
        object3 = ((PostData)object).likesCount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.postMedia;
        object3 = ((PostData)object).postMedia;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.postId;
        object3 = ((PostData)object).postId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.postType;
        object3 = ((PostData)object).postType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.priceRevealMetaInfo;
        object3 = ((PostData)object).priceRevealMetaInfo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subTitle;
        object3 = ((PostData)object).subTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.template;
        object3 = ((PostData)object).template;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tenant;
        object3 = ((PostData)object).tenant;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object3 = ((PostData)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subcomponent;
        object3 = ((PostData)object).subcomponent;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subComponentsOwner;
        object = ((PostData)object).subComponentsOwner;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getInnerResourceTitle() {
        return this.innerResourceTitle;
    }

    public final ArrayList getInnerResources() {
        return this.innerResources;
    }

    public final Integer getLikesCount() {
        return this.likesCount;
    }

    public final String getPostId() {
        return this.postId;
    }

    public final List getPostMedia() {
        return this.postMedia;
    }

    public final String getPostType() {
        return this.postType;
    }

    public final PriceRevealMetaInfo getPriceRevealMetaInfo() {
        return this.priceRevealMetaInfo;
    }

    public final SubcomponentsOwner getSubComponentsOwner() {
        return this.subComponentsOwner;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final List getSubcomponent() {
        return this.subcomponent;
    }

    public final String getTemplate() {
        return this.template;
    }

    public final String getTenant() {
        return this.tenant;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.description;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.innerResourceTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.innerResources;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isLiked;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isPinned;
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
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.likesCount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.postMedia;
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
        object = this.postType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priceRevealMetaInfo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PriceRevealMetaInfo)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.subTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        object = this.tenant;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.type;
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
        object = this.subComponentsOwner;
        if (object != null) {
            n7 = ((SubcomponentsOwner)object).hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isLiked() {
        return this.isLiked;
    }

    public final String isPinned() {
        return this.isPinned;
    }

    public final Boolean isSeen() {
        return this.isSeen;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setInnerResourceTitle(String string2) {
        this.innerResourceTitle = string2;
    }

    public final void setInnerResources(ArrayList arrayList) {
        this.innerResources = arrayList;
    }

    public final void setLiked(Boolean bl2) {
        this.isLiked = bl2;
    }

    public final void setLikesCount(Integer n3) {
        this.likesCount = n3;
    }

    public final void setPinned(String string2) {
        this.isPinned = string2;
    }

    public final void setPostId(String string2) {
        this.postId = string2;
    }

    public final void setPostMedia(List list) {
        this.postMedia = list;
    }

    public final void setPostType(String string2) {
        this.postType = string2;
    }

    public final void setPriceRevealMetaInfo(PriceRevealMetaInfo priceRevealMetaInfo) {
        this.priceRevealMetaInfo = priceRevealMetaInfo;
    }

    public final void setSeen(Boolean bl2) {
        this.isSeen = bl2;
    }

    public final void setSubComponentsOwner(SubcomponentsOwner subcomponentsOwner) {
        this.subComponentsOwner = subcomponentsOwner;
    }

    public final void setSubTitle(String string2) {
        this.subTitle = string2;
    }

    public final void setSubcomponent(List list) {
        this.subcomponent = list;
    }

    public final void setTemplate(String string2) {
        this.template = string2;
    }

    public final void setTenant(String string2) {
        this.tenant = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.description;
        String string2 = this.innerResourceTitle;
        Object object3 = this.innerResources;
        Boolean bl2 = this.isLiked;
        String string3 = this.isPinned;
        Boolean bl3 = this.isSeen;
        Integer n3 = this.likesCount;
        List list = this.postMedia;
        String string4 = this.postId;
        String string5 = this.postType;
        PriceRevealMetaInfo priceRevealMetaInfo = this.priceRevealMetaInfo;
        String string6 = this.subTitle;
        String string7 = this.template;
        String string8 = this.tenant;
        String string9 = this.type;
        List list2 = this.subcomponent;
        SubcomponentsOwner subcomponentsOwner = this.subComponentsOwner;
        object = og_1.a("PostData(description=", (String)object2, ", innerResourceTitle=", string2, ", innerResources=");
        ((StringBuilder)object).append(object3);
        ((StringBuilder)object).append(", isLiked=");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(", isPinned=");
        vw0_1.a(bl3, string3, ", isSeen=", ", likesCount=", (StringBuilder)object);
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(", postMedia=");
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(", postId=");
        X50.a((StringBuilder)object, string4, ", postType=", string5, ", priceRevealMetaInfo=");
        ((StringBuilder)object).append(priceRevealMetaInfo);
        ((StringBuilder)object).append(", subTitle=");
        ((StringBuilder)object).append(string6);
        ((StringBuilder)object).append(", template=");
        object3 = string7;
        X50.a((StringBuilder)object, string7, ", tenant=", string8, ", type=");
        object2 = string9;
        ((StringBuilder)object).append(string9);
        ((StringBuilder)object).append(", subcomponent=");
        object2 = list2;
        ((StringBuilder)object).append(list2);
        ((StringBuilder)object).append(", subComponentsOwner=");
        object2 = subcomponentsOwner;
        ((StringBuilder)object).append(subcomponentsOwner);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

