/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

public final class FF3
implements EF3 {
    public final WebViewProviderFactoryBoundaryInterface a;

    public FF3(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.a = webViewProviderFactoryBoundaryInterface;
    }

    public final String[] a() {
        return this.a.getSupportedFeatures();
    }

    public final WebViewProviderBoundaryInterface createWebView(WebView object) {
        object = this.a.createWebView((WebView)object);
        return (WebViewProviderBoundaryInterface)ea_1.a(WebViewProviderBoundaryInterface.class, (InvocationHandler)object);
    }

    public final DropDataContentProviderBoundaryInterface getDropDataProvider() {
        InvocationHandler invocationHandler = this.a.getDropDataProvider();
        return (DropDataContentProviderBoundaryInterface)ea_1.a(DropDataContentProviderBoundaryInterface.class, invocationHandler);
    }

    public final StaticsBoundaryInterface getStatics() {
        InvocationHandler invocationHandler = this.a.getStatics();
        return (StaticsBoundaryInterface)ea_1.a(StaticsBoundaryInterface.class, invocationHandler);
    }
}

