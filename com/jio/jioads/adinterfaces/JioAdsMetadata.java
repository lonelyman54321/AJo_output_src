/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.jio.jioads.adinterfaces;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAdsMetadata$Builder;
import com.jio.jioads.util.Utility;
import com.jio.jioads.utils.Constants$GENDER;
import com.jio.jioads.utils.Constants$KIDS_PROTECTED;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class JioAdsMetadata {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public Constants$KIDS_PROTECTED n;
    public Constants$GENDER o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public Map y;

    public JioAdsMetadata(JioAdsMetadata$Builder object) {
        Object object2;
        this.a = object2 = ((JioAdsMetadata$Builder)object).getChannelId();
        this.b = object2 = ((JioAdsMetadata$Builder)object).getChannelName();
        this.c = object2 = ((JioAdsMetadata$Builder)object).getShowName();
        this.d = object2 = ((JioAdsMetadata$Builder)object).getPageCategory();
        this.e = object2 = ((JioAdsMetadata$Builder)object).getSectionCategory();
        this.f = object2 = ((JioAdsMetadata$Builder)object).getLanguageOfArticle();
        this.g = object2 = ((JioAdsMetadata$Builder)object).getLanguage();
        this.h = object2 = ((JioAdsMetadata$Builder)object).getContentId();
        this.i = object2 = ((JioAdsMetadata$Builder)object).getContentTitle();
        this.j = object2 = ((JioAdsMetadata$Builder)object).getContentType();
        this.k = object2 = ((JioAdsMetadata$Builder)object).getVendor();
        this.l = object2 = ((JioAdsMetadata$Builder)object).getActor();
        this.m = object2 = ((JioAdsMetadata$Builder)object).getObjects();
        object2 = ((JioAdsMetadata$Builder)object).isKidsProtected();
        this.n = object2;
        object2 = ((JioAdsMetadata$Builder)object).getGender();
        this.o = object2;
        this.p = object2 = ((JioAdsMetadata$Builder)object).getAppVersion();
        this.q = object2 = ((JioAdsMetadata$Builder)object).getGenre();
        this.r = object2 = ((JioAdsMetadata$Builder)object).getState();
        this.s = object2 = ((JioAdsMetadata$Builder)object).getCity();
        this.t = object2 = ((JioAdsMetadata$Builder)object).getAge();
        this.u = object2 = ((JioAdsMetadata$Builder)object).getCountry();
        this.v = object2 = ((JioAdsMetadata$Builder)object).getPincode();
        this.w = object2 = ((JioAdsMetadata$Builder)object).getKeywords();
        this.x = object2 = ((JioAdsMetadata$Builder)object).getPlacementName();
        this.y = object = ((JioAdsMetadata$Builder)object).getCustomMetadata();
    }

    public /* synthetic */ JioAdsMetadata(JioAdsMetadata$Builder jioAdsMetadata$Builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(jioAdsMetadata$Builder);
    }

    public final String getActor() {
        return this.l;
    }

    public final HashMap getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(Context object) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        Object object2;
        Object object3;
        Object object4;
        Object object5 = this;
        Object object6 = Utility.INSTANCE;
        Object object7 = object;
        object6 = ((Utility)object6).getPredefinedParams$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)object, false);
        object7 = JioAds.Companion;
        Object object8 = ((JioAds$Companion)object7).getInstance().getJioAdsMetaData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object9 = "md_gn";
        Object object10 = "md_iskp";
        String string2 = "md_obj";
        object5 = "md_act";
        object = object7;
        object7 = "md_vnm";
        Object object11 = object6;
        object6 = "md_ctype";
        String string3 = "md_pln";
        String string4 = "md_cttitle";
        Object object12 = "md_kwrds";
        String string5 = "md_ctid";
        Object object13 = "md_pc";
        String string6 = "md_lang";
        Object object14 = "md_co";
        String string7 = "md_loa";
        Object object15 = "md_ag";
        String string8 = "md_scat";
        Object object16 = "md_ci";
        String string9 = "md_pcat";
        Object object17 = "md_st";
        String string10 = "md_shnm";
        Object object18 = "md_gnr";
        String string11 = "md_chnm";
        Object object19 = "md_avr";
        String string12 = "md_chid";
        if (object8 != null) {
            object4 = object9;
            object9 = new LinkedHashMap();
            object3 = object10;
            object10 = ((JioAdsMetadata)object8).a;
            if (object10 != null) {
                object9.put(string12, object10);
            }
            if ((object10 = ((JioAdsMetadata)object8).b) != null) {
                object9.put(string11, object10);
            }
            if ((object10 = ((JioAdsMetadata)object8).c) != null) {
                object9.put(string10, object10);
            }
            if ((object10 = ((JioAdsMetadata)object8).d) != null) {
                object9.put(string9, object10);
            }
            if ((object10 = ((JioAdsMetadata)object8).e) != null) {
                object9.put(string8, object10);
            }
            if ((object10 = ((JioAdsMetadata)object8).f) != null) {
                object9.put(string7, object10);
            }
            if ((object10 = ((JioAdsMetadata)object8).g) != null) {
                object9.put(string6, object10);
            }
            if ((object10 = ((JioAdsMetadata)object8).h) != null) {
                object9.put(string5, object10);
            }
            if ((object10 = ((JioAdsMetadata)object8).i) != null) {
                object9.put(string4, object10);
            }
            if ((object10 = ((JioAdsMetadata)object8).j) != null) {
                object9.put(object6, object10);
            }
            if ((object10 = ((JioAdsMetadata)object8).k) != null) {
                object9.put(object7, object10);
            }
            if ((object10 = ((JioAdsMetadata)object8).l) != null) {
                object9.put(object5, object10);
            }
            if ((object10 = ((JioAdsMetadata)object8).m) != null) {
                object9.put(string2, object10);
            }
            if ((object10 = ((JioAdsMetadata)object8).n) != null) {
                object10 = ((Enum)object10).name();
                object2 = object5;
                object5 = object3;
                object9.put(object3, object10);
            } else {
                object2 = object5;
                object5 = object3;
            }
            object10 = ((JioAdsMetadata)object8).o;
            if (object10 != null) {
                object10 = ((Enum)object10).name();
                object3 = object5;
                object5 = object4;
                object9.put(object4, object10);
            } else {
                object3 = object5;
                object5 = object4;
            }
            object10 = ((JioAdsMetadata)object8).p;
            object4 = object5;
            object5 = object19;
            if (object10 != null) {
                object9.put(object19, object10);
            }
            object10 = ((JioAdsMetadata)object8).q;
            object19 = object5;
            object5 = object18;
            if (object10 != null) {
                object9.put(object18, object10);
            }
            object10 = ((JioAdsMetadata)object8).r;
            object18 = object5;
            object5 = object17;
            if (object10 != null) {
                object9.put(object17, object10);
            }
            object10 = ((JioAdsMetadata)object8).s;
            object17 = object5;
            object5 = object16;
            if (object10 != null) {
                object9.put(object16, object10);
            }
            object10 = ((JioAdsMetadata)object8).t;
            object16 = object5;
            object5 = object15;
            if (object10 != null) {
                object9.put(object15, object10);
            }
            object10 = ((JioAdsMetadata)object8).u;
            object15 = object5;
            object5 = object14;
            if (object10 != null) {
                object9.put(object14, object10);
            }
            object10 = ((JioAdsMetadata)object8).v;
            object14 = object5;
            object5 = object13;
            if (object10 != null) {
                object9.put(object13, object10);
            }
            object10 = ((JioAdsMetadata)object8).w;
            object13 = object5;
            object5 = object12;
            if (object10 != null) {
                object9.put(object12, object10);
            }
            object8 = ((JioAdsMetadata)object8).x;
            object10 = string3;
            if (object8 != null) {
                object9.put(string3, object8);
            }
            object8 = object11;
            ((HashMap)object11).putAll(object9);
        } else {
            object2 = object5;
            object4 = object9;
            object3 = object10;
            object8 = object11;
            object10 = string3;
            object5 = object12;
        }
        object9 = ((JioAds$Companion)object).getInstance().getGlobalMetaData();
        if (object9 != null) {
            ((HashMap)object8).putAll(object9);
        }
        object9 = this;
        object12 = object5;
        string3 = object10;
        object10 = object2;
        object5 = this.a;
        if (object5 != null && (n19 = ((String)object5).length()) > 0) {
            object8.put(string12, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).b) != null && (n18 = ((String)object5).length()) > 0) {
            object8.put(string11, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).c) != null && (n17 = ((String)object5).length()) > 0) {
            object8.put(string10, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).d) != null && (n16 = ((String)object5).length()) > 0) {
            object8.put(string9, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).e) != null && (n15 = ((String)object5).length()) > 0) {
            object8.put(string8, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).f) != null && (n14 = ((String)object5).length()) > 0) {
            object8.put(string7, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).g) != null && (n10 = ((String)object5).length()) > 0) {
            object8.put(string6, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).h) != null && (n8 = ((String)object5).length()) > 0) {
            object8.put(string5, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).i) != null && (n7 = ((String)object5).length()) > 0) {
            object8.put(string4, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).j) != null && (n4 = ((String)object5).length()) > 0) {
            object8.put(object6, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).k) != null && (n3 = ((String)object5).length()) > 0) {
            object8.put(object7, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).l) != null && (n3 = ((String)object5).length()) > 0) {
            object8.put(object10, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).m) != null && (n3 = ((String)object5).length()) > 0) {
            object8.put(string2, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).n) != null && (n3 = ((String)(object6 = ((Constants$KIDS_PROTECTED)((Object)object5)).getValue())).length()) > 0) {
            object5 = ((Constants$KIDS_PROTECTED)((Object)object5)).getValue();
            object6 = object3;
            object8.put(object3, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).o) != null && (n3 = ((String)(object6 = ((Constants$GENDER)((Object)object5)).getValue())).length()) > 0) {
            object5 = ((Constants$GENDER)((Object)object5)).getValue();
            object6 = object4;
            object8.put(object4, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).p) != null && (n3 = ((String)object5).length()) > 0) {
            object6 = object19;
            object8.put(object19, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).q) != null && (n3 = ((String)object5).length()) > 0) {
            object6 = object18;
            object8.put(object18, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).r) != null && (n3 = ((String)object5).length()) > 0) {
            object6 = object17;
            object8.put(object17, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).s) != null && (n3 = ((String)object5).length()) > 0) {
            object6 = object16;
            object8.put(object16, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).t) != null && (n3 = ((String)object5).length()) > 0) {
            object6 = object15;
            object8.put(object15, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).u) != null && (n3 = ((String)object5).length()) > 0) {
            object6 = object14;
            object8.put(object14, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).v) != null && (n3 = ((String)object5).length()) > 0) {
            object6 = object13;
            object8.put(object13, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).w) != null && (n3 = ((String)object5).length()) > 0) {
            object6 = object12;
            object8.put(object12, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).x) != null && (n3 = ((String)object5).length()) > 0) {
            object6 = string3;
            object8.put(string3, object5);
        }
        if ((object5 = ((JioAdsMetadata)object9).y) != null) {
            Intrinsics.checkNotNull(object5);
            object5 = object5.entrySet().iterator();
            while ((n3 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                object6 = (Map.Entry)object5.next();
                string2 = (String)object6.getKey();
                object6 = (String)object6.getValue();
                boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
                if (bl2) continue;
                object7 = "md_";
                n4 = 0;
                string4 = null;
                n7 = (int)(StringsKt.F(string2, (CharSequence)object7, false) ? 1 : 0);
                if (n7 == 0) {
                    string2 = ((String)object7).concat(string2);
                    Intrinsics.checkNotNull(object6);
                    object8.put(string2, object6);
                    continue;
                }
                Intrinsics.checkNotNull(object6);
                object8.put(string2, object6);
            }
        }
        return object8;
    }

    public final String getAge() {
        return this.t;
    }

    public final String getAppVersion() {
        return this.p;
    }

    public final String getChannelId() {
        return this.a;
    }

    public final String getChannelName() {
        return this.b;
    }

    public final String getCity() {
        return this.s;
    }

    public final String getContentId() {
        return this.h;
    }

    public final String getContentTitle() {
        return this.i;
    }

    public final String getContentType() {
        return this.j;
    }

    public final String getCountry() {
        return this.u;
    }

    public final Map getCustomMetadata() {
        return this.y;
    }

    public final Constants$GENDER getGender() {
        return this.o;
    }

    public final String getGenre() {
        return this.q;
    }

    public final String getKeywords() {
        return this.w;
    }

    public final String getLanguage() {
        return this.g;
    }

    public final String getLanguageOfArticle() {
        return this.f;
    }

    public final String getObjects() {
        return this.m;
    }

    public final String getPageCategory() {
        return this.d;
    }

    public final String getPincode() {
        return this.v;
    }

    public final String getPlacementName() {
        return this.x;
    }

    public final String getSectionCategory() {
        return this.e;
    }

    public final String getShowName() {
        return this.c;
    }

    public final String getState() {
        return this.r;
    }

    public final String getVendor() {
        return this.k;
    }

    public final Constants$KIDS_PROTECTED isKIDS_PROTECTED() {
        return this.n;
    }

    public final void setActor(String string2) {
        this.l = string2;
    }

    public final void setAge(String string2) {
        this.t = string2;
    }

    public final void setAppVersion(String string2) {
        this.p = string2;
    }

    public final void setChannelId(String string2) {
        this.a = string2;
    }

    public final void setChannelName(String string2) {
        this.b = string2;
    }

    public final void setCity(String string2) {
        this.s = string2;
    }

    public final void setContentId(String string2) {
        this.h = string2;
    }

    public final void setContentTitle(String string2) {
        this.i = string2;
    }

    public final void setContentType(String string2) {
        this.j = string2;
    }

    public final void setCountry(String string2) {
        this.u = string2;
    }

    public final void setCustomMetadata(Map map2) {
        this.y = map2;
    }

    public final void setGender(Constants$GENDER constants$GENDER) {
        this.o = constants$GENDER;
    }

    public final void setGenre(String string2) {
        this.q = string2;
    }

    public final void setKIDS_PROTECTED(Constants$KIDS_PROTECTED constants$KIDS_PROTECTED) {
        this.n = constants$KIDS_PROTECTED;
    }

    public final void setKeywords(String string2) {
        this.w = string2;
    }

    public final void setLanguage(String string2) {
        this.g = string2;
    }

    public final void setLanguageOfArticle(String string2) {
        this.f = string2;
    }

    public final void setObjects(String string2) {
        this.m = string2;
    }

    public final void setPageCategory(String string2) {
        this.d = string2;
    }

    public final void setPincode(String string2) {
        this.v = string2;
    }

    public final void setPlacementName(String string2) {
        this.x = string2;
    }

    public final void setSectionCategory(String string2) {
        this.e = string2;
    }

    public final void setShowName(String string2) {
        this.c = string2;
    }

    public final void setState(String string2) {
        this.r = string2;
    }

    public final void setVendor(String string2) {
        this.k = string2;
    }
}

