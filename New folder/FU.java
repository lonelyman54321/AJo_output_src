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
import com.chuckerteam.chucker.R$id;
import com.chuckerteam.chucker.R$layout;

public final class FU
implements BC3 {
    public final FrameLayout a;
    public final ImageView b;

    public FU(FrameLayout frameLayout, ImageView imageView) {
        this.a = frameLayout;
        this.b = imageView;
    }

    public static FU bind(View object) {
        int n3 = R$id.binaryData;
        ImageView imageView = (ImageView)object.findViewById(n3);
        if (imageView != null) {
            object = (FrameLayout)object;
            FU fU = new FU((FrameLayout)object, imageView);
            return fU;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FU inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.chucker_transaction_item_image;
        return FU.bind(layoutInflater.inflate(n3, null, false));
    }

    public final View getRoot() {
        return this.a;
    }
}

