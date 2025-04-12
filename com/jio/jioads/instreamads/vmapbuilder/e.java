/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vmapbuilder;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.W;
import com.jio.jioads.controller.o;
import com.jio.jioads.instreamads.vmapbuilder.JioAdsVMAPBuilder;
import com.jio.jioads.instreamads.vmapbuilder.JioAdsVMAPInfo;
import com.jio.jioads.instreamads.vmapbuilder.JioAdsVMAPListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class e
implements W {
    public final /* synthetic */ Object a;
    public final /* synthetic */ JioAdsVMAPBuilder b;
    public final /* synthetic */ JioAdsVMAPInfo c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ Ref$ObjectRef e;
    public final /* synthetic */ long f;
    public final /* synthetic */ JioAdsVMAPListener g;

    public e(Object object, JioAdsVMAPBuilder jioAdsVMAPBuilder, JioAdsVMAPInfo jioAdsVMAPInfo, Ref$IntRef ref$IntRef, Ref$ObjectRef ref$ObjectRef, long l2, JioAdsVMAPListener jioAdsVMAPListener) {
        this.a = object;
        this.b = jioAdsVMAPBuilder;
        this.c = jioAdsVMAPInfo;
        this.d = ref$IntRef;
        this.e = ref$ObjectRef;
        this.f = l2;
        this.g = jioAdsVMAPListener;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(JioAdError object, Integer object2) {
        int n3;
        Object object3 = new StringBuilder();
        Object object4 = this.c.getMidRollAdspot();
        object3.append((String)object4);
        object4 = ": Fetching midroll for ";
        object3.append((String)object4);
        object3.append(object2);
        object3.append(" is failed ");
        object2 = null;
        if (object != null) {
            object4 = ((JioAdError)object).getErrorTitle();
        } else {
            n3 = 0;
            object4 = null;
        }
        ir3_0.b(object3, (String)object4, "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = this.a;
        object4 = this.d;
        JioAdsVMAPBuilder jioAdsVMAPBuilder = this.b;
        JioAdsVMAPInfo jioAdsVMAPInfo = this.c;
        Object object5 = this.g;
        Ref$ObjectRef ref$ObjectRef = this.e;
        synchronized (object3) {
            Throwable throwable2;
            block10: {
                block7: {
                    block8: {
                        int n4;
                        int n7;
                        block9: {
                            try {
                                int n8 = ((Ref$IntRef)object4).element;
                                n7 = 1;
                                ((Ref$IntRef)object4).element = n8 += n7;
                                n8 = jioAdsVMAPBuilder.getMidRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() + n7;
                                jioAdsVMAPBuilder.setMidRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(n8);
                                List list = jioAdsVMAPInfo.getCuePoints();
                                if (list == null || (n3 = ((Ref$IntRef)object4).element) != (n8 = list.size())) break block7;
                                JioAdsVMAPBuilder.access$setMidrollSelectionCompleted$p(jioAdsVMAPBuilder, n7 != 0);
                                n3 = 0;
                                object4 = null;
                                jioAdsVMAPBuilder.a((JioAdsVMAPListener)object5, false);
                                object5 = ref$ObjectRef.element;
                                object5 = (JioAdView)object5;
                                if (object5 == null || (object5 = ((JioAdView)object5).getAdViewController$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == null) break block8;
                                if (object == null) break block9;
                                object2 = ((JioAdError)object).getErrorTitle();
                            }
                            catch (Throwable throwable2) {
                                break block10;
                            }
                        }
                        if ((object = jioAdsVMAPInfo.getCuePoints()) != null) {
                            n4 = object.size();
                        } else {
                            n4 = 0;
                            object = null;
                        }
                        int n10 = jioAdsVMAPBuilder.getMidRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        ((o)object5).u((String)object2, n4, n10, n7 != 0);
                    }
                    jioAdsVMAPBuilder.setMidRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(0);
                }
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(JioAdView jioAdView, ArrayList arrayList, String string2, Integer n3, boolean bl2) {
        Object object = this;
        Object object2 = this.a;
        Object object3 = this.b;
        JioAdsVMAPInfo jioAdsVMAPInfo = this.c;
        Ref$IntRef ref$IntRef = this.d;
        Ref$ObjectRef ref$ObjectRef = this.e;
        long l2 = this.f;
        JioAdsVMAPListener jioAdsVMAPListener = this.g;
        synchronized (object2) {
            Throwable throwable2;
            block13: {
                block12: {
                    int n4;
                    JioAds$Companion jioAds$Companion;
                    int n7;
                    Object object4 = string2;
                    try {
                        int n8;
                        Object object5;
                        JioAdsVMAPBuilder.access$setCurrMidrollAdSeq$p((JioAdsVMAPBuilder)object3, string2);
                        if (n3 == null || (n7 = n3.intValue()) <= 0) break block12;
                        n7 = n3;
                        String string3 = JioAdsVMAPBuilder.access$getFormattedTime((JioAdsVMAPBuilder)object3, n7);
                        object4 = new StringBuilder();
                        Object object6 = jioAdsVMAPInfo.getMidRollAdspot();
                        ((StringBuilder)object4).append((String)object6);
                        object6 = ": Formatted cue points ";
                        ((StringBuilder)object4).append((String)object6);
                        ((StringBuilder)object4).append(string3);
                        object4 = ((StringBuilder)object4).toString();
                        object6 = "message";
                        Intrinsics.checkNotNullParameter(object4, (String)object6);
                        jioAds$Companion = JioAds.Companion;
                        object4 = jioAds$Companion.getInstance();
                        ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object4 = JioAds$LogLevel.NONE;
                        object4 = JioAdsVMAPBuilder.access$getMidrollADBreak$p((JioAdsVMAPBuilder)object3);
                        if (object4 == null) {
                            object4 = new StringBuffer();
                        }
                        JioAdsVMAPBuilder.access$setMidrollADBreak$p((JioAdsVMAPBuilder)object3, (StringBuffer)object4);
                        StringBuffer stringBuffer = JioAdsVMAPBuilder.access$getMidrollADBreak$p((JioAdsVMAPBuilder)object3);
                        if (stringBuffer != null) {
                            object5 = jioAdsVMAPInfo.getMidRollAdspot();
                            object4 = object3;
                            object6 = string3;
                            object = stringBuffer;
                            object4 = JioAdsVMAPBuilder.access$generateADBreakTagForMidroll((JioAdsVMAPBuilder)object3, string3, arrayList, (String)object5, jioAdView, bl2);
                            stringBuffer.append((StringBuffer)object4);
                        }
                        object = new StringBuilder();
                        object4 = jioAdsVMAPInfo.getMidRollAdspot();
                        ((StringBuilder)object).append((String)object4);
                        object4 = ": Fetching... midroll for ";
                        ((StringBuilder)object).append((String)object4);
                        ((StringBuilder)object).append(string3);
                        object4 = " is success & adsize: ";
                        ((StringBuilder)object).append((String)object4);
                        n7 = 0;
                        object4 = null;
                        if (arrayList != null) {
                            n4 = arrayList.size();
                            object6 = n4;
                        } else {
                            n4 = 0;
                            object6 = null;
                        }
                        ((StringBuilder)object).append(object6);
                        object = ((StringBuilder)object).toString();
                        object6 = "message";
                        Intrinsics.checkNotNullParameter(object, (String)object6);
                        object = jioAds$Companion.getInstance();
                        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        int n10 = ref$IntRef.element;
                        n4 = 1;
                        ref$IntRef.element = n10 += n4;
                        object = jioAdsVMAPInfo.getCuePoints();
                        if (object != null && (n8 = ref$IntRef.element) == (n10 = object.size())) {
                            object = ref$ObjectRef.element;
                            if ((object = (JioAdView)object) != null && (object = ((JioAdView)object).getAdViewController$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                                object5 = jioAdsVMAPInfo.getCuePoints();
                                if (object5 != null) {
                                    n8 = object5.size();
                                } else {
                                    n8 = 0;
                                    object5 = null;
                                }
                                int n14 = ((JioAdsVMAPBuilder)object3).getMidRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                ((o)object).u(null, n8, n14, n4 != 0);
                            }
                        }
                        if ((object = jioAdsVMAPInfo.getCuePoints()) == null || (n7 = ref$IntRef.element) != (n10 = object.size())) break block12;
                        object = new StringBuilder();
                        object4 = jioAdsVMAPInfo.getMidRollAdspot();
                        ((StringBuilder)object).append((String)object4);
                        object4 = ": Midroll fetch for all cue points is completed and time taken:  ";
                        ((StringBuilder)object).append((String)object4);
                        long l3 = System.currentTimeMillis() - l2;
                        n7 = 100;
                    }
                    catch (Throwable throwable2) {
                        break block13;
                    }
                    long l4 = n7;
                    ((StringBuilder)object).append(l3 /= l4);
                    object4 = " MS";
                    ((StringBuilder)object).append((String)object4);
                    object = ((StringBuilder)object).toString();
                    object4 = "message";
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    object = jioAds$Companion.getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAdsVMAPBuilder.access$setMidrollSelectionCompleted$p((JioAdsVMAPBuilder)object3, n4 != 0);
                    ((JioAdsVMAPBuilder)object3).a(jioAdsVMAPListener, false);
                    ((JioAdsVMAPBuilder)object3).setMidRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(0);
                }
                object3 = Unit.a;
                return;
            }
            throw throwable2;
        }
    }
}

