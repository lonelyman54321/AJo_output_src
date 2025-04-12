/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  com.unity3d.player.UnityPlayer
 *  org.json.JSONObject
 */
package com.jio.unity.plugin.android;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$ORIENTATION_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$VideoPlayerViewType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Environment;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.utils.Constants$CompanionAdSize;
import com.jio.jioads.utils.Constants$DynamicDisplaySize;
import com.jio.jioads.utils.Constants$GENDER;
import com.jio.jioads.utils.Constants$KIDS_PROTECTED;
import com.jio.unity.plugin.android.JioAdsPluginListener;
import com.jio.unity.plugin.android.UnityBridge$1;
import com.jio.unity.plugin.android.UnityBridge$3;
import com.jio.unity.plugin.android.a;
import com.jio.unity.plugin.android.b;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class UnityBridge {
    public static Activity g;
    public static boolean h = false;
    public static JioAds$Environment i;
    public static JioAds$LogLevel j;
    public String a;
    public final FrameLayout b;
    public final JioAdView$AD_TYPE c;
    public final JioAdView d;
    public String e;
    public int f;

    public UnityBridge(String object, String object2, FrameLayout object3) {
        Object object4 = new StringBuilder("Inside constructor second: adspotId: ");
        object4.append((String)object);
        String string2 = " adType: ";
        object4.append(string2);
        object4.append((String)object2);
        object4 = object4.toString();
        UnityBridge.a((String)object4);
        this.a = object;
        g = UnityPlayer.currentActivity;
        object = "INTERSTITIAL";
        boolean bl2 = object2.equalsIgnoreCase((String)object);
        if (bl2) {
            object = JioAdView$AD_TYPE.INTERSTITIAL;
            this.c = object;
        } else {
            object = "INFEED";
            bl2 = object2.equalsIgnoreCase((String)object);
            if (bl2) {
                object = JioAdView$AD_TYPE.INFEED;
                this.c = object;
            } else {
                object = "CONTENT_STREAM";
                bl2 = object2.equalsIgnoreCase((String)object);
                if (bl2) {
                    object = JioAdView$AD_TYPE.CONTENT_STREAM;
                    this.c = object;
                } else {
                    object = "INSTREAM_VIDEO";
                    bl2 = object2.equalsIgnoreCase((String)object);
                    if (bl2) {
                        object = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                        this.c = object;
                    } else {
                        object = "CUSTOM_NATIVE";
                        bl2 = object2.equalsIgnoreCase((String)object);
                        if (bl2) {
                            object = JioAdView$AD_TYPE.CUSTOM_NATIVE;
                            this.c = object;
                        } else {
                            object = "DYNAMIC_DISPLAY";
                            bl2 = object2.equalsIgnoreCase((String)object);
                            if (bl2) {
                                object = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                                this.c = object;
                            } else {
                                object = "INSTREAM_AUDIO";
                                bl2 = object2.equalsIgnoreCase((String)object);
                                if (bl2) {
                                    object = JioAdView$AD_TYPE.INSTREAM_AUDIO;
                                    this.c = object;
                                }
                            }
                        }
                    }
                }
            }
        }
        super("mAdType: ");
        object2 = this.c;
        ((StringBuilder)object).append(object2);
        object = ((StringBuilder)object).toString();
        UnityBridge.a((String)object);
        bl2 = h;
        if (!bl2) {
            object = JioAds.Companion.getInstance();
            object2 = g;
            ((JioAds)object).init((Context)object2);
            h = bl2 = true;
        }
        this.b = object3;
        object = new StringBuilder("Inside constructor second: myLayout: ");
        ((StringBuilder)object).append(object3);
        UnityBridge.a(((StringBuilder)object).toString());
        object2 = g;
        object3 = this.a;
        object4 = this.c;
        super((Context)object2, (String)object3, (JioAdView$AD_TYPE)((Object)object4));
        this.d = object;
        object2 = JioAdView$VideoPlayerViewType.SURFACE_VIEW;
        ((JioAdView)object).setVideoAdViewType((JioAdView$VideoPlayerViewType)((Object)object2));
    }

    public static void a(String string2) {
    }

    public static boolean clearCachedMedia(int n3) {
        int n4;
        String string2 = "Inside clearCachedMedia(): mediatype";
        Object object = new StringBuilder(string2);
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString();
        UnityBridge.a((String)object);
        JioAds$MediaType jioAds$MediaType = n3 != 0 ? (n3 != (n4 = 1) ? (n3 != (n4 = 2) ? JioAds$MediaType.NONE : JioAds$MediaType.ALL) : JioAds$MediaType.IMAGE) : JioAds$MediaType.VIDEO;
        object = JioAds.Companion.getInstance();
        string2 = g;
        return ((JioAds)object).clearCachedMedia((Context)string2, jioAds$MediaType);
    }

    public static void disableGooglePlayService(boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder("Inside disableGooglePlayService(): ");
        stringBuilder.append(bl2);
        UnityBridge.a(stringBuilder.toString());
        JioAds.Companion.getInstance().disableGooglePlayService(bl2);
    }

    public static void disableUidService(boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder("Inside disableUidService(): ");
        stringBuilder.append(bl2);
        UnityBridge.a(stringBuilder.toString());
    }

    public static String getSDkVersion() {
        UnityBridge.a("Inside getSDkVersion()");
        return null;
    }

    public static void setEnvironment(int n3) {
        Object object;
        String string2 = "Inside setEnvironment(): ";
        Object object2 = new StringBuilder(string2);
        object2.append(n3);
        object2 = object2.toString();
        UnityBridge.a((String)object2);
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 == n4) {
                        i = object = JioAds$Environment.DEV;
                    }
                } else {
                    i = object = JioAds$Environment.STG;
                }
            } else {
                i = object = JioAds$Environment.SIT;
            }
        } else {
            i = object = JioAds$Environment.PROD;
        }
        object = JioAds.Companion.getInstance();
        object2 = i;
        ((JioAds)object).setEnvironment((JioAds$Environment)((Object)object2));
    }

    public static void setLogLevel(int n3) {
        Object object;
        String string2 = "Inside setLogLevel(): ";
        Object object2 = new StringBuilder(string2);
        object2.append(n3);
        object2 = object2.toString();
        UnityBridge.a((String)object2);
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                object = JioAds$LogLevel.DEBUG;
                j = object;
            }
        } else {
            object = JioAds$LogLevel.NONE;
            j = object;
        }
        object = JioAds.Companion.getInstance();
        object2 = j;
        ((JioAds)object).setLogLevel((JioAds$LogLevel)((Object)object2));
    }

    public void cacheAd() {
        UnityBridge.a("Inside cacheAd()");
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            Object object = this.c;
            JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
            if (object == jioAdView$AD_TYPE) {
                jioAdView = g;
                object = new b(this);
                jioAdView.runOnUiThread((Runnable)object);
            } else {
                jioAdView.cacheAd();
            }
        }
    }

    public void callmethod(String string2, Object ... objectArray) {
        com.jio.unity.plugin.android.a.a("Inside callmethod For: ", string2);
        for (Object object : objectArray) {
            String string3 = "Inside callmethod For value: ";
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append(object);
            object = stringBuilder.toString();
            UnityBridge.a((String)object);
        }
    }

    public boolean closeAd() {
        UnityBridge.a("Inside closeAd()");
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            return jioAdView.closeAd();
        }
        return false;
    }

    public void disableSDKDefaultFocus() {
        UnityBridge.a("Inside disableSDKDefaultFocus()");
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.disableFocus();
        }
    }

    public void enableMediaCaching(int n3) {
        String string2 = "Inside enableMediaCaching(): mediatype";
        Object object = new StringBuilder(string2);
        ((StringBuilder)object).append(n3);
        UnityBridge.a(((StringBuilder)object).toString());
        object = this.d;
        if (object != null) {
            int n4;
            JioAds$MediaType jioAds$MediaType = n3 != 0 ? (n3 != (n4 = 1) ? (n3 != (n4 = 2) ? JioAds$MediaType.NONE : JioAds$MediaType.ALL) : JioAds$MediaType.IMAGE) : JioAds$MediaType.VIDEO;
            ((JioAdView)object).enableMediaCaching(jioAds$MediaType);
        }
    }

    public void enableSDKDefaultFocus() {
        UnityBridge.a("Inside enableSDKDefaultFocus()");
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.enableFocus();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String getAdState() {
        UnityBridge.a("Inside getAdState()");
        Object object = this.d;
        if (object != null) {
            object = ((JioAdView)object).getAdState();
            return ((Enum)object).name();
        }
        object = JioAdView$AdState.NOT_REQUESTED;
        return ((Enum)object).name();
    }

    public boolean isScreenKeptOn() {
        UnityBridge.a("Inside isScreenKeptOn()");
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            return jioAdView.getAdView().getKeepScreenOn();
        }
        return false;
    }

    public void keepScreenOn(boolean bl2) {
        String string2 = "Inside keepScreenOn() ";
        Object object = new StringBuilder(string2);
        ((StringBuilder)object).append(bl2);
        UnityBridge.a(((StringBuilder)object).toString());
        object = this.d;
        if (object != null) {
            object = ((JioAdView)object).getAdView();
            object.setKeepScreenOn(bl2);
        }
    }

    public void loadAd() {
        UnityBridge.a("Inside loadAd()");
        JioAdView$AD_TYPE jioAdView$AD_TYPE = this.c;
        Object object = JioAdView$AD_TYPE.INTERSTITIAL;
        if (jioAdView$AD_TYPE == object) {
            jioAdView$AD_TYPE = g;
            object = new dw3(this);
            jioAdView$AD_TYPE.runOnUiThread((Runnable)object);
        } else {
            jioAdView$AD_TYPE = g;
            object = new UnityBridge$1(this);
            jioAdView$AD_TYPE.runOnUiThread((Runnable)object);
        }
    }

    public void loadCustomAd() {
        this.d.loadCustomAd();
    }

    public void setActor(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setActor() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setActor(string2);
        }
    }

    public void setAdCount(int n3) {
        this.d.setRequestedAdCount(n3);
    }

    public void setAdListener(JioAdsPluginListener object) {
        UnityBridge.a("Inside setAdListener()");
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            UnityBridge$3 unityBridge$3 = new UnityBridge$3(this, (JioAdsPluginListener)object);
            jioAdView.setAdListener(unityBridge$3);
        } else {
            object = "mAdView is null";
            UnityBridge.a((String)object);
        }
    }

    public void setAdpodVariant(int n3) {
        Integer n4;
        Object object = n3;
        boolean n7 = ((Object)object).equals(n4 = Integer.valueOf(0));
        if (n7) {
            JioAdView jioAdView = this.d;
            object = JioAdView$AdPodVariant.NONE;
            jioAdView.setAdpodVariant((JioAdView$AdPodVariant)((Object)object));
        } else {
            int n8 = 1;
            if (n3 == n8) {
                JioAdView jioAdView = this.d;
                object = JioAdView$AdPodVariant.DEFAULT_ADPOD;
                jioAdView.setAdpodVariant((JioAdView$AdPodVariant)((Object)object));
            } else {
                int n10 = 2;
                if (n3 == n10) {
                    JioAdView jioAdView = this.d;
                    object = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP;
                    jioAdView.setAdpodVariant((JioAdView$AdPodVariant)((Object)object));
                }
            }
        }
    }

    public void setAdspotId(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setAdspotId() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            this.a = string2;
            jioAdView.setAdSpotId(string2);
        }
    }

    public void setAppVersion(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setAppVersion() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setAppVersion(string2);
        }
    }

    public void setAudioCompanionContainer(ViewGroup viewGroup, String object) {
        com.jio.unity.plugin.android.a.a("Inside setAudioCompanionContainer adsize : ", object);
        JioAdView jioAdView = this.d;
        object = Constants$CompanionAdSize.valueOf(object);
        jioAdView.setAudioCompanionContainer(viewGroup, (Constants$CompanionAdSize)((Object)object), null, null);
    }

    public void setCallbackHandlerName(String string2) {
        UnityBridge.a("Inside setCallbackHandlerName()");
        this.e = string2;
    }

    public void setChannelID(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setChannelID() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setChannelID(string2);
        }
    }

    public void setChannelName(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setChannelName() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setChannelName(string2);
        }
    }

    public void setCloseAfter(int n3) {
        String string2 = "Inside setCloseAfter(): ";
        Object object = new StringBuilder(string2);
        ((StringBuilder)object).append(n3);
        UnityBridge.a(((StringBuilder)object).toString());
        object = this.d;
        if (object != null) {
            ((JioAdView)object).setCloseAfter(n3);
        }
    }

    public void setContentId(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setContentId() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setContentID(string2);
        }
    }

    public void setContentType(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setContentType() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setContentType(string2);
        }
    }

    public void setCountry(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setCountry() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setCountry(string2);
        }
    }

    public void setCustomInterstitialAdContainer(int n3, int n4, String object) {
        boolean bl2;
        UnityBridge.a("Inside setCustomInterstitialAdContainer()");
        Object object2 = this.d;
        if (object2 != null && (bl2 = ((String)object).equalsIgnoreCase((String)(object2 = "NATIVE_INTERSTITIAL")))) {
            object = this.d;
            int n7 = 6;
            ((JioAdView)object).setCustomInterstitialAdContainer(n3, n4, n7);
        }
    }

    public void setDisplayAdSize(ArrayList object) {
        ArrayList<Constants$DynamicDisplaySize> arrayList = new ArrayList<Constants$DynamicDisplaySize>();
        object = ((ArrayList)object).iterator();
        while (true) {
            Constants$DynamicDisplaySize constants$DynamicDisplaySize2;
            block3: {
                boolean bl2 = object.hasNext();
                if (!bl2) break;
                String string2 = (String)object.next();
                for (Constants$DynamicDisplaySize constants$DynamicDisplaySize2 : Constants$DynamicDisplaySize.values()) {
                    String string3 = constants$DynamicDisplaySize2.getDynamicSize();
                    boolean bl3 = string3.equals(string2);
                    if (!bl3) {
                        continue;
                    }
                    break block3;
                }
                constants$DynamicDisplaySize2 = null;
            }
            if (constants$DynamicDisplaySize2 == null) continue;
            ((Object)((Object)constants$DynamicDisplaySize2)).toString();
            arrayList.add(constants$DynamicDisplaySize2);
        }
        ((Constants$DynamicDisplaySize)((Object)arrayList.get(0))).getDynamicSize();
        this.d.setDisplayAdSize(arrayList);
    }

    public void setDisplayAdSize(List list) {
        String string2 = "Inside setDisplayAdSize() ";
        Object object = new StringBuilder(string2);
        ((StringBuilder)object).append(list);
        UnityBridge.a(((StringBuilder)object).toString());
        object = this.d;
        if (object != null) {
            ((JioAdView)object).setDisplayAdSize(list);
        }
    }

    public void setGenre(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setGenre() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setGenre(string2);
        }
    }

    public void setKeyword(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setKeyword() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setKeywords(string2);
        }
    }

    public void setKidsProtected(boolean bl2) {
        String string2 = "Inside setKidsProtected() ";
        Object object = new StringBuilder(string2);
        ((StringBuilder)object).append(bl2);
        UnityBridge.a(((StringBuilder)object).toString());
        object = this.d;
        if (object != null) {
            if (bl2) {
                Constants$KIDS_PROTECTED constants$KIDS_PROTECTED = Constants$KIDS_PROTECTED.YES;
                ((JioAdView)object).setIsKidsProtected(constants$KIDS_PROTECTED);
            } else {
                Constants$KIDS_PROTECTED constants$KIDS_PROTECTED = Constants$KIDS_PROTECTED.NO;
                ((JioAdView)object).setIsKidsProtected(constants$KIDS_PROTECTED);
            }
        }
    }

    public void setLanguage(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setLanguage() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setLanguage(string2);
        }
    }

    public void setLanguageOfArticle(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setLanguageOfArticle() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setLanguageOfArticle(string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setMetaData(String hashMap) {
        Object object = "Inside setMetaData() ";
        com.jio.unity.plugin.android.a.a((String)object, hashMap);
        try {
            object = this.d;
            if (object == null) return;
            object = new JSONObject(hashMap);
            hashMap = new HashMap();
            Iterator iterator = object.keys();
            while (true) {
                boolean bl2;
                if (!(bl2 = iterator.hasNext())) {
                    object = this.d;
                    ((JioAdView)object).setMetaData(hashMap);
                    return;
                }
                Object object2 = iterator.next();
                object2 = (String)object2;
                String string2 = object.getString(object2);
                hashMap.put(object2, string2);
            }
        }
        catch (Exception exception) {
            return;
        }
    }

    public void setObjects(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setObjects() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setObjects(string2);
        }
    }

    public void setOrientation(int n3) {
        String string2 = " unity B Inside setOrientation() ";
        Object object = new StringBuilder(string2);
        ((StringBuilder)object).append(n3);
        UnityBridge.a(((StringBuilder)object).toString());
        object = this.d;
        if (object != null) {
            object = JioAdView$ORIENTATION_TYPE.PORTRAIT;
            int n4 = 1;
            if (n3 == n4) {
                object = JioAdView$ORIENTATION_TYPE.LANDSCAPE;
            }
            string2 = "unity B  selected orientationType: ";
            Object object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append(object);
            UnityBridge.a(((StringBuilder)object2).toString());
            object2 = this.d;
            ((JioAdView)object2).setOrientation((JioAdView$ORIENTATION_TYPE)((Object)object));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setOrientation(String string2) {
        String string3 = "Inside setOrientation()";
        UnityBridge.a(string3);
        try {
            string3 = this.e;
            if (string3 == null) return;
            String string4 = "setOrientation";
            UnityPlayer.UnitySendMessage((String)string3, (String)string4, (String)string2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void setPackageName(String string2) {
        UnityBridge.a("Inside setPackageName()");
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setPackageName(string2);
        }
    }

    public void setPageCategory(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setPageCategory() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setPageCategory(string2);
        }
    }

    public void setPincode(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setPincode() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setPincode(string2);
        }
    }

    public void setPlacementName(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setPlacementName() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setPlacementName(string2);
        }
    }

    public void setRequestCode(int n3) {
        StringBuilder stringBuilder = new StringBuilder("Inside setRequestCode(): ");
        stringBuilder.append(n3);
        UnityBridge.a(stringBuilder.toString());
        this.f = n3;
        this.d.setRequestCode(n3);
    }

    public void setRequestedAdDuration(int n3) {
        this.d.setRequestedAdDuration(n3);
    }

    public void setSectionCategory(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setSectionCategory() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setSectionCategory(string2);
        }
    }

    public void setShowName(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setShowName() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setShowName(string2);
        }
    }

    public void setState(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setState() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setState(string2);
        }
    }

    public void setUID(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setUID() ", string2);
        JioAds jioAds = JioAds.Companion.getInstance();
        Activity activity = g;
        jioAds.setUID((Context)activity, string2);
    }

    public void setUserAge(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setUserAge() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setAge(string2);
        }
    }

    public void setUserCity(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setUserCity() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setCity(string2);
        }
    }

    public void setUserGender(int n3) {
        String string2 = "Inside setUserGender() ";
        Object object = new StringBuilder(string2);
        ((StringBuilder)object).append(n3);
        UnityBridge.a(((StringBuilder)object).toString());
        object = this.d;
        if (object != null) {
            if (n3 == 0) {
                Constants$GENDER constants$GENDER = Constants$GENDER.MALE;
                ((JioAdView)object).setGender(constants$GENDER);
            } else {
                int n4 = 1;
                if (n3 == n4) {
                    Constants$GENDER constants$GENDER = Constants$GENDER.FEMALE;
                    ((JioAdView)object).setGender(constants$GENDER);
                } else {
                    n4 = 2;
                    if (n3 == n4) {
                        Constants$GENDER constants$GENDER = Constants$GENDER.OTHER;
                        ((JioAdView)object).setGender(constants$GENDER);
                    }
                }
            }
        }
    }

    public void setVendor(String string2) {
        com.jio.unity.plugin.android.a.a("Inside setVendor() ", string2);
        JioAdView jioAdView = this.d;
        if (jioAdView != null) {
            jioAdView.setVendor(string2);
        }
    }
}

