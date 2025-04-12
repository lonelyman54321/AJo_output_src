/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  org.json.JSONArray
 */
package com.facebook.internal;

import android.os.AsyncTask;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.WebDialog;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class WebDialog$d
extends AsyncTask {
    public final String a;
    public final Bundle b;
    public Exception[] c;
    public final /* synthetic */ WebDialog d;

    public WebDialog$d(WebDialog exceptionArray, String string2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(bundle, "parameters");
        this.d = exceptionArray;
        this.a = string2;
        this.b = bundle;
        exceptionArray = new Exception[]{};
        this.c = exceptionArray;
    }

    /*
     * Exception decompiling
     */
    public final String[] a(Void ... var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 19[TRYBLOCK] [31, 30 : 192->195)] java.lang.Throwable
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String[] object) {
        int n3;
        Object object2;
        WebDialog webDialog;
        Object object3;
        block13: {
            Throwable throwable3;
            block12: {
                block11: {
                    block10: {
                        object3 = this.b;
                        webDialog = this.d;
                        boolean bl2 = td0.b((Object)this);
                        if (bl2) {
                            return;
                        }
                        try {
                            bl2 = td0.b((Object)this);
                            if (!bl2) break block10;
                            return;
                        }
                        catch (Throwable throwable2) {
                            td0.a((Object)this, throwable2);
                            return;
                        }
                    }
                    try {
                        object2 = webDialog.e;
                        if (object2 == null) break block11;
                        object2.dismiss();
                    }
                    catch (Throwable throwable3) {
                        break block12;
                    }
                }
                object2 = this.c;
                n3 = ((Exception[])object2).length;
                break block13;
            }
            td0.a((Object)this, throwable3);
            return;
        }
        for (int i3 = 0; i3 < n3; ++i3) {
            Exception exception = object2[i3];
            if (exception == null) continue;
            webDialog.e(exception);
            return;
        }
        object2 = "Failed to stage photos for web dialog";
        if (object == null) {
            object = new FacebookException((String)object2);
            webDialog.e((Exception)object);
            return;
        }
        object = rp_1.e((Object[])object);
        n3 = 0;
        String string2 = null;
        n3 = (int)(object.contains(null) ? 1 : 0);
        if (n3 != 0) {
            object = new FacebookException((String)object2);
            webDialog.e((Exception)object);
            return;
        }
        object = (Collection)object;
        object2 = new JSONArray((Collection)object);
        lz3_0.G(object3, (JSONArray)object2);
        object = q03.a();
        object2 = new StringBuilder();
        string2 = FacebookSdk.e();
        ((StringBuilder)object2).append(string2);
        string2 = "/dialog/";
        ((StringBuilder)object2).append(string2);
        string2 = this.a;
        ((StringBuilder)object2).append(string2);
        object2 = ((StringBuilder)object2).toString();
        object = lz3_0.b(object3, (String)object, (String)object2);
        webDialog.a = object = object.toString();
        object = webDialog.f;
        if (object != null) {
            object = object.getDrawable();
            int n4 = object.getIntrinsicWidth();
            n4 = n4 / 2 + 1;
            webDialog.f(n4);
            return;
        }
        object = "Required value was null.";
        object = object.toString();
        object3 = new IllegalStateException((String)object);
        throw object3;
    }
}

