/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.RelativeLayout
 */
import android.view.View;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import kotlin.jvm.internal.Intrinsics;

public final class d10
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d10(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                long l2;
                long l3;
                long l4;
                b33_0 b33_02 = (b33_0)this.b;
                Intrinsics.checkNotNullParameter(b33_02, "this$0");
                long l7 = b33_02.N;
                long l8 = 1L;
                b33_02.N = l7 += l8;
                b33_02.O = l7 = b33_02.O + l8;
                Object object = b33_02.P;
                Object object2 = b33_02.Q;
                object.postDelayed((Runnable)object2, 1000L);
                l7 = b33_02.N;
                l8 = 3;
                Object object3 = l8 == l7 ? 0 : (l8 < l7 ? -1 : 1);
                if (object3 <= 0 && (l4 = (l3 = l7 - (l2 = (long)4)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
                    VideoComponentEvents videoComponentEvents = VideoComponentEvents.Companion.getInstance();
                    object = b33_02.C;
                    object2 = null;
                    String string2 = "bannerData";
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl2 = false;
                        object = null;
                    }
                    if ((object = ((BannerData)object).getDynamicPageMetadata()) == null || (object = ((DynamicPageMetadata)object).getExtendedUrl()) == null || (object = ai0_2.h((String)object)) == null) {
                        object = "";
                    }
                    Object object4 = object;
                    object = b33_02.C;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object2 = object;
                    }
                    object = ((BannerData)object2).getVideoSettings();
                    object2 = b33_02.c;
                    object2.getClass();
                    boolean bl3 = ow_0.g((VideoSetting)object);
                    long l12 = b33_02.J;
                    String string3 = "video_screen_interaction";
                    boolean bl4 = true;
                    String string4 = "shop the look video interactions";
                    videoComponentEvents.logVideoWatchEvent(bl4, (String)object4, bl3, l12, string4, string3);
                }
                if (!(bl2 = km_1.b((cp$a)(object = cp_1.Companion)))) return;
                l7 = b33_02.N;
                long l14 = l7 - l8;
                object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (object3 < 0) return;
                bl2 = b33_02.e;
                if (bl2) return;
                b33_02.e = bl2 = true;
                b33_02.z(bl2);
                return;
            }
            case 1: {
                RelativeLayout relativeLayout = (RelativeLayout)this.b;
                if (relativeLayout == null) return;
                ai0_2.a((View)relativeLayout);
                return;
            }
            case 0: 
        }
        ComponentActivity componentActivity = (ComponentActivity)this.b;
        try {
            ComponentActivity.access$onBackPressed$s1027565324(componentActivity);
            return;
        }
        catch (NullPointerException nullPointerException) {
            String string5 = ((Throwable)nullPointerException).getMessage();
            String string6 = "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference";
            boolean bl5 = Intrinsics.areEqual(string5, string6);
            if (!bl5) throw nullPointerException;
            return;
        }
        catch (IllegalStateException illegalStateException) {
            String string7 = illegalStateException.getMessage();
            String string8 = "Can not perform this action after onSaveInstanceState";
            boolean bl6 = Intrinsics.areEqual(string7, string8);
            if (!bl6) throw illegalStateException;
        }
    }
}

