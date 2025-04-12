/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.chuckerteam.chucker.R$layout;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.Format;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ln3
extends RecyclerView$f {
    public final ln3$a a;
    public List b;

    public ln3(ln3$a object) {
        Intrinsics.checkNotNullParameter(object, "listener");
        this.a = object;
        this.b = object = mz0_2.a;
    }

    public final int getItemCount() {
        return this.b.size();
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        object = (ln3$b)object;
        Intrinsics.checkNotNullParameter(object, "holder");
        Object object2 = (WF2)this.b.get(n3);
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "throwable");
        Serializable serializable = ((WF2)object2).a;
        ((ln3$b)object).b = serializable;
        object = ((ln3$b)object).a;
        serializable = ((BU)object).e;
        String string2 = ((WF2)object2).b;
        serializable.setText(string2);
        serializable = ((BU)object).b;
        string2 = ((WF2)object2).d;
        serializable.setText(string2);
        serializable = ((BU)object).d;
        string2 = ((WF2)object2).e;
        serializable.setText(string2);
        serializable = DateFormat.getDateTimeInstance(3, 2);
        object2 = ((WF2)object2).c;
        object2 = ((Format)serializable).format(object2);
        ((BU)object).c.setText((CharSequence)object2);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Object object2 = ck0.a(object, "parent");
        int n4 = R$layout.chucker_list_item_throwable;
        object = BU.bind(object2.inflate(n4, object, false));
        Intrinsics.checkNotNullExpressionValue(object, "inflate(LayoutInflater.from(parent.context), parent, false)");
        object2 = new ln3$b(this, (BU)object);
        return object2;
    }
}

