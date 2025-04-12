/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.net.http.SslError
 *  android.webkit.SslErrorHandler
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.web.a;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from dI0
 */
public final class di0_1
extends WebViewClient {
    public final a a;
    public final String b;
    public final hu1_1 c;
    public final int d;
    public final nc1_2 e;
    public long f;
    public final String g;
    public final FirebasePerformance h;
    public final Trace i;

    public di0_1(a object, String string2, hu1_1 hu1_12, int n3, nc1_2 nc1_22) {
        long l2;
        Intrinsics.checkNotNullParameter(string2, "acceptedSSLs");
        this.a = object;
        this.b = string2;
        this.c = hu1_12;
        this.d = n3;
        this.e = nc1_22;
        this.f = l2 = System.currentTimeMillis();
        this.g = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        object = FirebasePerformance.getInstance();
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(...)");
        this.h = object;
        object = ((FirebasePerformance)object).newTrace("WEB_VIEW_LOAD");
        Intrinsics.checkNotNullExpressionValue(object, "newTrace(...)");
        this.i = object;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(WebView object, String string2) {
        boolean bl2;
        Object object2;
        Object object3;
        block23: {
            Object object4;
            block22: {
                boolean bl3;
                boolean bl4;
                block21: {
                    bl4 = false;
                    object3 = null;
                    if (string2 != null) {
                        object4 = this.g;
                        object2 = new Regex((String)object4);
                        bl2 = ((Regex)object2).c(string2);
                        object2 = bl2;
                    } else {
                        bl2 = false;
                        object2 = null;
                    }
                    Intrinsics.checkNotNull(object2);
                    bl2 = (Boolean)object2;
                    object4 = this.a;
                    if (!bl2 && !(bl2 = StringsKt.F(string2, (CharSequence)(object2 = "mailto:"), false))) {
                        object2 = "tel:";
                        bl2 = StringsKt.F(string2, (CharSequence)object2, false);
                        if (bl2) {
                            if (object4 != null) {
                                object4.m3(string2);
                            }
                            return;
                        }
                        object2 = "/c/";
                        bl2 = StringsKt.F(string2, (CharSequence)object2, false);
                        if (!(bl2 || (bl2 = StringsKt.F(string2, (CharSequence)(object2 = "/b/"), false)) || (bl2 = StringsKt.F(string2, (CharSequence)(object2 = "/s/"), false)))) {
                            object2 = new URL(string2);
                            object3 = ((URL)object2).getHost();
                            break block21;
                        } else {
                            object = this.c;
                            if (object != null) {
                                object.I1(string2);
                            }
                            return;
                        }
                    }
                    if (object4 != null) {
                        object4.e8(string2);
                    }
                    return;
                    catch (MalformedURLException malformedURLException) {}
                }
                if (!(bl3 = StringsKt.F(string2, (CharSequence)(object2 = "?uiel=Mobile&isAppsFlag=true"), false)) && (bl3 = StringsKt.F(string2, (CharSequence)(object4 = UrlHelper.Companion.getInstance().getBaseUrl()), false))) break block22;
                cp_1.Companion.getClass();
                object4 = cp$a.e();
                object4.getClass();
                bl4 = cp_1.H((String)object3);
                if (!bl4) break block23;
            }
            object3 = Uri.parse((String)string2);
            object4 = "?";
            boolean bl5 = StringsKt.F(string2, (CharSequence)object4, false);
            if (bl5) {
                object4 = "&";
                string2 = string2.concat((String)object4);
            } else {
                string2 = string2.concat((String)object4);
            }
            if (object3 != null && (object4 = object3.getFragment()) != null) {
                object2 = object3.getFragment();
                Intrinsics.checkNotNull(object2);
                String string3 = "#";
                object4 = new StringBuilder(string3);
                ((StringBuilder)object4).append((String)object2);
                object2 = ((StringBuilder)object4).toString();
                object4 = "";
                string2 = kotlin.text.b.n(string2, (String)object2, (String)object4, false);
                object3 = object3.getFragment();
                Intrinsics.checkNotNull(object3);
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(string2);
                ((StringBuilder)object2).append("?uiel=Mobile&isAppsFlag=true#");
                ((StringBuilder)object2).append((String)object3);
                string2 = ((StringBuilder)object2).toString();
            } else {
                string2 = Ft2.a(string2, (String)object2);
            }
        }
        if (bl2 = ((FirebasePerformance)(object3 = this.h)).isPerformanceCollectionEnabled()) {
            object2 = "GET";
            ((FirebasePerformance)object3).newHttpMetric(string2, (String)object2);
        }
        if (object != null) {
            object.loadUrl(string2);
        }
    }

    public final void onPageFinished(WebView object, String string2) {
        String string3 = "view";
        Intrinsics.checkNotNullParameter(object, string3);
        super.onPageFinished((WebView)object, string2);
        int n3 = 21;
        a a2 = this.a;
        int n4 = this.d;
        if (n4 != n3 && n4 != (n3 = 22)) {
            long l2;
            long l3;
            long l4;
            long l7;
            if (a2 != null) {
                a2.dismissProgress();
            }
            if (a2 != null) {
                object = object.getTitle();
                a2.A9((String)object, string2);
            }
            if ((l7 = (l4 = (l3 = this.f) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
                l3 = System.currentTimeMillis();
                l2 = this.f;
                object = yn3_0.a;
                string3 = Wm2.a(l3 -= l2, "Load Time ");
                a2 = null;
                Object object2 = new Object[]{};
                ((yn3$a)object).a(string3, object2);
                object = this.h;
                l7 = (long)((FirebasePerformance)object).isPerformanceCollectionEnabled();
                if (l7 != false) {
                    object = this.i;
                    string3 = "WEB_VIEW_STATUS";
                    object2 = "200";
                    ((Trace)object).putAttribute(string3, (String)object2);
                    ((Trace)object).stop();
                }
                if (string2 != null) {
                    object = "sizeguide-v2";
                    StringsKt.F(string2, (CharSequence)object, false);
                }
            }
        } else if (a2 != null) {
            a2.dismissProgress();
        }
    }

    public final void onPageStarted(WebView object, String string2, Bitmap object2) {
        int n3;
        int n4;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onPageStarted((WebView)object, string2, (Bitmap)object2);
        object = this.a;
        if (object != null) {
            object.showProgress();
        }
        boolean bl2 = false;
        object = null;
        object2 = "sizeguide-v2";
        if (string2 == null || (n4 = StringsKt.F(string2, (CharSequence)object2, false)) == 0) {
            long l2;
            this.f = l2 = System.currentTimeMillis();
        }
        if ((n3 = this.d) != (n4 = 21) && n3 != (n4 = 22)) {
            object3 = this.h;
            n4 = (int)(((FirebasePerformance)object3).isPerformanceCollectionEnabled() ? 1 : 0);
            if (n4 != 0) {
                object3 = this.i;
                ((Trace)object3).start();
                if (string2 != null) {
                    n3 = 63;
                    int n7 = 6;
                    int n8 = StringsKt.N(string2, (char)n3, 0, false, n7);
                    int n10 = -1;
                    String string3 = "WEB_VIEW_URL";
                    if (n8 != n10) {
                        n3 = StringsKt.N(string2, (char)n3, 0, false, n7);
                        String string4 = string2.substring(0, n3);
                        String string5 = "substring(...)";
                        Intrinsics.checkNotNullExpressionValue(string4, string5);
                        ((Trace)object3).putAttribute(string3, string4);
                    } else {
                        ((Trace)object3).putAttribute(string3, string2);
                    }
                    bl2 = StringsKt.F(string2, (CharSequence)object2, false);
                    object = bl2 ? "SIZE_GUIDE" : "GENERAL";
                    object2 = AnalyticsManager.Companion;
                    object3 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                    object2 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
                    ((GTMEvents)object3).pushWebViewLoad((String)object, string2, (String)object2);
                }
            }
        } else {
            boolean bl3;
            object = h40_0.a;
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            object2 = "web_deeplink_for_app";
            object = ((ao0_0)object).b((String)object2);
            if (string2 != null && (bl2 = StringsKt.F(string2, (CharSequence)object, bl3 = true)) == bl3 && (object = this.e) != null) {
                object.q0();
            }
        }
    }

    public final void onReceivedError(WebView object, WebResourceRequest object2, WebResourceError object3) {
        int n3;
        super.onReceivedError(object, (WebResourceRequest)object2, (WebResourceError)object3);
        if (object3 != null) {
            n3 = object3.getErrorCode();
        } else {
            n3 = 0;
            object = null;
        }
        object2 = this.h;
        boolean bl2 = ((FirebasePerformance)object2).isPerformanceCollectionEnabled();
        if (bl2) {
            object2 = "WEB_VIEW_STATUS";
            object = String.valueOf(n3);
            object3 = this.i;
            ((Trace)object3).putAttribute((String)object2, (String)object);
            ((Trace)object3).stop();
        }
    }

    public final void onReceivedHttpError(WebView object, WebResourceRequest object2, WebResourceResponse object3) {
        int n3;
        super.onReceivedHttpError(object, (WebResourceRequest)object2, (WebResourceResponse)object3);
        if (object3 != null) {
            n3 = object3.getStatusCode();
        } else {
            n3 = 0;
            object = null;
        }
        object2 = this.h;
        boolean bl2 = ((FirebasePerformance)object2).isPerformanceCollectionEnabled();
        if (bl2) {
            object2 = "WEB_VIEW_STATUS";
            object = String.valueOf(n3);
            object3 = this.i;
            ((Trace)object3).putAttribute((String)object2, (String)object);
            ((Trace)object3).stop();
        }
    }

    public final void onReceivedSslError(WebView object, SslErrorHandler sslErrorHandler, SslError object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(sslErrorHandler, "handler");
        Object object3 = "error";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object2 = UrlHelper.Companion.getInstance();
        boolean bl2 = ((UrlHelper)object2).isUATDomain();
        if (bl2) {
            sslErrorHandler.proceed();
        } else if ((object = object.getUrl()) != null && (object = Uri.parse((String)object)) != null) {
            boolean bl3;
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object = object.getHost();
            object2.getClass();
            object = cp_1.g((String)object).toLowerCase();
            object2 = "toLowerCase(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object3 = this.b;
            String string2 = ",";
            boolean bl4 = StringsKt.F((CharSequence)object3, string2, true);
            object3 = bl4 ? fT1.a(string2, (String)object3) : kotlin.collections.a.b(object3);
            object3 = ((Iterable)object3).iterator();
            while (bl3 = object3.hasNext()) {
                string2 = (String)object3.next();
                cp_1.Companion.getClass();
                cp_1 cp_12 = cp$a.e();
                string2 = ((Object)StringsKt.m0(string2)).toString();
                cp_12.getClass();
                string2 = cp_1.g(string2).toLowerCase();
                Intrinsics.checkNotNullExpressionValue(string2, (String)object2);
                bl4 = false;
                cp_12 = null;
                bl3 = kotlin.text.b.s((String)object, string2, false);
                if (!bl3) continue;
                sslErrorHandler.proceed();
                break;
            }
        } else {
            sslErrorHandler.cancel();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest object) {
        object = object != null ? object.getUrl() : null;
        object = String.valueOf(object);
        this.a(webView, (String)object);
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String string2) {
        Intrinsics.checkNotNullParameter(webView, "view");
        this.a(webView, string2);
        return true;
    }
}

