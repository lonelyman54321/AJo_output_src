/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.utility.glide;

import android.content.Context;
import com.ajio.ril.core.network.SSLProvider;
import com.bumptech.glide.Registry;
import com.bumptech.glide.a;
import com.bumptech.glide.b;
import com.bumptech.glide.integration.okhttp3.b$a;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

public final class AJioAppGlideModule
extends yo {
    public final void a(Context object, a object2, Registry registry) {
        boolean bl2;
        Object object3 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "glide");
        Intrinsics.checkNotNullParameter(registry, "registry");
        object2 = new x72$a();
        Object object4 = TimeUnit.SECONDS;
        long l2 = 30;
        ((x72$a)object2).c(l2, (TimeUnit)((Object)object4));
        ((x72$a)object2).b(l2, (TimeUnit)((Object)object4));
        ((x72$a)object2).e(l2, (TimeUnit)((Object)object4));
        z40_0.Companion.getClass();
        object4 = z40$a.a((Context)object).a.d("jio_cdn");
        String string2 = "metrics_master";
        boolean bl3 = object4.getBoolean(string2);
        if (bl3) {
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object4 = new Object();
            ((x72$a)object2).a((nj1_2)object4);
        }
        if (bl2 = ((ao0_0)(object = z40$a.a((Context)object).a)).a((String)(object3 = "enable_ssl_socket_custom_impl"))) {
            object = SSLProvider.getInstance().getSSLSocketFactory();
            Intrinsics.checkNotNullExpressionValue(object, "getSSLSocketFactory(...)");
            object3 = SSLProvider.getInstance().getX509TrustManager();
            object4 = "getX509TrustManager(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            ((x72$a)object2).d((SSLSocketFactory)object, (X509TrustManager)object3);
        }
        object = new x72_0((x72$a)object2);
        object2 = new b$a((x72_0)object);
        registry.l((b$a)object2);
    }

    public final void b(Context context, b b2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(b2, "builder");
        b2.l = 6;
        Object object = new VN1$a(context);
        VN1 vN1 = new VN1((VN1$a)object);
        double d2 = vN1.b;
        double d5 = 1.2;
        int n3 = (int)(d2 * d5);
        int n4 = (int)((double)vN1.a * d5);
        long l2 = n3;
        ad1_1 ad1_12 = new VC1(l2);
        b2.f = ad1_12;
        long l3 = n4;
        b2.d = object = new tc1_0(l3);
        b2.i = object = new uj1_0(context, "image-cache");
    }
}

