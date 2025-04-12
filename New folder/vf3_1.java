/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.webkit.WebView
 */
import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/*
 * Renamed from vF3
 */
public final class vf3_1
implements WebMessageListenerBoundaryInterface {
    public BF3$a a;

    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onPostMessage(WebView webView, InvocationHandler object, Uri uri, boolean bl2, InvocationHandler object2) {
        Object object3;
        Object object4;
        int n3;
        object = (WebMessageBoundaryInterface)ea_1.a(WebMessageBoundaryInterface.class, (InvocationHandler)object);
        Object object5 = object.getPorts();
        int n4 = ((InvocationHandler[])object5).length;
        Object object6 = new tf_0[n4];
        for (int i3 = 0; i3 < (n3 = ((InvocationHandler[])object5).length); ++i3) {
            object4 = object5[i3];
            object3 = new Object();
            Class<WebMessagePortBoundaryInterface> clazz = WebMessagePortBoundaryInterface.class;
            ((wf3_2)object3).a = object4 = (WebMessagePortBoundaryInterface)ea_1.a(clazz, (InvocationHandler)object4);
            object6[i3] = object3;
        }
        object5 = CF3.a;
        int n7 = ((mm)object5).c();
        if (n7 != 0) {
            object5 = WebMessagePayloadBoundaryInterface.class;
            object = object.getMessagePayload();
            n7 = (object = (WebMessagePayloadBoundaryInterface)ea_1.a((Class)object5, (InvocationHandler)object)).getType();
            if (n7 != 0) {
                n4 = 1;
                if (n7 != n4) {
                    return;
                }
                object = object.getAsArrayBuffer();
                object5 = new uf3_1((byte[])object);
            } else {
                object = object.getAsString();
                object5 = new uf3_1((String)object);
            }
        } else {
            object = object.getData();
            object5 = new uf3_1((String)object);
        }
        object3 = object5;
        if (object3 == null) return;
        object = (JsReplyProxyBoundaryInterface)ea_1.a(JsReplyProxyBoundaryInterface.class, (InvocationHandler)object2);
        object2 = new qk1_0((JsReplyProxyBoundaryInterface)object);
        Object object7 = object = object.getOrCreatePeer((Callable)object2);
        object7 = (rk1_0)object;
        object6 = this.a;
        object4 = uri;
        object6.onPostMessage(webView, (uf3_1)object3, uri, bl2, (pk1_0)object7);
    }
}

