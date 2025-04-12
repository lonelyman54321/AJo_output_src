/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentActivity;
import com.jio.jioads.jioreel.adDetection.c;
import com.jio.jioads.jioreel.data.JioReelAdMetaData;
import com.jio.jioads.jioreel.listeners.JioReelListener;
import com.jio.jioads.jioreel.ssai.f;
import in.juspay.services.HyperServices;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fc1
 */
public final class fc1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fc1_2(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (c)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                JioReelListener jioReelListener = ((f)object).b;
                object = (JioReelAdMetaData)this.c;
                jioReelListener.onAdChange((JioReelAdMetaData)object);
                return;
            }
            case 0: 
        }
        HyperServices hyperServices = (HyperServices)this.b;
        FragmentActivity fragmentActivity = (FragmentActivity)this.c;
        HyperServices.j(hyperServices, fragmentActivity);
    }
}

