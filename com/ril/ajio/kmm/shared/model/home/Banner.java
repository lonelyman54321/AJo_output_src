/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.AudioSettings;
import com.ril.ajio.kmm.shared.model.home.AudioSettings$$serializer;
import com.ril.ajio.kmm.shared.model.home.Banner$Companion;
import com.ril.ajio.kmm.shared.model.home.CMSProduct$$serializer;
import com.ril.ajio.kmm.shared.model.home.CTASettings;
import com.ril.ajio.kmm.shared.model.home.CTASettings$$serializer;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata$$serializer;
import com.ril.ajio.kmm.shared.model.home.Hotspot$$serializer;
import com.ril.ajio.kmm.shared.model.home.SubComponent$$serializer;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.VideoSetting$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class Banner {
    private static final KSerializer[] $childSerializers;
    public static final Banner$Companion Companion;
    private String adSpotId;
    private String altText;
    private AudioSettings audioSettings;
    private String bannerType;
    private String bannerUrl;
    private CTASettings ctaSettings;
    private Long duration;
    private DynamicPageMetadata dynamicPageMetadata;
    private Boolean enableAdsOnPlp;
    private String extendedUrl;
    private String feedLogic;
    private Double height;
    private List hotspots;
    private Boolean isAdBanner;
    private String mediaType;
    private Integer noOfProducts;
    private List products;
    private Boolean showDefault;
    private Boolean showTimer;
    private List subComponents;
    private String thumbnailImage;
    private Long timerEndTime;
    private String timerLabel;
    private String timerType;
    private String uuid;
    private VideoSetting videoSettings;
    private String widgetLevel;
    private Double width;

    static {
        Object object = new Banner$Companion(null);
        Companion = object;
        KSerializer kSerializer = xe_1.p(Hotspot$$serializer.INSTANCE);
        object = new ip_2(kSerializer);
        KSerializer kSerializer2 = xe_1.p(SubComponent$$serializer.INSTANCE);
        kSerializer = new ip_2(kSerializer2);
        KSerializer[] kSerializerArray = CMSProduct$$serializer.INSTANCE;
        kSerializer2 = new ip_2((KSerializer)kSerializerArray);
        kSerializerArray = new KSerializer[]{null, null, object, null, kSerializer, null, null, null, kSerializer2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        $childSerializers = kSerializerArray;
    }

    public Banner() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1 >>> 4, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public /* synthetic */ Banner(int n3, String string2, Double d2, List list, Boolean bl2, List list2, Long l2, Double d5, String string3, List list3, DynamicPageMetadata dynamicPageMetadata, String string4, String string5, String string6, String string7, VideoSetting videoSetting, AudioSettings audioSettings, CTASettings cTASettings, Long l3, String string8, String string9, Boolean bl3, String string10, String string11, Integer n4, Boolean bl4, String string12, String string13, Boolean bl5, a03_0 a03_02) {
        Object object;
        Banner banner = this;
        int n7 = n3;
        int n8 = n3 & 1;
        if (n8 == 0) {
            this.bannerUrl = null;
        } else {
            object = string2;
            this.bannerUrl = string2;
        }
        n8 = n7 & 2;
        if (n8 == 0) {
            banner.height = null;
        } else {
            object = d2;
            banner.height = d2;
        }
        n8 = n7 & 4;
        if (n8 == 0) {
            banner.hotspots = null;
        } else {
            object = list;
            banner.hotspots = list;
        }
        n8 = n7 & 8;
        if (n8 == 0) {
            banner.showTimer = null;
        } else {
            object = bl2;
            banner.showTimer = bl2;
        }
        n8 = n7 & 0x10;
        if (n8 == 0) {
            banner.subComponents = null;
        } else {
            object = list2;
            banner.subComponents = list2;
        }
        n8 = n7 & 0x20;
        if (n8 == 0) {
            banner.timerEndTime = null;
        } else {
            object = l2;
            banner.timerEndTime = l2;
        }
        n8 = n7 & 0x40;
        if (n8 == 0) {
            banner.width = null;
        } else {
            object = d5;
            banner.width = d5;
        }
        n8 = n7 & 0x80;
        if (n8 == 0) {
            banner.bannerType = null;
        } else {
            object = string3;
            banner.bannerType = string3;
        }
        n8 = n7 & 0x100;
        if (n8 == 0) {
            banner.products = null;
        } else {
            object = list3;
            banner.products = list3;
        }
        n8 = n7 & 0x200;
        if (n8 == 0) {
            banner.dynamicPageMetadata = null;
        } else {
            object = dynamicPageMetadata;
            banner.dynamicPageMetadata = dynamicPageMetadata;
        }
        n8 = n7 & 0x400;
        if (n8 == 0) {
            banner.uuid = null;
        } else {
            object = string4;
            banner.uuid = string4;
        }
        n8 = n7 & 0x800;
        if (n8 == 0) {
            banner.timerType = null;
        } else {
            object = string5;
            banner.timerType = string5;
        }
        n8 = n7 & 0x1000;
        if (n8 == 0) {
            banner.timerLabel = null;
        } else {
            object = string6;
            banner.timerLabel = string6;
        }
        n8 = n7 & 0x2000;
        if (n8 == 0) {
            banner.thumbnailImage = null;
        } else {
            object = string7;
            banner.thumbnailImage = string7;
        }
        n8 = n7 & 0x4000;
        if (n8 == 0) {
            banner.videoSettings = null;
        } else {
            object = videoSetting;
            banner.videoSettings = videoSetting;
        }
        n8 = 0x8000 & n7;
        if (n8 == 0) {
            banner.audioSettings = null;
        } else {
            object = audioSettings;
            banner.audioSettings = audioSettings;
        }
        n8 = 0x10000 & n7;
        if (n8 == 0) {
            banner.ctaSettings = null;
        } else {
            object = cTASettings;
            banner.ctaSettings = cTASettings;
        }
        n8 = 0x20000 & n7;
        if (n8 == 0) {
            banner.duration = null;
        } else {
            object = l3;
            banner.duration = l3;
        }
        n8 = 0x40000 & n7;
        if (n8 == 0) {
            banner.mediaType = null;
        } else {
            object = string8;
            banner.mediaType = string8;
        }
        n8 = 0x80000 & n7;
        if (n8 == 0) {
            banner.extendedUrl = null;
        } else {
            object = string9;
            banner.extendedUrl = string9;
        }
        n8 = 0x100000 & n7;
        object = n8 == 0 ? Boolean.TRUE : bl3;
        banner.enableAdsOnPlp = object;
        n8 = 0x200000 & n7;
        if (n8 == 0) {
            banner.widgetLevel = null;
        } else {
            object = string10;
            banner.widgetLevel = string10;
        }
        n8 = 0x400000 & n7;
        if (n8 == 0) {
            banner.feedLogic = null;
        } else {
            object = string11;
            banner.feedLogic = string11;
        }
        n8 = 0x800000 & n7;
        if (n8 == 0) {
            banner.noOfProducts = null;
        } else {
            object = n4;
            banner.noOfProducts = n4;
        }
        n8 = 0x1000000 & n7;
        object = n8 == 0 ? Boolean.FALSE : bl4;
        banner.isAdBanner = object;
        n8 = 0x2000000 & n7;
        if (n8 == 0) {
            banner.adSpotId = null;
        } else {
            object = string12;
            banner.adSpotId = string12;
        }
        n8 = 0x4000000 & n7;
        if (n8 == 0) {
            banner.altText = null;
        } else {
            object = string13;
            banner.altText = string13;
        }
        n8 = 0x8000000;
        Boolean bl6 = (n7 &= n8) == 0 ? Boolean.FALSE : bl5;
        banner.showDefault = bl6;
    }

    public Banner(String string2, Double d2, List list, Boolean bl2, List list2, Long l2, Double d5, String string3, List list3, DynamicPageMetadata dynamicPageMetadata, String string4, String string5, String string6, String string7, VideoSetting videoSetting, AudioSettings audioSettings, CTASettings cTASettings, Long l3, String string8, String string9, Boolean bl3, String string10, String string11, Integer n3, Boolean bl4, String string12, String string13, Boolean bl5) {
        this.bannerUrl = string2;
        this.height = d2;
        this.hotspots = list;
        this.showTimer = bl2;
        this.subComponents = list2;
        this.timerEndTime = l2;
        this.width = d5;
        this.bannerType = string3;
        this.products = list3;
        this.dynamicPageMetadata = dynamicPageMetadata;
        this.uuid = string4;
        this.timerType = string5;
        this.timerLabel = string6;
        this.thumbnailImage = string7;
        this.videoSettings = videoSetting;
        this.audioSettings = audioSettings;
        this.ctaSettings = cTASettings;
        this.duration = l3;
        this.mediaType = string8;
        this.extendedUrl = string9;
        this.enableAdsOnPlp = bl3;
        this.widgetLevel = string10;
        this.feedLogic = string11;
        this.noOfProducts = n3;
        this.isAdBanner = bl4;
        this.adSpotId = string12;
        this.altText = string13;
        this.showDefault = bl5;
    }

    public /* synthetic */ Banner(String object, Double object2, List object3, Boolean object4, List object5, Long object6, Double number, String object7, List object8, DynamicPageMetadata object9, String object10, String string2, String string3, String string4, VideoSetting object11, AudioSettings object12, CTASettings object13, Long object14, String object15, String string5, Boolean object16, String object17, String string6, Integer object18, Boolean comparable, String object19, String string7, Boolean object20, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string8;
        String string9;
        Integer n4;
        String string10;
        String string11;
        String string12;
        String string13;
        Long l2;
        CTASettings cTASettings;
        AudioSettings audioSettings;
        VideoSetting videoSetting;
        String string14;
        String string15;
        String string16;
        String string17;
        DynamicPageMetadata dynamicPageMetadata;
        List list;
        String string18;
        Double d2;
        Long l3;
        List list2;
        Boolean bl2;
        List list3;
        Double d5;
        String string19;
        int n7 = n3;
        int n8 = n3 & 1;
        if (n8 != 0) {
            n8 = 0;
            string19 = null;
        } else {
            string19 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            d5 = null;
        } else {
            d5 = object2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            list3 = null;
        } else {
            list3 = object3;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            bl2 = null;
        } else {
            bl2 = object4;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            list2 = null;
        } else {
            list2 = object5;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            l3 = null;
        } else {
            l3 = object6;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            d2 = null;
        } else {
            d2 = number;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            string18 = null;
        } else {
            string18 = object7;
        }
        int n20 = n7 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            list = null;
        } else {
            list = object8;
        }
        int n21 = n7 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            dynamicPageMetadata = null;
        } else {
            dynamicPageMetadata = object9;
        }
        int n22 = n7 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            string17 = null;
        } else {
            string17 = object10;
        }
        int n24 = n7 & 0x800;
        if (n24 != 0) {
            n24 = 0;
            string16 = null;
        } else {
            string16 = string2;
        }
        int n25 = n7 & 0x1000;
        if (n25 != 0) {
            n25 = 0;
            string15 = null;
        } else {
            string15 = string3;
        }
        int n26 = n7 & 0x2000;
        if (n26 != 0) {
            n26 = 0;
            string14 = null;
        } else {
            string14 = string4;
        }
        int n27 = n7 & 0x4000;
        if (n27 != 0) {
            n27 = 0;
            videoSetting = null;
        } else {
            videoSetting = object11;
        }
        int n28 = n7 & 0x8000;
        if (n28 != 0) {
            n28 = 0;
            audioSettings = null;
        } else {
            audioSettings = object12;
        }
        int n29 = n7 & 0x10000;
        if (n29 != 0) {
            n29 = 0;
            cTASettings = null;
        } else {
            cTASettings = object13;
        }
        int n30 = n7 & 0x20000;
        if (n30 != 0) {
            n30 = 0;
            l2 = null;
        } else {
            l2 = object14;
        }
        int n32 = n7 & 0x40000;
        if (n32 != 0) {
            n32 = 0;
            string13 = null;
        } else {
            string13 = object15;
        }
        int n34 = n7 & 0x80000;
        if (n34 != 0) {
            n34 = 0;
            string12 = null;
        } else {
            string12 = string5;
        }
        int n35 = n7 & 0x100000;
        Object object21 = n35 != 0 ? Boolean.TRUE : object16;
        int n36 = n7 & 0x200000;
        if (n36 != 0) {
            n36 = 0;
            string11 = null;
        } else {
            string11 = object17;
        }
        int n37 = n7 & 0x400000;
        if (n37 != 0) {
            n37 = 0;
            string10 = null;
        } else {
            string10 = string6;
        }
        int n38 = n7 & 0x800000;
        if (n38 != 0) {
            n38 = 0;
            n4 = null;
        } else {
            n4 = object18;
        }
        int n39 = n7 & 0x1000000;
        Boolean bl3 = n39 != 0 ? Boolean.FALSE : comparable;
        int n41 = n7 & 0x2000000;
        if (n41 != 0) {
            n41 = 0;
            string9 = null;
        } else {
            string9 = object19;
        }
        int n42 = n7 & 0x4000000;
        if (n42 != 0) {
            n42 = 0;
            string8 = null;
        } else {
            string8 = string7;
        }
        int n43 = 0x8000000;
        Object object22 = (n7 &= n43) != 0 ? Boolean.FALSE : object20;
        object = this;
        object2 = string19;
        object3 = d5;
        object4 = list3;
        object5 = bl2;
        object6 = list2;
        number = l3;
        object7 = d2;
        object8 = string18;
        object9 = list;
        object10 = dynamicPageMetadata;
        string2 = string17;
        string3 = string16;
        string4 = string15;
        object11 = string14;
        object12 = videoSetting;
        object13 = audioSettings;
        object14 = cTASettings;
        object15 = l2;
        string5 = string13;
        object16 = string12;
        object17 = object21;
        string6 = string11;
        object18 = string10;
        comparable = n4;
        object19 = bl3;
        string7 = string9;
        object20 = string8;
        this(string19, d5, list3, bl2, list2, l3, d2, string18, list, dynamicPageMetadata, string17, string16, string15, string14, videoSetting, audioSettings, cTASettings, l2, string13, string12, (Boolean)object21, string11, string10, n4, bl3, string9, string8, (Boolean)object22);
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ Banner copy$default(Banner banner, String string2, Double d2, List list, Boolean bl2, List list2, Long l2, Double d5, String string3, List list3, DynamicPageMetadata dynamicPageMetadata, String string4, String string5, String string6, String string7, VideoSetting object, AudioSettings object2, CTASettings object3, Long object4, String object5, String object6, Boolean object7, String object8, String object9, Integer object10, Boolean object11, String object12, String object13, Boolean bl3, int n3, Object object14) {
        Banner banner2 = banner;
        int n4 = n3;
        int n7 = n3 & 1;
        String string8 = n7 != 0 ? banner.bannerUrl : string2;
        int n8 = n4 & 2;
        Double d7 = n8 != 0 ? banner2.height : d2;
        int n10 = n4 & 4;
        List list4 = n10 != 0 ? banner2.hotspots : list;
        int n14 = n4 & 8;
        Boolean bl4 = n14 != 0 ? banner2.showTimer : bl2;
        int n15 = n4 & 0x10;
        List list5 = n15 != 0 ? banner2.subComponents : list2;
        int n16 = n4 & 0x20;
        Long l3 = n16 != 0 ? banner2.timerEndTime : l2;
        int n17 = n4 & 0x40;
        Double d9 = n17 != 0 ? banner2.width : d5;
        int n18 = n4 & 0x80;
        String string9 = n18 != 0 ? banner2.bannerType : string3;
        int n19 = n4 & 0x100;
        List list6 = n19 != 0 ? banner2.products : list3;
        int n20 = n4 & 0x200;
        DynamicPageMetadata dynamicPageMetadata2 = n20 != 0 ? banner2.dynamicPageMetadata : dynamicPageMetadata;
        int n21 = n4 & 0x400;
        String string10 = n21 != 0 ? banner2.uuid : string4;
        int n22 = n4 & 0x800;
        String string11 = n22 != 0 ? banner2.timerType : string5;
        int n24 = n4 & 0x1000;
        String string12 = n24 != 0 ? banner2.timerLabel : string6;
        int n25 = n4 & 0x2000;
        Object object15 = n25 != 0 ? banner2.thumbnailImage : string7;
        string7 = object15;
        n25 = n4 & 0x4000;
        object15 = n25 != 0 ? banner2.videoSettings : object;
        int n26 = n4 & 0x8000;
        object = object15;
        object15 = n26 != 0 ? banner2.audioSettings : object2;
        n26 = n4 & 0x10000;
        object2 = object15;
        object15 = n26 != 0 ? banner2.ctaSettings : object3;
        n26 = n4 & 0x20000;
        object3 = object15;
        object15 = n26 != 0 ? banner2.duration : object4;
        n26 = n4 & 0x40000;
        object4 = object15;
        object15 = n26 != 0 ? banner2.mediaType : object5;
        n26 = n4 & 0x80000;
        object5 = object15;
        object15 = n26 != 0 ? banner2.extendedUrl : object6;
        n26 = n4 & 0x100000;
        object6 = object15;
        object15 = n26 != 0 ? banner2.enableAdsOnPlp : object7;
        n26 = n4 & 0x200000;
        object7 = object15;
        object15 = n26 != 0 ? banner2.widgetLevel : object8;
        n26 = n4 & 0x400000;
        object8 = object15;
        object15 = n26 != 0 ? banner2.feedLogic : object9;
        n26 = n4 & 0x800000;
        object9 = object15;
        object15 = n26 != 0 ? banner2.noOfProducts : object10;
        n26 = n4 & 0x1000000;
        object10 = object15;
        object15 = n26 != 0 ? banner2.isAdBanner : object11;
        n26 = n4 & 0x2000000;
        object11 = object15;
        object15 = n26 != 0 ? banner2.adSpotId : object12;
        n26 = n4 & 0x4000000;
        object12 = object15;
        object15 = n26 != 0 ? banner2.altText : object13;
        n26 = 0x8000000;
        Boolean bl5 = (n4 &= n26) != 0 ? banner2.showDefault : bl3;
        string2 = string8;
        d2 = d7;
        list = list4;
        bl2 = bl4;
        list2 = list5;
        l2 = l3;
        d5 = d9;
        string3 = string9;
        list3 = list6;
        dynamicPageMetadata = dynamicPageMetadata2;
        string4 = string10;
        string5 = string11;
        string6 = string12;
        object13 = object15;
        bl3 = bl5;
        return banner.copy(string8, d7, list4, bl4, list5, l3, d9, string9, list6, dynamicPageMetadata2, string10, string11, string12, string7, (VideoSetting)object, (AudioSettings)object2, (CTASettings)object3, (Long)object4, (String)object5, (String)object6, (Boolean)object7, (String)object8, (String)object9, (Integer)object10, (Boolean)object11, (String)object12, (String)object15, bl5);
    }

    public static final /* synthetic */ void write$Self$shared_release(Banner object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        int n3;
        Object object2;
        Object object3;
        Object object4 = $childSerializers;
        int n4 = 0;
        Object object5 = null;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object3 = ((Banner)object).bannerUrl) != null) {
            object3 = pe3_2.a;
            object2 = ((Banner)object).bannerUrl;
            u30_02.r(serialDescriptor, 0, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n4 = 1)) || (object3 = ((Banner)object).height) != null) {
            object3 = os0_2.a;
            object2 = ((Banner)object).height;
            u30_02.r(serialDescriptor, n4, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n4 = 2)) || (object3 = ((Banner)object).hotspots) != null) {
            object3 = object4[n4];
            object2 = ((Banner)object).hotspots;
            u30_02.r(serialDescriptor, n4, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n4 = 3)) || (object3 = ((Banner)object).showTimer) != null) {
            object3 = cz_2.a;
            object2 = ((Banner)object).showTimer;
            u30_02.r(serialDescriptor, n4, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n4 = 4)) || (object3 = ((Banner)object).subComponents) != null) {
            object3 = object4[n4];
            object2 = ((Banner)object).subComponents;
            u30_02.r(serialDescriptor, n4, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n4 = 5)) || (object3 = ((Banner)object).timerEndTime) != null) {
            object3 = mb1_2.a;
            object2 = ((Banner)object).timerEndTime;
            u30_02.r(serialDescriptor, n4, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n4 = 6)) || (object3 = ((Banner)object).width) != null) {
            object3 = os0_2.a;
            object2 = ((Banner)object).width;
            u30_02.r(serialDescriptor, n4, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n4 = 7)) || (object3 = ((Banner)object).bannerType) != null) {
            object3 = pe3_2.a;
            object2 = ((Banner)object).bannerType;
            u30_02.r(serialDescriptor, n4, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n4 = 8)) || (object3 = ((Banner)object).products) != null) {
            object4 = object4[n4];
            object3 = ((Banner)object).products;
            u30_02.r(serialDescriptor, n4, (b03_0)object4, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 9) ? 1 : 0)) != 0 || (object5 = ((Banner)object).dynamicPageMetadata) != null) {
            object5 = DynamicPageMetadata$$serializer.INSTANCE;
            object3 = ((Banner)object).dynamicPageMetadata;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 10) ? 1 : 0)) != 0 || (object5 = ((Banner)object).uuid) != null) {
            object5 = pe3_2.a;
            object3 = ((Banner)object).uuid;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 11) ? 1 : 0)) != 0 || (object5 = ((Banner)object).timerType) != null) {
            object5 = pe3_2.a;
            object3 = ((Banner)object).timerType;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 12) ? 1 : 0)) != 0 || (object5 = ((Banner)object).timerLabel) != null) {
            object5 = pe3_2.a;
            object3 = ((Banner)object).timerLabel;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 13) ? 1 : 0)) != 0 || (object5 = ((Banner)object).thumbnailImage) != null) {
            object5 = pe3_2.a;
            object3 = ((Banner)object).thumbnailImage;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 14) ? 1 : 0)) != 0 || (object5 = ((Banner)object).videoSettings) != null) {
            object5 = VideoSetting$$serializer.INSTANCE;
            object3 = ((Banner)object).videoSettings;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 15) ? 1 : 0)) != 0 || (object5 = ((Banner)object).audioSettings) != null) {
            object5 = AudioSettings$$serializer.INSTANCE;
            object3 = ((Banner)object).audioSettings;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 16) ? 1 : 0)) != 0 || (object5 = ((Banner)object).ctaSettings) != null) {
            object5 = CTASettings$$serializer.INSTANCE;
            object3 = ((Banner)object).ctaSettings;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 17) ? 1 : 0)) != 0 || (object5 = ((Banner)object).duration) != null) {
            object5 = mb1_2.a;
            object3 = ((Banner)object).duration;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 18) ? 1 : 0)) != 0 || (object5 = ((Banner)object).mediaType) != null) {
            object5 = pe3_2.a;
            object3 = ((Banner)object).mediaType;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 19) ? 1 : 0)) != 0 || (object5 = ((Banner)object).extendedUrl) != null) {
            object5 = pe3_2.a;
            object3 = ((Banner)object).extendedUrl;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 20) ? 1 : 0)) != 0 || (n4 = (int)(Intrinsics.areEqual(object5 = ((Banner)object).enableAdsOnPlp, object3 = Boolean.TRUE) ? 1 : 0)) == 0) {
            object5 = cz_2.a;
            object3 = ((Banner)object).enableAdsOnPlp;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 21) ? 1 : 0)) != 0 || (object5 = ((Banner)object).widgetLevel) != null) {
            object5 = pe3_2.a;
            object3 = ((Banner)object).widgetLevel;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 22) ? 1 : 0)) != 0 || (object5 = ((Banner)object).feedLogic) != null) {
            object5 = pe3_2.a;
            object3 = ((Banner)object).feedLogic;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 23) ? 1 : 0)) != 0 || (object5 = ((Banner)object).noOfProducts) != null) {
            object5 = yi1_2.a;
            object3 = ((Banner)object).noOfProducts;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 24) ? 1 : 0)) != 0 || (n4 = (int)(Intrinsics.areEqual(object5 = ((Banner)object).isAdBanner, object3 = Boolean.FALSE) ? 1 : 0)) == 0) {
            object5 = cz_2.a;
            object3 = ((Banner)object).isAdBanner;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 25) ? 1 : 0)) != 0 || (object5 = ((Banner)object).adSpotId) != null) {
            object5 = pe3_2.a;
            object3 = ((Banner)object).adSpotId;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 26) ? 1 : 0)) != 0 || (object5 = ((Banner)object).altText) != null) {
            object5 = pe3_2.a;
            object3 = ((Banner)object).altText;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 27) ? 1 : 0)) != 0 || (n4 = (int)(Intrinsics.areEqual(object5 = ((Banner)object).showDefault, object3 = Boolean.FALSE) ? 1 : 0)) == 0) {
            object5 = cz_2.a;
            object = ((Banner)object).showDefault;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object);
        }
    }

    public final String component1() {
        return this.bannerUrl;
    }

    public final DynamicPageMetadata component10() {
        return this.dynamicPageMetadata;
    }

    public final String component11() {
        return this.uuid;
    }

    public final String component12() {
        return this.timerType;
    }

    public final String component13() {
        return this.timerLabel;
    }

    public final String component14() {
        return this.thumbnailImage;
    }

    public final VideoSetting component15() {
        return this.videoSettings;
    }

    public final AudioSettings component16() {
        return this.audioSettings;
    }

    public final CTASettings component17() {
        return this.ctaSettings;
    }

    public final Long component18() {
        return this.duration;
    }

    public final String component19() {
        return this.mediaType;
    }

    public final Double component2() {
        return this.height;
    }

    public final String component20() {
        return this.extendedUrl;
    }

    public final Boolean component21() {
        return this.enableAdsOnPlp;
    }

    public final String component22() {
        return this.widgetLevel;
    }

    public final String component23() {
        return this.feedLogic;
    }

    public final Integer component24() {
        return this.noOfProducts;
    }

    public final Boolean component25() {
        return this.isAdBanner;
    }

    public final String component26() {
        return this.adSpotId;
    }

    public final String component27() {
        return this.altText;
    }

    public final Boolean component28() {
        return this.showDefault;
    }

    public final List component3() {
        return this.hotspots;
    }

    public final Boolean component4() {
        return this.showTimer;
    }

    public final List component5() {
        return this.subComponents;
    }

    public final Long component6() {
        return this.timerEndTime;
    }

    public final Double component7() {
        return this.width;
    }

    public final String component8() {
        return this.bannerType;
    }

    public final List component9() {
        return this.products;
    }

    public final Banner copy(String string2, Double d2, List list, Boolean bl2, List list2, Long l2, Double d5, String string3, List list3, DynamicPageMetadata dynamicPageMetadata, String string4, String string5, String string6, String string7, VideoSetting videoSetting, AudioSettings audioSettings, CTASettings cTASettings, Long l3, String string8, String string9, Boolean bl3, String string10, String string11, Integer n3, Boolean bl4, String string12, String string13, Boolean bl5) {
        Banner banner = new Banner(string2, d2, list, bl2, list2, l2, d5, string3, list3, dynamicPageMetadata, string4, string5, string6, string7, videoSetting, audioSettings, cTASettings, l3, string8, string9, bl3, string10, string11, n3, bl4, string12, string13, bl5);
        return banner;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Banner;
        if (!bl3) {
            return false;
        }
        object = (Banner)object;
        Object object2 = this.bannerUrl;
        Object object3 = ((Banner)object).bannerUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.height;
        object3 = ((Banner)object).height;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.hotspots;
        object3 = ((Banner)object).hotspots;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.showTimer;
        object3 = ((Banner)object).showTimer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subComponents;
        object3 = ((Banner)object).subComponents;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.timerEndTime;
        object3 = ((Banner)object).timerEndTime;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.width;
        object3 = ((Banner)object).width;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerType;
        object3 = ((Banner)object).bannerType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.products;
        object3 = ((Banner)object).products;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.dynamicPageMetadata;
        object3 = ((Banner)object).dynamicPageMetadata;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.uuid;
        object3 = ((Banner)object).uuid;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.timerType;
        object3 = ((Banner)object).timerType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.timerLabel;
        object3 = ((Banner)object).timerLabel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.thumbnailImage;
        object3 = ((Banner)object).thumbnailImage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.videoSettings;
        object3 = ((Banner)object).videoSettings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.audioSettings;
        object3 = ((Banner)object).audioSettings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.ctaSettings;
        object3 = ((Banner)object).ctaSettings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.duration;
        object3 = ((Banner)object).duration;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.mediaType;
        object3 = ((Banner)object).mediaType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.extendedUrl;
        object3 = ((Banner)object).extendedUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.enableAdsOnPlp;
        object3 = ((Banner)object).enableAdsOnPlp;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.widgetLevel;
        object3 = ((Banner)object).widgetLevel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.feedLogic;
        object3 = ((Banner)object).feedLogic;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.noOfProducts;
        object3 = ((Banner)object).noOfProducts;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isAdBanner;
        object3 = ((Banner)object).isAdBanner;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.adSpotId;
        object3 = ((Banner)object).adSpotId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.altText;
        object3 = ((Banner)object).altText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.showDefault;
        object = ((Banner)object).showDefault;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAdSpotId() {
        return this.adSpotId;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final AudioSettings getAudioSettings() {
        return this.audioSettings;
    }

    public final String getBannerType() {
        return this.bannerType;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final CTASettings getCtaSettings() {
        return this.ctaSettings;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final DynamicPageMetadata getDynamicPageMetadata() {
        return this.dynamicPageMetadata;
    }

    public final Boolean getEnableAdsOnPlp() {
        return this.enableAdsOnPlp;
    }

    public final String getExtendedUrl() {
        return this.extendedUrl;
    }

    public final String getFeedLogic() {
        return this.feedLogic;
    }

    public final Double getHeight() {
        return this.height;
    }

    public final List getHotspots() {
        return this.hotspots;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final Integer getNoOfProducts() {
        return this.noOfProducts;
    }

    public final List getProducts() {
        return this.products;
    }

    public final Boolean getShowDefault() {
        return this.showDefault;
    }

    public final Boolean getShowTimer() {
        return this.showTimer;
    }

    public final List getSubComponents() {
        return this.subComponents;
    }

    public final String getThumbnailImage() {
        return this.thumbnailImage;
    }

    public final Long getTimerEndTime() {
        return this.timerEndTime;
    }

    public final String getTimerLabel() {
        return this.timerLabel;
    }

    public final String getTimerType() {
        return this.timerType;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final VideoSetting getVideoSettings() {
        return this.videoSettings;
    }

    public final String getWidgetLevel() {
        return this.widgetLevel;
    }

    public final Double getWidth() {
        return this.width;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.bannerUrl;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.height;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.hotspots;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.showTimer;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.subComponents;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.timerEndTime;
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
        object = this.bannerType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.products;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.dynamicPageMetadata;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((DynamicPageMetadata)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.uuid;
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
        object = this.timerLabel;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.thumbnailImage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.videoSettings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((VideoSetting)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.audioSettings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((AudioSettings)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.ctaSettings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((CTASettings)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.duration;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.mediaType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.extendedUrl;
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
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.widgetLevel;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.feedLogic;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.noOfProducts;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isAdBanner;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.adSpotId;
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
        object = this.showDefault;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isAdBanner() {
        return this.isAdBanner;
    }

    public final void setAdBanner(Boolean bl2) {
        this.isAdBanner = bl2;
    }

    public final void setAdSpotId(String string2) {
        this.adSpotId = string2;
    }

    public final void setAltText(String string2) {
        this.altText = string2;
    }

    public final void setAudioSettings(AudioSettings audioSettings) {
        this.audioSettings = audioSettings;
    }

    public final void setBannerType(String string2) {
        this.bannerType = string2;
    }

    public final void setBannerUrl(String string2) {
        this.bannerUrl = string2;
    }

    public final void setCtaSettings(CTASettings cTASettings) {
        this.ctaSettings = cTASettings;
    }

    public final void setDuration(Long l2) {
        this.duration = l2;
    }

    public final void setDynamicPageMetadata(DynamicPageMetadata dynamicPageMetadata) {
        this.dynamicPageMetadata = dynamicPageMetadata;
    }

    public final void setEnableAdsOnPlp(Boolean bl2) {
        this.enableAdsOnPlp = bl2;
    }

    public final void setExtendedUrl(String string2) {
        this.extendedUrl = string2;
    }

    public final void setFeedLogic(String string2) {
        this.feedLogic = string2;
    }

    public final void setHeight(Double d2) {
        this.height = d2;
    }

    public final void setHotspots(List list) {
        this.hotspots = list;
    }

    public final void setMediaType(String string2) {
        this.mediaType = string2;
    }

    public final void setNoOfProducts(Integer n3) {
        this.noOfProducts = n3;
    }

    public final void setProducts(List list) {
        this.products = list;
    }

    public final void setShowDefault(Boolean bl2) {
        this.showDefault = bl2;
    }

    public final void setShowTimer(Boolean bl2) {
        this.showTimer = bl2;
    }

    public final void setSubComponents(List list) {
        this.subComponents = list;
    }

    public final void setThumbnailImage(String string2) {
        this.thumbnailImage = string2;
    }

    public final void setTimerEndTime(Long l2) {
        this.timerEndTime = l2;
    }

    public final void setTimerLabel(String string2) {
        this.timerLabel = string2;
    }

    public final void setTimerType(String string2) {
        this.timerType = string2;
    }

    public final void setUuid(String string2) {
        this.uuid = string2;
    }

    public final void setVideoSettings(VideoSetting videoSetting) {
        this.videoSettings = videoSetting;
    }

    public final void setWidgetLevel(String string2) {
        this.widgetLevel = string2;
    }

    public final void setWidth(Double d2) {
        this.width = d2;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.bannerUrl;
        Double d2 = this.height;
        Object object3 = this.hotspots;
        Object object4 = this.showTimer;
        List list = this.subComponents;
        Long l2 = this.timerEndTime;
        Double d5 = this.width;
        String string2 = this.bannerType;
        List list2 = this.products;
        DynamicPageMetadata dynamicPageMetadata = this.dynamicPageMetadata;
        String string3 = this.uuid;
        String string4 = this.timerType;
        String string5 = this.timerLabel;
        String string6 = this.thumbnailImage;
        VideoSetting videoSetting = this.videoSettings;
        AudioSettings audioSettings = this.audioSettings;
        CTASettings cTASettings = this.ctaSettings;
        Long l3 = this.duration;
        String string7 = this.mediaType;
        String string8 = this.extendedUrl;
        Boolean bl2 = this.enableAdsOnPlp;
        String string9 = this.widgetLevel;
        String string10 = this.feedLogic;
        Integer n3 = this.noOfProducts;
        Boolean bl3 = this.isAdBanner;
        String string11 = this.adSpotId;
        String string12 = this.altText;
        Boolean bl4 = this.showDefault;
        object = new StringBuilder("Banner(bannerUrl=");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(", height=");
        ((StringBuilder)object).append(d2);
        ((StringBuilder)object).append(", hotspots=");
        ((StringBuilder)object).append(object3);
        ((StringBuilder)object).append(", showTimer=");
        ((StringBuilder)object).append(object4);
        ((StringBuilder)object).append(", subComponents=");
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(", timerEndTime=");
        ((StringBuilder)object).append(l2);
        ((StringBuilder)object).append(", width=");
        ((StringBuilder)object).append(d5);
        ((StringBuilder)object).append(", bannerType=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", products=");
        ((StringBuilder)object).append(list2);
        ((StringBuilder)object).append(", dynamicPageMetadata=");
        ((StringBuilder)object).append(dynamicPageMetadata);
        ((StringBuilder)object).append(", uuid=");
        X50.a((StringBuilder)object, string3, ", timerType=", string4, ", timerLabel=");
        X50.a((StringBuilder)object, string5, ", thumbnailImage=", string6, ", videoSettings=");
        object2 = videoSetting;
        ((StringBuilder)object).append(videoSetting);
        ((StringBuilder)object).append(", audioSettings=");
        object2 = audioSettings;
        ((StringBuilder)object).append(audioSettings);
        ((StringBuilder)object).append(", ctaSettings=");
        object2 = cTASettings;
        ((StringBuilder)object).append(cTASettings);
        ((StringBuilder)object).append(", duration=");
        object2 = l3;
        ((StringBuilder)object).append(l3);
        ((StringBuilder)object).append(", mediaType=");
        object3 = string7;
        object4 = string8;
        X50.a((StringBuilder)object, string7, ", extendedUrl=", string8, ", enableAdsOnPlp=");
        object3 = bl2;
        object4 = string9;
        xi0_2.a(bl2, ", widgetLevel=", string9, ", feedLogic=", (StringBuilder)object);
        object2 = string10;
        ((StringBuilder)object).append(string10);
        ((StringBuilder)object).append(", noOfProducts=");
        object2 = n3;
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(", isAdBanner=");
        object3 = bl3;
        object4 = string11;
        xi0_2.a(bl3, ", adSpotId=", string11, ", altText=", (StringBuilder)object);
        object2 = string12;
        ((StringBuilder)object).append(string12);
        ((StringBuilder)object).append(", showDefault=");
        object2 = bl4;
        ((StringBuilder)object).append(bl4);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

