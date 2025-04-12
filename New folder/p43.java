/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.services.data.Facet;
import kotlin.jvm.internal.Intrinsics;

public final class p43
extends RecyclerView$B
implements View.OnClickListener {
    public final xE3 a;
    public final Facet b;
    public final int c;
    public int d;
    public int e;

    public p43(View view, xE3 xE32, Facet facet, int n3) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = xE32;
        this.b = facet;
        this.c = n3;
        view.setOnClickListener((View.OnClickListener)this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        object = this.b;
        xE3 xE32 = this.a;
        if (xE32 != null) {
            int n3;
            Object object2;
            if (object != null) {
                object2 = ((Facet)object).getName();
            } else {
                n3 = 0;
                object2 = null;
            }
            String string2 = object2;
            int n4 = this.e;
            n3 = this.d;
            int n7 = n3 + 1;
            String string3 = "Show More +";
            int n8 = this.c;
            object2 = xE32;
            xE32.C2(n4, n8, n7, string2, string3);
        }
        if (xE32 != null) {
            xE32.F0((Facet)object);
        }
    }

    public final void w(int n3, int n4) {
        this.d = n3;
        this.e = n4;
    }
}

