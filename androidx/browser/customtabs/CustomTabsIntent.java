/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent$a;
import androidx.browser.customtabs.a;
import java.util.Locale;

public final class CustomTabsIntent {
    public static final int ACTIVITY_HEIGHT_ADJUSTABLE = 1;
    public static final int ACTIVITY_HEIGHT_DEFAULT = 0;
    public static final int ACTIVITY_HEIGHT_FIXED = 2;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_DIVIDER = 3;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_NONE = 1;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_SHADOW = 2;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_END = 2;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_START = 1;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_NONE = 1;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_TOP = 2;
    public static final int CLOSE_BUTTON_POSITION_DEFAULT = 0;
    public static final int CLOSE_BUTTON_POSITION_END = 2;
    public static final int CLOSE_BUTTON_POSITION_START = 1;
    public static final int COLOR_SCHEME_DARK = 2;
    public static final int COLOR_SCHEME_LIGHT = 1;
    public static final int COLOR_SCHEME_SYSTEM = 0;
    public static final String EXTRA_ACTION_BUTTON_BUNDLE = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
    public static final String EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_POSITION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION";
    public static final String EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    public static final String EXTRA_CLOSE_BUTTON_POSITION = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION";
    public static final String EXTRA_COLOR_SCHEME = "androidx.browser.customtabs.extra.COLOR_SCHEME";
    public static final String EXTRA_COLOR_SCHEME_PARAMS = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";
    public static final String EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String EXTRA_DISABLE_BACKGROUND_INTERACTION = "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION";
    public static final String EXTRA_DISABLE_BOOKMARKS_BUTTON = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON";
    public static final String EXTRA_DISABLE_DOWNLOAD_BUTTON = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON";
    public static final String EXTRA_ENABLE_INSTANT_APPS = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final String EXTRA_ENABLE_URLBAR_HIDING = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
    public static final String EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final String EXTRA_INITIAL_ACTIVITY_HEIGHT_PX = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX";
    public static final String EXTRA_INITIAL_ACTIVITY_WIDTH_PX = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX";
    public static final String EXTRA_MENU_ITEMS = "android.support.customtabs.extra.MENU_ITEMS";
    public static final String EXTRA_NAVIGATION_BAR_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final String EXTRA_NAVIGATION_BAR_DIVIDER_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";
    public static final String EXTRA_REMOTEVIEWS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String EXTRA_REMOTEVIEWS_CLICKED_ID = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String EXTRA_REMOTEVIEWS_PENDINGINTENT = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String EXTRA_REMOTEVIEWS_VIEW_IDS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String EXTRA_SECONDARY_TOOLBAR_COLOR = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
    public static final String EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE = "androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE";
    public static final String EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER = "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER";
    public static final String EXTRA_SESSION = "android.support.customtabs.extra.SESSION";
    public static final String EXTRA_SESSION_ID = "android.support.customtabs.extra.SESSION_ID";
    public static final String EXTRA_SHARE_STATE = "androidx.browser.customtabs.extra.SHARE_STATE";
    public static final String EXTRA_TINT_ACTION_BUTTON = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    public static final String EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY";
    public static final String EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR";
    public static final String EXTRA_TOOLBAR_CORNER_RADIUS_DP = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP";
    public static final String EXTRA_TOOLBAR_ITEMS = "android.support.customtabs.extra.TOOLBAR_ITEMS";
    public static final String EXTRA_TRANSLATE_LANGUAGE_TAG = "androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG";
    public static final String KEY_DESCRIPTION = "android.support.customtabs.customaction.DESCRIPTION";
    public static final String KEY_ICON = "android.support.customtabs.customaction.ICON";
    public static final String KEY_ID = "android.support.customtabs.customaction.ID";
    public static final String KEY_MENU_ITEM_TITLE = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final String KEY_PENDING_INTENT = "android.support.customtabs.customaction.PENDING_INTENT";
    public static final int NO_TITLE = 0;
    public static final int SHARE_STATE_DEFAULT = 0;
    public static final int SHARE_STATE_OFF = 2;
    public static final int SHARE_STATE_ON = 1;
    public static final int SHOW_PAGE_TITLE = 1;
    public static final int TOOLBAR_ACTION_BUTTON_ID;
    public final Intent intent;
    public final Bundle startAnimationBundle;

    public CustomTabsIntent(Intent intent, Bundle bundle) {
        this.intent = intent;
        this.startAnimationBundle = bundle;
    }

    public static int getActivityResizeBehavior(Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR, 0);
    }

    public static int getActivitySideSheetBreakpointDp(Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP, 0);
    }

    public static int getActivitySideSheetDecorationType(Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE, 0);
    }

    public static int getActivitySideSheetPosition(Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_POSITION, 0);
    }

    public static int getActivitySideSheetRoundedCornersPosition(Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION, 0);
    }

    public static int getCloseButtonPosition(Intent intent) {
        return intent.getIntExtra(EXTRA_CLOSE_BUTTON_POSITION, 0);
    }

    public static a getColorSchemeParams(Intent object, int n3) {
        int n4;
        if (n3 >= 0 && n3 <= (n4 = 2) && n3 != 0) {
            if ((object = object.getExtras()) == null) {
                return a.a(null);
            }
            a a2 = a.a((Bundle)object);
            Object object2 = EXTRA_COLOR_SCHEME_PARAMS;
            if ((object = object.getSparseParcelableArray((String)object2)) != null && (object = (Bundle)object.get(n3)) != null) {
                Integer n7;
                Integer n8;
                object = a.a((Bundle)object);
                object2 = object.a;
                if (object2 == null) {
                    object2 = a2.a;
                }
                if ((n8 = object.b) == null) {
                    n8 = a2.b;
                }
                if ((n7 = object.c) == null) {
                    n7 = a2.c;
                }
                if ((object = object.d) == null) {
                    object = a2.d;
                }
                a a3 = new a((Integer)object2, n8, n7, (Integer)object);
                return a3;
            }
            return a2;
        }
        String string2 = hj0_0.a(n3, "Invalid colorScheme: ");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static int getInitialActivityHeightPx(Intent intent) {
        return intent.getIntExtra(EXTRA_INITIAL_ACTIVITY_HEIGHT_PX, 0);
    }

    public static int getInitialActivityWidthPx(Intent intent) {
        return intent.getIntExtra(EXTRA_INITIAL_ACTIVITY_WIDTH_PX, 0);
    }

    public static int getMaxToolbarItems() {
        return 5;
    }

    public static PendingIntent getSecondaryToolbarSwipeUpGesture(Intent intent) {
        return (PendingIntent)intent.getParcelableExtra(EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE);
    }

    public static int getToolbarCornerRadiusDp(Intent intent) {
        return intent.getIntExtra(EXTRA_TOOLBAR_CORNER_RADIUS_DP, 16);
    }

    public static Locale getTranslateLocale(Intent object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        object = n3 >= n4 ? CustomTabsIntent$a.a(object) : null;
        return object;
    }

    public static boolean isActivitySideSheetMaximizationEnabled(Intent intent) {
        return intent.getBooleanExtra(EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION, false);
    }

    public static boolean isBackgroundInteractionEnabled(Intent intent) {
        return intent.getBooleanExtra(EXTRA_DISABLE_BACKGROUND_INTERACTION, false) ^ true;
    }

    public static boolean isBookmarksButtonEnabled(Intent intent) {
        return intent.getBooleanExtra(EXTRA_DISABLE_BOOKMARKS_BUTTON, false) ^ true;
    }

    public static boolean isDownloadButtonEnabled(Intent intent) {
        return intent.getBooleanExtra(EXTRA_DISABLE_DOWNLOAD_BUTTON, false) ^ true;
    }

    public static boolean isSendToExternalDefaultHandlerEnabled(Intent intent) {
        return intent.getBooleanExtra(EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER, false);
    }

    public static Intent setAlwaysUseBrowserUI(Intent intent) {
        if (intent == null) {
            String string2 = "android.intent.action.VIEW";
            intent = new Intent(string2);
        }
        intent.addFlags(0x10000000);
        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        return intent;
    }

    public static boolean shouldAlwaysUseBrowserUI(Intent intent) {
        String string2 = "android.support.customtabs.extra.user_opt_out";
        boolean bl2 = false;
        int n3 = intent.getBooleanExtra(string2, false);
        if (n3 != 0) {
            int n4 = intent.getFlags();
            n3 = 0x10000000;
            if ((n4 &= n3) != 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public void launchUrl(Context context, Uri uri) {
        this.intent.setData(uri);
        uri = this.intent;
        Bundle bundle = this.startAnimationBundle;
        t70.startActivity(context, (Intent)uri, bundle);
    }
}

