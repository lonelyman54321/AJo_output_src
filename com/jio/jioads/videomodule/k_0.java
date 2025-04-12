/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.videomodule;

import android.content.Context;
import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdEvent;
import com.jio.jioads.adinterfaces.JioAdEvent$AdEventType;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import com.jio.jioads.util.p;
import com.jio.jioads.videomodule.b;
import com.jio.jioads.videomodule.h_0;
import com.jio.jioads.videomodule.j_0;
import com.jio.jioads.videomodule.player.callback.a;
import com.jio.jioads.videomodule.player.k;
import com.jio.jioads.videomodule.player.state.JioPlayerState;
import com.jio.jioads.videomodule.renderer.e;
import com.jio.jioads.videomodule.renderer.f;
import com.jio.jioads.videomodule.s;
import com.jio.jioads.videomodule.w_0;
import com.jio.jioads.videomodule.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.videomodule.K
 */
public final class k_0
implements a {
    public final /* synthetic */ s a;

    public k_0(s s7) {
        this.a = s7;
    }

    public final void a() {
        Object object = j_0.a;
        Object object2 = this.a;
        object2.B = object;
        object = object2.e0;
        if (object != null) {
            ((e)object).a();
        }
        if ((object = object2.z) != null) {
            object2 = b.d;
            object.onMediaPlaybackChange((b)((Object)object2));
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void a(boolean bl2) {
        int n3;
        int n4;
        Object object = this.a;
        int n7 = 0;
        com.jio.jioads.videomodule.config.a a2 = null;
        ((s)object).w = false;
        ((s)object).M = false;
        Object object2 = ((s)object).e0;
        if (object2 != null) {
            ((e)object2).a(false);
        }
        if ((n4 = ((s)object).x) <= 0) {
            object2 = JioEventTracker$TrackingEvents.EVENT_COMPLETE;
            n3 = ((s)object).P;
            String string2 = ((s)object).T();
            ((s)object).y((JioEventTracker$TrackingEvents)((Object)object2), n3, string2);
        }
        if ((n4 = l_0.a((ArrayList)(object2 = ((s)object).O))) != (n3 = 1) && (n4 = (int)(((ArrayList)(object2 = ((s)object).O)).isEmpty() ? 1 : 0)) == 0) {
            ((s)object).P = n7 = ((s)object).P + n3;
            s.a0((s)object);
        } else {
            int n8;
            Object object3;
            object2 = ((s)object).X;
            if (object2 != null) {
                n4 = object2.getDuration();
            } else {
                n4 = 0;
                object2 = null;
            }
            int n10 = 1000;
            n4 /= n10;
            Object object4 = ((s)object).z;
            String string3 = "";
            if (object4 != null) {
                int n14;
                object3 = ((s)object).T();
                if (object3 == null) {
                    object3 = string3;
                }
                n8 = ((s)object).P;
                Number number = ((s)object).V;
                if (number != null) {
                    long l2 = number;
                    n14 = (int)l2;
                    number = n14;
                } else {
                    number = null;
                }
                n14 = n4;
                object4.onAdComplete((String)object3, n8, n4, n4, (Integer)number);
            }
            ((s)object).W = n3;
            object4 = ((s)object).g0();
            boolean n15 = ((com.jio.jioads.videomodule.config.a)object4).s;
            if (n15) {
                a2 = ((s)object).g0();
                n7 = (int)(a2.t ? 1 : 0);
                if (n7 == 0) {
                    ((s)object).f();
                    ((s)object).N();
                }
            } else {
                object4 = ((s)object).d.K();
                if (object4 == (object3 = JioAdView$AD_TYPE.INTERSTITIAL)) {
                    com.jio.jioads.videomodule.callback.a a3;
                    object4 = ((s)object).e0;
                    if (object4 != null) {
                        long l2 = n4;
                        ((e)object4).h(l2, l2);
                    }
                    if ((object2 = ((s)object).e0) != null) {
                        void var18_22;
                        long l3;
                        int n14;
                        boolean bl3 = ((s)object).d();
                        if (bl3 && (object4 = ((s)object).y) != null && (n14 = ((f)object4).c()) == n3) {
                            boolean bl4 = true;
                        } else {
                            boolean bl5 = false;
                            object4 = null;
                        }
                        object3 = ((s)object).R;
                        Number number = ((s)object).T;
                        if (number != null) {
                            n8 = number;
                            l3 = n8;
                        } else {
                            l3 = 0L;
                        }
                        long l4 = n10;
                        number = l3 /= l4;
                        ((e)object2).j((boolean)var18_22, (String)object3, (Long)number);
                    }
                    if ((a3 = ((s)object).z) != null) {
                        object2 = ((s)object).T();
                        Object object5 = object2 == null ? string3 : object2;
                        n4 = ((s)object).P;
                        int n16 = n4 + 1;
                        object2 = ((s)object).X;
                        int n17 = object2 != null ? (n4 = object2.getCurrentPosition() / n10) : 0;
                        object2 = ((s)object).X;
                        int n18 = object2 != null ? (n4 = object2.getDuration() / n10) : 0;
                        object = ((s)object).V;
                        if (object != null) {
                            long l7 = (Long)object;
                            n7 = (int)l7;
                        }
                        Integer n19 = n7;
                        a3.onAdSkippable((String)object5, n16, n17, n18, n19);
                    }
                }
            }
        }
    }

    public final void b() {
        Object object = h_0.a;
        Object object2 = this.a;
        object2.B = object;
        object = object2.e0;
        if (object != null) {
            ((e)object).b();
        }
        if ((object = object2.z) != null) {
            object2 = b.c;
            object.onMediaPlaybackChange((b)((Object)object2));
        }
    }

    public final void c() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        Exception exception2;
        Object object;
        Object object2;
        Object object3;
        int n3;
        int n4;
        Object object4;
        Object object5;
        Object object6;
        int n7;
        s s7;
        Object object7;
        block41: {
            int n8;
            Object object8;
            block37: {
                int n10;
                block38: {
                    block40: {
                        block39: {
                            object7 = "";
                            s7 = this.a;
                            n7 = 0;
                            object6 = null;
                            object5 = null;
                            try {
                                object8 = s7.e0;
                                s7.G();
                                object8 = s7.g0();
                                n8 = ((com.jio.jioads.videomodule.config.a)object8).r;
                                object4 = s7.b;
                                n4 = 1;
                                if (n8 != 0) {
                                    int n14;
                                    Object object9;
                                    object8 = s7.O;
                                    n8 = l_0.a((ArrayList)object8);
                                    if (n8 > n4) {
                                        object8 = s7.O;
                                        object8 = l_0.b(n4, (ArrayList)object8);
                                        if ((object8 = (com.jio.jioads.instreamads.vastparser.model.k)object8) != null) {
                                            object8 = ((com.jio.jioads.instreamads.vastparser.model.k)object8).c;
                                        } else {
                                            n8 = 0;
                                            object8 = null;
                                        }
                                        object9 = s7.O;
                                        object9 = l_0.b(n4, (ArrayList)object9);
                                        object9 = (com.jio.jioads.instreamads.vastparser.model.k)object9;
                                        if (object9 != null) {
                                            object9 = ((com.jio.jioads.instreamads.vastparser.model.k)object9).p;
                                        } else {
                                            boolean bl2 = false;
                                            object9 = null;
                                        }
                                        Object object10 = s7.O;
                                        object10 = l_0.b(n4, (ArrayList)object10);
                                        object10 = (com.jio.jioads.instreamads.vastparser.model.k)object10;
                                        n14 = s7.q((com.jio.jioads.instreamads.vastparser.model.k)object10);
                                        ((m)object4).j((String)object8);
                                        object8 = s7.O;
                                        object8 = l_0.c((ArrayList)object8, n4);
                                        object8 = (com.jio.jioads.instreamads.vastparser.model.k)object8;
                                    } else {
                                        n8 = 0;
                                        object8 = null;
                                        boolean bl3 = false;
                                        object9 = null;
                                        n14 = 0;
                                        Object var12_20 = null;
                                    }
                                    s7.x((com.jio.jioads.instreamads.vastparser.model.k)object8, false);
                                    object8 = s7.z;
                                    if (object8 == null) return;
                                    object8.onPlayerError(n14, (String)object9);
                                    return;
                                }
                                object8 = s7.O;
                                n8 = l_0.a((ArrayList)object8);
                                n3 = 2;
                                object3 = ": player error for adId: ";
                                object2 = "message";
                                if (n8 > n3) {
                                    object8 = s7.O;
                                    object8 = l_0.b(n4, (ArrayList)object8);
                                    if ((object8 = (com.jio.jioads.instreamads.vastparser.model.k)object8) != null) {
                                        object8 = ((com.jio.jioads.instreamads.vastparser.model.k)object8).a;
                                    } else {
                                        n8 = 0;
                                        object8 = null;
                                    }
                                    Object object11 = s7.O;
                                    object11 = l_0.b(n4, (ArrayList)object11);
                                    object11 = (com.jio.jioads.instreamads.vastparser.model.k)object11;
                                    if (object11 != null) {
                                        object11 = ((com.jio.jioads.instreamads.vastparser.model.k)object11).c;
                                    } else {
                                        n3 = 0;
                                        object11 = null;
                                    }
                                    Object object12 = s7.O;
                                    object12 = l_0.b(n4, (ArrayList)object12);
                                    object12 = (com.jio.jioads.instreamads.vastparser.model.k)object12;
                                    if (object12 != null) {
                                        object12 = ((com.jio.jioads.instreamads.vastparser.model.k)object12).p;
                                    } else {
                                        boolean bl4 = false;
                                        object12 = null;
                                    }
                                    Object object13 = s7.O;
                                    object13 = l_0.b(n4, (ArrayList)object13);
                                    object13 = (com.jio.jioads.instreamads.vastparser.model.k)object13;
                                    int n15 = s7.q((com.jio.jioads.instreamads.vastparser.model.k)object13);
                                    ((m)object4).j((String)object11);
                                    object4 = s7.O;
                                    object4 = l_0.c((ArrayList)object4, n4);
                                    object4 = (com.jio.jioads.instreamads.vastparser.model.k)object4;
                                    StringBuilder stringBuilder = new StringBuilder();
                                    String string2 = s7.R();
                                    stringBuilder.append(string2);
                                    stringBuilder.append((String)object3);
                                    stringBuilder.append((String)object11);
                                    object11 = ", errorVideoUrl: ";
                                    stringBuilder.append((String)object11);
                                    stringBuilder.append((String)object8);
                                    object8 = stringBuilder.toString();
                                    Intrinsics.checkNotNullParameter(object8, object2);
                                    object8 = JioAds.Companion;
                                    object11 = ((JioAds$Companion)object8).getInstance();
                                    ((JioAds)object11).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    object11 = JioAds$LogLevel.NONE;
                                    object11 = new StringBuilder();
                                    object3 = s7.R();
                                    ((StringBuilder)object11).append((String)object3);
                                    object3 = ": player error preparing next ad";
                                    ((StringBuilder)object11).append((String)object3);
                                    object11 = ((StringBuilder)object11).toString();
                                    Intrinsics.checkNotNullParameter(object11, object2);
                                    object8 = ((JioAds$Companion)object8).getInstance();
                                    ((JioAds)object8).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    s7.x((com.jio.jioads.instreamads.vastparser.model.k)object4, false);
                                    object8 = s7.z;
                                    if (object8 != null) {
                                        object8.onPlayerError(n15, (String)object12);
                                    }
                                    break block37;
                                }
                                object8 = s7.X;
                                if (object8 == null || (n8 = (int)(object8.isPlaying() ? 1 : 0)) != 0) break block38;
                                object8 = s7.X;
                                if (object8 != null) {
                                    object8 = object8.c();
                                } else {
                                    n8 = 0;
                                    object8 = null;
                                }
                                object = JioPlayerState.COMPLETED;
                                if (object8 != object) break block38;
                                n8 = s7.P;
                                if (n8 <= 0) break block37;
                                object8 = s7.X;
                                if (object8 == null) break block39;
                                n8 = object8.getDuration();
                                break block40;
                            }
                            catch (Exception exception2) {
                                break block41;
                            }
                        }
                        n8 = 0;
                        object8 = null;
                    }
                    int n16 = n8 / 1000;
                    object8 = s7.O;
                    object8 = l_0.j((ArrayList)object8);
                    object8 = (com.jio.jioads.instreamads.vastparser.model.k)object8;
                    s7.x((com.jio.jioads.instreamads.vastparser.model.k)object8, false);
                    object = s7.z;
                    if (object != null) {
                        Object object14;
                        object8 = s7.T();
                        object3 = object8 == null ? object7 : object8;
                        int n17 = s7.P;
                        object8 = s7.V;
                        if (object8 != null) {
                            long l2 = (Long)object8;
                            int n18 = (int)l2;
                            object14 = object8 = Integer.valueOf(n18);
                        } else {
                            object14 = null;
                        }
                        int n19 = n16;
                        object.onAdComplete((String)object3, n17, n16, n16, (Integer)object14);
                    }
                    s7.f();
                    s.I(s7);
                    break block37;
                }
                object8 = s7.O;
                object8 = l_0.b(n4, (ArrayList)object8);
                if ((object8 = (com.jio.jioads.instreamads.vastparser.model.k)object8) != null) {
                    object8 = ((com.jio.jioads.instreamads.vastparser.model.k)object8).a;
                } else {
                    n8 = 0;
                    object8 = null;
                }
                object = s7.O;
                object = l_0.b(n4, (ArrayList)object);
                object = (com.jio.jioads.instreamads.vastparser.model.k)object;
                if (object != null) {
                    object = ((com.jio.jioads.instreamads.vastparser.model.k)object).c;
                } else {
                    n3 = 0;
                    object = null;
                }
                if (object != null && (n10 = ((String)object).length()) != 0) {
                    ((m)object4).j((String)object);
                    object4 = s7.O;
                    object4 = l_0.c((ArrayList)object4, n4);
                    object4 = (com.jio.jioads.instreamads.vastparser.model.k)object4;
                    s7.x((com.jio.jioads.instreamads.vastparser.model.k)object4, false);
                }
                object4 = new StringBuilder();
                String string3 = s7.R();
                ((StringBuilder)object4).append(string3);
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append((String)object);
                object = ", errorUrl: ";
                ((StringBuilder)object4).append((String)object);
                ((StringBuilder)object4).append((String)object8);
                object8 = ((StringBuilder)object4).toString();
                Intrinsics.checkNotNullParameter(object8, object2);
                object8 = JioAds.Companion;
                object8 = ((JioAds$Companion)object8).getInstance();
                ((JioAds)object8).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object8 = JioAds$LogLevel.NONE;
            }
            if ((object8 = s7.z) == null) return;
            Intrinsics.checkNotNull(object8);
            n8 = (int)(object8.canPrepareNextVideoAd(n4) ? 1 : 0);
            if (n8 == 0) return;
            s7.B(null);
            return;
        }
        int n20 = s7.P;
        if (n20 > 0) {
            Object object15 = s7.X;
            if (object15 != null) {
                n7 = object15.getDuration();
            }
            int n21 = n7 / 1000;
            object15 = s7.z;
            if (object15 != null) {
                object6 = s7.T();
                object4 = object6 == null ? object7 : object6;
                n4 = s7.P;
                object7 = s7.V;
                if (object7 != null) {
                    long l3 = object7.longValue();
                    int n22 = (int)l3;
                    object5 = n22;
                }
                object2 = object5;
                n3 = n21;
                object15.onAdComplete((String)object4, n4, n21, n21, (Integer)object5);
            }
        } else {
            object6 = JioAdError.Companion;
            object5 = JioAdError$JioAdErrorType.ERROR_PLAYER_PREPARATION_FAILED;
            object6.getClass();
            JioAdError jioAdError = t_0.a((JioAdError$JioAdErrorType)((Object)object5));
            object4 = s7.z;
            if (object4 != null) {
                String string4;
                String string5;
                block42: {
                    object3 = d.a;
                    object6 = new StringBuilder("exception in onError2: ");
                    object5 = "<this>";
                    Intrinsics.checkNotNullParameter(exception2, (String)object5);
                    try {
                        object5 = exception2.getStackTrace();
                        Intrinsics.checkNotNull(object5);
                        object2 = tp_2.K(object5);
                        string5 = "\n";
                        p p2 = p.c;
                        int n24 = 30;
                        boolean bl5 = false;
                        string4 = null;
                        Object var19_37 = null;
                        object7 = CollectionsKt.R((Iterable)object2, string5, null, null, p2, n24);
                    }
                    catch (Exception exception3) {
                        object5 = exception2.getMessage();
                        if (object5 == null) break block42;
                        object7 = object5;
                    }
                }
                ((StringBuilder)object6).append((String)object7);
                string4 = ((StringBuilder)object6).toString();
                string5 = "JioVideoView";
                n3 = 0;
                object = null;
                object2 = "onError()";
                object4.onFailedToLoad(jioAdError, false, (d)((Object)object3), (String)object2, string5, string4);
            }
        }
        s7.f();
    }

    public final void e() {
        Object object = x.a;
        Object object2 = this.a;
        object2.getClass();
        String string2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object, string2);
        object2.A = object;
        object = object2.u;
        if (object != null) {
            ((k)object).start();
        }
        if ((object = object2.e0) != null) {
            ((e)object).e();
        }
        object2.o();
        object = object2.z;
        if (object != null) {
            object2 = b.a;
            object.onMediaPlaybackChange((b)((Object)object2));
        }
    }

    public final void f() {
        Object object = this.a;
        Object object2 = null;
        ((s)object).M = false;
        int n3 = 1;
        ((s)object).w = n3;
        Object object3 = ((s)object).Q;
        if (object3 != null) {
            object3.cancel();
        }
        object3 = new StringBuilder();
        String string2 = ": Media Player 2 prepared for trackNumber: ";
        com.jio.jioads.jioreel.tracker.model.b.d((s)object, (StringBuilder)object3, string2);
        int n4 = ((s)object).P + n3;
        object3.append(n4);
        object2 = object3.toString();
        object3 = "message";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = ((s)object).t;
        if (object2 != null && (n3 = (int)(object2.isPlaying() ? 1 : 0)) == 0) {
            object2 = ((s)object).t;
            if (object2 != null) {
                object2 = object2.c();
            } else {
                n3 = 0;
                object2 = null;
            }
            object3 = JioPlayerState.COMPLETED;
            if (object2 == object3) {
                object = ((s)object).u;
                if (object != null) {
                    ((k)object).start();
                }
                this.i();
            }
        }
    }

    public final void g() {
        Object object = this.a;
        Object object2 = ((s)object).Z;
        if (object2 != null) {
            object2.cancel();
        }
        ((s)object).Z = null;
        object2 = w_0.a;
        object.getClass();
        String string2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object2, string2);
        ((s)object).A = object2;
        object2 = ((s)object).u;
        if (object2 != null) {
            object2.pause();
        }
        if ((object2 = ((s)object).e0) != null) {
            object2.g();
        }
        if ((object = ((s)object).z) != null) {
            object2 = b.b;
            object.onMediaPlaybackChange((b)((Object)object2));
        }
    }

    public final void h(long l2, long l3) {
        Object object;
        Object object2;
        Object object3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (object3 > 0) {
            this.a(false);
            return;
        }
        Object object4 = this.a;
        Object object5 = ((s)object4).f;
        if (object5 != null) {
            object5 = ((s)object4).J;
            object2 = String.valueOf(l2);
            ((HashMap)object5).put("duration", object2);
            object2 = String.valueOf(l3);
            Object object6 = "progress";
            ((HashMap)object5).put(object6, object2);
            object2 = ((s)object4).f;
            if (object2 != null) {
                object = JioAdEvent$AdEventType.AD_PROGRESS;
                object6 = new JioAdEvent((JioAdEvent$AdEventType)((Object)object));
                object2.onJioVmapEvent((JioAdEvent)object6, (HashMap)object5);
            }
        }
        if ((object5 = ((s)object4).e0) != null) {
            ((e)object5).h(l2, l3);
        }
        object5 = ((s)object4).g0();
        int n3 = ((com.jio.jioads.videomodule.config.a)object5).t;
        if (n3 != 0) {
            n3 = ((s)object4).x;
            if (n3 == 0) {
                ((s)object4).p();
                ((s)object4).v(l2, l3);
            }
        } else {
            ((s)object4).p();
            ((s)object4).v(l2, l3);
        }
        if ((object5 = ((s)object4).y) != null) {
            object5 = ((f)object5).P;
        } else {
            n3 = 0;
            object5 = null;
        }
        object2 = "VideoAdProgressCountTotalDuration";
        n3 = (int)(Intrinsics.areEqual(object5, object2) ? 1 : 0);
        if (n3 != 0 && (object5 = ((s)object4).z) != null) {
            object2 = ((s)object4).h0();
            long l4 = ((com.jio.jioads.videomodule.config.b)object2).a;
            int n4 = 1000;
            long l7 = n4;
            l4 *= l7;
            object = ((s)object4).h0();
            l7 = ((com.jio.jioads.videomodule.config.b)object).c;
            object5.onAllAdMediaProgress(l4, l7);
        }
        if ((object5 = ((s)object4).z) != null) {
            if ((object4 = ((s)object4).T()) == null) {
                object4 = "";
            }
            object2 = object4;
            object4 = object5;
            object5 = object2;
            object4.onAdProgress((String)object2, l3, l2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void i() {
        block23: {
            block22: {
                block21: {
                    var1_1 = this.a;
                    var2_2 = var1_1.e0;
                    if (var2_2 != null) {
                        var2_2.t();
                    }
                    var1_1.X = var2_2 = var1_1.u;
                    var2_2 = var1_1.r;
                    if (var2_2 != null && (var2_2 = (Map)var2_2.invoke()) != null) {
                        var3_3 = var1_1.a;
                        var3_3.clear();
                        var3_3.putAll(var2_2);
                    }
                    if ((var2_2 = (com.jio.jioads.instreamads.vastparser.model.k)l_0.j(var1_1.O)) == null || (var2_2 = var2_2.q) == null) {
                        var2_2 = var1_1.T();
                    }
                    var3_3 = var1_1.V();
                    var1_1.E((String)var2_2, (String)var3_3);
                    var2_2 = x.a;
                    var3_3 = "<set-?>";
                    Intrinsics.checkNotNullParameter(var2_2, (String)var3_3);
                    var1_1.A = var2_2;
                    var2_2 = var1_1.E;
                    if (var2_2 == null && (var2_2 = var1_1.e0) != null) {
                        var2_2.q();
                    }
                    var1_1.C();
                    var2_2 = var1_1.u;
                    var4_4 = 0;
                    var3_3 = null;
                    if (var2_2 != null) {
                        var5_5 = var2_2.getDuration();
                        var2_2 = var5_5;
                    } else {
                        var5_5 = 0;
                        var2_2 = null;
                    }
                    var1_1.T = var2_2;
                    var5_5 = (int)var1_1.c;
                    var6_6 = 1;
                    if (var5_5 != 0) break block21;
                    var2_2 = var1_1.z;
                    if (var2_2 == null) ** GOTO lbl-1000
                    Intrinsics.checkNotNull(var2_2);
                    var5_5 = (int)var2_2.canPrepareNextVideoAd(var6_6);
                    if (var5_5 != 0) {
                        var1_1.B(null);
                    } else if ((var2_2 = var1_1.z) == null) {
                        var1_1.B(null);
                    }
                    var2_2 = var1_1.g0();
                    var5_5 = (int)var2_2.c;
                    if (var5_5 != 0 && (var2_2 = var1_1.e0) != null && (var2_2 = var1_1.u) != null) {
                        var2_2 = var1_1.t();
                        var7_7 = (Boolean)var2_2.a;
                        var8_8 = var7_7.booleanValue();
                        var9_9 = var2_2 = var2_2.b;
                        var9_9 = (String)var2_2;
                        if (!var8_8) {
                            var2_2 = JioAdError.Companion;
                            var3_3 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                            var2_2.getClass();
                            var10_10 = t_0.a((JioAdError$JioAdErrorType)var3_3);
                            var11_12 = var1_1.z;
                            if (var11_12 != null) {
                                var12_14 = d.a;
                                var13_16 = "JioVideoViewRenderer";
                                var14_17 = null;
                                var15_19 = "adjustAspectRatio";
                                var11_12.onFailedToLoad(var10_10, false, var12_14, var15_19, var13_16, (String)var9_9);
                            }
                            return;
                        }
                    }
                }
                var2_2 = var1_1.g;
                var7_7 = var1_1.b;
                var11_13 = "";
                if (var2_2 == null) break block22;
                var10_11 = var1_1.O;
                var14_18 /* !! */  = null;
                if ((var2_2 = var7_7.b((Context)var2_2, 0, (ArrayList)var10_11)) != null) break block23;
            }
            var2_2 = var11_13;
        }
        var1_1.Y = var2_2;
        var2_2 = new StringBuilder();
        com.jio.jioads.jioreel.tracker.model.b.d(var1_1, (StringBuilder)var2_2, ": onStarted for trackNumber: ");
        var16_20 = var1_1.P;
        var2_2.append(var16_20);
        var2_2.append(", remaining-tracks: ");
        var16_20 = l_0.a(var1_1.O) - var6_6;
        var2_2.append(var16_20);
        var2_2 = var2_2.toString();
        var10_11 = "message";
        Intrinsics.checkNotNullParameter(var2_2, (String)var10_11);
        var2_2 = JioAds.Companion;
        var2_2.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var14_18 /* !! */  = JioAds$LogLevel.NONE;
        var14_18 /* !! */  = new StringBuilder();
        com.jio.jioads.jioreel.tracker.model.b.d(var1_1, (StringBuilder)var14_18 /* !! */ , ": onStarted for url: ");
        var12_15 = var1_1.Y;
        d90_0.b((StringBuilder)var14_18 /* !! */ , var12_15, (String)var10_11, (JioAds$Companion)var2_2);
        var7_7 = var7_7.a;
        if (var7_7 != null) {
            var3_3 = var1_1.T();
            var7_7 = var7_7.v;
            var3_3 = (AdMetaData$AdParams)var7_7.get(var3_3);
        }
        var1_1.N = var3_3;
        var3_3 = new StringBuilder();
        com.jio.jioads.jioreel.tracker.model.b.d(var1_1, (StringBuilder)var3_3, ": currentAdId: ");
        var7_7 = var1_1.T();
        var3_3.append((String)var7_7);
        var3_3.append(", track: ");
        var8_8 = var1_1.P;
        var3_3.append((int)var8_8);
        var3_3.append(" isCtaUrlPresent: ");
        var8_8 = var1_1.a();
        var3_3.append(var8_8);
        var3_3.append(", currentAdParams: ");
        var7_7 = var1_1.N;
        var3_3.append(var7_7);
        var3_3 = var3_3.toString();
        Intrinsics.checkNotNullParameter(var3_3, (String)var10_11);
        var2_2.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var2_2 = var1_1.e0;
        if (var2_2 != null) {
            var3_3 = var1_1.N;
            var8_8 = var1_1.a();
            var2_2.i((AdMetaData$AdParams)var3_3, var8_8);
        }
        var2_2 = var1_1.g0();
        var5_5 = (int)var2_2.q;
        if (var5_5 != 0 && (var2_2 = var1_1.z) != null) {
            var3_3 = var1_1.T();
            if (var3_3 != null) {
                var11_13 = var3_3;
            }
            var4_4 = var1_1.P + var6_6;
            var2_2.onAdChange((String)var11_13, var4_4);
        }
        s.Y(var1_1);
        var1_1.o();
        var2_2 = var1_1.e0;
        if (var2_2 != null) {
            var2_2.s();
        }
        var2_2 = var1_1.h0();
        var2_2.b = var4_4 = var1_1.P;
        var2_2 = var1_1.e0;
        if (var2_2 != null) {
            var17_21 = var1_1.U();
            var2_2.c(var4_4, var17_21);
        }
    }
}

