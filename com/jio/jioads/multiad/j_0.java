/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.jio.jioads.multiad;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.util.Utility;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.multiad.J
 */
public final class j_0
implements NetworkTaskListener {
    public final /* synthetic */ Context a;

    public j_0(Context context) {
        this.a = context;
    }

    public final void onError(int n3, Object object, Map map2) {
        Intrinsics.checkNotNullParameter("error while downloading OMID js file", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final void onSuccess(String object, Map object2) {
        block14: {
            Object object3;
            Context context;
            block11: {
                IOException iOException22;
                Object object4;
                block13: {
                    object2 = "message";
                    boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                    if (bl2) break block14;
                    context = this.a;
                    Intrinsics.checkNotNullParameter(context, "context");
                    object3 = "omid_js";
                    Intrinsics.checkNotNullParameter(object3, "fileName");
                    CharSequence charSequence = context.getFilesDir().getAbsolutePath();
                    object4 = new File((String)charSequence, (String)object3);
                    boolean bl3 = ((File)object4).exists();
                    if (!bl3) {
                        ((File)object4).mkdir();
                    }
                    charSequence = new StringBuilder();
                    object4 = ((File)object4).getAbsolutePath();
                    ((StringBuilder)charSequence).append((String)object4);
                    object4 = File.separator;
                    String string2 = "OmSdkJs.js";
                    object4 = h30_0.a((StringBuilder)charSequence, (String)object4, string2);
                    object3 = new File((String)object4);
                    boolean n3 = ((File)object3).exists();
                    if (n3) {
                        ((File)object3).delete();
                    }
                    ((File)object3).createNewFile();
                    object4 = new FileWriter((File)object3);
                    object3 = new BufferedWriter((Writer)object4);
                    ((Writer)object3).append((CharSequence)object);
                    ((BufferedWriter)object3).newLine();
                    ((BufferedWriter)object3).close();
                    ((Writer)object4).close();
                    object = "OMID js file is saved properly";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    object = JioAds.Companion;
                    object = ((JioAds$Companion)object).getInstance();
                    try {
                        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                        break block11;
                    }
                    catch (Exception exception) {
                    }
                    catch (IOException iOException22) {
                        break block13;
                    }
                    object3 = new StringBuilder("Exception while creating OMID JS file: ");
                    object4 = Utility.INSTANCE;
                    b.c((Utility)object4, exception, (StringBuilder)object3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    break block11;
                }
                object3 = new StringBuilder("IOException while creating OMID JS file: ");
                object4 = Utility.INSTANCE;
                object = ((Utility)object4).printStacktrace(iOException22);
                ((StringBuilder)object3).append((String)object);
                Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), (String)object2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
            object = Calendar.getInstance(Locale.ENGLISH);
            object3 = TimeUnit.HOURS;
            long l2 = 24;
            long l3 = ((TimeUnit)((Object)object3)).toMillis(l2);
            long l4 = ((Calendar)object).getTimeInMillis() + l3;
            object = new StringBuilder("OMID js Response received.nextJsFetchTime: ");
            ((StringBuilder)object).append(l4);
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = l4;
            object2 = "omsdkJsStoreTime";
            object3 = "master_config_pref";
            int n3 = 3;
            com.jio.jioads.adinterfaces.j_0.p(context, (String)object3, n3, object, (String)object2);
        }
    }
}

