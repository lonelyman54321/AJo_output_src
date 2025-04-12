/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class yc
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yc(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                qh2_2 qh2_22 = (qh2_2)this.b;
                Intrinsics.checkNotNullParameter(qh2_22, "this$0");
                qh2_22.onNavigationClick();
                return;
            }
            case 0: 
        }
        Ac ac2 = (Ac)this.b;
        Object object = "this$0";
        Intrinsics.checkNotNullParameter(ac2, (String)object);
        int n4 = view.getId();
        int n7 = R$id.oselrTvMoreDetails;
        if (n4 == n7) {
            view = ac2.d;
            view.setText((CharSequence)"- Less details");
            Float f5 = Float.valueOf(ac2.g);
            Float f6 = Float.valueOf(ac2.e);
            Float f7 = Float.valueOf(ac2.f);
            Float f8 = Float.valueOf(ac2.h);
            float f11 = ac2.i;
            Float f12 = Float.valueOf(f11);
            zc zc2 = ac2.k;
            object = ac2.a;
            object.y0(f5, f6, f7, f8, f12, zc2);
        }
    }
}

