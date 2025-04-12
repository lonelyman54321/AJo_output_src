/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.AppDataBase;
import java.util.Iterator;

public final class kW$a$a
extends h80_0 {
    public /* synthetic */ Object a;
    public int b;
    public fs0_2 c;
    public final /* synthetic */ kw$a_0 d;
    public AppDataBase e;
    public Iterator f;

    public kW$a$a(kw$a_0 kw$a_0, f80_0 f80_02) {
        this.d = kw$a_0;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.b = n3 = this.b | -1 << -1;
        return this.d.emit(null, this);
    }
}

