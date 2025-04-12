/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.ImageDecoder$Source
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Looper
 */
package com.jio.jioads.utils;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.AppCompatImageView;
import com.jio.jioads.utils.b;
import com.jio.jioads.utils.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class a
extends AppCompatImageView
implements d {
    public static final /* synthetic */ int b;
    public byte[] a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.setAdjustViewBounds(true);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        int n3;
        Object object;
        float f5;
        int n4;
        Object object2;
        Object object3;
        Object object4;
        block18: {
            block15: {
                block16: {
                    Throwable throwable3;
                    block17: {
                        object4 = null;
                        object3 = "tmp";
                        object2 = "gif";
                        try {
                            try {
                                object3 = File.createTempFile((String)object3, (String)object2);
                            }
                            catch (IOException iOException) {
                                return;
                            }
                            try {
                                object2 = new FileOutputStream((File)object3);
                            }
                            catch (IOException iOException) {
                                n4 = 0;
                                object2 = null;
                                f5 = 0.0f;
                                break block15;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block16;
                        }
                        try {
                            object = this.a;
                            if (object == null) {
                                object = "gifArray";
                                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                                n3 = 0;
                                object = null;
                            }
                        }
                        catch (Throwable throwable3) {
                            break block17;
                        }
                        catch (IOException iOException) {
                            break block15;
                        }
                        {
                            ((FileOutputStream)object2).write((byte[])object);
                        }
                        ((FileOutputStream)object2).close();
                        break block18;
                    }
                    object3 = throwable3;
                    object4 = object2;
                }
                if (object4 == null) throw object3;
                ((FileOutputStream)object4).close();
                throw object3;
            }
            if (object2 != null) {
                ((FileOutputStream)object2).close();
            }
        }
        if (object3 == null) return;
        n4 = ((File)object3).exists();
        if (n4 == 0) return;
        object2 = Bd1.a((File)object3);
        object = "createSource(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object);
        try {
            object4 = com.jio.jioads.native.b.a((ImageDecoder.Source)object2);
        }
        catch (IOException iOException) {}
        if (object4 == null) return;
        n4 = this.getWidth();
        n3 = this.getHeight();
        int n7 = object4.getIntrinsicWidth();
        int n8 = object4.getIntrinsicHeight();
        float f6 = n4;
        float f7 = n7;
        n7 = (int)(f6 /= f7) * n4;
        f5 = n3;
        float f8 = n8;
        n4 = (int)(f5 /= f8) * n3;
        n3 = 0;
        object = null;
        object4.setBounds(0, 0, n7, n4);
        this.setImageDrawable((Drawable)object4);
        ((File)object3).delete();
        object2 = Looper.getMainLooper();
        object3 = new Handler((Looper)object2);
        object2 = new b((Drawable)object4);
        object3.post((Runnable)object2);
    }

    public final void a(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "byteArray");
        this.a = byArray;
    }
}

