/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebView
 *  android.widget.RelativeLayout$LayoutParams
 */
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.jio.jioads.common.b;
import com.jio.jioads.interstitial.x;
import com.jio.jioads.native.NativeAdController;
import com.jio.jioads.native.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class fl2
extends Lambda
implements Function0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fl2(int n3, Object object, Object object2) {
        this.c = n3;
        this.d = object;
        this.e = object2;
        super(0);
    }

    /*
     * WARNING - void declaration
     */
    public final Object invoke() {
        void var1_4;
        int bl2 = this.c;
        switch (bl2) {
            default: {
                Object object = (Context)this.e;
                Object object2 = new WebView(object);
                NativeAdController nativeAdController = (NativeAdController)this.d;
                NativeAdController.access$setWebView$p(nativeAdController, (WebView)object2);
                int n3 = -1;
                object2 = new RelativeLayout.LayoutParams(n3, n3);
                Object object3 = NativeAdController.access$getWebView$p(nativeAdController);
                if (object3 != null) {
                    int n4 = t70.getColor(object, 17170445);
                    object3.setBackgroundColor(n4);
                }
                n3 = 13;
                object2.addRule(n3);
                object3 = NativeAdController.access$getWebView$p(nativeAdController);
                if (object3 != null) {
                    object3.setLayoutParams((ViewGroup.LayoutParams)object2);
                }
                object2 = NativeAdController.access$getWebView$p(nativeAdController);
                if (object2 != null) {
                    m m2 = new m(nativeAdController);
                    b b2 = NativeAdController.access$getIJioAdView$p(nativeAdController);
                    object3 = new x((Context)object, (WebView)object2, m2, b2);
                    NativeAdController.access$setWebViewHandler$p(nativeAdController, (x)object3);
                }
                if ((object2 = NativeAdController.access$getWebViewHandler$p(nativeAdController)) != null) {
                    object = NativeAdController.access$getHtmlAdResponse$p(nativeAdController);
                    ((x)object2).c((String)object);
                }
                return Unit.a;
            }
            case 0: 
        }
        hm0_0 hm0_02 = (hm0_0)((Cl2)this.d);
        c80 c802 = (c80)((i90_0)this.e);
        boolean bl3 = hm0_02.d();
        if (bl3) {
            boolean bl4 = false;
            Object var6_14 = null;
            il2_0 il2_02 = new il2_0(hm0_02, null);
            Ae3.d(c802, null, null, il2_02, 3);
            boolean bl5 = true;
        } else {
            boolean bl6 = false;
            hm0_02 = null;
        }
        return (boolean)var1_4;
    }
}

