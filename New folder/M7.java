/*
 * Decompiled with CFR 0.152.
 */
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.LiveData;
import androidx.room.e;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.view.BaseActivity;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class M7
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ M7(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        DrawerLayout drawerLayout;
        boolean bl2;
        boolean bl3 = true;
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (e)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                int n4 = ((LiveData)object2).c;
                n3 = 0;
                if (n4 > 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    object = null;
                }
                AtomicBoolean atomicBoolean = ((e)object2).q;
                bl3 = atomicBoolean.compareAndSet(false, bl3);
                if (bl3 && n4 != 0) {
                    bl3 = ((e)object2).n;
                    object = ((e)object2).l;
                    Executor executor = bl3 ? ((FP2)object).getTransactionExecutor() : ((FP2)object).getQueryExecutor();
                    object = ((e)object2).t;
                    executor.execute((Runnable)object);
                }
                return;
            }
            case 0: 
        }
        object2 = (AjioHomeActivity)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = ((BaseActivity)object2).Y;
        if (object != null && (bl2 = ((DrawerLayout)((Object)object)).isDrawerOpen(n3 = 0x800003)) == bl3 && (drawerLayout = ((BaseActivity)object2).Y) != null) {
            drawerLayout.closeDrawer(n3);
        }
    }
}

