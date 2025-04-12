/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.media3.common.b;
import com.ril.ajio.R$color;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tg0
 */
public final class tg0_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tg0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        boolean bl2 = true;
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl3;
                object2 = (dj2_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((dj2_2)object2).c;
                String string2 = "imgVolume";
                boolean bl4 = false;
                String string3 = null;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl3 = false;
                    object = null;
                }
                ai0_2.B((View)object);
                object = ((dj2_2)object2).c;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl3 = false;
                    object = null;
                }
                ai0_2.a((View)object);
                object = ((dj2_2)object2).h;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
                    bl3 = false;
                    object = null;
                }
                ai0_2.B((View)object);
                object = ((dj2_2)object2).d;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgClose");
                    bl3 = false;
                    object = null;
                }
                ai0_2.B((View)object);
                object = ((dj2_2)object2).g;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgPause");
                    bl3 = false;
                    object = null;
                }
                ai0_2.B((View)object);
                object = ((dj2_2)object2).j;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progress");
                    bl3 = false;
                    object = null;
                }
                ai0_2.i((View)object);
                object = ((dj2_2)object2).k;
                string2 = "ajioVideoPlayer";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl3 = false;
                    object = null;
                }
                if ((object = ((ob_2)object).i) == null || (bl3 = ((b)object).isPlaying()) != bl2) {
                    object = ((dj2_2)object2).k;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl3 = false;
                        object = null;
                    }
                    if ((object = ((ob_2)object).i) != null) {
                        object.setPlayWhenReady(bl2);
                    }
                    VideoComponentEvents videoComponentEvents = VideoComponentEvents.Companion.getInstance();
                    String string4 = ai0_2.h(((dj2_2)object2).l);
                    long l2 = ((dj2_2)object2).s;
                    Object object3 = ((Fragment)object2).getArguments();
                    if (object3 != null) {
                        object = "product_id";
                        object3 = object3.getString((String)object);
                    } else {
                        bl2 = false;
                        object3 = null;
                    }
                    String string5 = String.valueOf(object3);
                    object3 = ((Fragment)object2).getArguments();
                    if (object3 != null) {
                        object = "product_name";
                        string3 = object3.getString((String)object);
                    }
                    String string6 = String.valueOf(string3);
                    String string7 = "video_banner_interactions";
                    String string8 = "video_screen_interaction";
                    boolean bl5 = true;
                    boolean bl6 = true;
                    videoComponentEvents.logPlayPauseEvent(string4, false, l2, string5, string6, bl5, bl6, string7, string8);
                }
                return;
            }
            case 0: 
        }
        CustomWebViewActivity$a customWebViewActivity$a = CustomWebViewActivity.Companion;
        object2 = (CustomWebViewActivity)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        ((CustomWebViewActivity)object2).E2().webviewContainer.setVisibility(0);
        object = ((CustomWebViewActivity)object2).E2().tvPrivacy;
        Resources resources = ((AppCompatActivity)object2).getResources();
        int n4 = R$color.white;
        int n7 = resources.getColor(n4);
        object.setTextColor(n7);
        ((CustomWebViewActivity)object2).E2().tvPrivacy.setSelected(bl2);
        AjioTextView ajioTextView = ((CustomWebViewActivity)object2).E2().tvYourData;
        object = ((AppCompatActivity)object2).getResources();
        n7 = R$color.color_202020;
        int n8 = object.getColor(n7);
        ajioTextView.setTextColor(n8);
        ((CustomWebViewActivity)object2).E2().tvYourData.setSelected(false);
        ((CustomWebViewActivity)object2).E2().webviewContainerDelete.setVisibility(8);
    }
}

