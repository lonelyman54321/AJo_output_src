/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;

/*
 * Renamed from hs2$a
 */
public final class hs2$a_0
extends RecyclerView$B {
    public final ImageView a;
    public final TextView b;

    public hs2$a_0(View view) {
        super(view);
        ImageView imageView;
        int n3 = R$id.img_offer;
        this.a = imageView = (ImageView)view.findViewById(n3);
        n3 = R$id.tv_offer_desc;
        imageView = (TextView)view.findViewById(n3);
        this.b = imageView;
        n3 = R$id.offer_text_subvalue;
        ((TextView)view.findViewById(n3)).setVisibility(8);
    }
}

