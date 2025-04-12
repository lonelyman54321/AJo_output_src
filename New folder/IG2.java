/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class IG2
extends RecyclerView$B
implements View.OnClickListener {
    public final View a;
    public final LG2 b;
    public ImageView c;
    public View d;
    public ConstraintLayout e;
    public ImageView f;
    public TextView g;
    public TextView h;
    public ConstraintLayout i;
    public ImageView j;
    public TextView k;
    public TextView l;
    public ConstraintLayout m;
    public ImageView n;
    public ImageView o;
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public View t;
    public View u;
    public final hh3_2 v;
    public final hh3_2 w;

    public IG2(View object, LG2 lG2) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(lG2, "referralListener");
        super((View)object);
        this.a = object;
        this.b = lG2;
        super(this, 2);
        object = yr1_2.b((Function0)object);
        this.v = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.w = object;
    }

    public static String x(String string2, String string3) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(string2);
        stringBuffer.append(" ");
        stringBuffer.append(string3);
        string2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final void onClick(View object) {
        block9: {
            LG2 lG2;
            String string2;
            block11: {
                int n3;
                int n4;
                int n7;
                block10: {
                    block8: {
                        string2 = null;
                        if (object != null) {
                            n7 = object.getId();
                            object = n7;
                        } else {
                            n7 = 0;
                            object = null;
                        }
                        n4 = R$id.copy_clipboard;
                        lG2 = this.b;
                        if (object == null || (n3 = ((Integer)object).intValue()) != n4) break block8;
                        object = this.w().getText();
                        if (object != null) {
                            string2 = object.toString();
                        }
                        lG2.G0(string2);
                        break block9;
                    }
                    n4 = R$id.share;
                    if (object == null || (n3 = ((Integer)object).intValue()) != n4) break block10;
                    object = this.w().getText();
                    if (object != null) {
                        string2 = object.toString();
                    }
                    lG2.q7(string2);
                    break block9;
                }
                n4 = R$id.share_btn_bg;
                if (object != null && (n3 = ((Integer)object).intValue()) == n4) break block11;
                n4 = R$id.share_enlarged_btn;
                if (object == null || (n7 = ((Integer)object).intValue()) != n4) break block9;
            }
            if ((object = this.w().getText()) != null) {
                string2 = object.toString();
            }
            lG2.q7(string2);
        }
    }

    public final TextView w() {
        Object object = this.v.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (TextView)object;
    }
}

