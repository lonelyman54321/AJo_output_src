/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 */
package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$c;
import com.facebook.e;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class d
extends AsyncTask {
    public final HttpURLConnection a;
    public final e b;
    public Exception c;

    public d(e e2) {
        String string2 = "requests";
        Intrinsics.checkNotNullParameter(e2, string2);
        Intrinsics.checkNotNullParameter(e2, string2);
        this.a = null;
        this.b = e2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(List object) {
        Object object2;
        int n3 = 1;
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return;
        }
        try {
            bl2 = td0.b((Object)this);
            if (bl2) {
                return;
            }
            object2 = "result";
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(object, (String)object2);
            super.onPostExecute(object);
            Exception exception = this.c;
            if (exception == null) return;
            object2 = StringCompanionObject.INSTANCE;
            object2 = "onPostExecute: exception encountered during request: %s";
            String string2 = exception.getMessage();
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            String string3 = String.format((String)object2, objectArray2);
            String string4 = "format(format, *args)";
            Intrinsics.checkNotNullExpressionValue(string3, string4);
            lz3_0 lz3_02 = lz3_0.a;
            FacebookSdk facebookSdk = FacebookSdk.a;
        }
        finally {
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object doInBackground(Object[] var1_1) {
        block21: {
            block20: {
                block19: {
                    var2_7 = td0.b((Object)this);
                    var3_8 /* !! */  = null;
                    if (var2_7) {
                        return null;
                    }
                    var2_7 = td0.b((Object)this);
                    if (!var2_7) break block19;
                    return null;
                }
                var1_1 /* !! */  = (Void[])var1_1 /* !! */ ;
                var2_7 = td0.b((Object)this);
                if (!var2_7) break block20;
                return var3_8 /* !! */ ;
                {
                    catch (Throwable var1_5) {
                        try {
                            td0.a((Object)this, var1_5);
                            return null;
                        }
                        catch (Throwable var1_6) {
                            td0.a((Object)this, var1_6);
                            return null;
                        }
                    }
                }
            }
            var2_7 = td0.b((Object)this);
            if (var2_7) {
                return var3_8 /* !! */ ;
            }
            var4_9 = "params";
            Intrinsics.checkNotNullParameter(var1_1 /* !! */ , (String)var4_9);
            var1_1 /* !! */  = this.a;
            var4_9 = this.b;
            if (var1_1 /* !! */  != null) ** GOTO lbl43
            try {
                var4_9.getClass();
                var1_1 /* !! */  = GraphRequest.j;
                var1_1 /* !! */  = GraphRequest$c.c((e)var4_9);
                return var1_1 /* !! */ ;
lbl43:
                // 3 sources

                var1_1 /* !! */  = GraphRequest$c.d((e)var4_9, (HttpURLConnection)var1_1 /* !! */ );
            }
            catch (Throwable var1_2) {
                break block21;
            }
            return var1_1 /* !! */ ;
            catch (Exception var1_3) {
                this.c = var1_3;
                return var3_8 /* !! */ ;
            }
        }
        try {
            td0.a((Object)this, var1_2);
            return var3_8 /* !! */ ;
        }
        catch (Throwable var1_4) {
            td0.a((Object)this, var1_4);
            return var3_8 /* !! */ ;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onPreExecute() {
        Throwable throwable2;
        block11: {
            block8: {
                Object object;
                block9: {
                    block10: {
                        boolean bl2;
                        e e2;
                        block7: {
                            e2 = this.b;
                            bl2 = td0.b((Object)this);
                            if (bl2) {
                                return;
                            }
                            bl2 = td0.b((Object)this);
                            if (!bl2) break block7;
                            return;
                        }
                        try {
                            super.onPreExecute();
                            object = FacebookSdk.a;
                            object = e2.a;
                            if (object != null) break block8;
                        }
                        catch (Throwable throwable2) {}
                        object = Thread.currentThread();
                        bl2 = object instanceof HandlerThread;
                        if (!bl2) break block10;
                        object = new Handler();
                        break block9;
                        break block11;
                    }
                    Looper looper = Looper.getMainLooper();
                    object = new Handler(looper);
                }
                e2.a = object;
            }
            return;
        }
        try {
            td0.a((Object)this, throwable2);
            return;
        }
        catch (Throwable throwable3) {
            td0.a((Object)this, throwable3);
            return;
        }
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder("{RequestAsyncTask:  connection: ");
        Object object = this.a;
        charSequence.append(object);
        charSequence.append(", requests: ");
        object = this.b;
        charSequence.append(object);
        charSequence.append("}");
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder()\n        \u2026(\"}\")\n        .toString()");
        return charSequence;
    }
}

