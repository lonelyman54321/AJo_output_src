/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.fleek.explore_brands.MetaData$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class MetaData
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String altText;
    private String aspectRatio;
    private String brandId;
    private String brandImageHeight;
    private String brandImageMediaType;
    private String brandImageWidth;
    private String brandLogoHeight;
    private String brandLogoMediaType;
    private String brandLogoWidth;
    private String brandPageHeaderDuration;
    private String brandPageHeaderHeight;
    private String brandPageHeaderMediaType;
    private Double brandPageHeaderVideoDuration;
    private String brandPageHeaderWidth;
    private String carouselTimer;
    private String defaultSize;
    private String duration;
    private String enableAdsOnPlp;
    private String event;
    private Double height;
    private String openInNewTab;
    private String player;
    private String showTimer;
    private String timerEndTime;
    private String timerLabel;
    private String timerType;
    private String unit;
    private Double width;

    static {
        MetaData$Creator metaData$Creator = new MetaData$Creator();
        CREATOR = metaData$Creator;
    }

    public MetaData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1 >>> 4, null);
    }

    public MetaData(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, Double d2, Double d5, Double d7, String string15, String string16, String string17, String string18, String string19, String string20, String string21, String string22, String string23, String string24, String string25, String string26) {
        this.carouselTimer = string2;
        this.defaultSize = string3;
        this.aspectRatio = string4;
        this.event = string5;
        this.player = string6;
        this.duration = string7;
        this.altText = string8;
        this.enableAdsOnPlp = string9;
        this.openInNewTab = string10;
        this.showTimer = string11;
        this.timerEndTime = string12;
        this.timerLabel = string13;
        this.timerType = string14;
        this.brandPageHeaderVideoDuration = d2;
        this.height = d5;
        this.width = d7;
        this.brandPageHeaderMediaType = string15;
        this.brandId = string16;
        this.brandLogoWidth = string17;
        this.brandLogoHeight = string18;
        this.brandLogoMediaType = string19;
        this.brandImageWidth = string20;
        this.brandImageHeight = string21;
        this.brandImageMediaType = string22;
        this.brandPageHeaderWidth = string23;
        this.brandPageHeaderHeight = string24;
        this.brandPageHeaderDuration = string25;
        this.unit = string26;
    }

    public /* synthetic */ MetaData(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, Double object2, Double d2, Double d5, String object3, String string14, String string15, String string16, String string17, String string18, String string19, String string20, String string21, String string22, String string23, String string24, int n3, DefaultConstructorMarker defaultConstructorMarker) {
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
        Double d7;
        Double d9;
        Double d12;
        String string37;
        String string38;
        String string39;
        String string40;
        String string41;
        String string42;
        String string43;
        String string44;
        String string45;
        String string46;
        String string47;
        String string48;
        String string49;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            string49 = null;
        } else {
            string49 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string48 = null;
        } else {
            string48 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string47 = null;
        } else {
            string47 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string46 = null;
        } else {
            string46 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string45 = null;
        } else {
            string45 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string44 = null;
        } else {
            string44 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string43 = null;
        } else {
            string43 = string7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string42 = null;
        } else {
            string42 = string8;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string41 = null;
        } else {
            string41 = string9;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string40 = null;
        } else {
            string40 = string10;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string39 = null;
        } else {
            string39 = string11;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string38 = null;
        } else {
            string38 = string12;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string37 = null;
        } else {
            string37 = string13;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            d12 = null;
        } else {
            d12 = object2;
        }
        int n26 = n4 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            d9 = null;
        } else {
            d9 = d2;
        }
        int n27 = n4 & 0x8000;
        if (n27 != 0) {
            n27 = 0;
            d7 = null;
        } else {
            d7 = d5;
        }
        int n28 = n4 & 0x10000;
        if (n28 != 0) {
            n28 = 0;
            string36 = null;
        } else {
            string36 = object3;
        }
        int n29 = n4 & 0x20000;
        if (n29 != 0) {
            n29 = 0;
            string35 = null;
        } else {
            string35 = string14;
        }
        int n30 = n4 & 0x40000;
        if (n30 != 0) {
            n30 = 0;
            string34 = null;
        } else {
            string34 = string15;
        }
        int n32 = n4 & 0x80000;
        if (n32 != 0) {
            n32 = 0;
            string33 = null;
        } else {
            string33 = string16;
        }
        int n34 = n4 & 0x100000;
        if (n34 != 0) {
            n34 = 0;
            string32 = null;
        } else {
            string32 = string17;
        }
        int n35 = n4 & 0x200000;
        if (n35 != 0) {
            n35 = 0;
            string31 = null;
        } else {
            string31 = string18;
        }
        int n36 = n4 & 0x400000;
        if (n36 != 0) {
            n36 = 0;
            string30 = null;
        } else {
            string30 = string19;
        }
        int n37 = n4 & 0x800000;
        if (n37 != 0) {
            n37 = 0;
            string29 = null;
        } else {
            string29 = string20;
        }
        int n38 = n4 & 0x1000000;
        if (n38 != 0) {
            n38 = 0;
            string28 = null;
        } else {
            string28 = string21;
        }
        int n39 = n4 & 0x2000000;
        if (n39 != 0) {
            n39 = 0;
            string27 = null;
        } else {
            string27 = string22;
        }
        int n41 = n4 & 0x4000000;
        if (n41 != 0) {
            n41 = 0;
            string26 = null;
        } else {
            string26 = string23;
        }
        int n42 = 0x8000000;
        if ((n4 &= n42) != 0) {
            n4 = 0;
            string25 = null;
        } else {
            string25 = string24;
        }
        object = this;
        string2 = string49;
        string3 = string48;
        string4 = string47;
        string5 = string46;
        string6 = string45;
        string7 = string44;
        string8 = string43;
        string9 = string42;
        string10 = string41;
        string11 = string40;
        string12 = string39;
        string13 = string38;
        object2 = string37;
        d2 = d12;
        d5 = d9;
        object3 = d7;
        string14 = string36;
        string15 = string35;
        string16 = string34;
        string17 = string33;
        string18 = string32;
        string19 = string31;
        string20 = string30;
        string21 = string29;
        string22 = string28;
        string23 = string27;
        string24 = string26;
        this(string49, string48, string47, string46, string45, string44, string43, string42, string41, string40, string39, string38, string37, d12, d9, d7, string36, string35, string34, string33, string32, string31, string30, string29, string28, string27, string26, string25);
    }

    public static /* synthetic */ MetaData copy$default(MetaData metaData, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, Double d2, Double d5, Double d7, String object, String object2, String object3, String object4, String object5, String object6, String object7, String object8, String object9, String object10, String object11, String string15, int n3, Object object12) {
        MetaData metaData2 = metaData;
        int n4 = n3;
        int n7 = n3 & 1;
        String string16 = n7 != 0 ? metaData.carouselTimer : string2;
        int n8 = n4 & 2;
        String string17 = n8 != 0 ? metaData2.defaultSize : string3;
        int n10 = n4 & 4;
        String string18 = n10 != 0 ? metaData2.aspectRatio : string4;
        int n14 = n4 & 8;
        String string19 = n14 != 0 ? metaData2.event : string5;
        int n15 = n4 & 0x10;
        String string20 = n15 != 0 ? metaData2.player : string6;
        int n16 = n4 & 0x20;
        String string21 = n16 != 0 ? metaData2.duration : string7;
        int n17 = n4 & 0x40;
        String string22 = n17 != 0 ? metaData2.altText : string8;
        int n18 = n4 & 0x80;
        String string23 = n18 != 0 ? metaData2.enableAdsOnPlp : string9;
        int n19 = n4 & 0x100;
        String string24 = n19 != 0 ? metaData2.openInNewTab : string10;
        int n20 = n4 & 0x200;
        String string25 = n20 != 0 ? metaData2.showTimer : string11;
        int n21 = n4 & 0x400;
        String string26 = n21 != 0 ? metaData2.timerEndTime : string12;
        int n22 = n4 & 0x800;
        String string27 = n22 != 0 ? metaData2.timerLabel : string13;
        int n24 = n4 & 0x1000;
        String string28 = n24 != 0 ? metaData2.timerType : string14;
        int n25 = n4 & 0x2000;
        Object object13 = n25 != 0 ? metaData2.brandPageHeaderVideoDuration : d2;
        d2 = object13;
        n25 = n4 & 0x4000;
        object13 = n25 != 0 ? metaData2.height : d5;
        int n26 = n4 & 0x8000;
        d5 = object13;
        object13 = n26 != 0 ? metaData2.width : d7;
        n26 = n4 & 0x10000;
        d7 = object13;
        object13 = n26 != 0 ? metaData2.brandPageHeaderMediaType : object;
        n26 = n4 & 0x20000;
        object = object13;
        object13 = n26 != 0 ? metaData2.brandId : object2;
        n26 = n4 & 0x40000;
        object2 = object13;
        object13 = n26 != 0 ? metaData2.brandLogoWidth : object3;
        n26 = n4 & 0x80000;
        object3 = object13;
        object13 = n26 != 0 ? metaData2.brandLogoHeight : object4;
        n26 = n4 & 0x100000;
        object4 = object13;
        object13 = n26 != 0 ? metaData2.brandLogoMediaType : object5;
        n26 = n4 & 0x200000;
        object5 = object13;
        object13 = n26 != 0 ? metaData2.brandImageWidth : object6;
        n26 = n4 & 0x400000;
        object6 = object13;
        object13 = n26 != 0 ? metaData2.brandImageHeight : object7;
        n26 = n4 & 0x800000;
        object7 = object13;
        object13 = n26 != 0 ? metaData2.brandImageMediaType : object8;
        n26 = n4 & 0x1000000;
        object8 = object13;
        object13 = n26 != 0 ? metaData2.brandPageHeaderWidth : object9;
        n26 = n4 & 0x2000000;
        object9 = object13;
        object13 = n26 != 0 ? metaData2.brandPageHeaderHeight : object10;
        n26 = n4 & 0x4000000;
        object10 = object13;
        object13 = n26 != 0 ? metaData2.brandPageHeaderDuration : object11;
        n26 = 0x8000000;
        String string29 = (n4 &= n26) != 0 ? metaData2.unit : string15;
        string2 = string16;
        string3 = string17;
        string4 = string18;
        string5 = string19;
        string6 = string20;
        string7 = string21;
        string8 = string22;
        string9 = string23;
        string10 = string24;
        string11 = string25;
        string12 = string26;
        string13 = string27;
        string14 = string28;
        object11 = object13;
        string15 = string29;
        return metaData.copy(string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, d2, d5, d7, (String)object, (String)object2, (String)object3, (String)object4, (String)object5, (String)object6, (String)object7, (String)object8, (String)object9, (String)object10, (String)object13, string29);
    }

    public final String component1() {
        return this.carouselTimer;
    }

    public final String component10() {
        return this.showTimer;
    }

    public final String component11() {
        return this.timerEndTime;
    }

    public final String component12() {
        return this.timerLabel;
    }

    public final String component13() {
        return this.timerType;
    }

    public final Double component14() {
        return this.brandPageHeaderVideoDuration;
    }

    public final Double component15() {
        return this.height;
    }

    public final Double component16() {
        return this.width;
    }

    public final String component17() {
        return this.brandPageHeaderMediaType;
    }

    public final String component18() {
        return this.brandId;
    }

    public final String component19() {
        return this.brandLogoWidth;
    }

    public final String component2() {
        return this.defaultSize;
    }

    public final String component20() {
        return this.brandLogoHeight;
    }

    public final String component21() {
        return this.brandLogoMediaType;
    }

    public final String component22() {
        return this.brandImageWidth;
    }

    public final String component23() {
        return this.brandImageHeight;
    }

    public final String component24() {
        return this.brandImageMediaType;
    }

    public final String component25() {
        return this.brandPageHeaderWidth;
    }

    public final String component26() {
        return this.brandPageHeaderHeight;
    }

    public final String component27() {
        return this.brandPageHeaderDuration;
    }

    public final String component28() {
        return this.unit;
    }

    public final String component3() {
        return this.aspectRatio;
    }

    public final String component4() {
        return this.event;
    }

    public final String component5() {
        return this.player;
    }

    public final String component6() {
        return this.duration;
    }

    public final String component7() {
        return this.altText;
    }

    public final String component8() {
        return this.enableAdsOnPlp;
    }

    public final String component9() {
        return this.openInNewTab;
    }

    public final MetaData copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, Double d2, Double d5, Double d7, String string15, String string16, String string17, String string18, String string19, String string20, String string21, String string22, String string23, String string24, String string25, String string26) {
        MetaData metaData = new MetaData(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, d2, d5, d7, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26);
        return metaData;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof MetaData;
        if (!bl3) {
            return false;
        }
        object = (MetaData)object;
        Object object2 = this.carouselTimer;
        Object object3 = ((MetaData)object).carouselTimer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.defaultSize;
        object3 = ((MetaData)object).defaultSize;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.aspectRatio;
        object3 = ((MetaData)object).aspectRatio;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.event;
        object3 = ((MetaData)object).event;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.player;
        object3 = ((MetaData)object).player;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.duration;
        object3 = ((MetaData)object).duration;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.altText;
        object3 = ((MetaData)object).altText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.enableAdsOnPlp;
        object3 = ((MetaData)object).enableAdsOnPlp;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.openInNewTab;
        object3 = ((MetaData)object).openInNewTab;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.showTimer;
        object3 = ((MetaData)object).showTimer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.timerEndTime;
        object3 = ((MetaData)object).timerEndTime;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.timerLabel;
        object3 = ((MetaData)object).timerLabel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.timerType;
        object3 = ((MetaData)object).timerType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandPageHeaderVideoDuration;
        object3 = ((MetaData)object).brandPageHeaderVideoDuration;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.height;
        object3 = ((MetaData)object).height;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.width;
        object3 = ((MetaData)object).width;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandPageHeaderMediaType;
        object3 = ((MetaData)object).brandPageHeaderMediaType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandId;
        object3 = ((MetaData)object).brandId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandLogoWidth;
        object3 = ((MetaData)object).brandLogoWidth;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandLogoHeight;
        object3 = ((MetaData)object).brandLogoHeight;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandLogoMediaType;
        object3 = ((MetaData)object).brandLogoMediaType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandImageWidth;
        object3 = ((MetaData)object).brandImageWidth;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandImageHeight;
        object3 = ((MetaData)object).brandImageHeight;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandImageMediaType;
        object3 = ((MetaData)object).brandImageMediaType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandPageHeaderWidth;
        object3 = ((MetaData)object).brandPageHeaderWidth;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandPageHeaderHeight;
        object3 = ((MetaData)object).brandPageHeaderHeight;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandPageHeaderDuration;
        object3 = ((MetaData)object).brandPageHeaderDuration;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.unit;
        object = ((MetaData)object).unit;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final String getAspectRatio() {
        return this.aspectRatio;
    }

    public final String getBrandId() {
        return this.brandId;
    }

    public final String getBrandImageHeight() {
        return this.brandImageHeight;
    }

    public final String getBrandImageMediaType() {
        return this.brandImageMediaType;
    }

    public final String getBrandImageWidth() {
        return this.brandImageWidth;
    }

    public final String getBrandLogoHeight() {
        return this.brandLogoHeight;
    }

    public final String getBrandLogoMediaType() {
        return this.brandLogoMediaType;
    }

    public final String getBrandLogoWidth() {
        return this.brandLogoWidth;
    }

    public final String getBrandPageHeaderDuration() {
        return this.brandPageHeaderDuration;
    }

    public final String getBrandPageHeaderHeight() {
        return this.brandPageHeaderHeight;
    }

    public final String getBrandPageHeaderMediaType() {
        return this.brandPageHeaderMediaType;
    }

    public final Double getBrandPageHeaderVideoDuration() {
        return this.brandPageHeaderVideoDuration;
    }

    public final String getBrandPageHeaderWidth() {
        return this.brandPageHeaderWidth;
    }

    public final String getCarouselTimer() {
        return this.carouselTimer;
    }

    public final String getDefaultSize() {
        return this.defaultSize;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getEnableAdsOnPlp() {
        return this.enableAdsOnPlp;
    }

    public final String getEvent() {
        return this.event;
    }

    public final Double getHeight() {
        return this.height;
    }

    public final String getOpenInNewTab() {
        return this.openInNewTab;
    }

    public final String getPlayer() {
        return this.player;
    }

    public final String getShowTimer() {
        return this.showTimer;
    }

    public final String getTimerEndTime() {
        return this.timerEndTime;
    }

    public final String getTimerLabel() {
        return this.timerLabel;
    }

    public final String getTimerType() {
        return this.timerType;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final Double getWidth() {
        return this.width;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.carouselTimer;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.defaultSize;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.aspectRatio;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.event;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.player;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.duration;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.altText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.enableAdsOnPlp;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.openInNewTab;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.showTimer;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.timerEndTime;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.timerLabel;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.timerType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandPageHeaderVideoDuration;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.height;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.width;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandPageHeaderMediaType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandLogoWidth;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandLogoHeight;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandLogoMediaType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandImageWidth;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandImageHeight;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandImageMediaType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandPageHeaderWidth;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandPageHeaderHeight;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandPageHeaderDuration;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.unit;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAltText(String string2) {
        this.altText = string2;
    }

    public final void setAspectRatio(String string2) {
        this.aspectRatio = string2;
    }

    public final void setBrandId(String string2) {
        this.brandId = string2;
    }

    public final void setBrandImageHeight(String string2) {
        this.brandImageHeight = string2;
    }

    public final void setBrandImageMediaType(String string2) {
        this.brandImageMediaType = string2;
    }

    public final void setBrandImageWidth(String string2) {
        this.brandImageWidth = string2;
    }

    public final void setBrandLogoHeight(String string2) {
        this.brandLogoHeight = string2;
    }

    public final void setBrandLogoMediaType(String string2) {
        this.brandLogoMediaType = string2;
    }

    public final void setBrandLogoWidth(String string2) {
        this.brandLogoWidth = string2;
    }

    public final void setBrandPageHeaderDuration(String string2) {
        this.brandPageHeaderDuration = string2;
    }

    public final void setBrandPageHeaderHeight(String string2) {
        this.brandPageHeaderHeight = string2;
    }

    public final void setBrandPageHeaderMediaType(String string2) {
        this.brandPageHeaderMediaType = string2;
    }

    public final void setBrandPageHeaderVideoDuration(Double d2) {
        this.brandPageHeaderVideoDuration = d2;
    }

    public final void setBrandPageHeaderWidth(String string2) {
        this.brandPageHeaderWidth = string2;
    }

    public final void setCarouselTimer(String string2) {
        this.carouselTimer = string2;
    }

    public final void setDefaultSize(String string2) {
        this.defaultSize = string2;
    }

    public final void setDuration(String string2) {
        this.duration = string2;
    }

    public final void setEnableAdsOnPlp(String string2) {
        this.enableAdsOnPlp = string2;
    }

    public final void setEvent(String string2) {
        this.event = string2;
    }

    public final void setHeight(Double d2) {
        this.height = d2;
    }

    public final void setOpenInNewTab(String string2) {
        this.openInNewTab = string2;
    }

    public final void setPlayer(String string2) {
        this.player = string2;
    }

    public final void setShowTimer(String string2) {
        this.showTimer = string2;
    }

    public final void setTimerEndTime(String string2) {
        this.timerEndTime = string2;
    }

    public final void setTimerLabel(String string2) {
        this.timerLabel = string2;
    }

    public final void setTimerType(String string2) {
        this.timerType = string2;
    }

    public final void setUnit(String string2) {
        this.unit = string2;
    }

    public final void setWidth(Double d2) {
        this.width = d2;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.carouselTimer;
        String string2 = this.defaultSize;
        String string3 = this.aspectRatio;
        String string4 = this.event;
        String string5 = this.player;
        String string6 = this.duration;
        String string7 = this.altText;
        String string8 = this.enableAdsOnPlp;
        String string9 = this.openInNewTab;
        String string10 = this.showTimer;
        String string11 = this.timerEndTime;
        String string12 = this.timerLabel;
        String string13 = this.timerType;
        Double d2 = this.brandPageHeaderVideoDuration;
        Double d5 = this.height;
        Double d7 = this.width;
        String string14 = this.brandPageHeaderMediaType;
        String string15 = this.brandId;
        String string16 = this.brandLogoWidth;
        String string17 = this.brandLogoHeight;
        String string18 = this.brandLogoMediaType;
        String string19 = this.brandImageWidth;
        String string20 = this.brandImageHeight;
        String string21 = this.brandImageMediaType;
        String string22 = this.brandPageHeaderWidth;
        String string23 = this.brandPageHeaderHeight;
        String string24 = this.brandPageHeaderDuration;
        String string25 = this.unit;
        object = og_1.a("MetaData(carouselTimer=", (String)object2, ", defaultSize=", string2, ", aspectRatio=");
        X50.a((StringBuilder)object, string3, ", event=", string4, ", player=");
        X50.a((StringBuilder)object, string5, ", duration=", string6, ", altText=");
        X50.a((StringBuilder)object, string7, ", enableAdsOnPlp=", string8, ", openInNewTab=");
        X50.a((StringBuilder)object, string9, ", showTimer=", string10, ", timerEndTime=");
        X50.a((StringBuilder)object, string11, ", timerLabel=", string12, ", timerType=");
        ((StringBuilder)object).append(string13);
        ((StringBuilder)object).append(", brandPageHeaderVideoDuration=");
        object2 = d2;
        ((StringBuilder)object).append(d2);
        ((StringBuilder)object).append(", height=");
        object2 = d5;
        ((StringBuilder)object).append(d5);
        ((StringBuilder)object).append(", width=");
        object2 = d7;
        ((StringBuilder)object).append(d7);
        ((StringBuilder)object).append(", brandPageHeaderMediaType=");
        string3 = string14;
        string4 = string15;
        X50.a((StringBuilder)object, string14, ", brandId=", string15, ", brandLogoWidth=");
        string3 = string16;
        string4 = string17;
        X50.a((StringBuilder)object, string16, ", brandLogoHeight=", string17, ", brandLogoMediaType=");
        string3 = string18;
        string4 = string19;
        X50.a((StringBuilder)object, string18, ", brandImageWidth=", string19, ", brandImageHeight=");
        string3 = string20;
        string4 = string21;
        X50.a((StringBuilder)object, string20, ", brandImageMediaType=", string21, ", brandPageHeaderWidth=");
        string3 = string22;
        string4 = string23;
        X50.a((StringBuilder)object, string22, ", brandPageHeaderHeight=", string23, ", brandPageHeaderDuration=");
        string3 = string24;
        string4 = string25;
        return ko_0.a((StringBuilder)object, string24, ", unit=", string25, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        double d2;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.carouselTimer;
        parcel.writeString((String)object);
        object = this.defaultSize;
        parcel.writeString((String)object);
        object = this.aspectRatio;
        parcel.writeString((String)object);
        object = this.event;
        parcel.writeString((String)object);
        object = this.player;
        parcel.writeString((String)object);
        object = this.duration;
        parcel.writeString((String)object);
        object = this.altText;
        parcel.writeString((String)object);
        object = this.enableAdsOnPlp;
        parcel.writeString((String)object);
        object = this.openInNewTab;
        parcel.writeString((String)object);
        object = this.showTimer;
        parcel.writeString((String)object);
        object = this.timerEndTime;
        parcel.writeString((String)object);
        object = this.timerLabel;
        parcel.writeString((String)object);
        object = this.timerType;
        parcel.writeString((String)object);
        object = this.brandPageHeaderVideoDuration;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            d2 = (Double)object;
            parcel.writeDouble(d2);
        }
        object = this.height;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            d2 = (Double)object;
            parcel.writeDouble(d2);
        }
        object = this.width;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            double d5 = (Double)object;
            parcel.writeDouble(d5);
        }
        object = this.brandPageHeaderMediaType;
        parcel.writeString((String)object);
        object = this.brandId;
        parcel.writeString((String)object);
        object = this.brandLogoWidth;
        parcel.writeString((String)object);
        object = this.brandLogoHeight;
        parcel.writeString((String)object);
        object = this.brandLogoMediaType;
        parcel.writeString((String)object);
        object = this.brandImageWidth;
        parcel.writeString((String)object);
        object = this.brandImageHeight;
        parcel.writeString((String)object);
        object = this.brandImageMediaType;
        parcel.writeString((String)object);
        object = this.brandPageHeaderWidth;
        parcel.writeString((String)object);
        object = this.brandPageHeaderHeight;
        parcel.writeString((String)object);
        object = this.brandPageHeaderDuration;
        parcel.writeString((String)object);
        object = this.unit;
        parcel.writeString((String)object);
    }
}

