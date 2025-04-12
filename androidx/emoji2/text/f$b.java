/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Handler
 */
package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.core.provider.b;
import androidx.core.provider.h$b;
import androidx.emoji2.text.EmojiCompat$g;
import androidx.emoji2.text.EmojiCompat$h;
import androidx.emoji2.text.f;
import androidx.emoji2.text.f$a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class f$b
implements EmojiCompat$g {
    public final Context a;
    public final gV0 b;
    public final f$a c;
    public final Object d;
    public Handler e;
    public Executor f;
    public ThreadPoolExecutor g;
    public EmojiCompat$h h;

    public f$b(Context context, gV0 gV02) {
        Object object;
        f$a f$a = androidx.emoji2.text.f.d;
        this.d = object = new Object();
        B41.c(context, "Context cannot be null");
        this.a = context = context.getApplicationContext();
        this.b = gV02;
        this.c = f$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(EmojiCompat$h emojiCompat$h) {
        Object object = this.d;
        synchronized (object) {
            this.h = emojiCompat$h;
        }
        this.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2;
                block4: {
                    Object var2_2 = null;
                    try {
                        this.h = null;
                        object2 = this.e;
                        if (object2 == null) break block4;
                        object2.removeCallbacks(null);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                this.e = null;
                object2 = this.g;
                if (object2 != null) {
                    ((ThreadPoolExecutor)object2).shutdown();
                }
                this.f = null;
                this.g = null;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2;
                Object object3;
                try {
                    object3 = this.h;
                    if (object3 == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object3 = this.f;
                if (object3 == null) {
                    object3 = "emojiCompat";
                    X30 x30 = new X30((String)object3);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    LinkedBlockingDeque<Runnable> linkedBlockingDeque = new LinkedBlockingDeque<Runnable>();
                    long l2 = 15;
                    int n3 = 1;
                    object2 = object3;
                    object3 = new ThreadPoolExecutor(0, n3, l2, timeUnit, linkedBlockingDeque, x30);
                    boolean bl2 = true;
                    ((ThreadPoolExecutor)object3).allowCoreThreadTimeOut(bl2);
                    this.g = object3;
                    this.f = object3;
                }
                object3 = this.f;
                object2 = new hv0_0(this, 0);
                object3.execute((Runnable)object2);
                return;
            }
            throw throwable2;
        }
    }

    public final h$b d() {
        int n3;
        Object object;
        RuntimeException runtimeException;
        block12: {
            Object[] objectArray;
            runtimeException = null;
            int n4 = 1;
            try {
                objectArray = this.c;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                object = new RuntimeException("provider not found", nameNotFoundException);
                throw object;
            }
            Context context = this.a;
            ArrayList arrayList = this.b;
            objectArray.getClass();
            objectArray = new Object[n4];
            objectArray[0] = arrayList;
            arrayList = new ArrayList(n4);
            object = objectArray[0];
            Objects.requireNonNull(object);
            arrayList.add(object);
            object = Collections.unmodifiableList(arrayList);
            object = androidx.core.provider.b.a(context, object);
            n3 = object.a;
            if (n3 != 0) break block12;
            object = (h$b[])object.b.get(0);
            if (object != null && (n3 = ((h$b[])object).length) != 0) {
                return object[0];
            }
            runtimeException = new RuntimeException("fetchFonts failed (empty result)");
            throw runtimeException;
        }
        object = Gj0.b(n3, "fetchFonts failed (", ")");
        runtimeException = new RuntimeException((String)object);
        throw runtimeException;
    }
}

