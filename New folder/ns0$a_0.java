/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from NS0$a
 */
public final class ns0$a_0
extends h80_0 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ns0_1 c;
    public fs0_2 d;
    public Iterator e;

    public ns0$a_0(ns0_1 ns0_12, f80_0 f80_02) {
        this.c = ns0_12;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.b = n3 = this.b | -1 << -1;
        return this.c.collect(null, this);
    }
}

