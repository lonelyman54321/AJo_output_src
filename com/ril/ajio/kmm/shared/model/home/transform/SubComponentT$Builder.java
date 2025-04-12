/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home.transform;

import com.ril.ajio.kmm.shared.model.home.HomeDataUtil;
import com.ril.ajio.kmm.shared.model.home.SubComponent;
import com.ril.ajio.kmm.shared.model.home.transform.PositionInfo;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.kmm.shared.model.home.transform.SubComponentT;
import kotlin.jvm.internal.Intrinsics;

public final class SubComponentT$Builder {
    public final SubComponentT build(SubComponent subComponent, ScreenInfo object) {
        Intrinsics.checkNotNullParameter(subComponent, "subComponent");
        Intrinsics.checkNotNullParameter(object, "bannerDimen");
        Object object2 = HomeDataUtil.INSTANCE;
        Object object3 = subComponent.getWidth();
        Object object4 = subComponent.getHeight();
        object3 = ((HomeDataUtil)object2).getChildViewDimens((Double)object3, (Double)object4, (ScreenInfo)object);
        object4 = subComponent.getX();
        Double d2 = subComponent.getY();
        object = ((HomeDataUtil)object2).getViewPos((Double)object4, d2, (ScreenInfo)object);
        int n3 = ((ScreenInfo)object3).getWidth();
        int n4 = ((ScreenInfo)object3).getHeight();
        String string2 = subComponent.getImageUrl();
        int n7 = ((PositionInfo)object).getX();
        int n8 = ((PositionInfo)object).getY();
        object4 = object2;
        object2 = new SubComponentT(n3, n4, string2, n7, n8);
        return object2;
    }
}

