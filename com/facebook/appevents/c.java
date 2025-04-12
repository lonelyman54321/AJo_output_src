/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONObject
 */
package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.appevents.c$b;
import com.facebook.appevents.i;
import java.io.Serializable;
import java.util.HashSet;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

public final class c
implements Serializable {
    public static final HashSet g;
    private static final long serialVersionUID = 1L;
    public final JSONObject a;
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;

    static {
        HashSet hashSet;
        g = hashSet = new HashSet();
    }

    /*
     * Exception decompiling
     */
    public c(String var1_1, String var2_2, Double var3_3, Bundle var4_4, boolean var5_5, boolean var6_6, UUID var7_7, i var8_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 16[TRYBLOCK] [17 : 224->229)] java.lang.Exception
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

    public c(String string2, boolean bl2, String string3, String string4, boolean bl3) {
        JSONObject jSONObject;
        this.a = jSONObject = new JSONObject(string2);
        super(string3);
        this.b = string2;
        this.c = bl2;
        string2 = jSONObject.optString("_eventName");
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.optString(Con\u2026nts.EVENT_NAME_EVENT_KEY)");
        this.e = string2;
        this.f = string4;
        this.d = bl3;
    }

    private final Object writeReplace() {
        String string2 = this.a.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.toString()");
        String string3 = this.b.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "operationalJsonObject.toString()");
        boolean bl2 = this.d;
        String string4 = this.f;
        boolean bl3 = this.c;
        c$b c$b = new c$b(string2, bl3, string3, string4, bl2);
        return c$b;
    }

    public final String toString() {
        Object object = StringCompanionObject.INSTANCE;
        Object object2 = this.a;
        object = object2.optString("_eventName");
        Boolean bl2 = this.c;
        object2 = object2.toString();
        int n3 = 3;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = bl2;
        objectArray[2] = object2;
        return xh2_0.a(objectArray, n3, "\"%s\", implicit: %b, json: %s", "format(format, *args)");
    }
}

