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
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CV2
 */
public final class cv2_0
extends RecyclerView$B {
    public final AV2 a;
    public final boolean b;
    public final TextView c;
    public final ImageView d;
    public final ImageView e;
    public final View f;

    public cv2_0(View view, AV2 aV2, boolean bl2) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = aV2;
        this.b = bl2;
        int n3 = R$id.history_text;
        aV2 = (TextView)view.findViewById(n3);
        this.c = aV2;
        n3 = R$id.delete_button;
        aV2 = (ImageView)view.findViewById(n3);
        this.d = aV2;
        n3 = R$id.search_img;
        aV2 = (ImageView)view.findViewById(n3);
        this.e = aV2;
        n3 = R$id.recent_container;
        this.f = view = view.findViewById(n3);
    }
}

