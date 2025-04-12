/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.jvm.internal.Intrinsics;

public final class XX1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ XX1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                NativeAdViewRenderer.k((NativeAdViewRenderer)this.b);
                return;
            }
            case 0: 
        }
        Object object = (oy1_1)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Bundle bundle = ((oy1_1)object).E;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 33;
        String string2 = ((oy1_1)object).c;
        if (n4 >= n7) {
            bundle = (Parcelable)VX1.a(bundle, string2);
        } else {
            n4 = (bundle = bundle.getParcelable(string2)) instanceof Parcelable;
            if (n4 == 0) {
                bundle = null;
            }
        }
        ((oy1_1)object).b = (Parcelable)bundle;
        if (bundle != null) {
            object = ((oy1_1)object).s;
            Intrinsics.checkNotNull(object);
            object = ((RecyclerView)object).getLayoutManager();
            if (object != null) {
                ((RecyclerView$o)object).onRestoreInstanceState((Parcelable)bundle);
            }
        }
    }
}

