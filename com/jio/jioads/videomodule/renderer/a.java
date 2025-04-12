/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
package com.jio.jioads.videomodule.renderer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.utils.c;
import com.jio.jioads.utils.f;
import com.jio.jioads.utils.i;
import com.jio.jioads.videomodule.renderer.e;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class a
implements f {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ e b;

    public a(HashMap hashMap, e e2) {
        this.a = hashMap;
        this.b = e2;
    }

    public final void a(HashMap hashMap) {
        if (hashMap != null) {
            boolean bl2;
            HashMap hashMap2 = this.a;
            Iterator iterator = hashMap2.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                int n3;
                Object object;
                int n4;
                Object object2;
                boolean bl3;
                Object object3 = (String)iterator.next();
                Object object4 = (com.jio.jioads.videomodule.utility.a)hashMap2.get(object3);
                if (object4 == null || !(bl3 = hashMap.containsKey(object3))) continue;
                object3 = (i)hashMap.get(object3);
                bl3 = false;
                Object object5 = null;
                if (object3 != null) {
                    object2 = ((i)object3).b;
                } else {
                    n4 = 0;
                    object2 = null;
                }
                if (object2 == null) continue;
                object3 = (byte[])((i)object3).b;
                if (object3 == null) {
                    return;
                }
                object2 = "<set-?>";
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                n4 = ((com.jio.jioads.videomodule.utility.a)object4).c;
                int n7 = 8;
                e e2 = this.b;
                if (n4 != 0) {
                    object5 = new StringBuilder();
                    object2 = e2.a;
                    object = ": isGif";
                    j_0.i((b)object2, (StringBuilder)object5, (String)object);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object5 = JioAds$LogLevel.NONE;
                    object4 = ((com.jio.jioads.videomodule.utility.a)object4).d;
                    if (object4 == null || (object2 = (object5 = e2.a).Y()) == null) continue;
                    object5 = object5.Y();
                    Intrinsics.checkNotNull(object5);
                    object2 = "context";
                    Intrinsics.checkNotNullParameter(object5, (String)object2);
                    n4 = Build.VERSION.SDK_INT;
                    n3 = 28;
                    object2 = n4 >= n3 ? new com.jio.jioads.utils.a((Context)object5) : new c((Context)object5);
                    n3 = -1;
                    int n8 = -2;
                    object5 = new ViewGroup.LayoutParams(n3, n8);
                    object4.removeAllViews();
                    object4.addView((View)object2, (ViewGroup.LayoutParams)object5);
                    object4.setVisibility(0);
                    object2.a((byte[])object3);
                    object2.a();
                    object3 = e2.d.O;
                    if (object3 == null) continue;
                    object4 = e2.g;
                    boolean bl4 = ((com.jio.jioads.videomodule.config.b)object4).j ^ true;
                    if (bl4) {
                        n7 = 0;
                    }
                    object3.setVisibility(n7);
                    continue;
                }
                object2 = new StringBuilder();
                object = e2.a;
                String string2 = ": bitmap file";
                j_0.i((b)object, (StringBuilder)object2, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                n4 = ((Object)object3).length;
                n3 = 80;
                object3 = j_0.b(n4, (byte[])object3, n3, n3);
                object = e2.a.Y();
                if (object != null) {
                    object5 = object.getResources();
                }
                object2 = new BitmapDrawable((Resources)object5, (Bitmap)object3);
                object3 = e2.g;
                object4 = ((com.jio.jioads.videomodule.utility.a)object4).b;
                if (object4 != null) {
                    bl3 = ((com.jio.jioads.videomodule.config.b)object3).j ^ true;
                    object4.setAdjustViewBounds(bl3);
                }
                if (object4 != null) {
                    object4.setImageDrawable((Drawable)object2);
                }
                if ((object5 = e2.d.O) != null) {
                    bl2 = ((com.jio.jioads.videomodule.config.b)object3).j ^ true;
                    if (bl2) {
                        n7 = 0;
                    }
                    object5.setVisibility(n7);
                }
                if (object4 == null) continue;
                object4.bringToFront();
            }
        }
    }
}

