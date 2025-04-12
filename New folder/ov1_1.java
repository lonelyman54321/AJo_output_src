/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.instreamads.vmapbuilder.JioAdsVMAPBuilder;
import com.jio.jioads.instreamads.vmapbuilder.JioAdsVMAPListener;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from ov1
 */
public final class ov1_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ov1_1(Object object, int n3, Object object2, Object object3) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                JioAdsVMAPListener jioAdsVMAPListener = (JioAdsVMAPListener)this.c;
                StringBuffer stringBuffer = (StringBuffer)this.d;
                JioAdsVMAPBuilder.a((JioAdsVMAPBuilder)this.b, jioAdsVMAPListener, stringBuffer);
                return;
            }
            case 0: 
        }
        eK$a eK$a = (eK$a)this.c;
        Object object = (Function0)this.d;
        AtomicBoolean atomicBoolean = (AtomicBoolean)this.b;
        boolean bl2 = atomicBoolean.get();
        if (!bl2) {
            object = object.invoke();
            try {
                eK$a.a(object);
            }
            catch (Throwable throwable) {
                eK$a.b(throwable);
            }
        }
    }
}

