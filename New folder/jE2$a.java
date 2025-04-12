/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class jE2$a
extends RecyclerView$B {
    public final TextView a;
    public final RecyclerView b;
    public final /* synthetic */ jE2 c;

    public jE2$a(jE2 object, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.c = object;
        super(view);
        int n3 = R$id.question_title;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.a = object;
        n3 = R$id.response_list;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.b = object = (RecyclerView)object;
    }
}

