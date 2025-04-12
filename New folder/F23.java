/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class F23
extends RecyclerView$B {
    public final View a;
    public final e23_0 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final XW1 f;

    public F23(View object, e23_0 e23_02) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(e23_02, "sharedWithMeItemClickListener");
        super((View)object);
        this.a = object;
        this.b = e23_02;
        int n3 = R$id.lswmliTvTitle;
        e23_02 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(e23_02, string2);
        e23_02 = (TextView)e23_02;
        this.c = e23_02;
        n3 = R$id.lswmliTvDate;
        e23_02 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(e23_02, string2);
        e23_02 = (TextView)e23_02;
        this.d = e23_02;
        n3 = R$id.lswmliTvView;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.e = object;
        super(this, 1);
        this.f = object;
    }
}

