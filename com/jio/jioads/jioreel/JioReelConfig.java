/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  androidx.media3.exoplayer.dash.manifest.DashManifest
 *  androidx.media3.exoplayer.dash.manifest.EventStream
 *  androidx.media3.exoplayer.dash.manifest.Period
 *  androidx.media3.exoplayer.hls.HlsManifest
 *  org.json.JSONObject
 */
package com.jio.jioads.jioreel;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.f$c;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.EventStream;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.hls.HlsManifest;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.jioreel.JioReelConfig$Companion;
import com.jio.jioads.jioreel.adDetection.DashAdDetector$task$1;
import com.jio.jioads.jioreel.adDetection.c;
import com.jio.jioads.jioreel.adDetection.k;
import com.jio.jioads.jioreel.data.StreamType;
import com.jio.jioads.jioreel.listeners.JioReelListener;
import com.jio.jioads.jioreel.network.b;
import com.jio.jioads.jioreel.ssai.e;
import com.jio.jioads.jioreel.ssai.f;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.jioreel.util.PlayerCurrentTime;
import com.jio.jioads.jioreel.vast.interfaces.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class JioReelConfig {
    public static final JioReelConfig$Companion Companion;
    public static JioReelConfig v;
    public final Context a;
    public final JioReelListener b;
    public final String c;
    public String d;
    public k e;
    public final ArrayList f;
    public ExoPlayer g;
    public final String h;
    public final ArrayList i;
    public final ArrayList j;
    public c k;
    public final LinkedHashMap l;
    public HashMap m;
    public long n;
    public String o;
    public com.jio.jioads.jioreel.b p;
    public String q;
    public final com.jio.jioads.jioreel.c r;
    public long s;
    public String t;
    public String u;

    static {
        JioReelConfig$Companion jioReelConfig$Companion;
        Companion = jioReelConfig$Companion = new JioReelConfig$Companion();
    }

    public JioReelConfig(Context object, JioReelListener jioReelListener) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(jioReelListener, "jioReelListener");
        this.a = object;
        this.b = jioReelListener;
        this.c = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        this.f = object;
        this.h = "1.2";
        super();
        this.i = object;
        super();
        this.j = object;
        super();
        this.l = object;
        super();
        this.m = object;
        super();
        this.p = object;
        super(this);
        this.r = object;
        this.t = "";
    }

    public static String a(String object) {
        int n3 = ((String)object).length();
        int n4 = 2;
        if ((n3 %= n4) == 0) {
            Object object2;
            ArrayList<CharSequence> arrayList;
            Object object3 = "<this>";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            Intrinsics.checkNotNullParameter(object, (String)object3);
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object3 = ke3_2.c;
            String string2 = "transform";
            Intrinsics.checkNotNullParameter(object3, string2);
            cb2_0.b(n4, n4);
            n4 = ((String)object).length();
            int n7 = n4 / 2;
            int n8 = n4 % 2;
            int n10 = 0;
            CharSequence charSequence = null;
            if (n8 == 0) {
                n8 = 0;
                arrayList = null;
            } else {
                n8 = 1;
            }
            arrayList = new ArrayList<CharSequence>(n7 += n8);
            while (n10 >= 0 && n10 < n4) {
                n7 = n10 + 2;
                int n14 = n7 >= 0 && n7 <= n4 ? n7 : n4;
                charSequence = ((String)object).subSequence(n10, n14);
                object3.getClass();
                charSequence = ((ke3_2)object3).a(charSequence);
                arrayList.add(charSequence);
                n10 = n7;
            }
            n3 = yx_2.o(arrayList, 10);
            object = new ArrayList(n3);
            object3 = arrayList.iterator();
            while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object2 = (String)object3.next();
                n7 = CharsKt.checkRadix(16);
                n4 = (byte)Integer.parseInt((String)object2, n7);
                object2 = (byte)n4;
                ((ArrayList)object).add(object2);
            }
            object = CollectionsKt.g0(object);
            object3 = Charsets.c;
            object2 = new String((byte[])object, (Charset)object3);
            return object2;
        }
        String string3 = "Must have an even length".toString();
        object = new IllegalArgumentException(string3);
        throw object;
    }

    public static final /* synthetic */ ExoPlayer access$getExoPlayer$p(JioReelConfig jioReelConfig) {
        return jioReelConfig.g;
    }

    public static final /* synthetic */ JioReelConfig access$getINSTANCE$cp() {
        return v;
    }

    public static final /* synthetic */ void access$readDASHManifest(JioReelConfig jioReelConfig, DashManifest dashManifest) {
        jioReelConfig.a(dashManifest);
    }

    public static final /* synthetic */ void access$readHLSManifest(JioReelConfig jioReelConfig, HlsManifest hlsManifest) {
        jioReelConfig.a(hlsManifest);
    }

    public static final /* synthetic */ void access$setExoPlayer$p(JioReelConfig jioReelConfig, ExoPlayer exoPlayer) {
        jioReelConfig.g = exoPlayer;
    }

    public static final /* synthetic */ void access$setINSTANCE$cp(JioReelConfig jioReelConfig) {
        v = jioReelConfig;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void SDKInit() {
        Object object = new StringBuilder("SSAI_VERSION:");
        String string2 = this.h;
        String string3 = "message";
        ir3_0.b((StringBuilder)object, string2, string3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        String string4 = "Publisher called SDKInit for reel-config";
        v12.a(string4, string3, (JioAds$Companion)object);
        try {
            StreamType streamType;
            void var2_8;
            p p2 = com.jio.jioads.jioreel.ssai.p.t;
            StreamType streamType2 = null;
            if (p2 != null) {
                StreamType streamType3 = p2.j;
            } else {
                Object var2_7 = null;
            }
            StreamType streamType4 = StreamType.LIVE;
            if (var2_8 == streamType4) {
                String string5 = "Stream type is LIVE adding exolistner";
                Intrinsics.checkNotNullParameter(string5, string3);
                object = ((JioAds$Companion)object).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = this.g;
                if (object == null) return;
                com.jio.jioads.jioreel.c c2 = this.r;
                object.addListener(c2);
                return;
            }
            p p5 = com.jio.jioads.jioreel.ssai.p.t;
            if (p5 != null) {
                streamType2 = p5.j;
            }
            if (streamType2 != (streamType = StreamType.VOD)) return;
            String string6 = "Stream type is VOD calling init";
            Intrinsics.checkNotNullParameter(string6, string3);
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = this.g;
            if (object == null) return;
            com.jio.jioads.jioreel.c c3 = this.r;
            object.addListener(c3);
            return;
        }
        catch (Exception exception) {
            object = new StringBuilder("Inside exception of SDKinit ");
            Unit unit = Unit.a;
            ((StringBuilder)object).append(unit);
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(DashManifest dashManifest) {
        Object object;
        Object object2;
        long l2;
        int n3;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        JioReelConfig jioReelConfig = this;
        int n4 = 1;
        Object object8 = this.k;
        if (object8 == null) {
            object7 = this.g;
            object6 = this.b;
            object5 = this.a;
            object4 = com.jio.jioads.jioreel.ssai.p.t;
            if (object4 != null) {
                object4 = object4.k;
            } else {
                object3 = 0;
                object4 = null;
            }
            jioReelConfig.k = object8 = new c((ExoPlayer)object7, (JioReelListener)object6, (Context)object5, (com.jio.jioads.jioreel.data.e)((Object)object4));
        }
        char c2 = dashManifest.getPeriodCount();
        char c3 = '\u0000';
        object7 = null;
        char c5 = '\u0000';
        object6 = null;
        while (c5 < c2) {
            char c6;
            char c7;
            block28: {
                block29: {
                    block30: {
                        String string2;
                        String string3;
                        Object object9;
                        block31: {
                            long l3;
                            Object object10;
                            Object object11;
                            block27: {
                                block26: {
                                    block25: {
                                        block23: {
                                            int n7;
                                            Object object12;
                                            block24: {
                                                object5 = dashManifest;
                                                object4 = dashManifest.getPeriod((int)c5);
                                                Intrinsics.checkNotNullExpressionValue(object4, "getPeriod(...)");
                                                object12 = ((Period)object4).id;
                                                if (object12 == null) break block23;
                                                object12 = jioReelConfig.i;
                                                n3 = object12 instanceof Collection;
                                                if (n3 == 0 || (n3 = ((ArrayList)object12).isEmpty()) == 0) {
                                                    object12 = ((ArrayList)object12).iterator();
                                                    while ((n3 = object12.hasNext()) != 0) {
                                                        object11 = ((com.jio.jioads.jioreel.data.dash.a)object12.next()).a;
                                                        object9 = ((Period)object4).id;
                                                        n3 = Intrinsics.areEqual(object11, object9);
                                                        if (n3 == 0) continue;
                                                        break block23;
                                                    }
                                                }
                                                object12 = ((Period)object4).eventStreams;
                                                if (object12 != null && (n7 = object12.isEmpty()) == 0 && (object12 = ((EventStream)((Period)object4).eventStreams.get((int)0)).events) != null && (n7 = ((EventMessage[])object12).length) != 0) break block24;
                                                c7 = c2;
                                                break block25;
                                            }
                                            object12 = com.jio.jioads.jioreel.data.dash.b.a;
                                            object11 = ((EventStream)((Period)object4).eventStreams.get((int)0)).events[0].e;
                                            Intrinsics.checkNotNullExpressionValue(object11, "messageData");
                                            Object object13 = Charsets.UTF_8;
                                            object9 = new String((byte[])object11, (Charset)object13);
                                            jioReelConfig.p.getClass();
                                            object11 = Pattern.compile("\\b[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}:\\d+\\b");
                                            Intrinsics.checkNotNullExpressionValue(object11, "compile(...)");
                                            object11 = ((Pattern)object11).matcher((CharSequence)object9);
                                            object13 = "matcher(...)";
                                            Intrinsics.checkNotNullExpressionValue(object11, (String)object13);
                                            n3 = (int)(((Matcher)object11).find() ? 1 : 0);
                                            c7 = '\u0006';
                                            string3 = "NOWTILUS";
                                            string2 = "JIOREEL";
                                            if (n3 != 0) {
                                                object11 = com.jio.jioads.jioreel.data.dash.b.b;
                                                object10 = new String[]{":"};
                                                object9 = (String)StringsKt.a0((CharSequence)object9, object10, false, 0, c7).get(0);
                                                object13 = com.jio.jioads.jioreel.a.a;
                                                jioReelConfig.q = string2;
                                                l_0.h("adBreak Found and daterange id is ", (String)object9);
                                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                object13 = JioAds$LogLevel.NONE;
                                            } else {
                                                object11 = "vast:";
                                                boolean bl2 = kotlin.text.b.t((String)object9, (String)object11);
                                                if (bl2) {
                                                    object10 = com.jio.jioads.jioreel.data.dash.b.b;
                                                    object11 = new String[]{object11};
                                                    object11 = StringsKt.a0((CharSequence)object9, (String[])object11, false, 0, c7).get(n4);
                                                    object9 = object11;
                                                    object9 = (String)object11;
                                                    object11 = com.jio.jioads.jioreel.a.a;
                                                    jioReelConfig.q = string3;
                                                    object11 = object10;
                                                } else {
                                                    object11 = "type:adslate";
                                                    n3 = (int)(StringsKt.H((CharSequence)object9, (CharSequence)object11) ? 1 : 0);
                                                    object11 = n3 != 0 ? com.jio.jioads.jioreel.data.dash.b.c : object12;
                                                    object9 = null;
                                                }
                                            }
                                            if (object11 == object12) break block23;
                                            object12 = jioReelConfig.i;
                                            n7 = (int)(((ArrayList)object12).isEmpty() ? 1 : 0);
                                            if (n7 != 0) break block26;
                                            object12 = jioReelConfig.i;
                                            n7 = ((ArrayList)object12).isEmpty() ^ n4;
                                            if (n7 == 0) break block23;
                                            object12 = jioReelConfig.i;
                                            object12 = (com.jio.jioads.jioreel.data.dash.a)pp_0.a(n4, (ArrayList)object12);
                                            long l4 = ((com.jio.jioads.jioreel.data.dash.a)object12).b;
                                            c7 = c2;
                                            l3 = ((Period)object4).startMs;
                                            long l7 = l4 - l3;
                                            Object object14 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                            if (object14 >= 0) break block25;
                                            break block27;
                                        }
                                        c7 = c2;
                                        c6 = c5;
                                        break block28;
                                    }
                                    c6 = c5;
                                    break block29;
                                }
                                c7 = c2;
                            }
                            String string4 = ((Period)object4).id;
                            Intrinsics.checkNotNull(string4);
                            l3 = ((Period)object4).startMs;
                            long l8 = ((EventStream)((Period)object4).eventStreams.get((int)0)).events[0].c;
                            c6 = c5;
                            l2 = ((Period)object4).startMs;
                            object4 = ((EventStream)((Period)object4).eventStreams.get((int)0)).events[0];
                            long l12 = ((EventMessage)object4).c;
                            long l14 = l2 + l12;
                            object10 = object2;
                            object2 = new com.jio.jioads.jioreel.data.dash.a(string4, l3, l14, l8, (String)object9, (com.jio.jioads.jioreel.data.dash.b)((Object)object11));
                            object = jioReelConfig.k;
                            if (object == null) break block30;
                            object8 = jioReelConfig.q;
                            object7 = "period";
                            Intrinsics.checkNotNullParameter(object2, (String)object7);
                            c3 = ((Enum)object11).ordinal();
                            c5 = '\u0001';
                            if (c3 == c5) break block31;
                            c2 = '\u0002';
                            if (c3 != c2) break block30;
                            object8 = ((c)object).l;
                            ((ArrayList)object8).add(object2);
                            c2 = (char)(((c)object).u ? 1 : 0);
                            if (c2 == '\u0000' && (c2 = ((ArrayList)(object8 = ((c)object).l)).isEmpty() ^ c5) != '\u0000') {
                                ((f)object).f();
                                object8 = ((f)object).c;
                                if (object8 != null) {
                                    object = ((c)object).x;
                                    object8.post((Runnable)object);
                                }
                            }
                            break block30;
                        }
                        object7 = new Ref$ObjectRef();
                        object6 = com.jio.jioads.jioreel.a.a;
                        c5 = (char)(Intrinsics.areEqual(object8, string2) ? 1 : 0);
                        if (c5 != '\u0000') {
                            object8 = com.jio.jioads.jioreel.ssai.p.t;
                            if (object8 != null && (object8 = ((p)object8).e) != null) {
                                object6 = String.valueOf(object9);
                                object5 = "DATERANGEID";
                                object8 = kotlin.text.b.p((String)object8, (String)object5, (String)object6);
                            } else {
                                c2 = '\u0000';
                                object8 = null;
                            }
                            ((Ref$ObjectRef)object7).element = object8;
                        } else {
                            c2 = (char)(Intrinsics.areEqual(object8, string3) ? 1 : 0);
                            if (c2 != '\u0000') {
                                object8 = new StringBuilder();
                                object6 = com.jio.jioads.jioreel.ssai.p.t;
                                if (object6 != null) {
                                    object6 = object6.e;
                                } else {
                                    c5 = '\u0000';
                                    object6 = null;
                                }
                                ((StringBuilder)object8).append((String)object6);
                                c5 = '/';
                                ((StringBuilder)object8).append(c5);
                                ((StringBuilder)object8).append((String)object9);
                                object6 = ".xml";
                                ((StringBuilder)object8).append((String)object6);
                                ((Ref$ObjectRef)object7).element = object8 = ((StringBuilder)object8).toString();
                            }
                        }
                        object8 = new StringBuilder("dash vasturl is ");
                        l_0.i((String)((Ref$ObjectRef)object7).element, (StringBuilder)object8);
                        object8 = JioAds.Companion;
                        ((JioAds$Companion)object8).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object6 = JioAds$LogLevel.NONE;
                        object6 = (String)((Ref$ObjectRef)object7).element;
                        object5 = new com.jio.jioads.jioreel.adDetection.b((Ref$ObjectRef)object7, (c)object, (com.jio.jioads.jioreel.data.dash.a)object2);
                        object7 = "vastParseListener";
                        Intrinsics.checkNotNullParameter(object5, (String)object7);
                        if (object6 != null) {
                            com.jio.jioads.jioreel.tracker.model.b.g("VAST URL ".concat((String)object6), (JioAds$Companion)object8);
                            object8 = new b();
                            object7 = new e((f)object, (a)object5);
                            n4 = 8;
                            ((b)object8).a(n4, (String)object6, (Function1)object7);
                        }
                    }
                    object = jioReelConfig.i;
                    ((ArrayList)object).add(object2);
                }
                n4 = 1;
            }
            c5 = c6 + 1;
            c2 = c7;
            c3 = '\u0000';
            object7 = null;
        }
        object = jioReelConfig.k;
        if (object == null) return;
        object8 = com.jio.jioads.jioreel.ssai.p.t;
        if (object8 == null) return;
        object8 = ((c)object).j;
        if (object8 == null) return;
        object8 = new PlayerCurrentTime();
        object2 = ((c)object).j;
        Intrinsics.checkNotNull(object2);
        object7 = com.jio.jioads.jioreel.ssai.p.t;
        Intrinsics.checkNotNull(object7);
        c3 = ((p)object7).s;
        object8 = ((PlayerCurrentTime)object8).getLiveWindowTime$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((ExoPlayer)object2, c3 != 0);
        if (object8 == null) return;
        object2 = ((c)object).l;
        c3 = object2 instanceof Collection;
        if (c3 != '\u0000' && (c3 = ((ArrayList)object2).isEmpty()) != '\u0000') {
            return;
        }
        object2 = ((ArrayList)object2).iterator();
        while ((c3 = object2.hasNext()) != '\u0000') {
            long l15;
            long l16;
            long l17;
            object7 = (com.jio.jioads.jioreel.data.dash.a)object2.next();
            l2 = ((com.jio.jioads.jioreel.data.dash.a)object7).b;
            long l18 = (Long)object8;
            long l19 = l2 - l18;
            object3 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
            if (object3 <= 0 && (n3 = (l17 = (l16 = ((com.jio.jioads.jioreel.data.dash.a)object7).c) - (l15 = ((Long)object8).longValue())) == 0L ? 0 : (l17 < 0L ? -1 : 1)) >= 0) {
                c2 = (char)(((c)object).u ? 1 : 0);
                if (c2 != '\u0000') return;
                object8 = ((c)object).l;
                c2 = (char)(((ArrayList)object8).isEmpty() ? 1 : 0);
                c3 = '\u0001';
                if ((c2 ^= c3) == '\u0000') return;
                ((f)object).f();
                object8 = ((f)object).c;
                if (object8 == null) return;
                object = ((c)object).x;
                object8.post((Runnable)object);
                return;
            }
            c3 = '\u0001';
        }
    }

    /*
     * Exception decompiling
     */
    public final void a(HlsManifest var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 18[TRYBLOCK] [19 : 420->425)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void clearConfig() {
        boolean bl2;
        f f5 = this.k;
        if (f5 != null && (bl2 = ((c)f5).u)) {
            DashAdDetector$task$1 dashAdDetector$task$1;
            bl2 = false;
            ((c)f5).u = false;
            Handler handler = f5.c;
            if (handler != null) {
                dashAdDetector$task$1 = ((c)f5).x;
                handler.removeCallbacks((Runnable)dashAdDetector$task$1);
            }
            handler = f5.c;
            dashAdDetector$task$1 = null;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            f5.c = null;
        }
        if ((f5 = this.e) != null) {
            ((k)f5).y();
        }
    }

    public final void destroy() {
        Object object = "message";
        Intrinsics.checkNotNullParameter("Inside destory of JioReelConfig", (String)object);
        Object object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        this.f.clear();
        this.j.clear();
        this.d = null;
        Object object3 = this.e;
        if (object3 != null) {
            String string2 = "Inside  destoryHlsAdDetector";
            v12.a(string2, (String)object, (JioAds$Companion)object2);
            ((k)object3).y.clear();
            object2 = ((k)object3).k;
            if (object2 != null) {
                ((HashMap)object2).clear();
            }
            ((k)object3).x.clear();
            ((k)object3).z.clear();
            ((HashMap)((k)object3).r).clear();
            object2 = ((k)object3).N;
            if (object2 != null) {
                ((HashMap)object2).clear();
            }
            if ((object2 = ((k)object3).D) != null) {
                object2.clear();
            }
            ((k)object3).E = 0;
            ((k)object3).w = null;
            ((k)object3).D = null;
        }
        object2 = this.e;
        long l2 = 0L;
        if (object2 != null) {
            object = ((k)object2).m;
            if (object != null) {
                ((HashMap)object).clear();
            }
            ((k)object2).o = null;
            ((k)object2).v = false;
            ((k)object2).p = null;
            ((k)object2).q = null;
            ((k)object2).u = false;
            ((f)object2).d.clear();
            object = ((k)object2).N;
            if (object != null) {
                ((HashMap)object).clear();
            }
            ((k)object2).A = l2;
            ((k)object2).s = null;
            ((k)object2).t = null;
            object = "common_prefs";
            object3 = "vod_ad_details";
            object2 = ((f)object2).a;
            j_0.f((Context)object2, (String)object, (String)object3);
        }
        this.e = null;
        this.k = null;
        this.t = "";
        this.s = l2;
        object2 = this.g;
        if (object2 != null) {
            object = this.r;
            object2.removeListener((f$c)object);
        }
    }

    public final HashMap getAdBreakeDetailsMap() {
        return this.l;
    }

    public final JSONObject getCreativeData() {
        Object object = com.jio.jioads.jioreel.ssai.p.t;
        String string2 = null;
        if (object != null && (object = (object = this.e) != null ? ((k)object).L : null) != null) {
            object = new JSONObject();
            Object object2 = com.jio.jioads.jioreel.ssai.p.t;
            Intrinsics.checkNotNull(object2);
            object2 = ((p)object2).m;
            String string3 = "adSystem";
            object.put(string3, object2);
            object2 = this.e;
            if (object2 != null) {
                string2 = ((k)object2).L;
            }
            object.put("creativeId", (Object)string2);
            return object;
        }
        return null;
    }

    public final String getCreativeDateRangeId() {
        return this.u;
    }

    public final String getCreativeId() {
        return this.t;
    }

    public final String getDashStreamType() {
        return this.q;
    }

    public final long getStartPDT() {
        return this.s;
    }

    public final com.jio.jioads.jioreel.b getUuidMatcher() {
        return this.p;
    }

    public final String getVastUrl() {
        return this.o;
    }

    public final HashMap getVodAdDetailsMap() {
        return this.m;
    }

    public final void playerTime(long l2, long l3) {
        k k2 = this.e;
        if (k2 != null) {
            k2.I = l2;
            k2.J = l3;
        }
    }

    public final void setCreativeDateRangeId(String string2) {
        this.u = string2;
    }

    public final void setCreativeId(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.t = string2;
    }

    public final void setDashStreamType(String string2) {
        this.q = string2;
    }

    public final void setManifest(Object object) {
        if (object != null) {
            boolean bl2 = object instanceof HlsManifest;
            if (bl2) {
                object = (HlsManifest)object;
                this.a((HlsManifest)object);
            } else {
                bl2 = object instanceof DashManifest;
                if (bl2) {
                    object = (DashManifest)object;
                    this.a((DashManifest)object);
                } else {
                    String string2 = "message";
                    Intrinsics.checkNotNullParameter("Object is not manifest type", string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                }
            }
        }
    }

    public final void setPreponeTimeForSpotAdEnd(int n3) {
        long l2;
        Object object = new StringBuilder("Inside setPreponeTimeForSpotAdEnd time: ");
        object.append(n3);
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        this.n = l2 = (long)(n3 * 1000);
    }

    public final void setStartPDT(long l2) {
        this.s = l2;
    }

    public final void setUuidMatcher(com.jio.jioads.jioreel.b b2) {
        Intrinsics.checkNotNullParameter(b2, "<set-?>");
        this.p = b2;
    }

    public final void setVastUrl(String string2) {
        this.o = string2;
    }

    public final void setVodAdDetailsMap(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.m = hashMap;
    }
}

