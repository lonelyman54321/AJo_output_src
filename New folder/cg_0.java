/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 */
import android.os.Trace;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.c;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.Unit;

/*
 * Renamed from cg
 */
public final class cg_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cg_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                NativeAdViewRenderer.c((NativeAdViewRenderer)object);
                return;
            }
            case 0: 
        }
        object = (c)object;
        Object object2 = "measureAndLayout";
        Trace.beginSection((String)object2);
        object2 = ((c)object).a;
        int bl2 = Rg2.a;
        boolean bl3 = true;
        ((AndroidComposeView)object2).b(bl3);
        object2 = Unit.a;
        object2 = "checkForSemanticsChanges";
        Trace.beginSection((String)object2);
        try {
            ((c)object).e();
            ((c)object).G = false;
            return;
        }
        finally {
            Trace.endSection();
        }
    }
}

