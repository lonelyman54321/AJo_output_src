/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ril.ajio.services.data.Cart.Howitworks;
import com.ril.ajio.services.data.Cart.PossibleActions;
import com.ril.ajio.services.data.Cart.PreventionTips;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ActionContent
implements Serializable {
    private final String PO_section_desc;
    private final String PO_section_title;
    private final Integer ajio_avg_perc;
    private final String banner_text;
    private final String cart_section_desc;
    private final String cart_section_title;
    private final String cta_hyper_link;
    private final String cta_nudge;
    private final String description;
    private final Boolean force_nudge;
    private final Howitworks howitworks;
    private final String orderId;
    private final PossibleActions possibleActions;
    private final PreventionTips preventionTips;
    private final String productId;
    private final Float return_fee;
    private final String return_fee_banner_text;
    private final String return_fee_cta;
    private final String return_fee_half_card_cta;
    private final String return_fee_half_card_desc;
    private final String return_fee_half_card_title;
    private final String return_fee_section_desc;
    private final String return_fee_section_title;
    private final String return_fee_strip;
    private final String title_hyper_link;
    private final String title_know_more;
    private final String title_nudge;

    public ActionContent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1 >>> 5, null);
    }

    public ActionContent(Integer n3, String string2, String string3, String string4, String string5, String string6, String string7, Boolean bl2, Howitworks howitworks, PossibleActions possibleActions, PreventionTips preventionTips, String string8, String string9, String string10, String string11, String string12, String string13, String string14, Float f5, String string15, String string16, String string17, String string18, String string19, String string20, String string21, String string22) {
        this.ajio_avg_perc = n3;
        this.banner_text = string2;
        this.cart_section_desc = string3;
        this.cart_section_title = string4;
        this.cta_hyper_link = string5;
        this.cta_nudge = string6;
        this.description = string7;
        this.force_nudge = bl2;
        this.howitworks = howitworks;
        this.possibleActions = possibleActions;
        this.preventionTips = preventionTips;
        this.title_hyper_link = string8;
        this.title_nudge = string9;
        this.title_know_more = string10;
        this.PO_section_title = string11;
        this.PO_section_desc = string12;
        this.return_fee_banner_text = string13;
        this.return_fee_cta = string14;
        this.return_fee = f5;
        this.return_fee_section_title = string15;
        this.return_fee_section_desc = string16;
        this.return_fee_half_card_title = string17;
        this.return_fee_half_card_desc = string18;
        this.return_fee_strip = string19;
        this.return_fee_half_card_cta = string20;
        this.orderId = string21;
        this.productId = string22;
    }

    public /* synthetic */ ActionContent(Integer serializable, String object, String string2, String string3, String string4, String string5, String string6, Boolean object2, Howitworks serializable2, PossibleActions serializable3, PreventionTips serializable4, String object3, String string7, String string8, String string9, String string10, String string11, String string12, Float object4, String object5, String string13, String string14, String string15, String string16, String string17, String string18, String string19, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string20;
        String string21;
        String string22;
        String string23;
        String string24;
        String string25;
        String string26;
        String string27;
        Float f5;
        String string28;
        String string29;
        String string30;
        String string31;
        String string32;
        String string33;
        String string34;
        PreventionTips preventionTips;
        PossibleActions possibleActions;
        Howitworks howitworks;
        Boolean bl2;
        String string35;
        String string36;
        String string37;
        String string38;
        String string39;
        String string40;
        Integer n4;
        int n7 = n3;
        int n8 = n3 & 1;
        if (n8 != 0) {
            n8 = 0;
            n4 = null;
        } else {
            n4 = serializable;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string40 = null;
        } else {
            string40 = object;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            string39 = null;
        } else {
            string39 = string2;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            string38 = null;
        } else {
            string38 = string3;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            string37 = null;
        } else {
            string37 = string4;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            string36 = null;
        } else {
            string36 = string5;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            string35 = null;
        } else {
            string35 = string6;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            bl2 = null;
        } else {
            bl2 = object2;
        }
        int n20 = n7 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            howitworks = null;
        } else {
            howitworks = serializable2;
        }
        int n21 = n7 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            possibleActions = null;
        } else {
            possibleActions = serializable3;
        }
        int n22 = n7 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            preventionTips = null;
        } else {
            preventionTips = serializable4;
        }
        int n24 = n7 & 0x800;
        if (n24 != 0) {
            n24 = 0;
            string34 = null;
        } else {
            string34 = object3;
        }
        int n25 = n7 & 0x1000;
        if (n25 != 0) {
            n25 = 0;
            string33 = null;
        } else {
            string33 = string7;
        }
        int n26 = n7 & 0x2000;
        if (n26 != 0) {
            n26 = 0;
            string32 = null;
        } else {
            string32 = string8;
        }
        int n27 = n7 & 0x4000;
        if (n27 != 0) {
            n27 = 0;
            string31 = null;
        } else {
            string31 = string9;
        }
        int n28 = n7 & 0x8000;
        if (n28 != 0) {
            n28 = 0;
            string30 = null;
        } else {
            string30 = string10;
        }
        int n29 = n7 & 0x10000;
        if (n29 != 0) {
            n29 = 0;
            string29 = null;
        } else {
            string29 = string11;
        }
        int n30 = n7 & 0x20000;
        if (n30 != 0) {
            n30 = 0;
            string28 = null;
        } else {
            string28 = string12;
        }
        int n32 = n7 & 0x40000;
        if (n32 != 0) {
            n32 = 0;
            f5 = null;
        } else {
            f5 = object4;
        }
        int n34 = n7 & 0x80000;
        if (n34 != 0) {
            n34 = 0;
            string27 = null;
        } else {
            string27 = object5;
        }
        int n35 = n7 & 0x100000;
        if (n35 != 0) {
            n35 = 0;
            string26 = null;
        } else {
            string26 = string13;
        }
        int n36 = n7 & 0x200000;
        if (n36 != 0) {
            n36 = 0;
            string25 = null;
        } else {
            string25 = string14;
        }
        int n37 = n7 & 0x400000;
        if (n37 != 0) {
            n37 = 0;
            string24 = null;
        } else {
            string24 = string15;
        }
        int n38 = n7 & 0x800000;
        if (n38 != 0) {
            n38 = 0;
            string23 = null;
        } else {
            string23 = string16;
        }
        int n39 = n7 & 0x1000000;
        if (n39 != 0) {
            n39 = 0;
            string22 = null;
        } else {
            string22 = string17;
        }
        int n41 = n7 & 0x2000000;
        if (n41 != 0) {
            n41 = 0;
            string21 = null;
        } else {
            string21 = string18;
        }
        int n42 = 0x4000000;
        if ((n7 &= n42) != 0) {
            n7 = 0;
            string20 = null;
        } else {
            string20 = string19;
        }
        serializable = this;
        object = n4;
        string2 = string40;
        string3 = string39;
        string4 = string38;
        string5 = string37;
        string6 = string36;
        object2 = string35;
        serializable2 = bl2;
        serializable3 = howitworks;
        serializable4 = possibleActions;
        object3 = preventionTips;
        string7 = string34;
        string8 = string33;
        string9 = string32;
        string10 = string31;
        string11 = string30;
        string12 = string29;
        object4 = string28;
        object5 = f5;
        string13 = string27;
        string14 = string26;
        string15 = string25;
        string16 = string24;
        string17 = string23;
        string18 = string22;
        string19 = string21;
        this(n4, string40, string39, string38, string37, string36, string35, bl2, howitworks, possibleActions, preventionTips, string34, string33, string32, string31, string30, string29, string28, f5, string27, string26, string25, string24, string23, string22, string21, string20);
    }

    public static /* synthetic */ ActionContent copy$default(ActionContent actionContent, Integer n3, String string2, String string3, String string4, String string5, String string6, String string7, Boolean bl2, Howitworks howitworks, PossibleActions possibleActions, PreventionTips preventionTips, String string8, String string9, String string10, String string11, String string12, String string13, String string14, Float object, String object2, String object3, String object4, String object5, String object6, String object7, String object8, String string15, int n4, Object object9) {
        ActionContent actionContent2 = actionContent;
        int n7 = n4;
        int n8 = n4 & 1;
        Integer n10 = n8 != 0 ? actionContent.ajio_avg_perc : n3;
        int n14 = n7 & 2;
        String string16 = n14 != 0 ? actionContent2.banner_text : string2;
        int n15 = n7 & 4;
        String string17 = n15 != 0 ? actionContent2.cart_section_desc : string3;
        int n16 = n7 & 8;
        String string18 = n16 != 0 ? actionContent2.cart_section_title : string4;
        int n17 = n7 & 0x10;
        String string19 = n17 != 0 ? actionContent2.cta_hyper_link : string5;
        int n18 = n7 & 0x20;
        String string20 = n18 != 0 ? actionContent2.cta_nudge : string6;
        int n19 = n7 & 0x40;
        String string21 = n19 != 0 ? actionContent2.description : string7;
        int n20 = n7 & 0x80;
        Boolean bl3 = n20 != 0 ? actionContent2.force_nudge : bl2;
        int n21 = n7 & 0x100;
        Howitworks howitworks2 = n21 != 0 ? actionContent2.howitworks : howitworks;
        int n22 = n7 & 0x200;
        PossibleActions possibleActions2 = n22 != 0 ? actionContent2.possibleActions : possibleActions;
        int n24 = n7 & 0x400;
        PreventionTips preventionTips2 = n24 != 0 ? actionContent2.preventionTips : preventionTips;
        int n25 = n7 & 0x800;
        String string22 = n25 != 0 ? actionContent2.title_hyper_link : string8;
        int n26 = n7 & 0x1000;
        String string23 = n26 != 0 ? actionContent2.title_nudge : string9;
        int n27 = n7 & 0x2000;
        Object object10 = n27 != 0 ? actionContent2.title_know_more : string10;
        string10 = object10;
        n27 = n7 & 0x4000;
        object10 = n27 != 0 ? actionContent2.PO_section_title : string11;
        int n28 = n7 & 0x8000;
        string11 = object10;
        object10 = n28 != 0 ? actionContent2.PO_section_desc : string12;
        n28 = n7 & 0x10000;
        string12 = object10;
        object10 = n28 != 0 ? actionContent2.return_fee_banner_text : string13;
        n28 = n7 & 0x20000;
        string13 = object10;
        object10 = n28 != 0 ? actionContent2.return_fee_cta : string14;
        n28 = n7 & 0x40000;
        string14 = object10;
        object10 = n28 != 0 ? actionContent2.return_fee : object;
        n28 = n7 & 0x80000;
        object = object10;
        object10 = n28 != 0 ? actionContent2.return_fee_section_title : object2;
        n28 = n7 & 0x100000;
        object2 = object10;
        object10 = n28 != 0 ? actionContent2.return_fee_section_desc : object3;
        n28 = n7 & 0x200000;
        object3 = object10;
        object10 = n28 != 0 ? actionContent2.return_fee_half_card_title : object4;
        n28 = n7 & 0x400000;
        object4 = object10;
        object10 = n28 != 0 ? actionContent2.return_fee_half_card_desc : object5;
        n28 = n7 & 0x800000;
        object5 = object10;
        object10 = n28 != 0 ? actionContent2.return_fee_strip : object6;
        n28 = n7 & 0x1000000;
        object6 = object10;
        object10 = n28 != 0 ? actionContent2.return_fee_half_card_cta : object7;
        n28 = n7 & 0x2000000;
        object7 = object10;
        object10 = n28 != 0 ? actionContent2.orderId : object8;
        n28 = 0x4000000;
        String string24 = (n7 &= n28) != 0 ? actionContent2.productId : string15;
        n3 = n10;
        string2 = string16;
        string3 = string17;
        string4 = string18;
        string5 = string19;
        string6 = string20;
        string7 = string21;
        bl2 = bl3;
        howitworks = howitworks2;
        possibleActions = possibleActions2;
        preventionTips = preventionTips2;
        string8 = string22;
        string9 = string23;
        object8 = object10;
        string15 = string24;
        return actionContent.copy(n10, string16, string17, string18, string19, string20, string21, bl3, howitworks2, possibleActions2, preventionTips2, string22, string23, string10, string11, string12, string13, string14, (Float)object, (String)object2, (String)object3, (String)object4, (String)object5, (String)object6, (String)object7, (String)object10, string24);
    }

    public final Integer component1() {
        return this.ajio_avg_perc;
    }

    public final PossibleActions component10() {
        return this.possibleActions;
    }

    public final PreventionTips component11() {
        return this.preventionTips;
    }

    public final String component12() {
        return this.title_hyper_link;
    }

    public final String component13() {
        return this.title_nudge;
    }

    public final String component14() {
        return this.title_know_more;
    }

    public final String component15() {
        return this.PO_section_title;
    }

    public final String component16() {
        return this.PO_section_desc;
    }

    public final String component17() {
        return this.return_fee_banner_text;
    }

    public final String component18() {
        return this.return_fee_cta;
    }

    public final Float component19() {
        return this.return_fee;
    }

    public final String component2() {
        return this.banner_text;
    }

    public final String component20() {
        return this.return_fee_section_title;
    }

    public final String component21() {
        return this.return_fee_section_desc;
    }

    public final String component22() {
        return this.return_fee_half_card_title;
    }

    public final String component23() {
        return this.return_fee_half_card_desc;
    }

    public final String component24() {
        return this.return_fee_strip;
    }

    public final String component25() {
        return this.return_fee_half_card_cta;
    }

    public final String component26() {
        return this.orderId;
    }

    public final String component27() {
        return this.productId;
    }

    public final String component3() {
        return this.cart_section_desc;
    }

    public final String component4() {
        return this.cart_section_title;
    }

    public final String component5() {
        return this.cta_hyper_link;
    }

    public final String component6() {
        return this.cta_nudge;
    }

    public final String component7() {
        return this.description;
    }

    public final Boolean component8() {
        return this.force_nudge;
    }

    public final Howitworks component9() {
        return this.howitworks;
    }

    public final ActionContent copy(Integer n3, String string2, String string3, String string4, String string5, String string6, String string7, Boolean bl2, Howitworks howitworks, PossibleActions possibleActions, PreventionTips preventionTips, String string8, String string9, String string10, String string11, String string12, String string13, String string14, Float f5, String string15, String string16, String string17, String string18, String string19, String string20, String string21, String string22) {
        ActionContent actionContent = new ActionContent(n3, string2, string3, string4, string5, string6, string7, bl2, howitworks, possibleActions, preventionTips, string8, string9, string10, string11, string12, string13, string14, f5, string15, string16, string17, string18, string19, string20, string21, string22);
        return actionContent;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ActionContent;
        if (!bl3) {
            return false;
        }
        object = (ActionContent)object;
        Object object2 = this.ajio_avg_perc;
        Object object3 = ((ActionContent)object).ajio_avg_perc;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.banner_text;
        object3 = ((ActionContent)object).banner_text;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cart_section_desc;
        object3 = ((ActionContent)object).cart_section_desc;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cart_section_title;
        object3 = ((ActionContent)object).cart_section_title;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cta_hyper_link;
        object3 = ((ActionContent)object).cta_hyper_link;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cta_nudge;
        object3 = ((ActionContent)object).cta_nudge;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.description;
        object3 = ((ActionContent)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.force_nudge;
        object3 = ((ActionContent)object).force_nudge;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.howitworks;
        object3 = ((ActionContent)object).howitworks;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.possibleActions;
        object3 = ((ActionContent)object).possibleActions;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.preventionTips;
        object3 = ((ActionContent)object).preventionTips;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.title_hyper_link;
        object3 = ((ActionContent)object).title_hyper_link;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.title_nudge;
        object3 = ((ActionContent)object).title_nudge;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.title_know_more;
        object3 = ((ActionContent)object).title_know_more;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.PO_section_title;
        object3 = ((ActionContent)object).PO_section_title;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.PO_section_desc;
        object3 = ((ActionContent)object).PO_section_desc;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_fee_banner_text;
        object3 = ((ActionContent)object).return_fee_banner_text;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_fee_cta;
        object3 = ((ActionContent)object).return_fee_cta;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_fee;
        object3 = ((ActionContent)object).return_fee;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_fee_section_title;
        object3 = ((ActionContent)object).return_fee_section_title;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_fee_section_desc;
        object3 = ((ActionContent)object).return_fee_section_desc;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_fee_half_card_title;
        object3 = ((ActionContent)object).return_fee_half_card_title;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_fee_half_card_desc;
        object3 = ((ActionContent)object).return_fee_half_card_desc;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_fee_strip;
        object3 = ((ActionContent)object).return_fee_strip;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_fee_half_card_cta;
        object3 = ((ActionContent)object).return_fee_half_card_cta;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderId;
        object3 = ((ActionContent)object).orderId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productId;
        object = ((ActionContent)object).productId;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getAjio_avg_perc() {
        return this.ajio_avg_perc;
    }

    public final String getBanner_text() {
        return this.banner_text;
    }

    public final String getCart_section_desc() {
        return this.cart_section_desc;
    }

    public final String getCart_section_title() {
        return this.cart_section_title;
    }

    public final String getCta_hyper_link() {
        return this.cta_hyper_link;
    }

    public final String getCta_nudge() {
        return this.cta_nudge;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getForce_nudge() {
        return this.force_nudge;
    }

    public final Howitworks getHowitworks() {
        return this.howitworks;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPO_section_desc() {
        return this.PO_section_desc;
    }

    public final String getPO_section_title() {
        return this.PO_section_title;
    }

    public final PossibleActions getPossibleActions() {
        return this.possibleActions;
    }

    public final PreventionTips getPreventionTips() {
        return this.preventionTips;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final Float getReturn_fee() {
        return this.return_fee;
    }

    public final String getReturn_fee_banner_text() {
        return this.return_fee_banner_text;
    }

    public final String getReturn_fee_cta() {
        return this.return_fee_cta;
    }

    public final String getReturn_fee_half_card_cta() {
        return this.return_fee_half_card_cta;
    }

    public final String getReturn_fee_half_card_desc() {
        return this.return_fee_half_card_desc;
    }

    public final String getReturn_fee_half_card_title() {
        return this.return_fee_half_card_title;
    }

    public final String getReturn_fee_section_desc() {
        return this.return_fee_section_desc;
    }

    public final String getReturn_fee_section_title() {
        return this.return_fee_section_title;
    }

    public final String getReturn_fee_strip() {
        return this.return_fee_strip;
    }

    public final String getTitle_hyper_link() {
        return this.title_hyper_link;
    }

    public final String getTitle_know_more() {
        return this.title_know_more;
    }

    public final String getTitle_nudge() {
        return this.title_nudge;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.ajio_avg_perc;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        Object object = this.banner_text;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cart_section_desc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cart_section_title;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cta_hyper_link;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cta_nudge;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.description;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.force_nudge;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.howitworks;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Howitworks)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.possibleActions;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PossibleActions)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.preventionTips;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PreventionTips)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.title_hyper_link;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.title_nudge;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.title_know_more;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.PO_section_title;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.PO_section_desc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_fee_banner_text;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_fee_cta;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_fee;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_fee_section_title;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_fee_section_desc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_fee_half_card_title;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_fee_half_card_desc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_fee_strip;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_fee_half_card_cta;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productId;
        if (object != null) {
            n8 = ((String)object).hashCode();
        }
        return n4 + n8;
    }

    public String toString() {
        Serializable serializable = this;
        Object object = this.ajio_avg_perc;
        String string2 = this.banner_text;
        String string3 = this.cart_section_desc;
        String string4 = this.cart_section_title;
        String string5 = this.cta_hyper_link;
        String string6 = this.cta_nudge;
        String string7 = this.description;
        Boolean bl2 = this.force_nudge;
        Howitworks howitworks = this.howitworks;
        PossibleActions possibleActions = this.possibleActions;
        PreventionTips preventionTips = this.preventionTips;
        String string8 = this.title_hyper_link;
        String string9 = this.title_nudge;
        String string10 = this.title_know_more;
        String string11 = this.PO_section_title;
        String string12 = this.PO_section_desc;
        String string13 = this.return_fee_banner_text;
        String string14 = this.return_fee_cta;
        Float f5 = this.return_fee;
        String string15 = this.return_fee_section_title;
        String string16 = this.return_fee_section_desc;
        String string17 = this.return_fee_half_card_title;
        String string18 = this.return_fee_half_card_desc;
        String string19 = this.return_fee_strip;
        String string20 = this.return_fee_half_card_cta;
        String string21 = this.orderId;
        String string22 = this.productId;
        serializable = new StringBuilder("ActionContent(ajio_avg_perc=");
        ((StringBuilder)serializable).append(object);
        ((StringBuilder)serializable).append(", banner_text=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(", cart_section_desc=");
        X50.a((StringBuilder)serializable, string3, ", cart_section_title=", string4, ", cta_hyper_link=");
        X50.a((StringBuilder)serializable, string5, ", cta_nudge=", string6, ", description=");
        vw0_1.a(bl2, string7, ", force_nudge=", ", howitworks=", (StringBuilder)serializable);
        ((StringBuilder)serializable).append(howitworks);
        ((StringBuilder)serializable).append(", possibleActions=");
        ((StringBuilder)serializable).append(possibleActions);
        ((StringBuilder)serializable).append(", preventionTips=");
        ((StringBuilder)serializable).append(preventionTips);
        ((StringBuilder)serializable).append(", title_hyper_link=");
        ((StringBuilder)serializable).append(string8);
        ((StringBuilder)serializable).append(", title_nudge=");
        X50.a((StringBuilder)serializable, string9, ", title_know_more=", string10, ", PO_section_title=");
        string3 = string11;
        string4 = string12;
        X50.a((StringBuilder)serializable, string11, ", PO_section_desc=", string12, ", return_fee_banner_text=");
        string3 = string13;
        string4 = string14;
        X50.a((StringBuilder)serializable, string13, ", return_fee_cta=", string14, ", return_fee=");
        object = f5;
        ((StringBuilder)serializable).append(f5);
        ((StringBuilder)serializable).append(", return_fee_section_title=");
        object = string15;
        ((StringBuilder)serializable).append(string15);
        ((StringBuilder)serializable).append(", return_fee_section_desc=");
        string3 = string16;
        string4 = string17;
        X50.a((StringBuilder)serializable, string16, ", return_fee_half_card_title=", string17, ", return_fee_half_card_desc=");
        string3 = string18;
        string4 = string19;
        X50.a((StringBuilder)serializable, string18, ", return_fee_strip=", string19, ", return_fee_half_card_cta=");
        string3 = string20;
        string4 = string21;
        X50.a((StringBuilder)serializable, string20, ", orderId=", string21, ", productId=");
        string2 = string22;
        return h30_0.a((StringBuilder)serializable, string22, ")");
    }
}

