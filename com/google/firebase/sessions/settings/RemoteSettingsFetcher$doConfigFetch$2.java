/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.settings.RemoteSettingsFetcher;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

final class RemoteSettingsFetcher$doConfigFetch$2
extends qg3_2
implements Function2 {
    final /* synthetic */ Map $headerOptions;
    final /* synthetic */ Function2 $onFailure;
    final /* synthetic */ Function2 $onSuccess;
    int label;
    final /* synthetic */ RemoteSettingsFetcher this$0;

    public RemoteSettingsFetcher$doConfigFetch$2(RemoteSettingsFetcher remoteSettingsFetcher, Map map2, Function2 function2, Function2 function22, f80_0 f80_02) {
        this.this$0 = remoteSettingsFetcher;
        this.$headerOptions = map2;
        this.$onSuccess = function2;
        this.$onFailure = function22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        RemoteSettingsFetcher remoteSettingsFetcher = this.this$0;
        Map map2 = this.$headerOptions;
        Function2 function2 = this.$onSuccess;
        Function2 function22 = this.$onFailure;
        object = new RemoteSettingsFetcher$doConfigFetch$2(remoteSettingsFetcher, map2, function2, function22, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (RemoteSettingsFetcher$doConfigFetch$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((RemoteSettingsFetcher$doConfigFetch$2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Exception exception2;
        Object object2;
        Object object3;
        int n3;
        int n4;
        int n7;
        j90_0 j90_02;
        block11: {
            j90_02 = j90_0.COROUTINE_SUSPENDED;
            n7 = this.label;
            n4 = 3;
            n3 = 2;
            int n8 = 1;
            if (n7 != 0) {
                if (n7 != n8 && n7 != n3) {
                    if (n7 == n4) {
                        vl2_2.b(object);
                        return Unit.a;
                    }
                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object;
                }
                vl2_2.b(object);
                return Unit.a;
            }
            vl2_2.b(object);
            try {
                Object object4;
                int n10;
                object = this.this$0;
                object = RemoteSettingsFetcher.access$settingsUrl((RemoteSettingsFetcher)object);
                object = ((URL)object).openConnection();
                object3 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection";
                Intrinsics.checkNotNull(object, (String)object3);
                object = (HttpsURLConnection)object;
                object3 = "GET";
                ((HttpURLConnection)object).setRequestMethod((String)object3);
                object3 = "Accept";
                object2 = "application/json";
                ((URLConnection)object).setRequestProperty((String)object3, (String)object2);
                object3 = this.$headerOptions;
                object3 = object3.entrySet();
                object3 = object3.iterator();
                while ((n10 = object3.hasNext()) != 0) {
                    object2 = object3.next();
                    object2 = (Map.Entry)object2;
                    object4 = object2.getKey();
                    object4 = (String)object4;
                    object2 = object2.getValue();
                    object2 = (String)object2;
                    ((URLConnection)object).setRequestProperty((String)object4, (String)object2);
                }
                n7 = ((HttpURLConnection)object).getResponseCode();
                if (n7 != (n10 = 200)) break block11;
                object = ((URLConnection)object).getInputStream();
                Object object5 = new InputStreamReader((InputStream)object);
                object3 = new BufferedReader((Reader)object5);
                object5 = new StringBuilder();
                object2 = new Ref$ObjectRef();
                while (true) {
                    object4 = ((BufferedReader)object3).readLine();
                    ((Ref$ObjectRef)object2).element = object4;
                    if (object4 == null) {
                        ((BufferedReader)object3).close();
                        ((InputStream)object).close();
                        object3 = ((StringBuilder)object5).toString();
                        object = new JSONObject((String)object3);
                        object3 = this.$onSuccess;
                        this.label = n8;
                        object = object3.invoke(object, this);
                        if (object != j90_02) return Unit.a;
                        return j90_02;
                    }
                    ((StringBuilder)object5).append((String)object4);
                }
            }
            catch (Exception exception2) {}
        }
        object = this.$onFailure;
        StringBuilder stringBuilder = new StringBuilder();
        object2 = "Bad response code: ";
        stringBuilder.append((String)object2);
        stringBuilder.append(n7);
        object3 = stringBuilder.toString();
        this.label = n3;
        object = object.invoke(object3, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
        object3 = this.$onFailure;
        String string2 = exception2.getMessage();
        if (string2 == null) {
            string2 = ((Object)exception2).toString();
        }
        this.label = n4;
        Object object6 = object3.invoke(string2, this);
        if (object6 != j90_02) return Unit.a;
        return j90_02;
    }
}

