/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.Banner;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.transform.PositionInfo;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class HomeDataUtil {
    public static final float BASE_HEIGHT = 672.0f;
    public static final float BASE_WIDTH = 1024.0f;
    public static final HomeDataUtil INSTANCE;

    static {
        HomeDataUtil homeDataUtil;
        INSTANCE = homeDataUtil = new HomeDataUtil();
    }

    private HomeDataUtil() {
    }

    private final boolean isAValidExternalAd(Banner object, boolean bl2) {
        String string2;
        boolean bl3;
        boolean bl4 = true;
        if (!bl2 && object != null && (object = ((Banner)object).getBannerType()) != null && (bl3 = ((String)object).equalsIgnoreCase(string2 = "EXTERNAL_AD")) == bl4) {
            return false;
        }
        return bl4;
    }

    public final ScreenInfo getAcutalViewDimen(Double object, Double d2, BaseValue object2) {
        int n3;
        float f5;
        Float f6;
        float f7 = object2 != null && (f6 = ((BaseValue)object2).getResolutionHeight()) != null ? ((Number)f6).floatValue() : 672.0f;
        if (object2 != null && (object2 = ((BaseValue)object2).getResolutionWidth()) != null) {
            f5 = ((Number)object2).floatValue();
        } else {
            n3 = 0x44800000;
            f5 = 1024.0f;
        }
        double d5 = 0.0;
        double d7 = object != null ? (Double)object : d5;
        double d9 = f5;
        d7 *= d9;
        int n4 = 100;
        d9 = n4;
        d7 /= d9;
        if (d2 != null) {
            d5 = d2;
        }
        double d12 = f7;
        d5 = d5 * d12 / d9;
        int n7 = (int)d7;
        n3 = (int)d5;
        object = new ScreenInfo(n7, n3);
        return object;
    }

    public final ScreenInfo getChildViewDimens(Double object, Double d2, ScreenInfo screenInfo) {
        String string2 = "bannerDimen";
        Intrinsics.checkNotNullParameter(screenInfo, string2);
        double d5 = 0.0;
        double d7 = object != null ? (Double)object : d5;
        double d9 = screenInfo.getWidth();
        d7 *= d9;
        int n3 = 100;
        d9 = n3;
        d7 /= d9;
        if (d2 != null) {
            d5 = d2;
        }
        double d12 = screenInfo.getHeight();
        d5 = d5 * d12 / d9;
        int n4 = (int)d7;
        int n7 = (int)d5;
        object = new ScreenInfo(n4, n7);
        return object;
    }

    public final ScreenInfo getViewDimen(Double d2, Double d5, ScreenInfo screenInfo, BaseValue object) {
        int n3;
        float f5;
        Object object2 = "screenInfo";
        Intrinsics.checkNotNullParameter(screenInfo, (String)object2);
        float f6 = object != null && (object2 = ((BaseValue)object).getResolutionHeight()) != null ? ((Number)object2).floatValue() : 672.0f;
        if (object != null && (object = ((BaseValue)object).getResolutionWidth()) != null) {
            f5 = ((Number)object).floatValue();
        } else {
            n3 = 0x44800000;
            f5 = 1024.0f;
        }
        double d7 = 0.0;
        double d9 = d2 != null ? d2 : d7;
        double d12 = screenInfo.getWidth();
        d9 *= d12;
        int n4 = 100;
        d12 = n4;
        d9 /= d12;
        if (d2 != null) {
            d7 = d2;
        }
        double d13 = f5;
        d7 *= d13;
        double d14 = d5 != null ? d5 : 1.0;
        d13 = f6;
        d14 = d9 / (d7 /= (d14 *= d13));
        n3 = (int)d9;
        int n7 = (int)d14;
        screenInfo = new ScreenInfo(n3, n7);
        return screenInfo;
    }

    public final PositionInfo getViewPos(Double object, Double d2, ScreenInfo screenInfo) {
        String string2 = "parentView";
        Intrinsics.checkNotNullParameter(screenInfo, string2);
        double d5 = 0.0;
        double d7 = object != null ? (Double)object : d5;
        double d9 = screenInfo.getWidth();
        d7 *= d9;
        int n3 = 100;
        d9 = n3;
        d7 /= d9;
        if (d2 != null) {
            d5 = d2;
        }
        double d12 = screenInfo.getHeight();
        d5 = d5 * d12 / d9;
        int n4 = (int)d7;
        int n7 = (int)d5;
        object = new PositionInfo(n4, n7);
        return object;
    }

    public final boolean isCMSVideoBannerEnabled(Banner object, boolean bl2, String string2, boolean bl3) {
        int n3;
        String string3;
        boolean bl4 = false;
        String string4 = null;
        if (object != null) {
            string3 = ((Banner)object).getBannerType();
        } else {
            n3 = 0;
            string3 = null;
        }
        if (string3 != null && (n3 = string3.length()) != 0 && string2 != null && (n3 = string2.length()) != 0) {
            boolean bl5;
            if (object != null) {
                string4 = ((Banner)object).getBannerType();
            }
            if (bl4 = b.i(string4, string3 = "VIDEO", bl5 = true)) {
                object = "STANDARD";
                boolean bl6 = b.i(string2, (String)object, bl5);
                if (bl6) {
                    return bl2;
                }
                return false;
            }
        }
        return this.isAValidExternalAd((Banner)object, bl3);
    }

    public final boolean isCuratedWidgetType(String string2, Banner banner) {
        block11: {
            boolean bl2;
            int n3;
            block12: {
                int n4;
                String string3;
                int n7;
                if (string2 == null || (n7 = string2.length()) == 0) break block11;
                n7 = 0;
                String string4 = null;
                if (banner != null) {
                    string3 = banner.getBannerType();
                } else {
                    n4 = 0;
                    string3 = null;
                }
                if (string3 == null || (n4 = string3.length()) == 0 || (n3 = b.i(string2, string3 = "WIDGET", bl2 = true)) == 0) break block11;
                if (banner != null) {
                    string2 = banner.getBannerType();
                } else {
                    n3 = 0;
                    string2 = null;
                }
                string3 = "CURATED_WIDGET";
                n3 = b.i(string2, string3, bl2);
                if (n3 == 0) break block11;
                if (banner != null) {
                    string2 = banner.getWidgetLevel();
                } else {
                    n3 = 0;
                    string2 = null;
                }
                string3 = "USER";
                n3 = b.i(string2, string3, bl2);
                if (n3 != 0) break block12;
                if (banner != null) {
                    string4 = banner.getWidgetLevel();
                }
                if ((n3 = b.i(string4, string2 = "PLATFORM", bl2)) == 0) break block11;
            }
            if (banner != null && (string2 = banner.getFeedLogic()) != null && (n3 = string2.length()) > 0) {
                return bl2;
            }
        }
        return false;
    }

    public final boolean isDynamicWidgetType(String string2, Banner banner) {
        block11: {
            boolean bl2;
            int n3;
            block12: {
                int n4;
                String string3;
                int n7;
                if (string2 == null || (n7 = string2.length()) == 0) break block11;
                n7 = 0;
                String string4 = null;
                if (banner != null) {
                    string3 = banner.getBannerType();
                } else {
                    n4 = 0;
                    string3 = null;
                }
                if (string3 == null || (n4 = string3.length()) == 0 || (n3 = b.i(string2, string3 = "WIDGET", bl2 = true)) == 0) break block11;
                if (banner != null) {
                    string2 = banner.getBannerType();
                } else {
                    n3 = 0;
                    string2 = null;
                }
                string3 = "DYNAMIC_WIDGET";
                n3 = b.i(string2, string3, bl2);
                if (n3 == 0) break block11;
                if (banner != null) {
                    string2 = banner.getWidgetLevel();
                } else {
                    n3 = 0;
                    string2 = null;
                }
                string3 = "PLATFORM";
                n3 = b.i(string2, string3, bl2);
                if (n3 != 0) break block12;
                if (banner != null) {
                    string4 = banner.getWidgetLevel();
                }
                if ((n3 = b.i(string4, string2 = "USER", bl2)) == 0) break block11;
            }
            if (banner != null && (string2 = banner.getFeedLogic()) != null && (n3 = string2.length()) > 0) {
                return bl2;
            }
        }
        return false;
    }

    public final boolean isFloatingComponent(String string2) {
        boolean bl2;
        String string3;
        boolean bl3;
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0 && (bl3 = b.i(string2, string3 = "FLOATING_COMPONENT", bl2 = true))) {
            return bl2;
        }
        return false;
    }

    public final boolean isFloatingWidget(Banner object, String string2) {
        int n3;
        String string3;
        String string4 = null;
        if (object != null) {
            string3 = ((Banner)object).getBannerType();
        } else {
            n3 = 0;
            string3 = null;
        }
        boolean bl2 = true;
        if (string3 != null && (n3 = string3.length()) != 0 && string2 != null && (n3 = string2.length()) != 0) {
            boolean bl3;
            if (object != null) {
                string4 = ((Banner)object).getBannerType();
            }
            if (bl3 = b.i(string4, (String)(object = "VIDEO"), bl2)) {
                object = "FLOATING_COMPONENT";
                bl3 = b.i(string2, (String)object, bl2);
                if (bl3) {
                    return bl2;
                }
                return false;
            }
        }
        return bl2;
    }

    public final boolean isImageSearchType(boolean bl2, String string2, Banner banner) {
        if (bl2 && string2 != null && (bl2 = string2.length())) {
            boolean bl3;
            boolean bl4;
            int n3;
            String string3;
            bl2 = false;
            String string4 = null;
            if (banner != null) {
                string3 = banner.getBannerType();
            } else {
                n3 = 0;
                string3 = null;
            }
            if (string3 != null && (n3 = string3.length()) != 0 && (bl4 = b.i(string2, string3 = "WIDGET", bl3 = true))) {
                if (banner != null) {
                    string4 = banner.getBannerType();
                }
                if (bl2 = b.i(string4, string2 = "IMAGE_SEARCH", bl3)) {
                    return bl3;
                }
            }
        }
        return false;
    }

    public final boolean isOlpCardsWidget(String string2, Banner banner, boolean bl2, boolean bl3) {
        if (bl3 && bl2 && string2 != null && (bl2 = string2.length())) {
            boolean bl4;
            boolean bl5;
            String string3;
            bl2 = false;
            String string4 = null;
            if (banner != null) {
                string3 = banner.getBannerType();
            } else {
                bl3 = false;
                string3 = null;
            }
            if (string3 != null && (bl3 = string3.length()) && (bl5 = b.i(string2, string3 = "WIDGET", bl4 = true))) {
                if (banner != null) {
                    string4 = banner.getBannerType();
                }
                if (bl5 = b.i(string4, string2 = "OLP_CARDS_WIDGET", bl4)) {
                    return bl4;
                }
            }
        }
        return false;
    }

    public final boolean isProductWidgetType(String object, Banner banner, boolean bl2) {
        if (bl2 && object != null && (bl2 = object.length())) {
            boolean bl3;
            int n3;
            int n4;
            String string2;
            bl2 = false;
            String string3 = null;
            if (banner != null) {
                string2 = banner.getBannerType();
            } else {
                n4 = 0;
                string2 = null;
            }
            if (string2 != null && (n4 = string2.length()) != 0 && (n3 = b.i((String)object, string2 = "WIDGET", bl3 = true)) != 0) {
                if (banner != null) {
                    string3 = banner.getBannerType();
                }
                if ((n3 = b.i(string3, (String)(object = "RECOMMENDED_PRODUCTS"), bl3)) != 0) {
                    if (banner != null && (object = banner.getProducts()) != null) {
                        n3 = object.size();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    int n7 = 4;
                    if (n3 >= n7) {
                        return bl3;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isRatingsWidget(String string2, Banner banner, boolean bl2) {
        if (bl2 && string2 != null && (bl2 = string2.length())) {
            boolean bl3;
            boolean bl4;
            int n3;
            String string3;
            bl2 = false;
            String string4 = null;
            if (banner != null) {
                string3 = banner.getBannerType();
            } else {
                n3 = 0;
                string3 = null;
            }
            if (string3 != null && (n3 = string3.length()) != 0 && (bl4 = b.i(string2, string3 = "WIDGET", bl3 = true))) {
                if (banner != null) {
                    string4 = banner.getBannerType();
                }
                if (bl4 = b.i(string4, string2 = "RATINGS", bl3)) {
                    return bl3;
                }
            }
        }
        return false;
    }

    public final boolean isRecentSearchType(String string2, Banner banner) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            boolean bl2;
            boolean bl3;
            int n4;
            String string3;
            n3 = 0;
            String string4 = null;
            if (banner != null) {
                string3 = banner.getBannerType();
            } else {
                n4 = 0;
                string3 = null;
            }
            if (string3 != null && (n4 = string3.length()) != 0 && (bl3 = b.i(string2, string3 = "WIDGET", bl2 = true))) {
                if (banner != null) {
                    string4 = banner.getBannerType();
                }
                if (bl3 = b.i(string4, string2 = "RECENT_SEARCH", bl2)) {
                    return bl2;
                }
            }
        }
        return false;
    }

    public final boolean isRecentlyViewedType(String string2, Banner banner, boolean bl2, boolean bl3) {
        if (bl3 && bl2 && string2 != null && (bl2 = string2.length())) {
            boolean bl4;
            boolean bl5;
            String string3;
            bl2 = false;
            String string4 = null;
            if (banner != null) {
                string3 = banner.getBannerType();
            } else {
                bl3 = false;
                string3 = null;
            }
            if (string3 != null && (bl3 = string3.length()) && (bl5 = b.i(string2, string3 = "WIDGET", bl4 = true))) {
                if (banner != null) {
                    string4 = banner.getBannerType();
                }
                if (bl5 = b.i(string4, string2 = "RECENTLY_VIEWED", bl4)) {
                    return bl4;
                }
            }
        }
        return false;
    }

    public final boolean isSTLType(String string2, boolean bl2) {
        boolean bl3;
        String string3;
        boolean bl4;
        if (bl2 && string2 != null && (bl2 = string2.length()) && (bl4 = b.i(string2, string3 = "SHOPTHELOOK", bl3 = true))) {
            return bl3;
        }
        return false;
    }

    public final boolean isSTLVideoEnabled(Banner object, boolean bl2) {
        int n3;
        Object object2;
        String string2 = null;
        if (object != null && (object2 = ((Banner)object).getDynamicPageMetadata()) != null) {
            object2 = ((DynamicPageMetadata)object2).getMediaType();
        } else {
            n3 = 0;
            object2 = null;
        }
        boolean bl3 = true;
        if (object2 != null && (n3 = object2.length()) != 0) {
            boolean bl4;
            if (object != null && (object = ((Banner)object).getDynamicPageMetadata()) != null) {
                string2 = ((DynamicPageMetadata)object).getMediaType();
            }
            if (bl4 = b.i(string2, (String)(object = "VIDEO"), bl3)) {
                return bl2;
            }
        }
        return bl3;
    }

    public final boolean isSimilarProductWidgetType(String string2, Banner banner, boolean bl2) {
        if (bl2 && string2 != null && (bl2 = string2.length())) {
            boolean bl3;
            boolean bl4;
            int n3;
            String string3;
            bl2 = false;
            String string4 = null;
            if (banner != null) {
                string3 = banner.getBannerType();
            } else {
                n3 = 0;
                string3 = null;
            }
            if (string3 != null && (n3 = string3.length()) != 0 && (bl4 = b.i(string2, string3 = "WIDGET", bl3 = true))) {
                if (banner != null) {
                    string4 = banner.getBannerType();
                }
                if (bl4 = b.i(string4, string2 = "SIMILAR_PRODUCTS", bl3)) {
                    return bl3;
                }
            }
        }
        return false;
    }

    public final boolean isTrendingCategoryType(boolean bl2, List list) {
        boolean bl3;
        String string2 = "bannerList";
        Intrinsics.checkNotNullParameter(list, string2);
        if (bl2 && (bl2 = list.size()) > (bl3 = true)) {
            return bl3;
        }
        return false;
    }

    public final boolean isWishListType(String string2, Banner banner) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            boolean bl2;
            boolean bl3;
            int n4;
            String string3;
            n3 = 0;
            String string4 = null;
            if (banner != null) {
                string3 = banner.getBannerType();
            } else {
                n4 = 0;
                string3 = null;
            }
            if (string3 != null && (n4 = string3.length()) != 0 && (bl3 = b.i(string2, string3 = "WIDGET", bl2 = true))) {
                if (banner != null) {
                    string4 = banner.getBannerType();
                }
                if (bl3 = b.i(string4, string2 = "ITEMS_IN_WISHLIST", bl2)) {
                    return bl2;
                }
            }
        }
        return false;
    }
}

