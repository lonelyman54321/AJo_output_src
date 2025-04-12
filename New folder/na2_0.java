/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.analytics.events.VideoComponentEvents$Companion;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.services.data.Order.orderhistory.DateRangeItem;
import com.ril.ajio.stl.fragment.ShopTheLookFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Na2
 */
public final class na2_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ na2_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4;
                object2 = (ShopTheLookFragment)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((ShopTheLookFragment)object2).b;
                n3 = 0;
                Object object3 = null;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stlCloseIv");
                    n4 = 0;
                    object = null;
                }
                ai0_2.a((View)object);
                object = eb_2.a;
                object = ((ShopTheLookFragment)object2).d;
                Object object4 = "selectedBanner";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n4 = 0;
                    object = null;
                }
                if ((object = ((BannerData)object).getDynamicPageMetadata()) != null) {
                    object = ((DynamicPageMetadata)object).getDuration();
                } else {
                    n4 = 0;
                    object = null;
                }
                n4 = eb_2.d((Long)object);
                if (n4 != 0) {
                    object = ((ShopTheLookFragment)object2).Qa();
                    if (object != null) {
                        boolean bl2;
                        boolean bl3;
                        boolean bl4;
                        ((b33_0)object).y();
                        object4 = VideoComponentEvents.Companion;
                        VideoComponentEvents videoComponentEvents = ((VideoComponentEvents$Companion)object4).getInstance();
                        String string2 = String.valueOf(((b33_0)object).I);
                        long l2 = ((b33_0)object).J;
                        Object object5 = ((b33_0)object).C;
                        String string3 = "bannerData";
                        if (object5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            bl4 = false;
                            object5 = null;
                        }
                        object5 = ((BannerData)object5).getVideoSettings();
                        boolean bl5 = false;
                        if (object5 != null) {
                            object5 = ((VideoSetting)object5).getAutoPlay();
                            Boolean bl6 = Boolean.TRUE;
                            bl3 = bl4 = Intrinsics.areEqual(object5, bl6);
                        } else {
                            bl3 = false;
                            Object var16_20 = null;
                        }
                        int n7 = 64;
                        bl4 = false;
                        object5 = null;
                        String string4 = "shop the look video interactions";
                        String string5 = "video_screen_interaction";
                        VideoComponentEvents.logExpandMinimizeEvent$default(videoComponentEvents, false, string2, bl3, l2, string4, string5, null, n7, null);
                        VideoComponentEvents videoComponentEvents2 = ((VideoComponentEvents$Companion)object4).getInstance();
                        object4 = ((b33_0)object).I;
                        String string6 = String.valueOf(object4);
                        long l3 = ((b33_0)object).J;
                        object = ((b33_0)object).C;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                        } else {
                            object3 = object;
                        }
                        object = ((BannerData)object3).getVideoSettings();
                        if (object != null) {
                            object = ((VideoSetting)object).getAutoPlay();
                            object3 = Boolean.TRUE;
                            bl2 = bl5 = Intrinsics.areEqual(object, object3);
                        } else {
                            bl2 = false;
                        }
                        String string7 = "shop the look video interactions";
                        String string8 = "video_screen_interaction";
                        videoComponentEvents2.logCloseVideoEvent(string6, bl2, l3, string7, string8);
                    }
                } else {
                    object = ((ShopTheLookFragment)object2).d;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n4 = 0;
                        object = null;
                    }
                    if ((object = ((BannerData)object).getBannerUrl()) != null) {
                        object4 = ((ShopTheLookFragment)object2).Ra();
                        object4.getClass();
                        Intrinsics.checkNotNullParameter(object, "imageUrl");
                        aW aW2 = md3_0.c((jD3)object4);
                        x33_0 x33_02 = new x33_0((e43_0)object4, (String)object, null);
                        n4 = 3;
                        Ae3.d(aW2, null, null, x33_02, n4);
                    }
                }
                if ((object = ((Fragment)object2).getActivity()) != null) {
                    ((ComponentActivity)object).onBackPressed();
                }
                return;
            }
            case 0: 
        }
        object2 = (oa2_1)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = ((oa2_1)object2).b;
        if (object != null) {
            String string9 = "";
            DateRangeItem dateRangeItem = new DateRangeItem(string9, string9);
            int n8 = ((RecyclerView$B)object2).getAdapterPosition();
            object.a(n8, dateRangeItem);
        }
    }
}

