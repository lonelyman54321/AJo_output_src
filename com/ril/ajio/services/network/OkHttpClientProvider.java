/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Base64
 */
package com.ril.ajio.services.network;

import android.content.Context;
import android.util.Base64;
import com.ajio.ril.core.network.SSLProvider;
import com.ril.ajio.services.network.OkHttpClientProvider$Companion;
import com.ril.ajio.services.network.dnsresolver.DnsResolver;
import com.ril.ajio.services.network.interceptors.CustomTimeOutInterceptor;
import com.ril.ajio.services.network.interceptors.ExceptionInterceptor;
import com.ril.ajio.services.network.interceptors.HTMLExceptionInterceptor;
import com.ril.ajio.services.network.interceptors.JsonParserErrorLogInterceptor;
import com.ril.ajio.services.network.interceptors.PayNowHtmlHandlingInterceptor;
import com.ril.ajio.services.network.interceptors.RequestResponseInterceptor;
import com.ril.ajio.services.network.interceptors.ResponseTimeLoggingInterceptor;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class OkHttpClientProvider {
    private static final int CACHE_SIZE = 0x3200000;
    private static final long CONNECTION_TIMEOUT = 30L;
    public static final OkHttpClientProvider$Companion Companion;
    private static final long READ_TIMEOUT = 30L;
    private static HashSet VALID_PINS;
    private static final long WRITE_TIMEOUT = 30L;
    private static OkHttpClientProvider okHttpClientProvider;
    private Context context;

    static {
        OkHttpClientProvider$Companion okHttpClientProvider$Companion;
        Companion = okHttpClientProvider$Companion = new OkHttpClientProvider$Companion(null);
    }

    public static /* synthetic */ boolean a(OkHttpClientProvider okHttpClientProvider, String string2, SSLSession sSLSession) {
        return OkHttpClientProvider.handleHostnameVerifiers$lambda$1(okHttpClientProvider, string2, sSLSession);
    }

    public static final /* synthetic */ OkHttpClientProvider access$getOkHttpClientProvider$cp() {
        return okHttpClientProvider;
    }

    public static final /* synthetic */ void access$setOkHttpClientProvider$cp(OkHttpClientProvider okHttpClientProvider) {
        OkHttpClientProvider.okHttpClientProvider = okHttpClientProvider;
    }

    private final void addDNSResolver(Context object, x72$a x72$a) {
        z40_0.Companion.getClass();
        Object object2 = z40$a.a((Context)object).a;
        String string2 = "enable_dns_resolver";
        boolean bl2 = ((ao0_0)object2).a(string2);
        if (bl2) {
            object2 = new DnsResolver((Context)object);
            x72$a.getClass();
            Intrinsics.checkNotNullParameter(object2, "dns");
            object = x72$a.l;
            boolean bl3 = Intrinsics.areEqual(object2, object);
            if (!bl3) {
                bl3 = false;
                object = null;
                x72$a.D = null;
            }
            x72$a.l = object2;
        }
    }

    private final ri_2 getCacheDir(File object) {
        Object object2 = null;
        if (object != null) {
            String string2 = "http-cache";
            Object object3 = new File((File)object, string2);
            long l2 = 0x3200000L;
            try {
                object2 = object = new ri_2((File)object3, l2);
            }
            catch (Exception exception) {
                object3 = yn3_0.a;
                ((yn3$a)object3).e(exception);
            }
        }
        return object2;
    }

    public static final OkHttpClientProvider getInstance() {
        return Companion.getInstance();
    }

    private final void handleHostnameVerifiers(x72$a x72$a) {
        Object object;
        block7: {
            object = new z72_0(this);
            x72$a.getClass();
            Object object2 = "hostnameVerifier";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = x72$a.u;
            boolean bl2 = Intrinsics.areEqual(object, object2);
            if (bl2) break block7;
            bl2 = false;
            object2 = null;
            x72$a.D = null;
        }
        try {
            x72$a.u = object;
        }
        catch (Exception exception) {
            object = yn3_0.a;
            ((yn3$a)object).e(exception);
        }
    }

    private static final boolean handleHostnameVerifiers$lambda$1(OkHttpClientProvider okHttpClientProvider, String object, SSLSession object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(okHttpClientProvider, "this$0");
        Intrinsics.checkNotNull(object);
        String string2 = "ajio.com";
        boolean bl3 = false;
        boolean bl4 = StringsKt.F((CharSequence)object, string2, false);
        if (bl4 && !(bl4 = StringsKt.F((CharSequence)object, string2 = "uat", false)) && !(bl2 = StringsKt.F((CharSequence)object, string2 = "qa.services", false))) {
            object = object2.getPeerCertificates();
            object2 = "getPeerCertificates(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            try {
                bl3 = okHttpClientProvider.validatePinning((Certificate[])object);
            }
            catch (SSLException sSLException) {
                object = yn3_0.a;
                ((yn3$a)object).e(sSLException);
            }
        } else {
            bl3 = true;
        }
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean validatePinning(Certificate[] certificateArray) {
        int n3;
        Object object;
        block5: {
            object = "SHA-256";
            try {
                object = MessageDigest.getInstance((String)object);
                n3 = certificateArray.length;
                break block5;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
            object = yn3_0.a;
            ((yn3$a)object).e(noSuchAlgorithmException);
            return false;
        }
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            Object object2 = certificateArray[i3];
            object2 = ((Certificate)object2).getPublicKey();
            object2 = object2.getEncoded();
            int n4 = ((Object)object2).length;
            ((MessageDigest)object).update((byte[])object2, 0, n4);
            object2 = ((MessageDigest)object).digest();
            n4 = 2;
            object2 = Base64.encodeToString((byte[])object2, (int)n4);
            Iterator iterator = VALID_PINS;
            if (iterator == null) {
                iterator = "VALID_PINS";
                Intrinsics.throwUninitializedPropertyAccessException(iterator);
                n4 = 0;
                iterator = null;
            }
            iterator = iterator.iterator();
            while (bl2 = iterator.hasNext()) {
                Object object3 = iterator.next();
                object3 = (String)object3;
                Intrinsics.checkNotNull(object2);
                bl2 = StringsKt.F(object3, (CharSequence)object2, false);
                if (!bl2) continue;
                return true;
            }
        }
        return false;
    }

    public final void burstCache(File object) {
        if ((object = this.getCacheDir((File)object)) != null) {
            object = ((ri_2)object).a;
            ((rq0_2)object).close();
            Object object2 = ((rq0_2)object).a;
            object = ((rq0_2)object).b;
            try {
                ((gm0_2)object2).c((File)object);
            }
            catch (Exception exception) {
                object2 = yn3_0.a;
                ((yn3$a)object2).e(exception);
            }
        }
    }

    public final x72_0 getClient(File object, Context context, boolean bl2, xe object2, String[] object3) {
        boolean bl3;
        Object object4;
        Object object5;
        Object object6;
        block11: {
            block10: {
                object6 = "context";
                Intrinsics.checkNotNullParameter(context, (String)object6);
                Intrinsics.checkNotNullParameter(object2, "analyticsReporter");
                this.context = context;
                object5 = new HashSet();
                object4 = null;
                if (object3 != null) {
                    int n3 = ((String[])object3).length;
                    for (int i3 = 0; i3 < n3; ++i3) {
                        String string2 = object3[i3];
                        ((HashSet)object5).add(string2);
                    }
                }
                if ((object3 = SSLProvider.getInstance().getValidSSLFallbackPins()) != null) {
                    for (String string2 : object3) {
                        ((HashSet)object5).add(string2);
                    }
                }
                VALID_PINS = object5;
                object3 = new x72$a();
                object5 = TimeUnit.SECONDS;
                long l2 = 30;
                ((x72$a)object3).c(l2, (TimeUnit)((Object)object5));
                ((x72$a)object3).b(l2, (TimeUnit)((Object)object5));
                ((x72$a)object3).e(l2, (TimeUnit)((Object)object5));
                ((x72$a)object3).k = object = this.getCacheDir((File)object);
                ((x72$a)object3).h = false;
                object = new ExceptionInterceptor();
                ((x72$a)object3).a((nj1_2)object);
                object = new CustomTimeOutInterceptor(context);
                ((x72$a)object3).a((nj1_2)object);
                object = new RequestResponseInterceptor(context, (xe)object2);
                ((x72$a)object3).a((nj1_2)object);
                object = new PayNowHtmlHandlingInterceptor();
                ((x72$a)object3).a((nj1_2)object);
                object = new ResponseTimeLoggingInterceptor(context, (xe)object2);
                ((x72$a)object3).a((nj1_2)object);
                object = "replica";
                object2 = "prod";
                if (object2 == object) break block10;
                z40_0.Companion.getClass();
                object5 = z40$a.a((Context)context).a;
                object4 = "enable_ssl_socket_custom_impl";
                bl3 = ((ao0_0)object5).a((String)object4);
                if (!bl3) break block11;
            }
            object5 = SSLProvider.getInstance().getSSLSocketFactory();
            Intrinsics.checkNotNullExpressionValue(object5, "getSSLSocketFactory(...)");
            object4 = SSLProvider.getInstance().getX509TrustManager();
            String string3 = "getX509TrustManager(...)";
            Intrinsics.checkNotNullExpressionValue(object4, string3);
            ((x72$a)object3).d((SSLSocketFactory)object5, (X509TrustManager)object4);
        }
        this.addDNSResolver(context, (x72$a)object3);
        z40_0.Companion.getClass();
        object5 = z40$a.a((Context)context).a;
        object4 = "android_response_json_parsing_enable";
        bl3 = ((ao0_0)object5).a((String)object4);
        if (bl3 || (bl3 = ((ao0_0)(object5 = z40$a.a((Context)context).a)).a((String)(object4 = "android_5xx_response_convert_to_json"))) || (bl3 = ((ao0_0)(object5 = z40$a.a((Context)context).a)).a((String)(object4 = "enableAppRedirection")))) {
            object5 = new JsonParserErrorLogInterceptor(context);
            ((x72$a)object3).a((nj1_2)object5);
        }
        if (!bl2) {
            this.handleHostnameVerifiers((x72$a)object3);
        }
        Object object7 = new HTMLExceptionInterceptor(context);
        ((x72$a)object3).a((nj1_2)object7);
        object7 = "qa";
        if (object2 == object7 || object2 == object || object2 == (object = "qaregression")) {
            Intrinsics.checkNotNullParameter(context, (String)object6);
            object = new Object();
            ((AU$a)object).a = context;
            object7 = vz0_2.a;
            object6 = new uU(context);
            object5 = new zU(object);
            object2 = new au_0(context, (uU)object6, (zU)object5, (Set)object7);
            ((x72$a)object3).a((nj1_2)object2);
        }
        object = new x72_0((x72$a)object3);
        return object;
    }
}

