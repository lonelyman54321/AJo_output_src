/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class PO2$b
extends RecyclerView$B {
    public final hh3_2 a;
    public final hh3_2 b;
    public final hh3_2 c;
    public final LinearProgressIndicator d;
    public final hh3_2 e;
    public final hh3_2 f;
    public final /* synthetic */ PO2 g;

    public PO2$b(PO2 object, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.g = object;
        super(view);
        object = new to2_0(view);
        this.a = object = yr1_2.b((Function0)object);
        object = new to_2(view, 2);
        this.b = object = yr1_2.b((Function0)object);
        object = new UO2(view);
        this.c = object = yr1_2.b((Function0)object);
        int n3 = R$id.image_upload_progressbar;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (LinearProgressIndicator)((Object)object);
        this.d = object;
        object = new vo2_0(view);
        object = yr1_2.b((Function0)object);
        this.e = object;
        object = new WO2(view);
        object = yr1_2.b((Function0)object);
        this.f = object;
    }

    public final ImageView w() {
        Object object = this.b.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (ImageView)object;
    }

    public final AjioTextView x() {
        Object object = this.e.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (AjioTextView)object;
    }

    public final ImageView y() {
        Object object = this.c.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (ImageView)object;
    }
}

