/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class Hz2
implements Callable {
    public final /* synthetic */ kz2_0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ String c;

    public /* synthetic */ Hz2(kz2_0 kz2_02, ArrayList arrayList, String string2) {
        this.a = kz2_02;
        this.b = arrayList;
        this.c = string2;
    }

    public final Object call() {
        WorkDatabase workDatabase = this.a.e;
        Object object = workDatabase.g();
        String string2 = this.c;
        object = object.a(string2);
        this.b.addAll(object);
        return workDatabase.f().i(string2);
    }
}

