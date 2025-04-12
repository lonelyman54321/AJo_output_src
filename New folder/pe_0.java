/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.concurrent.Callable;

/*
 * Renamed from pe
 */
public final class pe_0
implements Callable {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ String b;
    public final /* synthetic */ we c;

    public pe_0(we we2, ArrayList arrayList, String string2) {
        this.c = we2;
        this.a = arrayList;
        this.b = string2;
    }

    public final Object call() {
        we we2 = this.c;
        ArrayList arrayList = this.a;
        String string2 = this.b;
        we.S(we2, arrayList, string2, "$add");
        return null;
    }
}

