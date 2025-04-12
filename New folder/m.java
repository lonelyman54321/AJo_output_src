/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap$Config
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.webkit.MimeTypeMap
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.MimeTypeMap;
import coil.base.R$id;
import java.io.Closeable;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class m {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config b;
    public static final m41_0 c;

    static {
        Bitmap.Config[] configArray;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 1;
        Bitmap.Config config = null;
        int n7 = 26;
        if (n3 >= n7) {
            Bitmap.Config config2;
            int n8 = 2;
            configArray = new Bitmap.Config[n8];
            configArray[0] = config2 = Bitmap.Config.ARGB_8888;
            configArray[n4] = config = Jh.a();
        } else {
            Bitmap.Config config3;
            configArray = new Bitmap.Config[n4];
            configArray[0] = config3 = Bitmap.Config.ARGB_8888;
        }
        a = configArray;
        Object object = n3 >= n7 ? Kh.a() : Bitmap.Config.ARGB_8888;
        b = object;
        object = new m41$a_0();
        c = ((m41$a_0)object).e();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void a(Closeable closeable) {
        try {
            closeable.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String string2) {
        boolean bl2;
        if (string2 != null && !(bl2 = kotlin.text.b.k(string2))) {
            string2 = StringsKt.k0(StringsKt.k0(string2, '#'), '?');
            string2 = StringsKt.g0('/', string2, string2);
            string2 = StringsKt.g0('.', string2, "");
            return mimeTypeMap.getMimeTypeFromExtension(string2);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final RD3 c(View view) {
        int n3 = R$id.coil_request_manager;
        Object object = view.getTag(n3);
        int n4 = object instanceof RD3;
        Object object2 = null;
        if (n4 != 0) {
            object = (RD3)object;
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) return object;
        synchronized (view) {
            Throwable throwable2;
            block8: {
                try {
                    n3 = R$id.coil_request_manager;
                    object = view.getTag(n3);
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                n4 = object instanceof RD3;
                if (n4 != 0) {
                    object2 = object;
                    object2 = (RD3)object;
                }
                if (object2 != null) {
                    return object2;
                }
                object = new RD3(view);
                view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
                n4 = R$id.coil_request_manager;
                view.setTag(n4, object);
                return object;
            }
            throw throwable2;
        }
    }

    public static final File d(Context object) {
        if ((object = object.getCacheDir()) != null) {
            ((File)object).mkdirs();
            return object;
        }
        String string2 = "cacheDir == null".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public static final boolean e(Uri object) {
        boolean bl2;
        String string2;
        String string3 = object.getScheme();
        boolean bl3 = Intrinsics.areEqual(string3, string2 = "file");
        if (bl3 && (bl2 = Intrinsics.areEqual(object = (String)CollectionsKt.firstOrNull(object.getPathSegments()), string3 = "android_asset"))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final int f(wq0 object, WS2 wS2) {
        void var3_7;
        boolean bl2 = object instanceof wq0$a;
        if (!bl2) {
            object = m$a.$EnumSwitchMapping$2;
            int n3 = wS2.ordinal();
            Object object2 = object[n3];
            if (object2 == (n3 = 1)) return (int)var3_7;
            n3 = 2;
            if (object2 == n3) {
                return (int)var3_7;
            }
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        object = (wq0$a)object;
        int n4 = ((wq0$a)object).a;
        return (int)var3_7;
    }
}

