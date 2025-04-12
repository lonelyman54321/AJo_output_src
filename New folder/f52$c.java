/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.entity.Notifications;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

public final class f52$c
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ Notifications b;
    public final /* synthetic */ g52 c;
    public final /* synthetic */ List d;

    public f52$c(es0_2 es0_22, Notifications notifications, g52 g522, ArrayList arrayList) {
        this.a = es0_22;
        this.b = notifications;
        this.c = g522;
        this.d = arrayList;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        Notifications notifications = this.b;
        g52 g522 = this.c;
        ArrayList arrayList = (ArrayList)this.d;
        f52$c$a f52$c$a = new f52$c$a((fs0_2)object, notifications, g522, arrayList);
        if ((object = this.a.collect(f52$c$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

