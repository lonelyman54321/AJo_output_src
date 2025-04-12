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

public final class C
extends RecyclerView$B {
    public final qa3_1 a;
    public final ja2_1 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;

    public C(View view, qa3_1 qa3_12, ja2_1 object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(qa3_12, "spendHistoryListener");
        Intrinsics.checkNotNullParameter(object, "orderClickListener");
        super(view);
        this.a = qa3_12;
        this.b = object;
        int n3 = R$id.shTransactionDate;
        qa3_12 = view.findViewById(n3);
        object = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(qa3_12, (String)object);
        qa3_12 = (TextView)qa3_12;
        this.c = qa3_12;
        n3 = R$id.shAmount;
        qa3_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(qa3_12, (String)object);
        qa3_12 = (TextView)qa3_12;
        this.d = qa3_12;
        n3 = R$id.shOrderID;
        qa3_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(qa3_12, (String)object);
        qa3_12 = (TextView)qa3_12;
        this.e = qa3_12;
        n3 = R$id.shViewDetails;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        view = (TextView)view;
        this.f = view;
    }
}

