/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from j43
 */
public final class j43_0
extends RecyclerView$B {
    public final View a;
    public final yi2_1 b;
    public final s82_0 c;

    /*
     * Enabled aggressive block sorting
     */
    public j43_0(View object, yi2_1 yi2_12, s82_0 object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        String string2 = "onProductClickListener";
        Intrinsics.checkNotNullParameter(object2, string2);
        super((View)object);
        this.a = object;
        this.b = yi2_12;
        this.c = object2;
        Intrinsics.checkNotNullParameter(object, "itemView");
        int n3 = R$id.shoppingAssistantNewTag;
        yi2_12 = (TextView)object.findViewById(n3);
        int n4 = 1;
        object2 = new l6(this, n4);
        object.setOnClickListener((View.OnClickListener)object2);
        object = h40_0.a;
        object = h40_0.A0();
        int n7 = ((String)object).length();
        object2 = null;
        if (n7 != 0 && (object = JsonParser.parseString(h40_0.A0()).getAsJsonObject()) != null && (bl2 = ((JsonObject)object).has(string2 = "showNewTag"))) {
            object = ((JsonObject)object).get(string2);
            n7 = ((JsonElement)object).getAsInt();
        } else {
            n7 = 0;
            object = null;
        }
        if (n7 != 0) {
            if (yi2_12 == null) return;
            yi2_12.setVisibility(0);
            return;
        }
        if (yi2_12 == null) return;
        n7 = 4;
        yi2_12.setVisibility(n7);
    }
}

