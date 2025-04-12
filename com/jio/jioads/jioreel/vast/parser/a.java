/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.jio.jioads.jioreel.vast.parser;

import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.instreamads.vastparser.model.e;
import com.jio.jioads.instreamads.vastparser.model.f;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.model.q;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

public final class a {
    public final com.jio.jioads.jioreel.vast.interfaces.a a;
    public final String b;
    public final ExecutorService c;

    public a(com.jio.jioads.jioreel.vast.interfaces.a object, String string2) {
        Intrinsics.checkNotNullParameter(string2, "rawXML");
        this.a = object;
        this.b = string2;
        this.c = object = Executors.newSingleThreadExecutor();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(m object) {
        int n3 = 1;
        if (object == null) return n3 != 0;
        object = ((m)object).c;
        if (object == null) return n3 != 0;
        int n4 = object.size();
        if (n4 <= 0) return n3 != 0;
        n4 = object.size();
        int n7 = 0;
        int n8 = 1;
        while (n7 < n4) {
            block14: {
                block15: {
                    String string2;
                    String string3;
                    block16: {
                        f f5;
                        Object e2;
                        Object object2;
                        block12: {
                            block13: {
                                q q2;
                                void var5_20;
                                q q6;
                                void var5_14;
                                void var5_10;
                                boolean bl2;
                                Object e5 = object.get(n7);
                                string3 = "message";
                                string2 = "Invalid vast schema";
                                object2 = null;
                                if (e5 == null) break block12;
                                j j3 = (j)object.get(n7);
                                if (j3 != null) {
                                    e e7 = j3.n;
                                } else {
                                    bl2 = false;
                                    Object var5_9 = null;
                                }
                                if (var5_10 != null) break block12;
                                j j5 = (j)object.get(n7);
                                if (j5 != null) {
                                    q q7 = j5.m;
                                } else {
                                    bl2 = false;
                                    Object var5_13 = null;
                                }
                                if (var5_14 == null) break block12;
                                j j7 = (j)object.get(n7);
                                if (j7 != null && (q6 = j7.m) != null) {
                                    String string4 = q6.e;
                                } else {
                                    bl2 = false;
                                    Object var5_19 = null;
                                }
                                if (var5_20 == null) break block13;
                                j j8 = (j)object.get(n7);
                                if (j8 != null && (q2 = j8.m) != null) {
                                    object2 = q2.e;
                                }
                                if (!(bl2 = TextUtils.isEmpty((CharSequence)object2))) break block14;
                            }
                            Intrinsics.checkNotNullParameter(string2, string3);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            break block15;
                        }
                        if ((e2 = object.get(n7)) == null || (f5 = m.i((j)object.get(n7))) == null) break block16;
                        f f6 = m.i((j)object.get(n7));
                        if (f6 != null) {
                            object2 = f6.b;
                        }
                        if (object2 != null) break block14;
                    }
                    Intrinsics.checkNotNullParameter(string2, string3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                n8 = 0;
            }
            n7 += n3;
        }
        return n8 != 0;
    }
}

