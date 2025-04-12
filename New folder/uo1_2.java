/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from Uo1
 */
public final class uo1_2
extends h80_0 {
    public Object a;
    public Object b;
    public KSerializer c;
    public Charset d;
    public gf_2 e;
    public pl1_2 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ro1_2 h;
    public int i;

    public uo1_2(ro1_2 ro1_22, f80_0 f80_02) {
        this.h = ro1_22;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.g = object;
        this.i = n3 = this.i | -1 << -1;
        return ro1_2.c(this.h, null, null, null, null, this);
    }
}

