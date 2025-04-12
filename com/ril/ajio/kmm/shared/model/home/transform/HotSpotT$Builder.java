/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home.transform;

import com.ril.ajio.kmm.shared.model.home.HomeDataUtil;
import com.ril.ajio.kmm.shared.model.home.HotSpotMetaData;
import com.ril.ajio.kmm.shared.model.home.Hotspot;
import com.ril.ajio.kmm.shared.model.home.transform.HotSpotT;
import com.ril.ajio.kmm.shared.model.home.transform.PositionInfo;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import kotlin.jvm.internal.Intrinsics;

public final class HotSpotT$Builder {
    public final HotSpotT build(Hotspot hotspot, ScreenInfo object) {
        Intrinsics.checkNotNullParameter(hotspot, "hotspot");
        Intrinsics.checkNotNullParameter(object, "bannerDimen");
        Object object2 = HomeDataUtil.INSTANCE;
        Object object3 = hotspot.getWidth();
        Object object4 = hotspot.getHeight();
        object3 = ((HomeDataUtil)object2).getChildViewDimens((Double)object3, (Double)object4, (ScreenInfo)object);
        object4 = hotspot.getX();
        Object object5 = hotspot.getY();
        object = ((HomeDataUtil)object2).getViewPos((Double)object4, (Double)object5, (ScreenInfo)object);
        object5 = hotspot.getType();
        int n3 = ((ScreenInfo)object3).getWidth();
        int n4 = ((ScreenInfo)object3).getHeight();
        String string2 = hotspot.getHotspotUrl();
        int n7 = ((PositionInfo)object).getX();
        int n8 = ((PositionInfo)object).getY();
        String string3 = hotspot.getQuery();
        HotSpotMetaData hotSpotMetaData = hotspot.getMetadata();
        object4 = object2;
        object2 = new HotSpotT((String)object5, n3, n4, string2, n7, n8, string3, hotSpotMetaData);
        return object2;
    }
}

