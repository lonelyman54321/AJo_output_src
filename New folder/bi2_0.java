/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder$b;
import com.ril.ajio.services.data.Product.KYPImage;
import com.ril.ajio.services.data.Product.KYPMedia;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Bi2
 */
public final class bi2_0
extends RecyclerView$f {
    public static final Bi2$a Companion;
    public final List a;
    public final yi2_1 b;
    public final ma_2 c;
    public final HashMap d;

    static {
        Bi2$a bi2$a;
        Companion = bi2$a = new Object();
    }

    public bi2_0(List hashMap, yi2_1 yi2_12, ma_2 ma_22) {
        Intrinsics.checkNotNullParameter(hashMap, "kypList");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(ma_22, "ajioVideoPlayer");
        this.a = hashMap;
        this.b = yi2_12;
        this.c = ma_22;
        this.d = hashMap = new HashMap();
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final int getItemViewType(int n3) {
        int n4;
        int n7;
        List list = this.a;
        Integer n8 = ((KYPMedia)list.get(n3)).getMediaType();
        if (!(n8 != null && (n7 = n8.intValue()) == (n4 = 1) || n8 != null && (n3 = n8.intValue()) == (n4 = 2))) {
            n4 = -1;
        }
        return n4;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        block47: {
            float f5;
            int n4;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            int n7;
            HashMap hashMap;
            Object object6;
            Object object7;
            block51: {
                block50: {
                    long l2;
                    float f6;
                    int n8;
                    rh0_2 rh0_22;
                    float f7;
                    int n10;
                    Object object8;
                    ma_2 ma_22;
                    int n14;
                    int n15;
                    block48: {
                        block49: {
                            Object object9;
                            block46: {
                                Intrinsics.checkNotNullParameter(object, "holder");
                                object7 = this.getItemViewType(n3);
                                object6 = n3;
                                hashMap = this.d;
                                hashMap.put(object7, object6);
                                n15 = object instanceof ti2_2;
                                n14 = 1;
                                n7 = -1;
                                object5 = null;
                                object4 = "kypMedia";
                                object3 = this.a;
                                if (n15 == 0) break block46;
                                object = (ti2_2)object;
                                Object object10 = (KYPMedia)object3.get(n3);
                                object.getClass();
                                Intrinsics.checkNotNullParameter(object10, (String)object4);
                                object7 = ((KYPMedia)object10).getHeight();
                                if (object7 != null) {
                                    int n16;
                                    long l3 = ((Number)object7).longValue();
                                    object7 = ((ti2_2)object).d;
                                    String string2 = "ivKypBanner";
                                    if (object7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n15 = 0;
                                        object7 = null;
                                        float f8 = 0.0f;
                                    }
                                    object7 = object7.getLayoutParams();
                                    ((ViewGroup.LayoutParams)object7).height = n16 = (int)l3;
                                    ((ViewGroup.LayoutParams)object7).width = n7;
                                    hashMap = ((ti2_2)object).d;
                                    if (hashMap == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n7 = 0;
                                        hashMap = null;
                                    }
                                    hashMap.setLayoutParams((ViewGroup.LayoutParams)object7);
                                    object7 = new da$a();
                                    ((da$a)object7).k = n14;
                                    ((da$a)object7).g = n14;
                                    object10 = ((KYPMedia)object10).getUrl();
                                    object = ((ti2_2)object).d;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    } else {
                                        object5 = object;
                                    }
                                    ((da$a)object7).n = object10;
                                    ((da$a)object7).u = object5;
                                    ((da$a)object7).a();
                                }
                                break block47;
                            }
                            n15 = object instanceof PDPVideoKYPHolder;
                            if (n15 == 0) break block47;
                            object = (PDPVideoKYPHolder)object;
                            object7 = (KYPMedia)object3.get(n3);
                            long l4 = n3;
                            object2 = l4;
                            object.getClass();
                            Intrinsics.checkNotNullParameter(object7, (String)object4);
                            object4 = ((PDPVideoKYPHolder)object).F;
                            n3 = (int)(CollectionsKt.F((Iterable)object4, object2) ? 1 : 0);
                            if (n3 == 0) {
                                object2 = l4;
                                ((HashSet)object4).add(object2);
                                object4 = VideoComponentEvents.Companion.getInstance();
                                object2 = ((PDPVideoKYPHolder)object).u;
                                object3 = String.valueOf(object2);
                                long l7 = ((PDPVideoKYPHolder)object).v;
                                n4 = 0;
                                f5 = 0.0f;
                                ma_22 = null;
                                object9 = "pdp_video_interactions";
                                String string3 = "pdp_screen_interaction";
                                String string4 = "video impression";
                                ((VideoComponentEvents)object4).logVideoThumbnailEvent((String)object3, false, l7, (String)object9, string3, string4);
                            }
                            ((PDPVideoKYPHolder)object).q = object7;
                            cp_1.Companion.getClass();
                            ((PDPVideoKYPHolder)object).r = object2 = cp$a.d().getVideoSettings();
                            object2 = ((PDPVideoKYPHolder)object).i;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
                                n3 = 0;
                                object2 = null;
                            }
                            int n17 = 1;
                            object4 = new sx1_0(object, n17);
                            object2.setOnClickListener((View.OnClickListener)object4);
                            object2 = ((PDPVideoKYPHolder)object).j;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
                                n3 = 0;
                                object2 = null;
                            }
                            n17 = 0;
                            object3 = null;
                            object4 = new vj2_2(object, 0);
                            object2.setOnClickListener((View.OnClickListener)object4);
                            object2 = ((PDPVideoKYPHolder)object).n;
                            object4 = "imgFullScreen";
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                                n3 = 0;
                                object2 = null;
                            }
                            object3 = new wj2_1((PDPVideoKYPHolder)object, (KYPMedia)object7);
                            object2.setOnClickListener((View.OnClickListener)object3);
                            object2 = ((PDPVideoKYPHolder)object).k;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
                                n3 = 0;
                                object2 = null;
                            }
                            object3 = new xj2_1((PDPVideoKYPHolder)object, (KYPMedia)object7);
                            object2.setOnClickListener((View.OnClickListener)object3);
                            object2 = ((PDPVideoKYPHolder)object).l;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("imgPause");
                                n3 = 0;
                                object2 = null;
                            }
                            object3 = new yj2_1((PDPVideoKYPHolder)object);
                            object2.setOnClickListener((View.OnClickListener)object3);
                            object2 = ((PDPVideoKYPHolder)object).e;
                            object3 = "parentView";
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                n3 = 0;
                                object2 = null;
                            }
                            object2 = zv0_2.b(object2.getContext());
                            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type android.app.Activity");
                            object2 = (mu1_1)((Activity)object2);
                            ma_22 = ((PDPVideoKYPHolder)object).c;
                            object8 = ma_22.m;
                            n10 = 3;
                            f7 = 4.2E-45f;
                            rh0_22 = new rh0_2(object, n10);
                            object9 = new PDPVideoKYPHolder$b(rh0_22);
                            ((LiveData)object8).e((mu1_1)object2, (F62)object9);
                            object2 = ((KYPMedia)object7).getUrl();
                            if (object2 != null) {
                                n8 = 6;
                                f6 = 8.4E-45f;
                                n10 = 0;
                                f7 = 0.0f;
                                object9 = null;
                                int n18 = StringsKt.Q((CharSequence)object2, '/', 0, n8) + n14;
                                object2 = ((String)object2).substring(n18);
                                object8 = "substring(...)";
                                Intrinsics.checkNotNullExpressionValue(object2, (String)object8);
                            } else {
                                n3 = 0;
                                object2 = null;
                            }
                            ((PDPVideoKYPHolder)object).u = object2;
                            n3 = ((PDPVideoKYPHolder)object).w();
                            object2 = ma_22.e(n3);
                            object8 = "imgThumbnail";
                            if (object2 == null || (object2 = ((lt2_1)object2).b) == null || (n3 = (int)(object2.isPlaying() ? 1 : 0)) != 0) break block48;
                            n3 = ((PDPVideoKYPHolder)object).w();
                            object2 = ma_22.e(n3);
                            if (object2 == null) break block49;
                            object2 = ((lt2_1)object2).e;
                            n8 = ((PDPVideoKYPHolder)object).w();
                            if (object2 != null && (n3 = ((Integer)object2).intValue()) == n8) break block48;
                        }
                        if ((object2 = ((PDPVideoKYPHolder)object).m) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                            n3 = 0;
                            object2 = null;
                        }
                        ai0_2.B((View)object2);
                    }
                    if ((object2 = ((KYPMedia)object7).getThumbnail()) != null && (object2 = ((KYPImage)object2).getHeight()) != null) {
                        l2 = ((Number)object2).longValue();
                        object2 = ((KYPMedia)object7).getThumbnail();
                        if (object2 != null && (object2 = ((KYPImage)object2).getWidth()) != null) {
                            long l8 = ((Number)object2).longValue();
                            object2 = ((PDPVideoKYPHolder)object).m;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                                n3 = 0;
                                object2 = null;
                            }
                            object2 = object2.getLayoutParams();
                            f6 = l2;
                            f7 = l8;
                            f6 /= f7;
                            n10 = hv3_0.F();
                            f7 = n10;
                            ((ViewGroup.LayoutParams)object2).height = n8 = (int)(f6 *= f7);
                            ((ViewGroup.LayoutParams)object2).width = n7;
                            rh0_22 = ((PDPVideoKYPHolder)object).m;
                            if (rh0_22 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                                n8 = 0;
                                rh0_22 = null;
                                f6 = 0.0f;
                            }
                            rh0_22.setLayoutParams((ViewGroup.LayoutParams)object2);
                            object2 = new da$a();
                            ((da$a)object2).k = n14;
                            ((da$a)object2).r = n14;
                            n14 = R$string.acc_banner;
                            object6 = hv3_0.K(n14);
                            ((da$a)object2).b((String)object6);
                            object6 = ((KYPMedia)object7).getThumbnail();
                            if (object6 != null) {
                                object6 = ((KYPImage)object6).getUrl();
                            } else {
                                n14 = 0;
                                object6 = null;
                            }
                            rh0_22 = ((PDPVideoKYPHolder)object).m;
                            if (rh0_22 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                                n8 = 0;
                                rh0_22 = null;
                                f6 = 0.0f;
                            }
                            ((da$a)object2).n = object6;
                            ((da$a)object2).u = rh0_22;
                            ((da$a)object2).a();
                        }
                    }
                    ma_22.q();
                    object2 = ((PDPVideoKYPHolder)object).g;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("playerView");
                        n3 = 0;
                        object2 = null;
                    }
                    object2.setOnClickListener((View.OnClickListener)object);
                    object2 = ((KYPMedia)object7).getHeight();
                    object6 = "layoutVideo";
                    if (object2 == null) break block50;
                    long l12 = ((Number)object2).longValue();
                    object2 = ((KYPMedia)object7).getWidth();
                    if (object2 != null) {
                        l2 = ((Number)object2).longValue();
                        object2 = ((PDPVideoKYPHolder)object).f;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                            n3 = 0;
                            object2 = null;
                        }
                        object2 = object2.getLayoutParams();
                        float f11 = l12;
                        f5 = l2;
                        f11 /= f5;
                        n4 = hv3_0.F();
                        f5 = n4;
                        ((ViewGroup.LayoutParams)object2).height = n15 = (int)(f11 *= f5);
                        ((ViewGroup.LayoutParams)object2).width = n7;
                        object7 = ((PDPVideoKYPHolder)object).f;
                        if (object7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                            n15 = 0;
                            object7 = null;
                            f11 = 0.0f;
                        }
                        object7.setLayoutParams((ViewGroup.LayoutParams)object2);
                        object2 = Unit.a;
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null) break block51;
                }
                if ((object2 = ((PDPVideoKYPHolder)object).f) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n3 = 0;
                    object2 = null;
                }
                ai0_2.i((View)object2);
            }
            object2 = ((PDPVideoKYPHolder)object).r;
            object7 = "videoSetting";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n3 = 0;
                object2 = null;
            }
            if ((n3 = (int)(Intrinsics.areEqual(object2 = ((VideoSetting)object2).getShowTimestamp(), object6 = Boolean.FALSE) ? 1 : 0)) != 0) {
                object2 = ((PDPVideoKYPHolder)object).p;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
                    n3 = 0;
                    object2 = null;
                }
                ai0_2.i((View)object2);
                object2 = ((PDPVideoKYPHolder)object).h;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("seekbar");
                    n3 = 0;
                    object2 = null;
                }
                object2 = object2.getLayoutParams();
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                object2 = (ConstraintLayout$LayoutParams)((Object)object2);
                hashMap = ((PDPVideoKYPHolder)object).e;
                if (hashMap == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n7 = 0;
                    hashMap = null;
                }
                hashMap = hashMap.getContext();
                n4 = 11;
                f5 = 1.5E-44f;
                n7 = ai0_2.e(n4, (Context)hashMap);
                object2.setMarginEnd(n7);
            }
            if ((object2 = ((PDPVideoKYPHolder)object).r) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n3 = 0;
                object2 = null;
            }
            if ((n3 = (int)(Intrinsics.areEqual(object2 = ((VideoSetting)object2).getFullScreen(), object6) ? 1 : 0)) != 0) {
                object2 = ((PDPVideoKYPHolder)object).n;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n3 = 0;
                    object2 = null;
                }
                ai0_2.i((View)object2);
            }
            if ((object2 = ((PDPVideoKYPHolder)object).e) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                object5 = object2;
            }
            object2 = Xv1.a(object5.getContext());
            object6 = "media_stop_notification";
            object7 = new IntentFilter((String)object6);
            object = ((PDPVideoKYPHolder)object).H;
            ((Xv1)object2).b((BroadcastReceiver)object, (IntentFilter)object7);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        void var6_12;
        int n4;
        LayoutInflater layoutInflater = ck0.a(object, "parent");
        int n7 = 1;
        yi2_1 yi2_12 = this.b;
        if (n4 == n7) {
            n4 = R$layout.row_know_the_product_image;
            View view = layoutInflater.inflate(n4, object, false);
            Intrinsics.checkNotNull(view);
            ti2_2 ti2_22 = new ti2_2(view, yi2_12);
            return var6_12;
        }
        n7 = 2;
        if (n4 == n7) {
            n4 = R$layout.row_know_the_product_video;
            View view = layoutInflater.inflate(n4, object, false);
            Intrinsics.checkNotNull(view);
            ma_2 ma_22 = this.c;
            PDPVideoKYPHolder pDPVideoKYPHolder = new PDPVideoKYPHolder(view, yi2_12, ma_22, this);
            return var6_12;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid view type");
        throw illegalArgumentException;
    }
}

