/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.jio.jioads.videomodule.s;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class gZ1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gZ1(s s7) {
        this.a = 1;
        this.b = s7;
    }

    public /* synthetic */ gZ1(hZ1 hZ12, int n3) {
        this.a = 0;
        this.b = hZ12;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                s s7 = (s)this.b;
                Intrinsics.checkNotNullParameter(s7, "this$0");
                s7.e();
                return;
            }
            case 0: 
        }
        object = (hZ1)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        hZ1$e hZ1$e = object.a;
        object = object.b;
        hZ1$e.T7((ArrayList)object);
    }
}

