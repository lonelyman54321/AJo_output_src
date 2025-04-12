/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from l7
 */
public final class l7_0
implements F62 {
    public final /* synthetic */ AjioExoPlayerFragment a;

    public /* synthetic */ l7_0(AjioExoPlayerFragment ajioExoPlayerFragment) {
        this.a = ajioExoPlayerFragment;
    }

    /*
     * Unable to fully structure code
     */
    public final void onChanged(Object var1_1) {
        block9: {
            var1_1 = (Long)var1_1;
            var2_2 = this.a;
            Intrinsics.checkNotNullParameter(var2_2, "this$0");
            var3_3 = TimeUnit.MILLISECONDS;
            Intrinsics.checkNotNull(var1_1);
            var4_4 = var1_1.longValue();
            var6_5 = var3_3.toSeconds(var4_4);
            var8_6 = 2;
            var10_7 = var6_5 == var8_6 ? 0 : (var6_5 < var8_6 ? -1 : 1);
            if (var10_7 <= 0 || (var10_7 = (long)var2_2.u) != false) break block9;
            var10_7 = 1;
            var2_2.u = var10_7;
            var3_3 = cp_1.Companion;
            var11_8 = km_1.b((cp$a)var3_3);
            if (var11_8 && !(var11_8 = var2_2.y)) {
                var3_3 = var2_2.a;
                if (var3_3 != null && (var3_3 = var3_3.i) != null) {
                    var12_9 = null;
                    var3_3.setVolume(0.0f);
                }
                if ((var3_3 = var2_2.k) != null) {
                    var3_3.h = var12_9 = Boolean.FALSE;
                }
                var2_2.Sa();
            }
            var12_9 = VideoComponentEvents.Companion.getInstance();
            var3_3 = var2_2.p;
            if (var3_3 != null && (var3_3 = var3_3.getBannerUrl()) != null && (var3_3 = ai0_2.h((String)var3_3)) != null) lbl-1000:
            // 2 sources

            {
                while (true) {
                    continue;
                    break;
                }
            }
            var3_3 = "";
            ** while (true)
            var13_10 = var3_3;
            var3_3 = var2_2.a;
            if (var3_3 == null) ** GOTO lbl-1000
            var3_3 = var2_2.p;
            if (var3_3 != null) {
                var3_3 = var3_3.getVideoSettings();
            } else {
                var11_8 = false;
                var3_3 = null;
            }
            var11_8 = ow_0.g((VideoSetting)var3_3);
            if (var11_8 == var10_7) {
                var14_11 = true;
            } else lbl-1000:
            // 2 sources

            {
                var14_11 = false;
            }
            var15_12 = var2_2.s;
            var17_13 = "video_banner_interactions";
            var18_14 = "landing_screen_interactions";
            var12_9.logVideoWatchEvent(false, (String)var13_10, var14_11, var15_12, var17_13, var18_14);
        }
    }
}

