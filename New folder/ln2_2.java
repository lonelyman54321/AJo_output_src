/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lN2
 */
public final class ln2_2
extends RecyclerView$B {
    public final TextView a;
    public final ImageView b;
    public final CardView c;
    public final ImageView d;
    public final ImageView e;
    public final ProgressBar f;

    public ln2_2(View object, jn2_1 jn2_12) {
        Object object2;
        TextView textView;
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(jn2_12, "listener");
        super((View)object);
        int n3 = R$id.tvTakeImage;
        this.a = textView = (TextView)object.findViewById(n3);
        int n4 = R$id.ivImage;
        this.b = object2 = (ImageView)object.findViewById(n4);
        n4 = R$id.cvImage;
        object2 = (CardView)object.findViewById(n4);
        this.c = object2;
        n4 = R$id.ivDelete;
        this.d = object2 = (ImageView)object.findViewById(n4);
        n4 = R$id.ivRetry;
        this.e = object2 = (ImageView)object.findViewById(n4);
        n4 = R$id.pbImageUpload;
        object = (ProgressBar)object.findViewById(n4);
        this.f = object;
        super(jn2_12);
        textView.setOnClickListener((View.OnClickListener)object);
    }
}

