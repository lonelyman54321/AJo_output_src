/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.CheckBox
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LN
 */
public final class ln_1
extends rw_2 {
    public final en_1 b;
    public final View c;
    public final CheckBox d;
    public final TextView e;
    public final TextView f;
    public final TextView g;

    public ln_1(View view, en_1 en_12) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        this.b = en_12;
        int n3 = R$id.disableLayer;
        en_12 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(en_12, string2);
        this.c = en_12;
        n3 = R$id.cbWallet;
        en_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(en_12, string2);
        en_12 = (CheckBox)en_12;
        this.d = en_12;
        n3 = R$id.tvWalletName;
        en_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(en_12, string2);
        en_12 = (TextView)en_12;
        this.e = en_12;
        n3 = R$id.tvDetails;
        en_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(en_12, string2);
        en_12 = (TextView)en_12;
        this.f = en_12;
        int n4 = R$id.tvNewTag;
        view = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.g = view;
        int n7 = og1_1.b();
        if (n7 != 0) {
            n7 = en_12.getPaintFlags() | 8;
            en_12.setPaintFlags(n7);
        }
    }
}

