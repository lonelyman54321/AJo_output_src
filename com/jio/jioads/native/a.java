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
package com.jio.jioads.native;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.AppCompatImageView;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.native.b;
import com.jio.jioads.native.e;
import com.jio.jioads.native.f;
import com.jio.jioads.util.Utility;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class a
extends AppCompatImageView
implements f {
    public static final /* synthetic */ int b;
    public byte[] a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.setAdjustViewBounds(true);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        void var1_4;
        Object object;
        block19: {
            float f5;
            int n3;
            float f6;
            int n4;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            block20: {
                block18: {
                    object6 = "message";
                    object5 = "Exception in show GIFHandler ";
                    object = null;
                    object4 = "tmp";
                    object3 = "gif";
                    try {
                        try {
                            object4 = File.createTempFile((String)object4, (String)object3);
                        }
                        catch (IOException iOException) {
                            object4 = null;
                            break block18;
                        }
                        try {
                            object3 = new FileOutputStream((File)object4);
                        }
                        catch (IOException iOException) {
                            object2 = iOException;
                            break block18;
                        }
                        try {}
                        catch (IOException iOException) {}
                        finally {
                        }
                    }
                    catch (Throwable throwable) {
                        break block19;
                    }
                    object2 = this.a;
                    if (object2 == null) {
                        object2 = "gifArray";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n4 = 0;
                        object2 = null;
                        f6 = 0.0f;
                    }
                    ((FileOutputStream)object3).write((byte[])object2);
                    ((FileOutputStream)object3).close();
                    break block20;
                }
                n3 = 0;
                object3 = null;
                f5 = 0.0f;
                {
                    StringBuilder stringBuilder = new StringBuilder((String)object5);
                    Utility utility = Utility.INSTANCE;
                    object2 = utility.printStacktrace((Exception)object2);
                    stringBuilder.append((String)object2);
                    object2 = stringBuilder.toString();
                    Intrinsics.checkNotNullParameter(object2, object6);
                    object2 = JioAds.Companion;
                    object2 = ((JioAds$Companion)object2).getInstance();
                    ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    if (object3 == null) break block20;
                }
                ((FileOutputStream)object3).close();
            }
            if (object4 != null && (n3 = ((File)object4).exists()) != 0) {
                object3 = Bd1.a((File)object4);
                object2 = "createSource(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                try {
                    object = com.jio.jioads.native.b.a((ImageDecoder.Source)object3);
                }
                catch (IOException iOException) {
                    object2 = new StringBuilder((String)object5);
                    object5 = Utility.INSTANCE.printStacktrace(iOException);
                    ((StringBuilder)object2).append((String)object5);
                    object5 = ((StringBuilder)object2).toString();
                    Intrinsics.checkNotNullParameter(object5, object6);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object6 = JioAds$LogLevel.NONE;
                }
                if (object != null) {
                    int n7 = this.getWidth();
                    int n8 = this.getHeight();
                    n3 = object.getIntrinsicWidth();
                    n4 = object.getIntrinsicHeight();
                    float f7 = n7;
                    f5 = n3;
                    n3 = (int)(f7 /= f5) * n7;
                    float f8 = n8;
                    f6 = n4;
                    n7 = (int)(f8 /= f6) * n8;
                    n8 = 0;
                    object.setBounds(0, 0, n3, n7);
                    this.setImageDrawable((Drawable)object);
                    ((File)object4).delete();
                    object5 = Looper.getMainLooper();
                    object6 = new Handler((Looper)object5);
                    object5 = new e((Drawable)object);
                    object6.post((Runnable)object5);
                }
            }
            return;
        }
        if (object != null) {
            ((FileOutputStream)object).close();
        }
        throw var1_4;
    }

    public final void a(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "byteArray");
        this.a = byArray;
    }
}

