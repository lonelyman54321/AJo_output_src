/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FleekQueryParameters {
    private String category;
    private String channel;
    private String city;
    private String currentPage;
    private String page;
    private String pageSize;
    private String pcgroup;
    private String platform;
    private String query;
    private String seenPostIds;
    private String seenStoryPostId;
    private String state;
    private String store;
    private String tenantId;
    private String userId;
    private String usergroup;
    private String userstate;
    private String usertype;
    private String zone;

    public FleekQueryParameters() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public FleekQueryParameters(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18, String string19, String string20) {
        this.tenantId = string2;
        this.store = string3;
        this.platform = string4;
        this.channel = string5;
        this.usergroup = string6;
        this.userstate = string7;
        this.usertype = string8;
        this.city = string9;
        this.state = string10;
        this.zone = string11;
        this.pcgroup = string12;
        this.query = string13;
        this.pageSize = string14;
        this.currentPage = string15;
        this.userId = string16;
        this.seenPostIds = string17;
        this.category = string18;
        this.page = string19;
        this.seenStoryPostId = string20;
    }

    public /* synthetic */ FleekQueryParameters(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18, String string19, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string20;
        String string21;
        String string22;
        String string23;
        String string24;
        String string25;
        String string26;
        String string27;
        String string28;
        String string29;
        String string30;
        String string31;
        String string32;
        String string33;
        String string34;
        String string35;
        String string36;
        String string37;
        String string38;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            string38 = null;
        } else {
            string38 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string37 = null;
        } else {
            string37 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string36 = null;
        } else {
            string36 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string35 = null;
        } else {
            string35 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string34 = null;
        } else {
            string34 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string33 = null;
        } else {
            string33 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string32 = null;
        } else {
            string32 = string7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string31 = null;
        } else {
            string31 = string8;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string30 = null;
        } else {
            string30 = string9;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string29 = null;
        } else {
            string29 = string10;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string28 = null;
        } else {
            string28 = string11;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string27 = null;
        } else {
            string27 = string12;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string26 = null;
        } else {
            string26 = string13;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            string25 = null;
        } else {
            string25 = string14;
        }
        int n26 = n4 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            string24 = null;
        } else {
            string24 = string15;
        }
        int n27 = n4 & 0x8000;
        if (n27 != 0) {
            n27 = 0;
            string23 = null;
        } else {
            string23 = string16;
        }
        int n28 = n4 & 0x10000;
        if (n28 != 0) {
            n28 = 0;
            string22 = null;
        } else {
            string22 = string17;
        }
        int n29 = n4 & 0x20000;
        if (n29 != 0) {
            n29 = 0;
            string21 = null;
        } else {
            string21 = string18;
        }
        int n30 = 262144;
        if ((n4 &= n30) != 0) {
            n4 = 0;
            string20 = null;
        } else {
            string20 = string19;
        }
        object = this;
        string2 = string38;
        string3 = string37;
        string4 = string36;
        string5 = string35;
        string6 = string34;
        string7 = string33;
        string8 = string32;
        string9 = string31;
        string10 = string30;
        string11 = string29;
        string12 = string28;
        string13 = string27;
        string14 = string26;
        string15 = string25;
        string16 = string24;
        string17 = string23;
        string18 = string22;
        string19 = string21;
        this(string38, string37, string36, string35, string34, string33, string32, string31, string30, string29, string28, string27, string26, string25, string24, string23, string22, string21, string20);
    }

    public static /* synthetic */ FleekQueryParameters copy$default(FleekQueryParameters fleekQueryParameters, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18, String string19, String string20, int n3, Object object) {
        FleekQueryParameters fleekQueryParameters2 = fleekQueryParameters;
        int n4 = n3;
        int n7 = n3 & 1;
        String string21 = n7 != 0 ? fleekQueryParameters.tenantId : string2;
        int n8 = n4 & 2;
        String string22 = n8 != 0 ? fleekQueryParameters2.store : string3;
        int n10 = n4 & 4;
        String string23 = n10 != 0 ? fleekQueryParameters2.platform : string4;
        int n14 = n4 & 8;
        String string24 = n14 != 0 ? fleekQueryParameters2.channel : string5;
        int n15 = n4 & 0x10;
        String string25 = n15 != 0 ? fleekQueryParameters2.usergroup : string6;
        int n16 = n4 & 0x20;
        String string26 = n16 != 0 ? fleekQueryParameters2.userstate : string7;
        int n17 = n4 & 0x40;
        String string27 = n17 != 0 ? fleekQueryParameters2.usertype : string8;
        int n18 = n4 & 0x80;
        String string28 = n18 != 0 ? fleekQueryParameters2.city : string9;
        int n19 = n4 & 0x100;
        String string29 = n19 != 0 ? fleekQueryParameters2.state : string10;
        int n20 = n4 & 0x200;
        String string30 = n20 != 0 ? fleekQueryParameters2.zone : string11;
        int n21 = n4 & 0x400;
        String string31 = n21 != 0 ? fleekQueryParameters2.pcgroup : string12;
        int n22 = n4 & 0x800;
        String string32 = n22 != 0 ? fleekQueryParameters2.query : string13;
        int n24 = n4 & 0x1000;
        String string33 = n24 != 0 ? fleekQueryParameters2.pageSize : string14;
        int n25 = n4 & 0x2000;
        String string34 = n25 != 0 ? fleekQueryParameters2.currentPage : string15;
        string15 = string34;
        n25 = n4 & 0x4000;
        string34 = n25 != 0 ? fleekQueryParameters2.userId : string16;
        int n26 = n4 & 0x8000;
        string16 = string34;
        string34 = n26 != 0 ? fleekQueryParameters2.seenPostIds : string17;
        n26 = n4 & 0x10000;
        string17 = string34;
        string34 = n26 != 0 ? fleekQueryParameters2.category : string18;
        n26 = n4 & 0x20000;
        string18 = string34;
        string34 = n26 != 0 ? fleekQueryParameters2.page : string19;
        n26 = 262144;
        String string35 = (n4 &= n26) != 0 ? fleekQueryParameters2.seenStoryPostId : string20;
        string2 = string21;
        string3 = string22;
        string4 = string23;
        string5 = string24;
        string6 = string25;
        string7 = string26;
        string8 = string27;
        string9 = string28;
        string10 = string29;
        string11 = string30;
        string12 = string31;
        string13 = string32;
        string14 = string33;
        string19 = string34;
        string20 = string35;
        return fleekQueryParameters.copy(string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string15, string16, string17, string18, string34, string35);
    }

    public final String component1() {
        return this.tenantId;
    }

    public final String component10() {
        return this.zone;
    }

    public final String component11() {
        return this.pcgroup;
    }

    public final String component12() {
        return this.query;
    }

    public final String component13() {
        return this.pageSize;
    }

    public final String component14() {
        return this.currentPage;
    }

    public final String component15() {
        return this.userId;
    }

    public final String component16() {
        return this.seenPostIds;
    }

    public final String component17() {
        return this.category;
    }

    public final String component18() {
        return this.page;
    }

    public final String component19() {
        return this.seenStoryPostId;
    }

    public final String component2() {
        return this.store;
    }

    public final String component3() {
        return this.platform;
    }

    public final String component4() {
        return this.channel;
    }

    public final String component5() {
        return this.usergroup;
    }

    public final String component6() {
        return this.userstate;
    }

    public final String component7() {
        return this.usertype;
    }

    public final String component8() {
        return this.city;
    }

    public final String component9() {
        return this.state;
    }

    public final FleekQueryParameters copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18, String string19, String string20) {
        FleekQueryParameters fleekQueryParameters = new FleekQueryParameters(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20);
        return fleekQueryParameters;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FleekQueryParameters;
        if (!bl3) {
            return false;
        }
        object = (FleekQueryParameters)object;
        String string2 = this.tenantId;
        String string3 = ((FleekQueryParameters)object).tenantId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.store;
        string3 = ((FleekQueryParameters)object).store;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.platform;
        string3 = ((FleekQueryParameters)object).platform;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.channel;
        string3 = ((FleekQueryParameters)object).channel;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.usergroup;
        string3 = ((FleekQueryParameters)object).usergroup;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.userstate;
        string3 = ((FleekQueryParameters)object).userstate;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.usertype;
        string3 = ((FleekQueryParameters)object).usertype;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.city;
        string3 = ((FleekQueryParameters)object).city;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.state;
        string3 = ((FleekQueryParameters)object).state;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.zone;
        string3 = ((FleekQueryParameters)object).zone;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.pcgroup;
        string3 = ((FleekQueryParameters)object).pcgroup;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.query;
        string3 = ((FleekQueryParameters)object).query;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.pageSize;
        string3 = ((FleekQueryParameters)object).pageSize;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.currentPage;
        string3 = ((FleekQueryParameters)object).currentPage;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.userId;
        string3 = ((FleekQueryParameters)object).userId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.seenPostIds;
        string3 = ((FleekQueryParameters)object).seenPostIds;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.category;
        string3 = ((FleekQueryParameters)object).category;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.page;
        string3 = ((FleekQueryParameters)object).page;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.seenStoryPostId;
        object = ((FleekQueryParameters)object).seenStoryPostId;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCurrentPage() {
        return this.currentPage;
    }

    public final String getPage() {
        return this.page;
    }

    public final String getPageSize() {
        return this.pageSize;
    }

    public final String getPcgroup() {
        return this.pcgroup;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getSeenPostIds() {
        return this.seenPostIds;
    }

    public final String getSeenStoryPostId() {
        return this.seenStoryPostId;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStore() {
        return this.store;
    }

    public final String getTenantId() {
        return this.tenantId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsergroup() {
        return this.usergroup;
    }

    public final String getUserstate() {
        return this.userstate;
    }

    public final String getUsertype() {
        return this.usertype;
    }

    public final String getZone() {
        return this.zone;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.tenantId;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.store;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.platform;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.channel;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.usergroup;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.userstate;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.usertype;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.city;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.state;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.zone;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.pcgroup;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.query;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.pageSize;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.currentPage;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.userId;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.seenPostIds;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.category;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.page;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.seenStoryPostId;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setCategory(String string2) {
        this.category = string2;
    }

    public final void setChannel(String string2) {
        this.channel = string2;
    }

    public final void setCity(String string2) {
        this.city = string2;
    }

    public final void setCurrentPage(String string2) {
        this.currentPage = string2;
    }

    public final void setPage(String string2) {
        this.page = string2;
    }

    public final void setPageSize(String string2) {
        this.pageSize = string2;
    }

    public final void setPcgroup(String string2) {
        this.pcgroup = string2;
    }

    public final void setPlatform(String string2) {
        this.platform = string2;
    }

    public final void setQuery(String string2) {
        this.query = string2;
    }

    public final void setSeenPostIds(String string2) {
        this.seenPostIds = string2;
    }

    public final void setSeenStoryPostId(String string2) {
        this.seenStoryPostId = string2;
    }

    public final void setState(String string2) {
        this.state = string2;
    }

    public final void setStore(String string2) {
        this.store = string2;
    }

    public final void setTenantId(String string2) {
        this.tenantId = string2;
    }

    public final void setUserId(String string2) {
        this.userId = string2;
    }

    public final void setUsergroup(String string2) {
        this.usergroup = string2;
    }

    public final void setUserstate(String string2) {
        this.userstate = string2;
    }

    public final void setUsertype(String string2) {
        this.usertype = string2;
    }

    public final void setZone(String string2) {
        this.zone = string2;
    }

    public String toString() {
        Object object = this;
        String string2 = this.tenantId;
        String string3 = this.store;
        String string4 = this.platform;
        String string5 = this.channel;
        String string6 = this.usergroup;
        String string7 = this.userstate;
        String string8 = this.usertype;
        String string9 = this.city;
        String string10 = this.state;
        String string11 = this.zone;
        String string12 = this.pcgroup;
        String string13 = this.query;
        String string14 = this.pageSize;
        String string15 = this.currentPage;
        String string16 = this.userId;
        String string17 = this.seenPostIds;
        String string18 = this.category;
        String string19 = this.page;
        String string20 = this.seenStoryPostId;
        object = og_1.a("FleekQueryParameters(tenantId=", string2, ", store=", string3, ", platform=");
        X50.a((StringBuilder)object, string4, ", channel=", string5, ", usergroup=");
        X50.a((StringBuilder)object, string6, ", userstate=", string7, ", usertype=");
        X50.a((StringBuilder)object, string8, ", city=", string9, ", state=");
        X50.a((StringBuilder)object, string10, ", zone=", string11, ", pcgroup=");
        X50.a((StringBuilder)object, string12, ", query=", string13, ", pageSize=");
        string4 = string14;
        X50.a((StringBuilder)object, string14, ", currentPage=", string15, ", userId=");
        string4 = string16;
        string5 = string17;
        X50.a((StringBuilder)object, string16, ", seenPostIds=", string17, ", category=");
        string4 = string18;
        string5 = string19;
        X50.a((StringBuilder)object, string18, ", page=", string19, ", seenStoryPostId=");
        string3 = string20;
        return h30_0.a((StringBuilder)object, string20, ")");
    }
}

