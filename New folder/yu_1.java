/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 */
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.skydoves.balloon.R$id;
import com.skydoves.balloon.R$layout;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;

/*
 * Renamed from Yu
 */
public final class yu_1
implements BC3 {
    public final FrameLayout a;
    public final FrameLayout b;
    public final ImageView c;
    public final RadiusLayout d;
    public final FrameLayout e;
    public final VectorTextView f;
    public final FrameLayout g;

    public yu_1(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, RadiusLayout radiusLayout, FrameLayout frameLayout3, VectorTextView vectorTextView, FrameLayout frameLayout4) {
        this.a = frameLayout;
        this.b = frameLayout2;
        this.c = imageView;
        this.d = radiusLayout;
        this.e = frameLayout3;
        this.f = vectorTextView;
        this.g = frameLayout4;
    }

    public static yu_1 bind(View object) {
        View view;
        View view2 = object;
        view2 = (FrameLayout)object;
        int n3 = R$id.balloon_arrow;
        View view3 = view = dd2_2.a(n3, object);
        view3 = (ImageView)view;
        if (view3 != null) {
            n3 = R$id.balloon_card;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (RadiusLayout)view;
            if (object2 != null) {
                n3 = R$id.balloon_content;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (FrameLayout)view;
                if (view4 != null) {
                    n3 = R$id.balloon_text;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (VectorTextView)view;
                    if (object3 != null) {
                        n3 = R$id.balloon_wrapper;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (FrameLayout)view;
                        if (view5 != null) {
                            Object object4 = object;
                            view = view2;
                            object = new yu_1((FrameLayout)view2, (FrameLayout)view2, (ImageView)view3, (RadiusLayout)((Object)object2), (FrameLayout)view4, (VectorTextView)object3, (FrameLayout)view5);
                            return object;
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static yu_1 inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.balloon_layout_body;
        return yu_1.bind(layoutInflater.inflate(n3, null, false));
    }

    public final View getRoot() {
        return this.a;
    }
}

