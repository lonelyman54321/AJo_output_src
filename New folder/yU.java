/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.chuckerteam.chucker.R$id;
import com.chuckerteam.chucker.R$layout;
import com.google.android.material.progressindicator.CircularProgressIndicator;

public final class yU
implements BC3 {
    public final ConstraintLayout a;
    public final TextView b;
    public final Group c;
    public final CircularProgressIndicator d;
    public final RecyclerView e;

    public yU(ConstraintLayout constraintLayout, TextView textView, Group group, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = group;
        this.d = circularProgressIndicator;
        this.e = recyclerView;
    }

    public static yU bind(View object) {
        int n3 = R$id.emptyPayloadImage;
        ImageView imageView = (ImageView)object.findViewById(n3);
        if (imageView != null) {
            n3 = R$id.emptyPayloadTextView;
            ImageView imageView2 = imageView = object.findViewById(n3);
            imageView2 = (TextView)imageView;
            if (imageView2 != null) {
                n3 = R$id.emptyStateGroup;
                Object object2 = imageView = object.findViewById(n3);
                object2 = (Group)imageView;
                if (object2 != null) {
                    n3 = R$id.loadingProgress;
                    Object object3 = imageView = object.findViewById(n3);
                    object3 = (CircularProgressIndicator)imageView;
                    if (object3 != null) {
                        n3 = R$id.payloadRecyclerView;
                        Object object4 = imageView = object.findViewById(n3);
                        object4 = (RecyclerView)imageView;
                        if (object4 != null) {
                            Object object5 = object;
                            object5 = (ConstraintLayout)((Object)object);
                            yU yU2 = new yU((ConstraintLayout)((Object)object5), (TextView)imageView2, (Group)((Object)object2), (CircularProgressIndicator)((Object)object3), (RecyclerView)object4);
                            return yU2;
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

    public static yU inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.chucker_fragment_transaction_payload;
        return yU.bind(layoutInflater.inflate(n3, null, false));
    }

    public final View getRoot() {
        return this.a;
    }
}

