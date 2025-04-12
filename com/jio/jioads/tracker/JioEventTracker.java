/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.tracker;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.a;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import com.jio.jioads.tracker.JioEventTracker$makeRequest$1$3;
import com.jio.jioads.util.Utility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class JioEventTracker {
    public static void a(JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents, String map2, b b2, boolean bl2, int n3) {
        JioEventTracker$makeRequest$1$3 jioEventTracker$makeRequest$1$3;
        Object object;
        JioAdView$AdState jioAdView$AdState = b2.k0();
        if (jioAdView$AdState == (object = JioAdView$AdState.DESTROYED)) {
            return;
        }
        jioAdView$AdState = b2.Y();
        object = new com.jio.jioads.network.c((Context)jioAdView$AdState);
        int n4 = ((String)((Object)map2)).length();
        int n7 = 1;
        n4 -= n7;
        int n8 = 0;
        boolean bl3 = false;
        Integer n10 = null;
        while (n8 <= n4) {
            int n14 = !bl3 ? n8 : n4;
            n14 = ((String)((Object)map2)).charAt(n14);
            int n15 = 32;
            if ((n14 = Intrinsics.compare(n14, n15)) <= 0) {
                n14 = 1;
            } else {
                n14 = 0;
                jioEventTracker$makeRequest$1$3 = null;
            }
            if (!bl3) {
                if (n14 == 0) {
                    bl3 = true;
                    continue;
                }
                ++n8;
                continue;
            }
            if (n14 == 0) break;
            n4 += -1;
        }
        String string2 = a.a(n4, n7, n8, (String)((Object)map2));
        map2 = jioAdView$AdState != null ? Utility.INSTANCE.getUserAgentHeader((Context)jioAdView$AdState) : null;
        n10 = n3;
        jioEventTracker$makeRequest$1$3 = new JioEventTracker$makeRequest$1$3((com.jio.jioads.network.c)object, b2, jioEventTracker$TrackingEvents);
        Boolean bl4 = bl2;
        ((com.jio.jioads.network.c)object).b(0, string2, null, map2, n10, jioEventTracker$makeRequest$1$3, bl4);
    }

    public static /* synthetic */ void fireEvents$default(JioEventTracker jioEventTracker, JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents, b b2, List list, Integer n3, String string2, boolean bl2, boolean bl3, String string3, boolean bl4, String string4, String string5, String string6, boolean bl5, int n4, String string7, c c2, String string8, String string9, int n7, Object object) {
        int n8 = n7;
        int n10 = n7 & 0x800;
        String string10 = n10 != 0 ? null : string6;
        n10 = 0x8000 & n8;
        c c3 = n10 != 0 ? null : c2;
        n10 = 0x10000 & n8;
        String string11 = n10 != 0 ? null : string8;
        n10 = 131072;
        String string12 = (n8 &= n10) != 0 ? null : string9;
        jioEventTracker.fireEvents(jioEventTracker$TrackingEvents, b2, list, n3, string2, bl2, bl3, string3, bl4, string4, string5, string10, bl5, n4, string7, c3, string11, string12);
    }

    /*
     * Exception decompiling
     */
    public final void fireEvents(JioEventTracker$TrackingEvents var1_1, b var2_2, List var3_3, Integer var4_4, String var5_5, boolean var6_6, boolean var7_7, String var8_8, boolean var9_9, String var10_10, String var11_11, String var12_12, boolean var13_13, int var14_14, String var15_15, c var16_16, String var17_17, String var18_18) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 28[TRYBLOCK] [33 : 417->425)] java.lang.Exception
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
}

