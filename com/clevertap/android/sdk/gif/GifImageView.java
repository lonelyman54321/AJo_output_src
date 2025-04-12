/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.AttributeSet
 */
package com.clevertap.android.sdk.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.clevertap.android.sdk.gif.GifImageView$a;
import com.clevertap.android.sdk.gif.GifImageView$b;
import com.clevertap.android.sdk.gif.GifImageView$c;

public class GifImageView
extends AppCompatImageView
implements Runnable {
    public boolean a;
    public Thread b;
    public long c = -1;
    public xz0_0 d;
    public final Handler e;
    public boolean f;
    public boolean g;
    public Bitmap h;
    public final Runnable i;
    public final Runnable j;

    public GifImageView(Context object) {
        super((Context)object);
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.e = object;
        super(this);
        this.i = object;
        super(this);
        this.j = object;
    }

    public GifImageView(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        attributeSet = Looper.getMainLooper();
        super((Looper)attributeSet);
        this.e = object;
        super(this);
        this.i = object;
        super(this);
        this.j = object;
    }

    public final void d() {
        boolean bl2;
        this.f = false;
        this.g = bl2 = true;
        this.a = false;
        Thread thread2 = this.b;
        if (thread2 != null) {
            thread2.interrupt();
            thread2 = null;
            this.b = null;
        }
        thread2 = this.e;
        Runnable runnable2 = this.i;
        thread2.post(runnable2);
    }

    public final void e() {
        Object object;
        boolean bl2 = this.a;
        if ((bl2 || (bl2 = this.f)) && (object = this.d) != null && (object = this.b) == null) {
            this.b = object = new Thread(this);
            ((Thread)object).start();
        }
    }

    public int getFrameCount() {
        return this.d.g.d;
    }

    public long getFramesDisplayDuration() {
        return this.c;
    }

    public int getGifHeight() {
        return this.d.g.i;
    }

    public int getGifWidth() {
        return this.d.g.l;
    }

    public GifImageView$b getOnAnimationStop() {
        return null;
    }

    public GifImageView$c getOnFrameAvailable() {
        return null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block15: {
            block17: {
                do {
                    block18: {
                        block19: {
                            block16: {
                                var1_1 = this.a;
                                var2_2 = this.e;
                                if (var1_1 == 0 && (var1_1 = this.f) == 0) break block15;
                                var3_3 = this.d;
                                var4_4 = var3_3.g;
                                var5_5 = var4_4.d;
                                var6_6 = -1;
                                var7_7 = 0;
                                if (var5_5 <= 0) {
                                    while (true) {
                                        var8_8 = 0;
                                        break;
                                    }
                                } else {
                                    var9_9 = var3_3.f;
                                    var10_10 = var5_5 + -1;
                                    var8_8 = 1;
                                    if (var9_9 == var10_10) {
                                        var3_3.i = var10_10 = var3_3.i + var8_8;
                                    }
                                    if ((var11_11 = var4_4.j) != var6_6 && (var10_10 = var3_3.i) > var11_11) ** continue;
                                    var3_3.f = var9_9 = (var9_9 + 1) % var5_5;
                                }
                                var12_12 = 0L;
                                try {
                                    var14_13 = System.nanoTime();
                                    var3_3 = this.d;
                                    var3_3 = var3_3.c();
                                    this.h = var3_3;
                                    var16_14 = System.nanoTime() - var14_13;
                                    var14_13 = 1000000L;
                                }
                                catch (ArrayIndexOutOfBoundsException | IllegalArgumentException v0) {
                                    var16_14 = var12_12;
                                    break block16;
                                }
                                {
                                    var16_14 /= var14_13;
                                }
                                try {
                                    var3_3 = this.j;
                                    var2_2.post((Runnable)var3_3);
                                }
                                catch (ArrayIndexOutOfBoundsException | IllegalArgumentException v1) {}
                            }
                            this.f = false;
                            var1_1 = this.a;
                            if (var1_1 == 0 || var8_8 == 0) break block17;
                            try {
                                var3_3 = this.d;
                                var18_15 = var3_3.g;
                                var10_10 = var18_15.d;
                                if (var10_10 <= 0 || (var1_1 = var3_3.f) < 0) break block18;
                                if (var1_1 < 0 || var1_1 >= var10_10) break block19;
                                var19_16 = var18_15.e;
                                var3_3 = var19_16.get(var1_1);
                                var3_3 = (bz0_2)var3_3;
                                var6_6 = var3_3.b;
                            }
                            catch (InterruptedException v2) {
                                continue;
                            }
                        }
                        var7_7 = var6_6;
                    }
                    if ((var1_1 = (int)(var20_17 = (long)var7_7 - var16_14)) <= 0) continue;
                    {
                        var20_17 = this.c;
                        cfr_temp_0 = var20_17 - var12_12;
                        var9_9 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var9_9 <= 0) {
                            var20_17 = var1_1;
                        }
                        Thread.sleep(var20_17);
                    }
                } while ((var1_1 = this.a) != 0);
                break block15;
            }
            this.a = false;
        }
        var1_1 = this.g;
        if (var1_1 != 0) {
            var3_3 = this.i;
            var2_2.post((Runnable)var3_3);
        }
        this.b = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void setBytes(byte[] byArray) {
        Throwable throwable2;
        block13: {
            boolean bl2;
            Object object;
            xz0_0 xz0_02;
            block12: {
                this.d = xz0_02 = new xz0_0();
                try {
                    object = xz0_02.l;
                    if (object == null) {
                        object = new hz0_1();
                        xz0_02.l = object;
                    }
                    object = xz0_02.l;
                    ((hz0_1)object).f(byArray);
                    xz0_02.g = object = ((hz0_1)object).b();
                    if (byArray == null) break block12;
                    xz0_02.g((fz0_0)object, byArray);
                }
                catch (Throwable throwable2) {
                    break block13;
                }
            }
            if (bl2 = this.a) {
                this.e();
                return;
            }
            xz0_02 = this.d;
            int n3 = xz0_02.f;
            if (n3 == 0) {
                return;
            }
            object = xz0_02.g;
            int n4 = -1;
            n3 = ((fz0_0)object).d;
            if (n4 >= n3) {
                return;
            }
            xz0_02.f = n4;
            if (bl2) return;
            this.f = bl2 = true;
            this.e();
            return;
        }
        try {
            throw throwable2;
        }
        catch (Exception exception) {}
        this.d = null;
    }

    public void setFramesDisplayDuration(long l2) {
        this.c = l2;
    }

    public void setOnAnimationStart(GifImageView$a gifImageView$a) {
    }

    public void setOnAnimationStop(GifImageView$b gifImageView$b) {
    }

    public void setOnFrameAvailable(GifImageView$c gifImageView$c) {
    }
}

