/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.jioreel.adDetection.c;
import com.jio.jioads.jioreel.data.JioReelAdMetaData;
import com.jio.jioads.jioreel.listeners.JioReelListener;
import com.jio.jioads.jioreel.ssai.f;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ag3
 */
public final class ag3_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ag3_2(int n3, Object object, Object object2) {
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
                jioReelListener.onAdMediaStart((JioReelAdMetaData)object);
                return;
            }
            case 0: 
        }
        e92 e922 = ((bg3_1)this.b).b;
        Object object = this.c;
        e922.onSuccess(object);
    }
}

