/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.Spannable
 *  android.text.SpannableString
 *  android.text.Spanned
 *  android.view.inputmethod.EditorInfo
 */
package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.EmojiCompat$ListenerDispatcher;
import androidx.emoji2.text.EmojiCompat$a;
import androidx.emoji2.text.EmojiCompat$b;
import androidx.emoji2.text.EmojiCompat$c;
import androidx.emoji2.text.EmojiCompat$d;
import androidx.emoji2.text.EmojiCompat$f;
import androidx.emoji2.text.EmojiCompat$g;
import androidx.emoji2.text.EmojiCompat$h;
import androidx.emoji2.text.EmojiCompat$i;
import androidx.emoji2.text.EmojiCompatInitializer$b;
import androidx.emoji2.text.b;
import androidx.emoji2.text.c;
import androidx.emoji2.text.e$a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class EmojiCompat {
    public static final Object j;
    public static volatile EmojiCompat k;
    public final ReentrantReadWriteLock a;
    public final Np b;
    public volatile int c;
    public final Handler d;
    public final EmojiCompat$a e;
    public final EmojiCompat$g f;
    public final EmojiCompat$d g;
    public final int h;
    public final b i;

    static {
        Object object;
        j = object = new Object();
    }

    public EmojiCompat(EmojiCompatInitializer$b object) {
        int n3;
        EmojiCompat$g emojiCompat$g;
        int n4;
        Object object2 = new ReentrantReadWriteLock();
        this.a = object2;
        this.c = n4 = 3;
        this.f = emojiCompat$g = ((EmojiCompat$c)object).a;
        this.h = n3 = ((EmojiCompat$c)object).b;
        this.i = object = ((EmojiCompat$c)object).c;
        Looper looper = Looper.getMainLooper();
        object = new Handler(looper);
        this.d = object;
        looper = null;
        this.b = object = new Np(0);
        this.g = object = new Object();
        this.e = object = new EmojiCompat$b(this);
        Lock lock = ((ReentrantReadWriteLock)object2).writeLock();
        lock.lock();
        if (n3 == 0) {
            try {
                this.c = 0;
            }
            catch (Throwable throwable) {
                this.a.writeLock().unlock();
                throw throwable;
            }
        }
        object2 = ((ReentrantReadWriteLock)object2).writeLock();
        object2.unlock();
        int n7 = this.b();
        if (n7 == 0) {
            object2 = new c((EmojiCompat$a)object);
            try {
                emojiCompat$g.a((EmojiCompat$h)object2);
            }
            catch (Throwable throwable) {
                this.e(throwable);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static EmojiCompat a() {
        Object object = j;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                String string2;
                Object object2;
                try {
                    object2 = k;
                    boolean bl2 = object2 != null;
                    string2 = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";
                    if (bl2) {
                        return object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object2 = new IllegalStateException(string2);
                throw object2;
            }
            throw throwable2;
        }
    }

    public static boolean c() {
        boolean bl2;
        EmojiCompat emojiCompat = k;
        if (emojiCompat != null) {
            bl2 = true;
        } else {
            bl2 = false;
            emojiCompat = null;
        }
        return bl2;
    }

    public final int b() {
        Lock lock = this.a.readLock();
        lock.lock();
        try {
            int n3 = this.c;
            return n3;
        }
        finally {
            this.a.readLock().unlock();
        }
    }

    public final void d() {
        Object object;
        int n3 = this.h;
        EmojiCompat emojiCompat = null;
        int n4 = 1;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        if (n3 != 0) {
            block12: {
                n3 = this.b();
                if (n3 == n4) {
                    return;
                }
                object = this.a.writeLock();
                object.lock();
                n3 = this.c;
                if (n3 != 0) break block12;
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            object = this.e;
            emojiCompat = ((EmojiCompat$b)object).a;
            c c2 = new c((EmojiCompat$a)object);
            object = emojiCompat.f;
            try {
                object.a(c2);
            }
            catch (Throwable throwable) {
                emojiCompat.e(throwable);
            }
            return;
            finally {
                this.a.writeLock().unlock();
            }
        }
        object = new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        throw object;
    }

    public final void e(Throwable throwable) {
        ArrayList arrayList = new ArrayList();
        Object object = this.a.writeLock();
        object.lock();
        int n3 = 2;
        this.c = n3;
        object = this.b;
        arrayList.addAll(object);
        object = this.b;
        ((Np)object).clear();
        object = this.d;
        int n4 = this.c;
        EmojiCompat$ListenerDispatcher emojiCompat$ListenerDispatcher = new EmojiCompat$ListenerDispatcher(arrayList, n4, throwable);
        object.post((Runnable)emojiCompat$ListenerDispatcher);
        return;
        finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList();
        Object object = this.a.writeLock();
        object.lock();
        int n3 = 1;
        this.c = n3;
        object = this.b;
        arrayList.addAll(object);
        object = this.b;
        ((Np)object).clear();
        object = this.d;
        int n4 = this.c;
        EmojiCompat$ListenerDispatcher emojiCompat$ListenerDispatcher = new EmojiCompat$ListenerDispatcher(arrayList, n4, null);
        object.post((Runnable)emojiCompat$ListenerDispatcher);
        return;
        finally {
            this.a.writeLock().unlock();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final CharSequence g(CharSequence var1_1, int var2_2, int var3_3, int var4_4) {
        block30: {
            var5_5 = this.b();
            var6_6 = 0;
            var7_7 = 1;
            if (var5_5 == var7_7) {
                var5_5 = 1;
            } else {
                var5_5 = 0;
                var8_8 = null;
            }
            if (var5_5 == 0) {
                var1_1 = new IllegalStateException("Not initialized yet");
                throw var1_1;
            }
            if (var2_2 < 0) {
                var1_1 = new IllegalArgumentException("start cannot be negative");
                throw var1_1;
            }
            if (var3_3 < 0) {
                var1_1 = new IllegalArgumentException("end cannot be negative");
                throw var1_1;
            }
            if (var2_2 <= var3_3) {
                var5_5 = 1;
            } else {
                var5_5 = 0;
                var8_8 = null;
            }
            var9_9 = "start should be <= than end";
            B41.a((boolean)var5_5, (String)var9_9);
            var5_5 = 0;
            var8_8 = null;
            if (var1_1 == null) {
                return null;
            }
            var10_10 = var1_1.length();
            if (var2_2 <= var10_10) {
                var10_10 = 1;
            } else {
                var10_10 = 0;
                var9_9 = null;
            }
            var11_11 = "start should be < than charSequence length";
            B41.a((boolean)var10_10, (String)var11_11);
            var10_10 = var1_1.length();
            if (var3_3 <= var10_10) {
                var10_10 = 1;
            } else {
                var10_10 = 0;
                var9_9 = null;
            }
            var11_11 = "end should be < than charSequence length";
            B41.a((boolean)var10_10, (String)var11_11);
            var10_10 = var1_1.length();
            if (var10_10 == 0) return var1_1;
            if (var2_2 == var3_3) {
                return var1_1;
            }
            var12_12 = var4_4 == var7_7;
            var13_13 = this.e;
            var11_11 = var13_13.b;
            var11_11.getClass();
            var4_4 = var1_1 instanceof W93;
            if (var4_4 != 0) {
                var14_14 = var1_1;
                var14_14 = (W93)var1_1;
                var14_14.a();
            }
            var14_14 = Ty0.class;
            if (var4_4 == 0 && (var10_10 = var1_1 instanceof Spannable) == 0) {
                var10_10 = var1_1 instanceof Spanned;
                if (var10_10 != 0) {
                    var9_9 = var1_1;
                    try {
                        var9_9 = (Spanned)var1_1;
                        var15_15 = var2_2 + -1;
                        var16_16 = var3_3 + 1;
                        var10_10 = var9_9.nextSpanTransition(var15_15, var16_16, (Class)var14_14);
                        if (var10_10 <= var3_3) {
                            var8_8 = new Object();
                            var8_8.a = false;
                            var8_8.b = var9_9 = new SpannableString((CharSequence)var1_1);
                        }
                    }
                    catch (Throwable var17_17) {
                        break block30;
                    }
                }
            } else {
                var9_9 = var1_1;
                var9_9 = (Spannable)var1_1;
                var8_8 = new iw3(var9_9);
            }
            if (var8_8 != null) {
                var9_9 = var8_8.b;
                var14_14 = var9_9.getSpans(var2_2, var3_3, (Class)var14_14);
                if ((var14_14 = (Ty0[])var14_14) != null && (var10_10 = ((Object)var14_14).length) > 0) {
                    var10_10 = ((Object)var14_14).length;
                    while (var6_6 < var10_10) {
                        var18_19 = var14_14[var6_6];
                        var19_20 = var8_8.b;
                        var16_16 = var19_20.getSpanStart(var18_19);
                        var20_21 = var8_8.b;
                        var21_22 = var20_21.getSpanEnd(var18_19);
                        if (var16_16 != var3_3) {
                            var8_8.removeSpan(var18_19);
                        }
                        var2_2 = Math.min(var16_16, var2_2);
                        var3_3 = Math.max(var21_22, var3_3);
                        ++var6_6;
                    }
                }
            }
            var16_16 = var2_2;
            var21_22 = var3_3;
            if (var2_2 != var3_3 && var16_16 < (var2_2 = ((CharSequence)var1_1).length())) {
                var17_18 = var11_11.a;
                var22_23 = new e$a(var8_8, (EmojiCompat$i)var17_18);
                var23_24 = -1 >>> 1;
                var18_19 = var1_1;
                var17_18 = var11_11.c((CharSequence)var1_1, var16_16, var3_3, var23_24, var12_12, var22_23);
                if ((var17_18 = (iw3)var17_18) != null) {
                    var17_18 = var17_18.b;
                    if (var4_4 != 0) {
                        var1_1 = (W93)var1_1;
                        var1_1.b();
                    }
                    var1_1 = var17_18;
                    return (CharSequence)var1_1;
                }
                if (var4_4 == 0) return (CharSequence)var1_1;
lbl114:
                // 2 sources

                while (true) {
                    var17_18 = var1_1;
                    var17_18 = (W93)var1_1;
                    var17_18.b();
                    return (CharSequence)var1_1;
                }
            }
            if (var4_4 == 0) return (CharSequence)var1_1;
            ** while (true)
        }
        if (var4_4 == 0) throw var17_17;
        var1_1 = (W93)var1_1;
        var1_1.b();
        throw var17_17;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(EmojiCompat$f object) {
        Throwable throwable2;
        block4: {
            block3: {
                Lock lock;
                int n3;
                block2: {
                    n3 = 1;
                    B41.c(object, "initCallback cannot be null");
                    lock = this.a.writeLock();
                    lock.lock();
                    try {
                        int n4;
                        int n7 = this.c;
                        if (n7 == n3 || (n7 = this.c) == (n4 = 2)) break block2;
                        Np np = this.b;
                        np.add(object);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                lock = this.d;
                int n8 = this.c;
                EmojiCompat$f[] emojiCompat$fArray = new EmojiCompat$f[n3];
                emojiCompat$fArray[0] = object;
                object = Arrays.asList(emojiCompat$fArray);
                object = (List)object;
                n3 = 0;
                emojiCompat$fArray = null;
                EmojiCompat$ListenerDispatcher emojiCompat$ListenerDispatcher = new EmojiCompat$ListenerDispatcher((List)object, n8, null);
                lock.post(emojiCompat$ListenerDispatcher);
            }
            this.a.writeLock().unlock();
            return;
        }
        this.a.writeLock().unlock();
        throw throwable2;
    }

    public final void i(EditorInfo editorInfo) {
        int n3;
        int n4 = this.b();
        if (n4 == (n3 = 1) && editorInfo != null) {
            int n7;
            Object object = editorInfo.extras;
            if (object == null) {
                object = new Bundle();
                editorInfo.extras = object;
            }
            object = this.e;
            object.getClass();
            Bundle bundle = editorInfo.extras;
            fo1_1 fo1_12 = ((EmojiCompat$a)object).c.a;
            int n8 = fo1_12.a(4);
            if (n8 != 0) {
                ByteBuffer byteBuffer = fo1_12.b;
                n7 = fo1_12.a;
                n8 += n7;
                n7 = byteBuffer.getInt(n8);
            } else {
                n7 = 0;
                fo1_12 = null;
            }
            String string2 = "android.support.text.emoji.emojiCompat_metadataVersion";
            bundle.putInt(string2, n7);
            editorInfo = editorInfo.extras;
            ((EmojiCompat$b)object).a.getClass();
            object = "android.support.text.emoji.emojiCompat_replaceAll";
            editorInfo.putBoolean((String)object, false);
        }
    }
}

