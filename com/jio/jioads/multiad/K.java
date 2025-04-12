/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.multiad;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.multiad.A;
import com.jio.jioads.util.Utility;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.jvm.internal.Intrinsics;

public final class K
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ A c;

    public /* synthetic */ K(String string2, Context context, A a2) {
        this.a = string2;
        this.b = context;
        this.c = a2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        boolean bl2;
        StringBuilder stringBuilder;
        A a2;
        String string2;
        String string3;
        String string4;
        block7: {
            Exception exception2;
            Object object;
            Object object2;
            block6: {
                Object object3;
                block5: {
                    Object object4;
                    String string5;
                    CharSequence charSequence;
                    String string6;
                    block4: {
                        string4 = "toString(...)";
                        string3 = "jio_js";
                        object3 = "Reading targeting from file path=";
                        object2 = "Reading OMID JS from file path=";
                        string2 = this.a;
                        Intrinsics.checkNotNullParameter(string2, "$fileName");
                        object = this.b;
                        Intrinsics.checkNotNullParameter(object, "$context");
                        a2 = this.c;
                        Intrinsics.checkNotNullParameter(a2, "$ijsReader");
                        stringBuilder = new StringBuilder();
                        bl2 = true;
                        try {
                            boolean bl3 = kotlin.text.b.i(string2, string3, bl2);
                            string6 = "message";
                            if (!bl3) break block4;
                            object = object.getFilesDir();
                            object = ((File)object).getAbsolutePath();
                            object2 = new File((String)object, string3);
                            charSequence = new StringBuilder();
                            string5 = ((File)object2).getAbsolutePath();
                            ((StringBuilder)charSequence).append(string5);
                            string5 = File.separator;
                            ((StringBuilder)charSequence).append(string5);
                            string5 = "TargetingValidator.js";
                            ((StringBuilder)charSequence).append(string5);
                            charSequence = ((StringBuilder)charSequence).toString();
                            object4 = new File((String)charSequence);
                            object = new FileInputStream((File)object4);
                            object4 = new StringBuilder((String)object3);
                            object3 = ((File)object2).getAbsolutePath();
                            ((StringBuilder)object4).append((String)object3);
                            object3 = ((StringBuilder)object4).toString();
                            Intrinsics.checkNotNullParameter(object3, string6);
                            object3 = JioAds.Companion;
                            object3 = ((JioAds$Companion)object3).getInstance();
                            object3 = ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object2 = JioAds$LogLevel.NONE;
                            break block5;
                        }
                        catch (Exception exception2) {
                            break block6;
                        }
                    }
                    object = object.getFilesDir();
                    object = ((File)object).getAbsolutePath();
                    object4 = "omid_js";
                    object3 = new File((String)object, (String)object4);
                    charSequence = new StringBuilder();
                    string5 = ((File)object3).getAbsolutePath();
                    ((StringBuilder)charSequence).append(string5);
                    string5 = File.separator;
                    ((StringBuilder)charSequence).append(string5);
                    string5 = "OmSdkJs.js";
                    ((StringBuilder)charSequence).append(string5);
                    charSequence = ((StringBuilder)charSequence).toString();
                    object4 = new File((String)charSequence);
                    object = new FileInputStream((File)object4);
                    object4 = new StringBuilder((String)object2);
                    object3 = ((File)object3).getAbsolutePath();
                    ((StringBuilder)object4).append((String)object3);
                    object3 = ((StringBuilder)object4).toString();
                    Intrinsics.checkNotNullParameter(object3, string6);
                    object3 = JioAds.Companion;
                    object3 = ((JioAds$Companion)object3).getInstance();
                    object3 = ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                }
                object3 = new InputStreamReader((InputStream)object);
                object2 = new BufferedReader((Reader)object3);
                while ((object = ((BufferedReader)object2).readLine()) != null) {
                    stringBuilder.append((String)object);
                }
                ((InputStreamReader)object3).close();
                ((BufferedReader)object2).close();
                object3 = stringBuilder.toString();
                Intrinsics.checkNotNullExpressionValue(object3, string4);
                a2.a((String)object3);
                break block7;
            }
            object2 = new StringBuilder("Exception while reading JS file: ");
            object = Utility.INSTANCE;
            com.jio.jioads.jioreel.tracker.model.b.c((Utility)object, exception2, (StringBuilder)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        }
        boolean bl4 = kotlin.text.b.i(string2, string3, bl2);
        if (bl4) {
            string3 = stringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(string3, string4);
            a2.a(string3);
        }
    }
}

