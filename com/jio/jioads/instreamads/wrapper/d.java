/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.wrapper;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.model.q;
import com.jio.jioads.instreamads.wrapper.b;
import com.jio.jioads.instreamads.wrapper.f;
import com.jio.jioads.instreamads.wrapper.h;
import com.jio.jioads.instreamads.wrapper.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class d
implements com.jio.jioads.instreamads.vastparser.listener.b {
    public final /* synthetic */ i a;
    public final /* synthetic */ j b;

    public d(i i3, j j3) {
        this.a = i3;
        this.b = j3;
    }

    /*
     * WARNING - void declaration
     */
    public final void a(m object, String object2, String object3) {
        void var4_6;
        int n3;
        object3 = null;
        if (object != null) {
            List list = ((m)object).c;
        } else {
            n3 = 0;
            Object var4_5 = null;
        }
        i i3 = this.a;
        Object object4 = "message";
        if (var4_6 != null && (n3 = var4_6.isEmpty()) == 0) {
            if (object != null) {
                Object object5;
                Object object6;
                boolean bl2;
                String string2 = i3.a();
                ((m)object).h(string2);
                ArrayList<j> arrayList = new ArrayList<j>();
                Object object7 = ((m)object).c.iterator();
                boolean bl3 = false;
                boolean bl4 = false;
                Object object8 = null;
                while (true) {
                    boolean bl5 = object7.hasNext();
                    bl2 = true;
                    if (!bl5) break;
                    object6 = (j)object7.next();
                    if (object6 == null) continue;
                    object5 = ((j)object6).n;
                    if (object5 != null) {
                        arrayList.add((j)object6);
                        continue;
                    }
                    object5 = ((j)object6).m;
                    if (object5 == null || bl4) continue;
                    arrayList.add((j)object6);
                    bl4 = true;
                }
                object7 = "<set-?>";
                Intrinsics.checkNotNullParameter(arrayList, (String)object7);
                ((m)object).c = arrayList;
                Iterator iterator = arrayList.iterator();
                while (bl4 = iterator.hasNext()) {
                    object8 = (j)iterator.next();
                    if (object8 == null) continue;
                    ((j)object8).p = object2;
                    object6 = i3.a;
                    ((j)object8).r = object5 = ((j)object6).h;
                    object5 = new StringBuilder();
                    String string3 = i3.a();
                    ((StringBuilder)object5).append(string3);
                    ((StringBuilder)object5).append(": vast ad: ");
                    String string4 = ((j)object8).h;
                    ((StringBuilder)object5).append(string4);
                    ((StringBuilder)object5).append(", parent wrapper id: ");
                    String string5 = ((j)object8).p;
                    ((StringBuilder)object5).append(string5);
                    ((StringBuilder)object5).append(", first level parent: ");
                    String string6 = ((j)object8).r;
                    ir3_0.b((StringBuilder)object5, string6, (String)object4);
                    object5 = JioAds.Companion;
                    ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                    boolean bl6 = i3.i;
                    if (!bl6 && (object6 = ((j)object6).k) != null) {
                        ((j)object8).k = object6;
                    }
                    if (bl6) {
                        object6 = ((j)object8).n;
                        if (object6 == null) {
                            object6 = new StringBuilder();
                            String string7 = i3.a();
                            ((StringBuilder)object6).append(string7);
                            String string8 = ": taking first wrapper ad from vast";
                            ((StringBuilder)object6).append(string8);
                            Intrinsics.checkNotNullParameter(((StringBuilder)object6).toString(), (String)object4);
                            object6 = ((JioAds$Companion)object5).getInstance();
                            ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        object6 = i3.d().c;
                        object6.add(object8);
                        continue;
                    }
                    object2 = i3.d().c;
                    object2.add(object8);
                    break;
                }
                object2 = new StringBuilder();
                String string9 = i3.a();
                ((StringBuilder)object2).append(string9);
                ((StringBuilder)object2).append(": wrapperVastModel size: ");
                List list = i3.d().c;
                n3 = list.size();
                ((StringBuilder)object2).append(n3);
                Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), (String)object4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = ((m)object).c;
                boolean bl7 = object2.isEmpty() ^ bl2;
                if (bl7) {
                    bl7 = ((m)object).d;
                    if (bl7) {
                        f f5;
                        object2 = ((m)object).c;
                        if (object2 != null && (object2 = CollectionsKt.e0((Iterable)object2, (Comparator)(object8 = new h(f5 = new f(i3))))) != null) {
                            object2 = CollectionsKt.m0((Collection)object2);
                        } else {
                            bl7 = false;
                            object2 = null;
                        }
                        if (object2 == null) {
                            object2 = ((m)object).c;
                        }
                        Intrinsics.checkNotNullParameter(object2, (String)object7);
                        ((m)object).c = object2;
                        object2 = i3.d();
                        ((m)object2).d = bl2;
                    }
                    if ((bl7 = i3.i) && ((n3 = (object2 = ((m)object).c) instanceof Collection) == 0 || (n3 = (int)(((Collection)object2).isEmpty() ? 1 : 0)) == 0)) {
                        object2 = ((Iterable)object2).iterator();
                        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                            void var4_18;
                            j j3 = (j)object2.next();
                            if (j3 != null) {
                                q q2 = j3.m;
                            } else {
                                n3 = 0;
                                Object var4_17 = null;
                            }
                            if (var4_18 == null) continue;
                            bl7 = true;
                            break;
                        }
                    } else {
                        bl7 = false;
                        object2 = null;
                    }
                    List list2 = ((m)object).c;
                    boolean bl8 = list2 instanceof Collection;
                    if (!bl8 || !(bl8 = ((Collection)list2).isEmpty())) {
                        Iterator iterator2 = ((Iterable)list2).iterator();
                        while (bl8 = iterator2.hasNext()) {
                            object7 = (j)iterator2.next();
                            if (object7 != null) {
                                object7 = ((j)object7).n;
                            } else {
                                bl8 = false;
                                object7 = null;
                            }
                            if (object7 == null) continue;
                            bl3 = true;
                            break;
                        }
                    }
                    if (!bl7 && bl3) {
                        object = new StringBuilder();
                        object2 = i3.a();
                        ((StringBuilder)object).append((String)object2);
                        object2 = ": onRedirectionFinish";
                        ((StringBuilder)object).append((String)object2);
                        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), (String)object4);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                        object = i3.b;
                        if (object != null) {
                            object2 = i3.d();
                            object.a((m)object2);
                        }
                    } else {
                        object = ((m)object).c.iterator();
                        while (bl7 = object.hasNext()) {
                            String string10;
                            Object v4;
                            void var4_27;
                            q q6;
                            object2 = (j)object.next();
                            if (object2 != null && (q6 = ((j)object2).m) != null) {
                                String string11 = q6.e;
                            } else {
                                n3 = 0;
                                Object var4_26 = null;
                            }
                            if (var4_27 == null || (n3 = var4_27.length()) == 0) continue;
                            object = i3.f;
                            Intrinsics.checkNotNull(object2);
                            String string12 = ((j)object2).h;
                            n3 = (int)(((HashMap)object).containsKey(string12) ? 1 : 0);
                            if (n3 != 0 && (n3 = (int)(Intrinsics.areEqual(v4 = ((HashMap)object).get(string10 = ((j)object2).h), object4 = (object4 = ((j)object2).m) != null ? ((q)object4).e : null) ? 1 : 0)) != 0) {
                                object = i3.b;
                                if (object != null) {
                                    b b2 = com.jio.jioads.instreamads.wrapper.b.c;
                                    object.b(null, (j)object2, b2);
                                }
                            } else {
                                String string13 = ((j)object2).h;
                                object4 = ((j)object2).m;
                                if (object4 != null) {
                                    object3 = ((q)object4).e;
                                }
                                ((HashMap)object).put(string13, object3);
                                i3.b((j)object2);
                            }
                            break;
                        }
                    }
                }
            } else {
                i3.getClass();
            }
        } else {
            object2 = new StringBuilder();
            object3 = i3.a();
            ((StringBuilder)object2).append((String)object3);
            object3 = ": error in wrapper: empty vast ads after parsing";
            ((StringBuilder)object2).append((String)object3);
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), (String)object4);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = i3.b;
            if (object2 != null) {
                object3 = this.b;
                b b3 = com.jio.jioads.instreamads.wrapper.b.d;
                object2.b((m)object, (j)object3, b3);
            }
        }
    }

    public final void a(String object) {
        object = this.a.b;
        if (object != null) {
            b b2 = com.jio.jioads.instreamads.wrapper.b.e;
            j j3 = this.b;
            object.b(null, j3, b2);
        }
    }
}

