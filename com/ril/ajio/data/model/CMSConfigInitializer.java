/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
package com.ril.ajio.data.model;

import android.app.Application;
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$array;
import com.ril.ajio.data.model.CMSConfig;
import com.ril.ajio.data.model.PreviewConfig;
import com.ril.ajio.data.model.PreviewUrl;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class CMSConfigInitializer {
    public static final int $stable;
    public static final CMSConfigInitializer INSTANCE;
    private static String cmsData;
    private static CMSConfig cmsObject;

    static {
        CMSConfigInitializer cMSConfigInitializer;
        INSTANCE = cMSConfigInitializer = new CMSConfigInitializer();
        $stable = 8;
    }

    private CMSConfigInitializer() {
    }

    public static final int getPreviewAdBufferTime() {
        Object object = cmsObject;
        int n3 = object != null && (object = ((CMSConfig)object).getPreviewConfig()) != null ? ((PreviewConfig)object).getAdBuffer() : 10;
        return n3;
    }

    public static final String getPreviewAdSpotId() {
        Object object = cmsObject;
        if (object == null || (object = ((CMSConfig)object).getPreviewConfig()) == null || (object = ((PreviewConfig)object).getAdspotID()) == null) {
            object = "";
        }
        return object;
    }

    public static final String getPreviewUrlForHome() {
        Object object = cmsObject;
        object = object != null ? ((CMSConfig)object).getPreviewUrl() : null;
        boolean bl2 = ch_2.o;
        Object object2 = "";
        if (bl2) {
            if (object != null && (object = ((PreviewUrl)object).getUatHome()) != null) {
                object2 = object;
            }
            return object2;
        }
        if (object != null && (object = ((PreviewUrl)object).getProdHome()) != null) {
            object2 = object;
        }
        return object2;
    }

    public static final String getPreviewUrlForNav() {
        Object object = cmsObject;
        object = object != null ? ((CMSConfig)object).getPreviewUrl() : null;
        boolean bl2 = ch_2.o;
        Object object2 = "";
        if (bl2) {
            if (object != null && (object = ((PreviewUrl)object).getUatNav()) != null) {
                object2 = object;
            }
            return object2;
        }
        if (object != null && (object = ((PreviewUrl)object).getProdNav()) != null) {
            object2 = object;
        }
        return object2;
    }

    public static final String getPreviewUrlForStores(boolean bl2) {
        String string2;
        Object object = cmsObject;
        object = object != null ? ((CMSConfig)object).getPreviewUrl() : null;
        boolean bl3 = ch_2.o;
        String string3 = "";
        if (bl3) {
            String string4;
            if (bl2) {
                String string5;
                if (object != null && (string5 = ((PreviewUrl)object).getUatStoresv3()) != null) {
                    string3 = string5;
                }
                return string3;
            }
            if (object != null && (string4 = ((PreviewUrl)object).getUatStoresv2()) != null) {
                string3 = string4;
            }
            return string3;
        }
        if (bl2) {
            String string6;
            if (object != null && (string6 = ((PreviewUrl)object).getProdStoresV3()) != null) {
                string3 = string6;
            }
            return string3;
        }
        if (object != null && (string2 = ((PreviewUrl)object).getProdStoresV2()) != null) {
            string3 = string2;
        }
        return string3;
    }

    public static final int getRvMax() {
        CMSConfig cMSConfig = cmsObject;
        int n3 = cMSConfig != null ? cMSConfig.getRecentlyViewedHomePageMax() : 10;
        return n3;
    }

    public static final int getRvMin() {
        CMSConfig cMSConfig = cmsObject;
        int n3 = cMSConfig != null ? cMSConfig.getRecentlyViewedHomePageMin() : 4;
        return n3;
    }

    public static final boolean isLuxeBrandEnabled() {
        return false;
    }

    public static final boolean isLuxeBrandImageEnabled() {
        return false;
    }

    public static final boolean isProductWidgetEnabled() {
        return true;
    }

    public static final boolean isSTLEnabledForAjio() {
        return false;
    }

    public static final boolean isSTLEnabledForLuxe() {
        return false;
    }

    public final String getBannerAdsUrlForPreview() {
        Object object = cmsObject;
        object = object != null ? ((CMSConfig)object).getPreviewUrl() : null;
        boolean bl2 = ch_2.o;
        Object object2 = "";
        if (bl2) {
            if (object != null && (object = ((PreviewUrl)object).getUatJioAd()) != null) {
                object2 = object;
            }
            return object2;
        }
        if (object != null && (object = ((PreviewUrl)object).getProdJioAd()) != null) {
            object2 = object;
        }
        return object2;
    }

    public final ArrayList getCMSStores() {
        Object object = cmsObject;
        object = object != null ? ((CMSConfig)object).getSupportedStoresForPreview() : null;
        return object;
    }

    public final String getExploreBrandsUrlForPreview() {
        Object object;
        block0: {
            Object object2 = cmsObject;
            object2 = object2 != null ? ((CMSConfig)object2).getPreviewUrl() : null;
            boolean bl2 = ch_2.o;
            object = "";
            if (bl2 ? object2 == null || (object2 = ((PreviewUrl)object2).getUatExploreBrandsFleek()) == null : object2 == null || (object2 = ((PreviewUrl)object2).getProdExploreBrandsFleek()) == null) break block0;
            object = object2;
        }
        return object;
    }

    public final String getFeedUrlForPreview() {
        Object object;
        block0: {
            Object object2 = cmsObject;
            object2 = object2 != null ? ((CMSConfig)object2).getPreviewUrl() : null;
            boolean bl2 = ch_2.o;
            object = "";
            if (bl2 ? object2 == null || (object2 = ((PreviewUrl)object2).getUatFeedFleek()) == null : object2 == null || (object2 = ((PreviewUrl)object2).getProdFeedFleek()) == null) break block0;
            object = object2;
        }
        return object;
    }

    public final String getLuxeDefaultHomePageUrl() {
        int n3;
        Object object = cmsObject;
        if (object != null) {
            object = ((CMSConfig)object).getLuxeDefaultHomePageUrl();
        } else {
            n3 = 0;
            object = null;
        }
        Object object2 = "/shop/luxe";
        if (object != null && (n3 = object.length()) != 0 && (object = cmsObject) != null && (object = ((CMSConfig)object).getLuxeDefaultHomePageUrl()) != null) {
            object2 = object;
        }
        return object2;
    }

    public final List getUserSubGroup() {
        boolean bl2;
        Object object = cmsObject;
        if (object != null) {
            object = object.getUserGroupForPreview();
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null && !(bl2 = object.isEmpty())) {
            object = cmsObject;
            if (object == null || (object = object.getUserGroupForPreview()) == null || (object = CollectionsKt.k0((Iterable)object)) == null) {
                object = mz0_2.a;
            }
        } else {
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a().getResources();
            int n3 = R$array.user_group_array;
            object = object.getStringArray(n3);
            String string2 = "getStringArray(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = tp_2.M(object);
        }
        return object;
    }

    public final void initFromConfig(Application object) {
        Intrinsics.checkNotNullParameter(object, "application");
        z40_0.Companion.getClass();
        object = z40$a.a((Context)object).a;
        Object object2 = "CMSConfig";
        cmsData = object = ((ao0_0)object).b((String)object2);
        int n3 = ((String)object).length();
        if (n3 != 0) {
            object = cmsData;
            object2 = CMSConfig.class;
            cmsObject = object = (CMSConfig)JsonUtils.fromJson((String)object, (Class)object2);
        }
    }
}

