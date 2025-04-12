/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import com.ril.ajio.services.data.fleek.explore_brands.Cta;
import com.ril.ajio.services.data.fleek.explore_brands.Media;
import com.ril.ajio.services.data.fleek.explore_brands.MetaData;
import com.ril.ajio.services.data.fleek.explore_brands.Resource;
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Style;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent$getTabsBrandsLayoutMapping$$inlined$compareBy$1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Subcomponent {
    private Cta cta;
    private String heading;
    private p83_0 hotspots;
    private boolean isGaFiredInCurrentSession;
    private boolean isProductGaFiredInCurrentSession;
    private Media media;
    private MetaData metadata;
    private p83_0 overlay;
    private ResourceOwner resourceOwner;
    private p83_0 resources;
    private Style style;
    private String subHeading;
    private p83_0 texts;
    private String type;
    private String uuid;

    public Subcomponent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, Short.MAX_VALUE, null);
    }

    public Subcomponent(Cta cta, String string2, p83_0 p83_02, Media media, MetaData metaData, p83_0 p83_03, ResourceOwner resourceOwner, p83_0 p83_04, Style style2, String string3, p83_0 p83_05, String string4, boolean bl2, boolean bl3, String string5) {
        Intrinsics.checkNotNullParameter(string5, "uuid");
        this.cta = cta;
        this.heading = string2;
        this.hotspots = p83_02;
        this.media = media;
        this.metadata = metaData;
        this.overlay = p83_03;
        this.resourceOwner = resourceOwner;
        this.resources = p83_04;
        this.style = style2;
        this.subHeading = string3;
        this.texts = p83_05;
        this.type = string4;
        this.isGaFiredInCurrentSession = bl2;
        this.isProductGaFiredInCurrentSession = bl3;
        this.uuid = string5;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ Subcomponent(Cta object, String object2, p83_0 object3, Media object4, MetaData object5, p83_0 object6, ResourceOwner object7, p83_0 object8, Style object9, String object10, p83_0 object11, String object12, boolean bl2, boolean bl3, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        void var42_46;
        Object p83_02;
        Object string3;
        Object style2;
        Object p83_03;
        Object resourceOwner;
        Object p83_04;
        Object metaData;
        Object media;
        Object p83_05;
        Object string4;
        Object cta;
        int n4 = n3;
        int n7 = n3 & 1;
        Object string5 = null;
        if (n7 != 0) {
            n7 = 0;
            cta = null;
        } else {
            cta = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string4 = null;
        } else {
            string4 = object2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            p83_05 = null;
        } else {
            p83_05 = object3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            media = null;
        } else {
            media = object4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            metaData = null;
        } else {
            metaData = object5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            p83_04 = null;
        } else {
            p83_04 = object6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            resourceOwner = null;
        } else {
            resourceOwner = object7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            p83_03 = null;
        } else {
            p83_03 = object8;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            style2 = null;
        } else {
            style2 = object9;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string3 = null;
        } else {
            string3 = object10;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            p83_02 = null;
        } else {
            p83_02 = object11;
        }
        int bl4 = n4 & 0x800;
        if (bl4 == 0) {
            string5 = object12;
        }
        int n22 = n4 & 0x1000;
        boolean bl5 = false;
        if (n22 != 0) {
            boolean bl6 = false;
        } else {
            boolean bl7 = bl2;
        }
        int n24 = n4 & 0x2000;
        if (n24 == 0) {
            bl5 = bl3;
        }
        String string6 = (n4 &= 0x4000) != 0 ? UUID.randomUUID().toString() : string2;
        object = this;
        object2 = cta;
        object3 = string4;
        object4 = p83_05;
        object5 = media;
        object6 = metaData;
        object7 = p83_04;
        object8 = resourceOwner;
        object9 = p83_03;
        object10 = style2;
        object11 = string3;
        object12 = p83_02;
        bl3 = var42_46;
        this((Cta)cta, (String)string4, (p83_0)p83_05, (Media)media, (MetaData)metaData, (p83_0)p83_04, (ResourceOwner)resourceOwner, (p83_0)p83_03, (Style)style2, (String)string3, (p83_0)p83_02, (String)string5, (boolean)var42_46, bl5, string6);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ Subcomponent copy$default(Subcomponent subcomponent, Cta cta, String string2, p83_0 p83_02, Media media, MetaData metaData, p83_0 p83_03, ResourceOwner resourceOwner, p83_0 p83_04, Style style2, String string3, p83_0 p83_05, String string4, boolean bl2, boolean bl3, String string5, int n3, Object object) {
        void var45_51;
        void var44_47;
        Subcomponent subcomponent2 = subcomponent;
        int n4 = n3;
        int n7 = n3 & 1;
        Cta cta2 = n7 != 0 ? subcomponent.cta : cta;
        int n8 = n4 & 2;
        String string6 = n8 != 0 ? subcomponent2.heading : string2;
        int n10 = n4 & 4;
        p83_0 p83_06 = n10 != 0 ? subcomponent2.hotspots : p83_02;
        int n14 = n4 & 8;
        Media media2 = n14 != 0 ? subcomponent2.media : media;
        int n15 = n4 & 0x10;
        MetaData metaData2 = n15 != 0 ? subcomponent2.metadata : metaData;
        int n16 = n4 & 0x20;
        p83_0 p83_07 = n16 != 0 ? subcomponent2.overlay : p83_03;
        int n17 = n4 & 0x40;
        ResourceOwner resourceOwner2 = n17 != 0 ? subcomponent2.resourceOwner : resourceOwner;
        int n18 = n4 & 0x80;
        p83_0 p83_08 = n18 != 0 ? subcomponent2.resources : p83_04;
        int n19 = n4 & 0x100;
        Style style3 = n19 != 0 ? subcomponent2.style : style2;
        int n20 = n4 & 0x200;
        String string7 = n20 != 0 ? subcomponent2.subHeading : string3;
        int n21 = n4 & 0x400;
        p83_0 p83_09 = n21 != 0 ? subcomponent2.texts : p83_05;
        int n22 = n4 & 0x800;
        String string8 = n22 != 0 ? subcomponent2.type : string4;
        int bl4 = n4 & 0x1000;
        if (bl4 != 0) {
            boolean bl5 = subcomponent2.isGaFiredInCurrentSession;
        } else {
            boolean bl6 = bl2;
        }
        int n24 = n4 & 0x2000;
        if (n24 != 0) {
            boolean bl7 = subcomponent2.isProductGaFiredInCurrentSession;
        } else {
            boolean bl8 = bl3;
        }
        String string9 = (n4 &= 0x4000) != 0 ? subcomponent2.uuid : string5;
        cta = cta2;
        string2 = string6;
        p83_02 = p83_06;
        media = media2;
        metaData = metaData2;
        p83_03 = p83_07;
        resourceOwner = resourceOwner2;
        p83_04 = p83_08;
        style2 = style3;
        string3 = string7;
        p83_05 = p83_09;
        string4 = string8;
        bl2 = var44_47;
        bl3 = var45_51;
        string5 = string9;
        return subcomponent.copy(cta2, string6, p83_06, media2, metaData2, p83_07, resourceOwner2, p83_08, style3, string7, p83_09, string8, (boolean)var44_47, (boolean)var45_51, string9);
    }

    public final Cta component1() {
        return this.cta;
    }

    public final String component10() {
        return this.subHeading;
    }

    public final p83_0 component11() {
        return this.texts;
    }

    public final String component12() {
        return this.type;
    }

    public final boolean component13() {
        return this.isGaFiredInCurrentSession;
    }

    public final boolean component14() {
        return this.isProductGaFiredInCurrentSession;
    }

    public final String component15() {
        return this.uuid;
    }

    public final String component2() {
        return this.heading;
    }

    public final p83_0 component3() {
        return this.hotspots;
    }

    public final Media component4() {
        return this.media;
    }

    public final MetaData component5() {
        return this.metadata;
    }

    public final p83_0 component6() {
        return this.overlay;
    }

    public final ResourceOwner component7() {
        return this.resourceOwner;
    }

    public final p83_0 component8() {
        return this.resources;
    }

    public final Style component9() {
        return this.style;
    }

    public final Subcomponent copy(Cta cta, String string2, p83_0 p83_02, Media media, MetaData metaData, p83_0 p83_03, ResourceOwner resourceOwner, p83_0 p83_04, Style style2, String string3, p83_0 p83_05, String string4, boolean bl2, boolean bl3, String string5) {
        Intrinsics.checkNotNullParameter(string5, "uuid");
        Subcomponent subcomponent = new Subcomponent(cta, string2, p83_02, media, metaData, p83_03, resourceOwner, p83_04, style2, string3, p83_05, string4, bl2, bl3, string5);
        return subcomponent;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Subcomponent;
        if (!bl3) {
            return false;
        }
        object = (Subcomponent)object;
        Object object2 = this.cta;
        Object object3 = ((Subcomponent)object).cta;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.heading;
        object3 = ((Subcomponent)object).heading;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.hotspots;
        object3 = ((Subcomponent)object).hotspots;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.media;
        object3 = ((Subcomponent)object).media;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.metadata;
        object3 = ((Subcomponent)object).metadata;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.overlay;
        object3 = ((Subcomponent)object).overlay;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.resourceOwner;
        object3 = ((Subcomponent)object).resourceOwner;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.resources;
        object3 = ((Subcomponent)object).resources;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.style;
        object3 = ((Subcomponent)object).style;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subHeading;
        object3 = ((Subcomponent)object).subHeading;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.texts;
        object3 = ((Subcomponent)object).texts;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object3 = ((Subcomponent)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isGaFiredInCurrentSession;
        boolean bl4 = ((Subcomponent)object).isGaFiredInCurrentSession;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.isProductGaFiredInCurrentSession;
        bl4 = ((Subcomponent)object).isProductGaFiredInCurrentSession;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.uuid;
        object = ((Subcomponent)object).uuid;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final String getHeading() {
        return this.heading;
    }

    public final p83_0 getHotspots() {
        return this.hotspots;
    }

    public final Media getMedia() {
        return this.media;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final p83_0 getOverlay() {
        return this.overlay;
    }

    public final ResourceOwner getResourceOwner() {
        return this.resourceOwner;
    }

    public final p83_0 getResources() {
        return this.resources;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final String getSubHeading() {
        return this.subHeading;
    }

    public final SortedMap getTabsBrandsLayoutMapping(int n3) {
        int n4;
        Integer n7;
        int n8;
        int n10;
        ArrayList<Object> arrayList;
        String string2;
        Object object;
        int n14 = n3;
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        Object object2 = this.resources;
        if (object2 != null) {
            object2 = ((p83_0)object2).listIterator();
            while (true) {
                object = object2;
                object = (ob3_2)object2;
                boolean n102 = ((ob3_2)object).hasNext();
                if (!n102) break;
                if ((object = (Resource)((ob3_2)object).next()) == null) continue;
                String string3 = ((Resource)object).getId();
                String string4 = ((Resource)object).getName();
                string2 = ((Resource)object).getLogo();
                arrayList = ((Resource)object).getDescription();
                String string5 = ((Resource)object).getMotto();
                n10 = 0;
                n8 = 0;
                n7 = null;
                int n15 = 4009;
                object = new ResourceOwner(null, (String)((Object)arrayList), string3, null, string2, null, string4, null, null, null, null, null, string5, n15, null);
                arrayList2.add(object);
            }
        }
        object2 = new Object();
        int n16 = arrayList2.size();
        int n17 = n16 / n14;
        if ((n16 %= n14) != 0) {
            n4 = n17 + 1;
        }
        n16 = 0;
        object = null;
        for (n10 = 0; n10 < n4; ++n10) {
            arrayList = new ArrayList<Object>();
            int n18 = arrayList2.size();
            if (n18 > n14) {
                n18 = n14;
            }
            n7 = null;
            for (n8 = 0; n8 < n18; ++n8) {
                string2 = arrayList2.get(n8);
                arrayList.add(string2);
            }
            n7 = n10;
            ((HashMap)object2).put(n7, arrayList);
            arrayList2 = CollectionsKt.G(arrayList2, n18);
            arrayList = new ArrayList<Object>();
            arrayList2 = arrayList2;
            arrayList.addAll(arrayList2);
            arrayList2 = arrayList;
        }
        Subcomponent$getTabsBrandsLayoutMapping$$inlined$compareBy$1 subcomponent$getTabsBrandsLayoutMapping$$inlined$compareBy$1 = new Subcomponent$getTabsBrandsLayoutMapping$$inlined$compareBy$1();
        Intrinsics.checkNotNullParameter(object2, "<this>");
        Intrinsics.checkNotNullParameter(subcomponent$getTabsBrandsLayoutMapping$$inlined$compareBy$1, "comparator");
        arrayList2 = new ArrayList<Object>(subcomponent$getTabsBrandsLayoutMapping$$inlined$compareBy$1);
        ((TreeMap)((Object)arrayList2)).putAll(object2);
        return arrayList2;
    }

    public final p83_0 getTexts() {
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
        n4 *= 31;
        Object object = this.heading;
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
            n3 = ((MetaData)object).hashCode();
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
        object = this.resourceOwner;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ResourceOwner)object).hashCode();
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
        object = this.texts;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.type;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isGaFiredInCurrentSession ? 1 : 0);
        n3 = 1237;
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isProductGaFiredInCurrentSession ? 1 : 0);
        if (n7 != 0) {
            n3 = 1231;
        }
        n4 = (n4 + n3) * 31;
        return this.uuid.hashCode() + n4;
    }

    public final boolean isGaFiredInCurrentSession() {
        return this.isGaFiredInCurrentSession;
    }

    public final boolean isProductGaFiredInCurrentSession() {
        return this.isProductGaFiredInCurrentSession;
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

    public final void setHotspots(p83_0 p83_02) {
        this.hotspots = p83_02;
    }

    public final void setMedia(Media media) {
        this.media = media;
    }

    public final void setMetadata(MetaData metaData) {
        this.metadata = metaData;
    }

    public final void setOverlay(p83_0 p83_02) {
        this.overlay = p83_02;
    }

    public final void setProductGaFiredInCurrentSession(boolean bl2) {
        this.isProductGaFiredInCurrentSession = bl2;
    }

    public final void setResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    public final void setResources(p83_0 p83_02) {
        this.resources = p83_02;
    }

    public final void setStyle(Style style2) {
        this.style = style2;
    }

    public final void setSubHeading(String string2) {
        this.subHeading = string2;
    }

    public final void setTexts(p83_0 p83_02) {
        this.texts = p83_02;
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
        Cta cta = this.cta;
        String string2 = this.heading;
        p83_0 p83_02 = this.hotspots;
        Media media = this.media;
        MetaData metaData = this.metadata;
        p83_0 p83_03 = this.overlay;
        ResourceOwner resourceOwner = this.resourceOwner;
        p83_0 p83_04 = this.resources;
        Style style2 = this.style;
        String string3 = this.subHeading;
        p83_0 p83_05 = this.texts;
        String string4 = this.type;
        boolean bl2 = this.isGaFiredInCurrentSession;
        boolean bl3 = this.isProductGaFiredInCurrentSession;
        String string5 = this.uuid;
        object = new StringBuilder("Subcomponent(cta=");
        ((StringBuilder)object).append(cta);
        ((StringBuilder)object).append(", heading=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", hotspots=");
        ((StringBuilder)object).append(p83_02);
        ((StringBuilder)object).append(", media=");
        ((StringBuilder)object).append(media);
        ((StringBuilder)object).append(", metadata=");
        ((StringBuilder)object).append(metaData);
        ((StringBuilder)object).append(", overlay=");
        ((StringBuilder)object).append(p83_03);
        ((StringBuilder)object).append(", resourceOwner=");
        ((StringBuilder)object).append(resourceOwner);
        ((StringBuilder)object).append(", resources=");
        ((StringBuilder)object).append(p83_04);
        ((StringBuilder)object).append(", style=");
        ((StringBuilder)object).append(style2);
        ((StringBuilder)object).append(", subHeading=");
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(", texts=");
        ((StringBuilder)object).append(p83_05);
        ((StringBuilder)object).append(", type=");
        ((StringBuilder)object).append(string4);
        ((StringBuilder)object).append(", isGaFiredInCurrentSession=");
        I81.a(", isProductGaFiredInCurrentSession=", ", uuid=", (StringBuilder)object, bl2, bl3);
        string2 = string5;
        return h30_0.a((StringBuilder)object, string5, ")");
    }
}

