/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import com.ril.ajio.services.data.fleek.explore_brands.Cta;
import com.ril.ajio.services.data.fleek.explore_brands.MetaData;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.Metadata;
import com.ril.ajio.services.data.fleek.feedModel.PriceRevealMetaInfo;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Style;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent$getTabsBrandsLayoutMapping$$inlined$compareBy$1;
import java.lang.constant.Constable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Subcomponent {
    private Cta cta;
    private String description;
    private String heading;
    private List hotspots;
    private String id;
    private long idUnique;
    private boolean isGaFiredInCurrentSession;
    private boolean isLiked;
    private Boolean isPinned;
    private Boolean isSeen;
    private Integer isSeenCounter;
    private Integer likesCount;
    private Media media;
    private MetaData metaData;
    private Metadata metadata;
    private List overlay;
    private String postContentType;
    private List postMedia;
    private String postType;
    private PriceRevealMetaInfo priceRevealMetaInfo;
    private ArrayList productResources;
    private ResourceOwner resourceOwner;
    private ResourceOwner resourceOwnerMock;
    private String resourceTitle;
    private List resources;
    private Style style;
    private String subHeading;
    private String subTitle;
    private String template;
    private String tenant;
    private List texts;
    private String type;
    private String uuid;

    public Subcomponent() {
        this(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, false, null, -1, 1, null);
    }

    public Subcomponent(Cta cta, Integer n3, String string2, String string3, List list, boolean bl2, Boolean bl3, Boolean bl4, Integer n4, List list2, Media media, Metadata metadata, List list3, String string4, PriceRevealMetaInfo priceRevealMetaInfo, ResourceOwner resourceOwner, ResourceOwner resourceOwner2, String string5, List list4, ArrayList arrayList, Style style2, String string6, String string7, String string8, String string9, List list5, String string10, String string11, long l2, MetaData metaData, String string12, boolean bl5, String string13) {
        Intrinsics.checkNotNullParameter(string12, "uuid");
        this.cta = cta;
        this.isSeenCounter = n3;
        this.description = string2;
        this.heading = string3;
        this.hotspots = list;
        this.isLiked = bl2;
        this.isPinned = bl3;
        this.isSeen = bl4;
        this.likesCount = n4;
        this.postMedia = list2;
        this.media = media;
        this.metadata = metadata;
        this.overlay = list3;
        this.postType = string4;
        this.priceRevealMetaInfo = priceRevealMetaInfo;
        this.resourceOwner = resourceOwner;
        this.resourceOwnerMock = resourceOwner2;
        this.resourceTitle = string5;
        this.resources = list4;
        this.productResources = arrayList;
        this.style = style2;
        this.subHeading = string6;
        this.subTitle = string7;
        this.template = string8;
        this.tenant = string9;
        this.texts = list5;
        this.type = string10;
        this.id = string11;
        this.idUnique = l2;
        this.metaData = metaData;
        this.uuid = string12;
        this.isGaFiredInCurrentSession = bl5;
        this.postContentType = string13;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ Subcomponent(Cta object, Integer object2, String object3, String string2, List object4, boolean bl2, Boolean bl3, Boolean bl4, Integer constable, List object5, Media object6, Metadata object7, List object8, String object9, PriceRevealMetaInfo object10, ResourceOwner object11, ResourceOwner resourceOwner, String object12, List object13, ArrayList list, Style object14, String object15, String string3, String string4, String string5, List object16, String object17, String string6, long l2, MetaData metaData, String object18, boolean bl5, String string7, int n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        void var51_53;
        String string8;
        MetaData metaData2;
        long l3;
        String string9;
        Object object19;
        Object object20;
        String string10;
        String string11;
        String string12;
        List list2;
        List list3;
        List list4;
        Object object21;
        Object object22;
        ResourceOwner resourceOwner2;
        Object object23;
        Object object24;
        Object object25;
        Object object26;
        Object object27;
        Object object28;
        Constable constable2;
        Boolean bl6;
        Object list6;
        String string17;
        Object string18;
        Object cta;
        int n8 = n3;
        int n10 = n3 & 1;
        if (n10 != 0) {
            n10 = 0;
            cta = null;
        } else {
            cta = object;
        }
        int n14 = n8 & 2;
        int n15 = 0;
        Object priceRevealMetaInfo = null;
        Object object192 = n14 != 0 ? Integer.valueOf(0) : object2;
        int n16 = n8 & 4;
        if (n16 != 0) {
            n16 = 0;
            string18 = null;
        } else {
            string18 = object3;
        }
        int n17 = n8 & 8;
        if (n17 != 0) {
            n17 = 0;
            string17 = null;
        } else {
            string17 = string2;
        }
        int n18 = n8 & 0x10;
        if (n18 != 0) {
            n18 = 0;
            list6 = null;
        } else {
            list6 = object4;
        }
        int bl7 = n8 & 0x20;
        if (bl7 != 0) {
            boolean bl8 = false;
        } else {
            boolean bl9 = bl2;
        }
        int n7 = n8 & 0x40;
        Boolean bl10 = n7 != 0 ? Boolean.FALSE : bl3;
        int n19 = n8 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            bl6 = null;
        } else {
            bl6 = bl4;
        }
        int n20 = n8 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            constable2 = null;
        } else {
            constable2 = constable;
        }
        int n21 = n8 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            object28 = null;
        } else {
            object28 = object5;
        }
        int n22 = n8 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            object27 = null;
        } else {
            object27 = object6;
        }
        int n24 = n8 & 0x800;
        if (n24 != 0) {
            n24 = 0;
            object26 = null;
        } else {
            object26 = object7;
        }
        int n25 = n8 & 0x1000;
        if (n25 != 0) {
            n25 = 0;
            object25 = null;
        } else {
            object25 = object8;
        }
        int n26 = n8 & 0x2000;
        if (n26 != 0) {
            n26 = 0;
            object24 = null;
        } else {
            object24 = object9;
        }
        n15 = n8 & 0x4000;
        if (n15 != 0) {
            n15 = 0;
            priceRevealMetaInfo = null;
        } else {
            priceRevealMetaInfo = object10;
        }
        int n27 = n8 & 0x8000;
        if (n27 != 0) {
            n27 = 0;
            object23 = null;
        } else {
            object23 = object11;
        }
        int n28 = n8 & 0x10000;
        if (n28 != 0) {
            n28 = 0;
            resourceOwner2 = null;
        } else {
            resourceOwner2 = resourceOwner;
        }
        int n29 = n8 & 0x20000;
        if (n29 != 0) {
            n29 = 0;
            object22 = null;
        } else {
            object22 = object12;
        }
        int n30 = n8 & 0x40000;
        if (n30 != 0) {
            n30 = 0;
            object21 = null;
        } else {
            object21 = object13;
        }
        int n32 = n8 & 0x80000;
        if (n32 != 0) {
            n32 = 0;
            list4 = null;
        } else {
            list4 = list;
        }
        int n34 = n8 & 0x100000;
        if (n34 != 0) {
            n34 = 0;
            list3 = null;
        } else {
            list3 = object14;
        }
        int n35 = n8 & 0x200000;
        if (n35 != 0) {
            n35 = 0;
            list2 = null;
        } else {
            list2 = object15;
        }
        int n36 = n8 & 0x400000;
        if (n36 != 0) {
            n36 = 0;
            string12 = null;
        } else {
            string12 = string3;
        }
        int n37 = n8 & 0x800000;
        if (n37 != 0) {
            n37 = 0;
            string11 = null;
        } else {
            string11 = string4;
        }
        int n38 = n8 & 0x1000000;
        if (n38 != 0) {
            n38 = 0;
            string10 = null;
        } else {
            string10 = string5;
        }
        int n39 = n8 & 0x2000000;
        if (n39 != 0) {
            n39 = 0;
            object20 = null;
        } else {
            object20 = object16;
        }
        int n41 = n8 & 0x4000000;
        if (n41 != 0) {
            n41 = 0;
            object19 = null;
        } else {
            object19 = object17;
        }
        int n42 = n8 & 0x8000000;
        if (n42 != 0) {
            n42 = 0;
            string9 = null;
        } else {
            string9 = string6;
        }
        int n43 = n8 & 0x10000000;
        if (n43 != 0) {
            SecureRandom secureRandom = new SecureRandom();
            l3 = secureRandom.nextLong();
        } else {
            l3 = l2;
        }
        int n44 = n8 & 0x20000000;
        if (n44 != 0) {
            n44 = 0;
            metaData2 = null;
        } else {
            metaData2 = metaData;
        }
        int n45 = n8 & 0x40000000;
        Object object29 = n45 != 0 ? UUID.randomUUID().toString() : object18;
        int n46 = -1 << -1;
        n8 = (n8 &= n46) != 0 ? 0 : (int)(bl5 ? 1 : 0);
        n46 = n4 & 1;
        if (n46 != 0) {
            n46 = 0;
            string8 = null;
        } else {
            string8 = string7;
        }
        object = this;
        object2 = cta;
        object3 = object192;
        string2 = string18;
        object4 = string17;
        bl4 = bl10;
        constable = bl6;
        object5 = constable2;
        object6 = object28;
        object7 = object27;
        object8 = object26;
        object9 = object25;
        object10 = object24;
        object11 = priceRevealMetaInfo;
        resourceOwner = object23;
        object12 = resourceOwner2;
        object13 = object22;
        list = object21;
        object14 = list4;
        object15 = list3;
        string3 = list2;
        string4 = string12;
        string5 = string11;
        object16 = string10;
        object17 = object20;
        string6 = object19;
        object18 = metaData2;
        this((Cta)cta, (Integer)object192, (String)string18, string17, (List)list6, (boolean)var51_53, bl10, bl6, (Integer)constable2, (List)object28, (Media)object27, (Metadata)object26, (List)object25, (String)object24, (PriceRevealMetaInfo)priceRevealMetaInfo, (ResourceOwner)object23, resourceOwner2, (String)object22, (List)object21, (ArrayList)list4, (Style)((Object)list3), (String)((Object)list2), string12, string11, string10, (List)object20, (String)object19, string9, l3, metaData2, (String)object29, n8 != 0, string8);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ Subcomponent copy$default(Subcomponent subcomponent, Cta cta, Integer n3, String string2, String string3, List list, boolean bl2, Boolean bl3, Boolean bl4, Integer n4, List list2, Media media, Metadata metadata, List list3, String string4, PriceRevealMetaInfo object, ResourceOwner object2, ResourceOwner object3, String object4, List object5, ArrayList object6, Style object7, String object8, String object9, String object10, String object11, List object12, String object13, String object14, long l2, MetaData object15, String object16, boolean bl5, String string5, int n7, int n8, Object object17) {
        void var50_53;
        String string6;
        void var36_36;
        void var35_35;
        Subcomponent subcomponent2 = subcomponent;
        int bl6 = var35_35;
        int n10 = var35_35 & 1;
        Cta cta2 = n10 != 0 ? subcomponent.cta : cta;
        int n14 = bl6 & 2;
        Integer n15 = n14 != 0 ? subcomponent2.isSeenCounter : n3;
        int n16 = bl6 & 4;
        String string7 = n16 != 0 ? subcomponent2.description : string2;
        int n17 = bl6 & 8;
        String string8 = n17 != 0 ? subcomponent2.heading : string3;
        int n18 = bl6 & 0x10;
        List list4 = n18 != 0 ? subcomponent2.hotspots : list;
        int n19 = bl6 & 0x20;
        if (n19 != 0) {
            boolean bl7 = subcomponent2.isLiked;
        } else {
            boolean bl8 = bl2;
        }
        int n20 = bl6 & 0x40;
        Boolean bl9 = n20 != 0 ? subcomponent2.isPinned : bl3;
        int n21 = bl6 & 0x80;
        Boolean bl10 = n21 != 0 ? subcomponent2.isSeen : bl4;
        int n22 = bl6 & 0x100;
        Integer n24 = n22 != 0 ? subcomponent2.likesCount : n4;
        int n25 = bl6 & 0x200;
        List list5 = n25 != 0 ? subcomponent2.postMedia : list2;
        int n26 = bl6 & 0x400;
        Media media2 = n26 != 0 ? subcomponent2.media : media;
        int n27 = bl6 & 0x800;
        Metadata metadata2 = n27 != 0 ? subcomponent2.metadata : metadata;
        int n28 = bl6 & 0x1000;
        Object object18 = n28 != 0 ? subcomponent2.overlay : list3;
        int n29 = bl6 & 0x2000;
        Object object19 = n29 != 0 ? subcomponent2.postType : string4;
        string4 = object19;
        n29 = bl6 & 0x4000;
        object19 = n29 != 0 ? subcomponent2.priceRevealMetaInfo : object;
        int n30 = bl6 & 0x8000;
        object = object19;
        object19 = n30 != 0 ? subcomponent2.resourceOwner : object2;
        n30 = bl6 & 0x10000;
        object2 = object19;
        object19 = n30 != 0 ? subcomponent2.resourceOwnerMock : object3;
        n30 = bl6 & 0x20000;
        object3 = object19;
        object19 = n30 != 0 ? subcomponent2.resourceTitle : object4;
        n30 = bl6 & 0x40000;
        object4 = object19;
        object19 = n30 != 0 ? subcomponent2.resources : object5;
        n30 = bl6 & 0x80000;
        object5 = object19;
        object19 = n30 != 0 ? subcomponent2.productResources : object6;
        n30 = bl6 & 0x100000;
        object6 = object19;
        object19 = n30 != 0 ? subcomponent2.style : object7;
        n30 = bl6 & 0x200000;
        object7 = object19;
        object19 = n30 != 0 ? subcomponent2.subHeading : object8;
        n30 = bl6 & 0x400000;
        object8 = object19;
        object19 = n30 != 0 ? subcomponent2.subTitle : object9;
        n30 = bl6 & 0x800000;
        object9 = object19;
        object19 = n30 != 0 ? subcomponent2.template : object10;
        n30 = bl6 & 0x1000000;
        object10 = object19;
        object19 = n30 != 0 ? subcomponent2.tenant : object11;
        n30 = bl6 & 0x2000000;
        object11 = object19;
        object19 = n30 != 0 ? subcomponent2.texts : object12;
        n30 = bl6 & 0x4000000;
        object12 = object19;
        object19 = n30 != 0 ? subcomponent2.type : object13;
        n30 = bl6 & 0x8000000;
        object13 = object19;
        object19 = n30 != 0 ? subcomponent2.id : object14;
        n30 = bl6 & 0x10000000;
        list3 = object18;
        object14 = object19;
        long l3 = n30 != 0 ? subcomponent2.idUnique : l2;
        n30 = bl6 & 0x20000000;
        l2 = l3;
        object18 = n30 != 0 ? subcomponent2.metaData : object15;
        n29 = 0x40000000 & bl6;
        object19 = n29 != 0 ? subcomponent2.uuid : object16;
        n30 = -1 << -1;
        bl6 = (bl6 &= n30) ? (int)subcomponent2.isGaFiredInCurrentSession : (int)bl5;
        n30 = var36_36 & 1;
        int bl11 = bl6;
        String string9 = n30 != 0 ? subcomponent2.postContentType : string6;
        cta = cta2;
        n3 = n15;
        string2 = string7;
        string3 = string8;
        list = list4;
        bl2 = var50_53;
        bl3 = bl9;
        bl4 = bl10;
        n4 = n24;
        list2 = list5;
        media = media2;
        metadata = metadata2;
        object15 = object18;
        object16 = object19;
        string6 = string9;
        return subcomponent.copy(cta2, n15, string7, string8, list4, (boolean)var50_53, bl9, bl10, n24, list5, media2, metadata2, list3, string4, (PriceRevealMetaInfo)object, (ResourceOwner)object2, (ResourceOwner)object3, (String)object4, (List)object5, (ArrayList)object6, (Style)object7, (String)object8, (String)object9, (String)object10, (String)object11, (List)object12, (String)object13, (String)object14, l2, (MetaData)object18, (String)object19, (boolean)bl11, string9);
    }

    public final Cta component1() {
        return this.cta;
    }

    public final List component10() {
        return this.postMedia;
    }

    public final Media component11() {
        return this.media;
    }

    public final Metadata component12() {
        return this.metadata;
    }

    public final List component13() {
        return this.overlay;
    }

    public final String component14() {
        return this.postType;
    }

    public final PriceRevealMetaInfo component15() {
        return this.priceRevealMetaInfo;
    }

    public final ResourceOwner component16() {
        return this.resourceOwner;
    }

    public final ResourceOwner component17() {
        return this.resourceOwnerMock;
    }

    public final String component18() {
        return this.resourceTitle;
    }

    public final List component19() {
        return this.resources;
    }

    public final Integer component2() {
        return this.isSeenCounter;
    }

    public final ArrayList component20() {
        return this.productResources;
    }

    public final Style component21() {
        return this.style;
    }

    public final String component22() {
        return this.subHeading;
    }

    public final String component23() {
        return this.subTitle;
    }

    public final String component24() {
        return this.template;
    }

    public final String component25() {
        return this.tenant;
    }

    public final List component26() {
        return this.texts;
    }

    public final String component27() {
        return this.type;
    }

    public final String component28() {
        return this.id;
    }

    public final long component29() {
        return this.idUnique;
    }

    public final String component3() {
        return this.description;
    }

    public final MetaData component30() {
        return this.metaData;
    }

    public final String component31() {
        return this.uuid;
    }

    public final boolean component32() {
        return this.isGaFiredInCurrentSession;
    }

    public final String component33() {
        return this.postContentType;
    }

    public final String component4() {
        return this.heading;
    }

    public final List component5() {
        return this.hotspots;
    }

    public final boolean component6() {
        return this.isLiked;
    }

    public final Boolean component7() {
        return this.isPinned;
    }

    public final Boolean component8() {
        return this.isSeen;
    }

    public final Integer component9() {
        return this.likesCount;
    }

    public final Subcomponent copy(Cta cta, Integer n3, String string2, String string3, List list, boolean bl2, Boolean bl3, Boolean bl4, Integer n4, List list2, Media media, Metadata metadata, List list3, String string4, PriceRevealMetaInfo priceRevealMetaInfo, ResourceOwner resourceOwner, ResourceOwner resourceOwner2, String string5, List list4, ArrayList arrayList, Style style2, String string6, String string7, String string8, String string9, List list5, String string10, String string11, long l2, MetaData metaData, String string12, boolean bl5, String string13) {
        Intrinsics.checkNotNullParameter(string12, "uuid");
        Subcomponent subcomponent = new Subcomponent(cta, n3, string2, string3, list, bl2, bl3, bl4, n4, list2, media, metadata, list3, string4, priceRevealMetaInfo, resourceOwner, resourceOwner2, string5, list4, arrayList, style2, string6, string7, string8, string9, list5, string10, string11, l2, metaData, string12, bl5, string13);
        return subcomponent;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof Subcomponent;
        if (!object2) {
            return false;
        }
        object = (Subcomponent)object;
        Object object3 = this.cta;
        Object object4 = ((Subcomponent)object).cta;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.isSeenCounter;
        object4 = ((Subcomponent)object).isSeenCounter;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.description;
        object4 = ((Subcomponent)object).description;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.heading;
        object4 = ((Subcomponent)object).heading;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.hotspots;
        object4 = ((Subcomponent)object).hotspots;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object2 = this.isLiked;
        boolean bl3 = ((Subcomponent)object).isLiked;
        if (object2 != bl3) {
            return false;
        }
        object3 = this.isPinned;
        object4 = ((Subcomponent)object).isPinned;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.isSeen;
        object4 = ((Subcomponent)object).isSeen;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.likesCount;
        object4 = ((Subcomponent)object).likesCount;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.postMedia;
        object4 = ((Subcomponent)object).postMedia;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.media;
        object4 = ((Subcomponent)object).media;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.metadata;
        object4 = ((Subcomponent)object).metadata;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.overlay;
        object4 = ((Subcomponent)object).overlay;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.postType;
        object4 = ((Subcomponent)object).postType;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.priceRevealMetaInfo;
        object4 = ((Subcomponent)object).priceRevealMetaInfo;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.resourceOwner;
        object4 = ((Subcomponent)object).resourceOwner;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.resourceOwnerMock;
        object4 = ((Subcomponent)object).resourceOwnerMock;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.resourceTitle;
        object4 = ((Subcomponent)object).resourceTitle;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.resources;
        object4 = ((Subcomponent)object).resources;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.productResources;
        object4 = ((Subcomponent)object).productResources;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.style;
        object4 = ((Subcomponent)object).style;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.subHeading;
        object4 = ((Subcomponent)object).subHeading;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.subTitle;
        object4 = ((Subcomponent)object).subTitle;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.template;
        object4 = ((Subcomponent)object).template;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.tenant;
        object4 = ((Subcomponent)object).tenant;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.texts;
        object4 = ((Subcomponent)object).texts;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.type;
        object4 = ((Subcomponent)object).type;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.id;
        object4 = ((Subcomponent)object).id;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        long l2 = this.idUnique;
        long l3 = ((Subcomponent)object).idUnique;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        object3 = this.metaData;
        object4 = ((Subcomponent)object).metaData;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.uuid;
        object4 = ((Subcomponent)object).uuid;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object2 = this.isGaFiredInCurrentSession;
        bl3 = ((Subcomponent)object).isGaFiredInCurrentSession;
        if (object2 != bl3) {
            return false;
        }
        object3 = this.postContentType;
        object = ((Subcomponent)object).postContentType;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHeading() {
        return this.heading;
    }

    public final List getHotspots() {
        return this.hotspots;
    }

    public final String getId() {
        return this.id;
    }

    public final long getIdUnique() {
        return this.idUnique;
    }

    public final Integer getLikesCount() {
        return this.likesCount;
    }

    public final Media getMedia() {
        return this.media;
    }

    public final MetaData getMetaData() {
        return this.metaData;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final List getOverlay() {
        return this.overlay;
    }

    public final String getPostContentType() {
        return this.postContentType;
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

    public final ArrayList getProductResources() {
        return this.productResources;
    }

    public final ResourceOwner getResourceOwner() {
        return this.resourceOwner;
    }

    public final ResourceOwner getResourceOwnerMock() {
        return this.resourceOwnerMock;
    }

    public final String getResourceTitle() {
        return this.resourceTitle;
    }

    public final List getResources() {
        return this.resources;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final String getSubHeading() {
        return this.subHeading;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final SortedMap getTabsBrandsLayoutMapping(int n3) {
        Object object;
        int n4;
        Object object2 = new p83_0();
        Object object3 = this.resources;
        if (object3 != null) {
            object3 = ((Iterable)object3).iterator();
            while ((n4 = object3.hasNext()) != 0) {
                object = (Resource)object3.next();
                if (object == null || (object = ((Resource)object).getResourceOwner()) == null) continue;
                ((p83_0)object2).add(object);
            }
        }
        object3 = new Object();
        n4 = ((p83_0)object2).size();
        int n7 = n4 / n3;
        if ((n4 %= n3) != 0) {
            ++n7;
        }
        n4 = 0;
        object = null;
        for (int i3 = 0; i3 < n7; ++i3) {
            p83_0 p83_02 = new p83_0();
            int n8 = ((p83_0)object2).size();
            if (n8 > n3) {
                n8 = n3;
            }
            Integer n10 = null;
            for (int i8 = 0; i8 < n8; ++i8) {
                Object object4 = ((p83_0)object2).get(i8);
                p83_02.add(object4);
            }
            n10 = i3;
            ((HashMap)object3).put(n10, p83_02);
            object2 = CollectionsKt.G(object2, n8);
            p83_02 = new p83_0();
            object2 = (Collection)object2;
            p83_02.addAll((Collection)object2);
            object2 = p83_02;
        }
        Subcomponent$getTabsBrandsLayoutMapping$$inlined$compareBy$1 subcomponent$getTabsBrandsLayoutMapping$$inlined$compareBy$1 = new Subcomponent$getTabsBrandsLayoutMapping$$inlined$compareBy$1();
        Intrinsics.checkNotNullParameter(object3, "<this>");
        Intrinsics.checkNotNullParameter(subcomponent$getTabsBrandsLayoutMapping$$inlined$compareBy$1, "comparator");
        object2 = new TreeMap(subcomponent$getTabsBrandsLayoutMapping$$inlined$compareBy$1);
        ((TreeMap)object2).putAll(object3);
        return object2;
    }

    public final String getTemplate() {
        return this.template;
    }

    public final String getTenant() {
        return this.tenant;
    }

    public final List getTexts() {
        return this.texts;
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
        Cta cta = this.cta;
        int n7 = 0;
        if (cta == null) {
            n4 = 0;
            cta = null;
        } else {
            n4 = cta.hashCode();
        }
        int n8 = 31;
        n4 *= 31;
        Object object = this.isSeenCounter;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.heading;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        n3 = (int)(this.isLiked ? 1 : 0);
        int n10 = 1237;
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.isPinned;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.media;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Media)object).hashCode();
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
        object = this.overlay;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.resourceOwner;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ResourceOwner)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.resourceOwnerMock;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ResourceOwner)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.resourceTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.resources;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productResources;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
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
        object = this.texts;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.id;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        long l2 = this.idUnique;
        long l3 = l2 >>> 32;
        n3 = (int)(l2 ^= l3);
        n4 = (n4 + n3) * 31;
        object = this.metaData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((MetaData)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.uuid;
        n4 = zy_2.b(n4, n8, (String)object);
        n3 = (int)(this.isGaFiredInCurrentSession ? 1 : 0);
        if (n3 != 0) {
            n10 = 1231;
        }
        n4 = (n4 + n10) * 31;
        String string2 = this.postContentType;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n4 + n7;
    }

    public final boolean isGaFiredInCurrentSession() {
        return this.isGaFiredInCurrentSession;
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    public final Boolean isPinned() {
        return this.isPinned;
    }

    public final Boolean isSeen() {
        return this.isSeen;
    }

    public final Integer isSeenCounter() {
        return this.isSeenCounter;
    }

    public final void setCta(Cta cta) {
        this.cta = cta;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setGaFiredInCurrentSession(boolean bl2) {
        this.isGaFiredInCurrentSession = bl2;
    }

    public final void setHeading(String string2) {
        this.heading = string2;
    }

    public final void setHotspots(List list) {
        this.hotspots = list;
    }

    public final void setId(String string2) {
        this.id = string2;
    }

    public final void setIdUnique(long l2) {
        this.idUnique = l2;
    }

    public final void setLiked(boolean bl2) {
        this.isLiked = bl2;
    }

    public final void setLikesCount(Integer n3) {
        this.likesCount = n3;
    }

    public final void setMedia(Media media) {
        this.media = media;
    }

    public final void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public final void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public final void setOverlay(List list) {
        this.overlay = list;
    }

    public final void setPinned(Boolean bl2) {
        this.isPinned = bl2;
    }

    public final void setPostContentType(String string2) {
        this.postContentType = string2;
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

    public final void setProductResources(ArrayList arrayList) {
        this.productResources = arrayList;
    }

    public final void setResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    public final void setResourceOwnerMock(ResourceOwner resourceOwner) {
        this.resourceOwnerMock = resourceOwner;
    }

    public final void setResourceTitle(String string2) {
        this.resourceTitle = string2;
    }

    public final void setResources(List list) {
        this.resources = list;
    }

    public final void setSeen(Boolean bl2) {
        this.isSeen = bl2;
    }

    public final void setSeenCounter(Integer n3) {
        this.isSeenCounter = n3;
    }

    public final void setStyle(Style style2) {
        this.style = style2;
    }

    public final void setSubHeading(String string2) {
        this.subHeading = string2;
    }

    public final void setSubTitle(String string2) {
        this.subTitle = string2;
    }

    public final void setTemplate(String string2) {
        this.template = string2;
    }

    public final void setTenant(String string2) {
        this.tenant = string2;
    }

    public final void setTexts(List list) {
        this.texts = list;
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
        Object object2 = this.cta;
        Integer n3 = this.isSeenCounter;
        String string2 = this.description;
        String string3 = this.heading;
        List list = this.hotspots;
        boolean bl2 = this.isLiked;
        Boolean bl3 = this.isPinned;
        Boolean bl4 = this.isSeen;
        Integer n4 = this.likesCount;
        List list2 = this.postMedia;
        Media media = this.media;
        Metadata metadata = this.metadata;
        List list3 = this.overlay;
        Object object3 = this.postType;
        PriceRevealMetaInfo priceRevealMetaInfo = this.priceRevealMetaInfo;
        ResourceOwner resourceOwner = this.resourceOwner;
        ResourceOwner resourceOwner2 = this.resourceOwnerMock;
        String string4 = this.resourceTitle;
        List list4 = this.resources;
        ArrayList arrayList = this.productResources;
        Style style2 = this.style;
        String string5 = this.subHeading;
        String string6 = this.subTitle;
        String string7 = this.template;
        String string8 = this.tenant;
        List list5 = this.texts;
        String string9 = this.type;
        String string10 = this.id;
        String string11 = object3;
        String string12 = string10;
        long l2 = this.idUnique;
        object3 = this.metaData;
        String string13 = this.uuid;
        boolean bl5 = this.isGaFiredInCurrentSession;
        string10 = this.postContentType;
        object = new StringBuilder("Subcomponent(cta=");
        ((StringBuilder)object).append(object2);
        ((StringBuilder)object).append(", isSeenCounter=");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(", description=");
        X50.a((StringBuilder)object, string2, ", heading=", string3, ", hotspots=");
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(", isLiked=");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(", isPinned=");
        ((StringBuilder)object).append(bl3);
        ((StringBuilder)object).append(", isSeen=");
        ((StringBuilder)object).append(bl4);
        ((StringBuilder)object).append(", likesCount=");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(", postMedia=");
        ((StringBuilder)object).append(list2);
        ((StringBuilder)object).append(", media=");
        ((StringBuilder)object).append(media);
        ((StringBuilder)object).append(", metadata=");
        ((StringBuilder)object).append(metadata);
        ((StringBuilder)object).append(", overlay=");
        ((StringBuilder)object).append(list3);
        ((StringBuilder)object).append(", postType=");
        object2 = string11;
        ((StringBuilder)object).append(string11);
        ((StringBuilder)object).append(", priceRevealMetaInfo=");
        object2 = priceRevealMetaInfo;
        ((StringBuilder)object).append(priceRevealMetaInfo);
        ((StringBuilder)object).append(", resourceOwner=");
        object2 = resourceOwner;
        ((StringBuilder)object).append(resourceOwner);
        ((StringBuilder)object).append(", resourceOwnerMock=");
        object2 = resourceOwner2;
        ((StringBuilder)object).append(resourceOwner2);
        ((StringBuilder)object).append(", resourceTitle=");
        object2 = string4;
        ((StringBuilder)object).append(string4);
        ((StringBuilder)object).append(", resources=");
        object2 = list4;
        ((StringBuilder)object).append(list4);
        ((StringBuilder)object).append(", productResources=");
        object2 = arrayList;
        ((StringBuilder)object).append(arrayList);
        ((StringBuilder)object).append(", style=");
        object2 = style2;
        ((StringBuilder)object).append(style2);
        ((StringBuilder)object).append(", subHeading=");
        object2 = string5;
        ((StringBuilder)object).append(string5);
        ((StringBuilder)object).append(", subTitle=");
        string2 = string6;
        string3 = string7;
        X50.a((StringBuilder)object, string6, ", template=", string7, ", tenant=");
        object2 = string8;
        ((StringBuilder)object).append(string8);
        ((StringBuilder)object).append(", texts=");
        object2 = list5;
        ((StringBuilder)object).append(list5);
        ((StringBuilder)object).append(", type=");
        string2 = string9;
        string3 = string12;
        X50.a((StringBuilder)object, string9, ", id=", string12, ", idUnique=");
        ((StringBuilder)object).append(l2);
        ((StringBuilder)object).append(", metaData=");
        ((StringBuilder)object).append(object3);
        ((StringBuilder)object).append(", uuid=");
        object2 = string13;
        ((StringBuilder)object).append(string13);
        ((StringBuilder)object).append(", isGaFiredInCurrentSession=");
        ((StringBuilder)object).append(bl5);
        string2 = string10;
        return BW0.b((StringBuilder)object, ", postContentType=", string10, ")");
    }
}

