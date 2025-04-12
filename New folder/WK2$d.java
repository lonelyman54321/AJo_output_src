/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.os.Handler
 *  android.os.Looper
 */
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

public abstract class WK2$d {
    public static /* synthetic */ void a(WK2$d wK2$d, Typeface typeface) {
        wK2$d.lambda$callbackSuccessAsync$0(typeface);
    }

    public static /* synthetic */ void b(WK2$d wK2$d, int n3) {
        wK2$d.lambda$callbackFailAsync$1(n3);
    }

    public static Handler getHandler(Handler handler) {
        if (handler == null) {
            Looper looper = Looper.getMainLooper();
            handler = new Handler(looper);
        }
        return handler;
    }

    private /* synthetic */ void lambda$callbackFailAsync$1(int n3) {
        this.onFontRetrievalFailed(n3);
    }

    private /* synthetic */ void lambda$callbackSuccessAsync$0(Typeface typeface) {
        this.onFontRetrieved(typeface);
    }

    public final void callbackFailAsync(int n3, Handler handler) {
        handler = WK2$d.getHandler(handler);
        YK2 yK2 = new YK2(this, n3);
        handler.post((Runnable)yK2);
    }

    public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
        handler = WK2$d.getHandler(handler);
        XK2 xK2 = new XK2(this, typeface);
        handler.post((Runnable)xK2);
    }

    public abstract void onFontRetrievalFailed(int var1);

    public abstract void onFontRetrieved(Typeface var1);
}

