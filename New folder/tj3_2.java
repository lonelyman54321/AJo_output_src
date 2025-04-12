/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Color
 *  android.os.Handler
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.SeekBar
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.lifecycle.LiveData;
import androidx.media3.ui.PlayerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.DynamicCirclePageIndicator;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoView;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher$OnScaleChangeListener;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from TJ3
 */
public final class tj3_2
extends Uk2
implements PhotoViewAttacher$OnScaleChangeListener {
    public final mu1_1 c;
    public final ArrayList d;
    public final DynamicCirclePageIndicator e;
    public final vu_1 f;
    public Long g;
    public final Integer h;
    public final LinkedHashMap i;

    public tj3_2(mu1_1 linkedHashMap, ArrayList arrayList, DynamicCirclePageIndicator dynamicCirclePageIndicator, vu_1 vu_12, Long l2, Integer n3) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(arrayList, "urlList");
        Intrinsics.checkNotNullParameter(vu_12, "backHandleVideoPlayer");
        this.c = linkedHashMap;
        this.d = arrayList;
        this.e = dynamicCirclePageIndicator;
        this.f = vu_12;
        this.g = l2;
        this.h = n3;
        this.i = linkedHashMap = new LinkedHashMap();
    }

    public final void a(ViewGroup viewGroup, int n3, Object object) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        object = (View)object;
        viewGroup.removeView((View)object);
    }

    public final int c() {
        return this.d.size();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object f(int n3, ViewGroup viewGroup) {
        int n4;
        Object object = this;
        ViewGroup viewGroup2 = viewGroup;
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Object object2 = this.d.get(n3);
        Intrinsics.checkNotNullExpressionValue(object2, "get(...)");
        Object object3 = object2;
        object3 = (ProductImage)object2;
        Object object4 = new Ref$ObjectRef();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        ref$BooleanRef2.element = n4 = 1;
        Object object5 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object6 = new Ref$ObjectRef();
        Object object7 = new Ref$ObjectRef();
        Object object8 = new Ref$ObjectRef();
        Object object9 = new Ref$ObjectRef();
        Object object10 = new Ref$ObjectRef();
        object2 = ((ProductImage)object3).getFlagForImageAndVideo();
        Object object11 = Boolean.TRUE;
        int n7 = Intrinsics.areEqual(object2, object11);
        if (n7 != 0) {
            int n8;
            int n10;
            void var4_7;
            Object object12;
            Object object13;
            Ref$ObjectRef ref$ObjectRef2;
            Ref$ObjectRef ref$ObjectRef3;
            Ref$ObjectRef ref$ObjectRef4;
            Ref$ObjectRef ref$ObjectRef5;
            Object object14;
            Object object15;
            Object object16;
            object2 = LayoutInflater.from((Context)viewGroup.getContext());
            int n14 = R$layout.video_layout;
            Object object17 = null;
            object11 = object2.inflate(n14, viewGroup, false);
            n7 = R$id.playerView;
            object2 = (PlayerView)object11.findViewById(n7);
            n4 = R$id.progress;
            View view = object11.findViewById(n4);
            ((Ref$ObjectRef)object5).element = view;
            n4 = R$id.imgVolume;
            View view2 = object11.findViewById(n4);
            ref$ObjectRef.element = view2;
            n4 = R$id.imgThumbnail;
            View view3 = object11.findViewById(n4);
            ((Ref$ObjectRef)object6).element = view3;
            n4 = R$id.imgZoomOut;
            View view4 = object11.findViewById(n4);
            ((Ref$ObjectRef)object7).element = view4;
            n4 = R$id.imgPlayPause;
            View view5 = object11.findViewById(n4);
            ((Ref$ObjectRef)object8).element = view5;
            n4 = R$id.imgPlay;
            View view6 = object11.findViewById(n4);
            ((Ref$ObjectRef)object9).element = view6;
            n4 = R$id.seekBar;
            View view7 = object11.findViewById(n4);
            ((Ref$ObjectRef)object10).element = view7;
            if (object2 != null) {
                mj3_2 mj3_22;
                object17 = object2;
                object2 = mj3_22;
                object16 = object11;
                object11 = object4;
                object15 = object10;
                object10 = object7;
                object14 = object9;
                object9 = ref$ObjectRef;
                ref$ObjectRef5 = object8;
                ref$ObjectRef4 = object7;
                object7 = object15;
                ref$ObjectRef3 = object6;
                object6 = object14;
                Ref$ObjectRef ref$ObjectRef6 = ref$ObjectRef;
                ref$ObjectRef = ref$ObjectRef3;
                ref$ObjectRef2 = object5;
                object13 = object3;
                object3 = mj3_22;
                Ref$BooleanRef ref$BooleanRef3 = ref$BooleanRef;
                object12 = ref$BooleanRef2;
                object = object4;
                object4 = this;
                ((mj3_2)object2)((Ref$ObjectRef)object11, (Ref$ObjectRef)object10, (Ref$ObjectRef)object9, (Ref$ObjectRef)object8, (Ref$ObjectRef)object15, (Ref$ObjectRef)object14, ref$ObjectRef3, (Ref$ObjectRef)object5, ref$BooleanRef, ref$BooleanRef2, this);
                object17.setOnClickListener((View.OnClickListener)object2);
            } else {
                object17 = object2;
                object16 = object11;
                object15 = object10;
                object14 = object9;
                ref$ObjectRef5 = object8;
                ref$ObjectRef4 = object7;
                ref$ObjectRef3 = object6;
                Ref$ObjectRef ref$ObjectRef7 = ref$ObjectRef;
                ref$ObjectRef2 = object5;
                object12 = ref$BooleanRef2;
                object = object4;
                object13 = object3;
            }
            object2 = (ImageView)var4_7.element;
            if (object2 != null) {
                Ref$BooleanRef ref$BooleanRef4 = object12;
                object11 = new nj3_2((Ref$BooleanRef)object12, (Ref$ObjectRef)var4_7, (Ref$ObjectRef)object);
                object2.setOnClickListener((View.OnClickListener)object11);
            } else {
                Ref$BooleanRef ref$BooleanRef5 = object12;
            }
            object3 = object14;
            object4 = object2 = ((Ref$ObjectRef)object14).element;
            object4 = (ImageView)object2;
            if (object4 != null) {
                void var9_15;
                oj3_1 oj3_12;
                object2 = oj3_12;
                object11 = var4_7;
                object10 = ref$ObjectRef5;
                object9 = object15;
                object8 = ref$ObjectRef4;
                object7 = object14;
                object6 = ref$ObjectRef3;
                ref$ObjectRef = ref$ObjectRef2;
                object5 = object;
                object14 = object;
                object = oj3_12;
                Ref$BooleanRef ref$BooleanRef6 = ref$BooleanRef;
                object12 = object17;
                object17 = object4;
                object4 = this;
                ((oj3_1)object2)((Ref$ObjectRef)var4_7, ref$ObjectRef5, (Ref$ObjectRef)object15, ref$ObjectRef4, (Ref$ObjectRef)object3, ref$ObjectRef3, ref$ObjectRef2, (Ref$ObjectRef)object5, ref$BooleanRef, (Ref$BooleanRef)var9_15, this);
                object17.setOnClickListener((View.OnClickListener)object2);
            } else {
                object14 = object;
                object12 = object17;
            }
            Ref$ObjectRef ref$ObjectRef8 = ref$ObjectRef4;
            object2 = (ImageView)ref$ObjectRef4.element;
            if (object2 != null) {
                object = this;
                object17 = object14;
                object11 = new pj3_1((Ref$ObjectRef)object14, this);
                object2.setOnClickListener((View.OnClickListener)object11);
            } else {
                object = this;
                object17 = object14;
            }
            object2 = object4;
            object11 = ref$ObjectRef3;
            object10 = object3;
            object9 = ref$ObjectRef2;
            object8 = ref$BooleanRef;
            object7 = this;
            ref$ObjectRef = var4_7;
            object5 = ref$ObjectRef5;
            Object object18 = object15;
            Object object19 = object4;
            object4 = object17;
            ((sj3_1)object2)(ref$ObjectRef3, (Ref$ObjectRef)object3, ref$ObjectRef2, ref$BooleanRef, this, n3, ref$ObjectRef, ref$ObjectRef5, (Ref$ObjectRef)object15, ref$ObjectRef8, (Ref$ObjectRef)object17);
            object2 = object15;
            object11 = (SeekBar)((Ref$ObjectRef)object15).element;
            if (object11 != null) {
                object10 = new Object();
                object11.setOnTouchListener((View.OnTouchListener)object10);
            }
            if ((object11 = (SeekBar)((Ref$ObjectRef)object2).element) != null) {
                n10 = Color.parseColor((String)"#FFFFFF");
                object10 = ColorStateList.valueOf((int)n10);
                object11.setProgressTintList((ColorStateList)object10);
            }
            object11 = ref$ObjectRef3;
            object10 = (ImageView)ref$ObjectRef3.element;
            object9 = new da$a();
            ((da$a)object9).k = n8 = 1;
            ((da$a)object9).r = n8;
            n8 = R$string.acc_banner;
            object8 = hv3_0.K(n8);
            ((da$a)object9).b((String)object8);
            object8 = UrlHelper.Companion.getInstance();
            object7 = ((ProductImage)object13).getVideoThumbnail();
            ((da$a)object9).n = object8 = ((UrlHelper)object8).getImageUrl((String)object7);
            ((da$a)object9).u = object10;
            ((da$a)object9).a();
            object11 = (ImageView)ref$ObjectRef3.element;
            if (object11 != null) {
                ai0_2.B((View)object11);
            }
            object10 = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(object10, "getContext(...)");
            object9 = ((ProductImage)object13).getVideoUrl();
            object8 = object12;
            ((Ref$ObjectRef)object17).element = object11 = new ob_2((Context)object10, (PlayerView)((Object)object12), (pb_2)object19, (String)object9);
            n10 = 1;
            ((ob_2)object11).g = n10;
            long l2 = 0L;
            object7 = null;
            ob_2.h((ob_2)object11, l2, 0, n10);
            object11 = ((Ref$ObjectRef)object17).element;
            Intrinsics.checkNotNull(object11);
            object11 = ((ob_2)object11).n;
            object10 = new rj3_1((Ref$ObjectRef)object2);
            object2 = ((tj3_2)object).c;
            ((LiveData)object11).e((mu1_1)object2, (F62)object10);
            object11 = object16;
        } else {
            int n15;
            Object object20 = object3;
            object2 = viewGroup.getContext();
            object11 = new PhotoView((Context)object2);
            object2 = ImageView.ScaleType.CENTER;
            ((PhotoView)object11).setScaleType((ImageView.ScaleType)object2);
            ((PhotoView)object11).setOnScaleChangeListener(this);
            object2 = new da$a();
            ((da$a)object2).k = n15 = 1;
            ((da$a)object2).r = n15;
            n15 = R$string.acc_banner;
            object10 = hv3_0.K(n15);
            ((da$a)object2).b((String)object10);
            object10 = UrlHelper.Companion.getInstance();
            object9 = ((ProductImage)object3).getUrl();
            ((da$a)object2).n = object10 = ((UrlHelper)object10).getImageUrl((String)object9);
            ((da$a)object2).u = object11;
            ((da$a)object2).a();
        }
        n7 = -1;
        object10 = viewGroup;
        viewGroup.addView((View)object11, n7, n7);
        object2 = n3;
        ((tj3_2)object).i.put(object2, object11);
        return object11;
    }

    public final boolean g(View view, Object object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(view, "view");
        String string2 = "object";
        Intrinsics.checkNotNullParameter(object, string2);
        if (view == object) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }

    public final void onScaleChange(float f5, float f6, float f7) {
    }

    public final void updateUi(float f5, PhotoView object) {
        String string2 = "photoView";
        Intrinsics.checkNotNullParameter(object, string2);
        float f6 = ((PhotoView)object).getMaximumScale();
        float f7 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (f7 == false) {
            DynamicCirclePageIndicator dynamicCirclePageIndicator = this.e;
            if (dynamicCirclePageIndicator != null) {
                int n3 = 8;
                float f8 = 1.1E-44f;
                dynamicCirclePageIndicator.setVisibility(n3);
            }
        } else {
            float f11 = ((PhotoView)object).getMinimumScale();
            float f12 = f5 - f11;
            Object object2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            if (object2 == false) {
                Handler handler = new Handler();
                f7 = 2;
                f6 = 2.8E-45f;
                object = new A1(this, (int)f7);
                long l2 = 200L;
                handler.postDelayed((Runnable)object, l2);
            }
        }
    }
}

