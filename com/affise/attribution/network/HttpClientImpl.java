/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.network;

import com.affise.attribution.debug.network.DebugOnNetworkCallback;
import com.affise.attribution.network.HttpClient;
import com.affise.attribution.network.HttpClient$Method;
import com.affise.attribution.network.HttpResponse;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class HttpClientImpl
implements HttpClient {
    private DebugOnNetworkCallback debugRequest;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final String getResponseBody(InputStream object) {
        if (object == null) {
            return null;
        }
        Object object2 = "UTF-8";
        Object object3 = new InputStreamReader((InputStream)object, (String)object2);
        BufferedReader bufferedReader = new BufferedReader((Reader)object3);
        try {
            object = new StringBuilder();
            while (true) {
                if ((object3 = bufferedReader.readLine()) == null) {
                    object2 = "";
                    break block11;
                }
                object2 = "it ?: \"\"";
                break;
            }
        }
        catch (Exception exception) {
            return null;
        }
        {
            block11: {
                Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                object2 = object3;
            }
            if (object3 == null) return ((StringBuilder)object).toString();
            ((StringBuilder)object).append((String)object2);
            continue;
        }
    }

    /*
     * Exception decompiling
     */
    public HttpResponse executeRequest(URL var1_1, HttpClient$Method var2_5, String var3_6, Map var4_7, boolean var5_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 20[TRYBLOCK] [49, 48 : 267->276)] java.lang.Throwable
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

    public DebugOnNetworkCallback getDebugRequest() {
        return this.debugRequest;
    }

    public void setDebugRequest(DebugOnNetworkCallback debugOnNetworkCallback) {
        this.debugRequest = debugOnNetworkCallback;
    }
}

