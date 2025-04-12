/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from V63
 */
public final class v63_0
extends o {
    public final /* synthetic */ O63 a;
    public final /* synthetic */ List b;

    public v63_0(O63 o63, ArrayList arrayList, Context context) {
        this.a = o63;
        this.b = arrayList;
        super(context);
    }

    public final void onStop() {
        int n3;
        super.onStop();
        O63 o63 = this.a;
        Object object = o63.w;
        RecyclerView recyclerView = null;
        String string2 = "recyclerView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        if ((n3 = ((RecyclerView)object).getScrollState()) == 0 && (n3 = (int)(o63.T ? 1 : 0)) == 0) {
            object = o63.w;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                recyclerView = object;
            }
            object = (ArrayList)this.b;
            O63.b(o63, recyclerView, (ArrayList)object);
        }
    }
}

