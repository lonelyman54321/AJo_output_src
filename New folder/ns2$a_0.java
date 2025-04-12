/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;

/*
 * Renamed from nS2$a
 */
public final class ns2$a_0
extends RecyclerView$B {
    public final TextView a;
    public final ImageView b;
    public final AjioTextView c;
    public int d;
    public final /* synthetic */ ns2_1 e;

    public ns2$a_0(ns2_1 object, View object2) {
        this.e = object;
        super((View)object2);
        int n3 = R$id.card_num_2;
        object = (TextView)object2.findViewById(n3);
        this.a = object;
        n3 = R$id.card_img;
        object = (ImageView)object2.findViewById(n3);
        this.b = object;
        n3 = R$id.remove_card;
        this.c = object = (AjioTextView)object2.findViewById(n3);
        boolean bl2 = og1_1.b();
        if (bl2) {
            ((AjioTextView)object).underlineText();
        }
        super(this);
        object.setOnClickListener((View.OnClickListener)object2);
    }
}

