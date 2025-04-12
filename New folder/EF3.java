/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
import android.webkit.WebView;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

public interface EF3 {
    public String[] a();

    public WebViewProviderBoundaryInterface createWebView(WebView var1);

    public DropDataContentProviderBoundaryInterface getDropDataProvider();

    public StaticsBoundaryInterface getStatics();
}

