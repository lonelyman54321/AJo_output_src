/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.variables.callbacks.VariablesChangedCallback;
import java.util.ArrayList;

/*
 * Renamed from HI
 */
public final class hi_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hi_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        Object object;
        boolean bl2;
        int n3 = this.a;
        switch (n3) {
            default: {
                ((mu2)this.b).n.start();
                return;
            }
            case 0: 
        }
        Object object3 = (ki_1)this.b;
        Object object4 = ((ki_1)object3).b;
        // MONITORENTER : object4
        Object object2 = ((ki_1)object3).b;
        object2 = ((ArrayList)object2).iterator();
        while (bl2 = object2.hasNext()) {
            object = object2.next();
            object = (VariablesChangedCallback)object;
            yz3_0.j(object);
        }
        object2 = ((ki_1)object3).c;
        // MONITORENTER : object2
        object4 = ((ki_1)object3).c;
        object4 = ((ArrayList)object4).iterator();
        while (true) {
            if (!(bl2 = object4.hasNext())) {
                object3 = ((ki_1)object3).c;
                ((ArrayList)object3).clear();
                // MONITOREXIT : object2
                return;
            }
            object = object4.next();
            object = (VariablesChangedCallback)object;
            yz3_0.j(object);
        }
    }
}

